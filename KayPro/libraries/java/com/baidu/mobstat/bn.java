package com.baidu.mobstat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;

public final class bn {

    private static final Proxy f4362a = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.172", 80));

    private static final Proxy f4363b = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.200", 80));

    public static void m6456a(Context context, String str, String str2, boolean z) {
        if (context != null) {
            FileOutputStream fileOutputStreamOpenFileOutput = null;
            try {
                fileOutputStreamOpenFileOutput = context.openFileOutput(str, z ? 32768 : 0);
                bt.m6523a(new ByteArrayInputStream(str2.getBytes("utf-8")), fileOutputStreamOpenFileOutput);
            } catch (Exception e) {
            } finally {
                bt.m6522a(fileOutputStreamOpenFileOutput);
            }
        }
    }

    public static String m6454a(Context context, String str) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput(str);
            try {
                byte[] bArrM6457a = m6457a(fileInputStreamOpenFileInput);
                if (bArrM6457a != null) {
                    String str2 = new String(bArrM6457a, "utf-8");
                    bt.m6522a(fileInputStreamOpenFileInput);
                    return str2;
                }
                bt.m6522a(fileInputStreamOpenFileInput);
            } catch (Exception e) {
                fileInputStream2 = fileInputStreamOpenFileInput;
                bt.m6522a(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStreamOpenFileInput;
                bt.m6522a(fileInputStream);
                throw th;
            }
        } catch (Exception e2) {
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
        return "";
    }

    private static byte[] m6457a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bt.m6523a(inputStream, byteArrayOutputStream)) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    public static boolean m6458b(Context context, String str) {
        return context.deleteFile(str);
    }

    public static boolean m6459c(Context context, String str) {
        return context.getFileStreamPath(str).exists();
    }

    public static HttpURLConnection m6460d(Context context, String str) throws IOException {
        return m6455a(context, str, 50000, 50000);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    @SuppressLint({"DefaultLocale"})
    public static HttpURLConnection m6455a(Context context, String str, int i, int i2) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
        if (networkInfo2 != null && networkInfo2.isAvailable()) {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        } else if (networkInfo == null || !networkInfo.isAvailable()) {
            httpURLConnection = null;
        } else {
            String extraInfo = networkInfo.getExtraInfo();
            String lowerCase = extraInfo != null ? extraInfo.toLowerCase() : "";
            if (lowerCase.startsWith("cmwap") || lowerCase.startsWith("uniwap") || lowerCase.startsWith("3gwap")) {
                httpURLConnection = (HttpURLConnection) url.openConnection(f4362a);
            } else if (!lowerCase.startsWith("ctwap")) {
                httpURLConnection = null;
            } else {
                httpURLConnection = (HttpURLConnection) url.openConnection(f4363b);
            }
        }
        if (httpURLConnection == null) {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i2);
        return httpURLConnection;
    }

    public static boolean m6461e(Context context, String str) {
        boolean z = false;
        try {
            if (context.checkCallingOrSelfPermission(str) == 0) {
                z = true;
            }
        } catch (Exception e) {
        }
        if (!z) {
            bb.m6313c().m6303b("[WARNING] not have permission " + str + ", please add it in AndroidManifest.xml according our developer doc");
        }
        return z;
    }
}
