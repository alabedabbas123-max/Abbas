package com.baidu.mobstat;

import android.content.Context;
import android.text.TextUtils;

public class PrefOperate {
    public static void loadMetaDataConfig(Context context) {
        SendStrategyEnum sendStrategyEnum = SendStrategyEnum.APP_START;
        try {
            String strM6543a = bw.m6543a(context, Config.EXCEPTION_LOG_META_NAME);
            if (!TextUtils.isEmpty(strM6543a) && "true".equals(strM6543a)) {
                ExceptionAnalysis.getInstance().openExceptionAnalysis(context, false);
            }
        } catch (Exception e) {
        }
        try {
            String strM6543a2 = bw.m6543a(context, Config.SEND_STRATEGY_META_NAME);
            if (!TextUtils.isEmpty(strM6543a2)) {
                if (strM6543a2.equals(SendStrategyEnum.APP_START.name())) {
                    sendStrategyEnum = SendStrategyEnum.APP_START;
                    bp.m6466a().m6467a(context, sendStrategyEnum.ordinal());
                } else if (strM6543a2.equals(SendStrategyEnum.ONCE_A_DAY.name())) {
                    sendStrategyEnum = SendStrategyEnum.ONCE_A_DAY;
                    bp.m6466a().m6467a(context, sendStrategyEnum.ordinal());
                    bp.m6466a().m6472b(context, 24);
                } else if (strM6543a2.equals(SendStrategyEnum.SET_TIME_INTERVAL.name())) {
                    sendStrategyEnum = SendStrategyEnum.SET_TIME_INTERVAL;
                    bp.m6466a().m6467a(context, sendStrategyEnum.ordinal());
                }
            }
        } catch (Exception e2) {
        }
        try {
            String strM6543a3 = bw.m6543a(context, Config.TIME_INTERVAL_META_NAME);
            if (!TextUtils.isEmpty(strM6543a3)) {
                int i = Integer.parseInt(strM6543a3);
                if (sendStrategyEnum.ordinal() == SendStrategyEnum.SET_TIME_INTERVAL.ordinal() && i > 0 && i <= 24) {
                    bp.m6466a().m6472b(context, i);
                }
            }
        } catch (Exception e3) {
        }
        try {
            String strM6543a4 = bw.m6543a(context, Config.ONLY_WIFI_META_NAME);
            if (!TextUtils.isEmpty(strM6543a4)) {
                if ("true".equals(strM6543a4)) {
                    bp.m6466a().m6470a(context, true);
                } else if ("false".equals(strM6543a4)) {
                    bp.m6466a().m6470a(context, false);
                }
            }
        } catch (Exception e4) {
        }
    }

    public static void setAppKey(String str) {
        CooperService.instance().getHeadObject().f3931e = str;
    }

    public static String getAppKey(Context context) {
        return CooperService.instance().getAppKey(context);
    }

    public static void setAppChannel(String str) {
        if (str == null || str.equals("")) {
            bb.m6313c().m6307c("[WARNING] The channel you have set is empty");
        }
        CooperService.instance().getHeadObject().f3938l = str;
    }

    public static void setAppChannel(Context context, String str, boolean z) {
        if (str == null || str.equals("")) {
            bb.m6313c().m6307c("[WARNING] The channel you have set is empty");
        }
        CooperService.instance().getHeadObject().f3938l = str;
        if (z && str != null && !str.equals("")) {
            bp.m6466a().m6479d(context, str);
            bp.m6466a().m6475b(context, true);
        }
        if (!z) {
            bp.m6466a().m6479d(context, "");
            bp.m6466a().m6475b(context, false);
        }
    }
}
