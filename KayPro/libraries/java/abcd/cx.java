package abcd;

@java.lang.Deprecated
public final class cx {
    public static final abcd.cx DW = null;
    public static final abcd.cx FH = null;
    public static final abcd.cx Hw = null;
    public static final abcd.cx Zo = null;
    public static final abcd.cx j6 = null;
    public static final abcd.cx v5 = null;
    private final com.google.android.gms.ads.d VH;

    static {
        j6 = new abcd.cx(-1, -2, "mb");
        DW = new abcd.cx(320, 50, "mb");
        FH = new abcd.cx(300, 250, "as");
        Hw = new abcd.cx(468, 60, "as");
        v5 = new abcd.cx(728, 90, "as");
        Zo = new abcd.cx(160, 600, "as");
    }

    private cx(int r1, int r2, java.lang.String r3) {
        this(new com.google.android.gms.ads.d(r1, r2));
    }

    public cx(com.google.android.gms.ads.d r1) {
        this.VH = r1;
    }

    public final int DW() {
        return this.VH.DW();
    }

    public final boolean equals(java.lang.Object r2) {
        if ((r2 instanceof abcd.cx) == true) goto L7;
        return false;
    L7:
        return this.VH.equals(((abcd.cx) r2).VH);
    }

    public final int hashCode() {
        return this.VH.hashCode();
    }

    public final int j6() {
        return this.VH.j6();
    }

    public final java.lang.String toString() {
        return this.VH.toString();
    }
}
