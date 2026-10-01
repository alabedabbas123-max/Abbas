package org.c.a.a.c.c.a.b;

import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.c.a.a.a.a.Interfacea;
import org.c.a.a.b.c.ClassH;
import org.c.a.a.b.c.ClassR;
import org.c.a.a.b.c.ClassS;
import org.c.a.a.b.d.a.ClassI;
import org.c.a.a.b.d.b.Abstractn;
import org.c.a.a.b.d.b.aa;
import org.c.a.a.b.d.b.ab;
import org.c.a.a.b.d.b.ac;
import org.c.a.a.b.d.b.ad;
import org.c.a.a.b.d.b.ae;
import org.c.a.a.b.d.b.af;
import org.c.a.a.b.d.b.ag;
import org.c.a.a.b.d.b.ah;
import org.c.a.a.b.d.b.ai;
import org.c.a.a.b.d.b.aj;
import org.c.a.a.b.d.b.ak;
import org.c.a.a.b.d.b.al;
import org.c.a.a.b.d.b.am;
import org.c.a.a.b.d.b.ClassE;
import org.c.a.a.b.d.b.ClassG;
import org.c.a.a.b.d.b.ClassH;
import org.c.a.a.b.d.b.ClassI;
import org.c.a.a.b.d.b.ClassJ;
import org.c.a.a.b.d.b.ClassK;
import org.c.a.a.b.d.b.ClassL;
import org.c.a.a.b.d.b.ClassM;
import org.c.a.a.b.d.b.ClassP;
import org.c.a.a.b.d.b.ClassQ;
import org.c.a.a.b.d.b.ClassR;
import org.c.a.a.b.d.b.ClassS;
import org.c.a.a.b.d.b.ClassT;
import org.c.a.a.b.d.b.ClassU;
import org.c.a.a.b.d.b.ClassV;
import org.c.a.a.b.d.b.ClassW;
import org.c.a.a.b.d.b.ClassX;
import org.c.a.a.b.d.b.ClassY;
import org.c.a.a.b.d.b.ClassZ;
import org.c.a.a.b.d.b.Interfacef;
import org.c.a.a.b.d.d.ClassN;
import org.c.a.a.b.d.d.Interfaceb;
import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.b.d.e.ClassK;
import org.c.a.a.b.d.e.Interfacee;
import org.c.a.a.b.f.ClassB;
import org.c.a.a.b.f.ClassC;
import org.c.a.a.b.f.ClassE;
import org.c.a.a.b.f.ClassG;
import org.c.a.a.b.f.ClassJ;
import org.c.a.a.b.f.ClassK;
import org.c.a.a.b.f.ClassL;
import org.c.a.a.b.f.ClassN;
import org.c.a.a.b.f.ClassO;
import org.c.a.a.c.a.a.c.aa;
import org.c.a.a.c.c.a.a.ClassA;
import org.c.a.a.c.c.a.a.ClassB;
import org.c.a.a.c.c.a.a.ClassC;
import org.c.a.a.d.ClassC;

public class ClassC extends ClassJ {

    protected LinkedList f6291C;

    protected ClassE f6292D;

    protected boolean f6293E;

    protected HashSet f6294F;

    protected String f6295G;

    protected ClassF f6296H;

    public static final ClassG f6285u = new ClassG(SvgConstants.ATTR_CLASS);

    public static final ClassG f6286v = new ClassG("false");

    public static final ClassG f6287w = new ClassG("instanceof");

    public static final ClassG f6288x = new ClassG("length");

    public static final ClassG f6289y = new ClassG("new");

    public static final ClassG f6290z = new ClassG("null");

    public static final ClassG f6283A = new ClassG("this");

    public static final ClassG f6284B = new ClassG("true");

    public ClassC(Interfacea interfaceC1817a, String str, int i, ClassH c1895h) {
        super(interfaceC1817a, str, i, c1895h);
        this.f6291C = new LinkedList();
        this.f6292D = new ClassE();
        this.f6293E = false;
        this.f6294F = new HashSet();
        this.f6296H = new ClassF(this);
    }

    public ClassC m8769a() {
        return this.f6292D;
    }

