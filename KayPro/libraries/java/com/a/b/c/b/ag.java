package com.a.b.c.b;

import com.a.b.e.b.ClassK;
import com.a.b.e.b.ClassR;
import com.a.b.e.c.ClassP;

class ag extends ClassK {

    private final boolean[] f2040a;

    private final int f2041b;

    private final int f2042c;

    ag(boolean[] zArr, int i, int i2) {
        this.f2040a = zArr;
        this.f2041b = i;
        this.f2042c = i2;
    }

    @Override
    public void mo4300a(ClassR c1191r) {
        if (c1191r.m4840f().m4737a() == 3) {
            this.f2040a[0] = this.f2040a[0] && ((ClassP) c1191r.m4833g_()).m5002i_() + (this.f2041b - this.f2042c) == c1191r.m4842h().m4894g();
        }
    }
}
