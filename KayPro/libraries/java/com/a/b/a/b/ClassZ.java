package com.a.b.a.b;

import com.a.a.a.ClassB;
import com.a.b.e.b.ClassU;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfaced;
import com.a.b.g.ClassK;
import org.apache.commons.io.IOUtils;

public class ClassZ extends Abstractv {

    private final Interfaced[] f1902a;

    public ClassZ(int i) {
        super(i != 0);
        this.f1902a = new Interfaced[i];
    }

    private static Interfaced m4081a(int i, String str) {
        throw new al("local " + ClassK.m5485c(i) + ": " + str);
    }

    @Override
    public Abstractv mo4063a(Abstractv abstractC0950v) {
        return abstractC0950v instanceof ClassZ ? m4082a((ClassZ) abstractC0950v) : abstractC0950v.mo4063a(this);
    }

    @Override
    public ClassW mo4064a(Abstractv abstractC0950v, int i) {
        return new ClassW(m4086f()).mo4064a(abstractC0950v, i);
    }

    public ClassZ m4082a(ClassZ c0954z) {
        try {
            return ClassY.m4078a(this, c0954z);
        } catch (al e) {
            e.m3757a("underlay locals:");
            mo4067a(e);
            e.m3757a("overlay locals:");
            c0954z.mo4067a(e);
            throw e;
        }
    }

    @Override
    public Interfaced mo4065a(int i) {
        Interfaced interfaceC1237d = this.f1902a[i];
        return interfaceC1237d == null ? m4081a(i, "invalid") : interfaceC1237d;
    }

    @Override
    public void mo4066a(int i, Interfaced interfaceC1237d) {
        Interfaced interfaceC1237d2;
        m5518l();
        try {
            Interfaced interfaceC1237dMo3826b = interfaceC1237d.mo3826b();
            if (i < 0) {
                throw new IndexOutOfBoundsException("idx < 0");
            }
            if (interfaceC1237dMo3826b.mo3825a().m5068l()) {
                this.f1902a[i + 1] = null;
            }
            this.f1902a[i] = interfaceC1237dMo3826b;
            if (i == 0 || (interfaceC1237d2 = this.f1902a[i - 1]) == null || !interfaceC1237d2.mo3825a().m5068l()) {
                return;
            }
            this.f1902a[i - 1] = null;
        } catch (NullPointerException e) {
            throw new NullPointerException("type == null");
        }
    }

    @Override
    public void mo4067a(ClassB c0882b) {
        for (int i = 0; i < this.f1902a.length; i++) {
            Interfaced interfaceC1237d = this.f1902a[i];
            c0882b.m3757a("locals[" + ClassK.m5485c(i) + "]: " + (interfaceC1237d == null ? "<invalid>" : interfaceC1237d.toString()));
        }
    }

    @Override
    public void mo4068a(ClassU c1194u) {
        mo4066a(c1194u.m4894g(), c1194u);
    }

    @Override
    public void mo4069a(ClassC c1236c) {
        int length = this.f1902a.length;
        if (length == 0) {
            return;
        }
        m5518l();
        ClassC c1236cM5075s = c1236c.m5075s();
        for (int i = 0; i < length; i++) {
            if (this.f1902a[i] == c1236c) {
                this.f1902a[i] = c1236cM5075s;
            }
        }
    }

    @Override
    protected ClassZ mo4070b() {
        return this;
    }

    public void m4083b(int i) {
        m5518l();
        this.f1902a[i] = null;
    }

    public Interfaced m4084c(int i) {
        return this.f1902a[i];
    }

    @Override
    public String mo3828d() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f1902a.length; i++) {
            Interfaced interfaceC1237d = this.f1902a[i];
            sb.append("locals[" + ClassK.m5485c(i) + "]: " + (interfaceC1237d == null ? "<invalid>" : interfaceC1237d.toString()) + IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }

    @Override
    public ClassZ mo4062a() {
        ClassZ c0954z = new ClassZ(this.f1902a.length);
        System.arraycopy(this.f1902a, 0, c0954z.f1902a, 0, this.f1902a.length);
        return c0954z;
    }

    public int m4086f() {
        return this.f1902a.length;
    }
}
