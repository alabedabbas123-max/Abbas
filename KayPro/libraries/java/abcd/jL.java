package abcd;

public class jL {
    private abcd.lL DW;
    private abcd.mL FH;
    private int Hw;
    private java.util.LinkedList j6;

    public jL() {
        this.DW = new abcd.lL(null);
        this.FH = null;
        this.Hw = 0;
    }

    private java.util.Map DW(abcd.InterfaceiL r1) {
        java.util.Map r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1 == null) { $pc0 = 4; continue $sw0; }
                    r2 = r1.j6();
                    if (r2 == null) { $pc0 = 8; continue $sw0; }
                    return r2;
                }
                case 8: {
                    return new abcd.fL();
                }
                case 4: {
                    return new abcd.fL();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.FH = this.DW.DW();
                    if (this.FH != null) { $pc1 = 6; continue $sw1; }
                    this.FH = new abcd.mL(-1, null);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int j6(java.util.LinkedList r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2.size() != 0) { $pc2 = 7; continue $sw2; }
                    return -1;
                }
                case 7: {
                    return ((java.lang.Integer) r2.getFirst()).intValue();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.util.List j6(abcd.InterfaceiL r1) {
        java.util.List r2 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r1 == null) { $pc3 = 4; continue $sw3; }
                    r2 = r1.DW();
                    if (r2 == null) { $pc3 = 8; continue $sw3; }
                    return r2;
                }
                case 8: {
                    return new abcd.dL();
                }
                case 4: {
                    return new abcd.dL();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW() {
        this.FH = null;
        this.Hw = 0;
        this.j6 = null;
    }

    public void DW(java.io.Reader r2) {
        this.DW.j6(r2);
        DW();
    }

    public int j6() {
        return this.DW.j6();
    }

    public java.lang.Object j6(java.io.Reader r2) {
        return j6(r2, null);
    }

    public java.lang.Object j6(java.io.Reader r9, abcd.InterfaceiL r10) {
        java.util.LinkedList r11 = null;
        java.util.LinkedList r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.String r3 = null;
        java.util.Map r4 = null;
        java.lang.Object r6 = null;
        java.lang.String r5 = null;
        java.util.Map r7 = null;
        java.lang.String r8 = null;
        int r12 = 0;
        int r13 = 0;
        java.util.List r14 = null;
        java.util.List r15 = null;
        java.util.List r16 = null;
        java.util.Map r17 = null;
        int r18 = 0;
        int r19 = 0;
        java.lang.Object r20 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    DW(r9);
                    r11 = new java.util.LinkedList();
                    r0 = new java.util.LinkedList();
                    $pc4 = 80; continue $sw4;
                }
                case 80: {
                    try {
                        FH();
                        r1 = this.Hw;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r1 == (-1)) { $pc4 = 75; continue $sw4; }
                    if (r1 == 0) { $pc4 = 56; continue $sw4; }
                    if (r1 == 1) { $pc4 = 51; continue $sw4; }
                    if (r1 == 2) { $pc4 = 39; continue $sw4; }
                    if (r1 == 3) { $pc4 = 25; continue $sw4; }
                    if (r1 != 4) { $pc4 = 66; continue $sw4; }
                    try {
                        r2 = this.FH.j6;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r2 == 0) { $pc4 = 23; continue $sw4; }
                    if (r2 == 1) { $pc4 = 22; continue $sw4; }
                    if (r2 != 3) { $pc4 = 18; continue $sw4; }
                    try {
                        r11.removeFirst();
                        r3 = (java.lang.String) r0.removeFirst();
                        r4 = (java.util.Map) r0.getFirst();
                        r6 = j6(r10);
                        r4.put(r3, r6);
                        this.Hw = 3;
                        r11.addFirst(new java.lang.Integer(this.Hw));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc4 = 21; continue $sw4;
                }
                case 21: {
                    try {
                        r0.addFirst(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc4 = 66; continue $sw4; }
                }
                case 18: {
                    if (r2 == 6) { $pc4 = 66; continue $sw4; }
                    $pc4 = 19; continue $sw4;
                }
                case 19: {
                    try {
                        this.Hw = -1;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc4 = 66; continue $sw4; }
                }
                case 22: {
                    try {
                        r11.removeFirst();
                        r5 = (java.lang.String) r0.removeFirst();
                        r7 = (java.util.Map) r0.getFirst();
                        r6 = DW(r10);
                        r7.put(r5, r6);
                        this.Hw = 2;
                        r11.addFirst(new java.lang.Integer(this.Hw));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc4 = 21; continue $sw4; }
                }
                case 23: {
                    try {
                        r11.removeFirst();
                        r8 = (java.lang.String) r0.removeFirst();
                        ((java.util.Map) r0.getFirst()).put(r8, this.FH.DW);
                        r12 = j6(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc4 = 24; continue $sw4;
                }
                case 24: {
                    try {
                        this.Hw = r12;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc4 = 66; continue $sw4;
                }
                case 66: {
                    if (this.Hw == (-1)) { $pc4 = 73; continue $sw4; }
                    if (this.FH.j6 != (-1)) { $pc4 = 80; continue $sw4; }
                    throw new abcd.kL(j6(), 1, this.FH);
                }
                case 73: {
                    try {
                        throw new abcd.kL(j6(), 1, this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 25: {
                    try {
                        r13 = this.FH.j6;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r13 == 0) { $pc4 = 38; continue $sw4; }
                    if (r13 == 1) { $pc4 = 37; continue $sw4; }
                    if (r13 == 3) { $pc4 = 36; continue $sw4; }
                    if (r13 == 4) { $pc4 = 33; continue $sw4; }
                    if (r13 == 5) { $pc4 = 66; continue $sw4; }
                    $pc4 = 33; continue $sw4;
                }
                case 33: {
                    if (r0.size() <= 1) { $pc4 = 35; continue $sw4; }
                    try {
                        r11.removeFirst();
                        r0.removeFirst();
                        r12 = j6(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc4 = 35; continue $sw4;
                }
                case 35: {
                    try {
                        this.Hw = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc4 = 66; continue $sw4; }
                }
                case 36: {
                    try {
                        r14 = (java.util.List) r0.getFirst();
                        r15 = j6(r10);
                        r14.add(r15);
                        this.Hw = 3;
                        r11.addFirst(new java.lang.Integer(this.Hw));
                        r0.addFirst(r15);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc4 = 66; continue $sw4; }
                }
                case 37: {
                    try {
                        r16 = (java.util.List) r0.getFirst();
                        r17 = DW(r10);
                        r16.add(r17);
                        this.Hw = 2;
                        r11.addFirst(new java.lang.Integer(this.Hw));
                        r0.addFirst(r17);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc4 = 66; continue $sw4; }
                }
                case 38: {
                    try {
                        ((java.util.List) r0.getFirst()).add(this.FH.DW);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc4 = 66; continue $sw4; }
                }
                case 39: {
                    try {
                        r18 = this.FH.j6;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r18 == 0) { $pc4 = 48; continue $sw4; }
                    if (r18 == 2) { $pc4 = 45; continue $sw4; }
                    if (r18 == 5) { $pc4 = 66; continue $sw4; }
                    $pc4 = 45; continue $sw4;
                }
                case 45: {
                    if (r0.size() <= 1) { $pc4 = 35; continue $sw4; }
                    try {
                        r11.removeFirst();
                        r0.removeFirst();
                        r12 = j6(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc4 = 24; continue $sw4; }
                }
                case 48: {
                    if ((this.FH.DW instanceof java.lang.String) == false) { $pc4 = 19; continue $sw4; }
                    try {
                        r0.addFirst((java.lang.String) this.FH.DW);
                        this.Hw = 4;
                        r11.addFirst(new java.lang.Integer(this.Hw));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc4 = 66; continue $sw4; }
                }
                case 51: {
                    if (this.FH.j6 != (-1)) { $pc4 = 55; continue $sw4; }
                    return r0.removeFirst();
                }
                case 55: {
                    try {
                        throw new abcd.kL(j6(), 1, this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 56: {
                    try {
                        r19 = this.FH.j6;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r19 == 0) { $pc4 = 64; continue $sw4; }
                    if (r19 == 1) { $pc4 = 63; continue $sw4; }
                    if (r19 != 3) { $pc4 = 19; continue $sw4; }
                    try {
                        this.Hw = 3;
                        r11.addFirst(new java.lang.Integer(this.Hw));
                        r20 = j6(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc4 = 62; continue $sw4;
                }
                case 62: {
                    try {
                        r0.addFirst(r20);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc4 = 66; continue $sw4; }
                }
                case 63: {
                    try {
                        this.Hw = 2;
                        r11.addFirst(new java.lang.Integer(this.Hw));
                        r20 = DW(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc4 = 62; continue $sw4; }
                }
                case 64: {
                    try {
                        this.Hw = 1;
                        r11.addFirst(new java.lang.Integer(this.Hw));
                        r20 = this.FH.DW;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc4 = 62; continue $sw4; }
                }
                case 75: {
                    try {
                        throw new abcd.kL(j6(), 1, this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 76; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 76: {
                    e = $ex4;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.Object j6(java.lang.String r2) {
        return j6(r2, null);
    }

    public java.lang.Object j6(java.lang.String r3, abcd.InterfaceiL r4) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    return j6(new java.io.StringReader(r3), r4);
                }
                case 5: {
                    e = $ex5;
                    throw new abcd.kL(-1, 2, e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
