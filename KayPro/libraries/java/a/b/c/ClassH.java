package a.b.c;

import a.b.a.a;
import a.b.a.a.b;
import a.b.a.a.j;
import a.b.a.a.m;
import a.b.a.a.n;
import a.b.a.a.o;
import a.b.a.a.p;
import a.b.a.a.q;
import a.b.a.d;
import a.b.a.d.i;
import a.b.a.e;
import a.b.a.f;
import a.b.a.g;
import a.b.a.h;
import a.b.a.l;
import a.b.a.r;
import a.b.a.s;
import a.b.a.t;
import a.b.a.u;
import a.b.a.v;
import a.b.a.x;
import a.b.a.y;
import a.b.c;
import a.b.c.ad;
import a.b.c.ai;
import a.b.c.ak;
import a.b.c.al;
import a.b.c.aq;
import a.b.c.ay;
import a.b.c.bb;
import a.b.c.bd;
import a.b.f.w;
import a.b.k;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLineNumberTable;
import java.util.Arrays;
import org.apache.commons.io.FilenameUtils;
import a.b.Abstractm;
import a.b.Interfaced;
import a.b.Interfacej;

public class ClassH extends w implements i {

    private static final byte[] f51a = new byte[0];

    private static final int[] f52b = new int[0];

    private static final a[] f53c = new a[0];

    private static final h[] f54d = new h[0];

    private static final a.b.a.a.a[] f55e = new a.b.a.a.a[0];

    private final k f56f;

    private final Abstractm f57g;

    private final d f58h;

    private final boolean f59i;

    private final ad f60j;

    private final ClassJ f61k;

    public ClassH(k kVar, Abstractm abstractC0164m, d dVar, boolean z) {
        this.f56f = kVar;
        this.f57g = abstractC0164m;
        this.f58h = dVar;
        this.f59i = z;
        this.f60j = new ad(kVar);
        this.f61k = new ClassJ(kVar, abstractC0164m, dVar, z);
    }

    public ClassH(k kVar, Abstractm abstractC0164m, boolean z) {
        this(kVar, abstractC0164m, null, z);
    }

    public ClassH(k kVar, boolean z) {
        this(kVar, null, null, z);
    }

    public void m115a(c cVar, a.b.a.a.k kVar) {
        a kVar2 = new a.b.a.a.k(this.f60j.a(cVar, kVar.a), 0, new a.b.a.a.a[kVar.c]);
        kVar.a(cVar, new ClassF(this.f56f, (a.b.a.a.d) kVar2));
        this.f61k.m149a(kVar2);
    }

    public void m116a(c cVar, m mVar) {
        a mVar2 = new m(this.f60j.a(cVar, mVar.a), 0, new q[mVar.c]);
        mVar.a(cVar, new br(this.f56f, mVar2));
        this.f61k.m149a(mVar2);
    }

    public void m117a(c cVar, n nVar) {
        a nVar2 = new n(this.f60j.a(cVar, nVar.a), 0, new a.b.a.a.a[nVar.c]);
        nVar.a(cVar, new ClassF(this.f56f, (a.b.a.a.d) nVar2));
        this.f61k.m149a(nVar2);
    }

    public void m118a(c cVar, p pVar) {
        a pVar2 = new p(this.f60j.a(cVar, pVar.a), 0, new q[pVar.c]);
        pVar.a(cVar, new br(this.f56f, pVar2));
        this.f61k.m149a(pVar2);
    }

    public void m119a(c cVar, f fVar) {
        this.f61k.m149a(new f(this.f60j.a(cVar, fVar.a)));
    }

    public void m120a(c cVar, g gVar) {
        a gVar2 = new g(this.f60j.a(cVar, gVar.a), this.f60j.a(cVar, gVar.c), gVar.d == 0 ? 0 : this.f60j.a(cVar, gVar.d));
        ((g) gVar2).e = gVar.e;
        ((g) gVar2).f = gVar.f;
        this.f61k.m149a(gVar2);
    }

    public void m121a(c cVar, a.b.a.k kVar) {
        this.f61k.m149a(new a.b.a.k(this.f60j.a(cVar, kVar.a), 0, (l[]) null));
    }

    public void m122a(c cVar, u uVar) {
        a uVar2 = new u(this.f60j.a(cVar, uVar.a), this.f60j.a(cVar, uVar.c));
        ((u) uVar2).d = uVar.d;
        this.f61k.m149a(uVar2);
    }

    public void m123a(c cVar, v vVar) {
        this.f61k.m149a(new v(this.f60j.a(cVar, vVar.a), this.f60j.a(cVar, vVar.c)));
    }

    public void m124a(c cVar, a.b.a.w wVar) {
        this.f61k.m149a(new a.b.a.w(this.f60j.a(cVar, wVar.a), this.f60j.a(cVar, wVar.c)));
    }

    public void m125a(c cVar, x xVar) {
        this.f61k.m149a(new x(this.f60j.a(cVar, xVar.a)));
    }

    public void m126a(c cVar, y yVar) {
        this.f61k.m149a(new y(this.f60j.a(cVar, yVar.a), yVar.c, yVar.d));
    }

