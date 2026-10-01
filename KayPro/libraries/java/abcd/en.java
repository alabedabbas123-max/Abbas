package abcd;

public final class en {
    private final abcd.Ls DW;
    private final int[] FH;
    private int Hw;
    private final abcd.Pt j6;
    private abcd.Interfacexn v5;

    public en(abcd.Pt r2) {
        int r0 = r2.Zo(8);
        this.j6 = r2;
        this.DW = new abcd.Ls(r0);
        this.FH = new int[r0];
        this.Hw = -1;
    }

    private void FH() {
        int r1 = 0;
        int r2 = 0;
        int[] r3 = null;
        int r4 = 0;
        int r5 = 0;
        abcd.wn r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = 1;
                    r2 = 10;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    r3 = this.FH;
                    if (r1 >= r3.length) { $pc0 = 15; continue $sw0; }
                    r3[r1] = r2;
                    r4 = this.j6.v5(r2);
                    switch(r4) {
                        case 1: { $pc0 = 12; continue $sw0; }
                        case 2: { $pc0 = 7; continue $sw0; }
                        case 3: { $pc0 = 11; continue $sw0; }
                        case 4: { $pc0 = 11; continue $sw0; }
                        case 5: { $pc0 = 10; continue $sw0; }
                        case 6: { $pc0 = 10; continue $sw0; }
                        case 7: { $pc0 = 9; continue $sw0; }
                        case 8: { $pc0 = 9; continue $sw0; }
                        case 9: { $pc0 = 11; continue $sw0; }
                        case 10: { $pc0 = 11; continue $sw0; }
                        case 11: { $pc0 = 11; continue $sw0; }
                        case 12: { $pc0 = 11; continue $sw0; }
                        default: { $pc0 = 7; continue $sw0; }
                    };
                }
                case 9: {
                    r2 = r2 + 3;
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    r5 = 1;
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    r1 = r1 + r5;
                    { $pc0 = 3; continue $sw0; }
                }
                case 10: {
                    r5 = 2;
                    r2 = r2 + 9;
                    { $pc0 = 14; continue $sw0; }
                }
                case 11: {
                    r2 = r2 + 5;
                    { $pc0 = 13; continue $sw0; }
                }
                case 12: {
                    r2 = r2 + (this.j6.Zo(r2 + 1) + 3);
                    { $pc0 = 13; continue $sw0; }
                }
                case 7: {
                    r0 = new abcd.wn("unknown tag byte: " + abcd.Yt.Hw(r4));
                    r0.j6("...while preparsing cst " + abcd.Yt.v5(r1) + " at offset " + abcd.Yt.gn(r2));
                    throw r0;
                }
                case 15: {
                    this.Hw = r2;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Hw() {
        abcd.Interfacexn r0 = null;
        int r2 = 0;
        java.util.BitSet r1 = null;
        int r3 = 0;
        int[] r4 = null;
        abcd.Abstractms r5 = null;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int[] r9 = null;
        int r10 = 0;
        java.lang.StringBuilder r11 = null;
        java.lang.String r12 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    FH();
                    r0 = this.v5;
                    r2 = 1;
                    if (r0 == null) { $pc1 = 5; continue $sw1; }
                    r0.j6(this.j6, 8, 2, "constant_pool_count: " + abcd.Yt.v5(this.FH.length));
                    this.v5.j6(this.j6, 10, 0, "\nconstant_pool:");
                    this.v5.j6(1);
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    r1 = new java.util.BitSet(this.FH.length);
                    r3 = 1;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r4 = this.FH;
                    if (r3 >= r4.length) { $pc1 = 15; continue $sw1; }
                    if (r4[r3] == 0) { $pc1 = 13; continue $sw1; }
                    if (this.DW.DW(r3) != null) { $pc1 = 13; continue $sw1; }
                    j6(r3, r1);
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    r3 = r3 + 1;
                    { $pc1 = 6; continue $sw1; }
                }
                case 15: {
                    if (this.v5 != null) { $pc1 = 17; continue $sw1; }
                    return;
                }
                case 17: {
                    if (r2 >= this.FH.length) { $pc1 = 34; continue $sw1; }
                    r5 = this.DW.DW(r2);
                    if (r5 == null) { $pc1 = 33; continue $sw1; }
                    r6 = this.FH[r2];
                    r7 = this.Hw;
                    r8 = r2 + 1;
                    $pc1 = 22; continue $sw1;
                }
                case 22: {
                    r9 = this.FH;
                    if (r8 >= r9.length) { $pc1 = 29; continue $sw1; }
                    r10 = r9[r8];
                    if (r10 != 0) { $pc1 = 26; continue $sw1; }
                    r8 = r8 + 1;
                    { $pc1 = 22; continue $sw1; }
                }
                case 26: {
                    r7 = r10;
                    $pc1 = 29; continue $sw1;
                }
                case 29: {
                    if (r1.get(r2) == false) { $pc1 = 31; continue $sw1; }
                    r11 = new java.lang.StringBuilder();
                    r11.append(abcd.Yt.v5(r2));
                    r11.append(": utf8{\"");
                    r11.append(r5.aM());
                    r12 = "\"}";
                    $pc1 = 32; continue $sw1;
                }
                case 32: {
                    r11.append(r12);
                    this.v5.j6(this.j6, r6, r7 - r6, r11.toString());
                    { $pc1 = 33; continue $sw1; }
                }
                case 31: {
                    r11 = new java.lang.StringBuilder();
                    r11.append(abcd.Yt.v5(r2));
                    r11.append(": ");
                    r12 = r5.toString();
                    $pc1 = 33; continue $sw1;
                }
                case 33: {
                    r2 = r2 + 1;
                    { $pc1 = 17; continue $sw1; }
                }
                case 34: {
                    this.v5.j6(-1);
                    this.v5.j6(this.j6, this.Hw, 0, "end constant_pool");
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.Js j6(int r3) {
        int r0 = 0;
        int r4 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.j6.Zo(r3 + 1);
                    r4 = r3 + 3;
                    return new abcd.Js(this.j6.j6(r4, r0 + r4));
                }
                case 5: {
                    e = $ex2;
                    throw new abcd.wn(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.Abstractms j6(int r7, java.util.BitSet r8) {
        abcd.Abstractms r2 = null;
        int r3 = 0;
        abcd.wn r4 = null;
        abcd.Abstractms r5 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r2 = this.DW.DW(r7);
                    if (r2 == null) { $pc3 = 5; continue $sw3; }
                    return r2;
                }
                case 5: {
                    r3 = this.FH[r7];
                    $pc3 = 26; continue $sw3;
                }
                case 26: {
                    e = $ex3;
                    e.j6("...while parsing cst " + abcd.Yt.v5(r7) + " at offset " + abcd.Yt.gn(r3));
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 23: {
                    e = $ex3;
                    r4 = new abcd.wn(e);
                    r4.j6("...while parsing cst " + abcd.Yt.v5(r7) + " at offset " + abcd.Yt.gn(r3));
                    throw r4;
                }
                case 7: {
                    try {
                        switch(this.j6.v5(r3)) {
                            case 1: { $pc3 = 20; continue $sw3; }
                            case 2: { $pc3 = 21; continue $sw3; }
                            case 3: { $pc3 = 19; continue $sw3; }
                            case 4: { $pc3 = 18; continue $sw3; }
                            case 5: { $pc3 = 17; continue $sw3; }
                            case 6: { $pc3 = 16; continue $sw3; }
                            case 7: { $pc3 = 15; continue $sw3; }
                            case 8: { $pc3 = 14; continue $sw3; }
                            case 9: { $pc3 = 12; continue $sw3; }
                            case 10: { $pc3 = 11; continue $sw3; }
                            case 11: { $pc3 = 10; continue $sw3; }
                            case 12: { $pc3 = 9; continue $sw3; }
                            default: { $pc3 = 21; continue $sw3; }
                        };
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc3 = 23; continue $sw3; }
                        if ($t instanceof abcd.wn) { $pc3 = 26; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 9: {
                    try {
                        r5 = new abcd.Hs((abcd.Js) j6(this.j6.Zo(r3 + 1), r8), (abcd.Js) j6(this.j6.Zo(r3 + 3), r8));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc3 = 23; continue $sw3; }
                        if ($t instanceof abcd.wn) { $pc3 = 26; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    r2 = r5;
                    { $pc3 = 21; continue $sw3; }
                }
                case 10: {
                    try {
                        r5 = new abcd.zs((abcd.Ks) j6(this.j6.Zo(r3 + 1), r8), (abcd.Hs) j6(this.j6.Zo(r3 + 3), r8));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc3 = 23; continue $sw3; }
                        if ($t instanceof abcd.wn) { $pc3 = 26; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc3 = 13; continue $sw3; }
                }
                case 11: {
                    try {
                        r5 = new abcd.Gs((abcd.Ks) j6(this.j6.Zo(r3 + 1), r8), (abcd.Hs) j6(this.j6.Zo(r3 + 3), r8));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc3 = 23; continue $sw3; }
                        if ($t instanceof abcd.wn) { $pc3 = 26; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc3 = 13; continue $sw3; }
                }
                case 12: {
                    try {
                        r5 = new abcd.ws((abcd.Ks) j6(this.j6.Zo(r3 + 1), r8), (abcd.Hs) j6(this.j6.Zo(r3 + 3), r8));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc3 = 23; continue $sw3; }
                        if ($t instanceof abcd.wn) { $pc3 = 26; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc3 = 13; continue $sw3; }
                }
                case 14: {
                    try {
                        r2 = j6(this.j6.Zo(r3 + 1), r8);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc3 = 23; continue $sw3; }
                        if ($t instanceof abcd.wn) { $pc3 = 26; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc3 = 21; continue $sw3; }
                }
                case 15: {
                    try {
                        r2 = new abcd.Ks(abcd.Qs.DW(((abcd.Js) j6(this.j6.Zo(r3 + 1), r8)).we()));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc3 = 23; continue $sw3; }
                        if ($t instanceof abcd.wn) { $pc3 = 26; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc3 = 21; continue $sw3; }
                }
                case 16: {
                    try {
                        r2 = abcd.us.j6(this.j6.FH(r3 + 1));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc3 = 23; continue $sw3; }
                        if ($t instanceof abcd.wn) { $pc3 = 26; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc3 = 21; continue $sw3; }
                }
                case 17: {
                    try {
                        r2 = abcd.Es.j6(this.j6.FH(r3 + 1));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc3 = 23; continue $sw3; }
                        if ($t instanceof abcd.wn) { $pc3 = 26; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc3 = 21; continue $sw3; }
                }
                case 18: {
                    try {
                        r2 = abcd.xs.j6(this.j6.DW(r3 + 1));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc3 = 23; continue $sw3; }
                        if ($t instanceof abcd.wn) { $pc3 = 26; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc3 = 21; continue $sw3; }
                }
                case 19: {
                    try {
                        r2 = abcd.ys.j6(this.j6.DW(r3 + 1));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc3 = 23; continue $sw3; }
                        if ($t instanceof abcd.wn) { $pc3 = 26; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc3 = 21; continue $sw3; }
                }
                case 20: {
                    try {
                        r2 = j6(r3);
                        r8.set(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc3 = 23; continue $sw3; }
                        if ($t instanceof abcd.wn) { $pc3 = 26; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc3 = 21; continue $sw3;
                }
                case 21: {
                    this.DW.j6(r7, r2);
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void v5() {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.Hw >= 0) { $pc4 = 6; continue $sw4; }
                    Hw();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Ls DW() {
        v5();
        return this.DW;
    }

    public int j6() {
        v5();
        return this.Hw;
    }

    public void j6(abcd.Interfacexn r1) {
        this.v5 = r1;
    }
}
