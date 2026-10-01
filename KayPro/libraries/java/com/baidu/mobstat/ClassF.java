package com.baidu.mobstat;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class ClassF {

    static ClassF f4499a = new ClassF();

    private String f4500b = "";

    ClassF() {
    }

    public synchronized void m6754a(Context context, boolean z) {
        m6748a(context, z, z ? 1 : 20);
    }

    private void m6748a(Context context, boolean z, int i) {
        ArrayList<a> arrayListM6746a = m6746a(context, i);
        if (arrayListM6746a != null && arrayListM6746a.size() != 0) {
            if (z) {
                String strM6756b = arrayListM6746a.get(0).m6756b();
                if (m6750a(strM6756b, this.f4500b)) {
                    this.f4500b = strM6756b;
                }
            }
            m6747a(context, arrayListM6746a, z);
        }
    }

    private ArrayList<a> m6746a(Context context, int i) {
        return android.os.Build.VERSION.SDK_INT >= 21 ? m6753c(context, i) : m6751b(context, i);
    }

    private ArrayList<a> m6751b(Context context, int i) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        try {
            runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(50);
        } catch (Exception e) {
            ba.m6312c().m6305b(e);
            runningTasks = null;
        }
        if (runningTasks == null) {
            return new ArrayList<>();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
            if (linkedHashMap.size() > i) {
                break;
            }
            ComponentName componentName = runningTaskInfo.topActivity;
            if (componentName != null) {
                String packageName = componentName.getPackageName();
                if (!TextUtils.isEmpty(packageName) && !m6752b(context, packageName) && !linkedHashMap.containsKey(packageName)) {
                    linkedHashMap.put(packageName, new a(packageName, m6745a(context, packageName), ""));
                }
            }
        }
        return new ArrayList<>(linkedHashMap.values());
    }

    private ArrayList<a> m6753c(Context context, int i) {
        String[] strArr;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return new ArrayList<>();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 = 0; i2 < runningAppProcesses.size() && linkedHashMap.size() <= i; i2++) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningAppProcesses.get(i2);
            if (m6749a(runningAppProcessInfo.importance) && (strArr = runningAppProcessInfo.pkgList) != null && strArr.length != 0) {
                String str = runningAppProcessInfo.pkgList[0];
                if (!TextUtils.isEmpty(str) && !m6752b(context, str) && !linkedHashMap.containsKey(str)) {
                    linkedHashMap.put(str, new a(str, m6745a(context, str), String.valueOf(runningAppProcessInfo.importance)));
                }
            }
        }
        return new ArrayList<>(linkedHashMap.values());
    }

    private boolean m6749a(int i) {
        if (i != 100 && i != 200 && i != 130) {
            return false;
        }
        return true;
    }

    private boolean m6750a(String str, String str2) {
        return (TextUtils.isEmpty(str) || str.equals(this.f4500b)) ? false : true;
    }

    private String m6745a(Context context, String str) {
        String str2 = "";
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "";
        }
        try {
            str2 = packageManager.getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            ba.m6312c().m6305b(e);
        }
        return str2 == null ? "" : str2;
    }

    private boolean m6752b(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(str, 0).applicationInfo;
            return (applicationInfo == null || (applicationInfo.flags & 1) == 0) ? false : true;
        } catch (PackageManager.NameNotFoundException e) {
            ba.m6312c().m6305b(e);
            return false;
        }
    }

    private void m6747a(Context context, ArrayList<a> arrayList, boolean z) {
        String strM6436a;
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis() + "|");
        sb.append(z ? 1 : 0);
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<a> it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectM6755a = it.next().m6755a();
                if (jSONObjectM6755a != null) {
                    jSONArray.put(jSONObjectM6755a);
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_trace", jSONArray);
            jSONObject.put("meta-data", sb.toString());
            strM6436a = bl.a.m6436a(jSONObject.toString().getBytes());
        } catch (Exception e) {
            ba.m6312c().m6305b(e);
            strM6436a = "";
        }
        if (!TextUtils.isEmpty(strM6436a)) {
            Enumk.f4521c.m6776a(context, System.currentTimeMillis(), strM6436a);
        }
    }

    static class a {

        private String f4501a;

        private String f4502b;

        private String f4503c;

        public a(String str, String str2, String str3) {
            this.f4501a = str == null ? "" : str;
            this.f4502b = str2 == null ? "" : str2;
            this.f4503c = str3 == null ? "" : str3;
        }

        public JSONObject m6755a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("n", this.f4501a);
                jSONObject.put("v", this.f4502b);
                jSONObject.put(Config.DEVICE_WIDTH, this.f4503c);
                return jSONObject;
            } catch (JSONException e) {
                ba.m6312c().m6305b(e);
                return null;
            }
        }

        public String m6756b() {
            return this.f4501a;
        }
    }
}
