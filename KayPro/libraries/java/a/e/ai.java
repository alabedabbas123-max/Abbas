package a.e;

import java.util.Map;

public class ai implements Interfacem {

    private final Map f604a;

    private final Interfacem f605b;

    private final Interfacem f606c;

    public ai(Map map, Interfacem interfaceC0273m, Interfacem interfaceC0273m2) {
        this.f604a = map;
        this.f605b = interfaceC0273m;
        this.f606c = interfaceC0273m2;
    }

    @Override
    public void mo1720a(Interfaceg interfaceC0267g) {
        String strMo1721a = interfaceC0267g.mo1721a();
        if (interfaceC0267g.mo1723b() && strMo1721a.length() > 0) {
            strMo1721a = strMo1721a + '/';
        }
        String strSubstring = (String) this.f604a.get(strMo1721a);
        if (strSubstring == null) {
            if (this.f606c != null) {
                this.f606c.mo1720a(interfaceC0267g);
            }
        } else {
            if (interfaceC0267g.mo1723b() && strSubstring.length() > 0) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            }
            this.f605b.mo1720a(new ah(interfaceC0267g, strSubstring));
        }
    }
}
