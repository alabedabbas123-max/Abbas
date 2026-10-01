package a;

import a.ae;
import a.b.b;
import a.b.c;
import a.b.f.w;
import a.b.g.s;
import a.f;
import java.util.List;
import a.b.f.ClassI;
import a.b.f.ClassQ;
import a.b.f.ClassZ;
import a.b.g.ClassK;
import a.j.ClassL;

public class ClassR extends w implements s {

    private static final String f1369a = ClassI.m760b(".class");

    private final b f1370b;

    private final b f1371c;

    private final ClassZ f1372d;

    public ClassR(b bVar, b bVar2, ClassZ c0094z) {
        this.f1370b = bVar;
        this.f1371c = bVar2;
        this.f1372d = c0094z;
    }

    private void m3254a(String str) {
        if (str != null) {
            ClassQ c0086q = new ClassQ(str);
            m3256b(c0086q.m900f());
            while (c0086q.m898d()) {
                m3256b(c0086q.m899e());
            }
        }
    }

    private void m3255a(List list, boolean z) {
        if (list == null) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return;
            }
            ae aeVar = (ae) list.get(i2);
            m3256b(aeVar.c);
            if (z) {
                m3256b(aeVar.e);
            } else {
                m3254a(aeVar.e);
            }
            i = i2 + 1;
        }
    }

    private void m3256b(String str) {
        if (str != null) {
            m3257c(ClassI.m793p(str));
        }
    }

    private void m3257c(String str) {
        if (str != null && !m3258d(str) && this.f1370b.a(str) == null && this.f1371c.a(str) == null && this.f1372d.m943a(str)) {
            this.f1372d.m941a(str, "Note: the configuration refers to the unknown class '" + ClassI.m764c(str) + "'");
            int iLastIndexOf = str.lastIndexOf(47);
            ClassK c0145k = new ClassK(str.endsWith(f1369a) ? str.substring(0, iLastIndexOf) : "**/" + str.substring(iLastIndexOf + 1), this);
            this.f1370b.a(c0145k);
            this.f1371c.a(c0145k);
        }
    }

    private static boolean m3258d(String str) {
        return str != null && (str.indexOf(33) >= 0 || str.indexOf(42) >= 0 || str.indexOf(63) >= 0 || str.indexOf(44) >= 0 || str.indexOf("///") >= 0 || str.indexOf(60) >= 0);
    }

    public void m3259a(c cVar) {
        ClassL.m3161a("      Maybe you meant the fully qualified name '" + ClassI.m764c(cVar.b()) + "'?");
    }

    public void m3260a(List list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                f fVar = (f) list.get(i);
                m3256b(fVar.d);
                m3257c(fVar.e);
                m3256b(fVar.f);
                m3257c(fVar.g);
                m3255a(fVar.i, true);
                m3255a(fVar.j, false);
            }
        }
    }
}
