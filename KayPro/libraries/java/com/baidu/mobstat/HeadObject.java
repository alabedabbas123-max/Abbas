package com.baidu.mobstat;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.baidu.android.common.util.DeviceId;
import org.json.JSONArray;
import org.json.JSONObject;

public class HeadObject {

    JSONObject f3921A;

    JSONObject f3922B;

    String f3923C;

    int f3924D;

    String f3926F;

    String f3928b;

    String f3929c;

    String f3934h;

    String f3935i;

    int f3936j;

    int f3937k;

    String f3939m;

    String f3940n;

    String f3941o;

    String f3942p;

    String f3943q;

    String f3944r;

    String f3945s;

    String f3946t;

    String f3947u;

    String f3948v;

    String f3949w;

    String f3950x;

    String f3951y;

    String f3952z;

    boolean f3927a = false;

    String f3930d = DeviceId.CUIDInfo.I_EMPTY;

    String f3931e = null;

    String f3932f = null;

    int f3933g = -1;

    String f3938l = null;

    String f3925E = "";

    public synchronized void installHeader(Context context, JSONObject jSONObject) {
        m5889a(context);
        if (jSONObject.length() <= 10) {
            updateHeader(context, jSONObject);
        }
    }

    private synchronized void m5889a(Context context) {
        if (!this.f3927a) {
            bn.m6461e(context, "android.permission.READ_PHONE_STATE");
            bn.m6461e(context, "android.permission.INTERNET");
            bn.m6461e(context, "android.permission.ACCESS_NETWORK_STATE");
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            this.f3928b = CooperService.instance().getOSVersion();
            this.f3929c = CooperService.instance().getOSSysVersion();
            this.f3940n = CooperService.instance().getPhoneModel();
            this.f3941o = CooperService.instance().getManufacturer();
            this.f3952z = CooperService.instance().getUUID();
            this.f3921A = CooperService.instance().getHeaderExt(context);
            this.f3922B = CooperService.instance().getPushId(context);
            this.f3932f = CooperService.instance().getCUID(context, true);
            this.f3935i = CooperService.instance().getDeviceId(telephonyManager, context);
            this.f3930d = bp.m6466a().m6491i(context) ? "1" : DeviceId.CUIDInfo.I_EMPTY;
            if (bw.m6585w(context)) {
                this.f3930d = "2";
            }
            this.f3930d += "-14";
            if (bu.m6524a().m6532d()) {
                try {
                    this.f3945s = CooperService.instance().getMacAddress(context, CooperService.instance().isDeviceMacEnabled(context));
                } catch (Exception e) {
                }
                try {
                    this.f3947u = bw.m6571l(1, context);
                } catch (Exception e2) {
                }
            }
            try {
                this.f3948v = bw.m6542a(context, 1);
            } catch (Exception e3) {
            }
            try {
                this.f3939m = CooperService.instance().getOperator(telephonyManager);
            } catch (Exception e4) {
            }
            try {
                this.f3936j = bw.m6550c(context);
                this.f3937k = bw.m6554d(context);
                if (context.getResources().getConfiguration().orientation == 2) {
                    this.f3936j ^= this.f3937k;
                    this.f3937k = this.f3936j ^ this.f3937k;
                    this.f3936j ^= this.f3937k;
                }
            } catch (Exception e5) {
            }
            this.f3938l = CooperService.instance().getAppChannel(context);
            this.f3931e = CooperService.instance().getAppKey(context);
            try {
                this.f3933g = CooperService.instance().getAppVersionCode(context);
                this.f3934h = CooperService.instance().getAppVersionName(context);
            } catch (Exception e6) {
            }
            try {
                if (bu.m6524a().m6532d()) {
                    if (CooperService.instance().checkCellLocationSetting(context)) {
                        this.f3942p = bw.m6566i(context);
                    } else {
                        this.f3942p = "0_0_0";
                    }
                }
            } catch (Exception e7) {
            }
            try {
                if (bu.m6524a().m6532d()) {
                    if (CooperService.instance().checkGPSLocationSetting(context)) {
                        this.f3943q = bw.m6568j(context);
                    } else {
                        this.f3943q = "";
                    }
                }
            } catch (Exception e8) {
            }
            try {
                this.f3944r = CooperService.instance().getLinkedWay(context);
            } catch (Exception e9) {
            }
            this.f3949w = bw.m6545b();
            this.f3950x = android.os.Build.BOARD;
            this.f3951y = android.os.Build.BRAND;
            this.f3923C = CooperService.instance().getUserId(context);
            this.f3927a = true;
            this.f3925E = bp.m6466a().m6509u(context);
        }
    }

