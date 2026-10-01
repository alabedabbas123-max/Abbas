package a.g.c;

import a.b.a.a;
import a.b.a.d.i;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.Interfacej;
import a.b.c.ClassV;
import a.b.d.Abstractc;
import a.b.d.ClassA;

public class ClassF extends w implements i, d {

    private final d f1032a;

    private final ClassA f1033b = new ClassA();

    private final ClassV f1034c = new ClassV();

    public ClassF(d dVar) {
        this.f1032a = dVar;
    }

    private int m2721a(a.b.a.d dVar, int i, int i2) {
        byte[] bArr = dVar.f;
        int i3 = 0;
        for (int i4 = 1; i4 <= i && i4 <= i2 && i2 - i4 != i; i4++) {
            int i5 = i - i4;
            int i6 = i2 - i4;
            if (bArr[i5] != bArr[i6] || (this.f1033b.m2634a(i5) ^ this.f1033b.m2634a(i6))) {
                break;
            }
            if (this.f1033b.m2634a(i5) && this.f1033b.m2634a(i6)) {
                if (!this.f1033b.m2638e(i5) && !this.f1033b.m2639f(i5) && !this.f1033b.m2640g(i5) && !this.f1033b.m2641h(i5) && !this.f1033b.m2636c(i5) && !this.f1033b.m2640g(i6) && !this.f1033b.m2641h(i6) && !m2722a(bArr[i5])) {
                    if (this.f1033b.m2639f(i6)) {
                        i3 = i4;
                    }
                    if (this.f1033b.m2639f(i5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return i3;
    }

    private boolean m2722a(byte b) {
        return b == 87 || b == 88 || b == -66;
    }

    private boolean m2723b(a.b.a.d dVar, int i, int i2) {
        if (i2 >= i) {
            i2 = i;
            i = i2;
        }
        while (i2 <= i) {
            if (this.f1033b.m2640g(i2) || this.f1033b.m2641h(i2)) {
                return true;
            }
            i2++;
        }
        return false;
    }

    public void m2724a(c cVar, a aVar) {
    }

    public void m2725a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        this.f1033b.m2626a(cVar, interfaceC0162j, dVar);
        this.f1034c.m277a(dVar.e);
        dVar.a(cVar, interfaceC0162j, this);
        this.f1034c.m284a(cVar, interfaceC0162j, dVar);
    }

    public void m2726a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassA c0042a) {
        int i2;
        int i3;
        int iM2721a;
        byte b = c0042a.f147c;
        if ((b == -89 || b == -56) && !this.f1033b.m2639f(i) && (iM2721a = m2721a(dVar, i, (i3 = i + (i2 = c0042a.f133a)))) > 0 && !m2723b(dVar, i, i3)) {
            for (int i4 = 0; i4 <= iM2721a; i4++) {
                int i5 = i - i4;
                if (this.f1033b.m2634a(i5)) {
                    this.f1034c.m319e(i5);
                    this.f1034c.m314c(i5);
                }
            }
            int i6 = i2 - iM2721a;
            if (i6 != c0042a.mo322a(i)) {
                this.f1034c.m311b(i, new ClassA(b, i6));
            }
            if (this.f1032a != null) {
                this.f1032a.a(cVar, interfaceC0162j, dVar, i, c0042a);
            }
        }
    }

    public void m2727a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }
}
