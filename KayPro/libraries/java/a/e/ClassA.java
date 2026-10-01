package a.e;

import java.io.OutputStream;

public class ClassA implements Interfaceo {

    private Interfaceo f594a;

    private Interfaceo f595b;

    public ClassA(Interfaceo interfaceC0275o, Interfaceo interfaceC0275o2) {
        this.f594a = interfaceC0275o;
        this.f595b = interfaceC0275o2;
    }

    @Override
    public void mo1715a() {
        this.f594a.mo1715a();
        this.f595b.mo1715a();
        this.f594a = null;
        this.f595b = null;
    }

    @Override
    public boolean mo1716a(Interfaceg interfaceC0267g) {
        return this.f594a.mo1716a(interfaceC0267g) || this.f595b.mo1716a(interfaceC0267g);
    }

    @Override
    public boolean mo1717a(Interfaceg interfaceC0267g, Interfaceg interfaceC0267g2) {
        return this.f594a.mo1717a(interfaceC0267g, interfaceC0267g2) || this.f595b.mo1717a(interfaceC0267g, interfaceC0267g2);
    }

    @Override
    public OutputStream mo1718b(Interfaceg interfaceC0267g) {
        OutputStream outputStreamMo1718b = this.f594a.mo1718b(interfaceC0267g);
        return outputStreamMo1718b != null ? outputStreamMo1718b : this.f595b.mo1718b(interfaceC0267g);
    }
}
