package abcd;

public class Xt extends abcd.hu implements abcd.Interfacelu {
    private java.lang.Object[] DW;

    public Xt(int r2) {
        boolean r0 = false;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == 0) { $pc0 = 4; continue $sw0; }
                    r0 = true;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    super(r0);
                    try {
                        this.DW = new java.lang.Object[r2];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NegativeArraySizeException) { $pc0 = 8; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException("size < 0");
                }
                case 4: {
                    r0 = false;
                    { $pc0 = 5; continue $sw0; }
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.Object Hw(int r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r2 >= 0) { $pc1 = 6; continue $sw1; }
                    throw new java.lang.IndexOutOfBoundsException("n < 0");
                }
                case 6: {
                    throw new java.lang.IndexOutOfBoundsException("n >= size()");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String j6(java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7) {
        int r0 = 0;
        java.lang.StringBuffer r1 = null;
        int r8 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.DW.length;
                    r1 = new java.lang.StringBuffer((r0 * 10) + 10);
                    if (r4 == null) { $pc2 = 5; continue $sw2; }
                    r1.append(r4);
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    r8 = 0;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (r8 >= r0) { $pc2 = 14; continue $sw2; }
                    if (r8 == 0) { $pc2 = 10; continue $sw2; }
                    if (r5 == null) { $pc2 = 10; continue $sw2; }
                    r1.append(r5);
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    if (r7 == false) { $pc2 = 12; continue $sw2; }
                    r1.append(((abcd.Interfacelu) this.DW[r8]).aM());
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    r8 = r8 + 1;
                    { $pc2 = 6; continue $sw2; }
                }
                case 12: {
                    r1.append(this.DW[r8]);
                    { $pc2 = 13; continue $sw2; }
                }
                case 14: {
                    if (r6 == null) { $pc2 = 17; continue $sw2; }
                    r1.append(r6);
                    $pc2 = 17; continue $sw2;
                }
                case 17: {
                    return r1.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected final java.lang.Object DW(int r4) {
        java.lang.Object r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    try {
                        r0 = this.DW[r4];
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc3 = 7; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r0 == null) { $pc3 = 6; continue $sw3; }
                    return r0;
                }
                case 6: {
                    try {
                        throw new java.lang.NullPointerException("unset: " + r4);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc3 = 7; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 7: {
                    Hw(r4);
                    throw null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String DW(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        return j6(r2, r3, r4, false);
    }

    protected final java.lang.Object FH(int r2) {
        return this.DW[r2];
    }

    public java.lang.String aM() {
        java.lang.String r0 = getClass().getName();
        return j6(r0.substring(r0.lastIndexOf(46) + 1) + '{', ", ", "}", true);
    }

    public boolean equals(java.lang.Object r3) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this != r3) { $pc4 = 5; continue $sw4; }
                    return true;
                }
                case 5: {
                    if (r3 != null) { $pc4 = 7; continue $sw4; }
                    return false;
                }
                case 7: {
                    if (getClass() == r3.getClass()) { $pc4 = 10; continue $sw4; }
                    return false;
                }
                case 10: {
                    return java.util.Arrays.equals(this.DW, ((abcd.Xt) r3).DW);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.DW);
    }

    public java.lang.String j6(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        return j6(r2, r3, r4, true);
    }

    protected final void j6(int r2, java.lang.Object r3) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    J8();
                    try {
                        this.DW[r2] = r3;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc5 = 5; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 5: {
                    Hw(r2);
                    throw null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void lg() {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Object[] r4 = null;
        int r5 = 0;
        java.lang.Object r6 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = this.DW.length;
                    r1 = 0;
                    r2 = 0;
                    r3 = 0;
                    $pc6 = 3; continue $sw6;
                }
                case 3: {
                    if (r2 >= r0) { $pc6 = 8; continue $sw6; }
                    if (this.DW[r2] == null) { $pc6 = 7; continue $sw6; }
                    r3 = r3 + 1;
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    r2 = r2 + 1;
                    { $pc6 = 3; continue $sw6; }
                }
                case 8: {
                    if (r0 != r3) { $pc6 = 10; continue $sw6; }
                    return;
                }
                case 10: {
                    J8();
                    r4 = new java.lang.Object[r3];
                    r5 = 0;
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    if (r1 >= r0) { $pc6 = 16; continue $sw6; }
                    r6 = this.DW[r1];
                    if (r6 == null) { $pc6 = 15; continue $sw6; }
                    r4[r5] = r6;
                    r5 = r5 + 1;
                    $pc6 = 15; continue $sw6;
                }
                case 15: {
                    r1 = r1 + 1;
                    { $pc6 = 11; continue $sw6; }
                }
                case 16: {
                    this.DW = r4;
                    if (r3 != 0) { $pc6 = 26; continue $sw6; }
                    we();
                    return;
                }
                case 26: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int size() {
        return this.DW.length;
    }

    public java.lang.String toString() {
        java.lang.String r0 = getClass().getName();
        return j6(r0.substring(r0.lastIndexOf(46) + 1) + '{', ", ", "}", false);
    }
}