    @Override
    public void mo7786a(aa c1953aa) {
        int i;
        this.f6348aA.m8793a(c1953aa);
        this.f6348aA.add(f6289y);
        this.f6348aA.add(ClassO.f5948s);
        c1953aa.mo7963f().mo8142a(this);
        Interfacef interfaceC1970fM7958d = c1953aa.m7958d();
        int iMo8145d = c1953aa.mo7963f().mo8145d();
        if (iMo8145d > 0) {
            this.f6348aA.remove(this.f6348aA.size() - 1);
        }
        if (interfaceC1970fM7958d == null) {
            i = iMo8145d;
        } else if (interfaceC1970fM7958d.mo7867j_()) {
            Iterator it = interfaceC1970fM7958d.mo7868l_().iterator();
            while (true) {
                i = iMo8145d;
                if (!it.hasNext()) {
                    break;
                }
                this.f6348aA.add(ClassL.f5911b);
                ((Abstractn) it.next()).mo7957a(this);
                this.f6348aA.add(ClassE.f5891b);
                iMo8145d = i - 1;
            }
        } else {
            this.f6348aA.add(ClassL.f5911b);
            interfaceC1970fM7958d.mo7957a(this);
            this.f6348aA.add(ClassE.f5891b);
            i = iMo8145d - 1;
        }
        m8790b(i);
    }

    @Override
    public void mo7787a(ab c1954ab) {
        Interfacee interfaceC2045eM7962d = c1954ab.m7962d();
        ClassI c1933iM7967l = c1954ab.m7967l();
        this.f6348aA.m8793a(c1954ab);
        this.f6348aA.add(f6289y);
        this.f6348aA.add(ClassO.f5948s);
        if (interfaceC2045eM7962d != null) {
            this.f6348aA.add(ClassO.f5944o);
            interfaceC2045eM7962d.mo8142a(this);
            this.f6348aA.add(ClassO.f5945p);
        }
        c1954ab.mo7963f().mo8142a(this);
        this.f6348aA.add(ClassL.f5913d);
        Interfacef interfaceC1970fM7966j = c1954ab.m7966j();
        if (interfaceC1970fM7966j != null) {
            interfaceC1970fM7966j.mo7957a(this);
        }
        this.f6348aA.add(ClassE.f5893d);
        if (c1933iM7967l != null) {
            this.f6292D.m8776a(this.f6348aA);
            ClassS c1906sM8754u = ClassB.m8754u(this.f6292D);
            ClassI c2049iM7964g = c1954ab.m7964g();
            m8772b();
            this.f6350aC = c2049iM7964g.m8150g();
            this.f6295G = c2049iM7964g.m8152j();
            c1933iM7967l.mo7869a(this);
            if (!this.f6348aA.isEmpty()) {
                this.f6348aA = new ClassK(this);
            }
            m8775c();
            if (this.f6293E) {
                ClassB.m8736d(this.f6292D, c1906sM8754u);
            } else {
                ClassB.m8738e(this.f6292D, c1906sM8754u);
            }
            this.f6348aA = new ClassK(this);
        }
    }

    @Override
    public void mo7788a(ac c1955ac) {
        this.f6348aA.m8793a(c1955ac);
        this.f6348aA.add(f6289y);
        this.f6348aA.add(ClassO.f5948s);
        c1955ac.mo7963f().mo8142a(this);
        this.f6348aA.add(ClassO.f5948s);
        c1955ac.m7968d().mo7869a(this);
    }

    @Override
    public void mo7789a(ad c1956ad) {
        this.f6348aA.m8793a(c1956ad);
        this.f6348aA.add(f6290z);
    }

    @Override
    public void mo7790a(ae c1957ae) {
        if (c1957ae.m7971g()) {
            this.f6348aA.m8793a(c1957ae);
            c1957ae.m7969d().mo8142a(this);
        }
    }

    @Override
    public void mo7791a(af c1958af) {
        m8771a(c1958af, c1958af.m7974g());
        this.f6348aA.add(m8791c(c1958af.m7973d()));
    }

    @Override
    public void mo7792a(ag c1959ag) {
        this.f6348aA.m8793a(c1959ag.m7977g());
        this.f6348aA.add(m8791c(c1959ag.m7976d()));
        m8771a(c1959ag, c1959ag.m7977g());
    }

    @Override
    public void mo7793a(ah c1960ah) {
        this.f6348aA.m8793a(c1960ah);
        this.f6348aA.add(new ClassN(ClassC.m8760a(c1960ah.m7978d()), this.f6350aC));
    }

