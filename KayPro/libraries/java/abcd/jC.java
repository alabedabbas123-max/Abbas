package abcd;

public class jC {
    int DW;
    int FH;
    int Hw;
    int j6;

    public static final enum a extends java.lang.Enum<abcd.jC.a> {
        public static final abcd.jC.a DW = null;
        public static final abcd.jC.a FH = null;
        public static final abcd.jC.a Hw = null;
        public static final abcd.jC.a j6 = null;
        private static final abcd.jC.a[] v5 = null;

        static {
            j6 = new abcd.jC.a("INSERT", 0);
            DW = new abcd.jC.a("DELETE", 1);
            FH = new abcd.jC.a("REPLACE", 2);
            Hw = new abcd.jC.a("EMPTY", 3);
            v5 = new abcd.jC.a[]{j6, DW, FH, Hw};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.jC.a valueOf(java.lang.String r1) {
            return (abcd.jC.a) java.lang.Enum.valueOf(abcd.jC.a.class, r1);
        }

        public static abcd.jC.a[] values() {
            abcd.jC.a[] r0 = v5;
            int r1 = r0.length;
            abcd.jC.a[] r2 = new abcd.jC.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    public jC(int r1, int r2) {
        this(r1, r1, r2, r2);
    }

    public jC(int r1, int r2, int r3, int r4) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
    }

    public final abcd.jC DW(abcd.jC r5) {
        return new abcd.jC(this.j6, r5.j6, this.FH, r5.FH);
    }

    public void DW() {
        this.Hw++;
    }

    public final int FH() {
        return this.j6;
    }

    public final int Hw() {
        return this.FH;
    }

    public final int VH() {
        return this.DW - this.j6;
    }

    public final int Zo() {
        return this.Hw;
    }

    public boolean equals(java.lang.Object r4) {
        if ((r4 instanceof abcd.jC) == false) goto L14;
        abcd.jC r5 = (abcd.jC) r4;
        if (this.j6 != r5.j6) goto L14;
        if (this.DW != r5.DW) goto L14;
        if (this.FH != r5.FH) goto L14;
        if (this.Hw != r5.Hw) goto L14;
        return true;
    L14:
        return false;
    }

    public final abcd.jC.a gn() {
        if (this.j6 >= this.DW) goto L11;
        if (this.FH >= this.Hw) goto L9;
        return abcd.jC.a.FH;
    L9:
        return abcd.jC.a.DW;
    L11:
        if (this.FH >= this.Hw) goto L15;
        return abcd.jC.a.j6;
    L15:
        return abcd.jC.a.Hw;
    }

    public int hashCode() {
        return this.j6 ^ this.DW;
    }

    public final abcd.jC j6(abcd.jC r5) {
        return new abcd.jC(r5.DW, this.DW, r5.Hw, this.Hw);
    }

    public void j6() {
        this.DW++;
    }

    public java.lang.String toString() {
        return gn() + "(" + this.j6 + "-" + this.DW + "," + this.FH + "-" + this.Hw + ")";
    }

    public final boolean u7() {
        if (this.j6 == this.DW) goto L5;
        return false;
    L5:
        if (this.FH != this.Hw) goto L10;
        return true;
    L10:
        return false;
    }

    public final int v5() {
        return this.DW;
    }
}
