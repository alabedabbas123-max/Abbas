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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, 1631316635657174407L, null, r10, r11, r12, r13);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(1631316635657174407L, null, r10, r11, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        this.Zo = new java.util.HashMap();
                        this.VH = new java.util.HashMap();
                        this.gn = new java.util.ArrayList();
                        r13.j6(this);
                        this.J0 = r13;
                        this.FH = r10.getContext();
                        this.v5 = r10;
                        this.Hw = r11;
                        this.u7 = new com.aide.uidesigner.la(this.FH, r12);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static android.content.Context DW(com.aide.uidesigner.Pa r0) {
        return r0.FH;
    }

    @abcd.Interfacesu(method = 2004452076313917867L)
    private java.lang.Integer DW(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
        java.lang.String r10 = null;
        long r0 = 0L;
        int r11 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 21: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 25; continue $sw1; }
                    abcd.wu.j6(th, 1867825353421785587L, this, r8, r9);
                    $pc1 = 25; continue $sw1;
                }
                case 25: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(1867825353421785587L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 21; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        r10 = we(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 21; continue $sw1;
                    }
                    if (r10 != null) { $pc1 = 27; continue $sw1; }
                    $pc1 = 20; continue $sw1;
                }
                case 20: {
                    return null;
                }
                case 27: {
                    if (r10.charAt(0) != '#') { $pc1 = 17; continue $sw1; }
                    try {
                        r0 = java.lang.Long.parseLong(r10.substring(1), 16);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 26; continue $sw1;
                    }
                    if (r10.length() != 7) { $pc1 = 15; continue $sw1; }
                    try {
                        r0 = r0 | (-16777216);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 26; continue $sw1;
                    }
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    return java.lang.Integer.valueOf((int) r0);
                }
                case 17: {
                    if (r10.startsWith("@android:color/") == false) { $pc1 = 20; continue $sw1; }
                    try {
                        r11 = ((java.lang.Integer) android.R.color.class.getDeclaredField(r10.substring(15)).get(null)).intValue();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 26; continue $sw1;
                    }
                    return java.lang.Integer.valueOf(this.FH.getResources().getColor(r11));
                }
                case 26: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2349038109322061875L)
    private org.w3c.dom.Element DW(com.aide.uidesigner.ClassB r7) {
        org.w3c.dom.Element r2 = null;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> r3 = null;
        java.util.Map.Entry<java.lang.String, java.lang.String> r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 12: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 17; continue $sw2; }
                    abcd.wu.j6(th, 3783036654195827823L, this, r7);
                    $pc2 = 17; continue $sw2;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(3783036654195827823L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 12; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        r2 = this.EQ.createElement(r7.FH);
                        r3 = r7.Hw.entrySet().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 12; continue $sw2;
                    }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r3.hasNext() == false) { $pc2 = 11; continue $sw2; }
                    try {
                        r4 = r3.next();
                        r2.setAttribute(r4.getKey(), r4.getValue());
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 12; continue $sw2;
                    }
                    { $pc2 = 7; continue $sw2; }
                }
                case 11: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -7337775203232255687L)
    private com.aide.uidesigner.ClassA EQ(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
        org.w3c.dom.Node r0 = null;
        java.lang.String r1 = null;
        java.lang.String r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 17: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 21; continue $sw3; }
                    abcd.wu.j6(th, 6227446785558914837L, this, r8, r9);
                    $pc3 = 21; continue $sw3;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc3 = 5; continue $sw3; }
                    try {
                        abcd.wu.j6(6227446785558914837L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 17; continue $sw3;
                    }
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    try {
                        r0 = r8.getAttributes().getNamedItem(r9.Zo);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 17; continue $sw3;
                    }
                    if ((r0 instanceof org.w3c.dom.Attr) == true) { $pc3 = 8; continue $sw3; }
                    try {
                        r1 = DW((org.w3c.dom.Element) r8);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 17; continue $sw3;
                    }
                    if (r1 == null) { $pc3 = 16; continue $sw3; }
                    try {
                        r2 = this.u7.j6(r1, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 17; continue $sw3;
                    }
                    if (r2 == null) { $pc3 = 16; continue $sw3; }
                    return new com.aide.uidesigner.ClassA(r9, r2);
                }
                case 16: {
                    return new com.aide.uidesigner.ClassA(r9);
                }
                case 8: {
                    return new com.aide.uidesigner.ClassA(r9, (org.w3c.dom.Attr) r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -5756492489242968472L)
    private java.lang.Object FH(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
        java.lang.Integer r0 = null;
        java.lang.Integer r1 = null;
        java.lang.Integer r10 = null;
        java.lang.Integer r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 49: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 53; continue $sw4; }
                    abcd.wu.j6(th, 4620040786862887992L, this, r8, r9);
                    $pc4 = 53; continue $sw4;
                }
                case 53: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(4620040786862887992L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 49; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        switch(com.aide.uidesigner.Oa.j6[r9.VH.ordinal()]) {
                            case 1: { $pc4 = 48; continue $sw4; }
                            case 2: { $pc4 = 46; continue $sw4; }
                            case 3: { $pc4 = 44; continue $sw4; }
                            case 4: { $pc4 = 42; continue $sw4; }
                            case 5: { $pc4 = 40; continue $sw4; }
                            case 6: { $pc4 = 38; continue $sw4; }
                            case 7: { $pc4 = 36; continue $sw4; }
                            case 8: { $pc4 = 29; continue $sw4; }
                            case 9: { $pc4 = 28; continue $sw4; }
                            case 10: { $pc4 = 26; continue $sw4; }
                            case 11: { $pc4 = 24; continue $sw4; }
                            case 12: { $pc4 = 22; continue $sw4; }
                            case 13: { $pc4 = 20; continue $sw4; }
                            case 14: { $pc4 = 12; continue $sw4; }
                            case 15: { $pc4 = 8; continue $sw4; }
                            default: { $pc4 = 7; continue $sw4; }
                        };
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 49; continue $sw4;
                    }
                }
                case 7: {
                    return null;
                }
                case 8: {
                    try {
                        r0 = J0(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 49; continue $sw4;
                    }
                    if (r0 != null) { $pc4 = 11; continue $sw4; }
                    return null;
                }
                case 11: {
                    return new java.lang.Float(r0.intValue());
                }
                case 12: {
                    try {
                        r1 = J0(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 49; continue $sw4;
                    }
                    if (r1 == null) { $pc4 = 15; continue $sw4; }
                    return r1;
                }
                case 15: {
                    try {
                        r10 = u7(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 49; continue $sw4;
                    }
                    if (r10 == null) { $pc4 = 18; continue $sw4; }
                    return r10;
                }
                case 18: {
                    return null;
                }
                case 29: {
                    try {
                        r2 = DW(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 49; continue $sw4;
                    }
                    if (r2 == null) { $pc4 = 34; continue $sw4; }
                    return new android.graphics.drawable.ColorDrawable(r2.intValue());
                }
                case 34: {
                    return Hw(r8, r9);
                }
                case 20: {
                    return QX(r8, r9);
                }
                case 22: {
                    return J0(r8, r9);
                }
                case 24: {
                    return we(r8, r9);
                }
                case 26: {
                    return v5(r8, r9);
                }
                case 28: {
                    return J8(r8, r9);
                }
                case 36: {
                    return Hw(r8, r9);
                }
                case 38: {
                    return DW(r8, r9);
                }
                case 40: {
                    return Zo(r8, r9);
                }
                case 42: {
                    return u7(r8, r9);
                }
                case 44: {
                    return gn(r8, r9);
                }
                case 46: {
                    return VH(r8, r9);
                }
                case 48: {
                    return j6(r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -7572876402243923316L)
    private java.lang.Object Hw(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
        java.lang.String r0 = null;
        android.graphics.drawable.Drawable r1 = null;
        int r10 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 3;
        $sw5: while (true) {
            switch ($pc5) {
                case 15: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 19; continue $sw5; }
                    abcd.wu.j6(th, -786170089461139360L, this, r8, r9);
                    $pc5 = 19; continue $sw5;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc5 = 5; continue $sw5; }
                    try {
                        abcd.wu.j6(-786170089461139360L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 15; continue $sw5;
                    }
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    try {
                        r0 = we(r8, r9);
                        r1 = this.u7.DW(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 15; continue $sw5;
                    }
                    if (r1 == null) { $pc5 = 9; continue $sw5; }
                    return r1;
                }
                case 9: {
                    if (r0 == null) { $pc5 = 14; continue $sw5; }
                    if (r0.startsWith("@android:drawable/") == false) { $pc5 = 14; continue $sw5; }
                    try {
                        r10 = ((java.lang.Integer) android.R.drawable.class.getDeclaredField(r0.substring(18)).get(null)).intValue();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 20; continue $sw5;
                    }
                    return this.FH.getResources().getDrawable(r10);
                }
                case 14: {
                    return null;
                }
                case 20: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -275697771859501555L)
    private void Hw(org.w3c.dom.Element r8) {
        com.aide.uidesigner.N.a[] r2 = null;
        int r3 = 0;
        int r4 = 0;
        com.aide.uidesigner.N.a r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 17: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 22; continue $sw6; }
                    abcd.wu.j6(th, -1340961295036898355L, this, r8);
                    $pc6 = 22; continue $sw6;
                }
                case 22: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(-1340961295036898355L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 17; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        r2 = com.aide.uidesigner.N.VH;
                        r3 = r2.length;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 17; continue $sw6;
                    }
                    r4 = 0;
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    if (r4 >= r3) { $pc6 = 16; continue $sw6; }
                    try {
                        r5 = r2[r4];
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 17; continue $sw6;
                    }
                    if (r5 == com.aide.uidesigner.N.v5) { $pc6 = 15; continue $sw6; }
                    if (r5 == com.aide.uidesigner.N.Zo) { $pc6 = 15; continue $sw6; }
                    if (r8.hasAttribute(r5.Zo) == false) { $pc6 = 15; continue $sw6; }
                    try {
                        r8.removeAttribute(r5.Zo);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 17; continue $sw6;
                    }
                    $pc6 = 15; continue $sw6;
                }
                case 15: {
                    r4 = r4 + 1;
                    { $pc6 = 7; continue $sw6; }
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2849994407340638369L)
    private java.lang.Integer J0(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
        java.lang.String r10 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 3;
        $sw7: while (true) {
            switch ($pc7) {
                case 29: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 33; continue $sw7; }
                    abcd.wu.j6(th, -871692604657668415L, this, r8, r9);
                    $pc7 = 33; continue $sw7;
                }
                case 33: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc7 = 5; continue $sw7; }
                    try {
                        abcd.wu.j6(-871692604657668415L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 29; continue $sw7;
                    }
                    $pc7 = 5; continue $sw7;
                }
                case 5: {
                    try {
                        r10 = we(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 29; continue $sw7;
                    }
                    if (r10 != null) { $pc7 = 35; continue $sw7; }
                    $pc7 = 28; continue $sw7;
                }
                case 28: {
                    return null;
                }
                case 35: {
                    if (r10.endsWith("px") == false) { $pc7 = 13; continue $sw7; }
                    return java.lang.Integer.valueOf((int) java.lang.Float.parseFloat(r10.substring(0, r10.length() - 2)));
                }
                case 13: {
                    if (r10.endsWith("dp") == false) { $pc7 = 17; continue $sw7; }
                    return java.lang.Integer.valueOf((int) (java.lang.Float.parseFloat(r10.substring(0, r10.length() - 2)) * this.FH.getResources().getDisplayMetrics().density));
                }
                case 17: {
                    if (r10.endsWith("dip") == false) { $pc7 = 21; continue $sw7; }
                    return java.lang.Integer.valueOf((int) (java.lang.Float.parseFloat(r10.substring(0, r10.length() - 3)) * this.FH.getResources().getDisplayMetrics().density));
                }
                case 21: {
                    if (r10.endsWith("sp") == false) { $pc7 = 25; continue $sw7; }
                    return java.lang.Integer.valueOf((int) (java.lang.Float.parseFloat(r10.substring(0, r10.length() - 2)) * this.FH.getResources().getDisplayMetrics().scaledDensity));
                }
                case 25: {
                    if (r10.startsWith("@android:dimen/") == false) { $pc7 = 28; continue $sw7; }
                    return java.lang.Integer.valueOf(this.FH.getResources().getDimensionPixelSize(((java.lang.Integer) android.R.dimen.class.getDeclaredField(r10.substring(15)).get(null)).intValue()));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -2713749262272935211L)
    private java.lang.String J8(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 3;
        $sw8: while (true) {
            switch ($pc8) {
                case 7: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 11; continue $sw8; }
                    abcd.wu.j6(th, 4168573446901898637L, this, r8, r9);
                    $pc8 = 11; continue $sw8;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc8 = 5; continue $sw8; }
                    try {
                        abcd.wu.j6(4168573446901898637L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 7; continue $sw8;
                    }
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    return we(r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -474981390786198360L)
    private java.lang.Float QX(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
        java.lang.Integer r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 3;
        $sw9: while (true) {
            switch ($pc9) {
                case 11: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 15; continue $sw9; }
                    abcd.wu.j6(th, 6545676225613982104L, this, r8, r9);
                    $pc9 = 15; continue $sw9;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc9 = 5; continue $sw9; }
                    try {
                        abcd.wu.j6(6545676225613982104L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 11; continue $sw9;
                    }
                    $pc9 = 5; continue $sw9;
                }
                case 5: {
                    try {
                        r0 = J0(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 11; continue $sw9;
                    }
                    if (r0 == null) { $pc9 = 9; continue $sw9; }
                    return java.lang.Float.valueOf(r0.intValue() / this.FH.getResources().getDisplayMetrics().scaledDensity);
                }
                case 9: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1204896639864973419L)
    private java.lang.Integer VH(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
        java.lang.String r0 = null;
        java.lang.String r1 = null;
        java.lang.String r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 3;
        $sw10: while (true) {
            switch ($pc10) {
                case 21: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 25; continue $sw10; }
                    abcd.wu.j6(th, 558621795955113317L, this, r8, r9);
                    $pc10 = 25; continue $sw10;
                }
                case 25: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc10 = 5; continue $sw10; }
                    try {
                        abcd.wu.j6(558621795955113317L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 21; continue $sw10;
                    }
                    $pc10 = 5; continue $sw10;
                }
                case 5: {
                    try {
                        r0 = we(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 21; continue $sw10;
                    }
                    if (r0 != null) { $pc10 = 8; continue $sw10; }
                    return null;
                }
                case 8: {
                    if (r0.startsWith("@+id/") == false) { $pc10 = 14; continue $sw10; }
                    try {
                        r1 = r0.substring(5);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 21; continue $sw10;
                    }
                    if (this.VH.containsKey(r1) == false) { $pc10 = 14; continue $sw10; }
                    return this.VH.get(r1);
                }
                case 14: {
                    if (r0.startsWith("@id/") == false) { $pc10 = 27; continue $sw10; }
                    try {
                        r2 = r0.substring(4);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 21; continue $sw10;
                    }
                    if (this.VH.containsKey(r2) == true) { $pc10 = 18; continue $sw10; }
                    return null;
                }
                case 18: {
                    return this.VH.get(r2);
                }
                case 27: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2217410949801159588L)
    private java.lang.Object Ws(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
        java.lang.String r10 = null;
        int r11 = 0;
        android.util.TypedValue r12 = null;
        android.content.res.TypedArray r13 = null;
        java.lang.String r14 = null;
        android.graphics.drawable.Drawable r15 = null;
        java.lang.Integer r16 = null;
        java.lang.Integer r17 = null;
        java.lang.Boolean r18 = null;
        java.lang.Float r19 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 3;
        $sw11: while (true) {
            switch ($pc11) {
                case 47: {
                    th = $ex11;
                    if (DW == false) { $pc11 = 51; continue $sw11; }
                    abcd.wu.j6(th, -1588890119246252064L, this, r8, r9);
                    $pc11 = 51; continue $sw11;
                }
                case 51: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc11 = 55; continue $sw11; }
                    try {
                        abcd.wu.j6(-1588890119246252064L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 47; continue $sw11;
                    }
                    $pc11 = 55; continue $sw11;
                }
                case 55: {
                    try {
                        r10 = EQ(r8, r9).Hw;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 52; continue $sw11;
                    }
                    if (r10 == null) { $pc11 = 46; continue $sw11; }
                    if (r10.startsWith("?android:attr/") == false) { $pc11 = 46; continue $sw11; }
                    try {
                        r11 = ((java.lang.Integer) android.R.attr.class.getField(r10.substring(14)).get(null)).intValue();
                        switch(com.aide.uidesigner.Oa.j6[r9.VH.ordinal()]) {
                            case 12: { $pc11 = 13; continue $sw11; }
                            case 13: { $pc11 = 13; continue $sw11; }
                            case 14: { $pc11 = 13; continue $sw11; }
                            case 15: { $pc11 = 13; continue $sw11; }
                            default: { $pc11 = 17; continue $sw11; }
                        };
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 52; continue $sw11;
                    }
                }
                case 13: {
                    try {
                        r12 = new android.util.TypedValue();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 52; continue $sw11;
                    }
                    if (this.FH.getTheme().resolveAttribute(r11, r12, true) == false) { $pc11 = 46; continue $sw11; }
                    return java.lang.Integer.valueOf((int) android.util.TypedValue.complexToDimension(r12.data, this.FH.getResources().getDisplayMetrics()));
                }
                case 17: {
                    try {
                        r13 = this.FH.obtainStyledAttributes(new int[]{r11});
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 52; continue $sw11;
                    }
                    $pc11 = 19; continue $sw11;
                }
                case 43: {
                    th = $ex11;
                    try {
                        r13.recycle();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 52; continue $sw11;
                    }
                }
                case 19: {
                    if (r13.hasValue(0) == true) { $pc11 = 21; continue $sw11; }
                    $pc11 = 42; continue $sw11;
                }
                case 42: {
                    try {
                        r13.recycle();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 52; continue $sw11;
                    }
                    { $pc11 = 46; continue $sw11; }
                }
                case 21: {
                    try {
                        switch(com.aide.uidesigner.Oa.j6[r9.VH.ordinal()]) {
                            case 1: { $pc11 = 39; continue $sw11; }
                            case 2: { $pc11 = 36; continue $sw11; }
                            case 3: { $pc11 = 36; continue $sw11; }
                            case 4: { $pc11 = 36; continue $sw11; }
                            case 5: { $pc11 = 33; continue $sw11; }
                            case 6: { $pc11 = 29; continue $sw11; }
                            case 7: { $pc11 = 26; continue $sw11; }
                            case 8: { $pc11 = 26; continue $sw11; }
                            case 9: { $pc11 = 23; continue $sw11; }
                            default: { $pc11 = 42; continue $sw11; }
                        };
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 43; continue $sw11;
                    }
                }
                case 23: {
                    try {
                        r14 = r13.getString(0);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 43; continue $sw11;
                    }
                    try {
                        r13.recycle();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 52; continue $sw11;
                    }
                    return r14;
                }
                case 26: {
                    try {
                        r15 = r13.getDrawable(0);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 43; continue $sw11;
                    }
                    try {
                        r13.recycle();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 52; continue $sw11;
                    }
                    return r15;
                }
                case 29: {
                    try {
                        r16 = java.lang.Integer.valueOf(r13.getColor(0, 0));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 43; continue $sw11;
                    }
                    try {
                        r13.recycle();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 52; continue $sw11;
                    }
                    return r16;
                }
                case 36: {
                    try {
                        r17 = java.lang.Integer.valueOf(r13.getInt(0, 0));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 43; continue $sw11;
                    }
                    try {
                        r13.recycle();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 52; continue $sw11;
                    }
                    return r17;
                }
                case 39: {
                    try {
                        r18 = java.lang.Boolean.valueOf(r13.getBoolean(0, false));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 43; continue $sw11;
                    }
                    try {
                        r13.recycle();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 52; continue $sw11;
                    }
                    return r18;
                }
                case 33: {
                    try {
                        r19 = java.lang.Float.valueOf(r13.getFloat(0, 0.0f));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 43; continue $sw11;
                    }
                    try {
                        r13.recycle();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 52; continue $sw11;
                    }
                    return r19;
                }
                case 46: {
                    return null;
                }
                case 52: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -2047191329866893804L)
    private void XL() {
        java.io.ByteArrayInputStream r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 4;
        $sw12: while (true) {
            switch ($pc12) {
                case 14: {
                    th = $ex12;
                    if (DW == false) { $pc12 = 18; continue $sw12; }
                    abcd.wu.j6(th, 2990794066491496496L, this);
                    $pc12 = 18; continue $sw12;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc12 = 22; continue $sw12; }
                    try {
                        abcd.wu.j6(2990794066491496496L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 14; continue $sw12;
                    }
                    $pc12 = 22; continue $sw12;
                }
                case 22: {
                    try {
                        this.we = null;
                        this.Zo.clear();
                        this.VH.clear();
                        this.u7.FH();
                        r3 = new java.io.ByteArrayInputStream(this.tp.getBytes());
                        this.EQ = com.aide.common.pa.j6(r3);
                        r3.close();
                        j6(this.EQ.getChildNodes());
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 9; continue $sw12;
                    }
                    $pc12 = 12; continue $sw12;
                }
                case 12: {
                    try {
                        this.QX = null;
                        aM();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 14; continue $sw12;
                    }
                    return;
                }
                case 9: {
                    th = $ex12;
                    try {
                        this.we = th;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 14; continue $sw12;
                    }
                    try {
                        this.EQ = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        if ($t instanceof javax.xml.parsers.ParserConfigurationException) { $pc12 = 19; continue $sw12; }
                        $pc12 = 14; continue $sw12;
                    }
                    { $pc12 = 12; continue $sw12; }
                }
                case 19: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 3682233953707219680L)
    private java.lang.Float Zo(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
        java.lang.String r10 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 3;
        $sw13: while (true) {
            switch ($pc13) {
                case 11: {
                    th = $ex13;
                    if (DW == false) { $pc13 = 15; continue $sw13; }
                    abcd.wu.j6(th, 3560116257338929320L, this, r8, r9);
                    $pc13 = 15; continue $sw13;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc13 = 5; continue $sw13; }
                    try {
                        abcd.wu.j6(3560116257338929320L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 11; continue $sw13;
                    }
                    $pc13 = 5; continue $sw13;
                }
                case 5: {
                    try {
                        r10 = we(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 11; continue $sw13;
                    }
                    if (r10 != null) { $pc13 = 17; continue $sw13; }
                    return null;
                }
                case 17: {
                    return java.lang.Float.valueOf(java.lang.Float.parseFloat(r10));
                }
                case 21: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 3292702607872674292L)
    private void aM() {
        android.widget.LinearLayout r2 = null;
        com.aide.uidesigner.Ma r3 = null;
        android.view.ViewGroup r4 = null;
        java.lang.Throwable e = null;
        android.widget.TextView r5 = null;
        int r6 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 29: {
                    th = $ex14;
                    if (DW == false) { $pc14 = 33; continue $sw14; }
                    abcd.wu.j6(th, 1597500778637411328L, this);
                    $pc14 = 33; continue $sw14;
                }
                case 33: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc14 = 6; continue $sw14; }
                    try {
                        abcd.wu.j6(1597500778637411328L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    try {
                        this.v5.removeAllViews();
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    if (this.Ws == false) { $pc14 = 9; continue $sw14; }
                    $pc14 = 12; continue $sw14;
                }
                case 12: {
                    try {
                        r2 = new android.widget.LinearLayout(this.FH);
                        r2.setGravity(17);
                        r3 = new com.aide.uidesigner.Ma(this, this.FH, r2);
                        r3.setEnabled(this.J8);
                        this.v5.addView(r3, -1, -1);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    r4 = r2;
                    $pc14 = 13; continue $sw14;
                }
                case 13: {
                    try {
                        e = this.we;
                        this.gn.clear();
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    if (e == null) { $pc14 = 36; continue $sw14; }
                    $pc14 = 18; continue $sw14;
                }
                case 18: {
                    if (e == null) { $pc14 = 27; continue $sw14; }
                    try {
                        r5 = new android.widget.TextView(this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    if (e.getMessage().contains("no element") == true) { $pc14 = 22; continue $sw14; }
                    try {
                        r5.setText("Can not view the layout. " + e.getMessage());
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    $pc14 = 26; continue $sw14;
                }
                case 26: {
                    try {
                        r6 = (int) (this.FH.getResources().getDisplayMetrics().density * 10.0f);
                        r5.setPadding(r6, r6, r6, r6);
                        r5.setTextSize(20.0f);
                        r4.removeAllViews();
                        r4.addView(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    { $pc14 = 27; continue $sw14; }
                }
                case 22: {
                    if (this.J8 == false) { $pc14 = 24; continue $sw14; }
                    try {
                        r5.setText("No views have been added. Tap to add views.");
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    { $pc14 = 26; continue $sw14; }
                }
                case 24: {
                    try {
                        r5.setText("No views have been added.");
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    $pc14 = 27; continue $sw14;
                }
                case 27: {
                    try {
                        J0();
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    return;
                }
                case 36: {
                    try {
                        j6(this.EQ.getChildNodes(), r4, null, 0);
                        this.v5.invalidate();
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        if ($t instanceof java.lang.Exception) { $pc14 = 17; continue $sw14; }
                        $pc14 = 29; continue $sw14;
                    }
                    $pc14 = 9; continue $sw14;
                }
                case 17: {
                    e = e;
                    { $pc14 = 18; continue $sw14; }
                }
                case 9: {
                    if (this.J8 == true) { $pc14 = 12; continue $sw14; }
                    try {
                        r4 = this.v5;
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    { $pc14 = 13; continue $sw14; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1254800953325762755L)
    private java.lang.Integer gn(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
        java.lang.String r10 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 3;
        $sw15: while (true) {
            switch ($pc15) {
                case 11: {
                    th = $ex15;
                    if (DW == false) { $pc15 = 15; continue $sw15; }
                    abcd.wu.j6(th, 391885825669823899L, this, r8, r9);
                    $pc15 = 15; continue $sw15;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc15 = 5; continue $sw15; }
                    try {
                        abcd.wu.j6(391885825669823899L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 11; continue $sw15;
                    }
                    $pc15 = 5; continue $sw15;
                }
                case 5: {
                    try {
                        r10 = we(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 11; continue $sw15;
                    }
                    if (r10 != null) { $pc15 = 17; continue $sw15; }
                    return null;
                }
                case 17: {
                    return java.lang.Integer.valueOf(java.lang.Integer.parseInt(r10));
                }
                case 21: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2791533984229173216L)
    private void j3() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 4;
        $sw16: while (true) {
            switch ($pc16) {
                case 8: {
                    th = $ex16;
                    if (DW == false) { $pc16 = 12; continue $sw16; }
                    abcd.wu.j6(th, 3631003574466291488L, this);
                    $pc16 = 12; continue $sw16;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc16 = 6; continue $sw16; }
                    try {
                        abcd.wu.j6(3631003574466291488L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 8; continue $sw16;
                    }
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    try {
                        this.tp = new com.aide.uidesigner.ClassF().j6(this.EQ);
                        this.J0.DW(u7(), this.tp, 0);
                        XL();
                        j6(true);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 8; continue $sw16;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -3932944335989979149L)
    private android.view.View j6(org.w3c.dom.Node r13, java.lang.String r14) {
        java.lang.String r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = 4;
        $sw17: while (true) {
            switch ($pc17) {
                case 29: {
                    th = $ex17;
                    if (DW == false) { $pc17 = 33; continue $sw17; }
                    abcd.wu.j6(th, -2848339193617889109L, this, r13, r14);
                    $pc17 = 33; continue $sw17;
                }
                case 33: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc17 = 7; continue $sw17; }
                    try {
                        abcd.wu.j6(-2848339193617889109L, this, r13, r14);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 29; continue $sw17;
                    }
                    $pc17 = 7; continue $sw17;
                }
                case 7: {
                    if (r14.contains(".") == false) { $pc17 = 10; continue $sw17; }
                    return null;
                }
                case 10: {
                    if ("View".equals(r14) == true) { $pc17 = 12; continue $sw17; }
                    try {
                        r1 = this.u7.FH(DW((org.w3c.dom.Element) r13));
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 29; continue $sw17;
                    }
                    if (r1 != null) { $pc17 = 17; continue $sw17; }
                    $pc17 = 21; continue $sw17;
                }
                case 21: {
                    if (r1 != null) { $pc17 = 23; continue $sw17; }
                    $pc17 = 37; continue $sw17;
                }
                case 37: {
                    return (android.view.View) java.lang.Class.forName("android.widget." + r14).getConstructor(new java.lang.Class[]{android.content.Context.class}).newInstance(new java.lang.Object[]{this.FH});
                }
                case 28: {
                    return null;
                }
                case 23: {
                    if (r1.startsWith("?android:attr/") == false) { $pc17 = 37; continue $sw17; }
                    return (android.view.View) java.lang.Class.forName("android.widget." + r14).getConstructor(new java.lang.Class[]{android.content.Context.class, android.util.AttributeSet.class, java.lang.Integer.TYPE}).newInstance(new java.lang.Object[]{this.FH, null, java.lang.Integer.valueOf(((java.lang.Integer) android.R.attr.class.getField(r1.substring(14)).get(null)).intValue())});
                }
                case 17: {
                    if (r1.startsWith("@android:style/") == false) { $pc17 = 21; continue $sw17; }
                    return (android.view.View) java.lang.Class.forName("android.widget." + r14).getConstructor(new java.lang.Class[]{android.content.Context.class, android.util.AttributeSet.class, java.lang.Integer.TYPE}).newInstance(new java.lang.Object[]{this.FH, null, java.lang.Integer.valueOf(((java.lang.Integer) com.aide.ui.Ma.class.getField("Android_" + r1.substring(15).replace(".", "_")).get(null)).intValue())});
                }
                case 12: {
                    return new android.view.View(this.FH);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -387843958894595511L)
    private com.aide.uidesigner.ClassC j6(org.w3c.dom.Node r10, android.view.ViewGroup r11) {
        java.lang.Class<?> r1 = null;
        android.view.ViewGroup.LayoutParams r5 = null;
        com.aide.uidesigner.ClassC r2 = null;
        java.lang.String r6 = null;
        android.content.res.TypedArray r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = 3;
        $sw18: while (true) {
            switch ($pc18) {
                case 26: {
                    th = $ex18;
                    if (DW == false) { $pc18 = 30; continue $sw18; }
                    abcd.wu.j6(th, 2051465859622571161L, this, r10, r11);
                    $pc18 = 30; continue $sw18;
                }
                case 30: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc18 = 37; continue $sw18; }
                    try {
                        abcd.wu.j6(2051465859622571161L, this, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 26; continue $sw18;
                    }
                    $pc18 = 37; continue $sw18;
                }
                case 37: {
                    try {
                        r1 = java.lang.Class.forName(r11.getClass().getName() + "$LayoutParams");
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 24; continue $sw18;
                    }
                    try {
                        r5 = (android.view.ViewGroup.LayoutParams) r1.getConstructor(new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE}).newInstance(new java.lang.Object[]{-2, -2});
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        if ($t instanceof java.lang.NoSuchMethodException) { $pc18 = 10; continue $sw18; }
                        $pc18 = 24; continue $sw18;
                    }
                    $pc18 = 11; continue $sw18;
                }
                case 11: {
                    try {
                        r2 = new com.aide.uidesigner.ClassC(r5);
                        r6 = this.u7.FH(DW((org.w3c.dom.Element) r10));
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 24; continue $sw18;
                    }
                    if (r6 != null) { $pc18 = 14; continue $sw18; }
                    $pc18 = 22; continue $sw18;
                }
                case 22: {
                    try {
                        j6(r2, r10, com.aide.uidesigner.N.VH);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 24; continue $sw18;
                    }
                    return r2;
                    { $pc18 = 25; continue $sw18; }
                }
                case 14: {
                    if (r6.startsWith("?android:attr/") == false) { $pc18 = 22; continue $sw18; }
                    try {
                        r3 = this.FH.getTheme().obtainStyledAttributes(((java.lang.Integer) android.R.attr.class.getField(r6.substring(14)).get(null)).intValue(), new int[]{16842996, 16842997});
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 31; continue $sw18;
                    }
                    if (r3.hasValue(0) == false) { $pc18 = 19; continue $sw18; }
                    try {
                        r5.width = r3.getLayoutDimension(0, "layout_width");
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 31; continue $sw18;
                    }
                    $pc18 = 19; continue $sw18;
                }
                case 19: {
                    if (r3.hasValue(1) == false) { $pc18 = 21; continue $sw18; }
                    try {
                        r5.height = r3.getLayoutDimension(1, "layout_height");
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 31; continue $sw18;
                    }
                    $pc18 = 21; continue $sw18;
                }
                case 21: {
                    try {
                        r3.recycle();
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 31; continue $sw18;
                    }
                    { $pc18 = 22; continue $sw18; }
                }
                case 10: {
                    try {
                        r5 = (android.view.ViewGroup.LayoutParams) r1.getConstructor(new java.lang.Class[]{android.view.ViewGroup.LayoutParams.class}).newInstance(new java.lang.Object[]{new android.view.ViewGroup.LayoutParams(-1, -1)});
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 24; continue $sw18;
                    }
                    $pc18 = 25; continue $sw18;
                }
                case 25: {
                    return new com.aide.uidesigner.ClassC(new android.view.ViewGroup.LayoutParams(-2, -2));
                }
                case 24: {
                    throw new java.lang.IllegalStateException();
                }
                case 31: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1452673214983620672L)
    private java.lang.Boolean j6(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
        java.lang.String r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = 3;
        $sw19: while (true) {
            switch ($pc19) {
                case 11: {
                    th = $ex19;
                    if (DW == false) { $pc19 = 15; continue $sw19; }
                    abcd.wu.j6(th, 2945072507110409360L, this, r8, r9);
                    $pc19 = 15; continue $sw19;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc19 = 5; continue $sw19; }
                    try {
                        abcd.wu.j6(2945072507110409360L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 11; continue $sw19;
                    }
                    $pc19 = 5; continue $sw19;
                }
                case 5: {
                    try {
                        r0 = we(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 11; continue $sw19;
                    }
                    if (r0 != null) { $pc19 = 9; continue $sw19; }
                    return null;
                }
                case 9: {
                    return java.lang.Boolean.valueOf("true".equals(r0));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1839238766686407257L)
    private java.lang.Integer j6(java.lang.String r9, com.aide.uidesigner.N.a r10) {
        java.lang.String r11 = null;
        java.lang.reflect.Field[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        java.lang.reflect.Field r4 = null;
        java.lang.String r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = 3;
        $sw20: while (true) {
            switch ($pc20) {
                case 22: {
                    th = $ex20;
                    if (DW == false) { $pc20 = 27; continue $sw20; }
                    abcd.wu.j6(th, 2994647320866866795L, this, r9, r10);
                    $pc20 = 27; continue $sw20;
                }
                case 27: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc20 = 32; continue $sw20; }
                    try {
                        abcd.wu.j6(2994647320866866795L, this, r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 22; continue $sw20;
                    }
                    $pc20 = 32; continue $sw20;
                }
                case 32: {
                    if (r10.tp != null) { $pc20 = 10; continue $sw20; }
                    try {
                        r11 = r9.toUpperCase();
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 29; continue $sw20;
                    }
                    return java.lang.Integer.valueOf(((java.lang.Integer) r10.gn.getField(r11).get(null)).intValue());
                }
                case 10: {
                    try {
                        r1 = r10.gn.getFields();
                        r2 = r1.length;
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 29; continue $sw20;
                    }
                    r3 = 0;
                    $pc20 = 11; continue $sw20;
                }
                case 11: {
                    if (r3 >= r2) { $pc20 = 21; continue $sw20; }
                    try {
                        r4 = r1[r3];
                        r5 = r4.getName();
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 29; continue $sw20;
                    }
                    if ((r4.getModifiers() & 8) == 0) { $pc20 = 20; continue $sw20; }
                    if (r5.startsWith(r10.tp) == false) { $pc20 = 20; continue $sw20; }
                    if (r5.substring(r10.tp.length()).replace("_", "").toUpperCase().equals(r9.toUpperCase()) == false) { $pc20 = 20; continue $sw20; }
                    return java.lang.Integer.valueOf(((java.lang.Integer) r4.get(null)).intValue());
                }
                case 20: {
                    r3 = r3 + 1;
                    $pc20 = 21; continue $sw20;
                }
                case 21: {
                    return null;
                }
                case 29: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2358632434665019344L)
    private void j6(android.view.View r8, boolean r9) {
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = 3;
        $sw21: while (true) {
            switch ($pc21) {
                case 24: {
                    th = $ex21;
                    if (DW == false) { $pc21 = 28; continue $sw21; }
                    abcd.wu.j6(th, 3670480801501579884L, this, r8, new java.lang.Boolean(r9));
                    $pc21 = 28; continue $sw21;
                }
                case 28: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc21 = 5; continue $sw21; }
                    try {
                        abcd.wu.j6(3670480801501579884L, this, r8, new java.lang.Boolean(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 24; continue $sw21;
                    }
                    $pc21 = 5; continue $sw21;
                }
                case 5: {
                    if (r9 == false) { $pc21 = 15; continue $sw21; }
                    try {
                        r0 = (int) (this.FH.getResources().getDisplayMetrics().density * 20.0f);
                        r8.setMinimumHeight(r0);
                        r8.setMinimumWidth(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 24; continue $sw21;
                    }
                    if ((r8 instanceof android.view.ViewGroup) == false) { $pc21 = 9; continue $sw21; }
                    try {
                        ((android.view.ViewGroup) r8).setClipChildren(false);
                        ((android.view.ViewGroup) r8).setClipToPadding(false);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 24; continue $sw21;
                    }
                    $pc21 = 9; continue $sw21;
                }
                case 9: {
                    try {
                        r8.setFocusable(false);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 24; continue $sw21;
                    }
                    if (r8.getClass() != android.widget.TextView.class) { $pc21 = 12; continue $sw21; }
                    $pc21 = 13; continue $sw21;
                }
                case 13: {
                    try {
                        ((android.widget.TextView) r8).setText(r8.getClass().getSimpleName());
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 24; continue $sw21;
                    }
                    { $pc21 = 15; continue $sw21; }
                }
                case 12: {
                    if (r8.getClass() == android.widget.Button.class) { $pc21 = 13; continue $sw21; }
                    $pc21 = 15; continue $sw21;
                }
                case 15: {
                    if (r8.getClass() != android.widget.ListView.class) { $pc21 = 18; continue $sw21; }
                    try {
                        j6((android.widget.ListView) r8);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 24; continue $sw21;
                    }
                    $pc21 = 18; continue $sw21;
                }
                case 18: {
                    if (r8.getClass() != android.widget.Spinner.class) { $pc21 = 21; continue $sw21; }
                    try {
                        j6((android.widget.Spinner) r8);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 24; continue $sw21;
                    }
                    $pc21 = 21; continue $sw21;
                }
                case 21: {
                    if (r8.getClass() != android.widget.ExpandableListView.class) { $pc21 = 31; continue $sw21; }
                    try {
                        j6((android.widget.ExpandableListView) r8);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 24; continue $sw21;
                    }
                    return;
                }
                case 31: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 4427299770065563L)
    private void j6(android.widget.ExpandableListView r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = 4;
        $sw22: while (true) {
            switch ($pc22) {
                case 8: {
                    th = $ex22;
                    if (DW == false) { $pc22 = 12; continue $sw22; }
                    abcd.wu.j6(th, -738407496630855689L, this, r5);
                    $pc22 = 12; continue $sw22;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc22 = 6; continue $sw22; }
                    try {
                        abcd.wu.j6(-738407496630855689L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 8; continue $sw22;
                    }
                    $pc22 = 6; continue $sw22;
                }
                case 6: {
                    try {
                        r5.setAdapter(new com.aide.uidesigner.Na(this));
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 8; continue $sw22;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -716114892006096896L)
    private void j6(android.widget.ListView r7) {
        java.util.ArrayList r2 = null;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = 4;
        $sw23: while (true) {
            switch ($pc23) {
                case 12: {
                    th = $ex23;
                    if (DW == false) { $pc23 = 17; continue $sw23; }
                    abcd.wu.j6(th, 1188289423867056316L, this, r7);
                    $pc23 = 17; continue $sw23;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc23 = 6; continue $sw23; }
                    try {
                        abcd.wu.j6(1188289423867056316L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 12; continue $sw23;
                    }
                    $pc23 = 6; continue $sw23;
                }
                case 6: {
                    try {
                        r2 = new java.util.ArrayList();
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 12; continue $sw23;
                    }
                    r3 = 0;
                    $pc23 = 8; continue $sw23;
                }
                case 8: {
                    if (r3 >= 30) { $pc23 = 10; continue $sw23; }
                    try {
                        r2.add("Item " + r3);
                        r3 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 12; continue $sw23;
                    }
                    { $pc23 = 8; continue $sw23; }
                }
                case 10: {
                    try {
                        r7.setAdapter(new android.widget.ArrayAdapter(this.FH, 17367043, r2));
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 12; continue $sw23;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1190108588720790984L)
    private void j6(android.widget.Spinner r7) {
        java.util.ArrayList r2 = null;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = 4;
        $sw24: while (true) {
            switch ($pc24) {
                case 12: {
                    th = $ex24;
                    if (DW == false) { $pc24 = 17; continue $sw24; }
                    abcd.wu.j6(th, 1205977724896905528L, this, r7);
                    $pc24 = 17; continue $sw24;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc24 = 6; continue $sw24; }
                    try {
                        abcd.wu.j6(1205977724896905528L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 12; continue $sw24;
                    }
                    $pc24 = 6; continue $sw24;
                }
                case 6: {
                    try {
                        r2 = new java.util.ArrayList();
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 12; continue $sw24;
                    }
                    r3 = 0;
                    $pc24 = 8; continue $sw24;
                }
                case 8: {
                    if (r3 >= 30) { $pc24 = 10; continue $sw24; }
                    try {
                        r2.add("Item " + r3);
                        r3 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 12; continue $sw24;
                    }
                    { $pc24 = 8; continue $sw24; }
                }
                case 10: {
                    try {
                        r7.setAdapter(new android.widget.ArrayAdapter(this.FH, 17367043, r2));
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 12; continue $sw24;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1474581584557770820L)
    private void j6(com.aide.uidesigner.ClassC r9, org.w3c.dom.Node r10, com.aide.uidesigner.N.a[] r11) {
        int r0 = 0;
        int r1 = 0;
        com.aide.uidesigner.N.a r2 = null;
        java.lang.Object r3 = null;
        int r4 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = 3;
        $sw25: while (true) {
            switch ($pc25) {
                case 25: {
                    th = $ex25;
                    if (DW == false) { $pc25 = 30; continue $sw25; }
                    abcd.wu.j6(th, -4197485706801327584L, this, r9, r10, r11);
                    $pc25 = 30; continue $sw25;
                }
                case 30: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc25 = 5; continue $sw25; }
                    try {
                        abcd.wu.j6(-4197485706801327584L, this, r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 25; continue $sw25;
                    }
                    $pc25 = 5; continue $sw25;
                }
                case 5: {
                    try {
                        r0 = r11.length;
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 25; continue $sw25;
                    }
                    r1 = 0;
                    $pc25 = 6; continue $sw25;
                }
                case 6: {
                    if (r1 >= r0) { $pc25 = 24; continue $sw25; }
                    try {
                        r2 = r11[r1];
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 25; continue $sw25;
                    }
                    if (r9.j6(r2) == false) { $pc25 = 23; continue $sw25; }
                    try {
                        r3 = tp(r10, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 25; continue $sw25;
                    }
                    if (this.J8 == true) { $pc25 = 12; continue $sw25; }
                    $pc25 = 22; continue $sw25;
                }
                case 22: {
                    try {
                        r9.j6(r2, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 25; continue $sw25;
                    }
                    { $pc25 = 23; continue $sw25; }
                }
                case 12: {
                    if ((r3 instanceof java.lang.Integer) == false) { $pc25 = 22; continue $sw25; }
                    if (r2 == com.aide.uidesigner.N.v5) { $pc25 = 18; continue $sw25; }
                    if (r2 != com.aide.uidesigner.N.Zo) { $pc25 = 22; continue $sw25; }
                    $pc25 = 18; continue $sw25;
                }
                case 18: {
                    if (((java.lang.Integer) r3).intValue() < 0) { $pc25 = 22; continue $sw25; }
                    try {
                        r4 = (int) (this.FH.getResources().getDisplayMetrics().density * 10.0f);
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 25; continue $sw25;
                    }
                    if (((java.lang.Integer) r3).intValue() >= r4) { $pc25 = 22; continue $sw25; }
                    try {
                        r3 = java.lang.Integer.valueOf(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 25; continue $sw25;
                    }
                    $pc25 = 23; continue $sw25;
                }
                case 23: {
                    r1 = r1 + 1;
                    { $pc25 = 6; continue $sw25; }
                }
                case 24: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -3327151286448363088L)
    private void j6(org.w3c.dom.Node r9, java.lang.String r10, java.lang.String r11) {
        int r1 = 0;
        org.w3c.dom.NamedNodeMap r0 = null;
        int r2 = 0;
        org.w3c.dom.Attr r3 = null;
        org.w3c.dom.NodeList r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = 3;
        $sw26: while (true) {
            switch ($pc26) {
                case 21: {
                    th = $ex26;
                    if (DW == false) { $pc26 = 26; continue $sw26; }
                    abcd.wu.j6(th, 4096194408716705592L, this, r9, r10, r11);
                    $pc26 = 26; continue $sw26;
                }
                case 26: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc26 = 5; continue $sw26; }
                    try {
                        abcd.wu.j6(4096194408716705592L, this, r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 21; continue $sw26;
                    }
                    $pc26 = 5; continue $sw26;
                }
                case 5: {
                    r1 = 0;
                    if ((r9 instanceof org.w3c.dom.Element) == false) { $pc26 = 14; continue $sw26; }
                    try {
                        r0 = ((org.w3c.dom.Element) r9).getAttributes();
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 21; continue $sw26;
                    }
                    r2 = 0;
                    $pc26 = 9; continue $sw26;
                }
                case 9: {
                    if (r2 >= r0.getLength()) { $pc26 = 14; continue $sw26; }
                    try {
                        r3 = (org.w3c.dom.Attr) r0.item(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 21; continue $sw26;
                    }
                    if (r10.equals(r3.getValue()) == false) { $pc26 = 13; continue $sw26; }
                    try {
                        r3.setValue(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 21; continue $sw26;
                    }
                    $pc26 = 13; continue $sw26;
                }
                case 13: {
                    try {
                        r2 = r2 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 21; continue $sw26;
                    }
                    $pc26 = 14; continue $sw26;
                }
                case 14: {
                    try {
                        r4 = r9.getChildNodes();
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 21; continue $sw26;
                    }
                    if (r4 == null) { $pc26 = 20; continue $sw26; }
                    $pc26 = 16; continue $sw26;
                }
                case 16: {
                    if (r1 >= r4.getLength()) { $pc26 = 34; continue $sw26; }
                    try {
                        j6(r4.item(r1), r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 21; continue $sw26;
                    }
                    r1 = r1 + 1;
                    { $pc26 = 16; continue $sw26; }
                }
                case 34: {
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 195872120940643432L)
    private void j6(org.w3c.dom.NodeList r8) {
        int r2 = 0;
        org.w3c.dom.Node r3 = null;
        java.lang.String r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex27 = null;
        int $pc27 = 4;
        $sw27: while (true) {
            switch ($pc27) {
                case 19: {
                    th = $ex27;
                    if (DW == false) { $pc27 = 24; continue $sw27; }
                    abcd.wu.j6(th, -1982429001582559960L, this, r8);
                    $pc27 = 24; continue $sw27;
                }
                case 24: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc27 = 6; continue $sw27; }
                    try {
                        abcd.wu.j6(-1982429001582559960L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 19; continue $sw27;
                    }
                    $pc27 = 6; continue $sw27;
                }
                case 6: {
                    r2 = 0;
                    $pc27 = 7; continue $sw27;
                }
                case 7: {
                    if (r2 >= r8.getLength()) { $pc27 = 18; continue $sw27; }
                    try {
                        r3 = r8.item(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 19; continue $sw27;
                    }
                    if (r3.getNodeType() != 1) { $pc27 = 17; continue $sw27; }
                    try {
                        r4 = j6(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 19; continue $sw27;
                    }
                    if (r4 != null) { $pc27 = 14; continue $sw27; }
                    $pc27 = 16; continue $sw27;
                }
                case 16: {
                    try {
                        j6(r3.getChildNodes());
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 19; continue $sw27;
                    }
                    { $pc27 = 17; continue $sw27; }
                }
                case 14: {
                    if (this.VH.containsKey(r4) == true) { $pc27 = 16; continue $sw27; }
                    try {
                        this.Zo.put(r4, r3);
                        this.VH.put(r4, java.lang.Integer.valueOf(this.VH.size() + 100));
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 19; continue $sw27;
                    }
                    $pc27 = 17; continue $sw27;
                }
                case 17: {
                    r2 = r2 + 1;
                    { $pc27 = 7; continue $sw27; }
                }
                case 18: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -184321579041474925L)
    private void j6(org.w3c.dom.NodeList r20, android.view.ViewGroup r21, com.aide.uidesigner.ClassS r22, int r23) {
        int r13 = 0;
        org.w3c.dom.Node r15 = null;
        java.lang.String r1 = null;
        android.view.View r3 = null;
        com.aide.uidesigner.ClassC r2 = null;
        android.view.View r4 = null;
        com.aide.uidesigner.ClassC r5 = null;
        android.view.View r9 = null;
        com.aide.uidesigner.ClassC r8 = null;
        boolean r16 = false;
        android.content.Context r6 = null;
        android.view.ViewGroup r17 = null;
        android.view.View r7 = null;
        com.aide.uidesigner.ClassS r10 = null;
        android.view.View r11 = null;
        java.lang.String r12 = null;
        android.widget.TextView r14 = null;
        int r18 = 0;
        int r19 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex28 = null;
        int $pc28 = 4;
        $sw28: while (true) {
            switch ($pc28) {
                case 50: {
                    th = $ex28;
                    if (DW == false) { $pc28 = 55; continue $sw28; }
                    abcd.wu.j6(th, -92645014005321581L, this, r20, r21, r22, new java.lang.Integer(r23));
                    $pc28 = 55; continue $sw28;
                }
                case 55: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc28 = 6; continue $sw28; }
                    try {
                        abcd.wu.j6(-92645014005321581L, this, r20, r21, r22, new java.lang.Integer(r23));
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 50; continue $sw28;
                    }
                    $pc28 = 6; continue $sw28;
                }
                case 6: {
                    r13 = 0;
                    $pc28 = 7; continue $sw28;
                }
                case 7: {
                    if (r13 >= r20.getLength()) { $pc28 = 49; continue $sw28; }
                    try {
                        r15 = r20.item(r13);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 50; continue $sw28;
                    }
                    if (r15.getNodeType() != 1) { $pc28 = 48; continue $sw28; }
                    try {
                        r1 = r15.getNodeName();
                        r3 = j6(r15, r1);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 50; continue $sw28;
                    }
                    if (r3 == null) { $pc28 = 15; continue $sw28; }
                    try {
                        j6(r3, this.J8);
                        r2 = new com.aide.uidesigner.ClassC(r3);
                        j6(r2, r15, com.aide.uidesigner.N.gn);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 50; continue $sw28;
                    }
                    r4 = r3;
                    $pc28 = 14; continue $sw28;
                }
                case 14: {
                    r5 = r2;
                    r9 = r4;
                    try {
                        r8 = j6(r15, r21);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 50; continue $sw28;
                    }
                    if (this.J8 == true) { $pc28 = 22; continue $sw28; }
                    $pc28 = 28; continue $sw28;
                }
                case 28: {
                    r16 = false;
                    $pc28 = 29; continue $sw28;
                }
                case 29: {
                    try {
                        r6 = this.FH;
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 50; continue $sw28;
                    }
                    r17 = null;
                    if (r16 == false) { $pc28 = 32; continue $sw28; }
                    r7 = r9;
                    $pc28 = 33; continue $sw28;
                }
                case 33: {
                    try {
                        r10 = new com.aide.uidesigner.ClassS(r6, r7, (org.w3c.dom.Element) r15, r5, r8, r22, r23, this);
                        this.gn.add(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 50; continue $sw28;
                    }
                    if (r16 == false) { $pc28 = 36; continue $sw28; }
                    r11 = r10;
                    $pc28 = 37; continue $sw28;
                }
                case 37: {
                    try {
                        r12 = j6(r15);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 50; continue $sw28;
                    }
                    if (r12 == null) { $pc28 = 40; continue $sw28; }
                    try {
                        r11.setId(this.VH.get(r12).intValue());
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 50; continue $sw28;
                    }
                    $pc28 = 40; continue $sw28;
                }
                case 40: {
                    if (r21 == null) { $pc28 = 43; continue $sw28; }
                    try {
                        r21.addView(r11, (android.view.ViewGroup.LayoutParams) r8.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 50; continue $sw28;
                    }
                    $pc28 = 43; continue $sw28;
                }
                case 43: {
                    if ((r9 instanceof android.view.ViewGroup) == false) { $pc28 = 45; continue $sw28; }
                    try {
                        r17 = (android.view.ViewGroup) r9;
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 50; continue $sw28;
                    }
                    $pc28 = 45; continue $sw28;
                }
                case 45: {
                    try {
                        j6(r15.getChildNodes(), r17, r10, r23 + 1);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 50; continue $sw28;
                    }
                    { $pc28 = 48; continue $sw28; }
                }
                case 36: {
                    r11 = r9;
                    { $pc28 = 37; continue $sw28; }
                }
                case 32: {
                    r7 = null;
                    { $pc28 = 33; continue $sw28; }
                }
                case 22: {
                    if ((r9 instanceof android.widget.TableRow) == true) { $pc28 = 28; continue $sw28; }
                    if (this.QX != null) { $pc28 = 26; continue $sw28; }
                    $pc28 = 27; continue $sw28;
                }
                case 27: {
                    r16 = true;
                    { $pc28 = 29; continue $sw28; }
                }
                case 26: {
                    if (this.XL.contains(r15) == false) { $pc28 = 28; continue $sw28; }
                    $pc28 = 15; continue $sw28;
                }
                case 15: {
                    try {
                        r14 = new android.widget.TextView(this.FH);
                        r14.setText(r1);
                        r18 = (int) (this.FH.getResources().getDisplayMetrics().density * 5.0f);
                        r14.setPadding(r18, r18, r18, r18);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 50; continue $sw28;
                    }
                    if (this.J8 == false) { $pc28 = 18; continue $sw28; }
                    try {
                        r19 = (int) (this.FH.getResources().getDisplayMetrics().density * 20.0f);
                        r14.setMinimumHeight(r19);
                        r14.setMinimumWidth(r19);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 50; continue $sw28;
                    }
                    $pc28 = 18; continue $sw28;
                }
                case 18: {
                    try {
                        r2 = new com.aide.uidesigner.ClassC(new android.view.View(this.FH));
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 50; continue $sw28;
                    }
                    r4 = r14;
                    $pc28 = 48; continue $sw28;
                }
                case 48: {
                    r13 = r13 + 1;
                    { $pc28 = 7; continue $sw28; }
                }
                case 49: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(com.aide.uidesigner.Pa r0) {
        return r0.J8;
    }

    @abcd.Interfacesu(method = 5725625997021570563L)
    private java.lang.Object tp(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
        java.lang.Object r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex29 = null;
        int $pc29 = 3;
        $sw29: while (true) {
            switch ($pc29) {
                case 10: {
                    th = $ex29;
                    if (DW == false) { $pc29 = 14; continue $sw29; }
                    abcd.wu.j6(th, -4411770270521347633L, this, r8, r9);
                    $pc29 = 14; continue $sw29;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc29 = 5; continue $sw29; }
                    try {
                        abcd.wu.j6(-4411770270521347633L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 10; continue $sw29;
                    }
                    $pc29 = 5; continue $sw29;
                }
                case 5: {
                    try {
                        r0 = Ws(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 10; continue $sw29;
                    }
                    if (r0 == null) { $pc29 = 8; continue $sw29; }
                    return r0;
                }
                case 8: {
                    return FH(r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -2239219906033097855L)
    private java.lang.Integer u7(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
        java.lang.String r0 = null;
        java.lang.String[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Integer r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex30 = null;
        int $pc30 = 3;
        $sw30: while (true) {
            switch ($pc30) {
                case 17: {
                    th = $ex30;
                    if (DW == false) { $pc30 = 22; continue $sw30; }
                    abcd.wu.j6(th, -707427268262966531L, this, r8, r9);
                    $pc30 = 22; continue $sw30;
                }
                case 22: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc30 = 5; continue $sw30; }
                    try {
                        abcd.wu.j6(-707427268262966531L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 17; continue $sw30;
                    }
                    $pc30 = 5; continue $sw30;
                }
                case 5: {
                    try {
                        r0 = we(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 17; continue $sw30;
                    }
                    if (r0 == null) { $pc30 = 15; continue $sw30; }
                    try {
                        r1 = r0.split("\\|");
                        r2 = r1.length;
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 17; continue $sw30;
                    }
                    r3 = 0;
                    r4 = 0;
                    $pc30 = 8; continue $sw30;
                }
                case 8: {
                    if (r3 >= r2) { $pc30 = 13; continue $sw30; }
                    try {
                        r5 = j6(r1[r3], r9);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 17; continue $sw30;
                    }
                    if (r5 == null) { $pc30 = 12; continue $sw30; }
                    try {
                        r4 = r4 | r5.intValue();
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 17; continue $sw30;
                    }
                    $pc30 = 12; continue $sw30;
                }
                case 12: {
                    try {
                        r3 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 17; continue $sw30;
                    }
                    { $pc30 = 8; continue $sw30; }
                }
                case 13: {
                    return java.lang.Integer.valueOf(r4);
                }
                case 15: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1331537694209488239L)
    private java.lang.Enum<?> v5(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
        java.lang.String r10 = null;
        java.lang.reflect.Field[] r11 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.reflect.Field r3 = null;
        java.lang.String r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex31 = null;
        int $pc31 = 3;
        $sw31: while (true) {
            switch ($pc31) {
                case 18: {
                    th = $ex31;
                    if (DW == false) { $pc31 = 23; continue $sw31; }
                    abcd.wu.j6(th, -3308306533277547471L, this, r8, r9);
                    $pc31 = 23; continue $sw31;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc31 = 26; continue $sw31; }
                    try {
                        abcd.wu.j6(-3308306533277547471L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 18; continue $sw31;
                    }
                    $pc31 = 26; continue $sw31;
                }
                case 26: {
                    try {
                        r10 = we(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 25; continue $sw31;
                    }
                    if (r10 == null) { $pc31 = 17; continue $sw31; }
                    try {
                        r11 = r9.gn.getFields();
                        r1 = r11.length;
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 25; continue $sw31;
                    }
                    r2 = 0;
                    $pc31 = 9; continue $sw31;
                }
                case 9: {
                    if (r2 >= r1) { $pc31 = 17; continue $sw31; }
                    try {
                        r3 = r11[r2];
                        r4 = r3.getName();
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 25; continue $sw31;
                    }
                    if ((r3.getModifiers() & 8) == 0) { $pc31 = 16; continue $sw31; }
                    if (r4.replace("_", "").equals(r10.toUpperCase()) == false) { $pc31 = 16; continue $sw31; }
                    return (java.lang.Enum) r3.get(null);
                }
                case 16: {
                    r2 = r2 + 1;
                    $pc31 = 17; continue $sw31;
                }
                case 17: {
                    return null;
                }
                case 25: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 4052035051477996023L)
    private java.lang.String we(org.w3c.dom.Node r8, com.aide.uidesigner.N.a r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex32 = null;
        int $pc32 = 3;
        $sw32: while (true) {
            switch ($pc32) {
                case 7: {
                    th = $ex32;
                    if (DW == false) { $pc32 = 11; continue $sw32; }
                    abcd.wu.j6(th, 2322103365689831583L, this, r8, r9);
                    $pc32 = 11; continue $sw32;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc32 = 5; continue $sw32; }
                    try {
                        abcd.wu.j6(2322103365689831583L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 7; continue $sw32;
                    }
                    $pc32 = 5; continue $sw32;
                }
                case 5: {
                    return this.u7.j6(EQ(r8, r9).Hw);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String DW(org.w3c.dom.Element r5) {
        org.w3c.dom.Node r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex33 = null;
        int $pc33 = 4;
        $sw33: while (true) {
            switch ($pc33) {
                case 12: {
                    th = $ex33;
                    if (DW == false) { $pc33 = 16; continue $sw33; }
                    abcd.wu.j6(th, 1095777448690094949L, this, r5);
                    $pc33 = 16; continue $sw33;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc33 = 6; continue $sw33; }
                    try {
                        abcd.wu.j6(1095777448690094949L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex33 = $t;
                        $pc33 = 12; continue $sw33;
                    }
                    $pc33 = 6; continue $sw33;
                }
                case 6: {
                    try {
                        r2 = r5.getAttributes().getNamedItem("style");
                    } catch (java.lang.Throwable $t) {
                        $ex33 = $t;
                        $pc33 = 12; continue $sw33;
                    }
                    if ((r2 instanceof org.w3c.dom.Attr) == false) { $pc33 = 10; continue $sw33; }
                    return ((org.w3c.dom.Attr) r2).getValue();
                }
                case 10: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex34 = null;
        int $pc34 = 4;
        $sw34: while (true) {
            switch ($pc34) {
                case 7: {
                    th = $ex34;
                    if (DW == false) { $pc34 = 11; continue $sw34; }
                    abcd.wu.j6(th, -7806208215390026680L, this);
                    $pc34 = 11; continue $sw34;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc34 = 14; continue $sw34; }
                    try {
                        abcd.wu.j6(-7806208215390026680L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 7; continue $sw34;
                    }
                    return;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(com.aide.uidesigner.ClassS r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex35 = null;
        int $pc35 = 4;
        $sw35: while (true) {
            switch ($pc35) {
                case 11: {
                    th = $ex35;
                    if (DW == false) { $pc35 = 15; continue $sw35; }
                    abcd.wu.j6(th, 345722756436195840L, this, r5);
                    $pc35 = 15; continue $sw35;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc35 = 7; continue $sw35; }
                    try {
                        abcd.wu.j6(345722756436195840L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex35 = $t;
                        $pc35 = 11; continue $sw35;
                    }
                    $pc35 = 7; continue $sw35;
                }
                case 7: {
                    if (this.QX == null) { $pc35 = 9; continue $sw35; }
                    try {
                        this.QX.j6(r5);
                        this.QX = null;
                        aM();
                    } catch (java.lang.Throwable $t) {
                        $ex35 = $t;
                        $pc35 = 11; continue $sw35;
                    }
                    return;
                }
                case 9: {
                    try {
                        j6(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex35 = $t;
                        $pc35 = 11; continue $sw35;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(org.w3c.dom.Element r8, com.aide.uidesigner.ClassB r9) {
        org.w3c.dom.Element r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex36 = null;
        int $pc36 = 3;
        $sw36: while (true) {
            switch ($pc36) {
                case 11: {
                    th = $ex36;
                    if (DW == false) { $pc36 = 15; continue $sw36; }
                    abcd.wu.j6(th, 4530947507337423064L, this, r8, r9);
                    $pc36 = 15; continue $sw36;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc36 = 5; continue $sw36; }
                    try {
                        abcd.wu.j6(4530947507337423064L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex36 = $t;
                        $pc36 = 11; continue $sw36;
                    }
                    $pc36 = 5; continue $sw36;
                }
                case 5: {
                    try {
                        abcd.F.j6("UI Designer: Add view behind");
                        r0 = DW(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex36 = $t;
                        $pc36 = 11; continue $sw36;
                    }
                    if (r8.getNextSibling() == null) { $pc36 = 8; continue $sw36; }
                    try {
                        r8.getParentNode().insertBefore(r0, r8.getNextSibling());
                    } catch (java.lang.Throwable $t) {
                        $ex36 = $t;
                        $pc36 = 11; continue $sw36;
                    }
                    $pc36 = 9; continue $sw36;
                }
                case 9: {
                    try {
                        j3();
                    } catch (java.lang.Throwable $t) {
                        $ex36 = $t;
                        $pc36 = 11; continue $sw36;
                    }
                    return;
                }
                case 8: {
                    try {
                        r8.getParentNode().appendChild(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex36 = $t;
                        $pc36 = 11; continue $sw36;
                    }
                    { $pc36 = 9; continue $sw36; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(org.w3c.dom.Element r8, java.lang.String r9) {
        java.lang.String r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex37 = null;
        int $pc37 = 4;
        $sw37: while (true) {
            switch ($pc37) {
                case 15: {
                    th = $ex37;
                    if (DW == false) { $pc37 = 19; continue $sw37; }
                    abcd.wu.j6(th, 658089865075971504L, this, r8, r9);
                    $pc37 = 19; continue $sw37;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc37 = 6; continue $sw37; }
                    try {
                        abcd.wu.j6(658089865075971504L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex37 = $t;
                        $pc37 = 15; continue $sw37;
                    }
                    $pc37 = 6; continue $sw37;
                }
                case 6: {
                    try {
                        abcd.F.j6("UI Designer: Set view ID", java.util.Collections.singletonMap("id", r9));
                    } catch (java.lang.Throwable $t) {
                        $ex37 = $t;
                        $pc37 = 15; continue $sw37;
                    }
                    if (r9 != null) { $pc37 = 10; continue $sw37; }
                    try {
                        r8.removeAttribute("android:id");
                    } catch (java.lang.Throwable $t) {
                        $ex37 = $t;
                        $pc37 = 15; continue $sw37;
                    }
                    $pc37 = 13; continue $sw37;
                }
                case 13: {
                    try {
                        j3();
                    } catch (java.lang.Throwable $t) {
                        $ex37 = $t;
                        $pc37 = 15; continue $sw37;
                    }
                    return;
                }
                case 10: {
                    try {
                        r2 = j6(r8);
                        r8.setAttribute("android:id", "@+id/" + r9);
                    } catch (java.lang.Throwable $t) {
                        $ex37 = $t;
                        $pc37 = 15; continue $sw37;
                    }
                    if (r2 == null) { $pc37 = 13; continue $sw37; }
                    try {
                        j6(this.EQ, "@id/" + r2, "@id/" + r9);
                    } catch (java.lang.Throwable $t) {
                        $ex37 = $t;
                        $pc37 = 15; continue $sw37;
                    }
                    { $pc37 = 13; continue $sw37; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(boolean r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex38 = null;
        int $pc38 = 4;
        $sw38: while (true) {
            switch ($pc38) {
                case 8: {
                    th = $ex38;
                    if (DW == false) { $pc38 = 12; continue $sw38; }
                    abcd.wu.j6(th, -1971767352761387761L, this, new java.lang.Boolean(r5));
                    $pc38 = 12; continue $sw38;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc38 = 6; continue $sw38; }
                    try {
                        abcd.wu.j6(-1971767352761387761L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex38 = $t;
                        $pc38 = 8; continue $sw38;
                    }
                    $pc38 = 6; continue $sw38;
                }
                case 6: {
                    try {
                        this.J8 = r5;
                        this.QX = null;
                        aM();
                    } catch (java.lang.Throwable $t) {
                        $ex38 = $t;
                        $pc38 = 8; continue $sw38;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void EQ() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex39 = null;
        int $pc39 = 4;
        $sw39: while (true) {
            switch ($pc39) {
                case 8: {
                    th = $ex39;
                    if (DW == false) { $pc39 = 12; continue $sw39; }
                    abcd.wu.j6(th, -2173165238428885845L, this);
                    $pc39 = 12; continue $sw39;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc39 = 6; continue $sw39; }
                    try {
                        abcd.wu.j6(-2173165238428885845L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex39 = $t;
                        $pc39 = 8; continue $sw39;
                    }
                    $pc39 = 6; continue $sw39;
                }
                case 6: {
                    try {
                        this.tp = com.aide.uidesigner.ClassE.FH(this.Hw);
                        this.J0.j6(u7(), this.tp, 0);
                        XL();
                    } catch (java.lang.Throwable $t) {
                        $ex39 = $t;
                        $pc39 = 8; continue $sw39;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String FH(org.w3c.dom.Element r9) {
        java.lang.String r3 = null;
        java.lang.String r4 = null;
        int r7 = 0;
        java.lang.String r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex40 = null;
        int $pc40 = 4;
        $sw40: while (true) {
            switch ($pc40) {
                case 23: {
                    th = $ex40;
                    if (DW == false) { $pc40 = 28; continue $sw40; }
                    abcd.wu.j6(th, 752492883288729428L, this, r9);
                    $pc40 = 28; continue $sw40;
                }
                case 28: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc40 = 7; continue $sw40; }
                    try {
                        abcd.wu.j6(752492883288729428L, this, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex40 = $t;
                        $pc40 = 23; continue $sw40;
                    }
                    $pc40 = 7; continue $sw40;
                }
                case 7: {
                    r3 = "";
                    if (this.Hw == null) { $pc40 = 12; continue $sw40; }
                    try {
                        r3 = new java.io.File(this.Hw).getName().replace("_", "");
                    } catch (java.lang.Throwable $t) {
                        $ex40 = $t;
                        $pc40 = 23; continue $sw40;
                    }
                    $pc40 = 12; continue $sw40;
                }
                case 12: {
                    if (r3.lastIndexOf(46) == (-1)) { $pc40 = 14; continue $sw40; }
                    try {
                        r3 = r3.substring(0, r3.lastIndexOf(46));
                    } catch (java.lang.Throwable $t) {
                        $ex40 = $t;
                        $pc40 = 23; continue $sw40;
                    }
                    $pc40 = 14; continue $sw40;
                }
                case 14: {
                    try {
                        r4 = r9.getNodeName();
                    } catch (java.lang.Throwable $t) {
                        $ex40 = $t;
                        $pc40 = 23; continue $sw40;
                    }
                    r7 = 1;
                    if (r4.lastIndexOf(46) == (-1)) { $pc40 = 17; continue $sw40; }
                    try {
                        r4 = r4.substring(r4.lastIndexOf(46) + 1);
                    } catch (java.lang.Throwable $t) {
                        $ex40 = $t;
                        $pc40 = 23; continue $sw40;
                    }
                    $pc40 = 17; continue $sw40;
                }
                case 17: {
                    try {
                        r2 = r3 + r4;
                    } catch (java.lang.Throwable $t) {
                        $ex40 = $t;
                        $pc40 = 23; continue $sw40;
                    }
                    $pc40 = 19; continue $sw40;
                }
                case 19: {
                    if (this.Zo.containsKey(r2 + r7) == false) { $pc40 = 21; continue $sw40; }
                    try {
                        r7 = r7 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex40 = $t;
                        $pc40 = 23; continue $sw40;
                    }
                    { $pc40 = 19; continue $sw40; }
                }
                case 21: {
                    return r2 + r7;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex41 = null;
        int $pc41 = 4;
        $sw41: while (true) {
            switch ($pc41) {
                case 8: {
                    th = $ex41;
                    if (DW == false) { $pc41 = 12; continue $sw41; }
                    abcd.wu.j6(th, -2179683173393117400L, this);
                    $pc41 = 12; continue $sw41;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc41 = 6; continue $sw41; }
                    try {
                        abcd.wu.j6(-2179683173393117400L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex41 = $t;
                        $pc41 = 8; continue $sw41;
                    }
                    $pc41 = 6; continue $sw41;
                }
                case 6: {
                    try {
                        ((android.text.ClipboardManager) this.FH.getSystemService("clipboard")).setText(gn());
                    } catch (java.lang.Throwable $t) {
                        $ex41 = $t;
                        $pc41 = 8; continue $sw41;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH(org.w3c.dom.Element r8, com.aide.uidesigner.ClassB r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex42 = null;
        int $pc42 = 3;
        $sw42: while (true) {
            switch ($pc42) {
                case 7: {
                    th = $ex42;
                    if (DW == false) { $pc42 = 11; continue $sw42; }
                    abcd.wu.j6(th, -5771815326603690368L, this, r8, r9);
                    $pc42 = 11; continue $sw42;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc42 = 5; continue $sw42; }
                    try {
                        abcd.wu.j6(-5771815326603690368L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex42 = $t;
                        $pc42 = 7; continue $sw42;
                    }
                    $pc42 = 5; continue $sw42;
                }
                case 5: {
                    try {
                        abcd.F.j6("UI Designer: Add view inside");
                        r8.appendChild(DW(r9));
                        j3();
                    } catch (java.lang.Throwable $t) {
                        $ex42 = $t;
                        $pc42 = 7; continue $sw42;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH(boolean r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex43 = null;
        int $pc43 = 4;
        $sw43: while (true) {
            switch ($pc43) {
                case 8: {
                    th = $ex43;
                    if (DW == false) { $pc43 = 12; continue $sw43; }
                    abcd.wu.j6(th, -2019710361797105481L, this, new java.lang.Boolean(r5));
                    $pc43 = 12; continue $sw43;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc43 = 6; continue $sw43; }
                    try {
                        abcd.wu.j6(-2019710361797105481L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex43 = $t;
                        $pc43 = 8; continue $sw43;
                    }
                    $pc43 = 6; continue $sw43;
                }
                case 6: {
                    try {
                        this.Ws = r5;
                        aM();
                    } catch (java.lang.Throwable $t) {
                        $ex43 = $t;
                        $pc43 = 8; continue $sw43;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<java.lang.String> Hw() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex44 = null;
        int $pc44 = 4;
        $sw44: while (true) {
            switch ($pc44) {
                case 8: {
                    th = $ex44;
                    if (DW == false) { $pc44 = 12; continue $sw44; }
                    abcd.wu.j6(th, -3095171414550849348L, this);
                    $pc44 = 12; continue $sw44;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc44 = 6; continue $sw44; }
                    try {
                        abcd.wu.j6(-3095171414550849348L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex44 = $t;
                        $pc44 = 8; continue $sw44;
                    }
                    $pc44 = 6; continue $sw44;
                }
                case 6: {
                    return new java.util.ArrayList(this.Zo.keySet());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Hw(org.w3c.dom.Element r8, com.aide.uidesigner.ClassB r9) {
        org.w3c.dom.Element r0 = null;
        org.w3c.dom.Node r1 = null;
        org.w3c.dom.Node r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex45 = null;
        int $pc45 = 3;
        $sw45: while (true) {
            switch ($pc45) {
                case 11: {
                    th = $ex45;
                    if (DW == false) { $pc45 = 15; continue $sw45; }
                    abcd.wu.j6(th, 185637348861576165L, this, r8, r9);
                    $pc45 = 15; continue $sw45;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc45 = 5; continue $sw45; }
                    try {
                        abcd.wu.j6(185637348861576165L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex45 = $t;
                        $pc45 = 11; continue $sw45;
                    }
                    $pc45 = 5; continue $sw45;
                }
                case 5: {
                    try {
                        abcd.F.j6("UI Designer: Surrount with view");
                        r0 = DW(r9);
                        r1 = r8.getParentNode();
                        r2 = r8.getNextSibling();
                        r1.removeChild(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex45 = $t;
                        $pc45 = 11; continue $sw45;
                    }
                    if (r2 == null) { $pc45 = 8; continue $sw45; }
                    try {
                        r1.insertBefore(r0, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex45 = $t;
                        $pc45 = 11; continue $sw45;
                    }
                    $pc45 = 9; continue $sw45;
                }
                case 9: {
                    try {
                        r0.appendChild(r8);
                        Hw(r8);
                        j3();
                    } catch (java.lang.Throwable $t) {
                        $ex45 = $t;
                        $pc45 = 11; continue $sw45;
                    }
                    return;
                }
                case 8: {
                    try {
                        r1.appendChild(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex45 = $t;
                        $pc45 = 11; continue $sw45;
                    }
                    { $pc45 = 9; continue $sw45; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract void J0();

    public void J8() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex46 = null;
        int $pc46 = 4;
        $sw46: while (true) {
            switch ($pc46) {
                case 8: {
                    th = $ex46;
                    if (DW == false) { $pc46 = 12; continue $sw46; }
                    abcd.wu.j6(th, 1462666728076288560L, this);
                    $pc46 = 12; continue $sw46;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc46 = 6; continue $sw46; }
                    try {
                        abcd.wu.j6(1462666728076288560L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex46 = $t;
                        $pc46 = 8; continue $sw46;
                    }
                    $pc46 = 6; continue $sw46;
                }
                case 6: {
                    try {
                        this.tp = ((android.text.ClipboardManager) this.FH.getSystemService("clipboard")).getText().toString();
                        this.J0.DW(u7(), this.tp, 0);
                        XL();
                        j6(true);
                    } catch (java.lang.Throwable $t) {
                        $ex46 = $t;
                        $pc46 = 8; continue $sw46;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String QX() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex47 = null;
        int $pc47 = 4;
        $sw47: while (true) {
            switch ($pc47) {
                case 8: {
                    th = $ex47;
                    if (DW == false) { $pc47 = 12; continue $sw47; }
                    abcd.wu.j6(th, -323398783865823145L, this);
                    $pc47 = 12; continue $sw47;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc47 = 6; continue $sw47; }
                    try {
                        abcd.wu.j6(-323398783865823145L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex47 = $t;
                        $pc47 = 8; continue $sw47;
                    }
                    $pc47 = 6; continue $sw47;
                }
                case 6: {
                    return this.u7.Hw();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<com.aide.uidesigner.ClassS> VH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex48 = null;
        int $pc48 = 4;
        $sw48: while (true) {
            switch ($pc48) {
                case 8: {
                    th = $ex48;
                    if (DW == false) { $pc48 = 12; continue $sw48; }
                    abcd.wu.j6(th, -4376711594671877595L, this);
                    $pc48 = 12; continue $sw48;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc48 = 6; continue $sw48; }
                    try {
                        abcd.wu.j6(-4376711594671877595L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex48 = $t;
                        $pc48 = 8; continue $sw48;
                    }
                    $pc48 = 6; continue $sw48;
                }
                case 6: {
                    return new java.util.ArrayList(this.gn);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Ws() {
        android.content.Intent r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex49 = null;
        int $pc49 = 4;
        $sw49: while (true) {
            switch ($pc49) {
                case 10: {
                    th = $ex49;
                    if (DW == false) { $pc49 = 14; continue $sw49; }
                    abcd.wu.j6(th, 1584304968481758160L, this);
                    $pc49 = 14; continue $sw49;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc49 = 7; continue $sw49; }
                    try {
                        abcd.wu.j6(1584304968481758160L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex49 = $t;
                        $pc49 = 10; continue $sw49;
                    }
                    $pc49 = 7; continue $sw49;
                }
                case 7: {
                    if (android.os.Build.VERSION.SDK_INT >= 24) { $pc49 = 17; continue $sw49; }
                    try {
                        r2 = new android.content.Intent("android.intent.action.SEND");
                        r2.setType("application/xml");
                        r2.putExtra("android.intent.extra.STREAM", android.net.Uri.fromFile(new java.io.File(this.Hw)));
                        r2.putExtra("android.intent.extra.SUBJECT", "XML Layout");
                        r2.putExtra("android.intent.extra.TEXT", "Attached...");
                        this.FH.startActivity(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex49 = $t;
                        $pc49 = 10; continue $sw49;
                    }
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<java.lang.String> Zo() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex50 = null;
        int $pc50 = 4;
        $sw50: while (true) {
            switch ($pc50) {
                case 8: {
                    th = $ex50;
                    if (DW == false) { $pc50 = 12; continue $sw50; }
                    abcd.wu.j6(th, -5005188807374474565L, this);
                    $pc50 = 12; continue $sw50;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc50 = 6; continue $sw50; }
                    try {
                        abcd.wu.j6(-5005188807374474565L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex50 = $t;
                        $pc50 = 8; continue $sw50;
                    }
                    $pc50 = 6; continue $sw50;
                }
                case 6: {
                    return this.u7.DW();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String gn() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex51 = null;
        int $pc51 = 4;
        $sw51: while (true) {
            switch ($pc51) {
                case 8: {
                    th = $ex51;
                    if (DW == false) { $pc51 = 12; continue $sw51; }
                    abcd.wu.j6(th, 373300343918648700L, this);
                    $pc51 = 12; continue $sw51;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc51 = 6; continue $sw51; }
                    try {
                        abcd.wu.j6(373300343918648700L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex51 = $t;
                        $pc51 = 8; continue $sw51;
                    }
                    $pc51 = 6; continue $sw51;
                }
                case 6: {
                    return this.tp;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String j6(org.w3c.dom.Node r5) {
        org.w3c.dom.Node r2 = null;
        java.lang.String r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex52 = null;
        int $pc52 = 4;
        $sw52: while (true) {
            switch ($pc52) {
                case 16: {
                    th = $ex52;
                    if (DW == false) { $pc52 = 20; continue $sw52; }
                    abcd.wu.j6(th, -939955254136767423L, this, r5);
                    $pc52 = 20; continue $sw52;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc52 = 6; continue $sw52; }
                    try {
                        abcd.wu.j6(-939955254136767423L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex52 = $t;
                        $pc52 = 16; continue $sw52;
                    }
                    $pc52 = 6; continue $sw52;
                }
                case 6: {
                    try {
                        r2 = r5.getAttributes().getNamedItem("android:id");
                    } catch (java.lang.Throwable $t) {
                        $ex52 = $t;
                        $pc52 = 16; continue $sw52;
                    }
                    if ((r2 instanceof org.w3c.dom.Attr) == false) { $pc52 = 14; continue $sw52; }
                    try {
                        r3 = ((org.w3c.dom.Attr) r2).getValue();
                    } catch (java.lang.Throwable $t) {
                        $ex52 = $t;
                        $pc52 = 16; continue $sw52;
                    }
                    if (r3 != null) { $pc52 = 11; continue $sw52; }
                    return null;
                }
                case 11: {
                    if (r3.startsWith("@+id/") == false) { $pc52 = 24; continue $sw52; }
                    return r3.substring(5);
                }
                case 24: {
                    return null;
                }
                case 14: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<com.aide.uidesigner.ClassA> j6(com.aide.uidesigner.ClassC r9, com.aide.uidesigner.ClassC r10, org.w3c.dom.Element r11) {
        java.util.ArrayList r0 = null;
        com.aide.uidesigner.N.a[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        com.aide.uidesigner.N.a r4 = null;
        java.util.ArrayList r5 = null;
        java.util.Iterator r6 = null;
        com.aide.uidesigner.ClassA r7 = null;
        java.util.Iterator r8 = null;
        com.aide.uidesigner.ClassA r12 = null;
        java.util.Iterator r13 = null;
        com.aide.uidesigner.ClassA r14 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex53 = null;
        int $pc53 = 3;
        $sw53: while (true) {
            switch ($pc53) {
                case 38: {
                    th = $ex53;
                    if (DW == false) { $pc53 = 43; continue $sw53; }
                    abcd.wu.j6(th, 49227680475771339L, this, r9, r10, r11);
                    $pc53 = 43; continue $sw53;
                }
                case 43: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc53 = 5; continue $sw53; }
                    try {
                        abcd.wu.j6(49227680475771339L, this, r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex53 = $t;
                        $pc53 = 38; continue $sw53;
                    }
                    $pc53 = 5; continue $sw53;
                }
                case 5: {
                    try {
                        r0 = new java.util.ArrayList();
                        r1 = com.aide.uidesigner.N.u7;
                        r2 = r1.length;
                    } catch (java.lang.Throwable $t) {
                        $ex53 = $t;
                        $pc53 = 38; continue $sw53;
                    }
                    r3 = 0;
                    $pc53 = 6; continue $sw53;
                }
                case 6: {
                    if (r3 >= r2) { $pc53 = 16; continue $sw53; }
                    try {
                        r4 = r1[r3];
                    } catch (java.lang.Throwable $t) {
                        $ex53 = $t;
                        $pc53 = 38; continue $sw53;
                    }
                    if (r4.EQ == false) { $pc53 = 13; continue $sw53; }
                    if (r10.j6(r4) == false) { $pc53 = 15; continue $sw53; }
                    try {
                        r0.add(EQ(r11, r4));
                    } catch (java.lang.Throwable $t) {
                        $ex53 = $t;
                        $pc53 = 38; continue $sw53;
                    }
                    $pc53 = 15; continue $sw53;
                }
                case 15: {
                    try {
                        r3 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex53 = $t;
                        $pc53 = 38; continue $sw53;
                    }
                    { $pc53 = 6; continue $sw53; }
                }
                case 13: {
                    if (r9.j6(r4) == false) { $pc53 = 15; continue $sw53; }
                    try {
                        r0.add(EQ(r11, r4));
                    } catch (java.lang.Throwable $t) {
                        $ex53 = $t;
                        $pc53 = 38; continue $sw53;
                    }
                    { $pc53 = 15; continue $sw53; }
                }
                case 16: {
                    try {
                        r5 = new java.util.ArrayList();
                        r6 = r0.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex53 = $t;
                        $pc53 = 38; continue $sw53;
                    }
                    $pc53 = 18; continue $sw53;
                }
                case 18: {
                    if (r6.hasNext() == false) { $pc53 = 24; continue $sw53; }
                    try {
                        r7 = (com.aide.uidesigner.ClassA) r6.next();
                    } catch (java.lang.Throwable $t) {
                        $ex53 = $t;
                        $pc53 = 38; continue $sw53;
                    }
                    if (r7.DW() == false) { $pc53 = 18; continue $sw53; }
                    if (r7.FH() == true) { $pc53 = 18; continue $sw53; }
                    try {
                        r5.add(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex53 = $t;
                        $pc53 = 38; continue $sw53;
                    }
                    { $pc53 = 18; continue $sw53; }
                }
                case 24: {
                    try {
                        r8 = r0.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex53 = $t;
                        $pc53 = 38; continue $sw53;
                    }
                    $pc53 = 26; continue $sw53;
                }
                case 26: {
                    if (r8.hasNext() == false) { $pc53 = 30; continue $sw53; }
                    try {
                        r12 = (com.aide.uidesigner.ClassA) r8.next();
                    } catch (java.lang.Throwable $t) {
                        $ex53 = $t;
                        $pc53 = 38; continue $sw53;
                    }
                    if (r12.FH() == false) { $pc53 = 26; continue $sw53; }
                    try {
                        r5.add(r12);
                    } catch (java.lang.Throwable $t) {
                        $ex53 = $t;
                        $pc53 = 38; continue $sw53;
                    }
                    { $pc53 = 26; continue $sw53; }
                }
                case 30: {
                    try {
                        r13 = r0.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex53 = $t;
                        $pc53 = 38; continue $sw53;
                    }
                    $pc53 = 31; continue $sw53;
                }
                case 31: {
                    if (r13.hasNext() == false) { $pc53 = 37; continue $sw53; }
                    try {
                        r14 = (com.aide.uidesigner.ClassA) r13.next();
                    } catch (java.lang.Throwable $t) {
                        $ex53 = $t;
                        $pc53 = 38; continue $sw53;
                    }
                    if (r14.DW() == true) { $pc53 = 31; continue $sw53; }
                    try {
                        r5.add(r14);
                    } catch (java.lang.Throwable $t) {
                        $ex53 = $t;
                        $pc53 = 38; continue $sw53;
                    }
                    { $pc53 = 31; continue $sw53; }
                }
                case 37: {
                    return r5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(com.aide.uidesigner.ClassB r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex54 = null;
        int $pc54 = 4;
        $sw54: while (true) {
            switch ($pc54) {
                case 8: {
                    th = $ex54;
                    if (DW == false) { $pc54 = 12; continue $sw54; }
                    abcd.wu.j6(th, -478422139639848033L, this, r5);
                    $pc54 = 12; continue $sw54;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc54 = 6; continue $sw54; }
                    try {
                        abcd.wu.j6(-478422139639848033L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex54 = $t;
                        $pc54 = 8; continue $sw54;
                    }
                    $pc54 = 6; continue $sw54;
                }
                case 6: {
                    try {
                        abcd.F.j6("UI Designer: Add view");
                        this.EQ.appendChild(DW(r5));
                        j3();
                    } catch (java.lang.Throwable $t) {
                        $ex54 = $t;
                        $pc54 = 8; continue $sw54;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract void j6(com.aide.uidesigner.ClassS r1);

    public void j6(java.lang.String r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex55 = null;
        int $pc55 = 4;
        $sw55: while (true) {
            switch ($pc55) {
                case 8: {
                    th = $ex55;
                    if (DW == false) { $pc55 = 12; continue $sw55; }
                    abcd.wu.j6(th, 1561668179089310081L, this, r6);
                    $pc55 = 12; continue $sw55;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc55 = 6; continue $sw55; }
                    try {
                        abcd.wu.j6(1561668179089310081L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex55 = $t;
                        $pc55 = 8; continue $sw55;
                    }
                    $pc55 = 6; continue $sw55;
                }
                case 6: {
                    try {
                        this.Hw = r6;
                        this.J0.j6(r6, this.tp, 0);
                        XL();
                    } catch (java.lang.Throwable $t) {
                        $ex55 = $t;
                        $pc55 = 8; continue $sw55;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r8, android.content.Intent r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex56 = null;
        int $pc56 = 3;
        $sw56: while (true) {
            switch ($pc56) {
                case 7: {
                    th = $ex56;
                    if (DW == false) { $pc56 = 11; continue $sw56; }
                    abcd.wu.j6(th, 7320189892474631955L, this, r8, r9);
                    $pc56 = 11; continue $sw56;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc56 = 5; continue $sw56; }
                    try {
                        abcd.wu.j6(7320189892474631955L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex56 = $t;
                        $pc56 = 7; continue $sw56;
                    }
                    $pc56 = 5; continue $sw56;
                }
                case 5: {
                    try {
                        this.u7.j6(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex56 = $t;
                        $pc56 = 7; continue $sw56;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(java.lang.String r9, java.lang.String r10, int r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex57 = null;
        int $pc57 = 3;
        $sw57: while (true) {
            switch ($pc57) {
                case 9: {
                    th = $ex57;
                    if (DW == false) { $pc57 = 13; continue $sw57; }
                    abcd.wu.j6(th, -2402858916435907891L, this, r9, r10, new java.lang.Integer(r11));
                    $pc57 = 13; continue $sw57;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc57 = 6; continue $sw57; }
                    try {
                        abcd.wu.j6(-2402858916435907891L, this, r9, r10, new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex57 = $t;
                        $pc57 = 9; continue $sw57;
                    }
                    $pc57 = 6; continue $sw57;
                }
                case 6: {
                    if (r9.equals(u7()) == false) { $pc57 = 16; continue $sw57; }
                    try {
                        this.tp = r10;
                        XL();
                        j6(false);
                    } catch (java.lang.Throwable $t) {
                        $ex57 = $t;
                        $pc57 = 9; continue $sw57;
                    }
                    return;
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(org.w3c.dom.Element r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex58 = null;
        int $pc58 = 4;
        $sw58: while (true) {
            switch ($pc58) {
                case 8: {
                    th = $ex58;
                    if (DW == false) { $pc58 = 12; continue $sw58; }
                    abcd.wu.j6(th, 198423730027264652L, this, r5);
                    $pc58 = 12; continue $sw58;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc58 = 6; continue $sw58; }
                    try {
                        abcd.wu.j6(198423730027264652L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex58 = $t;
                        $pc58 = 8; continue $sw58;
                    }
                    $pc58 = 6; continue $sw58;
                }
                case 6: {
                    try {
                        abcd.F.j6("UI Designer: Delete view");
                        r5.getParentNode().removeChild(r5);
                        j3();
                    } catch (java.lang.Throwable $t) {
                        $ex58 = $t;
                        $pc58 = 8; continue $sw58;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(org.w3c.dom.Element r8, com.aide.common.ab<com.aide.uidesigner.ClassS> r9) {
        org.w3c.dom.NodeList r0 = null;
        int r1 = 0;
        org.w3c.dom.Node r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex59 = null;
        int $pc59 = 3;
        $sw59: while (true) {
            switch ($pc59) {
                case 17: {
                    th = $ex59;
                    if (DW == false) { $pc59 = 22; continue $sw59; }
                    abcd.wu.j6(th, -4181333740868135040L, this, r8, r9);
                    $pc59 = 22; continue $sw59;
                }
                case 22: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc59 = 5; continue $sw59; }
                    try {
                        abcd.wu.j6(-4181333740868135040L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex59 = $t;
                        $pc59 = 17; continue $sw59;
                    }
                    $pc59 = 5; continue $sw59;
                }
                case 5: {
                    try {
                        this.QX = r9;
                        this.XL = new java.util.ArrayList();
                        r0 = r8.getParentNode().getChildNodes();
                    } catch (java.lang.Throwable $t) {
                        $ex59 = $t;
                        $pc59 = 17; continue $sw59;
                    }
                    r1 = 0;
                    $pc59 = 7; continue $sw59;
                }
                case 7: {
                    if (r1 >= r0.getLength()) { $pc59 = 15; continue $sw59; }
                    try {
                        r2 = r0.item(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex59 = $t;
                        $pc59 = 17; continue $sw59;
                    }
                    if ((r2 instanceof org.w3c.dom.Element) == false) { $pc59 = 14; continue $sw59; }
                    if (r2.equals(r8) == true) { $pc59 = 15; continue $sw59; }
                    try {
                        this.XL.add((org.w3c.dom.Element) r2);
                    } catch (java.lang.Throwable $t) {
                        $ex59 = $t;
                        $pc59 = 17; continue $sw59;
                    }
                    $pc59 = 14; continue $sw59;
                }
                case 14: {
                    try {
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex59 = $t;
                        $pc59 = 17; continue $sw59;
                    }
                    $pc59 = 15; continue $sw59;
                }
                case 15: {
                    try {
                        aM();
                    } catch (java.lang.Throwable $t) {
                        $ex59 = $t;
                        $pc59 = 17; continue $sw59;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(org.w3c.dom.Element r9, com.aide.uidesigner.N.a r10, java.lang.String r11) {
        java.util.HashMap r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex60 = null;
        int $pc60 = 3;
        $sw60: while (true) {
            switch ($pc60) {
                case 11: {
                    th = $ex60;
                    if (DW == false) { $pc60 = 15; continue $sw60; }
                    abcd.wu.j6(th, 359852374142441440L, this, r9, r10, r11);
                    $pc60 = 15; continue $sw60;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc60 = 5; continue $sw60; }
                    try {
                        abcd.wu.j6(359852374142441440L, this, r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex60 = $t;
                        $pc60 = 11; continue $sw60;
                    }
                    $pc60 = 5; continue $sw60;
                }
                case 5: {
                    try {
                        r0 = new java.util.HashMap();
                        r0.put("attrName", r10.Zo);
                        r0.put("value", r11);
                        abcd.F.j6("UI Designer: Set attribute", r0);
                    } catch (java.lang.Throwable $t) {
                        $ex60 = $t;
                        $pc60 = 11; continue $sw60;
                    }
                    if (r11 != null) { $pc60 = 8; continue $sw60; }
                    try {
                        r9.removeAttribute(r10.Zo);
                    } catch (java.lang.Throwable $t) {
                        $ex60 = $t;
                        $pc60 = 11; continue $sw60;
                    }
                    $pc60 = 9; continue $sw60;
                }
                case 9: {
                    try {
                        j3();
                    } catch (java.lang.Throwable $t) {
                        $ex60 = $t;
                        $pc60 = 11; continue $sw60;
                    }
                    return;
                }
                case 8: {
                    try {
                        r9.setAttribute(r10.Zo, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex60 = $t;
                        $pc60 = 11; continue $sw60;
                    }
                    { $pc60 = 9; continue $sw60; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(org.w3c.dom.Element r10, com.aide.uidesigner.N.a r11, org.w3c.dom.Element r12, java.lang.String r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex61 = null;
        int $pc61 = 3;
        $sw61: while (true) {
            switch ($pc61) {
                case 10: {
                    th = $ex61;
                    if (DW == false) { $pc61 = 14; continue $sw61; }
                    abcd.wu.j6(th, 203220119953091164L, this, r10, r11, r12, r13);
                    $pc61 = 14; continue $sw61;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc61 = 5; continue $sw61; }
                    try {
                        abcd.wu.j6(203220119953091164L, this, r10, r11, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex61 = $t;
                        $pc61 = 10; continue $sw61;
                    }
                    $pc61 = 5; continue $sw61;
                }
                case 5: {
                    try {
                        r10.setAttribute(r11.Zo, "@id/" + r13);
                    } catch (java.lang.Throwable $t) {
                        $ex61 = $t;
                        $pc61 = 10; continue $sw61;
                    }
                    if (r12 == null) { $pc61 = 8; continue $sw61; }
                    try {
                        r12.setAttribute("android:id", "@+id/" + r13);
                    } catch (java.lang.Throwable $t) {
                        $ex61 = $t;
                        $pc61 = 10; continue $sw61;
                    }
                    $pc61 = 8; continue $sw61;
                }
                case 8: {
                    try {
                        j3();
                    } catch (java.lang.Throwable $t) {
                        $ex61 = $t;
                        $pc61 = 10; continue $sw61;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(org.w3c.dom.Element r8, com.aide.uidesigner.ClassB r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex62 = null;
        int $pc62 = 3;
        $sw62: while (true) {
            switch ($pc62) {
                case 7: {
                    th = $ex62;
                    if (DW == false) { $pc62 = 11; continue $sw62; }
                    abcd.wu.j6(th, -1250100235045275625L, this, r8, r9);
                    $pc62 = 11; continue $sw62;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc62 = 5; continue $sw62; }
                    try {
                        abcd.wu.j6(-1250100235045275625L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex62 = $t;
                        $pc62 = 7; continue $sw62;
                    }
                    $pc62 = 5; continue $sw62;
                }
                case 5: {
                    try {
                        abcd.F.j6("UI Designer: Add view before");
                        r8.getParentNode().insertBefore(DW(r9), r8);
                        j3();
                    } catch (java.lang.Throwable $t) {
                        $ex62 = $t;
                        $pc62 = 7; continue $sw62;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(org.w3c.dom.Element r11, com.aide.uidesigner.ClassB r12, org.w3c.dom.Element r13, com.aide.uidesigner.N.a r14, java.lang.String r15) {
        org.w3c.dom.Element r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex63 = null;
        int $pc63 = 3;
        $sw63: while (true) {
            switch ($pc63) {
                case 7: {
                    th = $ex63;
                    if (DW == false) { $pc63 = 11; continue $sw63; }
                    abcd.wu.j6(th, 85704402556510605L, this, r11, r12, r13, r14, r15);
                    $pc63 = 11; continue $sw63;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc63 = 5; continue $sw63; }
                    try {
                        abcd.wu.j6(85704402556510605L, this, r11, r12, r13, r14, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex63 = $t;
                        $pc63 = 7; continue $sw63;
                    }
                    $pc63 = 5; continue $sw63;
                }
                case 5: {
                    try {
                        abcd.F.j6("UI Designer: Add view inside");
                        r0 = DW(r12);
                        r11.appendChild(r0);
                        r0.setAttribute(r14.Zo, "@id/" + r15);
                        r13.setAttribute("android:id", "@+id/" + r15);
                        j3();
                    } catch (java.lang.Throwable $t) {
                        $ex63 = $t;
                        $pc63 = 7; continue $sw63;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(org.w3c.dom.Element r8, java.lang.String r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex64 = null;
        int $pc64 = 4;
        $sw64: while (true) {
            switch ($pc64) {
                case 12: {
                    th = $ex64;
                    if (DW == false) { $pc64 = 16; continue $sw64; }
                    abcd.wu.j6(th, 364601189555615295L, this, r8, r9);
                    $pc64 = 16; continue $sw64;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc64 = 6; continue $sw64; }
                    try {
                        abcd.wu.j6(364601189555615295L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex64 = $t;
                        $pc64 = 12; continue $sw64;
                    }
                    $pc64 = 6; continue $sw64;
                }
                case 6: {
                    try {
                        abcd.F.j6("UI Designer: Set style", java.util.Collections.singletonMap("style", r9));
                    } catch (java.lang.Throwable $t) {
                        $ex64 = $t;
                        $pc64 = 12; continue $sw64;
                    }
                    if (r9 != null) { $pc64 = 9; continue $sw64; }
                    try {
                        r8.removeAttribute("style");
                    } catch (java.lang.Throwable $t) {
                        $ex64 = $t;
                        $pc64 = 12; continue $sw64;
                    }
                    $pc64 = 10; continue $sw64;
                }
                case 10: {
                    try {
                        j3();
                    } catch (java.lang.Throwable $t) {
                        $ex64 = $t;
                        $pc64 = 12; continue $sw64;
                    }
                    return;
                }
                case 9: {
                    try {
                        r8.setAttribute("style", r9);
                    } catch (java.lang.Throwable $t) {
                        $ex64 = $t;
                        $pc64 = 12; continue $sw64;
                    }
                    { $pc64 = 10; continue $sw64; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract void j6(boolean r1);

    public boolean j6() {
        android.text.ClipboardManager r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex65 = null;
        int $pc65 = 4;
        $sw65: while (true) {
            switch ($pc65) {
                case 13: {
                    th = $ex65;
                    if (DW == false) { $pc65 = 17; continue $sw65; }
                    abcd.wu.j6(th, 3061999565082314400L, this);
                    $pc65 = 17; continue $sw65;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc65 = 6; continue $sw65; }
                    try {
                        abcd.wu.j6(3061999565082314400L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex65 = $t;
                        $pc65 = 13; continue $sw65;
                    }
                    $pc65 = 6; continue $sw65;
                }
                case 6: {
                    try {
                        r2 = (android.text.ClipboardManager) this.FH.getSystemService("clipboard");
                    } catch (java.lang.Throwable $t) {
                        $ex65 = $t;
                        $pc65 = 13; continue $sw65;
                    }
                    if (r2.hasText() == false) { $pc65 = 20; continue $sw65; }
                    if (r2.getText().charAt(0) != '<') { $pc65 = 21; continue $sw65; }
                    return true;
                }
                case 21: {
                    return false;
                }
                case 20: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean tp() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex66 = null;
        int $pc66 = 4;
        $sw66: while (true) {
            switch ($pc66) {
                case 11: {
                    th = $ex66;
                    if (DW == false) { $pc66 = 15; continue $sw66; }
                    abcd.wu.j6(th, 2910808320522541760L, this);
                    $pc66 = 15; continue $sw66;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc66 = 6; continue $sw66; }
                    try {
                        abcd.wu.j6(2910808320522541760L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex66 = $t;
                        $pc66 = 11; continue $sw66;
                    }
                    $pc66 = 6; continue $sw66;
                }
                case 6: {
                    if (this.EQ.getChildNodes().getLength() <= 0) { $pc66 = 9; continue $sw66; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String u7() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex67 = null;
        int $pc67 = 4;
        $sw67: while (true) {
            switch ($pc67) {
                case 8: {
                    th = $ex67;
                    if (DW == false) { $pc67 = 12; continue $sw67; }
                    abcd.wu.j6(th, 2911004500703773331L, this);
                    $pc67 = 12; continue $sw67;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc67 = 6; continue $sw67; }
                    try {
                        abcd.wu.j6(2911004500703773331L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex67 = $t;
                        $pc67 = 8; continue $sw67;
                    }
                    $pc67 = 6; continue $sw67;
                }
                case 6: {
                    return this.Hw;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<java.lang.String> v5() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex68 = null;
        int $pc68 = 4;
        $sw68: while (true) {
            switch ($pc68) {
                case 8: {
                    th = $ex68;
                    if (DW == false) { $pc68 = 12; continue $sw68; }
                    abcd.wu.j6(th, -919594369715729176L, this);
                    $pc68 = 12; continue $sw68;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc68 = 6; continue $sw68; }
                    try {
                        abcd.wu.j6(-919594369715729176L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex68 = $t;
                        $pc68 = 8; continue $sw68;
                    }
                    $pc68 = 6; continue $sw68;
                }
                case 6: {
                    return this.u7.j6();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract void we();
}
