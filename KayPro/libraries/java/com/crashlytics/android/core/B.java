package com.crashlytics.android.core;

class B implements com.crashlytics.android.core.W.e {
    final java.lang.String DW;
    final long FH;
    final com.crashlytics.android.core.W Hw;
    final java.lang.String j6;

    B(com.crashlytics.android.core.W r1, java.lang.String r2, java.lang.String r3, long r4) {
        this.Hw = r1;
        this.j6 = r2;
        this.DW = r3;
        this.FH = r4;
    }

    @Override
    public void j6(java.io.FileOutputStream r3) {
        r3.write(new org.json.JSONObject(new com.crashlytics.android.core.A(this)).toString().getBytes());
    }
}
