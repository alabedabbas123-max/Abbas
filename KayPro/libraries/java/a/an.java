package a;

public abstract class an {

    private java.io.File f21a;
    private java.net.URL b;
    private a.an c;
    private java.lang.String d;
    private int e;
    private int f;
    private java.lang.String g;
    private java.lang.String h;

    protected an(java.io.File r1) {
        this.f21a = r1;
    }

    private boolean a(char r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 != '-') { $pc0 = 6; continue $sw0; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean a(char r2, boolean r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r2 != '(') { $pc1 = 5; continue $sw1; }
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    return true;
                }
                case 5: {
                    if (r2 == ')') { $pc1 = 13; continue $sw1; }
                    if (r2 == ',') { $pc1 = 13; continue $sw1; }
                    if (r2 == ';') { $pc1 = 13; continue $sw1; }
                    if (r3 == true) { $pc1 = 12; continue $sw1; }
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    return false;
                }
                case 12: {
                    if (r2 != java.io.File.pathSeparatorChar) { $pc1 = 15; continue $sw1; }
                    { $pc1 = 13; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean b(char r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 != '#') { $pc2 = 6; continue $sw2; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean c(char r2) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (d(r2) == false) { $pc3 = 5; continue $sw3; }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return true;
                }
                case 5: {
                    if (e(r2) == true) { $pc3 = 6; continue $sw3; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean d(char r2) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r2 != '@') { $pc4 = 6; continue $sw4; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean e(char r2) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r2 != '{') { $pc5 = 5; continue $sw5; }
                    $pc5 = 16; continue $sw5;
                }
                case 16: {
                    return true;
                }
                case 5: {
                    if (r2 == '}') { $pc5 = 16; continue $sw5; }
                    if (r2 == '(') { $pc5 = 16; continue $sw5; }
                    if (r2 == ')') { $pc5 = 16; continue $sw5; }
                    if (r2 == ',') { $pc5 = 16; continue $sw5; }
                    if (r2 == ';') { $pc5 = 16; continue $sw5; }
                    if (r2 == java.io.File.pathSeparatorChar) { $pc5 = 16; continue $sw5; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean f(char r2) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r2 != '\'') { $pc6 = 5; continue $sw6; }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    return true;
                }
                case 5: {
                    if (r2 == '\"') { $pc6 = 6; continue $sw6; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract java.lang.String a();

    public java.lang.String a(boolean r6, boolean r7) {
        java.lang.String r0 = null;
        int r2 = 0;
        char r1 = 0;
        int r3 = 0;
        int r4 = 0;
        char r5 = 0;
        boolean r8 = false;
        char r9 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    this.g = null;
                    if (this.c == null) { $pc7 = 10; continue $sw7; }
                    this.g = this.c.a(r6, r7);
                    if (this.g != null) { $pc7 = 7; continue $sw7; }
                    this.c.c();
                    this.c = null;
                    { $pc7 = 10; continue $sw7; }
                }
                case 7: {
                    return this.g;
                }
                case 10: {
                    if (this.d == null) { $pc7 = 22; continue $sw7; }
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    if (this.f >= this.e) { $pc7 = 17; continue $sw7; }
                    if (java.lang.Character.isWhitespace(this.d.charAt(this.f)) == false) { $pc7 = 17; continue $sw7; }
                    this.f++;
                    $pc7 = 17; continue $sw7;
                }
                case 17: {
                    if (this.f >= this.e) { $pc7 = 22; continue $sw7; }
                    if (b(this.d.charAt(this.f)) == false) { $pc7 = 22; continue $sw7; }
                    this.f = this.e;
                    $pc7 = 22; continue $sw7;
                }
                case 22: {
                    if (this.d != null) { $pc7 = 24; continue $sw7; }
                    $pc7 = 25; continue $sw7;
                }
                case 25: {
                    this.d = a();
                    if (this.d == null) { $pc7 = 117; continue $sw7; }
                    this.e = this.d.length();
                    this.f = 0;
                    $pc7 = 30; continue $sw7;
                }
                case 30: {
                    if (this.f >= this.e) { $pc7 = 35; continue $sw7; }
                    if (java.lang.Character.isWhitespace(this.d.charAt(this.f)) == false) { $pc7 = 35; continue $sw7; }
                    this.f++;
                    $pc7 = 35; continue $sw7;
                }
                case 35: {
                    if (this.f >= this.e) { $pc7 = 22; continue $sw7; }
                    if (b(this.d.charAt(this.f)) == false) { $pc7 = 22; continue $sw7; }
                    r0 = this.d.substring(this.f + 1);
                    if (this.h != null) { $pc7 = 41; continue $sw7; }
                    $pc7 = 40; continue $sw7;
                }
                case 40: {
                    this.h = r0;
                    this.f = this.e;
                    { $pc7 = 22; continue $sw7; }
                }
                case 41: {
                    r0 = this.h + '\n' + r0;
                    { $pc7 = 40; continue $sw7; }
                }
                case 117: {
                    return null;
                }
                case 24: {
                    if (this.f == this.e) { $pc7 = 25; continue $sw7; }
                    r2 = this.f;
                    r1 = this.d.charAt(r2);
                    if (f(r1) == false) { $pc7 = 53; continue $sw7; }
                    r3 = r2 + 1;
                    $pc7 = 45; continue $sw7;
                }
                case 45: {
                    this.f++;
                    if (this.f == this.e) { $pc7 = 47; continue $sw7; }
                    if (this.d.charAt(this.f) != r1) { $pc7 = 45; continue $sw7; }
                    r4 = this.f;
                    this.f = r4 + 1;
                    $pc7 = 52; continue $sw7;
                }
                case 52: {
                    this.g = this.d.substring(r3, r4);
                    return this.g;
                }
                case 47: {
                    this.g = this.d.substring(r3 - 1, this.f);
                    throw new java.io.IOException("Missing closing quote for " + g());
                }
                case 53: {
                    if (r6 == false) { $pc7 = 77; continue $sw7; }
                    if (a(r1) == true) { $pc7 = 77; continue $sw7; }
                    $pc7 = 57; continue $sw7;
                }
                case 57: {
                    if (this.f >= this.e) { $pc7 = 69; continue $sw7; }
                    r5 = this.d.charAt(this.f);
                    if (r7 == true) { $pc7 = 74; continue $sw7; }
                    r8 = true;
                    $pc7 = 62; continue $sw7;
                }
                case 62: {
                    if (a(r5, r8) == true) { $pc7 = 69; continue $sw7; }
                    if (a(r5) == true) { $pc7 = 68; continue $sw7; }
                    if (b(r5) == true) { $pc7 = 68; continue $sw7; }
                    $pc7 = 75; continue $sw7;
                }
                case 75: {
                    this.f++;
                    $pc7 = 68; continue $sw7;
                }
                case 68: {
                    if (java.lang.Character.isWhitespace(this.d.charAt(this.f - 1)) == false) { $pc7 = 75; continue $sw7; }
                    $pc7 = 74; continue $sw7;
                }
                case 74: {
                    r8 = false;
                    $pc7 = 69; continue $sw7;
                }
                case 69: {
                    r4 = this.f;
                    $pc7 = 70; continue $sw7;
                }
                case 70: {
                    if (r4 <= r2) { $pc7 = 89; continue $sw7; }
                    if (java.lang.Character.isWhitespace(this.d.charAt(r4 - 1)) == false) { $pc7 = 89; continue $sw7; }
                    r4 = r4 - 1;
                    $pc7 = 89; continue $sw7;
                }
                case 89: {
                    r3 = r2;
                    $pc7 = 77; continue $sw7;
                }
                case 77: {
                    if (c(r1) == false) { $pc7 = 81; continue $sw7; }
                    r4 = this.f + 1;
                    this.f = r4;
                    r3 = r2;
                    $pc7 = 81; continue $sw7;
                }
                case 81: {
                    if (this.f >= this.e) { $pc7 = 88; continue $sw7; }
                    r9 = this.d.charAt(this.f);
                    if (e(r9) == true) { $pc7 = 88; continue $sw7; }
                    if (java.lang.Character.isWhitespace(r9) == true) { $pc7 = 88; continue $sw7; }
                    if (b(r9) == true) { $pc7 = 88; continue $sw7; }
                    this.f++;
                    $pc7 = 88; continue $sw7;
                }
                case 88: {
                    r4 = this.f;
                    r3 = r2;
                    { $pc7 = 52; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a(a.an r2) {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (this.c != null) { $pc8 = 6; continue $sw8; }
                    this.c = r2;
                    return;
                }
                case 6: {
                    this.c.a(r2);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a(java.io.File r2) {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (this.c == null) { $pc9 = 6; continue $sw9; }
                    this.c.a(r2);
                    return;
                }
                case 6: {
                    this.f21a = r2;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract java.lang.String b();

    public void c() {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (this.c == null) { $pc10 = 6; continue $sw10; }
                    this.c.c();
                    this.c = null;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.io.File d() {
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    if (this.c == null) { $pc11 = 7; continue $sw11; }
                    return this.c.d();
                }
                case 7: {
                    return this.f21a;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.net.URL e() {
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (this.c == null) { $pc12 = 7; continue $sw12; }
                    return this.c.e();
                }
                case 7: {
                    return this.b;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String f() {
        java.lang.String r0 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    if (this.c != null) { $pc13 = 7; continue $sw13; }
                    r0 = this.h;
                    this.h = null;
                    return r0;
                }
                case 7: {
                    return this.c.f();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String g() {
        java.lang.StringBuilder r1 = null;
        java.lang.String r0 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r1 = new java.lang.StringBuilder();
                    if (this.c == null) { $pc14 = 5; continue $sw14; }
                    r0 = this.c.g() + ",\n  included from ";
                    $pc14 = 8; continue $sw14;
                }
                case 8: {
                    return r1.append(r0).append(b()).toString();
                }
                case 5: {
                    if (this.g != null) { $pc14 = 9; continue $sw14; }
                    r0 = "end of ";
                    { $pc14 = 8; continue $sw14; }
                }
                case 9: {
                    r0 = "'" + this.g + "' in ";
                    { $pc14 = 8; continue $sw14; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
