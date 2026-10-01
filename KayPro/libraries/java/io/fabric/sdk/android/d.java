package io.fabric.sdk.android;

class d implements io.fabric.sdk.android.h {
    final int DW;
    final io.fabric.sdk.android.Fabric FH;
    final java.util.concurrent.CountDownLatch j6;

    d(io.fabric.sdk.android.Fabric r1, int r2) {
        this.FH = r1;
        this.DW = r2;
        this.j6 = new java.util.concurrent.CountDownLatch(this.DW);
    }

    @Override
    public void j6(java.lang.Exception r2) {
        io.fabric.sdk.android.Fabric.access$300(this.FH).j6(r2);
    }

    @Override
    public void j6(java.lang.Object r5) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.j6.countDown();
                    if (this.j6.getCount() != 0) { $pc0 = 6; continue $sw0; }
                    io.fabric.sdk.android.Fabric.access$200(this.FH).set(true);
                    io.fabric.sdk.android.Fabric.access$300(this.FH).j6(this.FH);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
