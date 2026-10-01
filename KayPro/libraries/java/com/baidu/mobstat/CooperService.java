package com.baidu.mobstat;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CooperService implements ICooperService {

    private static CooperService f3887a;

    private HeadObject f3888b = new HeadObject();

    public static synchronized CooperService instance() {
        if (f3887a == null) {
            f3887a = new CooperService();
        }
        return f3887a;
    }

    public HeadObject getHeadObject() {
        return this.f3888b;
    }

    @Override
    public String getHost() {
        return Config.LOG_SEND_URL;
    }

    @Override
    public void installHeader(Context context, JSONObject jSONObject) {
        this.f3888b.installHeader(context, jSONObject);
    }

    public JSONObject getHeaderExt(Context context) {
        String strM6494k = bp.m6466a().m6494k(context);
        if (TextUtils.isEmpty(strM6494k)) {
            return null;
        }
        try {
            return new JSONObject(strM6494k);
        } catch (JSONException e) {
            return null;
        }
    }

    public void setHeaderExt(Context context, ExtraInfo extraInfo) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (extraInfo != null) {
            jSONObject = extraInfo.dumpToJson();
        }
        this.f3888b.setHeaderExt(jSONObject);
        bp.m6466a().m6486g(context, jSONObject.toString());
        if (extraInfo != null) {
            str = "Set global ExtraInfo: " + jSONObject;
        } else {
            str = "Clear global ExtraInfo";
        }
        bb.m6313c().m6300a(str);
    }

    public JSONObject getPushId(Context context) {
        String strM6496l = bp.m6466a().m6496l(context);
        if (TextUtils.isEmpty(strM6496l)) {
            return null;
        }
        try {
            return new JSONObject(strM6496l);
        } catch (JSONException e) {
            return null;
        }
    }

    public void setPushId(Context context, String str, String str2, String str3) {
        String str4;
        JSONObject pushId = getPushId(context);
        if (pushId == null) {
            pushId = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str3)) {
                pushId.put(str, str3);
            } else {
                pushId.remove(str);
            }
        } catch (Exception e) {
        }
        this.f3888b.setPushInfo(pushId);
        bp.m6466a().m6489h(context, pushId.toString());
        if (str3 != null) {
            str4 = "Set platform:" + str2 + " pushId: " + str3;
        } else {
            str4 = "Clear platform:" + str2 + " pushId";
        }
        bb.m6313c().m6300a(str4);
    }

    public void setStartType(boolean z) {
        this.f3888b.setStartType(z);
    }

    private static String m5858a(Context context) {
        if (!bu.m6524a().m6532d()) {
            return Config.DEF_MAC_ID;
        }
        String strM6572l = bw.m6572l(context);
        if (!TextUtils.isEmpty(strM6572l)) {
            return strM6572l.replaceAll(Config.TRACE_TODAY_VISIT_SPLIT, "");
        }
        return Config.DEF_MAC_ID;
    }

    private static String m5860b(Context context) {
        if (!bu.m6524a().m6532d()) {
            return "";
        }
        String strM6570k = bw.m6570k(context);
        if (!TextUtils.isEmpty(strM6570k)) {
            return strM6570k.replaceAll(Config.TRACE_TODAY_VISIT_SPLIT, "");
        }
        return strM6570k;
    }

    public String getMacAddress(Context context, boolean z) {
        String strReplace = Config.DEF_MAC_ID.replace(Config.TRACE_TODAY_VISIT_SPLIT, "");
        if (!z && android.os.Build.VERSION.SDK_INT >= 23) {
            return getSecretValue(strReplace);
        }
        if (!TextUtils.isEmpty(this.f3888b.f3945s)) {
            return this.f3888b.f3945s;
        }
        String strM6488h = bp.m6466a().m6488h(context);
        if (!TextUtils.isEmpty(strM6488h)) {
            this.f3888b.f3945s = strM6488h;
            return this.f3888b.f3945s;
        }
        String strM5859a = m5859a(context, z);
        if (!TextUtils.isEmpty(strM5859a) && !strReplace.equals(strM5859a)) {
            this.f3888b.f3945s = getSecretValue(strM5859a);
            bp.m6466a().m6483e(context, this.f3888b.f3945s);
            return this.f3888b.f3945s;
        }
        this.f3888b.f3945s = "";
        return this.f3888b.f3945s;
    }

    private String m5859a(Context context, boolean z) {
        String strM5858a;
        if (z) {
            strM5858a = m5860b(context);
        } else {
            strM5858a = m5858a(context);
        }
        if (TextUtils.isEmpty(strM5858a)) {
            return "";
        }
        return strM5858a;
    }

    public String getMacIdForTv(Context context) throws Throwable {
        if (!bu.m6524a().m6532d()) {
            return "";
        }
        if (!TextUtils.isEmpty(this.f3888b.f3946t)) {
            return this.f3888b.f3946t;
        }
        String strM6492j = bp.m6466a().m6492j(context);
        if (!TextUtils.isEmpty(strM6492j)) {
            this.f3888b.f3946t = strM6492j;
            return this.f3888b.f3946t;
        }
        String strM6565i = bw.m6565i(1, context);
        if (!TextUtils.isEmpty(strM6565i)) {
            this.f3888b.f3946t = strM6565i;
            bp.m6466a().m6485f(context, strM6565i);
            return this.f3888b.f3946t;
        }
        this.f3888b.f3946t = "";
        return this.f3888b.f3946t;
    }

    @Override
    public String getCUID(Context context, boolean z) {
        bp.m6466a().m6474b(context, "");
        if (this.f3888b.f3932f == null || "".equalsIgnoreCase(this.f3888b.f3932f)) {
            try {
                this.f3888b.f3932f = bx.m6592a(context);
                Matcher matcher = Pattern.compile("\\s*|\t|\r|\n").matcher(this.f3888b.f3932f);
                this.f3888b.f3932f = matcher.replaceAll("");
                this.f3888b.f3932f = getSecretValue(this.f3888b.f3932f);
            } catch (Exception e) {
            }
        }
        if (z) {
            return this.f3888b.f3932f;
        }
        try {
            String str = this.f3888b.f3932f;
            if (!TextUtils.isEmpty(str)) {
                return new String(bl.b.m6442b(1, bo.m6463a(str.getBytes())));
            }
        } catch (Exception e2) {
        }
        return null;
    }

    @Override
    public int getTagValue() {
        return 1;
    }

    public String getDevicImei(Context context) {
        if (!bu.m6524a().m6532d()) {
            return "";
        }
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (Exception e) {
            return "";
        }
    }

    @Override
    public String getDeviceId(TelephonyManager telephonyManager, Context context) {
        String str;
        boolean z;
        boolean z2;
        if (!TextUtils.isEmpty(this.f3888b.f3935i)) {
            return this.f3888b.f3935i;
        }
        if (bp.m6466a().m6491i(context)) {
            this.f3888b.f3935i = getMacIdForTv(context);
            return this.f3888b.f3935i;
        }
        String strM6508t = bp.m6466a().m6508t(context);
        if (!TextUtils.isEmpty(strM6508t)) {
            try {
                str = new String(bl.b.m6442b(1, bo.m6463a(strM6508t.getBytes())));
                z = true;
            } catch (Exception e) {
                e.printStackTrace();
                str = "";
                z = false;
            }
            if (z) {
                if (TextUtils.isEmpty(str) || str.contains("+") || str.contains("=") || str.length() > 30) {
                    str = "";
                    strM6508t = "";
                }
            } else {
                try {
                    str = new String(bl.b.m6442b(2, bo.m6463a(strM6508t.getBytes())));
                    z2 = true;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    z2 = false;
                }
                if (z2) {
                    if (TextUtils.isEmpty(str) || str.contains("+") || str.contains("=") || str.length() > 30) {
                        str = "";
                        strM6508t = "";
                    }
                } else {
                    this.f3888b.f3935i = strM6508t;
                    return this.f3888b.f3935i;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                filterCuid(context, str, true);
                return this.f3888b.f3935i;
            }
        }
        String strReplaceAll = strM6508t;
        if (telephonyManager != null && bu.m6524a().m6532d()) {
            Pattern patternCompile = Pattern.compile("\\s*|\t|\r|\n");
            try {
                String deviceId = telephonyManager.getDeviceId();
                if (deviceId != null) {
                    strReplaceAll = patternCompile.matcher(deviceId).replaceAll("");
                }
            } catch (Exception e3) {
            }
        }
        if (TextUtils.isEmpty(strReplaceAll) || strReplaceAll.equals(Config.NULL_DEVICE_ID)) {
            if (filterCuid(context, m5858a(context), false)) {
                return this.f3888b.f3935i;
            }
            return this.f3888b.f3935i;
        }
        this.f3888b.f3935i = getSecretValue(strReplaceAll);
        return this.f3888b.f3935i;
    }

    public boolean filterCuid(Context context, String str, boolean z) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strReplace = str.replace(Config.TRACE_TODAY_VISIT_SPLIT, "");
        if (strReplace.equals(Config.DEF_MAC_ID.replace(Config.TRACE_TODAY_VISIT_SPLIT, ""))) {
            if (TextUtils.isEmpty(this.f3888b.f3932f)) {
                this.f3888b.f3935i = getSecretValue(m5861c(context));
                return true;
            }
            try {
                str2 = new String(bl.b.m6442b(1, bo.m6463a(this.f3888b.f3932f.getBytes())));
            } catch (Exception e) {
                e.printStackTrace();
                str2 = "";
            }
            if (TextUtils.isEmpty(str2)) {
                this.f3888b.f3935i = getSecretValue(m5861c(context));
                return true;
            }
            this.f3888b.f3935i = getSecretValue(strReplace);
            return z;
        }
        this.f3888b.f3935i = getSecretValue(strReplace);
        return true;
    }

    private String m5861c(Context context) {
        String strM6482e = bp.m6466a().m6482e(context);
        if (TextUtils.isEmpty(strM6482e) || strM6482e.equals(Config.NULL_DEVICE_ID)) {
            String str = "hol" + (new Date().getTime() + "").hashCode() + "mes";
            bp.m6466a().m6469a(context, str);
            return str;
        }
        return strM6482e;
    }

    public String getPlainDeviceIdForCar(Context context) throws Throwable {
        String strOptUUID = CarUUID.optUUID(context);
        if (TextUtils.isEmpty(strOptUUID)) {
            strOptUUID = m5861c(context);
        }
        return TextUtils.isEmpty(strOptUUID) ? "" : strOptUUID;
    }

    @Override
    public String getAppChannel(Context context) {
        return m5862d(context);
    }

    private String m5862d(Context context) {
        try {
            if (this.f3888b.f3938l == null || this.f3888b.f3938l.equals("")) {
                boolean zM6487g = bp.m6466a().m6487g(context);
                if (zM6487g) {
                    this.f3888b.f3938l = bp.m6466a().m6484f(context);
                }
                if (!zM6487g || this.f3888b.f3938l == null || this.f3888b.f3938l.equals("")) {
                    this.f3888b.f3938l = bw.m6543a(context, Config.CHANNEL_META_NAME);
                }
            }
        } catch (Exception e) {
        }
        return this.f3888b.f3938l;
    }

    @Override
    public String getAppKey(Context context) {
        if (this.f3888b.f3931e == null) {
            this.f3888b.f3931e = bw.m6543a(context, Config.APPKEY_META_NAME);
        }
        return this.f3888b.f3931e;
    }

    @Override
    public String getMTJSDKVersion() {
        return "4.0.3.1";
    }

    @Override
    public int getAppVersionCode(Context context) {
        if (this.f3888b.f3933g == -1) {
            this.f3888b.f3933g = bw.m6559f(context);
        }
        return this.f3888b.f3933g;
    }

    @Override
    public String getAppVersionName(Context context) {
        if (TextUtils.isEmpty(this.f3888b.f3934h)) {
            this.f3888b.f3934h = bw.m6562g(context);
        }
        return this.f3888b.f3934h;
    }

    public void setAppVersionName(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f3888b.f3934h = str;
        }
    }

    @Override
    public String getOperator(TelephonyManager telephonyManager) {
        if (TextUtils.isEmpty(this.f3888b.f3939m)) {
            this.f3888b.f3939m = telephonyManager.getNetworkOperator();
        }
        return this.f3888b.f3939m;
    }

    @Override
    public String getLinkedWay(Context context) {
        if (TextUtils.isEmpty(this.f3888b.f3944r)) {
            this.f3888b.f3944r = bw.m6580r(context);
        }
        return this.f3888b.f3944r;
    }

    @Override
    public String getOSVersion() {
        if (TextUtils.isEmpty(this.f3888b.f3928b)) {
            this.f3888b.f3928b = Integer.toString(android.os.Build.VERSION.SDK_INT);
        }
        return this.f3888b.f3928b;
    }

    public String getOSSysVersion() {
        if (TextUtils.isEmpty(this.f3888b.f3929c)) {
            this.f3888b.f3929c = android.os.Build.VERSION.RELEASE;
        }
        return this.f3888b.f3929c;
    }

    @Override
    public String getPhoneModel() {
        if (TextUtils.isEmpty(this.f3888b.f3940n)) {
            this.f3888b.f3940n = android.os.Build.MODEL;
        }
        return this.f3888b.f3940n;
    }

    public String getManufacturer() {
        if (TextUtils.isEmpty(this.f3888b.f3941o)) {
            this.f3888b.f3941o = android.os.Build.MANUFACTURER;
        }
        return this.f3888b.f3941o;
    }

    @Override
    public boolean checkWifiLocationSetting(Context context) {
        return "true".equalsIgnoreCase(bw.m6543a(context, Config.GET_WIFI_LOCATION));
    }

    @Override
    public boolean checkGPSLocationSetting(Context context) {
        return "true".equals(bw.m6543a(context, Config.GET_GPS_LOCATION));
    }

    @Override
    public boolean checkCellLocationSetting(Context context) {
        return "true".equalsIgnoreCase(bw.m6543a(context, Config.GET_CELL_LOCATION));
    }

    @Override
    public String getSecretValue(String str) {
        return bl.b.m6443c(1, str.getBytes());
    }

    public String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public void resetHeadSign() {
        this.f3888b.f3952z = instance().getUUID();
    }

    public void enableDeviceMac(Context context, boolean z) {
        bp.m6466a().m6480d(context, z);
    }

    public boolean isDeviceMacEnabled(Context context) {
        return bp.m6466a().m6499m(context);
    }

    public void setUserId(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (str.length() > 256) {
            str = str.substring(0, 256);
        }
        bp.m6466a().m6490i(context, str);
        this.f3888b.setUserId(str);
        bb.m6313c().m6300a("Set user id " + str);
    }

    public String getUserId(Context context) {
        return bp.m6466a().m6505q(context);
    }

    public String getLastUserId(Context context) {
        return bp.m6466a().m6506r(context);
    }

    public void setLastUserId(Context context, String str) {
        bp.m6466a().m6493j(context, str);
    }

    public void setUserProperty(Context context, Map<String, String> map) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        try {
            if (map == null) {
                bp.m6466a().m6498m(context, "");
                this.f3888b.setUserProperty("");
                return;
            }
            if (map.size() > 100) {
                bb.m6313c().m6307c("[WARNING] setUserProperty failed,map size can not over 100 !");
                return;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                String key = entry.getKey();
                String value = entry.getValue();
                if (TextUtils.isEmpty(key) || value == null) {
                    bb.m6313c().m6307c("[WARNING] setUserProperty failed,key or value can not null !");
                    return;
                }
                if (key.length() > 256 || (!TextUtils.isEmpty(value) && value.length() > 256)) {
                    bb.m6313c().m6307c("[WARNING] setUserProperty failed,key or value can not over 256 bytes !");
                    return;
                } else {
                    jSONArray.put(value);
                    jSONArray.put("1");
                    jSONObject.put(key, jSONArray);
                }
            }
            z = true;
            if (z) {
                bp.m6466a().m6498m(context, jSONObject.toString());
                this.f3888b.setUserProperty(jSONObject.toString());
            }
        } catch (Exception e) {
            bb.m6313c().m6307c("[Exception] " + e.getMessage());
            e.printStackTrace();
            z = false;
        }
    }

    public void setZid(String str) {
    }
}
