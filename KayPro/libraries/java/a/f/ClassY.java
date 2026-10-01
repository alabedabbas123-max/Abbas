package a.f;

public class ClassY implements Interfacet {

    private final Interfacet f729a;

    private final String f730b;

    public ClassY(Interfacet interfaceC0310t, String str) {
        this.f729a = interfaceC0310t;
        this.f730b = str;
    }

    @Override
    public void mo1777a() {
        this.f729a.mo1777a();
    }

    @Override
    public String mo1778b() {
        return this.f730b + this.f729a.mo1778b();
    }
}
