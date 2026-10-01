package abcd;

class Vy<Result> extends java.util.concurrent.FutureTask<Result> {
    final abcd.Xy j6;

    Vy(abcd.Xy r1, java.util.concurrent.Callable r2) {
        this.j6 = r1;
        super(r2);
    }

    @Override
    protected void done() {
        abcd.Xy.DW(this.j6, get());     // Catch: java.util.concurrent.CancellationException -> L4 java.util.concurrent.ExecutionException -> L5 java.lang.InterruptedException -> L8
    L14:
        return;
    L8:
        e = move-exception;
        android.util.Log.w("AsyncTask", e);
        return;
    L4:
        abcd.Xy.DW(this.j6, null);
        return;
    L5:
        e = move-exception;
        throw new java.lang.RuntimeException("An error occured while executing doInBackground()", e.getCause());
    }
}
