package com.a.b.a.b;

import com.a.a.a.ClassB;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfaced;
import com.a.b.g.ClassK;
import com.a.b.g.ClassT;

public final class ClassP extends ClassT {

    private final Interfaced[] f1884a;

    private final boolean[] f1885b;

    private int f1886c;

    public ClassP(int i) {
        super(i != 0);
        this.f1884a = new Interfaced[i];
        this.f1885b = new boolean[i];
        this.f1886c = 0;
    }

    private static Interfaced m4011a(String str) {
        throw new al("stack: " + str);
    }

    private static String m4012b(Interfaced interfaceC1237d) {
        return interfaceC1237d == null ? "<invalid>" : interfaceC1237d.toString();
    }

    public ClassP m4013a() {
        ClassP c0944p = new ClassP(this.f1884a.length);
        System.arraycopy(this.f1884a, 0, c0944p.f1884a, 0, this.f1884a.length);
        System.arraycopy(this.f1885b, 0, c0944p.f1885b, 0, this.f1885b.length);
        c0944p.f1886c = this.f1886c;
        return c0944p;
    }

    public ClassP m4014a(ClassP c0944p) {
        try {
            return ClassY.m4077a(this, c0944p);
        } catch (al e) {
            e.m3757a("underlay stack:");
            m4017a(e);
            e.m3757a("overlay stack:");
            c0944p.m4017a(e);
            throw e;
        }
    }

    public Interfaced m4015a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        return i >= this.f1886c ? m4011a("underflow") : this.f1884a[(this.f1886c - i) - 1];
    }

    public void m4016a(int i, Interfaced interfaceC1237d) {
        m5518l();
        try {
            Interfaced interfaceC1237dMo3826b = interfaceC1237d.mo3826b();
            int i2 = (this.f1886c - i) - 1;
            Interfaced interfaceC1237d2 = this.f1884a[i2];
            if (interfaceC1237d2 == null || interfaceC1237d2.mo3825a().m5066j() != interfaceC1237dMo3826b.mo3825a().m5066j()) {
                m4011a("incompatible substitution: " + m4012b(interfaceC1237d2) + " -> " + m4012b(interfaceC1237dMo3826b));
            }
            this.f1884a[i2] = interfaceC1237dMo3826b;
        } catch (NullPointerException e) {
            throw new NullPointerException("type == null");
        }
    }

    public void m4017a(ClassB c0882b) {
        int i = this.f1886c - 1;
        int i2 = 0;
        while (i2 <= i) {
            c0882b.m3757a("stack[" + (i2 == i ? "top0" : ClassK.m5485c(i - i2)) + "]: " + m4012b(this.f1884a[i2]));
            i2++;
        }
    }

    public void m4018a(ClassC c1236c) {
        if (this.f1886c == 0) {
            return;
        }
        m5518l();
        ClassC c1236cM5075s = c1236c.m5075s();
        for (int i = 0; i < this.f1886c; i++) {
            if (this.f1884a[i] == c1236c) {
                this.f1884a[i] = c1236cM5075s;
            }
        }
    }

    public void m4019a(Interfaced interfaceC1237d) {
        m5518l();
        try {
            Interfaced interfaceC1237dMo3826b = interfaceC1237d.mo3826b();
            int iM5066j = interfaceC1237dMo3826b.mo3825a().m5066j();
            if (this.f1886c + iM5066j > this.f1884a.length) {
                m4011a("overflow");
                return;
            }
            if (iM5066j == 2) {
                this.f1884a[this.f1886c] = null;
                this.f1886c++;
            }
            this.f1884a[this.f1886c] = interfaceC1237dMo3826b;
            this.f1886c++;
        } catch (NullPointerException e) {
            throw new NullPointerException("type == null");
        }
    }

    public int m4020b() {
        return this.f1886c;
    }

    public boolean m4021b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        if (i >= this.f1886c) {
            throw new al("stack: underflow");
        }
        return this.f1885b[(this.f1886c - i) - 1];
    }

    public ClassC m4022c(int i) {
        return m4015a(i).mo3825a();
    }

    public void m4023c() {
        m5518l();
        for (int i = 0; i < this.f1886c; i++) {
            this.f1884a[i] = null;
            this.f1885b[i] = false;
        }
        this.f1886c = 0;
    }

    public void m4024d() {
        m5518l();
        this.f1885b[this.f1886c] = true;
    }

    public Interfaced m4025e() {
        m5518l();
        Interfaced interfaceC1237dM4015a = m4015a(0);
        this.f1884a[this.f1886c - 1] = null;
        this.f1885b[this.f1886c - 1] = false;
        this.f1886c -= interfaceC1237dM4015a.mo3825a().m5066j();
        return interfaceC1237dM4015a;
    }
}
