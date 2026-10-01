package abcd;

public class WM extends abcd.AbstractyL {
    private abcd.HL DW;
    private abcd.UM FH;
    private abcd.HL Hw;
    private boolean VH;
    private abcd.HL Zo;
    private boolean gn;
    private abcd.wL j6;
    private abcd.HL v5;

    private WM(abcd.FL r5) {
        java.util.Enumeration r6 = r5.u7();
        this.j6 = abcd.lM.j6(r6.nextElement());
        this.DW = (abcd.HL) r6.nextElement();
        this.FH = abcd.UM.j6(r6.nextElement());
    L4:
        if (r6.hasMoreElements() == false) goto L5;
        abcd.EL r0 = (abcd.EL) r6.nextElement();
        if ((r0 instanceof abcd.LL) == true) goto L8;
        this.Zo = (abcd.HL) r0;
        goto L4
    L8:
        abcd.LL r1 = (abcd.LL) r0;
        int r2 = r1.tp();
        if (r2 != 0) goto L11;
        this.VH = r1 instanceof abcd.YL;
        this.Hw = abcd.HL.j6(r1, false);
        goto L4
    L11:
        if (r2 != 1) goto L14;
        this.gn = r1 instanceof abcd.YL;
        this.v5 = abcd.HL.j6(r1, false);
        goto L4
    L14:
        throw new java.lang.IllegalArgumentException("unknown tag value " + r1.tp());
    }

    public WM(abcd.HL r2, abcd.UM r3, abcd.HL r4, abcd.HL r5, abcd.HL r6) {
        this.j6 = j6(r3.Zo(), r4, r5, r6);
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
        this.v5 = r5;
        this.Zo = r6;
        this.gn = r5 instanceof abcd.WL;
        this.VH = r4 instanceof abcd.WL;
    }

    public static abcd.WM j6(java.lang.Object r1) {
        if ((r1 instanceof abcd.WM) == true) goto L5;
        if (r1 != null) goto L8;
        return null;
    L8:
        return new abcd.WM(abcd.FL.j6(r1));
    L5:
        return (abcd.WM) r1;
    }

    private abcd.wL j6(abcd.zL r10, abcd.HL r11, abcd.HL r12, abcd.HL r13) {
        boolean r1 = false;
        if (r11 == null) goto L19;
        java.util.Enumeration r14 = r11.u7();
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;
    L6:
        if (r14.hasMoreElements() == false) goto L21;
        java.lang.Object r6 = r14.nextElement();
        if ((r6 instanceof abcd.LL) == false) goto L6;
        abcd.LL r7 = abcd.LL.j6(r6);
        if (r7.tp() == 1) goto L12;
        if (r7.tp() == 2) goto L15;
        if (r7.tp() != 3) goto L6;
        r3 = true;
        goto L6
    L15:
        r5 = true;
        goto L6
    L12:
        r4 = true;
    L21:
        if (r3 == true) goto L23;
        if (r12 == null) goto L32;
        java.util.Enumeration r15 = r12.u7();
    L27:
        if (r15.hasMoreElements() == false) goto L32;
        if ((r15.nextElement() instanceof abcd.LL) == false) goto L27;
        r1 = true;
    L32:
        if (r1 == true) goto L34;
        if (r5 == true) goto L37;
        if (r4 == false) goto L42;
        return new abcd.wL(3);
    L42:
        if (j6(r13) == false) goto L46;
        return new abcd.wL(3);
    L46:
        if (abcd.TM.j6.equals(r10) == true) goto L50;
        return new abcd.wL(3);
    L50:
        return new abcd.wL(1);
    L37:
        return new abcd.wL(4);
    L34:
        return new abcd.wL(5);
    L23:
        return new abcd.wL(5);
    L19:
        r3 = false;
        r4 = false;
        r5 = false;
        goto L21
    }

    private boolean j6(abcd.HL r3) {
        java.util.Enumeration r4 = r3.u7();
    L4:
        if (r4.hasMoreElements() == false) goto L5;
        if (abcd.YM.j6(r4.nextElement()).Zo().tp().intValue() != 3) goto L4;
        return true;
    L5:
        return false;
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = new abcd.rL();
        r0.j6(this.j6);
        r0.j6(this.DW);
        r0.j6(this.FH);
        abcd.HL r1 = this.Hw;
        if (r1 != null) goto L5;
    L8:
        abcd.HL r2 = this.v5;
        if (r2 != null) goto L11;
    L14:
        r0.j6(this.Zo);
        return new abcd.UL(r0);
    L11:
        if (this.gn == false) goto L13;
        r0.j6(new abcd.YL(false, 1, r2));
        goto L14
    L13:
        r0.j6(new abcd.yM(false, 1, r2));
        goto L14
    L5:
        if (this.VH == false) goto L7;
        r0.j6(new abcd.YL(false, 0, r1));
        goto L8
    L7:
        r0.j6(new abcd.yM(false, 0, r1));
        goto L8
    }
}
