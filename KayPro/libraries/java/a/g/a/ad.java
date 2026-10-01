package a.g.a;

import a.b.a.d.i;
import a.b.b.a;
import a.b.b.b;
import a.b.b.l;
import a.b.b.n;
import a.b.b.r;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import com.blankj.utilcode.constant.MemoryConstants;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.c.ClassR;
import a.b.c.ClassV;
import a.b.d.Abstractc;
import a.b.d.ClassB;
import a.b.d.ClassH;
import a.g.c.ClassP;

public class ad extends w implements i, d, s {

    private static final b[] f751a = {new r(MemoryConstants.f4579GB, (c) null, (Interfacei) null), new l(3, 4, (c) null, (Interfacei) null), new a.b.b.d(3, 5, (c) null, (Interfacei) null), new a(1073741827, (c) null), new n(6, 7), new n(1073741826, 1073741828), new a.b.b.s("<init>"), new a.b.b.s("(Ljava/lang/String;I)V")};

    private static final Abstractc[][][] f752b = {new Abstractc[][]{new Abstractc[]{new ClassB((byte) -69, 3), new ClassH((byte) 89), new ClassB((byte) 18, 0), new ClassH((byte) 3, 1073741825), new ClassB((byte) -73, 1)}, new Abstractc[]{new ClassH((byte) 17, 1073741825), new ClassH((byte) 4), new ClassH((byte) 96)}}, new Abstractc[][]{new Abstractc[]{new ClassH((byte) 3, 1073741825), new ClassB((byte) -73, 1)}, new Abstractc[]{new ClassH((byte) 3), new ClassB((byte) -73, 1), new ClassH((byte) 87), new ClassH((byte) 17, 1073741825), new ClassH((byte) 4), new ClassH((byte) 96)}}};

    private final ClassV f753c = new ClassV(true, true);

    private final ClassP f754d = new ClassP(f751a, f752b, null, this.f753c);

    private final aq f755e = new a.b.a.d.a(this);

    public void m1918a(c cVar, a.b.a.a aVar) {
    }

    public void m1919a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        this.f753c.m277a(dVar.e);
        dVar.a(cVar, interfaceC0162j, this.f754d);
        this.f753c.m284a(cVar, interfaceC0162j, dVar);
    }

    public void m1920a(k kVar) {
        kVar.d &= -16385;
        Interfacej interfaceC0162jB = kVar.b("valueOf", (String) null);
        if (interfaceC0162jB != null) {
            new ClassR(kVar).m190b(interfaceC0162jB);
        }
        kVar.a("<clinit>", "()V", this.f755e);
    }
}
