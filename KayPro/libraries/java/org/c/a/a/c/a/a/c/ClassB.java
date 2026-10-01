package org.c.a.a.c.a.a.c;

import org.c.a.a.b.a.a.ClassA;
import org.c.a.a.b.a.a.aa;
import org.c.a.a.b.a.a.ab;
import org.c.a.a.b.a.a.ac;
import org.c.a.a.b.a.a.ad;
import org.c.a.a.b.a.a.ClassB;
import org.c.a.a.b.a.a.ClassY;
import org.c.a.a.b.a.a.ClassZ;
import org.c.a.a.b.a.a.Interfaceae;
import org.c.a.a.b.a.a.Interfacex;
import org.c.a.a.b.a.b.ClassC;
import org.c.a.a.b.a.b.ClassD;
import org.c.a.a.b.a.b.ClassE;
import org.c.a.a.b.a.b.ClassF;
import org.c.a.a.b.a.b.ClassL;
import org.c.a.a.b.d.b.ae;
import org.c.a.a.b.d.b.ah;
import org.c.a.a.b.d.b.am;
import org.c.a.a.b.d.b.ClassL;
import org.c.a.a.b.d.b.ClassQ;
import org.c.a.a.b.d.b.ClassR;
import org.c.a.a.b.d.b.ClassT;
import org.c.a.a.b.d.b.ClassX;
import org.c.a.a.b.d.c.ClassA;
import org.c.a.a.b.d.c.ClassB;
import org.c.a.a.b.d.c.ClassC;
import org.c.a.a.b.d.c.ClassI;
import org.c.a.a.b.d.c.ClassJ;
import org.c.a.a.b.d.c.ClassK;
import org.c.a.a.b.d.c.ClassL;
import org.c.a.a.b.d.c.ClassM;
import org.c.a.a.b.d.c.Interfaced;
import org.c.a.a.b.d.c.Interfaceg;
import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.b.d.e.ClassK;

public class ClassB implements Interfaceae {

    static final boolean f6120c;

    protected ClassW f6121a;

    protected Interfaceg f6122b = null;

    static {
        f6120c = !ClassB.class.desiredAssertionStatus();
    }

    public ClassB(ClassW c2168w) {
        this.f6121a = c2168w;
    }

    protected ClassB m8469a(ClassA c1822a) {
        String strM7593a = c1822a.m7593a();
        if (!f6120c && (strM7593a == null || strM7593a.length() <= 2 || strM7593a.charAt(0) != 'L' || strM7593a.charAt(strM7593a.length() - 1) != ';')) {
            throw new AssertionError();
        }
        ClassI c2049iM8636a = this.f6121a.m8636a(strM7593a);
        ac[] c1825acArrM7594b = c1822a.m7594b();
        if (c1825acArrM7594b == null) {
            return new ClassB(c2049iM8636a);
        }
        if (c1825acArrM7594b.length == 1) {
            ac c1825ac = c1825acArrM7594b[0];
            String strM7599a = c1825ac.m7599a();
            Interfacex interfaceC1859xM7600b = c1825ac.m7600b();
            return "value".equals(strM7599a) ? new ClassB(c2049iM8636a, m8472a(interfaceC1859xM7600b)) : new ClassB(c2049iM8636a, new ClassJ(strM7599a, m8472a(interfaceC1859xM7600b)));
        }
        ClassK c2001k = new ClassK(c1825acArrM7594b.length);
        for (ac c1825ac2 : c1825acArrM7594b) {
            c2001k.add(new ClassJ(c1825ac2.m7599a(), m8472a(c1825ac2.m7600b())));
        }
        return new ClassB(c2049iM8636a, c2001k);
    }

    protected Interfaced m8470a(ClassB c1837b) {
        ClassA[] c1822aArrM7631a = c1837b.m7631a();
        if (c1822aArrM7631a.length == 1) {
            return m8469a(c1822aArrM7631a[0]);
        }
        ClassC c1993c = new ClassC(c1822aArrM7631a.length);
        for (ClassA c1822a : c1822aArrM7631a) {
            c1993c.add(m8469a(c1822a));
        }
        return c1993c;
    }

