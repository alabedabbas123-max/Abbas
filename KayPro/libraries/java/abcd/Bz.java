package abcd;

public class Bz implements java.lang.Runnable {
    private final abcd.Interfacexz DW;
    private final android.content.Context j6;

    public Bz(android.content.Context r1, abcd.Interfacexz r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    @Override
    public void run() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        io.fabric.sdk.android.services.common.i.FH(this.j6, "Performing time based file roll over.");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 6; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.DW.j6() == true) { $pc0 = 11; continue $sw0; }
                    try {
                        this.DW.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 6; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 11: {
                    return;
                }
                case 6: {
                    e = $ex0;
                    io.fabric.sdk.android.services.common.i.j6(this.j6, "Failed to roll over file", e);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
