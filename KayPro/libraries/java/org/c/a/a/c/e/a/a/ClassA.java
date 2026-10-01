package org.c.a.a.c.e.a.a;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.c.a.a.b.c.ClassA;
import org.c.a.a.b.c.ClassB;
import org.c.a.a.b.c.ClassC;
import org.c.a.a.b.c.ClassD;
import org.c.a.a.b.c.ClassE;
import org.c.a.a.b.c.ClassF;
import org.c.a.a.b.c.ClassG;
import org.c.a.a.b.c.ClassH;
import org.c.a.a.b.c.ClassI;
import org.c.a.a.b.c.ClassM;
import org.c.a.a.b.c.ClassO;
import org.c.a.a.b.c.ClassP;
import org.c.a.a.b.c.ClassQ;
import org.c.a.a.b.c.ClassR;
import org.c.a.a.b.c.ClassS;
import org.c.a.a.b.c.ClassT;
import org.c.a.a.b.c.ClassU;
import org.c.a.a.b.c.ClassV;
import org.c.a.a.b.c.ClassX;
import org.c.a.a.b.c.ClassY;
import org.c.a.a.b.c.ClassZ;
import org.c.a.a.b.c.Interfacel;
import org.c.a.a.b.f.ClassE;
import org.c.a.a.b.f.ClassF;
import org.c.a.a.b.f.ClassG;
import org.c.a.a.b.f.ClassI;
import org.c.a.a.b.f.ClassK;
import org.c.a.a.b.f.ClassL;
import org.c.a.a.b.f.ClassM;
import org.c.a.a.b.f.ClassO;
import org.c.a.a.b.f.Interfacep;
import org.c.a.a.d.ClassC;

public class ClassA implements Interfacel {

    protected static final ClassB f6394a = new ClassB();

    protected static final ClassG f6395b = new ClassG("do");

    protected static final ClassG f6396c = new ClassG("import");

    protected static final ClassG f6397d = new ClassG("for");

    protected static final ClassG f6398e = new ClassG("true");

    protected static final ClassG f6399f = new ClassG("try");

    protected static final ClassG f6400g = new ClassG("while");

    protected static final List f6401h = Arrays.asList(f6395b);

    protected static final List f6402i = Arrays.asList(f6397d, ClassO.f5939j);

    protected static final List f6403j = Arrays.asList(f6400g, ClassO.f5948s, ClassO.f5941l, f6398e, ClassO.f5942m);

    protected static final List f6404k = Arrays.asList(f6399f);

    protected ClassC f6405l = new ClassC(this);

    protected ClassD f6406m = new ClassD(this);

    protected ClassC f6407n;

    public ClassA(int i) {
        this.f6407n = new ClassC(i);
    }

    public ClassC m8831a() {
        return this.f6407n;
    }

    @Override
    public void mo7727a(ClassA c1887a) {
        switch (c1887a.mo7697e()) {
            case 0:
                this.f6407n.add(ClassO.f5948s);
                this.f6407n.add(ClassE.f5890a);
                break;
            case 1:
                this.f6407n.add(ClassI.f5905a);
                this.f6407n.add(ClassE.f5890a);
                break;
            case 2:
                this.f6407n.add(ClassI.f5906b);
                this.f6407n.add(ClassE.f5890a);
                break;
            default:
                this.f6407n.add(new ClassI(c1887a.mo7697e()));
                this.f6407n.add(ClassE.f5890a);
                break;
        }
    }

    @Override
    public void mo7728a(ClassB c1889b) {
        switch (c1889b.mo7697e()) {
            case 0:
                this.f6407n.add(ClassO.f5948s);
                this.f6407n.add(ClassE.f5890a);
                this.f6407n.add(ClassO.f5931b);
                break;
            case 1:
                this.f6407n.add(ClassI.f5905a);
                this.f6407n.add(ClassE.f5890a);
                this.f6407n.add(ClassO.f5931b);
                break;
            case 2:
                this.f6407n.add(ClassI.f5906b);
                this.f6407n.add(ClassE.f5890a);
                this.f6407n.add(ClassO.f5931b);
                break;
            default:
                this.f6407n.add(new ClassI(c1889b.mo7697e()));
                this.f6407n.add(ClassE.f5890a);
                this.f6407n.add(ClassO.f5931b);
                break;
        }
    }

