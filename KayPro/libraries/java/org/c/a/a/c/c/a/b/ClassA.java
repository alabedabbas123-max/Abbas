package org.c.a.a.c.c.a.b;

import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import com.almlkaide.kaypro.android.dex.DexFormat;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.FilenameUtils;
import org.c.a.a.a.a.Interfacea;
import org.c.a.a.b.c.ClassE;
import org.c.a.a.b.c.ClassH;
import org.c.a.a.b.c.ClassR;
import org.c.a.a.b.c.ClassS;
import org.c.a.a.b.c.ClassT;
import org.c.a.a.b.c.ClassZ;
import org.c.a.a.b.d.ClassB;
import org.c.a.a.b.d.a.Abstractai;
import org.c.a.a.b.d.a.ab;
import org.c.a.a.b.d.a.ac;
import org.c.a.a.b.d.a.ad;
import org.c.a.a.b.d.a.ae;
import org.c.a.a.b.d.a.af;
import org.c.a.a.b.d.a.ag;
import org.c.a.a.b.d.a.ah;
import org.c.a.a.b.d.a.ClassB;
import org.c.a.a.b.d.a.ClassC;
import org.c.a.a.b.d.a.ClassI;
import org.c.a.a.b.d.a.ClassJ;
import org.c.a.a.b.d.a.ClassK;
import org.c.a.a.b.d.a.ClassN;
import org.c.a.a.b.d.a.ClassO;
import org.c.a.a.b.d.a.ClassP;
import org.c.a.a.b.d.a.ClassQ;
import org.c.a.a.b.d.a.ClassR;
import org.c.a.a.b.d.a.ClassS;
import org.c.a.a.b.d.a.ClassT;
import org.c.a.a.b.d.a.ClassU;
import org.c.a.a.b.d.a.ClassV;
import org.c.a.a.b.d.a.ClassW;
import org.c.a.a.b.d.a.ClassX;
import org.c.a.a.b.d.a.ClassY;
import org.c.a.a.b.d.a.Interfaceaj;
import org.c.a.a.b.d.a.Interfaced;
import org.c.a.a.b.d.a.Interfacee;
import org.c.a.a.b.d.a.Interfacel;
import org.c.a.a.b.d.a.Interfacez;
import org.c.a.a.b.d.b.Abstractn;
import org.c.a.a.b.d.b.ac;
import org.c.a.a.b.d.b.Interfacef;
import org.c.a.a.b.d.c.ClassA;
import org.c.a.a.b.d.c.ClassB;
import org.c.a.a.b.d.c.ClassC;
import org.c.a.a.b.d.c.ClassI;
import org.c.a.a.b.d.c.ClassJ;
import org.c.a.a.b.d.c.ClassK;
import org.c.a.a.b.d.c.ClassL;
import org.c.a.a.b.d.c.ClassM;
import org.c.a.a.b.d.c.Interfaced;
import org.c.a.a.b.d.c.Interfacef;
import org.c.a.a.b.d.c.Interfaceg;
import org.c.a.a.b.d.d.Interfaceb;
import org.c.a.a.b.d.e.Interfaced;
import org.c.a.a.b.d.e.Interfacef;
import org.c.a.a.b.d.e.Interfacel;
import org.c.a.a.b.f.ClassD;
import org.c.a.a.b.f.ClassE;
import org.c.a.a.b.f.ClassF;
import org.c.a.a.b.f.ClassG;
import org.c.a.a.b.f.ClassI;
import org.c.a.a.b.f.ClassK;
import org.c.a.a.b.f.ClassL;
import org.c.a.a.b.f.ClassM;
import org.c.a.a.b.f.ClassO;
import org.c.a.a.c.c.a.a.ClassB;

public class ClassA extends ClassI {

    public static boolean f6261a = true;

    public static final ClassG f6262b = new ClassG("abstract");

    public static final ClassG f6263c = new ClassG("@interface");

    public static final ClassG f6264d = new ClassG(SvgConstants.ATTR_CLASS);

    public static final ClassG f6265e = new ClassG("default");

    public static final ClassG f6266f = new ClassG("enum");

    public static final ClassG f6267g = new ClassG("implements");

    public static final ClassG f6268h = new ClassG("interface");

    public static final ClassG f6269i = new ClassG("native");

    public static final ClassG f6270j = new ClassG("package");

    public static final ClassG f6271k = new ClassG("private");

    public static final ClassG f6272l = new ClassG("protected");

    public static final ClassG f6273m = new ClassG("public");

    public static final ClassG f6274n = new ClassG("static");

    public static final ClassG f6275o = new ClassG("throws");

    public static final ClassO f6276p = new ClassO("/* bridge */");

    public static final ClassO f6277q = new ClassO("/* synthetic */");

    private int f6278aE;

    protected ClassB f6279r;

    protected ClassH f6280s;

    protected String f6281t;

    public ClassA(Interfacea interfaceC1817a, String str, int i, ClassH c1895h) {
        super(interfaceC1817a, str, i, c1895h);
        this.f6279r = new ClassB(this);
        this.f6280s = new ClassH();
        this.f6278aE = 0;
        this.f6281t = str;
    }

