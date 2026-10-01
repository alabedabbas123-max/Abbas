package abcd;

public class SL extends abcd.AL {
    private abcd.AL[] DW;

    public SL(byte[] r1) {
        super(r1);
    }

    public SL(abcd.AL[] r2) {
        super(j6(r2));
        this.DW = r2;
    }

    private java.util.Vector EQ() {
        java.util.Vector r0 = null;
        int r2 = 0;
        byte[] r3 = null;
        int r4 = 0;
        int r5 = 0;
        byte[] r6 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.util.Vector();
                    r2 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    r3 = this.j6;
                    if (r2 >= r3.length) { $pc0 = 5; continue $sw0; }
                    r4 = r2 + 1000;
                    if (r4 <= r3.length) { $pc0 = 9; continue $sw0; }
                    r5 = r3.length;
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    r6 = new byte[r5 - r2];
                    java.lang.System.arraycopy(this.j6, r2, r6, 0, r6.length);
                    r0.addElement(new abcd.pM(r6));
                    r2 = r4;
                    { $pc0 = 3; continue $sw0; }
                }
                case 9: {
                    r5 = r4;
                    { $pc0 = 10; continue $sw0; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static byte[] j6(abcd.AL[] r3) {
        java.io.ByteArrayOutputStream r0 = null;
        int r1 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new java.io.ByteArrayOutputStream();
                    r1 = 0;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r1 == r3.length) { $pc1 = 6; continue $sw1; }
                    try {
                        r0.write(((abcd.pM) r3[r1]).u7());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 9; continue $sw1; }
                        if ($t instanceof java.lang.ClassCastException) { $pc1 = 12; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r1 = r1 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 9: {
                    e = $ex1;
                    throw new java.lang.IllegalArgumentException("exception converting octets " + e.toString());
                }
                case 13: {
                    throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(r3[r1].getClass().getName()) + " found in input should only contain DEROctetString");
                }
                case 6: {
                    return r0.toByteArray();
                }
                case 12: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static abcd.AL[] j6(abcd.SL r0) {
        return r0.DW;
    }

    @Override
    boolean Zo() {
        return true;
    }

    @Override
    public void j6(abcd.CL r3) {
        java.util.Enumeration r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r3.j6(36);
                    r3.j6(128);
                    r0 = tp();
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r0.hasMoreElements() == false) { $pc2 = 5; continue $sw2; }
                    r3.j6((abcd.InterfaceqL) r0.nextElement());
                    { $pc2 = 4; continue $sw2; }
                }
                case 5: {
                    r3.j6(0);
                    r3.j6(0);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.Enumeration tp() {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.DW != null) { $pc3 = 7; continue $sw3; }
                    return EQ().elements();
                }
                case 7: {
                    return new abcd.RL(this);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public byte[] u7() {
        return this.j6;
    }

    @Override
    int v5() {
        java.util.Enumeration r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = tp();
                    r1 = 0;
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r0.hasMoreElements() == false) { $pc4 = 6; continue $sw4; }
                    r1 = r1 + ((abcd.InterfaceqL) r0.nextElement()).DW().v5();
                    { $pc4 = 4; continue $sw4; }
                }
                case 6: {
                    return (r1 + 2) + 2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
