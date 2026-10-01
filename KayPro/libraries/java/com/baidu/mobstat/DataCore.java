package com.baidu.mobstat;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.android.common.util.DeviceId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DataCore {

    private static JSONObject f3889a = new JSONObject();

    private static DataCore f3890b = new DataCore();

    private StatService.WearListener f3896h;

    private JSONObject f3897i;

    private JSONArray f3891c = new JSONArray();

    private JSONArray f3892d = new JSONArray();

    private JSONArray f3893e = new JSONArray();

    private boolean f3894f = false;

    private volatile int f3895g = 0;

    private Object f3898j = new Object();

    public static DataCore instance() {
        return f3890b;
    }

    private DataCore() {
    }

    public void init(Context context) {
        instance().loadStatData(context);
        instance().loadLastSession(context);
        instance().installHeader(context);
    }

    public int getCacheFileSzie() {
        return this.f3895g;
    }

    public JSONObject getLogData() {
        return this.f3897i;
    }

    public void putSession(Session session) {
        putSession(session.constructJSONObject());
    }

    public void putSession(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (m5874a(jSONObject.toString())) {
                bb.m6313c().m6303b("[WARNING] data to put exceed limit, ignored");
                return;
            }
            synchronized (this.f3891c) {
                try {
                    this.f3891c.put(this.f3891c.length(), jSONObject);
                } catch (JSONException e) {
                }
            }
        }
    }

    public void putSession(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(new JSONObject().toString())) {
            try {
                putSession(new JSONObject(str));
            } catch (JSONException e) {
            }
        }
    }

    private boolean m5874a(String str) {
        return (str.getBytes().length + BDStatCore.instance().getSessionSize()) + this.f3895g > 184320;
    }

    public void putEvent(Context context, JSONObject jSONObject) {
        if (jSONObject != null) {
            if (m5874a(jSONObject.toString())) {
                bb.m6313c().m6303b("[WARNING] data to put exceed limit, ignored");
                return;
            }
            synchronized (this.f3892d) {
                EventAnalysis.doEventMerge(this.f3892d, jSONObject);
            }
        }
    }

    public void installHeader(Context context) {
        synchronized (f3889a) {
            CooperService.instance().getHeadObject().installHeader(context, f3889a);
        }
    }

    public void flush(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            synchronized (this.f3891c) {
                jSONObject.put(Config.PRINCIPAL_PART, new JSONArray(this.f3891c.toString()));
            }
            synchronized (this.f3892d) {
                jSONObject.put(Config.EVENT_PART, new JSONArray(this.f3892d.toString()));
            }
            synchronized (f3889a) {
                jSONObject.put(Config.HEADER_PART, new JSONObject(f3889a.toString()));
            }
        } catch (Exception e) {
        }
        String string = jSONObject.toString();
        if (m5873a()) {
            bb.m6313c().m6300a("[WARNING] stat cache exceed 184320 Bytes, ignored");
            return;
        }
        int length = string.getBytes().length;
        if (length >= 184320) {
            m5872a(true);
            return;
        }
        this.f3895g = length;
        bn.m6456a(context, bw.m6583u(context) + Config.STAT_CACHE_FILE_NAME, string, false);
        synchronized (this.f3893e) {
            bn.m6456a(context, Config.LAST_AP_INFO_FILE_NAME, this.f3893e.toString(), false);
        }
    }

    private void m5872a(boolean z) {
        this.f3894f = z;
    }

    private boolean m5873a() {
        return this.f3894f;
    }

    public void loadLastSession(Context context) throws Throwable {
        if (context != null) {
            String str = bw.m6583u(context) + Config.LAST_SESSION_FILE_NAME;
            if (bn.m6459c(context, str)) {
                String strM6454a = bn.m6454a(context, str);
                if (!TextUtils.isEmpty(strM6454a)) {
                    bn.m6456a(context, str, new JSONObject().toString(), false);
                    putSession(strM6454a);
                    flush(context);
                }
            }
        }
    }

    public void loadWifiData(Context context) {
        JSONArray jSONArray;
        if (context != null && bn.m6459c(context, Config.LAST_AP_INFO_FILE_NAME)) {
            try {
                JSONArray jSONArray2 = new JSONArray(bn.m6454a(context, Config.LAST_AP_INFO_FILE_NAME));
                int length = jSONArray2.length();
                if (length >= 10) {
                    jSONArray = new JSONArray();
                    for (int i = length - 10; i < length; i++) {
                        jSONArray.put(jSONArray2.get(i));
                    }
                } else {
                    jSONArray = jSONArray2;
                }
                String strM6573m = bw.m6573m(1, context);
                if (!TextUtils.isEmpty(strM6573m)) {
                    jSONArray.put(strM6573m);
                }
                synchronized (this.f3893e) {
                    try {
                        this.f3893e = jSONArray;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (JSONException e) {
            }
        }
    }

    public void loadStatData(Context context) throws Throwable {
        if (context != null) {
            String str = bw.m6583u(context) + Config.STAT_CACHE_FILE_NAME;
            if (bn.m6459c(context, str)) {
                String strM6454a = bn.m6454a(context, str);
                if (!TextUtils.isEmpty(strM6454a)) {
                    JSONObject jSONObject = null;
                    try {
                        jSONObject = new JSONObject(strM6454a);
                    } catch (Exception e) {
                    }
                    if (jSONObject != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            JSONArray jSONArray = jSONObject.getJSONArray(Config.PRINCIPAL_PART);
                            if (jSONArray != null) {
                                for (int i = 0; i < jSONArray.length(); i++) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                                    if (jCurrentTimeMillis - jSONObject2.getLong("s") <= Config.MAX_LOG_DATA_EXSIT_TIME) {
                                        putSession(jSONObject2);
                                    }
                                }
                            }
                        } catch (Exception e2) {
                        }
                        try {
                            JSONArray jSONArray2 = jSONObject.getJSONArray(Config.EVENT_PART);
                            if (jSONArray2 != null) {
                                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                                    if (jCurrentTimeMillis - jSONObject3.getLong("t") <= Config.MAX_LOG_DATA_EXSIT_TIME) {
                                        putEvent(context, jSONObject3);
                                    }
                                }
                            }
                        } catch (Exception e3) {
                        }
                        try {
                            JSONObject jSONObject4 = jSONObject.getJSONObject(Config.HEADER_PART);
                            if (jSONObject4 != null) {
                                synchronized (f3889a) {
                                    f3889a = jSONObject4;
                                }
                            }
                        } catch (Exception e4) {
                        }
                    }
                }
            }
        }
    }

    public String constructLogWithEmptyBody(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        HeadObject headObject = CooperService.instance().getHeadObject();
        if (TextUtils.isEmpty(headObject.f3931e)) {
            headObject.installHeader(context, jSONObject2);
        } else {
            headObject.updateHeader(context, jSONObject2);
        }
        JSONArray jSONArray = new JSONArray();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            jSONObject2.put("t", jCurrentTimeMillis);
            jSONObject2.put("ss", jCurrentTimeMillis);
            jSONObject2.put(Config.WIFI_LOCATION, jSONArray);
            jSONObject2.put(Config.SEQUENCE_INDEX, 0);
            jSONObject2.put("sign", CooperService.instance().getUUID());
            jSONObject2.put(Config.APP_KEY, str);
            jSONObject.put(Config.HEADER_PART, jSONObject2);
            try {
                jSONObject.put(Config.PRINCIPAL_PART, jSONArray);
                try {
                    jSONObject.put(Config.EVENT_PART, jSONArray);
                    try {
                        jSONObject.put(Config.EXCEPTION_PART, jSONArray);
                        return jSONObject.toString();
                    } catch (JSONException e) {
                        return null;
                    }
                } catch (JSONException e2) {
                    return null;
                }
            } catch (JSONException e3) {
                return null;
            }
        } catch (Exception e4) {
            return null;
        }
    }

    private void m5870a(Context context, JSONObject jSONObject, boolean z) {
        boolean z2 = true;
        if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(Config.TRACE_APPLICATION_SESSION, z ? 1 : 0);
            } catch (Exception e) {
            }
            try {
                jSONObject2.put(Config.TRACE_FAILED_CNT, 0);
            } catch (Exception e2) {
            }
            try {
                jSONObject2.put(Config.TRACE_CIRCLE, ad.m5968c());
            } catch (Exception e3) {
            }
            try {
                jSONObject.put(Config.TRACE_PART, jSONObject2);
            } catch (Exception e4) {
                z2 = false;
            }
            if (z2) {
                m5869a(context, jSONObject, jSONObject2);
            }
        }
    }

    private void m5869a(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        long jCurrentTimeMillis;
        int iM5863a = m5863a(jSONObject);
        try {
            JSONObject jSONObject3 = jSONObject.getJSONObject(Config.HEADER_PART);
            jCurrentTimeMillis = jSONObject3 != null ? jSONObject3.getLong("ss") : 0L;
        } catch (Exception e) {
            jCurrentTimeMillis = 0;
        }
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        m5868a(context, jSONObject2, jCurrentTimeMillis, iM5863a);
    }

    private int m5863a(JSONObject jSONObject) {
        int i;
        int i2 = 0;
        if (jSONObject == null) {
            return 0;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(Config.HEADER_PART);
            i = (jSONObject2.getLong("ss") <= 0 || jSONObject2.getLong(Config.SEQUENCE_INDEX) != 0) ? 0 : 1;
        } catch (Exception e) {
            i = 0;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(Config.PRINCIPAL_PART);
            if (jSONArray != null && jSONArray.length() != 0) {
                while (i2 < jSONArray.length()) {
                    JSONObject jSONObject3 = (JSONObject) jSONArray.get(i2);
                    i2++;
                    i = (jSONObject3.getLong("e") == 0 || jSONObject3.getLong("c") != 0) ? i : i + 1;
                }
            }
        } catch (Exception e2) {
        }
        return i;
    }

    private void m5868a(Context context, JSONObject jSONObject, long j, int i) {
        long jLongValue;
        int iIntValue;
        long jIntValue;
        Object jSONArray;
        String[] strArrSplit;
        long jLongValue2 = ac.m5952a().m5956b(context).longValue();
        if (jLongValue2 <= 0 && i != 0) {
            ac.m5952a().m5954a(context, j);
            jLongValue2 = j;
        }
        m5871a(jSONObject, Config.TRACE_VISIT_FIRST, Long.valueOf(jLongValue2));
        if (i != 0) {
            long jLongValue3 = ac.m5952a().m5959c(context).longValue();
            jLongValue = j - jLongValue3;
            if (jLongValue3 != 0 && jLongValue <= 0) {
                jLongValue = -1;
            } else if (jLongValue3 == 0) {
                jLongValue = 0;
            }
            ac.m5952a().m5957b(context, j);
            ac.m5952a().m5960c(context, jLongValue);
        } else {
            jLongValue = ac.m5952a().m5961d(context).longValue();
        }
        m5871a(jSONObject, Config.TRACE_VISIT_SESSION_LAST_INTERVAL, Long.valueOf(jLongValue));
        String str = "";
        String str2 = "";
        String strM5962e = ac.m5952a().m5962e(context);
        if (!TextUtils.isEmpty(strM5962e) && strM5962e.contains(Config.TRACE_TODAY_VISIT_SPLIT) && (strArrSplit = strM5962e.split(Config.TRACE_TODAY_VISIT_SPLIT)) != null && strArrSplit.length == 2) {
            str = strArrSplit[0];
            str2 = strArrSplit[1];
        }
        if (TextUtils.isEmpty(str2)) {
            iIntValue = 0;
        } else {
            try {
                iIntValue = Integer.valueOf(str2).intValue();
            } catch (Exception e) {
                iIntValue = 0;
            }
        }
        String strM6591a = bx.m6591a(j);
        int i2 = (TextUtils.isEmpty(str) || strM6591a.equals(str)) ? i + iIntValue : i;
        if (i != 0) {
            ac.m5952a().m5955a(context, strM6591a + Config.TRACE_TODAY_VISIT_SPLIT + i2);
        }
        m5871a(jSONObject, Config.TRACE_VISIT_SESSION_TODAY_COUNT, Integer.valueOf(i2));
        if (TextUtils.isEmpty(str)) {
            jIntValue = 0;
        } else {
            try {
                jIntValue = Integer.valueOf(str).intValue();
            } catch (Exception e2) {
                jIntValue = 0;
            }
        }
        if (jIntValue != 0 && !TextUtils.isEmpty(str) && !strM6591a.equals(str) && i != 0) {
            JSONArray jSONArrayM5864a = m5864a(context, jIntValue, iIntValue);
            ac.m5952a().m5958b(context, jSONArrayM5864a.toString());
            m5871a(jSONObject, Config.TRACE_VISIT_RECENT, jSONArrayM5864a);
            return;
        }
        String strM5963f = ac.m5952a().m5963f(context);
        if (TextUtils.isEmpty(strM5963f)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(strM5963f);
            } catch (Exception e3) {
                jSONArray = null;
            }
        }
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        m5871a(jSONObject, Config.TRACE_VISIT_RECENT, jSONArray);
    }

    private JSONArray m5864a(Context context, long j, long j2) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        String strM5963f = ac.m5952a().m5963f(context);
        if (!TextUtils.isEmpty(strM5963f)) {
            try {
                JSONArray jSONArray = new JSONArray(strM5963f);
                if (jSONArray != null && jSONArray.length() != 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add((JSONObject) jSONArray.get(i));
                    }
                }
            } catch (Exception e) {
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            try {
                if (((JSONObject) it.next()).getLong(Config.TRACE_VISIT_RECENT_DAY) == j) {
                    z = false;
                    break;
                }
            } catch (Exception e2) {
            }
        }
        if (z) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Config.TRACE_VISIT_RECENT_DAY, j);
                jSONObject.put(Config.TRACE_VISIT_RECENT_COUNT, j2);
                arrayList.add(jSONObject);
            } catch (Exception e3) {
            }
        }
        int size = arrayList.size();
        return new JSONArray((Collection) (size > 5 ? arrayList.subList(size - 5, size) : arrayList));
    }

    private void m5871a(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null) {
            if (!jSONObject.has(Config.TRACE_VISIT)) {
                try {
                    jSONObject.put(Config.TRACE_VISIT, new JSONObject());
                } catch (Exception e) {
                }
            }
            try {
                ((JSONObject) jSONObject.get(Config.TRACE_VISIT)).put(str, obj);
            } catch (Exception e2) {
            }
        }
    }

    public void saveLogDataAndSendForRaven(Context context) {
        synchronized (this.f3898j) {
        }
    }

    public void sendDataForDueros(Context context) {
    }

    public void saveLogData(Context context, boolean z, boolean z2, long j, boolean z3) {
        saveLogData(context, z, z2, j, z3, null);
    }

    public void saveLogData(Context context, boolean z, boolean z2, long j, boolean z3, JSONObject jSONObject) {
        HeadObject headObject = CooperService.instance().getHeadObject();
        if (headObject != null) {
            synchronized (f3889a) {
                if (TextUtils.isEmpty(headObject.f3931e)) {
                    headObject.installHeader(context, f3889a);
                } else {
                    headObject.updateHeader(context, f3889a);
                }
            }
            if (TextUtils.isEmpty(headObject.f3931e)) {
                bb.m6313c().m6307c("[WARNING] 无法找到有效APP Key, 请参考文档配置");
                return;
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        synchronized (f3889a) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                String strOptString = f3889a.optString("at");
                String strOptString2 = f3889a.optString(Config.CUSTOM_USER_ID);
                if (!TextUtils.isEmpty(strOptString) && strOptString.equals(DeviceId.CUIDInfo.I_EMPTY)) {
                    if (!strOptString2.equals(CooperService.instance().getLastUserId(context))) {
                        f3889a.put(Config.UID_CHANGE, strOptString2);
                    } else {
                        f3889a.put(Config.UID_CHANGE, "");
                    }
                    CooperService.instance().setLastUserId(context, strOptString2);
                }
                f3889a.put("t", jCurrentTimeMillis);
                f3889a.put(Config.SEQUENCE_INDEX, z ? 0 : 1);
                f3889a.put("ss", j);
                synchronized (this.f3893e) {
                    f3889a.put(Config.WIFI_LOCATION, this.f3893e);
                }
                f3889a.put("sign", CooperService.instance().getUUID());
                m5875b(context, f3889a, jSONObject);
                jSONObject2.put(Config.HEADER_PART, f3889a);
                synchronized (this.f3891c) {
                    try {
                        jSONObject2.put(Config.PRINCIPAL_PART, this.f3891c);
                        synchronized (this.f3892d) {
                            try {
                                jSONObject2.put(Config.EVENT_PART, this.f3892d);
                                try {
                                    jSONObject2.put(Config.EXCEPTION_PART, new JSONArray());
                                    m5870a(context, jSONObject2, z2);
                                    m5876b(jSONObject2);
                                    m5867a(context, jSONObject2);
                                    m5866a(context, jSONObject2.toString(), z, z3);
                                    this.f3897i = jSONObject2;
                                    clearCache(context);
                                } catch (JSONException e) {
                                }
                            } catch (JSONException e2) {
                            }
                        }
                    } catch (JSONException e3) {
                    }
                }
            } catch (Exception e4) {
            }
        }
    }

    private void m5875b(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject.length() != 0 && jSONObject2 != null && jSONObject2.length() != 0) {
            try {
                jSONObject.put(Config.LAUNCH, jSONObject2);
            } catch (Exception e) {
            }
        }
    }

    private void m5876b(JSONObject jSONObject) {
    }

    private void m5867a(Context context, JSONObject jSONObject) {
    }

    private void m5866a(Context context, String str, boolean z, boolean z2) {
        boolean z3 = false;
        if (this.f3896h != null && this.f3896h.onSendLogData(str)) {
            bb.m6313c().m6300a("Log has been passed to app level, log: " + str);
            return;
        }
        LogSender.instance().saveLogData(context, str, false);
        bb.m6313c().m6300a("Save log: " + str);
        if (z) {
            au.m6210a(context);
            return;
        }
        if (av.m6217a().m6257b() == 0 && av.m6217a().m6263c()) {
            z3 = true;
        }
        au.m6211a(context, z3);
    }

    public void clearCache(Context context) {
        m5872a(false);
        String strOptString = f3889a.optString(Config.DEVICE_ID_SEC);
        if (!TextUtils.isEmpty(strOptString)) {
            bp.m6466a().m6497l(context, strOptString);
        }
        synchronized (f3889a) {
            f3889a = new JSONObject();
        }
        installHeader(context);
        m5865a(context);
    }

    private void m5865a(Context context) {
        synchronized (this.f3892d) {
            this.f3892d = new JSONArray();
        }
        synchronized (this.f3891c) {
            this.f3891c = new JSONArray();
        }
        synchronized (this.f3893e) {
            this.f3893e = new JSONArray();
        }
        flush(context);
    }
}
