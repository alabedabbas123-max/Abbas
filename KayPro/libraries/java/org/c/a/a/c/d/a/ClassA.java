package org.c.a.a.c.d.a;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.c.a.a.b.b.Abstractc;
import org.c.a.a.b.b.Abstractd;
import org.c.a.a.c.d.b.ClassA;
import org.c.a.a.c.d.c.Abstracta;
import org.c.a.a.c.d.c.Abstractb;
import org.c.a.a.d.ClassC;

public class ClassA {

    static final boolean f6361i;

    protected final ClassC f6362a;

    protected final Abstractc f6363b;

    protected final ClassA f6364c;

    protected ClassA f6365d;

    protected final int f6366e;

    protected int f6367f = 0;

    protected int f6368g = -1;

    protected int f6369h;

    static {
        f6361i = !ClassA.class.desiredAssertionStatus();
    }

    public ClassA(ClassC c2247c, Abstractc abstractC1880c, ClassA c2226a) {
        int iM7690b;
        this.f6362a = c2247c;
        this.f6363b = abstractC1880c;
        this.f6364c = c2226a;
        if (!f6361i && (c2247c == null || c2247c.size() <= 0)) {
            throw new AssertionError("Section must contain flexible fragments");
        }
        if (c2226a == null) {
            iM7690b = 1;
        } else {
            c2226a.f6365d = this;
            iM7690b = c2226a.f6363b.m7690b();
        }
        if (abstractC1880c == null) {
            this.f6366e = 0;
        } else {
            this.f6366e = abstractC1880c.m7689a() - iM7690b;
        }
    }

    protected List m8797a(int i, int i2) {
        m8812g();
        List listSubList = this.f6362a.subList(i, i2);
        ClassC c2247c = new ClassC(listSubList);
        listSubList.clear();
        return c2247c;
    }

    protected ClassA m8798a(Abstracta abstractC2233a) {
        abstractC2233a.mo8820a();
        for (ClassA c2226aM8809d = m8809d(); c2226aM8809d != null; c2226aM8809d = c2226aM8809d.m8809d()) {
            abstractC2233a.m8821b();
            Iterator it = c2226aM8809d.m8799a().iterator();
            while (it.hasNext()) {
                ((Abstractd) it.next()).mo7688a(abstractC2233a);
                if (abstractC2233a.m8822c() == 0) {
                    return c2226aM8809d;
                }
            }
        }
        return null;
    }

    public ClassC m8799a() {
        return this.f6362a;
    }

    protected void m8800a(ClassA c2228a, int i, List list) {
        Abstracta abstractC2233aM8816a = c2228a.m8816a();
        ListIterator listIterator = list.listIterator(list.size());
        abstractC2233aM8816a.mo8820a();
        while (listIterator.hasPrevious()) {
            ((Abstractd) listIterator.previous()).mo7688a(abstractC2233aM8816a);
            if (abstractC2233aM8816a.m8822c() == 0) {
                break;
            }
        }
        if (!f6361i && (abstractC2233aM8816a.m8823d() >= list.size() || abstractC2233aM8816a.m8823d() <= 1)) {
            throw new AssertionError();
        }
        int size = (list.size() + 1) - abstractC2233aM8816a.m8823d();
        this.f6362a.addAll(i, list.subList(0, size));
        this.f6362a.addAll(i, list.subList(size, list.size()));
        m8812g();
    }

    protected void m8801a(ClassC c2247c, boolean z) {
        int i = Integer.MAX_VALUE;
        while (this.f6369h > 0 && this.f6369h < i) {
            i = this.f6369h;
            Iterator it = c2247c.iterator();
            while (it.hasNext()) {
                if (((Abstractd) it.next()).mo7692a(z)) {
                    int i2 = this.f6369h - 1;
                    this.f6369h = i2;
                    if (i2 == 0) {
                        break;
                    }
                }
            }
        }
    }

