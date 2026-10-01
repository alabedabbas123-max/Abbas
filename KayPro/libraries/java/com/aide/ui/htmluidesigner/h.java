package com.aide.ui.htmluidesigner;

@abcd.Interfacexu
class h implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.content.Context FH;

    static {
        abcd.wu.j6(com.aide.ui.htmluidesigner.h.class, -3499094272017024501L, -3746680754669148701L);
    }

    h(android.content.Context r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -93043306573545592L)
    public void run() {
        java.io.BufferedReader r3 = null;
        java.lang.String r2 = null;
        android.content.Intent r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 14: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 19; continue $sw0; }
                    abcd.wu.j6(th, -2487501988396112309L, this);
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 22; continue $sw0; }
                    try {
                        abcd.wu.j6(-2487501988396112309L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    $pc0 = 22; continue $sw0;
                }
                case 22: {
                    try {
                        r3 = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.Runtime.getRuntime().exec("logcat -v threadtime").getInputStream()), 20);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 21; continue $sw0; }
                        $pc0 = 14; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    try {
                        r2 = r3.readLine();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 21; continue $sw0; }
                        $pc0 = 14; continue $sw0;
                    }
                    if (r2 == null) { $pc0 = 31; continue $sw0; }
                    if (r2.contains("console.log") == false) { $pc0 = 7; continue $sw0; }
                    try {
                        r4 = new android.content.Intent();
                        r4.setPackage("com.aide.ui");
                        r4.setAction("com.aide.runtime.VIEW_LOGCAT_ENTRY");
                        r4.putExtra("lines", new java.lang.String[]{r2});
                        this.FH.sendBroadcast(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 21; continue $sw0; }
                        $pc0 = 14; continue $sw0;
                    }
                    $pc0 = 31; continue $sw0;
                }
                case 31: {
                    return;
                }
                case 21: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
