package a.b;

public class k implements a.b.c {
    private static final int[] q = null;
    private static final a.b.l[] r = null;
    private static final a.b.n[] s = null;
    private static final a.b.a.a[] t = null;

    public int f132a;
    public int b;
    public a.b.b.b[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int[] h;
    public int i;
    public a.b.l[] j;
    public int k;
    public a.b.n[] l;
    public int m;
    public a.b.a.a[] n;
    public a.b.c[] o;
    public java.lang.Object p;

    static {
        q = new int[0];
        r = new a.b.l[0];
        s = new a.b.n[0];
        t = new a.b.a.a[0];
    }

    public k() {
    }

    public k(int r17, int r18, a.b.b.b[] r19, int r20, int r21, int r22) {
        this(r17, r18, r19, r20, r21, r22, 0, q, 0, r, 0, s, 0, t, null);
    }

    public k(int r1, int r2, a.b.b.b[] r3, int r4, int r5, int r6, int r7, int[] r8, int r9, a.b.l[] r10, int r11, a.b.n[] r12, int r13, a.b.a.a[] r14, a.b.c[] r15) {
        this.f132a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
        this.i = r9;
        this.j = r10;
        this.k = r11;
        this.l = r12;
        this.m = r13;
        this.n = r14;
        this.o = r15;
    }

    @Override
    public int a() {
        return this.d;
    }

    @Override
    public a.b.d a(java.lang.String r4, java.lang.String r5) {
        int r0 = 0;
        a.b.d r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0 >= this.i) { $pc0 = 15; continue $sw0; }
                    r1 = this.j[r0];
                    if (r4 != null) { $pc0 = 8; continue $sw0; }
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (r5 == null) { $pc0 = 13; continue $sw0; }
                    if (r1.b(this).equals(r5) == true) { $pc0 = 13; continue $sw0; }
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    r0 = r0 + 1;
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    return r1;
                }
                case 8: {
                    if (r1.a(this).equals(r4) == false) { $pc0 = 14; continue $sw0; }
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String a(int r2) {
        return e(this.h[r2]);
    }

    @Override
    public void a(int r2, a.b.b.a.f r3) {
        this.c[r2].a(this, r3);
    }

    @Override
    public void a(a.b.a.d.i r3) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = 0;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r0 >= this.m) { $pc1 = 6; continue $sw1; }
                    this.n[r0].a(this, r3);
                    r0 = r0 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void a(a.b.b.a.f r3) {
        int r0 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = 1;
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r0 >= this.b) { $pc2 = 9; continue $sw2; }
                    if (this.c[r0] == null) { $pc2 = 8; continue $sw2; }
                    this.c[r0].a(this, r3);
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    r0 = r0 + 1;
                    { $pc2 = 4; continue $sw2; }
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void a(a.b.c r5) {
        a.b.c[] r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.o != null) { $pc3 = 7; continue $sw3; }
                    this.o = new a.b.c[1];
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    this.o[this.o.length - 1] = r5;
                    return;
                }
                case 7: {
                    r0 = new a.b.c[this.o.length + 1];
                    java.lang.System.arraycopy(this.o, 0, r0, 0, this.o.length);
                    this.o = r0;
                    { $pc3 = 5; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void a(a.b.g.aq r3) {
        int r0 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = 0;
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r0 >= this.i) { $pc4 = 6; continue $sw4; }
                    this.j[r0].a(this, r3);
                    r0 = r0 + 1;
                    { $pc4 = 4; continue $sw4; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void a(a.b.g.s r1) {
        r1.a(this);
    }

    @Override
    public void a(java.lang.Object r1) {
        this.p = r1;
    }

    @Override
    public void a(java.lang.String r2, java.lang.String r3, a.b.g.aq r4) {
        a.b.j r0 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = b(r2, r3);
                    if (r0 == null) { $pc5 = 6; continue $sw5; }
                    r0.a(this, r4);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void a(boolean r10, boolean r11, boolean r12, boolean r13, a.b.g.s r14) {
        a.b.c r0 = null;
        a.b.c r3 = null;
        int r6 = 0;
        a.b.c r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r10 == false) { $pc6 = 5; continue $sw6; }
                    a(r14);
                    $pc6 = 5; continue $sw6;
                }
                case 5: {
                    if (r11 == false) { $pc6 = 9; continue $sw6; }
                    r0 = e();
                    if (r0 == null) { $pc6 = 9; continue $sw6; }
                    r0.a(true, true, r12, false, r14);
                    $pc6 = 9; continue $sw6;
                }
                case 9: {
                    if (r12 == false) { $pc6 = 21; continue $sw6; }
                    if (r11 == true) { $pc6 = 14; continue $sw6; }
                    r3 = e();
                    if (r3 == null) { $pc6 = 14; continue $sw6; }
                    r3.a(false, false, true, false, r14);
                    $pc6 = 14; continue $sw6;
                }
                case 14: {
                    r6 = 0;
                    $pc6 = 16; continue $sw6;
                }
                case 16: {
                    if (r6 >= this.g) { $pc6 = 21; continue $sw6; }
                    r1 = k(r6);
                    if (r1 == null) { $pc6 = 20; continue $sw6; }
                    r1.a(true, false, true, false, r14);
                    $pc6 = 20; continue $sw6;
                }
                case 20: {
                    r6 = r6 + 1;
                    $pc6 = 21; continue $sw6;
                }
                case 21: {
                    if (r13 == true) { $pc6 = 23; continue $sw6; }
                    return;
                }
                case 23: {
                    if (this.o == null) { $pc6 = 33; continue $sw6; }
                    r2 = 0;
                    $pc6 = 26; continue $sw6;
                }
                case 26: {
                    if (r2 >= this.o.length) { $pc6 = 34; continue $sw6; }
                    this.o[r2].a(true, false, false, true, r14);
                    r2 = r2 + 1;
                    { $pc6 = 26; continue $sw6; }
                }
                case 34: {
                    return;
                }
                case 33: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean a(a.b.j r3) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if ((this.d & 16) != 0) { $pc7 = 11; continue $sw7; }
                    if (r3 != null) { $pc7 = 6; continue $sw7; }
                    $pc7 = 9; continue $sw7;
                }
                case 9: {
                    return true;
                }
                case 6: {
                    if ((r3.a() & 26) != 0) { $pc7 = 11; continue $sw7; }
                    if (r3.a(this).equals("<init>") == false) { $pc7 = 9; continue $sw7; }
                    $pc7 = 11; continue $sw7;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean a(java.lang.String r3) {
        a.b.c r1 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (b().equals(r3) == false) { $pc8 = 5; continue $sw8; }
                    return true;
                }
                case 5: {
                    r1 = e();
                    if (r1 != null) { $pc8 = 8; continue $sw8; }
                    $pc8 = 9; continue $sw8;
                }
                case 9: {
                    return false;
                }
                case 8: {
                    if (r1.a(r3) == false) { $pc8 = 9; continue $sw8; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int b(int r2) {
        return this.c[r2].a();
    }

    @Override
    public a.b.j b(java.lang.String r4, java.lang.String r5) {
        int r0 = 0;
        a.b.j r1 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = 0;
                    $pc9 = 4; continue $sw9;
                }
                case 4: {
                    if (r0 >= this.k) { $pc9 = 15; continue $sw9; }
                    r1 = this.l[r0];
                    if (r4 != null) { $pc9 = 8; continue $sw9; }
                    $pc9 = 9; continue $sw9;
                }
                case 9: {
                    if (r5 == null) { $pc9 = 13; continue $sw9; }
                    if (r1.b(this).equals(r5) == true) { $pc9 = 13; continue $sw9; }
                    $pc9 = 14; continue $sw9;
                }
                case 14: {
                    r0 = r0 + 1;
                    $pc9 = 13; continue $sw9;
                }
                case 13: {
                    return r1;
                }
                case 8: {
                    if (r1.a(this).equals(r4) == false) { $pc9 = 14; continue $sw9; }
                    $pc9 = 15; continue $sw9;
                }
                case 15: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String b() {
        return e(this.e);
    }

    @Override
    public void b(a.b.b.a.f r3) {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (this.f == 0) { $pc10 = 6; continue $sw10; }
                    this.c[this.f].a(this, r3);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void b(a.b.g.aq r3) {
        int r0 = 0;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = 0;
                    $pc11 = 4; continue $sw11;
                }
                case 4: {
                    if (r0 >= this.k) { $pc11 = 6; continue $sw11; }
                    this.l[r0].a(this, r3);
                    r0 = r0 + 1;
                    { $pc11 = 4; continue $sw11; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void b(a.b.g.s r3) {
        int r0 = 0;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (this.o == null) { $pc12 = 8; continue $sw12; }
                    r0 = 0;
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    if (r0 >= this.o.length) { $pc12 = 10; continue $sw12; }
                    this.o[r0].a(r3);
                    r0 = r0 + 1;
                    { $pc12 = 6; continue $sw12; }
                }
                case 10: {
                    return;
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void b(java.lang.String r2, java.lang.String r3, a.b.g.aq r4) {
        a.b.d r0 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = a(r2, r3);
                    if (r0 == null) { $pc13 = 6; continue $sw13; }
                    r0.a(this, r4);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean b(a.b.c r3) {
        a.b.c r1 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    if (equals(r3) == false) { $pc14 = 5; continue $sw14; }
                    return true;
                }
                case 5: {
                    r1 = e();
                    if (r1 != null) { $pc14 = 8; continue $sw14; }
                    $pc14 = 9; continue $sw14;
                }
                case 9: {
                    return false;
                }
                case 8: {
                    if (r1.b(r3) == false) { $pc14 = 9; continue $sw14; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String c() {
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    if (this.f != 0) { $pc15 = 7; continue $sw15; }
                    return null;
                }
                case 7: {
                    return e(this.f);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String c(int r5) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    return ((a.b.b.s) this.c[r5]).c();
                }
                case 4: {
                    e = $ex16;
                    throw ((java.lang.IllegalStateException) new java.lang.IllegalStateException("Expected Utf8Constant at index [" + r5 + "] in class [" + b() + "]").initCause(e));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void c(a.b.b.a.f r4) {
        int r0 = 0;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    r0 = 0;
                    $pc17 = 4; continue $sw17;
                }
                case 4: {
                    if (r0 >= this.g) { $pc17 = 6; continue $sw17; }
                    this.c[this.h[r0]].a(this, r4);
                    r0 = r0 + 1;
                    { $pc17 = 4; continue $sw17; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean c(a.b.c r5) {
        a.b.c r0 = null;
        int r1 = 0;
        a.b.c r3 = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    if (equals(r5) == true) { $pc18 = 5; continue $sw18; }
                    r0 = e();
                    if (r0 != null) { $pc18 = 9; continue $sw18; }
                    $pc18 = 11; continue $sw18;
                }
                case 11: {
                    r1 = 0;
                    $pc18 = 13; continue $sw18;
                }
                case 13: {
                    if (r1 >= this.g) { $pc18 = 26; continue $sw18; }
                    r3 = k(r1);
                    if (r3 == null) { $pc18 = 19; continue $sw18; }
                    if (r3.c(r5) == false) { $pc18 = 19; continue $sw18; }
                    return true;
                }
                case 19: {
                    r1 = r1 + 1;
                    { $pc18 = 13; continue $sw18; }
                }
                case 26: {
                    return false;
                }
                case 9: {
                    if (r0.c(r5) == false) { $pc18 = 11; continue $sw18; }
                    return true;
                }
                case 5: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int d() {
        return this.g;
    }

    @Override
    public java.lang.String d(int r5) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    return ((a.b.b.r) this.c[r5]).a(this);
                }
                case 4: {
                    e = $ex19;
                    throw ((java.lang.IllegalStateException) new java.lang.IllegalStateException("Expected StringConstant at index [" + r5 + "] in class [" + b() + "]").initCause(e));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void d(a.b.b.a.f r3) {
        this.c[this.e].a(this, r3);
    }

    @Override
    public a.b.c e() {
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    if (this.f != 0) { $pc20 = 5; continue $sw20; }
                    return null;
                }
                case 5: {
                    return ((a.b.b.a) this.c[this.f]).b;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String e(int r5) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    return ((a.b.b.a) this.c[r5]).a(this);
                }
                case 4: {
                    e = $ex21;
                    throw ((java.lang.IllegalStateException) new java.lang.IllegalStateException("Expected ClassConstant at index [" + r5 + "]").initCause(e));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.Object f() {
        return this.p;
    }

    @Override
    public java.lang.String f(int r5) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    return ((a.b.b.n) this.c[r5]).a(this);
                }
                case 4: {
                    e = $ex22;
                    throw ((java.lang.IllegalStateException) new java.lang.IllegalStateException("Expected NameAndTypeConstant at index [" + r5 + "] in class [" + b() + "]").initCause(e));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String g(int r5) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = -1;
        $sw23: while (true) {
            switch ($pc23) {
                case -1: {
                    return ((a.b.b.n) this.c[r5]).b(this);
                }
                case 4: {
                    e = $ex23;
                    throw ((java.lang.IllegalStateException) new java.lang.IllegalStateException("Expected NameAndTypeConstant at index [" + r5 + "] in class [" + b() + "]").initCause(e));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String h(int r5) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = -1;
        $sw24: while (true) {
            switch ($pc24) {
                case -1: {
                    return ((a.b.b.q) this.c[r5]).a(this);
                }
                case 4: {
                    e = $ex24;
                    throw ((java.lang.IllegalStateException) new java.lang.IllegalStateException("Expected RefConstant at index [" + r5 + "] in class [" + b() + "]").initCause(e));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String i(int r5) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = -1;
        $sw25: while (true) {
            switch ($pc25) {
                case -1: {
                    return ((a.b.b.q) this.c[r5]).b(this);
                }
                case 4: {
                    e = $ex25;
                    throw ((java.lang.IllegalStateException) new java.lang.IllegalStateException("Expected RefConstant at index [" + r5 + "] in class [" + b() + "]").initCause(e));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String j(int r5) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = -1;
        $sw26: while (true) {
            switch ($pc26) {
                case -1: {
                    return ((a.b.b.q) this.c[r5]).c(this);
                }
                case 4: {
                    e = $ex26;
                    throw ((java.lang.IllegalStateException) new java.lang.IllegalStateException("Expected RefConstant at index [" + r5 + "] in class [" + b() + "]").initCause(e));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public a.b.c k(int r3) {
        return ((a.b.b.a) this.c[this.h[r3]]).b;
    }

    public a.b.b.b l(int r2) {
        return this.c[r2];
    }

    public java.lang.String toString() {
        return "ProgramClass(" + b() + ")";
    }
}
