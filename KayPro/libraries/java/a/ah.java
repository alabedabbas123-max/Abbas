package a;

public class ah {

    private final a.h f16a;
    private a.b.b b;
    private final a.b.b c;
    private final a.j.n d;

    public ah(a.h r2) {
        this.b = new a.b.b();
        this.c = new a.b.b();
        this.d = new a.j.n();
        this.f16a = r2;
    }

    private boolean a(int r5, int r6) {
        if (this.f16a.R == false) goto L6;
        a.j.l.a("Optimizing (pass " + r5 + "/" + r6 + ")...");
    L6:
        return new a.g.m(this.f16a).a(this.b, this.c, this.d);
    }

    private void b() {
        if (this.f16a.R == false) goto L5;
        a.j.l.a("Printing configuration to [" + a.j.r.b(this.f16a.V) + "]...");
    L5:
        java.io.PrintWriter r1 = a.j.r.a(this.f16a.V);
        new a.l(r1).a(this.f16a);     // Catch: java.lang.Throwable -> L9
        a.j.r.a(this.f16a.V, r1);
        return;
    L9:
        th = move-exception;
        a.j.r.a(this.f16a.V, r1);
        throw th;
    }

    private void c() {
        if (this.f16a.R == false) goto L5;
        a.j.l.a("Reading input...");
    L5:
        new a.y(this.f16a).a(this.b, this.c);
    }

    private void d() {
        if (this.f16a.R == false) goto L5;
        a.j.l.a("Initializing...");
    L5:
        new a.x(this.f16a).a(this.b, this.c);
    }

    private void e() {
        this.b.a(new a.b.f.d());
    }

    private void f() {
        this.b.a(new a.b.f.v());
    }

    private void g() {
        new a.a.a(this.f16a).a(this.b, this.c, this.d);
    }

    private void h() {
        new a.c.c(this.f16a).a(this.b, this.c, this.d);
    }

    private void i() {
        if (this.f16a.R == false) goto L5;
        a.j.l.a("Setting target versions...");
    L5:
        new a.aj(this.f16a).a(this.b);
    }

    private void j() {
        if (this.f16a.R == false) goto L5;
        a.j.l.a("Printing kept classes, fields, and methods...");
    L5:
        java.io.PrintWriter r1 = a.j.r.a(this.f16a.j);
        new a.ai(r1).a(this.f16a, this.b, this.c);     // Catch: java.lang.Throwable -> L9
        a.j.r.a(this.f16a.j, r1);
        return;
    L9:
        th = move-exception;
        a.j.r.a(this.f16a.j, r1);
        throw th;
    }

    private void k() {
        if (this.f16a.R == false) goto L10;
        a.j.l.a("Shrinking...");
        if (this.f16a.m == null) goto L8;
        a.j.l.a("Explaining why classes and class members are being kept...");
    L8:
        if (this.f16a.l == null) goto L10;
        a.j.l.a("Printing usage to [" + a.j.r.b(this.f16a.l) + "]...");
    L10:
        this.b = new a.i.m(this.f16a).a(this.b, this.c);
    }

    private void l() {
        if (this.f16a.R == false) goto L5;
        a.j.l.a("Inlining subroutines...");
    L5:
        new a.h.d(this.f16a).a(this.b);
    }

    private void m() {
        if (this.f16a.R == false) goto L10;
        a.j.l.a("Obfuscating...");
        if (this.f16a.y == null) goto L8;
        a.j.l.a("Applying mapping [" + a.j.r.b(this.f16a.y) + "]");
    L8:
        if (this.f16a.x == null) goto L10;
        a.j.l.a("Printing mapping to [" + a.j.r.b(this.f16a.x) + "]...");
    L10:
        new a.f.w(this.f16a).a(this.b, this.c);
    }

    private void n() {
        this.b.a(new a.g.c.q());
    }

    private void o() {
        this.b.a(new a.b.a.d.a(true, new a.b.c.ba()));
    }

