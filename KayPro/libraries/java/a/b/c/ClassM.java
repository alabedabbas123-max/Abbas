package a.b.c;

import a.b.a.a;
import a.b.a.b;
import a.b.a.d.j;
import a.b.c;
import a.b.c.ae;
import a.b.k;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttBootstrapMethods;

public class ClassM implements j {

    private final k f71a;

    private final ae f72b;

    private ClassK f73c;

    public ClassM(k kVar) {
        this.f71a = kVar;
        this.f72b = new ae(kVar);
    }

    public int m157a() {
        return this.f73c.m151a();
    }

    public void m158a(c cVar, b bVar) {
        if (this.f73c == null) {
            ClassJ c0024j = new ClassJ(this.f71a, false);
            a.b.a.c cVarM148a = c0024j.m148a(AttBootstrapMethods.ATTRIBUTE_NAME);
            if (cVarM148a == null) {
                cVarM148a = new a.b.a.c(this.f72b.c(AttBootstrapMethods.ATTRIBUTE_NAME), 0, new b[0]);
                c0024j.m149a((a) cVarM148a);
            }
            this.f73c = new ClassK(this.f71a, cVarM148a);
        }
        this.f73c.m152a(cVar, bVar);
    }
}
