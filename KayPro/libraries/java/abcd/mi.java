package abcd;

@abcd.Interfacexu
public class mi extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfaceru(field = -3007542551360420601L)
    private android.app.AlertDialog gn;

    static {
        abcd.wu.j6(abcd.mi.class, 1714930153382168671L, 1714930153382168671L);
    }

    public mi() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -25279815504965840L, null);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-25279815504965840L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @Override
    @abcd.Interfacesu(method = 213038001807726051L)
    protected android.app.Dialog j6(android.app.Activity r11) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 861182796774363973L, this, r11);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(861182796774363973L, this, r11);     // Catch: java.lang.Throwable -> L8
    L6:
        android.text.Spanned r3 = android.text.Html.fromHtml(com.aide.ui.U.vy().QX());     // Catch: java.lang.Throwable -> L8
        android.widget.TextView r4 = new android.widget.TextView(r11);     // Catch: java.lang.Throwable -> L8
        r4.setPadding((int) (r11.getResources().getDisplayMetrics().density * 10.0f), (int) (r11.getResources().getDisplayMetrics().density * 10.0f), (int) (r11.getResources().getDisplayMetrics().density * 10.0f), (int) (r11.getResources().getDisplayMetrics().density * 10.0f));     // Catch: java.lang.Throwable -> L8
        r4.setText(r3);     // Catch: java.lang.Throwable -> L8
        android.widget.ScrollView r5 = new android.widget.ScrollView(r11);     // Catch: java.lang.Throwable -> L8
        r5.addView(r4);     // Catch: java.lang.Throwable -> L8
        android.app.AlertDialog.Builder r6 = new android.app.AlertDialog.Builder(r11);     // Catch: java.lang.Throwable -> L8
        r6.setView(r5).setCancelable(true).setPositiveButton(com.almlkaide.kaypro.R.string.dialog_ok, new abcd.DialogInterfaceOnClickListenerli(this)).setNeutralButton(com.almlkaide.kaypro.R.string.dialog_project_properties_build_variants, new abcd.DialogInterfaceOnClickListenerC0963ki(this));     // Catch: java.lang.Throwable -> L8
        r6.setTitle(r11.getResources().getString(com.almlkaide.kaypro.R.string.dialog_project_properties_title, new java.lang.Object[]{"'" + abcd.Vl.tp(com.aide.ui.U.vy().J0()) + "'"}));     // Catch: java.lang.Throwable -> L8
        this.gn = r6.create();     // Catch: java.lang.Throwable -> L8
        return this.gn;
    }
}
