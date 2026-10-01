package org.c.a.a.c.a.a.c;

import com.almlkaide.kaypro.android.dx.cf.attrib.AttExceptions;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSignature;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.FilenameUtils;
import org.c.a.a.b.a.ClassA;
import org.c.a.a.b.a.ClassC;
import org.c.a.a.b.a.ClassD;
import org.c.a.a.b.a.a.ClassI;
import org.c.a.a.b.a.a.ClassS;
import org.c.a.a.b.d.e.ClassC;
import org.c.a.a.b.d.e.ClassG;
import org.c.a.a.b.d.e.ClassH;
import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.b.d.e.ClassK;
import org.c.a.a.b.d.e.ClassP;
import org.c.a.a.b.d.e.ClassQ;
import org.c.a.a.b.d.e.ClassR;
import org.c.a.a.b.d.e.ClassS;
import org.c.a.a.b.d.e.ClassV;
import org.c.a.a.b.d.e.ClassW;
import org.c.a.a.b.d.e.ClassX;
import org.c.a.a.b.d.e.ClassY;
import org.c.a.a.b.d.e.Interfacee;
import org.c.a.a.b.d.e.Interfacef;
import org.c.a.a.b.d.e.Interfacel;
import org.c.a.a.b.d.e.Interfacen;
import org.c.a.a.d.ClassC;

public class ac {

    protected static final ClassW f6075a;

    static final boolean f6076e;

    protected HashMap f6077b = new HashMap(1024);

    protected HashMap f6078c = new HashMap(1024);

    protected ClassW f6079d;

    static {
        f6076e = !ac.class.desiredAssertionStatus();
        f6075a = new ClassW();
    }

    public ac(ClassW c2168w) {
        this.f6079d = c2168w;
        this.f6078c.put("B", ClassK.f5852b);
        this.f6078c.put("C", ClassK.f5853c);
        this.f6078c.put("D", ClassK.f5854d);
        this.f6078c.put("F", ClassK.f5855e);
        this.f6078c.put("I", ClassK.f5856f);
        this.f6078c.put("J", ClassK.f5857g);
        this.f6078c.put("S", ClassK.f5858h);
        this.f6078c.put("Z", ClassK.f5851a);
        this.f6078c.put("java/lang/Class", ClassI.f5833f);
        this.f6078c.put("java/lang/Object", ClassI.f5839l);
        this.f6078c.put("java/lang/String", ClassI.f5841n);
    }

