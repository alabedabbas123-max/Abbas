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
        io.fabric.sdk.android.services.common.D r0 = null;
        boolean r2 = false;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super.VH();
                    r0 = j6("onPreExecute");
                    try {
                        r2 = this.QX.onPreExecute();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 9; continue $sw0; }
                        if ($t instanceof abcd.mz) { $pc0 = 13; continue $sw0; }
                        $pc0 = 7; continue $sw0;
                    }
                    r0.DW();
                    if (r2 == true) { $pc0 = 12; continue $sw0; }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    DW(true);
                    return;
                }
                case 12: {
                    return;
                }
                case 7: {
                    th = $ex0;
                    r0.DW();
                    DW(true);
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 13: {
                    e = $ex0;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                }
                case 9: {
                    e = $ex0;
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Failure onPreExecute()", e);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    r0.DW();
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected java.lang.Object j6(java.lang.Object[] r1) {
        return j6((java.lang.Void[]) r1);
    }

    protected Result j6(java.lang.Void... r2) {
        io.fabric.sdk.android.services.common.D r3 = null;
        Result r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r3 = j6("doInBackground");
                    if (Zo() == true) { $pc1 = 5; continue $sw1; }
                    r0 = this.QX.doInBackground();
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r3.DW();
                    return r0;
                }
                case 5: {
                    r0 = null;
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Enumcz v5() {
        return abcd.Enumcz.FH;
    }
}
