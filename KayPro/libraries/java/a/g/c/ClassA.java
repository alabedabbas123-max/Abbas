package a.g.c;

import a.b.a.a;
import a.b.a.d.i;
import a.b.a.d.l;
import a.b.a.h;
import a.b.b.a.f;
import a.b.b.b;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import java.util.Arrays;
import a.b.Interfacej;
import a.b.d.Abstracti;
import a.b.d.ClassA;
import a.b.d.ClassB;
import a.b.d.ClassH;
import a.b.d.ClassK;

public class ClassA extends w implements i, l, f, d {

    private short[] f999a = new short[8097];

    private int[] f1000b = new int[8096];

    private int[] f1001c = new int[8096];

    private boolean f1002d;

    private boolean f1003e;

    private int f1004f;

    private boolean f1005g;

    private void m2616a(int i, int i2) {
        m2619b(i, i2);
        if (this.f1004f != -1) {
            m2617a(i, i2, this.f1004f);
        }
    }

    private void m2617a(int i, int i2, int i3) {
        int i4 = i + i2;
        if (this.f1000b[i4] == -1) {
            if (i2 < 0) {
                if (i3 > i4) {
                    i3 = i4;
                }
                this.f1003e = true;
            }
            this.f1000b[i4] = i3;
        }
    }

    private void m2618a(int i, int[] iArr) {
        for (int i2 : iArr) {
            m2616a(i, i2);
        }
    }

    private void m2619b(int i, int i2) {
        int i3 = i + i2;
        short[] sArr = this.f999a;
        sArr[i3] = (short) (sArr[i3] | 16);
    }

    private void m2620o(int i) {
        short[] sArr = this.f999a;
        sArr[i] = (short) (sArr[i] | 9);
    }

    private void m2621p(int i) {
        short[] sArr = this.f999a;
        sArr[i] = (short) (sArr[i] | 32);
        this.f1004f = -1;
    }

    private void m2622q(int i) {
        if (this.f1000b[i] != -1) {
            this.f1004f = this.f1000b[i];
        } else if (this.f1004f != -1) {
            this.f1000b[i] = this.f1004f;
        }
    }

    public void m2623a(c cVar, a aVar) {
    }

    public void m2624a(c cVar, b bVar) {
    }

    public void m2625a(c cVar, a.b.b.l lVar) {
        this.f1005g = lVar.b(cVar).equals("<init>");
    }