    protected void m8761a(int i) {
        if ((i & 1) != 0) {
            this.f6348aA.add(f6273m);
            this.f6348aA.add(ClassO.f5948s);
        }
        if ((i & 2) != 0) {
            this.f6348aA.add(f6271k);
            this.f6348aA.add(ClassO.f5948s);
        }
        if ((i & 4) != 0) {
            this.f6348aA.add(f6272l);
            this.f6348aA.add(ClassO.f5948s);
        }
        if ((65536 & i) != 0) {
            this.f6348aA.add(f6265e);
            this.f6348aA.add(ClassO.f5948s);
        }
        if ((i & 8) != 0) {
            this.f6348aA.add(f6274n);
            this.f6348aA.add(ClassO.f5948s);
        }
        if ((i & 16) != 0) {
            this.f6348aA.add(f6316Q);
            this.f6348aA.add(ClassO.f5948s);
        }
        if ((i & 256) != 0) {
            this.f6348aA.add(f6269i);
            this.f6348aA.add(ClassO.f5948s);
        }
        if ((i & 1024) != 0) {
            this.f6348aA.add(f6262b);
            this.f6348aA.add(ClassO.f5948s);
        }
        if ((i & 64) != 0) {
            this.f6348aA.add(ClassM.f5917a);
            this.f6348aA.add(f6276p);
            this.f6348aA.add(ClassF.f5897a);
            this.f6348aA.add(ClassO.f5948s);
        }
        if ((i & 4096) != 0) {
            this.f6348aA.add(ClassM.f5917a);
            this.f6348aA.add(f6277q);
            this.f6348aA.add(ClassF.f5897a);
            this.f6348aA.add(ClassO.f5948s);
        }
    }

    protected void m8762a(String str) {
        this.f6348aA.add(f6345at);
        this.f6348aA.add(ClassO.f5948s);
        this.f6348aA.add(new ClassK(1, str, str.replace('/', FilenameUtils.EXTENSION_SEPARATOR), null, null));
        this.f6348aA.add(ClassO.f5955z);
    }

    @Override
    public void mo7763a(ab c1917ab) {
        int size = c1917ab.size();
        if (size > 0) {
            int size2 = this.f6292D.size();
            Iterator it = c1917ab.iterator();
            ((Interfacez) it.next()).mo7869a(this);
            if (size > 1) {
                int i = 1;
                int size3 = -1;
                int size4 = size2;
                while (i < size) {
                    if (size4 < this.f6292D.size()) {
                        size3 = this.f6292D.size();
                        ClassB.m8745l(this.f6292D);
                        size4 = this.f6292D.size();
                    }
                    ((Interfacez) it.next()).mo7869a(this);
                    i++;
                    size3 = size3;
                    size4 = size4;
                }
                if (size3 == -1 || size4 != this.f6292D.size()) {
                    return;
                }
                this.f6292D.subList(size3, this.f6292D.size()).clear();
            }
        }
    }

    @Override
    public void mo7764a(ac c1918ac) {
        if ((c1918ac.m7870a() & 4160) == 0) {
            int iM7870a = c1918ac.m7870a();
            this.f6292D.add(ClassT.f5600j);
            this.f6348aA = new ClassK(this);
            boolean z = (this.f6278aE & iM7870a) != 0;
            if (z) {
                this.f6348aA.add(ClassO.f5928E);
            }
            Interfaced interfaceC1994dM7871b = c1918ac.m7871b();
            if (interfaceC1994dM7871b != null) {
                interfaceC1994dM7871b.mo8042a(this.f6279r);
                this.f6292D.m8776a(this.f6348aA);
                ClassB.m8737e(this.f6292D);
                this.f6348aA = new ClassK(this);
            }
            m8761a(iM7870a);
            Interfacef interfaceC2046fM7873e = c1918ac.m7873e();
            if (interfaceC2046fM7873e != null) {
                this.f6348aA.add(ClassO.f5944o);
                interfaceC2046fM7873e.mo8142a(this);
                this.f6348aA.add(ClassO.f5945p);
                this.f6348aA.add(ClassO.f5948s);
            }
            c1918ac.m7877o_().mo8142a(this);
            this.f6348aA.add(ClassO.f5948s);
            this.f6348aA.add(new ClassD(3, this.f6350aC, c1918ac.m7872d(), c1918ac.m7875l()));
            m8772b();
            this.f6294F.clear();
            Interfacee interfaceC1929eM7878t_ = c1918ac.m7878t_();
            if (interfaceC1929eM7878t_ == null) {
                this.f6348aA.add(ClassO.f5943n);
            } else {
                this.f6348aA.add(ClassL.f5913d);
                this.f6292D.m8776a(this.f6348aA);
                interfaceC1929eM7878t_.mo7869a(this);
                this.f6348aA = new ClassK(this);
                this.f6348aA.add(ClassE.f5893d);
            }
            Interfaced interfaceC2044dM7879u_ = c1918ac.m7879u_();
            if (interfaceC2044dM7879u_ != null) {
                this.f6348aA.add(ClassO.f5948s);
                this.f6348aA.add(f6275o);
                this.f6348aA.add(ClassO.f5948s);
                interfaceC2044dM7879u_.mo8142a(this);
            }
            Interfaceb interfaceC2016bM7874g = c1918ac.m7874g();
            if (interfaceC2016bM7874g == null) {
                Interfaceg interfaceC1997gM7876m = c1918ac.m7876m();
                if (interfaceC1997gM7876m == null) {
                    this.f6348aA.add(ClassO.f5955z);
                    this.f6292D.m8776a(this.f6348aA);
                } else {
                    this.f6348aA.add(ClassO.f5948s);
                    this.f6348aA.add(f6265e);
                    this.f6348aA.add(ClassO.f5948s);
                    this.f6292D.m8776a(this.f6348aA);
                    interfaceC1997gM7876m.mo8042a(this);
                    this.f6348aA = new ClassK(this);
                    this.f6348aA.add(ClassO.f5955z);
                    this.f6292D.m8776a(this.f6348aA);
                }
            } else if (f6261a) {
                this.f6292D.m8776a(this.f6348aA);
                this.f6280s.m8780a();
                interfaceC2016bM7874g.mo8055a(this.f6280s);
                boolean zM8781b = this.f6280s.m8781b();
                int size = this.f6292D.size();
                ClassS c1906sM8752s = zM8781b ? ClassB.m8752s(this.f6292D) : ClassB.m8753t(this.f6292D);
                int size2 = this.f6292D.size();
                interfaceC2016bM7874g.mo8055a(this);
                if (size2 == this.f6292D.size()) {
                    this.f6292D.subList(size, size2).clear();
                    this.f6348aA.add(ClassO.f5948s);
                    this.f6348aA.add(ClassO.f5940k);
                } else if (zM8781b) {
                    ClassB.m8725a(this.f6292D, c1906sM8752s);
                } else {
                    ClassB.m8730b(this.f6292D, c1906sM8752s);
                }
            } else {
                this.f6292D.m8776a(this.f6348aA);
                this.f6348aA.add(ClassO.f5948s);
                this.f6348aA.add(ClassO.f5940k);
            }
            if (z) {
                this.f6348aA = new ClassK(this);
                this.f6348aA.add(ClassO.f5929F);
                this.f6292D.m8776a(this.f6348aA);
                this.f6348aA = new ClassK(this);
            }
            this.f6292D.add(ClassE.f5583g);
            m8775c();
        }
    }

