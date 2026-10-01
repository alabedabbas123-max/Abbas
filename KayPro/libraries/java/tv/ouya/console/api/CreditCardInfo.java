package tv.ouya.console.api;

public class CreditCardInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<tv.ouya.console.api.CreditCardInfo> CREATOR = null;
    private java.lang.String DW;
    private java.lang.String FH;
    private java.lang.String Hw;
    private boolean Zo;
    private double j6;
    private java.lang.String v5;

    static {
        CREATOR = new tv.ouya.console.api.b();
    }

    public CreditCardInfo() {
    }

    public CreditCardInfo(double r1, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7) {
        this.j6 = r1;
        this.DW = r3;
        this.FH = r4;
        this.Hw = r5;
        this.v5 = r6;
        this.Zo = r7;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof tv.ouya.console.api.CreditCardInfo) == true) goto L8;
        return false;
    L8:
        tv.ouya.console.api.CreditCardInfo r9 = (tv.ouya.console.api.CreditCardInfo) r8;
        if (this.j6 == r9.j6) goto L12;
        return false;
    L12:
        if (this.DW.equals(r9.DW) == true) goto L15;
        return false;
    L15:
        if (this.FH.equals(r9.FH) == true) goto L18;
        return false;
    L18:
        if (this.Hw.equals(r9.Hw) == true) goto L21;
        return false;
    L21:
        if (this.v5.equals(r9.v5) == true) goto L24;
        return false;
    L24:
        if (this.Zo == r9.Zo) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        int r0 = java.lang.Double.valueOf(this.j6).hashCode();
        java.lang.String r1 = this.DW;
        if (r1 == null) goto L5;
        r0 = (r0 * 31) + r1.hashCode();
    L5:
        java.lang.String r2 = this.FH;
        if (r2 == null) goto L8;
        r0 = (r0 * 31) + r2.hashCode();
    L8:
        java.lang.String r3 = this.Hw;
        if (r3 == null) goto L11;
        r0 = (r0 * 31) + r3.hashCode();
    L11:
        java.lang.String r4 = this.v5;
        if (r4 != null) goto L14;
        return r0;
    L14:
        return (r0 * 31) + r4.hashCode();
    }

    @Override
    public void writeToParcel(android.os.Parcel r3, int r4) {
        r3.writeDouble(this.j6);
        r3.writeString(this.DW);
        r3.writeString(this.FH);
        r3.writeString(this.Hw);
        r3.writeString(this.v5);
        r3.writeInt(this.Zo ? 1 : 0);
    }
}