    @Override
    public void mo7729a(ClassC c1890c) {
        switch (c1890c.mo7697e()) {
            case 0:
                this.f6407n.add(ClassO.f5948s);
                this.f6407n.add(ClassE.f5890a);
                break;
            case 1:
                if (c1890c.m7713h().mo7697e() != 0) {
                    this.f6407n.add(ClassI.f5905a);
                    this.f6407n.add(ClassE.f5890a);
                } else {
                    this.f6407n.add(ClassO.f5948s);
                    this.f6407n.add(ClassE.f5890a);
                    this.f6407n.add(ClassI.f5905a);
                }
                break;
            case 2:
                this.f6407n.add(ClassI.f5905a);
                this.f6407n.add(ClassE.f5890a);
                this.f6407n.add(ClassI.f5905a);
                break;
            default:
                this.f6407n.add(new ClassI(c1890c.mo7697e() - 1));
                this.f6407n.add(ClassE.f5890a);
                this.f6407n.add(ClassI.f5905a);
                break;
        }
    }

    @Override
    public void mo7730a(ClassD c1891d) {
        switch (c1891d.mo7697e()) {
            case 0:
                this.f6407n.add(ClassO.f5948s);
                this.f6407n.add(ClassE.f5890a);
                this.f6407n.add(ClassO.f5931b);
                break;
            case 1:
                this.f6407n.add(ClassI.f5905a);
                this.f6407n.add(ClassE.f5890a);
                this.f6407n.add(ClassO.f5931b);
                this.f6407n.add(ClassO.f5948s);
                break;
            case 2:
                this.f6407n.add(ClassI.f5905a);
                this.f6407n.add(ClassE.f5890a);
                this.f6407n.add(ClassO.f5931b);
                this.f6407n.add(ClassI.f5905a);
                break;
            default:
                this.f6407n.add(new ClassI(c1891d.mo7697e() - 1));
                this.f6407n.add(ClassE.f5890a);
                this.f6407n.add(ClassO.f5931b);
                this.f6407n.add(ClassI.f5905a);
                break;
        }
    }

    @Override
    public void mo7731a(ClassE c1892e) {
    }

    @Override
    public void mo7732a(ClassF c1893f) {
        switch (c1893f.mo7697e()) {
            case 0:
                switch (c1893f.m7715h().mo7697e()) {
                    case 0:
                    case 1:
                        this.f6407n.add(ClassO.f5948s);
                        this.f6407n.add(ClassE.f5895f);
                        break;
                    default:
                        this.f6407n.add(ClassO.f5948s);
                        this.f6407n.add(ClassE.f5890a);
                        this.f6407n.add(ClassO.f5948s);
                        break;
                }
                break;
            case 1:
                switch (c1893f.m7715h().mo7697e()) {
                    case 0:
                        this.f6407n.add(ClassE.f5895f);
                        this.f6407n.add(ClassI.f5905a);
                        break;
                    default:
                        this.f6407n.add(ClassI.f5905a);
                        this.f6407n.add(ClassE.f5890a);
                        break;
                }
                break;
            case 2:
                switch (c1893f.m7715h().mo7697e()) {
                    case 0:
                        this.f6407n.add(ClassE.f5895f);
                        this.f6407n.add(ClassI.f5906b);
                        break;
                    default:
                        this.f6407n.add(ClassI.f5905a);
                        this.f6407n.add(ClassE.f5890a);
                        this.f6407n.add(ClassI.f5905a);
                        break;
                }
                break;
            default:
                switch (c1893f.m7715h().mo7697e()) {
                    case 0:
                        this.f6407n.add(ClassE.f5895f);
                        this.f6407n.add(new ClassI(c1893f.mo7697e()));
                        break;
                    default:
                        this.f6407n.add(ClassI.f5905a);
                        this.f6407n.add(ClassE.f5890a);
                        this.f6407n.add(new ClassI(c1893f.mo7697e() - 1));
                        break;
                }
                break;
        }
    }

