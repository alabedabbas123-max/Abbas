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
        tv.ouya.console.api.Receipt r9 = null;
        java.lang.String r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this != r8) { $pc0 = 6; continue $sw0; }
                    return true;
                }
                case 6: {
                    if ((r8 instanceof tv.ouya.console.api.Receipt) == true) { $pc0 = 8; continue $sw0; }
                    return false;
                }
                case 8: {
                    r9 = (tv.ouya.console.api.Receipt) r8;
                    if (this.DW.equals(r9.DW) == true) { $pc0 = 12; continue $sw0; }
                    return false;
                }
                case 12: {
                    if (this.FH == r9.FH) { $pc0 = 15; continue $sw0; }
                    return false;
                }
                case 15: {
                    if (this.Hw.equals(r9.Hw) == true) { $pc0 = 18; continue $sw0; }
                    return false;
                }
                case 18: {
                    if (this.v5.equals(r9.v5) == true) { $pc0 = 21; continue $sw0; }
                    return false;
                }
                case 21: {
                    if (this.Zo.equals(r9.Zo) == true) { $pc0 = 24; continue $sw0; }
                    return false;
                }
                case 24: {
                    if (this.VH == r9.VH) { $pc0 = 26; continue $sw0; }
                    return false;
                }
                case 26: {
                    r1 = this.gn;
                    if (r1 != null) { $pc0 = 29; continue $sw0; }
                    $pc0 = 31; continue $sw0;
                }
                case 31: {
                    return true;
                }
                case 29: {
                    if (r1.equals(r9.gn) == true) { $pc0 = 31; continue $sw0; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        int r0 = 0;
        java.lang.String r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = (((((((((this.DW.hashCode() * 31) + this.FH) * 31) + this.Hw.hashCode()) * 31) + this.v5.hashCode()) * 31) + this.Zo.hashCode()) * 31) + java.lang.Double.valueOf(this.VH).hashCode();
                    r1 = this.gn;
                    if (r1 != null) { $pc1 = 5; continue $sw1; }
                    return r0;
                }
                case 5: {
                    return (r0 * 31) + r1.hashCode();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