    public static int m8409d(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length && str.charAt(i2) == '['; i2++) {
            i++;
        }
        return i;
    }

    protected static String m8410e(String str) {
        int i = 0;
        if (!Character.isDigit(str.charAt(0))) {
            return str;
        }
        int length = str.length();
        while (i < length && Character.isDigit(str.charAt(i))) {
            i++;
        }
        if (i == length) {
            return null;
        }
        return str.substring(i);
    }

    protected Interfacef m8411a(ae c2135ae) {
        Interfacef interfaceC2046f;
        if (!c2135ae.m8428a('<')) {
            return null;
        }
        c2135ae.f6087d++;
        ClassQ c2057qM8419b = m8419b(c2135ae);
        if (c2057qM8419b == null) {
            throw new ab(c2135ae.f6084a);
        }
        ClassQ c2057qM8419b2 = m8419b(c2135ae);
        if (c2057qM8419b2 == null) {
            interfaceC2046f = c2057qM8419b;
        } else {
            ClassS c2059s = new ClassS();
            c2059s.add(c2057qM8419b);
            do {
                c2059s.add(c2057qM8419b2);
                c2057qM8419b2 = m8419b(c2135ae);
            } while (c2057qM8419b2 != null);
            interfaceC2046f = c2059s;
        }
        if (c2135ae.m8426a() != '>') {
            throw new ab(c2135ae.f6084a);
        }
        return interfaceC2046f;
    }

    public Interfacel m8412a(String str) {
        Interfacel interfaceC2052l = (Interfacel) this.f6078c.get(str);
        if (interfaceC2052l != null) {
            return interfaceC2052l;
        }
        Interfacel interfaceC2052lM8423d = m8423d(new ae(str));
        this.f6078c.put(str, interfaceC2052lM8423d);
        return interfaceC2052lM8423d;
    }

    public Interfacel m8413a(ClassC c1876c) {
        ClassS c1854s = (ClassS) c1876c.m7680a(AttSignature.ATTRIBUTE_NAME);
        return m8412a(c1854s == null ? c1876c.m7682c() : c1854s.m7652a());
    }

    protected Interfacel m8414a(ae c2135ae, int i) {
        String str;
        if (!c2135ae.m8428a('L')) {
            return null;
        }
        int i2 = c2135ae.f6087d + 1;
        c2135ae.f6087d = i2;
        char cM8429b = c2135ae.m8429b();
        if (cM8429b == 0) {
            throw new ab(c2135ae.f6084a);
        }
        String strM8427a = c2135ae.m8427a(i2);
        ClassI c2049iM8636a = this.f6079d.m8636a(strM8427a);
        if (cM8429b == '<') {
            c2135ae.f6087d++;
            c2049iM8636a = c2049iM8636a.mo8148a(m8424e(c2135ae));
            if (c2135ae.m8426a() != '>') {
                throw new ab(c2135ae.f6084a);
            }
        }
        while (c2135ae.m8428a(FilenameUtils.EXTENSION_SEPARATOR)) {
            int i3 = c2135ae.f6087d + 1;
            c2135ae.f6087d = i3;
            char cM8429b2 = c2135ae.m8429b();
            if (cM8429b2 == 0) {
                throw new ab(c2135ae.f6084a);
            }
            String strM8427a2 = c2135ae.m8427a(i3);
            strM8427a = String.valueOf(strM8427a) + '$' + strM8427a2;
            if (Character.isDigit(strM8427a2.charAt(0))) {
                strM8427a2 = m8410e(strM8427a2);
                str = null;
            } else {
                str = String.valueOf(c2049iM8636a.m8151i()) + FilenameUtils.EXTENSION_SEPARATOR + strM8427a2;
            }
            if (cM8429b2 == '<') {
                c2135ae.f6087d++;
                Interfacee interfaceC2045eM8424e = m8424e(c2135ae);
                if (c2135ae.m8426a() != '>') {
                    throw new ab(c2135ae.f6084a);
                }
                c2049iM8636a = new ClassH(strM8427a, str, strM8427a2, interfaceC2045eM8424e, c2049iM8636a);
            } else {
                c2049iM8636a = new ClassH(strM8427a, str, strM8427a2, c2049iM8636a);
            }
        }
        c2135ae.f6087d++;
        return i == 0 ? c2049iM8636a : c2049iM8636a.mo8143a(i);
    }

    protected ad m8415a(String str, ClassD c1877d) {
        String string;
        ClassI c1844i;
        ClassI c1844i2;
        if ((str.indexOf(94) != -1) || c1877d == null || (c1844i2 = (ClassI) c1877d.m7684a(AttExceptions.ATTRIBUTE_NAME)) == null) {
            string = str;
        } else {
            StringBuilder sb = new StringBuilder(str);
            String[] strArrM7638a = c1844i2.m7638a();
            for (String str2 : strArrM7638a) {
                sb.append("^L").append(str2).append(';');
            }
            string = sb.toString();
        }
        ad c2134ad = (ad) this.f6077b.get(string);
        if (c2134ad != null) {
            return c2134ad;
        }
        ae c2135ae = new ae(str);
        ad c2134ad2 = new ad();
        c2134ad2.f6080a = m8411a(c2135ae);
        if (c2135ae.m8426a() != '(') {
            throw new ab(str);
        }
        Interfacel interfaceC2052lM8423d = m8423d(c2135ae);
        if (interfaceC2052lM8423d == null) {
            c2134ad2.f6081b = Collections.emptyList();
        } else {
            Interfacel interfaceC2052lM8423d2 = m8423d(c2135ae);
            if (interfaceC2052lM8423d2 == null) {
                c2134ad2.f6081b = Collections.singletonList(interfaceC2052lM8423d);
            } else {
                ClassC c2247c = new ClassC();
                c2247c.add(interfaceC2052lM8423d);
                do {
                    c2247c.add(interfaceC2052lM8423d2);
                    interfaceC2052lM8423d2 = m8423d(c2135ae);
                } while (interfaceC2052lM8423d2 != null);
                c2134ad2.f6081b = c2247c;
            }
        }
        if (c2135ae.m8426a() != ')') {
            throw new ab(str);
        }
        c2134ad2.f6082c = m8423d(c2135ae);
        Interfacel interfaceC2052lM8422c = m8422c(c2135ae);
        if (interfaceC2052lM8422c != null) {
            Interfacel interfaceC2052lM8422c2 = m8422c(c2135ae);
            if (interfaceC2052lM8422c2 == null) {
                c2134ad2.f6083d = interfaceC2052lM8422c;
            } else {
                ClassV c2062v = new ClassV();
                c2062v.add(interfaceC2052lM8422c);
                do {
                    c2062v.add(interfaceC2052lM8422c2);
                    interfaceC2052lM8422c2 = m8422c(c2135ae);
                } while (interfaceC2052lM8422c2 != null);
                c2134ad2.f6083d = c2062v;
            }
        } else if (c1877d != null && (c1844i = (ClassI) c1877d.m7684a(AttExceptions.ATTRIBUTE_NAME)) != null) {
            String[] strArrM7638a2 = c1844i.m7638a();
            if (strArrM7638a2.length == 1) {
                c2134ad2.f6083d = this.f6079d.m8636a(strArrM7638a2[0]);
            } else {
                ClassV c2062v2 = new ClassV(strArrM7638a2.length);
                for (String str3 : strArrM7638a2) {
                    c2062v2.add(this.f6079d.m8636a(str3));
                }
                c2134ad2.f6083d = c2062v2;
            }
        }
        this.f6077b.put(string, c2134ad2);
        return c2134ad2;
    }

    public ad m8416a(ClassD c1877d) {
        ClassS c1854s = (ClassS) c1877d.m7684a(AttSignature.ATTRIBUTE_NAME);
        if (c1854s == null) {
            return m8415a(c1877d.m7686c(), c1877d);
        }
        ad c2134adM8415a = m8415a(c1854s.m7652a(), c1877d);
        ad c2134adM8415a2 = m8415a(c1877d.m7686c(), c1877d);
        if (c2134adM8415a.f6081b.size() == c2134adM8415a2.f6081b.size()) {
            return c2134adM8415a;
        }
        if (c2134adM8415a.f6081b.isEmpty() && c2134adM8415a.f6080a == null) {
            return c2134adM8415a2;
        }
        ClassC c2247c = new ClassC(c2134adM8415a2.f6081b);
        c2247c.subList(1, c2134adM8415a.f6081b.size() + 1).clear();
        c2247c.addAll(1, c2134adM8415a.f6081b);
        ad c2134ad = new ad();
        c2134ad.f6080a = c2134adM8415a.f6080a;
        c2134ad.f6081b = c2247c;
        c2134ad.f6082c = c2134adM8415a.f6082c;
        c2134ad.f6083d = c2134adM8415a.f6083d;
        return c2134ad;
    }

    public af m8417a(ClassA c1821a) {
        af c2136af = new af();
        c2136af.f6088a = this.f6079d.m8636a(c1821a.m7586d());
        ClassS c1854s = (ClassS) c1821a.m7580a(AttSignature.ATTRIBUTE_NAME);
        if (c1854s == null) {
            String strM7587e = c1821a.m7587e();
            String[] strArrM7588f = c1821a.m7588f();
            if (!"java/lang/Object".equals(strM7587e)) {
                c2136af.f6090c = this.f6079d.m8636a(strM7587e);
            }
            if (strArrM7588f != null) {
                int length = strArrM7588f.length;
                if (length == 1) {
                    c2136af.f6091d = this.f6079d.m8636a(strArrM7588f[0]);
                } else {
                    ClassV c2062v = new ClassV(length);
                    for (String str : strArrM7588f) {
                        c2062v.add(this.f6079d.m8636a(str));
                    }
                    c2136af.f6091d = c2062v;
                }
            }
        } else {
            ae c2135ae = new ae(c1854s.m7652a());
            c2136af.f6089b = m8411a(c2135ae);
            c2136af.f6090c = m8414a(c2135ae, 0);
            Interfacel interfaceC2052lM8414a = m8414a(c2135ae, 0);
            if (interfaceC2052lM8414a != null) {
                Interfacel interfaceC2052lM8414a2 = m8414a(c2135ae, 0);
                if (interfaceC2052lM8414a2 == null) {
                    c2136af.f6091d = interfaceC2052lM8414a;
                } else {
                    ClassV c2062v2 = new ClassV(c1821a.m7588f().length);
                    c2062v2.add(interfaceC2052lM8414a);
                    do {
                        c2062v2.add(interfaceC2052lM8414a2);
                        interfaceC2052lM8414a2 = m8414a(c2135ae, 0);
                    } while (interfaceC2052lM8414a2 != null);
                    c2136af.f6091d = c2062v2;
                }
            }
        }
        return c2136af;
    }

    public List m8418b(String str) {
        ad c2134adM8415a = m8415a(str, (ClassD) null);
        return c2134adM8415a == null ? Collections.emptyList() : c2134adM8415a.f6081b;
    }

    protected ClassQ m8419b(ae c2135ae) {
        ClassP c2056p = null;
        int i = c2135ae.f6087d;
        if (!c2135ae.m8430b(':')) {
            return null;
        }
        String strM8427a = c2135ae.m8427a(i);
        Interfacel interfaceC2052l = null;
        while (c2135ae.m8428a(':')) {
            c2135ae.f6087d++;
            Interfacel interfaceC2052lM8423d = m8423d(c2135ae);
            if (interfaceC2052lM8423d != null && !interfaceC2052lM8423d.mo8146e().equals("Ljava/lang/Object;")) {
                if (interfaceC2052l == null) {
                    interfaceC2052l = interfaceC2052lM8423d;
                } else if (c2056p == null) {
                    c2056p = new ClassP();
                    c2056p.add(interfaceC2052l);
                    c2056p.add(interfaceC2052lM8423d);
                } else {
                    c2056p.add(interfaceC2052lM8423d);
                }
            }
        }
        if (interfaceC2052l == null) {
            return new ClassQ(strM8427a);
        }
        return c2056p == null ? new ClassR(strM8427a, interfaceC2052l) : new ClassR(strM8427a, c2056p);
    }

    public ad m8420b(ClassD c1877d) {
        ClassS c1854s = (ClassS) c1877d.m7684a(AttSignature.ATTRIBUTE_NAME);
        return m8415a(c1854s == null ? c1877d.m7686c() : c1854s.m7652a(), c1877d);
    }

    public Interfacel m8421c(String str) {
        ad c2134adM8415a = m8415a(str, (ClassD) null);
        if (c2134adM8415a == null) {
            return null;
        }
        return c2134adM8415a.f6082c;
    }

    protected Interfacel m8422c(ae c2135ae) {
        if (!c2135ae.m8428a('^')) {
            return null;
        }
        c2135ae.f6087d++;
        return m8423d(c2135ae);
    }

    protected Interfacel m8423d(ae c2135ae) {
        if (!c2135ae.m8431c()) {
            return null;
        }
        int i = 0;
        char cM8426a = c2135ae.m8426a();
        while (cM8426a == '[') {
            i++;
            cM8426a = c2135ae.m8426a();
        }
        switch (cM8426a) {
            case 'B':
                return i == 0 ? ClassK.f5852b : ClassK.f5852b.mo8143a(i);
            case 'C':
                return i == 0 ? ClassK.f5853c : ClassK.f5853c.mo8143a(i);
            case 'D':
                return i == 0 ? ClassK.f5854d : ClassK.f5854d.mo8143a(i);
            case 'E':
            case 'G':
            case 'H':
            case 'K':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'U':
            case 'W':
            case 'X':
            case 'Y':
            default:
                c2135ae.f6087d--;
                return null;
            case 'F':
                return i == 0 ? ClassK.f5855e : ClassK.f5855e.mo8143a(i);
            case 'I':
                return i == 0 ? ClassK.f5856f : ClassK.f5856f.mo8143a(i);
            case 'J':
                return i == 0 ? ClassK.f5857g : ClassK.f5857g.mo8143a(i);
            case 'L':
                c2135ae.f6087d--;
                return m8414a(c2135ae, i);
            case 'S':
                return i == 0 ? ClassK.f5858h : ClassK.f5858h.mo8143a(i);
            case 'T':
                int i2 = c2135ae.f6087d;
                if (!c2135ae.m8430b(';')) {
                    return null;
                }
                String strM8427a = c2135ae.m8427a(i2);
                c2135ae.f6087d++;
                return new ClassG(strM8427a, i);
            case 'V':
                if (f6076e || i == 0) {
                    return ClassK.f5859i;
                }
                throw new AssertionError();
            case 'Z':
                return i == 0 ? ClassK.f5851a : ClassK.f5851a.mo8143a(i);
        }
    }

    protected Interfacee m8424e(ae c2135ae) {
        Interfacen interfaceC2054nM8425f = m8425f(c2135ae);
        if (interfaceC2054nM8425f == null) {
            throw new ab(c2135ae.f6084a);
        }
        Interfacen interfaceC2054nM8425f2 = m8425f(c2135ae);
        if (interfaceC2054nM8425f2 == null) {
            return interfaceC2054nM8425f;
        }
        ClassC c2043c = new ClassC();
        c2043c.add(interfaceC2054nM8425f);
        do {
            c2043c.add(interfaceC2054nM8425f2);
            interfaceC2054nM8425f2 = m8425f(c2135ae);
        } while (interfaceC2054nM8425f2 != null);
        return c2043c;
    }

    protected Interfacen m8425f(ae c2135ae) {
        switch (c2135ae.m8426a()) {
            case '*':
                return f6075a;
            case '+':
                return new ClassX(m8423d(c2135ae));
            case ',':
            default:
                c2135ae.f6087d--;
                return m8423d(c2135ae);
            case '-':
                return new ClassY(m8423d(c2135ae));
        }
    }
}
