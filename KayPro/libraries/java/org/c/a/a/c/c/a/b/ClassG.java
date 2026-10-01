package org.c.a.a.c.c.a.b;

import java.util.HashSet;
import org.c.a.a.b.c.ClassH;
import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.a.ClassB;
import org.c.a.a.b.d.a.ClassI;
import org.c.a.a.b.d.a.ClassJ;
import org.c.a.a.b.d.a.ClassK;
import org.c.a.a.b.d.a.ClassN;
import org.c.a.a.b.d.a.ClassO;
import org.c.a.a.b.d.a.ClassQ;
import org.c.a.a.b.d.a.ClassV;
import org.c.a.a.b.d.a.Interfacel;
import org.c.a.a.b.d.b.aa;
import org.c.a.a.b.d.b.ab;
import org.c.a.a.b.d.b.ac;
import org.c.a.a.b.d.b.ad;
import org.c.a.a.b.d.b.ae;
import org.c.a.a.b.d.b.af;
import org.c.a.a.b.d.b.ag;
import org.c.a.a.b.d.b.ah;
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
import org.c.a.a.b.d.c.ClassA;
import org.c.a.a.b.d.c.ClassB;
import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.b.d.e.Interfaced;
import org.c.a.a.c.c.a.a.ClassB;

public class ClassG extends Abstracta {

    protected String f6301a;

    protected ClassH f6302b = ClassB.m8721a();

    protected int f6303c = 0;

    protected HashSet f6304d = new HashSet();

    public ClassG(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        this.f6301a = iLastIndexOf == -1 ? "" : str.substring(0, iLastIndexOf + 1);
    }

    public ClassH m8777a() {
        this.f6302b.m7720i();
        return this.f6302b;
    }

    @Override
    public void mo7768a(ClassB c1926b) {
        m7828a(c1926b.m7892j());
        m7773a(c1926b.m7896a());
        m7773a((Interfacel) c1926b.m7897b());
    }

    @Override
    public void mo7770a(ClassI c1933i) {
        if (this.f6304d.contains(c1933i.m7901a())) {
            return;
        }
        this.f6304d.add(c1933i.m7901a());
        m7773a(c1933i.m7902b());
    }

    @Override
    public void mo7771a(ClassJ c1934j) {
        m7859a((Interfaced) c1934j.m7903a());
        m8141a(c1934j.m7940b());
        m7859a(c1934j.m7942n_());
        m7828a(c1934j.m7892j());
        m7773a((Interfacel) c1934j.m7941e());
    }

    @Override
    public void mo7772a(ClassK c1935k) {
        m7828a(c1935k.m7905b());
        m7773a(c1935k.m7910p_());
        m7859a(c1935k.m7906e());
        m7839a(c1935k.m7908g());
    }

    @Override
    public void mo7774a(ClassN c1938n) {
        m7859a(c1938n.m7911a());
        m7828a(c1938n.m7892j());
        m7773a((Interfacel) c1938n.m7913c());
    }

    @Override
    public void mo7775a(ClassO c1939o) {
        m7828a(c1939o.m7916b());
        m7800a(c1939o.m7918d());
        m7773a((Interfacel) c1939o.m7919e());
    }

    @Override
    public void mo7777a(ClassQ c1941q) {
        m7828a(c1941q.m7923b());
        c1941q.m7924c().mo8142a(this);
        c1941q.m7925d().mo7869a(this);
    }

    @Override
    public void mo7782a(ClassV c1946v) {
        m8141a(c1946v.m7940b());
        m7859a(c1946v.m7942n_());
        m7828a(c1946v.m7892j());
        m7773a((Interfacel) c1946v.m7941e());
    }

    @Override
    public void mo7786a(aa c1953aa) {
        if (this.f6303c < c1953aa.mo7970e()) {
            this.f6303c = c1953aa.mo7970e();
        }
        m7800a(c1953aa.m7958d());
    }

    @Override
    public void mo7787a(ab c1954ab) {
        if (this.f6303c < c1954ab.mo7970e()) {
            this.f6303c = c1954ab.mo7970e();
        }
        m8141a(c1954ab.m7962d());
        c1954ab.mo7963f().mo8142a(this);
        m7800a(c1954ab.m7966j());
        m7773a((Interfacel) c1954ab.m7967l());
    }

    @Override
    public void mo7788a(ac c1955ac) {
        if (this.f6303c < c1955ac.mo7970e()) {
            this.f6303c = c1955ac.mo7970e();
        }
        super.mo7788a(c1955ac);
    }

    @Override
    public void mo7789a(ad c1956ad) {
        if (this.f6303c < c1956ad.mo7970e()) {
            this.f6303c = c1956ad.mo7970e();
        }
    }

    @Override
    public void mo7790a(ae c1957ae) {
        if (this.f6303c < c1957ae.mo7970e()) {
            this.f6303c = c1957ae.mo7970e();
        }
        super.mo7790a(c1957ae);
    }

    @Override
    public void mo7791a(af c1958af) {
        if (this.f6303c < c1958af.mo7970e()) {
            this.f6303c = c1958af.mo7970e();
        }
        super.mo7791a(c1958af);
    }

    @Override
    public void mo7792a(ag c1959ag) {
        if (this.f6303c < c1959ag.mo7970e()) {
            this.f6303c = c1959ag.mo7970e();
        }
        super.mo7792a(c1959ag);
    }

    @Override
    public void mo7793a(ah c1960ah) {
        if (this.f6303c < c1960ah.mo7970e()) {
            this.f6303c = c1960ah.mo7970e();
        }
        super.mo7793a(c1960ah);
    }

