package com.baidu.mobstat;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;

public class bf {

    private static volatile boolean f4328a;

    private static volatile boolean f4329b;

    private static volatile boolean f4330c;

    private static boolean m6339a(int i) {
        switch (i) {
            case 0:
                return f4328a;
            case 1:
                return f4329b;
            case 2:
                return f4330c;
            default:
                return false;
        }
    }

    private static void m6338a(int i, boolean z) {
        switch (i) {
            case 0:
                f4328a = z;
                break;
            case 1:
                f4329b = z;
                break;
            case 2:
                f4330c = z;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0131 A[Catch: all -> 0x0117, TRY_ENTER, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0005, B:10:0x0011, B:13:0x001d, B:16:0x0029, B:17:0x0043, B:19:0x004d, B:20:0x0067, B:54:0x0131, B:44:0x0112, B:60:0x0145, B:61:0x0148, B:24:0x0074, B:27:0x007f, B:28:0x008d, B:31:0x00a1, B:32:0x00c5, B:34:0x00cf, B:37:0x00f7, B:39:0x00fc, B:40:0x0109, B:42:0x010d, B:49:0x011a, B:56:0x0136), top: B:77:0x0005, inners: #1 }] */
    public static synchronized boolean m6340a(Context context, String str, int i, boolean z) {
        boolean z2 = true;
        synchronized (bf.class) {
            if (!m6339a(i)) {
                if (context == null) {
                    z2 = false;
                } else {
                    String strM6337a = m6337a(context, str, i);
                    if (TextUtils.isEmpty(strM6337a)) {
                        z2 = false;
                    } else {
                        if (bc.m6315c().mo6306b() && z) {
                            bc.m6315c().m6300a("requestUrl:" + strM6337a);
                        }
                        if (bg.m6342c().mo6306b()) {
                            bg.m6342c().m6300a("requestUrl:" + strM6337a);
                        }
                        String strM6341b = m6341b(i);
                        if (TextUtils.isEmpty(strM6341b)) {
                            z2 = false;
                        } else {
                            HttpURLConnection httpURLConnectionM6460d = null;
                            try {
                                try {
                                    httpURLConnectionM6460d = bn.m6460d(context, strM6337a);
                                    httpURLConnectionM6460d.connect();
                                    long jLongValue = 0;
                                    if (i == 1) {
                                        try {
                                            jLongValue = Long.valueOf(httpURLConnectionM6460d.getHeaderField("X-INTERVAL")).longValue();
                                        } catch (Exception e) {
                                        }
                                    }
                                    int responseCode = httpURLConnectionM6460d.getResponseCode();
                                    int contentLength = httpURLConnectionM6460d.getContentLength();
                                    if (bc.m6315c().mo6306b() && z) {
                                        bc.m6315c().m6300a("contentLength:" + contentLength + " fileName:" + strM6341b);
                                    }
                                    if (bg.m6342c().mo6306b()) {
                                        bg.m6342c().m6300a("contentLength:" + contentLength + " fileName:" + strM6341b);
                                    }
                                    if (responseCode == 200) {
                                        switch (i) {
                                            case 1:
                                                bp.m6466a().m6468a(context, System.currentTimeMillis());
                                                bp.m6466a().m6473b(context, jLongValue);
                                                break;
                                            case 2:
                                                bp.m6466a().m6477c(context, System.currentTimeMillis());
                                                break;
                                        }
                                        if (contentLength > 0) {
                                            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(strM6341b, 0);
                                            boolean zM6523a = bt.m6523a(httpURLConnectionM6460d.getInputStream(), fileOutputStreamOpenFileOutput);
                                            try {
                                                bt.m6522a(fileOutputStreamOpenFileOutput);
                                                try {
                                                    m6338a(i, true);
                                                } catch (Exception e2) {
                                                    if (httpURLConnectionM6460d != null) {
                                                        httpURLConnectionM6460d.disconnect();
                                                    }
                                                }
                                            } catch (Exception e3) {
                                                z2 = zM6523a;
                                                if (httpURLConnectionM6460d != null) {
                                                    httpURLConnectionM6460d.disconnect();
                                                }
                                                return z2;
                                            }
                                        } else {
                                            m6338a(i, true);
                                        }
                                    } else {
                                        z2 = false;
                                    }
                                    if (httpURLConnectionM6460d != null) {
                                        httpURLConnectionM6460d.disconnect();
                                    }
                                } catch (Throwable th) {
                                    if (httpURLConnectionM6460d != null) {
                                        httpURLConnectionM6460d.disconnect();
                                    }
                                    throw th;
                                }
                            } catch (Exception e4) {
                                z2 = false;
                            }
                        }
                    }
                }
            }
        }
        return z2;
    }

    private static String m6337a(Context context, String str, int i) {
        switch (i) {
            case 0:
                return m6334a();
            case 1:
                return m6335a(context);
            case 2:
                return m6336a(context, str);
            default:
                return "";
        }
    }

    private static String m6334a() {
        return "https://dxp.baidu.com/vizParser";
    }

    private static String m6335a(Context context) throws Throwable {
        String strM6454a = bn.m6454a(context, af.f4039b);
        ArrayList<Pair> arrayList = new ArrayList();
        if (!TextUtils.isEmpty(strM6454a)) {
            String strM6519a = bs.a.m6519a(strM6454a.getBytes());
            if (!TextUtils.isEmpty(strM6519a)) {
                arrayList.add(new Pair("sign", strM6519a));
            }
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
        String string = sb.toString();
        return !TextUtils.isEmpty(string) ? "https://dxp.baidu.com/autoTracker?" + string : "https://dxp.baidu.com/autoTracker";
    }

    private static String m6336a(Context context, String str) {
        ArrayList<Pair> arrayList = new ArrayList();
        arrayList.add(new Pair("sdkVersion", StatService.getSdkVersion()));
        arrayList.add(new Pair("appKey", "" + str));
        arrayList.add(new Pair("packageName", context.getPackageName()));
        arrayList.add(new Pair("appVersion", bw.m6562g(context)));
        arrayList.add(new Pair("cuid", CooperService.instance().getCUID(context, false)));
        arrayList.add(new Pair("imei", CooperService.instance().getDevicImei(context)));
        arrayList.add(new Pair("platform", "Android"));
        arrayList.add(new Pair("model", android.os.Build.MODEL));
        arrayList.add(new Pair("s", android.os.Build.VERSION.SDK_INT + ""));
        arrayList.add(new Pair(Config.f3881OS, android.os.Build.VERSION.RELEASE));
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
        return "https://dxp.baidu.com/circleConfig?" + sb.toString();
    }

    private static String m6341b(int i) {
        switch (i) {
            case 0:
                return af.f4038a;
            case 1:
                return af.f4039b;
            case 2:
                return af.f4040c;
            default:
                return "";
        }
    }
}
