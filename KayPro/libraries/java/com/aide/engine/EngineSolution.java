package com.aide.engine;

@abcd.Interfacexu
public class EngineSolution implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.aide.engine.EngineSolution> CREATOR = null;

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public final java.util.List<com.aide.engine.EngineSolutionProject> FH;

    @abcd.Interfaceru(field = 2885473267692104283L)
    private final java.lang.String Hw;
    public java.util.List<java.lang.String> Zo;

    @abcd.Interfaceru(field = 4512509444130051504L)
    private final java.util.TreeMap<java.lang.String, java.util.List<java.lang.String>> v5;

    @abcd.Interfacexu
    public static class File implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.aide.engine.EngineSolution.File> CREATOR = null;

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = -2656692000590085385L)
        private final java.lang.String FH;

        @abcd.Interfaceru(field = 1576331338137298656L)
        private final java.lang.String Hw;

        @abcd.Interfaceru(field = -99333058633746145L)
        private final boolean VH;

        @abcd.Interfaceru(field = -2437558712941134624L)
        private final boolean Zo;

        @abcd.Interfaceru(field = 2275511206990035941L)
        private final java.lang.String v5;

        static {
            abcd.wu.j6(com.aide.engine.EngineSolution.File.class, -3579233191020808329L, -3579233191020808329L);     // Catch: java.lang.Throwable -> L8
            if (j6 == false) goto L6;
            abcd.wu.j6(-154502159828188648L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            CREATOR = new com.aide.engine.ClassF();     // Catch: java.lang.Throwable -> L8
            return;
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -154502159828188648L, null);
        L12:
            throw th;
        }

        public File(android.os.Parcel r7) {
        L16:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, -644478749509622232L, null, r7);
        L20:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-644478749509622232L, null, r7);     // Catch: java.lang.Throwable -> L16
        L6:
            this.FH = r7.readString();     // Catch: java.lang.Throwable -> L16
            this.Hw = r7.readString();     // Catch: java.lang.Throwable -> L16
            this.v5 = r7.readString();     // Catch: java.lang.Throwable -> L16
            boolean r4 = true;
            if (r7.readInt() == 0) goto L9;
            boolean r3 = true;
        L10:
            this.Zo = r3;     // Catch: java.lang.Throwable -> L16
            if (r7.readInt() != 0) goto L14;
            r4 = false;
        L14:
            this.VH = r4;     // Catch: java.lang.Throwable -> L16
            return;
        L9:
            r3 = false;
            goto L10
        }

        public File(java.lang.String r11, java.lang.String r12, java.lang.String r13, boolean r14, boolean r15) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -2728438989639039864L, null, r11, r12, r13, new java.lang.Boolean(r14), new java.lang.Boolean(r15));
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-2728438989639039864L, null, r11, r12, r13, new java.lang.Boolean(r14), new java.lang.Boolean(r15));     // Catch: java.lang.Throwable -> L7
        L5:
            this.FH = r11;     // Catch: java.lang.Throwable -> L7
            this.Hw = r12;     // Catch: java.lang.Throwable -> L7
            this.v5 = r13;     // Catch: java.lang.Throwable -> L7
            this.Zo = r14;     // Catch: java.lang.Throwable -> L7
            this.VH = r15;     // Catch: java.lang.Throwable -> L7
        }

        static java.lang.String DW(com.aide.engine.EngineSolution.File r0) {
            return r0.Hw;
        }

        static boolean FH(com.aide.engine.EngineSolution.File r0) {
            return r0.VH;
        }

        static boolean Hw(com.aide.engine.EngineSolution.File r0) {
            return r0.Zo;
        }

        static java.lang.String j6(com.aide.engine.EngineSolution.File r0) {
            return r0.FH;
        }

        static java.lang.String v5(com.aide.engine.EngineSolution.File r0) {
            return r0.v5;
        }

        @Override
        public int describeContents() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -870902371027684725L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(-870902371027684725L, this);     // Catch: java.lang.Throwable -> L8
            return 0;
        L15:
            return 0;
        }

        @Override
        public void writeToParcel(android.os.Parcel r8, int r9) {
        L15:
            th = move-exception;
            if (DW == false) goto L19;
            abcd.wu.j6(th, 3758667938306483416L, this, r8, new java.lang.Integer(r9));
        L19:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(3758667938306483416L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L15
        L5:
            r8.writeString(this.FH);     // Catch: java.lang.Throwable -> L15
            r8.writeString(this.Hw);     // Catch: java.lang.Throwable -> L15
            r8.writeString(this.v5);     // Catch: java.lang.Throwable -> L15
            int r1 = 1;
            if (this.Zo == false) goto L8;
            int r0 = 1;
        L9:
            r8.writeInt(r0);     // Catch: java.lang.Throwable -> L15
            if (this.VH == true) goto L13;
            r1 = 0;
        L13:
            r8.writeInt(r1);     // Catch: java.lang.Throwable -> L15
            return;
        L8:
            r0 = 0;
            goto L9
        }
    }

    static {
        abcd.wu.j6(com.aide.engine.EngineSolution.class, -5147424603853593465L, -5147424603853593465L);     // Catch: java.lang.Throwable -> L8
        if (j6 == false) goto L6;
        abcd.wu.j6(2403266038710548903L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        CREATOR = new com.aide.engine.ClassE();     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2403266038710548903L, null);
    L12:
        throw th;
    }

    public EngineSolution(android.os.Parcel r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -15700115910165984L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-15700115910165984L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L8
        this.Hw = r6.readString();     // Catch: java.lang.Throwable -> L8
        this.v5 = new java.util.TreeMap();     // Catch: java.lang.Throwable -> L8
        r6.readMap(this.v5, getClass().getClassLoader());     // Catch: java.lang.Throwable -> L8
        this.Zo = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L8
        r6.readList(this.Zo, getClass().getClassLoader());     // Catch: java.lang.Throwable -> L8
    }

    public EngineSolution(java.util.List<com.aide.engine.EngineSolutionProject> r10, java.lang.String r11, java.util.TreeMap<java.lang.String, java.util.List<java.lang.String>> r12, java.util.List<java.lang.String> r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 2746260029581372976L, null, r10, r11, r12, r13);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2746260029581372976L, null, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH = r10;     // Catch: java.lang.Throwable -> L7
        this.Hw = r11;     // Catch: java.lang.Throwable -> L7
        this.v5 = r12;     // Catch: java.lang.Throwable -> L7
        this.Zo = r13;     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = 31939011519163875L)
    private void j6(abcd.La r11, abcd.Da r12, boolean r13, int r14, abcd.Interfacela r15) {
    L18:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, -668855356256737821L, this, r11, r12, new java.lang.Boolean(r13), new java.lang.Integer(r14), r15);
    L23:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-668855356256737821L, this, r11, r12, new java.lang.Boolean(r13), new java.lang.Integer(r14), r15);     // Catch: java.lang.Throwable -> L18
    L6:
        if (r12.yS() == false) goto L15;
        if (r12.rN() == true) goto L15;
        if (r12.tp().startsWith(".") == true) goto L27;
        int r0 = r12.Hw();     // Catch: java.lang.Throwable -> L18
        int r1 = 0;
    L12:
        if (r1 >= r0) goto L29;
        j6(r11, r12.j6(r1), r13, r14, r15);     // Catch: java.lang.Throwable -> L18
        r1 = r1 + 1;     // Catch: java.lang.Throwable -> L18
        goto L12
    L29:
        return;
    L27:
        return;
    L15:
        if (j6(r12, r15) == false) goto L28;
        r11.j6(r12, r14, r15, r13);     // Catch: java.lang.Throwable -> L18
        return;
    }

    @abcd.Interfacesu(method = 787144627791687249L)
    private boolean j6(abcd.Da r11, abcd.Interfacela r12) {
    L23:
        th = move-exception;
        if (DW == false) goto L28;
        abcd.wu.j6(th, 4110792065544809913L, this, r11, r12);
    L28:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4110792065544809913L, this, r11, r12);     // Catch: java.lang.Throwable -> L23
    L5:
        java.lang.String r0 = r11.tp();     // Catch: java.lang.Throwable -> L23
        java.lang.String[] r1 = r12.Hw();     // Catch: java.lang.Throwable -> L23
        java.lang.String[] r2 = r12.FH();     // Catch: java.lang.Throwable -> L23
        if (r1 != null) goto L8;
    L22:
        return false;
    L8:
        if (abcd.Abstractpc.j6() == null) goto L22;
        int r4 = r1.length;     // Catch: java.lang.Throwable -> L23
        int r5 = 0;
    L10:
        if (r5 >= r4) goto L22;
        java.lang.String r6 = r1[r5];     // Catch: java.lang.Throwable -> L23
        if (abcd.Abstractpc.j6().j6(r0, r6) == false) goto L21;
        int r7 = r2.length;     // Catch: java.lang.Throwable -> L23
        int r8 = 0;
    L14:
        if (r8 >= r7) goto L19;
        java.lang.String r9 = r2[r8];     // Catch: java.lang.Throwable -> L23
        if (abcd.Abstractpc.j6().j6(r0, r9) == true) goto L21;
        r8 = r8 + 1;
        goto L14
    L19:
        return true;
    L21:
        r5 = r5 + 1;
        goto L10
    }

    @Override
    public int describeContents() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -6059007693965183048L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-6059007693965183048L, this);     // Catch: java.lang.Throwable -> L8
        return 0;
    L15:
        return 0;
    }

    public long j6() {
    L68:
        th = move-exception;
        if (DW == false) goto L73;
        abcd.wu.j6(th, -2704125139962466220L, this);
    L73:
        throw th;
    L4:
        if (j6 == false) goto L76;
        abcd.wu.j6(-2704125139962466220L, this);     // Catch: java.lang.Throwable -> L68
    L76:
        java.security.MessageDigest r2 = java.security.MessageDigest.getInstance("MD5");     // Catch: java.security.NoSuchAlgorithmException -> L66 java.lang.Throwable -> L68
        r2.reset();     // Catch: java.lang.Throwable -> L68
        if (this.Hw == null) goto L10;
        r2.update(this.Hw.getBytes());     // Catch: java.lang.Throwable -> L68
    L10:
        java.util.Iterator<java.lang.String> r3 = this.Zo.iterator();     // Catch: java.lang.Throwable -> L68
    L12:
        if (r3.hasNext() == false) goto L14;
        r2.update(r3.next().getBytes());     // Catch: java.lang.Throwable -> L68
        goto L12
    L14:
        java.util.Iterator<com.aide.engine.EngineSolutionProject> r4 = this.FH.iterator();     // Catch: java.lang.Throwable -> L68
    L15:
        int r5 = 0;
        if (r4.hasNext() == false) goto L54;
        com.aide.engine.EngineSolutionProject r6 = r4.next();     // Catch: java.lang.Throwable -> L68
        if (r6.u7 == null) goto L20;
        r2.update(r6.u7.getBytes());     // Catch: java.lang.Throwable -> L68
    L20:
        r2.update(r6.FH.getBytes());     // Catch: java.lang.Throwable -> L68
        r2.update(r6.Hw.getBytes());     // Catch: java.lang.Throwable -> L68
        r2.update(r6.v5.getBytes());     // Catch: java.lang.Throwable -> L68
        if (r6.XL == null) goto L24;
        r2.update(r6.XL.getBytes());     // Catch: java.lang.Throwable -> L68
    L24:
        if (r6.aM == null) goto L30;
        java.util.Iterator<java.lang.String> r7 = r6.aM.iterator();     // Catch: java.lang.Throwable -> L68
    L27:
        if (r7.hasNext() == false) goto L30;
        r2.update(r7.next().getBytes());     // Catch: java.lang.Throwable -> L68
    L30:
        if (r6.gn == true) goto L33;
        r5 = 1;
    L33:
        r2.update((byte) r5);     // Catch: java.lang.Throwable -> L68
        if (r6.j3 == null) goto L40;
        java.util.Iterator<java.lang.String> r8 = r6.j3.iterator();     // Catch: java.lang.Throwable -> L68
    L37:
        if (r8.hasNext() == false) goto L40;
        r2.update(r8.next().getBytes());     // Catch: java.lang.Throwable -> L68
    L40:
        if (r6.we == null) goto L42;
        r2.update(r6.we.getBytes());     // Catch: java.lang.Throwable -> L68
    L42:
        java.util.Iterator<java.lang.String> r9 = r6.VH.iterator();     // Catch: java.lang.Throwable -> L68
    L44:
        if (r9.hasNext() == false) goto L46;
        r2.update(r9.next().getBytes());     // Catch: java.lang.Throwable -> L68
        goto L44
    L46:
        java.util.Iterator<com.aide.engine.EngineSolution.File> r10 = r6.Zo.iterator();     // Catch: java.lang.Throwable -> L68
    L48:
        if (r10.hasNext() == false) goto L15;
        com.aide.engine.EngineSolution.File r11 = r10.next();     // Catch: java.lang.Throwable -> L68
        if (com.aide.engine.EngineSolution.File.DW(r11) == null) goto L48;
        if (com.aide.engine.EngineSolution.File.FH(r11) == false) goto L48;
        r2.update(com.aide.engine.EngineSolution.File.j6(r11).getBytes());     // Catch: java.lang.Throwable -> L68
        r2.update(com.aide.engine.EngineSolution.File.DW(r11).getBytes());     // Catch: java.lang.Throwable -> L68
        goto L48
    L54:
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> r12 = this.v5.entrySet().iterator();     // Catch: java.lang.Throwable -> L68
    L56:
        if (r12.hasNext() == false) goto L61;
        java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> r13 = r12.next();     // Catch: java.lang.Throwable -> L68
        r2.update(r13.getKey().getBytes());     // Catch: java.lang.Throwable -> L68
        java.util.Iterator<java.lang.String> r14 = r13.getValue().iterator();     // Catch: java.lang.Throwable -> L68
    L59:
        if (r14.hasNext() == false) goto L56;
        r2.update(r14.next().getBytes());     // Catch: java.lang.Throwable -> L68
        goto L59
    L61:
        byte[] r15 = r2.digest();     // Catch: java.lang.Throwable -> L68
        long r16 = 0;
    L63:
        if (r5 >= r15.length) goto L65;
        r16 = (r16 << 8) ^ ((long) r15[r5]);     // Catch: java.lang.Throwable -> L68
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L68
        goto L63
    L65:
        return r16;
    L67:
        throw new java.lang.InternalError();     // Catch: java.lang.Throwable -> L68
    }

    public void j6(abcd.La r28) {
        abcd.La r6 = r28;
        long r4 = 3077489901940902155L;
    L84:
        th = th;
        long r12 = r4;
        abcd.La r14 = r6;
    L87:
        if (DW == false) goto L90;
        abcd.wu.j6(th, r12, this, r14);
    L90:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3077489901940902155L, this, r6);     // Catch: java.lang.Throwable -> L84
    L6:
        r28.DW();     // Catch: java.lang.Throwable -> L84
        java.util.HashMap r0 = new java.util.HashMap();     // Catch: java.lang.Throwable -> L84
        abcd.Interfacela[] r1 = r28.v5();     // Catch: java.lang.Throwable -> L84
        int r2 = r1.length;     // Catch: java.lang.Throwable -> L84
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L12;
        abcd.Interfacela r8 = r1[r3];     // Catch: java.lang.Throwable -> L84
        r0.put(r8.j6(), r8);     // Catch: java.lang.Throwable -> L84
        if (this.v5.containsKey(r8.j6()) == false) goto L11;
        r6.j6(r8, this.v5.get(r8.j6()));     // Catch: java.lang.Throwable -> L84
    L11:
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L84
        goto L7
    L12:
        r6.j6(this.Hw);     // Catch: java.lang.Throwable -> L84
        java.util.Iterator<com.aide.engine.EngineSolutionProject> r25 = this.FH.iterator();     // Catch: java.lang.Throwable -> L84
    L13:
        if (r25.hasNext() == false) goto L83;
        com.aide.engine.EngineSolutionProject r5 = r25.next();     // Catch: java.lang.Throwable -> L84
        int r7 = this.FH.indexOf(r5);     // Catch: java.lang.Throwable -> L84
        java.lang.String r9 = r5.u7;     // Catch: java.lang.Throwable -> L84
        if (r9 != null) goto L19;
        java.lang.String r10 = "";
    L20:
        java.lang.String r11 = r5.XL;     // Catch: java.lang.Throwable -> L84
        if (r11 != null) goto L23;
        java.lang.String r15 = "";
    L24:
        java.util.List<java.lang.String> r13 = r5.aM;     // Catch: java.lang.Throwable -> L84
        if (r13 != null) goto L27;
        r13 = java.util.Collections.EMPTY_LIST;     // Catch: java.lang.Throwable -> L84
    L27:
        java.util.List<java.lang.String> r16 = r13;
        java.util.List<java.lang.String> r17 = r5.j3;     // Catch: java.lang.Throwable -> L84
        if (r17 != null) goto L30;
        r17 = java.util.Collections.EMPTY_LIST;     // Catch: java.lang.Throwable -> L84
    L30:
        java.util.List<java.lang.String> r18 = r17;
        java.util.List<java.lang.String> r19 = r5.Mr;     // Catch: java.lang.Throwable -> L84
        if (r19 != null) goto L33;
        r19 = java.util.Collections.EMPTY_LIST;     // Catch: java.lang.Throwable -> L84
    L33:
        java.util.List<java.lang.String> r110 = r19;
        java.lang.String r20 = r5.we;     // Catch: java.lang.Throwable -> L84
        if (r20 != null) goto L36;
        java.lang.String r21 = "";
    L37:
        java.lang.String r111 = r5.FH;     // Catch: java.lang.Throwable -> L84
        java.lang.String r112 = r5.Hw;     // Catch: java.lang.Throwable -> L84
        java.lang.String r113 = r5.v5;     // Catch: java.lang.Throwable -> L84
        java.lang.String r22 = r5.tp;     // Catch: java.lang.Throwable -> L84
        java.lang.String r23 = r5.EQ;     // Catch: java.lang.Throwable -> L84
        boolean r24 = r5.J0;     // Catch: java.lang.Throwable -> L84
        java.util.HashMap r26 = r0;
        r28.j6(r7, r10, r111, r112, r113, r15, r16, r18, r110, r22, r23, r21, r24, r5.J8, r5.Ws, r5.QX);     // Catch: java.lang.Throwable -> L81
        java.util.Iterator<java.lang.String> r27 = r5.VH.iterator();     // Catch: java.lang.Throwable -> L81
    L40:
        if (r27.hasNext() == false) goto L49;
        java.lang.String r29 = r27.next();     // Catch: java.lang.Throwable -> L81
        java.util.Iterator<com.aide.engine.EngineSolutionProject> r30 = this.FH.iterator();     // Catch: java.lang.Throwable -> L81
        int r31 = -1;
    L43:
        if (r30.hasNext() == false) goto L47;
        com.aide.engine.EngineSolutionProject r32 = r30.next();     // Catch: java.lang.Throwable -> L81
        if (r32.FH.equals(r29) == false) goto L43;
        r31 = this.FH.indexOf(r32);     // Catch: java.lang.Throwable -> L81
        goto L43
    L47:
        if (r31 == (-1)) goto L40;
        r6.j6(r7, r31);     // Catch: java.lang.Throwable -> L81
        goto L40
    L49:
        java.util.Iterator<com.aide.engine.EngineSolution.File> r33 = r5.Zo.iterator();     // Catch: java.lang.Throwable -> L81
    L51:
        if (r33.hasNext() == false) goto L80;
        com.aide.engine.EngineSolution.File r34 = r33.next();     // Catch: java.lang.Throwable -> L81
        abcd.Da r35 = r6.Mr.DW(com.aide.engine.EngineSolution.File.j6(r34));     // Catch: java.lang.Throwable -> L81
        if (com.aide.engine.EngineSolution.File.DW(r34) == null) goto L64;
        java.util.HashMap r36 = r26;
        if (r36.containsKey(com.aide.engine.EngineSolution.File.DW(r34)) == false) goto L66;
        abcd.Interfacela r37 = (abcd.Interfacela) r36.get(com.aide.engine.EngineSolution.File.DW(r34));     // Catch: java.lang.Throwable -> L81
        if (r37.gn() == false) goto L66;
        abcd.Da r38 = r35;
    L60:
        if (r38.vy() == true) goto L66;
        if (new java.io.File(r38.XL()).isDirectory() == true) goto L66;
        r6.j6(r38, r37);     // Catch: java.lang.Throwable -> L81
        r38 = r38.QX();     // Catch: java.lang.Throwable -> L81
    L66:
        if (com.aide.engine.EngineSolution.File.Hw(r34) == false) goto L69;
        r6.j6(r35, r7, com.aide.engine.EngineSolution.File.v5(r34));     // Catch: java.lang.Throwable -> L81
    L69:
        if (com.aide.engine.EngineSolution.File.DW(r34) != null) goto L71;
    L78:
        int r114 = r7;
        r14 = r6;
    L79:
        r26 = r36;
        r7 = r114;
        r5 = r5;
        r6 = r14;
        goto L51
    L71:
        if (r36.containsKey(com.aide.engine.EngineSolution.File.DW(r34)) == false) goto L78;
        abcd.Interfacela r39 = (abcd.Interfacela) r36.get(com.aide.engine.EngineSolution.File.DW(r34));     // Catch: java.lang.Throwable -> L81
        r114 = r7;
        r12 = 3077489901940902155L;
        r14 = r6;
        j6(r28, r35, r5.gn, r114, r39);     // Catch: java.lang.Throwable -> L76
    L76:
        th = th;
        goto L87
    L64:
        r36 = r26;
        goto L66
    L80:
        r0 = r26;
        r4 = 3077489901940902155L;
    L81:
        th = th;
        r14 = r6;
        r12 = 3077489901940902155L;
        goto L87
    L36:
        r21 = r20;
        goto L37
    L23:
        r15 = r11;
        goto L24
    L19:
        r10 = r9;
        goto L20
    }

    public void j6(com.aide.engine.EngineSolutionProject r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1706030434508833875L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1706030434508833875L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.add(r5);     // Catch: java.lang.Throwable -> L8
    }

    public java.lang.String toString() {
    L29:
        th = move-exception;
        if (DW == false) goto L34;
        abcd.wu.j6(th, -118687420064916427L, this);
    L34:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-118687420064916427L, this);     // Catch: java.lang.Throwable -> L29
    L6:
        java.lang.String r3 = "";
        java.util.Iterator<com.aide.engine.EngineSolutionProject> r4 = this.FH.iterator();     // Catch: java.lang.Throwable -> L29
    L7:
        if (r4.hasNext() == false) goto L28;
        com.aide.engine.EngineSolutionProject r5 = r4.next();     // Catch: java.lang.Throwable -> L29
        if (r5.Hw == null) goto L13;
        java.lang.String r6 = r3 + "Assembly " + r5.FH + " (" + r5.Hw + "), checked " + r5.gn + "\n";     // Catch: java.lang.Throwable -> L29
    L14:
        java.util.Iterator<java.lang.String> r7 = r5.VH.iterator();     // Catch: java.lang.Throwable -> L29
    L16:
        if (r7.hasNext() == false) goto L18;
        r6 = r6 + "References " + r7.next() + "\n";     // Catch: java.lang.Throwable -> L29
        goto L16
    L18:
        java.util.Iterator<com.aide.engine.EngineSolution.File> r8 = r5.Zo.iterator();     // Catch: java.lang.Throwable -> L29
    L20:
        if (r8.hasNext() == false) goto L26;
        com.aide.engine.EngineSolution.File r9 = r8.next();     // Catch: java.lang.Throwable -> L29
        if (com.aide.engine.EngineSolution.File.DW(r9) != null) goto L24;
        java.lang.String r10 = "(no plugin)";
    L25:
        r6 = (r6 + com.aide.engine.EngineSolution.File.j6(r9) + " " + r10 + " ") + "\n";     // Catch: java.lang.Throwable -> L29
        goto L20
    L24:
        r10 = com.aide.engine.EngineSolution.File.DW(r9);     // Catch: java.lang.Throwable -> L29
        goto L25
    L26:
        r3 = r6 + "\n";     // Catch: java.lang.Throwable -> L29
        goto L7
    L13:
        r6 = r3 + "Assembly " + r5.FH + ", checked " + r5.gn + "\n";     // Catch: java.lang.Throwable -> L29
        goto L14
    L28:
        return r3;
    }

    @Override
    public void writeToParcel(android.os.Parcel r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -621781705076080373L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-621781705076080373L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        r8.writeString(this.Hw);     // Catch: java.lang.Throwable -> L7
        r8.writeMap(this.v5);     // Catch: java.lang.Throwable -> L7
        r8.writeList(this.Zo);     // Catch: java.lang.Throwable -> L7
    }
}
