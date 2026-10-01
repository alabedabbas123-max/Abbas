package org.c.a.a.c.a.a.d;

import com.almlkaide.kaypro.android.dx.cf.code.ByteOps;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.a.ClassC;
import org.c.a.a.b.d.a.ClassI;
import org.c.a.a.b.d.a.ClassP;
import org.c.a.a.b.d.a.ClassQ;
import org.c.a.a.b.d.a.ClassW;
import org.c.a.a.b.d.a.Interfacel;
import org.c.a.a.b.d.b.Abstractn;
import org.c.a.a.b.d.b.aa;
import org.c.a.a.b.d.b.ab;
import org.c.a.a.b.d.b.ad;
import org.c.a.a.b.d.b.ae;
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
import org.c.a.a.b.d.b.ClassQ;
import org.c.a.a.b.d.b.ClassR;
import org.c.a.a.b.d.b.ClassT;
import org.c.a.a.b.d.b.ClassU;
import org.c.a.a.b.d.b.ClassW;
import org.c.a.a.b.d.b.ClassX;
import org.c.a.a.b.d.b.ClassY;
import org.c.a.a.b.d.b.Interfacef;
import org.c.a.a.b.d.d.ClassA;
import org.c.a.a.b.d.d.ai;
import org.c.a.a.b.d.d.ClassC;
import org.c.a.a.b.d.d.ClassD;
import org.c.a.a.b.d.d.ClassF;
import org.c.a.a.b.d.d.ClassG;
import org.c.a.a.b.d.d.ClassJ;
import org.c.a.a.b.d.d.ClassK;
import org.c.a.a.b.d.d.ClassL;
import org.c.a.a.b.d.d.ClassP;
import org.c.a.a.b.d.e.ClassC;
import org.c.a.a.b.d.e.ClassH;
import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.b.d.e.ClassK;
import org.c.a.a.b.d.e.ClassP;
import org.c.a.a.b.d.e.ClassR;
import org.c.a.a.b.d.e.ClassV;
import org.c.a.a.b.d.e.ClassX;
import org.c.a.a.b.d.e.ClassY;
import org.c.a.a.b.d.e.Interfacel;
import org.c.a.a.c.a.a.c.aa;
import org.c.a.a.c.a.a.c.ac;
import org.c.a.a.d.ClassC;

public class ad extends Abstracta {

    protected static final HashMap f6174a;

    protected static final ae f6175b;

    protected static final ae f6176c;

    protected static final ae f6177d;

    protected static final ae f6178e;

    protected static final ae f6179f;

    static final boolean f6180j;

    protected ac f6181g;

    protected Interfacel f6182h;

    protected Interfacel f6183i;

    static {
        f6180j = !ad.class.desiredAssertionStatus();
        f6174a = new HashMap();
        f6175b = new ae();
        f6176c = new ae(ClassI.f5832e);
        f6177d = new ae(ClassI.f5831d);
        f6178e = new ae(ClassI.f5840m);
        f6179f = new ae(ClassI.f5836i);
        List listAsList = Arrays.asList(ClassK.f5853c);
        List listAsList2 = Arrays.asList(ClassK.f5853c, ClassK.f5856f);
        f6174a.put("java/lang/String:indexOf(I)I", listAsList);
        f6174a.put("java/lang/String:indexOf(II)I", listAsList2);
        f6174a.put("java/lang/String:lastIndexOf(I)I", listAsList);
        f6174a.put("java/lang/String:lastIndexOf(II)I", listAsList2);
    }

    public ad(ac c2133ac, Interfacel interfaceC2052l) {
        this.f6181g = c2133ac;
        this.f6182h = interfaceC2052l;
    }

