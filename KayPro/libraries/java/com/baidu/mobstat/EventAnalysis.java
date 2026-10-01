package com.baidu.mobstat;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.android.common.util.DeviceId;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class EventAnalysis {

    private Map<String, C1398a> f3899a = new HashMap();

    public void onEvent(Context context, long j, String str, String str2, int i, long j2, ExtraInfo extraInfo, Map<String, String> map, boolean z) {
        m5878a(context, j, str, str2, i, j2, 0L, extraInfo, map, z);
    }

    public void onEvent(Context context, long j, String str, String str2, int i, long j2, String str3, String str4, int i2, boolean z) {
        m5879a(context, j, str, str2, i, j2, 0L, str3, str4, i2);
    }

    public void onEvent(Context context, long j, String str, String str2, int i, long j2, JSONArray jSONArray, JSONArray jSONArray2, String str3, String str4, String str5, Map<String, String> map, boolean z) {
        flushEvent(context, j, str, str2, i, j2, jSONArray, jSONArray2, str3, str4, str5, map, z);
    }

    public void onEventStart(Context context, String str, String str2, long j) {
        C1398a c1398a = new C1398a();
        c1398a.f3902c = j;
        c1398a.f3900a = str;
        c1398a.f3901b = str2;
        String strM5877a = m5877a(str, str2);
        if (this.f3899a.containsKey(strM5877a)) {
            bb.m6313c().m6303b("[WARNING] eventId: " + str + ", with label: " + str2 + " is duplicated, older is removed");
        }
        this.f3899a.put(strM5877a, c1398a);
    }

    public void onEventEnd(Context context, long j, String str, String str2, long j2, ExtraInfo extraInfo, Map<String, String> map, boolean z) {
        String strM5877a = m5877a(str, str2);
        C1398a c1398a = this.f3899a.get(strM5877a);
        if (c1398a == null) {
            bb.m6313c().m6303b("[WARNING] eventId: " + str + ", with label: " + str2 + " is not started or alread ended");
            return;
        }
        if ((str != null && !str.equals(c1398a.f3900a)) || (str2 != null && !str2.equals(c1398a.f3901b))) {
            bb.m6313c().m6303b("[WARNING] eventId/label pair not match");
            return;
        }
        this.f3899a.remove(strM5877a);
        long j3 = j2 - c1398a.f3902c;
        if (j3 < 0) {
            bb.m6313c().m6303b("[WARNING] onEventEnd must be invoked after onEventStart");
        }
        onEventDuration(context, j, str, str2, c1398a.f3902c, j3, extraInfo, map, z);
    }

    public void onEventDuration(Context context, long j, String str, String str2, long j2, long j3, ExtraInfo extraInfo, Map<String, String> map, boolean z) {
        if (j3 > 0) {
            m5878a(context, j, str, str2, 1, j2, j3, extraInfo, map, z);
        }
    }

    private void m5878a(Context context, long j, String str, String str2, int i, long j2, long j3, ExtraInfo extraInfo, Map<String, String> map, boolean z) {
        DataCore.instance().putEvent(context, getEvent(context, j, str, str2, i, j2, j3, "", "", 0, 0, extraInfo, map, z));
        DataCore.instance().flush(context);
    }

    private void m5879a(Context context, long j, String str, String str2, int i, long j2, long j3, String str3, String str4, int i2) {
        DataCore.instance().putEvent(context, getEvent(context, j, str, str2, i, j2, j3, str3, str4, i2, 1, null, null, false));
        DataCore.instance().flush(context);
    }

    public void flushEvent(Context context, long j, String str, String str2, int i, long j2, JSONArray jSONArray, JSONArray jSONArray2, String str3, String str4, String str5, Map<String, String> map, boolean z) {
        DataCore.instance().putEvent(context, getEvent(context, j, str, str2, i, j2, 0L, "", jSONArray, jSONArray2, str3, str4, str5, Config.EventViewType.EDIT.getValue(), 2, null, map, "", "", z));
        DataCore.instance().flush(context);
    }

    private String m5877a(String str, String str2) {
        return "__sdk_" + str + "$|$" + str2;
    }

    static class C1398a {

        String f3900a;

        String f3901b;

        long f3902c;

        private C1398a() {
        }
    }

    public static JSONObject getEvent(Context context, long j, String str, String str2, int i, long j2, long j3, String str3, String str4, int i2, int i3, ExtraInfo extraInfo, Map<String, String> map, boolean z) {
        return getEvent(context, j, str, str2, i, j2, j3, str3, null, null, str4, null, null, i2, i3, extraInfo, map, "", "", z);
    }

    public static JSONObject getEvent(Context context, long j, String str, String str2, int i, long j2, long j3, String str3, JSONArray jSONArray, JSONArray jSONArray2, String str4, String str5, String str6, int i2, int i3, ExtraInfo extraInfo, Map<String, String> map, String str7, String str8, boolean z) {
        return getEvent(context, j, str, str2, "", i, j2, j3, str3, jSONArray, jSONArray2, str4, str5, str6, i2, i3, extraInfo, map, str7, str8, z, null, "", null);
    }

    public static JSONObject getEvent(Context context, long j, String str, String str2, String str3, int i, long j2, long j3, String str4, JSONArray jSONArray, JSONArray jSONArray2, String str5, String str6, String str7, int i2, int i3, ExtraInfo extraInfo, Map<String, String> map, String str8, String str9, boolean z, JSONObject jSONObject, String str10, JSONArray jSONArray3) {
        Object obj;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ss", j);
            jSONObject2.put("i", str);
            jSONObject2.put("l", str2);
            jSONObject2.put("c", i);
            jSONObject2.put("t", j2);
            jSONObject2.put("d", j3);
            jSONObject2.put("h", str4);
            if (i3 != 3) {
                jSONObject2.put(Config.EVENT_NATIVE_VIEW_HIERARCHY, jSONArray);
                jSONObject2.put(Config.EVENT_H5_VIEW_HIERARCHY, jSONArray2);
            } else {
                jSONObject2.put(Config.EVENT_NATIVE_VIEW_HIERARCHY, str8);
                jSONObject2.put(Config.EVENT_H5_VIEW_HIERARCHY, str9);
                jSONObject2.put("content", str3);
            }
            jSONObject2.put("p", str5);
            jSONObject2.put(Config.EVENT_H5_PAGE, str6);
            jSONObject2.put(Config.EVENT_VIEW_RES_NAME, str7);
            jSONObject2.put("v", i2);
            jSONObject2.put("at", i3);
            jSONObject2.put("h5", z ? 1 : 0);
            if (extraInfo != null && extraInfo.dumpToJson().length() != 0) {
                jSONObject2.put("ext", extraInfo.dumpToJson());
            }
            if (map != null) {
                JSONArray jSONArray4 = new JSONArray();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value) && !m5882a(value, 1024)) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(Config.APP_KEY, key);
                        jSONObject3.put("v", value);
                        jSONArray4.put(jSONObject3);
                    }
                }
                if (jSONArray4.length() != 0) {
                    jSONObject2.put(Config.EVENT_ATTR, jSONArray4);
                }
            }
            if (jSONObject != null && jSONObject.length() != 0) {
                JSONArray jSONArray5 = new JSONArray();
                jSONArray5.put(jSONObject);
                jSONObject2.put(Config.EVENT_HEAT_POINT, jSONArray5);
            }
            if (TextUtils.isEmpty(str10)) {
                str10 = "";
            }
            jSONObject2.put("sign", str10);
            if (jSONArray3 == null || jSONArray3.length() == 0) {
                obj = jSONArray3;
                obj = "";
            }
            obj = jSONArray3;
            jSONObject2.put("v5", obj);
        } catch (Exception e) {
        }
        return jSONObject2;
    }

    private static boolean m5882a(String str, int i) {
        int length;
        if (str == null) {
            return false;
        }
        try {
            length = str.getBytes().length;
        } catch (Exception e) {
            length = 0;
        }
        return length > i;
    }

    private static boolean m5884b(String str, String str2) {
        if (TextUtils.isEmpty(str) || new JSONObject().toString().equals(str)) {
            return (TextUtils.isEmpty(str2) || new JSONArray().toString().equals(str2)) ? false : true;
        }
        return true;
    }

    public static void doEventMerge(JSONArray jSONArray, JSONObject jSONObject) {
        int i = 0;
        JSONArray jSONArrayOptJSONArray = null;
        JSONArray jSONArrayOptJSONArray2 = null;
        String strOptString = "";
        String strOptString2 = "";
        Config.EventViewType.EDIT.getValue();
        try {
            long jOptLong = jSONObject.optLong("ss");
            String string = jSONObject.getString("i");
            String string2 = jSONObject.getString("l");
            long j = jSONObject.getLong("t") / 3600000;
            String strOptString3 = jSONObject.optString("s");
            int iOptInt = jSONObject.optInt("at");
            String strOptString4 = jSONObject.optString("h");
            if (iOptInt != 3) {
                jSONArrayOptJSONArray = jSONObject.optJSONArray(Config.EVENT_NATIVE_VIEW_HIERARCHY);
                jSONArrayOptJSONArray2 = jSONObject.optJSONArray(Config.EVENT_H5_VIEW_HIERARCHY);
            } else {
                strOptString = jSONObject.optString(Config.EVENT_NATIVE_VIEW_HIERARCHY);
                strOptString2 = jSONObject.optString(Config.EVENT_H5_VIEW_HIERARCHY);
            }
            String strOptString5 = jSONObject.optString("p");
            String strOptString6 = jSONObject.optString(Config.EVENT_H5_PAGE);
            String strOptString7 = jSONObject.optString(Config.EVENT_VIEW_RES_NAME);
            int iOptInt2 = jSONObject.optInt("v");
            String strOptString8 = jSONObject.optString("ext");
            String strOptString9 = jSONObject.optString(Config.EVENT_ATTR);
            int iOptInt3 = jSONObject.optInt("h5");
            String strOptString10 = jSONObject.optString("sign");
            try {
                i = jSONObject.getInt("d");
            } catch (JSONException e) {
            }
            if (i == 0 && !m5884b(strOptString8, strOptString9)) {
                m5880a(jSONArray, jSONObject, jOptLong, string, string2, strOptString3, j, strOptString4, jSONArrayOptJSONArray, jSONArrayOptJSONArray2, strOptString5, strOptString6, strOptString7, iOptInt2, iOptInt, strOptString, strOptString2, iOptInt3, strOptString10);
                return;
            }
            int length = jSONArray.length();
            try {
                jSONObject.put("s", DeviceId.CUIDInfo.I_EMPTY);
                jSONArray.put(length, jSONObject);
            } catch (JSONException e2) {
            }
        } catch (JSONException e3) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0010 A[Catch: JSONException -> 0x01b5, TRY_LEAVE, TryCatch #1 {JSONException -> 0x01b5, blocks: (B:4:0x0006, B:6:0x0010), top: B:81:0x0006 }] */
    private static void m5880a(JSONArray jSONArray, JSONObject jSONObject, long j, String str, String str2, String str3, long j2, String str4, JSONArray jSONArray2, JSONArray jSONArray3, String str5, String str6, String str7, int i, int i2, String str8, String str9, int i3, String str10) throws JSONException {
        int i4;
        int length = jSONArray.length();
        if (str3 != null) {
            try {
                if (str3.equals("")) {
                    jSONObject.put("s", "0|");
                }
            } catch (JSONException e) {
            }
        } else {
            jSONObject.put("s", "0|");
        }
        int i5 = 0;
        int i6 = length;
        while (true) {
            if (i5 >= length) {
                i5 = i6;
                break;
            }
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i5);
                long jOptLong = jSONObject2.optLong("ss");
                String string = jSONObject2.getString("i");
                String string2 = jSONObject2.getString("l");
                long j3 = jSONObject2.getLong("t") / 3600000;
                try {
                    i4 = jSONObject2.getInt("d");
                } catch (JSONException e2) {
                    i4 = 0;
                }
                String strOptString = jSONObject2.optString("h");
                String strOptString2 = jSONObject2.optString("p");
                String strOptString3 = jSONObject2.optString(Config.EVENT_H5_PAGE);
                String strOptString4 = jSONObject2.optString(Config.EVENT_VIEW_RES_NAME);
                int iOptInt = jSONObject2.optInt("v");
                int iOptInt2 = jSONObject2.optInt("at");
                JSONArray jSONArrayOptJSONArray = null;
                JSONArray jSONArrayOptJSONArray2 = null;
                String strOptString5 = "";
                String strOptString6 = "";
                if (iOptInt2 != 3) {
                    jSONArrayOptJSONArray = jSONObject2.optJSONArray(Config.EVENT_NATIVE_VIEW_HIERARCHY);
                    jSONArrayOptJSONArray2 = jSONObject2.optJSONArray(Config.EVENT_H5_VIEW_HIERARCHY);
                } else {
                    strOptString5 = jSONObject2.optString(Config.EVENT_NATIVE_VIEW_HIERARCHY);
                    strOptString6 = jSONObject2.optString(Config.EVENT_H5_VIEW_HIERARCHY);
                }
                String strOptString7 = jSONObject2.optString("ext");
                String strOptString8 = jSONObject2.optString(Config.EVENT_ATTR);
                int iOptInt3 = jSONObject2.optInt("h5");
                String strOptString9 = jSONObject2.optString("sign");
                if (j3 == j2 && i4 == 0 && !m5884b(strOptString7, strOptString8) && jOptLong == j && string.equals(str) && string2.equals(str2) && strOptString.equals(str4) && strOptString2.equals(str5) && strOptString3.equals(str6) && m5883a(jSONArrayOptJSONArray, jSONArray2) && m5883a(jSONArrayOptJSONArray2, jSONArray3) && strOptString4.equals(str7) && iOptInt == i && iOptInt2 == i2 && strOptString5.equals(str8) && strOptString6.equals(str9) && iOptInt3 == i3 && strOptString9.equals(str10)) {
                    int i7 = jSONObject.getInt("c") + jSONObject2.getInt("c");
                    String strOptString10 = jSONObject2.optString("s");
                    String str11 = (strOptString10 == null || strOptString10.equalsIgnoreCase("")) ? "0|" : strOptString10;
                    long j4 = jSONObject.getLong("t") - jSONObject2.getLong("t");
                    if (j4 < 0) {
                        j4 = 0;
                    }
                    String str12 = str11 + j4 + "|";
                    try {
                        jSONObject2.remove("c");
                        jSONObject2.put("c", i7);
                        jSONObject2.put("s", str12);
                        m5881a(jSONObject2, jSONObject);
                        break;
                    } catch (JSONException e3) {
                        i6 = i5;
                    }
                }
            } catch (JSONException e4) {
            }
            i5++;
        }
        if (i5 >= length) {
            try {
                jSONArray.put(length, jSONObject);
            } catch (JSONException e5) {
            }
        }
    }

    private static void m5881a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject != null && jSONObject2 != null) {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(Config.EVENT_HEAT_POINT);
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() != 0) {
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    try {
                        jSONArray.put(jSONArrayOptJSONArray2.getJSONObject(i));
                    } catch (Exception e) {
                    }
                }
            }
            if (jSONArray.length() < 10 && (jSONArrayOptJSONArray = jSONObject2.optJSONArray(Config.EVENT_HEAT_POINT)) != null && jSONArrayOptJSONArray.length() != 0) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    try {
                        jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i2));
                    } catch (Exception e2) {
                    }
                }
            }
            if (jSONArray != null && jSONArray.length() != 0) {
                try {
                    jSONObject.put(Config.EVENT_HEAT_POINT, jSONArray);
                } catch (Exception e3) {
                }
            }
        }
    }

    private static boolean m5883a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || !jSONArray.toString().equals(jSONArray2.toString())) ? false : true;
    }
}
