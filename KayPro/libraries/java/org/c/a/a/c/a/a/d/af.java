package org.c.a.a.c.a.a.d;

import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.a.Abstractai;
import org.c.a.a.b.d.a.ClassB;
import org.c.a.a.b.d.a.ClassI;
import org.c.a.a.b.d.a.ClassJ;
import org.c.a.a.b.d.a.ClassN;
import org.c.a.a.b.d.a.ClassV;
import org.c.a.a.b.d.a.Interfacel;
import org.c.a.a.c.a.a.a.b.a.ClassB;
import org.c.a.a.c.a.a.a.b.a.ClassF;
import org.c.a.a.c.a.a.c.ac;
import org.c.a.a.c.a.a.c.ClassW;

public class af extends Abstracta {

    protected static final ClassB f6184a = new ClassB();

    protected static final aa f6185b = new aa();

    protected ClassJ f6186c = new ClassJ();

    protected ClassR f6187d = new ClassR();

    protected ClassP f6188e = new ClassP();

    protected ClassH f6189f = new ClassH();

    protected ab f6190g = new ab();

    protected ClassC f6191h;

    protected ClassV f6192i;

    protected Abstractai f6193j;

    public af(ClassW c2168w, ac c2133ac) {
        this.f6191h = new ClassC(c2168w, c2133ac);
        this.f6192i = new ClassV(c2133ac);
    }

    @Override
    public void mo7768a(ClassB c1926b) {
        this.f6193j = c1926b;
        m7773a((Interfacel) c1926b.m7897b());
    }

    @Override
    public void mo7770a(ClassI c1933i) {
        ClassB c2094b = (ClassB) c1933i;
        if (c2094b.m8281g() != null) {
            Abstractai abstractC1924ai = this.f6193j;
            m7762a(c2094b.m8281g());
            this.f6193j = abstractC1924ai;
        }
        this.f6187d.m8666a(this.f6193j.m7894l());
        this.f6191h.mo7770a(c1933i);
        this.f6186c.mo7770a(c1933i);
        this.f6187d.mo7770a(c1933i);
        this.f6188e.mo7770a(c1933i);
        this.f6192i.mo7770a(c1933i);
        f6184a.mo7770a(c1933i);
        f6185b.mo7770a(c1933i);
        if (c2094b.m8284k() == null && c2094b.m8281g() != null && this.f6190g.m8641a(c2094b)) {
            this.f6190g.mo7770a((ClassI) c2094b);
        }
    }

    @Override
    public void mo7771a(ClassJ c1934j) {
        this.f6193j = c1934j;
        m7773a((Interfacel) c1934j.m7941e());
    }

    @Override
    public void mo7774a(ClassN c1938n) {
        ClassF c2098f = (ClassF) c1938n;
        this.f6193j = c1938n;
        c2098f.m8298a(c2098f.m7893k() ^ 24);
        c2098f.m7913c().mo7869a(this);
        this.f6189f.mo7770a(c2098f.m7913c());
        c2098f.m8299a(this.f6189f.m8656a());
    }

    @Override
    public void mo7782a(ClassV c1946v) {
        this.f6193j = c1946v;
        m7773a((Interfacel) c1946v.m7941e());
    }
}
