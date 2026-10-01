package abcd;

public class JN extends abcd.AbstractyL {
    public static final abcd.zL BT = null;
    public static final abcd.zL DW = null;
    public static final abcd.zL EQ = null;
    public static final abcd.zL FH = null;
    public static final abcd.zL Hw = null;
    public static final abcd.zL J0 = null;
    public static final abcd.zL J8 = null;
    public static final abcd.zL Mr = null;
    public static final abcd.zL P8 = null;
    public static final abcd.zL QX = null;
    public static final abcd.zL U2 = null;
    public static final abcd.zL VH = null;
    public static final abcd.zL Ws = null;
    public static final abcd.zL XL = null;
    public static final abcd.zL Zo = null;
    public static final abcd.zL a8 = null;
    public static final abcd.zL aM = null;
    public static final abcd.zL ei = null;
    public static final abcd.zL er = null;
    public static final abcd.zL gW = null;
    public static final abcd.zL gn = null;
    public static final abcd.zL j3 = null;
    public static final abcd.zL j6 = null;
    public static final abcd.zL lg = null;
    public static final abcd.zL rN = null;
    public static final abcd.zL tp = null;
    public static final abcd.zL u7 = null;
    public static final abcd.zL v5 = null;
    public static final abcd.zL vy = null;
    public static final abcd.zL we = null;
    public static final abcd.zL yS = null;
    private java.util.Vector SI;
    private java.util.Hashtable nw;

    static {
        j6 = new abcd.zL("2.5.29.9");
        DW = new abcd.zL("2.5.29.14");
        FH = new abcd.zL("2.5.29.15");
        Hw = new abcd.zL("2.5.29.16");
        v5 = new abcd.zL("2.5.29.17");
        Zo = new abcd.zL("2.5.29.18");
        VH = new abcd.zL("2.5.29.19");
        gn = new abcd.zL("2.5.29.20");
        u7 = new abcd.zL("2.5.29.21");
        tp = new abcd.zL("2.5.29.23");
        EQ = new abcd.zL("2.5.29.24");
        we = new abcd.zL("2.5.29.27");
        J0 = new abcd.zL("2.5.29.28");
        J8 = new abcd.zL("2.5.29.29");
        Ws = new abcd.zL("2.5.29.30");
        QX = new abcd.zL("2.5.29.31");
        XL = new abcd.zL("2.5.29.32");
        aM = new abcd.zL("2.5.29.33");
        j3 = new abcd.zL("2.5.29.35");
        Mr = new abcd.zL("2.5.29.36");
        U2 = new abcd.zL("2.5.29.37");
        a8 = new abcd.zL("2.5.29.46");
        lg = new abcd.zL("2.5.29.54");
        rN = new abcd.zL("1.3.6.1.5.5.7.1.1");
        er = new abcd.zL("1.3.6.1.5.5.7.1.11");
        yS = new abcd.zL("1.3.6.1.5.5.7.1.12");
        gW = new abcd.zL("1.3.6.1.5.5.7.1.2");
        BT = new abcd.zL("1.3.6.1.5.5.7.1.3");
        vy = new abcd.zL("1.3.6.1.5.5.7.1.4");
        P8 = new abcd.zL("2.5.29.56");
        ei = new abcd.zL("2.5.29.55");
    }

    public JN(abcd.FL r8) {
        java.util.Enumeration r9 = null;
        abcd.FL r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.nw = new java.util.Hashtable();
                    this.SI = new java.util.Vector();
                    r9 = r8.u7();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r9.hasMoreElements() == false) { $pc0 = 5; continue $sw0; }
                    r0 = abcd.FL.j6(r9.nextElement());
                    if (r0.tp() != 3) { $pc0 = 10; continue $sw0; }
                    this.nw.put(r0.j6(0), new abcd.IN(abcd.dM.j6(r0.j6(1)), abcd.AL.j6(r0.j6(2))));
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    this.SI.addElement(r0.j6(0));
                    { $pc0 = 4; continue $sw0; }
                }
                case 10: {
                    if (r0.tp() != 2) { $pc0 = 14; continue $sw0; }
                    this.nw.put(r0.j6(0), new abcd.IN(false, abcd.AL.j6(r0.j6(1))));
                    { $pc0 = 12; continue $sw0; }
                }
                case 14: {
                    throw new java.lang.IllegalArgumentException("Bad sequence size: " + r0.tp());
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public JN(java.util.Vector r4, java.util.Hashtable r5) {
        java.util.Enumeration r6 = null;
        java.util.Enumeration r0 = null;
        abcd.zL r7 = null;
        abcd.IN r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.nw = new java.util.Hashtable();
                    this.SI = new java.util.Vector();
                    if (r4 != null) { $pc1 = 5; continue $sw1; }
                    r6 = r5.keys();
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r6.hasMoreElements() == false) { $pc1 = 8; continue $sw1; }
                    this.SI.addElement(abcd.oM.j6(r6.nextElement()));
                    { $pc1 = 7; continue $sw1; }
                }
                case 8: {
                    r0 = this.SI.elements();
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    if (r0.hasMoreElements() == false) { $pc1 = 11; continue $sw1; }
                    r7 = abcd.oM.j6(r0.nextElement());
                    r1 = (abcd.IN) r5.get(r7);
                    this.nw.put(r7, r1);
                    { $pc1 = 10; continue $sw1; }
                }
                case 11: {
                    return;
                }
                case 5: {
                    r6 = r4.elements();
                    { $pc1 = 7; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.JN j6(java.lang.Object r3) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r3 == null) { $pc2 = 21; continue $sw2; }
                    if ((r3 instanceof abcd.JN) == true) { $pc2 = 21; continue $sw2; }
                    if ((r3 instanceof abcd.FL) == false) { $pc2 = 11; continue $sw2; }
                    return new abcd.JN((abcd.FL) r3);
                }
                case 11: {
                    if ((r3 instanceof abcd.AN) == false) { $pc2 = 15; continue $sw2; }
                    return new abcd.JN((abcd.FL) ((abcd.AN) r3).DW());
                }
                case 15: {
                    if ((r3 instanceof abcd.LL) == false) { $pc2 = 19; continue $sw2; }
                    return j6(((abcd.LL) r3).u7());
                }
                case 19: {
                    throw new java.lang.IllegalArgumentException("illegal object in getInstance: " + r3.getClass().getName());
                }
                case 21: {
                    return (abcd.JN) r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = null;
        java.util.Enumeration r1 = null;
        abcd.zL r2 = null;
        abcd.IN r3 = null;
        abcd.rL r4 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new abcd.rL();
                    r1 = this.SI.elements();
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r1.hasMoreElements() == false) { $pc3 = 6; continue $sw3; }
                    r2 = (abcd.zL) r1.nextElement();
                    r3 = (abcd.IN) this.nw.get(r2);
                    r4 = new abcd.rL();
                    r4.j6(r2);
                    if (r3.DW() == false) { $pc3 = 10; continue $sw3; }
                    r4.j6(new abcd.dM(true));
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    r4.j6(r3.j6());
                    r0.j6(new abcd.tM(r4));
                    { $pc3 = 4; continue $sw3; }
                }
                case 6: {
                    return new abcd.tM(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.IN j6(abcd.oM r2) {
        return (abcd.IN) this.nw.get(r2);
    }

    public java.util.Enumeration v5() {
        return this.SI.elements();
    }
}
