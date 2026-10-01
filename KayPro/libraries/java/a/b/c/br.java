package a.b.c;

import a.b.a.a.a;
import a.b.a.a.b.h;
import a.b.a.a.c;
import a.b.a.a.d;
import a.b.a.a.q;
import a.b.a.a.s;
import a.b.c.ad;
import a.b.c.ai;
import a.b.f.w;
import a.b.k;

public class br extends w implements h {

    private static final a.b.a.a.h[] f27a = new a.b.a.a.h[0];

    private final k f28b;

    private final c f29c = null;

    private final ClassG f30d;

    private final ad f31e;

    public br(k kVar, d dVar) {
        this.f28b = kVar;
        this.f30d = new ClassG(dVar);
        this.f31e = new ad(kVar);
    }

    public void m66a(a.b.c cVar, q qVar) {
        s[] sVarArr = qVar.g;
        s[] sVarArr2 = new s[sVarArr.length];
        a qVar2 = new q(this.f31e.a(cVar, qVar.a), 0, qVar.b > 0 ? new a.b.a.a.h[qVar.b] : f27a, (a.b.a.a.a.h) null, sVarArr2);
        ((q) qVar2).d = qVar.d;
        qVar.a(cVar, new ai(this.f28b, qVar2, false));
        qVar.f.a(cVar, qVar, new bq(this.f28b, qVar2));
        for (int i = 0; i < sVarArr.length; i++) {
            s sVar = sVarArr[i];
            sVarArr2[i] = new s(sVar.a, sVar.b);
        }
        if (this.f29c != null) {
            this.f29c.a = qVar2;
        } else {
            this.f30d.m114a(qVar2);
        }
    }
}
