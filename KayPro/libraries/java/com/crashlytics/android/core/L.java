package com.crashlytics.android.core;

class L implements com.crashlytics.android.core.W.e {
    final int DW;
    final long FH;
    final long Hw;
    final int VH;
    final java.util.Map Zo;
    final com.crashlytics.android.core.W gn;
    final int j6;
    final boolean v5;

    L(com.crashlytics.android.core.W r1, int r2, int r3, long r4, long r6, boolean r8, java.util.Map r9, int r10) {
        this.gn = r1;
        this.j6 = r2;
        this.DW = r3;
        this.FH = r4;
        this.Hw = r6;
        this.v5 = r8;
        this.Zo = r9;
        this.VH = r10;
    }

    @Override
    public void j6(java.io.FileOutputStream r3) {
        r3.write(new org.json.JSONObject(new com.crashlytics.android.core.K(this)).toString().getBytes());
    }
}
