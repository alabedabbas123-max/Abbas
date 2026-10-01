package abcd;

public abstract class Tr implements abcd.Interfacelu {
    private final abcd.hs DW;
    private final abcd.bs FH;
    private final abcd.cs Hw;
    private final abcd.es j6;

    public static class a implements abcd.Tr.b {
        public a() {
        }

        @Override
        public void j6(abcd.Sr r1) {
        }

        @Override
        public void j6(abcd.Zr r1) {
        }

        @Override
        public void j6(abcd.is r1) {
        }

        @Override
        public void j6(abcd.js r1) {
        }

        @Override
        public void j6(abcd.ks r1) {
        }
    }

    public interface b {
        void j6(abcd.Sr r1);

        void j6(abcd.Yr r1);

        void j6(abcd.Zr r1);

        void j6(abcd.is r1);

        void j6(abcd.js r1);

        void j6(abcd.ks r1);
    }

    public Tr(abcd.es r1, abcd.hs r2, abcd.bs r3, abcd.cs r4) {
        if (r1 == null) goto L13;
        if (r2 == null) goto L11;
        if (r4 == null) goto L9;
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
        return;
    L9:
        throw new java.lang.NullPointerException("sources == null");
    L11:
        throw new java.lang.NullPointerException("position == null");
    L13:
        throw new java.lang.NullPointerException("opcode == null");
    }

    private static boolean j6(java.lang.Object r0, java.lang.Object r1) {
        if (r0 == r1) goto L8;
        if (r0 != null) goto L5;
    L7:
        return false;
    L5:
        if (r0.equals(r1) == false) goto L7;
    L8:
        return true;
    }

    public abstract abcd.Ss DW();

    protected final java.lang.String DW(java.lang.String r4) {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(80);
        r0.append("Insn{");
        r0.append(this.DW);
        r0.append(' ');
        r0.append(this.j6);
        if (r4 == null) goto L5;
        r0.append(' ');
        r0.append(r4);
    L5:
        r0.append(" :: ");
        abcd.bs r5 = this.FH;
        if (r5 == null) goto L8;
        r0.append(r5);
        r0.append(" <- ");
    L8:
        r0.append(this.Hw);
        r0.append('}');
        return r0.toString();
    }

    public java.lang.String FH() {
        return null;
    }

    public final abcd.bs Hw() {
        if (this.j6.Hw() != 54) goto L5;
        abcd.bs r0 = this.Hw.get(0);
    L7:
        if (r0 != null) goto L10;
        return null;
    L10:
        if (r0.Zo() != null) goto L12;
        return null;
    L12:
        return r0;
    L5:
        r0 = this.FH;
        goto L7
    }

    public final abcd.bs VH() {
        return this.FH;
    }

    public final abcd.hs Zo() {
        return this.DW;
    }

    @Override
    public java.lang.String aM() {
        return j6(FH());
    }

    public final boolean equals(java.lang.Object r1) {
        if (this != r1) goto L4;
        return true;
    L4:
        return false;
    }

    public final abcd.cs gn() {
        return this.Hw;
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(this);
    }

    public abstract abcd.Tr j6(abcd.Qs r1);

    public abstract abcd.Tr j6(abcd.bs r1, abcd.cs r2);

    protected final java.lang.String j6(java.lang.String r5) {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(80);
        r0.append(this.DW);
        r0.append(": ");
        r0.append(this.j6.FH());
        if (r5 == null) goto L6;
        r0.append("(");
        r0.append(r5);
        r0.append(")");
    L6:
        if (this.FH != null) goto L8;
        r0.append(" .");
    L9:
        r0.append(" <-");
        int r6 = this.Hw.size();
        if (r6 != 0) goto L12;
        r0.append(" .");
    L16:
        return r0.toString();
    L12:
        int r1 = 0;
    L13:
        if (r1 >= r6) goto L16;
        r0.append(" ");
        r0.append(this.Hw.get(r1).aM());
        r1 = r1 + 1;
        goto L13
    L8:
        r0.append(" ");
        r0.append(this.FH.aM());
        goto L9
    }

    public abstract void j6(abcd.Tr.b r1);

    public final boolean j6() {
        return this.j6.j6();
    }

    public boolean j6(abcd.Tr r3) {
        if (this.j6 == r3.v5()) goto L5;
    L15:
        return false;
    L5:
        if (this.DW.equals(r3.Zo()) == false) goto L15;
        if (getClass() != r3.getClass()) goto L15;
        if (j6(this.FH, r3.VH()) == false) goto L15;
        if (j6(this.Hw, r3.gn()) == false) goto L15;
        if (abcd.Ps.DW(DW(), r3.DW()) == false) goto L15;
        return true;
    }

    public java.lang.String toString() {
        return DW(FH());
    }

    public abcd.Tr u7() {
        return this;
    }

    public final abcd.es v5() {
        return this.j6;
    }
}