    @Override
    public void mo7765a(ad c1919ad) {
        boolean z = false;
        this.f6292D.clear();
        this.f6292D.add(ClassT.f5598h);
        this.f6348aA = new ClassK(this);
        if ((c1919ad.m7893k() & 32) != 0) {
            this.f6348aA.add(f6337al);
            this.f6348aA.add(ClassO.f5948s);
        }
        this.f6348aA.add(f6336ak);
        this.f6348aA.add(ClassO.f5948s);
        this.f6348aA.add(new ClassD(6, c1919ad.m7894l(), c1919ad.m7895m(), null));
        this.f6292D.m8776a(this.f6348aA);
        ClassS c1906sM8754u = ClassB.m8754u(this.f6292D);
        this.f6348aA = new ClassK(this);
        if (c1919ad.m7880b() != null && !c1919ad.m7880b().isEmpty()) {
            Iterator it = c1919ad.m7880b().iterator();
            m8763a((ae) it.next());
            while (it.hasNext()) {
                this.f6348aA.add(ClassI.f5905a);
                m8763a((ae) it.next());
            }
            z = true;
        }
        if (c1919ad.m7881d() != null && !c1919ad.m7881d().isEmpty()) {
            if (z) {
                this.f6348aA.add(ClassI.f5906b);
            }
            Iterator it2 = c1919ad.m7881d().iterator();
            m8764a((af) it2.next(), f6331af);
            while (it2.hasNext()) {
                this.f6348aA.add(ClassI.f5905a);
                m8764a((af) it2.next(), f6331af);
            }
            z = true;
        }
        if (c1919ad.m7882e() != null && !c1919ad.m7882e().isEmpty()) {
            if (z) {
                this.f6348aA.add(ClassI.f5906b);
            }
            Iterator it3 = c1919ad.m7882e().iterator();
            m8764a((af) it3.next(), f6338am);
            while (it3.hasNext()) {
                this.f6348aA.add(ClassI.f5905a);
                m8764a((af) it3.next(), f6338am);
            }
            z = true;
        }
        if (c1919ad.m7883f() != null && !c1919ad.m7883f().isEmpty()) {
            if (z) {
                this.f6348aA.add(ClassI.f5906b);
            }
            Iterator it4 = c1919ad.m7883f().iterator();
            m8762a((String) it4.next());
            while (it4.hasNext()) {
                this.f6348aA.add(ClassI.f5905a);
                m8762a((String) it4.next());
            }
            z = true;
        }
        if (c1919ad.m7884g() != null && !c1919ad.m7884g().isEmpty()) {
            if (z) {
                this.f6348aA.add(ClassI.f5906b);
            }
            Iterator it5 = c1919ad.m7884g().iterator();
            m8765a((ag) it5.next());
            while (it5.hasNext()) {
                this.f6348aA.add(ClassI.f5905a);
                m8765a((ag) it5.next());
            }
        }
        this.f6292D.m8776a(this.f6348aA);
        ClassB.m8734c(this.f6292D, c1906sM8754u);
        this.f6292D.add(ClassE.f5583g);
    }

    protected void m8763a(ae c1920ae) {
        this.f6348aA.add(f6340ao);
        if ((c1920ae.m7886b() & 8) != 0) {
            this.f6348aA.add(ClassO.f5948s);
            this.f6348aA.add(f6274n);
        }
        if ((c1920ae.m7886b() & 32) != 0) {
            this.f6348aA.add(ClassO.f5948s);
            this.f6348aA.add(f6344as);
        }
        this.f6348aA.add(ClassO.f5948s);
        this.f6348aA.add(new ClassK(6, "module-info", c1920ae.m7885a(), null, null));
        this.f6348aA.add(ClassO.f5955z);
    }

    protected void m8764a(af c1921af, ClassG c2073g) {
        this.f6348aA.add(c2073g);
        this.f6348aA.add(ClassO.f5948s);
        this.f6348aA.add(new ClassK(5, c1921af.m7887a(), c1921af.m7887a().replace('/', FilenameUtils.EXTENSION_SEPARATOR), null, null));
        if (c1921af.m7888b() != null && !c1921af.m7888b().isEmpty()) {
            this.f6348aA.add(ClassO.f5948s);
            this.f6348aA.add(f6343ar);
            if (c1921af.m7888b().size() == 1) {
                this.f6348aA.add(ClassO.f5948s);
                this.f6348aA.add(new ClassK(6, "module-info", (String) c1921af.m7888b().get(0), null, null));
            } else {
                this.f6348aA.add(ClassL.f5915f);
                this.f6348aA.add(ClassI.f5905a);
                Iterator it = c1921af.m7888b().iterator();
                this.f6348aA.add(new ClassK(6, "module-info", (String) it.next(), null, null));
                while (it.hasNext()) {
                    this.f6348aA.add(ClassO.f5931b);
                    this.f6348aA.add(ClassI.f5905a);
                    this.f6348aA.add(new ClassK(6, "module-info", (String) it.next(), null, null));
                }
                this.f6348aA.add(ClassE.f5895f);
            }
        }
        this.f6348aA.add(ClassO.f5955z);
    }