    public boolean m8802a(ClassA c2228a) {
        int size = this.f6362a.size();
        Abstractb abstractC2234bM8818c = c2228a.m8818c();
        Abstractb abstractC2234bM8819d = c2228a.m8819d();
        Abstracta abstractC2233aM8816a = c2228a.m8816a();
        Abstracta abstractC2233aM8817b = c2228a.m8817b();
        ListIterator listIterator = this.f6362a.listIterator(size);
        abstractC2234bM8818c.mo8820a();
        abstractC2234bM8819d.mo8820a();
        while (listIterator.hasPrevious() && abstractC2234bM8818c.m8826f()) {
            ((Abstractd) listIterator.previous()).mo7688a(abstractC2234bM8818c);
        }
        Iterator it = this.f6362a.iterator();
        while (it.hasNext()) {
            ((Abstractd) it.next()).mo7688a(abstractC2234bM8819d);
            if (!abstractC2234bM8819d.m8826f()) {
                break;
            }
        }
        int iM8825e = abstractC2234bM8818c.m8825e();
        ClassA c2226aM8798a = m8798a(abstractC2233aM8816a);
        if (iM8825e <= 1 || c2226aM8798a == null) {
            int iM8825e2 = abstractC2234bM8819d.m8825e();
            if (iM8825e2 > 1) {
                int iM8824a = abstractC2234bM8819d.m8824a(0) + 1;
                int iM8824a2 = abstractC2234bM8819d.m8824a(iM8825e2 / 2) + 1;
                ClassA c2226aM8805b = m8805b(abstractC2233aM8817b);
                if (iM8825e2 > 1 && c2226aM8805b != null) {
                    c2226aM8805b.m8806b(c2228a, c2226aM8805b.m8799a().size() - abstractC2233aM8817b.m8823d(), m8797a(iM8824a, iM8824a2));
                    return true;
                }
            }
            return false;
        }
        int iM8824a3 = (size - 1) - abstractC2234bM8818c.m8824a(iM8825e / 2);
        int iM8824a4 = (size - 1) - abstractC2234bM8818c.m8824a(0);
        int iM8823d = abstractC2233aM8816a.m8823d();
        int iM8825e3 = abstractC2234bM8819d.m8825e();
        if (iM8825e3 > 1) {
            int iM8824a5 = abstractC2234bM8819d.m8824a(0) + 1;
            int iM8824a6 = abstractC2234bM8819d.m8824a(iM8825e3 / 2) + 1;
            ClassA c2226aM8805b2 = m8805b(abstractC2233aM8817b);
            if (c2226aM8798a.m8810e() > c2226aM8805b2.m8810e()) {
                c2226aM8805b2.m8806b(c2228a, c2226aM8805b2.m8799a().size() - abstractC2233aM8817b.m8823d(), m8797a(iM8824a5, iM8824a6));
            } else {
                c2226aM8798a.m8800a(c2228a, iM8823d, m8797a(iM8824a3, iM8824a4));
            }
        } else {
            c2226aM8798a.m8800a(c2228a, iM8823d, m8797a(iM8824a3, iM8824a4));
        }
        return true;
    }

    public boolean m8803a(boolean z) {
        if (this.f6363b == null) {
            return false;
        }
        Iterator it = this.f6362a.iterator();
        int iMo7697e = 0;
        while (it.hasNext()) {
            iMo7697e = ((Abstractd) it.next()).mo7697e() + iMo7697e;
        }
        if (!z && this.f6368g == iMo7697e) {
            return false;
        }
        this.f6368g = iMo7697e;
        if (this.f6366e == iMo7697e) {
            return false;
        }
        ClassB<ClassC> c2227b = new ClassB(this);
        ClassC c2247c = new ClassC(this.f6362a.size());
        if (this.f6366e > iMo7697e) {
            int i = this.f6366e - iMo7697e;
            this.f6369h = i;
            for (Abstractd abstractC1881d : this.f6362a) {
                if (abstractC1881d.mo7697e() < abstractC1881d.m7695c()) {
                    c2227b.m8814a(abstractC1881d.m7698f()).add(abstractC1881d);
                }
            }
            for (ClassC<Abstractd> c2247c2 : c2227b) {
                c2247c.clear();
                for (Abstractd abstractC1881d2 : c2247c2) {
                    if (abstractC1881d2.mo7697e() < abstractC1881d2.m7696d()) {
                        c2247c.add(abstractC1881d2);
                    }
                }
                m8801a(c2247c, z);
                if (this.f6369h == 0) {
                    break;
                }
            }
            if (this.f6369h > 0) {
                Iterator it2 = c2227b.iterator();
                while (it2.hasNext()) {
                    m8801a((ClassC) it2.next(), z);
                    if (this.f6369h == 0) {
                        break;
                    }
                }
            }
            return i != this.f6369h;
        }
        int i2 = iMo7697e - this.f6366e;
        this.f6369h = i2;
        for (Abstractd abstractC1881d3 : this.f6362a) {
            if (abstractC1881d3.m7693b() < abstractC1881d3.mo7697e()) {
                c2227b.m8814a(abstractC1881d3.m7698f()).add(abstractC1881d3);
            }
        }
        for (ClassC<Abstractd> c2247c3 : c2227b) {
            c2247c.clear();
            for (Abstractd abstractC1881d4 : c2247c3) {
                if (abstractC1881d4.mo7697e() > abstractC1881d4.m7696d()) {
                    c2247c.add(abstractC1881d4);
                }
            }
            m8807b(c2247c, z);
            if (this.f6369h == 0) {
                break;
            }
        }
        if (this.f6369h > 0) {
            Iterator it3 = c2227b.iterator();
            while (it3.hasNext()) {
                m8807b((ClassC) it3.next(), z);
                if (this.f6369h == 0) {
                    break;
                }
            }
        }
        return i2 != this.f6369h;
    }

