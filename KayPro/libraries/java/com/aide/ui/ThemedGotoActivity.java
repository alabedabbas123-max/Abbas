package com.aide.ui;

@abcd.Interfacexu
public class ThemedGotoActivity extends android.app.Activity {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.ui.ThemedGotoActivity.class, 4247642077307360501L, 4247642077307360501L);
    }

    public ThemedGotoActivity() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3340893428054152485L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3340893428054152485L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @Override
    @abcd.Interfacesu(method = 411990763470359000L)
    protected void onCreate(android.os.Bundle r10) {
        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");     // Catch: java.lang.Throwable -> L11
        if (j6 == false) goto L6;
        abcd.wu.j6(-354388216425018699L, this, r10);     // Catch: java.lang.Throwable -> L11
    L6:
        super.onCreate(r10);     // Catch: java.lang.Throwable -> L11
        if (com.aide.ui.aa.lg() == false) goto L9;
        com.b.light(this, com.almlkaide.kaypro.R.style.ActivityGotoThemeLight);     // Catch: java.lang.Throwable -> L11
        return;
    L9:
        com.b.dark(this, com.almlkaide.kaypro.R.style.ActivityGotoThemeDark);     // Catch: java.lang.Throwable -> L11
        return;
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -354388216425018699L, this, r10);
    L15:
        throw th;
    }
}
