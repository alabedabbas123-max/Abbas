package abcd;

class Vy<Result> extends java.util.concurrent.FutureTask<Result> {
    final abcd.Xy j6;

    Vy(abcd.Xy r1, java.util.concurrent.Callable r2) {
        this.j6 = r1;
        super(r2);
    }

    @Override
    protected void done() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        abcd.Xy.DW(this.j6, get());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.util.concurrent.CancellationException) { $pc0 = 4; continue $sw0; }
                        if ($t instanceof java.util.concurrent.ExecutionException) { $pc0 = 5; continue $sw0; }
                        if ($t instanceof java.lang.InterruptedException) { $pc0 = 8; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    return;
                }
                case 8: {
                    e = $ex0;
                    android.util.Log.w("AsyncTask", e);
                    return;
                }
                case 4: {
                    abcd.Xy.DW(this.j6, null);
                    return;
                }
                case 5: {
                    e = $ex0;
                    throw new java.lang.RuntimeException("An error occured while executing doInBackground()", e.getCause());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
