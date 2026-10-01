package abcd;

@abcd.Interfacexu
public class Ch extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfaceru(field = 2835879965997661440L)
    private java.lang.String gn;

    @abcd.Interfaceru(field = -2616101381234931405L)
    private com.aide.common.ab<java.lang.String> tp;

    @abcd.Interfaceru(field = 350847242812094845L)
    private abcd.Sk.a u7;

    static {
        abcd.wu.j6(abcd.Ch.class, -6708075855096698041L, -6708075855096698041L);
    }

    public Ch(java.lang.String r9, abcd.Sk.a r10, com.aide.common.ab<java.lang.String> r11) {
    L7:
        th = move-exception;
        if (VH == false) goto L11;
        abcd.wu.j6(th, -4768031261897654016L, null, r9, r10, r11);
    L11:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(-4768031261897654016L, null, r9, r10, r11);     // Catch: java.lang.Throwable -> L7
    L5:
        this.gn = r9;     // Catch: java.lang.Throwable -> L7
        this.u7 = r10;     // Catch: java.lang.Throwable -> L7
        this.tp = r11;     // Catch: java.lang.Throwable -> L7
    }

    static com.aide.common.ab DW(abcd.Ch r0) {
        return r0.tp;
    }

    static java.lang.String DW(abcd.Ch r0, android.app.AlertDialog r1) {
        return r0.v5(r1);
    }

    @abcd.Interfacesu(method = -6793158347887233617L)
    private void DW(android.app.AlertDialog r6) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 806167629204849048L, this, r6);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(806167629204849048L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r6.getContext().getSystemService("input_method");     // Catch: java.lang.Throwable -> L8
        r2.hideSoftInputFromWindow(FH(r6).getWindowToken(), 0);     // Catch: java.lang.Throwable -> L8
        r2.hideSoftInputFromWindow(VH(r6).getWindowToken(), 0);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 166425984905716105L)
    private android.widget.EditText FH(android.app.AlertDialog r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 1120008048066885672L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(1120008048066885672L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.createprojectName);
    }

    static java.lang.String FH(abcd.Ch r0, android.app.AlertDialog r1) {
        return r0.Hw(r1);
    }

    static abcd.Sk.a Hw(abcd.Ch r0, android.app.AlertDialog r1) {
        return r0.Zo(r1);
    }

    @abcd.Interfacesu(method = 4870430126161092880L)
    private java.lang.String Hw(android.app.AlertDialog r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -1056562570325263709L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-1056562570325263709L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return VH(r5).getText().toString().trim();
    }

    @abcd.Interfacesu(method = -5847703862577192000L)
    private android.widget.EditText VH(android.app.AlertDialog r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -5365622781750731913L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-5365622781750731913L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.createprojectPackage);
    }

    @abcd.Interfacesu(method = -1559185266629294585L)
    private abcd.Sk.a Zo(android.app.AlertDialog r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -356061789385027632L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-356061789385027632L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.u7;
    }

    static java.lang.String j6(abcd.Ch r0) {
        return r0.v5();
    }

    static void j6(abcd.Ch r0, android.app.AlertDialog r1) {
        r0.DW(r1);
    }

    static void j6(abcd.Ch r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, abcd.Sk.a r4) {
        r0.j6(r1, r2, r3, r4);
    }

    @abcd.Interfacesu(method = 230893290840044767L)
    private void j6(java.lang.String r10, java.lang.String r11, java.lang.String r12, abcd.Sk.a r13) {
    L7:
        th = move-exception;
        if (VH == false) goto L11;
        abcd.wu.j6(th, -1562694632264115200L, this, r10, r11, r12, r13);
    L11:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(-1562694632264115200L, this, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
    L5:
        com.aide.ui.U.j6(com.aide.ui.U.lg(), "Creating Project ...", new abcd.RunnableBh(this, r10, r11, r12, r13), null);     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = -4130268463357126509L)
    private java.lang.String v5() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 1004085119242810440L, this);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(1004085119242810440L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.gn;
    }

    @abcd.Interfacesu(method = -1353771980219784915L)
    private java.lang.String v5(android.app.AlertDialog r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 5552500925898615840L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(5552500925898615840L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return FH(r5).getText().toString().trim();
    }

    @Override
    @abcd.Interfacesu(method = -608308182077754123L)
    protected android.app.Dialog j6(android.app.Activity r12) {
    L15:
        th = move-exception;
        if (VH == false) goto L19;
        abcd.wu.j6(th, 379690877862374400L, this, r12);
    L19:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(379690877862374400L, this, r12);     // Catch: java.lang.Throwable -> L15
    L6:
        android.view.View r2 = android.view.LayoutInflater.from(r12).inflate(com.almlkaide.kaypro.R.layout.createproject, null);     // Catch: java.lang.Throwable -> L15
        android.app.AlertDialog.Builder r3 = new android.app.AlertDialog.Builder(r12);     // Catch: java.lang.Throwable -> L15
        r3.setTitle(com.almlkaide.kaypro.R.string.dialog_create_project_title).setView(r2).setCancelable(true).setPositiveButton(com.almlkaide.kaypro.R.string.dialog_create_project_create, new abcd.DialogInterfaceOnClickListenerwh(this)).setNegativeButton(com.almlkaide.kaypro.R.string.dialog_cancel, new abcd.DialogInterfaceOnClickListenervh(this));     // Catch: java.lang.Throwable -> L15
        android.app.AlertDialog r4 = r3.create();     // Catch: java.lang.Throwable -> L15
        ((android.widget.TextView) r2.findViewById(com.almlkaide.kaypro.R.id.createprojectType)).setText(r12.getResources().getString(com.almlkaide.kaypro.R.string.dialog_create_project_new, new java.lang.Object[]{this.u7.DW}));     // Catch: java.lang.Throwable -> L15
        ((android.widget.TextView) r2.findViewById(com.almlkaide.kaypro.R.id.createprojectLocation)).setText(r12.getResources().getString(com.almlkaide.kaypro.R.string.dialog_create_project_in, new java.lang.Object[]{this.gn}));     // Catch: java.lang.Throwable -> L15
        android.widget.EditText r5 = (android.widget.EditText) r2.findViewById(com.almlkaide.kaypro.R.id.createprojectName);     // Catch: java.lang.Throwable -> L15
        java.lang.String r6 = com.aide.ui.U.gW().Hw(this.gn, this.u7.VH.Zo);     // Catch: java.lang.Throwable -> L15
        r5.setText(r6);     // Catch: java.lang.Throwable -> L15
        r5.addTextChangedListener(new abcd.xh(this, r4));     // Catch: java.lang.Throwable -> L15
        android.widget.EditText r7 = (android.widget.EditText) r2.findViewById(com.almlkaide.kaypro.R.id.createprojectPackage);     // Catch: java.lang.Throwable -> L15
        r7.setText(com.aide.ui.U.gW().FH(r6));     // Catch: java.lang.Throwable -> L15
        r7.addTextChangedListener(new abcd.yh(this, r4));     // Catch: java.lang.Throwable -> L15
        int r8 = 8;
        if (this.u7.VH.VH == false) goto L9;
        int r9 = 0;
    L10:
        r7.setVisibility(r9);     // Catch: java.lang.Throwable -> L15
        android.widget.TextView r10 = (android.widget.TextView) r2.findViewById(com.almlkaide.kaypro.R.id.createprojectPackageLabel);     // Catch: java.lang.Throwable -> L15
        if (this.u7.VH.VH == false) goto L13;
        r8 = 0;
    L13:
        r10.setVisibility(r8);     // Catch: java.lang.Throwable -> L15
        r4.getWindow().setSoftInputMode(2);     // Catch: java.lang.Throwable -> L15
        return r4;
    L9:
        r9 = 8;
        goto L10
    }

    @abcd.Interfacesu(method = 3387883876671061100L)
    protected void j6(android.app.AlertDialog r7) {
    L16:
        th = move-exception;
        if (VH == false) goto L20;
        abcd.wu.j6(th, 3976031841413833775L, this, r7);
    L20:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(3976031841413833775L, this, r7);     // Catch: java.lang.Throwable -> L16
    L6:
        android.widget.Button r2 = r7.getButton(-1);     // Catch: java.lang.Throwable -> L16
        if (r2 != null) goto L9;
        return;
    L9:
        if (com.aide.ui.U.gW().DW(v5(), Hw(r7)) == true) goto L11;
    L13:
        boolean r3 = false;
    L14:
        r2.setEnabled(r3);     // Catch: java.lang.Throwable -> L16
        return;
    L11:
        if (com.aide.ui.U.gW().FH(v5(), v5(r7)) == false) goto L13;
        r3 = true;
        goto L14
    }
}
