package a.b.c;

import a.b.a.a;
import a.b.a.d;
import a.b.c.ab;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttCode;
import a.b.ClassN;

class bn extends ab {

    final bm f21a;

    private final ClassN f22b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(bm c0007bm, ClassN c0165n, int i) {
        super(c0007bm.f15a);
        this.f21a = c0007bm;
        this.f22b = c0165n;
        a(i);
    }

    public void m51j() {
        a();
        a dVar = new d(this.f21a.f17c.c(AttCode.ATTRIBUTE_NAME));
        a(this.f21a.f15a, this.f22b, dVar);
        new ClassJ(this.f21a.f15a, this.f22b, false).m149a(dVar);
        this.f21a.f16b.m188a(this.f22b);
    }
}
