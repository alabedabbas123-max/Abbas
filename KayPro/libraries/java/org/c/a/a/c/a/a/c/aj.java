package org.c.a.a.c.a.a.c;

import java.util.StringTokenizer;
import org.c.a.a.b.d.b.Abstractn;
import org.c.a.a.b.d.b.ab;
import org.c.a.a.b.d.b.ah;
import org.c.a.a.b.d.b.ClassG;
import org.c.a.a.b.d.b.ClassY;
import org.c.a.a.b.d.b.Interfacef;
import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.d.ClassC;

public class aj {
    public static Abstractn m8455a(String str, Interfacef interfaceC1970f) {
        Abstractn c1960ah;
        int i;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "\u0001", true);
        if (!stringTokenizer.hasMoreTokens()) {
            return ah.f5707a;
        }
        String strNextToken = stringTokenizer.nextToken();
        Abstractn abstractC1978nM8457a = strNextToken.equals("\u0001") ? m8457a((Abstractn) interfaceC1970f.mo7865h()) : new ah(strNextToken);
        if (interfaceC1970f.mo7867j_()) {
            ClassC c2247cL_ = interfaceC1970f.mo7868l_();
            Abstractn c1971g = abstractC1978nM8457a;
            int i2 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken2 = stringTokenizer.nextToken();
                if (strNextToken2.equals("\u0001")) {
                    i = i2 + 1;
                    c1960ah = (Abstractn) c2247cL_.get(i2);
                } else {
                    c1960ah = new ah(strNextToken2);
                    i = i2;
                }
                c1971g = new ClassG(c1971g.mo7970e(), ClassI.f5841n, c1971g, "+", c1960ah, 6);
                i2 = i;
            }
            return c1971g;
        }
        while (true) {
            Abstractn abstractC1978n = abstractC1978nM8457a;
            if (!stringTokenizer.hasMoreTokens()) {
                return abstractC1978n;
            }
            String strNextToken3 = stringTokenizer.nextToken();
            abstractC1978nM8457a = new ClassG(abstractC1978n.mo7970e(), ClassI.f5841n, abstractC1978n, "+", strNextToken3.equals("\u0001") ? (Abstractn) interfaceC1970f.mo7865h() : new ah(strNextToken3), 6);
        }
    }

    public static Abstractn m8456a(Interfacef interfaceC1970f) {
        if (!interfaceC1970f.mo7867j_()) {
            return m8457a((Abstractn) interfaceC1970f.mo7865h());
        }
        ClassC c2247cL_ = interfaceC1970f.mo7868l_();
        switch (c2247cL_.size()) {
            case 0:
                return ah.f5707a;
            case 1:
                return m8457a((Abstractn) interfaceC1970f.mo7865h());
            default:
                Abstractn abstractC1978nM8457a = m8457a((Abstractn) interfaceC1970f.mo7865h());
                int size = c2247cL_.size();
                int i = 1;
                while (i < size) {
                    ClassG c1971g = new ClassG(abstractC1978nM8457a.mo7970e(), ClassI.f5841n, abstractC1978nM8457a, "+", (Abstractn) c2247cL_.get(i), 6);
                    i++;
                    abstractC1978nM8457a = c1971g;
                }
                return abstractC1978nM8457a;
        }
    }

    private static Abstractn m8457a(Abstractn abstractC1978n) {
        return !abstractC1978n.mo7963f().equals(ClassI.f5841n) ? new ClassG(abstractC1978n.mo7970e(), ClassI.f5841n, ah.f5707a, "+", abstractC1978n, 6) : abstractC1978n;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    public static Abstractn m8458a(Abstractn abstractC1978n, int i, String str) {
        Abstractn abstractC1978n2;
        if (abstractC1978n.getClass() == ClassY.class) {
            ClassY c1989y = (ClassY) abstractC1978n;
            if (!"append".equals(c1989y.m8040j()) || c1989y.m8036d() == null || c1989y.m8036d().mo7867j_()) {
                abstractC1978n2 = abstractC1978n;
            } else {
                Abstractn abstractC1978n3 = (Abstractn) c1989y.m8036d().mo7865h();
                Abstractn abstractC1978nG = c1989y.m8038g();
                Abstractn c1971g = abstractC1978n3;
                while (abstractC1978nG.getClass() == ClassY.class) {
                    ClassY c1989y2 = (ClassY) abstractC1978nG;
                    if (!"append".equals(c1989y2.m8040j()) || c1989y2.m8036d() == null || c1989y2.m8036d().mo7867j_()) {
                        break;
                    }
                    c1971g = new ClassG(c1989y2.mo7970e(), ClassI.f5841n, (Abstractn) c1989y2.m8036d(), "+", c1971g, 4);
                    abstractC1978nG = c1989y2.m8038g();
                }
                if (abstractC1978nG.getClass() == ab.class) {
                    ab c1954ab = (ab) abstractC1978nG;
                    String strMo8146e = c1954ab.mo7963f().mo8146e();
                    if (!"Ljava/lang/StringBuilder;".equals(strMo8146e) && !"Ljava/lang/StringBuffer;".equals(strMo8146e)) {
                        abstractC1978n2 = abstractC1978n;
                    } else {
                        if (c1954ab.m7966j() == null) {
                            return c1971g;
                        }
                        if (c1954ab.m7966j().mo7867j_()) {
                            abstractC1978n2 = abstractC1978n;
                        } else {
                            abstractC1978n2 = (Abstractn) c1954ab.m7966j().mo7865h();
                            if (abstractC1978n2.mo7963f() == ClassI.f5841n) {
                                return new ClassG(c1954ab.mo7970e(), ClassI.f5841n, abstractC1978n2, "+", c1971g, 4);
                            }
                        }
                    }
                } else {
                    abstractC1978n2 = abstractC1978n;
                }
            }
        } else {
            abstractC1978n2 = abstractC1978n;
        }
        return new ClassY(i, ClassI.f5841n, abstractC1978n2, str, "toString", "()Ljava/lang/String;");
    }
}
