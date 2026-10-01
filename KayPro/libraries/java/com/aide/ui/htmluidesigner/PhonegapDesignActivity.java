package com.aide.ui.htmluidesigner;

@abcd.Interfacexu
public class PhonegapDesignActivity extends android.app.Activity {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -2118546787433442948L)
    private android.webkit.WebView FH;

    static {
        abcd.wu.j6(com.aide.ui.htmluidesigner.PhonegapDesignActivity.class, -3819489023773623435L, -3819489023773623435L);
    }

    public PhonegapDesignActivity() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2036479928903706065L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2036479928903706065L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @abcd.Interfacesu(method = -2740073540735548779L)
    private void j6() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 3085680960900936455L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(3085680960900936455L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if ((getIntent().getFlags() & 1048576) != 0) goto L19;
        this.FH.clearCache(true);     // Catch: java.lang.Throwable -> L12
        java.lang.String r2 = getIntent().getExtras().getString("EXTRA_URL");     // Catch: java.lang.Throwable -> L12
        if (r2 == null) goto L20;
        this.FH.loadUrl(r2);     // Catch: java.lang.Throwable -> L12
        return;
    L20:
        return;
    }

    public static void j6(android.app.Activity r8, java.lang.String r9, java.lang.String r10) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 163252865464706220L, null, r8, r9, r10);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(163252865464706220L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.Intent r0 = new android.content.Intent(r8, com.aide.ui.htmluidesigner.PhonegapDesignActivity.class);     // Catch: java.lang.Throwable -> L7
        r0.putExtra("EXTRA_URL", "file://" + r10);     // Catch: java.lang.Throwable -> L7
        r0.setFlags(268435456);     // Catch: java.lang.Throwable -> L7
        r8.startActivity(r0);     // Catch: java.lang.Throwable -> L7
    }

    @Override
    @abcd.Interfacesu(method = 787859878540190691L)
    protected void onCreate(android.os.Bundle r10) {
        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");     // Catch: java.lang.Throwable -> L11
        if (j6 == false) goto L6;
        abcd.wu.j6(524450409897726181L, this, r10);     // Catch: java.lang.Throwable -> L11
    L6:
        super.onCreate(r10);     // Catch: java.lang.Throwable -> L11
        if (abcd.F.DW() == true) goto L9;
        abcd.F.j6(this, new com.aide.ui.htmluidesigner.a(this));     // Catch: java.lang.Throwable -> L11
    L9:
        this.FH = new android.webkit.WebView(this);     // Catch: java.lang.Throwable -> L11
        this.FH.setInitialScale(100);     // Catch: java.lang.Throwable -> L11
        this.FH.setVerticalScrollBarEnabled(false);     // Catch: java.lang.Throwable -> L11
        this.FH.getSettings().setJavaScriptEnabled(true);     // Catch: java.lang.Throwable -> L11
        this.FH.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);     // Catch: java.lang.Throwable -> L11
        this.FH.getSettings().setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm.NORMAL);     // Catch: java.lang.Throwable -> L11
        setContentView(this.FH);     // Catch: java.lang.Throwable -> L11
        j6();     // Catch: java.lang.Throwable -> L11
        return;
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 524450409897726181L, this, r10);
    L15:
        throw th;
    }

    @Override
    public void onNewIntent(android.content.Intent r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2679739936008478299L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2679739936008478299L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.wu.j6(this, r5);     // Catch: java.lang.Throwable -> L8
        super.onNewIntent(r5);     // Catch: java.lang.Throwable -> L8
        setIntent(r5);     // Catch: java.lang.Throwable -> L8
        j6();     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = 2730646647400399913L)
    protected void onStart() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2524838546532506373L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2524838546532506373L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onStart();     // Catch: java.lang.Throwable -> L8
        abcd.F.DW(this, "PhoneGap Designer");     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = 307659191933929745L)
    protected void onStop() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -482060580728971405L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-482060580728971405L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onStop();     // Catch: java.lang.Throwable -> L8
        abcd.F.j6(this, "PhoneGap Designer");     // Catch: java.lang.Throwable -> L8
    }
}
