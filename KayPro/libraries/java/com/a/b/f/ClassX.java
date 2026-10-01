package com.a.b.f;

import com.a.b.e.b.ClassO;
import com.a.b.e.b.ClassU;
import java.util.HashSet;
import java.util.List;

class ClassX implements Interfaceao {

    final ClassW f3463a;

    private final ClassU[] f3464b;

    private final HashSet f3465c;

    ClassX(ClassW c1299w, ClassU[] c1194uArr, HashSet hashSet) {
        this.f3463a = c1299w;
        this.f3464b = c1194uArr;
        this.f3465c = hashSet;
    }

    @Override
    public void mo5119a(ac c1257ac) {
    }

    @Override
    public void mo5120a(ClassZ c1302z) {
    }

    @Override
    public void mo5121b(ClassZ c1302z) {
        if (c1302z.mo5173e().m4737a() != 3) {
            return;
        }
        int iM5394a = this.f3463a.m5394a(c1302z);
        if (this.f3464b[iM5394a] == null) {
            this.f3464b[iM5394a] = c1302z.m5261o();
            return;
        }
        ClassU c1194u = this.f3464b[iM5394a];
        ClassU c1194uO = c1302z.m5261o();
        ClassO c1188oM4896i = c1194u.m4896i();
        ClassO c1188oM4896i2 = c1194uO.m4896i();
        if (c1188oM4896i != null) {
            if (c1188oM4896i2 != null && !c1188oM4896i.equals(c1188oM4896i2)) {
                return;
            } else {
                c1188oM4896i2 = c1188oM4896i;
            }
        }
        this.f3463a.f3462a.m5288c(c1194u.m4894g()).m5253a(c1188oM4896i2);
        ClassY c1301y = new ClassY(this, c1194uO, c1194u);
        List listM5290d = this.f3463a.f3462a.m5290d(c1194uO.m4894g());
        for (int size = listM5290d.size() - 1; size >= 0; size--) {
            ((Abstractan) listM5290d.get(size)).mo5168a(c1301y);
        }
        this.f3465c.add(c1302z);
    }
}
