package a;

import a.ae;
import a.b.b;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.k;
import a.f;
import java.util.List;
import a.b.ClassL;
import a.b.ClassN;
import a.b.f.ClassI;
import a.b.f.ClassZ;
import a.j.ClassL;

public class ClassC extends w implements aq {

    private final b f438a;

    private final ClassZ f439b;

    public ClassC(b bVar, ClassZ c0094z) {
        this.f438a = bVar;
        this.f439b = c0094z;
    }

    private void m1271a(c cVar, List list, boolean z) {
        if (list != null) {
            String strB = cVar.b();
            for (int i = 0; i < list.size(); i++) {
                ae aeVar = (ae) list.get(i);
                String str = aeVar.d;
                String str2 = aeVar.e;
                if (str != null && !m1272a(str) && str2 != null && !m1272a(str2)) {
                    if (z) {
                        if (cVar.a(str, str2) == null) {
                            this.f439b.m941a(strB, "Note: the configuration refers to the unknown field '" + ClassI.m749a(0, str, str2) + "' in class '" + ClassI.m764c(strB) + "'");
                        }
                    } else if (cVar.b(str, str2) == null) {
                        this.f439b.m941a(strB, "Note: the configuration refers to the unknown method '" + ClassI.m751a(strB, 0, str, str2) + "' in class '" + ClassI.m764c(strB) + "'");
                    }
                }
            }
        }
    }

    private static boolean m1272a(String str) {
        return str != null && (str.indexOf(33) >= 0 || str.indexOf(42) >= 0 || str.indexOf(63) >= 0 || str.indexOf(44) >= 0 || str.indexOf("///") >= 0);
    }

    public void m1273a(k kVar, ClassL c0163l) {
        ClassL.m3161a("      Maybe you meant the field '" + ClassI.m749a(0, c0163l.mo946a((c) kVar), c0163l.mo949b(kVar)) + "'?");
    }

    public void m1274a(k kVar, ClassN c0165n) {
        ClassL.m3161a("      Maybe you meant the method '" + ClassI.m751a(kVar.b(), 0, c0165n.mo946a((c) kVar), c0165n.mo949b(kVar)) + "'?");
    }

    public void m1275a(List list) {
        c cVarA;
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                f fVar = (f) list.get(i);
                String str = fVar.e;
                if (str != null && !m1272a(str) && this.f439b.m943a(str) && (cVarA = this.f438a.a(str)) != null) {
                    m1271a(cVarA, fVar.i, true);
                    m1271a(cVarA, fVar.j, false);
                }
            }
        }
    }
}