    @Override
    public void mo7794a(ai c1961ai) {
        this.f6348aA.m8793a(c1961ai);
        this.f6348aA.add(f6342aq);
        this.f6348aA.add(ClassL.f5913d);
        Interfacef interfaceC1970fM7980d = c1961ai.m7980d();
        if (interfaceC1970fM7980d != null) {
            interfaceC1970fM7980d.mo7957a(this);
        }
        this.f6348aA.add(ClassE.f5893d);
    }

    @Override
    public void mo7795a(aj c1962aj) {
        this.f6348aA.m8793a(c1962aj);
        this.f6348aA.add(f6342aq);
    }

    @Override
    public void mo7796a(ak c1963ak) {
        this.f6348aA.m8793a(c1963ak.m7985d());
        if (c1963ak.m7986g().getClass() == ClassH.class && c1963ak.m7987i().getClass() == ClassH.class) {
            ClassH c1972h = (ClassH) c1963ak.m7986g();
            ClassH c1972h2 = (ClassH) c1963ak.m7987i();
            if (c1972h.m8004d() && c1972h2.m8005g()) {
                m8770a(c1963ak.m7985d());
                return;
            } else if (c1972h.m8005g() && c1972h2.m8004d()) {
                this.f6348aA.add(ClassO.f5927D);
                m8770a(c1963ak.m7985d());
                return;
            }
        }
        m8770a(c1963ak.m7985d());
        this.f6348aA.add(ClassO.f5953x);
        m8770a(c1963ak.m7986g());
        this.f6348aA.add(ClassO.f5951v);
        m8770a(c1963ak.m7987i());
    }

    @Override
    public void mo7797a(al c1964al) {
        if (c1964al.m7989g()) {
            this.f6348aA.m8793a(c1964al);
            this.f6348aA.add(f6283A);
        }
    }

    @Override
    public void mo7798a(am c1965am) {
        this.f6348aA.m8793a(c1965am);
        c1965am.m7990d().mo8142a(this);
        this.f6348aA.add(ClassO.f5936g);
        this.f6348aA.add(f6285u);
    }

