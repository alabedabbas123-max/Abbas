package a.e;

import java.io.OutputStream;

public class ae implements Interfaceo {

    private Interfaceo f598a;

    public ae(Interfaceo interfaceC0275o) {
        this.f598a = interfaceC0275o;
    }

    @Override
    public void mo1715a() {
        this.f598a.mo1715a();
        this.f598a = null;
    }

    @Override
    public boolean mo1716a(Interfaceg interfaceC0267g) {
        return this.f598a.mo1716a(interfaceC0267g.mo1726e());
    }

    @Override
    public boolean mo1717a(Interfaceg interfaceC0267g, Interfaceg interfaceC0267g2) {
        return this.f598a.mo1717a(interfaceC0267g.mo1726e(), interfaceC0267g2.mo1726e());
    }

    @Override
    public OutputStream mo1718b(Interfaceg interfaceC0267g) {
        return this.f598a.mo1718b(interfaceC0267g.mo1726e());
    }
}
