package a.g.c;

import a.b.b.a.f;
import a.b.b.b;
import a.b.c;
import a.b.c.ad;
import a.b.c.ae;
import a.b.d.a.d;
import a.b.f.w;
import a.b.k;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.c.ClassV;
import a.b.d.Abstractc;
import a.b.f.ClassP;

public class ClassK extends w implements f, d {

    private static int f1052a;

    private final ClassP f1053b;

    private final b[] f1054c;

    private final Abstractc[] f1055d;

    private final ClassA f1056e;

    private final ClassV f1057f;

    private final d f1058g;

    private final ClassO f1059h;

    protected ClassK(ClassP c0085p, b[] bVarArr, Abstractc[] abstractC0048cArr, b[] bVarArr2, Abstractc[] abstractC0048cArr2, ClassA c0409a, ClassV c0036v, d dVar) {
        this.f1059h = new ClassO(this);
        this.f1053b = c0085p;
        this.f1054c = bVarArr;
        this.f1055d = abstractC0048cArr2;
        this.f1056e = c0409a;
        this.f1057f = c0036v;
        this.f1058g = dVar;
    }

    public ClassK(b[] bVarArr, Abstractc[] abstractC0048cArr, b[] bVarArr2, Abstractc[] abstractC0048cArr2, ClassA c0409a, ClassV c0036v) {
        this(bVarArr, abstractC0048cArr, bVarArr2, abstractC0048cArr2, c0409a, c0036v, null);
    }

    public ClassK(b[] bVarArr, Abstractc[] abstractC0048cArr, b[] bVarArr2, Abstractc[] abstractC0048cArr2, ClassA c0409a, ClassV c0036v, d dVar) {
        this(new ClassP(bVarArr, abstractC0048cArr), bVarArr, abstractC0048cArr, bVarArr2, abstractC0048cArr2, c0409a, c0036v, dVar);
    }

    public static ClassN m2735a() {
        int i = f1052a;
        f1052a = i + 1;
        return new ClassN(i);
    }

    public static ClassN m2736a(int i, int i2, int i3) {
        int i4 = f1052a;
        f1052a = i4 + 1;
        return new ClassM(i4, i, i2, i3);
    }

    private String m2737a(k kVar, int i, int i2) {
        switch (i) {
            case 1:
                return Boolean.toString((m2747a(i2) ? m2750b(kVar, i2).b() : m2749b(i2)) != 0);
            case 2:
                return Character.toString((char) (m2747a(i2) ? m2750b(kVar, i2).b() : m2749b(i2)));
            case 3:
                return Integer.toString(m2747a(i2) ? m2750b(kVar, i2).b() : m2749b(i2));
            case 4:
                return Long.toString(m2747a(i2) ? m2750b(kVar, i2).b() : m2749b(i2));
            case 5:
                return Float.toString(m2747a(i2) ? m2750b(kVar, i2).b() : m2749b(i2));
            case 6:
                return Double.toString(m2747a(i2) ? m2750b(kVar, i2).b() : m2749b(i2));
            case 7:
                return kVar.d(this.f1053b.m891d(i2));
            default:
                return "";
        }
    }

    private boolean m2738b() {
        for (int i = 0; i < this.f1053b.m889c(); i++) {
            if (this.f1057f.m320f(this.f1053b.m856a(i))) {
                return false;
            }
        }
        return true;
    }

    public int m2742d(int i) {
        return (this.f1053b.m856a(0) << 8) | i;
    }

    public static boolean m2743e(int i) {
        return ((-16777216) & i) == 536870912;
    }

    protected int m2744a(int i, int i2) {
        return m2743e(i2) ? m2742d(i2) : this.f1053b.m857a(i, i2);
    }

    protected int m2745a(c cVar, int i) {
        return i == 536870912 ? cVar.d(this.f1053b.m890c(1073741827)).length() : this.f1053b.m890c(i);
    }

    protected int mo1289a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, int i2) {
        return m2745a(cVar, i2);
    }

    protected int mo1290a(k kVar, int i) {
        if (i >= 536870913 && i <= 536871031) {
            return new ae(kVar).a(m2737a(kVar, i & 15, 1073741827) + m2737a(kVar, (i >>> 4) & 15, 1073741828), (c) null, (Interfacei) null);
        }
        int iM891d = this.f1053b.m891d(i);
        if (iM891d > 0) {
            return iM891d;
        }
        k kVar2 = new k();
        kVar2.c = this.f1054c;
        return new ad(kVar).a(kVar2, i);
    }

    public void m2746a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        if ((this.f1056e != null && this.f1056e.m2637d(i)) || this.f1057f.m320f(i)) {
            this.f1053b.m858a();
        }
        abstractC0048c.mo324a(cVar, interfaceC0162j, dVar, i, this.f1053b);
        if (this.f1053b.m885b() && m2738b()) {
            int iM889c = this.f1053b.m889c();
            int length = this.f1055d.length;
            if (length <= iM889c) {
                for (int i2 = 0; i2 < length; i2++) {
                    this.f1057f.m311b(this.f1053b.m856a(i2), this.f1059h.m2755a(cVar, dVar, i2));
                }
                for (int i3 = length; i3 < iM889c; i3++) {
                    this.f1057f.m314c(this.f1053b.m856a(i3));
                }
            } else {
                for (int i4 = 0; i4 < iM889c; i4++) {
                    this.f1057f.m311b(this.f1053b.m856a(i4), this.f1059h.m2755a(cVar, dVar, i4));
                }
                Abstractc[] abstractC0048cArr = new Abstractc[length - iM889c];
                for (int i5 = 0; i5 < abstractC0048cArr.length; i5++) {
                    abstractC0048cArr[i5] = this.f1059h.m2755a(cVar, dVar, iM889c + i5);
                }
                this.f1057f.m318d(this.f1053b.m856a(iM889c - 1), abstractC0048cArr);
            }
            if (this.f1058g != null) {
                abstractC0048c.mo324a(cVar, interfaceC0162j, dVar, i, this.f1058g);
            }
        }
    }

    protected boolean m2747a(int i) {
        return this.f1053b.m886b(i);
    }

    protected int[] m2748a(int i, int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (m2743e(iArr[i2])) {
                iArr[i2] = m2742d(iArr[i2]);
            }
        }
        return this.f1053b.m882a(i, iArr);
    }

    protected int m2749b(int i) {
        return this.f1053b.m890c(i);
    }

    protected b m2750b(k kVar, int i) {
        return kVar.l(this.f1053b.m891d(i));
    }
}
