package com.baidu.mobstat;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class av {

    private static av f4226b = new av();

    public a f4227a;

    private Handler f4229d;

    private volatile int f4230e;

    private int f4231f;

    private HandlerThread f4228c = new HandlerThread("fullTraceHandleThread");

    private JSONObject f4232g = new JSONObject();

    private JSONArray f4233h = new JSONArray();

    private JSONArray f4234i = new JSONArray();

    private JSONArray f4235j = new JSONArray();

    private JSONArray f4236k = new JSONArray();

    private boolean f4237l = false;

    private List<JSONObject> f4238m = new ArrayList();

    private List<String> f4239n = new ArrayList();

    private List<String> f4240o = new ArrayList();

    public interface a {
        void m6264a(JSONObject jSONObject);
    }

    public static av m6217a() {
        return f4226b;
    }

    private av() {
        this.f4228c.start();
        this.f4228c.setPriority(10);
        this.f4229d = new Handler(this.f4228c.getLooper());
    }

    public int m6257b() {
        return this.f4231f;
    }

    public boolean m6263c() {
        return this.f4237l;
    }

    public void m6248a(Context context) throws Throwable {
        JSONObject jSONObject;
        if (context != null) {
            this.f4237l = true;
            m6247e();
            String str = bw.m6583u(context) + Config.STAT_FULL_CACHE_FILE_NAME;
            if (bn.m6459c(context, str)) {
                String strM6454a = bn.m6454a(context, str);
                if (!TextUtils.isEmpty(strM6454a)) {
                    try {
                        jSONObject = new JSONObject(strM6454a);
                    } catch (Exception e) {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        try {
                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(Config.EVENT_PART);
                            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(Config.PRINCIPAL_PART);
                            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(Config.FEED_LIST_PART);
                            JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("sv");
                            if ((jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) && ((jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() == 0) && ((jSONArrayOptJSONArray3 == null || jSONArrayOptJSONArray3.length() == 0) && (jSONArrayOptJSONArray4 == null || jSONArrayOptJSONArray4.length() == 0)))) {
                                if (bg.m6342c().mo6306b()) {
                                    bg.m6342c().m6300a("saveLastCacheToSend content:empty, return");
                                    return;
                                }
                                return;
                            }
                            m6234b(context, jSONObject.getJSONObject(Config.HEADER_PART));
                            m6242c(context, jSONObject);
                            m6237b(jSONObject);
                            strM6454a = jSONObject.toString();
                            if (bg.m6342c().mo6306b()) {
                                bg.m6342c().m6300a("saveLastCacheToSend content: " + strM6454a);
                            }
                            m6240c(context, strM6454a);
                            m6262c(context, false);
                            this.f4237l = false;
                        } catch (Exception e2) {
                        }
                    }
                }
            }
        }
    }

    public void m6251a(Context context, String str, String str2, String str3, int i, long j, String str4, JSONArray jSONArray, String str5, JSONArray jSONArray2, String str6, Map<String, String> map, JSONObject jSONObject, String str7, JSONArray jSONArray3) {
        m6252a(context, str, str2, str3, i, j, str4, jSONArray, str5, jSONArray2, str6, map, false, jSONObject, str7, jSONArray3);
    }

    public void m6252a(final Context context, final String str, final String str2, final String str3, final int i, final long j, final String str4, final JSONArray jSONArray, final String str5, final JSONArray jSONArray2, final String str6, final Map<String, String> map, final boolean z, final JSONObject jSONObject, final String str7, final JSONArray jSONArray3) {
        this.f4229d.post(new Runnable() {
            @Override
            public void run() {
                long sessionStartTime = BDStatCore.instance().getSessionStartTime();
                if (sessionStartTime > 0) {
                    av.this.m6221a(context, sessionStartTime, str, str2, str3, i, j, str4, jSONArray, str5, jSONArray2, str6, map, z, jSONObject, str7, jSONArray3);
                }
            }
        });
    }

    public void m6221a(Context context, long j, String str, String str2, String str3, int i, long j2, String str4, JSONArray jSONArray, String str5, JSONArray jSONArray2, String str6, Map<String, String> map, boolean z, JSONObject jSONObject, String str7, JSONArray jSONArray3) {
        m6223a(context, EventAnalysis.getEvent(context, j, str, str2, str3, i, j2, 0L, "", null, null, bi.m6364a(str4), bi.m6364a(str5), str6, Config.EventViewType.EDIT.getValue(), 3, null, map, bi.m6387c(jSONArray), bi.m6393d(jSONArray2), z, jSONObject, str7, jSONArray3));
        m6261c(context);
    }

    private void m6223a(Context context, JSONObject jSONObject) {
        if (jSONObject != null) {
            if (bg.m6342c().mo6306b()) {
                bg.m6342c().m6300a("putEvent: " + jSONObject.toString());
            }
            String string = jSONObject.toString();
            if (m6239b(context, string)) {
                if (bg.m6342c().mo6306b()) {
                    bg.m6342c().m6300a("checkExceedLogLimit exceed:true; mCacheLogSize: " + this.f4230e + "; addedSize:" + string.length());
                }
                m6244d(context);
            }
            try {
                jSONObject.put(Config.EVENT_NEXT_PAGENAME, "");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            EventAnalysis.doEventMerge(this.f4233h, jSONObject);
        }
    }

    private boolean m6239b(Context context, String str) {
        return (str != null ? str.getBytes().length : 0) + this.f4230e > 184320;
    }

    public void m6254a(final Context context, final boolean z) {
        this.f4229d.post(new Runnable() {
            @Override
            public void run() {
                av.this.m6260b(context, z);
            }
        });
    }

    public void m6256a(final JSONObject jSONObject) {
        this.f4229d.post(new Runnable() {
            @Override
            public void run() {
                if (jSONObject != null && jSONObject.length() != 0) {
                    av.this.f4234i = av.this.m6231b(av.this.f4234i, jSONObject);
                }
            }
        });
    }

    public void m6260b(Context context, boolean z) {
        if (z) {
            m6247e();
        } else {
            m6243d();
        }
        try {
            m6234b(context, this.f4232g);
        } catch (Exception e) {
        }
        if (this.f4233h.length() != 0 || this.f4234i.length() != 0 || this.f4235j.length() != 0 || this.f4236k.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(Config.HEADER_PART, this.f4232g);
            } catch (Exception e2) {
            }
            try {
                jSONObject.put(Config.PRINCIPAL_PART, this.f4234i);
            } catch (Exception e3) {
            }
            try {
                jSONObject.put(Config.EVENT_PART, this.f4233h);
            } catch (Exception e4) {
            }
            try {
                jSONObject.put(Config.FEED_LIST_PART, this.f4235j);
            } catch (Exception e5) {
            }
            try {
                jSONObject.put("sv", this.f4236k);
            } catch (Exception e6) {
            }
            try {
                jSONObject.put(Config.EVENT_PAGE_MAPPING, at.m6203a().m6206a(at.a.f4224b));
            } catch (Exception e7) {
            }
            try {
                jSONObject.put(Config.EVENT_PATH_MAPPING, at.m6203a().m6206a(at.a.f4223a));
            } catch (Exception e8) {
            }
            try {
                jSONObject.put(Config.FEED_LIST_MAPPING, at.m6203a().m6206a(at.a.f4225c));
            } catch (Exception e9) {
            }
            m6242c(context, jSONObject);
            m6237b(jSONObject);
            String string = jSONObject.toString();
            if (bg.m6342c().mo6306b()) {
                bg.m6342c().m6300a("saveCurrentCacheToSend content: " + string);
            }
            m6240c(context, string);
            m6262c(context, !z);
            this.f4237l = true;
        }
    }

    public void m6262c(Context context, boolean z) {
        this.f4232g = new JSONObject();
        m6258b(context);
        this.f4234i = new JSONArray();
        this.f4233h = new JSONArray();
        this.f4235j = new JSONArray();
        this.f4236k = new JSONArray();
        if (!z) {
            at.m6203a().m6207b();
        }
        m6261c(context);
    }

    public void m6258b(Context context) {
        CooperService.instance().getHeadObject().installHeader(context, this.f4232g);
    }

    public void m6261c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Config.HEADER_PART, new JSONObject(this.f4232g.toString()));
            jSONObject.put(Config.PRINCIPAL_PART, new JSONArray(this.f4234i.toString()));
            jSONObject.put(Config.EVENT_PART, new JSONArray(this.f4233h.toString()));
            jSONObject.put(Config.FEED_LIST_PART, new JSONArray(this.f4235j.toString()));
            jSONObject.put("sv", new JSONArray(this.f4236k.toString()));
            jSONObject.put(Config.EVENT_PAGE_MAPPING, at.m6203a().m6206a(at.a.f4224b));
            jSONObject.put(Config.EVENT_PATH_MAPPING, at.m6203a().m6206a(at.a.f4223a));
            jSONObject.put(Config.FEED_LIST_MAPPING, at.m6203a().m6206a(at.a.f4225c));
        } catch (Exception e) {
        }
        String string = jSONObject.toString();
        int length = string.getBytes().length;
        if (length < 184320) {
            this.f4230e = length;
            bn.m6456a(context, bw.m6583u(context) + Config.STAT_FULL_CACHE_FILE_NAME, string, false);
        }
    }

    private void m6234b(Context context, JSONObject jSONObject) {
        CooperService.instance().getHeadObject().installHeader(context, jSONObject);
        try {
            jSONObject.put("t", System.currentTimeMillis());
            jSONObject.put(Config.SEQUENCE_INDEX, this.f4231f);
            jSONObject.put("ss", BDStatCore.instance().getSessionStartTime());
            jSONObject.put("at", "1");
            jSONObject.put("sign", CooperService.instance().getUUID());
        } catch (Exception e) {
        }
    }

    private void m6244d(Context context) {
        this.f4234i = m6231b(this.f4234i, BDStatCore.instance().getPageSessionHead());
        m6260b(context, false);
        m6243d();
    }

    private void m6243d() {
        this.f4231f++;
    }

    private void m6247e() {
        this.f4231f = 0;
    }

    private void m6242c(Context context, JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(Config.TRACE_FAILED_CNT, 0);
            } catch (Exception e) {
            }
            try {
                jSONObject.put(Config.TRACE_PART, jSONObject2);
            } catch (Exception e2) {
            }
        }
    }

    private void m6237b(JSONObject jSONObject) {
    }

    private void m6240c(Context context, String str) {
        LogSender.instance().saveLogData(context, str, true);
        if (this.f4227a != null) {
            try {
                this.f4227a.m6264a(new JSONObject(str));
            } catch (Exception e) {
            }
        }
    }

    public void m6249a(final Context context, final an c1423an) {
        this.f4229d.post(new Runnable() {
            @Override
            public void run() {
                if (BDStatCore.instance().getSessionStartTime() > 0) {
                    av.this.m6232b(context, c1423an);
                }
            }
        });
    }

    public void m6253a(final Context context, final ArrayList<ao> arrayList) {
        this.f4229d.post(new Runnable() {
            @Override
            public void run() {
                av.this.m6241c(context, (ArrayList<ao>) arrayList);
            }
        });
    }

    public void m6259b(final Context context, final ArrayList<ap> arrayList) {
        this.f4229d.post(new Runnable() {
            @Override
            public void run() {
                av.this.m6245d(context, (ArrayList<ap>) arrayList);
            }
        });
    }

    public void m6232b(Context context, an c1423an) {
        if (context != null && c1423an != null) {
            this.f4234i = m6231b(this.f4234i, BDStatCore.instance().getPageSessionHead());
            if (this.f4234i.length() != 0) {
                long jM6216a = m6216a(this.f4234i);
                if (jM6216a > 0) {
                    m6246d(context, c1423an.m6078a(jM6216a, at.m6203a().m6205a(c1423an.m6077a(), at.a.f4224b), at.m6203a().m6205a(c1423an.m6079b(), at.a.f4225c)));
                    m6261c(context);
                }
            }
        }
    }

    private void m6246d(Context context, JSONObject jSONObject) {
        if (jSONObject != null) {
            if (bg.m6342c().mo6306b()) {
                bg.m6342c().m6300a("putPage: " + jSONObject.toString());
            }
            String string = jSONObject.toString();
            if (m6239b(context, string)) {
                if (bg.m6342c().mo6306b()) {
                    bg.m6342c().m6300a("checkExceedLogLimit exceed:true; mCacheLogSize: " + this.f4230e + "; addedSize:" + string.length());
                }
                m6244d(context);
            }
            m6228a(this.f4234i, jSONObject);
        }
    }

    private void m6228a(JSONArray jSONArray, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArrayOptJSONArray = null;
        try {
            jSONObject2 = jSONArray.getJSONObject(0);
        } catch (Exception e) {
            jSONObject2 = null;
        }
        if (jSONObject2 != null) {
            try {
                jSONArrayOptJSONArray = jSONObject2.optJSONArray("p");
            } catch (Exception e2) {
            }
        }
        if (jSONArrayOptJSONArray == null) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObject);
            if (jSONObject2 != null) {
                try {
                    jSONObject2.put("p", jSONArray2);
                    return;
                } catch (Exception e3) {
                    return;
                }
            }
            return;
        }
        jSONArrayOptJSONArray.put(jSONObject);
    }

    public JSONArray m6231b(JSONArray jSONArray, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONArray jSONArray2;
        JSONObject jSONObject4;
        JSONObject jSONObject5 = null;
        if (jSONObject != null && jSONArray != null && jSONObject.optLong("s") > 0) {
            JSONArray jSONArray3 = new JSONArray();
            if (jSONArray.length() == 0) {
                try {
                    jSONObject2 = new JSONObject(jSONObject.toString());
                    try {
                        jSONObject2.put("p", new JSONArray());
                    } catch (Exception e) {
                        jSONObject5 = jSONObject2;
                        jSONObject2 = jSONObject5;
                    }
                } catch (Exception e2) {
                }
                if (jSONObject2 != null) {
                    jSONArray3.put(jSONObject2);
                }
            } else {
                try {
                    jSONObject3 = jSONArray.getJSONObject(0);
                } catch (Exception e3) {
                    jSONObject3 = null;
                }
                if (jSONObject3 != null) {
                    try {
                        jSONArray2 = jSONObject3.getJSONArray("p");
                    } catch (Exception e4) {
                        jSONArray2 = null;
                    }
                } else {
                    jSONArray2 = null;
                }
                try {
                    jSONObject4 = new JSONObject(jSONObject.toString());
                    if (jSONArray2 != null) {
                        try {
                            jSONObject4.put("p", jSONArray2);
                        } catch (Exception e5) {
                            jSONObject5 = jSONObject4;
                            jSONObject4 = jSONObject5;
                        }
                    }
                } catch (Exception e6) {
                }
                if (jSONObject4 != null) {
                    jSONArray3.put(jSONObject4);
                }
            }
            return jSONArray3;
        }
        return jSONArray;
    }

    private long m6216a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return 0L;
        }
        try {
            return jSONArray.getJSONObject(0).optLong("s");
        } catch (Exception e) {
            return 0L;
        }
    }

    public void m6241c(Context context, ArrayList<ao> arrayList) {
        if (context != null && arrayList != null && arrayList.size() != 0) {
            JSONArray jSONArray = new JSONArray();
            for (ao c1424ao : arrayList) {
                JSONObject jSONObjectM6081a = c1424ao.m6081a(at.m6203a().m6205a(c1424ao.m6080a(), at.a.f4225c));
                if (jSONObjectM6081a != null) {
                    jSONArray.put(jSONObjectM6081a);
                }
            }
            m6222a(context, jSONArray);
            m6261c(context);
        }
    }

    private void m6222a(Context context, JSONArray jSONArray) {
        if (context != null && this.f4235j != null && jSONArray != null && jSONArray.length() != 0) {
            if (bg.m6342c().mo6306b()) {
                bg.m6342c().m6300a("putFeedList: " + jSONArray.toString());
            }
            String string = jSONArray.toString();
            if (m6239b(context, string)) {
                if (bg.m6342c().mo6306b()) {
                    bg.m6342c().m6300a("checkExceedLogLimit exceed:true; mCacheLogSize: " + this.f4230e + "; addedSize:" + string.length());
                }
                m6244d(context);
            }
            m6227a(this.f4235j, jSONArray);
        }
    }

    private void m6227a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray != null && jSONArray2 != null) {
            for (int i = 0; i < jSONArray2.length(); i++) {
                try {
                    jSONArray.put(jSONArray2.getJSONObject(i));
                } catch (Exception e) {
                    return;
                }
            }
        }
    }

    public void m6245d(Context context, ArrayList<ap> arrayList) {
        if (context != null && arrayList != null && arrayList.size() != 0) {
            JSONArray jSONArray = new JSONArray();
            for (ap c1425ap : arrayList) {
                JSONObject jSONObjectM6090a = c1425ap.m6090a(at.m6203a().m6205a(c1425ap.m6094b(), at.a.f4224b), at.m6203a().m6205a(c1425ap.m6100f(), at.a.f4225c), bi.m6387c(c1425ap.m6097c()));
                if (jSONObjectM6090a != null) {
                    jSONArray.put(jSONObjectM6090a);
                }
            }
            m6233b(context, jSONArray);
            m6261c(context);
        }
    }

    private void m6233b(Context context, JSONArray jSONArray) {
        if (context != null && this.f4236k != null && jSONArray != null && jSONArray.length() != 0) {
            if (bg.m6342c().mo6306b()) {
                bg.m6342c().m6300a("putFeedListItem: " + jSONArray.toString());
            }
            String string = jSONArray.toString();
            if (m6239b(context, string)) {
                if (bg.m6342c().mo6306b()) {
                    bg.m6342c().m6300a("checkExceedLogLimit exceed:true; mCacheLogSize: " + this.f4230e + "; addedSize:" + string.length());
                }
                m6244d(context);
            }
            m6236b(this.f4236k, jSONArray);
        }
    }

    private void m6236b(JSONArray jSONArray, JSONArray jSONArray2) {
        JSONObject jSONObject;
        if (jSONArray != null && jSONArray2 != null) {
            for (int i = 0; i < jSONArray2.length(); i++) {
                try {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                    if (jSONObject2 != null && jSONObject2.length() != 0) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= jSONArray.length()) {
                                jSONObject = null;
                                break;
                            }
                            jSONObject = jSONArray.getJSONObject(i2);
                            if (jSONObject != null && jSONObject.length() != 0 && m6230a(jSONObject, jSONObject2)) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (jSONObject == null) {
                            jSONArray.put(jSONObject2);
                        } else {
                            m6238b(jSONObject, jSONObject2);
                        }
                    }
                } catch (Exception e) {
                    return;
                }
            }
        }
    }

    private boolean m6230a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        String strOptString = jSONObject.optString("id");
        jSONObject.optString("d");
        String strOptString2 = jSONObject.optString("p");
        String strOptString3 = jSONObject.optString(Config.FEED_LIST_ITEM_PATH);
        String strOptString4 = jSONObject.optString(Config.FEED_LIST_ITEM_TITLE);
        String strOptString5 = jSONObject.optString(Config.FEED_LIST_ITEM_INDEX);
        String strOptString6 = jSONObject.optString("n");
        int iOptInt = jSONObject.optInt("user");
        jSONObject.optInt("c");
        jSONObject.optLong("t");
        jSONObject.optString("ps");
        String strOptString7 = jSONObject2.optString("id");
        jSONObject2.optString("d");
        String strOptString8 = jSONObject2.optString("p");
        String strOptString9 = jSONObject2.optString(Config.FEED_LIST_ITEM_PATH);
        String strOptString10 = jSONObject2.optString(Config.FEED_LIST_ITEM_TITLE);
        String strOptString11 = jSONObject2.optString(Config.FEED_LIST_ITEM_INDEX);
        String strOptString12 = jSONObject2.optString("n");
        int iOptInt2 = jSONObject2.optInt("user");
        jSONObject2.optInt("c");
        jSONObject2.optLong("t");
        jSONObject2.optString("ps");
        if (!m6229a(strOptString, strOptString7) || !m6229a(strOptString2, strOptString8) || !m6229a(strOptString3, strOptString9) || !m6229a(strOptString4, strOptString10) || !m6229a(strOptString5, strOptString11) || !m6229a(strOptString6, strOptString12) || iOptInt != iOptInt2) {
            return false;
        }
        return true;
    }

    private void m6238b(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String str2;
        String strOptString = jSONObject.optString("d");
        int iOptInt = jSONObject.optInt("c");
        long jOptLong = jSONObject.optLong("t");
        String strOptString2 = jSONObject.optString("ps");
        String strOptString3 = jSONObject2.optString("d");
        int iOptInt2 = jSONObject2.optInt("c");
        long jOptLong2 = jSONObject2.optLong("t");
        String strOptString4 = jSONObject2.optString("ps");
        int i = iOptInt + iOptInt2;
        long j = jOptLong <= jOptLong2 ? jOptLong : jOptLong2;
        if (jOptLong <= jOptLong2) {
            str = strOptString + "|" + strOptString3;
        } else {
            str = strOptString3 + "|" + strOptString;
        }
        if (jOptLong <= jOptLong2) {
            long j2 = jOptLong2 - jOptLong;
            StringBuilder sb = new StringBuilder();
            String[] strArrSplit = strOptString4.split("\\|");
            if (strArrSplit == null || strArrSplit.length == 0) {
                long jLongValue = 0;
                try {
                    jLongValue = Long.valueOf(strOptString4).longValue();
                } catch (Exception e) {
                }
                sb.append(jLongValue + j2);
            } else {
                for (String str3 : strArrSplit) {
                    if (!TextUtils.isEmpty(sb.toString())) {
                        sb.append("|");
                    }
                    long jLongValue2 = 0;
                    try {
                        jLongValue2 = Long.valueOf(str3).longValue();
                    } catch (Exception e2) {
                    }
                    sb.append(jLongValue2 + j2);
                }
            }
            str2 = strOptString2 + "|" + sb.toString();
        } else {
            long j3 = jOptLong - jOptLong2;
            StringBuilder sb2 = new StringBuilder();
            String[] strArrSplit2 = strOptString2.split("\\|");
            if (strArrSplit2 == null || strArrSplit2.length == 0) {
                long jLongValue3 = 0;
                try {
                    jLongValue3 = Long.valueOf(strOptString2).longValue();
                } catch (Exception e3) {
                }
                sb2.append(jLongValue3 + j3);
            } else {
                for (String str4 : strArrSplit2) {
                    if (!TextUtils.isEmpty(sb2.toString())) {
                        sb2.append("|");
                    }
                    long jLongValue4 = 0;
                    try {
                        jLongValue4 = Long.valueOf(str4).longValue();
                    } catch (Exception e4) {
                    }
                    sb2.append(jLongValue4 + j3);
                }
            }
            str2 = strOptString4 + "|" + sb2.toString();
        }
        try {
            jSONObject.put("c", i);
            jSONObject.put("t", j);
            jSONObject.put("d", str);
            jSONObject.put("ps", str2);
        } catch (Exception e5) {
        }
    }

    private boolean m6229a(String str, String str2) {
        if (str == str2) {
            return true;
        }
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.equals(str2)) ? false : true;
    }

    public void m6255a(String str) {
    }

    public void m6250a(Context context, String str) {
        if (this.f4233h != null && this.f4233h.length() != 0 && !TextUtils.isEmpty(str)) {
            try {
                if (str.length() > 1024) {
                    str = str.substring(0, 1024);
                }
                JSONObject jSONObject = (JSONObject) this.f4233h.get(this.f4233h.length() - 1);
                if (jSONObject != null) {
                    String strOptString = jSONObject.optString(Config.EVENT_NEXT_PAGENAME);
                    long jOptLong = jSONObject.optLong("t");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - jOptLong <= 1500 && TextUtils.isEmpty(strOptString)) {
                        jSONObject.put(Config.EVENT_NEXT_PAGENAME, str + "|" + jCurrentTimeMillis);
                        this.f4233h.put(this.f4233h.length() - 1, jSONObject);
                        m6261c(context);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
