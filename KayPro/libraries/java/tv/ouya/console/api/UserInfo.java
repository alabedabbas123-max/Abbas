package tv.ouya.console.api;

public class UserInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<tv.ouya.console.api.UserInfo> CREATOR = null;
    public static final java.text.DateFormat j6 = null;
    private java.lang.String DW;
    private java.lang.String FH;
    private java.lang.String Hw;
    private boolean VH;
    private int Zo;
    private boolean gn;
    private java.util.Calendar v5;

    static {
        CREATOR = new tv.ouya.console.api.p();
        j6 = new java.text.SimpleDateFormat("MM/dd/yyyy");
        j6.setLenient(false);
    }

    public UserInfo() {
    }

    static java.lang.String DW(tv.ouya.console.api.UserInfo r0, java.lang.String r1) {
        r0.FH = r1;
        return r1;
    }

    static boolean DW(tv.ouya.console.api.UserInfo r0, boolean r1) {
        r0.gn = r1;
        return r1;
    }

    static java.lang.String FH(tv.ouya.console.api.UserInfo r0, java.lang.String r1) {
        r0.Hw = r1;
        return r1;
    }

    static int j6(tv.ouya.console.api.UserInfo r0, int r1) {
        r0.Zo = r1;
        return r1;
    }

    static java.lang.String j6(tv.ouya.console.api.UserInfo r0, java.lang.String r1) {
        r0.DW = r1;
        return r1;
    }

    static java.util.Calendar j6(tv.ouya.console.api.UserInfo r0) {
        return r0.v5;
    }

    static java.util.Calendar j6(tv.ouya.console.api.UserInfo r0, java.util.Calendar r1) {
        r0.v5 = r1;
        return r1;
    }

    static boolean j6(tv.ouya.console.api.UserInfo r0, boolean r1) {
        r0.VH = r1;
        return r1;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L49:
        return false;
    L8:
        if (tv.ouya.console.api.UserInfo.class != r5.getClass()) goto L49;
        tv.ouya.console.api.UserInfo r6 = (tv.ouya.console.api.UserInfo) r5;
        java.lang.String r2 = this.FH;
        if (r2 == null) goto L16;
        if (r2.equals(r6.FH) == false) goto L17;
    L18:
        java.lang.String r3 = this.Hw;
        if (r3 == null) goto L24;
        if (r3.equals(r6.Hw) == false) goto L25;
    L26:
        java.lang.String r4 = this.DW;
        if (r4 == null) goto L32;
        if (r4.equals(r6.DW) == false) goto L33;
    L34:
        java.util.Calendar r7 = this.v5;
        if (r7 == null) goto L40;
        if (r7.equals(r6.v5) == true) goto L43;
    L41:
        return false;
    L43:
        if (this.VH == r6.VH) goto L46;
        return false;
    L46:
        if (this.gn == r6.gn) goto L48;
        return false;
    L48:
        return true;
    L40:
        if (r6.v5 == null) goto L43;
    L33:
        return false;
    L32:
        if (r6.DW == null) goto L34;
    L25:
        return false;
    L24:
        if (r6.Hw == null) goto L26;
    L17:
        return false;
    L16:
        if (r6.FH == null) goto L18;
        goto L17
    }

    public int hashCode() {
        java.lang.String r0 = this.DW;
        int r1 = 0;
        if (r0 == null) goto L5;
        int r2 = r0.hashCode();
    L6:
        int r3 = r2 * 31;
        java.lang.String r4 = this.FH;
        if (r4 == null) goto L9;
        int r5 = r4.hashCode();
    L10:
        int r6 = (r3 + r5) * 31;
        java.lang.String r7 = this.Hw;
        if (r7 == null) goto L13;
        int r8 = r7.hashCode();
    L14:
        int r9 = (r6 + r8) * 31;
        java.util.Calendar r10 = this.v5;
        if (r10 == null) goto L18;
        r1 = r10.hashCode();
    L18:
        return ((((((r9 + r1) * 31) + new java.lang.Integer(this.Zo).hashCode()) * 31) + java.lang.Boolean.valueOf(this.VH).hashCode()) * 31) + java.lang.Boolean.valueOf(this.gn).hashCode();
    L13:
        r8 = 0;
        goto L14
    L9:
        r5 = 0;
        goto L10
    L5:
        r2 = 0;
        goto L6
    }

    public java.lang.String toString() {
        return "UserInfo{username='" + this.DW + "', email='" + this.FH + "', password='" + this.Hw + "', dateOfBirth='" + this.v5 + "', gender='" + this.Zo + "', founder='" + (this.VH ? 1 : 0) + "', emailOptOut='" + (this.gn ? 1 : 0) + "'}";
    }

    @Override
    public void writeToParcel(android.os.Parcel r3, int r4) {
        r3.writeString(this.DW);
        r3.writeString(this.FH);
        r3.writeString(this.Hw);
        java.util.Calendar r5 = this.v5;
        if (r5 != null) goto L5;
        long r0 = 0;
    L6:
        r3.writeLong(r0);
        r3.writeInt(this.Zo);
        r3.writeByte(this.VH ? 1 : 0);
        r3.writeByte(this.gn ? 1 : 0);
        return;
    L5:
        r0 = r5.getTimeInMillis();
        goto L6
    }
}