    public void m127a(c cVar, Interfaced interfaceC0041d, e eVar) {
        this.f61k.m149a(new e(this.f60j.a(cVar, eVar.a), this.f60j.a(cVar, eVar.c)));
    }

    public void m128a(c cVar, Interfacej interfaceC0162j, b bVar) {
        a bVar2 = new b(this.f60j.a(cVar, bVar.a), (a.b.a.a.h) null);
        bVar.a(cVar, new ai(this.f56f, bVar2, false));
        this.f61k.m149a(bVar2);
    }

    public void m129a(c cVar, Interfacej interfaceC0162j, a.b.a.a.l lVar) {
        a.b.a.a.a[][] aVarArr = new a.b.a.a.a[lVar.c][];
        Arrays.fill(aVarArr, f55e);
        a lVar2 = new a.b.a.a.l(this.f60j.a(cVar, lVar.a), 0, new int[lVar.c], aVarArr);
        lVar.a(cVar, interfaceC0162j, new ClassF(this.f56f, (j) lVar2));
        this.f61k.m149a(lVar2);
    }

    public void m130a(c cVar, Interfacej interfaceC0162j, o oVar) {
        a.b.a.a.a[][] aVarArr = new a.b.a.a.a[oVar.c][];
        Arrays.fill(aVarArr, f55e);
        a oVar2 = new o(this.f60j.a(cVar, oVar.a), 0, new int[oVar.c], aVarArr);
        oVar.a(cVar, interfaceC0162j, new ClassF(this.f56f, (j) oVar2));
        this.f61k.m149a(oVar2);
    }

    public void m131a(c cVar, Interfacej interfaceC0162j, d dVar) {
        a dVar2 = new d(this.f60j.a(cVar, dVar.a), dVar.c, dVar.d, 0, f51a, 0, dVar.g > 0 ? new h[dVar.g] : f54d, 0, dVar.i > 0 ? new a[dVar.i] : f53c);
        ClassU c0035u = new ClassU();
        c0035u.m235a(dVar.e + 32);
        dVar.a(cVar, interfaceC0162j, new aq(this.f56f, c0035u));
        c0035u.m260b(dVar.e);
        dVar.a(cVar, interfaceC0162j, new al(this.f56f, c0035u));
        if (dVar.a(cVar, AttLineNumberTable.ATTRIBUTE_NAME) == null) {
            c0035u.m233a((a.b.a.m) new a.b.a.j(0, 0, cVar.b() + FilenameUtils.EXTENSION_SEPARATOR + interfaceC0162j.mo946a(cVar) + interfaceC0162j.mo949b(cVar) + ":0:0"));
        }
        c0035u.m259b();
        dVar.b(cVar, interfaceC0162j, new ClassH(this.f56f, this.f57g, dVar2, this.f59i));
        c0035u.m239a((c) this.f56f, (Interfacej) this.f57g, (d) dVar2);
        this.f61k.m149a(dVar2);
    }

    public void m132a(c cVar, Interfacej interfaceC0162j, d dVar, a.b.a.c.l lVar) {
    }

    public void m133a(c cVar, Interfacej interfaceC0162j, d dVar, a.b.a.c.n nVar) {
    }

    public void m134a(c cVar, Interfacej interfaceC0162j, d dVar, a.b.a.n nVar) {
        a nVar2 = new a.b.a.n(this.f60j.a(cVar, nVar.a), 0, new a.b.a.m[nVar.c]);
        nVar.a(cVar, interfaceC0162j, dVar, new ay(nVar2));
        this.f61k.m149a(nVar2);
    }

    public void m135a(c cVar, Interfacej interfaceC0162j, d dVar, a.b.a.p pVar) {
        a pVar2 = new a.b.a.p(this.f60j.a(cVar, pVar.a), 0, new a.b.a.o[pVar.c]);
        pVar.a(cVar, interfaceC0162j, dVar, new bb(this.f56f, pVar2));
        this.f61k.m149a(pVar2);
    }

    public void m136a(c cVar, Interfacej interfaceC0162j, d dVar, r rVar) {
        a rVar2 = new r(this.f60j.a(cVar, rVar.a), 0, new a.b.a.q[rVar.c]);
        rVar.a(cVar, interfaceC0162j, dVar, new bd(this.f56f, rVar2));
        this.f61k.m149a(rVar2);
    }

    public void m137a(c cVar, Interfacej interfaceC0162j, a.b.a.i iVar) {
        a iVar2 = new a.b.a.i(this.f60j.a(cVar, iVar.a), 0, iVar.c > 0 ? new int[iVar.c] : f52b);
        iVar.a((k) cVar, new ak(this.f56f, iVar2));
        this.f61k.m149a(iVar2);
    }

    public void m138a(c cVar, Interfacej interfaceC0162j, s sVar) {
        a sVar2 = new s(this.f60j.a(cVar, sVar.a), sVar.c, new t[sVar.c]);
        sVar.a(cVar, interfaceC0162j, new bl(this.f56f, sVar2));
        this.f61k.m149a(sVar2);
    }
}
