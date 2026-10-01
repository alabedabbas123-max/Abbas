package com.baidu.mobstat;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ClassD {

    static ClassD f4469a = new ClassD();

    public synchronized void m6713a(Context context) {
        m6710b(context);
    }

    private void m6710b(Context context) {
        m6709a(context, m6711c(context));
    }

    private ArrayList<a> m6711c(Context context) {
        String string;
        ArrayList<a> arrayList = new ArrayList<>();
        for (PackageInfo packageInfo : m6712d(context)) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                String str = packageInfo.packageName;
                String str2 = packageInfo.versionName;
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr == null || signatureArr.length == 0) {
                    string = "";
                } else {
                    string = signatureArr[0].toChars().toString();
                }
                String strM6521a = bs.b.m6521a(string.getBytes());
                String strM6520a = "";
                String str3 = applicationInfo.sourceDir;
                if (!TextUtils.isEmpty(str3)) {
                    strM6520a = bs.b.m6520a(new File(str3));
                }
                arrayList.add(new a(str, str2, strM6521a, strM6520a));
            }
        }
        return arrayList;
    }

    private ArrayList<PackageInfo> m6712d(Context context) {
        ArrayList<PackageInfo> arrayList = new ArrayList<>();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return arrayList;
        }
        List<PackageInfo> arrayList2 = new ArrayList<>(1);
        try {
            arrayList2 = packageManager.getInstalledPackages(64);
        } catch (Exception e) {
            ba.m6312c().m6305b(e);
        }
        for (PackageInfo packageInfo : arrayList2) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null && (applicationInfo.flags & 1) == 0) {
                arrayList.add(packageInfo);
            }
        }
        return arrayList;
    }

    private void m6709a(Context context, ArrayList<a> arrayList) {
        String strM6436a;
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<a> it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectM6714a = it.next().m6714a();
                if (jSONObjectM6714a != null) {
                    jSONArray.put(jSONObjectM6714a);
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_apk", jSONArray);
            jSONObject.put("meta-data", sb.toString());
            strM6436a = bl.a.m6436a(jSONObject.toString().getBytes());
        } catch (Exception e) {
            ba.m6312c().m6305b(e);
            strM6436a = "";
        }
        if (!TextUtils.isEmpty(strM6436a)) {
            Enumk.f4523e.m6776a(context, System.currentTimeMillis(), strM6436a);
        }
    }

    static class a {

        private String f4470a;

        private String f4471b;

        private String f4472c;

        private String f4473d;

        public a(String str, String str2, String str3, String str4) {
            str = str == null ? "" : str;
            str2 = str2 == null ? "" : str2;
            str3 = str3 == null ? "" : str3;
            str4 = str4 == null ? "" : str4;
            this.f4470a = str;
            this.f4471b = str2;
            this.f4472c = str3;
            this.f4473d = str4;
        }

        public JSONObject m6714a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("n", this.f4470a);
                jSONObject.put("v", this.f4471b);
                jSONObject.put("c", this.f4472c);
                jSONObject.put(Config.APP_VERSION_CODE, this.f4473d);
                return jSONObject;
            } catch (JSONException e) {
                ba.m6312c().m6305b(e);
                return null;
            }
        }
    }
}
