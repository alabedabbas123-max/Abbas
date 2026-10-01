package abcd;

public final class Xn {
    private final int DW;
    private final int FH;
    private final abcd.Abstractao Hw;
    private final int j6;
    private final boolean v5;

    public Xn(int r2, int r3, int r4, abcd.Abstractao r5, boolean r6) {
        if (abcd.pq.DW(r2) == false) goto L18;
        if (abcd.pq.DW(r3) == false) goto L16;
        if (abcd.pq.DW(r4) == false) goto L14;
        if (r5 == null) goto L12;
        this.j6 = r2;
        this.DW = r3;
        this.FH = r4;
        this.Hw = r5;
        this.v5 = r6;
        return;
    L12:
        throw new java.lang.NullPointerException("format == null");
    L14:
        throw new java.lang.IllegalArgumentException("bogus nextOpcode");
    L16:
        throw new java.lang.IllegalArgumentException("bogus family");
    L18:
        throw new java.lang.IllegalArgumentException("bogus opcode");
    }

    public abcd.Abstractao DW() {
        return this.Hw;
    }

    public java.lang.String FH() {
        return abcd.oq.DW(this.j6);
    }

    public int Hw() {
        return this.FH;
    }

    public boolean VH() {
        return this.v5;
    }

    public abcd.Xn Zo() {
        switch(this.j6) {
            case 50: goto L29;
            case 51: goto L27;
            case 52: goto L25;
            case 53: goto L23;
            case 54: goto L21;
            case 55: goto L19;
            case 56: goto L17;
            case 57: goto L15;
            case 58: goto L13;
            case 59: goto L11;
            case 60: goto L9;
            case 61: goto L7;
            default: goto L5;
        };
    L5:
        throw new java.lang.IllegalArgumentException("bogus opcode: " + this);
    L7:
        return abcd.C0465Yn.Xa;
    L9:
        return abcd.C0465Yn.Eq;
    L11:
        return abcd.C0465Yn.et;
    L13:
        return abcd.C0465Yn.CU;
    L15:
        return abcd.C0465Yn.jJ;
    L17:
        return abcd.C0465Yn.wc;
    L19:
        return abcd.C0465Yn.yO;
    L21:
        return abcd.C0465Yn.XG;
    L23:
        return abcd.C0465Yn.XX;
    L25:
        return abcd.C0465Yn.kQ;
    L27:
        return abcd.C0465Yn.OW;
    L29:
        return abcd.C0465Yn.br;
    }

    public int j6() {
        return this.DW;
    }

    public java.lang.String toString() {
        return FH();
    }

    public int v5() {
        return this.j6;
    }
}