    @Override
    public void mo7799a(ClassE c1969e) {
        c1969e.m7995d().mo7957a(this);
        this.f6348aA.add(ClassL.f5911b);
        c1969e.m7996g().mo7957a(this);
        this.f6348aA.add(ClassE.f5891b);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x006d, code lost:
    
        if (r0.equals("^") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
    
        if (r0.equals("|") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (r0.equals("&=") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        if (r0.equals("^=") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        if (r0.equals("|=") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        if (r0.equals("&") != false) goto L8;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo7801a(ClassG c1971g) {
        String strM8002i = c1971g.m8002i();
        switch (strM8002i.hashCode()) {
            case 38:
                break;
            case 94:
                break;
            case 124:
                break;
            case 1239:
                break;
            case 2975:
                break;
            case 3905:
                break;
            default:
                m8771a(c1971g, c1971g.m8000d());
                this.f6348aA.add(ClassO.f5948s);
                this.f6348aA.add(m8791c(c1971g.m8002i()));
                this.f6348aA.add(ClassO.f5948s);
                m8771a(c1971g, c1971g.m8003j());
                return;
        }
        m8773b(c1971g, c1971g.m8000d());
        this.f6348aA.add(ClassO.f5948s);
        this.f6348aA.add(m8791c(c1971g.m8002i()));
        this.f6348aA.add(ClassO.f5948s);
        m8773b(c1971g, c1971g.m8003j());
    }

    @Override
    public void mo7802a(ClassH c1972h) {
        if (c1972h.m8004d()) {
            this.f6348aA.add(f6284B);
        } else {
            this.f6348aA.add(f6286v);
        }
    }

    @Override
    public void mo7803a(ClassI c1973i) {
        if (c1973i.m8008g()) {
            this.f6348aA.m8792a(c1973i.mo7970e());
            this.f6348aA.add(ClassO.f5941l);
            c1973i.mo7963f().mo8142a(this);
            this.f6348aA.add(ClassO.f5942m);
        }
        m8771a(c1973i, c1973i.m8007d());
    }

    @Override
    public void mo7804a(ClassJ c1974j) {
        this.f6348aA.m8793a(c1974j);
        this.f6348aA.add(f6283A);
        this.f6348aA.add(ClassL.f5913d);
        Interfacef interfaceC1970fM8010d = c1974j.m8010d();
        if (interfaceC1970fM8010d != null) {
            interfaceC1970fM8010d.mo7957a(this);
        }
        this.f6348aA.add(ClassE.f5893d);
    }

    @Override
    public void mo7805a(ClassK c1975k) {
        ClassI c2049iM8011g = c1975k.m8011g();
        this.f6348aA.m8793a(c1975k);
        this.f6348aA.add(m8787a(c2049iM8011g, this.f6350aC));
        this.f6348aA.add(ClassO.f5933d);
        this.f6348aA.add(f6289y);
    }

    @Override
    public void mo7806a(ClassL c1976l) {
        this.f6348aA.m8793a(c1976l);
        this.f6348aA.add(new ClassJ(String.valueOf(String.valueOf(c1976l.m8013d())) + 'D'));
    }

    @Override
    public void mo7807a(ClassM c1977m) {
        this.f6348aA.m8793a(c1977m);
        ClassI c2049iM8014d = c1977m.m8014d();
        this.f6348aA.add(new ClassK(2, c2049iM8014d.m8150g(), c1977m.m8015g(), c2049iM8014d.mo8146e(), this.f6350aC));
    }

    protected void m8770a(Abstractn abstractC1978n) {
        if (abstractC1978n.mo7954b() <= 3) {
            abstractC1978n.mo7957a(this);
            return;
        }
        this.f6348aA.add(ClassO.f5941l);
        abstractC1978n.mo7957a(this);
        this.f6348aA.add(ClassO.f5942m);
    }

    protected void m8771a(Abstractn abstractC1978n, Abstractn abstractC1978n2) {
        if (abstractC1978n.mo7954b() >= abstractC1978n2.mo7954b() && (abstractC1978n.mo7954b() != 14 || abstractC1978n2.mo7954b() != 13)) {
            abstractC1978n2.mo7957a(this);
            return;
        }
        this.f6348aA.add(ClassO.f5941l);
        abstractC1978n2.mo7957a(this);
        this.f6348aA.add(ClassO.f5942m);
    }

    @Override
    public void mo7808a(ClassP c1980p) {
        int size;
        if (c1980p == null || (size = c1980p.size()) <= 0) {
            return;
        }
        Iterator it = c1980p.iterator();
        for (int i = size - 1; i > 0; i--) {
            this.f6293E = true;
            ((Abstractn) it.next()).mo7957a(this);
            if (!this.f6348aA.isEmpty()) {
                this.f6348aA.add(ClassO.f5934e);
            }
        }
        this.f6293E = false;
        ((Abstractn) it.next()).mo7957a(this);
    }

    @Override
    public void mo7809a(ClassQ c1981q) {
        if (c1981q.m8019d() == null) {
            this.f6348aA.m8793a(c1981q);
            this.f6348aA.add(new ClassO(c1981q.m8021i()));
            return;
        }
        this.f6348aA.m8793a(c1981q.m8019d());
        int size = this.f6348aA.size();
        m8771a(c1981q, c1981q.m8019d());
        int size2 = size - this.f6348aA.size();
        this.f6348aA.m8793a(c1981q);
        if (size2 != 0) {
            this.f6348aA.add(ClassO.f5936g);
        }
        this.f6348aA.add(new ClassK(2, c1981q.m8020g(), c1981q.m8021i(), c1981q.m8022j(), this.f6350aC));
    }

    @Override
    public void mo7810a(ClassR c1982r) {
        this.f6348aA.m8793a(c1982r);
        this.f6348aA.add(new ClassJ(String.valueOf(String.valueOf(c1982r.m8023d())) + 'F'));
    }

    @Override
    public void mo7811a(ClassS c1983s) {
        c1983s.m8025d().mo7957a(this);
        this.f6348aA.add(ClassO.f5948s);
        this.f6348aA.add(f6287w);
        this.f6348aA.add(ClassO.f5948s);
        c1983s.m8026g().mo8142a(this);
    }

    @Override
    public void mo7812a(ClassT c1984t) {
        this.f6348aA.m8793a(c1984t);
        switch (aa.m8407b(((ClassK) c1984t.mo7963f()).m8157g())) {
            case 1:
                this.f6348aA.add(new ClassB(c1984t.m8028d() != 0));
                break;
            case 2:
                this.f6348aA.add(new ClassC(ClassA.m8720a((char) c1984t.m8028d()), this.f6350aC));
                break;
            default:
                this.f6348aA.add(new ClassJ(String.valueOf(c1984t.m8028d())));
                break;
        }
    }

    @Override
    public void mo7813a(ClassU c1985u) {
        List listM8030i = c1985u.m8030i();
        if (listM8030i != null) {
            int size = listM8030i.size();
            switch (size) {
                case 0:
                    this.f6348aA.add(ClassO.f5943n);
                    break;
                case 1:
                    this.f6348aA.add(m8791c((String) listM8030i.get(0)));
                    break;
                default:
                    this.f6348aA.add(ClassO.f5941l);
                    this.f6348aA.add(m8791c((String) listM8030i.get(0)));
                    for (int i = 1; i < size; i++) {
                        this.f6348aA.add(ClassO.f5934e);
                        this.f6348aA.add(m8791c((String) listM8030i.get(i)));
                    }
                    this.f6348aA.add(ClassO.f5942m);
                    break;
            }
        } else {
            this.f6348aA.add(ClassO.f5943n);
        }
        m8774b(c1985u.m7955d());
    }

    @Override
    public void mo7814a(ClassV c1986v) {
        c1986v.m8032d().mo7957a(this);
        this.f6348aA.add(ClassO.f5936g);
        this.f6348aA.add(f6288x);
    }

    @Override
    public void mo7815a(ClassW c1987w) {
        this.f6348aA.m8793a(c1987w);
        this.f6348aA.add(m8791c(c1987w.mo8033d()));
    }

    @Override
    public void mo7816a(ClassX c1988x) {
        this.f6348aA.m8793a(c1988x);
        this.f6348aA.add(new ClassJ(String.valueOf(String.valueOf(c1988x.m8034d())) + 'L'));
    }

    @Override
    public void mo7817a(ClassY c1989y) {
        Abstractn abstractC1978nG = c1989y.m8038g();
        Interfacef interfaceC1970fM8036d = c1989y.m8036d();
        if (abstractC1978nG.getClass() != al.class && (abstractC1978nG.getClass() != ae.class || !((ae) abstractC1978nG).m7969d().m8150g().equals(this.f6350aC))) {
            m8771a(c1989y, abstractC1978nG);
            this.f6348aA.m8793a(c1989y);
            this.f6348aA.add(ClassO.f5936g);
        }
        this.f6348aA.m8793a(c1989y);
        this.f6348aA.add(new ClassK(3, c1989y.m8039i(), c1989y.m8040j(), c1989y.m8041l(), this.f6350aC));
        this.f6348aA.add(ClassL.f5913d);
        if (interfaceC1970fM8036d != null) {
            interfaceC1970fM8036d.mo7957a(this);
        }
        this.f6348aA.add(ClassE.f5893d);
    }

    @Override
    public void mo7818a(ClassZ c1990z) {
        c1990z.m8038g().mo7957a(this);
        this.f6348aA.m8793a(c1990z);
        this.f6348aA.add(ClassO.f5933d);
        this.f6348aA.add(new ClassK(3, c1990z.m8039i(), c1990z.m8040j(), c1990z.m8041l(), this.f6350aC));
    }

    protected void m8772b() {
        this.f6291C.add(new ClassD(this.f6350aC, this.f6295G, this.f6294F));
    }

    protected void m8773b(Abstractn abstractC1978n, Abstractn abstractC1978n2) {
        if (abstractC1978n.mo7954b() >= abstractC1978n2.mo7954b() && (abstractC1978n.mo7954b() != 14 || abstractC1978n2.mo7954b() != 13)) {
            abstractC1978n2.mo7957a(this.f6296H);
            return;
        }
        this.f6348aA.add(ClassO.f5941l);
        abstractC1978n2.mo7957a(this.f6296H);
        this.f6348aA.add(ClassO.f5942m);
    }

    protected void m8774b(Interfaceb interfaceC2016b) {
        if (interfaceC2016b != null) {
            this.f6348aA.add(ClassO.f5950u);
            if (interfaceC2016b.getClass() == ClassN.class) {
                interfaceC2016b.mo8055a(this);
                return;
            }
            this.f6292D.m8776a(this.f6348aA);
            ClassR c1905rM8757x = ClassB.m8757x(this.f6292D);
            this.f6348aA = new ClassK(this);
            interfaceC2016b.mo8055a(this);
            ClassB.m8733c(this.f6292D, c1905rM8757x);
            this.f6348aA = new ClassK(this);
        }
    }

    protected void m8775c() {
        ClassD c2216d = (ClassD) this.f6291C.removeLast();
        this.f6350aC = c2216d.f6297a;
        this.f6295G = c2216d.f6298b;
        this.f6294F = c2216d.f6299c;
    }
}
