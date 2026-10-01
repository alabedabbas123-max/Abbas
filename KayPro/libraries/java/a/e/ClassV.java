package a.e;

import java.io.OutputStream;

public class ClassV implements Interfaceo {

    private final Interfacej f668a;

    private Interfaceo f669b;

    private Interfaceo f670c;

    public ClassV(Interfacej interfaceC0270j, Interfaceo interfaceC0275o) {
        this(interfaceC0270j, interfaceC0275o, null);
    }

    public ClassV(Interfacej interfaceC0270j, Interfaceo interfaceC0275o, Interfaceo interfaceC0275o2) {
        this.f668a = interfaceC0270j;
        this.f669b = interfaceC0275o;
        this.f670c = interfaceC0275o2;
    }

    @Override
    public void mo1715a() {
        if (this.f669b != null) {
            this.f669b.mo1715a();
            this.f669b = null;
        }
        if (this.f670c != null) {
            this.f670c.mo1715a();
            this.f670c = null;
        }
    }

    @Override
    public boolean mo1716a(Interfaceg interfaceC0267g) {
        Interfaceo interfaceC0275o = this.f668a.mo1755a(interfaceC0267g) ? this.f669b : this.f670c;
        return interfaceC0275o != null && interfaceC0275o.mo1716a(interfaceC0267g);
    }

    @Override
    public boolean mo1717a(Interfaceg interfaceC0267g, Interfaceg interfaceC0267g2) {
        boolean zMo1755a = this.f668a.mo1755a(interfaceC0267g);
        boolean zMo1755a2 = this.f668a.mo1755a(interfaceC0267g2);
        if (zMo1755a) {
            return !zMo1755a2 || this.f669b == null || this.f669b.mo1717a(interfaceC0267g, interfaceC0267g2);
        }
        return zMo1755a2 || this.f670c == null || this.f670c.mo1717a(interfaceC0267g, interfaceC0267g2);
    }

    @Override
    public OutputStream mo1718b(Interfaceg interfaceC0267g) {
        Interfaceo interfaceC0275o = this.f668a.mo1755a(interfaceC0267g) ? this.f669b : this.f670c;
        if (interfaceC0275o != null) {
            return interfaceC0275o.mo1718b(interfaceC0267g);
        }
        return null;
    }
}