    @Override
    public void mo7795a(aj c1962aj) {
        if (this.f6303c < c1962aj.mo7970e()) {
            this.f6303c = c1962aj.mo7970e();
        }
        super.mo7795a(c1962aj);
    }

    @Override
    public void mo7796a(ak c1963ak) {
        if (this.f6303c < c1963ak.mo7970e()) {
            this.f6303c = c1963ak.mo7970e();
        }
        super.mo7796a(c1963ak);
    }

    @Override
    public void mo7797a(al c1964al) {
        if (this.f6303c < c1964al.mo7970e()) {
            this.f6303c = c1964al.mo7970e();
        }
        super.mo7797a(c1964al);
    }

    @Override
    public void mo7798a(am c1965am) {
        if (this.f6303c < c1965am.mo7970e()) {
            this.f6303c = c1965am.mo7970e();
        }
        super.mo7798a(c1965am);
    }

    @Override
    public void mo7799a(ClassE c1969e) {
        if (this.f6303c < c1969e.mo7970e()) {
            this.f6303c = c1969e.mo7970e();
        }
        c1969e.m7995d().mo7957a(this);
        c1969e.m7996g().mo7957a(this);
    }

    @Override
    public void mo7801a(ClassG c1971g) {
        if (this.f6303c < c1971g.mo7970e()) {
            this.f6303c = c1971g.mo7970e();
        }
        super.mo7801a(c1971g);
    }

    @Override
    public void mo7802a(ClassH c1972h) {
        if (this.f6303c < c1972h.mo7970e()) {
            this.f6303c = c1972h.mo7970e();
        }
        super.mo7802a(c1972h);
    }

    @Override
    public void mo7803a(ClassI c1973i) {
        if (this.f6303c < c1973i.mo7970e()) {
            this.f6303c = c1973i.mo7970e();
        }
        super.mo7803a(c1973i);
    }

    @Override
    public void mo7804a(ClassJ c1974j) {
        if (this.f6303c < c1974j.mo7970e()) {
            this.f6303c = c1974j.mo7970e();
        }
        super.mo7804a(c1974j);
    }

    @Override
    public void mo7805a(ClassK c1975k) {
        if (this.f6303c < c1975k.mo7970e()) {
            this.f6303c = c1975k.mo7970e();
        }
        super.mo7805a(c1975k);
    }

    @Override
    public void mo7806a(ClassL c1976l) {
        if (this.f6303c < c1976l.mo7970e()) {
            this.f6303c = c1976l.mo7970e();
        }
    }

    @Override
    public void mo7809a(ClassQ c1981q) {
        if (this.f6303c < c1981q.mo7970e()) {
            this.f6303c = c1981q.mo7970e();
        }
        m7800a(c1981q.m8019d());
    }

    @Override
    public void mo7810a(ClassR c1982r) {
        if (this.f6303c < c1982r.mo7970e()) {
            this.f6303c = c1982r.mo7970e();
        }
    }

    @Override
    public void mo7811a(ClassS c1983s) {
        if (this.f6303c < c1983s.mo7970e()) {
            this.f6303c = c1983s.mo7970e();
        }
        super.mo7811a(c1983s);
    }

    @Override
    public void mo7812a(ClassT c1984t) {
        if (this.f6303c < c1984t.mo7970e()) {
            this.f6303c = c1984t.mo7970e();
        }
    }

    @Override
    public void mo7813a(ClassU c1985u) {
        if (this.f6303c < c1985u.mo7970e()) {
            this.f6303c = c1985u.mo7970e();
        }
        super.mo7813a(c1985u);
    }

    @Override
    public void mo7814a(ClassV c1986v) {
        if (this.f6303c < c1986v.mo7970e()) {
            this.f6303c = c1986v.mo7970e();
        }
        super.mo7814a(c1986v);
    }

    @Override
    public void mo7815a(ClassW c1987w) {
        if (this.f6303c < c1987w.mo7970e()) {
            this.f6303c = c1987w.mo7970e();
        }
        super.mo7815a(c1987w);
    }

    @Override
    public void mo7816a(ClassX c1988x) {
        if (this.f6303c < c1988x.mo7970e()) {
            this.f6303c = c1988x.mo7970e();
        }
    }

    @Override
    public void mo7817a(ClassY c1989y) {
        if (this.f6303c < c1989y.mo7970e()) {
            this.f6303c = c1989y.mo7970e();
        }
        super.mo7817a(c1989y);
    }

    @Override
    public void mo7818a(ClassZ c1990z) {
        if (this.f6303c < c1990z.mo7970e()) {
            this.f6303c = c1990z.mo7970e();
        }
        c1990z.m8038g().mo7957a(this);
    }

    @Override
    public void mo7820a(ClassA c1991a) {
        super.mo7820a(c1991a);
        m8779b(c1991a.m8044d());
    }

    @Override
    public void mo7821a(ClassB c1992b) {
        super.mo7821a(c1992b);
        m8779b(c1992b.m8044d());
    }

    @Override
    public void mo8131a(ClassI c2049i) {
        m8779b(c2049i);
        m8141a(c2049i.m8153k());
    }

    public int m8778b() {
        return this.f6303c;
    }

    protected void m8779b(ClassI c2049i) {
        String strM8150g = c2049i.m8150g();
        String strM8151i = c2049i.m8151i();
        if (strM8150g.startsWith("java/lang/")) {
            if (strM8150g.indexOf(47, 10) != -1) {
                this.f6302b.m7717a(strM8150g, strM8151i);
            }
        } else if (!strM8150g.startsWith(this.f6301a)) {
            this.f6302b.m7717a(strM8150g, strM8151i);
        } else if (strM8150g.indexOf(47, this.f6301a.length()) != -1) {
            this.f6302b.m7717a(strM8150g, strM8151i);
        }
    }
}
