package a.e;

import java.io.OutputStream;

public class af implements Interfaceo {

    private final String f599a;

    private final Interfaceo f600b;

    public af(String str, Interfaceo interfaceC0275o) {
        this.f599a = str;
        this.f600b = interfaceC0275o;
    }

    private Interfaceg m1719c(Interfaceg interfaceC0267g) {
        return new ah(interfaceC0267g, this.f599a + interfaceC0267g.mo1721a());
    }

    @Override
    public void mo1715a() {
        this.f600b.mo1715a();
    }

    @Override
    public boolean mo1716a(Interfaceg interfaceC0267g) {
        return this.f600b.mo1716a(m1719c(interfaceC0267g));
    }

    @Override
    public boolean mo1717a(Interfaceg interfaceC0267g, Interfaceg interfaceC0267g2) {
        return this.f600b.mo1717a(m1719c(interfaceC0267g), m1719c(interfaceC0267g2));
    }

    @Override
    public OutputStream mo1718b(Interfaceg interfaceC0267g) {
        return this.f600b.mo1718b(m1719c(interfaceC0267g));
    }
}
