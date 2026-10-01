package com.aide.appwizard.runtime;

@abcd.Interfacexu
class a extends android.support.v4.app.Fragment {

    @abcd.Interfacetu
    private static boolean Qq;

    @abcd.Interfaceuu
    private static boolean sy;
    final com.aide.appwizard.runtime.i.c aj;

    @abcd.Interfacevu
    final com.aide.appwizard.runtime.AppWizardActivity lp;

    static {
        abcd.wu.j6(com.aide.appwizard.runtime.a.class, 4889396902212038425L, 1275361779258238672L);
    }

    a(com.aide.appwizard.runtime.AppWizardActivity r1, com.aide.appwizard.runtime.i.c r2) {
        this.lp = r1;
        this.aj = r2;
    }

    @Override
    @abcd.Interfacesu(method = 439866003850080525L)
    public android.view.View j6(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
    L11:
        th = move-exception;
        if (sy == false) goto L15;
        abcd.wu.j6(th, 655660715125653801L, this, r9, r10, r11);
    L15:
        throw th;
    L3:
        if (Qq == false) goto L6;
        abcd.wu.j6(655660715125653801L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L11
    L6:
        if (this.aj.Hw() == null) goto L10;
        return r9.inflate(com.aide.appwizard.runtime.AppWizardActivity.j6(this.lp, "layout", this.aj.Hw()), r10, false);
    L10:
        return new android.widget.LinearLayout(this.lp);
    }
}
