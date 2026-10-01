package com.baidu.mobstat;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class ClassR {

    private static String f4528a;

    private static ClassR f4529b;

    private Handler f4530c;

    static {
        f4528a = android.os.Build.VERSION.SDK_INT < 9 ? "http://openrcv.baidu.com/1010/bplus.gif" : "https://openrcv.baidu.com/1010/bplus.gif";
    }

    private ClassR() {
        HandlerThread handlerThread = new HandlerThread("LogSender");
        handlerThread.start();
        this.f4530c = new Handler(handlerThread.getLooper());
    }

    public static ClassR m6793a() {
        if (f4529b == null) {
            synchronized (ClassR.class) {
                if (f4529b == null) {
                    f4529b = new ClassR();
                }
            }
        }
        return f4529b;
    }

    public void m6803a(final Context context, final String str) {
        ba.m6312c().m6300a("data = " + str);
        if (str != null && !"".equals(str)) {
            this.f4530c.post(new Runnable() {
                @Override
                public void run() {
                    try {
                        if (context != null) {
                            ClassR.this.m6800b(context, str);
                            ClassR.this.m6794a(context.getApplicationContext());
                        }
                    } catch (Throwable th) {
                        ba.m6312c().m6305b(th);
                    }
                }
            });
        }
    }

    public void m6800b(Context context, String str) {
        bn.m6456a(context, ClassY.f4570f + System.currentTimeMillis(), str, false);
    }

    public void m6794a(Context context) throws Throwable {
        int i;
        int i2 = 0;
        for (String str : m6801c(context, ClassY.f4570f)) {
            String strM6454a = bn.m6454a(context, str);
            if (TextUtils.isEmpty(strM6454a)) {
                bn.m6458b(context, str);
            } else {
                if (m6802d(context, strM6454a)) {
                    bn.m6458b(context, str);
                    i = 0;
                } else {
                    m6795a(context, strM6454a, str);
                    i = i2 + 1;
                    if (i >= 5) {
                        return;
                    }
                }
                i2 = i;
            }
        }
    }

    private ArrayList<String> m6801c(Context context, final String str) {
        File filesDir;
        String[] list;
        ArrayList<String> arrayList = new ArrayList<>();
        if (context != null && (filesDir = context.getFilesDir()) != null && filesDir.exists()) {
            try {
                list = filesDir.list(new FilenameFilter() {
                    @Override
                    public boolean accept(File file, String str2) {
                        return str2.startsWith(str);
                    }
                });
            } catch (Exception e) {
                list = null;
            }
            if (list != null && list.length != 0) {
                try {
                    Arrays.sort(list, new Comparator<String>() {
                        @Override
                        public int compare(String str2, String str3) {
                            return str2.compareTo(str3);
                        }
                    });
                } catch (Exception e2) {
                }
                for (String str2 : list) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    private void m6795a(Context context, String str, String str2) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception e) {
                jSONObject = null;
            }
            JSONObject jSONObjectM6758a = ClassH.m6758a(jSONObject);
            if (jSONObjectM6758a != null) {
                ClassH.m6759b(jSONObjectM6758a);
                if (jSONObject != null) {
                    bn.m6456a(context, str2, jSONObject.toString(), false);
                }
            }
        }
    }

    private boolean m6802d(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!bw.m6551c().booleanValue()) {
            return true;
        }
        try {
            m6799b(context, f4528a, str);
            return true;
        } catch (Exception e) {
            ba.m6312c().m6309c(e);
            return false;
        }
    }

    private String m6799b(Context context, String str, String str2) throws IOException {
        byte[] bytes;
        boolean z = !str.startsWith("https:");
        HttpURLConnection httpURLConnectionM6460d = bn.m6460d(context, str);
        httpURLConnectionM6460d.setDoOutput(true);
        httpURLConnectionM6460d.setInstanceFollowRedirects(false);
        httpURLConnectionM6460d.setUseCaches(false);
        httpURLConnectionM6460d.setRequestProperty("Content-Encoding", "gzip");
        try {
            JSONObject jSONObject = new JSONObject(str2).getJSONArray("payload").getJSONObject(0).getJSONObject(Config.HEADER_PART);
            httpURLConnectionM6460d.setRequestProperty("Content-Type", "gzip");
            httpURLConnectionM6460d.setRequestProperty("mtj_appversion", jSONObject.getString("n"));
            httpURLConnectionM6460d.setRequestProperty("mtj_os", "Android");
            httpURLConnectionM6460d.setRequestProperty("mtj_pn", jSONObject.getString(Config.PACKAGE_NAME));
            httpURLConnectionM6460d.setRequestProperty("mtj_tg", "1");
            httpURLConnectionM6460d.setRequestProperty("mtj_ii", jSONObject.getString(Config.CUID_SEC));
            httpURLConnectionM6460d.setRequestProperty(Config.FROM, jSONObject.getString(Config.FROM));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        httpURLConnectionM6460d.connect();
        try {
            try {
                OutputStream outputStream = httpURLConnectionM6460d.getOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                gZIPOutputStream.write(new byte[]{72, 77, 48, 49});
                gZIPOutputStream.write(new byte[]{0, 0, 0, 1});
                gZIPOutputStream.write(new byte[]{0, 0, 3, -14});
                gZIPOutputStream.write(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
                gZIPOutputStream.write(new byte[]{0, 2});
                if (z) {
                    gZIPOutputStream.write(new byte[]{0, 1});
                } else {
                    gZIPOutputStream.write(new byte[]{0, 0});
                }
                gZIPOutputStream.write(new byte[]{72, 77, 48, 49});
                if (z) {
                    byte[] bArrM6437a = bl.a.m6437a();
                    byte[] bArrM6536a = bv.m6536a(false, bq.m6512a(), bArrM6437a);
                    gZIPOutputStream.write(m6798a(bArrM6536a.length, 4));
                    gZIPOutputStream.write(bArrM6536a);
                    bytes = bl.a.m6438a(bArrM6437a, new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, str2.getBytes("utf-8"));
                    gZIPOutputStream.write(m6798a(bytes.length, 2));
                } else {
                    bytes = str2.getBytes("utf-8");
                }
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.close();
                outputStream.close();
                int responseCode = httpURLConnectionM6460d.getResponseCode();
                int contentLength = httpURLConnectionM6460d.getContentLength();
                ba.m6312c().m6307c("code: " + responseCode + "; len: " + contentLength);
                if (responseCode != 200 || contentLength != 0) {
                    throw new IOException("Response code = " + httpURLConnectionM6460d.getResponseCode());
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnectionM6460d.getInputStream()));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb.append(line);
                    } else {
                        String string = sb.toString();
                        httpURLConnectionM6460d.disconnect();
                        return string;
                    }
                }
            } catch (Exception e2) {
                ba.m6312c().m6305b(e2);
                httpURLConnectionM6460d.disconnect();
                return "";
            }
        } catch (Throwable th) {
            httpURLConnectionM6460d.disconnect();
            throw th;
        }
    }

    private static byte[] m6798a(long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[(i - i2) - 1] = (byte) (255 & j);
            j >>= 8;
        }
        return bArr;
    }
}
