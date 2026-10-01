package com.baidu.mobstat;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Process;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.baidu.mobstat.util.CuidUtil;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class bw {

    private static String f4379a = null;

    private static String f4380b = null;

    private static String f4381c = null;

    private static final Pattern f4382d = Pattern.compile("\\s*|\t|\r|\n");

    public static String m6543a(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null) {
                return "";
            }
            Object obj = null;
            if (applicationInfo.metaData != null) {
                obj = applicationInfo.metaData.get(str);
            }
            if (obj == null) {
                bb.m6313c().m6300a("can't find information in AndroidManifest.xml for key " + str);
                return "";
            }
            return obj.toString();
        } catch (Exception e) {
            return "";
        }
    }

    public static String m6540a(int i, Context context) {
        try {
            return bl.b.m6443c(i, m6541a(context).getBytes());
        } catch (Exception e) {
            return "";
        }
    }

    public static String m6541a(Context context) {
        return f4382d.matcher(bx.m6592a(context)).replaceAll("");
    }

    public static String m6546b(int i, Context context) {
        return bl.b.m6443c(i, CuidUtil.getOaid(context).getBytes());
    }

    public static String m6552c(int i, final Context context) {
        String strM6510v = bp.m6466a().m6510v(context);
        if (TextUtils.isEmpty(strM6510v)) {
            strM6510v = bp.m6466a().m6511w(context);
            ca.m6601a().m6604a(context, new Interfacebz() {
                @Override
                public void mo6589a(String str) {
                    if (!TextUtils.isEmpty(str)) {
                        bp.m6466a().m6503o(context, str);
                    }
                }
            });
        }
        return bl.b.m6443c(i, strM6510v.getBytes());
    }

    public static String m6556d(int i, Context context) {
        return bl.b.m6443c(i, CuidUtil.getIid(context).getBytes());
    }

    public static String m6558e(int i, Context context) {
        return bl.b.m6443c(i, CuidUtil.getGaid(context).getBytes());
    }

    public static String m6560f(int i, Context context) {
        return bl.b.m6443c(i, CuidUtil.getCuid3(context).getBytes());
    }

    public static String m6561g(int i, Context context) {
        return bl.b.m6443c(i, CuidUtil.getSsaid(context).getBytes());
    }

    public static String m6547b(Context context) {
        return bs.a.m6519a(m6541a(context).getBytes()).toUpperCase(Locale.US);
    }

    public static int m6550c(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            displayMetrics = m6557e(context);
        } catch (Exception e) {
        }
        return displayMetrics.widthPixels;
    }

    public static int m6554d(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            displayMetrics = m6557e(context);
        } catch (Exception e) {
        }
        return displayMetrics.heightPixels;
    }

    public static DisplayMetrics m6557e(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static int m6559f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception e) {
            return 1;
        }
    }

    public static String m6562g(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            return "";
        }
    }

    public static String m6564h(Context context) {
        try {
            return (String) context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
        } catch (Exception e) {
            return "";
        }
    }

    public static String m6566i(Context context) {
        String str = String.format("%s_%s_%s", 0, 0, 0);
        try {
            if (bn.m6461e(context, "android.permission.ACCESS_FINE_LOCATION") || bn.m6461e(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                CellLocation cellLocation = ((TelephonyManager) context.getSystemService("phone")).getCellLocation();
                if (cellLocation == null) {
                    return str;
                }
                if (cellLocation instanceof GsmCellLocation) {
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                    return String.format("%s_%s_%s", String.format("%d", Integer.valueOf(gsmCellLocation.getCid())), String.format("%d", Integer.valueOf(gsmCellLocation.getLac())), 0);
                }
                String[] strArrSplit = cellLocation.toString().replace("[", "").replace("]", "").split(",");
                return String.format("%s_%s_%s", strArrSplit[0], strArrSplit[3], strArrSplit[4]);
            }
        } catch (Exception e) {
        }
        return str;
    }

    public static String m6568j(Context context) {
        Location lastKnownLocation;
        try {
            if (bn.m6461e(context, "android.permission.ACCESS_FINE_LOCATION") && (lastKnownLocation = ((LocationManager) context.getSystemService("location")).getLastKnownLocation("gps")) != null) {
                return String.format("%s_%s_%s", Long.valueOf(lastKnownLocation.getTime()), Double.valueOf(lastKnownLocation.getLongitude()), Double.valueOf(lastKnownLocation.getLatitude()));
            }
        } catch (Exception e) {
        }
        return "";
    }

    public static String m6563h(int i, Context context) {
        if (!bu.m6524a().m6532d()) {
            return "";
        }
        String strM6572l = m6572l(context);
        return TextUtils.isEmpty(strM6572l) ? "" : bl.b.m6443c(i, strM6572l.getBytes());
    }

    public static String m6570k(Context context) {
        if (!bu.m6524a().m6532d()) {
            return "";
        }
        if (android.os.Build.VERSION.SDK_INT < 23) {
            return m6572l(context);
        }
        return m6555d();
    }

    public static String m6572l(Context context) {
        WifiInfo connectionInfo;
        if (!bu.m6524a().m6532d()) {
            return "";
        }
        try {
            if (bn.m6461e(context, "android.permission.ACCESS_WIFI_STATE") && (connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo()) != null) {
                String macAddress = connectionInfo.getMacAddress();
                if (!TextUtils.isEmpty(macAddress)) {
                    return macAddress;
                }
            }
        } catch (Exception e) {
        }
        return "";
    }

    @TargetApi(9)
    private static String m6555d() {
        if (android.os.Build.VERSION.SDK_INT < 9) {
            return "";
        }
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b : hardwareAddress) {
                        sb.append(String.format("%02x:", Byte.valueOf(b)));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
        } catch (Throwable th) {
        }
        return "";
    }

    private static String m6539a(byte b) {
        String str = "00" + Integer.toHexString(b) + Config.TRACE_TODAY_VISIT_SPLIT;
        return str.substring(str.length() - 3);
    }

    public static String m6565i(int i, Context context) throws Throwable {
        if (!bu.m6524a().m6532d()) {
            return "";
        }
        String strM6567j = m6567j(i, context);
        String strM6443c = null;
        if (!TextUtils.isEmpty(strM6567j)) {
            strM6443c = bl.b.m6443c(i, strM6567j.getBytes());
        }
        if (TextUtils.isEmpty(strM6443c)) {
            return "";
        }
        return strM6443c;
    }

    public static String m6567j(int i, Context context) throws Throwable {
        if (!bu.m6524a().m6532d()) {
            return "";
        }
        String strM6538a = m6538a();
        if (TextUtils.isEmpty(strM6538a)) {
            strM6538a = m6569k(i, context);
        }
        if (TextUtils.isEmpty(strM6538a)) {
            return "";
        }
        return strM6538a;
    }

    @SuppressLint({"NewApi"})
    public static String m6569k(int i, Context context) {
        byte[] hardwareAddress;
        byte[] hardwareAddress2 = null;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isAnyLocalAddress() && (inetAddressNextElement instanceof Inet4Address) && !inetAddressNextElement.isLoopbackAddress()) {
                        if (inetAddressNextElement.isSiteLocalAddress()) {
                            hardwareAddress = networkInterfaceNextElement.getHardwareAddress();
                        } else {
                            if (!inetAddressNextElement.isLinkLocalAddress()) {
                                hardwareAddress2 = networkInterfaceNextElement.getHardwareAddress();
                                break;
                            }
                            hardwareAddress = hardwareAddress2;
                        }
                        hardwareAddress2 = hardwareAddress;
                    }
                }
            }
        } catch (Exception e) {
        }
        if (hardwareAddress2 != null) {
            for (byte b : hardwareAddress2) {
                stringBuffer.append(m6539a(b));
            }
            return stringBuffer.substring(0, stringBuffer.length() - 1).replaceAll(Config.TRACE_TODAY_VISIT_SPLIT, "");
        }
        String strM6563h = m6563h(i, context);
        if (strM6563h != null) {
            return strM6563h.replaceAll(Config.TRACE_TODAY_VISIT_SPLIT, "");
        }
        return strM6563h;
    }

    public static String m6538a() throws Throwable {
        Throwable th;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        String strReplaceAll = null;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            char[] cArr = new char[20];
            inputStreamReader2 = new InputStreamReader(new FileInputStream("/sys/class/net/eth0/address"));
            while (true) {
                try {
                    int i = inputStreamReader2.read(cArr);
                    if (i == -1) {
                        break;
                    }
                    if (i != cArr.length || cArr[cArr.length - 1] == '\r') {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (cArr[i2] != '\r') {
                                stringBuffer.append(cArr[i2]);
                            }
                        }
                    } else {
                        System.out.print(cArr);
                    }
                } catch (Exception e) {
                    if (inputStreamReader2 != null) {
                        try {
                            inputStreamReader2.close();
                        } catch (Exception e2) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamReader = inputStreamReader2;
                    if (inputStreamReader == null) {
                        throw th;
                    }
                    try {
                        inputStreamReader.close();
                        throw th;
                    } catch (Exception e3) {
                        throw th;
                    }
                }
            }
            strReplaceAll = stringBuffer.toString().trim().replaceAll(Config.TRACE_TODAY_VISIT_SPLIT, "");
            if (inputStreamReader2 != null) {
                try {
                    inputStreamReader2.close();
                } catch (Exception e4) {
                }
            }
        } catch (Exception e5) {
            inputStreamReader2 = null;
        } catch (Throwable th3) {
            th = th3;
            inputStreamReader = null;
        }
        return strReplaceAll;
    }

    public static String m6542a(Context context, int i) {
        String strM6574m = m6574m(context);
        return TextUtils.isEmpty(strM6574m) ? "" : bl.b.m6443c(i, strM6574m.getBytes());
    }

    public static String m6574m(Context context) {
        String name;
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            return (defaultAdapter == null || (name = defaultAdapter.getName()) == null) ? "" : name;
        } catch (Exception e) {
        }
    }

    public static String m6571l(int i, Context context) {
        if (!bu.m6524a().m6532d()) {
            return "";
        }
        String strM6576n = m6576n(context);
        return TextUtils.isEmpty(strM6576n) ? "" : bl.b.m6443c(i, strM6576n.getBytes());
    }

    @SuppressLint({"NewApi"})
    public static String m6576n(Context context) {
        BluetoothAdapter defaultAdapter;
        String address;
        if (!bu.m6524a().m6532d()) {
            return "";
        }
        String str = android.os.Build.BRAND;
        if ("4.1.1".equals(android.os.Build.VERSION.RELEASE) && "TCT".equals(str)) {
            return "";
        }
        try {
            return (!bn.m6461e(context, "android.permission.BLUETOOTH") || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null || (address = defaultAdapter.getAddress()) == null) ? "" : address;
        } catch (Exception e) {
        }
    }

    public static String m6577o(Context context) {
        if (!bu.m6524a().m6532d()) {
            return "";
        }
        String strM6578p = m6578p(context);
        if (TextUtils.isEmpty(strM6578p)) {
            return "";
        }
        return bl.a.m6436a(strM6578p.getBytes());
    }

    public static String m6573m(int i, Context context) {
        if (!bu.m6524a().m6532d()) {
            return "";
        }
        String strM6578p = m6578p(context);
        if (TextUtils.isEmpty(strM6578p)) {
            return "";
        }
        return bl.b.m6444d(i, strM6578p.getBytes());
    }

    public static String m6578p(Context context) {
        boolean zIsProviderEnabled;
        WifiInfo wifiInfo;
        List<ScanResult> scanResults;
        WifiInfo wifiInfo2;
        if (context == null || !bn.m6461e(context, "android.permission.ACCESS_WIFI_STATE")) {
            return "";
        }
        try {
            zIsProviderEnabled = bn.m6461e(context, "android.permission.ACCESS_FINE_LOCATION") ? ((LocationManager) context.getSystemService("location")).isProviderEnabled("gps") : false;
        } catch (Exception e) {
            zIsProviderEnabled = false;
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            try {
                scanResults = wifiManager.getScanResults();
                wifiInfo2 = connectionInfo;
            } catch (Throwable th) {
                wifiInfo = connectionInfo;
                scanResults = null;
                wifiInfo2 = wifiInfo;
            }
        } catch (Throwable th2) {
            wifiInfo = null;
        }
        if (scanResults != null && scanResults.size() != 0) {
            Collections.sort(scanResults, new Comparator<ScanResult>() {
                @Override
                public int compare(ScanResult scanResult, ScanResult scanResult2) {
                    return scanResult2.level - scanResult.level;
                }
            });
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; scanResults != null && i < scanResults.size() && i < 30; i++) {
            try {
                ScanResult scanResult = scanResults.get(i);
                StringBuilder sb = new StringBuilder();
                sb.append(scanResult.BSSID);
                sb.append("|");
                String strReplaceAll = scanResult.SSID.replaceAll("\\|", "");
                if (strReplaceAll.length() > 30) {
                    strReplaceAll = strReplaceAll.substring(0, 30);
                }
                sb.append(strReplaceAll);
                sb.append("|");
                sb.append(scanResult.level);
                sb.append("|");
                sb.append((wifiInfo2 == null || !scanResult.BSSID.equals(wifiInfo2.getBSSID())) ? 0 : 1);
                jSONArray.put(sb.toString());
            } catch (Exception e2) {
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(System.currentTimeMillis());
            sb2.append("|");
            sb2.append(zIsProviderEnabled ? 1 : 0);
            sb2.append("|");
            sb2.append(m6568j(context));
            jSONObject.put("ap-list", jSONArray);
            jSONObject.put("meta-data", sb2.toString());
            return jSONObject.toString();
        } catch (Exception e3) {
            return "";
        }
    }

    public static boolean m6579q(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1);
            return networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnected();
        } catch (Exception e) {
            return false;
        }
    }

    public static String m6580r(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return "";
            }
            String typeName = activeNetworkInfo.getTypeName();
            try {
                if (!typeName.equals("WIFI") && activeNetworkInfo.getSubtypeName() != null) {
                    return activeNetworkInfo.getSubtypeName();
                }
                return typeName;
            } catch (Exception e) {
                return typeName;
            }
        } catch (Exception e2) {
            return "";
        }
    }

    public static boolean m6581s(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (bn.m6461e(context, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    return activeNetworkInfo.isAvailable();
                }
            } catch (Exception e) {
            }
        }
        return false;
    }

    public static String m6582t(Context context) {
        return context != null ? context.getPackageName() : "";
    }

    public static String m6575n(int i, Context context) {
        String strM6582t = m6582t(context);
        if (!TextUtils.isEmpty(strM6582t)) {
            try {
                return bl.b.m6443c(i, strM6582t.getBytes());
            } catch (Exception e) {
            }
        }
        return "";
    }

    private static String m6588z(Context context) {
        String str;
        String str2 = f4379a;
        if (str2 != null) {
            return str2;
        }
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            int i = 0;
            while (true) {
                if (runningAppProcesses != null && i < runningAppProcesses.size()) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningAppProcesses.get(i);
                    if (runningAppProcessInfo == null || runningAppProcessInfo.pid != Process.myPid()) {
                        i++;
                    } else {
                        str = runningAppProcessInfo.processName;
                        break;
                    }
                } else {
                    str = str2;
                    break;
                }
            }
        } catch (Exception e) {
            str = str2;
        }
        if (str == null) {
            str = "";
        }
        f4379a = str;
        return str;
    }

    private static String m6548b(Context context, String str) {
        int iLastIndexOf;
        if (str != null && (iLastIndexOf = str.lastIndexOf(58)) > 0 && iLastIndexOf + 1 < str.length()) {
            return str.substring(iLastIndexOf + 1);
        }
        return null;
    }

    private static String m6553c(Context context, String str) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return null;
        }
        String str2 = applicationInfo.processName;
        if (str2 == null || str2.equals(str)) {
            str = null;
        }
        return str;
    }

    public static String m6583u(Context context) {
        String strM6548b = f4380b;
        if (strM6548b == null) {
            String strM6588z = m6588z(context);
            strM6548b = m6548b(context, strM6588z);
            if (TextUtils.isEmpty(strM6548b)) {
                strM6548b = m6553c(context, strM6588z);
            }
            if (strM6548b == null) {
                strM6548b = "";
            }
            f4380b = strM6548b;
        }
        return strM6548b;
    }

    public static String m6584v(Context context) {
        ServiceInfo[] serviceInfoArr;
        String str = "";
        String strM6588z = m6588z(context);
        if (strM6588z == null) {
            return "";
        }
        PackageInfo packageInfo = null;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4);
        } catch (Exception e) {
        }
        if (packageInfo == null || (serviceInfoArr = packageInfo.services) == null) {
            return "";
        }
        for (ServiceInfo serviceInfo : serviceInfoArr) {
            if (strM6588z.equals(serviceInfo.processName)) {
                str = serviceInfo.name;
                break;
            }
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static boolean m6585w(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
        } catch (Exception e) {
            return false;
        }
    }

    public static String m6586x(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Config.MODEL, memoryInfo.availMem);
            jSONObject.put("l", memoryInfo.lowMemory);
            jSONObject.put("t", memoryInfo.threshold);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("app_mem", jSONArray);
            jSONObject2.put("meta-data", sb.toString());
            return bl.a.m6436a(jSONObject2.toString().getBytes());
        } catch (Exception e) {
            return "";
        }
    }

    public static String m6545b() throws Throwable {
        if (f4381c != null) {
            return f4381c;
        }
        String str = "";
        if (!TextUtils.isEmpty(m6549b("ro.miui.ui.version.name"))) {
            str = "miui";
        } else if (!TextUtils.isEmpty(m6549b("ro.build.version.opporom"))) {
            str = "coloros";
        } else if (!TextUtils.isEmpty(m6549b("ro.build.version.emui"))) {
            str = "emui";
        } else if (!TextUtils.isEmpty(m6549b("ro.vivo.os.version"))) {
            str = "funtouch";
        } else if (!TextUtils.isEmpty(m6549b("ro.smartisan.version"))) {
            str = "smartisan";
        }
        if (TextUtils.isEmpty(str)) {
            String strM6549b = m6549b("ro.build.display.id");
            if (!TextUtils.isEmpty(strM6549b) && strM6549b.contains("Flyme")) {
                str = "flyme";
            }
        }
        f4381c = str;
        return f4381c;
    }

    private static String m6549b(String str) throws Throwable {
        Throwable th;
        Process process;
        BufferedReader bufferedReader;
        Process processExec;
        BufferedReader bufferedReader2;
        String line = null;
        try {
            processExec = Runtime.getRuntime().exec("getprop " + str);
            try {
                bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 1024);
                try {
                    line = bufferedReader2.readLine();
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (Exception e) {
                        }
                    }
                    if (processExec != null) {
                        processExec.destroy();
                    }
                } catch (Exception e2) {
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (Exception e3) {
                        }
                    }
                    if (processExec != null) {
                        processExec.destroy();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    process = processExec;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e4) {
                        }
                    }
                    if (process == null) {
                        throw th;
                    }
                    process.destroy();
                    throw th;
                }
            } catch (Exception e5) {
                bufferedReader2 = null;
            } catch (Throwable th3) {
                th = th3;
                process = processExec;
                bufferedReader = null;
            }
        } catch (Exception e6) {
            processExec = null;
            bufferedReader2 = null;
        } catch (Throwable th4) {
            th = th4;
            process = null;
            bufferedReader = null;
        }
        return line;
    }

    public static Boolean m6551c() {
        Object objInvoke;
        try {
            Class<?> cls = Class.forName("com.baidu.disasterrecovery.MtjAdapter");
            if (cls == null || (objInvoke = cls.getDeclaredMethod("shouldUploadOther", new Class[0]).invoke(null, new Object[0])) == null || !(objInvoke instanceof Boolean)) {
                return true;
            }
            return (Boolean) objInvoke;
        } catch (Exception e) {
            return true;
        }
    }

    public static String m6587y(Context context) {
        if (!bu.m6524a().m6532d()) {
            return "";
        }
        try {
            String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
            try {
                if (!TextUtils.isEmpty(deviceId)) {
                    return bl.b.m6443c(1, deviceId.getBytes());
                }
                return deviceId;
            } catch (Exception e) {
                return deviceId;
            }
        } catch (Exception e2) {
            return "";
        }
    }

    public static String m6544a(String str) {
        return bl.b.m6443c(1, str.getBytes());
    }
}
