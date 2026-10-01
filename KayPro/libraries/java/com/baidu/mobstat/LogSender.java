package com.baidu.mobstat;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class LogSender {

    private static LogSender f3956a = new LogSender();

    private boolean f3957b = false;

    private int f3958c = 0;

    private int f3959d = 1;

    private SendStrategyEnum f3960e = SendStrategyEnum.APP_START;

    private Timer f3961f;

    private Handler f3962g;

    public static LogSender instance() {
        return f3956a;
    }

    private LogSender() {
        HandlerThread handlerThread = new HandlerThread("LogSenderThread");
        handlerThread.start();
        this.f3962g = new Handler(handlerThread.getLooper());
    }

    public void setLogSenderDelayed(int i) {
        if (i >= 0 && i <= 30) {
            this.f3958c = i;
        }
    }

    public void setSendLogStrategy(Context context, SendStrategyEnum sendStrategyEnum, int i, boolean z) {
        if (sendStrategyEnum.equals(SendStrategyEnum.SET_TIME_INTERVAL)) {
            if (i > 0 && i <= 24) {
                this.f3959d = i;
                this.f3960e = SendStrategyEnum.SET_TIME_INTERVAL;
                bp.m6466a().m6467a(context, this.f3960e.ordinal());
                bp.m6466a().m6472b(context, this.f3959d);
            }
        } else {
            this.f3960e = sendStrategyEnum;
            bp.m6466a().m6467a(context, this.f3960e.ordinal());
            if (sendStrategyEnum.equals(SendStrategyEnum.ONCE_A_DAY)) {
                bp.m6466a().m6472b(context, 24);
            }
        }
        this.f3957b = z;
        bp.m6466a().m6470a(context, this.f3957b);
    }

    public void onSend(final Context context) {
        if (context != null) {
            context = context.getApplicationContext();
        }
        if (context != null) {
            this.f3962g.post(new Runnable() {
                @Override
                public void run() {
                    if (LogSender.this.f3961f != null) {
                        LogSender.this.f3961f.cancel();
                        LogSender.this.f3961f = null;
                    }
                    LogSender.this.f3960e = SendStrategyEnum.values()[bp.m6466a().m6471b(context)];
                    LogSender.this.f3959d = bp.m6466a().m6476c(context);
                    LogSender.this.f3957b = bp.m6466a().m6481d(context);
                    if (LogSender.this.f3960e.equals(SendStrategyEnum.SET_TIME_INTERVAL) || LogSender.this.f3960e.equals(SendStrategyEnum.ONCE_A_DAY)) {
                        LogSender.this.setSendingLogTimer(context);
                    }
                    LogSender.this.f3962g.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            LogSender.this.m5896a(context);
                        }
                    }, LogSender.this.f3958c * 1000);
                }
            });
        }
    }

    public void setSendingLogTimer(Context context) {
        final Context applicationContext = context.getApplicationContext();
        long j = this.f3959d * 3600000;
        try {
            this.f3961f = new Timer();
            this.f3961f.schedule(new TimerTask() {
                @Override
                public void run() {
                    LogSender.this.m5896a(applicationContext);
                }
            }, j, j);
        } catch (Exception e) {
        }
    }

    public void saveLogData(Context context, String str, boolean z) {
        bn.m6456a(context, (z ? Config.PREFIX_SEND_DATA_FULL : Config.PREFIX_SEND_DATA) + System.currentTimeMillis(), str, false);
        if (z) {
            m5897a(context, Config.FULL_TRACE_LOG_LIMIT, Config.PREFIX_SEND_DATA_FULL);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f A[LOOP:1: B:13:0x002d->B:14:0x002f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x004e A[LOOP:0: B:3:0x000f->B:25:0x004e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x002b A[EDGE_INSN: B:49:0x002b->B:12:0x002b BREAK  A[LOOP:0: B:3:0x000f->B:25:0x004e], SYNTHETIC] */
    private void m5897a(Context context, long j, String str) throws Throwable {
        int i;
        Throwable th;
        FileInputStream fileInputStream;
        FileInputStream fileInputStreamOpenFileInput;
        ArrayList<String> arrayListM5892a = m5892a(context, str);
        long jAvailable = 0;
        FileInputStream fileInputStream2 = null;
        for (int size = arrayListM5892a.size() - 1; size >= 0; size--) {
            try {
                fileInputStreamOpenFileInput = context.openFileInput(arrayListM5892a.get(size));
                try {
                    jAvailable += (long) fileInputStreamOpenFileInput.available();
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (Exception e) {
                        }
                        fileInputStream2 = null;
                    } else {
                        fileInputStream2 = fileInputStreamOpenFileInput;
                    }
                } catch (Exception e2) {
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (Exception e3) {
                        }
                        fileInputStream2 = null;
                    }
                    if (jAvailable > j) {
                        break;
                        for (i = 0; i <= size; i++) {
                            bn.m6458b(context, arrayListM5892a.get(i));
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStreamOpenFileInput;
                    if (fileInputStream == null) {
                        throw th;
                    }
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Exception e4) {
                        throw th;
                    }
                }
            } catch (Exception e5) {
                fileInputStreamOpenFileInput = fileInputStream2;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
            }
            if (jAvailable > j) {
                break;
            }
        }
        while (i <= size) {
            bn.m6458b(context, arrayListM5892a.get(i));
        }
    }

    public ArrayList<String> m5892a(Context context, final String str) {
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

    class CallableC1406a implements Callable<Object> {

        private Context f3980b;

        private String f3981c;

        private String f3982d;

        private boolean f3983e;

        CallableC1406a(Context context, String str, String str2, boolean z) {
            this.f3980b = context;
            this.f3982d = str;
            this.f3981c = str2;
            this.f3983e = z;
        }

        @Override
        public Object call() {
            boolean z;
            if (!LogSender.this.m5900a(this.f3980b, this.f3981c, this.f3983e)) {
                LogSender.m5905b(this.f3980b, this.f3982d, this.f3981c);
                z = false;
            } else {
                bn.m6458b(this.f3980b, this.f3982d);
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public void sendLogDataWithSyn(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m5892a(context, Config.PREFIX_SEND_DATA));
        int size = arrayList.size();
        if (size != 0) {
            int i = size > 20 ? 20 : size;
            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(i);
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(executorServiceNewFixedThreadPool.submit(new CallableC1406a(context, (String) arrayList.get(i2), bn.m6454a(context, (String) arrayList.get(i2)), ((String) arrayList.get(i2)).contains(Config.PREFIX_SEND_DATA_FULL))));
            }
            executorServiceNewFixedThreadPool.shutdown();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                try {
                    ((Future) it.next()).get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public void m5896a(final Context context) {
        if (!this.f3957b || bw.m6579q(context)) {
            this.f3962g.post(new Runnable() {
                @Override
                public void run() throws Throwable {
                    int i;
                    try {
                        ArrayList<String> arrayList = new ArrayList();
                        arrayList.addAll(LogSender.this.m5892a(context, Config.PREFIX_SEND_DATA));
                        arrayList.addAll(LogSender.this.m5892a(context, Config.PREFIX_SEND_DATA_FULL));
                        int i2 = 0;
                        for (String str : arrayList) {
                            String strM6454a = bn.m6454a(context, str);
                            if (!TextUtils.isEmpty(strM6454a)) {
                                if (!LogSender.this.m5900a(context, strM6454a, str.contains(Config.PREFIX_SEND_DATA_FULL))) {
                                    LogSender.m5905b(context, str, strM6454a);
                                    i = i2 + 1;
                                    if (i >= 5) {
                                        return;
                                    }
                                } else {
                                    bn.m6458b(context, str);
                                    i = 0;
                                }
                                i2 = i;
                            } else {
                                bn.m6458b(context, str);
                            }
                        }
                    } catch (Exception e) {
                    }
                }
            });
        }
    }

    public void sendLogData(Context context, final String str, boolean z) {
        if (context != null && !TextUtils.isEmpty(str)) {
            final Context applicationContext = context.getApplicationContext();
            if (z) {
                m5904b(applicationContext, str);
            } else {
                this.f3962g.post(new Runnable() {
                    @Override
                    public void run() {
                        LogSender.this.m5904b(applicationContext, str);
                    }
                });
            }
        }
    }

    public void m5904b(Context context, String str) {
        String str2 = Config.PREFIX_SEND_DATA + System.currentTimeMillis();
        bn.m6456a(context, str2, str, false);
        if (m5909c(context, str)) {
            bn.m6458b(context, str2);
        } else {
            m5905b(context, str2, str);
        }
    }

    public static void m5905b(Context context, String str, String str2) {
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(str2);
        } catch (Exception e) {
        }
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = (JSONObject) jSONObject.get(Config.TRACE_PART);
                jSONObject2.put(Config.TRACE_FAILED_CNT, jSONObject2.getLong(Config.TRACE_FAILED_CNT) + 1);
            } catch (Exception e2) {
            }
            bn.m6456a(context, str, jSONObject.toString(), false);
        }
    }

    public void sendEmptyLogData(Context context, final String str) {
        final Context applicationContext = context.getApplicationContext();
        this.f3962g.post(new Runnable() {
            @Override
            public void run() {
                String strConstructLogWithEmptyBody = DataCore.instance().constructLogWithEmptyBody(applicationContext, str);
                if (!TextUtils.isEmpty(strConstructLogWithEmptyBody)) {
                    LogSender.this.m5909c(applicationContext, strConstructLogWithEmptyBody);
                }
            }
        });
    }

    public boolean m5909c(Context context, String str) {
        return m5900a(context, str, false);
    }

    public boolean m5900a(Context context, String str, boolean z) {
        boolean z2 = false;
        if (!z) {
            bb.m6313c().m6300a("Start send log \n" + str);
        }
        if (this.f3957b && !bw.m6579q(context)) {
            bb.m6313c().m6300a("[WARNING] wifi not available, log will be cached, next time will try to resend");
            return false;
        }
        String str2 = Config.LOG_SEND_URL;
        if (z) {
            str2 = Config.LOG_FULL_SEND_URL;
        }
        try {
            m5908c(context, str2, str);
            z2 = true;
        } catch (Exception e) {
            bb.m6313c().m6309c(e);
        }
        if (!z) {
            bb.m6313c().m6300a("Send log " + (z2 ? "success" : "failed"));
        }
        return z2;
    }

    private String m5908c(Context context, String str, String str2) throws Exception {
        return !str.startsWith("https://") ? m5913e(context, str, str2) : m5912d(context, str, str2);
    }

    private String m5912d(Context context, String str, String str2) throws IOException {
        HttpURLConnection httpURLConnectionM6460d = bn.m6460d(context, str);
        httpURLConnectionM6460d.setDoOutput(true);
        httpURLConnectionM6460d.setInstanceFollowRedirects(false);
        httpURLConnectionM6460d.setUseCaches(false);
        httpURLConnectionM6460d.setRequestProperty("Content-Type", "gzip");
        try {
            JSONObject jSONObject = new JSONObject(str2).getJSONObject(Config.HEADER_PART);
            httpURLConnectionM6460d.setRequestProperty("mtj_appkey", jSONObject.getString(Config.APP_KEY));
            httpURLConnectionM6460d.setRequestProperty("mtj_appversion", jSONObject.getString("n"));
            httpURLConnectionM6460d.setRequestProperty("mtj_os", jSONObject.getString(Config.f3881OS));
            httpURLConnectionM6460d.setRequestProperty("mtj_pn", jSONObject.getString(Config.PACKAGE_NAME));
            httpURLConnectionM6460d.setRequestProperty("mtj_tg", jSONObject.getString(Config.SDK_TAG));
            httpURLConnectionM6460d.setRequestProperty("mtj_ii", jSONObject.getString(Config.CUID_SEC));
            httpURLConnectionM6460d.setRequestProperty(Config.FROM, jSONObject.getString(Config.FROM));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        httpURLConnectionM6460d.connect();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new GZIPOutputStream(httpURLConnectionM6460d.getOutputStream())));
            bufferedWriter.write(str2);
            bufferedWriter.flush();
            bufferedWriter.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnectionM6460d.getInputStream()));
            StringBuilder sb = new StringBuilder();
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                sb.append(line);
            }
            int contentLength = httpURLConnectionM6460d.getContentLength();
            if (httpURLConnectionM6460d.getResponseCode() != 200 || contentLength != 0) {
                throw new IOException("http code = " + httpURLConnectionM6460d.getResponseCode() + "; contentResponse = " + ((Object) sb));
            }
            String string = sb.toString();
            httpURLConnectionM6460d.disconnect();
            return string;
        } catch (Throwable th) {
            httpURLConnectionM6460d.disconnect();
            throw th;
        }
    }

    private String m5913e(Context context, String str, String str2) throws Exception {
        HttpURLConnection httpURLConnectionM6460d = bn.m6460d(context, str);
        httpURLConnectionM6460d.setDoOutput(true);
        httpURLConnectionM6460d.setInstanceFollowRedirects(false);
        httpURLConnectionM6460d.setUseCaches(false);
        httpURLConnectionM6460d.setRequestProperty("Content-Type", "gzip");
        byte[] bArrM6437a = bl.a.m6437a();
        byte[] bArrM6440b = bl.a.m6440b();
        httpURLConnectionM6460d.setRequestProperty("key", bv.m6533a(bArrM6437a));
        httpURLConnectionM6460d.setRequestProperty("iv", bv.m6533a(bArrM6440b));
        byte[] bArrM6438a = bl.a.m6438a(bArrM6437a, bArrM6440b, str2.getBytes("utf-8"));
        httpURLConnectionM6460d.connect();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(httpURLConnectionM6460d.getOutputStream());
            gZIPOutputStream.write(bArrM6438a);
            gZIPOutputStream.flush();
            gZIPOutputStream.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnectionM6460d.getInputStream()));
            StringBuilder sb = new StringBuilder();
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                sb.append(line);
            }
            int contentLength = httpURLConnectionM6460d.getContentLength();
            if (httpURLConnectionM6460d.getResponseCode() != 200 || contentLength != 0) {
                throw new IOException("http code = " + httpURLConnectionM6460d.getResponseCode() + "; contentResponse = " + ((Object) sb));
            }
            String string = sb.toString();
            httpURLConnectionM6460d.disconnect();
            return string;
        } catch (Throwable th) {
            httpURLConnectionM6460d.disconnect();
            throw th;
        }
    }
}
