package a.b.f;

import a.b.b;
import a.b.b.a;
import a.b.b.a.f;
import a.b.c;
import a.b.f.w;
import a.b.g.s;
import a.b.k;
import a.b.ClassE;

public class ClassH extends w implements f, s {

    private final b f215a;

    private final b f216b;

    private final ClassZ f217c;

    private final ClassZ f218d;

    public ClassH(b bVar, b bVar2) {
        this(bVar, bVar2, null, null);
    }

    public ClassH(b bVar, b bVar2, ClassZ c0094z, ClassZ c0094z2) {
        this.f215a = bVar;
        this.f216b = bVar2;
        this.f217c = c0094z;
        this.f218d = c0094z2;
    }

    private c m738a(String str, String str2) {
        c cVarA = this.f215a.a(str2);
        if (cVarA == null) {
            cVarA = this.f216b.a(str2);
            if (cVarA == null && this.f217c != null) {
                this.f217c.m942a(str, str2, "Warning: " + ClassI.m764c(str) + ": can't find superclass or interface " + ClassI.m764c(str2));
            }
        } else if (this.f218d != null) {
            this.f218d.m942a(str, str2, "Warning: library class " + ClassI.m764c(str) + " extends or implements program class " + ClassI.m764c(str2));
        }
        return cVarA;
    }

    public void m739a(c cVar, a aVar) {
        aVar.b = m738a(cVar.b(), aVar.a(cVar));
    }

    public void m740a(ClassE c0057e) {
        String strM415b = c0057e.m415b();
        String str = c0057e.f160c;
        if (str != null) {
            c0057e.f164g = m738a(strM415b, str);
        }
        if (c0057e.f161d != null) {
            String[] strArr = c0057e.f161d;
            c[] cVarArr = new c[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                cVarArr[i] = m738a(strM415b, strArr[i]);
            }
            c0057e.f165h = cVarArr;
        }
    }

    public void m741a(k kVar) {
        kVar.b(this);
        kVar.c(this);
    }
}