    protected Interfacef m8644a(List list, Interfacef interfaceC1970f) {
        if (!interfaceC1970f.mo7867j_()) {
            Interfacel interfaceC2052l = (Interfacel) list.get(0);
            if (interfaceC2052l.mo8145d() == 0 && interfaceC2052l.mo8160m_()) {
                Abstractn abstractC1978nM8646a = m8646a(interfaceC2052l, (Abstractn) interfaceC1970f);
                if (abstractC1978nM8646a.getClass() == ClassT.class) {
                    switch (aa.m8407b(((ClassK) interfaceC2052l).m8157g())) {
                        case 16:
                        case 32:
                            interfaceC1970f = new ClassI(interfaceC2052l, abstractC1978nM8646a);
                            break;
                    }
                }
            }
        } else {
            ClassC c2247cL_ = interfaceC1970f.mo7868l_();
            for (int size = c2247cL_.size() - 1; size >= 0; size--) {
                Interfacel interfaceC2052l2 = (Interfacel) list.get(size);
                if (interfaceC2052l2.mo8145d() == 0 && interfaceC2052l2.mo8160m_()) {
                    Abstractn abstractC1978nM8646a2 = m8646a(interfaceC2052l2, (Abstractn) c2247cL_.get(size));
                    if (abstractC1978nM8646a2.getClass() == ClassT.class) {
                        switch (aa.m8407b(((ClassK) interfaceC2052l2).m8157g())) {
                            case 16:
                            case 32:
                                c2247cL_.set(size, new ClassI(interfaceC2052l2, abstractC1978nM8646a2));
                                break;
                        }
                    }
                }
            }
        }
        interfaceC1970f.mo7957a(this);
        return interfaceC1970f;
    }

    protected Abstractn m8645a(Abstractn abstractC1978n) {
        if (abstractC1978n == null) {
            return null;
        }
        return m8647b(abstractC1978n);
    }

    protected Abstractn m8646a(Interfacel interfaceC2052l, Abstractn abstractC1978n) {
        if (!f6180j && interfaceC2052l == ClassK.f5859i) {
            throw new AssertionError();
        }
        if (interfaceC2052l != abstractC1978n.mo7963f()) {
            Class<?> cls = abstractC1978n.getClass();
            if (cls == ClassT.class) {
                Interfacel interfaceC2052l2 = interfaceC2052l == ClassI.f5841n ? ClassK.f5853c : interfaceC2052l;
                if (interfaceC2052l2.mo8160m_()) {
                    ClassK c2051k = (ClassK) interfaceC2052l2;
                    ClassT c1984t = (ClassT) abstractC1978n;
                    ClassK c2051k2 = (ClassK) c1984t.mo7963f();
                    int iM8028d = c1984t.m8028d();
                    int iE = c1984t.mo7970e();
                    switch (aa.m8407b(c2051k.m8157g())) {
                        case 1:
                            return new ClassH(iE, iM8028d != 0);
                        case 2:
                            switch (iM8028d) {
                                case 0:
                                    return new ClassQ(iE, ClassK.f5853c, f6176c, "java/lang/Character", "MIN_VALUE", "C");
                                case 65535:
                                    return new ClassQ(iE, ClassK.f5853c, f6176c, "java/lang/Character", "MAX_VALUE", "C");
                                default:
                                    if ((c2051k.m8157g() & c2051k2.m8157g()) == 0) {
                                        c1984t.mo7991a(ClassK.f5856f);
                                    } else {
                                        c1984t.mo7991a(interfaceC2052l2);
                                    }
                                    break;
                            }
                            break;
                        case 16:
                            switch (iM8028d) {
                                case -128:
                                    return new ClassQ(iE, ClassK.f5852b, f6177d, "java/lang/Byte", "MIN_VALUE", "B");
                                case 127:
                                    return new ClassQ(iE, ClassK.f5852b, f6177d, "java/lang/Byte", "MAX_VALUE", "B");
                                default:
                                    if ((c2051k.m8157g() & c2051k2.m8157g()) == 0) {
                                        c1984t.mo7991a(ClassK.f5856f);
                                    } else {
                                        c1984t.mo7991a(interfaceC2052l2);
                                    }
                                    break;
                            }
                            break;
                        case 32:
                            switch (iM8028d) {
                                case -32768:
                                    return new ClassQ(iE, ClassK.f5858h, f6178e, "java/lang/Short", "MIN_VALUE", "S");
                                case 32767:
                                    return new ClassQ(iE, ClassK.f5858h, f6178e, "java/lang/Short", "MAX_VALUE", "S");
                                default:
                                    if ((c2051k.m8157g() & c2051k2.m8157g()) == 0) {
                                        c1984t.mo7991a(ClassK.f5856f);
                                    } else {
                                        c1984t.mo7991a(interfaceC2052l2);
                                    }
                                    break;
                            }
                            break;
                        case 64:
                            switch (iM8028d) {
                                case Integer.MIN_VALUE:
                                    return new ClassQ(iE, ClassK.f5856f, f6179f, "java/lang/Integer", "MIN_VALUE", "I");
                                case Integer.MAX_VALUE:
                                    return new ClassQ(iE, ClassK.f5856f, f6179f, "java/lang/Integer", "MAX_VALUE", "I");
                                default:
                                    if ((c2051k.m8157g() & c2051k2.m8157g()) == 0) {
                                        c1984t.mo7991a(ClassK.f5856f);
                                    } else {
                                        c1984t.mo7991a(interfaceC2052l2);
                                    }
                                    break;
                            }
                            break;
                    }
                    return abstractC1978n;
                }
            } else if (cls == ak.class && interfaceC2052l.mo8160m_()) {
                ak c1963ak = (ak) abstractC1978n;
                c1963ak.mo7991a(interfaceC2052l);
                c1963ak.m7982a(m8647b(c1963ak.m7985d()));
                c1963ak.m7983b(m8646a(interfaceC2052l, c1963ak.m7986g()));
                c1963ak.m7984c(m8646a(interfaceC2052l, c1963ak.m7987i()));
                return abstractC1978n;
            }
        }
        abstractC1978n.mo7957a(this);
        return abstractC1978n;
    }

