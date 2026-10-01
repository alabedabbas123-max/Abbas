package a.b.f;

import a.b.b;
import a.b.b.a.f;
import a.b.b.r;
import a.b.c;
import a.b.f.w;

public class ClassX extends w implements f {

    private final b f307a;

    private final b f308b;

    public ClassX(b bVar, b bVar2) {
        this.f307a = bVar;
        this.f308b = bVar2;
    }

    private c m927a(String str) {
        c cVarA = this.f307a.a(str);
        return cVarA == null ? this.f308b.a(str) : cVarA;
    }

    public void m928a(c cVar, a.b.b.b bVar) {
    }

    public void m929a(c cVar, r rVar) {
        if (rVar.b == null) {
            rVar.b = m927a(ClassI.m760b(ClassI.m767d(rVar.a(cVar))));
        }
    }
}
