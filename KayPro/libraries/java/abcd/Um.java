package abcd;

public final class Um {
    public static abcd.Rs DW(abcd.Rs r2, abcd.Rs r3) {
        abcd.Qs r4 = null;
        abcd.Qs r5 = null;
        abcd.Qs r0 = null;
        abcd.Rs r6 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 != null) { $pc0 = 4; continue $sw0; }
                    $pc0 = 40; continue $sw0;
                }
                case 40: {
                    return r2;
                }
                case 4: {
                    if (r2.equals(r3) == true) { $pc0 = 40; continue $sw0; }
                    if (r3 != null) { $pc0 = 9; continue $sw0; }
                    return null;
                }
                case 9: {
                    r4 = r2.getType();
                    r5 = r3.getType();
                    if (r4 != r5) { $pc0 = 13; continue $sw0; }
                    return r4;
                }
                case 13: {
                    if (r4.vy() == false) { $pc0 = 34; continue $sw0; }
                    if (r5.vy() == false) { $pc0 = 34; continue $sw0; }
                    r0 = abcd.Qs.EQ;
                    if (r4 != r0) { $pc0 = 19; continue $sw0; }
                    return r5;
                }
                case 19: {
                    if (r5 != r0) { $pc0 = 22; continue $sw0; }
                    return r4;
                }
                case 22: {
                    if (r4.lg() == false) { $pc0 = 32; continue $sw0; }
                    if (r5.lg() == false) { $pc0 = 32; continue $sw0; }
                    r6 = DW(r4.we(), r5.we());
                    if (r6 != null) { $pc0 = 30; continue $sw0; }
                    return abcd.Qs.QX;
                }
                case 30: {
                    return ((abcd.Qs) r6).Hw();
                }
                case 32: {
                    return abcd.Qs.QX;
                }
                case 34: {
                    if (r4.gW() == true) { $pc0 = 36; continue $sw0; }
                    $pc0 = 39; continue $sw0;
                }
                case 39: {
                    return null;
                }
                case 36: {
                    if (r5.gW() == false) { $pc0 = 39; continue $sw0; }
                    return abcd.Qs.VH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Nm j6(abcd.Nm r6, abcd.Nm r7) {
        int r0 = 0;
        abcd.Nm r1 = null;
        int r2 = 0;
        abcd.Rs r3 = null;
        abcd.Rs r4 = null;
        abcd.Rs r5 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r6 != r7) { $pc1 = 4; continue $sw1; }
                    return r6;
                }
                case 4: {
                    r0 = r6.size();
                    r1 = null;
                    if (r7.size() != r0) { $pc1 = 26; continue $sw1; }
                    r2 = 0;
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r2 >= r0) { $pc1 = 21; continue $sw1; }
                    r3 = r6.DW(r2);
                    r4 = r7.DW(r2);
                    r5 = DW(r3, r4);
                    if (r5 == r3) { $pc1 = 20; continue $sw1; }
                    if (r1 != null) { $pc1 = 12; continue $sw1; }
                    r1 = r6.rN();
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    if (r5 == null) { $pc1 = 17; continue $sw1; }
                    try {
                        r1.j6(r2, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof abcd.an) { $pc1 = 14; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 17; continue $sw1;
                }
                case 14: {
                    e = $ex1;
                    e.j6("...while merging stack[" + abcd.Yt.v5(r2) + "]");
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 17: {
                    try {
                        throw new abcd.an("incompatible: " + r3 + ", " + r4);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof abcd.an) { $pc1 = 14; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 20: {
                    r2 = r2 + 1;
                    { $pc1 = 7; continue $sw1; }
                }
                case 21: {
                    if (r1 != null) { $pc1 = 23; continue $sw1; }
                    return r6;
                }
                case 23: {
                    r1.we();
                    return r1;
                }
                case 26: {
                    throw new abcd.an("mismatched stack depths");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Vm j6(abcd.Vm r5, abcd.Vm r6) {
        int r0 = 0;
        abcd.Vm r1 = null;
        int r2 = 0;
        abcd.Rs r3 = null;
        abcd.Rs r4 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r5 != r6) { $pc2 = 4; continue $sw2; }
                    return r5;
                }
                case 4: {
                    r0 = r5.er();
                    r1 = null;
                    if (r6.er() != r0) { $pc2 = 21; continue $sw2; }
                    r2 = 0;
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r2 >= r0) { $pc2 = 16; continue $sw2; }
                    r3 = r5.DW(r2);
                    r4 = DW(r3, r6.DW(r2));
                    if (r4 == r3) { $pc2 = 15; continue $sw2; }
                    if (r1 != null) { $pc2 = 12; continue $sw2; }
                    r1 = r5.lg();
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    if (r4 != null) { $pc2 = 14; continue $sw2; }
                    r1.FH(r2);
                    { $pc2 = 15; continue $sw2; }
                }
                case 14: {
                    r1.j6(r2, r4);
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    r2 = r2 + 1;
                    { $pc2 = 7; continue $sw2; }
                }
                case 16: {
                    if (r1 != null) { $pc2 = 18; continue $sw2; }
                    return r5;
                }
                case 18: {
                    r1.we();
                    return r1;
                }
                case 21: {
                    throw new abcd.an("mismatched maxLocals values");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(abcd.Rs r5, abcd.Rs r6) {
        abcd.Qs r7 = null;
        abcd.Qs r8 = null;
        int r0 = 0;
        int r2 = 0;
        abcd.Qs r1 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r7 = r5.getType();
                    r8 = r6.getType();
                    if (r7.equals(r8) == false) { $pc3 = 5; continue $sw3; }
                    return true;
                }
                case 5: {
                    r0 = r7.j3();
                    r2 = r8.j3();
                    if (r0 != 10) { $pc3 = 8; continue $sw3; }
                    r7 = abcd.Qs.QX;
                    r0 = 9;
                    $pc3 = 8; continue $sw3;
                }
                case 8: {
                    if (r2 != 10) { $pc3 = 11; continue $sw3; }
                    r8 = abcd.Qs.QX;
                    r2 = 9;
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    if (r0 != 9) { $pc3 = 43; continue $sw3; }
                    if (r2 != 9) { $pc3 = 43; continue $sw3; }
                    r1 = abcd.Qs.EQ;
                    if (r7 != r1) { $pc3 = 17; continue $sw3; }
                    return false;
                }
                case 17: {
                    if (r8 != r1) { $pc3 = 20; continue $sw3; }
                    return true;
                }
                case 20: {
                    if (r7 != abcd.Qs.QX) { $pc3 = 23; continue $sw3; }
                    return true;
                }
                case 23: {
                    if (r7.lg() == false) { $pc3 = 34; continue $sw3; }
                    if (r8.lg() == true) { $pc3 = 27; continue $sw3; }
                    return false;
                }
                case 27: {
                    r7 = r7.we();
                    r8 = r8.we();
                    if (r7.lg() == false) { $pc3 = 32; continue $sw3; }
                    if (r8.lg() == true) { $pc3 = 27; continue $sw3; }
                    $pc3 = 32; continue $sw3;
                }
                case 32: {
                    return j6(r7, r8);
                }
                case 34: {
                    if (r8.lg() == true) { $pc3 = 36; continue $sw3; }
                    return true;
                }
                case 36: {
                    if (r7 != abcd.Qs.XL) { $pc3 = 38; continue $sw3; }
                    return true;
                }
                case 38: {
                    if (r7 == abcd.Qs.Ws) { $pc3 = 54; continue $sw3; }
                    return false;
                }
                case 54: {
                    return true;
                }
                case 43: {
                    if (r7.gW() == true) { $pc3 = 45; continue $sw3; }
                    $pc3 = 47; continue $sw3;
                }
                case 47: {
                    return false;
                }
                case 45: {
                    if (r8.gW() == false) { $pc3 = 47; continue $sw3; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
