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
        j6();     // Catch: android.os.RemoteException -> L4
        return;
    L4:
        e = move-exception;
        android.util.Log.e("OUYASDK", "Remote exception while " + this.DW, e);
        this.j6.j6(3003, "", new android.os.Bundle());
    }
}