    @Override
    public void mo7733a(ClassG c1894g) {
        int iM7758a = c1894g.m7716h().m7758a();
        switch (c1894g.mo7697e()) {
            case 0:
                this.f6407n.add(ClassO.f5948s);
                this.f6407n.add(ClassE.f5890a);
                this.f6407n.add(ClassO.f5948s);
                break;
            case 1:
                if (iM7758a != 0) {
                    this.f6407n.add(ClassI.f5905a);
                    this.f6407n.add(ClassE.f5890a);
                    this.f6407n.add(ClassO.f5948s);
                } else {
                    this.f6407n.add(ClassO.f5948s);
                    this.f6407n.add(ClassE.f5890a);
                    this.f6407n.add(ClassI.f5905a);
                }
                break;
            case 2:
                switch (iM7758a) {
                    case 0:
                        this.f6407n.add(ClassO.f5948s);
                        this.f6407n.add(ClassE.f5890a);
                        this.f6407n.add(ClassI.f5906b);
                        break;
                    case 1:
                        this.f6407n.add(ClassI.f5905a);
                        this.f6407n.add(ClassE.f5890a);
                        this.f6407n.add(ClassI.f5905a);
                        break;
                    default:
                        this.f6407n.add(new ClassI(c1894g.mo7697e() - 1));
                        this.f6407n.add(ClassE.f5890a);
                        this.f6407n.add(ClassI.f5905a);
                        break;
                }
                break;
            default:
                switch (iM7758a) {
                    case 0:
                        this.f6407n.add(ClassO.f5948s);
                        this.f6407n.add(ClassE.f5890a);
                        this.f6407n.add(new ClassI(c1894g.mo7697e()));
                        break;
                    case 1:
                        this.f6407n.add(new ClassI(c1894g.mo7697e()));
                        this.f6407n.add(ClassE.f5890a);
                        break;
                    default:
                        this.f6407n.add(new ClassI(c1894g.mo7697e() - 1));
                        this.f6407n.add(ClassE.f5890a);
                        this.f6407n.add(ClassI.f5905a);
                        break;
                }
                break;
        }
    }

    @Override
    public void mo7734a(ClassH c1895h) {
        ClassC<ClassI> c2247c = new ClassC(c1895h.m7721j());
        Collections.sort(c2247c, f6394a);
        this.f6407n.add(ClassM.f5920d);
        for (ClassI c1896i : c2247c) {
            this.f6407n.add(f6396c);
            this.f6407n.add(ClassO.f5948s);
            this.f6407n.add(new ClassK(1, c1896i.m7722a(), c1896i.m7723b(), null, null));
            this.f6407n.add(ClassO.f5955z);
            this.f6407n.add(ClassI.f5905a);
        }
        this.f6407n.add(ClassF.f5900d);
    }

    @Override
    public void mo7735a(ClassM c1900m) {
        this.f6405l.m8834a(c1900m.m7689a());
        Iterator it = c1900m.m7749c().iterator();
        while (it.hasNext()) {
            ((Interfacep) it.next()).mo8184a(this.f6405l);
        }
    }

    @Override
    public void mo7736a(ClassO c1902o) {
        switch (c1902o.mo7697e()) {
            case 0:
                this.f6407n.add(ClassO.f5948s);
                break;
            case 1:
                this.f6407n.add(ClassI.f5905a);
                break;
            case 2:
                this.f6407n.add(ClassI.f5906b);
                break;
            default:
                this.f6407n.add(new ClassI(c1902o.mo7697e()));
                break;
        }
    }

    @Override
    public void mo7737a(ClassP c1903p) {
        switch (c1903p.mo7697e()) {
            case 0:
                this.f6407n.add(ClassO.f5948s);
                break;
            case 1:
                this.f6407n.add(ClassI.f5905a);
                break;
            case 2:
                this.f6407n.add(ClassI.f5906b);
                break;
            default:
                this.f6407n.add(new ClassI(c1903p.mo7697e()));
                break;
        }
    }

