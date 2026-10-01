package a.g.a;

import a.b.b.q;
import a.b.c;
import a.b.ClassH;
import a.b.ClassN;
import a.b.Interfacej;
import a.b.f.ClassI;
import a.d.Abstracth;
import a.d.a.Abstractap;
import a.d.a.Abstractbd;
import a.d.a.ad;
import a.d.a.av;
import a.g.b.ac;

public class ClassU extends ClassZ {

    private Abstractbd[] f842a;

    public ClassU(Abstracth abstractC0238h) {
        super(abstractC0238h);
        this.f842a = new Abstractbd[256];
    }

    private boolean m2178a(c cVar, Interfacej interfaceC0162j, Abstractap abstractC0191ap) {
        String strM796s = ClassI.m796s(interfaceC0162j.mo949b(cVar));
        c[] cVarArr = interfaceC0162j instanceof ClassN ? ((ClassN) interfaceC0162j).f437a : ((ClassH) interfaceC0162j).f427a;
        return abstractC0191ap.mo1536a(strM796s, (cVarArr == null || !ClassI.m784j(strM796s)) ? null : cVarArr[cVarArr.length + (-1)]) != -1;
    }

    @Override
    public void mo1602a(c cVar, q qVar, int i, Abstractbd abstractC0206bd) {
        super.mo1602a(cVar, qVar, i, abstractC0206bd);
        this.f842a[i] = abstractC0206bd;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    @Override
    public Abstractbd mo1611b(c cVar, q qVar, String str) {
        Interfacej interfaceC0162j;
        ad c0179ad;
        ad c0179adMo1335n_;
        Abstractbd abstractC0206bdMo1611b = super.mo1611b(cVar, qVar, str);
        if (abstractC0206bdMo1611b.mo1331j() != 5 || (interfaceC0162j = (Interfacej) qVar.e) == null) {
            return abstractC0206bdMo1611b;
        }
        int iM1317a = ((av) abstractC0206bdMo1611b).m1582s().mo1335n_().m1317a(0);
        if (ac.m2271d(interfaceC0162j)) {
            c0179ad = new ad(iM1317a | 67108864);
        } else {
            c0179ad = ac.m2268c(interfaceC0162j) ? new ad(iM1317a | 134217728) : null;
        }
        long jM2261b = ac.m2261b(interfaceC0162j);
        int iM747a = ClassI.m747a(qVar.c(cVar), this.f567b);
        int i = 0;
        ad c0179ad2 = c0179ad;
        while (i < iM747a) {
            if (((1 << i) & jM2261b) != 0) {
                Abstractbd abstractC0206bd = this.f842a[i];
                if (abstractC0206bd instanceof av) {
                    av c0197av = (av) abstractC0206bd;
                    if (m2178a(qVar.c, interfaceC0162j, (Abstractap) c0197av)) {
                        c0179adMo1335n_ = c0197av.m1582s().mo1335n_();
                        if (c0179ad2 != null) {
                            c0179adMo1335n_ = c0179ad2.m1318a(c0179adMo1335n_);
                        }
                    } else {
                        c0179adMo1335n_ = c0179ad2;
                    }
                } else {
                    c0179adMo1335n_ = c0179ad2;
                }
            } else {
                c0179adMo1335n_ = c0179ad2;
            }
            i++;
            c0179ad2 = c0179adMo1335n_;
        }
        return c0179ad2 != null ? m2222a(abstractC0206bdMo1611b, c0179ad2) : abstractC0206bdMo1611b;
    }
}
