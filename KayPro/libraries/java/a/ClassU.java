package a;

import a.b.b.a.f;
import a.b.b.b;
import a.b.b.l;
import a.b.c;
import a.b.f.w;
import a.b.f.ClassI;
import a.b.f.ClassZ;

public class ClassU extends w implements f {

    private final ClassZ f1374a;

    public ClassU(ClassZ c0094z) {
        this.f1374a = c0094z;
    }

    public void m3269a(c cVar, b bVar) {
    }

    public void m3270a(c cVar, l lVar) {
        String strA = lVar.a(cVar);
        if (strA.equals("java/lang/Class")) {
            String strB = lVar.b(cVar);
            if (strB.equals("getEnclosingClass") || strB.equals("getDeclaringClass")) {
                this.f1374a.m941a(cVar.b(), "Note: " + ClassI.m764c(cVar.b()) + " calls '" + ClassI.m769e(ClassI.m764c(strA)) + "." + strB + "'");
            }
        }
    }
}
