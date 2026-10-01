package com.aide.common;

@abcd.Interfacexu
public class Fa extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfaceru(field = -72918645820836816L)
    private java.lang.Runnable EQ;

    @abcd.Interfaceru(field = -2059477075892605824L)
    private boolean J0;

    @abcd.Interfaceru(field = 526748407653482907L)
    private java.lang.String gn;

    @abcd.Interfaceru(field = -1476668194691602173L)
    private com.aide.common.ab<java.lang.String> tp;

    @abcd.Interfaceru(field = 3030110207485413615L)
    private java.lang.String u7;

    @abcd.Interfaceru(field = 2274064310390856345L)
    private android.app.AlertDialog we;

    static {
        abcd.wu.j6(com.aide.common.Fa.class, -6420951009284476296L, -6420951009284476296L);
    }

    public Fa(java.lang.String r10, java.lang.String r11, com.aide.common.ab<java.lang.String> r12, java.lang.Runnable r13) {
    L7:
        th = move-exception;
        if (VH == false) goto L11;
        abcd.wu.j6(th, 3893062001227811984L, null, r10, r11, r12, r13);
    L11:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(3893062001227811984L, null, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
    L5:
        this.gn = r10;     // Catch: java.lang.Throwable -> L7
        this.u7 = r11;     // Catch: java.lang.Throwable -> L7
        this.tp = r12;     // Catch: java.lang.Throwable -> L7
        this.EQ = r13;     // Catch: java.lang.Throwable -> L7
    }

    static java.lang.Runnable DW(com.aide.common.Fa r0) {
        return r0.EQ;
    }

    static java.lang.String DW(com.aide.common.Fa r0, java.lang.String r1) {
        return r0.j6(r1);
    }

    @abcd.Interfacesu(method = 854311022255287488L)
    private java.lang.String DW(java.lang.String r6) {
    L24:
        th = move-exception;
        if (VH == false) goto L29;
        abcd.wu.j6(th, -573741704658576779L, this, r6);
    L29:
        throw th;
    L4:
        if (Zo == false) goto L7;
        abcd.wu.j6(-573741704658576779L, this, r6);     // Catch: java.lang.Throwable -> L24
    L7:
        if (r6.length() == 0) goto L22;
        int r2 = 0;
        if (java.lang.Character.isDigit(r6.charAt(0)) == true) goto L14;
        if (r6.charAt(0) == '-') goto L14;
        return null;
    L14:
        if (r2 >= r6.length()) goto L20;
        if (java.lang.Character.isDigit(r6.charAt(r2)) == true) goto L19;
        if (r6.charAt(r2) != '-') goto L20;
    L19:
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L24
    L20:
        return r6.substring(r2, r6.length());
    L22:
        return null;
    }

    @abcd.Interfacesu(method = -6621029045346984135L)
    private void DW(android.widget.SeekBar r8, java.lang.String r9) {
    L7:
        th = move-exception;
        if (VH == false) goto L11;
        abcd.wu.j6(th, 1198041819787012080L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(1198041819787012080L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        r8.setProgress(java.lang.Math.max(0, java.lang.Math.min(100, FH(r9))));     // Catch: java.lang.Throwable -> L7
    }

    static void DW(com.aide.common.Fa r0, android.widget.SeekBar r1, java.lang.String r2) {
        r0.DW(r1, r2);
    }

    @abcd.Interfacesu(method = -1112348375437288585L)
    private int FH(java.lang.String r7) {
    L18:
        th = move-exception;
        if (VH == false) goto L23;
        abcd.wu.j6(th, 1495379695836042936L, this, r7);
    L23:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(1495379695836042936L, this, r7);     // Catch: java.lang.Throwable -> L18
    L6:
        int r3 = 0;
    L8:
        if (r3 < r7.length()) goto L10;
    L25:
        return java.lang.Integer.parseInt(r7.substring(0, r3));
    L17:
        return 0;
    L10:
        if (java.lang.Character.isDigit(r7.charAt(r3)) == true) goto L14;
        if (r7.charAt(r3) != '-') goto L25;
    L14:
        r3 = r3 + 1;
        goto L8
    }

    static com.aide.common.ab FH(com.aide.common.Fa r0) {
        return r0.tp;
    }

    static android.app.AlertDialog Hw(com.aide.common.Fa r0) {
        return r0.we;
    }

    @abcd.Interfacesu(method = -1776586152585643448L)
    private java.lang.String Hw(java.lang.String r6) {
    L10:
        th = move-exception;
        if (VH == false) goto L14;
        abcd.wu.j6(th, 1045010856604870935L, this, r6);
    L14:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(1045010856604870935L, this, r6);     // Catch: java.lang.Throwable -> L10
    L6:
        java.lang.String r2 = DW(r6);     // Catch: java.lang.Throwable -> L10
        if (r2 == null) goto L17;
        return (FH(r6) + 1) + r2;
    L17:
        return r6;
    }

    @abcd.Interfacesu(method = 1409482166785352559L)
    private java.lang.String j6(android.widget.SeekBar r8, java.lang.String r9) {
    L10:
        th = move-exception;
        if (VH == false) goto L14;
        abcd.wu.j6(th, -3706177497023204184L, this, r8, r9);
    L14:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(-3706177497023204184L, this, r8, r9);     // Catch: java.lang.Throwable -> L10
    L5:
        java.lang.String r0 = DW(r9);     // Catch: java.lang.Throwable -> L10
        if (r0 != null) goto L8;
        r0 = "";
    L8:
        return r8.getProgress() + r0;
    }

    static java.lang.String j6(com.aide.common.Fa r0, android.widget.SeekBar r1, java.lang.String r2) {
        return r0.j6(r1, r2);
    }

    static java.lang.String j6(com.aide.common.Fa r0, java.lang.String r1) {
        return r0.Hw(r1);
    }

    @abcd.Interfacesu(method = 1125999168538804308L)
    private java.lang.String j6(java.lang.String r6) {
    L10:
        th = move-exception;
        if (VH == false) goto L14;
        abcd.wu.j6(th, 173761071234035681L, this, r6);
    L14:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(173761071234035681L, this, r6);     // Catch: java.lang.Throwable -> L10
    L6:
        java.lang.String r2 = DW(r6);     // Catch: java.lang.Throwable -> L10
        if (r2 == null) goto L17;
        java.lang.StringBuilder r3 = new java.lang.StringBuilder();     // Catch: java.lang.Throwable -> L10
        r3.append(FH(r6) - 1);     // Catch: java.lang.Throwable -> L10
        r3.append(r2);     // Catch: java.lang.Throwable -> L10
        return r3.toString();
    L17:
        return r6;
    }

    static boolean j6(com.aide.common.Fa r0) {
        return r0.J0;
    }

    static boolean j6(com.aide.common.Fa r0, boolean r1) {
        r0.J0 = r1;
        return r1;
    }

    @Override
    @abcd.Interfacesu(method = -83764276660784727L)
    protected android.app.Dialog j6(android.app.Activity r9) {
    L11:
        th = move-exception;
        if (VH == false) goto L15;
        abcd.wu.j6(th, 312834692866214584L, this, r9);
    L15:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(312834692866214584L, this, r9);     // Catch: java.lang.Throwable -> L11
    L6:
        android.view.View r2 = android.view.LayoutInflater.from(r9).inflate(com.aide.ui.Oa.designer_sizedialog, null);     // Catch: java.lang.Throwable -> L11
        android.widget.EditText r3 = (android.widget.EditText) r2.findViewById(com.aide.ui.Na.designersizedialogEditText);     // Catch: java.lang.Throwable -> L11
        r3.setText(this.u7);     // Catch: java.lang.Throwable -> L11
        android.widget.SeekBar r4 = (android.widget.SeekBar) r2.findViewById(com.aide.ui.Na.designersizedialogSeekBar);     // Catch: java.lang.Throwable -> L11
        r4.setMax(100);     // Catch: java.lang.Throwable -> L11
        DW(r4, this.u7);     // Catch: java.lang.Throwable -> L11
        r4.setOnSeekBarChangeListener(new com.aide.common.xa(this, r3, r4));     // Catch: java.lang.Throwable -> L11
        r3.addTextChangedListener(new com.aide.common.ya(this, r4, r3));     // Catch: java.lang.Throwable -> L11
        ((android.widget.TextView) r2.findViewById(com.aide.ui.Na.designersizedialogPlusButton)).setOnClickListener(new com.aide.common.ViewOnClickListenerza(this, r3, r4));     // Catch: java.lang.Throwable -> L11
        ((android.widget.TextView) r2.findViewById(com.aide.ui.Na.designersizedialogMinusButton)).setOnClickListener(new com.aide.common.Aa(this, r3, r4));     // Catch: java.lang.Throwable -> L11
        android.app.AlertDialog.Builder r5 = new android.app.AlertDialog.Builder(r9);     // Catch: java.lang.Throwable -> L11
        r5.setView(r2).setCancelable(true).setPositiveButton(17039370, new com.aide.common.Da(this, r9, r3)).setNegativeButton(17039360, new com.aide.common.Ca(this, r9, r3)).setNeutralButton(com.almlkaide.kaypro.R.string.dialog_bt_none, new com.aide.common.Ba(this, r9, r3));     // Catch: java.lang.Throwable -> L11
        if (this.gn == null) goto L9;
        r5.setTitle(this.gn);     // Catch: java.lang.Throwable -> L11
    L9:
        this.we = r5.create();     // Catch: java.lang.Throwable -> L11
        r3.setOnEditorActionListener(new com.aide.common.Ea(this, r9, r3));     // Catch: java.lang.Throwable -> L11
        this.we.setCanceledOnTouchOutside(true);     // Catch: java.lang.Throwable -> L11
        this.we.getWindow().setSoftInputMode(2);     // Catch: java.lang.Throwable -> L11
        return this.we;
    }
}
