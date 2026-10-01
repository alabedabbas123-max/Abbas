package io.fabric.sdk.android.services.common;

class y implements io.fabric.sdk.android.services.common.z.c {
    final java.lang.StringBuilder DW;
    final io.fabric.sdk.android.services.common.z FH;
    boolean j6;

    y(io.fabric.sdk.android.services.common.z r1, java.lang.StringBuilder r2) {
        this.FH = r1;
        this.DW = r2;
        this.j6 = true;
    }

    @Override
    public void j6(java.io.InputStream r2, int r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6 == false) { $pc0 = 5; continue $sw0; }
                    this.j6 = false;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    this.DW.append(r3);
                    return;
                }
                case 5: {
                    this.DW.append(", ");
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
