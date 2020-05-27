package org.lineageos.device.DeviceSettings;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.IBinder;
import android.os.PowerManager;

public class AutoHighBrightnessModeService extends Service {
    private static final String HBM_BRIGHTNESS_FILE = "/sys/devices/platform/soc/ae00000.qcom,mdss_mdp/drm/card0/card0-DSI-1/hbm_brightness";

    private final int[][] HBM_AUTOBRIGHTNESS_ARRAY = {
        new int[]{6500, 10},
        new int[]{7000, 40},
        new int[]{7500, 70},
        new int[]{8000, 100},
        new int[]{8500, 150},
        new int[]{9000, 200},
        new int[]{9500, 300},
        new int[]{10000, 400},
        new int[]{10500, 600},
        new int[]{11000, 800},
        new int[]{12000, 1023},
    };

    private static boolean mAutoHBMSensorEnabled = false;
    private static boolean mAutoHBMActive = false;
    
    private SensorManager mSensorManager;
    Sensor mLightSensor;

    private int interpolate(int i, int i2, int i3, int i4, int i5) {
        int i6 = i5 - i4;
        int i7 = i - i2;
        int i8 = ((i6 * 2) * i7) / (i3 - i2);
        int i9 = i8 / 2;
        int i10 = i2 - i3;
        return i4 + i9 + (i8 % 2) + ((i10 == 0 || i6 == 0) ? 0 : (((i7 * 2) * (i - i3)) / i6) / i10);
    }

    private float getHBMBrightness(float lux) {
        int length = HBM_AUTOBRIGHTNESS_ARRAY.length;
        int i = 0;
        while (i < length && HBM_AUTOBRIGHTNESS_ARRAY[i][0] < (int)lux) {
            i++;
        }
        if (i == 0) {
            return HBM_AUTOBRIGHTNESS_ARRAY[0][1];
        }
        if (i == length) {
            return HBM_AUTOBRIGHTNESS_ARRAY[length - 1][1];
        }
        int[][] iArr = HBM_AUTOBRIGHTNESS_ARRAY;
        int i2 = i - 1;
        return interpolate((int)lux, iArr[i2][0], iArr[i][0], iArr[i2][1], iArr[i][1]);
    }

    public void activateLightSensorRead() {
        mSensorManager = (SensorManager) getApplicationContext().getSystemService(Context.SENSOR_SERVICE);
        mLightSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        mSensorManager.registerListener(mSensorEventListener, mLightSensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    public void deactivateLightSensorRead() {
        mSensorManager.unregisterListener(mSensorEventListener);
        mAutoHBMSensorEnabled = false;
    }

    SensorEventListener mSensorEventListener = new SensorEventListener() {
        @Override
        public void onSensorChanged(SensorEvent event) {
            if (mAutoHBMSensorEnabled) {
                float lux = event.values[0];
                if (lux > 6500.0f) {
                    mAutoHBMActive = true;
                    Utils.writeValue(HBM_BRIGHTNESS_FILE, String.valueOf((int)getHBMBrightness(mLux)));
                }
            }
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {
            // do nothing
        }
    };

    private BroadcastReceiver mScreenStateReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
                mAutoHBMSensorEnabled = true;
                activateLightSensorRead();
            } else if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
                mAutoHBMSensorEnabled = false;
                deactivateLightSensorRead();
            }
        }
    };

    @Override
    public void onCreate() {
        IntentFilter screenStateFilter = new IntentFilter(Intent.ACTION_SCREEN_ON);
        screenStateFilter.addAction(Intent.ACTION_SCREEN_OFF);
        registerReceiver(mScreenStateReceiver, screenStateFilter);
        PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
        if (pm.isInteractive()) {
            activateLightSensorRead();
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(mScreenStateReceiver);
        PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
        if (pm.isInteractive()) {
            deactivateLightSensorRead();
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
