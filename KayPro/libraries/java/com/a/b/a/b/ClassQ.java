package com.a.b.a.b;

import com.a.a.a.ClassB;
import com.a.b.e.c.ae;
import com.a.b.e.d.ClassB;
import com.a.b.e.d.ClassC;
import com.a.b.g.ClassN;

public final class ClassQ {

    private final Abstractv f1887a;

    private final ClassP f1888b;

    private final ClassN f1889c;

    public ClassQ(int i, int i2) {
        this(new ClassZ(i), new ClassP(i2));
    }

    private ClassQ(Abstractv abstractC0950v, ClassP c0944p) {
        this(abstractC0950v, c0944p, ClassN.f3497a);
    }

    private ClassQ(Abstractv abstractC0950v, ClassP c0944p, ClassN c1316n) {
        if (abstractC0950v == null) {
            throw new NullPointerException("locals == null");
        }
        if (c0944p == null) {
            throw new NullPointerException("stack == null");
        }
        c1316n.m5519m();
        this.f1887a = abstractC0950v;
        this.f1888b = c0944p;
        this.f1889c = c1316n;
    }

    private static Abstractv m4026a(Abstractv abstractC0950v, ClassN c1316n) {
        if (!(abstractC0950v instanceof ClassW)) {
            return abstractC0950v;
        }
        ClassW c0951w = (ClassW) abstractC0950v;
        return c1316n.m5496b() == 0 ? c0951w.mo4070b() : c0951w;
    }

    private ClassN m4027a(ClassN c1316n) {
        if (this.f1889c.equals(c1316n)) {
            return this.f1889c;
        }
        ClassN c1316n2 = new ClassN();
        int iM5496b = this.f1889c.m5496b();
        int iM5496b2 = c1316n.m5496b();
        for (int i = 0; i < iM5496b && i < iM5496b2 && this.f1889c.m5497b(i) == c1316n.m5497b(i); i++) {
            c1316n2.m5499c(i);
        }
        c1316n2.mo3944c_();
        return c1316n2;
    }

    public ClassQ m4028a() {
        return new ClassQ(this.f1887a.mo4062a(), this.f1888b.m4013a(), this.f1889c);
    }

    public ClassQ m4029a(int i, int i2) {
        Abstractv abstractC0950vM4074b = this.f1887a instanceof ClassW ? ((ClassW) this.f1887a).m4074b(i2) : null;
        try {
            ClassN c1316nM5506f = this.f1889c.m5506f();
            if (c1316nM5506f.m5503e() != i) {
                throw new RuntimeException("returning from invalid subroutine");
            }
            c1316nM5506f.mo3944c_();
            if (abstractC0950vM4074b == null) {
                return null;
            }
            return new ClassQ(abstractC0950vM4074b, this.f1888b, c1316nM5506f);
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("returning from invalid subroutine");
        } catch (NullPointerException e2) {
            throw new NullPointerException("can't return from non-subroutine");
        }
    }

    public ClassQ m4030a(ClassQ c0945q) {
        Abstractv abstractC0950vMo4063a = m4038c().mo4063a(c0945q.m4038c());
        ClassP c0944pM4014a = m4039d().m4014a(c0945q.m4039d());
        ClassN c1316nM4027a = m4027a(c0945q.f1889c);
        Abstractv abstractC0950vM4026a = m4026a(abstractC0950vMo4063a, c1316nM4027a);
        return (abstractC0950vM4026a == m4038c() && c0944pM4014a == m4039d() && this.f1889c == c1316nM4027a) ? this : new ClassQ(abstractC0950vM4026a, c0944pM4014a, c1316nM4027a);
    }

    public ClassQ m4031a(ClassQ c0945q, int i, int i2) {
        ClassN c1316n;
        ClassW c0951wMo4064a = m4038c().mo4064a(c0945q.m4038c(), i2);
        ClassP c0944pM4014a = m4039d().m4014a(c0945q.m4039d());
        ClassN c1316nM5506f = c0945q.f1889c.m5506f();
        c1316nM5506f.m5499c(i);
        c1316nM5506f.mo3944c_();
        if (c0951wMo4064a == m4038c() && c0944pM4014a == m4039d() && this.f1889c.equals(c1316nM5506f)) {
            return this;
        }
        if (this.f1889c.equals(c1316nM5506f)) {
            c1316n = this.f1889c;
        } else {
            if (this.f1889c.m5496b() > c1316nM5506f.m5496b()) {
                c1316n = this.f1889c;
            } else {
                c1316n = c1316nM5506f;
                c1316nM5506f = this.f1889c;
            }
            int iM5496b = c1316n.m5496b();
            int iM5496b2 = c1316nM5506f.m5496b();
            for (int i3 = iM5496b2 - 1; i3 >= 0; i3--) {
                if (c1316nM5506f.m5497b(i3) != c1316n.m5497b((iM5496b - iM5496b2) + i3)) {
                    throw new RuntimeException("Incompatible merged subroutines");
                }
            }
        }
        return new ClassQ(c0951wMo4064a, c0944pM4014a, c1316n);
    }

    public ClassQ m4032a(ae c1205ae) {
        ClassP c0944pM4013a = m4039d().m4013a();
        c0944pM4013a.m4023c();
        c0944pM4013a.m4019a(c1205ae);
        return new ClassQ(m4038c(), c0944pM4013a, this.f1889c);
    }

    public void m4033a(ClassB c0882b) {
        this.f1887a.mo4067a(c0882b);
        this.f1888b.m4017a(c0882b);
    }

    public void m4034a(ClassB c1235b) {
        int iD_ = c1235b.m5476d_();
        int iM5066j = 0;
        for (int i = 0; i < iD_; i++) {
            ClassC c1236cM5053b = c1235b.m5053b(i);
            this.f1887a.mo4066a(iM5066j, c1236cM5053b);
            iM5066j += c1236cM5053b.m5066j();
        }
    }

    public void m4035a(ClassC c1236c) {
        this.f1887a.mo4069a(c1236c);
        this.f1888b.m4018a(c1236c);
    }

    public ClassQ m4036b(int i, int i2) {
        this.f1889c.m5506f().m5499c(i);
        return new ClassQ(this.f1887a.mo4070b(), this.f1888b, ClassN.m5493a(i)).m4031a(this, i, i2);
    }

    public void m4037b() {
        this.f1887a.mo3944c_();
        this.f1888b.mo3944c_();
    }

    public Abstractv m4038c() {
        return this.f1887a;
    }

    public ClassP m4039d() {
        return this.f1888b;
    }

    public ClassN m4040e() {
        return this.f1889c;
    }
}
