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
        tv.ouya.console.api.UserInfo r6 = null;
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        java.lang.String r4 = null;
        java.util.Calendar r7 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this != r5) { $pc0 = 6; continue $sw0; }
                    return true;
                }
                case 6: {
                    if (r5 != null) { $pc0 = 8; continue $sw0; }
                    $pc0 = 49; continue $sw0;
                }
                case 49: {
                    return false;
                }
                case 8: {
                    if (tv.ouya.console.api.UserInfo.class != r5.getClass()) { $pc0 = 49; continue $sw0; }
                    r6 = (tv.ouya.console.api.UserInfo) r5;
                    r2 = this.FH;
                    if (r2 == null) { $pc0 = 16; continue $sw0; }
                    if (r2.equals(r6.FH) == false) { $pc0 = 17; continue $sw0; }
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    r3 = this.Hw;
                    if (r3 == null) { $pc0 = 24; continue $sw0; }
                    if (r3.equals(r6.Hw) == false) { $pc0 = 25; continue $sw0; }
                    $pc0 = 26; continue $sw0;
                }
                case 26: {
                    r4 = this.DW;
                    if (r4 == null) { $pc0 = 32; continue $sw0; }
                    if (r4.equals(r6.DW) == false) { $pc0 = 33; continue $sw0; }
                    $pc0 = 34; continue $sw0;
                }
                case 34: {
                    r7 = this.v5;
                    if (r7 == null) { $pc0 = 40; continue $sw0; }
                    if (r7.equals(r6.v5) == true) { $pc0 = 43; continue $sw0; }
                    $pc0 = 41; continue $sw0;
                }
                case 41: {
                    return false;
                }
                case 43: {
                    if (this.VH == r6.VH) { $pc0 = 46; continue $sw0; }
                    return false;
                }
                case 46: {
                    if (this.gn == r6.gn) { $pc0 = 48; continue $sw0; }
                    return false;
                }
                case 48: {
                    return true;
                }
                case 40: {
                    if (r6.v5 == null) { $pc0 = 43; continue $sw0; }
                    $pc0 = 33; continue $sw0;
                }
                case 33: {
                    return false;
                }
                case 32: {
                    if (r6.DW == null) { $pc0 = 34; continue $sw0; }
                    $pc0 = 25; continue $sw0;
                }
                case 25: {
                    return false;
                }
                case 24: {
                    if (r6.Hw == null) { $pc0 = 26; continue $sw0; }
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    return false;
                }
                case 16: {
                    if (r6.FH == null) { $pc0 = 18; continue $sw0; }
                    { $pc0 = 17; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        java.lang.String r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.String r4 = null;
        int r5 = 0;
        int r6 = 0;
        java.lang.String r7 = null;
        int r8 = 0;
        int r9 = 0;
        java.util.Calendar r10 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.DW;
                    r1 = 0;
                    if (r0 == null) { $pc1 = 5; continue $sw1; }
                    r2 = r0.hashCode();
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r3 = r2 * 31;
                    r4 = this.FH;
                    if (r4 == null) { $pc1 = 9; continue $sw1; }
                    r5 = r4.hashCode();
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    r6 = (r3 + r5) * 31;
                    r7 = this.Hw;
                    if (r7 == null) { $pc1 = 13; continue $sw1; }
                    r8 = r7.hashCode();
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    r9 = (r6 + r8) * 31;
                    r10 = this.v5;
                    if (r10 == null) { $pc1 = 18; continue $sw1; }
                    r1 = r10.hashCode();
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    return ((((((r9 + r1) * 31) + new java.lang.Integer(this.Zo).hashCode()) * 31) + java.lang.Boolean.valueOf(this.VH).hashCode()) * 31) + java.lang.Boolean.valueOf(this.gn).hashCode();
                }
                case 13: {
                    r8 = 0;
                    { $pc1 = 14; continue $sw1; }
                }
                case 9: {
                    r5 = 0;
                    { $pc1 = 10; continue $sw1; }
                }
                case 5: {
                    r2 = 0;
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return "UserInfo{username='" + this.DW + "', email='" + this.FH + "', password='" + this.Hw + "', dateOfBirth='" + this.v5 + "', gender='" + this.Zo + "', founder='" + (this.VH ? 1 : 0) + "', emailOptOut='" + (this.gn ? 1 : 0) + "'}";
    }

    @Override
    public void writeToParcel(android.os.Parcel r3, int r4) {
        java.util.Calendar r5 = null;
        long r0 = 0L;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r3.writeString(this.DW);
                    r3.writeString(this.FH);
                    r3.writeString(this.Hw);
                    r5 = this.v5;
                    if (r5 != null) { $pc2 = 5; continue $sw2; }
                    r0 = 0;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    r3.writeLong(r0);
                    r3.writeInt(this.Zo);
                    r3.writeByte(this.VH ? 1 : 0);
                    r3.writeByte(this.gn ? 1 : 0);
                    return;
                }
                case 5: {
                    r0 = r5.getTimeInMillis();
                    { $pc2 = 6; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