    protected void m8765a(ag c1922ag) {
        this.f6348aA.add(f6339an);
        this.f6348aA.add(ClassO.f5948s);
        String strM7889a = c1922ag.m7889a();
        this.f6348aA.add(new ClassK(1, strM7889a, strM7889a.replace('/', FilenameUtils.EXTENSION_SEPARATOR), null, null));
        this.f6348aA.add(ClassO.f5948s);
        this.f6348aA.add(f6347av);
        if (c1922ag.m7890b().size() == 1) {
            this.f6348aA.add(ClassO.f5948s);
            String str = (String) c1922ag.m7890b().get(0);
            this.f6348aA.add(new ClassK(1, str, str.replace('/', FilenameUtils.EXTENSION_SEPARATOR), null, null));
        } else {
            this.f6348aA.add(ClassL.f5915f);
            this.f6348aA.add(ClassI.f5905a);
            Iterator it = c1922ag.m7890b().iterator();
            String str2 = (String) it.next();
            this.f6348aA.add(new ClassK(1, str2, str2.replace('/', FilenameUtils.EXTENSION_SEPARATOR), null, null));
            while (it.hasNext()) {
                this.f6348aA.add(ClassO.f5931b);
                this.f6348aA.add(ClassI.f5905a);
                String str3 = (String) it.next();
                this.f6348aA.add(new ClassK(1, str3, str3.replace('/', FilenameUtils.EXTENSION_SEPARATOR), null, null));
            }
            this.f6348aA.add(ClassE.f5895f);
        }
        this.f6348aA.add(ClassO.f5955z);
    }

    @Override
    public void mo7766a(ah c1923ah) {
        Interfaceb interfaceC2016bM7891g = c1923ah.m7891g();
        if (interfaceC2016bM7891g != null) {
            this.f6292D.add(ClassT.f5600j);
            m8772b();
            this.f6294F.clear();
            this.f6348aA = new ClassK(this);
            this.f6348aA.add(f6274n);
            this.f6348aA.add(ClassO.f5948s);
            this.f6292D.m8776a(this.f6348aA);
            ClassS c1906sM8753t = ClassB.m8753t(this.f6292D);
            interfaceC2016bM7891g.mo8055a(this);
            ClassB.m8730b(this.f6292D, c1906sM8753t);
            this.f6292D.add(ClassE.f5583g);
            m8775c();
        }
    }

    protected void m8766a(Abstractai abstractC1924ai, int i, ClassG c2073g) {
        this.f6348aA = new ClassK(this);
        Interfaced interfaceC1994dM7892j = abstractC1924ai.m7892j();
        if (interfaceC1994dM7892j != null) {
            interfaceC1994dM7892j.mo8042a(this.f6279r);
            this.f6292D.m8776a(this.f6348aA);
            ClassB.m8737e(this.f6292D);
            this.f6348aA = new ClassK(this);
        }
        m8761a(i);
        this.f6348aA.add(c2073g);
        this.f6348aA.add(ClassO.f5948s);
        this.f6348aA.add(new ClassD(1, abstractC1924ai.m7894l(), abstractC1924ai.m7895m(), null));
    }

    @Override
    public void mo7768a(ClassB c1926b) {
        if ((c1926b.m7893k() & 4160) == 0) {
            this.f6292D.add(ClassT.f5598h);
            m8766a(c1926b, c1926b.m7893k() & (-1025), f6263c);
            this.f6292D.m8776a(this.f6348aA);
            Interfaced interfaceC1928dM7896a = c1926b.m7896a();
            ClassI c1933iM7897b = c1926b.m7897b();
            if (interfaceC1928dM7896a == null && c1933iM7897b == null) {
                this.f6348aA.add(ClassO.f5948s);
                this.f6348aA.add(ClassO.f5940k);
            } else {
                int size = this.f6292D.size();
                ClassS c1906sM8754u = ClassB.m8754u(this.f6292D);
                int size2 = this.f6292D.size();
                m8772b();
                this.f6350aC = c1926b.m7894l();
                this.f6295G = c1926b.m7895m();
                if (interfaceC1928dM7896a != null) {
                    interfaceC1928dM7896a.mo7869a(this);
                    if (c1933iM7897b != null) {
                        ClassB.m8745l(this.f6292D);
                    }
                }
                m7773a((Interfacel) c1933iM7897b);
                m8775c();
                if (size2 == this.f6292D.size()) {
                    this.f6292D.subList(size, size2).clear();
                    this.f6348aA.add(ClassO.f5948s);
                    this.f6348aA.add(ClassO.f5940k);
                } else {
                    ClassB.m8734c(this.f6292D, c1906sM8754u);
                }
            }
            this.f6292D.add(ClassE.f5583g);
        }
    }

