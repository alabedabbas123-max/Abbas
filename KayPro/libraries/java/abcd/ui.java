package abcd;

@abcd.Interfacexu
public class ui extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    static {
        abcd.wu.j6(abcd.ui.class, -4195144536276187105L, -4195144536276187105L);
    }

    public ui() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -4910576453537338584L, null);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-4910576453537338584L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    static boolean DW(abcd.ui r0, android.app.AlertDialog r1) {
        return r0.FH(r1);
    }

    @abcd.Interfacesu(method = -2219398116819319803L)
    private boolean FH(android.app.AlertDialog r5) {
    L13:
        th = move-exception;
        if (VH == false) goto L17;
        abcd.wu.j6(th, -878408223698140944L, this, r5);
    L17:
        throw th;
    L4:
        if (Zo == false) goto L7;
        abcd.wu.j6(-878408223698140944L, this, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if (Zo(r5).length() == 0) goto L11;
        if (gn(r5).equals(Zo(r5)) == true) goto L11;
        return true;
    L11:
        return false;
    }

    @abcd.Interfacesu(method = -5573960183748699008L)
    private void Hw(android.app.AlertDialog r6) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 4274518944532211235L, this, r6);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(4274518944532211235L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r6.getContext().getSystemService("input_method");     // Catch: java.lang.Throwable -> L8
        r2.hideSoftInputFromWindow(v5(r6).getWindowToken(), 0);     // Catch: java.lang.Throwable -> L8
        r2.hideSoftInputFromWindow(VH(r6).getWindowToken(), 0);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -2150265422598495135L)
    private android.widget.EditText VH(android.app.AlertDialog r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 2846712913976042272L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(2846712913976042272L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.replaceWithText);
    }

    @abcd.Interfacesu(method = 640147955846519265L)
    private java.lang.String Zo(android.app.AlertDialog r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 142505698703918356L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(142505698703918356L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return v5(r5).getText().toString();
    }

    @abcd.Interfacesu(method = -362242430075187200L)
    private java.lang.String gn(android.app.AlertDialog r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -627713647852890783L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-627713647852890783L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return VH(r5).getText().toString();
    }

    static void j6(abcd.ui r0, android.app.AlertDialog r1) {
        r0.Hw(r1);
    }

    @abcd.Interfacesu(method = -2822391206186049720L)
    private android.widget.EditText v5(android.app.AlertDialog r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 2180589482704515701L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(2180589482704515701L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.replaceFindText);
    }

    @abcd.Interfacesu(method = -2592561645331515781L)
    protected void DW(android.app.AlertDialog r5) {
    L10:
        th = move-exception;
        if (VH == false) goto L14;
        abcd.wu.j6(th, 678975074223110868L, this, r5);
    L14:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(678975074223110868L, this, r5);     // Catch: java.lang.Throwable -> L10
    L6:
        android.widget.Button r2 = r5.getButton(-1);     // Catch: java.lang.Throwable -> L10
        if (r2 == null) goto L17;
        r2.setEnabled(FH(r5));     // Catch: java.lang.Throwable -> L10
        return;
    }

    @Override
    @abcd.Interfacesu(method = 1853749979640786432L)
    protected android.app.Dialog j6(android.app.Activity r10) {
    L17:
        th = move-exception;
        if (VH == false) goto L21;
        abcd.wu.j6(th, 1345564862924095537L, this, r10);
    L21:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(1345564862924095537L, this, r10);     // Catch: java.lang.Throwable -> L17
    L6:
        abcd.Tl r2 = com.aide.ui.U.lg().J8().getCurrentFileSpan();     // Catch: java.lang.Throwable -> L17
        java.lang.String r3 = "";
        if (r2.Hw == r2.Zo) goto L9;
    L11:
        android.view.View r4 = android.view.LayoutInflater.from(r10).inflate(com.almlkaide.kaypro.R.layout.replace, null);     // Catch: java.lang.Throwable -> L17
        android.app.AlertDialog.Builder r5 = new android.app.AlertDialog.Builder(r10);     // Catch: java.lang.Throwable -> L17
        r5.setTitle(com.almlkaide.kaypro.R.string.command_replace_textually).setView(r4).setCancelable(true).setPositiveButton(com.almlkaide.kaypro.R.string.dialog_replace, new abcd.DialogInterfaceOnClickListeneroi(this)).setNegativeButton(com.almlkaide.kaypro.R.string.dialog_cancel, new abcd.DialogInterfaceOnClickListenerni(this));     // Catch: java.lang.Throwable -> L17
        android.app.AlertDialog r6 = r5.create();     // Catch: java.lang.Throwable -> L17
        android.widget.EditText r7 = (android.widget.EditText) r4.findViewById(com.almlkaide.kaypro.R.id.replaceFindText);     // Catch: java.lang.Throwable -> L17
        android.widget.EditText r8 = (android.widget.EditText) r4.findViewById(com.almlkaide.kaypro.R.id.replaceWithText);     // Catch: java.lang.Throwable -> L17
        android.widget.TextView r9 = (android.widget.TextView) r4.findViewById(com.almlkaide.kaypro.R.id.replaceScope);     // Catch: java.lang.Throwable -> L17
        if (r2.Hw != r2.Zo) goto L14;
        r9.setText(com.almlkaide.kaypro.R.string.dialog_replace_message_in_this_file);     // Catch: java.lang.Throwable -> L17
    L15:
        r7.setText(r3);     // Catch: java.lang.Throwable -> L17
        r7.setOnKeyListener(new abcd.ViewOnKeyListenerpi(this, r8));     // Catch: java.lang.Throwable -> L17
        r7.addTextChangedListener(new abcd.qi(this, r6));     // Catch: java.lang.Throwable -> L17
        r8.setText(r3);     // Catch: java.lang.Throwable -> L17
        r8.setOnKeyListener(new abcd.ViewOnKeyListenerri(this, r6));     // Catch: java.lang.Throwable -> L17
        r8.addTextChangedListener(new abcd.si(this, r6));     // Catch: java.lang.Throwable -> L17
        r6.getWindow().setSoftInputMode(2);     // Catch: java.lang.Throwable -> L17
        r6.setOnShowListener(new abcd.DialogInterfaceOnShowListenerti(this, r7));     // Catch: java.lang.Throwable -> L17
        return r6;
    L14:
        r9.setText(com.almlkaide.kaypro.R.string.dialog_replace_message_in_selected_lines);     // Catch: java.lang.Throwable -> L17
        goto L15
    L9:
        if (r2.v5 == r2.VH) goto L11;
        r3 = com.aide.ui.U.lg().J8().getSelectionContent().trim();     // Catch: java.lang.Throwable -> L17
        goto L11
    }

    @abcd.Interfacesu(method = -363263751922773952L)
    protected void j6(android.app.AlertDialog r20) {
    L11:
        th = move-exception;
        if (VH == false) goto L15;
        abcd.wu.j6(th, -982286731689318033L, this, r20);
    L15:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-982286731689318033L, this, r20);     // Catch: java.lang.Throwable -> L11
    L6:
        java.lang.String r11 = Zo(r20);     // Catch: java.lang.Throwable -> L11
        java.lang.String r12 = gn(r20);     // Catch: java.lang.Throwable -> L11
        abcd.Tl r0 = com.aide.ui.U.lg().J8().getCurrentFileSpan();     // Catch: java.lang.Throwable -> L11
        if (r0.Hw != r0.Zo) goto L9;
        r0 = new abcd.Tl(r0.FH, 1, 1, Integer.MAX_VALUE, 1);     // Catch: java.lang.Throwable -> L11
    L9:
        com.aide.ui.U.EQ().j6(r0.FH, r0.Hw, r0.v5, r0.Zo, r0.VH, r11, r12);     // Catch: java.lang.Throwable -> L11
    }
}
