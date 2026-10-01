package a.b.b;

public class p extends a.b.b.b {

    public java.lang.Object f98a;

    public p() {
    }

    public p(java.lang.Object r1) {
        this.f98a = r1;
    }

    @Override
    public int a() {
        return 21;
    }

    @Override
    public void a(a.b.c r1, a.b.b.a.f r2) {
        r2.a(r1, this);
    }

    public void a(a.b.c r8, a.b.b.a.i r9) {
        int r1 = 0;
        boolean[] r0 = null;
        byte[] r2 = null;
        char[] r3 = null;
        short[] r4 = null;
        int[] r5 = null;
        float[] r6 = null;
        long[] r7 = null;
        int r10 = 0;
        double[] r11 = null;
        int r12 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = 0;
                    if ((this.f98a instanceof boolean[]) == false) { $pc0 = 9; continue $sw0; }
                    r0 = (boolean[]) this.f98a;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r1 >= r0.length) { $pc0 = 59; continue $sw0; }
                    r9.a(r8, this, r1, r0[r1]);
                    r1 = r1 + 1;
                    { $pc0 = 6; continue $sw0; }
                }
                case 59: {
                    return;
                }
                case 9: {
                    if ((this.f98a instanceof byte[]) == false) { $pc0 = 15; continue $sw0; }
                    r2 = (byte[]) this.f98a;
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    if (r1 >= r2.length) { $pc0 = 60; continue $sw0; }
                    r9.a(r8, this, r1, r2[r1]);
                    r1 = r1 + 1;
                    { $pc0 = 12; continue $sw0; }
                }
                case 60: {
                    return;
                }
                case 15: {
                    if ((this.f98a instanceof char[]) == false) { $pc0 = 21; continue $sw0; }
                    r3 = (char[]) this.f98a;
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    if (r1 >= r3.length) { $pc0 = 61; continue $sw0; }
                    r9.a(r8, this, r1, r3[r1]);
                    r1 = r1 + 1;
                    { $pc0 = 18; continue $sw0; }
                }
                case 61: {
                    return;
                }
                case 21: {
                    if ((this.f98a instanceof short[]) == false) { $pc0 = 27; continue $sw0; }
                    r4 = (short[]) this.f98a;
                    $pc0 = 24; continue $sw0;
                }
                case 24: {
                    if (r1 >= r4.length) { $pc0 = 62; continue $sw0; }
                    r9.a(r8, this, r1, r4[r1]);
                    r1 = r1 + 1;
                    { $pc0 = 24; continue $sw0; }
                }
                case 62: {
                    return;
                }
                case 27: {
                    if ((this.f98a instanceof int[]) == false) { $pc0 = 33; continue $sw0; }
                    r5 = (int[]) this.f98a;
                    $pc0 = 30; continue $sw0;
                }
                case 30: {
                    if (r1 >= r5.length) { $pc0 = 63; continue $sw0; }
                    r9.a(r8, this, r1, r5[r1]);
                    r1 = r1 + 1;
                    { $pc0 = 30; continue $sw0; }
                }
                case 63: {
                    return;
                }
                case 33: {
                    if ((this.f98a instanceof float[]) == false) { $pc0 = 39; continue $sw0; }
                    r6 = (float[]) this.f98a;
                    $pc0 = 36; continue $sw0;
                }
                case 36: {
                    if (r1 >= r6.length) { $pc0 = 64; continue $sw0; }
                    r9.a(r8, this, r1, r6[r1]);
                    r1 = r1 + 1;
                    { $pc0 = 36; continue $sw0; }
                }
                case 64: {
                    return;
                }
                case 39: {
                    if ((this.f98a instanceof long[]) == false) { $pc0 = 45; continue $sw0; }
                    r7 = (long[]) this.f98a;
                    r10 = 0;
                    $pc0 = 42; continue $sw0;
                }
                case 42: {
                    if (r10 >= r7.length) { $pc0 = 65; continue $sw0; }
                    r9.a(r8, this, r10, r7[r10]);
                    r10 = r10 + 1;
                    { $pc0 = 42; continue $sw0; }
                }
                case 65: {
                    return;
                }
                case 45: {
                    if ((this.f98a instanceof double[]) == false) { $pc0 = 50; continue $sw0; }
                    r11 = (double[]) this.f98a;
                    r12 = 0;
                    $pc0 = 48; continue $sw0;
                }
                case 48: {
                    if (r12 >= r11.length) { $pc0 = 66; continue $sw0; }
                    r9.a(r8, this, r12, r11[r12]);
                    r12 = r12 + 1;
                    { $pc0 = 48; continue $sw0; }
                }
                case 66: {
                    return;
                }
                case 50: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public char b() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((this.f98a instanceof boolean[]) == false) { $pc1 = 7; continue $sw1; }
                    return 'Z';
                }
                case 7: {
                    if ((this.f98a instanceof byte[]) == false) { $pc1 = 10; continue $sw1; }
                    return 'B';
                }
                case 10: {
                    if ((this.f98a instanceof char[]) == false) { $pc1 = 13; continue $sw1; }
                    return 'C';
                }
                case 13: {
                    if ((this.f98a instanceof short[]) == false) { $pc1 = 16; continue $sw1; }
                    return 'S';
                }
                case 16: {
                    if ((this.f98a instanceof int[]) == false) { $pc1 = 19; continue $sw1; }
                    return 'I';
                }
                case 19: {
                    if ((this.f98a instanceof float[]) == false) { $pc1 = 22; continue $sw1; }
                    return 'F';
                }
                case 22: {
                    if ((this.f98a instanceof long[]) == false) { $pc1 = 25; continue $sw1; }
                    return 'J';
                }
                case 25: {
                    if ((this.f98a instanceof double[]) == false) { $pc1 = 27; continue $sw1; }
                    return 'D';
                }
                case 27: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int c() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if ((this.f98a instanceof boolean[]) == false) { $pc2 = 7; continue $sw2; }
                    return ((boolean[]) this.f98a).length;
                }
                case 7: {
                    if ((this.f98a instanceof byte[]) == false) { $pc2 = 10; continue $sw2; }
                    return ((byte[]) this.f98a).length;
                }
                case 10: {
                    if ((this.f98a instanceof char[]) == false) { $pc2 = 13; continue $sw2; }
                    return ((char[]) this.f98a).length;
                }
                case 13: {
                    if ((this.f98a instanceof short[]) == false) { $pc2 = 16; continue $sw2; }
                    return ((short[]) this.f98a).length;
                }
                case 16: {
                    if ((this.f98a instanceof int[]) == false) { $pc2 = 19; continue $sw2; }
                    return ((int[]) this.f98a).length;
                }
                case 19: {
                    if ((this.f98a instanceof float[]) == false) { $pc2 = 22; continue $sw2; }
                    return ((float[]) this.f98a).length;
                }
                case 22: {
                    if ((this.f98a instanceof long[]) == false) { $pc2 = 25; continue $sw2; }
                    return ((long[]) this.f98a).length;
                }
                case 25: {
                    if ((this.f98a instanceof double[]) == true) { $pc2 = 34; continue $sw2; }
                    return 0;
                }
                case 34: {
                    return ((double[]) this.f98a).length;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.Object d() {
        return this.f98a;
    }
}
