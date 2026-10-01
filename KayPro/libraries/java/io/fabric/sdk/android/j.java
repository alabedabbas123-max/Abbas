package io.fabric.sdk.android;

class j<Result> extends ez<java.lang.Void, java.lang.Void, Result> {
    final io.fabric.sdk.android.Kit<Result> QX;

    public j(io.fabric.sdk.android.Kit<Result> r1) {
        this.QX = r1;
    }

    private io.fabric.sdk.android.services.common.D j6(java.lang.String r4) {
        io.fabric.sdk.android.services.common.D r0 = new io.fabric.sdk.android.services.common.D(this.QX.getIdentifier() + "." + r4, "KitInitialization");
        r0.j6();
        return r0;
    }

    protected void DW(Result r2) {
        this.QX.onCancelled(r2);
        this.QX.initializationCallback.j6(new io.fabric.sdk.android.i(this.QX.getIdentifier() + " Initialization was cancelled"));
    }

    protected void FH(Result r2) {
        this.QX.onPostExecute(r2);
        this.QX.initializationCallback.j6(r2);
    }

    protected void VH() {
        super.VH();
        io.fabric.sdk.android.services.common.D r0 = j6("onPreExecute");
        boolean r2 = this.QX.onPreExecute();     // Catch: java.lang.Throwable -> L7 java.lang.Exception -> L9 abcd.mz -> L13
        r0.DW();
        if (r2 == true) goto L12;
    L6:
        DW(true);
        return;
    L12:
        return;
    L7:
        th = move-exception;
        r0.DW();
        DW(true);
        throw th;
    L13:
        e = move-exception;
        throw e;     // Catch: java.lang.Throwable -> L7
    L9:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Failure onPreExecute()", e);     // Catch: java.lang.Throwable -> L7
        r0.DW();
        goto L6
    }

    protected java.lang.Object j6(java.lang.Object[] r1) {
        return j6((java.lang.Void[]) r1);
    }

    protected Result j6(java.lang.Void... r2) {
        io.fabric.sdk.android.services.common.D r3 = j6("doInBackground");
        if (Zo() == true) goto L5;
        Result r0 = this.QX.doInBackground();
    L6:
        r3.DW();
        return r0;
    L5:
        r0 = null;
        goto L6
    }

    public abcd.Enumcz v5() {
        return abcd.Enumcz.FH;
    }
}
