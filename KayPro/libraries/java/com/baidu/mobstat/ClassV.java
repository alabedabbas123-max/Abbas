package com.baidu.mobstat;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;

class ClassV {

    private static volatile boolean f4544a = false;

    public static synchronized void m6809a(Context context, Interfacea interfaceC1409a) {
        if (!f4544a) {
            if (!bw.m6579q(context)) {
                ba.m6312c().m6300a("isWifiAvailable = false, will not to update");
            } else if (!interfaceC1409a.mo5946a(context)) {
                ba.m6312c().m6300a("check time, will not to update");
            } else {
                ba.m6312c().m6300a("can start update config");
                new a(context, interfaceC1409a).start();
                f4544a = true;
            }
        }
    }

    static class a extends Thread {

        private Context f4545a;

        private Interfacea f4546b;

        public a(Context context, Interfacea interfaceC1409a) {
            this.f4545a = context;
            this.f4546b = interfaceC1409a;
        }

        @Override
        public void run() {
            try {
                int i = ClassY.f4565a ? 3 : 10;
                ba.m6312c().m6300a("start version check in " + i + "s");
                sleep(i * 1000);
                m6811a();
                m6812a(this.f4545a);
            } catch (Exception e) {
                ba.m6312c().m6302a(e);
            }
            boolean unused = ClassV.f4544a = false;
        }

        private void m6812a(Context context) {
            this.f4546b.mo5943a(context, System.currentTimeMillis());
        }

        private synchronized void m6811a() throws Exception {
            ba.m6312c().m6300a("start get config");
            Context context = this.f4545a;
            Interfacea interfaceC1409a = this.f4546b;
            String strM6813b = m6813b(context);
            ba.m6312c().m6307c("update req url is:" + strM6813b);
            HttpURLConnection httpURLConnectionM6460d = bn.m6460d(context, strM6813b);
            try {
                httpURLConnectionM6460d.connect();
                String headerField = httpURLConnectionM6460d.getHeaderField("X-CONFIG");
                ba.m6312c().m6300a("config is: " + headerField);
                String headerField2 = httpURLConnectionM6460d.getHeaderField("X-SIGN");
                ba.m6312c().m6300a("sign is: " + headerField2);
                int responseCode = httpURLConnectionM6460d.getResponseCode();
                ba.m6312c().m6300a("update response code is: " + responseCode);
                ba.m6312c().m6300a("update response content length is: " + httpURLConnectionM6460d.getContentLength());
                if (responseCode == 200) {
                    ba.m6312c().m6300a("request  success");
                }
                if (!TextUtils.isEmpty(headerField)) {
                    ba.m6312c().m6300a("save Config " + headerField);
                    interfaceC1409a.mo5944a(context, headerField);
                }
                if (!TextUtils.isEmpty(headerField2)) {
                    ba.m6312c().m6300a("save Sign " + headerField2);
                    interfaceC1409a.mo5947b(context, headerField2);
                }
                httpURLConnectionM6460d.disconnect();
                ba.m6312c().m6300a("finish get config");
            } catch (Throwable th) {
                httpURLConnectionM6460d.disconnect();
                throw th;
            }
        }

        private String m6813b(Context context) {
            ArrayList<Pair> arrayList = new ArrayList();
            arrayList.add(new Pair("dynamicVersion", "35"));
            arrayList.add(new Pair("packageName", bw.m6582t(context)));
            arrayList.add(new Pair("appVersion", bw.m6562g(context)));
            arrayList.add(new Pair("cuid", bw.m6541a(context)));
            arrayList.add(new Pair("platform", "Android"));
            arrayList.add(new Pair(Config.MODEL, android.os.Build.MODEL));
            arrayList.add(new Pair("s", android.os.Build.VERSION.SDK_INT + ""));
            arrayList.add(new Pair(Config.f3881OS, android.os.Build.VERSION.RELEASE));
            arrayList.add(new Pair("i", "35"));
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
            return ClassY.f4567c + "?" + sb.toString();
        }
    }
}
