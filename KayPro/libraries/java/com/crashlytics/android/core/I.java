package com.crashlytics.android.core;

class I implements com.crashlytics.android.core.W.e {
    final com.crashlytics.android.core.W DW;
    final boolean j6;

    I(com.crashlytics.android.core.W r1, boolean r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public void j6(java.io.FileOutputStream r3) {
        r3.write(new org.json.JSONObject(new com.crashlytics.android.core.H(this)).toString().getBytes());
    }
}
