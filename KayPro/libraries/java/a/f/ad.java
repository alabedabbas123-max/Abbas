package a.f;

import a.b.c;

public class ad implements Interfacet {

    private final Interfacet f685a;

    private final c f686b;

    public ad(Interfacet interfaceC0310t, c cVar) {
        this.f685a = interfaceC0310t;
        this.f686b = cVar;
    }

    public static ad m1784a(c cVar) {
        return new ad(new ClassY(new aa(), "$$"), cVar);
    }

    @Override
    public void mo1777a() {
        this.f685a.mo1777a();
    }

    @Override
    public String mo1778b() {
        while (true) {
            String strMo1778b = this.f685a.mo1778b();
            if (this.f686b.a(strMo1778b, (String) null) == null && this.f686b.b(strMo1778b, (String) null) == null) {
                return strMo1778b;
            }
        }
    }
}