    public void m2626a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        int i;
        int i2 = -2;
        int i3 = dVar.e;
        if (this.f1000b.length < i3) {
            this.f999a = new short[i3 + 1];
            this.f1000b = new int[i3];
            this.f1001c = new int[i3];
            Arrays.fill(this.f1000b, 0, i3, -1);
            Arrays.fill(this.f1001c, 0, i3, -1);
        } else {
            Arrays.fill(this.f999a, 0, i3, (short) 0);
            Arrays.fill(this.f1000b, 0, i3, -1);
            Arrays.fill(this.f1001c, 0, i3, -1);
            this.f999a[i3] = 0;
        }
        this.f1002d = false;
        do {
            this.f1003e = false;
            this.f1004f = -2;
            dVar.a(cVar, interfaceC0162j, this);
            dVar.a(cVar, interfaceC0162j, this);
        } while (this.f1003e);
        this.f999a[i3] = 16;
        if (this.f1002d) {
            int i4 = 0;
            while (i4 < i3) {
                if (m2634a(i4)) {
                    i = this.f1000b[i4];
                    if (i >= 0 && m2646m(i4)) {
                        short[] sArr = this.f999a;
                        sArr[i] = (short) (sArr[i] | 1024);
                    }
                    if (i2 >= 0) {
                        this.f1001c[i2] = i4;
                    }
                } else {
                    i = i2;
                }
                i4++;
                i2 = i;
            }
            if (i2 >= 0) {
                this.f1001c[i2] = i3;
            }
            for (int i5 = 0; i5 < i3; i5++) {
                if (m2645l(i5)) {
                    int i6 = this.f1000b[i5];
                    if (m2646m(i6)) {
                        short[] sArr2 = this.f999a;
                        sArr2[i5] = (short) (sArr2[i5] | 1024);
                    }
                    this.f1001c[i5] = this.f1001c[i6];
                }
            }
        }
    }

    public void m2627a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassA c0042a) {
        int i2 = c0042a.f133a;
        int i3 = i + i2;
        m2620o(i);
        m2622q(i);
        m2619b(i, i2);
        byte b = c0042a.f147c;
        if (b == -88 || b == -55) {
            this.f1002d = true;
            short[] sArr = this.f999a;
            sArr[i] = (short) (sArr[i] | 512);
            m2617a(i, i2, i3);
        } else if (this.f1004f != -1) {
            m2617a(i, i2, this.f1004f);
        }
        if (b == -89 || b == -56) {
            m2621p(c0042a.mo322a(i) + i);
        }
    }

    public void m2628a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        short[] sArr = this.f999a;
        sArr[i] = (short) (sArr[i] | 1);
        m2622q(i);
        byte b = c0047b.f147c;
        if (b == -69) {
            short[] sArr2 = this.f999a;
            sArr2[i] = (short) (sArr2[i] | 2);
        } else if (b == -73) {
            this.f1005g = false;
            cVar.a(c0047b.f139a, this);
            if (this.f1005g) {
                short[] sArr3 = this.f999a;
                sArr3[i] = (short) (sArr3[i] | 4);
            }
        }
    }

    public void m2629a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassH c0053h) {
        short[] sArr = this.f999a;
        sArr[i] = (short) (sArr[i] | 1);
        m2622q(i);
        byte b = c0053h.f147c;
        if (b == -84 || b == -83 || b == -82 || b == -81 || b == -80 || b == -79 || b == -65) {
            m2620o(i);
            m2621p(c0053h.mo322a(i) + i);
        }
    }

    public void m2630a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstracti abstractC0054i) {
        m2620o(i);
        m2622q(i);
        m2616a(i, abstractC0054i.f151b);
        m2618a(i, abstractC0054i.f152d);
        m2621p(abstractC0054i.mo322a(i) + i);
    }

    public void m2631a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassK c0056k) {
        short[] sArr = this.f999a;
        sArr[i] = (short) (sArr[i] | 1);
        m2622q(i);
        if (c0056k.f147c == -87) {
            this.f1002d = true;
            m2620o(i);
            short[] sArr2 = this.f999a;
            sArr2[i] = (short) (sArr2[i] | 1024);
            m2621p(c0056k.mo322a(i) + i);
        }
    }

    public void m2632a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, h hVar) {
        int i = hVar.a;
        int i2 = hVar.b;
        int i3 = hVar.c;
        short[] sArr = this.f999a;
        sArr[i] = (short) (sArr[i] | 64);
        short[] sArr2 = this.f999a;
        sArr2[i2] = (short) (sArr2[i2] | 128);
        short[] sArr3 = this.f999a;
        sArr3[i3] = (short) (sArr3[i3] | 256);
        if (this.f1000b[i3] != -1 || this.f1000b[i] == -1) {
            return;
        }
        this.f1000b[i3] = this.f1000b[i];
        this.f1003e = true;
    }

    public boolean m2633a() {
        return this.f1002d;
    }

    public boolean m2634a(int i) {
        return (this.f999a[i] & 1) != 0;
    }

    public boolean m2635b(int i) {
        return (this.f999a[i] & 2) != 0;
    }

    public boolean m2636c(int i) {
        return (this.f999a[i] & 4) != 0;
    }

    public boolean m2637d(int i) {
        return i == 0 || (this.f999a[i] & 464) != 0;
    }

    public boolean m2638e(int i) {
        return (this.f999a[i] & 8) != 0;
    }

    public boolean m2639f(int i) {
        return (this.f999a[i] & 16) != 0;
    }

    public boolean m2640g(int i) {
        return (this.f999a[i] & 64) != 0;
    }

    public boolean m2641h(int i) {
        return (this.f999a[i] & 128) != 0;
    }

    public boolean m2642i(int i) {
        return (this.f999a[i] & 256) != 0;
    }

    public boolean m2643j(int i) {
        return (this.f999a[i] & 512) != 0;
    }

    public boolean m2644k(int i) {
        return this.f1000b[i] == i;
    }

    public boolean m2645l(int i) {
        return this.f1000b[i] >= 0;
    }

    public boolean m2646m(int i) {
        return (this.f999a[i] & 1024) != 0;
    }

    public int m2647n(int i) {
        return this.f1001c[i];
    }
}
