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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -25279815504965840L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-25279815504965840L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 213038001807726051L)
    protected android.app.Dialog j6(android.app.Activity r11) {
        android.text.Spanned r3 = null;
        android.widget.TextView r4 = null;
        android.widget.ScrollView r5 = null;
        android.app.AlertDialog.Builder r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (VH == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 861182796774363973L, this, r11);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(861182796774363973L, this, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        r3 = android.text.Html.fromHtml(com.aide.ui.U.vy().QX());
                        r4 = new android.widget.TextView(r11);
                        r4.setPadding((int) (r11.getResources().getDisplayMetrics().density * 10.0f), (int) (r11.getResources().getDisplayMetrics().density * 10.0f), (int) (r11.getResources().getDisplayMetrics().density * 10.0f), (int) (r11.getResources().getDisplayMetrics().density * 10.0f));
                        r4.setText(r3);
                        r5 = new android.widget.ScrollView(r11);
                        r5.addView(r4);
                        r6 = new android.app.AlertDialog.Builder(r11);
                        r6.setView(r5).setCancelable(true).setPositiveButton(com.almlkaide.kaypro.R.string.dialog_ok, new abcd.DialogInterfaceOnClickListenerli(this)).setNeutralButton(com.almlkaide.kaypro.R.string.dialog_project_properties_build_variants, new abcd.DialogInterfaceOnClickListenerC0963ki(this));
                        r6.setTitle(r11.getResources().getString(com.almlkaide.kaypro.R.string.dialog_project_properties_title, new java.lang.Object[]{"'" + abcd.Vl.tp(com.aide.ui.U.vy().J0()) + "'"}));
                        this.gn = r6.create();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    return this.gn;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
