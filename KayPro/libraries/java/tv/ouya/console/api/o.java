package tv.ouya.console.api;

public abstract class o<T> implements java.lang.Runnable {
    private java.lang.String DW;
    protected tv.ouya.console.api.k<T> j6;

    public o(tv.ouya.console.api.k<T> r1, java.lang.String r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    abstract void j6();

    @Override
    public void run() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        j6();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof android.os.RemoteException) { $pc0 = 4; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 4: {
                    e = $ex0;
                    android.util.Log.e("OUYASDK", "Remote exception while " + this.DW, e);
                    this.j6.j6(3003, "", new android.os.Bundle());
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
