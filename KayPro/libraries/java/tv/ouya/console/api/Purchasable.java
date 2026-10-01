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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this != r3) { $pc0 = 5; continue $sw0; }
                    return true;
                }
                case 5: {
                    if (r3 != null) { $pc0 = 7; continue $sw0; }
                    return false;
                }
                case 7: {
                    if (tv.ouya.console.api.Purchasable.class == r3.getClass()) { $pc0 = 10; continue $sw0; }
                    return false;
                }
                case 10: {
                    return this.j6.equals(((tv.ouya.console.api.Purchasable) r3).j6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return this.j6.hashCode();
    }

    public boolean j6() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.DW != null) { $pc1 = 5; continue $sw1; }
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    return false;
                }
                case 5: {
                    if (this.FH == null) { $pc1 = 9; continue $sw1; }
                    if (this.Hw == null) { $pc1 = 9; continue $sw1; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void writeToParcel(android.os.Parcel r1, int r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r1.writeString(this.j6);
                    if (j6() == false) { $pc2 = 5; continue $sw2; }
                    r1.writeByte((byte) 2);
                    r1.writeString(this.DW);
                    r1.writeString(this.FH);
                    r1.writeString(this.Hw);
                    return;
                }
                case 5: {
                    r1.writeByte((byte) 1);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
