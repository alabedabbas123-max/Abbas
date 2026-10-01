package com.baidu.mobstat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebView;
import java.net.URI;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class al {

    private static final al f4064B = new al();

    private Context f4071a;

    private aj f4072b;

    private ai f4073c;

    private Activity f4074d;

    private Handler f4076f;

    private HandlerThread f4077g;

    private Handler f4078h;

    private volatile boolean f4080j;

    private volatile boolean f4081k;

    private volatile boolean f4082l;

    private volatile boolean f4083m;

    private volatile boolean f4084n;

    private volatile boolean f4085o;

    private volatile String f4086p;

    private volatile String f4087q;

    private volatile String f4088r;

    private long f4089s;

    private long f4090t;

    private long f4091u;

    private String f4092v;

    private boolean f4093w;

    private String f4094x;

    private JSONObject f4095y = new JSONObject();

    private JSONObject f4096z = new JSONObject();

    private be f4065A = be.m6319a();

    private Handler f4066C = new Handler(Looper.getMainLooper()) {
        @Override
        public void handleMessage(Message message) {
            switch (message.what) {
                case 32:
                    al.this.m6058b();
                    break;
                case 33:
                    al.this.m6060c();
                    break;
                case 34:
                    al.this.m6032h();
                    break;
            }
        }
    };

    private aj.a f4067D = new aj.a() {
        @Override
        public void mo6007a() {
            if (bc.m6315c().mo6306b()) {
                bc.m6315c().m6300a("onGesture");
            }
            al.this.m6034i();
        }
    };

    private boolean f4068E = true;

    private JSONArray f4069F = new JSONArray();

    private Object f4070G = new Object();

    private am f4075e = new am();

    private HandlerThread f4079i = new HandlerThread("crawlerThread");

    public static al m6009a() {
        return f4064B;
    }

    private al() {
        this.f4079i.start();
        this.f4078h = new c(this.f4079i.getLooper());
        this.f4077g = new HandlerThread("downloadThread");
        this.f4077g.start();
        this.f4076f = new a(this.f4077g.getLooper());
    }

    class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    al.this.m6042o();
                    break;
                case 2:
                    al.this.m6046s();
                    break;
            }
        }
    }

    class b implements ai.a {
        private b() {
        }

        @Override
        public void mo5987a() {
            al.this.m6036j();
        }

        @Override
        public void mo5990b() {
            al.this.m6038k();
        }

        @Override
        public void mo5989a(boolean z) {
            al.this.m6020b(z);
        }

        @Override
        public void mo5988a(String str) {
            Message messageObtainMessage = al.this.f4076f.obtainMessage(24);
            Bundle bundle = new Bundle();
            bundle.putString("autoconfig.key", str);
            messageObtainMessage.setData(bundle);
            al.this.f4076f.sendMessage(messageObtainMessage);
        }
    }

    class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override
        public void handleMessage(Message message) {
            switch (message.what) {
                case 21:
                    al.this.m6039l();
                    break;
                case 22:
                    al.this.m6040m();
                    break;
                case 23:
                    al.this.m6041n();
                    break;
                case 24:
                    Bundle data = message.getData();
                    if (data != null) {
                        al.this.m6019b(data.getString("autoconfig.key"));
                    }
                    break;
            }
        }
    }

    public void m6055a(String str) {
        this.f4092v = str;
    }

    public void m6056a(boolean z) {
        this.f4093w = z;
    }

    public boolean m6057a(Activity activity, Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        String scheme = data.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            return false;
        }
        try {
            String queryParameter = data.getQueryParameter("token");
            String queryParameter2 = data.getQueryParameter("time");
            if (!scheme.startsWith("mtj") || scheme.length() <= "mtj".length()) {
                return false;
            }
            String strSubstring = scheme.substring("mtj".length());
            if (TextUtils.isEmpty(strSubstring) || !strSubstring.equals(this.f4092v.toLowerCase()) || TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            this.f4094x = queryParameter;
            String strM6507s = bp.m6466a().m6507s(activity);
            if (TextUtils.isEmpty(queryParameter2) || queryParameter2.equals(strM6507s)) {
                return false;
            }
            bp.m6466a().m6495k(activity, queryParameter2);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void m6052a(Activity activity) {
    }

    private void m6024d(Activity activity) {
        Intent intent;
        if (activity != null && (intent = activity.getIntent()) != null) {
            boolean booleanExtra = intent.getBooleanExtra(MtjConfig.BAIDU_MTJ_PUSH_CALL, false);
            String stringExtra = intent.getStringExtra(MtjConfig.BAIDU_MTJ_PUSH_MSG);
            if (this.f4068E) {
                LaunchInfo launchInfo = new LaunchInfo();
                if (booleanExtra) {
                    launchInfo.setPushInfo(bi.m6396e(activity), stringExtra);
                }
                String strM6399g = bi.m6399g(activity);
                if (!TextUtils.isEmpty(strM6399g)) {
                    launchInfo.setRefererPkgName(strM6399g);
                }
                BDStatCore.instance().autoTrackLaunchInfo(this.f4071a, launchInfo, true);
            } else {
                LaunchInfo launchInfo2 = new LaunchInfo();
                if (booleanExtra) {
                    launchInfo2.setPushInfo(bi.m6396e(activity), stringExtra);
                }
                String strM6399g2 = bi.m6399g(activity);
                if (!TextUtils.isEmpty(strM6399g2)) {
                    launchInfo2.setRefererPkgName(strM6399g2);
                }
                BDStatCore.instance().autoTrackLaunchInfo(this.f4071a, launchInfo2, false);
            }
            this.f4068E = false;
        }
    }

    public void m6059b(Activity activity) {
        Intent intent;
        if (m6044q()) {
            this.f4071a = activity.getApplicationContext();
            if (activity != null && (intent = activity.getIntent()) != null && m6057a(activity, intent)) {
                m6009a().m6034i();
            }
            if (this.f4074d != null) {
                m6060c();
            }
            this.f4074d = activity;
            m6024d(activity);
            m6049v();
            m6047t();
            m6048u();
            m6016b(activity, true);
            m6026e(activity);
            m6031g();
            m6053a(activity, true);
        }
    }

    public void m6053a(Activity activity, boolean z) {
        if (!(activity instanceof IIgnoreAutoEvent)) {
            if (z) {
                this.f4065A.m6328a(activity, true, this.f4096z, this.f4093w);
            } else {
                this.f4065A.m6327a(activity, true);
            }
        }
    }

    public void m6061c(Activity activity) {
        if (m6044q()) {
            this.f4074d = null;
            m6016b(activity, false);
            m6028f();
            m6053a(activity, false);
        }
    }

    public void m6054a(WebView webView, String str, bk c1447bk) {
        if (TextUtils.isEmpty(this.f4086p)) {
            this.f4086p = bn.m6454a(this.f4071a, af.f4038a);
        }
        m6017b(webView, this.f4086p, c1447bk);
        if (TextUtils.isEmpty(this.f4087q)) {
            this.f4087q = bn.m6454a(this.f4071a, af.f4039b);
        }
        m6021c(webView, this.f4087q, c1447bk);
    }

    private void m6026e(Activity activity) {
        if (bc.m6315c().mo6306b()) {
            bc.m6315c().m6300a("installConnectionTracker");
        }
        this.f4072b = new aj(this.f4067D);
        this.f4072b.m6003a(activity);
    }

    private void m6028f() {
        if (bc.m6315c().mo6306b()) {
            bc.m6315c().m6300a("uninstallConnectionTracker");
        }
        if (this.f4072b != null) {
            this.f4072b.m6004b();
            this.f4072b = null;
        }
    }

    private void m6031g() {
        if (m6043p() && this.f4080j) {
            m6058b();
        } else {
            m6060c();
        }
    }

    public void m6058b() {
        if (this.f4074d != null) {
            ah.m5979b(this.f4074d);
        }
    }

    public void m6060c() {
        if (this.f4074d != null) {
            ah.m5973a(this.f4074d);
        }
    }

    public void m6032h() {
        this.f4088r = bn.m6454a(this.f4071a, af.f4040c);
        m6023c(this.f4088r);
        au.m6215b(this.f4088r);
        aq.m6111a(this.f4088r);
    }

    public void m6034i() {
        if (!m6043p()) {
            bb.m6313c().m6300a("autotrace: gesture success");
            m6050a(0);
            if (!bw.m6581s(this.f4071a)) {
                bb.m6313c().m6300a("autotrace: network invalid, failed to connect to circle server");
            } else {
                this.f4078h.sendMessage(this.f4078h.obtainMessage(1));
            }
        }
    }

    public void m6036j() {
        if (!this.f4081k) {
            this.f4076f.sendMessage(this.f4076f.obtainMessage(21));
        }
    }

    public void m6038k() {
        this.f4080j = true;
        if (m6043p() && this.f4080j) {
            this.f4066C.sendMessage(this.f4066C.obtainMessage(32));
            this.f4078h.sendMessage(this.f4078h.obtainMessage(2));
        }
    }

    public void m6020b(boolean z) {
        this.f4080j = false;
        am.m6066b();
        this.f4078h.removeMessages(2);
        this.f4066C.sendMessage(this.f4066C.obtainMessage(33));
    }

    public void m6039l() {
        if (!this.f4081k) {
            boolean zM6340a = bf.m6340a(this.f4071a, this.f4092v, 0, true);
            this.f4081k = true;
            if (zM6340a) {
                this.f4086p = bn.m6454a(this.f4071a, af.f4038a);
            }
        }
    }

    public void m6040m() {
        if (!this.f4082l) {
            boolean zM6340a = bf.m6340a(this.f4071a, this.f4092v, 1, true);
            this.f4082l = true;
            if (zM6340a) {
                this.f4087q = bn.m6454a(this.f4071a, af.f4039b);
            }
        }
    }

    public void m6041n() {
        if (!this.f4083m) {
            boolean zM6340a = bf.m6340a(this.f4071a, this.f4092v, 2, true);
            this.f4083m = true;
            if (zM6340a) {
                this.f4066C.sendMessage(this.f4066C.obtainMessage(34));
            }
        }
    }

    public void m6019b(String str) {
        if (this.f4071a != null && !TextUtils.isEmpty(str)) {
            bp.m6466a().m6477c(this.f4071a, System.currentTimeMillis());
            bn.m6456a(this.f4071a, af.f4040c, str, false);
            this.f4066C.sendMessage(this.f4066C.obtainMessage(34));
        }
    }

    public void m6042o() {
        bb.m6313c().m6300a("autotrace: start to connect");
        m6050a(1);
        if (m6043p()) {
            bb.m6313c().m6300a("autotrace: connect established, no need to duplicate connect");
            return;
        }
        String strM6010a = m6010a(this.f4071a);
        if (bc.m6315c().mo6306b()) {
            bc.m6315c().m6300a(TextUtils.isEmpty(strM6010a) ? "url:" : "url:" + strM6010a);
        }
        try {
            this.f4073c = new ai(URI.create(strM6010a), new b());
        } catch (Exception e) {
        }
    }

    private boolean m6043p() {
        return this.f4073c != null && this.f4073c.m5986b();
    }

    private String m6010a(Context context) {
        ArrayList<Pair> arrayList = new ArrayList();
        arrayList.add(new Pair("appKey", "" + this.f4092v));
        arrayList.add(new Pair("appVersion", bw.m6562g(context)));
        arrayList.add(new Pair("appName", bw.m6564h(context)));
        arrayList.add(new Pair("packageName", context.getPackageName()));
        arrayList.add(new Pair("sdkVersion", StatService.getSdkVersion()));
        arrayList.add(new Pair("deviceName", bw.m6574m(context)));
        arrayList.add(new Pair("platform", "Android"));
        arrayList.add(new Pair("model", android.os.Build.MODEL));
        CooperService.instance().getCUID(context, false);
        arrayList.add(new Pair("cuid", ""));
        arrayList.add(new Pair("auto", "1"));
        if (!TextUtils.isEmpty(this.f4094x)) {
            arrayList.add(new Pair("token", this.f4094x));
        }
        StringBuilder sb = new StringBuilder();
        for (Pair pair : arrayList) {
            try {
                String strEncode = URLEncoder.encode(((String) pair.first).toString(), "UTF-8");
                String strEncode2 = URLEncoder.encode(((String) pair.second).toString(), "UTF-8");
                if (TextUtils.isEmpty(sb.toString())) {
                    sb.append(strEncode + "=" + strEncode2);
                } else {
                    sb.append("&" + strEncode + "=" + strEncode2);
                }
            } catch (Exception e) {
            }
        }
        String str = "wss://mtjsocket.baidu.com/app?" + sb.toString();
        this.f4094x = null;
        return str;
    }

    private boolean m6044q() {
        return !TextUtils.isEmpty(this.f4092v);
    }

    private void m6017b(WebView webView, String str, bk c1447bk) {
        if (c1447bk != null) {
            c1447bk.m6435a(webView, str);
        }
    }

    private void m6021c(WebView webView, String str, bk c1447bk) {
        if (c1447bk != null) {
            c1447bk.m6434a(this.f4074d, webView, str, m6012a(this.f4095y, m6045r()), true);
        }
    }

    private String m6045r() {
        if (this.f4074d == null) {
            return null;
        }
        return this.f4074d.getClass().getName();
    }

    private void m6016b(Activity activity, boolean z) {
        if (!(activity instanceof IIgnoreAutoTrace)) {
            if (z) {
                BDStatCore.instance().onResume(activity, true);
            } else {
                BDStatCore.instance().onPause(activity, true, null);
            }
        }
    }

    public void m6062d() {
        if (m6043p()) {
            this.f4073c.m5984a();
        }
    }

    public void m6046s() {
        if (m6043p() && this.f4080j) {
            JSONObject jSONObjectM6011a = m6011a(this.f4075e.m6068a(this.f4074d));
            if (jSONObjectM6011a != null) {
                if (bc.m6315c().mo6306b()) {
                    bc.m6315c().m6300a("doSendSnapshot:" + jSONObjectM6011a.toString());
                }
                try {
                    this.f4073c.m5985a(jSONObjectM6011a);
                } catch (Exception e) {
                }
            }
            this.f4078h.sendMessageDelayed(this.f4078h.obtainMessage(2), 2000L);
        }
    }

    private JSONObject m6011a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            try {
                jSONObject2.put("type", "upload");
                jSONObject2.put("data", jSONObject);
            } catch (Exception e) {
            }
        }
        return jSONObject2;
    }

    private void m6047t() {
        if (bw.m6581s(this.f4071a) && !this.f4083m) {
            if (this.f4091u == 0) {
                this.f4091u = bp.m6466a().m6504p(this.f4071a);
            }
            if (System.currentTimeMillis() - this.f4091u > 86400000) {
                this.f4076f.sendMessage(this.f4076f.obtainMessage(23));
            }
        }
    }

    private void m6048u() {
        if (bw.m6581s(this.f4071a) && !this.f4082l) {
            if (!this.f4084n) {
                this.f4087q = bn.m6454a(this.f4071a, af.f4039b);
                this.f4084n = true;
            }
            if (this.f4089s == 0) {
                this.f4089s = bp.m6466a().m6500n(this.f4071a);
                this.f4090t = bp.m6466a().m6502o(this.f4071a);
            }
            if ((this.f4084n && TextUtils.isEmpty(this.f4087q)) || System.currentTimeMillis() - this.f4089s > this.f4090t) {
                this.f4076f.sendMessage(this.f4076f.obtainMessage(22));
            }
        }
    }

    private void m6049v() {
        if (!this.f4085o) {
            if (TextUtils.isEmpty(this.f4088r)) {
                m6032h();
            }
            this.f4085o = true;
        }
    }

    private void m6023c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = (JSONObject) jSONObject.get("meta");
                JSONArray jSONArray = (JSONArray) jSONObject.get("data");
                JSONArray jSONArray2 = new JSONArray();
                JSONArray jSONArray3 = new JSONArray();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject3 = (JSONObject) jSONArray.get(i);
                    String str2 = (String) jSONObject3.opt("webLayout");
                    String str3 = (String) jSONObject3.opt("url");
                    if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
                        jSONArray3.put(jSONObject3);
                    } else {
                        jSONArray2.put(jSONObject3);
                    }
                }
                this.f4095y.put("meta", jSONObject2);
                this.f4095y.put("data", jSONArray2);
                this.f4096z.put("meta", jSONObject2);
                this.f4096z.put("data", jSONArray3);
            } catch (Exception e) {
            }
        }
    }

    private JSONObject m6012a(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        boolean z;
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject3 = (JSONObject) jSONObject.get("meta");
            int i = jSONObject3.getInt("matchAll");
            JSONArray jSONArray = (JSONArray) jSONObject.get("data");
            JSONArray jSONArray2 = new JSONArray();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject4 = (JSONObject) jSONArray.get(i2);
                if (str.equals((String) jSONObject4.get("page"))) {
                    jSONArray2.put(jSONObject4);
                }
            }
            if (i != 0) {
                z = true;
            } else {
                z = i == 0 && jSONArray2.length() != 0;
            }
            if (z) {
                JSONObject jSONObject5 = new JSONObject();
                try {
                    jSONObject5.put("meta", jSONObject3);
                    jSONObject5.put("data", jSONArray2);
                    jSONObject2 = jSONObject5;
                } catch (Exception e) {
                    jSONObject2 = jSONObject5;
                }
            } else {
                jSONObject2 = null;
            }
        } catch (Exception e2) {
            jSONObject2 = null;
        }
        return jSONObject2;
    }

    public void m6050a(int i) {
        m6051a(i, "");
    }

    public void m6051a(int i, String str) {
        synchronized (this.f4070G) {
            if (this.f4071a != null) {
                if (str == null) {
                    str = "";
                }
                this.f4069F.put(i + "_" + System.currentTimeMillis() + "_" + ((bw.m6581s(this.f4071a) ? 1 : 0) + "|" + str));
                bn.m6456a(this.f4071a, af.f4041d, this.f4069F.toString(), false);
            }
        }
    }

    public JSONArray m6063e() {
        JSONArray jSONArray;
        synchronized (this.f4070G) {
            if (this.f4071a == null) {
                jSONArray = new JSONArray();
            } else {
                String strM6454a = bn.m6454a(this.f4071a, af.f4041d);
                try {
                    jSONArray = !TextUtils.isEmpty(strM6454a) ? new JSONArray(strM6454a) : null;
                } catch (Exception e) {
                    jSONArray = null;
                }
                if (jSONArray == null) {
                    jSONArray = new JSONArray();
                }
                this.f4069F = new JSONArray();
                bn.m6456a(this.f4071a, af.f4041d, this.f4069F.toString(), false);
            }
        }
        return jSONArray;
    }
}
