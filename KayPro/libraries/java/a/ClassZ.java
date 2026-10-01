package a;

import a.aa;
import java.util.List;
import a.b.f.ClassI;
import a.b.f.ClassZ;

public class ClassZ {

    private final ClassZ f1380a;

    public ClassZ(ClassZ c0094z) {
        this.f1380a = c0094z;
    }

    public void m3283a(List list) {
        if (list == null) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return;
            }
            aa aaVar = (aa) list.get(i2);
            if (!aaVar.k && ((aaVar.i == null || aaVar.i.size() == 0) && (aaVar.j == null || aaVar.j.size() == 0))) {
                String str = aaVar.e;
                if (str == null) {
                    str = aaVar.g;
                }
                if (str == null || this.f1380a.m943a(str)) {
                    this.f1380a.m941a(str, "Note: the configuration doesn't specify which class members to keep for class '" + (str == null ? "*" : ClassI.m764c(str)) + "'");
                }
            }
            i = i2 + 1;
        }
    }
}
