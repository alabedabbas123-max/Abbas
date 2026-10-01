package abcd;

public final class Hs extends abcd.Abstractms {
    public static final abcd.Hs j6 = null;
    private final abcd.Js DW;
    private final abcd.Js FH;

    static {
        j6 = new abcd.Hs(new abcd.Js("TYPE"), new abcd.Js("Ljava/lang/Class;"));
    }

    public Hs(abcd.Js r1, abcd.Js r2) {
        if (r1 == null) goto L10;
        if (r2 == null) goto L8;
        this.DW = r1;
        this.FH = r2;
        return;
    L8:
        throw new java.lang.NullPointerException("descriptor == null");
    L10:
        throw new java.lang.NullPointerException("name == null");
    }

    @Override
    protected int DW(abcd.Abstractms r3) {
        abcd.Hs r4 = (abcd.Hs) r3;
        int r0 = this.DW.j6(r4.DW);
        if (r0 == 0) goto L6;
        return r0;
    L6:
        return this.FH.j6(r4.FH);
    }

    @Override
    public boolean Hw() {
        return false;
    }

    public abcd.Js J8() {
        return this.DW;
    }

    public abcd.Js VH() {
        return this.FH;
    }

    public final boolean Ws() {
        return this.DW.we().equals("<clinit>");
    }

    @Override
    public java.lang.String Zo() {
        return "nat";
    }

    @Override
    public java.lang.String aM() {
        return this.DW.aM() + ':' + this.FH.aM();
    }

    public boolean equals(java.lang.Object r4) {
        if ((r4 instanceof abcd.Hs) == true) goto L5;
        return false;
    L5:
        abcd.Hs r5 = (abcd.Hs) r4;
        if (this.DW.equals(r5.DW) == true) goto L8;
        return false;
    L8:
        if (this.FH.equals(r5.FH) == false) goto L12;
        return true;
    L12:
        return false;
    }

    public int hashCode() {
        return (this.DW.hashCode() * 31) ^ this.FH.hashCode();
    }

    public final boolean lg() {
        return this.DW.we().equals("<init>");
    }

    public java.lang.String toString() {
        return "nat{" + aM() + '}';
    }

    public abcd.Qs we() {
        return abcd.Qs.j6(this.FH.we());
    }
}
