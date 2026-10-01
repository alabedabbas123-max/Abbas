package a;

public class af {

    private final a.h f15a;

    public af(a.h r1) {
        this.f15a = r1;
    }

    private a.e.o a(a.b.b r5, a.e.o r6) {
        java.util.Map r0 = a(r5);
        return new a.e.ad(this.f15a.M, new a.e.aj(r5, r0, r6), r6);
    }

    private a.e.p a(a.b.b r5, a.e.m r6, a.e.m r7) {
        a.e.ac r0 = null;
        if (this.f15a.f == null) goto L6;
        java.util.Map r1 = a(r5);
        r0 = new a.e.ac(this.f15a.f, new a.e.ai(r1, r6, r6));
    L6:
        return new a.e.p(r0, r7);
    }

    private static java.util.Map a(a.b.b r5) {
        java.util.HashMap r2 = new java.util.HashMap();
        java.util.Iterator r3 = r5.b();
    L4:
        if (r3.hasNext() == false) goto L10;
        java.lang.String r0 = (java.lang.String) r3.next();
        java.lang.String r4 = a.b.f.i.C(r0);
        java.lang.String r1 = (java.lang.String) r2.get(r4);
        if (r1 == null) goto L9;
        if (r1.equals(r4) == true) goto L4;
    L9:
        r2.put(r4, a.b.f.i.C(r5.a(r0).b()));
        goto L4
    L10:
        return r2;
    }

    private void a(a.n r8, a.b.b r9, a.d r10, int r11, int r12, int r13) {
        a.e.s r0 = r8.a(r10, r12, r13);     // Catch: java.io.IOException -> L24
        if (this.f15a.X == false) goto L30;
        a.e.s r6 = new a.e.s("classmap.txt", r0, new a.e.d(r9, r0));     // Catch: java.io.IOException -> L24
        a.j.l.a("Warning: -addconfigurationdebugging is enabled; the resulting build will contain obfuscation information.");     // Catch: java.io.IOException -> L24
        a.j.l.a("It should only be used for debugging purposes.");     // Catch: java.io.IOException -> L24
    L6:
        if (this.f15a.w == true) goto L8;
    L29:
        a.e.s r1 = r6;
    L10:
        a.e.m r2 = new a.e.h(r1);     // Catch: java.io.IOException -> L24
        if (this.f15a.k == true) goto L17;
        if (this.f15a.n == true) goto L17;
        if (this.f15a.w == true) goto L17;
    L28:
        a.e.m r3 = r2;
    L22:
        new a.y(this.f15a).a("  Copying resources from program ", r10, r11, r12, new a.e.c(new a.e.w(r6), a(r9, r2, r3)));     // Catch: java.io.IOException -> L24
        r6.a();     // Catch: java.io.IOException -> L24
        return;
    L17:
        if (this.f15a.N == null) goto L28;
        if (this.f15a.w == false) goto L27;
        a.e.m r4 = b(r9, r1);     // Catch: java.io.IOException -> L24
    L21:
        r3 = new a.e.ac(this.f15a.N, r4, r2);     // Catch: java.io.IOException -> L24
        goto L22
    L27:
        r4 = r2;
        goto L21
    L8:
        if (this.f15a.M == null) goto L29;
        r1 = a(r9, r6);     // Catch: java.io.IOException -> L24
        goto L10
    L30:
        r6 = r0;
    L24:
        e = move-exception;
        throw ((java.io.IOException) new java.io.IOException("Can't write [" + r10.a(r12).a() + "] (" + e.getMessage() + ")").initCause(e));
    }

    private a.e.m b(a.b.b r6, a.e.o r7) {
        if (this.f15a.Q == false) goto L7;
        java.nio.charset.Charset r0 = java.nio.charset.Charset.forName("UTF-8");
    L6:
        return new a.e.ac("META-INF/MANIFEST.MF,META-INF/*.SF", new a.e.z(r6, r0, r7), new a.e.n(r6, r0, r7));
    L7:
        r0 = java.nio.charset.Charset.defaultCharset();
        goto L6
    }

    public void a(a.b.b r10, a.j.n r11) {
        a.d r3 = this.f15a.b;
        a.n r1 = new a.n(r10, r11);
        int r7 = 0;
        int r8 = 0;
        int r4 = 0;
    L4:
        if (r7 >= r3.b()) goto L14;
        if (r3.a(r7).c() == true) goto L9;
        int r2 = r7;
    L8:
        r7 = r7 + 1;
        r8 = r2;
        goto L4
    L9:
        int r6 = r7 + 1;
        if (r6 != r3.b()) goto L12;
    L13:
        a(r1, r10, r3, r4, r8 + 1, r6);
        r2 = r8;
        r4 = r6;
        goto L8
    L12:
        if (r3.a(r6).c() == false) goto L13;
        r2 = r8;
        goto L8
    }
}