    private void p() {
        this.b.a(new a.b.g.q(3276800, new a.b.g.d(new a.b.a.d.a(new a.b.c.bj("StackMapTable")))));
    }

    private void q() {
        if (this.f16a.R == false) goto L5;
        a.j.l.a("Preverifying...");
    L5:
        new a.h.c(this.f16a).a(this.b);
    }

    private void r() {
        this.b.a(new a.b.c.s());
    }

    private void s() {
        if (this.f16a.R == false) goto L5;
        a.j.l.a("Writing output...");
    L5:
        new a.af(this.f16a).a(this.b, this.d);
    }

    private void t() {
        if (this.f16a.R == false) goto L5;
        a.j.l.a("Printing classes to [" + a.j.r.b(this.f16a.W) + "]...");
    L5:
        java.io.PrintWriter r1 = a.j.r.a(this.f16a.W);
        this.b.a(new a.b.g.p(r1));     // Catch: java.lang.Throwable -> L9
        a.j.r.a(this.f16a.W, r1);
        return;
    L9:
        th = move-exception;
        a.j.r.a(this.f16a.W, r1);
        throw th;
    }

    public void a() {
        a.j.l.a("ProGuard, version 6.0.3");
        a.s.a();
        if (this.f16a.V == null) goto L5;
        b();
    L5:
        new a.i(this.f16a).a();
        if (this.f16a.b == null) goto L13;
        if (this.f16a.b.a() == false) goto L13;
        if (new a.ak(this.f16a).a() == false) goto L13;
        return;
    L13:
        if (this.f16a.g == 0) goto L15;
        this.f16a.Y = true;
    L15:
        c();
        if (this.f16a.k == false) goto L18;
    L23:
        p();
    L25:
        if (this.f16a.j == null) goto L27;
    L36:
        d();
    L38:
        if (this.f16a.w == false) goto L40;
    L41:
        e();
    L43:
        if (this.f16a.Y == false) goto L46;
        g();
    L46:
        if (this.f16a.X == false) goto L49;
        h();
    L49:
        if (this.f16a.j == null) goto L52;
        j();
    L52:
        if (this.f16a.O == false) goto L54;
    L55:
        l();
    L57:
        if (this.f16a.k == false) goto L60;
        k();
    L60:
        if (this.f16a.n == false) goto L68;
        int r0 = 0;
    L63:
        if (r0 >= this.f16a.p) goto L66;
        if (a(r0 + 1, this.f16a.p) == false) goto L66;
        if (this.f16a.k == false) goto L102;
        this.f16a.l = null;
        this.f16a.m = null;
        k();
    L102:
        r0 = r0 + 1;
    L66:
        n();
    L68:
        if (this.f16a.w == false) goto L71;
        m();
    L71:
        if (this.f16a.n == false) goto L73;
    L74:
        f();
    L76:
        if (this.f16a.n == false) goto L79;
        o();
    L79:
        if (this.f16a.g == 0) goto L82;
        i();
    L82:
        if (this.f16a.O == false) goto L85;
        q();
    L85:
        if (this.f16a.k == false) goto L87;
    L92:
        r();
    L94:
        if (this.f16a.b.a() == false) goto L97;
        s();
    L97:
        if (this.f16a.W == null) goto L107;
        t();
        return;
    L107:
        return;
    L87:
        if (this.f16a.n == true) goto L92;
        if (this.f16a.w == true) goto L92;
        if (this.f16a.O == false) goto L94;
    L73:
        if (this.f16a.w == false) goto L76;
    L54:
        if (this.f16a.Q == false) goto L57;
    L40:
        if (this.f16a.n == false) goto L43;
    L27:
        if (this.f16a.k == true) goto L36;
        if (this.f16a.n == true) goto L36;
        if (this.f16a.w == true) goto L36;
        if (this.f16a.O == true) goto L36;
        if (this.f16a.Y == false) goto L38;
    L18:
        if (this.f16a.n == true) goto L23;
        if (this.f16a.w == true) goto L23;
        if (this.f16a.O == false) goto L25;
        goto L23
    }
}
