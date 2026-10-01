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
        this.nw = new java.util.Hashtable();
        this.SI = new java.util.Vector();
        java.util.Enumeration r9 = r8.u7();
    L4:
        if (r9.hasMoreElements() == false) goto L5;
        abcd.FL r0 = abcd.FL.j6(r9.nextElement());
        if (r0.tp() != 3) goto L10;
        this.nw.put(r0.j6(0), new abcd.IN(abcd.dM.j6(r0.j6(1)), abcd.AL.j6(r0.j6(2))));
    L12:
        this.SI.addElement(r0.j6(0));
        goto L4
    L10:
        if (r0.tp() != 2) goto L14;
        this.nw.put(r0.j6(0), new abcd.IN(false, abcd.AL.j6(r0.j6(1))));
        goto L12
    L14:
        throw new java.lang.IllegalArgumentException("Bad sequence size: " + r0.tp());
    }

    public JN(java.util.Vector r4, java.util.Hashtable r5) {
        this.nw = new java.util.Hashtable();
        this.SI = new java.util.Vector();
        if (r4 != null) goto L5;
        java.util.Enumeration r6 = r5.keys();
    L7:
        if (r6.hasMoreElements() == false) goto L8;
        this.SI.addElement(abcd.oM.j6(r6.nextElement()));
        goto L7
    L8:
        java.util.Enumeration r0 = this.SI.elements();
    L10:
        if (r0.hasMoreElements() == false) goto L11;
        abcd.zL r7 = abcd.oM.j6(r0.nextElement());
        abcd.IN r1 = (abcd.IN) r5.get(r7);
        this.nw.put(r7, r1);
        goto L10
    L11:
        return;
    L5:
        r6 = r4.elements();
        goto L7
    }

    public static abcd.JN j6(java.lang.Object r3) {
        if (r3 == null) goto L21;
        if ((r3 instanceof abcd.JN) == true) goto L21;
        if ((r3 instanceof abcd.FL) == false) goto L11;
        return new abcd.JN((abcd.FL) r3);
    L11:
        if ((r3 instanceof abcd.AN) == false) goto L15;
        return new abcd.JN((abcd.FL) ((abcd.AN) r3).DW());
    L15:
        if ((r3 instanceof abcd.LL) == false) goto L19;
        return j6(((abcd.LL) r3).u7());
    L19:
        throw new java.lang.IllegalArgumentException("illegal object in getInstance: " + r3.getClass().getName());
    L21:
        return (abcd.JN) r3;
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = new abcd.rL();
        java.util.Enumeration r1 = this.SI.elements();
    L4:
        if (r1.hasMoreElements() == false) goto L6;
        abcd.zL r2 = (abcd.zL) r1.nextElement();
        abcd.IN r3 = (abcd.IN) this.nw.get(r2);
        abcd.rL r4 = new abcd.rL();
        r4.j6(r2);
        if (r3.DW() == false) goto L10;
        r4.j6(new abcd.dM(true));
    L10:
        r4.j6(r3.j6());
        r0.j6(new abcd.tM(r4));
        goto L4
    L6:
        return new abcd.tM(r0);
    }

    public abcd.IN j6(abcd.oM r2) {
        return (abcd.IN) this.nw.get(r2);
    }

    public java.util.Enumeration v5() {
        return this.SI.elements();
    }
}
