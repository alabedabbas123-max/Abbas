package abcd;

@abcd.Interfacexu
public class Yh extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfaceru(field = -2635689681807066136L)
    private java.lang.String gn;

    @abcd.Interfaceru(field = -2350192644063101112L)
    private java.lang.String tp;

    @abcd.Interfaceru(field = 2039735921507585539L)
    private java.lang.String u7;

    static {
        abcd.wu.j6(abcd.Yh.class, 4518137094473097045L, 4518137094473097045L);
    }

    public Yh(java.lang.String r9) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 3828419465604789783L, null, r9);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(3828419465604789783L, null, r9);     // Catch: java.lang.Throwable -> L8
    L6:
        android.content.SharedPreferences r3 = com.aide.ui.U.Zo().getSharedPreferences("ExportAPKDialog", 0);     // Catch: java.lang.Throwable -> L8
        java.lang.StringBuilder r4 = new java.lang.StringBuilder();     // Catch: java.lang.Throwable -> L8
        r4.append(r3.getString("DefaultAPKDir", abcd.Vl.VH() + "/AppProjects"));     // Catch: java.lang.Throwable -> L8
        r4.append("/");     // Catch: java.lang.Throwable -> L8
        r4.append(abcd.C0790gj.Mr(com.aide.ui.U.vy().J0()));     // Catch: java.lang.Throwable -> L8
        this.u7 = r4.toString();     // Catch: java.lang.Throwable -> L8
        this.gn = r3.getString("DefaultKeyStore", abcd.Vl.VH() + "/AppProjects/publish.keystore");     // Catch: java.lang.Throwable -> L8
        this.tp = r9;     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -3215078050561682305L)
    private Yh(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
    L7:
        th = move-exception;
        if (VH == false) goto L11;
        abcd.wu.j6(th, 3466111084542111291L, null, r9, r10, r11);
    L11:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(3466111084542111291L, null, r9, r10, r11);     // Catch: java.lang.Throwable -> L7
    L5:
        this.u7 = r10;     // Catch: java.lang.Throwable -> L7
        this.gn = r11;     // Catch: java.lang.Throwable -> L7
        this.tp = r9;     // Catch: java.lang.Throwable -> L7
    }

    Yh(java.lang.String r10, java.lang.String r11, java.lang.String r12, abcd.DialogInterfaceOnClickListenerRh r13) {
    L7:
        th = move-exception;
        if (VH == false) goto L11;
        abcd.wu.j6(th, -5553121834155633612L, null, r10, r11, r12, r13);
    L11:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(-5553121834155633612L, null, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
    L5:
        this(r10, r11, r12);     // Catch: java.lang.Throwable -> L7
    }

    static java.lang.String DW(abcd.Yh r0, android.app.AlertDialog r1) {
        return r0.FH(r1);
    }

    @abcd.Interfacesu(method = 109508426829733232L)
    private void DW(android.app.Activity r9, java.lang.String r10, java.lang.String r11) {
    L7:
        th = move-exception;
        if (VH == false) goto L11;
        abcd.wu.j6(th, -7290312324950855872L, this, r9, r10, r11);
    L11:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(-7290312324950855872L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L7
    L5:
        com.aide.common.Abstractma.j6(r9, new abcd.rh(r11, "appkey", "", new abcd.C0443Xh(this, r9, r10)));     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = -5859736509948213984L)
    private void DW(android.app.AlertDialog r6) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 2128688099187769296L, this, r6);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(2128688099187769296L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r6.getContext().getSystemService("input_method");     // Catch: java.lang.Throwable -> L8
        r2.hideSoftInputFromWindow(Hw(r6).getWindowToken(), 0);     // Catch: java.lang.Throwable -> L8
        r2.hideSoftInputFromWindow(Zo(r6).getWindowToken(), 0);     // Catch: java.lang.Throwable -> L8
    }

    static java.lang.String FH(abcd.Yh r0, android.app.AlertDialog r1) {
        return r0.v5(r1);
    }

    @abcd.Interfacesu(method = -2113376607681099084L)
    private java.lang.String FH(android.app.AlertDialog r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 792772347225384800L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(792772347225384800L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return Hw(r5).getText().toString().trim();
    }

    @abcd.Interfacesu(method = -2486626551369405375L)
    private android.widget.EditText Hw(android.app.AlertDialog r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -1761200616027796605L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-1761200616027796605L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.exportapkFile);
    }

    @abcd.Interfacesu(method = 6726713543896544784L)
    private android.widget.EditText Zo(android.app.AlertDialog r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 4473098694391518668L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(4473098694391518668L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.exportapkKeystoreFile);
    }

    static java.lang.String j6(abcd.Yh r0) {
        return r0.tp;
    }

    static void j6(abcd.Yh r0, android.app.Activity r1, java.lang.String r2, java.lang.String r3) {
        r0.DW(r1, r2, r3);
    }

    static void j6(abcd.Yh r0, android.app.AlertDialog r1) {
        r0.DW(r1);
    }

    static void j6(abcd.Yh r0, java.lang.String r1, java.lang.String r2) {
        r0.j6(r1, r2);
    }

    @abcd.Interfacesu(method = 8015687732796562304L)
    private void j6(java.lang.String r8, java.lang.String r9) {
    L7:
        th = move-exception;
        if (VH == false) goto L11;
        abcd.wu.j6(th, 4771908176910514920L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(4771908176910514920L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.SharedPreferences.Editor r0 = com.aide.ui.U.Zo().getSharedPreferences("ExportAPKDialog", 0).edit();     // Catch: java.lang.Throwable -> L7
        r0.putString("DefaultKeyStore", r9);     // Catch: java.lang.Throwable -> L7
        r0.putString("DefaultAPKDir", abcd.Vl.EQ(r8));     // Catch: java.lang.Throwable -> L7
        r0.commit();     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = -2916478725766900605L)
    private java.lang.String v5(android.app.AlertDialog r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 2534346003423630797L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(2534346003423630797L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return Zo(r5).getText().toString().trim();
    }

    @Override
    @abcd.Interfacesu(method = 340203784419912784L)
    protected android.app.Dialog j6(android.app.Activity r8) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -2405816802693573780L, this, r8);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-2405816802693573780L, this, r8);     // Catch: java.lang.Throwable -> L8
    L6:
        android.view.View r2 = android.view.LayoutInflater.from(r8).inflate(com.almlkaide.kaypro.R.layout.exportapk, null);     // Catch: java.lang.Throwable -> L8
        android.app.AlertDialog.Builder r3 = new android.app.AlertDialog.Builder(r8);     // Catch: java.lang.Throwable -> L8
        r3.setTitle(com.almlkaide.kaypro.R.string.dialog_title_export).setView(r2).setCancelable(true).setPositiveButton(com.almlkaide.kaypro.R.string.dialog_bt_export, new abcd.DialogInterfaceOnClickListenerC0379Th(this)).setNeutralButton(com.almlkaide.kaypro.R.string.dialog_title_create_keystore, new abcd.DialogInterfaceOnClickListenerSh(this, r8)).setNegativeButton(17039360, new abcd.DialogInterfaceOnClickListenerRh(this));     // Catch: java.lang.Throwable -> L8
        android.app.AlertDialog r4 = r3.create();     // Catch: java.lang.Throwable -> L8
        android.widget.TextView r5 = (android.widget.TextView) r2.findViewById(com.almlkaide.kaypro.R.id.exportapkFile);     // Catch: java.lang.Throwable -> L8
        r5.setText(this.u7);     // Catch: java.lang.Throwable -> L8
        r5.addTextChangedListener(new abcd.Uh(this, r4));     // Catch: java.lang.Throwable -> L8
        android.widget.EditText r6 = (android.widget.EditText) r2.findViewById(com.almlkaide.kaypro.R.id.exportapkKeystoreFile);     // Catch: java.lang.Throwable -> L8
        r6.setText(this.gn);     // Catch: java.lang.Throwable -> L8
        r6.addTextChangedListener(new abcd.Vh(this, r4));     // Catch: java.lang.Throwable -> L8
        r4.setOnShowListener(new abcd.DialogInterfaceOnShowListenerWh(this));     // Catch: java.lang.Throwable -> L8
        return r4;
    }

    @abcd.Interfacesu(method = 79586093315472705L)
    protected void j6(android.app.AlertDialog r5) {
    L16:
        th = move-exception;
        if (VH == false) goto L20;
        abcd.wu.j6(th, 200007312684874959L, this, r5);
    L20:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(200007312684874959L, this, r5);     // Catch: java.lang.Throwable -> L16
    L6:
        android.widget.Button r2 = r5.getButton(-1);     // Catch: java.lang.Throwable -> L16
        if (r2 != null) goto L9;
        return;
    L9:
        if (abcd.Vl.Hw(v5(r5)) == true) goto L11;
    L13:
        boolean r3 = false;
    L14:
        r2.setEnabled(r3);     // Catch: java.lang.Throwable -> L16
        return;
    L11:
        if (abcd.Vl.U2(FH(r5)) == false) goto L13;
        r3 = true;
        goto L14
    }
}