    @Override
    public void mo7769a(ClassC c1927c) {
        Interfacel interfaceC2052l = this.f6183i;
        this.f6183i = c1927c.m7898a();
        m7762a((List) c1927c);
        this.f6183i = interfaceC2052l;
    }

    @Override
    public void mo7770a(ClassI c1933i) {
    }

    @Override
    public void mo7776a(ClassP c1940p) {
        if (c1940p != null) {
            c1940p.m7921a(m8646a(this.f6183i, c1940p.m7920a()));
        }
    }

    @Override
    public void mo7777a(ClassQ c1941q) {
        Interfacel interfaceC2052l = this.f6183i;
        this.f6183i = c1941q.m7924c();
        c1941q.m7925d().mo7869a(this);
        this.f6183i = interfaceC2052l;
    }

    @Override
    public void mo7783a(ClassW c1947w) {
        Interfacel interfaceC2052l = this.f6183i;
        this.f6183i = c1947w.m7945d();
        c1947w.m7946e().mo7869a(this);
        this.f6183i = interfaceC2052l;
    }

    @Override
    public void mo7786a(aa c1953aa) {
        Interfacef interfaceC1970fM7958d = c1953aa.m7958d();
        if (interfaceC1970fM7958d != null) {
            m8644a(f6175b, interfaceC1970fM7958d);
        }
    }

    @Override
    public void mo7787a(ab c1954ab) {
        Interfacef interfaceC1970fM7966j = c1954ab.m7966j();
        if (interfaceC1970fM7966j != null) {
            String strM8150g = c1954ab.m7964g().m8150g();
            String strM7965i = c1954ab.m7965i();
            List listM8418b = (List) f6174a.get(String.valueOf(strM8150g) + ":<init>" + strM7965i);
            if (listM8418b == null) {
                listM8418b = this.f6181g.m8418b(strM7965i);
            }
            c1954ab.m7960a(m8644a(listM8418b, interfaceC1970fM7966j));
        }
    }

    @Override
    public void mo7789a(ad c1956ad) {
    }

    @Override
    public void mo7790a(ae c1957ae) {
    }

    @Override
    public void mo7794a(ai c1961ai) {
        Interfacef interfaceC1970fM7980d = c1961ai.m7980d();
        if (interfaceC1970fM7980d != null) {
            c1961ai.m7979a(m8644a(this.f6181g.m8418b(c1961ai.m8012i()), interfaceC1970fM7980d));
        }
    }

    @Override
    public void mo7795a(aj c1962aj) {
    }

