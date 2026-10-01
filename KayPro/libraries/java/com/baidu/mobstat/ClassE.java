package com.baidu.mobstat;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class ClassE {

    static final ClassE f4498a = new ClassE();

    ClassE() {
    }

    public synchronized void m6744a(Context context, boolean z) {
        m6743b(context, z);
    }

    private void m6743b(Context context, boolean z) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            List<PackageInfo> arrayList = new ArrayList<>(1);
            try {
                arrayList = packageManager.getInstalledPackages(0);
            } catch (Exception e) {
                ba.m6312c().m6305b(e);
            }
            JSONArray jSONArray = new JSONArray();
            for (PackageInfo packageInfo : arrayList) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null) {
                    boolean z2 = (applicationInfo.flags & 1) != 0;
                    String str = applicationInfo.sourceDir;
                    if (z == z2) {
                        m6742a(z, "", str, packageInfo, jSONArray);
                    }
                }
            }
            if (jSONArray.length() != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(System.currentTimeMillis() + "|");
                sb.append(z ? 1 : 0);
                String strM6436a = "";
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_list", jSONArray);
                    jSONObject.put("meta-data", sb.toString());
                    strM6436a = bl.a.m6436a(jSONObject.toString().getBytes());
                } catch (Exception e2) {
                }
                if (!TextUtils.isEmpty(strM6436a)) {
                    Enumk.f4520b.m6776a(context, System.currentTimeMillis(), strM6436a);
                }
            }
        }
    }

    private void m6742a(boolean z, String str, String str2, PackageInfo packageInfo, JSONArray jSONArray) {
        long j;
        long j2 = 0;
        if (!z || !packageInfo.packageName.startsWith("com.android.")) {
            try {
                j = packageInfo.firstInstallTime;
            } catch (Throwable th) {
                ba.m6312c().m6305b(th);
                j = 0;
            }
            try {
                j2 = packageInfo.lastUpdateTime;
            } catch (Throwable th2) {
                ba.m6312c().m6305b(th2);
            }
            long jM6741a = m6741a(str2);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("n", packageInfo.packageName);
                jSONObject.put(Config.APP_VERSION_CODE, str);
                jSONObject.put("v", String.valueOf(packageInfo.versionName));
                jSONObject.put("f", j);
                jSONObject.put("l", j2);
                jSONObject.put(Config.MODEL, jM6741a);
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                ba.m6312c().m6305b(e);
            }
        }
    }

    private long m6741a(String str) {
        File file;
        if (str == null || (file = new File(str)) == null || !file.exists()) {
            return 0L;
        }
        return file.lastModified();
    }
}
