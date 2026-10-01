package a;

public class ak {

    private final a.h f19a;

    public ak(a.h r1) {
        this.f19a = r1;
    }

    public boolean a() {
        a.am r2 = new a.am(null);     // Catch: java.lang.IllegalStateException -> L17
        r2.a(this.f19a.h);     // Catch: java.lang.IllegalStateException -> L17
        a.d r3 = this.f19a.b;     // Catch: java.lang.IllegalStateException -> L17
        a.d r4 = this.f19a.c;     // Catch: java.lang.IllegalStateException -> L17
        if (r3 == null) goto L9;
        int r1 = 0;
    L7:
        if (r1 >= r3.b()) goto L9;
        a.e r5 = r3.a(r1);     // Catch: java.lang.IllegalStateException -> L17
        r2.a(r5.b(), r5.c());     // Catch: java.lang.IllegalStateException -> L17
        r1 = r1 + 1;     // Catch: java.lang.IllegalStateException -> L17
    L9:
        if (r4 == null) goto L14;
        int r6 = 0;
    L12:
        if (r6 >= r4.b()) goto L14;
        r2.a(r4.a(r6).b(), false);     // Catch: java.lang.IllegalStateException -> L17
        r6 = r6 + 1;     // Catch: java.lang.IllegalStateException -> L17
    L14:
        r2.a(this.f19a.y);     // Catch: java.lang.IllegalStateException -> L17
        r2.a(this.f19a.z);     // Catch: java.lang.IllegalStateException -> L17
        r2.a(this.f19a.A);     // Catch: java.lang.IllegalStateException -> L17
        r2.a(this.f19a.B);     // Catch: java.lang.IllegalStateException -> L17
        r2.b(this.f19a.j);     // Catch: java.lang.IllegalStateException -> L17
        r2.b(this.f19a.l);     // Catch: java.lang.IllegalStateException -> L17
        r2.b(this.f19a.x);     // Catch: java.lang.IllegalStateException -> L17
        r2.b(this.f19a.V);     // Catch: java.lang.IllegalStateException -> L17
        r2.b(this.f19a.W);     // Catch: java.lang.IllegalStateException -> L17
        a.j.l.a("The output seems up to date");
        return true;
    L23:
        return false;
    }
}
