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
        java.util.Map r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = null;
                    if (this.f15a.f == null) { $pc0 = 6; continue $sw0; }
                    r1 = a(r5);
                    r0 = new a.e.ac(this.f15a.f, new a.e.ai(r1, r6, r6));
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return new a.e.p(r0, r7);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.util.Map a(a.b.b r5) {
        java.util.HashMap r2 = null;
        java.util.Iterator r3 = null;
        java.lang.String r0 = null;
        java.lang.String r4 = null;
        java.lang.String r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r2 = new java.util.HashMap();
                    r3 = r5.b();
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r3.hasNext() == false) { $pc1 = 10; continue $sw1; }
                    r0 = (java.lang.String) r3.next();
                    r4 = a.b.f.i.C(r0);
                    r1 = (java.lang.String) r2.get(r4);
                    if (r1 == null) { $pc1 = 9; continue $sw1; }
                    if (r1.equals(r4) == true) { $pc1 = 4; continue $sw1; }
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    r2.put(r4, a.b.f.i.C(r5.a(r0).b()));
                    { $pc1 = 4; continue $sw1; }
                }
                case 10: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void a(a.n r8, a.b.b r9, a.d r10, int r11, int r12, int r13) {
        a.e.s r0 = null;
        a.e.s r6 = null;
        a.e.s r1 = null;
        a.e.m r2 = null;
        a.e.m r3 = null;
        a.e.m r4 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    try {
                        r0 = r8.a(r10, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 24; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.f15a.X == false) { $pc2 = 30; continue $sw2; }
                    try {
                        r6 = new a.e.s("classmap.txt", r0, new a.e.d(r9, r0));
                        a.j.l.a("Warning: -addconfigurationdebugging is enabled; the resulting build will contain obfuscation information.");
                        a.j.l.a("It should only be used for debugging purposes.");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 24; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (this.f15a.w == true) { $pc2 = 8; continue $sw2; }
                    $pc2 = 29; continue $sw2;
                }
                case 29: {
                    r1 = r6;
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    try {
                        r2 = new a.e.h(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 24; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.f15a.k == true) { $pc2 = 17; continue $sw2; }
                    if (this.f15a.n == true) { $pc2 = 17; continue $sw2; }
                    if (this.f15a.w == true) { $pc2 = 17; continue $sw2; }
                    $pc2 = 28; continue $sw2;
                }
                case 28: {
                    r3 = r2;
                    $pc2 = 22; continue $sw2;
                }
                case 22: {
                    try {
                        new a.y(this.f15a).a("  Copying resources from program ", r10, r11, r12, new a.e.c(new a.e.w(r6), a(r9, r2, r3)));
                        r6.a();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 24; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 17: {
                    if (this.f15a.N == null) { $pc2 = 28; continue $sw2; }
                    if (this.f15a.w == false) { $pc2 = 27; continue $sw2; }
                    try {
                        r4 = b(r9, r1);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 24; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 21; continue $sw2;
                }
                case 21: {
                    try {
                        r3 = new a.e.ac(this.f15a.N, r4, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 24; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc2 = 22; continue $sw2; }
                }
                case 27: {
                    r4 = r2;
                    { $pc2 = 21; continue $sw2; }
                }
                case 8: {
                    if (this.f15a.M == null) { $pc2 = 29; continue $sw2; }
                    try {
                        r1 = a(r9, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 24; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc2 = 10; continue $sw2; }
                }
                case 30: {
                    r6 = r0;
                    $pc2 = 24; continue $sw2;
                }
                case 24: {
                    e = $ex2;
                    throw ((java.io.IOException) new java.io.IOException("Can't write [" + r10.a(r12).a() + "] (" + e.getMessage() + ")").initCause(e));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private a.e.m b(a.b.b r6, a.e.o r7) {
        java.nio.charset.Charset r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.f15a.Q == false) { $pc3 = 7; continue $sw3; }
                    r0 = java.nio.charset.Charset.forName("UTF-8");
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return new a.e.ac("META-INF/MANIFEST.MF,META-INF/*.SF", new a.e.z(r6, r0, r7), new a.e.n(r6, r0, r7));
                }
                case 7: {
                    r0 = java.nio.charset.Charset.defaultCharset();
                    { $pc3 = 6; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a(a.b.b r10, a.j.n r11) {
        a.d r3 = null;
        a.n r1 = null;
        int r7 = 0;
        int r8 = 0;
        int r4 = 0;
        int r2 = 0;
        int r6 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r3 = this.f15a.b;
                    r1 = new a.n(r10, r11);
                    r7 = 0;
                    r8 = 0;
                    r4 = 0;
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r7 >= r3.b()) { $pc4 = 14; continue $sw4; }
                    if (r3.a(r7).c() == true) { $pc4 = 9; continue $sw4; }
                    r2 = r7;
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    r7 = r7 + 1;
                    r8 = r2;
                    { $pc4 = 4; continue $sw4; }
                }
                case 9: {
                    r6 = r7 + 1;
                    if (r6 != r3.b()) { $pc4 = 12; continue $sw4; }
                    $pc4 = 13; continue $sw4;
                }
                case 13: {
                    a(r1, r10, r3, r4, r8 + 1, r6);
                    r2 = r8;
                    r4 = r6;
                    { $pc4 = 8; continue $sw4; }
                }
                case 12: {
                    if (r3.a(r6).c() == false) { $pc4 = 13; continue $sw4; }
                    r2 = r8;
                    { $pc4 = 8; continue $sw4; }
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
