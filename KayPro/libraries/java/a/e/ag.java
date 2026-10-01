package a.e;

public class ag implements Interfacem {

    private final String f601a;

    private final Interfacem f602b;

    public ag(String str, Interfacem interfaceC0273m) {
        this.f601a = str;
        this.f602b = interfaceC0273m;
    }

    @Override
    public void mo1720a(Interfaceg interfaceC0267g) {
        String strMo1721a = interfaceC0267g.mo1721a();
        if (strMo1721a.startsWith(this.f601a)) {
            interfaceC0267g = new ah(interfaceC0267g, strMo1721a.substring(this.f601a.length()));
        }
        this.f602b.mo1720a(interfaceC0267g);
    }
}
