package abcd;

public class cM extends abcd.EL implements abcd.KL {
    private static final char[] j6 = null;
    protected byte[] DW;
    protected int FH;

    static {
        j6 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public cM(abcd.InterfaceqL r4) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        this.DW = r4.DW().j6("DER");
                        this.FH = 0;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 5; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 5: {
                    e = $ex0;
                    throw new java.lang.IllegalArgumentException("Error processing object : " + e.toString());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public cM(byte[] r2) {
        this(r2, 0);
    }

    public cM(byte[] r1, int r2) {
        this.DW = r1;
        this.FH = r2;
    }

    static abcd.cM DW(byte[] r5) {
        byte r2 = 0;
        byte[] r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r5.length < 1) { $pc1 = 10; continue $sw1; }
                    r2 = r5[0];
                    r3 = new byte[r5.length - 1];
                    if (r3.length == 0) { $pc1 = 8; continue $sw1; }
                    java.lang.System.arraycopy(r5, 1, r3, 0, r5.length - 1);
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    return new abcd.cM(r3, r2);
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("truncated BIT STRING detected");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static abcd.cM j6(int r2, java.io.InputStream r3) {
        int r1 = 0;
        byte[] r4 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 < 1) { $pc2 = 14; continue $sw2; }
                    r1 = r3.read();
                    r4 = new byte[r2 - 1];
                    if (r4.length == 0) { $pc2 = 12; continue $sw2; }
                    if (abcd.XP.j6(r3, r4) == r4.length) { $pc2 = 12; continue $sw2; }
                    throw new java.io.EOFException("EOF encountered in middle of BIT STRING");
                }
                case 12: {
                    return new abcd.cM(r4, r1);
                }
                case 14: {
                    throw new java.lang.IllegalArgumentException("truncated BIT STRING detected");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.cM j6(abcd.LL r0, boolean r1) {
        abcd.EL r2 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r2 = r0.u7();
                    if (r1 == true) { $pc3 = 10; continue $sw3; }
                    if ((r2 instanceof abcd.cM) == true) { $pc3 = 10; continue $sw3; }
                    return DW(((abcd.AL) r2).u7());
                }
                case 10: {
                    return j6(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.cM j6(java.lang.Object r3) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r3 == null) { $pc4 = 9; continue $sw4; }
                    if ((r3 instanceof abcd.cM) == true) { $pc4 = 9; continue $sw4; }
                    throw new java.lang.IllegalArgumentException("illegal object in getInstance: " + r3.getClass().getName());
                }
                case 9: {
                    return (abcd.cM) r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    boolean Zo() {
        return false;
    }

    @Override
    public java.lang.String getString() {
        java.lang.StringBuffer r0 = null;
        java.io.ByteArrayOutputStream r1 = null;
        byte[] r2 = null;
        int r3 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = new java.lang.StringBuffer("#");
                    r1 = new java.io.ByteArrayOutputStream();
                    try {
                        new abcd.CL(r1).j6(this);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 10; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r2 = r1.toByteArray();
                    r3 = 0;
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    if (r3 == r2.length) { $pc5 = 8; continue $sw5; }
                    r0.append(j6[(r2[r3] >>> 4) & 15]);
                    r0.append(j6[r2[r3] & 15]);
                    r3 = r3 + 1;
                    { $pc5 = 6; continue $sw5; }
                }
                case 8: {
                    return r0.toString();
                }
                case 11: {
                    throw new java.lang.RuntimeException("internal error encoding BitString");
                }
                case 10: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int hashCode() {
        return this.FH ^ abcd.OP.DW(this.DW);
    }

    @Override
    void j6(abcd.CL r6) {
        byte[] r0 = new byte[u7().length + 1];
        r0[0] = (byte) tp();
        java.lang.System.arraycopy(u7(), 0, r0, 1, r0.length - 1);
        r6.j6(3, r0);
    }

    @Override
    protected boolean j6(abcd.EL r4) {
        abcd.cM r5 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if ((r4 instanceof abcd.cM) == true) { $pc6 = 5; continue $sw6; }
                    return false;
                }
                case 5: {
                    r5 = (abcd.cM) r4;
                    if (this.FH == r5.FH) { $pc6 = 8; continue $sw6; }
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    return false;
                }
                case 8: {
                    if (abcd.OP.j6(this.DW, r5.DW) == false) { $pc6 = 11; continue $sw6; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return getString();
    }

    public int tp() {
        return this.FH;
    }

    public byte[] u7() {
        return this.DW;
    }

    @Override
    int v5() {
        return ((abcd.OM.j6(this.DW.length + 1) + 1) + this.DW.length) + 1;
    }
}
