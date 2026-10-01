package abcd;

public final class os extends abcd.Abstractms {
    private final abcd.Hr j6;

    public os(abcd.Hr r2) {
        if (r2 == null) goto L7;
        r2.Ws();
        this.j6 = r2;
        return;
    L7:
        throw new java.lang.NullPointerException("annotation == null");
    }

    @Override
    protected int DW(abcd.Abstractms r2) {
        return this.j6.j6(((abcd.os) r2).j6);
    }

    @Override
    public boolean Hw() {
        return false;
    }

    public abcd.Hr VH() {
        return this.j6;
    }

    @Override
    public java.lang.String Zo() {
        return "annotation";
    }

    @Override
    public java.lang.String aM() {
        return this.j6.toString();
    }

    public boolean equals(java.lang.Object r2) {
        if ((r2 instanceof abcd.os) == true) goto L7;
        return false;
    L7:
        return this.j6.equals(((abcd.os) r2).j6);
    }

    public int hashCode() {
        return this.j6.hashCode();
    }

    public java.lang.String toString() {
        return this.j6.toString();
    }
}
