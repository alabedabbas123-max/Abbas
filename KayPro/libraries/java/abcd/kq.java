package abcd;

public class kq {
    protected final abcd.St j6;

    public kq(abcd.St r1) {
        this.j6 = r1;
    }

    public kq(abcd.jq r1) {
        this(r1.Hw());
    }

    private int j6(abcd.St r5, int r6) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r0 >= r6) goto L5;
        r1 = r1 + ((r5.readByte() & 255) << r2);
        r2 = r2 + 8;
        r0 = r0 + 1;
        goto L3
    L5:
        return r1;
    }

    public final void DW() {
        int r0 = abcd.eu.DW(this.j6);
        FH(r0);
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        FH();
        r1 = r1 + 1;
        goto L3
    }

    protected void DW(int r1) {
    }

    protected void DW(int r1, int r2) {
    }

    public final void FH() {
        int r0 = this.j6.readByte() & 255;
        int r1 = r0 & 31;
        int r2 = (r0 & 224) >> 5;
        int r3 = r2 + 1;
        if (r1 != 0) goto L5;
    L26:
        j6(r0, r1, r2, r3);
        return;
    L5:
        if (r1 == 6) goto L26;
        if (r1 == 2) goto L26;
        if (r1 == 3) goto L26;
        if (r1 == 4) goto L26;
        if (r1 == 16) goto L26;
        if (r1 == 17) goto L26;
        switch(r1) {
            case 23: goto L25;
            case 24: goto L24;
            case 25: goto L23;
            case 26: goto L22;
            case 27: goto L23;
            case 28: goto L21;
            case 29: goto L20;
            case 30: goto L19;
            case 31: goto L18;
            default: goto L36;
        };
    L18:
        v5(r0);
        return;
    L19:
        Zo(r0);
        return;
    L20:
        DW(r0);
        j6();
        return;
    L21:
        Hw(r0);
        DW();
        return;
    L22:
        FH(r1, j6(this.j6, r3));
        return;
    L23:
        DW(r1, j6(this.j6, r3));
        return;
    L24:
        v5(r1, j6(this.j6, r3));
        return;
    L25:
        Hw(r1, j6(this.j6, r3));
        return;
    }

    protected void FH(int r1) {
    }

    protected void FH(int r1, int r2) {
    }

    protected void Hw(int r1) {
    }

    protected void Hw(int r1, int r2) {
    }

    protected void Zo(int r1) {
    }

    public final void j6() {
        int r0 = abcd.eu.DW(this.j6);
        int r1 = abcd.eu.DW(this.j6);
        j6(r0, r1);
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        j6(abcd.eu.DW(this.j6));
        FH();
        r2 = r2 + 1;
        goto L3
    }

    protected void j6(int r1) {
    }

    protected void j6(int r1, int r2) {
    }

    protected void j6(int r1, int r2, int r3, int r4) {
        int r5 = 0;
    L3:
        if (r5 >= r4) goto L5;
        this.j6.readByte();
        r5 = r5 + 1;
        goto L3
    }

    protected void v5(int r1) {
    }

    protected void v5(int r1, int r2) {
    }
}
