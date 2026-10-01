package a.g.c;

import a.b.a.a;
import a.b.a.d.i;
import a.b.a.d.l;
import a.b.a.h;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import java.util.Arrays;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.Abstracti;
import a.b.d.ClassA;
import a.b.d.ClassB;
import a.b.d.ClassE;
import a.b.d.ClassH;
import a.b.d.ClassK;

public class ClassW extends w implements i, l, d {

    private boolean[] f1110a = new boolean[8096];

    private boolean f1111b;

    private boolean f1112c;

    private void m2791a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i) {
        boolean z = this.f1111b;
        m2793b(cVar, interfaceC0162j, dVar, i);
        this.f1111b = z;
    }

    private void m2792a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, int[] iArr) {
        for (int i2 : iArr) {
            m2793b(cVar, interfaceC0162j, dVar, i2 + i);
        }
    }

    private void m2793b(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i) {
        boolean z = this.f1111b;
        byte[] bArr = dVar.f;
        int iMo322a = i;
        while (!this.f1110a[iMo322a]) {
            Abstractc abstractC0048cM387a = ClassE.m387a(bArr, iMo322a);
            this.f1110a[iMo322a] = true;
            this.f1111b = true;
            abstractC0048cM387a.mo324a(cVar, interfaceC0162j, dVar, iMo322a, this);
            if (!this.f1111b) {
                break;
            } else {
                iMo322a += abstractC0048cM387a.mo322a(iMo322a);
            }
        }
        this.f1111b = z;
    }

    public void m2794a(c cVar, a aVar) {
    }

    public void m2795a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        int i = dVar.e;
        if (this.f1110a.length < i) {
            this.f1110a = new boolean[i];
        } else {
            Arrays.fill(this.f1110a, 0, i, false);
        }
        m2793b(cVar, interfaceC0162j, dVar, 0);
        do {
            this.f1112c = false;
            dVar.a(cVar, interfaceC0162j, this);
        } while (this.f1112c);
    }

    public void m2796a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassA c0042a) {
        m2791a(cVar, interfaceC0162j, dVar, c0042a.f133a + i);
        byte b = c0042a.f147c;
        if (b == -89 || b == -56) {
            this.f1111b = false;
        }
    }

    public void m2797a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
    }

    public void m2798a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassH c0053h) {
        byte b = c0053h.f147c;
        if (b == -84 || b == -83 || b == -82 || b == -81 || b == -80 || b == -79 || b == -65) {
            this.f1111b = false;
        }
    }

    public void m2799a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstracti abstractC0054i) {
        m2791a(cVar, interfaceC0162j, dVar, abstractC0054i.f151b + i);
        m2792a(cVar, interfaceC0162j, dVar, i, abstractC0054i.f152d);
        this.f1111b = false;
    }

    public void m2800a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassK c0056k) {
        if (c0056k.f147c == -87) {
            this.f1111b = false;
        }
    }

    public void m2801a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, h hVar) {
        if (m2802a(hVar.c) || !m2803a(hVar.a, hVar.b)) {
            return;
        }
        m2793b(cVar, interfaceC0162j, dVar, hVar.c);
        this.f1112c = true;
    }

    public boolean m2802a(int i) {
        return this.f1110a[i];
    }

    public boolean m2803a(int i, int i2) {
        while (i < i2) {
            if (this.f1110a[i]) {
                return true;
            }
            i++;
        }
        return false;
    }
}
