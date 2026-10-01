package a.f;

import a.b.c;
import a.b.g.aq;
import a.b.k;
import java.util.Map;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfacei;
import a.b.f.ClassI;
import a.b.f.ClassZ;

public class ClassN implements aq {

    private final boolean f715a;

    private final Map f716b;

    private final ClassZ f717c;

    private final ClassP f718d;

    public ClassN(boolean z, Map map, ClassZ c0094z, ClassP c0306p) {
        this.f715a = z;
        this.f716b = map;
        this.f717c = c0094z;
        this.f718d = c0306p;
    }

    private void m1835a(c cVar, Interfacei interfaceC0161i, boolean z) {
        String strMo946a = interfaceC0161i.mo946a(cVar);
        String strMo949b = interfaceC0161i.mo949b(cVar);
        if (!this.f715a) {
            strMo949b = strMo949b.substring(0, strMo949b.indexOf(41) + 1);
        }
        Map mapM1847a = ClassP.m1847a(this.f716b, strMo949b);
        String strM1850b = ClassP.m1850b(interfaceC0161i);
        String str = (String) mapM1847a.get(strM1850b);
        if (str == null || strMo946a.equals(str)) {
            return;
        }
        if (ClassP.m1849a(interfaceC0161i) && this.f717c != null) {
            String strMo949b2 = interfaceC0161i.mo949b(cVar);
            this.f717c.m941a(cVar.b(), "Warning: " + ClassI.m764c(cVar.b()) + (z ? ": field '" + ClassI.m749a(0, strMo946a, strMo949b2) : ": method '" + ClassI.m751a(cVar.b(), 0, strMo946a, strMo949b2)) + "' can't be mapped to '" + strM1850b + "' because it would conflict with " + (z ? "field '" : "method '") + str + "', which is already being mapped to '" + strM1850b + "'");
        }
        ClassP.m1851b(interfaceC0161i, null);
        interfaceC0161i.mo947a(cVar, this.f718d);
    }

    public void m1836a(ClassE c0057e, ClassF c0069f) {
    }

    public void m1837a(ClassE c0057e, ClassH c0160h) {
    }

    public void m1838a(k kVar, ClassL c0163l) {
        m1835a(kVar, c0163l, true);
    }

    public void m1839a(k kVar, ClassN c0165n) {
        if (ClassI.m795r(c0165n.mo946a((c) kVar))) {
            return;
        }
        m1835a(kVar, c0165n, false);
    }
}
