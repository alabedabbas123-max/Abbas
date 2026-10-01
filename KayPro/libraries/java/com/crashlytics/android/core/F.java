package com.crashlytics.android.core;

class F implements com.crashlytics.android.core.W.e {
    final java.lang.String DW;
    final java.lang.String FH;
    final java.lang.String Hw;
    final com.crashlytics.android.core.W Zo;
    final java.lang.String j6;
    final int v5;

    F(com.crashlytics.android.core.W r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6) {
        this.Zo = r1;
        this.j6 = r2;
        this.DW = r3;
        this.FH = r4;
        this.Hw = r5;
        this.v5 = r6;
    }

    @Override
    public void j6(java.io.FileOutputStream r3) {
        r3.write(new org.json.JSONObject(new com.crashlytics.android.core.E(this)).toString().getBytes());
    }
}
