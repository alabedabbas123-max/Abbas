package com.aide.engine;

@abcd.Interfacexu
public class SyntaxError implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.aide.engine.SyntaxError> CREATOR = null;

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public java.lang.String EQ;
    public int FH;
    public int Hw;
    public int J0;
    public int J8;
    public int QX;
    public int VH;
    public boolean Ws;
    public int Zo;
    public int gn;
    public java.lang.String[] tp;
    public java.lang.String u7;
    public int v5;
    public java.lang.String we;

    static {
        abcd.wu.j6(com.aide.engine.SyntaxError.class, 4104537337278253029L, 4104537337278253029L);     // Catch: java.lang.Throwable -> L8
        if (j6 == false) goto L6;
        abcd.wu.j6(-2129579614895116965L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        CREATOR = new com.aide.engine.N();     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2129579614895116965L, null);
    L12:
        throw th;
    }

    public SyntaxError() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4169368234520153852L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4169368234520153852L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public SyntaxError(android.os.Parcel r6) {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -425723978459130624L, null, r6);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-425723978459130624L, null, r6);     // Catch: java.lang.Throwable -> L15
    L6:
        this.v5 = r6.readInt();     // Catch: java.lang.Throwable -> L15
        this.Zo = r6.readInt();     // Catch: java.lang.Throwable -> L15
        this.VH = r6.readInt();     // Catch: java.lang.Throwable -> L15
        this.gn = r6.readInt();     // Catch: java.lang.Throwable -> L15
        this.u7 = r6.readString();     // Catch: java.lang.Throwable -> L15
        int r3 = r6.readInt();     // Catch: java.lang.Throwable -> L15
        if (r3 <= 0) goto L9;
        this.tp = new java.lang.String[r3];     // Catch: java.lang.Throwable -> L15
        r6.readStringArray(this.tp);     // Catch: java.lang.Throwable -> L15
    L9:
        this.FH = r6.readInt();     // Catch: java.lang.Throwable -> L15
        this.J0 = r6.readInt();     // Catch: java.lang.Throwable -> L15
        this.J8 = r6.readInt();     // Catch: java.lang.Throwable -> L15
        if (r6.readInt() == 0) goto L12;
        boolean r4 = true;
    L13:
        this.Ws = r4;     // Catch: java.lang.Throwable -> L15
        this.QX = r6.readInt();     // Catch: java.lang.Throwable -> L15
        this.Hw = r6.readInt();     // Catch: java.lang.Throwable -> L15
        return;
    L12:
        r4 = false;
        goto L13
    }

    public java.lang.String DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3087337363600242633L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3087337363600242633L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.u7;
    }

    public boolean FH() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 668889873980152216L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(668889873980152216L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        if (this.FH != 400) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean Hw() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 759250274641635327L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(759250274641635327L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        if (this.FH != 0) goto L9;
        return true;
    L9:
        return false;
    }

    public boolean Zo() {
    L19:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, 3667319843045641327L, this);
    L23:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3667319843045641327L, this);     // Catch: java.lang.Throwable -> L19
    L6:
        int r0 = this.FH;     // Catch: java.lang.Throwable -> L19
        if (r0 != 2) goto L10;
        return true;
    L10:
        if (r0 != 250) goto L12;
        return true;
    L12:
        if (r0 == 251) goto L27;
        switch(r0) {
            case 101: goto L28;
            case 102: goto L28;
            case 103: goto L28;
            case 104: goto L28;
            case 105: goto L28;
            case 106: goto L28;
            case 107: goto L28;
            case 108: goto L28;
            case 109: goto L28;
            case 110: goto L28;
            case 111: goto L28;
            case 112: goto L28;
            default: goto L14;
        };
    L14:
        switch(r0) {
            case 200: goto L29;
            case 201: goto L29;
            case 202: goto L29;
            case 203: goto L29;
            case 204: goto L29;
            default: goto L15;
        };
    L15:
        return false;
    L29:
        return true;
    L28:
        return true;
    L27:
        return true;
    }

    @Override
    public int describeContents() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1883471214711647440L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(1883471214711647440L, this);     // Catch: java.lang.Throwable -> L8
        return 0;
    L15:
        return 0;
    }

    public java.lang.String j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3406977644717059875L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3406977644717059875L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.u7.replace("</C>", "'").replace("<//C>", "'");
    }

    public boolean v5() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 3715574730199035363L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3715574730199035363L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        if (this.FH != 500) goto L10;
        return true;
    L10:
        return false;
    }

    @Override
    public void writeToParcel(android.os.Parcel r8, int r9) {
    L16:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, 3627705125535186759L, this, r8, new java.lang.Integer(r9));
    L20:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(3627705125535186759L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L16
    L5:
        r8.writeInt(this.v5);     // Catch: java.lang.Throwable -> L16
        r8.writeInt(this.Zo);     // Catch: java.lang.Throwable -> L16
        r8.writeInt(this.VH);     // Catch: java.lang.Throwable -> L16
        r8.writeInt(this.gn);     // Catch: java.lang.Throwable -> L16
        r8.writeString(this.u7);     // Catch: java.lang.Throwable -> L16
        int r1 = 0;
        if (this.tp != null) goto L8;
    L10:
        r8.writeInt(0);     // Catch: java.lang.Throwable -> L16
    L11:
        r8.writeInt(this.FH);     // Catch: java.lang.Throwable -> L16
        r8.writeInt(this.J0);     // Catch: java.lang.Throwable -> L16
        r8.writeInt(this.J8);     // Catch: java.lang.Throwable -> L16
        if (this.Ws == false) goto L14;
        r1 = 1;
    L14:
        r8.writeInt(r1);     // Catch: java.lang.Throwable -> L16
        r8.writeInt(this.QX);     // Catch: java.lang.Throwable -> L16
        r8.writeInt(this.Hw);     // Catch: java.lang.Throwable -> L16
        return;
    L8:
        if (this.tp.length <= 0) goto L10;
        r8.writeInt(this.tp.length);     // Catch: java.lang.Throwable -> L16
        r8.writeStringArray(this.tp);     // Catch: java.lang.Throwable -> L16
        goto L11
    }
}
