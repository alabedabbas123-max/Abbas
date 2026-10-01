package io.fabric.sdk.android.services.common;

public class D {
    private final java.lang.String DW;
    private final boolean FH;
    private long Hw;
    private final java.lang.String j6;
    private long v5;

    public D(java.lang.String r1, java.lang.String r2) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = !android.util.Log.isLoggable(r2, 2);
    }

    private void FH() {
        android.util.Log.v(this.DW, this.j6 + ": " + this.v5 + "ms");
    }

    public synchronized void DW() {
        synchronized (this) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        $pc0 = 4; continue $sw0;
                    }
                    case 15: {
                        th = $ex0;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (this.FH == false) { $pc0 = 9; continue $sw0; }
                        return;
                    }
                    case 9: {
                        if (this.v5 == 0) { $pc0 = 12; continue $sw0; }
                        return;
                    }
                    case 12: {
                        try {
                            this.v5 = android.os.SystemClock.elapsedRealtime() - this.Hw;
                            FH();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 15; continue $sw0;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public synchronized void j6() {
        synchronized (this) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        $pc1 = 4; continue $sw1;
                    }
                    case 10: {
                        th = $ex1;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (this.FH == false) { $pc1 = 7; continue $sw1; }
                        return;
                    }
                    case 7: {
                        try {
                            this.Hw = android.os.SystemClock.elapsedRealtime();
                            this.v5 = 0;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 10; continue $sw1;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
