package org.a.a.a;

import java.util.EmptyStackException;
import org.a.a.a.a.ab;
import org.a.a.a.c.ClassG;
import org.a.a.a.c.ClassH;
import org.a.a.a.c.ClassM;

public abstract class Abstractp extends Abstractu implements Interfaceac {

    public Interfacec f5338i;

    protected ClassM f5339j;

    public Interfaceaa f5341l;

    public int f5343n;

    public int f5344o;

    public boolean f5345p;

    public int f5346q;

    public int f5347r;

    public String f5350u;

    protected Interfaceab f5340k = ClassM.f5335a;

    public int f5342m = -1;

    public final ClassG f5348s = new ClassG();

    public int f5349t = 0;

    public Abstractp(Interfacec interfaceC1763c) {
        this.f5338i = interfaceC1763c;
        this.f5339j = new ClassM(this, interfaceC1763c);
    }

    public String m7451a(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(m7462e(c));
        }
        return sb.toString();
    }

    public void m7452a(int i) {
        this.f5349t = i;
    }

    public void m7453a(Interfaceaa interfaceC1751aa) {
        this.f5341l = interfaceC1751aa;
    }

    public void m7454a(Interfaceo interfaceC1789o) {
        this.f5338i = null;
        this.f5339j = new ClassM(this, this.f5338i);
        m7458c();
        this.f5338i = (Interfacec) interfaceC1789o;
        this.f5339j = new ClassM(this, this.f5338i);
    }

    public void m7455a(ClassQ c1791q) {
        if (this.f5338i.mo7442c(1) != -1) {
            ((ab) m7475m()).m7267b(this.f5338i);
        }
    }

    @Override
    public String[] mo5543a() {
        return null;
    }

    public void m7456b(int i) {
        this.f5348s.m7385d(this.f5349t);
        m7452a(i);
    }

    public void m7457b(ClassQ c1791q) {
        m7477o().mo7239a(this, null, this.f5343n, this.f5344o, "token recognition error at: '" + m7451a(this.f5338i.mo7367a(ClassH.m7387a(this.f5342m, this.f5338i.mo7438b()))) + "'", c1791q);
    }

    public void m7458c() {
        if (this.f5338i != null) {
            this.f5338i.mo7439b(0);
        }
        this.f5341l = null;
        this.f5347r = 0;
        this.f5346q = 0;
        this.f5342m = -1;
        this.f5344o = -1;
        this.f5343n = -1;
        this.f5350u = null;
        this.f5345p = false;
        this.f5349t = 0;
        this.f5348s.m7383c();
        ((ab) m7475m()).m7259a();
    }

    public void m7459c(int i) {
        this.f5347r = i;
    }

    public Interfaceaa m7460d() {
        Interfaceaa interfaceC1751aa;
        int iM7250a;
        if (this.f5338i == null) {
            throw new IllegalStateException("nextToken requires a non-null input stream.");
        }
        int iD = this.f5338i.mo7441d();
        while (!this.f5345p) {
            try {
                this.f5341l = null;
                this.f5346q = 0;
                this.f5342m = this.f5338i.mo7438b();
                this.f5344o = ((ab) m7475m()).m7268c();
                this.f5343n = ((ab) m7475m()).m7266b();
                this.f5350u = null;
                while (true) {
                    this.f5347r = 0;
                    try {
                        iM7250a = ((ab) m7475m()).m7250a(this.f5338i, this.f5349t);
                    } catch (ClassQ e) {
                        m7457b(e);
                        m7455a(e);
                        iM7250a = -3;
                    }
                    if (this.f5338i.mo7442c(1) == -1) {
                        this.f5345p = true;
                    }
                    if (this.f5347r == 0) {
                        this.f5347r = iM7250a;
                    }
                    if (this.f5347r != -3) {
                        if (this.f5347r != -2) {
                            if (this.f5341l == null) {
                                m7466h();
                            }
                            interfaceC1751aa = this.f5341l;
                            return interfaceC1751aa;
                        }
                    }
                }
            } finally {
                this.f5338i.mo7437a(iD);
            }
        }
        m7467i();
        interfaceC1751aa = this.f5341l;
        return interfaceC1751aa;
    }

    public void m7461d(int i) {
        this.f5346q = i;
    }

    public String m7462e(int i) {
        String strValueOf = String.valueOf((char) i);
        switch (i) {
            case -1:
                return "<EOF>";
            case 9:
                return "\\t";
            case 10:
                return "\\n";
            case 13:
                return "\\r";
            default:
                return strValueOf;
        }
    }

    public void m7463e() {
        this.f5347r = -3;
    }

    public void m7464f() {
        this.f5347r = -2;
    }

    public int m7465g() {
        if (this.f5348s.m7379a()) {
            throw new EmptyStackException();
        }
        m7452a(this.f5348s.m7386e());
        return this.f5349t;
    }

    public Interfaceaa m7466h() {
        Interfaceaa interfaceC1751aaMo7357b = this.f5340k.mo7357b(this.f5339j, this.f5347r, this.f5350u, this.f5346q, this.f5342m, m7470l() - 1, this.f5343n, this.f5344o);
        m7453a(interfaceC1751aaMo7357b);
        return interfaceC1751aaMo7357b;
    }

    public Interfaceaa m7467i() {
        Interfaceaa interfaceC1751aaMo7357b = this.f5340k.mo7357b(this.f5339j, -1, null, 0, this.f5338i.mo7438b(), this.f5338i.mo7438b() - 1, mo7468j(), mo7469k());
        m7453a(interfaceC1751aaMo7357b);
        return interfaceC1751aaMo7357b;
    }

    @Override
    public int mo7468j() {
        return ((ab) m7475m()).m7266b();
    }

    @Override
    public int mo7469k() {
        return ((ab) m7475m()).m7268c();
    }

    public int m7470l() {
        return this.f5338i.mo7438b();
    }
}
