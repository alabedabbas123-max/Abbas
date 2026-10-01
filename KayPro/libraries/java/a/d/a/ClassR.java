package a.d.a;

import a.b.c;
import a.b.f.ClassI;
import a.j.ClassB;

class ClassR extends ClassV {

    private final Abstractbd[] f543f;

    public ClassR(String str, c cVar, boolean z, Abstractae abstractC0180ae, Interfacebe interfaceC0207be, int i) {
        super(str, cVar, z, abstractC0180ae, interfaceC0207be, i);
        if (!abstractC0180ae.mo1321c() || abstractC0180ae.mo1357e() < 0 || abstractC0180ae.mo1357e() > 32) {
            this.f543f = null;
            return;
        }
        ac c0178ac = new ac(interfaceC0207be);
        str = ClassI.m773f(str) ? str.substring(1) : str;
        this.f543f = new Abstractbd[abstractC0180ae.mo1357e()];
        for (int i2 = 0; i2 < this.f543f.length; i2++) {
            this.f543f[i2] = c0178ac.m1316a(str);
        }
    }

    private Abstractbd m1592f(Abstractae abstractC0180ae, Interfacebe interfaceC0207be) {
        int iMo1357e;
        if (this.f543f == null || !abstractC0180ae.mo1321c() || (iMo1357e = abstractC0180ae.mo1357e()) < 0 || iMo1357e >= this.f543f.length) {
            return null;
        }
        return this.f543f[iMo1357e];
    }

    @Override
    public Abstractae mo1537a(Abstractae abstractC0180ae, Interfacebe interfaceC0207be) {
        Abstractbd abstractC0206bdM1592f = m1592f(abstractC0180ae, interfaceC0207be);
        return abstractC0206bdM1592f != null ? abstractC0206bdM1592f.mo1404r() : super.mo1537a(abstractC0180ae, interfaceC0207be);
    }

    @Override
    public Abstractap mo1305a(Abstractap abstractC0191ap) {
        return abstractC0191ap.mo1541a(this);
    }

    @Override
    public void mo1543a(Abstractae abstractC0180ae, Abstractbd abstractC0206bd) {
        if (this.f543f != null) {
            if (!abstractC0180ae.mo1321c()) {
                for (int i = 0; i < this.f543f.length; i++) {
                    this.f543f[i].mo1319a(abstractC0206bd);
                }
                return;
            }
            int iMo1357e = abstractC0180ae.mo1357e();
            if (iMo1357e < 0 || iMo1357e >= this.f543f.length) {
                return;
            }
            this.f543f[iMo1357e] = abstractC0206bd;
        }
    }

    @Override
    public int mo1307b(Abstractap abstractC0191ap) {
        return abstractC0191ap.mo1547b(this);
    }

    @Override
    public Abstractaf mo1548b(Abstractae abstractC0180ae, Interfacebe interfaceC0207be) {
        Abstractbd abstractC0206bdM1592f = m1592f(abstractC0180ae, interfaceC0207be);
        return abstractC0206bdM1592f != null ? abstractC0206bdM1592f.mo1466k_() : super.mo1548b(abstractC0180ae, interfaceC0207be);
    }

    @Override
    public Abstractu mo1552c(Abstractae abstractC0180ae, Interfacebe interfaceC0207be) {
        Abstractbd abstractC0206bdM1592f = m1592f(abstractC0180ae, interfaceC0207be);
        return abstractC0206bdM1592f != null ? abstractC0206bdM1592f.mo1590l() : super.mo1552c(abstractC0180ae, interfaceC0207be);
    }

    @Override
    public boolean mo1321c() {
        if (this.f543f == null) {
            return false;
        }
        for (int i = 0; i < this.f543f.length; i++) {
            if (!this.f543f[i].mo1321c()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Abstractt mo1553d(Abstractae abstractC0180ae, Interfacebe interfaceC0207be) {
        Abstractbd abstractC0206bdM1592f = m1592f(abstractC0180ae, interfaceC0207be);
        return abstractC0206bdM1592f != null ? abstractC0206bdM1592f.mo1589i() : super.mo1553d(abstractC0180ae, interfaceC0207be);
    }

    @Override
    public Abstractap mo1554e(Abstractae abstractC0180ae, Interfacebe interfaceC0207be) {
        Abstractbd abstractC0206bdM1592f = m1592f(abstractC0180ae, interfaceC0207be);
        return abstractC0206bdM1592f != null ? abstractC0206bdM1592f.mo1558l_() : super.mo1554e(abstractC0180ae, interfaceC0207be);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj)) {
            return ClassB.m3131a(this.f543f, ((ClassR) obj).f543f);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ ClassB.m3126a(this.f543f);
    }

    @Override
    public String toString() {
        if (this.f543f == null) {
            return super.toString();
        }
        StringBuffer stringBuffer = new StringBuffer(super.toString());
        stringBuffer.append('{');
        int i = 0;
        while (i < this.f543f.length) {
            stringBuffer.append(this.f543f[i]);
            stringBuffer.append(i < this.f543f.length + (-1) ? ',' : '}');
            i++;
        }
        return stringBuffer.toString();
    }
}
