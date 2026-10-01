package com.almlkaide.kaypro.manifesteditor.proguard;

import a.ag;
import a.ah;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.aide.ui.U;
import com.aide.ui.build.android.E;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import a.ClassH;
import a.ClassK;

public class ClassA {

    private static byte[] f3629f = new byte[2048];

    private static String f3630g;

    private final String f3631a;

    private final String f3632b;

    private final String f3633c;

    private final E f3634d;

    private String[] f3635e;

    public ClassA(String str, E e) {
        this.f3634d = e;
        this.f3631a = String.valueOf(str) + "/aapt_rules.txt";
        this.f3633c = String.valueOf(str) + "/proguard";
        File file = new File(str);
        this.f3632b = new File(str, "injected").exists() ? new File(file.getParentFile().getParent(), "proguard-rules.pro").getAbsolutePath() : new File(file.getParent(), "proguard.cfg").getAbsolutePath();
    }

    private static void m5759a(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    m5759a(file2);
                }
            }
            file.delete();
        }
    }

    private static void m5760a(File file, File file2) throws IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                m5766b(file, file2);
                return;
            }
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                String name = file3.getName();
                if (!file3.isFile() || name.endsWith(".class")) {
                    m5760a(file3, new File(file2, name));
                }
            }
        }
    }

    private static void m5761a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = f3629f;
        synchronized (bArr) {
            while (true) {
                int i = inputStream.read(bArr);
                if (i > 0) {
                    outputStream.write(bArr, 0, i);
                }
            }
        }
    }

    private static void m5762a(String str, String[] strArr, List list) throws IOException {
        for (String absolutePath : strArr) {
            File file = new File(absolutePath);
            file.getName();
            File parentFile = file.getParentFile();
            String name = parentFile.getName();
            list.add(str);
            if (name.endsWith(".exploded.aar")) {
                File file2 = new File(parentFile.getParentFile(), name.replace(".exploded.aar", ".tmp.jar"));
                if (!file2.exists()) {
                    m5766b(file, file2);
                }
                absolutePath = file2.getAbsolutePath();
            }
            list.add(absolutePath);
            m5763a(list, parentFile + "/proguard.txt");
        }
    }

    private static void m5763a(List list, String str) {
        if (new File(str).exists()) {
            list.add("-include");
            list.add(str);
        }
    }

    public static boolean m5764a() {
        Context contextZo = U.Zo();
        SharedPreferences sharedPreferences = contextZo.getSharedPreferences(String.valueOf(contextZo.getPackageName()) + "_preferences", 0);
        f3630g = U.vy().Zo();
        boolean z = sharedPreferences.getBoolean("use_proguard", false);
        Log.i("PROGUARD", String.valueOf(z));
        return z;
    }

    private static String m5765b() throws IOException {
        File file = new File(new File(U.DW().j6()).getParentFile(), "proguard-android.txt");
        if (!file.exists()) {
            InputStream resourceAsStream = ClassA.class.getResourceAsStream("/proguard/proguard-android.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            m5761a(resourceAsStream, fileOutputStream);
            resourceAsStream.close();
            fileOutputStream.close();
        }
        return file.getAbsolutePath();
    }

    private static void m5766b(File file, File file2) throws IOException {
        if (!file2.exists() || file2.lastModified() <= file.lastModified()) {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            m5761a(fileInputStream, fileOutputStream);
            fileInputStream.close();
            fileOutputStream.close();
        }
    }

    public ClassB m5767a(boolean z, String str) throws ag {
        File file = new File(this.f3633c);
        if (z) {
            m5759a(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        ClassH c0467h = new ClassH();
        new ClassK(this.f3635e, System.getProperties()).m3220a(c0467h);
        new ah(c0467h).a();
        File[] fileArrListFiles = file.listFiles();
        int length = fileArrListFiles == null ? 0 : fileArrListFiles.length;
        ArrayList arrayList = new ArrayList(length);
        if (length > 0) {
            for (File file2 : fileArrListFiles) {
                String absolutePath = file2.getAbsolutePath();
                if (absolutePath.endsWith(".jar")) {
                    arrayList.add(absolutePath);
                }
            }
        }
        return new ClassB(arrayList, this.f3633c, String.valueOf(str) + "_proguard");
    }

    public void m5768a(String str, String[] strArr, String[] strArr2) throws IOException {
        ArrayList arrayList = new ArrayList();
        File file = new File(String.valueOf(str) + "_proguard");
        m5760a(new File(str), file);
        arrayList.add("-injars");
        arrayList.add(file.getAbsolutePath());
        for (String str2 : strArr2) {
            if (!str2.equals(str)) {
                m5760a(new File(str2), file);
            }
        }
        m5762a("-injars", strArr, arrayList);
        m5763a(arrayList, m5765b());
        m5763a(arrayList, this.f3631a);
        m5763a(arrayList, this.f3632b);
        arrayList.add("-libraryjars");
        arrayList.add(f3630g);
        arrayList.add("-outjars");
        String str3 = this.f3633c;
        arrayList.add(str3);
        arrayList.add("-printseeds");
        arrayList.add(String.valueOf(str3) + ".seeds.txt");
        arrayList.add("-printusage");
        arrayList.add(String.valueOf(str3) + ".usage.txt");
        arrayList.add("-printmapping");
        arrayList.add(String.valueOf(str3) + ".mapping.txt");
        this.f3635e = new String[arrayList.size()];
        arrayList.toArray(this.f3635e);
        Log.i("PROGUARD", arrayList.toString());
    }
}
