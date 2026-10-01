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
        tv.ouya.console.api.CreditCardInfo r9 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this != r8) { $pc0 = 6; continue $sw0; }
                    return true;
                }
                case 6: {
                    if ((r8 instanceof tv.ouya.console.api.CreditCardInfo) == true) { $pc0 = 8; continue $sw0; }
                    return false;
                }
                case 8: {
                    r9 = (tv.ouya.console.api.CreditCardInfo) r8;
                    if (this.j6 == r9.j6) { $pc0 = 12; continue $sw0; }
                    return false;
                }
                case 12: {
                    if (this.DW.equals(r9.DW) == true) { $pc0 = 15; continue $sw0; }
                    return false;
                }
                case 15: {
                    if (this.FH.equals(r9.FH) == true) { $pc0 = 18; continue $sw0; }
                    return false;
                }
                case 18: {
                    if (this.Hw.equals(r9.Hw) == true) { $pc0 = 21; continue $sw0; }
                    return false;
                }
                case 21: {
                    if (this.v5.equals(r9.v5) == true) { $pc0 = 24; continue $sw0; }
                    return false;
                }
                case 24: {
                    if (this.Zo == r9.Zo) { $pc0 = 26; continue $sw0; }
                    return false;
                }
                case 26: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        int r0 = 0;
        java.lang.String r1 = null;
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        java.lang.String r4 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = java.lang.Double.valueOf(this.j6).hashCode();
                    r1 = this.DW;
                    if (r1 == null) { $pc1 = 5; continue $sw1; }
                    r0 = (r0 * 31) + r1.hashCode();
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    r2 = this.FH;
                    if (r2 == null) { $pc1 = 8; continue $sw1; }
                    r0 = (r0 * 31) + r2.hashCode();
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    r3 = this.Hw;
                    if (r3 == null) { $pc1 = 11; continue $sw1; }
                    r0 = (r0 * 31) + r3.hashCode();
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    r4 = this.v5;
                    if (r4 != null) { $pc1 = 14; continue $sw1; }
                    return r0;
                }
                case 14: {
                    return (r0 * 31) + r4.hashCode();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
