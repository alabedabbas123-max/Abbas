package a.f;

import a.b.c;
import a.b.g.s;
import a.b.k;
import a.b.ClassE;
import a.b.f.ClassI;

class ClassE implements s {

    final ClassC f702a;

    private ClassE(ClassC c0293c) {
        this.f702a = c0293c;
    }

    private void m1811a(String str, String str2, boolean z) {
        String strM744C = ClassI.m744C(str);
        String strM744C2 = ClassI.m744C(str2);
        do {
            this.f702a.f696i.put(strM744C, strM744C2);
            if (!z) {
                return;
            }
            strM744C = ClassI.m744C(strM744C);
            strM744C2 = ClassI.m744C(strM744C2);
            if (strM744C.length() <= 0) {
                return;
            }
        } while (strM744C2.length() > 0);
    }

    public void m1812a(ClassE c0057e) {
        String strM1794b = ClassC.m1794b(c0057e);
        if (strM1794b == null) {
            strM1794b = c0057e.m415b();
        }
        this.f702a.f695h.add(this.f702a.m1802e(strM1794b));
        if (this.f702a.f693f == null || !this.f702a.f694g) {
            m1811a(c0057e.m415b(), strM1794b, this.f702a.f693f == null && this.f702a.f692e == null);
        }
    }

    public void m1813a(k kVar) {
        String strM1794b = ClassC.m1794b((c) kVar);
        if (strM1794b != null) {
            this.f702a.f695h.add(this.f702a.m1802e(strM1794b));
            if (this.f702a.f693f == null || !this.f702a.f694g) {
                m1811a(kVar.b(), strM1794b, this.f702a.f693f == null && this.f702a.f692e == null);
            }
        }
    }
}