    @Override
    public void mo7796a(ak c1963ak) {
        Interfacel interfaceC2052lMo7963f = c1963ak.m7986g().mo7963f();
        Interfacel interfaceC2052lMo7963f2 = c1963ak.m7987i().mo7963f();
        c1963ak.m7982a(m8647b(c1963ak.m7985d()));
        if (interfaceC2052lMo7963f.mo8160m_()) {
            if (interfaceC2052lMo7963f2.mo8160m_()) {
                c1963ak.m7983b(m8646a(ClassK.f5856f, c1963ak.m7986g()));
                c1963ak.m7984c(m8646a(ClassK.f5856f, c1963ak.m7987i()));
                return;
            } else {
                c1963ak.m7986g().mo7957a(this);
                c1963ak.m7983b(m8646a(interfaceC2052lMo7963f2, c1963ak.m7986g()));
                return;
            }
        }
        if (interfaceC2052lMo7963f2.mo8160m_()) {
            c1963ak.m7984c(m8646a(interfaceC2052lMo7963f, c1963ak.m7987i()));
            c1963ak.m7987i().mo7957a(this);
        } else {
            c1963ak.m7986g().mo7957a(this);
            c1963ak.m7987i().mo7957a(this);
        }
    }

    @Override
    public void mo7797a(al c1964al) {
    }

    @Override
    public void mo7798a(am c1965am) {
    }