    @Override
    public void mo7769a(ClassC c1927c) {
        int size = c1927c.size();
        if (size <= 0) {
            this.f6348aA.add(ClassO.f5940k);
            return;
        }
        this.f6292D.m8776a(this.f6348aA);
        ClassR c1905rM8749p = ClassB.m8749p(this.f6292D);
        if (size > 10) {
            ClassB.m8751r(this.f6292D);
        }
        this.f6348aA = new ClassK(this);
        ((Interfaceaj) c1927c.get(0)).mo7869a(this);
        for (int i = 1; i < size; i++) {
            if (this.f6348aA.isEmpty()) {
                ClassB.m8750q(this.f6292D);
                if (size > 10 && i % 10 == 0) {
                    ClassB.m8751r(this.f6292D);
                }
            } else if (size <= 10 || i % 10 != 0) {
                this.f6348aA.add(ClassO.f5934e);
            } else {
                this.f6292D.m8776a(this.f6348aA);
                ClassB.m8750q(this.f6292D);
                ClassB.m8751r(this.f6292D);
                this.f6348aA = new ClassK(this);
            }
            ((Interfaceaj) c1927c.get(i)).mo7869a(this);
        }
        this.f6292D.m8776a(this.f6348aA);
        if (this.f6293E) {
            ClassB.m8724a(this.f6292D, c1905rM8749p);
        } else {
            ClassB.m8729b(this.f6292D, c1905rM8749p);
        }
        this.f6348aA = new ClassK(this);
    }

    @Override
    public void mo7770a(ClassI c1933i) {
        m7773a(c1933i.m7902b());
    }

    @Override
    public void mo7771a(ClassJ c1934j) {
        if ((c1934j.m7893k() & 4160) == 0) {
            this.f6292D.add(ClassT.f5598h);
            m8767a((ClassV) c1934j, c1934j.m7893k(), f6264d);
            this.f6348aA.add(ClassL.f5915f);
            Interfacel interfaceC2052lM7903a = c1934j.m7903a();
            if (interfaceC2052lM7903a != null) {
                this.f6292D.m8776a(this.f6348aA);
                ClassB.m8741h(this.f6292D);
                this.f6348aA = new ClassK(this);
                this.f6348aA.add(f6332ag);
                this.f6348aA.add(ClassO.f5948s);
                interfaceC2052lM7903a.mo8142a(this);
                this.f6292D.m8776a(this.f6348aA);
                this.f6348aA = new ClassK(this);
            }
            Interfaced interfaceC2044dN_ = c1934j.m7942n_();
            if (interfaceC2044dN_ != null) {
                if (!this.f6348aA.isEmpty()) {
                    this.f6292D.m8776a(this.f6348aA);
                }
                ClassB.m8742i(this.f6292D);
                this.f6348aA = new ClassK(this);
                this.f6348aA.add(f6267g);
                this.f6348aA.add(ClassO.f5948s);
                interfaceC2044dN_.mo8142a(this);
                this.f6292D.m8776a(this.f6348aA);
                this.f6348aA = new ClassK(this);
            }
            this.f6348aA.add(ClassE.f5895f);
            this.f6292D.m8776a(this.f6348aA);
            ClassI c1933iE = c1934j.m7941e();
            if (c1933iE == null) {
                this.f6348aA.add(ClassO.f5948s);
                this.f6348aA.add(ClassO.f5940k);
            } else {
                int size = this.f6292D.size();
                ClassS c1906sM8754u = ClassB.m8754u(this.f6292D);
                int size2 = this.f6292D.size();
                m8772b();
                this.f6350aC = c1934j.m7894l();
                this.f6295G = c1934j.m7895m();
                c1933iE.mo7869a(this);
                m8775c();
                if (size2 == this.f6292D.size()) {
                    this.f6292D.subList(size, size2).clear();
                    this.f6348aA.add(ClassO.f5948s);
                    this.f6348aA.add(ClassO.f5940k);
                } else {
                    ClassB.m8734c(this.f6292D, c1906sM8754u);
                }
            }
            this.f6292D.add(ClassE.f5583g);
        }
    }

    @Override
    public void mo7772a(ClassK c1935k) {
        if ((c1935k.m7904a() & 4160) == 0) {
            this.f6292D.add(ClassT.f5600j);
            this.f6348aA = new ClassK(this);
            Interfaced interfaceC1994dM7905b = c1935k.m7905b();
            if (interfaceC1994dM7905b != null) {
                interfaceC1994dM7905b.mo8042a(this.f6279r);
                this.f6292D.m8776a(this.f6348aA);
                ClassB.m8737e(this.f6292D);
                this.f6348aA = new ClassK(this);
            }
            m8761a(c1935k.m7904a());
            Interfacef interfaceC2046fM7909k_ = c1935k.m7909k_();
            if (interfaceC2046fM7909k_ != null) {
                this.f6348aA.add(ClassO.f5944o);
                interfaceC2046fM7909k_.mo8142a(this);
                this.f6348aA.add(ClassO.f5945p);
                this.f6348aA.add(ClassO.f5948s);
            }
            this.f6348aA.add(new ClassD(4, this.f6350aC, this.f6295G, c1935k.m7907f()));
            m8772b();
            this.f6294F.clear();
            Interfacee interfaceC1929eM7910p_ = c1935k.m7910p_();
            if (interfaceC1929eM7910p_ == null) {
                this.f6348aA.add(ClassO.f5943n);
            } else {
                this.f6348aA.add(ClassL.f5913d);
                this.f6292D.m8776a(this.f6348aA);
                interfaceC1929eM7910p_.mo7869a(this);
                this.f6348aA = new ClassK(this);
                this.f6348aA.add(ClassE.f5893d);
            }
            Interfaced interfaceC2044dM7906e = c1935k.m7906e();
            if (interfaceC2044dM7906e != null) {
                this.f6348aA.add(ClassO.f5948s);
                this.f6348aA.add(f6275o);
                this.f6348aA.add(ClassO.f5948s);
                interfaceC2044dM7906e.mo8142a(this);
            }
            Interfaceb interfaceC2016bM7908g = c1935k.m7908g();
            if (interfaceC2016bM7908g == null) {
                this.f6348aA.add(ClassO.f5955z);
                this.f6292D.m8776a(this.f6348aA);
            } else {
                this.f6292D.m8776a(this.f6348aA);
                this.f6280s.m8780a();
                interfaceC2016bM7908g.mo8055a(this.f6280s);
                boolean zM8781b = this.f6280s.m8781b();
                int size = this.f6292D.size();
                ClassS c1906sM8752s = zM8781b ? ClassB.m8752s(this.f6292D) : ClassB.m8753t(this.f6292D);
                int size2 = this.f6292D.size();
                interfaceC2016bM7908g.mo8055a(this);
                if (size2 == this.f6292D.size()) {
                    this.f6292D.subList(size, size2).clear();
                    this.f6348aA.add(ClassO.f5948s);
                    this.f6348aA.add(ClassO.f5940k);
                } else if (zM8781b) {
                    ClassB.m8725a(this.f6292D, c1906sM8752s);
                } else {
                    ClassB.m8730b(this.f6292D, c1906sM8752s);
                }
            }
            this.f6292D.add(ClassE.f5583g);
            m8775c();
        }
    }

