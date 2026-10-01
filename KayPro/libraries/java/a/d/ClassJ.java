package a.d;

import a.d.a.Abstractbd;

public class ClassJ extends ClassI {

    private Abstractbd f575d;

    private ClassI f576e;

    private ClassI f577f;

    public ClassJ(int i) {
        super(i);
        this.f576e = new ClassI(i);
        this.f577f = new ClassI(i);
    }

    public ClassJ(ClassJ c0240j) {
        super(c0240j);
        this.f576e = new ClassI(c0240j.f576e);
        this.f577f = new ClassI(c0240j.f577f);
    }

    private void m1658r() {
        this.f576e.mo1637a(this.f575d);
        this.f577f.mo1637a(this.f575d);
    }

    private void m1659s() {
        this.f576e.mo1642c();
        this.f577f.mo1642c();
    }

    @Override
    public void mo1635a() {
        super.mo1635a();
        this.f576e.mo1635a();
        this.f577f.mo1635a();
    }

    @Override
    public void mo1636a(int i) {
        super.mo1636a(i);
        this.f576e.mo1636a(i);
        this.f577f.mo1636a(i);
    }

    @Override
    public void mo1637a(Abstractbd abstractC0206bd) {
        super.mo1637a(abstractC0206bd);
        m1658r();
        if (abstractC0206bd.mo1588b()) {
            m1658r();
        }
    }

    public void m1660a(ClassJ c0240j) {
        super.m1638a((ClassI) c0240j);
        this.f576e.m1638a(c0240j.f576e);
        this.f577f.m1638a(c0240j.f577f);
    }

    public void m1661b(Abstractbd abstractC0206bd) {
        this.f575d = abstractC0206bd;
    }

    public boolean m1662b(ClassJ c0240j) {
        return super.m1641b((ClassI) c0240j) | this.f576e.m1641b(c0240j.f576e) | this.f577f.m1641b(c0240j.f577f);
    }

    @Override
    public Abstractbd mo1642c() {
        Abstractbd abstractC0206bdMo1642c = super.mo1642c();
        m1659s();
        if (abstractC0206bdMo1642c.mo1588b()) {
            m1659s();
        }
        return abstractC0206bdMo1642c;
    }

    public Abstractbd m1663d(int i) {
        return this.f576e.m1640b(i);
    }

    public Abstractbd m1664e(int i) {
        return this.f577f.m1640b(i);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClassJ c0240j = (ClassJ) obj;
        return super.equals(obj) && this.f576e.equals(c0240j.f576e) && this.f577f.equals(c0240j.f577f);
    }

    public Abstractbd m1665f(int i) {
        return this.f576e.m1643c(i);
    }

    public Abstractbd m1666g(int i) {
        return this.f577f.m1643c(i);
    }

    @Override
    public int hashCode() {
        return (super.hashCode() ^ this.f576e.hashCode()) ^ this.f577f.hashCode();
    }

    @Override
    public void mo1649i() {
        super.mo1649i();
        m1659s();
    }

    @Override
    public void mo1650j() {
        super.mo1650j();
        m1659s();
        m1659s();
    }

    @Override
    public void mo1651k() {
        super.mo1651k();
        this.f576e.mo1642c();
        this.f576e.mo1637a(this.f575d);
        this.f576e.mo1637a(this.f575d);
        this.f577f.mo1651k();
    }

    @Override
    public void mo1652l() {
        super.mo1652l();
        this.f576e.mo1642c();
        this.f576e.mo1642c();
        this.f576e.mo1637a(this.f575d);
        this.f576e.mo1637a(this.f575d);
        this.f576e.mo1637a(this.f575d);
        this.f577f.mo1652l();
    }

    @Override
    public void mo1653m() {
        super.mo1653m();
        this.f576e.mo1642c();
        this.f576e.mo1642c();
        this.f576e.mo1642c();
        this.f576e.mo1637a(this.f575d);
        this.f576e.mo1637a(this.f575d);
        this.f576e.mo1637a(this.f575d);
        this.f576e.mo1637a(this.f575d);
        this.f577f.mo1653m();
    }

    @Override
    public void mo1654n() {
        super.mo1654n();
        this.f576e.mo1642c();
        this.f576e.mo1642c();
        this.f576e.mo1637a(this.f575d);
        this.f576e.mo1637a(this.f575d);
        this.f576e.mo1637a(this.f575d);
        this.f576e.mo1637a(this.f575d);
        this.f577f.mo1654n();
    }

    @Override
    public void mo1655o() {
        super.mo1655o();
        this.f576e.mo1642c();
        this.f576e.mo1642c();
        this.f576e.mo1642c();
        this.f576e.mo1637a(this.f575d);
        this.f576e.mo1637a(this.f575d);
        this.f576e.mo1637a(this.f575d);
        this.f576e.mo1637a(this.f575d);
        this.f576e.mo1637a(this.f575d);
        this.f577f.mo1655o();
    }

    @Override
    public void mo1656p() {
        super.mo1656p();
        this.f576e.mo1642c();
        this.f576e.mo1642c();
        this.f576e.mo1642c();
        this.f576e.mo1642c();
        this.f576e.mo1637a(this.f575d);
        this.f576e.mo1637a(this.f575d);
        this.f576e.mo1637a(this.f575d);
        this.f576e.mo1637a(this.f575d);
        this.f576e.mo1637a(this.f575d);
        this.f576e.mo1637a(this.f575d);
        this.f577f.mo1656p();
    }

    @Override
    public void mo1657q() {
        super.mo1657q();
        this.f576e.mo1642c();
        this.f576e.mo1642c();
        this.f576e.mo1637a(this.f575d);
        this.f576e.mo1637a(this.f575d);
        this.f577f.mo1657q();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < m1639b(); i++) {
            Abstractbd abstractC0206bd = this.f572a[i];
            Abstractbd abstractC0206bdM1640b = this.f576e.m1640b(i);
            Abstractbd abstractC0206bdM1640b2 = this.f577f.m1640b(i);
            stringBuffer = stringBuffer.append('[').append(abstractC0206bdM1640b == null ? "empty:" : abstractC0206bdM1640b.equals(abstractC0206bdM1640b2) ? abstractC0206bdM1640b.toString() : abstractC0206bdM1640b.toString() + abstractC0206bdM1640b2.toString()).append(abstractC0206bd == null ? "empty" : abstractC0206bd.toString()).append(']');
        }
        return stringBuffer.toString();
    }
}
