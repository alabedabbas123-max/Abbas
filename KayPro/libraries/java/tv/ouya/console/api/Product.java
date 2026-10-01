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
        tv.ouya.console.api.Product r9 = null;
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
                    if ((r8 instanceof tv.ouya.console.api.Product) == true) { $pc0 = 8; continue $sw0; }
                    return false;
                }
                case 8: {
                    r9 = (tv.ouya.console.api.Product) r8;
                    if (this.FH == r9.FH) { $pc0 = 12; continue $sw0; }
                    return false;
                }
                case 12: {
                    if (this.DW.equals(r9.DW) == true) { $pc0 = 15; continue $sw0; }
                    return false;
                }
                case 15: {
                    if (this.j6.equals(r9.j6) == true) { $pc0 = 18; continue $sw0; }
                    return false;
                }
                case 18: {
                    if (this.Hw == r9.Hw) { $pc0 = 20; continue $sw0; }
                    return false;
                }
                case 20: {
                    r1 = this.v5;
                    if (r1 == null) { $pc0 = 26; continue $sw0; }
                    if (r1.equals(r9.v5) == true) { $pc0 = 26; continue $sw0; }
                    return false;
                }
                case 26: {
                    if (this.Zo == r9.Zo) { $pc0 = 29; continue $sw0; }
                    return false;
                }
                case 29: {
                    if (this.VH == r9.VH) { $pc0 = 32; continue $sw0; }
                    return false;
                }
                case 32: {
                    if (this.gn.equals(r9.gn) == true) { $pc0 = 35; continue $sw0; }
                    return false;
                }
                case 35: {
                    if (this.u7.equals(r9.u7) == true) { $pc0 = 37; continue $sw0; }
                    return false;
                }
                case 37: {
                    return true;
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
                    r0 = (((((this.j6.hashCode() * 31) + this.DW.hashCode()) * 31) + this.FH) * 31) + java.lang.Double.valueOf(this.Hw).hashCode();
                    r1 = this.v5;
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

    @Override
    public void writeToParcel(android.os.Parcel r3, int r4) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r3.writeString(this.j6);
                    r3.writeString(this.DW);
                    r3.writeInt(this.FH);
                    if (this.tp < 2) { $pc2 = 6; continue $sw2; }
                    r3.writeDouble(this.Hw);
                    r3.writeString(this.v5);
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (this.tp < 3) { $pc2 = 9; continue $sw2; }
                    r3.writeDouble(this.Zo);
                    r3.writeDouble(this.VH);
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    if (this.tp < 4) { $pc2 = 12; continue $sw2; }
                    r3.writeString(this.gn);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    if (this.tp < 5) { $pc2 = 15; continue $sw2; }
                    r3.writeString(this.u7);
                    return;
                }
                case 15: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
