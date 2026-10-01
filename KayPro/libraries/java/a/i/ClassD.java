package a.i;

import a.b.a.a;
import a.b.a.d.i;
import a.b.a.u;
import a.b.c;
import a.b.f.w;
import a.b.k;
import a.b.o;
import a.b.f.ClassJ;

class ClassD extends w implements i {

    final ClassB f1279a;

    private ClassD(ClassB c0474b) {
        this.f1279a = c0474b;
    }

    public void m2977a(c cVar, a aVar) {
    }

    public void m2978a(c cVar, u uVar) {
        o[] oVarArr = uVar.d;
        if (oVarArr != null) {
            ClassJ c0079j = new ClassJ(uVar.b(cVar));
            int i = 0;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(c0079j.m807c());
            while (c0079j.m806b()) {
                String strM808d = c0079j.m808d();
                o oVar = oVarArr[i];
                if (oVar != null && !this.f1279a.f1274a.mo3074c(oVar)) {
                    strM808d = "java/lang/Object";
                    oVarArr[i] = null;
                } else if (c0079j.m809e()) {
                    strM808d = strM808d.substring(strM808d.lastIndexOf(36) + 1);
                }
                i++;
                stringBuffer.append(strM808d);
                stringBuffer.append(c0079j.m807c());
            }
            ((k) cVar).c[uVar.c].a(stringBuffer.toString());
        }
    }
}
