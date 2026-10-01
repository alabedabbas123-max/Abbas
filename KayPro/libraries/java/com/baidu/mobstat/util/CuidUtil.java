package com.baidu.mobstat.util;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.baidu.helios.HeliosManager;
import com.baidu.helios.OnGetIdResultCallback;
import com.baidu.mobstat.bu;

public class CuidUtil {
    public static String getOaid(Context context) {
        String lastCachedOid = "";
        try {
            lastCachedOid = HeliosManager.getInstance(context).getLastCachedOid();
            if (TextUtils.isEmpty(lastCachedOid)) {
                HeliosManager.getInstance(context).requestOid(new OnGetIdResultCallback<String>() {
                    public void onResult(String str, Bundle bundle) {
                    }

                    public void onError(int i, Throwable th, Bundle bundle) {
                    }
                });
            }
        } catch (Throwable th) {
        }
        if (TextUtils.isEmpty(lastCachedOid)) {
            return "";
        }
        return lastCachedOid;
    }

    public static String getCuid3(Context context) {
        if (!bu.m6524a().m6528a(false)) {
            return "";
        }
        String aid = "";
        try {
            aid = HeliosManager.getInstance(context).getAid();
            if (TextUtils.isEmpty(aid)) {
                HeliosManager.getInstance(context).requestAid(new OnGetIdResultCallback<String>() {
                    public void onResult(String str, Bundle bundle) {
                    }

                    public void onError(int i, Throwable th, Bundle bundle) {
                    }
                });
            }
        } catch (Throwable th) {
        }
        if (TextUtils.isEmpty(aid)) {
            return "";
        }
        return aid;
    }

    public static String getSsaid(Context context) {
        String ssaid = "";
        try {
            ssaid = HeliosManager.getInstance(context).getSsaid();
        } catch (Throwable th) {
        }
        if (TextUtils.isEmpty(ssaid)) {
            return "";
        }
        return ssaid;
    }

    public static String getIid(Context context) {
        String iid = "";
        try {
            iid = HeliosManager.getInstance(context).getIid();
        } catch (Throwable th) {
        }
        if (TextUtils.isEmpty(iid)) {
            return "";
        }
        return iid;
    }

    public static String getGaid(Context context) {
        String strM6529b = "";
        try {
            strM6529b = bu.m6524a().m6529b();
            if (TextUtils.isEmpty(strM6529b)) {
                HeliosManager.getInstance(context).requestGaid(new OnGetIdResultCallback<String>() {
                    public void onResult(String str, Bundle bundle) {
                        if (!TextUtils.isEmpty(str)) {
                            bu.m6524a().m6527a(str);
                        }
                    }

                    public void onError(int i, Throwable th, Bundle bundle) {
                    }
                });
            }
        } catch (Throwable th) {
        }
        if (TextUtils.isEmpty(strM6529b)) {
            return "";
        }
        return strM6529b;
    }
}
