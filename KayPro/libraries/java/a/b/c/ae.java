package a.b.c;

public class ae {

    private final a.b.k f107a;
    private final a.b.b.a.f b;

    public ae(a.b.k r2) {
        this(r2, null, null);
    }

    public ae(a.b.k r3, a.b.b r4, a.b.b r5) {
        a.b.b.a.f r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.f107a = r3;
                    if (r4 != null) { $pc0 = 7; continue $sw0; }
                    r0 = null;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    this.b = r0;
                    return;
                }
                case 7: {
                    r0 = new a.g.c.ae(new a.b.f.f(r4, r5));
                    { $pc0 = 5; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int a(double r8) {
        int r2 = 0;
        a.b.b.b[] r3 = null;
        int r1 = 0;
        a.b.b.b r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r2 = this.f107a.b;
                    r3 = this.f107a.c;
                    r1 = 1;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r1 >= r2) { $pc1 = 19; continue $sw1; }
                    r0 = r3[r1];
                    if (r0 == null) { $pc1 = 12; continue $sw1; }
                    if (r0.a() != 6) { $pc1 = 12; continue $sw1; }
                    if (((a.b.b.c) r0).b() != r8) { $pc1 = 12; continue $sw1; }
                    return r1;
                }
                case 12: {
                    r1 = r1 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 19: {
                    return a(new a.b.b.c(r8));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int a(float r7) {
        int r2 = 0;
        a.b.b.b[] r3 = null;
        int r1 = 0;
        a.b.b.b r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r2 = this.f107a.b;
                    r3 = this.f107a.c;
                    r1 = 1;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r1 >= r2) { $pc2 = 19; continue $sw2; }
                    r0 = r3[r1];
                    if (r0 == null) { $pc2 = 12; continue $sw2; }
                    if (r0.a() != 4) { $pc2 = 12; continue $sw2; }
                    if (((a.b.b.e) r0).b() != r7) { $pc2 = 12; continue $sw2; }
                    return r1;
                }
                case 12: {
                    r1 = r1 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 19: {
                    return a(new a.b.b.e(r7));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int a(int r7) {
        int r2 = 0;
        a.b.b.b[] r3 = null;
        int r1 = 0;
        a.b.b.b r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r2 = this.f107a.b;
                    r3 = this.f107a.c;
                    r1 = 1;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r1 >= r2) { $pc3 = 19; continue $sw3; }
                    r0 = r3[r1];
                    if (r0 == null) { $pc3 = 12; continue $sw3; }
                    if (r0.a() != 3) { $pc3 = 12; continue $sw3; }
                    if (((a.b.b.f) r0).b() != r7) { $pc3 = 12; continue $sw3; }
                    return r1;
                }
                case 12: {
                    r1 = r1 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 19: {
                    return a(new a.b.b.f(r7));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int a(int r7, int r8) {
        int r2 = 0;
        a.b.b.b[] r3 = null;
        int r1 = 0;
        a.b.b.b r0 = null;
        a.b.b.j r4 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r2 = this.f107a.b;
                    r3 = this.f107a.c;
                    r1 = 1;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r1 >= r2) { $pc4 = 22; continue $sw4; }
                    r0 = r3[r1];
                    if (r0 == null) { $pc4 = 14; continue $sw4; }
                    if (r0.a() != 15) { $pc4 = 14; continue $sw4; }
                    r4 = (a.b.b.j) r0;
                    if (r4.f93a != r7) { $pc4 = 14; continue $sw4; }
                    if (r4.b != r8) { $pc4 = 14; continue $sw4; }
                    return r1;
                }
                case 14: {
                    r1 = r1 + 1;
                    { $pc4 = 3; continue $sw4; }
                }
                case 22: {
                    return a(new a.b.b.j(r7, r8));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int a(int r7, int r8, a.b.c r9, a.b.i r10) {
        int r2 = 0;
        a.b.b.b[] r3 = null;
        int r1 = 0;
        a.b.b.b r0 = null;
        a.b.b.d r4 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r2 = this.f107a.b;
                    r3 = this.f107a.c;
                    r1 = 1;
                    $pc5 = 3; continue $sw5;
                }
                case 3: {
                    if (r1 >= r2) { $pc5 = 22; continue $sw5; }
                    r0 = r3[r1];
                    if (r0 == null) { $pc5 = 14; continue $sw5; }
                    if (r0.a() != 9) { $pc5 = 14; continue $sw5; }
                    r4 = (a.b.b.d) r0;
                    if (r4.f99a != r7) { $pc5 = 14; continue $sw5; }
                    if (r4.b != r8) { $pc5 = 14; continue $sw5; }
                    return r1;
                }
                case 14: {
                    r1 = r1 + 1;
                    { $pc5 = 3; continue $sw5; }
                }
                case 22: {
                    return a(new a.b.b.d(r7, r8, r9, r10));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int a(int r7, int r8, a.b.c[] r9) {
        int r2 = 0;
        a.b.b.b[] r3 = null;
        int r1 = 0;
        a.b.b.b r0 = null;
        a.b.b.h r4 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r2 = this.f107a.b;
                    r3 = this.f107a.c;
                    r1 = 1;
                    $pc6 = 3; continue $sw6;
                }
                case 3: {
                    if (r1 >= r2) { $pc6 = 22; continue $sw6; }
                    r0 = r3[r1];
                    if (r0 == null) { $pc6 = 14; continue $sw6; }
                    if (r0.a() != 18) { $pc6 = 14; continue $sw6; }
                    r4 = (a.b.b.h) r0;
                    if (r4.f91a != r7) { $pc6 = 14; continue $sw6; }
                    if (r4.b != r8) { $pc6 = 14; continue $sw6; }
                    return r1;
                }
                case 14: {
                    r1 = r1 + 1;
                    { $pc6 = 3; continue $sw6; }
                }
                case 22: {
                    return a(new a.b.b.h(r7, r8, r9));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int a(int r2, java.lang.String r3, java.lang.String r4, a.b.c r5, a.b.i r6) {
        return a(r2, a(r3, r4), r5, r6);
    }

    public int a(long r8) {
        int r2 = 0;
        a.b.b.b[] r3 = null;
        int r1 = 0;
        a.b.b.b r0 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r2 = this.f107a.b;
                    r3 = this.f107a.c;
                    r1 = 1;
                    $pc7 = 3; continue $sw7;
                }
                case 3: {
                    if (r1 >= r2) { $pc7 = 19; continue $sw7; }
                    r0 = r3[r1];
                    if (r0 == null) { $pc7 = 12; continue $sw7; }
                    if (r0.a() != 5) { $pc7 = 12; continue $sw7; }
                    if (((a.b.b.i) r0).b() != r8) { $pc7 = 12; continue $sw7; }
                    return r1;
                }
                case 12: {
                    r1 = r1 + 1;
                    { $pc7 = 3; continue $sw7; }
                }
                case 19: {
                    return a(new a.b.b.i(r8));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int a(a.b.b.b r6) {
        int r1 = 0;
        a.b.b.b[] r0 = null;
        a.b.b.b[] r2 = null;
        a.b.k r3 = null;
        int r4 = 0;
        int r5 = 0;
        a.b.k r7 = null;
        int r8 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r1 = this.f107a.b;
                    r0 = this.f107a.c;
                    if (r0.length >= (r1 + 2)) { $pc8 = 5; continue $sw8; }
                    r2 = new a.b.b.b[r1 + 2];
                    java.lang.System.arraycopy(r0, 0, r2, 0, r1);
                    this.f107a.c = r2;
                    r0 = this.f107a.c;
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    r3 = this.f107a;
                    r4 = r3.b;
                    r3.b = r4 + 1;
                    r0[r4] = r6;
                    r5 = r6.a();
                    if (r5 != 5) { $pc8 = 8; continue $sw8; }
                    $pc8 = 9; continue $sw8;
                }
                case 9: {
                    r7 = this.f107a;
                    r8 = r7.b;
                    r7.b = r8 + 1;
                    r0[r8] = null;
                    $pc8 = 11; continue $sw8;
                }
                case 11: {
                    if (this.b == null) { $pc8 = 13; continue $sw8; }
                    r6.a(this.f107a, this.b);
                    $pc8 = 13; continue $sw8;
                }
                case 13: {
                    return r1;
                }
                case 8: {
                    if (r5 != 6) { $pc8 = 11; continue $sw8; }
                    { $pc8 = 9; continue $sw8; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int a(java.lang.Object r2) {
        return a(new a.b.b.p(r2));
    }

    public int a(java.lang.String r7) {
        int r2 = 0;
        a.b.b.b[] r3 = null;
        int r1 = 0;
        a.b.b.b r0 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r2 = this.f107a.b;
                    r3 = this.f107a.c;
                    r1 = 1;
                    $pc9 = 3; continue $sw9;
                }
                case 3: {
                    if (r1 >= r2) { $pc9 = 19; continue $sw9; }
                    r0 = r3[r1];
                    if (r0 == null) { $pc9 = 12; continue $sw9; }
                    if (r0.a() != 19) { $pc9 = 12; continue $sw9; }
                    if (((a.b.b.m) r0).a(this.f107a).equals(r7) == false) { $pc9 = 12; continue $sw9; }
                    return r1;
                }
                case 12: {
                    r1 = r1 + 1;
                    { $pc9 = 3; continue $sw9; }
                }
                case 19: {
                    return a(new a.b.b.m(c(r7)));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int a(java.lang.String r2, int r3, a.b.c r4, a.b.i r5) {
        return a(a(r2, r4), r3, r4, r5);
    }

    public int a(java.lang.String r7, a.b.c r8) {
        int r2 = 0;
        a.b.b.b[] r3 = null;
        int r1 = 0;
        a.b.b.b r0 = null;
        a.b.b.a r4 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r2 = this.f107a.b;
                    r3 = this.f107a.c;
                    r1 = 1;
                    $pc10 = 3; continue $sw10;
                }
                case 3: {
                    if (r1 >= r2) { $pc10 = 22; continue $sw10; }
                    r0 = r3[r1];
                    if (r0 == null) { $pc10 = 14; continue $sw10; }
                    if (r0.a() != 7) { $pc10 = 14; continue $sw10; }
                    r4 = (a.b.b.a) r0;
                    if (r4.f80a >= r2) { $pc10 = 14; continue $sw10; }
                    if (r4.a(this.f107a).equals(r7) == false) { $pc10 = 14; continue $sw10; }
                    return r1;
                }
                case 14: {
                    r1 = r1 + 1;
                    { $pc10 = 3; continue $sw10; }
                }
                case 22: {
                    return a(new a.b.b.a(c(r7), r8));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int a(java.lang.String r7, a.b.c r8, a.b.i r9) {
        int r2 = 0;
        a.b.b.b[] r3 = null;
        int r1 = 0;
        a.b.b.b r0 = null;
        a.b.b.r r4 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r2 = this.f107a.b;
                    r3 = this.f107a.c;
                    r1 = 1;
                    $pc11 = 3; continue $sw11;
                }
                case 3: {
                    if (r1 >= r2) { $pc11 = 28; continue $sw11; }
                    r0 = r3[r1];
                    if (r0 == null) { $pc11 = 18; continue $sw11; }
                    if (r0.a() != 8) { $pc11 = 18; continue $sw11; }
                    r4 = (a.b.b.r) r0;
                    if (r4.f100a >= r2) { $pc11 = 18; continue $sw11; }
                    if (r4.a(this.f107a).equals(r7) == false) { $pc11 = 18; continue $sw11; }
                    if (r4.b != r8) { $pc11 = 18; continue $sw11; }
                    if (r4.c != r9) { $pc11 = 18; continue $sw11; }
                    return r1;
                }
                case 18: {
                    r1 = r1 + 1;
                    { $pc11 = 3; continue $sw11; }
                }
                case 28: {
                    return a(new a.b.b.r(c(r7), r8, r9));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int a(java.lang.String r7, java.lang.String r8) {
        int r2 = 0;
        a.b.b.b[] r3 = null;
        int r1 = 0;
        a.b.b.b r0 = null;
        a.b.b.n r4 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r2 = this.f107a.b;
                    r3 = this.f107a.c;
                    r1 = 1;
                    $pc12 = 3; continue $sw12;
                }
                case 3: {
                    if (r1 >= r2) { $pc12 = 28; continue $sw12; }
                    r0 = r3[r1];
                    if (r0 == null) { $pc12 = 18; continue $sw12; }
                    if (r0.a() != 12) { $pc12 = 18; continue $sw12; }
                    r4 = (a.b.b.n) r0;
                    if (r4.f96a >= r2) { $pc12 = 18; continue $sw12; }
                    if (r4.b >= r2) { $pc12 = 18; continue $sw12; }
                    if (r4.a(this.f107a).equals(r7) == false) { $pc12 = 18; continue $sw12; }
                    if (r4.b(this.f107a).equals(r8) == false) { $pc12 = 18; continue $sw12; }
                    return r1;
                }
                case 18: {
                    r1 = r1 + 1;
                    { $pc12 = 3; continue $sw12; }
                }
                case 28: {
                    return a(new a.b.b.n(c(r7), c(r8)));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int a(java.lang.String r2, java.lang.String r3, java.lang.String r4, a.b.c r5, a.b.i r6) {
        return a(r2, a(r3, r4), r5, r6);
    }

    public int a(java.lang.String r7, a.b.c[] r8) {
        int r2 = 0;
        a.b.b.b[] r3 = null;
        int r1 = 0;
        a.b.b.b r0 = null;
        a.b.b.k r4 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r2 = this.f107a.b;
                    r3 = this.f107a.c;
                    r1 = 1;
                    $pc13 = 3; continue $sw13;
                }
                case 3: {
                    if (r1 >= r2) { $pc13 = 22; continue $sw13; }
                    r0 = r3[r1];
                    if (r0 == null) { $pc13 = 14; continue $sw13; }
                    if (r0.a() != 16) { $pc13 = 14; continue $sw13; }
                    r4 = (a.b.b.k) r0;
                    if (r4.f94a >= r2) { $pc13 = 14; continue $sw13; }
                    if (r4.a(this.f107a).equals(r7) == false) { $pc13 = 14; continue $sw13; }
                    return r1;
                }
                case 14: {
                    r1 = r1 + 1;
                    { $pc13 = 3; continue $sw13; }
                }
                case 22: {
                    return a(new a.b.b.k(c(r7), r8));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public a.b.k a() {
        return this.f107a;
    }

    public int b(int r7, int r8, a.b.c r9, a.b.i r10) {
        int r2 = 0;
        a.b.b.b[] r3 = null;
        int r1 = 0;
        a.b.b.b r0 = null;
        a.b.b.g r4 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r2 = this.f107a.b;
                    r3 = this.f107a.c;
                    r1 = 1;
                    $pc14 = 3; continue $sw14;
                }
                case 3: {
                    if (r1 >= r2) { $pc14 = 22; continue $sw14; }
                    r0 = r3[r1];
                    if (r0 == null) { $pc14 = 14; continue $sw14; }
                    if (r0.a() != 11) { $pc14 = 14; continue $sw14; }
                    r4 = (a.b.b.g) r0;
                    if (r4.f99a != r7) { $pc14 = 14; continue $sw14; }
                    if (r4.b != r8) { $pc14 = 14; continue $sw14; }
                    return r1;
                }
                case 14: {
                    r1 = r1 + 1;
                    { $pc14 = 3; continue $sw14; }
                }
                case 22: {
                    return a(new a.b.b.g(r7, r8, r9, r10));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int b(int r2, java.lang.String r3, java.lang.String r4, a.b.c r5, a.b.i r6) {
        return b(r2, a(r3, r4), r5, r6);
    }

    public int b(java.lang.String r7) {
        int r2 = 0;
        a.b.b.b[] r3 = null;
        int r1 = 0;
        a.b.b.b r0 = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r2 = this.f107a.b;
                    r3 = this.f107a.c;
                    r1 = 1;
                    $pc15 = 3; continue $sw15;
                }
                case 3: {
                    if (r1 >= r2) { $pc15 = 19; continue $sw15; }
                    r0 = r3[r1];
                    if (r0 == null) { $pc15 = 12; continue $sw15; }
                    if (r0.a() != 20) { $pc15 = 12; continue $sw15; }
                    if (((a.b.b.o) r0).a(this.f107a).equals(r7) == false) { $pc15 = 12; continue $sw15; }
                    return r1;
                }
                case 12: {
                    r1 = r1 + 1;
                    { $pc15 = 3; continue $sw15; }
                }
                case 19: {
                    return a(new a.b.b.o(c(r7)));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int b(java.lang.String r2, int r3, a.b.c r4, a.b.i r5) {
        return b(a(r2, r4), r3, r4, r5);
    }

    public int b(java.lang.String r2, java.lang.String r3, java.lang.String r4, a.b.c r5, a.b.i r6) {
        return b(r2, a(r3, r4), r5, r6);
    }

    public int c(int r7, int r8, a.b.c r9, a.b.i r10) {
        int r2 = 0;
        a.b.b.b[] r3 = null;
        int r1 = 0;
        a.b.b.b r0 = null;
        a.b.b.l r4 = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    r2 = this.f107a.b;
                    r3 = this.f107a.c;
                    r1 = 1;
                    $pc16 = 3; continue $sw16;
                }
                case 3: {
                    if (r1 >= r2) { $pc16 = 22; continue $sw16; }
                    r0 = r3[r1];
                    if (r0 == null) { $pc16 = 14; continue $sw16; }
                    if (r0.a() != 10) { $pc16 = 14; continue $sw16; }
                    r4 = (a.b.b.l) r0;
                    if (r4.f99a != r7) { $pc16 = 14; continue $sw16; }
                    if (r4.b != r8) { $pc16 = 14; continue $sw16; }
                    return r1;
                }
                case 14: {
                    r1 = r1 + 1;
                    { $pc16 = 3; continue $sw16; }
                }
                case 22: {
                    return a(new a.b.b.l(r7, r8, r9, r10));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int c(int r2, java.lang.String r3, java.lang.String r4, a.b.c r5, a.b.i r6) {
        return c(r2, a(r3, r4), r5, r6);
    }

    public int c(java.lang.String r7) {
        int r3 = 0;
        a.b.b.b[] r4 = null;
        int r1 = 0;
        a.b.b.b r0 = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    r3 = this.f107a.b;
                    r4 = this.f107a.c;
                    r1 = 1;
                    $pc17 = 3; continue $sw17;
                }
                case 3: {
                    if (r1 >= r3) { $pc17 = 19; continue $sw17; }
                    r0 = r4[r1];
                    if (r0 == null) { $pc17 = 12; continue $sw17; }
                    if (r0.a() != 1) { $pc17 = 12; continue $sw17; }
                    if (((a.b.b.s) r0).c().equals(r7) == false) { $pc17 = 12; continue $sw17; }
                    return r1;
                }
                case 12: {
                    r1 = r1 + 1;
                    { $pc17 = 3; continue $sw17; }
                }
                case 19: {
                    return a(new a.b.b.s(r7));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int c(java.lang.String r2, int r3, a.b.c r4, a.b.i r5) {
        return c(a(r2, r4), r3, r4, r5);
    }

    public int c(java.lang.String r2, java.lang.String r3, java.lang.String r4, a.b.c r5, a.b.i r6) {
        return c(r2, a(r3, r4), r5, r6);
    }
}
