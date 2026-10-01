package com.aide.engine;

@abcd.Interfacexu
public class FileHighlightings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.aide.engine.FileHighlightings> CREATOR = null;

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public java.lang.String FH;
    public com.aide.engine.Enumm[] Hw;
    public int[] VH;
    public int[] Zo;
    public int[] gn;
    public int tp;
    public int u7;
    public int[] v5;

    static {
        abcd.wu.j6(com.aide.engine.FileHighlightings.class, 7780765271333714769L, 7780765271333714769L);     // Catch: java.lang.Throwable -> L8
        if (j6 == false) goto L6;
        abcd.wu.j6(1314669640533748995L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        CREATOR = new com.aide.engine.ClassI();     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1314669640533748995L, null);
    L12:
        throw th;
    }

    public FileHighlightings() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3566736626202971200L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3566736626202971200L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @Override
    public int describeContents() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4910506993268413032L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(4910506993268413032L, this);     // Catch: java.lang.Throwable -> L8
        return 0;
    L15:
        return 0;
    }

    public void j6(android.os.Parcel r8) {
    L23:
        th = move-exception;
        if (DW == false) goto L28;
        abcd.wu.j6(th, -2812940080177441136L, this, r8);
    L28:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2812940080177441136L, this, r8);     // Catch: java.lang.Throwable -> L23
    L6:
        this.FH = r8.readString();     // Catch: java.lang.Throwable -> L23
        this.u7 = r8.readInt();     // Catch: java.lang.Throwable -> L23
        this.tp = r8.readInt();     // Catch: java.lang.Throwable -> L23
        if (this.Hw != null) goto L9;
    L10:
        int r2 = (this.u7 * 5) / 4;     // Catch: java.lang.Throwable -> L23
        this.Hw = new com.aide.engine.Enumm[r2];     // Catch: java.lang.Throwable -> L23
        this.v5 = new int[r2];     // Catch: java.lang.Throwable -> L23
        this.VH = new int[r2];     // Catch: java.lang.Throwable -> L23
        this.Zo = new int[r2];     // Catch: java.lang.Throwable -> L23
        this.gn = new int[r2];     // Catch: java.lang.Throwable -> L23
    L11:
        com.aide.engine.Enumm[] r3 = com.aide.engine.Enumm.values();     // Catch: java.lang.Throwable -> L23
        int r4 = 0;
    L12:
        if (r4 >= this.u7) goto L22;
        byte r5 = r8.readByte();     // Catch: java.lang.Throwable -> L23
        if (r5 != 0) goto L18;
        this.Hw[r4] = null;     // Catch: java.lang.Throwable -> L23
    L21:
        r4 = r4 + 1;
        goto L12
    L18:
        if ((r5 & 128) != 0) goto L20;
        this.Hw[r4] = r3[r5];     // Catch: java.lang.Throwable -> L23
        int r6 = r8.readInt();     // Catch: java.lang.Throwable -> L23
        int[] r7 = this.v5;     // Catch: java.lang.Throwable -> L23
        this.VH[r4] = r6;     // Catch: java.lang.Throwable -> L23
        r7[r4] = r6;     // Catch: java.lang.Throwable -> L23
        this.Zo[r4] = r8.readByte();     // Catch: java.lang.Throwable -> L23
        this.gn[r4] = r8.readByte();     // Catch: java.lang.Throwable -> L23
        goto L21
    L20:
        this.Hw[r4] = r3[r5 & 127];     // Catch: java.lang.Throwable -> L23
        this.v5[r4] = r8.readInt();     // Catch: java.lang.Throwable -> L23
        this.Zo[r4] = r8.readInt();     // Catch: java.lang.Throwable -> L23
        this.VH[r4] = r8.readInt();     // Catch: java.lang.Throwable -> L23
        this.gn[r4] = r8.readInt();     // Catch: java.lang.Throwable -> L23
        goto L21
    L22:
        return;
    L9:
        if (this.Hw.length >= this.u7) goto L11;
        goto L10
    }

    @Override
    public void writeToParcel(android.os.Parcel r9, int r10) {
    L22:
        th = move-exception;
        if (DW == false) goto L27;
        abcd.wu.j6(th, -2593435452539459385L, this, r9, new java.lang.Integer(r10));
    L27:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2593435452539459385L, this, r9, new java.lang.Integer(r10));     // Catch: java.lang.Throwable -> L22
    L5:
        this.u7 = java.lang.Math.min(30000, this.u7);     // Catch: java.lang.Throwable -> L22
        r9.writeString(this.FH);     // Catch: java.lang.Throwable -> L22
        r9.writeInt(this.u7);     // Catch: java.lang.Throwable -> L22
        r9.writeInt(this.tp);     // Catch: java.lang.Throwable -> L22
        int r1 = 0;
    L6:
        if (r1 >= this.u7) goto L21;
        com.aide.engine.Enumm r2 = this.Hw[r1];     // Catch: java.lang.Throwable -> L22
        if (r2 != null) goto L11;
    L19:
        r9.writeByte((byte) 0);     // Catch: java.lang.Throwable -> L22
    L20:
        r1 = r1 + 1;
        goto L6
    L11:
        if (r2 == com.aide.engine.Enumm.j6) goto L19;
        int r3 = this.v5[r1];     // Catch: java.lang.Throwable -> L22
        int r4 = this.Zo[r1];     // Catch: java.lang.Throwable -> L22
        int r5 = this.VH[r1];     // Catch: java.lang.Throwable -> L22
        int r6 = this.gn[r1];     // Catch: java.lang.Throwable -> L22
        if (r3 == r5) goto L16;
    L18:
        r9.writeByte((byte) (r2.ordinal() | 128));     // Catch: java.lang.Throwable -> L22
        r9.writeInt(r3);     // Catch: java.lang.Throwable -> L22
        r9.writeInt(r4);     // Catch: java.lang.Throwable -> L22
        r9.writeInt(r5);     // Catch: java.lang.Throwable -> L22
        r9.writeInt(r6);     // Catch: java.lang.Throwable -> L22
        goto L20
    L16:
        if (r6 >= 127) goto L18;
        r9.writeByte((byte) r2.ordinal());     // Catch: java.lang.Throwable -> L22
        r9.writeInt(r3);     // Catch: java.lang.Throwable -> L22
        r9.writeByte((byte) r4);     // Catch: java.lang.Throwable -> L22
        r9.writeByte((byte) r6);     // Catch: java.lang.Throwable -> L22
        goto L20
    }
}
