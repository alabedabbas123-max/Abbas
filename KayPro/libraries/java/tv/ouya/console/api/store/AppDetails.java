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
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof tv.ouya.console.api.store.AppDetails) == true) goto L8;
        return false;
    L8:
        tv.ouya.console.api.store.AppDetails r9 = (tv.ouya.console.api.store.AppDetails) r8;
        if (this.DW.equals(r9.DW) == true) goto L12;
        return false;
    L12:
        if (this.FH.equals(r9.FH) == true) goto L15;
        return false;
    L15:
        if (this.j6.equals(r9.j6) == true) goto L18;
        return false;
    L18:
        if (this.Hw.equals(r9.Hw) == true) goto L21;
        return false;
    L21:
        if (this.v5.equals(r9.v5) == true) goto L24;
        return false;
    L24:
        if (this.Zo.equals(r9.Zo) == true) goto L27;
        return false;
    L27:
        if (this.VH.equals(r9.VH) == true) goto L30;
        return false;
    L30:
        if (this.u7.equals(r9.u7) == true) goto L33;
        return false;
    L33:
        if (this.tp.equals(r9.tp) == true) goto L36;
        return false;
    L36:
        if (this.EQ.equals(r9.EQ) == true) goto L39;
        return false;
    L39:
        if (this.we.equals(r9.we) == true) goto L42;
        return false;
    L42:
        if (this.J0 == r9.J0) goto L45;
        return false;
    L45:
        if (this.J8.equals(r9.J8) == true) goto L48;
        return false;
    L48:
        if (this.Ws == r9.Ws) goto L51;
        return false;
    L51:
        if (this.QX == r9.QX) goto L53;
        return false;
    L53:
        java.lang.String r1 = this.XL;
        if (r1 != null) goto L59;
        if (r9.XL == null) goto L61;
        return false;
    L61:
        tv.ouya.console.api.Product r2 = this.aM;
        if (r2 != null) goto L67;
        if (r9.aM == null) goto L70;
        return false;
    L70:
        if (this.j3 == r9.j3) goto L73;
        return false;
    L73:
        if (this.Mr == r9.Mr) goto L75;
        return false;
    L75:
        return true;
    L67:
        if (r2.equals(r9.aM) == true) goto L70;
        return false;
    L59:
        if (r1.equals(r9.XL) == true) goto L61;
        return false;
    }

    public int hashCode() {
        return (((((this.j6.hashCode() * 31) + this.DW.hashCode()) * 31) + this.FH.hashCode()) * 31) + this.Hw.hashCode();
    }

    @Override
    public void writeToParcel(android.os.Parcel r3, int r4) {
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
        if (this.aM == null) goto L5;
        int r0 = 1;
    L6:
        r3.writeInt(r0);
        tv.ouya.console.api.Product r1 = this.aM;
        if (r1 == null) goto L9;
        r1.writeToParcel(r3, r4);
    L9:
        r3.writeDouble(this.j3);
        r3.writeInt(this.Mr);
        return;
    L5:
        r0 = 0;
        goto L6
    }
}
