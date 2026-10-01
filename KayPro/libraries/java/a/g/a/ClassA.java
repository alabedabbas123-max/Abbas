package a.g.a;

import a.b.a.a;
import a.b.a.d.i;
import a.b.a.d.l;
import a.b.a.h;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.Interfacej;
import a.b.c.ClassV;
import a.b.d.Abstractc;
import a.b.d.ClassA;
import a.b.d.ClassB;
import a.b.d.ClassH;
import a.d.a.ad;
import a.j.ClassL;

public class ClassA extends w implements i, l {

    private final ClassJ f732a;

    private final boolean f733b;

    private final d f734c;

    private final d f735d;

    private final ClassG f736e;

    private final ClassC f737f;

    private final ClassE f738g;

    private final ClassF f739h;

    private final ClassD f740i;

    private final ClassV f741j;

    public ClassA() {
        this(new ClassV(), true, (d) null, (d) null);
    }

    public ClassA(ClassJ c0337j, boolean z, d dVar, d dVar2) {
        C0329b c0329b = null;
        this.f736e = new ClassG(this);
        this.f737f = new ClassC(this);
        this.f738g = new ClassE(this);
        this.f739h = new ClassF(this);
        this.f740i = new ClassD(this);
        this.f741j = new ClassV(false, true);
        this.f732a = c0337j;
        this.f733b = z;
        this.f734c = dVar;
        this.f735d = dVar2;
    }

    public ClassA(ClassV c0349v, boolean z, d dVar, d dVar2) {
        this(new ClassJ(c0349v, z), true, dVar, dVar2);
    }

    private byte m1885a(int i) {
        switch (i) {
            case 1:
                return (byte) 3;
            case 2:
                return (byte) 9;
            case 3:
                return (byte) 11;
            case 4:
                return (byte) 14;
            case 5:
            case 6:
                return (byte) 1;
            default:
                throw new IllegalArgumentException("No push opcode for computational type [" + i + "]");
        }
    }

    public void m1887a(int i, boolean z, boolean z2, int i2) {
        m1888a(i, z, z2, new ClassH(m1885a(i2)));
    }

    private void m1888a(int i, boolean z, boolean z2, Abstractc abstractC0048c) {
        if (z) {
            this.f741j.m311b(i, abstractC0048c);
            if (this.f735d == null || this.f732a.m2123b(i)) {
                return;
            }
            abstractC0048c.mo324a(null, null, null, i, this.f735d);
            return;
        }
        if (z2) {
            this.f741j.m278a(i, abstractC0048c);
        } else {
            this.f741j.m315c(i, abstractC0048c);
        }
        if (this.f735d != null) {
            abstractC0048c.mo324a(null, null, null, i, this.f735d);
        }
    }

    private void m1889a(int i, boolean z, boolean z2, Abstractc abstractC0048c, Abstractc[] abstractC0048cArr) {
        if (z) {
            this.f741j.m316c(i, abstractC0048cArr);
            if (this.f735d == null) {
                return;
            }
            if (!this.f732a.m2123b(i)) {
                abstractC0048c.mo324a(null, null, null, i, this.f735d);
            }
            int i2 = 1;
            while (true) {
                int i3 = i2;
                if (i3 >= abstractC0048cArr.length) {
                    return;
                }
                abstractC0048cArr[i3].mo324a(null, null, null, i, this.f735d);
                i2 = i3 + 1;
            }
        } else {
            if (z2) {
                this.f741j.m312b(i, abstractC0048cArr);
            } else {
                this.f741j.m318d(i, abstractC0048cArr);
            }
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 >= abstractC0048cArr.length) {
                    return;
                }
                if (this.f735d != null) {
                    abstractC0048cArr[i5].mo324a(null, null, null, i, this.f735d);
                }
                i4 = i5 + 1;
            }
        }
    }

    public void m1890a(c cVar, int i) {
        this.f741j.m311b(i, new ClassA((byte) -89, 0));
    }

    public void m1891a(c cVar, int i, ClassB c0047b) {
        this.f741j.m311b(i, new ClassB((byte) -72, c0047b.f139a));
    }

    public boolean m1895a(int i, int i2) {
        while (i < i2) {
            if (this.f732a.m2117a(i) && !this.f732a.m2123b(i) && m1896a(this.f732a.m2130f(i), i2)) {
                return true;
            }
            i++;
        }
        return false;
    }

    private boolean m1896a(ad c0179ad, int i) {
        int iM1324e;
        if (c0179ad == null || (iM1324e = c0179ad.m1324e()) <= 0) {
            return false;
        }
        for (int i2 = 0; i2 < iM1324e; i2++) {
            if (c0179ad.m1317a(i2) > i) {
                return true;
            }
        }
        return false;
    }

    public void m1899b(int i, boolean z, boolean z2, int i2) {
        switch (i2) {
            case 1:
                m1888a(i, z, z2, new ClassH((byte) 87));
                break;
            case 2:
                m1888a(i, z, z2, new ClassH((byte) 88));
                break;
            default:
                Abstractc[] abstractC0048cArr = new Abstractc[(i2 / 2) + (i2 % 2)];
                ClassH c0053h = new ClassH((byte) 88);
                for (int i3 = 0; i3 < i2 / 2; i3++) {
                    abstractC0048cArr[i3] = c0053h;
                }
                if (i2 % 2 == 1) {
                    c0053h = new ClassH((byte) 87);
                    abstractC0048cArr[i2 / 2] = c0053h;
                }
                m1889a(i, z, z2, c0053h, abstractC0048cArr);
                break;
        }
    }

    public void m1902a(c cVar, a aVar) {
    }

    public void m1903a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        try {
            m1905b(cVar, interfaceC0162j, dVar);
        } catch (RuntimeException e) {
            ClassL.m3161a("Unexpected error while shrinking instructions after partial evaluation:");
            ClassL.m3161a("  Class       = [" + cVar.b() + "]");
            ClassL.m3161a("  Method      = [" + interfaceC0162j.mo946a(cVar) + interfaceC0162j.mo949b(cVar) + "]");
            ClassL.m3161a("  Exception   = [" + e.getClass().getName() + "] (" + e.getMessage() + ")");
            e.printStackTrace();
            ClassL.m3161a("Not optimizing this method");
        }
    }

    public void m1904a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, h hVar) {
        if (this.f732a.m2117a(hVar.c)) {
            return;
        }
        hVar.b = hVar.a;
    }

    public void m1905b(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        if (this.f733b) {
            this.f732a.m2116a(cVar, interfaceC0162j, dVar);
        }
        this.f741j.m277a(dVar.e);
        dVar.a(cVar, interfaceC0162j, this.f732a.m2121b(true, (d) this.f736e));
        dVar.a(cVar, interfaceC0162j, this.f732a.m2114a(true, this.f732a.m2121b(false, (d) this.f737f)));
        dVar.a(cVar, interfaceC0162j, this.f732a.m2121b(true, (d) this.f738g));
        dVar.a(cVar, interfaceC0162j, this.f732a.m2114a(true, (d) this.f739h));
        dVar.a(cVar, interfaceC0162j, this.f732a.m2121b(false, (d) this.f740i));
        dVar.a(cVar, interfaceC0162j, this);
        this.f741j.m284a(cVar, interfaceC0162j, dVar);
    }
}
