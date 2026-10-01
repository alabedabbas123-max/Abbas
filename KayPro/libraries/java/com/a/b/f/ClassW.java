package com.a.b.f;

import com.a.b.e.b.Abstractf;
import com.a.b.e.b.ClassU;
import com.a.b.e.c.ClassP;
import java.util.HashSet;

public class ClassW {

    private final ap f3462a;

    private ClassW(ap c1270ap) {
        this.f3462a = c1270ap;
    }

    public int m5394a(ClassZ c1302z) {
        return ((ClassP) ((Abstractf) c1302z.mo5174f()).m4833g_()).m5002i_();
    }

    private void m5396a() {
        ClassU[] c1194uArr = new ClassU[this.f3462a.m5295h()];
        HashSet hashSet = new HashSet();
        this.f3462a.m5280a(new ClassX(this, c1194uArr, hashSet));
        this.f3462a.m5281a(hashSet);
    }

    public static void m5397a(ap c1270ap) {
        new ClassW(c1270ap).m5396a();
    }
}
