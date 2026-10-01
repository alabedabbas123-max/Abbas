package com.baidu.mobstat;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class ExceptionAnalysis {

    private static ExceptionAnalysis f3903a = new ExceptionAnalysis();

    private Context f3905c;

    private String f3907e;

    private List<String> f3908f;
    public Callback mCallback;

    private boolean f3904b = false;

    private HeadObject f3906d = new HeadObject();

    private boolean f3909g = true;

    public interface Callback {
        void onCallback(JSONObject jSONObject);
    }

    public static ExceptionAnalysis getInstance() {
        return f3903a;
    }

    private ExceptionAnalysis() {
    }

    public ExceptionAnalysis(Callback callback) {
        this.mCallback = callback;
    }

    public void openExceptionAnalysis(Context context, boolean z) {
        if (context != null) {
            this.f3905c = context.getApplicationContext();
        }
        if (this.f3905c != null && !this.f3904b) {
            this.f3904b = true;
            ab.m5950a().m5951a(this.f3905c);
            if (!z) {
                NativeCrashHandler.init(this.f3905c);
            }
        }
    }

    public void saveCrashInfo(Context context, Throwable th, boolean z) {
        int i;
        if (context != null) {
            this.f3905c = context.getApplicationContext();
        }
        if (this.f3905c != null) {
            String string = th.toString();
            String str = "";
            if (!TextUtils.isEmpty(string)) {
                try {
                    String[] strArrSplit = string.split(Config.TRACE_TODAY_VISIT_SPLIT);
                    str = strArrSplit.length > 1 ? strArrSplit[0] : string;
                } catch (Exception e) {
                    str = "";
                }
            }
            String str2 = TextUtils.isEmpty(str) ? string : str;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String string2 = stringWriter.toString();
            if (z) {
                i = 0;
            } else if (th instanceof Exception) {
                i = 11;
            } else if (th instanceof Error) {
                i = 12;
            } else {
                i = 13;
            }
            saveCrashInfo(this.f3905c, System.currentTimeMillis(), string2, str2, 0, i);
        }
    }

    public void saveCrashInfo(Context context, long j, String str, String str2, int i, int i2) {
        BDStatCore.instance().autoTrackSessionEndTime(context);
        if (context != null && str != null && !str.trim().equals("")) {
            try {
                StringBuilder sb = new StringBuilder(str);
                if (!TextUtils.isEmpty(this.f3907e)) {
                    sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                    sb.append("ExtraInfo:");
                    sb.append(this.f3907e);
                }
                String appVersionName = CooperService.instance().getAppVersionName(context);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("t", j);
                jSONObject.put("c", sb.toString());
                jSONObject.put("y", str2);
                jSONObject.put("v", appVersionName);
                jSONObject.put(Config.EXCEPTION_CRASH_TYPE, i);
                jSONObject.put("mem", m5886a(context));
                jSONObject.put(Config.EXCEPTION_CRASH_CHANNEL, i2);
                jSONObject.put("sv", "4.0.3.1");
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                this.f3906d.installHeader(context, jSONObject2);
                jSONObject2.put("ss", 0);
                jSONObject2.put(Config.SEQUENCE_INDEX, 0);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(Config.HEADER_PART, jSONObject2);
                jSONObject3.put(Config.PRINCIPAL_PART, new JSONArray());
                jSONObject3.put(Config.EVENT_PART, new JSONArray());
                jSONObject3.put(Config.EXCEPTION_PART, jSONArray);
                jSONObject3.put(Config.TRACE_PART, m5885a());
                if (this.mCallback != null) {
                    this.mCallback.onCallback(jSONObject3);
                }
                bn.m6456a(context, Config.PREFIX_SEND_DATA + System.currentTimeMillis(), jSONObject3.toString(), false);
                bb.m6313c().m6300a("dump exception, exception: " + str);
            } catch (Exception e) {
            }
        }
    }

    private JSONObject m5885a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Config.TRACE_APPLICATION_SESSION, 0);
        } catch (Exception e) {
        }
        try {
            jSONObject.put(Config.TRACE_FAILED_CNT, 0);
        } catch (Exception e2) {
        }
        return jSONObject;
    }

    @SuppressLint({"NewApi"})
    private JSONObject m5886a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        JSONObject jSONObject = new JSONObject();
        try {
            if (android.os.Build.VERSION.SDK_INT >= 16) {
                jSONObject.put(Config.EXCEPTION_MEMORY_TOTAL, memoryInfo.totalMem);
            }
            jSONObject.put(Config.EXCEPTION_MEMORY_FREE, memoryInfo.availMem);
            jSONObject.put(Config.EXCEPTION_MEMORY_LOW, memoryInfo.lowMemory ? 1 : 0);
            return jSONObject;
        } catch (Exception e) {
            return jSONObject;
        }
    }

    public void setCrashExtraInfo(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.length() > 256) {
                str = str.substring(0, 256);
            }
            this.f3907e = str;
        }
    }

    public void setFilterPackageList(List<String> list) {
        if (list != null && list.size() > 0) {
            this.f3908f = list;
        }
    }

    public void setEnableSend(boolean z) {
        this.f3909g = z;
    }
}
