package com.a.b.a.b;

import com.a.b.e.c.Abstracta;
import com.a.b.e.c.Abstractx;
import com.a.b.e.c.ab;
import com.a.b.e.c.ad;
import com.a.b.e.c.ae;
import com.a.b.e.c.ClassR;
import com.a.b.e.c.ClassY;
import com.a.b.e.d.ClassC;
import com.a.b.g.ClassD;
import com.a.b.g.ClassN;
import java.util.ArrayList;

public final class ClassB implements Interfacen {

    private final ClassO f1848a;

    private final int[] f1849b;

    private final int[] f1850c;

    private final int[] f1851d;

    private final ClassN[] f1852e;

    private final ClassH[] f1853f;

    private int f1854g;

    private ClassB(ClassO c0943o) {
        if (c0943o == null) {
            throw new NullPointerException("method == null");
        }
        this.f1848a = c0943o;
        int iM3992b = c0943o.m4008m().m3992b() + 1;
        this.f1849b = ClassD.m5423a(iM3992b);
        this.f1850c = ClassD.m5423a(iM3992b);
        this.f1851d = ClassD.m5423a(iM3992b);
        this.f1852e = new ClassN[iM3992b];
        this.f1853f = new ClassH[iM3992b];
        this.f1854g = -1;
    }

    public static ClassG m3948a(ClassO c0943o) {
        ClassB c0930b = new ClassB(c0943o);
        c0930b.m3953c();
        return c0930b.m3951b();
    }

    private void m3949a(int i, int i2, boolean z) {
        ClassD.m5424b(this.f1850c, i);
        if (z) {
            m3950a(i + i2, false);
        } else {
            ClassD.m5424b(this.f1851d, i + i2);
        }
    }

    private void m3950a(int i, boolean z) {
        if (!ClassD.m5421a(this.f1850c, i)) {
            ClassD.m5424b(this.f1849b, i);
        }
        if (z) {
            ClassD.m5424b(this.f1851d, i);
        }
    }

