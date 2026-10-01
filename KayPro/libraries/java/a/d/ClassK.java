package a.d;

import a.d.a.Abstractbd;

public class ClassK extends ClassL {

    private Abstractbd f578c;

    private ClassL f579d;

    public ClassK(int i) {
        super(i);
        this.f579d = new ClassL(i);
    }

    public ClassK(ClassK c0241k) {
        super(c0241k);
        this.f579d = new ClassL(c0241k.f579d);
    }

    public Abstractbd m1667a(int i) {
        return this.f579d.m1677c(i);
    }

    public void m1668a(int i, Abstractbd abstractC0206bd) {
        this.f579d.mo1673b(i, abstractC0206bd);
    }

    public void m1669a(Abstractbd abstractC0206bd) {
        this.f578c = abstractC0206bd;
    }

    public void m1670a(ClassK c0241k) {
        super.m1675a((ClassL) c0241k);
        this.f579d.m1675a(c0241k.f579d);
    }

    public boolean m1671a(ClassK c0241k, boolean z) {
        boolean zM1676a = super.m1676a((ClassL) c0241k, z);
        boolean zM1676a2 = this.f579d.m1676a(c0241k.f579d, z);
        if (zM1676a) {
            for (int i = 0; i < this.f582b; i++) {
                if (this.f581a[i] == null) {
                    this.f579d.f581a[i] = null;
                    if (z) {
                        c0241k.f579d.f581a[i] = null;
                    }
                }
            }
        }
        return zM1676a || zM1676a2;
    }

    @Override
    public void mo1672b(int i) {
        super.mo1672b(i);
        this.f579d.mo1672b(i);
    }

    @Override
    public void mo1673b(int i, Abstractbd abstractC0206bd) {
        super.mo1673b(i, abstractC0206bd);
        this.f579d.mo1673b(i, this.f578c);
        if (abstractC0206bd.mo1588b()) {
            this.f579d.mo1673b(i + 1, this.f578c);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return super.equals(obj) && this.f579d.equals(((ClassK) obj).f579d);
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.f579d.hashCode();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < m1674a(); i++) {
            Abstractbd abstractC0206bd = this.f581a[i];
            Abstractbd abstractC0206bdM1677c = this.f579d.m1677c(i);
            stringBuffer = stringBuffer.append('[').append(abstractC0206bdM1677c == null ? "empty:" : abstractC0206bdM1677c.toString()).append(abstractC0206bd == null ? "empty" : abstractC0206bd.toString()).append(']');
        }
        return stringBuffer.toString();
    }
}
