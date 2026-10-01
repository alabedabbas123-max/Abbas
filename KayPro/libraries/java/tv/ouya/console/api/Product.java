package tv.ouya.console.api;

public class Product implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<tv.ouya.console.api.Product> CREATOR = null;
    private java.lang.String DW;
    private int FH;
    private double Hw;
    private double VH;
    private double Zo;
    private java.lang.String gn;
    private java.lang.String j6;
    private int tp;
    private java.lang.String u7;
    private java.lang.String v5;

    static {
        CREATOR = new tv.ouya.console.api.l();
    }

    public Product() {
        this.tp = 5;
    }

    public Product(java.lang.String r2, java.lang.String r3, int r4, double r5, java.lang.String r7, double r8, double r10, java.lang.String r12, java.lang.String r13) {
        this.tp = 5;
        this.j6 = r2;
        this.DW = r3;
        this.FH = r4;
        this.Hw = r5;
        this.v5 = r7;
        this.Zo = r8;
        this.VH = r10;
        this.gn = r12;
        this.u7 = r13;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof tv.ouya.console.api.Product) == true) goto L8;
        return false;
    L8:
        tv.ouya.console.api.Product r9 = (tv.ouya.console.api.Product) r8;
        if (this.FH == r9.FH) goto L12;
        return false;
    L12:
        if (this.DW.equals(r9.DW) == true) goto L15;
        return false;
    L15:
        if (this.j6.equals(r9.j6) == true) goto L18;
        return false;
    L18:
        if (this.Hw == r9.Hw) goto L20;
        return false;
    L20:
        java.lang.String r1 = this.v5;
        if (r1 == null) goto L26;
        if (r1.equals(r9.v5) == true) goto L26;
        return false;
    L26:
        if (this.Zo == r9.Zo) goto L29;
        return false;
    L29:
        if (this.VH == r9.VH) goto L32;
        return false;
    L32:
        if (this.gn.equals(r9.gn) == true) goto L35;
        return false;
    L35:
        if (this.u7.equals(r9.u7) == true) goto L37;
        return false;
    L37:
        return true;
    }

    public int hashCode() {
        int r0 = (((((this.j6.hashCode() * 31) + this.DW.hashCode()) * 31) + this.FH) * 31) + java.lang.Double.valueOf(this.Hw).hashCode();
        java.lang.String r1 = this.v5;
        if (r1 != null) goto L5;
        return r0;
    L5:
        return (r0 * 31) + r1.hashCode();
    }

    @Override
    public void writeToParcel(android.os.Parcel r3, int r4) {
        r3.writeString(this.j6);
        r3.writeString(this.DW);
        r3.writeInt(this.FH);
        if (this.tp < 2) goto L6;
        r3.writeDouble(this.Hw);
        r3.writeString(this.v5);
    L6:
        if (this.tp < 3) goto L9;
        r3.writeDouble(this.Zo);
        r3.writeDouble(this.VH);
    L9:
        if (this.tp < 4) goto L12;
        r3.writeString(this.gn);
    L12:
        if (this.tp < 5) goto L15;
        r3.writeString(this.u7);
        return;
    }
}
