package com.baidu.mobstat;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class SessionAnalysis {

    private boolean f4008a = false;

    private Map<String, C1408a> f4009b = new HashMap();

    private C1408a f4010c = new C1408a();

    private C1408a f4011d = new C1408a();

    private boolean f4012e = false;

    private long f4013f = 0;

    private Session f4014g = new Session();

    private int f4015h = 0;

    private int f4016i = 0;

    private long f4017j = 0;

    private boolean f4018k = true;

    private LaunchInfo f4019l;

    private LaunchInfo f4020m;
    public Callback mCallback;

    public interface Callback {
        void onCallback(JSONObject jSONObject);
    }

    public SessionAnalysis() {
    }

    public SessionAnalysis(Callback callback) {
        this.mCallback = callback;
    }

    public void setSessionTimeOut(int i) {
        if (i < 1) {
            i = 30;
            bb.m6313c().m6303b("[WARNING] SessionTimeout should be between 1 and 600. Default value[30] is used");
        } else if (i > 600) {
            bb.m6313c().m6303b("[WARNING] SessionTimeout should be between 1 and 600. Default value[600] is used");
            i = 600;
        }
        this.f4015h = i * 1000;
    }

    public int getSessionTimeOut() {
        if (this.f4015h <= 0) {
            this.f4015h = Config.SESSION_PERIOD;
        }
        return this.f4015h;
    }

    public long getSessionStartTime() {
        return this.f4014g.getStartTime();
    }

    public JSONObject getPageSessionHead() {
        return this.f4014g.getPageSessionHead();
    }

    public int getSessionSize() {
        return this.f4016i;
    }

    public void doSendLogCheck(Context context, long j) {
        long j2 = this.f4013f;
        if (j2 > 0 && j - j2 > getSessionTimeOut()) {
            m5929a(context, -1L, false, false, 0);
        }
    }

    public void doSendNewSessionLog(Context context) {
    }

    public void setAutoSend(boolean z) {
        this.f4018k = z;
    }

    public void autoTrackLaunchInfo(LaunchInfo launchInfo, boolean z) {
        if (z) {
            this.f4019l = launchInfo;
        } else {
            this.f4020m = launchInfo;
        }
    }

    public void autoTrackSessionStartTime(Context context, long j) {
        if (context != null) {
            this.f4014g.setTrackStartTime(j);
            this.f4017j = j;
        }
    }

    public void autoTrackSessionEndTime(Context context, long j) {
        if (context != null) {
            this.f4014g.setTrackEndTime(j);
            m5927a(context);
        }
    }

    public void onSessionStart(Context context, long j, boolean z) {
        if (!this.f4008a) {
            DataCore.instance().init(context);
            try {
                Thread.sleep(3000L);
            } catch (Exception e) {
            }
            int launchType = 0;
            if (this.f4019l != null) {
                launchType = this.f4019l.getLaunchType(context);
            }
            m5929a(context, j, z, true, launchType);
            this.f4008a = true;
        }
    }

    public void onPageStart(Context context, String str, int i, long j) {
        C1408a c1408aM5926a;
        onSessionStart(context, j, false);
        if (!TextUtils.isEmpty(str) && (c1408aM5926a = m5926a(str)) != null) {
            if (c1408aM5926a.f4023c) {
                bb.m6313c().m6307c("[WARNING] 遗漏StatService.onPageEnd(), 请检查邻近页面埋点: " + str);
            }
            if (!this.f4012e) {
                m5928a(context, this.f4013f, j, i, 3);
                this.f4012e = true;
            }
            c1408aM5926a.f4023c = true;
            c1408aM5926a.f4022b = j;
        }
    }

    public void onPageEnd(Context context, String str, String str2, String str3, long j, ExtraInfo extraInfo, boolean z) {
        C1408a c1408aM5926a;
        this.f4012e = false;
        if (!TextUtils.isEmpty(str) && (c1408aM5926a = m5926a(str)) != null) {
            if (!c1408aM5926a.f4023c) {
                bb.m6313c().m6307c("[WARNING] 遗漏StatService.onPageStart(), 请检查邻近页面埋点: " + str);
                return;
            }
            m5930a(context, c1408aM5926a.f4021a, str, c1408aM5926a.f4022b, j, str2, "", str3, false, extraInfo, z);
            m5931b(str);
            this.f4013f = j;
        }
    }

    public void onPageStartAct(Context context, String str, long j, boolean z) {
        onSessionStart(context, j, false);
        if (!TextUtils.isEmpty(str)) {
            C1408a c1408a = z ? this.f4011d : this.f4010c;
            if (c1408a.f4023c && !z) {
                bb.m6313c().m6307c("[WARNING] 遗漏StatService.onPause(Activity), 请检查邻近页面埋点: " + str);
            }
            if (!this.f4012e) {
                m5928a(context, this.f4013f, j, 1, 1);
                this.f4012e = true;
            }
            c1408a.f4023c = true;
            c1408a.f4021a = str;
            c1408a.f4022b = j;
        }
    }

    public void onPageEndAct(Context context, String str, String str2, String str3, long j, boolean z, ExtraInfo extraInfo) {
        this.f4012e = false;
        C1408a c1408a = z ? this.f4011d : this.f4010c;
        if (!c1408a.f4023c) {
            if (!z) {
                bb.m6313c().m6307c("[WARNING] 遗漏StatService.onResume(Activity), 请检查邻近页面埋点: " + str);
            }
        } else {
            m5930a(context, c1408a.f4021a, str, c1408a.f4022b, j, str2, str3, str, z, extraInfo, false);
            c1408a.f4023c = false;
            this.f4013f = j;
        }
    }

    public void onPageStartFrag(Context context, String str, long j) {
        onSessionStart(context, j, false);
        if (!TextUtils.isEmpty(str)) {
            C1408a c1408aM5926a = m5926a(str);
            if (c1408aM5926a.f4023c) {
                bb.m6313c().m6307c("[WARNING] 遗漏StatService.onPause(Fragment), 请检查邻近页面埋点: " + str);
            }
            m5928a(context, this.f4013f, j, 2, 2);
            c1408aM5926a.f4023c = true;
            c1408aM5926a.f4021a = str;
            c1408aM5926a.f4022b = j;
        }
    }

    public void onPageEndFrag(Context context, String str, String str2, String str3, long j) {
        C1408a c1408aM5926a;
        if (!TextUtils.isEmpty(str) && (c1408aM5926a = m5926a(str)) != null) {
            if (!c1408aM5926a.f4023c) {
                bb.m6313c().m6307c("[WARNING] 遗漏StatService.onResume(Fragment), 请检查邻近页面埋点: " + str);
                return;
            }
            m5930a(context, c1408aM5926a.f4021a, str, c1408aM5926a.f4022b, j, str2, str3, null, false, null, false);
            m5931b(str);
            this.f4013f = j;
        }
    }

    private void m5928a(Context context, long j, long j2, int i, int i2) {
        if (j2 - j > ((long) getSessionTimeOut())) {
            if (j > 0) {
                if (2 == i2) {
                    this.f4014g.setEndTime(j);
                }
                m5929a(context, j2, false, false, this.f4020m != null ? this.f4020m.getLaunchType(context) : 0);
            }
            this.f4014g.setTrackStartTime(this.f4017j);
            this.f4014g.setInvokeType(i);
        }
    }

    private void m5930a(Context context, String str, String str2, long j, long j2, String str3, String str4, String str5, boolean z, ExtraInfo extraInfo, boolean z2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && str.equals(str2)) {
            this.f4014g.addPageView(new Session.C1407a(str3, str4, str5, j2 - j, j, z, extraInfo, z2));
            this.f4014g.setEndTime(j2);
            m5927a(context);
        }
    }

    private C1408a m5926a(String str) {
        if (!this.f4009b.containsKey(str)) {
            this.f4009b.put(str, new C1408a(str));
        }
        return this.f4009b.get(str);
    }

    private void m5929a(Context context, long j, boolean z, boolean z2, int i) {
        if (this.f4014g.hasEnd()) {
            DataCore.instance().putSession(this.f4014g);
            DataCore.instance().flush(context);
            au.m6214a(this.f4014g.getPageSessionHead());
            this.f4014g.setEndTime(0L);
        }
        boolean z3 = j > 0;
        long startTime = z3 ? j : this.f4014g.getStartTime();
        String pushContent = "";
        String launcherHomePkgName = "";
        if (i != 0) {
            if (z2) {
                if (this.f4019l != null) {
                    pushContent = this.f4019l.getPushContent();
                    launcherHomePkgName = this.f4019l.getRefererPkgName();
                }
            } else if (this.f4020m != null) {
                pushContent = this.f4020m.getPushContent();
                launcherHomePkgName = this.f4020m.getRefererPkgName();
            }
        } else {
            launcherHomePkgName = LaunchInfo.getLauncherHomePkgName(context);
        }
        JSONObject convertedJson = LaunchInfo.getConvertedJson(i, launcherHomePkgName, pushContent);
        if (z3) {
            this.f4014g.reset();
            this.f4014g.setStartTime(j);
            if (convertedJson != null) {
                this.f4014g.setLaunchInfo(convertedJson);
            }
        }
        DataCore.instance().saveLogData(context, z3, z, startTime, z2, convertedJson);
        if (this.mCallback != null) {
            this.mCallback.onCallback(DataCore.instance().getLogData());
        }
        if (z3 || this.f4018k) {
            LogSender.instance().onSend(context);
        }
        clearLastSessionCache(context);
    }

    private void m5927a(Context context) {
        if (this.f4014g.hasStart()) {
            String string = this.f4014g.constructJSONObject().toString();
            this.f4016i = string.getBytes().length;
            bn.m6456a(context, bw.m6583u(context) + Config.LAST_SESSION_FILE_NAME, string, false);
        }
    }

    public void clearLastSessionCache(Context context) {
        if (context != null) {
            bn.m6456a(context, bw.m6583u(context) + Config.LAST_SESSION_FILE_NAME, new JSONObject().toString(), false);
        }
    }

    private void m5931b(String str) {
        if (!TextUtils.isEmpty(str) && this.f4009b.containsKey(str)) {
            this.f4009b.remove(str);
        }
    }

    public boolean isSessionStart() {
        return this.f4014g.getStartTime() > 0;
    }

    static class C1408a {

        String f4021a;

        long f4022b;

        boolean f4023c = false;

        public C1408a() {
        }

        public C1408a(String str) {
            this.f4021a = str;
        }
    }
}
