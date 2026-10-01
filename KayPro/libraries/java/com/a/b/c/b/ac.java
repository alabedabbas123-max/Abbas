package com.a.b.c.b;

import com.a.b.e.b.ad;
import com.a.b.g.ClassJ;

public final class ac extends ClassJ {

    public static final ac f2025a = new ac(0);

    public ac(int i) {
        super(i);
    }

    public static ac m4279a(ClassM c1045m, int i) {
        switch (i) {
            case 1:
                return f2025a;
            case 2:
            case 3:
                ad c1170ad = ad.f3049a;
                int iD_ = c1045m.m5476d_();
                ad[] c1022adArr = new ad[iD_];
                int i2 = 0;
                boolean z = false;
                ad c1170ad2 = c1170ad;
                for (int i3 = 0; i3 < iD_; i3++) {
                    Abstractl abstractC1044lM4387a = c1045m.m4387a(i3);
                    if (abstractC1044lM4387a instanceof ClassH) {
                        z = true;
                    } else {
                        ad c1170adM4380k = abstractC1044lM4387a.m4380k();
                        if (!c1170adM4380k.equals(c1170ad) && !c1170adM4380k.m4800a(c1170ad2) && (i != 3 || z)) {
                            c1022adArr[i2] = new ad(abstractC1044lM4387a.m4378i(), c1170adM4380k);
                            i2++;
                            z = false;
                            c1170ad2 = c1170adM4380k;
                        }
                    }
                }
                ac c1021ac = new ac(i2);
                for (int i4 = 0; i4 < i2; i4++) {
                    c1021ac.m4281a(i4, c1022adArr[i4]);
                }
                c1021ac.mo3944c_();
                return c1021ac;
            default:
                throw new IllegalArgumentException("bogus howMuch");
        }
    }

    public ad m4280a(int i) {
        return (ad) m5477e(i);
    }

    public void m4281a(int i, ad c1022ad) {
        m5474a(i, (Object) c1022ad);
    }
}
