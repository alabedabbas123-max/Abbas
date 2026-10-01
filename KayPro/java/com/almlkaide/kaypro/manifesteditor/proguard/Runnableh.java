package com.almlkaide.kaypro.manifesteditor.proguard;

import com.aide.common.h;
import com.aide.ui.build.android.X;
import com.almlkaide.kaypro.aide.AdvancedSetting;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.aide.util.AndResGuard;
import com.almlkaide.kaypro.aide.util.ProjectUtils;
import com.almlkaide.kaypro.aide.util.StringFog;
import com.almlkaide.kaypro.util.Utils;
import java.io.File;
import a.j.ClassL;

class Runnableh implements Runnable {

    final ClassC f3650a;

    private final String f3651b;

    private final String[] f3652c;

    private final String[] f3653d;

    private final String f3654e;

    private final String f3655f;

    private final boolean f3656g;

    private final X f3657h;

    private final String[] f3658i;

    private final String f3659j;

    private final String[] f3660k;

    private final String f3661l;

    private final String f3662m;

    private final String f3663n;

    private final String f3664o;

    private final String f3665p;

    private final boolean f3666q;

    private final boolean f3667r;

    Runnableh(ClassC c1356c, String str, String[] strArr, String[] strArr2, String str2, String str3, boolean z, X x, String[] strArr3, String str4, String[] strArr4, String str5, String str6, String str7, String str8, String str9, boolean z2, boolean z3) {
        this.f3650a = c1356c;
        this.f3651b = str;
        this.f3652c = strArr;
        this.f3653d = strArr2;
        this.f3654e = str2;
        this.f3655f = str3;
        this.f3656g = z;
        this.f3657h = x;
        this.f3658i = strArr3;
        this.f3659j = str4;
        this.f3660k = strArr4;
        this.f3661l = str5;
        this.f3662m = str6;
        this.f3663n = str7;
        this.f3664o = str8;
        this.f3665p = str9;
        this.f3666q = z2;
        this.f3667r = z3;
    }

    public void proguard() {
        String str = this.f3651b;
        String[] strArr = this.f3652c;
        String[] strArr2 = this.f3653d;
        String str2 = this.f3654e;
        String str3 = this.f3655f;
        boolean z = this.f3656g;
        if (ClassA.m5764a()) {
            ClassL.m3162b();
            try {
                try {
                    ClassA c1354a = new ClassA(str2, this.f3650a);
                    c1354a.m5768a(str, strArr2, strArr);
                    ClassB c1355bM5767a = c1354a.m5767a(z, str3);
                    str = c1355bM5767a.f3637b;
                    strArr = c1355bM5767a.f3638c;
                    str3 = c1355bM5767a.f3639d;
                    strArr2 = c1355bM5767a.f3636a;
                    this.f3650a.m5772a(str2);
                } catch (Exception e) {
                    h.j6(e);
                    this.f3650a.m5774DW();
                    this.f3650a.m5772a(str2);
                    return;
                }
            } catch (Throwable th) {
                this.f3650a.m5772a(str2);
                throw th;
            }
        }
        this.f3650a.m5773b(this.f3657h, str, strArr, this.f3658i, strArr2, str2, str3, this.f3659j, this.f3660k, this.f3661l, this.f3662m, this.f3663n, this.f3664o, this.f3665p, z, this.f3666q, this.f3667r);
    }

    @Override
    public void run() {
        Throwable th = (Throwable) null;
        try {
            File currentProject = ProjectUtils.getCurrentProject();
            if (AdvancedSetting.isEnableResGuard()) {
                AIDEUtils.updateBuild(this.f3650a, "混淆Res资源...");
                AndResGuard.proguard(currentProject);
            }
            if (AdvancedSetting.isEnableStringFog()) {
                AIDEUtils.updateBuild(this.f3650a, "加密Dex字符串...");
                StringFog.doFog(currentProject);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (th != null) {
            this.f3650a.onCallback(Utils.getStackTrace(th));
        } else {
            if (AIDEUtils.isUseProguard()) {
                AIDEUtils.updateBuild(this.f3650a, "混淆Dex...");
            }
            proguard();
        }
    }
}
