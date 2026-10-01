package a;

public class ae {

    public int f14a;
    public int b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.util.List f;

    public ae() {
        this(0, 0, null, null, null);
    }

    public ae(int r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        this.f = null;
        this.f14a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r6;
    }

    public boolean equals(java.lang.Object r4) {
        a.ae r5 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r4 != null) { $pc0 = 5; continue $sw0; }
                    return false;
                }
                case 5: {
                    if (getClass() != r4.getClass()) { $pc0 = 33; continue $sw0; }
                    r5 = (a.ae) r4;
                    if (this.f14a == r5.f14a) { $pc0 = 10; continue $sw0; }
                    return false;
                }
                case 10: {
                    if (this.b == r5.b) { $pc0 = 12; continue $sw0; }
                    return false;
                }
                case 12: {
                    if (this.c != null) { $pc0 = 25; continue $sw0; }
                    if (r5.c == null) { $pc0 = 16; continue $sw0; }
                    return false;
                }
                case 16: {
                    if (this.d != null) { $pc0 = 28; continue $sw0; }
                    if (r5.d == null) { $pc0 = 20; continue $sw0; }
                    return false;
                }
                case 20: {
                    if (this.e != null) { $pc0 = 31; continue $sw0; }
                    if (r5.e != null) { $pc0 = 38; continue $sw0; }
                    $pc0 = 23; continue $sw0;
                }
                case 23: {
                    return true;
                }
                case 38: {
                    return false;
                }
                case 31: {
                    if (this.e.equals(r5.e) == true) { $pc0 = 23; continue $sw0; }
                    return false;
                }
                case 28: {
                    if (this.d.equals(r5.d) == true) { $pc0 = 20; continue $sw0; }
                    return false;
                }
                case 25: {
                    if (this.c.equals(r5.c) == true) { $pc0 = 16; continue $sw0; }
                    return false;
                }
                case 33: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        int r1 = 0;
        int r2 = 0;
        int r0 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r1 = 0;
                    r2 = this.b ^ this.f14a;
                    if (this.c != null) { $pc1 = 12; continue $sw1; }
                    r0 = 0;
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    r3 = r2 ^ r0;
                    if (this.d != null) { $pc1 = 13; continue $sw1; }
                    r4 = 0;
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    r5 = r4 ^ r3;
                    if (this.e == null) { $pc1 = 11; continue $sw1; }
                    r1 = this.e.hashCode();
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    return r5 ^ r1;
                }
                case 13: {
                    r4 = this.d.hashCode();
                    { $pc1 = 8; continue $sw1; }
                }
                case 12: {
                    r0 = this.c.hashCode();
                    { $pc1 = 5; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
