package com.aide.engine;

@abcd.Interfacexu
public class EngineSolutionProject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.aide.engine.EngineSolutionProject> CREATOR = null;

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 7977059701881350784L)
    final java.lang.String EQ;
    public final java.lang.String FH;

    @abcd.Interfaceru(field = -620350533856240000L)
    final java.lang.String Hw;

    @abcd.Interfaceru(field = -5197613737050178152L)
    final boolean J0;

    @abcd.Interfaceru(field = -136628901621416633L)
    final boolean J8;

    @abcd.Interfaceru(field = 922260892948779735L)
    final java.util.List<java.lang.String> Mr;

    @abcd.Interfaceru(field = 5390106072965256180L)
    final boolean QX;

    @abcd.Interfaceru(field = -3096342489270826887L)
    final java.util.List<java.lang.String> VH;

    @abcd.Interfaceru(field = -3685552844057905725L)
    final boolean Ws;

    @abcd.Interfaceru(field = -3752871520753642055L)
    final java.lang.String XL;

    @abcd.Interfaceru(field = 1045174330977364180L)
    final java.util.List<com.aide.engine.EngineSolution.File> Zo;

    @abcd.Interfaceru(field = -2185042331979794967L)
    final java.util.List<java.lang.String> aM;

    @abcd.Interfaceru(field = -3019411530363102225L)
    final boolean gn;

    @abcd.Interfaceru(field = -5090909549022219600L)
    final java.util.List<java.lang.String> j3;

    @abcd.Interfaceru(field = -4178124268803884000L)
    final java.lang.String tp;

    @abcd.Interfaceru(field = 3000432163642673760L)
    final java.lang.String u7;

    @abcd.Interfaceru(field = -3636871560821791825L)
    final java.lang.String v5;

    @abcd.Interfaceru(field = -5185872104270315585L)
    final java.lang.String we;

    static {
        abcd.wu.j6(com.aide.engine.EngineSolutionProject.class, 391151518740039552L, 391151518740039552L);     // Catch: java.lang.Throwable -> L8
        if (j6 == false) goto L6;
        abcd.wu.j6(2966433173918126429L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        CREATOR = new com.aide.engine.ClassG();     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2966433173918126429L, null);
    L12:
        throw th;
    }

    public EngineSolutionProject(android.os.Parcel r7) {
    L28:
        th = move-exception;
        if (DW == false) goto L32;
        abcd.wu.j6(th, 5780577176057328785L, null, r7);
    L32:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5780577176057328785L, null, r7);     // Catch: java.lang.Throwable -> L28
    L6:
        this.FH = r7.readString();     // Catch: java.lang.Throwable -> L28
        this.Hw = r7.readString();     // Catch: java.lang.Throwable -> L28
        this.v5 = r7.readString();     // Catch: java.lang.Throwable -> L28
        boolean r4 = true;
        if (r7.readInt() == 0) goto L9;
        boolean r3 = true;
    L10:
        this.gn = r3;     // Catch: java.lang.Throwable -> L28
        this.u7 = r7.readString();     // Catch: java.lang.Throwable -> L28
        this.tp = r7.readString();     // Catch: java.lang.Throwable -> L28
        this.EQ = r7.readString();     // Catch: java.lang.Throwable -> L28
        this.we = r7.readString();     // Catch: java.lang.Throwable -> L28
        if (r7.readInt() == 0) goto L13;
        boolean r5 = true;
    L14:
        this.J0 = r5;     // Catch: java.lang.Throwable -> L28
        if (r7.readInt() == 0) goto L17;
        boolean r6 = true;
    L18:
        this.J8 = r6;     // Catch: java.lang.Throwable -> L28
        if (r7.readInt() == 0) goto L21;
        boolean r8 = true;
    L22:
        this.Ws = r8;     // Catch: java.lang.Throwable -> L28
        if (r7.readInt() != 0) goto L26;
        r4 = false;
    L26:
        this.QX = r4;     // Catch: java.lang.Throwable -> L28
        this.XL = r7.readString();     // Catch: java.lang.Throwable -> L28
        this.VH = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L28
        r7.readList(this.VH, getClass().getClassLoader());     // Catch: java.lang.Throwable -> L28
        this.aM = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L28
        r7.readList(this.aM, getClass().getClassLoader());     // Catch: java.lang.Throwable -> L28
        this.j3 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L28
        r7.readList(this.j3, getClass().getClassLoader());     // Catch: java.lang.Throwable -> L28
        this.Mr = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L28
        r7.readList(this.Mr, getClass().getClassLoader());     // Catch: java.lang.Throwable -> L28
        this.Zo = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L28
        r7.readList(this.Zo, getClass().getClassLoader());     // Catch: java.lang.Throwable -> L28
        return;
    L21:
        r8 = false;
        goto L22
    L17:
        r6 = false;
        goto L18
    L13:
        r5 = false;
        goto L14
    L9:
        r3 = false;
        goto L10
    }

    public EngineSolutionProject(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.util.List<com.aide.engine.EngineSolution.File> r22, java.util.List<java.lang.String> r23, boolean r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, boolean r29, boolean r30, boolean r31, boolean r32, java.lang.String r33, java.util.List<java.lang.String> r34, java.util.List<java.lang.String> r35, java.util.List<java.lang.String> r36) {
        if (j6 == false) goto L5;
        java.lang.String r14 = r33;
        java.util.List<java.lang.String> r11 = r35;
        abcd.wu.j6(3401478432796578552L, null, new java.lang.Object[]{r19, r20, r21, r22, r23, new java.lang.Boolean(r24), r25, r26, r27, r28, new java.lang.Boolean(r29), new java.lang.Boolean(r30), new java.lang.Boolean(r31), new java.lang.Boolean(r32), r14, r34, r11, r36});
    L6:
        this.FH = r19;
        this.Hw = r20;
        this.v5 = r21;
        this.Zo = r22;
        this.VH = r23;
        this.gn = r24;
        this.u7 = r25;
        this.tp = r26;
        this.EQ = r27;
        this.we = r28;
        this.J0 = r29;
        this.J8 = r30;
        this.Ws = r31;
        this.QX = r32;
        this.XL = r14;
        this.aM = r34;
        this.j3 = r11;
        this.Mr = r36;
        return;
    L5:
        r11 = r35;
        r14 = r33;
        goto L6
    }

    @Override
    public int describeContents() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3921742580059231564L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-3921742580059231564L, this);     // Catch: java.lang.Throwable -> L8
        return 0;
    L15:
        return 0;
    }

    @Override
    public void writeToParcel(android.os.Parcel r8, int r9) {
    L27:
        th = move-exception;
        if (DW == false) goto L31;
        abcd.wu.j6(th, -2459182665222252375L, this, r8, new java.lang.Integer(r9));
    L31:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2459182665222252375L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L27
    L5:
        r8.writeString(this.FH);     // Catch: java.lang.Throwable -> L27
        r8.writeString(this.Hw);     // Catch: java.lang.Throwable -> L27
        r8.writeString(this.v5);     // Catch: java.lang.Throwable -> L27
        int r1 = 1;
        if (this.gn == false) goto L8;
        int r0 = 1;
    L9:
        r8.writeInt(r0);     // Catch: java.lang.Throwable -> L27
        r8.writeString(this.u7);     // Catch: java.lang.Throwable -> L27
        r8.writeString(this.tp);     // Catch: java.lang.Throwable -> L27
        r8.writeString(this.EQ);     // Catch: java.lang.Throwable -> L27
        r8.writeString(this.we);     // Catch: java.lang.Throwable -> L27
        if (this.J0 == false) goto L12;
        int r2 = 1;
    L13:
        r8.writeInt(r2);     // Catch: java.lang.Throwable -> L27
        if (this.J8 == false) goto L16;
        int r3 = 1;
    L17:
        r8.writeInt(r3);     // Catch: java.lang.Throwable -> L27
        if (this.Ws == false) goto L20;
        int r4 = 1;
    L21:
        r8.writeInt(r4);     // Catch: java.lang.Throwable -> L27
        if (this.QX == true) goto L25;
        r1 = 0;
    L25:
        r8.writeInt(r1);     // Catch: java.lang.Throwable -> L27
        r8.writeString(this.XL);     // Catch: java.lang.Throwable -> L27
        r8.writeList(this.VH);     // Catch: java.lang.Throwable -> L27
        r8.writeList(this.aM);     // Catch: java.lang.Throwable -> L27
        r8.writeList(this.j3);     // Catch: java.lang.Throwable -> L27
        r8.writeList(this.Mr);     // Catch: java.lang.Throwable -> L27
        r8.writeList(this.Zo);     // Catch: java.lang.Throwable -> L27
        return;
    L20:
        r4 = 0;
        goto L21
    L16:
        r3 = 0;
        goto L17
    L12:
        r2 = 0;
        goto L13
    L8:
        r0 = 0;
        goto L9
    }
}
