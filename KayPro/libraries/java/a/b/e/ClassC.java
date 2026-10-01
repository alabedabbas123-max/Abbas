package a.b.e;

import a.b.a.a;
import a.b.a.d;
import a.b.a.d.i;
import a.b.b.a.f;
import a.b.b.b;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import a.b.Abstractg;
import a.b.ClassE;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfacej;
import a.b.f.ClassI;

public class ClassC extends w implements i, f, aq, s {

    private ClassK f175a;

    private final ClassF f176b;

    private final ClassE f177c;

    private final ClassH f178d;

    private final ClassI f179e;

    private final ClassG f180f;

    public ClassC(DataOutput dataOutput) {
        C0061d c0061d = null;
        this.f176b = new ClassF(this);
        this.f177c = new ClassE(this);
        this.f178d = new ClassH(this);
        this.f179e = new ClassI(this);
        this.f180f = new ClassG(this);
        this.f175a = new ClassK(dataOutput);
    }

    public void m557a(c cVar, a aVar) {
        this.f175a.m674d(aVar.a);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ClassK c0068k = this.f175a;
        this.f175a = new ClassK(new DataOutputStream(byteArrayOutputStream));
        aVar.a(cVar, (Interfacej) null, (d) null, this.f177c);
        this.f175a = c0068k;
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f175a.m673c(byteArray.length);
        this.f175a.m670a(byteArray);
    }

    public void m558a(c cVar, b bVar) {
        this.f175a.m667a(bVar.a());
        bVar.a(cVar, this.f176b);
    }

    public void m559a(ClassE c0057e) {
    }

    public void m560a(ClassE c0057e, Abstractg abstractC0095g) {
    }

    public void m561a(k kVar) {
        this.f175a.m673c(-889275714);
        this.f175a.m675e(ClassI.m761c(kVar.a));
        this.f175a.m675e(ClassI.m756b(kVar.a));
        this.f175a.m674d(kVar.b);
        kVar.a(this);
        this.f175a.m674d(kVar.d & 65535);
        this.f175a.m674d(kVar.e);
        this.f175a.m674d(kVar.f);
        this.f175a.m674d(kVar.g);
        for (int i = 0; i < kVar.g; i++) {
            this.f175a.m674d(kVar.h[i]);
        }
        this.f175a.m674d(kVar.i);
        kVar.a(this);
        this.f175a.m674d(kVar.k);
        kVar.b(this);
        this.f175a.m674d(kVar.m);
        kVar.a(this);
    }

    public void m562a(k kVar, ClassL c0163l) {
        this.f175a.m674d(c0163l.f430b & 65535);
        this.f175a.m674d(c0163l.f431c);
        this.f175a.m674d(c0163l.f432d);
        this.f175a.m674d(c0163l.f433e);
        c0163l.mo1267a(kVar, (i) this);
    }

    public void m563a(k kVar, ClassN c0165n) {
        this.f175a.m674d(c0165n.f430b & 65535);
        this.f175a.m674d(c0165n.f431c);
        this.f175a.m674d(c0165n.f432d);
        this.f175a.m674d(c0165n.f433e);
        c0165n.mo1267a(kVar, (i) this);
    }
}