    @Override
    public void mo7774a(ClassN c1938n) {
        int i;
        if ((c1938n.m7893k() & 4160) == 0) {
            this.f6292D.add(ClassT.f5598h);
            m8766a(c1938n, c1938n.m7893k(), f6266f);
            Interfaced interfaceC2044dM7911a = c1938n.m7911a();
            if (interfaceC2044dM7911a != null) {
                this.f6348aA.add(ClassL.f5915f);
                this.f6292D.m8776a(this.f6348aA);
                ClassB.m8742i(this.f6292D);
                this.f6348aA = new ClassK(this);
                this.f6348aA.add(f6267g);
                this.f6348aA.add(ClassO.f5948s);
                interfaceC2044dM7911a.mo8142a(this);
                this.f6292D.m8776a(this.f6348aA);
                this.f6348aA = new ClassK(this);
                this.f6348aA.add(ClassE.f5895f);
            }
            this.f6292D.m8776a(this.f6348aA);
            ClassS c1906sM8754u = ClassB.m8754u(this.f6292D);
            m8772b();
            this.f6350aC = c1938n.m7894l();
            this.f6295G = c1938n.m7895m();
            List listM7912b = c1938n.m7912b();
            if (listM7912b != null && !listM7912b.isEmpty()) {
                Iterator it = listM7912b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = 0;
                        break;
                    }
                    ClassO c1939o = (ClassO) it.next();
                    if (c1939o.m7918d() != null || c1939o.m7919e() != null) {
                        i = 1;
                        break;
                    }
                }
                this.f6292D.add(ClassT.f5599i);
                ((ClassO) listM7912b.get(0)).mo7869a(this);
                int size = listM7912b.size();
                for (int i2 = 1; i2 < size; i2++) {
                    ClassB.m8723a(this.f6292D, i);
                    ((ClassO) listM7912b.get(i2)).mo7869a(this);
                }
                this.f6292D.add(ClassZ.f5606h);
                this.f6292D.add(ClassE.f5583g);
            }
            ClassI c1933iM7913c = c1938n.m7913c();
            if (c1933iM7913c != null) {
                if (listM7912b == null || listM7912b.isEmpty()) {
                    c1933iM7913c.mo7869a(this);
                } else {
                    ClassE c2217e = this.f6292D;
                    this.f6292D = new ClassE();
                    c1933iM7913c.mo7869a(this);
                    if (!this.f6292D.isEmpty()) {
                        ClassB.m8745l(c2217e);
                        c2217e.addAll(this.f6292D);
                    }
                    this.f6292D = c2217e;
                }
            }
            m8775c();
            ClassB.m8734c(this.f6292D, c1906sM8754u);
            this.f6292D.add(ClassE.f5583g);
        }
    }

    @Override
    public void mo7775a(ClassO c1939o) {
        this.f6348aA = new ClassK(this);
        Interfaced interfaceC1994dM7916b = c1939o.m7916b();
        if (interfaceC1994dM7916b != null) {
            interfaceC1994dM7916b.mo8042a(this.f6279r);
            this.f6292D.m8776a(this.f6348aA);
            ClassB.m8737e(this.f6292D);
            this.f6348aA = new ClassK(this);
        }
        this.f6348aA.m8792a(c1939o.m7914a());
        this.f6348aA.add(new ClassD(2, this.f6350aC, c1939o.m7917c(), String.valueOf('L') + this.f6350aC + ';'));
        m8772b();
        this.f6294F.clear();
        Interfacef interfaceC1970fM7918d = c1939o.m7918d();
        if (interfaceC1970fM7918d != null) {
            this.f6348aA.add(ClassL.f5913d);
            interfaceC1970fM7918d.mo7957a(this);
            this.f6348aA.add(ClassE.f5893d);
        }
        this.f6292D.m8776a(this.f6348aA);
        ClassI c1933iM7919e = c1939o.m7919e();
        if (c1933iM7919e != null) {
            ClassS c1906sM8754u = ClassB.m8754u(this.f6292D);
            c1933iM7919e.mo7869a(this);
            ClassB.m8734c(this.f6292D, c1906sM8754u);
        }
        m8775c();
    }

    @Override
    public void mo7776a(ClassP c1940p) {
        Abstractn abstractC1978nM7920a = c1940p.m7920a();
        if (abstractC1978nM7920a.getClass() == ac.class) {
            ((ac) abstractC1978nM7920a).m7968d().mo7869a(this);
        } else {
            abstractC1978nM7920a.mo7957a(this);
        }
    }

    @Override
    public void mo7777a(ClassQ c1941q) {
        if ((c1941q.m7922a() & 4160) == 0) {
            this.f6292D.add(ClassT.f5599i);
            this.f6348aA = new ClassK(this);
            Interfaced interfaceC1994dM7923b = c1941q.m7923b();
            if (interfaceC1994dM7923b != null) {
                interfaceC1994dM7923b.mo8042a(this.f6279r);
                this.f6292D.m8776a(this.f6348aA);
                ClassB.m8737e(this.f6292D);
                this.f6348aA = new ClassK(this);
            }
            m8761a(c1941q.m7922a());
            c1941q.m7924c().mo8142a(this);
            this.f6348aA.add(ClassL.f5915f);
            this.f6292D.m8776a(this.f6348aA);
            c1941q.m7925d().mo7869a(this);
            this.f6292D.add(ClassZ.f5609k);
            this.f6292D.add(ClassE.f5583g);
        }
    }

    @Override
    public void mo7778a(ClassR c1942r) {
        ClassQ c1941qM7928d = c1942r.m7928d();
        Interfaceaj interfaceC1925ajM7931g = c1942r.m7931g();
        String strMo8146e = c1941qM7928d.m7924c().mo8146e();
        this.f6348aA = new ClassK(this);
        this.f6348aA.add(ClassO.f5948s);
        switch (c1942r.m7930f()) {
            case 0:
                this.f6348aA.add(new ClassD(2, this.f6350aC, c1942r.m7929e(), strMo8146e));
                break;
            case 1:
                this.f6348aA.add(new ClassD(2, this.f6350aC, c1942r.m7929e(), "[" + strMo8146e));
                this.f6348aA.add(ClassO.f5937h);
                break;
            case 2:
                this.f6348aA.add(new ClassD(2, this.f6350aC, c1942r.m7929e(), "[[" + strMo8146e));
                this.f6348aA.add(ClassO.f5938i);
                break;
            default:
                this.f6348aA.add(new ClassD(2, this.f6350aC, c1942r.m7929e(), String.valueOf(new String(new char[c1942r.m7930f()]).replaceAll(DexFormat.MAGIC_SUFFIX, "[")) + strMo8146e));
                this.f6348aA.add(m8791c(new String(new char[c1942r.m7930f()]).replaceAll(DexFormat.MAGIC_SUFFIX, "[]")));
                break;
        }
        if (interfaceC1925ajM7931g == null) {
            this.f6292D.m8776a(this.f6348aA);
            return;
        }
        this.f6348aA.add(ClassO.f5952w);
        interfaceC1925ajM7931g.mo7869a(this);
        this.f6292D.m8776a(this.f6348aA);
    }

    @Override
    public void mo7779a(ClassS c1943s) {
        int size = c1943s.size();
        if (size > 0) {
            Iterator it = c1943s.iterator();
            ((ClassR) it.next()).mo7869a(this);
            for (int i = 1; i < size; i++) {
                ClassB.m8743j(this.f6292D);
                ((ClassR) it.next()).mo7869a(this);
            }
        }
    }

    @Override
    public void mo7780a(ClassT c1944t) {
        Interfaced interfaceC1994dM7935d = c1944t.m7935d();
        if (interfaceC1994dM7935d != null) {
            interfaceC1994dM7935d.mo8042a(this);
            this.f6348aA.add(ClassO.f5948s);
        }
        if (c1944t.m7938g()) {
            Interfacel interfaceC2052lMo7937f = c1944t.mo7937f();
            interfaceC2052lMo7937f.mo8143a(interfaceC2052lMo7937f.mo8145d() - 1).mo8142a(this);
            this.f6348aA.add(ClassO.f5925B);
        } else {
            if (c1944t.m7936e()) {
                this.f6348aA.add(f6316Q);
                this.f6348aA.add(ClassO.f5948s);
            }
            c1944t.mo7937f().mo8142a(this);
            this.f6348aA.add(ClassO.f5948s);
        }
        String strMo7939i = c1944t.mo7939i();
        this.f6348aA.add(m8791c(strMo7939i));
        this.f6294F.add(strMo7939i);
    }

    @Override
    public void mo7781a(ClassU c1945u) {
        int size = c1945u.size();
        if (size > 0) {
            Iterator it = c1945u.iterator();
            ((ClassT) it.next()).mo7869a(this);
            for (int i = 1; i < size; i++) {
                this.f6348aA.add(ClassO.f5934e);
                ((ClassT) it.next()).mo7869a(this);
            }
        }
    }

    @Override
    public void mo7782a(ClassV c1946v) {
        if ((c1946v.m7893k() & 4160) == 0) {
            this.f6278aE = 65544;
            this.f6292D.add(ClassT.f5598h);
            m8767a(c1946v, c1946v.m7893k() & (-1025), f6268h);
            this.f6348aA.add(ClassL.f5915f);
            Interfaced interfaceC2044dM7942n_ = c1946v.m7942n_();
            if (interfaceC2044dM7942n_ != null) {
                this.f6292D.m8776a(this.f6348aA);
                ClassB.m8742i(this.f6292D);
                this.f6348aA = new ClassK(this);
                this.f6348aA.add(f6332ag);
                this.f6348aA.add(ClassO.f5948s);
                interfaceC2044dM7942n_.mo8142a(this);
                this.f6292D.m8776a(this.f6348aA);
                this.f6348aA = new ClassK(this);
            }
            this.f6348aA.add(ClassE.f5895f);
            this.f6292D.m8776a(this.f6348aA);
            ClassI c1933iM7941e = c1946v.m7941e();
            if (c1933iM7941e == null) {
                this.f6348aA.add(ClassO.f5948s);
                this.f6348aA.add(ClassO.f5940k);
            } else {
                int size = this.f6292D.size();
                ClassS c1906sM8754u = ClassB.m8754u(this.f6292D);
                int size2 = this.f6292D.size();
                m8772b();
                this.f6350aC = c1946v.m7894l();
                this.f6295G = c1946v.m7895m();
                c1933iM7941e.mo7869a(this);
                m8775c();
                if (size2 == this.f6292D.size()) {
                    this.f6292D.subList(size, size2).clear();
                    this.f6348aA.add(ClassO.f5948s);
                    this.f6348aA.add(ClassO.f5940k);
                } else {
                    ClassB.m8734c(this.f6292D, c1906sM8754u);
                }
            }
            this.f6292D.add(ClassE.f5583g);
            this.f6278aE = 0;
        }
    }

    protected void m8767a(ClassV c1946v, int i, ClassG c2073g) {
        m8766a((Abstractai) c1946v, i, c2073g);
        Interfacef interfaceC2046fM7940b = c1946v.m7940b();
        if (interfaceC2046fM7940b != null) {
            this.f6348aA.add(ClassO.f5944o);
            interfaceC2046fM7940b.mo8142a(this);
            this.f6348aA.add(ClassO.f5945p);
        }
    }

    @Override
    public void mo7783a(ClassW c1947w) {
        if (c1947w.m7944b()) {
            this.f6348aA.add(f6316Q);
            this.f6348aA.add(ClassO.f5948s);
        }
        c1947w.m7945d().mo8142a(this);
        this.f6348aA.add(ClassO.f5948s);
        c1947w.m7946e().mo7869a(this);
    }

    @Override
    public void mo7784a(ClassX c1948x) {
        this.f6348aA.m8792a(c1948x.mo7900a());
        this.f6348aA.add(m8791c(c1948x.m7950d()));
        m8790b(c1948x.m7951e());
        if (c1948x.m7952f() != null) {
            this.f6348aA.add(ClassO.f5952w);
            c1948x.m7952f().mo7869a(this);
        }
    }

    @Override
    public void mo7785a(ClassY c1949y) {
        int size = c1949y.size();
        if (size > 0) {
            Iterator it = c1949y.iterator();
            ((ClassX) it.next()).mo7869a(this);
            for (int i = 1; i < size; i++) {
                this.f6348aA.add(ClassO.f5934e);
                ((ClassX) it.next()).mo7869a(this);
            }
        }
    }

    @Override
    public void mo7819a(ClassB c1951b) {
        this.f6292D.clear();
        this.f6291C.clear();
        this.f6350aC = null;
        int iLastIndexOf = this.f6281t.lastIndexOf(47);
        if (iLastIndexOf != -1) {
            ClassK c2223k = new ClassK(this);
            c2223k.add(f6270j);
            c2223k.add(ClassO.f5948s);
            c2223k.add(m8791c(this.f6281t.substring(0, iLastIndexOf).replace('/', FilenameUtils.EXTENSION_SEPARATOR)));
            c2223k.add(ClassO.f5955z);
            this.f6292D.m8776a(c2223k);
            ClassB.m8722a(this.f6292D);
        }
        if (!this.f6355az.m7719h()) {
            this.f6292D.add(this.f6355az);
            if (!this.f6292D.isEmpty()) {
                ClassB.m8728b(this.f6292D);
            }
        }
        ClassB.m8732c(this.f6292D);
        super.mo7819a(c1951b);
    }

    @Override
    public void mo7820a(ClassA c1991a) {
        m8768b(c1991a);
    }

    @Override
    public void mo7821a(ClassB c1992b) {
        m8768b(c1992b);
    }

    @Override
    public void mo7822a(ClassC c1993c) {
        int size = c1993c.size();
        if (size > 0) {
            Iterator it = c1993c.iterator();
            ((ClassB) it.next()).mo8042a(this);
            for (int i = 1; i < size; i++) {
                this.f6348aA.add(ClassO.f5948s);
                ((ClassB) it.next()).mo8042a(this);
            }
        }
    }

    @Override
    public void mo7823a(ClassI c1999i) {
        this.f6348aA.add(ClassL.f5912c);
        m7828a(c1999i.m8048d());
        this.f6348aA.add(ClassE.f5892c);
    }

    @Override
    public void mo7824a(ClassJ c2000j) {
        this.f6348aA.add(m8791c(c2000j.m8050d()));
        this.f6348aA.add(ClassO.f5952w);
        c2000j.m8051e().mo8042a(this);
    }

    @Override
    public void mo7825a(ClassK c2001k) {
        Iterator it = c2001k.iterator();
        ((ClassJ) it.next()).mo8042a(this);
        while (it.hasNext()) {
            this.f6348aA.add(ClassO.f5934e);
            ((ClassJ) it.next()).mo8042a(this);
        }
    }

    @Override
    public void mo7826a(ClassL c2002l) {
        Iterator it = c2002l.iterator();
        ((Interfaceg) it.next()).mo8042a(this);
        while (it.hasNext()) {
            this.f6348aA.add(ClassO.f5934e);
            ((Interfaceg) it.next()).mo8042a(this);
        }
    }

    @Override
    public void mo7827a(ClassM c2003m) {
        c2003m.m8053d().mo7957a(this);
    }

    public void m8768b(ClassB c1992b) {
        this.f6348aA.add(ClassO.f5930a);
        this.f6348aA.add(m8787a(c1992b.m8044d(), this.f6350aC));
        Interfaceg interfaceC1997gM8045e = c1992b.m8045e();
        if (interfaceC1997gM8045e != null) {
            this.f6348aA.add(ClassL.f5913d);
            interfaceC1997gM8045e.mo8042a(this);
            this.f6348aA.add(ClassE.f5893d);
        } else {
            Interfacef interfaceC1996fM8046f = c1992b.m8046f();
            if (interfaceC1996fM8046f != null) {
                this.f6348aA.add(ClassL.f5913d);
                interfaceC1996fM8046f.mo8042a(this);
                this.f6348aA.add(ClassE.f5893d);
            }
        }
    }
}
