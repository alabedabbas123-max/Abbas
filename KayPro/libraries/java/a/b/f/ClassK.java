package a.b.f;

import a.b.a.d.i;
import a.b.b;
import a.b.b.a;
import a.b.b.a.f;
import a.b.b.l;
import a.b.b.n;
import a.b.b.r;
import a.b.b.s;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import com.blankj.utilcode.constant.MemoryConstants;
import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassA;
import a.b.d.ClassB;
import a.b.d.ClassH;
import a.b.d.ClassK;
import a.j.Abstractt;

public class ClassK extends w implements i, f, d {

    private final b f235k;

    private final b f236l;

    private final ClassZ f237m;

    private final ClassZ f238n;

    private final ClassZ f239o;

    private final Abstractt f240p;

    private boolean f248x;

    private final a.b.b.b[] f225a = {new l(1, 2, (c) null, (Interfacei) null), new a(3, (c) null), new n(4, 5), new s("java/lang/Class"), new s("forName"), new s("(Ljava/lang/String;)Ljava/lang/Class;"), new l(1, 7, (c) null, (Interfacei) null), new n(8, 9), new s("newInstance"), new s("()Ljava/lang/Object;"), new l(1, 11, (c) null, (Interfacei) null), new n(12, 13), new s("getComponentType"), new s("()Ljava/lang/Class;")};

    private final Abstractc[] f226b = {new ClassB((byte) 18, MemoryConstants.f4579GB), new ClassB((byte) -72, 0)};

    private final Abstractc[] f227c = {new ClassB((byte) -72, 0), new ClassB((byte) -74, 6), new ClassB((byte) -64, MemoryConstants.f4579GB)};

    private final a.b.b.b[] f228d = {new l(1073741827, 1, (c) null, (Interfacei) null), new n(1073741828, 2), new s("(Ljava/lang/String;)Ljava/lang/Class;")};

    private final Abstractc[] f229e = {new ClassB((byte) 18, MemoryConstants.f4579GB), new ClassB((byte) -72, 0)};

    private final a.b.b.b[] f230f = {new l(1073741827, 1, (c) null, (Interfacei) null), new n(1073741828, 2), new s("(Ljava/lang/String;Z)Ljava/lang/Class;")};

    private final Abstractc[] f231g = {new ClassB((byte) 18, MemoryConstants.f4579GB), new ClassH((byte) 3), new ClassB((byte) -72, 0)};

    private final Abstractc[] f232h = {new ClassK((byte) 42), new ClassB((byte) -72, 0), new ClassH((byte) -80)};

    private final Abstractc[] f233i = {new ClassK((byte) 42), new ClassB((byte) -72, 0), new ClassK((byte) 43), new ClassA((byte) -102, 6), new ClassB((byte) -74, 10), new ClassH((byte) -80)};

    private final Abstractc[] f234j = {new ClassK((byte) 42), new ClassB((byte) -72, 0), new ClassB((byte) -74, 10), new ClassH((byte) -80)};

    private final ClassP f241q = new ClassP(this.f225a, this.f226b);

    private final ClassP f242r = new ClassP(this.f225a, this.f227c);

    private final ClassP f243s = new ClassP(this.f228d, this.f229e);

    private final ClassP f244t = new ClassP(this.f230f, this.f231g);

    private final ClassP f245u = new ClassP(this.f225a, this.f232h);

    private final ClassP f246v = new ClassP(this.f225a, this.f233i);

    private final ClassP f247w = new ClassP(this.f225a, this.f234j);

    public ClassK(b bVar, b bVar2, ClassZ c0094z, ClassZ c0094z2, ClassZ c0094z3, Abstractt abstractC0515t) {
        this.f235k = bVar;
        this.f236l = bVar2;
        this.f237m = c0094z;
        this.f238n = c0094z2;
        this.f239o = c0094z3;
        this.f240p = abstractC0515t;
    }

