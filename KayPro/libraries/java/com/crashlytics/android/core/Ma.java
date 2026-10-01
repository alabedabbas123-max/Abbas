package com.crashlytics.android.core;

class Ma implements com.crashlytics.android.core.Sa {
    private final com.crashlytics.android.core.Sa DW;
    private boolean FH;
    private java.lang.String Hw;
    private final android.content.Context j6;

    public Ma(android.content.Context r2, com.crashlytics.android.core.Sa r3) {
        this.FH = false;
        this.j6 = r2;
        this.DW = r3;
    }

    @Override
    public java.lang.String j6() {
        if (this.FH == true) goto L5;
        this.Hw = io.fabric.sdk.android.services.common.i.Ws(this.j6);
        this.FH = true;
    L5:
        java.lang.String r0 = this.Hw;
        if (r0 == null) goto L8;
        return r0;
    L8:
        com.crashlytics.android.core.Sa r1 = this.DW;
        if (r1 != null) goto L11;
        return null;
    L11:
        return r1.j6();
    }
}