    private ClassG m3951b() {
        int i;
        ClassH c0936h;
        ClassF[] c0934fArr = new ClassF[this.f1848a.m4008m().m3992b()];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iM5428d = ClassD.m5428d(this.f1851d, i2 + 1);
            if (iM5428d < 0) {
                break;
            }
            if (ClassD.m5421a(this.f1850c, i2)) {
                ClassN c1316nM5493a = null;
                int i4 = iM5428d - 1;
                while (true) {
                    if (i4 < i2) {
                        i4 = -1;
                        break;
                    }
                    c1316nM5493a = this.f1852e[i4];
                    if (c1316nM5493a != null) {
                        break;
                    }
                    i4--;
                }
                if (c1316nM5493a == null) {
                    c1316nM5493a = ClassN.m5493a(iM5428d);
                    c0936h = ClassH.f1864a;
                } else {
                    c0936h = this.f1853f[i4];
                    if (c0936h == null) {
                        c0936h = ClassH.f1864a;
                    }
                }
                c0934fArr[i3] = new ClassF(i2, i2, iM5428d, c1316nM5493a, c0936h);
                i = i3 + 1;
            } else {
                i = i3;
            }
            i2 = iM5428d;
            i3 = i;
        }
        ClassG c0935g = new ClassG(i3);
        for (int i5 = 0; i5 < i3; i5++) {
            c0935g.m3967a(i5, c0934fArr[i5]);
        }
        return c0935g;
    }

    private void m3952b(int i, int i2, boolean z) {
        int i3 = i + i2;
        if (z) {
            m3950a(i3, true);
        }
        ClassH c0936hM3975b = this.f1848a.m4009n().m3975b(i);
        this.f1853f[i] = c0936hM3975b;
        ClassN[] c1316nArr = this.f1852e;
        if (!z) {
            i3 = -1;
        }
        c1316nArr[i] = c0936hM3975b.m3976c(i3);
    }

    private void m3953c() {
        ClassK c0939kM4008m = this.f1848a.m4008m();
        ClassH c0936hM4009n = this.f1848a.m4009n();
        int iD_ = c0936hM4009n.m5476d_();
        ClassD.m5424b(this.f1849b, 0);
        ClassD.m5424b(this.f1851d, 0);
        while (!ClassD.m5425b(this.f1849b)) {
            try {
                c0939kM4008m.m3991a(this.f1849b, this);
                for (int i = 0; i < iD_; i++) {
                    ClassI c0937iM3971a = c0936hM4009n.m3971a(i);
                    int iM3977a = c0937iM3971a.m3977a();
                    int iM3979b = c0937iM3971a.m3979b();
                    if (ClassD.m5422a(this.f1850c, iM3977a, iM3979b)) {
                        ClassD.m5424b(this.f1851d, iM3977a);
                        ClassD.m5424b(this.f1851d, iM3979b);
                        m3950a(c0937iM3971a.m3980c(), true);
                    }
                }
            } catch (IllegalArgumentException e) {
                throw new al("flow of control falls off end of method", e);
            }
        }
    }

    @Override
    public int mo3928a() {
        return this.f1854g;
    }

    @Override
    public void mo3929a(int i) {
        this.f1854g = i;
    }

    @Override
    public void mo3930a(int i, int i2, int i3) {
        m3949a(i2, i3, true);
    }

    @Override
    public void mo3931a(int i, int i2, int i3, int i4) {
        switch (i) {
            case 167:
                m3949a(i2, i3, false);
                this.f1852e[i2] = ClassN.m5493a(i4);
                break;
            case 168:
                m3950a(i2, true);
            default:
                int i5 = i2 + i3;
                m3949a(i2, i3, true);
                m3950a(i5, true);
                this.f1852e[i2] = ClassN.m5494a(i5, i4);
                break;
        }
        m3950a(i4, true);
    }

    @Override
    public void mo3932a(int i, int i2, int i3, int i4, ClassC c1236c, int i5) {
        if (i != 169) {
            m3949a(i2, i3, true);
        } else {
            m3949a(i2, i3, false);
            this.f1852e[i2] = ClassN.f3497a;
        }
    }

    @Override
    public void mo3933a(int i, int i2, int i3, ao c0928ao, int i4) {
        m3949a(i2, i3, false);
        m3950a(c0928ao.m3941b(), true);
        int iM3938a = c0928ao.m3938a();
        for (int i5 = 0; i5 < iM3938a; i5++) {
            m3950a(c0928ao.m3942b(i5), true);
        }
        this.f1852e[i2] = c0928ao.m3945d();
    }

    @Override
    public void mo3934a(int i, int i2, int i3, Abstracta abstractC1200a, int i4) {
        m3949a(i2, i3, true);
        if ((abstractC1200a instanceof Abstractx) || (abstractC1200a instanceof ae) || (abstractC1200a instanceof ad) || (abstractC1200a instanceof ClassR) || (abstractC1200a instanceof ClassY) || (abstractC1200a instanceof ab)) {
            m3952b(i2, i3, true);
        }
    }

    @Override
    public void mo3935a(int i, int i2, int i3, ClassC c1236c) {
        switch (i) {
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 190:
            case 194:
            case 195:
                m3949a(i2, i3, true);
                m3952b(i2, i3, true);
                break;
            case 108:
            case 112:
                m3949a(i2, i3, true);
                if (c1236c == ClassC.f3255f || c1236c == ClassC.f3256g) {
                    m3952b(i2, i3, true);
                }
                break;
            case 172:
            case 177:
                m3949a(i2, i3, false);
                this.f1852e[i2] = ClassN.f3497a;
                break;
            case 191:
                m3949a(i2, i3, false);
                m3952b(i2, i3, false);
                break;
            default:
                m3949a(i2, i3, true);
                break;
        }
    }

    @Override
    public void mo3936a(int i, int i2, ae c1205ae, ArrayList arrayList) {
        m3949a(i, i2, true);
        m3952b(i, i2, true);
    }
}