    public Interfaced m8471a(ClassB c1837b, ClassB c1837b2) {
        if (c1837b == null) {
            if (c1837b2 == null) {
                return null;
            }
            return m8470a(c1837b2);
        }
        if (c1837b2 == null) {
            return m8470a(c1837b);
        }
        ClassC c1993c = new ClassC();
        for (ClassA c1822a : c1837b.m7631a()) {
            c1993c.add(m8469a(c1822a));
        }
        for (ClassA c1822a2 : c1837b2.m7631a()) {
            c1993c.add(m8469a(c1822a2));
        }
        return c1993c;
    }

    public Interfaceg m8472a(Interfacex interfaceC1859x) {
        interfaceC1859x.mo7596a(this);
        return this.f6122b;
    }

    @Override
    public void mo7603a(aa c1823aa) {
        String strM7595a = c1823aa.m7595a();
        if (!f6120c && (strM7595a == null || strM7595a.length() <= 2 || strM7595a.charAt(0) != 'L' || strM7595a.charAt(strM7595a.length() - 1) != ';')) {
            throw new AssertionError();
        }
        this.f6122b = new ClassM(new am(this.f6121a.m8636a(strM7595a)));
    }

    @Override
    public void mo7604a(ab c1824ab) {
        String strM7597a = c1824ab.m7597a();
        if (!f6120c && (strM7597a == null || strM7597a.length() <= 2 || strM7597a.charAt(0) != 'L' || strM7597a.charAt(strM7597a.length() - 1) != ';')) {
            throw new AssertionError();
        }
        String strSubstring = strM7597a.substring(1, strM7597a.length() - 1);
        ClassI c2049iM8636a = this.f6121a.m8636a(strSubstring);
        this.f6122b = new ClassM(new ClassQ(c2049iM8636a, new ae(c2049iM8636a), strSubstring, c1824ab.m7598b(), strSubstring));
    }

    @Override
    public void mo7605a(ad c1826ad) {
        switch (c1826ad.m7601a()) {
            case 66:
                this.f6122b = new ClassM(new ClassT(ClassK.f5852b, ((ClassE) c1826ad.m7602b()).m7669b()));
                break;
            case 67:
                this.f6122b = new ClassM(new ClassT(ClassK.f5853c, ((ClassE) c1826ad.m7602b()).m7669b()));
                break;
            case 68:
                this.f6122b = new ClassM(new ClassL(((ClassC) c1826ad.m7602b()).m7667b()));
                break;
            case 70:
                this.f6122b = new ClassM(new ClassR(((ClassD) c1826ad.m7602b()).m7668b()));
                break;
            case 73:
                this.f6122b = new ClassM(new ClassT(ClassK.f5856f, ((ClassE) c1826ad.m7602b()).m7669b()));
                break;
            case 74:
                this.f6122b = new ClassM(new ClassX(((ClassF) c1826ad.m7602b()).m7670b()));
                break;
            case 83:
                this.f6122b = new ClassM(new ClassT(ClassK.f5858h, ((ClassE) c1826ad.m7602b()).m7669b()));
                break;
            case 90:
                this.f6122b = new ClassM(new ClassT(ClassK.f5851a, ((ClassE) c1826ad.m7602b()).m7669b()));
                break;
            case 115:
                this.f6122b = new ClassM(new ah(((ClassL) c1826ad.m7602b()).m7678b()));
                break;
        }
    }

    @Override
    public void mo7606a(ClassY c1860y) {
        this.f6122b = new ClassA(m8469a(c1860y.m7658a()));
    }

    @Override
    public void mo7607a(ClassZ c1861z) {
        Interfacex[] interfaceC1859xArrM7659a = c1861z.m7659a();
        if (interfaceC1859xArrM7659a == null) {
            this.f6122b = new ClassI();
            return;
        }
        if (interfaceC1859xArrM7659a.length == 1) {
            interfaceC1859xArrM7659a[0].mo7596a(this);
            this.f6122b = new ClassI(this.f6122b);
            return;
        }
        ClassL c2002l = new ClassL(interfaceC1859xArrM7659a.length);
        for (Interfacex interfaceC1859x : interfaceC1859xArrM7659a) {
            interfaceC1859x.mo7596a(this);
            c2002l.add(this.f6122b);
        }
        this.f6122b = new ClassI(c2002l);
    }
}
