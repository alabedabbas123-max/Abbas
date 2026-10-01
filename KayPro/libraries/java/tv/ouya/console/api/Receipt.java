package tv.ouya.console.api;

public class Receipt implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<tv.ouya.console.api.Receipt> CREATOR = null;
    private static final java.text.SimpleDateFormat j6 = null;
    private java.lang.String DW;
    private int FH;
    private java.util.Date Hw;
    private double VH;
    private java.lang.String Zo;
    private java.lang.String gn;
    private java.util.Date u7;
    private java.lang.String v5;

    static {
        j6 = new java.text.SimpleDateFormat("yyy-MM-dd'T'HH:mm:ss'Z'");
        j6.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        CREATOR = new tv.ouya.console.api.n();
    }

    public Receipt() {
    }

    public Receipt(java.lang.String r1, int r2, java.util.Date r3, java.util.Date r4, java.lang.String r5, java.lang.String r6, double r7, java.lang.String r9) {
        this.DW = r1;
        this.FH = r2;
        this.Hw = r3;
        this.u7 = r4;
        this.v5 = r5;
        this.Zo = r6;
        this.VH = r7;
        this.gn = r9;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof tv.ouya.console.api.Receipt) == true) goto L8;
        return false;
    L8:
        tv.ouya.console.api.Receipt r9 = (tv.ouya.console.api.Receipt) r8;
        if (this.DW.equals(r9.DW) == true) goto L12;
        return false;
    L12:
        if (this.FH == r9.FH) goto L15;
        return false;
    L15:
        if (this.Hw.equals(r9.Hw) == true) goto L18;
        return false;
    L18:
        if (this.v5.equals(r9.v5) == true) goto L21;
        return false;
    L21:
        if (this.Zo.equals(r9.Zo) == true) goto L24;
        return false;
    L24:
        if (this.VH == r9.VH) goto L26;
        return false;
    L26:
        java.lang.String r1 = this.gn;
        if (r1 != null) goto L29;
    L31:
        return true;
    L29:
        if (r1.equals(r9.gn) == true) goto L31;
        return false;
    }

    public int hashCode() {
        int r0 = (((((((((this.DW.hashCode() * 31) + this.FH) * 31) + this.Hw.hashCode()) * 31) + this.v5.hashCode()) * 31) + this.Zo.hashCode()) * 31) + java.lang.Double.valueOf(this.VH).hashCode();
        java.lang.String r1 = this.gn;
        if (r1 != null) goto L5;
        return r0;
    L5:
        return (r0 * 31) + r1.hashCode();
    }

    public java.lang.String j6() {
        return this.DW;
    }

    @Override
    public void writeToParcel(android.os.Parcel r3, int r4) {
        r3.writeString(this.DW);
        r3.writeInt(this.FH);
        r3.writeLong(this.Hw.getTime());
        r3.writeLong(this.u7.getTime());
        r3.writeString(this.v5);
        r3.writeString(this.Zo);
        r3.writeDouble(this.VH);
        r3.writeString(this.gn);
    }
}
