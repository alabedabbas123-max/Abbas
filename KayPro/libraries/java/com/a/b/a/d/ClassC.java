package com.a.b.a.d;

import com.a.b.a.e.ClassI;
import com.a.b.a.e.ClassK;
import com.a.b.a.e.Interfacea;
import com.a.b.a.e.Interfacej;
import com.a.b.g.ClassE;
import com.a.b.g.ClassK;

final class ClassC {

    private final ClassE f1914a;

    private final int f1915b;

    private final int f1916c;

    private final ClassB f1917d;

    private final ClassK f1918e;

    private int f1919f;

    private Interfacej f1920g;

    public ClassC(ClassE c0960e, int i, int i2, ClassB c0957b) {
        if (c0960e == null) {
            throw new NullPointerException("cf == null");
        }
        if (c0957b == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        int iM5446f = c0960e.m4130b().m5446f(i2);
        this.f1914a = c0960e;
        this.f1915b = i;
        this.f1916c = i2;
        this.f1917d = c0957b;
        this.f1918e = new ClassK(iM5446f);
        this.f1919f = -1;
    }

    private void m4110c() {
        if (this.f1919f < 0) {
            m4111d();
        }
    }

    private void m4111d() {
        int iD_ = this.f1918e.m5476d_();
        int i = this.f1916c + 2;
        ClassE c1307eM4130b = this.f1914a.m4130b();
        if (this.f1920g != null) {
            this.f1920g.m4195a(c1307eM4130b, this.f1916c, 2, "attributes_count: " + ClassK.m5485c(iD_));
        }
        int i2 = i;
        int i3 = 0;
        while (i3 < iD_) {
            try {
                if (this.f1920g != null) {
                    this.f1920g.m4195a(c1307eM4130b, i2, 0, "\nattributes[" + i3 + "]:\n");
                    this.f1920g.m4194a(1);
                }
                Interfacea interfaceC0966aM4108a = this.f1917d.m4108a(this.f1914a, this.f1915b, i2, this.f1920g);
                int iMo3765a = interfaceC0966aM4108a.mo3765a() + i2;
                this.f1918e.m4199a(i3, interfaceC0966aM4108a);
                if (this.f1920g != null) {
                    this.f1920g.m4194a(-1);
                    this.f1920g.m4195a(c1307eM4130b, iMo3765a, 0, "end attributes[" + i3 + "]\n");
                }
                i3++;
                i2 = iMo3765a;
            } catch (ClassI e) {
                e.m3757a("...while parsing attributes[" + i3 + "]");
                throw e;
            } catch (RuntimeException e2) {
                ClassI c0974i = new ClassI(e2);
                c0974i.m3757a("...while parsing attributes[" + i3 + "]");
                throw c0974i;
            }
        }
        this.f1919f = i2;
    }

    public int m4112a() {
        m4110c();
        return this.f1919f;
    }

    public void m4113a(Interfacej interfaceC0975j) {
        this.f1920g = interfaceC0975j;
    }

    public ClassK m4114b() {
        m4110c();
        return this.f1918e;
    }
}
