package com.aide.common;

@abcd.Interfacexu
public class ClassT extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfaceru(field = -292040383428914652L)
    private com.aide.common.ClassT.a EQ;

    @abcd.Interfaceru(field = 1799358653644818128L)
    private java.lang.String J0;

    @abcd.Interfaceru(field = 4186264046760253065L)
    private boolean J8;

    @abcd.Interfaceru(field = 4156554880504752223L)
    private boolean Ws;

    @abcd.Interfaceru(field = 3475276076647037375L)
    private java.lang.String gn;

    @abcd.Interfaceru(field = 1181641520470680395L)
    private int tp;

    @abcd.Interfaceru(field = 3762520996430831376L)
    private java.lang.String u7;

    @abcd.Interfaceru(field = -1288152373800961056L)
    private boolean we;

    public interface a {
        void j6(int r1, java.lang.String r2);
    }

    static {
        abcd.wu.j6(com.aide.common.ClassT.class, 2649604467815608996L, 2649604467815608996L);
    }

    public ClassT(java.lang.String r9, int r10, com.aide.common.ClassT.a r11) {
    L7:
        th = move-exception;
        if (VH == false) goto L11;
        abcd.wu.j6(th, 1222370413163975881L, null, r9, new java.lang.Integer(r10), r11);
    L11:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(1222370413163975881L, null, r9, new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L7
    L5:
        this.gn = com.aide.common.ColorPickerView.j6(r10);     // Catch: java.lang.Throwable -> L7
        this.u7 = this.gn;     // Catch: java.lang.Throwable -> L7
        this.tp = r10;     // Catch: java.lang.Throwable -> L7
        this.EQ = r11;     // Catch: java.lang.Throwable -> L7
        this.J0 = r9;     // Catch: java.lang.Throwable -> L7
    }

    public ClassT(java.lang.String r9, java.lang.String r10, com.aide.common.ClassT.a r11) {
    L11:
        th = move-exception;
        if (VH == false) goto L15;
        abcd.wu.j6(th, 1709014343747098864L, null, r9, r10, r11);
    L15:
        throw th;
    L3:
        if (Zo == false) goto L6;
        abcd.wu.j6(1709014343747098864L, null, r9, r10, r11);     // Catch: java.lang.Throwable -> L11
    L6:
        if (r10 != null) goto L8;
        this.gn = "#000000";     // Catch: java.lang.Throwable -> L11
    L9:
        this.u7 = this.gn;     // Catch: java.lang.Throwable -> L11
        this.tp = com.aide.common.ColorPickerView.j6(this.u7);     // Catch: java.lang.Throwable -> L11
        this.EQ = r11;     // Catch: java.lang.Throwable -> L11
        this.we = true;     // Catch: java.lang.Throwable -> L11
        this.J0 = r9;     // Catch: java.lang.Throwable -> L11
        return;
    L8:
        this.gn = r10;     // Catch: java.lang.Throwable -> L11
        goto L9
    }

    static boolean DW(com.aide.common.ClassT r0) {
        return r0.J8;
    }

    static boolean DW(com.aide.common.ClassT r0, boolean r1) {
        r0.J8 = r1;
        return r1;
    }

    static java.lang.String FH(com.aide.common.ClassT r0) {
        return r0.u7;
    }

    static int Hw(com.aide.common.ClassT r0) {
        return r0.tp;
    }

    static int j6(com.aide.common.ClassT r0, int r1) {
        r0.tp = r1;
        return r1;
    }

    static java.lang.String j6(com.aide.common.ClassT r0, java.lang.String r1) {
        r0.u7 = r1;
        return r1;
    }

    static boolean j6(com.aide.common.ClassT r0) {
        return r0.Ws;
    }

    static boolean j6(com.aide.common.ClassT r0, boolean r1) {
        r0.Ws = r1;
        return r1;
    }

    static com.aide.common.ClassT.a v5(com.aide.common.ClassT r0) {
        return r0.EQ;
    }

    @Override
    @abcd.Interfacesu(method = -61553950938186860L)
    protected android.app.Dialog j6(android.app.Activity r7) {
    L11:
        th = move-exception;
        if (VH == false) goto L15;
        abcd.wu.j6(th, 324682982038763397L, this, r7);
    L15:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(324682982038763397L, this, r7);     // Catch: java.lang.Throwable -> L11
    L6:
        android.view.View r2 = android.view.LayoutInflater.from(r7).inflate(com.aide.ui.Oa.colorpicker, null);     // Catch: java.lang.Throwable -> L11
        com.aide.common.ColorPickerView r3 = (com.aide.common.ColorPickerView) r2.findViewById(com.aide.ui.Na.colorpickerColorPickerView);     // Catch: java.lang.Throwable -> L11
        android.widget.EditText r4 = (android.widget.EditText) r2.findViewById(com.aide.ui.Na.colorpickerEditText);     // Catch: java.lang.Throwable -> L11
        r3.setOnColorChangedListener(new com.aide.common.ClassO(this, r4));     // Catch: java.lang.Throwable -> L11
        r3.setInitialColor(this.gn);     // Catch: java.lang.Throwable -> L11
        r3.setCurrentColor(this.gn);     // Catch: java.lang.Throwable -> L11
        r4.setText(this.gn);     // Catch: java.lang.Throwable -> L11
        r4.addTextChangedListener(new com.aide.common.ClassP(this, r3));     // Catch: java.lang.Throwable -> L11
        android.app.AlertDialog.Builder r5 = new android.app.AlertDialog.Builder(r7);     // Catch: java.lang.Throwable -> L11
        r5.setView(r2).setCancelable(true).setPositiveButton(16909213, new com.aide.common.r(this)).setNegativeButton(17039360, new com.aide.common.DialogInterfaceOnClickListenerq(this));     // Catch: java.lang.Throwable -> L11
        if (this.we == false) goto L9;
        r5.setNeutralButton(com.almlkaide.kaypro.R.string.dialog_bt_none, new com.aide.common.DialogInterfaceOnClickListeners(this));     // Catch: java.lang.Throwable -> L11
    L9:
        r5.setTitle(this.J0);     // Catch: java.lang.Throwable -> L11
        android.app.AlertDialog r6 = r5.create();     // Catch: java.lang.Throwable -> L11
        r6.getWindow().setSoftInputMode(2);     // Catch: java.lang.Throwable -> L11
        return r6;
    }
}
