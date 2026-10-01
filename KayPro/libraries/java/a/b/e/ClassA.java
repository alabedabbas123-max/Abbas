package a.b.e;

import a.b.b.a;
import a.b.b.a.f;
import a.b.b.b;
import a.b.b.c;
import a.b.b.d;
import a.b.b.e;
import a.b.b.g;
import a.b.b.h;
import a.b.b.i;
import a.b.b.j;
import a.b.b.k;
import a.b.b.l;
import a.b.b.m;
import a.b.b.n;
import a.b.b.o;
import a.b.b.p;
import a.b.b.q;
import a.b.b.r;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import java.io.DataInput;
import a.b.Abstractg;
import a.b.Abstractm;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.f.ClassA;
import a.b.f.ClassI;

public class ClassA extends w implements f, aq, s {

    private static final ClassF[] f168a = new ClassF[0];

    private static final ClassH[] f169b = new ClassH[0];

    private final ClassJ f170c;

    private final boolean f171d;

    private final boolean f172e;

    private b[] f173f;

    public ClassA(DataInput dataInput, boolean z, boolean z2) {
        this.f170c = new ClassJ(dataInput);
        this.f171d = z;
        this.f172e = z2;
    }

    private int m438a(char c) {
        switch (c) {
            case 'B':
            case 'Z':
                return 1;
            case 'C':
            case 'S':
                return 2;
            case 'D':
            case 'J':
                return 8;
            case 'F':
            case 'I':
                return 4;
            default:
                return 0;
        }
    }

    private b m439a() {
        int iM663i = this.f170c.m663i();
        switch (iM663i) {
            case 1:
                return new a.b.b.s();
            case 2:
            case 13:
            case 14:
            case 17:
            default:
                throw new RuntimeException("Unknown constant type [" + iM663i + "] in constant pool");
            case 3:
                return new a.b.b.f();
            case 4:
                return new e();
            case 5:
                return new i();
            case 6:
                return new c();
            case 7:
                return new a();
            case 8:
                return new r();
            case 9:
                return new d();
            case 10:
                return new l();
            case 11:
                return new g();
            case 12:
                return new n();
            case 15:
                return new j();
            case 16:
                return new k();
            case 18:
                return new h();
            case 19:
                return new m();
            case 20:
                return new o();
        }
    }

    private String m440a(int i) {
        return m441b(this.f173f[i].a);
    }

    private String m441b(int i) {
        return this.f173f[i].c();
    }

    private void m442b() {
        int iM664j = this.f170c.m664j();
        for (int i = 0; i < iM664j; i++) {
            m443c();
        }
    }

    private void m443c() {
        this.f170c.m653a(2);
        this.f170c.m653a(this.f170c.m660f());
    }

    public void m444a(a.b.c cVar, a aVar) {
        aVar.a = this.f170c.m664j();
    }

    public void m445a(a.b.c cVar, c cVar2) {
        this.f170c.m653a(8);
    }

    public void m446a(a.b.c cVar, e eVar) {
        this.f170c.m653a(4);
    }

    public void m447a(a.b.c cVar, a.b.b.f fVar) {
        this.f170c.m653a(4);
    }

    public void m448a(a.b.c cVar, h hVar) {
        this.f170c.m653a(4);
    }

    public void m449a(a.b.c cVar, i iVar) {
        this.f170c.m653a(8);
    }

    public void m450a(a.b.c cVar, j jVar) {
        this.f170c.m653a(3);
    }

    public void m451a(a.b.c cVar, k kVar) {
        this.f170c.m653a(2);
    }

    public void m452a(a.b.c cVar, m mVar) {
        this.f170c.m653a(2);
    }

    public void m453a(a.b.c cVar, n nVar) {
        this.f170c.m653a(4);
    }

    public void m454a(a.b.c cVar, o oVar) {
        this.f170c.m653a(2);
    }

