package a.e;

import a.b.b;
import a.b.c;
import java.io.OutputStream;
import java.util.Map;
import a.b.f.ClassI;

public class aj implements Interfaceo {

    private final b f607a;

    private final Map f608b;

    private final Interfaceo f609c;

    public aj(b bVar, Map map, Interfaceo interfaceC0275o) {
        this.f607a = bVar;
        this.f608b = map;
        this.f609c = interfaceC0275o;
    }

    private Interfaceg m1722c(Interfaceg interfaceC0267g) {
        String strMo1721a = interfaceC0267g.mo1721a();
        for (int length = strMo1721a.length() - 1; length > 0; length--) {
            char cCharAt = strMo1721a.charAt(length);
            if (!Character.isLetterOrDigit(cCharAt)) {
                String strSubstring = strMo1721a.substring(0, length);
                if (cCharAt == '/') {
                    break;
                }
                c cVarA = this.f607a.a(strSubstring);
                if (cVarA != null) {
                    String strB = cVarA.b();
                    return !strSubstring.equals(strB) ? new ah(interfaceC0267g, strB + strMo1721a.substring(length)) : interfaceC0267g;
                }
            }
        }
        String str = strMo1721a;
        while (true) {
            String strM744C = ClassI.m744C(str);
            String str2 = (String) this.f608b.get(strM744C);
            if (str2 != null) {
                return !strM744C.equals(str2) ? new ah(interfaceC0267g, str2 + strMo1721a.substring(strM744C.length())) : interfaceC0267g;
            }
            if (strM744C.length() <= 0) {
                return interfaceC0267g;
            }
            str = strM744C;
        }
    }

    @Override
    public void mo1715a() {
        this.f609c.mo1715a();
    }

    @Override
    public boolean mo1716a(Interfaceg interfaceC0267g) {
        return this.f609c.mo1716a(m1722c(interfaceC0267g));
    }

    @Override
    public boolean mo1717a(Interfaceg interfaceC0267g, Interfaceg interfaceC0267g2) {
        return this.f609c.mo1717a(interfaceC0267g, interfaceC0267g2);
    }

    @Override
    public OutputStream mo1718b(Interfaceg interfaceC0267g) {
        return this.f609c.mo1718b(m1722c(interfaceC0267g));
    }
}
