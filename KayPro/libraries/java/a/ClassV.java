package a;

import a.b.b.a.f;
import a.b.b.b;
import a.b.b.l;
import a.b.c;
import a.b.f.w;
import a.b.f.ClassI;
import a.b.f.ClassZ;

public class ClassV extends w implements f {

    private final ClassZ f1375a;

    public ClassV(ClassZ c0094z) {
        this.f1375a = c0094z;
    }

    public void m3271a(c cVar, b bVar) {
    }

    public void m3272a(c cVar, l lVar) {
        String strA = lVar.a(cVar);
        if (strA.equals("java/lang/Class")) {
            String strB = lVar.b(cVar);
            if (strB.equals("getEnclosingConstructor") || strB.equals("getEnclosingMethod")) {
                this.f1375a.m941a(cVar.b(), "Note: " + ClassI.m764c(cVar.b()) + " calls '" + ClassI.m769e(ClassI.m764c(strA)) + "." + strB + "'");
            }
        }
    }
}
