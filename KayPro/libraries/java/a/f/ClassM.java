package a.f;

import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import java.util.Map;
import a.b.Interfacei;
import a.b.f.ClassI;

public class ClassM extends w implements aq {

    private final boolean f713a;

    private final Map f714b;

    public ClassM(boolean z, Map map) {
        this.f713a = z;
        this.f714b = map;
    }

    public void m1834a(c cVar, Interfacei interfaceC0161i) {
        String strM1850b;
        String strMo946a = interfaceC0161i.mo946a(cVar);
        if (ClassI.m795r(strMo946a) || (strM1850b = ClassP.m1850b(interfaceC0161i)) == null) {
            return;
        }
        String strMo949b = interfaceC0161i.mo949b(cVar);
        if (!this.f713a) {
            strMo949b = strMo949b.substring(0, strMo949b.indexOf(41) + 1);
        }
        Map mapM1847a = ClassP.m1847a(this.f714b, strMo949b);
        String str = (String) mapM1847a.get(strM1850b);
        if (str == null || ClassP.m1849a(interfaceC0161i) || strMo946a.compareTo(str) < 0) {
            mapM1847a.put(strM1850b, strMo946a);
        }
    }
}
