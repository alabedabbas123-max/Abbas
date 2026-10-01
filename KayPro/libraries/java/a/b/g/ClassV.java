package a.b.g;

import a.b.b.a.f;
import a.b.b.b;
import a.b.b.h;
import a.b.c;
import a.b.f.w;
import a.b.g.s;
import a.b.f.ClassI;

public class ClassV extends w implements f {

    protected final s f420a;

    public ClassV(s sVar) {
        this.f420a = sVar;
    }

    public void m1258a(c cVar, b bVar) {
    }

    public void m1259a(c cVar, h hVar) {
        c cVar2;
        c[] cVarArr = hVar.c;
        if (cVarArr == null || cVarArr.length <= 0 || !ClassI.m784j(ClassI.m796s(hVar.b(cVar))) || (cVar2 = cVarArr[cVarArr.length - 1]) == null) {
            return;
        }
        cVar2.a(this.f420a);
    }
}
