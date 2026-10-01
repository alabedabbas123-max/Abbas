package com;

import abcd.Vi1;
import android.content.Context;
import android.util.Log;
import com.almlkaide.kaypro.aide.AideR;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.zip.ZipFile;
import org.c.a.a.ClassA;
import org.c.a.a.a.b.ClassB;
import org.c.a.a.c.c.a.b.ClassA;

public class ClassA {

    public static int f1729a = AideR.layout.completion_list_entry;

    public static int f1730b = AideR.C1673id.completionEntryImage;

    public static int f1731c = AideR.C1673id.completionEntryName;

    public static int f1732d = AideR.C1673id.completionHelpButton;

    public static int f1733e = AideR.style.ActivityActionbarThemeLight;

    public static int m3747a(InputStream inputStream, byte[] bArr) {
        int i = inputStream.read() & 255;
        if (i == 255) {
            return 0;
        }
        int i2 = 1;
        bArr[0] = (byte) i;
        if ((i & 128) == 0) {
            return 1;
        }
        while ((i & 64) != 0) {
            bArr[i2] = (byte) inputStream.read();
            i <<= 1;
            i2++;
        }
        return i2;
    }

    public static Reader m3748a(String str, String str2, String str3) {
        if (!str.toLowerCase().endsWith(".jar") || !str2.toLowerCase().endsWith(".class")) {
            return null;
        }
        try {
            ZipFile zipFile = new ZipFile(str);
            if (zipFile.getEntry(str2) != null) {
                return m3749a(zipFile, str2);
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    private static Reader m3749a(ZipFile zipFile, String str) {
        String strSubstring = str.substring(1, str.length() - 6);
        ClassC c1579c = new ClassC(zipFile);
        ClassA.f6261a = true;
        ClassB c1820b = new ClassB();
        new ClassA().m7560a(c1579c, c1820b, strSubstring);
        return new StringReader(c1820b.m7578e().toString());
    }

    public static void m3750a(Context context, String str) {
        AIDEUtils.launcherPermissionEditor(context, str);
    }

    public static void m3751a(Object obj) {
        Log.i("4455JKJH", obj.toString());
    }

    public static void m3752a(List list) {
        int iIndexOf = list.indexOf("-F");
        if (iIndexOf == -1) {
            return;
        }
        String strReplace = ((String) list.get(iIndexOf + 1)).replace("resources.ap_", "aapt_rules.txt");
        list.add("-G");
        list.add(strReplace);
    }

    public static void m3753a(List list, String str) {
        if (Vi1.m3318BT(str)) {
            list.add("NDK_PROJECT_PATH=.");
            list.add("APP_BUILD_SCRIPT=src/main/jni/Android.mk");
            list.add("NDK_APP_OUT=src/main/obj");
            list.add("NDK_LIBS_OUT=src/main/jniLibs");
            if (new File(str, "src/main/jni/Application.mk").exists()) {
                list.add("NDK_APPLICATION_MK=src/main/jni/Application.mk");
            }
        }
        Log.i("NATIVE", list + str);
    }

    public static boolean m3754a(String str) {
        return str.endsWith("/AndroidManifest.xml");
    }
}
