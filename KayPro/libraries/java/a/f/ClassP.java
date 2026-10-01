package a.f;

import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.o;
import java.util.HashMap;
import java.util.Map;
import a.b.Abstractg;
import a.b.Interfacei;
import a.b.f.ClassI;
import a.b.f.ClassU;

public class ClassP extends w implements aq {

    private final boolean f720a;

    private final Interfacet f721b;

    private final Map f722c;

    public ClassP(boolean z, Interfacet interfaceC0310t, Map map) {
        this.f720a = z;
        this.f721b = interfaceC0310t;
        this.f722c = map;
    }

    static Map m1847a(Map map, String str) {
        Map map2 = (Map) map.get(str);
        if (map2 != null) {
            return map2;
        }
        HashMap map3 = new HashMap();
        map.put(str, map3);
        return map3;
    }

    static void m1848a(Interfacei interfaceC0161i, String str) {
        o oVarM908a = ClassU.m908a((o) interfaceC0161i);
        if ((oVarM908a instanceof Abstractg) || (oVarM908a instanceof ClassQ)) {
            oVarM908a.a(str);
        } else {
            oVarM908a.a(new ClassQ(str));
        }
    }

    static boolean m1849a(Interfacei interfaceC0161i) {
        o oVarM908a = ClassU.m908a((o) interfaceC0161i);
        return (oVarM908a instanceof Abstractg) || (oVarM908a instanceof ClassQ);
    }

    static String m1850b(Interfacei interfaceC0161i) {
        return (String) ClassU.m908a((o) interfaceC0161i).f();
    }

    static void m1851b(Interfacei interfaceC0161i, String str) {
        ClassU.m908a((o) interfaceC0161i).a(str);
    }

    public void m1852a(c cVar, Interfacei interfaceC0161i) {
        String strMo1778b;
        String strMo946a = interfaceC0161i.mo946a(cVar);
        if (ClassI.m795r(strMo946a)) {
            return;
        }
        String strMo949b = interfaceC0161i.mo949b(cVar);
        if (!this.f720a) {
            strMo949b = strMo949b.substring(0, strMo949b.indexOf(41) + 1);
        }
        Map mapM1847a = m1847a(this.f722c, strMo949b);
        if (m1850b(interfaceC0161i) == null) {
            this.f721b.mo1777a();
            do {
                strMo1778b = this.f721b.mo1778b();
            } while (mapM1847a.containsKey(strMo1778b));
            mapM1847a.put(strMo1778b, strMo946a);
            m1851b(interfaceC0161i, strMo1778b);
        }
    }
}
