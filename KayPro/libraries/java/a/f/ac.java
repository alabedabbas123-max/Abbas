package a.f;

public class ac implements Interfacet {

    private final Interfacet f684a;

    public ac(Interfacet interfaceC0310t) {
        this.f684a = interfaceC0310t;
    }

    static boolean m1783a(String str) {
        return str != null && str.charAt(str.length() + (-1)) == '_';
    }

    @Override
    public void mo1777a() {
        this.f684a.mo1777a();
    }

    @Override
    public String mo1778b() {
        return this.f684a.mo1778b() + '_';
    }
}
