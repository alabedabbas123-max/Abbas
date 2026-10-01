package a;

import a.b.b.a.f;
import a.b.b.b;
import a.b.b.l;
import a.b.c;
import a.b.f.w;
import a.b.f.ClassI;
import a.b.f.ClassZ;

public class ClassW extends w implements f {

    private final ClassZ f1376a;

    public ClassW(ClassZ c0094z) {
        this.f1376a = c0094z;
    }

    public void m3273a(c cVar, b bVar) {
    }

    public void m3274a(c cVar, l lVar) {
        String strA = lVar.a(cVar);
        if (strA.equals("java/lang/Class") || strA.equals("java/lang/reflect/Field") || strA.equals("java/lang/reflect/Method")) {
            String strB = lVar.b(cVar);
            if (strB.startsWith("getType") || strB.startsWith("getGeneric")) {
                this.f1376a.m941a(cVar.b(), "Note: " + ClassI.m764c(cVar.b()) + " calls '" + ClassI.m769e(ClassI.m764c(strA)) + "." + strB + "'");
            }
        }
    }
}
