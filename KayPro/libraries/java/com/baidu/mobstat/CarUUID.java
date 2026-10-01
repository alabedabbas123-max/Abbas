package com.baidu.mobstat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Environment;
import android.os.Process;
import android.system.Os;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

public class CarUUID {

    private static final Pattern f3878a = Pattern.compile("(\\w{32})");

    public static String optUUID(Context context) throws Throwable {
        String strM5853b = m5853b(context);
        if (strM5853b == null) {
            String strM5855c = m5855c(context);
            if (strM5855c != null) {
                m5850a(context, strM5855c);
                return strM5855c;
            }
            String strM5857d = m5857d(context);
            if (strM5857d != null) {
                m5850a(context, strM5857d);
                m5854b(context, strM5857d);
                return strM5857d;
            }
            String strM5848a = m5848a(context);
            if (strM5848a != null) {
                m5850a(context, strM5848a);
                m5854b(context, strM5848a);
                return strM5848a;
            }
            return "";
        }
        return strM5853b;
    }

    private static String m5848a(Context context) {
        return UUID.randomUUID().toString().replace("-", "");
    }

    private static String m5853b(Context context) {
        return m5849a(context.getFileStreamPath("libdueros_uuid.so"));
    }

    private static String m5855c(Context context) {
        if (!m5856c(context, "android.permission.READ_EXTERNAL_STORAGE")) {
            return null;
        }
        return m5849a(new File(new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig"), ".dueros_uuid"));
    }

    private static String m5857d(Context context) {
        String strM5849a;
        List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(0);
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        for (ApplicationInfo applicationInfo2 : installedApplications) {
            if (!applicationInfo.packageName.equals(applicationInfo2.packageName) && (strM5849a = m5849a(new File(new File(applicationInfo2.dataDir, "files"), "libdueros_uuid.so"))) != null) {
                return strM5849a;
            }
        }
        return null;
    }

    private static boolean m5850a(Context context, String str) {
        FileOutputStream fileOutputStream;
        try {
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("libdueros_uuid.so", android.os.Build.VERSION.SDK_INT >= 21 ? 0 : 1);
                try {
                    if (m5852a(fileOutputStreamOpenFileOutput, str)) {
                        if (android.os.Build.VERSION.SDK_INT >= 21) {
                            boolean z = m5851a(new File(context.getApplicationInfo().dataDir), 457) && m5851a(context.getFileStreamPath("libdueros_uuid.so"), 484);
                            bt.m6522a(fileOutputStreamOpenFileOutput);
                            return z;
                        }
                        bt.m6522a(fileOutputStreamOpenFileOutput);
                        return true;
                    }
                    bt.m6522a(fileOutputStreamOpenFileOutput);
                } catch (Exception e) {
                    fileOutputStream = fileOutputStreamOpenFileOutput;
                    bt.m6522a(fileOutputStream);
                }
            } catch (Throwable th) {
                bt.m6522a(null);
                throw th;
            }
        } catch (Exception e2) {
            fileOutputStream = null;
        }
        return false;
    }

    private static boolean m5854b(Context context, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        boolean zM5852a = false;
        if (m5856c(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            FileOutputStream fileOutputStream2 = null;
            try {
                fileOutputStream = new FileOutputStream(new File(new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig"), ".dueros_uuid"));
                try {
                    zM5852a = m5852a(fileOutputStream, str);
                    bt.m6522a(fileOutputStream);
                } catch (Exception e) {
                    bt.m6522a(fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    bt.m6522a(fileOutputStream2);
                    throw th;
                }
            } catch (Exception e2) {
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return zM5852a;
    }

    private static String m5849a(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        if (file != null && file.exists()) {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    String str = new String(bArr, 0, fileInputStream.read(bArr));
                    if (!f3878a.matcher(str).matches()) {
                        str = null;
                    }
                    bt.m6522a(fileInputStream);
                    return str;
                } catch (Exception e) {
                    fileInputStream2 = fileInputStream;
                    bt.m6522a(fileInputStream2);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bt.m6522a(fileInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                fileInputStream2 = null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
        }
        return null;
    }

    private static boolean m5852a(FileOutputStream fileOutputStream, String str) {
        try {
            fileOutputStream.write(str.getBytes());
            fileOutputStream.flush();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    private static boolean m5851a(File file, int i) {
        if (android.os.Build.VERSION.SDK_INT < 21) {
            return true;
        }
        try {
            Os.chmod(file.getAbsolutePath(), i);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean m5856c(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
