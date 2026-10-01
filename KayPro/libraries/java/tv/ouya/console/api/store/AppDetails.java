package tv.ouya.console.api.store;

public final class AppDetails implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<tv.ouya.console.api.store.AppDetails> CREATOR = null;
    public java.lang.String DW;
    public java.lang.String EQ;
    public java.lang.String FH;
    public java.lang.String Hw;
    public boolean J0;
    public java.lang.String J8;
    public int Mr;
    public boolean QX;
    public java.lang.String VH;
    public boolean Ws;
    public java.lang.String XL;
    public java.lang.String Zo;
    public tv.ouya.console.api.Product aM;
    public java.util.List<java.lang.String> gn;
    public double j3;
    public java.lang.String j6;
    public java.lang.String tp;
    public java.lang.Long u7;
    public java.lang.Long v5;
    public java.lang.String we;

    static {
        CREATOR = new tv.ouya.console.api.store.b();
    }

    public AppDetails() {
        this.gn = new java.util.ArrayList();
    }

    public AppDetails(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.Long r8, java.lang.String r9, java.lang.String r10, java.util.List<java.lang.String> r11, java.lang.Long r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.Boolean r16, java.lang.String r17, java.lang.Boolean r18, java.lang.Boolean r19, java.lang.String r20, tv.ouya.console.api.Product r21, double r22, int r24) {
        this.j6 = r4;
        this.DW = r5;
        this.FH = r6;
        this.Hw = r7;
        this.v5 = r8;
        this.Zo = r9;
        this.VH = r10;
        this.gn = r11;
        this.u7 = r12;
        this.tp = r13;
        this.EQ = r14;
        this.we = r15;
        this.J0 = r16.booleanValue();
        this.J8 = r17;
        this.Ws = r18.booleanValue();
        this.QX = r19.booleanValue();
        this.XL = r20;
        this.aM = r21;
        this.j3 = r22;
        this.Mr = r24;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object r8) {
        tv.ouya.console.api.store.AppDetails r9 = null;
        java.lang.String r1 = null;
        tv.ouya.console.api.Product r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this != r8) { $pc0 = 6; continue $sw0; }
                    return true;
                }
                case 6: {
                    if ((r8 instanceof tv.ouya.console.api.store.AppDetails) == true) { $pc0 = 8; continue $sw0; }
                    return false;
                }
                case 8: {
                    r9 = (tv.ouya.console.api.store.AppDetails) r8;
                    if (this.DW.equals(r9.DW) == true) { $pc0 = 12; continue $sw0; }
                    return false;
                }
                case 12: {
                    if (this.FH.equals(r9.FH) == true) { $pc0 = 15; continue $sw0; }
                    return false;
                }
                case 15: {
                    if (this.j6.equals(r9.j6) == true) { $pc0 = 18; continue $sw0; }
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
                    if (this.Zo.equals(r9.Zo) == true) { $pc0 = 27; continue $sw0; }
                    return false;
                }
                case 27: {
                    if (this.VH.equals(r9.VH) == true) { $pc0 = 30; continue $sw0; }
                    return false;
                }
                case 30: {
                    if (this.u7.equals(r9.u7) == true) { $pc0 = 33; continue $sw0; }
                    return false;
                }
                case 33: {
                    if (this.tp.equals(r9.tp) == true) { $pc0 = 36; continue $sw0; }
                    return false;
                }
                case 36: {
                    if (this.EQ.equals(r9.EQ) == true) { $pc0 = 39; continue $sw0; }
                    return false;
                }
                case 39: {
                    if (this.we.equals(r9.we) == true) { $pc0 = 42; continue $sw0; }
                    return false;
                }
                case 42: {
                    if (this.J0 == r9.J0) { $pc0 = 45; continue $sw0; }
                    return false;
                }
                case 45: {
                    if (this.J8.equals(r9.J8) == true) { $pc0 = 48; continue $sw0; }
                    return false;
                }
                case 48: {
                    if (this.Ws == r9.Ws) { $pc0 = 51; continue $sw0; }
                    return false;
                }
                case 51: {
                    if (this.QX == r9.QX) { $pc0 = 53; continue $sw0; }
                    return false;
                }
                case 53: {
                    r1 = this.XL;
                    if (r1 != null) { $pc0 = 59; continue $sw0; }
                    if (r9.XL == null) { $pc0 = 61; continue $sw0; }
                    return false;
                }
                case 61: {
                    r2 = this.aM;
                    if (r2 != null) { $pc0 = 67; continue $sw0; }
                    if (r9.aM == null) { $pc0 = 70; continue $sw0; }
                    return false;
                }
                case 70: {
                    if (this.j3 == r9.j3) { $pc0 = 73; continue $sw0; }
                    return false;
                }
                case 73: {
                    if (this.Mr == r9.Mr) { $pc0 = 75; continue $sw0; }
                    return false;
                }
                case 75: {
                    return true;
                }
                case 67: {
                    if (r2.equals(r9.aM) == true) { $pc0 = 70; continue $sw0; }
                    return false;
                }
                case 59: {
                    if (r1.equals(r9.XL) == true) { $pc0 = 61; continue $sw0; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return (((((this.j6.hashCode() * 31) + this.DW.hashCode()) * 31) + this.FH.hashCode()) * 31) + this.Hw.hashCode();
    }

    @Override
    public void writeToParcel(android.os.Parcel r3, int r4) {
        int r0 = 0;
        tv.ouya.console.api.Product r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r3.writeString(this.j6);
                    r3.writeString(this.DW);
                    r3.writeString(this.FH);
                    r3.writeString(this.Hw);
                    r3.writeLong(this.v5.longValue());
                    r3.writeString(this.Zo);
                    r3.writeString(this.VH);
                    r3.writeStringList(this.gn);
                    r3.writeLong(this.u7.longValue());
                    r3.writeString(this.tp);
                    r3.writeString(this.EQ);
                    r3.writeString(this.we);
                    r3.writeByte(this.J0 ? 1 : 0);
                    r3.writeString(this.J8);
                    r3.writeByte(this.Ws ? 1 : 0);
                    r3.writeByte(this.QX ? 1 : 0);
                    r3.writeString(this.XL);
                    if (this.aM == null) { $pc1 = 5; continue $sw1; }
                    r0 = 1;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r3.writeInt(r0);
                    r1 = this.aM;
                    if (r1 == null) { $pc1 = 9; continue $sw1; }
                    r1.writeToParcel(r3, r4);
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    r3.writeDouble(this.j3);
                    r3.writeInt(this.Mr);
                    return;
                }
                case 5: {
                    r0 = 0;
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
