package com.almlkaide.kaypro.manifesteditor.proguard;

import com.aide.ui.build.android.X;

class Runnablei implements Runnable {

    final ClassC f3668a;

    private final X f3669b;

    private final String f3670c;

    private final String[] f3671d;

    private final String[] f3672e;

    private final String[] f3673f;

    private final String f3674g;

    private final String f3675h;

    private final String f3676i;

    private final String[] f3677j;

    private final String f3678k;

    private final String f3679l;

    private final String f3680m;

    private final String f3681n;

    private final String f3682o;

    private final boolean f3683p;

    private final boolean f3684q;

    private final boolean f3685r;

    Runnablei(ClassC c1356c, X x, String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4, String[] strArr4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3) {
        this.f3668a = c1356c;
        this.f3669b = x;
        this.f3670c = str;
        this.f3671d = strArr;
        this.f3672e = strArr2;
        this.f3673f = strArr3;
        this.f3674g = str2;
        this.f3675h = str3;
        this.f3676i = str4;
        this.f3677j = strArr4;
        this.f3678k = str5;
        this.f3679l = str6;
        this.f3680m = str7;
        this.f3681n = str8;
        this.f3682o = str9;
        this.f3683p = z;
        this.f3684q = z2;
        this.f3685r = z3;
    }

    @Override
    public void run() {
        this.f3669b.j6(this.f3670c, this.f3671d, this.f3672e, this.f3673f, this.f3674g, this.f3675h, this.f3676i, this.f3677j, this.f3678k, this.f3679l, this.f3680m, this.f3681n, this.f3682o, this.f3683p, this.f3684q, this.f3685r);
        this.f3669b.DW();
    }
}
