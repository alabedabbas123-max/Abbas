package org.c.a.a.c.a.a.a.c;

import org.c.a.a.b.d.e.ClassG;
import org.c.a.a.b.d.e.ClassI;

public class ClassH {

    static final boolean f6063c;

    protected Abstracta[] f6064a = new Abstracta[10];

    protected int f6065b = 0;

    static {
        f6063c = !ClassH.class.desiredAssertionStatus();
    }

    public Abstracta m8371a(int i) {
        Abstracta abstractC2115aM8326b;
        if (i >= this.f6064a.length || (abstractC2115aM8326b = this.f6064a[i]) == null) {
            return null;
        }
        while (abstractC2115aM8326b.m8326b() != null) {
            if (!f6063c && abstractC2115aM8326b == abstractC2115aM8326b.m8326b()) {
                throw new AssertionError();
            }
            abstractC2115aM8326b = abstractC2115aM8326b.m8326b();
        }
        return abstractC2115aM8326b;
    }

    public Abstracta m8372a(int i, int i2) {
        if (i < this.f6064a.length) {
            Abstracta abstractC2115a = null;
            for (Abstracta abstractC2115aM8326b = this.f6064a[i]; abstractC2115aM8326b != null; abstractC2115aM8326b = abstractC2115aM8326b.m8326b()) {
                if (abstractC2115aM8326b.f6044e <= i2) {
                    if (abstractC2115a == null) {
                        this.f6064a[i] = abstractC2115aM8326b.m8326b();
                    } else {
                        abstractC2115a.m8321a(abstractC2115aM8326b.m8326b());
                    }
                    this.f6065b--;
                    abstractC2115aM8326b.m8321a((Abstracta) null);
                    return abstractC2115aM8326b;
                }
                if (!f6063c && abstractC2115aM8326b == abstractC2115aM8326b.m8326b()) {
                    throw new AssertionError();
                }
                abstractC2115a = abstractC2115aM8326b;
            }
        }
        return null;
    }

    public void m8373a(int i, int i2, ClassG c2047g) {
        if (i < this.f6064a.length) {
            Abstracta abstractC2115a = null;
            for (Abstracta abstractC2115aM8326b = this.f6064a[i]; abstractC2115aM8326b != null; abstractC2115aM8326b = abstractC2115aM8326b.m8326b()) {
                if (abstractC2115aM8326b.f6044e == i2) {
                    ClassE c2119e = new ClassE(i, abstractC2115aM8326b.f6044e, c2047g, abstractC2115aM8326b.f6046g);
                    c2119e.m8321a(abstractC2115aM8326b.m8326b());
                    if (abstractC2115a == null) {
                        this.f6064a[i] = c2119e;
                        return;
                    } else {
                        if (!f6063c && abstractC2115a == c2119e) {
                            throw new AssertionError();
                        }
                        abstractC2115a.m8321a(c2119e);
                        return;
                    }
                }
                if (!f6063c && abstractC2115aM8326b == abstractC2115aM8326b.m8326b()) {
                    throw new AssertionError();
                }
                abstractC2115a = abstractC2115aM8326b;
            }
        }
    }

    public void m8374a(int i, int i2, ClassI c2049i) {
        if (i < this.f6064a.length) {
            for (Abstracta abstractC2115aM8326b = this.f6064a[i]; abstractC2115aM8326b != null; abstractC2115aM8326b = abstractC2115aM8326b.m8326b()) {
                if (abstractC2115aM8326b.f6044e == i2) {
                    ClassJ c2124j = (ClassJ) abstractC2115aM8326b;
                    c2124j.f6069m = c2049i;
                    c2124j.f6068l = c2049i;
                    return;
                } else {
                    if (!f6063c && abstractC2115aM8326b == abstractC2115aM8326b.m8326b()) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    public void m8375a(int i, Abstracta abstractC2115a) {
        if (i >= this.f6064a.length) {
            Abstracta[] abstractC2115aArr = this.f6064a;
            this.f6064a = new Abstracta[i * 2];
            System.arraycopy(abstractC2115aArr, 0, this.f6064a, 0, abstractC2115aArr.length);
            this.f6064a[i] = abstractC2115a;
        } else {
            Abstracta abstractC2115a2 = this.f6064a[i];
            if (abstractC2115a2 == null) {
                this.f6064a[i] = abstractC2115a;
            } else if (abstractC2115a2.f6044e >= abstractC2115a.f6044e) {
                Abstracta abstractC2115aM8326b = abstractC2115a2.m8326b();
                while (abstractC2115aM8326b != null && abstractC2115aM8326b.f6044e > abstractC2115a.f6044e) {
                    Abstracta abstractC2115a3 = abstractC2115aM8326b;
                    abstractC2115aM8326b = abstractC2115aM8326b.m8326b();
                    abstractC2115a2 = abstractC2115a3;
                }
                if (!f6063c && abstractC2115a2 == abstractC2115a) {
                    throw new AssertionError();
                }
                abstractC2115a2.m8321a(abstractC2115a);
                if (!f6063c && abstractC2115a == abstractC2115aM8326b) {
                    throw new AssertionError();
                }
                abstractC2115a.m8321a(abstractC2115aM8326b);
            } else {
                if (!f6063c && abstractC2115a == abstractC2115a2) {
                    throw new AssertionError();
                }
                abstractC2115a.m8321a(abstractC2115a2);
                this.f6064a[i] = abstractC2115a;
            }
        }
        this.f6065b++;
    }

    public Abstracta[] m8376a(ClassB c2116b) {
        Abstracta[] abstractC2115aArr = new Abstracta[this.f6064a.length];
        for (int length = this.f6064a.length - 1; length >= 0; length--) {
            Abstracta abstractC2115aM8326b = this.f6064a[length];
            if (abstractC2115aM8326b != null) {
                Abstracta abstractC2115a = null;
                while (abstractC2115aM8326b.m8326b() != null) {
                    if (!f6063c && abstractC2115aM8326b == abstractC2115aM8326b.m8326b()) {
                        throw new AssertionError();
                    }
                    Abstracta abstractC2115a2 = abstractC2115aM8326b;
                    abstractC2115aM8326b = abstractC2115aM8326b.m8326b();
                    abstractC2115a = abstractC2115a2;
                }
                if (abstractC2115aM8326b.f6044e == 0) {
                    if (abstractC2115a == null) {
                        this.f6064a[length] = abstractC2115aM8326b.m8326b();
                    } else {
                        abstractC2115a.m8321a(abstractC2115aM8326b.m8326b());
                    }
                    this.f6065b--;
                    abstractC2115aM8326b.m8321a((Abstracta) null);
                    c2116b.m8351a(abstractC2115aM8326b);
                    abstractC2115aArr[length] = abstractC2115aM8326b;
                }
            }
        }
        return abstractC2115aArr;
    }

    public Abstracta m8377b(int i, int i2) {
        if (i < this.f6064a.length) {
            for (Abstracta abstractC2115aM8326b = this.f6064a[i]; abstractC2115aM8326b != null; abstractC2115aM8326b = abstractC2115aM8326b.m8326b()) {
                if (abstractC2115aM8326b.f6044e <= i2) {
                    return abstractC2115aM8326b;
                }
                if (!f6063c && abstractC2115aM8326b == abstractC2115aM8326b.m8326b()) {
                    throw new AssertionError();
                }
            }
        }
        return null;
    }
}