    public synchronized void updateHeader(Context context, JSONObject jSONObject) {
        JSONObject jSONObject2;
        int i = 0;
        synchronized (this) {
            try {
                jSONObject.put(Config.f3881OS, "Android" == 0 ? "" : "Android");
                jSONObject.put(Config.STAT_SDK_TYPE, 0);
                jSONObject.put("s", this.f3928b == null ? "" : this.f3928b);
                jSONObject.put("sv", this.f3929c == null ? "" : this.f3929c);
                jSONObject.put(Config.APP_KEY, this.f3931e == null ? "" : this.f3931e);
                jSONObject.put(Config.PLATFORM_TYPE, this.f3930d == null ? DeviceId.CUIDInfo.I_EMPTY : this.f3930d);
                jSONObject.put("i", "");
                jSONObject.put("v", "4.0.3.1");
                jSONObject.put(Config.STAT_SDK_CHANNEL, 14);
                jSONObject.put(Config.APP_VERSION_CODE, this.f3933g);
                jSONObject.put("n", this.f3934h == null ? "" : this.f3934h);
                jSONObject.put("d", "");
                jSONObject.put(Config.DEVICE_MAC_ID, this.f3945s == null ? "" : this.f3945s);
                jSONObject.put(Config.DEVICE_BLUETOOTH_MAC, this.f3947u == null ? "" : this.f3947u);
                jSONObject.put(Config.DEVICE_ID_SEC, this.f3935i == null ? "" : this.f3935i);
                jSONObject.put(Config.CUID_SEC, this.f3932f == null ? "" : this.f3932f);
                jSONObject.put(Config.SDK_TAG, 1);
                jSONObject.put(Config.DEVICE_WIDTH, this.f3936j);
                jSONObject.put("h", this.f3937k);
                jSONObject.put(Config.DEVICE_NAME, this.f3948v == null ? "" : this.f3948v);
                jSONObject.put("c", this.f3938l == null ? "" : this.f3938l);
                jSONObject.put(Config.OPERATOR, this.f3939m == null ? "" : this.f3939m);
                jSONObject.put(Config.MODEL, this.f3940n == null ? "" : this.f3940n);
                jSONObject.put(Config.MANUFACTURER, this.f3941o == null ? "" : this.f3941o);
                jSONObject.put(Config.CELL_LOCATION, this.f3942p == null ? "" : this.f3942p);
                jSONObject.put(Config.GPS_LOCATION, this.f3943q == null ? "" : this.f3943q);
                jSONObject.put("l", this.f3944r == null ? "" : this.f3944r);
                jSONObject.put("t", System.currentTimeMillis());
                jSONObject.put(Config.PACKAGE_NAME, bw.m6575n(1, context));
                jSONObject.put(Config.f3882ROM, this.f3949w == null ? "" : this.f3949w);
                jSONObject.put(Config.DEVICE_BOARD, this.f3950x == null ? "" : this.f3950x);
                jSONObject.put(Config.DEVICE_BRAND, this.f3951y == null ? "" : this.f3951y);
                jSONObject.put(Config.TEST_DEVICE_ID, bw.m6547b(context));
                if (context != null && context.getApplicationInfo() != null) {
                    i = context.getApplicationInfo().targetSdkVersion;
                }
                jSONObject.put(Config.TARGET_SDK_VERSION, i);
                jSONObject.put(Config.USER_PROPERTY, this.f3925E);
                jSONObject.put(Config.OAID, bw.m6546b(1, context));
                jSONObject.put(Config.OUT_OAID, bw.m6552c(1, context));
                jSONObject.put(Config.FROM, DeviceId.CUIDInfo.I_EMPTY);
                jSONObject.put(Config.GAID, bw.m6558e(1, context));
                jSONObject.put(Config.f3880IID, bw.m6556d(1, context));
                jSONObject.put(Config.CUID3, bw.m6560f(1, context));
                jSONObject.put(Config.SSAID, bw.m6561g(1, context));
                jSONObject.put(Config.DEVICE_IMEI, bw.m6587y(context));
                if (!TextUtils.isEmpty(this.f3923C)) {
                    if (!TextUtils.isEmpty(this.f3925E)) {
                        jSONObject2 = new JSONObject(this.f3925E);
                    } else {
                        jSONObject2 = new JSONObject();
                    }
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(this.f3923C);
                    jSONArray.put("1");
                    jSONObject2.put("uid_", jSONArray);
                    jSONObject.put(Config.USER_PROPERTY, jSONObject2.toString());
                }
                jSONObject.put(Config.UID_CHANGE, "");
                jSONObject.put("at", DeviceId.CUIDInfo.I_EMPTY);
                String strM6583u = bw.m6583u(context);
                jSONObject.put(Config.PROCESS_LABEL, strM6583u);
                Object objM6584v = null;
                if (!TextUtils.isEmpty(strM6583u)) {
                    objM6584v = bw.m6584v(context);
                }
                if (objM6584v == null) {
                    objM6584v = "";
                }
                jSONObject.put(Config.PROCESS_CLASS, objM6584v);
                jSONObject.put("sign", this.f3952z == null ? "" : this.f3952z);
                if (this.f3921A != null && this.f3921A.length() != 0) {
                    jSONObject.put("ext", this.f3921A);
                } else {
                    jSONObject.remove("ext");
                }
                if (this.f3922B == null) {
                    this.f3922B = new JSONObject();
                }
                jSONObject.put(Config.PUSH, this.f3922B);
                jSONObject.put(Config.CUSTOM_USER_ID, this.f3923C);
                jSONObject.put(Config.START_TYPE, String.valueOf(this.f3924D));
            } catch (Exception e) {
            }
        }
    }

    public void setHeaderExt(JSONObject jSONObject) {
        this.f3921A = jSONObject;
    }

    public void setPushInfo(JSONObject jSONObject) {
        this.f3922B = jSONObject;
    }

    public void setUserId(String str) {
        this.f3923C = str;
    }

    public void setUserProperty(String str) {
        this.f3925E = str;
    }

    public void setZid(String str) {
        this.f3926F = str;
    }

    public void setStartType(boolean z) {
        if (z) {
            this.f3924D = 1;
        } else {
            this.f3924D = 0;
        }
    }
}
