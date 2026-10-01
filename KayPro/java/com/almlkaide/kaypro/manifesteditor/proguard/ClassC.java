package com.almlkaide.kaypro.manifesteditor.proguard;

import com.aide.ui.build.android.fb;
import com.aide.ui.U;
import com.aide.ui.build.android.B;
import com.aide.ui.build.android.E;
import com.aide.ui.build.android.X;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import a.j.ClassL;

public class ClassC implements E {

    private static final ExecutorService f3640b = Executors.newSingleThreadExecutor();

    private final B f3641a;

    public ClassC(B b) {
        this.f3641a = b;
    }

    public void m5772a(String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str, "proguard.log"));
            fileOutputStream.write(ClassL.m3163c().getBytes());
            fileOutputStream.close();
        } catch (IOException e) {
        }
    }

    public void m5773b(X x, String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4, String[] strArr4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3) {
        U.j6(new Runnablei(this, x, str, strArr, strArr2, strArr3, str2, str3, str4, strArr4, str5, str6, str7, str8, str9, z, z2, z3));
    }

    public void m5774DW() {
        U.j6(new Runnabled(this));
    }

    public void m5775FH() {
        U.j6(new Runnablee(this));
    }

    public void m5776a(X x, String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4, String[] strArr4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3) {
        fb.m5817j6(this.f3641a, "Proguarding...", 50, false);
        f3640b.execute(new Runnableh(this, str, strArr, strArr3, str2, str3, z, x, strArr2, str4, strArr4, str5, str6, str7, str8, str9, z2, z3));
    }

    public void m5777j6(Map map) {
        U.j6(new Runnablef(this, map));
    }

    public void m5778j6(boolean z) {
        U.j6(new Runnableg(this, z));
    }

    public void onCallback(String str) {
        U.j6(new callback(this, str));
    }
}
