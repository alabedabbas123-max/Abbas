package tv.ouya.console.api;

public class Purchasable implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<tv.ouya.console.api.Purchasable> CREATOR = null;
    private java.lang.String DW;
    private java.lang.String FH;
    private java.lang.String Hw;
    private java.lang.String j6;

    static {
        CREATOR = new tv.ouya.console.api.m();
    }

    public Purchasable(java.lang.String r1) {
        this.j6 = r1;
    }

    public Purchasable(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (tv.ouya.console.api.Purchasable.class == r3.getClass()) goto L10;
        return false;
    L10:
        return this.j6.equals(((tv.ouya.console.api.Purchasable) r3).j6);
    }

    public int hashCode() {
        return this.j6.hashCode();
    }

    public boolean j6() {
        if (this.DW != null) goto L5;
    L9:
        return false;
    L5:
        if (this.FH == null) goto L9;
        if (this.Hw == null) goto L9;
        return true;
    }

    @Override
    public void writeToParcel(android.os.Parcel r1, int r2) {
        r1.writeString(this.j6);
        if (j6() == false) goto L5;
        r1.writeByte((byte) 2);
        r1.writeString(this.DW);
        r1.writeString(this.FH);
        r1.writeString(this.Hw);
        return;
    L5:
        r1.writeByte((byte) 1);
    }
}