    public void m455a(a.b.c cVar, p pVar) {
        char cM657c = this.f170c.m657c();
        this.f170c.m653a(m438a(cM657c) * this.f170c.m660f());
    }

    public void m456a(a.b.c cVar, r rVar) {
        this.f170c.m653a(2);
    }

    public void m457a(a.b.c cVar, a.b.b.s sVar) {
        byte[] bArr = new byte[this.f170c.m664j()];
        this.f170c.m654a(bArr);
        sVar.a(bArr);
    }

    public void m458a(ClassE c0057e) {
        int i;
        int i2;
        ClassI.m754a(this.f170c.m660f());
        ClassI.m770e(ClassI.m745a(this.f170c.m664j(), this.f170c.m664j()));
        int iM664j = this.f170c.m664j();
        this.f173f = new b[iM664j];
        int i3 = 1;
        while (i3 < iM664j) {
            b bVarM439a = m439a();
            bVarM439a.a(c0057e, this);
            int iA = bVarM439a.a();
            if (iA == 7 || iA == 1) {
                this.f173f[i3] = bVarM439a;
            }
            if (iA == 5 || iA == 6) {
                i3++;
            }
            i3++;
        }
        c0057e.f158a = this.f170c.m664j();
        if (!this.f171d || ClassA.m678a(c0057e.m399a()) >= 3) {
            int iM664j2 = this.f170c.m664j();
            int iM664j3 = this.f170c.m664j();
            c0057e.f159b = m440a(iM664j2);
            c0057e.f160c = iM664j3 == 0 ? null : m440a(iM664j3);
            int iM664j4 = this.f170c.m664j();
            c0057e.f161d = new String[iM664j4];
            for (int i4 = 0; i4 < iM664j4; i4++) {
                c0057e.f161d[i4] = m440a(this.f170c.m664j());
            }
            int iM664j5 = this.f170c.m664j();
            ClassF[] c0069fArr = new ClassF[iM664j5];
            int i5 = 0;
            int i6 = 0;
            while (i5 < iM664j5) {
                ClassF c0069f = new ClassF();
                m459a(c0057e, c0069f);
                if (ClassA.m678a(c0069f.mo945a()) >= (this.f172e ? 2 : 1)) {
                    i2 = i6 + 1;
                    c0069fArr[i6] = c0069f;
                } else {
                    i2 = i6;
                }
                i5++;
                i6 = i2;
            }
            if (i6 == 0) {
                c0057e.f162e = f168a;
            } else {
                c0057e.f162e = new ClassF[i6];
                System.arraycopy(c0069fArr, 0, c0057e.f162e, 0, i6);
            }
            int iM664j6 = this.f170c.m664j();
            ClassH[] c0160hArr = new ClassH[iM664j6];
            int i7 = 0;
            int i8 = 0;
            while (i7 < iM664j6) {
                ClassH c0160h = new ClassH();
                m459a(c0057e, c0160h);
                if (ClassA.m678a(c0160h.mo945a()) >= (this.f172e ? 2 : 1)) {
                    i = i8 + 1;
                    c0160hArr[i8] = c0160h;
                } else {
                    i = i8;
                }
                i7++;
                i8 = i;
            }
            if (i8 == 0) {
                c0057e.f163f = f169b;
            } else {
                c0057e.f163f = new ClassH[i8];
                System.arraycopy(c0160hArr, 0, c0057e.f163f, 0, i8);
            }
            m442b();
        }
    }

    public void m459a(ClassE c0057e, Abstractg abstractC0095g) {
        abstractC0095g.f313b = this.f170c.m664j();
        abstractC0095g.f314c = m441b(this.f170c.m664j());
        abstractC0095g.f315d = m441b(this.f170c.m664j());
        m442b();
    }

    public void m460a(a.b.k kVar) {
    }

    public void m461a(a.b.k kVar, Abstractm abstractC0164m) {
    }

    public void m462b(a.b.c cVar, q qVar) {
        this.f170c.m653a(4);
    }
}
