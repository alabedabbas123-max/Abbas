package com.aide.uidesigner;

@abcd.Interfacexu
public abstract class Pa implements com.aide.common.UndoManager.a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -543436089053332485L)
    private org.w3c.dom.Document EQ;

    @abcd.Interfaceru(field = -299847889425476385L)
    private android.content.Context FH;

    @abcd.Interfaceru(field = -3173533546194582164L)
    private java.lang.String Hw;

    @abcd.Interfaceru(field = -2889828776746345815L)
    private com.aide.common.UndoManager J0;

    @abcd.Interfaceru(field = 1917395955943198641L)
    private boolean J8;

    @abcd.Interfaceru(field = -102076094400206760L)
    private com.aide.common.ab<com.aide.uidesigner.ClassS> QX;

    @abcd.Interfaceru(field = -2982951462418673808L)
    private java.util.Map<java.lang.String, java.lang.Integer> VH;

    @abcd.Interfaceru(field = 905646889509695480L)
    private boolean Ws;

    @abcd.Interfaceru(field = -1371330639943749312L)
    private java.util.ArrayList<org.w3c.dom.Element> XL;

    @abcd.Interfaceru(field = -1907026830298643155L)
    private java.util.Map<java.lang.String, org.w3c.dom.Node> Zo;

    @abcd.Interfaceru(field = 2569888149764487672L)
    private java.util.List<com.aide.uidesigner.ClassS> gn;

    @abcd.Interfaceru(field = -581539772238557944L)
    private java.lang.String tp;

    @abcd.Interfaceru(field = -409717559839542768L)
    private com.aide.uidesigner.la u7;

    @abcd.Interfaceru(field = -627164059570135019L)
    private android.view.ViewGroup v5;

    @abcd.Interfaceru(field = 6688832344314699345L)
    private java.lang.Throwable we;

    static {
        abcd.wu.j6(com.aide.uidesigner.Pa.class, -1505387028266607057L, -1505387028266607057L);
    }

    public Pa(android.view.ViewGroup r10, java.lang.String r11, java.lang.String r12, com.aide.common.UndoManager r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 1631316635657174407L, null, r10, r11, r12, r13);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1631316635657174407L, null, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
    L5:
        this.Zo = new java.util.HashMap();     // Catch: java.lang.Throwable -> L7
        this.VH = new java.util.HashMap();     // Catch: java.lang.Throwable -> L7
        this.gn = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L7
        r13.j6(this);     // Catch: java.lang.Throwable -> L7
        this.J0 = r13;     // Catch: java.lang.Throwable -> L7
        this.FH = r10.getContext();     // Catch: java.lang.Throwable -> L7
        this.v5 = r10;     // Catch: java.lang.Throwable -> L7
        this.Hw = r11;     // Catch: java.lang.Throwable -> L7
        this.u7 = new com.aide.uidesigner.la(this.FH, r12);     // Catch: java.lang.Throwable -> L7
    }

    static android.content.Context DW(com.aide.uidesigner.Pa r0) {
        return r0.FH;
    }

    @abcd.Interfacesu(method = 2004452076313917867L)
    private java.lang.Integer DW(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
    L21:
        th = move-exception;
        if (DW == false) goto L25;
        abcd.wu.j6(th, 1867825353421785587L, this, r8, r9);
    L25:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1867825353421785587L, this, r8, r9);     // Catch: java.lang.Throwable -> L21
    L5:
        java.lang.String r10 = we(r8, r9);     // Catch: java.lang.Throwable -> L21
        if (r10 != null) goto L27;
    L20:
        return null;
    L27:
        if (r10.charAt(0) != '#') goto L17;
        long r0 = java.lang.Long.parseLong(r10.substring(1), 16);     // Catch: java.lang.Throwable -> L26
        if (r10.length() != 7) goto L15;
        r0 = r0 | (-16777216);     // Catch: java.lang.Throwable -> L26
    L15:
        return java.lang.Integer.valueOf((int) r0);
    L17:
        if (r10.startsWith("@android:color/") == false) goto L20;
        int r11 = ((java.lang.Integer) android.R.color.class.getDeclaredField(r10.substring(15)).get(null)).intValue();     // Catch: java.lang.Throwable -> L26
        return java.lang.Integer.valueOf(this.FH.getResources().getColor(r11));
    }

    @abcd.Interfacesu(method = 2349038109322061875L)
    private org.w3c.dom.Element DW(com.aide.uidesigner.ClassB r7) {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 3783036654195827823L, this, r7);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3783036654195827823L, this, r7);     // Catch: java.lang.Throwable -> L12
    L6:
        org.w3c.dom.Element r2 = this.EQ.createElement(r7.FH);     // Catch: java.lang.Throwable -> L12
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> r3 = r7.Hw.entrySet().iterator();     // Catch: java.lang.Throwable -> L12
    L7:
        if (r3.hasNext() == false) goto L11;
        java.util.Map.Entry<java.lang.String, java.lang.String> r4 = r3.next();     // Catch: java.lang.Throwable -> L12
        r2.setAttribute(r4.getKey(), r4.getValue());     // Catch: java.lang.Throwable -> L12
        goto L7
    L11:
        return r2;
    }

    @abcd.Interfacesu(method = -7337775203232255687L)
    private com.aide.uidesigner.ClassA EQ(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, 6227446785558914837L, this, r8, r9);
    L21:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(6227446785558914837L, this, r8, r9);     // Catch: java.lang.Throwable -> L17
    L5:
        org.w3c.dom.Node r0 = r8.getAttributes().getNamedItem(r9.Zo);     // Catch: java.lang.Throwable -> L17
        if ((r0 instanceof org.w3c.dom.Attr) == true) goto L8;
        java.lang.String r1 = DW((org.w3c.dom.Element) r8);     // Catch: java.lang.Throwable -> L17
        if (r1 == null) goto L16;
        java.lang.String r2 = this.u7.j6(r1, r9);     // Catch: java.lang.Throwable -> L17
        if (r2 == null) goto L16;
        return new com.aide.uidesigner.ClassA(r9, r2);
    L16:
        return new com.aide.uidesigner.ClassA(r9);
    L8:
        return new com.aide.uidesigner.ClassA(r9, (org.w3c.dom.Attr) r0);
    }

    @abcd.Interfacesu(method = -5756492489242968472L)
    private java.lang.Object FH(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
    L49:
        th = move-exception;
        if (DW == false) goto L53;
        abcd.wu.j6(th, 4620040786862887992L, this, r8, r9);
    L53:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(4620040786862887992L, this, r8, r9);     // Catch: java.lang.Throwable -> L49
    L6:
        switch(com.aide.uidesigner.Oa.j6[r9.VH.ordinal()]) {
            case 1: goto L48;
            case 2: goto L46;
            case 3: goto L44;
            case 4: goto L42;
            case 5: goto L40;
            case 6: goto L38;
            case 7: goto L36;
            case 8: goto L29;
            case 9: goto L28;
            case 10: goto L26;
            case 11: goto L24;
            case 12: goto L22;
            case 13: goto L20;
            case 14: goto L12;
            case 15: goto L8;
            default: goto L7;
        };     // Catch: java.lang.Throwable -> L49
    L7:
        return null;
    L8:
        java.lang.Integer r0 = J0(r8, r9);     // Catch: java.lang.Throwable -> L49
        if (r0 != null) goto L11;
        return null;
    L11:
        return new java.lang.Float(r0.intValue());
    L12:
        java.lang.Integer r1 = J0(r8, r9);     // Catch: java.lang.Throwable -> L49
        if (r1 == null) goto L15;
        return r1;
    L15:
        java.lang.Integer r10 = u7(r8, r9);     // Catch: java.lang.Throwable -> L49
        if (r10 == null) goto L18;
        return r10;
    L18:
        return null;
    L29:
        java.lang.Integer r2 = DW(r8, r9);     // Catch: java.lang.Throwable -> L49
        if (r2 == null) goto L34;
        return new android.graphics.drawable.ColorDrawable(r2.intValue());
    L34:
        return Hw(r8, r9);
    L20:
        return QX(r8, r9);
    L22:
        return J0(r8, r9);
    L24:
        return we(r8, r9);
    L26:
        return v5(r8, r9);
    L28:
        return J8(r8, r9);
    L36:
        return Hw(r8, r9);
    L38:
        return DW(r8, r9);
    L40:
        return Zo(r8, r9);
    L42:
        return u7(r8, r9);
    L44:
        return gn(r8, r9);
    L46:
        return VH(r8, r9);
    L48:
        return j6(r8, r9);
    }

    @abcd.Interfacesu(method = -7572876402243923316L)
    private java.lang.Object Hw(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -786170089461139360L, this, r8, r9);
    L19:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-786170089461139360L, this, r8, r9);     // Catch: java.lang.Throwable -> L15
    L5:
        java.lang.String r0 = we(r8, r9);     // Catch: java.lang.Throwable -> L15
        android.graphics.drawable.Drawable r1 = this.u7.DW(r0);     // Catch: java.lang.Throwable -> L15
        if (r1 == null) goto L9;
        return r1;
    L9:
        if (r0 == null) goto L14;
        if (r0.startsWith("@android:drawable/") == false) goto L14;
        int r10 = ((java.lang.Integer) android.R.drawable.class.getDeclaredField(r0.substring(18)).get(null)).intValue();     // Catch: java.lang.Throwable -> L20
        return this.FH.getResources().getDrawable(r10);
    L14:
        return null;
    }

    @abcd.Interfacesu(method = -275697771859501555L)
    private void Hw(org.w3c.dom.Element r8) {
    L17:
        th = move-exception;
        if (DW == false) goto L22;
        abcd.wu.j6(th, -1340961295036898355L, this, r8);
    L22:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1340961295036898355L, this, r8);     // Catch: java.lang.Throwable -> L17
    L6:
        com.aide.uidesigner.N.a[] r2 = com.aide.uidesigner.N.VH;     // Catch: java.lang.Throwable -> L17
        int r3 = r2.length;     // Catch: java.lang.Throwable -> L17
        int r4 = 0;
    L7:
        if (r4 >= r3) goto L16;
        com.aide.uidesigner.N.a r5 = r2[r4];     // Catch: java.lang.Throwable -> L17
        if (r5 == com.aide.uidesigner.N.v5) goto L15;
        if (r5 == com.aide.uidesigner.N.Zo) goto L15;
        if (r8.hasAttribute(r5.Zo) == false) goto L15;
        r8.removeAttribute(r5.Zo);     // Catch: java.lang.Throwable -> L17
    L15:
        r4 = r4 + 1;
        goto L7
    }

    @abcd.Interfacesu(method = 2849994407340638369L)
    private java.lang.Integer J0(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
    L29:
        th = move-exception;
        if (DW == false) goto L33;
        abcd.wu.j6(th, -871692604657668415L, this, r8, r9);
    L33:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-871692604657668415L, this, r8, r9);     // Catch: java.lang.Throwable -> L29
    L5:
        java.lang.String r10 = we(r8, r9);     // Catch: java.lang.Throwable -> L29
        if (r10 != null) goto L35;
    L28:
        return null;
    L35:
        if (r10.endsWith("px") == false) goto L13;
        return java.lang.Integer.valueOf((int) java.lang.Float.parseFloat(r10.substring(0, r10.length() - 2)));
    L13:
        if (r10.endsWith("dp") == false) goto L17;
        return java.lang.Integer.valueOf((int) (java.lang.Float.parseFloat(r10.substring(0, r10.length() - 2)) * this.FH.getResources().getDisplayMetrics().density));
    L17:
        if (r10.endsWith("dip") == false) goto L21;
        return java.lang.Integer.valueOf((int) (java.lang.Float.parseFloat(r10.substring(0, r10.length() - 3)) * this.FH.getResources().getDisplayMetrics().density));
    L21:
        if (r10.endsWith("sp") == false) goto L25;
        return java.lang.Integer.valueOf((int) (java.lang.Float.parseFloat(r10.substring(0, r10.length() - 2)) * this.FH.getResources().getDisplayMetrics().scaledDensity));
    L25:
        if (r10.startsWith("@android:dimen/") == false) goto L28;
        return java.lang.Integer.valueOf(this.FH.getResources().getDimensionPixelSize(((java.lang.Integer) android.R.dimen.class.getDeclaredField(r10.substring(15)).get(null)).intValue()));
    }

    @abcd.Interfacesu(method = -2713749262272935211L)
    private java.lang.String J8(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 4168573446901898637L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4168573446901898637L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        return we(r8, r9);
    }

    @abcd.Interfacesu(method = -474981390786198360L)
    private java.lang.Float QX(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 6545676225613982104L, this, r8, r9);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(6545676225613982104L, this, r8, r9);     // Catch: java.lang.Throwable -> L11
    L5:
        java.lang.Integer r0 = J0(r8, r9);     // Catch: java.lang.Throwable -> L11
        if (r0 == null) goto L9;
        return java.lang.Float.valueOf(r0.intValue() / this.FH.getResources().getDisplayMetrics().scaledDensity);
    L9:
        return null;
    }

    @abcd.Interfacesu(method = -1204896639864973419L)
    private java.lang.Integer VH(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
    L21:
        th = move-exception;
        if (DW == false) goto L25;
        abcd.wu.j6(th, 558621795955113317L, this, r8, r9);
    L25:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(558621795955113317L, this, r8, r9);     // Catch: java.lang.Throwable -> L21
    L5:
        java.lang.String r0 = we(r8, r9);     // Catch: java.lang.Throwable -> L21
        if (r0 != null) goto L8;
        return null;
    L8:
        if (r0.startsWith("@+id/") == false) goto L14;
        java.lang.String r1 = r0.substring(5);     // Catch: java.lang.Throwable -> L21
        if (this.VH.containsKey(r1) == false) goto L14;
        return this.VH.get(r1);
    L14:
        if (r0.startsWith("@id/") == false) goto L27;
        java.lang.String r2 = r0.substring(4);     // Catch: java.lang.Throwable -> L21
        if (this.VH.containsKey(r2) == true) goto L18;
        return null;
    L18:
        return this.VH.get(r2);
    L27:
        return null;
    }

    @abcd.Interfacesu(method = 2217410949801159588L)
    private java.lang.Object Ws(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
    L47:
        th = move-exception;
        if (DW == false) goto L51;
        abcd.wu.j6(th, -1588890119246252064L, this, r8, r9);
    L51:
        throw th;
    L3:
        if (j6 == false) goto L55;
        abcd.wu.j6(-1588890119246252064L, this, r8, r9);     // Catch: java.lang.Throwable -> L47
    L55:
        java.lang.String r10 = EQ(r8, r9).Hw;     // Catch: java.lang.Throwable -> L52
        if (r10 == null) goto L46;
        if (r10.startsWith("?android:attr/") == false) goto L46;
        int r11 = ((java.lang.Integer) android.R.attr.class.getField(r10.substring(14)).get(null)).intValue();     // Catch: java.lang.Throwable -> L52
        switch(com.aide.uidesigner.Oa.j6[r9.VH.ordinal()]) {
            case 12: goto L13;
            case 13: goto L13;
            case 14: goto L13;
            case 15: goto L13;
            default: goto L17;
        };     // Catch: java.lang.Throwable -> L52
    L13:
        android.util.TypedValue r12 = new android.util.TypedValue();     // Catch: java.lang.Throwable -> L52
        if (this.FH.getTheme().resolveAttribute(r11, r12, true) == false) goto L46;
        return java.lang.Integer.valueOf((int) android.util.TypedValue.complexToDimension(r12.data, this.FH.getResources().getDisplayMetrics()));
    L17:
        android.content.res.TypedArray r13 = this.FH.obtainStyledAttributes(new int[]{r11});     // Catch: java.lang.Throwable -> L52
    L43:
        th = move-exception;
        r13.recycle();     // Catch: java.lang.Throwable -> L52
        throw th;     // Catch: java.lang.Throwable -> L52
    L19:
        if (r13.hasValue(0) == true) goto L21;
    L42:
        r13.recycle();     // Catch: java.lang.Throwable -> L52
        goto L46
    L21:
        switch(com.aide.uidesigner.Oa.j6[r9.VH.ordinal()]) {
            case 1: goto L39;
            case 2: goto L36;
            case 3: goto L36;
            case 4: goto L36;
            case 5: goto L33;
            case 6: goto L29;
            case 7: goto L26;
            case 8: goto L26;
            case 9: goto L23;
            default: goto L42;
        };     // Catch: java.lang.Throwable -> L43
    L23:
        java.lang.String r14 = r13.getString(0);     // Catch: java.lang.Throwable -> L43
        r13.recycle();     // Catch: java.lang.Throwable -> L52
        return r14;
    L26:
        android.graphics.drawable.Drawable r15 = r13.getDrawable(0);     // Catch: java.lang.Throwable -> L43
        r13.recycle();     // Catch: java.lang.Throwable -> L52
        return r15;
    L29:
        java.lang.Integer r16 = java.lang.Integer.valueOf(r13.getColor(0, 0));     // Catch: java.lang.Throwable -> L43
        r13.recycle();     // Catch: java.lang.Throwable -> L52
        return r16;
    L36:
        java.lang.Integer r17 = java.lang.Integer.valueOf(r13.getInt(0, 0));     // Catch: java.lang.Throwable -> L43
        r13.recycle();     // Catch: java.lang.Throwable -> L52
        return r17;
    L39:
        java.lang.Boolean r18 = java.lang.Boolean.valueOf(r13.getBoolean(0, false));     // Catch: java.lang.Throwable -> L43
        r13.recycle();     // Catch: java.lang.Throwable -> L52
        return r18;
    L33:
        java.lang.Float r19 = java.lang.Float.valueOf(r13.getFloat(0, 0.0f));     // Catch: java.lang.Throwable -> L43
        r13.recycle();     // Catch: java.lang.Throwable -> L52
        return r19;
    L46:
        return null;
    }

    @abcd.Interfacesu(method = -2047191329866893804L)
    private void XL() {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 2990794066491496496L, this);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L22;
        abcd.wu.j6(2990794066491496496L, this);     // Catch: java.lang.Throwable -> L14
    L22:
        this.we = null;     // Catch: java.lang.Throwable -> L9
        this.Zo.clear();     // Catch: java.lang.Throwable -> L9
        this.VH.clear();     // Catch: java.lang.Throwable -> L9
        this.u7.FH();     // Catch: java.lang.Throwable -> L9
        java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream(this.tp.getBytes());     // Catch: java.lang.Throwable -> L9
        this.EQ = com.aide.common.pa.j6(r3);     // Catch: java.lang.Throwable -> L9
        r3.close();     // Catch: java.lang.Throwable -> L9
        j6(this.EQ.getChildNodes());     // Catch: java.lang.Throwable -> L9
    L12:
        this.QX = null;     // Catch: java.lang.Throwable -> L14
        aM();     // Catch: java.lang.Throwable -> L14
        return;
    L9:
        th = move-exception;
        this.we = th;     // Catch: java.lang.Throwable -> L14
        this.EQ = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();     // Catch: javax.xml.parsers.ParserConfigurationException -> L19 java.lang.Throwable -> L14
        goto L12
    }

    @abcd.Interfacesu(method = 3682233953707219680L)
    private java.lang.Float Zo(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 3560116257338929320L, this, r8, r9);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(3560116257338929320L, this, r8, r9);     // Catch: java.lang.Throwable -> L11
    L5:
        java.lang.String r10 = we(r8, r9);     // Catch: java.lang.Throwable -> L11
        if (r10 != null) goto L17;
        return null;
    L17:
        return java.lang.Float.valueOf(java.lang.Float.parseFloat(r10));
    L21:
        return null;
    }

    @abcd.Interfacesu(method = 3292702607872674292L)
    private void aM() {
    L29:
        th = move-exception;
        if (DW == false) goto L33;
        abcd.wu.j6(th, 1597500778637411328L, this);
    L33:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1597500778637411328L, this);     // Catch: java.lang.Throwable -> L29
    L6:
        this.v5.removeAllViews();     // Catch: java.lang.Throwable -> L29
        if (this.Ws == false) goto L9;
    L12:
        android.widget.LinearLayout r2 = new android.widget.LinearLayout(this.FH);     // Catch: java.lang.Throwable -> L29
        r2.setGravity(17);     // Catch: java.lang.Throwable -> L29
        com.aide.uidesigner.Ma r3 = new com.aide.uidesigner.Ma(this, this.FH, r2);     // Catch: java.lang.Throwable -> L29
        r3.setEnabled(this.J8);     // Catch: java.lang.Throwable -> L29
        this.v5.addView(r3, -1, -1);     // Catch: java.lang.Throwable -> L29
        android.view.ViewGroup r4 = r2;
    L13:
        java.lang.Throwable e = this.we;     // Catch: java.lang.Throwable -> L29
        this.gn.clear();     // Catch: java.lang.Throwable -> L29
        if (e == null) goto L36;
    L18:
        if (e == null) goto L27;
        android.widget.TextView r5 = new android.widget.TextView(this.FH);     // Catch: java.lang.Throwable -> L29
        if (e.getMessage().contains("no element") == true) goto L22;
        r5.setText("Can not view the layout. " + e.getMessage());     // Catch: java.lang.Throwable -> L29
    L26:
        int r6 = (int) (this.FH.getResources().getDisplayMetrics().density * 10.0f);     // Catch: java.lang.Throwable -> L29
        r5.setPadding(r6, r6, r6, r6);     // Catch: java.lang.Throwable -> L29
        r5.setTextSize(20.0f);     // Catch: java.lang.Throwable -> L29
        r4.removeAllViews();     // Catch: java.lang.Throwable -> L29
        r4.addView(r5);     // Catch: java.lang.Throwable -> L29
        goto L27
    L22:
        if (this.J8 == false) goto L24;
        r5.setText("No views have been added. Tap to add views.");     // Catch: java.lang.Throwable -> L29
        goto L26
    L24:
        r5.setText("No views have been added.");     // Catch: java.lang.Throwable -> L29
    L27:
        J0();     // Catch: java.lang.Throwable -> L29
        return;
    L36:
        j6(this.EQ.getChildNodes(), r4, null, 0);     // Catch: java.lang.Exception -> L17 java.lang.Throwable -> L29
        this.v5.invalidate();     // Catch: java.lang.Exception -> L17 java.lang.Throwable -> L29
    L17:
        e = e;
        goto L18
    L9:
        if (this.J8 == true) goto L12;
        r4 = this.v5;     // Catch: java.lang.Throwable -> L29
        goto L13
    }

    @abcd.Interfacesu(method = 1254800953325762755L)
    private java.lang.Integer gn(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 391885825669823899L, this, r8, r9);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(391885825669823899L, this, r8, r9);     // Catch: java.lang.Throwable -> L11
    L5:
        java.lang.String r10 = we(r8, r9);     // Catch: java.lang.Throwable -> L11
        if (r10 != null) goto L17;
        return null;
    L17:
        return java.lang.Integer.valueOf(java.lang.Integer.parseInt(r10));
    L21:
        return null;
    }

    @abcd.Interfacesu(method = 2791533984229173216L)
    private void j3() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3631003574466291488L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3631003574466291488L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.tp = new com.aide.uidesigner.ClassF().j6(this.EQ);     // Catch: java.lang.Throwable -> L8
        this.J0.DW(u7(), this.tp, 0);     // Catch: java.lang.Throwable -> L8
        XL();     // Catch: java.lang.Throwable -> L8
        j6(true);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -3932944335989979149L)
    private android.view.View j6(org.w3c.dom.Node r13, java.lang.String r14) {
    L29:
        th = move-exception;
        if (DW == false) goto L33;
        abcd.wu.j6(th, -2848339193617889109L, this, r13, r14);
    L33:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-2848339193617889109L, this, r13, r14);     // Catch: java.lang.Throwable -> L29
    L7:
        if (r14.contains(".") == false) goto L10;
        return null;
    L10:
        if ("View".equals(r14) == true) goto L12;
        java.lang.String r1 = this.u7.FH(DW((org.w3c.dom.Element) r13));     // Catch: java.lang.Throwable -> L29
        if (r1 != null) goto L17;
    L21:
        if (r1 != null) goto L23;
    L37:
        return (android.view.View) java.lang.Class.forName("android.widget." + r14).getConstructor(new java.lang.Class[]{android.content.Context.class}).newInstance(new java.lang.Object[]{this.FH});
    L28:
        return null;
    L23:
        if (r1.startsWith("?android:attr/") == false) goto L37;
        return (android.view.View) java.lang.Class.forName("android.widget." + r14).getConstructor(new java.lang.Class[]{android.content.Context.class, android.util.AttributeSet.class, java.lang.Integer.TYPE}).newInstance(new java.lang.Object[]{this.FH, null, java.lang.Integer.valueOf(((java.lang.Integer) android.R.attr.class.getField(r1.substring(14)).get(null)).intValue())});
    L17:
        if (r1.startsWith("@android:style/") == false) goto L21;
        return (android.view.View) java.lang.Class.forName("android.widget." + r14).getConstructor(new java.lang.Class[]{android.content.Context.class, android.util.AttributeSet.class, java.lang.Integer.TYPE}).newInstance(new java.lang.Object[]{this.FH, null, java.lang.Integer.valueOf(((java.lang.Integer) com.aide.ui.Ma.class.getField("Android_" + r1.substring(15).replace(".", "_")).get(null)).intValue())});
    L12:
        return new android.view.View(this.FH);
    }

    @abcd.Interfacesu(method = -387843958894595511L)
    private com.aide.uidesigner.ClassC j6(org.w3c.dom.Node r10, android.view.ViewGroup r11) {
    L26:
        th = move-exception;
        if (DW == false) goto L30;
        abcd.wu.j6(th, 2051465859622571161L, this, r10, r11);
    L30:
        throw th;
    L3:
        if (j6 == false) goto L37;
        abcd.wu.j6(2051465859622571161L, this, r10, r11);     // Catch: java.lang.Throwable -> L26
    L37:
        java.lang.Class<?> r1 = java.lang.Class.forName(r11.getClass().getName() + "$LayoutParams");     // Catch: java.lang.Throwable -> L24
        android.view.ViewGroup.LayoutParams r5 = (android.view.ViewGroup.LayoutParams) r1.getConstructor(new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE}).newInstance(new java.lang.Object[]{-2, -2});     // Catch: java.lang.NoSuchMethodException -> L10 java.lang.Throwable -> L24
    L11:
        com.aide.uidesigner.ClassC r2 = new com.aide.uidesigner.ClassC(r5);     // Catch: java.lang.Throwable -> L24
        java.lang.String r6 = this.u7.FH(DW((org.w3c.dom.Element) r10));     // Catch: java.lang.Throwable -> L24
        if (r6 != null) goto L14;
    L22:
        j6(r2, r10, com.aide.uidesigner.N.VH);     // Catch: java.lang.Throwable -> L24
        return r2;
        goto L25
    L14:
        if (r6.startsWith("?android:attr/") == false) goto L22;
        android.content.res.TypedArray r3 = this.FH.getTheme().obtainStyledAttributes(((java.lang.Integer) android.R.attr.class.getField(r6.substring(14)).get(null)).intValue(), new int[]{16842996, 16842997});     // Catch: java.lang.Throwable -> L31
        if (r3.hasValue(0) == false) goto L19;
        r5.width = r3.getLayoutDimension(0, "layout_width");     // Catch: java.lang.Throwable -> L31
    L19:
        if (r3.hasValue(1) == false) goto L21;
        r5.height = r3.getLayoutDimension(1, "layout_height");     // Catch: java.lang.Throwable -> L31
    L21:
        r3.recycle();     // Catch: java.lang.Throwable -> L31
        goto L22
    L10:
        r5 = (android.view.ViewGroup.LayoutParams) r1.getConstructor(new java.lang.Class[]{android.view.ViewGroup.LayoutParams.class}).newInstance(new java.lang.Object[]{new android.view.ViewGroup.LayoutParams(-1, -1)});     // Catch: java.lang.Throwable -> L24
    L25:
        return new com.aide.uidesigner.ClassC(new android.view.ViewGroup.LayoutParams(-2, -2));
    }

    @abcd.Interfacesu(method = -1452673214983620672L)
    private java.lang.Boolean j6(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 2945072507110409360L, this, r8, r9);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2945072507110409360L, this, r8, r9);     // Catch: java.lang.Throwable -> L11
    L5:
        java.lang.String r0 = we(r8, r9);     // Catch: java.lang.Throwable -> L11
        if (r0 != null) goto L9;
        return null;
    L9:
        return java.lang.Boolean.valueOf("true".equals(r0));
    }

    @abcd.Interfacesu(method = -1839238766686407257L)
    private java.lang.Integer j6(java.lang.String r9, com.aide.uidesigner.N.a r10) {
    L22:
        th = move-exception;
        if (DW == false) goto L27;
        abcd.wu.j6(th, 2994647320866866795L, this, r9, r10);
    L27:
        throw th;
    L3:
        if (j6 == false) goto L32;
        abcd.wu.j6(2994647320866866795L, this, r9, r10);     // Catch: java.lang.Throwable -> L22
    L32:
        if (r10.tp != null) goto L10;
        java.lang.String r11 = r9.toUpperCase();     // Catch: java.lang.Throwable -> L29
        return java.lang.Integer.valueOf(((java.lang.Integer) r10.gn.getField(r11).get(null)).intValue());
    L10:
        java.lang.reflect.Field[] r1 = r10.gn.getFields();     // Catch: java.lang.Throwable -> L29
        int r2 = r1.length;     // Catch: java.lang.Throwable -> L29
        int r3 = 0;
    L11:
        if (r3 >= r2) goto L21;
        java.lang.reflect.Field r4 = r1[r3];     // Catch: java.lang.Throwable -> L29
        java.lang.String r5 = r4.getName();     // Catch: java.lang.Throwable -> L29
        if ((r4.getModifiers() & 8) == 0) goto L20;
        if (r5.startsWith(r10.tp) == false) goto L20;
        if (r5.substring(r10.tp.length()).replace("_", "").toUpperCase().equals(r9.toUpperCase()) == false) goto L20;
        return java.lang.Integer.valueOf(((java.lang.Integer) r4.get(null)).intValue());
    L20:
        r3 = r3 + 1;
    L21:
        return null;
    }

    @abcd.Interfacesu(method = 2358632434665019344L)
    private void j6(android.view.View r8, boolean r9) {
    L24:
        th = move-exception;
        if (DW == false) goto L28;
        abcd.wu.j6(th, 3670480801501579884L, this, r8, new java.lang.Boolean(r9));
    L28:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(3670480801501579884L, this, r8, new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L24
    L5:
        if (r9 == false) goto L15;
        int r0 = (int) (this.FH.getResources().getDisplayMetrics().density * 20.0f);     // Catch: java.lang.Throwable -> L24
        r8.setMinimumHeight(r0);     // Catch: java.lang.Throwable -> L24
        r8.setMinimumWidth(r0);     // Catch: java.lang.Throwable -> L24
        if ((r8 instanceof android.view.ViewGroup) == false) goto L9;
        ((android.view.ViewGroup) r8).setClipChildren(false);     // Catch: java.lang.Throwable -> L24
        ((android.view.ViewGroup) r8).setClipToPadding(false);     // Catch: java.lang.Throwable -> L24
    L9:
        r8.setFocusable(false);     // Catch: java.lang.Throwable -> L24
        if (r8.getClass() != android.widget.TextView.class) goto L12;
    L13:
        ((android.widget.TextView) r8).setText(r8.getClass().getSimpleName());     // Catch: java.lang.Throwable -> L24
        goto L15
    L12:
        if (r8.getClass() == android.widget.Button.class) goto L13;
    L15:
        if (r8.getClass() != android.widget.ListView.class) goto L18;
        j6((android.widget.ListView) r8);     // Catch: java.lang.Throwable -> L24
    L18:
        if (r8.getClass() != android.widget.Spinner.class) goto L21;
        j6((android.widget.Spinner) r8);     // Catch: java.lang.Throwable -> L24
    L21:
        if (r8.getClass() != android.widget.ExpandableListView.class) goto L31;
        j6((android.widget.ExpandableListView) r8);     // Catch: java.lang.Throwable -> L24
        return;
    }

    @abcd.Interfacesu(method = 4427299770065563L)
    private void j6(android.widget.ExpandableListView r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -738407496630855689L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-738407496630855689L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        r5.setAdapter(new com.aide.uidesigner.Na(this));     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -716114892006096896L)
    private void j6(android.widget.ListView r7) {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 1188289423867056316L, this, r7);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1188289423867056316L, this, r7);     // Catch: java.lang.Throwable -> L12
    L6:
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L12
        int r3 = 0;
    L8:
        if (r3 >= 30) goto L10;
        r2.add("Item " + r3);     // Catch: java.lang.Throwable -> L12
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L12
        goto L8
    L10:
        r7.setAdapter(new android.widget.ArrayAdapter(this.FH, 17367043, r2));     // Catch: java.lang.Throwable -> L12
    }

    @abcd.Interfacesu(method = -1190108588720790984L)
    private void j6(android.widget.Spinner r7) {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 1205977724896905528L, this, r7);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1205977724896905528L, this, r7);     // Catch: java.lang.Throwable -> L12
    L6:
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L12
        int r3 = 0;
    L8:
        if (r3 >= 30) goto L10;
        r2.add("Item " + r3);     // Catch: java.lang.Throwable -> L12
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L12
        goto L8
    L10:
        r7.setAdapter(new android.widget.ArrayAdapter(this.FH, 17367043, r2));     // Catch: java.lang.Throwable -> L12
    }

    @abcd.Interfacesu(method = 1474581584557770820L)
    private void j6(com.aide.uidesigner.ClassC r9, org.w3c.dom.Node r10, com.aide.uidesigner.N.a[] r11) {
    L25:
        th = move-exception;
        if (DW == false) goto L30;
        abcd.wu.j6(th, -4197485706801327584L, this, r9, r10, r11);
    L30:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-4197485706801327584L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L25
    L5:
        int r0 = r11.length;     // Catch: java.lang.Throwable -> L25
        int r1 = 0;
    L6:
        if (r1 >= r0) goto L24;
        com.aide.uidesigner.N.a r2 = r11[r1];     // Catch: java.lang.Throwable -> L25
        if (r9.j6(r2) == false) goto L23;
        java.lang.Object r3 = tp(r10, r2);     // Catch: java.lang.Throwable -> L25
        if (this.J8 == true) goto L12;
    L22:
        r9.j6(r2, r3);     // Catch: java.lang.Throwable -> L25
        goto L23
    L12:
        if ((r3 instanceof java.lang.Integer) == false) goto L22;
        if (r2 == com.aide.uidesigner.N.v5) goto L18;
        if (r2 != com.aide.uidesigner.N.Zo) goto L22;
    L18:
        if (((java.lang.Integer) r3).intValue() < 0) goto L22;
        int r4 = (int) (this.FH.getResources().getDisplayMetrics().density * 10.0f);     // Catch: java.lang.Throwable -> L25
        if (((java.lang.Integer) r3).intValue() >= r4) goto L22;
        r3 = java.lang.Integer.valueOf(r4);     // Catch: java.lang.Throwable -> L25
    L23:
        r1 = r1 + 1;
        goto L6
    }

    @abcd.Interfacesu(method = -3327151286448363088L)
    private void j6(org.w3c.dom.Node r9, java.lang.String r10, java.lang.String r11) {
    L21:
        th = move-exception;
        if (DW == false) goto L26;
        abcd.wu.j6(th, 4096194408716705592L, this, r9, r10, r11);
    L26:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4096194408716705592L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L21
    L5:
        int r1 = 0;
        if ((r9 instanceof org.w3c.dom.Element) == false) goto L14;
        org.w3c.dom.NamedNodeMap r0 = ((org.w3c.dom.Element) r9).getAttributes();     // Catch: java.lang.Throwable -> L21
        int r2 = 0;
    L9:
        if (r2 >= r0.getLength()) goto L14;
        org.w3c.dom.Attr r3 = (org.w3c.dom.Attr) r0.item(r2);     // Catch: java.lang.Throwable -> L21
        if (r10.equals(r3.getValue()) == false) goto L13;
        r3.setValue(r11);     // Catch: java.lang.Throwable -> L21
    L13:
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L21
    L14:
        org.w3c.dom.NodeList r4 = r9.getChildNodes();     // Catch: java.lang.Throwable -> L21
        if (r4 == null) goto L20;
    L16:
        if (r1 >= r4.getLength()) goto L34;
        j6(r4.item(r1), r10, r11);     // Catch: java.lang.Throwable -> L21
        r1 = r1 + 1;
        goto L16
    L34:
        return;
    }

    @abcd.Interfacesu(method = 195872120940643432L)
    private void j6(org.w3c.dom.NodeList r8) {
    L19:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, -1982429001582559960L, this, r8);
    L24:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1982429001582559960L, this, r8);     // Catch: java.lang.Throwable -> L19
    L6:
        int r2 = 0;
    L7:
        if (r2 >= r8.getLength()) goto L18;
        org.w3c.dom.Node r3 = r8.item(r2);     // Catch: java.lang.Throwable -> L19
        if (r3.getNodeType() != 1) goto L17;
        java.lang.String r4 = j6(r3);     // Catch: java.lang.Throwable -> L19
        if (r4 != null) goto L14;
    L16:
        j6(r3.getChildNodes());     // Catch: java.lang.Throwable -> L19
        goto L17
    L14:
        if (this.VH.containsKey(r4) == true) goto L16;
        this.Zo.put(r4, r3);     // Catch: java.lang.Throwable -> L19
        this.VH.put(r4, java.lang.Integer.valueOf(this.VH.size() + 100));     // Catch: java.lang.Throwable -> L19
    L17:
        r2 = r2 + 1;
        goto L7
    }

    @abcd.Interfacesu(method = -184321579041474925L)
    private void j6(org.w3c.dom.NodeList r20, android.view.ViewGroup r21, com.aide.uidesigner.ClassS r22, int r23) {
    L50:
        th = move-exception;
        if (DW == false) goto L55;
        abcd.wu.j6(th, -92645014005321581L, this, r20, r21, r22, new java.lang.Integer(r23));
    L55:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-92645014005321581L, this, r20, r21, r22, new java.lang.Integer(r23));     // Catch: java.lang.Throwable -> L50
    L6:
        int r13 = 0;
    L7:
        if (r13 >= r20.getLength()) goto L49;
        org.w3c.dom.Node r15 = r20.item(r13);     // Catch: java.lang.Throwable -> L50
        if (r15.getNodeType() != 1) goto L48;
        java.lang.String r1 = r15.getNodeName();     // Catch: java.lang.Throwable -> L50
        android.view.View r3 = j6(r15, r1);     // Catch: java.lang.Throwable -> L50
        if (r3 == null) goto L15;
        j6(r3, this.J8);     // Catch: java.lang.Throwable -> L50
        com.aide.uidesigner.ClassC r2 = new com.aide.uidesigner.ClassC(r3);     // Catch: java.lang.Throwable -> L50
        j6(r2, r15, com.aide.uidesigner.N.gn);     // Catch: java.lang.Throwable -> L50
        android.view.View r4 = r3;
    L14:
        com.aide.uidesigner.ClassC r5 = r2;
        android.view.View r9 = r4;
        com.aide.uidesigner.ClassC r8 = j6(r15, r21);     // Catch: java.lang.Throwable -> L50
        if (this.J8 == true) goto L22;
    L28:
        boolean r16 = false;
    L29:
        android.content.Context r6 = this.FH;     // Catch: java.lang.Throwable -> L50
        android.view.ViewGroup r17 = null;
        if (r16 == false) goto L32;
        android.view.View r7 = r9;
    L33:
        com.aide.uidesigner.ClassS r10 = new com.aide.uidesigner.ClassS(r6, r7, (org.w3c.dom.Element) r15, r5, r8, r22, r23, this);     // Catch: java.lang.Throwable -> L50
        this.gn.add(r10);     // Catch: java.lang.Throwable -> L50
        if (r16 == false) goto L36;
        android.view.View r11 = r10;
    L37:
        java.lang.String r12 = j6(r15);     // Catch: java.lang.Throwable -> L50
        if (r12 == null) goto L40;
        r11.setId(this.VH.get(r12).intValue());     // Catch: java.lang.Throwable -> L50
    L40:
        if (r21 == null) goto L43;
        r21.addView(r11, (android.view.ViewGroup.LayoutParams) r8.FH);     // Catch: java.lang.Throwable -> L50
    L43:
        if ((r9 instanceof android.view.ViewGroup) == false) goto L45;
        r17 = (android.view.ViewGroup) r9;     // Catch: java.lang.Throwable -> L50
    L45:
        j6(r15.getChildNodes(), r17, r10, r23 + 1);     // Catch: java.lang.Throwable -> L50
        goto L48
    L36:
        r11 = r9;
        goto L37
    L32:
        r7 = null;
        goto L33
    L22:
        if ((r9 instanceof android.widget.TableRow) == true) goto L28;
        if (this.QX != null) goto L26;
    L27:
        r16 = true;
        goto L29
    L26:
        if (this.XL.contains(r15) == false) goto L28;
    L15:
        android.widget.TextView r14 = new android.widget.TextView(this.FH);     // Catch: java.lang.Throwable -> L50
        r14.setText(r1);     // Catch: java.lang.Throwable -> L50
        int r18 = (int) (this.FH.getResources().getDisplayMetrics().density * 5.0f);     // Catch: java.lang.Throwable -> L50
        r14.setPadding(r18, r18, r18, r18);     // Catch: java.lang.Throwable -> L50
        if (this.J8 == false) goto L18;
        int r19 = (int) (this.FH.getResources().getDisplayMetrics().density * 20.0f);     // Catch: java.lang.Throwable -> L50
        r14.setMinimumHeight(r19);     // Catch: java.lang.Throwable -> L50
        r14.setMinimumWidth(r19);     // Catch: java.lang.Throwable -> L50
    L18:
        r2 = new com.aide.uidesigner.ClassC(new android.view.View(this.FH));     // Catch: java.lang.Throwable -> L50
        r4 = r14;
    L48:
        r13 = r13 + 1;
        goto L7
    }

    static boolean j6(com.aide.uidesigner.Pa r0) {
        return r0.J8;
    }

    @abcd.Interfacesu(method = 5725625997021570563L)
    private java.lang.Object tp(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -4411770270521347633L, this, r8, r9);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-4411770270521347633L, this, r8, r9);     // Catch: java.lang.Throwable -> L10
    L5:
        java.lang.Object r0 = Ws(r8, r9);     // Catch: java.lang.Throwable -> L10
        if (r0 == null) goto L8;
        return r0;
    L8:
        return FH(r8, r9);
    }

    @abcd.Interfacesu(method = -2239219906033097855L)
    private java.lang.Integer u7(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
    L17:
        th = move-exception;
        if (DW == false) goto L22;
        abcd.wu.j6(th, -707427268262966531L, this, r8, r9);
    L22:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-707427268262966531L, this, r8, r9);     // Catch: java.lang.Throwable -> L17
    L5:
        java.lang.String r0 = we(r8, r9);     // Catch: java.lang.Throwable -> L17
        if (r0 == null) goto L15;
        java.lang.String[] r1 = r0.split("\\|");     // Catch: java.lang.Throwable -> L17
        int r2 = r1.length;     // Catch: java.lang.Throwable -> L17
        int r3 = 0;
        int r4 = 0;
    L8:
        if (r3 >= r2) goto L13;
        java.lang.Integer r5 = j6(r1[r3], r9);     // Catch: java.lang.Throwable -> L17
        if (r5 == null) goto L12;
        r4 = r4 | r5.intValue();     // Catch: java.lang.Throwable -> L17
    L12:
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L17
        goto L8
    L13:
        return java.lang.Integer.valueOf(r4);
    L15:
        return null;
    }

    @abcd.Interfacesu(method = -1331537694209488239L)
    private java.lang.Enum<?> v5(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
    L18:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, -3308306533277547471L, this, r8, r9);
    L23:
        throw th;
    L3:
        if (j6 == false) goto L26;
        abcd.wu.j6(-3308306533277547471L, this, r8, r9);     // Catch: java.lang.Throwable -> L18
    L26:
        java.lang.String r10 = we(r8, r9);     // Catch: java.lang.Throwable -> L25
        if (r10 == null) goto L17;
        java.lang.reflect.Field[] r11 = r9.gn.getFields();     // Catch: java.lang.Throwable -> L25
        int r1 = r11.length;     // Catch: java.lang.Throwable -> L25
        int r2 = 0;
    L9:
        if (r2 >= r1) goto L17;
        java.lang.reflect.Field r3 = r11[r2];     // Catch: java.lang.Throwable -> L25
        java.lang.String r4 = r3.getName();     // Catch: java.lang.Throwable -> L25
        if ((r3.getModifiers() & 8) == 0) goto L16;
        if (r4.replace("_", "").equals(r10.toUpperCase()) == false) goto L16;
        return (java.lang.Enum) r3.get(null);
    L16:
        r2 = r2 + 1;
    L17:
        return null;
    }

    @abcd.Interfacesu(method = 4052035051477996023L)
    private java.lang.String we(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 2322103365689831583L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2322103365689831583L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        return this.u7.j6(EQ(r8, r9).Hw);
    }

    public java.lang.String DW(org.w3c.dom.Element r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 1095777448690094949L, this, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1095777448690094949L, this, r5);     // Catch: java.lang.Throwable -> L12
    L6:
        org.w3c.dom.Node r2 = r5.getAttributes().getNamedItem("style");     // Catch: java.lang.Throwable -> L12
        if ((r2 instanceof org.w3c.dom.Attr) == false) goto L10;
        return ((org.w3c.dom.Attr) r2).getValue();
    L10:
        return null;
    }

    @Override
    public void DW() {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -7806208215390026680L, this);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(-7806208215390026680L, this);     // Catch: java.lang.Throwable -> L7
        return;
    }

    public void DW(com.aide.uidesigner.ClassS r5) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 345722756436195840L, this, r5);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(345722756436195840L, this, r5);     // Catch: java.lang.Throwable -> L11
    L7:
        if (this.QX == null) goto L9;
        this.QX.j6(r5);     // Catch: java.lang.Throwable -> L11
        this.QX = null;     // Catch: java.lang.Throwable -> L11
        aM();     // Catch: java.lang.Throwable -> L11
        return;
    L9:
        j6(r5);     // Catch: java.lang.Throwable -> L11
    }

    public void DW(org.w3c.dom.Element r8, com.aide.uidesigner.ClassB r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 4530947507337423064L, this, r8, r9);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4530947507337423064L, this, r8, r9);     // Catch: java.lang.Throwable -> L11
    L5:
        abcd.F.j6("UI Designer: Add view behind");     // Catch: java.lang.Throwable -> L11
        org.w3c.dom.Element r0 = DW(r9);     // Catch: java.lang.Throwable -> L11
        if (r8.getNextSibling() == null) goto L8;
        r8.getParentNode().insertBefore(r0, r8.getNextSibling());     // Catch: java.lang.Throwable -> L11
    L9:
        j3();     // Catch: java.lang.Throwable -> L11
        return;
    L8:
        r8.getParentNode().appendChild(r0);     // Catch: java.lang.Throwable -> L11
        goto L9
    }

    public void DW(org.w3c.dom.Element r8, java.lang.String r9) {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 658089865075971504L, this, r8, r9);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(658089865075971504L, this, r8, r9);     // Catch: java.lang.Throwable -> L15
    L6:
        abcd.F.j6("UI Designer: Set view ID", java.util.Collections.singletonMap("id", r9));     // Catch: java.lang.Throwable -> L15
        if (r9 != null) goto L10;
        r8.removeAttribute("android:id");     // Catch: java.lang.Throwable -> L15
    L13:
        j3();     // Catch: java.lang.Throwable -> L15
        return;
    L10:
        java.lang.String r2 = j6(r8);     // Catch: java.lang.Throwable -> L15
        r8.setAttribute("android:id", "@+id/" + r9);     // Catch: java.lang.Throwable -> L15
        if (r2 == null) goto L13;
        j6(this.EQ, "@id/" + r2, "@id/" + r9);     // Catch: java.lang.Throwable -> L15
        goto L13
    }

    public void DW(boolean r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1971767352761387761L, this, new java.lang.Boolean(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1971767352761387761L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.J8 = r5;     // Catch: java.lang.Throwable -> L8
        this.QX = null;     // Catch: java.lang.Throwable -> L8
        aM();     // Catch: java.lang.Throwable -> L8
    }

    public void EQ() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2173165238428885845L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2173165238428885845L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.tp = com.aide.uidesigner.ClassE.FH(this.Hw);     // Catch: java.lang.Throwable -> L8
        this.J0.j6(u7(), this.tp, 0);     // Catch: java.lang.Throwable -> L8
        XL();     // Catch: java.lang.Throwable -> L8
    }

    public java.lang.String FH(org.w3c.dom.Element r9) {
    L23:
        th = move-exception;
        if (DW == false) goto L28;
        abcd.wu.j6(th, 752492883288729428L, this, r9);
    L28:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(752492883288729428L, this, r9);     // Catch: java.lang.Throwable -> L23
    L7:
        java.lang.String r3 = "";
        if (this.Hw == null) goto L12;
        r3 = new java.io.File(this.Hw).getName().replace("_", "");     // Catch: java.lang.Throwable -> L23
    L12:
        if (r3.lastIndexOf(46) == (-1)) goto L14;
        r3 = r3.substring(0, r3.lastIndexOf(46));     // Catch: java.lang.Throwable -> L23
    L14:
        java.lang.String r4 = r9.getNodeName();     // Catch: java.lang.Throwable -> L23
        int r7 = 1;
        if (r4.lastIndexOf(46) == (-1)) goto L17;
        r4 = r4.substring(r4.lastIndexOf(46) + 1);     // Catch: java.lang.Throwable -> L23
    L17:
        java.lang.String r2 = r3 + r4;     // Catch: java.lang.Throwable -> L23
    L19:
        if (this.Zo.containsKey(r2 + r7) == false) goto L21;
        r7 = r7 + 1;     // Catch: java.lang.Throwable -> L23
        goto L19
    L21:
        return r2 + r7;
    }

    public void FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2179683173393117400L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2179683173393117400L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        ((android.text.ClipboardManager) this.FH.getSystemService("clipboard")).setText(gn());     // Catch: java.lang.Throwable -> L8
    }

    public void FH(org.w3c.dom.Element r8, com.aide.uidesigner.ClassB r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -5771815326603690368L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-5771815326603690368L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        abcd.F.j6("UI Designer: Add view inside");     // Catch: java.lang.Throwable -> L7
        r8.appendChild(DW(r9));     // Catch: java.lang.Throwable -> L7
        j3();     // Catch: java.lang.Throwable -> L7
    }

    public void FH(boolean r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2019710361797105481L, this, new java.lang.Boolean(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2019710361797105481L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Ws = r5;     // Catch: java.lang.Throwable -> L8
        aM();     // Catch: java.lang.Throwable -> L8
    }

    public java.util.List<java.lang.String> Hw() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3095171414550849348L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3095171414550849348L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return new java.util.ArrayList(this.Zo.keySet());
    }

    public void Hw(org.w3c.dom.Element r8, com.aide.uidesigner.ClassB r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 185637348861576165L, this, r8, r9);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(185637348861576165L, this, r8, r9);     // Catch: java.lang.Throwable -> L11
    L5:
        abcd.F.j6("UI Designer: Surrount with view");     // Catch: java.lang.Throwable -> L11
        org.w3c.dom.Element r0 = DW(r9);     // Catch: java.lang.Throwable -> L11
        org.w3c.dom.Node r1 = r8.getParentNode();     // Catch: java.lang.Throwable -> L11
        org.w3c.dom.Node r2 = r8.getNextSibling();     // Catch: java.lang.Throwable -> L11
        r1.removeChild(r8);     // Catch: java.lang.Throwable -> L11
        if (r2 == null) goto L8;
        r1.insertBefore(r0, r2);     // Catch: java.lang.Throwable -> L11
    L9:
        r0.appendChild(r8);     // Catch: java.lang.Throwable -> L11
        Hw(r8);     // Catch: java.lang.Throwable -> L11
        j3();     // Catch: java.lang.Throwable -> L11
        return;
    L8:
        r1.appendChild(r0);     // Catch: java.lang.Throwable -> L11
        goto L9
    }

    protected abstract void J0();

    public void J8() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1462666728076288560L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1462666728076288560L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.tp = ((android.text.ClipboardManager) this.FH.getSystemService("clipboard")).getText().toString();     // Catch: java.lang.Throwable -> L8
        this.J0.DW(u7(), this.tp, 0);     // Catch: java.lang.Throwable -> L8
        XL();     // Catch: java.lang.Throwable -> L8
        j6(true);     // Catch: java.lang.Throwable -> L8
    }

    public java.lang.String QX() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -323398783865823145L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-323398783865823145L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.u7.Hw();
    }

    public java.util.List<com.aide.uidesigner.ClassS> VH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4376711594671877595L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4376711594671877595L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return new java.util.ArrayList(this.gn);
    }

    public void Ws() {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 1584304968481758160L, this);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1584304968481758160L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (android.os.Build.VERSION.SDK_INT >= 24) goto L17;
        android.content.Intent r2 = new android.content.Intent("android.intent.action.SEND");     // Catch: java.lang.Throwable -> L10
        r2.setType("application/xml");     // Catch: java.lang.Throwable -> L10
        r2.putExtra("android.intent.extra.STREAM", android.net.Uri.fromFile(new java.io.File(this.Hw)));     // Catch: java.lang.Throwable -> L10
        r2.putExtra("android.intent.extra.SUBJECT", "XML Layout");     // Catch: java.lang.Throwable -> L10
        r2.putExtra("android.intent.extra.TEXT", "Attached...");     // Catch: java.lang.Throwable -> L10
        this.FH.startActivity(r2);     // Catch: java.lang.Throwable -> L10
        return;
    }

    public java.util.List<java.lang.String> Zo() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -5005188807374474565L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5005188807374474565L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.u7.DW();
    }

    public java.lang.String gn() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 373300343918648700L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(373300343918648700L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.tp;
    }

    public java.lang.String j6(org.w3c.dom.Node r5) {
    L16:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, -939955254136767423L, this, r5);
    L20:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-939955254136767423L, this, r5);     // Catch: java.lang.Throwable -> L16
    L6:
        org.w3c.dom.Node r2 = r5.getAttributes().getNamedItem("android:id");     // Catch: java.lang.Throwable -> L16
        if ((r2 instanceof org.w3c.dom.Attr) == false) goto L14;
        java.lang.String r3 = ((org.w3c.dom.Attr) r2).getValue();     // Catch: java.lang.Throwable -> L16
        if (r3 != null) goto L11;
        return null;
    L11:
        if (r3.startsWith("@+id/") == false) goto L24;
        return r3.substring(5);
    L24:
        return null;
    L14:
        return null;
    }

    public java.util.List<com.aide.uidesigner.ClassA> j6(com.aide.uidesigner.ClassC r9, com.aide.uidesigner.ClassC r10, org.w3c.dom.Element r11) {
    L38:
        th = move-exception;
        if (DW == false) goto L43;
        abcd.wu.j6(th, 49227680475771339L, this, r9, r10, r11);
    L43:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(49227680475771339L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L38
    L5:
        java.util.ArrayList r0 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L38
        com.aide.uidesigner.N.a[] r1 = com.aide.uidesigner.N.u7;     // Catch: java.lang.Throwable -> L38
        int r2 = r1.length;     // Catch: java.lang.Throwable -> L38
        int r3 = 0;
    L6:
        if (r3 >= r2) goto L16;
        com.aide.uidesigner.N.a r4 = r1[r3];     // Catch: java.lang.Throwable -> L38
        if (r4.EQ == false) goto L13;
        if (r10.j6(r4) == false) goto L15;
        r0.add(EQ(r11, r4));     // Catch: java.lang.Throwable -> L38
    L15:
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L38
        goto L6
    L13:
        if (r9.j6(r4) == false) goto L15;
        r0.add(EQ(r11, r4));     // Catch: java.lang.Throwable -> L38
        goto L15
    L16:
        java.util.ArrayList r5 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L38
        java.util.Iterator r6 = r0.iterator();     // Catch: java.lang.Throwable -> L38
    L18:
        if (r6.hasNext() == false) goto L24;
        com.aide.uidesigner.ClassA r7 = (com.aide.uidesigner.ClassA) r6.next();     // Catch: java.lang.Throwable -> L38
        if (r7.DW() == false) goto L18;
        if (r7.FH() == true) goto L18;
        r5.add(r7);     // Catch: java.lang.Throwable -> L38
        goto L18
    L24:
        java.util.Iterator r8 = r0.iterator();     // Catch: java.lang.Throwable -> L38
    L26:
        if (r8.hasNext() == false) goto L30;
        com.aide.uidesigner.ClassA r12 = (com.aide.uidesigner.ClassA) r8.next();     // Catch: java.lang.Throwable -> L38
        if (r12.FH() == false) goto L26;
        r5.add(r12);     // Catch: java.lang.Throwable -> L38
        goto L26
    L30:
        java.util.Iterator r13 = r0.iterator();     // Catch: java.lang.Throwable -> L38
    L31:
        if (r13.hasNext() == false) goto L37;
        com.aide.uidesigner.ClassA r14 = (com.aide.uidesigner.ClassA) r13.next();     // Catch: java.lang.Throwable -> L38
        if (r14.DW() == true) goto L31;
        r5.add(r14);     // Catch: java.lang.Throwable -> L38
        goto L31
    L37:
        return r5;
    }

    public void j6(com.aide.uidesigner.ClassB r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -478422139639848033L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-478422139639848033L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.F.j6("UI Designer: Add view");     // Catch: java.lang.Throwable -> L8
        this.EQ.appendChild(DW(r5));     // Catch: java.lang.Throwable -> L8
        j3();     // Catch: java.lang.Throwable -> L8
    }

    protected abstract void j6(com.aide.uidesigner.ClassS r1);

    public void j6(java.lang.String r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1561668179089310081L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1561668179089310081L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = r6;     // Catch: java.lang.Throwable -> L8
        this.J0.j6(r6, this.tp, 0);     // Catch: java.lang.Throwable -> L8
        XL();     // Catch: java.lang.Throwable -> L8
    }

    public void j6(java.lang.String r8, android.content.Intent r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 7320189892474631955L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(7320189892474631955L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        this.u7.j6(r8, r9);     // Catch: java.lang.Throwable -> L7
    }

    @Override
    public void j6(java.lang.String r9, java.lang.String r10, int r11) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, -2402858916435907891L, this, r9, r10, new java.lang.Integer(r11));
    L13:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2402858916435907891L, this, r9, r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L9
    L6:
        if (r9.equals(u7()) == false) goto L16;
        this.tp = r10;     // Catch: java.lang.Throwable -> L9
        XL();     // Catch: java.lang.Throwable -> L9
        j6(false);     // Catch: java.lang.Throwable -> L9
        return;
    }

    public void j6(org.w3c.dom.Element r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 198423730027264652L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(198423730027264652L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.F.j6("UI Designer: Delete view");     // Catch: java.lang.Throwable -> L8
        r5.getParentNode().removeChild(r5);     // Catch: java.lang.Throwable -> L8
        j3();     // Catch: java.lang.Throwable -> L8
    }

    public void j6(org.w3c.dom.Element r8, com.aide.common.ab<com.aide.uidesigner.ClassS> r9) {
    L17:
        th = move-exception;
        if (DW == false) goto L22;
        abcd.wu.j6(th, -4181333740868135040L, this, r8, r9);
    L22:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-4181333740868135040L, this, r8, r9);     // Catch: java.lang.Throwable -> L17
    L5:
        this.QX = r9;     // Catch: java.lang.Throwable -> L17
        this.XL = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L17
        org.w3c.dom.NodeList r0 = r8.getParentNode().getChildNodes();     // Catch: java.lang.Throwable -> L17
        int r1 = 0;
    L7:
        if (r1 >= r0.getLength()) goto L15;
        org.w3c.dom.Node r2 = r0.item(r1);     // Catch: java.lang.Throwable -> L17
        if ((r2 instanceof org.w3c.dom.Element) == false) goto L14;
        if (r2.equals(r8) == true) goto L15;
        this.XL.add((org.w3c.dom.Element) r2);     // Catch: java.lang.Throwable -> L17
    L14:
        r1 = r1 + 1;     // Catch: java.lang.Throwable -> L17
    L15:
        aM();     // Catch: java.lang.Throwable -> L17
    }

    public void j6(org.w3c.dom.Element r9, com.aide.uidesigner.N.a r10, java.lang.String r11) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 359852374142441440L, this, r9, r10, r11);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(359852374142441440L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L11
    L5:
        java.util.HashMap r0 = new java.util.HashMap();     // Catch: java.lang.Throwable -> L11
        r0.put("attrName", r10.Zo);     // Catch: java.lang.Throwable -> L11
        r0.put("value", r11);     // Catch: java.lang.Throwable -> L11
        abcd.F.j6("UI Designer: Set attribute", r0);     // Catch: java.lang.Throwable -> L11
        if (r11 != null) goto L8;
        r9.removeAttribute(r10.Zo);     // Catch: java.lang.Throwable -> L11
    L9:
        j3();     // Catch: java.lang.Throwable -> L11
        return;
    L8:
        r9.setAttribute(r10.Zo, r11);     // Catch: java.lang.Throwable -> L11
        goto L9
    }

    public void j6(org.w3c.dom.Element r10, com.aide.uidesigner.N.a r11, org.w3c.dom.Element r12, java.lang.String r13) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 203220119953091164L, this, r10, r11, r12, r13);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(203220119953091164L, this, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L10
    L5:
        r10.setAttribute(r11.Zo, "@id/" + r13);     // Catch: java.lang.Throwable -> L10
        if (r12 == null) goto L8;
        r12.setAttribute("android:id", "@+id/" + r13);     // Catch: java.lang.Throwable -> L10
    L8:
        j3();     // Catch: java.lang.Throwable -> L10
    }

    public void j6(org.w3c.dom.Element r8, com.aide.uidesigner.ClassB r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -1250100235045275625L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1250100235045275625L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        abcd.F.j6("UI Designer: Add view before");     // Catch: java.lang.Throwable -> L7
        r8.getParentNode().insertBefore(DW(r9), r8);     // Catch: java.lang.Throwable -> L7
        j3();     // Catch: java.lang.Throwable -> L7
    }

    public void j6(org.w3c.dom.Element r11, com.aide.uidesigner.ClassB r12, org.w3c.dom.Element r13, com.aide.uidesigner.N.a r14, java.lang.String r15) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 85704402556510605L, this, r11, r12, r13, r14, r15);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(85704402556510605L, this, r11, r12, r13, r14, r15);     // Catch: java.lang.Throwable -> L7
    L5:
        abcd.F.j6("UI Designer: Add view inside");     // Catch: java.lang.Throwable -> L7
        org.w3c.dom.Element r0 = DW(r12);     // Catch: java.lang.Throwable -> L7
        r11.appendChild(r0);     // Catch: java.lang.Throwable -> L7
        r0.setAttribute(r14.Zo, "@id/" + r15);     // Catch: java.lang.Throwable -> L7
        r13.setAttribute("android:id", "@+id/" + r15);     // Catch: java.lang.Throwable -> L7
        j3();     // Catch: java.lang.Throwable -> L7
    }

    public void j6(org.w3c.dom.Element r8, java.lang.String r9) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 364601189555615295L, this, r8, r9);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(364601189555615295L, this, r8, r9);     // Catch: java.lang.Throwable -> L12
    L6:
        abcd.F.j6("UI Designer: Set style", java.util.Collections.singletonMap("style", r9));     // Catch: java.lang.Throwable -> L12
        if (r9 != null) goto L9;
        r8.removeAttribute("style");     // Catch: java.lang.Throwable -> L12
    L10:
        j3();     // Catch: java.lang.Throwable -> L12
        return;
    L9:
        r8.setAttribute("style", r9);     // Catch: java.lang.Throwable -> L12
        goto L10
    }

    protected abstract void j6(boolean r1);

    public boolean j6() {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 3061999565082314400L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3061999565082314400L, this);     // Catch: java.lang.Throwable -> L13
    L6:
        android.text.ClipboardManager r2 = (android.text.ClipboardManager) this.FH.getSystemService("clipboard");     // Catch: java.lang.Throwable -> L13
        if (r2.hasText() == false) goto L20;
        if (r2.getText().charAt(0) != '<') goto L21;
        return true;
    L21:
        return false;
    L20:
        return false;
    }

    public boolean tp() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 2910808320522541760L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2910808320522541760L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        if (this.EQ.getChildNodes().getLength() <= 0) goto L9;
        return true;
    L9:
        return false;
    }

    public java.lang.String u7() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2911004500703773331L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2911004500703773331L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Hw;
    }

    public java.util.List<java.lang.String> v5() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -919594369715729176L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-919594369715729176L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.u7.j6();
    }

    protected abstract void we();
}