    private c m810a(String str, String str2) {
        if (ClassI.m773f(str2)) {
            if (!ClassI.m784j(str2)) {
                return null;
            }
            str2 = ClassI.m792o(str2);
        }
        c cVarA = this.f235k.a(str2);
        if (cVarA != null) {
            if (this.f238n == null) {
                return cVarA;
            }
            this.f238n.m942a(str, str2, "Warning: library class " + ClassI.m764c(str) + " depends dynamically on program class " + ClassI.m764c(str2));
            return cVarA;
        }
        c cVarA2 = this.f236l.a(str2);
        if (cVarA2 != null || this.f237m == null) {
            return cVarA2;
        }
        this.f237m.m942a(str, str2, "Note: " + ClassI.m764c(str) + ": can't find dynamically referenced class " + ClassI.m764c(str2));
        return cVarA2;
    }

    private boolean m811a(c cVar, int i) {
        this.f248x = false;
        cVar.a(i, this);
        return this.f248x;
    }

    private boolean m812a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, ClassP c0085p, int i) {
        if (dVar.e < i) {
            return false;
        }
        c0085p.m858a();
        dVar.a(cVar, interfaceC0162j, 0, i, c0085p);
        return c0085p.m885b();
    }

    public void m813a(c cVar, a.b.a.a aVar) {
    }

    public void m814a(c cVar, a aVar) {
        if (this.f240p == null || !this.f240p.mo3151a(aVar.a(cVar))) {
            this.f239o.m942a(cVar.b(), aVar.a(cVar), "Note: " + ClassI.m764c(cVar.b()) + " calls '(" + ClassI.m764c(aVar.a(cVar)) + ")Class.forName(variable).newInstance()'");
        }
    }

    public void m815a(c cVar, l lVar) {
        String strC = lVar.c(cVar);
        if (strC.equals("(Ljava/lang/String;)Ljava/lang/Class;") || strC.equals("(Ljava/lang/String;Z)Ljava/lang/Class;")) {
            String strB = lVar.b(cVar);
            this.f248x = strB.equals("class$") || strB.equals(SvgConstants.ATTR_CLASS);
            if (this.f248x) {
                return;
            }
            c cVarA = this.f235k.a(lVar.a(cVar));
            if (cVarA != null) {
                cVarA.a(strB, strC, new a.b.a.d.a(this));
            }
        }
    }

    public void m816a(c cVar, r rVar) {
        rVar.b = m810a(cVar.b(), ClassI.m760b(ClassI.m767d(rVar.a(cVar))));
    }

    public void m817a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        this.f248x = m812a(cVar, interfaceC0162j, dVar, this.f245u, 5) || m812a(cVar, interfaceC0162j, dVar, this.f246v, 12) || m812a(cVar, interfaceC0162j, dVar, this.f247w, 8);
    }

    public void m818a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        abstractC0048c.mo324a(cVar, interfaceC0162j, dVar, i, this.f242r);
        if (this.f242r.m885b()) {
            cVar.a(this.f242r.m891d(MemoryConstants.f4579GB), this);
        }
        abstractC0048c.mo324a(cVar, interfaceC0162j, dVar, i, this.f241q);
        if (this.f241q.m885b()) {
            cVar.a(this.f241q.m891d(MemoryConstants.f4579GB), this);
            this.f242r.m858a();
        }
        abstractC0048c.mo324a(cVar, interfaceC0162j, dVar, i, this.f243s);
        if (this.f243s.m885b() && m811a(cVar, this.f243s.m891d(0))) {
            cVar.a(this.f243s.m891d(MemoryConstants.f4579GB), this);
        }
        abstractC0048c.mo324a(cVar, interfaceC0162j, dVar, i, this.f244t);
        if (this.f244t.m885b() && m811a(cVar, this.f244t.m891d(0))) {
            cVar.a(this.f244t.m891d(MemoryConstants.f4579GB), this);
        }
    }
}
