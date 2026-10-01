package abcd;

public class Et {
    private final abcd.Or DW;
    private final abcd.Or FH;
    private final abcd.fs j6;

    public Et(abcd.fs r1) {
        this.j6 = r1;
        this.DW = this.j6.j6();
        this.FH = this.DW.gW();
    }

    private void j6(int r10, abcd.au r11) {
        int r0 = r11.size();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L8;
        int r3 = r11.get(r2);
        abcd.Nr r4 = this.DW.v5(r3);
        abcd.au r5 = this.j6.j6(r4.DW());
        int r6 = r5.size();
        int r7 = 0;
    L5:
        if (r7 >= r6) goto L7;
        j6(this.FH.v5(r5.get(r7)), r3, r10);
        r7 = r7 + 1;
        goto L5
    L7:
        r2 = r2 + 1;
        goto L3
    }

    private void j6(abcd.Nr r4, int r5, int r6) {
        abcd.au r0 = r4.gn().lg();
        r0.FH(r0.v5(r5), r6);
        int r1 = r4.Zo();
        if (r1 == r5) goto L6;
        r6 = r1;
    L6:
        r0.we();
        abcd.Nr r7 = new abcd.Nr(r4.DW(), r4.Hw(), r0, r6);
        abcd.Or r8 = this.FH;
        r8.j6(r8.Hw(r4.DW()), r7);
    }

    private static boolean j6(abcd.Nr r0, abcd.Nr r1) {
        return r0.Hw().j6(r1.Hw());
    }

    public abcd.fs j6() {
        int r0 = this.DW.size();
        java.util.BitSet r1 = new java.util.BitSet(this.DW.rN());
        int r3 = 0;
    L4:
        if (r3 >= r0) goto L28;
        abcd.Nr r5 = this.DW.get(r3);
        if (r1.get(r5.DW()) == true) goto L27;
        abcd.au r6 = this.j6.j6(r5.DW());
        int r7 = r6.size();
        int r8 = 0;
    L9:
        if (r8 >= r7) goto L27;
        int r9 = r6.get(r8);
        abcd.Nr r10 = this.DW.v5(r9);
        if (r1.get(r9) == true) goto L26;
        if (r10.gn().size() > 1) goto L26;
        if (r10.FH().v5().Hw() == 55) goto L26;
        abcd.au r11 = new abcd.au();
        int r12 = r8 + 1;
    L18:
        if (r12 >= r7) goto L25;
        int r13 = r6.get(r12);
        abcd.Nr r14 = this.DW.v5(r13);
        if (r14.gn().size() != 1) goto L24;
        if (j6(r10, r14) == false) goto L24;
        r11.DW(r13);
        r1.set(r13);
    L24:
        r12 = r12 + 1;
        goto L18
    L25:
        j6(r9, r11);
    L26:
        r8 = r8 + 1;
    L27:
        r3 = r3 + 1;
        goto L4
    L28:
        int r2 = r0 - 1;
    L29:
        if (r2 < 0) goto L34;
        if (r1.get(this.FH.get(r2).DW()) == false) goto L33;
        this.FH.j6(r2, null);
    L33:
        r2 = r2 - 1;
        goto L29
    L34:
        this.FH.lg();
        this.FH.we();
        return new abcd.fs(this.FH, this.j6.DW());
    }
}