    public Abstractc m8804b() {
        return this.f6363b;
    }

    protected ClassA m8805b(Abstracta abstractC2233a) {
        abstractC2233a.mo8820a();
        for (ClassA c2226aM8808c = m8808c(); c2226aM8808c != null; c2226aM8808c = c2226aM8808c.m8808c()) {
            ClassC c2247cM8799a = c2226aM8808c.m8799a();
            ListIterator listIterator = c2247cM8799a.listIterator(c2247cM8799a.size());
            abstractC2233a.m8821b();
            while (listIterator.hasPrevious()) {
                ((Abstractd) listIterator.previous()).mo7688a(abstractC2233a);
                if (abstractC2233a.m8822c() == 0) {
                    return c2226aM8808c;
                }
            }
        }
        return null;
    }

    protected void m8806b(ClassA c2228a, int i, List list) {
        Abstracta abstractC2233aM8816a = c2228a.m8816a();
        abstractC2233aM8816a.mo8820a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Abstractd) it.next()).mo7688a(abstractC2233aM8816a);
            if (abstractC2233aM8816a.m8822c() == 2) {
                break;
            }
        }
        if (!f6361i && (abstractC2233aM8816a.m8823d() >= list.size() || abstractC2233aM8816a.m8823d() <= 1)) {
            throw new AssertionError();
        }
        int iM8823d = abstractC2233aM8816a.m8823d() - 1;
        this.f6362a.addAll(i, list.subList(0, iM8823d));
        this.f6362a.addAll(i, list.subList(iM8823d, list.size()));
        m8812g();
    }

    protected void m8807b(ClassC c2247c, boolean z) {
        int i = Integer.MAX_VALUE;
        while (this.f6369h > 0 && this.f6369h < i) {
            i = this.f6369h;
            Iterator it = c2247c.iterator();
            while (it.hasNext()) {
                if (((Abstractd) it.next()).mo7694b(z)) {
                    int i2 = this.f6369h - 1;
                    this.f6369h = i2;
                    if (i2 == 0) {
                        break;
                    }
                }
            }
        }
    }

    public ClassA m8808c() {
        return this.f6364c;
    }

    public ClassA m8809d() {
        return this.f6365d;
    }

    public int m8810e() {
        return this.f6367f;
    }

    public void m8811f() {
        this.f6367f = 0;
        for (Abstractd abstractC1881d : this.f6362a) {
            if (abstractC1881d.m7696d() > abstractC1881d.mo7697e()) {
                this.f6367f = (abstractC1881d.m7696d() - abstractC1881d.mo7697e()) + this.f6367f;
            }
        }
    }

    protected void m8812g() {
        Iterator it = this.f6362a.iterator();
        while (it.hasNext()) {
            ((Abstractd) it.next()).m7691a();
        }
    }

    public String toString() {
        return "Section{flexibleFragments.size=" + this.f6362a.size() + ", fixedFragment.firstLineNumber=" + (this.f6363b == null ? "undefined" : Integer.valueOf(this.f6363b.m7689a())) + ", rate=" + this.f6367f + "}";
    }
}
