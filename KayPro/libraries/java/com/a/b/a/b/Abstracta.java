package com.a.b.a.b;

import com.a.b.e.b.ClassO;
import com.a.b.e.b.ClassU;
import com.a.b.e.c.Abstracta;
import com.a.b.e.d.ClassA;
import com.a.b.e.d.ClassB;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfaced;
import java.util.ArrayList;

public abstract class Abstracta implements Interfacex {

    private final ClassA f1765a;

    private Interfaced[] f1766b;

    private int f1767c;

    private ClassC f1768d;

    private int f1769e;

    private Abstracta f1770f;

    private int f1771g;

    private ao f1772h;

    private ArrayList f1773i;

    private int f1774j;

    private boolean f1775k;

    private ClassU f1776l;

    private Interfaced[] f1777m;

    private int f1778n;

    public Abstracta(ClassA c1234a) {
        if (c1234a == null) {
            throw new NullPointerException("prototype == null");
        }
        this.f1765a = c1234a;
        this.f1766b = new Interfaced[10];
        this.f1777m = new Interfaced[6];
        mo3809b();
    }

    public static void m3792a(Interfaced interfaceC1237d, Interfaced interfaceC1237d2) {
        throw new al("local variable type mismatch: attempt to set or access a value of type " + interfaceC1237d.mo3828d() + " using a local variable of type " + interfaceC1237d2.mo3828d() + ". This is symptomatic of .class transformation tools that ignore local variable information.");
    }

    @Override
    public ClassA mo3793a() {
        return this.f1765a;
    }

    @Override
    public final void mo3794a(int i) {
        this.f1769e = i;
    }

    @Override
    public final void mo3795a(int i, ClassC c1236c, ClassO c1188o) {
        this.f1776l = ClassU.m4881b(i, c1236c, c1188o);
    }

    @Override
    public final void mo3796a(ao c0928ao) {
        if (c0928ao == null) {
            throw new NullPointerException("cases == null");
        }
        this.f1772h = c0928ao;
    }

    protected final void m3797a(ClassQ c0945q) {
        if (this.f1778n < 0) {
            throw new al("results never set");
        }
        if (this.f1778n == 0) {
            return;
        }
        if (this.f1776l != null) {
            c0945q.m4038c().mo4068a(m3808b(false));
            return;
        }
        ClassP c0944pM4039d = c0945q.m4039d();
        for (int i = 0; i < this.f1778n; i++) {
            if (this.f1775k) {
                c0944pM4039d.m4024d();
            }
            c0944pM4039d.m4019a(this.f1777m[i]);
        }
    }

    @Override
    public final void mo3798a(ClassQ c0945q, int i) {
        ClassP c0944pM4039d = c0945q.m4039d();
        mo3809b();
        if (i > this.f1766b.length) {
            this.f1766b = new Interfaced[i + 10];
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.f1766b[i2] = c0944pM4039d.m4025e();
        }
        this.f1767c = i;
    }

    @Override
    public void mo3799a(ClassQ c0945q, ClassA c1234a) {
        ClassB c1235bM5042c = c1234a.m5042c();
        int iD_ = c1235bM5042c.m5476d_();
        mo3798a(c0945q, iD_);
        for (int i = 0; i < iD_; i++) {
            if (!ClassY.m4080b(c1235bM5042c.mo4145a(i), this.f1766b[i])) {
                throw new al("at stack depth " + ((iD_ - 1) - i) + ", expected type " + c1235bM5042c.mo4145a(i).mo3828d() + " but found " + this.f1766b[i].mo3825a().mo3828d());
            }
        }
    }

    @Override
    public final void mo3800a(ClassQ c0945q, ClassC c1236c) {
        mo3798a(c0945q, 1);
        if (!ClassY.m4080b(c1236c, this.f1766b[0])) {
            throw new al("expected type " + c1236c.mo3828d() + " but found " + this.f1766b[0].mo3825a().mo3828d());
        }
    }

    @Override
    public final void mo3801a(ClassQ c0945q, ClassC c1236c, ClassC c1236c2) {
        mo3798a(c0945q, 2);
        if (!ClassY.m4080b(c1236c, this.f1766b[0])) {
            throw new al("expected type " + c1236c.mo3828d() + " but found " + this.f1766b[0].mo3825a().mo3828d());
        }
        if (!ClassY.m4080b(c1236c2, this.f1766b[1])) {
            throw new al("expected type " + c1236c2.mo3828d() + " but found " + this.f1766b[1].mo3825a().mo3828d());
        }
    }

