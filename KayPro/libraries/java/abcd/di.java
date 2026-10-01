package abcd;

@abcd.Interfacexu
public class di extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfaceru(field = 3289488117011052235L)
    private java.lang.String gn;

    static {
        abcd.wu.j6(abcd.di.class, 294461532386472240L, 294461532386472240L);
    }

    public di(java.lang.String r6) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -1302759957451423743L, null, r6);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-1302759957451423743L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.gn = r6;     // Catch: java.lang.Throwable -> L8
    }

    static java.lang.String DW(abcd.di r0, android.app.AlertDialog r1) {
        return r0.FH(r1);
    }

    @abcd.Interfacesu(method = 4001293043147922100L)
    private void DW(android.app.AlertDialog r6) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 1795971876204410507L, this, r6);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(1795971876204410507L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r6.getContext().getSystemService("input_method");     // Catch: java.lang.Throwable -> L8
        r2.hideSoftInputFromWindow(Hw(r6).getWindowToken(), 0);     // Catch: java.lang.Throwable -> L8
        r2.hideSoftInputFromWindow(Zo(r6).getWindowToken(), 0);     // Catch: java.lang.Throwable -> L8
    }

    static java.lang.String FH(abcd.di r0, android.app.AlertDialog r1) {
        return r0.v5(r1);
    }

    @abcd.Interfacesu(method = -4878540208062632523L)
    private java.lang.String FH(android.app.AlertDialog r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -911990147909276436L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-911990147909276436L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return Hw(r5).getText().toString().trim();
    }

    static android.widget.EditText Hw(abcd.di r0, android.app.AlertDialog r1) {
        return r0.Zo(r1);
    }

    @abcd.Interfacesu(method = -3614173312527169216L)
    private android.widget.EditText Hw(android.app.AlertDialog r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -2555099710780862995L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-2555099710780862995L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.gitclonerepositoryDirectoryName);
    }

    @abcd.Interfacesu(method = -195978998071684413L)
    private android.widget.EditText Zo(android.app.AlertDialog r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -6350219985223189656L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-6350219985223189656L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.gitclonerepositoryUrl);
    }

    static java.lang.String j6(abcd.di r0) {
        return r0.v5();
    }

    static void j6(abcd.di r0, android.app.AlertDialog r1) {
        r0.DW(r1);
    }

    @abcd.Interfacesu(method = 4975793607705188268L)
    private java.lang.String v5() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 201232545820468981L, this);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(201232545820468981L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.gn;
    }

    @abcd.Interfacesu(method = 3534611745733543400L)
    private java.lang.String v5(android.app.AlertDialog r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -4434289999238011625L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-4434289999238011625L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return Zo(r5).getText().toString().trim();
    }

    @Override
    @abcd.Interfacesu(method = 1960161719356701120L)
    protected android.app.Dialog j6(android.app.Activity r10) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 1275607209537150833L, this, r10);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(1275607209537150833L, this, r10);     // Catch: java.lang.Throwable -> L8
    L6:
        java.lang.String r3 = v5();     // Catch: java.lang.Throwable -> L8
        android.view.View r4 = android.view.LayoutInflater.from(r10).inflate(com.almlkaide.kaypro.R.layout.gitclonerepository, null);     // Catch: java.lang.Throwable -> L8
        android.app.AlertDialog.Builder r5 = new android.app.AlertDialog.Builder(r10);     // Catch: java.lang.Throwable -> L8
        r5.setTitle(com.almlkaide.kaypro.R.string.command_files_clone_git_repository).setView(r4).setCancelable(true).setPositiveButton(com.almlkaide.kaypro.R.string.dialog_bt_clone, null).setNegativeButton(17039360, new abcd.DialogInterfaceOnClickListenerZh(this));     // Catch: java.lang.Throwable -> L8
        android.app.AlertDialog r6 = r5.create();     // Catch: java.lang.Throwable -> L8
        ((android.widget.TextView) r4.findViewById(com.almlkaide.kaypro.R.id.gitclonerepositoryUrl)).setText("");     // Catch: java.lang.Throwable -> L8
        ((android.widget.TextView) r4.findViewById(com.almlkaide.kaypro.R.id.gitclonerepositoryLocation)).setText(r3);     // Catch: java.lang.Throwable -> L8
        android.widget.EditText r7 = (android.widget.EditText) r4.findViewById(com.almlkaide.kaypro.R.id.gitclonerepositoryDirectoryName);     // Catch: java.lang.Throwable -> L8
        r7.setText("");     // Catch: java.lang.Throwable -> L8
        r7.addTextChangedListener(new abcd._h(this, r6));     // Catch: java.lang.Throwable -> L8
        ((android.widget.EditText) r4.findViewById(com.almlkaide.kaypro.R.id.gitclonerepositoryUrl)).addTextChangedListener(new abcd.C0526ai(this, r6, r7));     // Catch: java.lang.Throwable -> L8
        r6.setOnShowListener(new abcd.DialogInterfaceOnShowListenerci(this, r10));     // Catch: java.lang.Throwable -> L8
        return r6;
    }

    @abcd.Interfacesu(method = 1783523156329601489L)
    protected void j6(android.app.AlertDialog r9) {
    L17:
        th = move-exception;
        if (VH == false) goto L21;
        abcd.wu.j6(th, 3442036354139500500L, this, r9);
    L21:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(3442036354139500500L, this, r9);     // Catch: java.lang.Throwable -> L17
    L6:
        android.widget.Button r2 = r9.getButton(-1);     // Catch: java.lang.Throwable -> L17
        if (r2 == null) goto L26;
        boolean r3 = true;
        new abcd.HJ(v5(r9));     // Catch: java.net.URISyntaxException -> L11 java.lang.Throwable -> L17
    L13:
        if (com.aide.ui.U.Ws().j6(v5(), FH(r9)) == true) goto L15;
        r3 = false;
    L15:
        r2.setEnabled(r3);     // Catch: java.lang.Throwable -> L17
        return;
    L11:
        r3 = false;
        goto L13
    }
}
