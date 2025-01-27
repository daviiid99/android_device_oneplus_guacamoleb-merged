package android.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class OpFeatures {
    private static final String CLOSE_FEATURE_LIST = "/data/system/closefeaturelist";
    private static final int FEATURE_BIT_BASE = 0;
    private static final String ONEPLUS_PRODUCT_NAME = "guacamoleb";
    public static final int OP_FEATURE_AD_MODE = 131;
    public static final int OP_FEATURE_AGGRESSIVE_DOZE = 92;
    public static final int OP_FEATURE_AI_BOOST_PACKAGE = 262;
    public static final int OP_FEATURE_AI_GESTURE = 205;
    public static final int OP_FEATURE_ALARM_ALIGNMENT = 94;
    public static final int OP_FEATURE_ALERT_SLIDER_RVS = 111;
    public static final int OP_FEATURE_ALWAYS_ON_DISPLAY = 57;
    public static final int OP_FEATURE_ANT_MODE_1X1 = 89;
    public static final int OP_FEATURE_APPDIED_STATISTICE = 263;
    public static final int OP_FEATURE_APPRECORD = 28;
    public static final int OP_FEATURE_APPS_DISPLAY_IN_FULLSCREEN = 144;
    public static final int OP_FEATURE_APP_BOOT_MANAGER = 26;
    public static final int OP_FEATURE_APP_LOCKER = 29;
    public static final int OP_FEATURE_APP_PREDICTION = 133;
    public static final int OP_FEATURE_APP_PRELOAD = 213;
    public static final int OP_FEATURE_APP_STATE_BROADCAST = 85;
    public static final int OP_FEATURE_APP_USAGE_CLASSIFICATION = 40;
    public static final int OP_FEATURE_AUDIO_ONLINECONFIG = 134;
    public static final int OP_FEATURE_AUTO_STARTUP = 4;
    public static final int OP_FEATURE_BACKGROUND_PROCESS_FROZEN = 95;
    public static final int OP_FEATURE_BACK_COVER_THEME = 12;
    public static final int OP_FEATURE_BAS_WHITELIST = 218;
    public static final int OP_FEATURE_BGC = 98;
    public static final int OP_FEATURE_BG_DETECTION = 17;
    public static final int OP_FEATURE_BLACK_GESTURE = 20;
    public static final int OP_FEATURE_BLUETOOTH_HEADSET = 63;
    public static final int OP_FEATURE_BLUETOOTH_UART_LOG = 261;
    public static final int OP_FEATURE_BOOST_BRIGHTNESS = 121;
    public static final int OP_FEATURE_BOOT_ENTER_BOUNCER = 45;
    public static final int OP_FEATURE_BUGREPORT = 3;
    public static final int OP_FEATURE_CAMERA_NOTCH = 64;
    public static final int OP_FEATURE_CAR_MODE = 124;
    public static final int OP_FEATURE_CHANGE_PACKAGE_NAME = 25;
    public static final int OP_FEATURE_CN_GOOGLEPLAY_SERVICE = 123;
    public static final int OP_FEATURE_COLLECT_BATTERYSTATS = 257;
    public static final int OP_FEATURE_COLOR_ADS = 238;
    public static final int OP_FEATURE_COLOR_DISPLAY = 156;
    public static final int OP_FEATURE_COLOR_MODE_FB0 = 106;
    public static final int OP_FEATURE_CTA_PERMISSION_CONTROL = 15;
    public static final int OP_FEATURE_CTA_USE_PACKAGEINSTALLER_PERMISSION = 145;
    public static final int OP_FEATURE_CUSTOME_ANIMATION = 109;
    public static final int OP_FEATURE_CUSTOM_BLINK_LIGHT = 91;
    public static final int OP_FEATURE_CUSTOM_BROWSER_APP_INFO = 246;
    public static final int OP_FEATURE_CUSTOM_GAME_CENTER = 220;
    public static final int OP_FEATURE_CUSTOM_KEYS = 47;
    public static final int OP_FEATURE_CUSTOM_NAVBAR = 66;
    public static final int OP_FEATURE_CUSTOM_ONEPLUS_WALLET = 221;
    public static final int OP_FEATURE_CUSTOM_STATUS_BAR = 49;
    public static final int OP_FEATURE_DAILY_PROTO_REPORTING = 244;
    public static final int OP_FEATURE_DATA_ROAMING_ENABLE_MESSAGE = 83;
    public static final int OP_FEATURE_DECR_BL_CJ = 247;
    public static final int OP_FEATURE_DEEP_TASK_CLEANER = 96;
    public static final int OP_FEATURE_DEVICEID_LEN_T = 62;
    public static final int OP_FEATURE_DEVICE_DEFAULT_WALLPAPER = 172;
    public static final int OP_FEATURE_DEXOPT = 193;
    public static final int OP_FEATURE_DIM_MODE_GESTURE = 225;
    public static final int OP_FEATURE_DIS_P_SENSOR_IN_AB = 120;
    public static final int OP_FEATURE_DROP_DOWN_STATUS_BAR_WITH_FINGER = 139;
    public static final int OP_FEATURE_DYNAMIC_FONT = 260;
    public static final int OP_FEATURE_DYNAMIC_RESOLUTION = 249;
    public static final int OP_FEATURE_EARPHONE_MODE = 140;
    public static final int OP_FEATURE_EMBRYO = 199;
    public static final int OP_FEATURE_ENABLE_AD = 54;
    public static final int OP_FEATURE_ENABLE_ANTI_BURN = 224;
    public static final int OP_FEATURE_ENABLE_EU = 55;
    public static final int OP_FEATURE_ENABLE_FALSINGTOUCH = 71;
    public static final int OP_FEATURE_ENABLE_FINGERPRINT_POCKET = 78;
    public static final int OP_FEATURE_ENABLE_FINGERPRINT_VENDOR_MOUDLE = 75;
    public static final int OP_FEATURE_ENABLE_GAME_VIBRATE = 223;
    public static final int OP_FEATURE_ENABLE_GAMUT_MAPPING = 222;
    public static final int OP_FEATURE_ENABLE_HBM = 53;
    public static final int OP_FEATURE_ENABLE_POCKETMODE_SWITCH = 141;
    public static final int OP_FEATURE_ENABLE_UNDERSCREEN_SENSOR = 219;
    public static final int OP_FEATURE_EN_P_SENSOR_IN_AB = 122;
    public static final int OP_FEATURE_EXTREME_VSYNC = 255;
    public static final int OP_FEATURE_EXT_AUDIO_DECODER = 23;
    public static final int OP_FEATURE_FACE_UNLOCK = 44;
    public static final int OP_FEATURE_FAKE_PROXIMITY = 125;
    public static final int OP_FEATURE_FASTPAIR = 8;
    public static final int OP_FEATURE_FAST_CHARGE = 161;
    public static final int OP_FEATURE_FROZEN = 103;
    public static final int OP_FEATURE_GAMEMODE_NETBOOST = 72;
    public static final int OP_FEATURE_GAMEMODE_POWERSAVER = 73;
    public static final int OP_FEATURE_GESTURE_BUTTON = 59;
    public static final int OP_FEATURE_GESTURE_DEPRECATED = 243;
    public static final int OP_FEATURE_GESTURE_SCREENSHOT = 16;
    public static final int OP_FEATURE_GPS_NFW_OTA_PATCH = 251;
    public static final int OP_FEATURE_GPS_NOTIFICATION = 182;
    public static final int OP_FEATURE_GPS_SPRINT_SUPL = 253;
    public static final int OP_FEATURE_HBM_AUTO_ADJUST = 119;
    public static final int OP_FEATURE_HEADSET_IMPEDANCE_DETECTION = 81;
    public static final int OP_FEATURE_HEARING_AID = 61;
    public static final int OP_FEATURE_HEYTAP_BUSINESS = 252;
    public static final int OP_FEATURE_HIDE_CAMERA_NOTCH = 65;
    public static final int OP_FEATURE_HIDE_NAVBAR = 38;
    public static final int OP_FEATURE_HIGH_VSYNC = 254;
    public static final int OP_FEATURE_HWUI_SKIA_REDUCE_OVERDRAW = 201;
    public static final int OP_FEATURE_IME_LAND_PADDING = 130;
    public static final int OP_FEATURE_INFRARED_POWER_CONTROL = 209;
    public static final int OP_FEATURE_INFRARED_PROXIMITY_SUPPORT = 236;
    public static final int OP_FEATURE_INSTALL_FROM_MARKET = 132;
    public static final int OP_FEATURE_JANKMANAGER = 197;
    public static final int OP_FEATURE_KEY_LOCK = 14;
    public static final int OP_FEATURE_KTV_LOOPBACK = 264;
    public static final int OP_FEATURE_LANDSCAPE_APP_ANIMATION_IMPROVEMENT = 198;
    public static final int OP_FEATURE_LOD_SWITCH = 185;
    public static final int OP_FEATURE_LONG_SCREENSHOT = 30;
    public static final int OP_FEATURE_MAX_BACKLIGHT = 108;
    public static final int OP_FEATURE_MCL_FONT = 245;
    public static final int OP_FEATURE_MDM = 2;
    public static final int OP_FEATURE_MEMORY_TRACKER = 27;
    public static final int OP_FEATURE_MISTOUCH_PREVENTION = 135;
    public static final int OP_FEATURE_MMS_NOTI_SOUND = 6;
    public static final int OP_FEATURE_MM_ABANDON_DELAY = 259;
    public static final int OP_FEATURE_MM_ALERTSLIDER = 162;
    public static final int OP_FEATURE_MM_AUDIO_CGROUP = 190;
    public static final int OP_FEATURE_MM_AUDIO_CURVE = 200;
    public static final int OP_FEATURE_MM_AUDIO_DIAGNOSIS = 176;
    public static final int OP_FEATURE_MM_AUDIO_ELEVOC_ECNS = 203;
    public static final int OP_FEATURE_MM_AW = 174;
    public static final int OP_FEATURE_MM_CH_SWITCH = 175;
    public static final int OP_FEATURE_MM_CLOSE_PA = 241;
    public static final int OP_FEATURE_MM_DISPLAY_COLOR_SCREEN_MODE = 10;
    public static final int OP_FEATURE_MM_ENGINEERING_MODE = 171;
    public static final int OP_FEATURE_MM_FAST_WHITELIST = 250;
    public static final int OP_FEATURE_MM_HAC = 186;
    public static final int OP_FEATURE_MM_HEADSET_PROFILE = 165;
    public static final int OP_FEATURE_MM_LIMIT_SVA_BARGIN = 242;
    public static final int OP_FEATURE_MM_LOG = 163;
    public static final int OP_FEATURE_MM_LOW_KING_VOLUME = 204;
    public static final int OP_FEATURE_MM_MDM = 202;
    public static final int OP_FEATURE_MM_MODECLIENT = 187;
    public static final int OP_FEATURE_MM_NS_AEC = 192;
    public static final int OP_FEATURE_MM_RECODER_CH_SWITCH = 188;
    public static final int OP_FEATURE_MM_RECORDING_SCREEN = 189;
    public static final int OP_FEATURE_MM_REDUCE_SAR = 166;
    public static final int OP_FEATURE_MM_RESTORE_MODE = 164;
    public static final int OP_FEATURE_MM_SMARTPA = 170;
    public static final int OP_FEATURE_MM_TA = 167;
    public static final int OP_FEATURE_MM_ULTRASOUND = 169;
    public static final int OP_FEATURE_MM_VIDEO_ENHANCEMENT = 206;
    public static final int OP_FEATURE_MM_WECHAT_NS = 191;
    public static final int OP_FEATURE_MM_WIDEVINE_DRM_L1 = 168;
    public static final int OP_FEATURE_MOTOR_CONTROL = 110;
    public static final int OP_FEATURE_MULTI_SIM_RINGTONES = 7;
    public static final int OP_FEATURE_NETWORK_MODE_DISABLE_2G = 80;
    public static final int OP_FEATURE_NEW_MEMORY_OPTIMIZATION = 178;
    public static final int OP_FEATURE_NEW_PLAN_POWEWR_OFF_ALARM = 50;
    public static final int OP_FEATURE_NOTIFICATION_LIGHT = 129;
    public static final int OP_FEATURE_OEMEX_SERVICE = 158;
    public static final int OP_FEATURE_OHPD = 100;
    public static final int OP_FEATURE_OHPD_CLEAN_LOW = 101;
    public static final int OP_FEATURE_OIMC = 84;
    public static final int OP_FEATURE_ONEPLUS_BOOTANIMATION = 35;
    public static final int OP_FEATURE_ONEPLUS_CB = 116;
    public static final int OP_FEATURE_ONEPLUS_RECOVERY = 33;
    public static final int OP_FEATURE_ONEPLUS_SERVICE = 160;
    public static final int OP_FEATURE_OP2_RECOVERY = 74;
    public static final int OP_FEATURE_OPCD = 39;
    public static final int OP_FEATURE_OPCS_RECORD_SCREENON_TIME = 99;
    public static final int OP_FEATURE_OPDIAGNOSE = 68;
    public static final int OP_FEATURE_OPEN_ID = 22;
    public static final int OP_FEATURE_OPERATOR_GPS_E911 = 115;
    public static final int OP_FEATURE_OPRECOVERY_BOOT_REASON = 248;
    public static final int OP_FEATURE_OPSLA = 210;
    public static final int OP_FEATURE_OPSM = 86;
    public static final int OP_FEATURE_OPUTIL = 179;
    public static final int OP_FEATURE_OP_KEYGUARD = 5;
    public static final int OP_FEATURE_OTG_AUTO_SHUTDOWN = 43;
    public static final int OP_FEATURE_OVERHEAT_DIAGNOSIS = 157;
    public static final int OP_FEATURE_OVERHEAT_ENABLE = 150;
    public static final int OP_FEATURE_OVERHEAT_SKIN = 151;
    public static final int OP_FEATURE_PARALLEL_APP = 34;
    public static final int OP_FEATURE_PARAM_BUILD_SERVICE = 114;
    public static final int OP_FEATURE_PARAM_ENCRYPTION = 107;
    public static final int OP_FEATURE_PCB_WATER_MARK = 51;
    public static final int OP_FEATURE_PERF_MANAGER = 177;
    public static final int OP_FEATURE_PHOTOS_PROTECTOR = 37;
    public static final int OP_FEATURE_POST_INSTALL_AMAZON_APPS = 24;
    public static final int OP_FEATURE_POWER_CONSUMPTION_STATISTICS = 154;
    public static final int OP_FEATURE_POWER_CONTROLLER = 155;
    public static final int OP_FEATURE_PREBUILD_NETFLIX = 143;
    public static final int OP_FEATURE_PRELOAD_APP_TO_DATA = 127;
    public static final int OP_FEATURE_PROCESS_ADJ_CONTROL = 195;
    public static final int OP_FEATURE_PROCESS_RESIDENT = 113;
    public static final int OP_FEATURE_PROXIMITY_CONTROLLER = 256;
    public static final int OP_FEATURE_PWM_UNDER_SCREEN_LIGHT = 240;
    public static final int OP_FEATURE_QUICK_LAUNCH = 104;
    public static final int OP_FEATURE_QUICK_PAY = 32;
    public static final int OP_FEATURE_QUICK_REPLY = 42;
    public static final int OP_FEATURE_READING_MODE_INTERPOLATER = 136;
    public static final int OP_FEATURE_REDSCREEN_ASSERTION = 208;
    public static final int OP_FEATURE_REMOVE_ROAMING_ICON = 82;
    public static final int OP_FEATURE_REPORT_WIFI_GENERATION_INFO = 217;
    public static final int OP_FEATURE_RESERVE_APP = 21;
    public static final int OP_FEATURE_RESRTICT_PKG_BASE_ON_NETWORK = 142;
    public static final int OP_FEATURE_RINGTONE_ALIAS = 18;
    public static final int OP_FEATURE_RINGTONE_BKP = 19;
    public static final int OP_FEATURE_RTT = 88;
    public static final int OP_FEATURE_SAR_TEST_SUPPORT = 237;
    public static final int OP_FEATURE_SCENE_MODES = 31;
    public static final int OP_FEATURE_SCREENSHOT_IMPROVEMENT = 181;
    public static final int OP_FEATURE_SCREEN_AOD_USE_INFRARED = 233;
    public static final int OP_FEATURE_SCREEN_AOD_USE_ULTRASOUND = 232;
    public static final int OP_FEATURE_SCREEN_COMPAT = 41;
    public static final int OP_FEATURE_SCREEN_CUTTING = 70;
    public static final int OP_FEATURE_SCREEN_OFF_USE_INFRARED = 235;
    public static final int OP_FEATURE_SCREEN_OFF_USE_ULTRASOUND = 234;
    public static final int OP_FEATURE_SCREEN_ON_USE_INFRARED = 229;
    public static final int OP_FEATURE_SCREEN_ON_USE_TP = 230;
    public static final int OP_FEATURE_SCREEN_ON_USE_ULTRASOUND = 228;
    public static final int OP_FEATURE_SCREEN_REFRESH_RATE = 117;
    public static final int OP_FEATURE_SCREEN_ROTATION_IMPROVEMENT = 196;
    public static final int OP_FEATURE_SETTINGS_QUICKPAY_ANIM_FOR_ENCHILADA = 69;
    public static final int OP_FEATURE_SETUSERADJ_CONFIG = 97;
    public static final int OP_FEATURE_SHOW_4G_LTE = 87;
    public static final int OP_FEATURE_SHOW_HD_FOR_CT = 67;
    public static final int OP_FEATURE_SHOW_MULTI_VOLTE = 58;
    public static final int OP_FEATURE_SHOW_NOTIFICATION_BAR_BY_FINGERPRINT_SENSOR = 112;
    public static final int OP_FEATURE_SHUTDOWN_ANIMATION = 79;
    public static final int OP_FEATURE_SKIP_DOFRAME = 194;
    public static final int OP_FEATURE_SKIP_UIDIDLE = 180;
    public static final int OP_FEATURE_SKU_CHINA = 0;
    public static final int OP_FEATURE_SKU_GLOBAL = 1;
    public static final int OP_FEATURE_SMALL_BOARD_CHECK_FAJITA = 76;
    public static final int OP_FEATURE_SMART_BOOST = 128;
    public static final int OP_FEATURE_SMART_POWER_CONTROL = 93;
    public static final int OP_FEATURE_SOC_MOVIES_STATE_KEY = 102;
    public static final int OP_FEATURE_SOC_TRI_STATE_KEY = 48;
    public static final int OP_FEATURE_SPRINT = 147;
    public static final int OP_FEATURE_SPRINT_HIDDENMENU = 148;
    public static final int OP_FEATURE_STANDBY_DETECTION = 159;
    public static final int OP_FEATURE_SUPPORT_5G = 126;
    public static final int OP_FEATURE_SUPPORT_COLOR_READ_MODE = 231;
    public static final int OP_FEATURE_SUPPORT_CUSTOMIZE_CLIENTID_MS = 149;
    public static final int OP_FEATURE_SUPPORT_CUSTOM_FINGERPRINT = 77;
    public static final int OP_FEATURE_SWAP_KEYS = 11;
    public static final int OP_FEATURE_SWEET_MOMENTS = 105;
    public static final int OP_FEATURE_SYNTHETIC_PASSWORD_DISABLED = 211;
    public static final int OP_FEATURE_SYSTEM_OVERLAY = 138;
    public static final int OP_FEATURE_SYSTEM_PRODUCTION_RINGTONE = 212;
    public static final int OP_FEATURE_SYSTEM_UPDATE_BY_AB = 52;
    public static final int OP_FEATURE_TCP_CONTROL = 184;
    public static final int OP_FEATURE_TGPA = 258;
    public static final int OP_FEATURE_TRIPLE_CAMERA = 216;
    public static final int OP_FEATURE_TRI_STATE_KEY = 13;
    public static final int OP_FEATURE_TURNOFF_LOADING = 9;
    public static final int OP_FEATURE_TYPE_RGB = 56;
    public static final int OP_FEATURE_UNIFIED_DEVICE = 207;
    public static final int OP_FEATURE_UPDATE_INDIA = 226;
    public static final int OP_FEATURE_UPDATE_RESERVE = 137;
    public static final int OP_FEATURE_URL_INSTANT_APP = 239;
    public static final int OP_FEATURE_USE_AUDIO_STATE = 227;
    public static final int OP_FEATURE_USS = 152;
    public static final int OP_FEATURE_USS_HIDDENMENU = 153;
    public static final int OP_FEATURE_UST_MODE = 90;
    public static final int OP_FEATURE_UXREALM = 36;
    public static final int OP_FEATURE_VERIFICATION_BUBBLE = 214;
    public static final int OP_FEATURE_VIBRATION_INTENSITY = 46;
    public static final int OP_FEATURE_VIDEO_ENHANCER = 60;
    public static final int OP_FEATURE_WARP_CHARGE_5V6A = 146;
    public static final int OP_FEATURE_WIFI_SERVICE = 173;
    public static final int OP_FEATURE_X_LINEAR_VIBRATION_MOTOR = 118;
    public static final int OP_FEATURE_ZEN_MODE = 183;
    public static final int OP_FEATURE_Z_VIBRATION_MOTOR = 215;
    private static Map<String, Integer> map = new HashMap();
    private static final BitSet sFeatures = new BitSet(266);

    static {
        String context = "";
        Log.e("dynamic_feature", "parse the json file now");
        try {
            File file = new File("/oneplus/feature_list");
            Log.e("dynamic_feature", "parse the json file from /oneplus/feature_list");
            if (!file.exists()) {
                Log.e("dynamic_feature", "parse the json file from /system/etc/feature_list");
                file = new File("/system/etc/feature_list");
            }
            InputStreamReader read = new InputStreamReader(new FileInputStream(file));
            BufferedReader bufferedReader = new BufferedReader(read);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                context = context + line;
            }
            bufferedReader.close();
            read.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            JSONArray jsonArray = new JSONArray(context);
            map.put("OP_FEATURE_SKU_CHINA", 0);
            map.put("OP_FEATURE_SKU_GLOBAL", 1);
            map.put("OP_FEATURE_MDM", 2);
            map.put("OP_FEATURE_BUGREPORT", 3);
            map.put("OP_FEATURE_AUTO_STARTUP", 4);
            map.put("OP_FEATURE_OP_KEYGUARD", 5);
            map.put("OP_FEATURE_MMS_NOTI_SOUND", 6);
            map.put("OP_FEATURE_MULTI_SIM_RINGTONES", 7);
            map.put("OP_FEATURE_FASTPAIR", 8);
            map.put("OP_FEATURE_TURNOFF_LOADING", 9);
            map.put("OP_FEATURE_MM_DISPLAY_COLOR_SCREEN_MODE", 10);
            map.put("OP_FEATURE_SWAP_KEYS", 11);
            map.put("OP_FEATURE_BACK_COVER_THEME", 12);
            map.put("OP_FEATURE_TRI_STATE_KEY", 13);
            map.put("OP_FEATURE_KEY_LOCK", 14);
            map.put("OP_FEATURE_CTA_PERMISSION_CONTROL", 15);
            map.put("OP_FEATURE_GESTURE_SCREENSHOT", 16);
            map.put("OP_FEATURE_BG_DETECTION", 17);
            map.put("OP_FEATURE_RINGTONE_ALIAS", 18);
            map.put("OP_FEATURE_RINGTONE_BKP", 19);
            map.put("OP_FEATURE_BLACK_GESTURE", 20);
            map.put("OP_FEATURE_RESERVE_APP", 21);
            map.put("OP_FEATURE_OPEN_ID", 22);
            map.put("OP_FEATURE_EXT_AUDIO_DECODER", 23);
            map.put("OP_FEATURE_POST_INSTALL_AMAZON_APPS", 24);
            map.put("OP_FEATURE_CHANGE_PACKAGE_NAME", 25);
            map.put("OP_FEATURE_APP_BOOT_MANAGER", 26);
            map.put("OP_FEATURE_MEMORY_TRACKER", 27);
            map.put("OP_FEATURE_APPRECORD", 28);
            map.put("OP_FEATURE_APP_LOCKER", 29);
            map.put("OP_FEATURE_LONG_SCREENSHOT", 30);
            map.put("OP_FEATURE_SCENE_MODES", 31);
            map.put("OP_FEATURE_QUICK_PAY", 32);
            map.put("OP_FEATURE_ONEPLUS_RECOVERY", 33);
            map.put("OP_FEATURE_PARALLEL_APP", 34);
            map.put("OP_FEATURE_ONEPLUS_BOOTANIMATION", 35);
            map.put("OP_FEATURE_UXREALM", 36);
            map.put("OP_FEATURE_PHOTOS_PROTECTOR", 37);
            map.put("OP_FEATURE_HIDE_NAVBAR", 38);
            map.put("OP_FEATURE_OPCD", 39);
            map.put("OP_FEATURE_APP_USAGE_CLASSIFICATION", 40);
            map.put("OP_FEATURE_SCREEN_COMPAT", 41);
            map.put("OP_FEATURE_QUICK_REPLY", 42);
            map.put("OP_FEATURE_OTG_AUTO_SHUTDOWN", 43);
            map.put("OP_FEATURE_FACE_UNLOCK", 44);
            map.put("OP_FEATURE_BOOT_ENTER_BOUNCER", 45);
            map.put("OP_FEATURE_VIBRATION_INTENSITY", 46);
            map.put("OP_FEATURE_CUSTOM_KEYS", 47);
            map.put("OP_FEATURE_SOC_TRI_STATE_KEY", 48);
            map.put("OP_FEATURE_CUSTOM_STATUS_BAR", 49);
            map.put("OP_FEATURE_NEW_PLAN_POWEWR_OFF_ALARM", 50);
            map.put("OP_FEATURE_PCB_WATER_MARK", 51);
            map.put("OP_FEATURE_SYSTEM_UPDATE_BY_AB", 52);
            map.put("OP_FEATURE_ENABLE_HBM", 53);
            map.put("OP_FEATURE_ENABLE_AD", 54);
            map.put("OP_FEATURE_ENABLE_EU", 55);
            map.put("OP_FEATURE_TYPE_RGB", 56);
            map.put("OP_FEATURE_ALWAYS_ON_DISPLAY", 57);
            map.put("OP_FEATURE_SHOW_MULTI_VOLTE", 58);
            map.put("OP_FEATURE_GESTURE_BUTTON", 59);
            map.put("OP_FEATURE_VIDEO_ENHANCER", 60);
            map.put("OP_FEATURE_HEARING_AID", 61);
            map.put("OP_FEATURE_DEVICEID_LEN_T", 62);
            map.put("OP_FEATURE_BLUETOOTH_HEADSET", 63);
            map.put("OP_FEATURE_CAMERA_NOTCH", 64);
            map.put("OP_FEATURE_HIDE_CAMERA_NOTCH", 65);
            map.put("OP_FEATURE_CUSTOM_NAVBAR", 66);
            map.put("OP_FEATURE_SHOW_HD_FOR_CT", 67);
            map.put("OP_FEATURE_OPDIAGNOSE", 68);
            map.put("OP_FEATURE_SETTINGS_QUICKPAY_ANIM_FOR_ENCHILADA", 69);
            map.put("OP_FEATURE_SCREEN_CUTTING", 70);
            map.put("OP_FEATURE_ENABLE_FALSINGTOUCH", 71);
            map.put("OP_FEATURE_GAMEMODE_NETBOOST", 72);
            map.put("OP_FEATURE_GAMEMODE_POWERSAVER", 73);
            map.put("OP_FEATURE_OP2_RECOVERY", 74);
            map.put("OP_FEATURE_ENABLE_FINGERPRINT_VENDOR_MOUDLE", 75);
            map.put("OP_FEATURE_SMALL_BOARD_CHECK_FAJITA", 76);
            map.put("OP_FEATURE_SUPPORT_CUSTOM_FINGERPRINT", 77);
            map.put("OP_FEATURE_ENABLE_FINGERPRINT_POCKET", 78);
            map.put("OP_FEATURE_SHUTDOWN_ANIMATION", 79);
            map.put("OP_FEATURE_NETWORK_MODE_DISABLE_2G", 80);
            map.put("OP_FEATURE_HEADSET_IMPEDANCE_DETECTION", 81);
            map.put("OP_FEATURE_REMOVE_ROAMING_ICON", 82);
            map.put("OP_FEATURE_DATA_ROAMING_ENABLE_MESSAGE", 83);
            map.put("OP_FEATURE_OIMC", 84);
            map.put("OP_FEATURE_APP_STATE_BROADCAST", 85);
            map.put("OP_FEATURE_OPSM", 86);
            map.put("OP_FEATURE_SHOW_4G_LTE", 87);
            map.put("OP_FEATURE_RTT", 88);
            map.put("OP_FEATURE_ANT_MODE_1X1", 89);
            map.put("OP_FEATURE_UST_MODE", 90);
            map.put("OP_FEATURE_CUSTOM_BLINK_LIGHT", 91);
            map.put("OP_FEATURE_AGGRESSIVE_DOZE", 92);
            map.put("OP_FEATURE_SMART_POWER_CONTROL", 93);
            map.put("OP_FEATURE_ALARM_ALIGNMENT", 94);
            map.put("OP_FEATURE_BACKGROUND_PROCESS_FROZEN", 95);
            map.put("OP_FEATURE_DEEP_TASK_CLEANER", 96);
            map.put("OP_FEATURE_SETUSERADJ_CONFIG", 97);
            map.put("OP_FEATURE_BGC", 98);
            map.put("OP_FEATURE_OPCS_RECORD_SCREENON_TIME", 99);
            map.put("OP_FEATURE_OHPD", 100);
            map.put("OP_FEATURE_OHPD_CLEAN_LOW", 101);
            map.put("OP_FEATURE_SOC_MOVIES_STATE_KEY", 102);
            map.put("OP_FEATURE_FROZEN", 103);
            map.put("OP_FEATURE_QUICK_LAUNCH", 104);
            map.put("OP_FEATURE_SWEET_MOMENTS", 105);
            map.put("OP_FEATURE_COLOR_MODE_FB0", 106);
            map.put("OP_FEATURE_PARAM_ENCRYPTION", 107);
            map.put("OP_FEATURE_MAX_BACKLIGHT", 108);
            map.put("OP_FEATURE_CUSTOME_ANIMATION", 109);
            map.put("OP_FEATURE_MOTOR_CONTROL", 110);
            map.put("OP_FEATURE_ALERT_SLIDER_RVS", 111);
            map.put("OP_FEATURE_SHOW_NOTIFICATION_BAR_BY_FINGERPRINT_SENSOR", 112);
            map.put("OP_FEATURE_PROCESS_RESIDENT", 113);
            map.put("OP_FEATURE_PARAM_BUILD_SERVICE", 114);
            map.put("OP_FEATURE_OPERATOR_GPS_E911", 115);
            map.put("OP_FEATURE_ONEPLUS_CB", 116);
            map.put("OP_FEATURE_SCREEN_REFRESH_RATE", 117);
            map.put("OP_FEATURE_X_LINEAR_VIBRATION_MOTOR", 118);
            map.put("OP_FEATURE_HBM_AUTO_ADJUST", 119);
            map.put("OP_FEATURE_DIS_P_SENSOR_IN_AB", 120);
            map.put("OP_FEATURE_BOOST_BRIGHTNESS", 121);
            map.put("OP_FEATURE_EN_P_SENSOR_IN_AB", 122);
            map.put("OP_FEATURE_CN_GOOGLEPLAY_SERVICE", 123);
            map.put("OP_FEATURE_CAR_MODE", 124);
            map.put("OP_FEATURE_FAKE_PROXIMITY", 125);
            map.put("OP_FEATURE_SUPPORT_5G", 126);
            map.put("OP_FEATURE_PRELOAD_APP_TO_DATA", 127);
            map.put("OP_FEATURE_SMART_BOOST", 128);
            map.put("OP_FEATURE_NOTIFICATION_LIGHT", 129);
            map.put("OP_FEATURE_IME_LAND_PADDING", 130);
            map.put("OP_FEATURE_AD_MODE", 131);
            map.put("OP_FEATURE_INSTALL_FROM_MARKET", 132);
            map.put("OP_FEATURE_APP_PREDICTION", 133);
            map.put("OP_FEATURE_AUDIO_ONLINECONFIG", 134);
            map.put("OP_FEATURE_MISTOUCH_PREVENTION", 135);
            map.put("OP_FEATURE_READING_MODE_INTERPOLATER", 136);
            map.put("OP_FEATURE_UPDATE_RESERVE", 137);
            map.put("OP_FEATURE_SYSTEM_OVERLAY", 138);
            map.put("OP_FEATURE_DROP_DOWN_STATUS_BAR_WITH_FINGER", 139);
            map.put("OP_FEATURE_EARPHONE_MODE", 140);
            map.put("OP_FEATURE_ENABLE_POCKETMODE_SWITCH", 141);
            map.put("OP_FEATURE_RESRTICT_PKG_BASE_ON_NETWORK", 142);
            map.put("OP_FEATURE_PREBUILD_NETFLIX", 143);
            map.put("OP_FEATURE_APPS_DISPLAY_IN_FULLSCREEN", 144);
            map.put("OP_FEATURE_CTA_USE_PACKAGEINSTALLER_PERMISSION", 145);
            map.put("OP_FEATURE_WARP_CHARGE_5V6A", 146);
            map.put("OP_FEATURE_SPRINT", 147);
            map.put("OP_FEATURE_SPRINT_HIDDENMENU", 148);
            map.put("OP_FEATURE_SUPPORT_CUSTOMIZE_CLIENTID_MS", 149);
            map.put("OP_FEATURE_OVERHEAT_ENABLE", 150);
            map.put("OP_FEATURE_OVERHEAT_SKIN", 151);
            map.put("OP_FEATURE_USS", 152);
            map.put("OP_FEATURE_USS_HIDDENMENU", 153);
            map.put("OP_FEATURE_POWER_CONSUMPTION_STATISTICS", 154);
            map.put("OP_FEATURE_POWER_CONTROLLER", 155);
            map.put("OP_FEATURE_COLOR_DISPLAY", 156);
            map.put("OP_FEATURE_OVERHEAT_DIAGNOSIS", 157);
            map.put("OP_FEATURE_OEMEX_SERVICE", 158);
            map.put("OP_FEATURE_STANDBY_DETECTION", 159);
            map.put("OP_FEATURE_ONEPLUS_SERVICE", 160);
            map.put("OP_FEATURE_FAST_CHARGE", 161);
            map.put("OP_FEATURE_MM_ALERTSLIDER", 162);
            map.put("OP_FEATURE_MM_LOG", 163);
            map.put("OP_FEATURE_MM_RESTORE_MODE", 164);
            map.put("OP_FEATURE_MM_HEADSET_PROFILE", 165);
            map.put("OP_FEATURE_MM_REDUCE_SAR", 166);
            map.put("OP_FEATURE_MM_TA", 167);
            map.put("OP_FEATURE_MM_WIDEVINE_DRM_L1", 168);
            map.put("OP_FEATURE_MM_ULTRASOUND", 169);
            map.put("OP_FEATURE_MM_SMARTPA", 170);
            map.put("OP_FEATURE_MM_ENGINEERING_MODE", 171);
            map.put("OP_FEATURE_DEVICE_DEFAULT_WALLPAPER", 172);
            map.put("OP_FEATURE_WIFI_SERVICE", 173);
            map.put("OP_FEATURE_MM_AW", 174);
            map.put("OP_FEATURE_MM_CH_SWITCH", 175);
            map.put("OP_FEATURE_MM_AUDIO_DIAGNOSIS", 176);
            map.put("OP_FEATURE_PERF_MANAGER", 177);
            map.put("OP_FEATURE_NEW_MEMORY_OPTIMIZATION", 178);
            map.put("OP_FEATURE_OPUTIL", 179);
            map.put("OP_FEATURE_SKIP_UIDIDLE", 180);
            map.put("OP_FEATURE_SCREENSHOT_IMPROVEMENT", 181);
            map.put("OP_FEATURE_GPS_NOTIFICATION", 182);
            map.put("OP_FEATURE_ZEN_MODE", 183);
            map.put("OP_FEATURE_TCP_CONTROL", 184);
            map.put("OP_FEATURE_LOD_SWITCH", 185);
            map.put("OP_FEATURE_MM_HAC", 186);
            map.put("OP_FEATURE_MM_MODECLIENT", 187);
            map.put("OP_FEATURE_MM_RECODER_CH_SWITCH", 188);
            map.put("OP_FEATURE_MM_RECORDING_SCREEN", 189);
            map.put("OP_FEATURE_MM_AUDIO_CGROUP", 190);
            map.put("OP_FEATURE_MM_WECHAT_NS", 191);
            map.put("OP_FEATURE_MM_NS_AEC", 192);
            map.put("OP_FEATURE_DEXOPT", 193);
            map.put("OP_FEATURE_SKIP_DOFRAME", 194);
            map.put("OP_FEATURE_PROCESS_ADJ_CONTROL", 195);
            map.put("OP_FEATURE_SCREEN_ROTATION_IMPROVEMENT", 196);
            map.put("OP_FEATURE_JANKMANAGER", 197);
            map.put("OP_FEATURE_LANDSCAPE_APP_ANIMATION_IMPROVEMENT", 198);
            map.put("OP_FEATURE_EMBRYO", 199);
            map.put("OP_FEATURE_MM_AUDIO_CURVE", 200);
            map.put("OP_FEATURE_HWUI_SKIA_REDUCE_OVERDRAW", 201);
            map.put("OP_FEATURE_MM_MDM", 202);
            map.put("OP_FEATURE_MM_AUDIO_ELEVOC_ECNS", 203);
            map.put("OP_FEATURE_MM_LOW_KING_VOLUME", 204);
            map.put("OP_FEATURE_AI_GESTURE", 205);
            map.put("OP_FEATURE_MM_VIDEO_ENHANCEMENT", 206);
            map.put("OP_FEATURE_UNIFIED_DEVICE", 207);
            map.put("OP_FEATURE_REDSCREEN_ASSERTION", 208);
            map.put("OP_FEATURE_INFRARED_POWER_CONTROL", 209);
            map.put("OP_FEATURE_OPSLA", 210);
            map.put("OP_FEATURE_SYNTHETIC_PASSWORD_DISABLED", 211);
            map.put("OP_FEATURE_SYSTEM_PRODUCTION_RINGTONE", 212);
            map.put("OP_FEATURE_APP_PRELOAD", 213);
            map.put("OP_FEATURE_VERIFICATION_BUBBLE", 214);
            map.put("OP_FEATURE_Z_VIBRATION_MOTOR", 215);
            map.put("OP_FEATURE_TRIPLE_CAMERA", 216);
            map.put("OP_FEATURE_REPORT_WIFI_GENERATION_INFO", 217);
            map.put("OP_FEATURE_BAS_WHITELIST", 218);
            map.put("OP_FEATURE_ENABLE_UNDERSCREEN_SENSOR", 219);
            map.put("OP_FEATURE_CUSTOM_GAME_CENTER", 220);
            map.put("OP_FEATURE_CUSTOM_ONEPLUS_WALLET", 221);
            map.put("OP_FEATURE_ENABLE_GAMUT_MAPPING", 222);
            map.put("OP_FEATURE_ENABLE_GAME_VIBRATE", 223);
            map.put("OP_FEATURE_ENABLE_ANTI_BURN", 224);
            map.put("OP_FEATURE_DIM_MODE_GESTURE", 225);
            map.put("OP_FEATURE_UPDATE_INDIA", 226);
            map.put("OP_FEATURE_USE_AUDIO_STATE", 227);
            map.put("OP_FEATURE_SCREEN_ON_USE_ULTRASOUND", 228);
            map.put("OP_FEATURE_SCREEN_ON_USE_INFRARED", 229);
            map.put("OP_FEATURE_SCREEN_ON_USE_TP", 230);
            map.put("OP_FEATURE_SUPPORT_COLOR_READ_MODE", 231);
            map.put("OP_FEATURE_SCREEN_AOD_USE_ULTRASOUND", 232);
            map.put("OP_FEATURE_SCREEN_AOD_USE_INFRARED", 233);
            map.put("OP_FEATURE_SCREEN_OFF_USE_ULTRASOUND", 234);
            map.put("OP_FEATURE_SCREEN_OFF_USE_INFRARED", 235);
            map.put("OP_FEATURE_INFRARED_PROXIMITY_SUPPORT", 236);
            map.put("OP_FEATURE_SAR_TEST_SUPPORT", 237);
            map.put("OP_FEATURE_COLOR_ADS", 238);
            map.put("OP_FEATURE_URL_INSTANT_APP", 239);
            map.put("OP_FEATURE_PWM_UNDER_SCREEN_LIGHT", 240);
            map.put("OP_FEATURE_MM_CLOSE_PA", 241);
            map.put("OP_FEATURE_MM_LIMIT_SVA_BARGIN", 242);
            map.put("OP_FEATURE_GESTURE_DEPRECATED", 243);
            map.put("OP_FEATURE_DAILY_PROTO_REPORTING", 244);
            map.put("OP_FEATURE_MCL_FONT", 245);
            map.put("OP_FEATURE_CUSTOM_BROWSER_APP_INFO", 246);
            map.put("OP_FEATURE_DECR_BL_CJ", 247);
            map.put("OP_FEATURE_OPRECOVERY_BOOT_REASON", 248);
            map.put("OP_FEATURE_DYNAMIC_RESOLUTION", 249);
            map.put("OP_FEATURE_MM_FAST_WHITELIST", 250);
            map.put("OP_FEATURE_GPS_NFW_OTA_PATCH", 251);
            map.put("OP_FEATURE_HEYTAP_BUSINESS", 252);
            map.put("OP_FEATURE_GPS_SPRINT_SUPL", 253);
            map.put("OP_FEATURE_HIGH_VSYNC", 254);
            map.put("OP_FEATURE_EXTREME_VSYNC", 255);
            map.put("OP_FEATURE_PROXIMITY_CONTROLLER", 256);
            map.put("OP_FEATURE_COLLECT_BATTERYSTATS", 257);
            map.put("OP_FEATURE_TGPA", 258);
            map.put("OP_FEATURE_MM_ABANDON_DELAY", 259);
            map.put("OP_FEATURE_DYNAMIC_FONT", 260);
            map.put("OP_FEATURE_BLUETOOTH_UART_LOG", 261);
            map.put("OP_FEATURE_AI_BOOST_PACKAGE", 262);
            map.put("OP_FEATURE_APPDIED_STATISTICE", 263);
            map.put("OP_FEATURE_KTV_LOOPBACK", 264);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                Log.e("dynamic_feature", jsonObject.getString("featureName"));
                sFeatures.set(getFeatureValue(jsonObject.getString("featureName")));
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        List<String> closeList = getCloseFeatureList(CLOSE_FEATURE_LIST);
        if (closeList != null) {
            for (int i2 = 0; i2 < closeList.size(); i2++) {
                String featureName = closeList.get(i2);
                if (map.containsKey(featureName)) {
                    sFeatures.flip(getFeatureValue(featureName));
                    map.remove(featureName);
                }
            }
        }
    }

    public static boolean isSupport(int... features) {
        for (int feature : features) {
            if (feature < 0 || feature > 265) {
                return false;
            }
            if (!sFeatures.get(feature)) {
                return false;
            }
        }
        return true;
    }

    public static int getFeatureValue(String feature) {
        return map.get(feature).intValue();
    }

    public static String getProductName() {
        return ONEPLUS_PRODUCT_NAME;
    }

    private static List<String> getCloseFeatureList(String filename) {
        List<String> list = new ArrayList<>();
        try {
            File file = new File(filename);
            if (!file.isFile() || !file.exists()) {
                return null;
            }
            InputStreamReader read = new InputStreamReader(new FileInputStream(file));
            BufferedReader bufferedReader = new BufferedReader(read);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                list.add(line);
            }
            bufferedReader.close();
            read.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
