package a.g;

import a.b.a.a;
import a.b.a.d;
import a.b.a.d.i;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.Interfacej;
import a.b.c.bu;
import a.b.f.ClassI;
import a.g.b.ad;

public class ClassW extends w implements i {

    private final aq f1194a;

    private final bu f1195b;

    public ClassW() {
        this(null);
    }

    public ClassW(aq aqVar) {
        this.f1195b = new bu();
        this.f1194a = aqVar;
    }

    public void m2903a(c cVar, a aVar) {
    }

    public void m2904a(c cVar, Interfacej interfaceC0162j, d dVar) {
        int i;
        int iM2290a = ad.m2290a(interfaceC0162j);
        int iM762c = ClassI.m762c(interfaceC0162j.mo949b(cVar), interfaceC0162j.mo945a());
        if (iM2290a > iM762c) {
            int i2 = dVar.d;
            int[] iArr = new int[i2];
            int i3 = 0;
            int i4 = 0;
            int i5 = iM762c;
            while (i3 < iM2290a) {
                if (ad.m2294b(interfaceC0162j, i3)) {
                    i = i4 + 1;
                    iArr[i3] = i4;
                } else {
                    int i6 = i5 + 1;
                    iArr[i3] = i5;
                    if (this.f1194a != null) {
                        interfaceC0162j.mo947a(cVar, this.f1194a);
                    }
                    i5 = i6;
                    i = i4;
                }
                i3++;
                i4 = i;
            }
            for (int i7 = iM2290a; i7 < i2; i7++) {
                iArr[i7] = i7;
            }
            this.f1195b.m95a(iArr);
            this.f1195b.m85a(cVar, interfaceC0162j, dVar);
        }
    }
}
