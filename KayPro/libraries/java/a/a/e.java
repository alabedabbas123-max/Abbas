package a.a;

public class e {

    public a.b.k f5a;
    public int b;
    public a.b.a.b c;
    public java.lang.String d;
    public java.lang.String[] e;
    public java.lang.String[] f;
    public java.lang.String g;
    public java.lang.String h;
    public int i;
    public java.lang.String j;
    public java.lang.String k;
    public java.lang.String l;
    public a.b.c m;
    public a.b.j n;
    public a.b.k o;

    public e(a.b.k r1, int r2, a.b.a.b r3, java.lang.String r4, java.lang.String[] r5, java.lang.String[] r6, java.lang.String r7, java.lang.String r8, int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, a.b.c r13, a.b.j r14) {
        this.f5a = r1;
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
    }

    public java.lang.String a() {
        return java.lang.String.format("%s$$Lambda$%d", new java.lang.Object[]{this.f5a.b(), java.lang.Integer.valueOf(this.b)});
    }

    public java.lang.String b() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (d() == false) { $pc0 = 7; continue $sw0; }
                    return "()V";
                }
                case 7: {
                    return this.d.substring(0, this.d.indexOf(41) + 1) + 'V';
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean c() {
        java.lang.String[] r2 = null;
        int r3 = 0;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r2 = this.e;
                    r3 = r2.length;
                    r1 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r1 >= r3) { $pc1 = 11; continue $sw1; }
                    if ("java/io/Serializable".equals(r2[r1]) == true) { $pc1 = 6; continue $sw1; }
                    r1 = r1 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 6: {
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean d() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (a.b.f.i.t(this.d) != 0) { $pc2 = 6; continue $sw2; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean e() {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.i == 6) { $pc3 = 5; continue $sw3; }
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    return false;
                }
                case 5: {
                    if (this.m == null) { $pc3 = 10; continue $sw3; }
                    if ((this.m.a() & 512) == 0) { $pc3 = 10; continue $sw3; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean f() {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.m != null) { $pc4 = 5; continue $sw4; }
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    return false;
                }
                case 5: {
                    if (new a.b.f.r().a(this.o, this.m, this.k, this.l) != null) { $pc4 = 8; continue $sw4; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
