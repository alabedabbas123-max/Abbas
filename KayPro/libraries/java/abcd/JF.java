package abcd;

public class JF {
    final int DW;
    int FH;
    private final abcd.JF.a Hw;
    int VH;
    int Zo;
    private abcd.kC gn;
    final abcd.HF j6;
    int v5;

    public static abstract class a {
        int DW;
        int j6;

        public a() {
        }

        public int DW() {
            return this.j6;
        }

        public int j6() {
            return this.DW;
        }
    }

    JF(abcd.HF r2, int r3) {
        this(r2, r3, new abcd.IF(r2));
    }

    JF(abcd.HF r1, int r2, abcd.JF.a r3) {
        this.j6 = r1;
        this.DW = r2;
        this.Hw = r3;
    }

    JF(abcd.HF r2, abcd.kC r3) {
        this(r2, r2.yS.length);
        this.gn = r3;
        this.FH = this.DW;
        this.VH = 0;
        if (r3.isEmpty() == false) goto L5;
        this.v5 = 0;
        this.Zo = 0;
        return;
    L5:
        this.v5 = r3.get(0).Hw();
        this.Zo = r3.get(r3.size() - 1).Zo() - this.v5;
    }

    public int DW() {
        return this.Zo;
    }

    public int FH() {
        return this.v5;
    }

    public abcd.JF.a Hw() {
        return this.Hw;
    }

    public abcd.kC Zo() {
        if (this.gn != null) goto L28;
        this.gn = new abcd.kC();
        byte[] r0 = this.j6.yS;
        int r1 = abcd.IK.Zo(r0, this.DW);
        int r2 = this.Hw.j6;
        int r3 = this.v5;
        abcd.jC r5 = null;
    L6:
        if (r1 >= this.FH) goto L28;
        byte r6 = r0[r1];
        if (r6 != 10) goto L11;
    L25:
        r2 = r2 + 1;
        r3 = r3 + 1;
        r5 = null;
    L26:
        r1 = abcd.IK.Zo(r0, r1);
        goto L6
    L11:
        if (r6 == 32) goto L25;
        if (r6 != 43) goto L15;
        if (r5 != null) goto L24;
        r5 = new abcd.jC(r2 - 1, r3 - 1);
        this.gn.add(r5);
    L24:
        r3 = r3 + 1;
        r5.DW();
        goto L26
    L15:
        if (r6 != 45) goto L17;
        if (r5 != null) goto L21;
        r5 = new abcd.jC(r2 - 1, r3 - 1);
        this.gn.add(r5);
    L21:
        r2 = r2 + 1;
        r5.j6();
        goto L26
    L17:
        if (r6 == 92) goto L26;
    L28:
        return this.gn;
    }

    public abcd.HF j6() {
        return this.j6;
    }

    public java.lang.String toString() {
        return "HunkHeader[" + Hw().DW() + ',' + Hw().j6() + "->" + FH() + ',' + DW() + ']';
    }

    public int v5() {
        return this.DW;
    }
}
