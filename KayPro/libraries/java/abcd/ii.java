package abcd;

@abcd.Interfacexu
public class ii extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    static {
        abcd.wu.j6(abcd.ii.class, 1005502431686740692L, 1005502431686740692L);
    }

    public ii() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -4938847751760937084L, null);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-4938847751760937084L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    static void DW(abcd.ii r0, android.app.AlertDialog r1) {
        r0.Hw(r1);
    }

    @abcd.Interfacesu(method = 5599495411478456605L)
    private void DW(android.app.AlertDialog r6) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 4834141387453951560L, this, r6);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(4834141387453951560L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        ((android.view.inputmethod.InputMethodManager) r6.getContext().getSystemService("input_method")).hideSoftInputFromWindow(FH(r6).getWindowToken(), 0);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -2421677187363125520L)
    private android.widget.EditText FH(android.app.AlertDialog r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -446751284592849375L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-446751284592849375L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.gitcommitdatamessage);
    }

    @abcd.Interfacesu(method = -1929844814493486400L)
    private void Hw(android.app.AlertDialog r6) {
    L13:
        th = move-exception;
        if (VH == false) goto L17;
        abcd.wu.j6(th, -14707139850991089L, this, r6);
    L17:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-14707139850991089L, this, r6);     // Catch: java.lang.Throwable -> L13
    L6:
        android.widget.Button r2 = r6.getButton(-1);     // Catch: java.lang.Throwable -> L13
        if (r2 == null) goto L20;
        boolean r3 = true;
        if (j6(r6).length() != 0) goto L11;
        r3 = false;
    L11:
        r2.setEnabled(r3);     // Catch: java.lang.Throwable -> L13
        return;
    }

    static void j6(abcd.ii r0, android.app.AlertDialog r1) {
        r0.DW(r1);
    }

    @Override
    @abcd.Interfacesu(method = 1171647940657283783L)
    protected android.app.Dialog j6(android.app.Activity r8) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -1971422416823227860L, this, r8);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-1971422416823227860L, this, r8);     // Catch: java.lang.Throwable -> L8
    L6:
        android.view.View r2 = android.view.LayoutInflater.from(r8).inflate(com.almlkaide.kaypro.R.layout.gitcommitdata, null);     // Catch: java.lang.Throwable -> L8
        android.app.AlertDialog.Builder r3 = new android.app.AlertDialog.Builder(r8);     // Catch: java.lang.Throwable -> L8
        r3.setTitle("Git commit").setView(r2).setCancelable(true).setPositiveButton("Commit", new abcd.DialogInterfaceOnClickListenerfi(this, r8)).setNegativeButton(17039360, new abcd.DialogInterfaceOnClickListenerei(this));     // Catch: java.lang.Throwable -> L8
        android.app.AlertDialog r4 = r3.create();     // Catch: java.lang.Throwable -> L8
        ((android.widget.EditText) r2.findViewById(com.almlkaide.kaypro.R.id.gitcommitdatamessage)).addTextChangedListener(new abcd.gi(this, r4));     // Catch: java.lang.Throwable -> L8
        r4.setOnShowListener(new abcd.DialogInterfaceOnShowListenerhi(this));     // Catch: java.lang.Throwable -> L8
        return r4;
    }

    public java.lang.String j6(android.app.AlertDialog r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -274808525779235932L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-274808525779235932L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return FH(r5).getText().toString().trim();
    }
}
