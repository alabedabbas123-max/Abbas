package a;

import a.ae;
import a.f;
import java.util.List;
import a.b.f.ClassI;
import a.b.f.ClassZ;

public class ClassB {

    private final ClassZ f0a;

    public ClassB(ClassZ c0094z) {
        this.f0a = c0094z;
    }

    public void m0a(List list) {
        List list2;
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                f fVar = (f) list.get(i);
                String str = fVar.e;
                String str2 = str == null ? fVar.g : str;
                if ((str2 == null || this.f0a.m943a(str2)) && (list2 = fVar.j) != null) {
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        ae aeVar = (ae) list2.get(i2);
                        if (aeVar.d == null && aeVar.e == null) {
                            this.f0a.m941a(str2, "Note: the configuration specifies that none of the methods of class '" + (str2 == null ? "*" : ClassI.m764c(str2)) + "' have any side effects");
                        }
                    }
                }
            }
        }
    }
}