    @Override
    public void mo7738a(ClassQ c1904q) {
        switch (c1904q.mo7697e()) {
            case 0:
                break;
            case 1:
                this.f6407n.add(ClassI.f5905a);
                break;
            case 2:
                this.f6407n.add(ClassI.f5906b);
                break;
            default:
                this.f6407n.add(new ClassI(c1904q.mo7697e()));
                break;
        }
    }

    @Override
    public void mo7739a(ClassR c1905r) {
        switch (c1905r.mo7697e()) {
            case 0:
                this.f6407n.add(ClassL.f5910a);
                this.f6407n.add(ClassO.f5948s);
                break;
            case 1:
                this.f6407n.add(ClassL.f5910a);
                this.f6407n.add(ClassI.f5905a);
                break;
            case 2:
                this.f6407n.add(ClassL.f5910a);
                this.f6407n.add(ClassI.f5906b);
                break;
            default:
                this.f6407n.add(ClassL.f5910a);
                this.f6407n.add(new ClassI(c1905r.mo7697e()));
                break;
        }
    }

    @Override
    public void mo7740a(ClassS c1906s) {
        switch (c1906s.mo7697e()) {
            case 0:
                this.f6407n.add(ClassO.f5948s);
                this.f6407n.add(ClassL.f5910a);
                this.f6407n.add(ClassO.f5948s);
                break;
            case 1:
                this.f6407n.add(ClassO.f5948s);
                this.f6407n.add(ClassL.f5910a);
                this.f6407n.add(ClassI.f5905a);
                break;
            case 2:
                this.f6407n.add(ClassI.f5905a);
                this.f6407n.add(ClassL.f5910a);
                this.f6407n.add(ClassI.f5905a);
                break;
            default:
                this.f6407n.add(ClassI.f5905a);
                this.f6407n.add(ClassL.f5910a);
                this.f6407n.add(new ClassI(c1906s.mo7697e() - 1));
                break;
        }
    }

    @Override
    public void mo7741a(ClassT c1907t) {
    }

    @Override
    public void mo7742a(ClassU c1908u) {
        switch (c1908u.mo7697e()) {
            case 0:
                this.f6407n.add(ClassL.f5915f);
                this.f6407n.add(ClassO.f5948s);
                break;
            case 1:
                switch (c1908u.m7756h().mo7697e()) {
                    case 0:
                        this.f6407n.add(ClassL.f5915f);
                        this.f6407n.add(ClassI.f5905a);
                        break;
                    default:
                        this.f6407n.add(ClassO.f5948s);
                        this.f6407n.add(ClassL.f5910a);
                        this.f6407n.add(ClassI.f5905a);
                        break;
                }
                break;
            case 2:
                this.f6407n.add(ClassI.f5905a);
                this.f6407n.add(ClassL.f5910a);
                this.f6407n.add(ClassI.f5905a);
                break;
            default:
                this.f6407n.add(ClassI.f5905a);
                this.f6407n.add(ClassL.f5910a);
                this.f6407n.add(new ClassI(c1908u.mo7697e() - 1));
                break;
        }
    }

    @Override
    public void mo7743a(ClassV c1909v) {
        int iM7758a = c1909v.m7757h().m7758a();
        switch (c1909v.mo7697e()) {
            case 0:
                this.f6407n.add(ClassO.f5948s);
                this.f6407n.add(ClassL.f5910a);
                this.f6407n.add(ClassO.f5948s);
                break;
            case 1:
                if (iM7758a != 0) {
                    this.f6407n.add(ClassO.f5948s);
                    this.f6407n.add(ClassL.f5910a);
                    this.f6407n.add(ClassI.f5905a);
                } else {
                    this.f6407n.add(ClassI.f5905a);
                    this.f6407n.add(ClassL.f5910a);
                    this.f6407n.add(ClassO.f5948s);
                }
                break;
            case 2:
                switch (iM7758a) {
                    case 0:
                        this.f6407n.add(ClassI.f5906b);
                        this.f6407n.add(ClassL.f5910a);
                        this.f6407n.add(ClassO.f5948s);
                        break;
                    case 1:
                        this.f6407n.add(ClassO.f5948s);
                        this.f6407n.add(ClassL.f5910a);
                        this.f6407n.add(ClassI.f5906b);
                        break;
                    default:
                        this.f6407n.add(ClassI.f5905a);
                        this.f6407n.add(ClassL.f5910a);
                        this.f6407n.add(ClassI.f5905a);
                        break;
                }
                break;
            default:
                switch (iM7758a) {
                    case 0:
                        this.f6407n.add(new ClassI(c1909v.mo7697e()));
                        this.f6407n.add(ClassL.f5910a);
                        this.f6407n.add(ClassO.f5948s);
                        break;
                    case 1:
                        this.f6407n.add(ClassO.f5948s);
                        this.f6407n.add(ClassL.f5910a);
                        this.f6407n.add(new ClassI(c1909v.mo7697e()));
                        break;
                    default:
                        this.f6407n.add(ClassI.f5905a);
                        this.f6407n.add(ClassL.f5910a);
                        this.f6407n.add(new ClassI(c1909v.mo7697e() - 1));
                        break;
                }
                break;
        }
    }

