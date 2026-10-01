package abcd;

public class XJ extends abcd.YJ {
    private static final int we = 0;
    private boolean J0;
    private abcd.TJ J8;

    static {
        we = abcd.AbstractrE.j6.DW();
    }

    public XJ(abcd.IE r1) {
        super(r1);
    }

    public XJ(abcd.UE r1) {
        this(r1.j3());
    }

    private abcd.TJ FH(abcd.TJ r9) {
        abcd.TJ[] r0 = this.v5;
        int r1 = r0.length;
        int r2 = 0;
        abcd.TJ r4 = null;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L4;
        abcd.TJ r5 = r0[r3];
        if (r5.FH == r9) goto L31;
        if (r5.DW() == true) goto L31;
    L21:
        int r6 = r5.j6(r9, we);
        if (r6 >= 0) goto L26;
        r5.Hw++;
        r5.FH(1);
        if (r5.DW() == false) goto L21;
        r5.j6(r5.Hw);
        r5.Hw = 0;
        goto L31
    L26:
        if (r6 != 0) goto L28;
        r5.FH = r9;
        r4 = r5;
        goto L31
    L28:
        int r7 = r5.Hw;
        if (r7 == 0) goto L31;
        r5.j6(r7);
        r5.Hw = 0;
    L31:
        r3 = r3 + 1;
        goto L3
    L4:
        if (r4 == null) goto L15;
        abcd.TJ[] r8 = this.v5;
        int r10 = r8.length;
    L6:
        if (r2 >= r10) goto L8;
        abcd.TJ r11 = r8[r2];
        if (r11.FH != r9) goto L14;
        r11.FH = r4;
    L14:
        r2 = r2 + 1;
        goto L6
    L8:
        if (this.J8 != null) goto L10;
        this.J8 = r4;
    L10:
        return r4;
    L15:
        return r9;
    }

    private static boolean Hw(abcd.TJ r1) {
        return abcd.AbstractrE.j6.j6(r1.v5);
    }

    private abcd.TJ XL() {
        this.J0 = true;
        abcd.TJ r1 = this.v5[0];
        int r3 = 0;
    L4:
        if (r1.DW() == false) goto L10;
        r3 = r3 + 1;
        abcd.TJ[] r4 = this.v5;
        if (r3 >= r4.length) goto L10;
        r1 = r4[r3];
    L10:
        if (r1.DW() == false) goto L12;
        return r1;
    L12:
        r1.FH = r1;
        abcd.TJ r5 = r1;
        boolean r2 = false;
    L13:
        r3 = r3 + 1;
        abcd.TJ[] r6 = this.v5;
        if (r3 >= r6.length) goto L15;
        abcd.TJ r7 = r6[r3];
        if (r7.DW() == true) goto L13;
        int r8 = r7.DW(r5);
        if (r8 < 0) goto L28;
        if (r8 != 0) goto L41;
        r7.FH = r5;
        goto L13
    L41:
        if (this.J0 == false) goto L55;
        if (Hw(r7) == false) goto L55;
        if (Hw(r5) == true) goto L55;
        if (j6(r7, r5) == false) goto L55;
        int r9 = 0;
    L49:
        if (r9 >= r3) goto L50;
        abcd.TJ r10 = this.v5[r9];
        if (r10.FH != r5) goto L54;
        r10.FH = r7;
    L54:
        r9 = r9 + 1;
        goto L49
    L50:
        r7.FH = r7;
        r5 = r7;
    L36:
        r2 = true;
    L55:
        this.J0 = false;
        goto L13
    L28:
        if (this.J0 == false) goto L37;
        if (Hw(r5) == false) goto L37;
        if (Hw(r7) == true) goto L37;
        if (j6(r5, r7) == false) goto L37;
        r7.FH = r5;
    L37:
        this.J0 = false;
        r7.FH = r7;
        r5 = r7;
        goto L13
    L15:
        if (r2 == true) goto L17;
    L21:
        return r5;
    L17:
        if (this.J0 == false) goto L21;
        if (this.J8 != null) goto L21;
        this.J8 = r5;
        goto L21
    }

    private static boolean j6(abcd.TJ r1, abcd.TJ r2) {
        if (r1.j6(r2, we) != 0) goto L6;
        return true;
    L6:
        return false;
    }

    private boolean v5(abcd.TJ r9) {
        abcd.TJ[] r0 = this.v5;
        int r1 = r0.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L4;
        abcd.TJ r4 = r0[r3];
        if (r4.FH == r9) goto L19;
        if (r4.FH() == true) goto L19;
        int r5 = 0;
    L11:
        r5 = r5 + 1;
        r4.j6(1);
        int r7 = r4.j6(r9, 0);
        if (r7 == 0) goto L13;
        if (r7 < 0) goto L18;
        if (r4.FH() == false) goto L11;
    L18:
        r4.FH(r5);
        goto L19
    L13:
        r4.FH(r5);
        return true;
    L19:
        r3 = r3 + 1;
        goto L3
    L4:
        return false;
    }

    public boolean QX() {
        if (this.J8 == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override
    void Ws() {
        abcd.TJ r0 = this.EQ;
        int r2 = 0;
    L3:
        abcd.TJ[] r3 = this.v5;
        if (r2 >= r3.length) goto L6;
        abcd.TJ r4 = r3[r2];
        if (r4.FH != r0) goto L16;
        int r5 = r4.Hw;
        if (r5 != 0) goto L14;
        r4.we();
    L15:
        r4.FH = null;
        goto L16
    L14:
        r4.j6(r5);
        r4.Hw = 0;
    L16:
        r2 = r2 + 1;
        goto L3
    L6:
        if (r0 != this.J8) goto L20;
        this.J8 = null;
        return;
    }

    @Override
    abcd.TJ tp() {
    L2:
        abcd.TJ r0 = XL();
        if (this.J0 == true) goto L4;
        if (Hw(r0) == false) goto L18;
        if (v5(r0) == false) goto L16;
        abcd.TJ[] r1 = this.v5;
        int r2 = r1.length;
        int r3 = 0;
    L10:
        if (r3 >= r2) goto L2;
        abcd.TJ r4 = r1[r3];
        if (r4.FH != r0) goto L15;
        r4.FH(1);
        r4.FH = null;
    L15:
        r3 = r3 + 1;
        goto L10
    L16:
        return r0;
    L18:
        return FH(r0);
    L4:
        return r0;
    }

    @Override
    void we() {
        abcd.TJ r0 = this.EQ;
        int r2 = 0;
    L3:
        abcd.TJ[] r3 = this.v5;
        if (r2 >= r3.length) goto L6;
        abcd.TJ r4 = r3[r2];
        if (r4.FH != r0) goto L16;
        int r5 = r4.Hw;
        if (r5 != 0) goto L14;
        r4.FH(1);
    L15:
        r4.FH = null;
        goto L16
    L14:
        r4.j6(r5);
        r4.Hw = 0;
    L16:
        r2 = r2 + 1;
        goto L3
    L6:
        if (r0 != this.J8) goto L20;
        this.J8 = null;
        return;
    }
}