    @Override
    public final void mo3802a(ClassQ c0945q, ClassC c1236c, ClassC c1236c2, ClassC c1236c3) {
        mo3798a(c0945q, 3);
        if (!ClassY.m4080b(c1236c, this.f1766b[0])) {
            throw new al("expected type " + c1236c.mo3828d() + " but found " + this.f1766b[0].mo3825a().mo3828d());
        }
        if (!ClassY.m4080b(c1236c2, this.f1766b[1])) {
            throw new al("expected type " + c1236c2.mo3828d() + " but found " + this.f1766b[1].mo3825a().mo3828d());
        }
        if (!ClassY.m4080b(c1236c3, this.f1766b[2])) {
            throw new al("expected type " + c1236c3.mo3828d() + " but found " + this.f1766b[2].mo3825a().mo3828d());
        }
    }

    @Override
    public final void mo3803a(Abstracta abstractC1200a) {
        if (abstractC1200a == null) {
            throw new NullPointerException("cst == null");
        }
        this.f1770f = abstractC1200a;
    }

    @Override
    public final void mo3804a(ClassC c1236c) {
        this.f1768d = c1236c;
    }

    protected final void m3805a(Interfaced interfaceC1237d) {
        if (interfaceC1237d == null) {
            throw new NullPointerException("result == null");
        }
        this.f1777m[0] = interfaceC1237d;
        this.f1778n = 1;
    }

    @Override
    public final void mo3806a(ArrayList arrayList) {
        this.f1773i = arrayList;
    }

    @Override
    public final void mo3807a(boolean z) {
        this.f1775k = z;
    }

    protected final ClassU m3808b(boolean z) {
        if (this.f1776l == null) {
            return null;
        }
        if (this.f1778n != 1) {
            throw new al("local target with " + (this.f1778n == 0 ? "no" : "multiple") + " results");
        }
        Interfaced interfaceC1237d = this.f1777m[0];
        ClassC c1236cMo3825a = interfaceC1237d.mo3825a();
        ClassC c1236cMo3825a2 = this.f1776l.mo3825a();
        if (c1236cMo3825a == c1236cMo3825a2) {
            return z ? this.f1776l.m4888a(interfaceC1237d) : this.f1776l;
        }
        if (!ClassY.m4080b(c1236cMo3825a2, c1236cMo3825a)) {
            m3792a(c1236cMo3825a, c1236cMo3825a2);
            return null;
        }
        if (c1236cMo3825a2 == ClassC.f3267r) {
            this.f1776l = this.f1776l.m4888a(interfaceC1237d);
        }
        return this.f1776l;
    }

    @Override
    public final void mo3809b() {
        this.f1767c = 0;
        this.f1768d = null;
        this.f1769e = 0;
        this.f1770f = null;
        this.f1771g = 0;
        this.f1772h = null;
        this.f1773i = null;
        this.f1774j = -1;
        this.f1775k = false;
        this.f1776l = null;
        this.f1778n = -1;
    }

    @Override
    public final void mo3810b(int i) {
        this.f1771g = i;
    }

    @Override
    public final void mo3811b(ClassQ c0945q, int i) {
        mo3809b();
        this.f1766b[0] = c0945q.m4038c().mo4065a(i);
        this.f1767c = 1;
        this.f1774j = i;
    }

    protected final void m3812b(Interfaced interfaceC1237d) {
        if (interfaceC1237d == null) {
            throw new NullPointerException("result == null");
        }
        this.f1777m[this.f1778n] = interfaceC1237d;
        this.f1778n++;
    }

    protected final int m3813c() {
        return this.f1767c;
    }

    protected final Interfaced m3814c(int i) {
        if (i >= this.f1767c) {
            throw new IllegalArgumentException("n >= argCount");
        }
        try {
            return this.f1766b[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("n < 0");
        }
    }

    protected final ClassC m3815d() {
        return this.f1768d;
    }

    protected final Interfaced m3816d(int i) {
        if (i >= this.f1778n) {
            throw new IllegalArgumentException("n >= resultCount");
        }
        try {
            return this.f1777m[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("n < 0");
        }
    }

    protected final int m3817e() {
        return this.f1769e;
    }

    protected final Abstracta m3818f() {
        return this.f1770f;
    }

    protected final int m3819g() {
        return this.f1771g;
    }

    protected final ao m3820h() {
        return this.f1772h;
    }

    protected final ArrayList m3821i() {
        return this.f1773i;
    }

    protected final int m3822j() {
        return this.f1774j;
    }

    protected final void m3823k() {
        this.f1778n = 0;
    }

    protected final int m3824l() {
        if (this.f1778n < 0) {
            throw new al("results never set");
        }
        return this.f1778n;
    }
}