    protected void m8832a(ClassV c1909v, Collection collection) {
        int iM7758a = c1909v.m7757h().m7758a();
        switch (c1909v.mo7697e()) {
            case 0:
                this.f6407n.addAll(collection);
                this.f6407n.add(ClassO.f5948s);
                this.f6407n.add(ClassL.f5910a);
                this.f6407n.add(ClassO.f5948s);
                break;
            case 1:
                if (iM7758a != 0) {
                    this.f6407n.addAll(collection);
                    this.f6407n.add(ClassO.f5948s);
                    this.f6407n.add(ClassL.f5910a);
                    this.f6407n.add(ClassI.f5905a);
                } else {
                    this.f6407n.add(ClassI.f5905a);
                    this.f6407n.addAll(collection);
                    this.f6407n.add(ClassO.f5948s);
                    this.f6407n.add(ClassL.f5910a);
                    this.f6407n.add(ClassO.f5948s);
                }
                break;
            case 2:
                switch (iM7758a) {
                    case 0:
                        this.f6407n.add(ClassI.f5906b);
                        this.f6407n.addAll(collection);
                        this.f6407n.add(ClassO.f5948s);
                        this.f6407n.add(ClassL.f5910a);
                        this.f6407n.add(ClassO.f5948s);
                        break;
                    case 1:
                        this.f6407n.add(ClassI.f5905a);
                        this.f6407n.addAll(collection);
                        this.f6407n.add(ClassO.f5948s);
                        this.f6407n.add(ClassL.f5910a);
                        this.f6407n.add(ClassI.f5905a);
                        break;
                    default:
                        this.f6407n.addAll(collection);
                        this.f6407n.add(ClassI.f5905a);
                        this.f6407n.add(ClassL.f5910a);
                        this.f6407n.add(ClassI.f5905a);
                        break;
                }
                break;
            default:
                switch (iM7758a) {
                    case 0:
                        this.f6407n.add(new ClassI(c1909v.mo7697e()));
                        this.f6407n.addAll(collection);
                        this.f6407n.add(ClassO.f5948s);
                        this.f6407n.add(ClassL.f5910a);
                        this.f6407n.add(ClassO.f5948s);
                        break;
                    case 1:
                        this.f6407n.addAll(collection);
                        this.f6407n.add(ClassO.f5948s);
                        this.f6407n.add(ClassL.f5910a);
                        this.f6407n.add(new ClassI(c1909v.mo7697e()));
                        break;
                    default:
                        this.f6407n.addAll(collection);
                        this.f6407n.add(ClassI.f5905a);
                        this.f6407n.add(ClassL.f5910a);
                        this.f6407n.add(new ClassI(c1909v.mo7697e() - 1));
                        break;
                }
                break;
        }
    }

    @Override
    public void mo7744a(ClassX c1911x) {
        m8832a(c1911x, f6401h);
    }

    @Override
    public void mo7745a(ClassY c1912y) {
        m8832a(c1912y, f6404k);
    }

    @Override
    public void mo7746a(ClassZ c1913z) {
        Iterator it = c1913z.m7761h().iterator();
        while (it.hasNext()) {
            ((Interfacep) it.next()).mo8184a(this.f6406m);
        }
    }
}