    @Override
    public void mo7799a(ClassE c1969e) {
        c1969e.m7995d().mo7957a(this);
        c1969e.m7994b(m8646a(ClassK.f5856f, c1969e.m7996g()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if (r0.equals("<") != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        r0 = r2.mo7963f();
        r1 = r3.mo7963f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r0.mo8145d() != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r1.mo8145d() != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r0.mo8160m_() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r1.mo8160m_() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (r0 != r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        r6.m7998a(m8646a(r0, r2));
        r6.m7999b(m8646a(r0, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        if (r0.equals(">") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        if (r0.equals("^") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        if (r0.equals("|") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
    
        if (r0.equals("!=") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
    
        if (r0.equals("<=") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c0, code lost:
    
        if (r0.equals("==") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
    
        if (r0.equals(">=") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
    
        r0 = org.c.a.a.c.a.a.c.aa.m8406a((org.c.a.a.b.d.e.ClassK) r0, (org.c.a.a.b.d.e.ClassK) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d6, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d8, code lost:
    
        r0 = org.c.a.a.b.d.e.ClassK.f5856f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00db, code lost:
    
        r6.m7998a(m8646a(r1, r2));
        r3.mo7957a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00eb, code lost:
    
        if (r1.mo8160m_() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
    
        r2.mo7957a(r5);
        r6.m7999b(m8646a(r0, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f9, code lost:
    
        r2.mo7957a(r5);
        r3.mo7957a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r0.equals("&") != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        r2.mo7957a(r5);
        r3.mo7957a(r5);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo7801a(ClassG c1971g) {
        Abstractn abstractC1978nM8000d = c1971g.m8000d();
        Abstractn abstractC1978nM8003j = c1971g.m8003j();
        String strM8002i = c1971g.m8002i();
        switch (strM8002i.hashCode()) {
            case 38:
                break;
            case 60:
                break;
            case 61:
                if (strM8002i.equals("=")) {
                    abstractC1978nM8000d.mo7957a(this);
                    c1971g.m7999b(m8646a(abstractC1978nM8000d.mo7963f(), abstractC1978nM8003j));
                }
                c1971g.m7999b(m8646a(c1971g.mo7963f(), abstractC1978nM8003j));
                c1971g.m7998a(m8646a(c1971g.mo7963f(), abstractC1978nM8000d));
                break;
            case ByteOps.ISTORE_3:
                break;
            case 94:
                break;
            case 124:
                break;
            case 1084:
                break;
            case 1921:
                break;
            case 1952:
                break;
            case 1983:
                break;
            default:
                c1971g.m7999b(m8646a(c1971g.mo7963f(), abstractC1978nM8003j));
                c1971g.m7998a(m8646a(c1971g.mo7963f(), abstractC1978nM8000d));
                break;
        }
    }

    @Override
    public void mo7803a(ClassI c1973i) {
        c1973i.m8006a(m8646a(c1973i.mo7963f(), c1973i.m8007d()));
    }

    @Override
    public void mo7804a(ClassJ c1974j) {
        Interfacef interfaceC1970fM8010d = c1974j.m8010d();
        if (interfaceC1970fM8010d != null) {
            c1974j.m8009a(m8644a(this.f6181g.m8418b(c1974j.m8012i()), interfaceC1970fM8010d));
        }
    }

    @Override
    public void mo7805a(ClassK c1975k) {
    }

    @Override
    public void mo7806a(ClassL c1976l) {
    }

    @Override
    public void mo7807a(ClassM c1977m) {
    }

    @Override
    public void mo7810a(ClassR c1982r) {
    }

    @Override
    public void mo7812a(ClassT c1984t) {
    }

    @Override
    public void mo7813a(ClassU c1985u) {
        Interfacel interfaceC2052l = this.f6182h;
        this.f6182h = c1985u.m8029g();
        m7839a(c1985u.m7955d());
        this.f6182h = interfaceC2052l;
    }

    @Override
    public void mo7815a(ClassW c1987w) {
    }

    @Override
    public void mo7816a(ClassX c1988x) {
    }

    @Override
    public void mo7817a(ClassY c1989y) {
        Interfacef interfaceC1970fM8036d = c1989y.m8036d();
        if (interfaceC1970fM8036d != null) {
            String strI = c1989y.m8039i();
            String strJ = c1989y.m8040j();
            String strL = c1989y.m8041l();
            List listM8418b = (List) f6174a.get(String.valueOf(strI) + ':' + strJ + strL);
            if (listM8418b == null) {
                listM8418b = this.f6181g.m8418b(strL);
            }
            c1989y.m8035a(m8644a(listM8418b, interfaceC1970fM8036d));
        }
        c1989y.m8038g().mo7957a(this);
    }

    @Override
    public void mo7829a(ClassA c2006a) {
        c2006a.m8054a(m8647b(c2006a.m8056b()));
    }

    @Override
    public void mo7838a(ai c2015ai) {
        c2015ai.m8082a(m8647b(c2015ai.m8083b()));
        m7839a(c2015ai.m8084d());
    }

    @Override
    public void mo7840a(ClassC c2017c) {
    }

    @Override
    public void mo7841a(ClassD c2018d) {
    }

    @Override
    public void mo7843a(ClassF c2020f) {
    }

    @Override
    public void mo7844a(ClassG c2021g) {
        c2021g.m8089a(m8645a(c2021g.m8090b()));
        m7839a(c2021g.m8091d());
    }

    @Override
    public void mo7847a(ClassJ c2024j) {
        m7773a((Interfacel) c2024j.m8102b());
        m7800a(c2024j.m8104d());
        c2024j.m8101a(m8645a(c2024j.m8105e()));
        m7800a(c2024j.m8106f());
        m7839a(c2024j.m8107g());
    }

    @Override
    public void mo7848a(ClassK c2025k) {
        c2025k.m8109a(m8647b(c2025k.m8110d()));
        m7839a(c2025k.m8111e());
        c2025k.m8108b().mo8055a(this);
    }

    @Override
    public void mo7849a(ClassL c2026l) {
        c2026l.m8109a(m8647b(c2026l.m8110d()));
        m7839a(c2026l.m8111e());
    }

    @Override
    public void mo7853a(ClassP c2030p) {
        c2030p.m8118a(m8646a(this.f6182h, c2030p.m8120d()));
    }

    @Override
    public void mo8128a(ClassC c2043c) {
    }

    @Override
    public void mo8130a(ClassH c2048h) {
    }

    @Override
    public void mo8131a(ClassI c2049i) {
    }

    @Override
    public void mo8133a(ClassP c2056p) {
    }

    @Override
    public void mo8135a(ClassR c2058r) {
    }

    @Override
    public void mo8137a(ClassV c2062v) {
    }

    @Override
    public void mo8139a(ClassX c2064x) {
    }

    @Override
    public void mo8140a(ClassY c2065y) {
    }

    protected Abstractn m8647b(Abstractn abstractC1978n) {
        if (ClassK.f5851a != abstractC1978n.mo7963f()) {
            Class<?> cls = abstractC1978n.getClass();
            if (cls == ClassT.class) {
                ClassT c1984t = (ClassT) abstractC1978n;
                return new ClassH(c1984t.mo7970e(), c1984t.m8028d() != 0);
            }
            if (cls == ak.class) {
                ak c1963ak = (ak) abstractC1978n;
                c1963ak.mo7991a(ClassK.f5851a);
                c1963ak.m7982a(m8647b(c1963ak.m7985d()));
                c1963ak.m7983b(m8647b(c1963ak.m7986g()));
                c1963ak.m7984c(m8647b(c1963ak.m7987i()));
                return abstractC1978n;
            }
        }
        abstractC1978n.mo7957a(this);
        return abstractC1978n;
    }
}
