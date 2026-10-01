package tv.ouya.console.api.store;

public class Tag implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<tv.ouya.console.api.store.Tag> CREATOR = null;
    public java.lang.Boolean DW;
    private java.lang.String FH;
    private java.lang.String j6;

    static {
        CREATOR = new tv.ouya.console.api.store.d();
    }

    public Tag() {
    }

    public Tag(java.lang.String r1, java.lang.Boolean r2, java.lang.String r3) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof tv.ouya.console.api.store.Tag) == true) goto L8;
        return false;
    L8:
        tv.ouya.console.api.store.Tag r6 = (tv.ouya.console.api.store.Tag) r5;
        if (this.j6.equals(r6.j6) == true) goto L11;
        return false;
    L11:
        java.lang.Boolean r1 = this.DW;
        if (r1 == r1) goto L15;
        return false;
    L15:
        if (this.FH.equals(r6.FH) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.j6.hashCode() * 31) + this.DW.hashCode()) * 31) + this.FH.hashCode();
    }

    @Override
    public void writeToParcel(android.os.Parcel r1, int r2) {
        r1.writeString(this.j6);
        r1.writeInt(this.DW.booleanValue() ? 1 : 0);
        r1.writeString(this.FH);
    }
}
