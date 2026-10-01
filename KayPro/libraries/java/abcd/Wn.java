package abcd;

public final class Wn extends abcd.Xt {
    private final int FH;

    public Wn(int r1, int r2) {
        super(r1);
        this.FH = r2;
    }

    public static abcd.Wn j6(java.util.ArrayList<abcd.AbstractVn> r3, int r4) {
        int r0 = r3.size();
        abcd.Wn r1 = new abcd.Wn(r0, r4);
        int r5 = 0;
    L3:
        if (r5 >= r0) goto L5;
        r1.j6(r5, r3.get(r5));
        r5 = r5 + 1;
        goto L3
    L5:
        r1.we();
        return r1;
    }

    public int er() {
        int r0 = size();
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r0) goto L18;
        abcd.AbstractVn r4 = (abcd.AbstractVn) DW(r2);
        if ((r4 instanceof abcd.Tn) == false) goto L17;
        abcd.Abstractms r5 = ((abcd.Tn) r4).we();
        if ((r5 instanceof abcd.Abstractqs) == false) goto L17;
        if (r4.Zo().j6() != 113) goto L13;
        boolean r6 = true;
    L14:
        int r7 = ((abcd.Abstractqs) r5).j6(r6);
        if (r7 <= r3) goto L17;
        r3 = r7;
        goto L17
    L13:
        r6 = false;
    L17:
        r2 = r2 + 1;
        goto L3
    L18:
        return r3;
    }

    public abcd.AbstractVn get(int r1) {
        return (abcd.AbstractVn) DW(r1);
    }

    public void j6(int r1, abcd.AbstractVn r2) {
        j6(r1, r2);
    }

    public void j6(abcd.Lt r11) {
        int r0 = r11.v5();
        int r1 = size();
        int r3 = 0;
        if (r11.Hw() == false) goto L17;
        boolean r2 = r11.DW();
        int r4 = 0;
    L5:
        if (r4 >= r1) goto L17;
        abcd.AbstractVn r5 = (abcd.AbstractVn) DW(r4);
        int r6 = r5.DW() * 2;
        if (r6 != 0) goto L11;
        if (r2 == true) goto L11;
        java.lang.String r7 = null;
    L12:
        if (r7 == null) goto L14;
        r11.j6(r6, r7);
    L16:
        r4 = r4 + 1;
        goto L5
    L14:
        if (r6 == 0) goto L16;
        r11.j6(r6, "");
    L11:
        r7 = r5.j6("  ", r11.j6(), true);
    L17:
        if (r3 >= r1) goto L24;
        abcd.AbstractVn r8 = (abcd.AbstractVn) DW(r3);
        r8.j6(r11);     // Catch: java.lang.RuntimeException -> L21
        r3 = r3 + 1;
    L21:
        e = move-exception;
        throw abcd.Vt.j6(e, "...while writing " + r8);
    L24:
        int r12 = (r11.v5() - r0) / 2;
        if (r12 != rN()) goto L28;
        return;
    L28:
        throw new java.lang.RuntimeException("write length mismatch; expected " + rN() + " but actually wrote " + r12);
    }

    public int rN() {
        int r0 = size();
        if (r0 != 0) goto L7;
        return 0;
    L7:
        return get(r0 - 1).v5();
    }

    public int yS() {
        return this.FH;
    }
}
