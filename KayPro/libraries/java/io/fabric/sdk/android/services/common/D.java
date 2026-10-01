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
        monitor-enter(this);
    L15:
        th = move-exception;
        throw th;
    L4:
        if (this.FH == false) goto L9;
        monitor-exit(this);
        return;
    L9:
        if (this.v5 == 0) goto L12;
        monitor-exit(this);
        return;
    L12:
        this.v5 = android.os.SystemClock.elapsedRealtime() - this.Hw;     // Catch: java.lang.Throwable -> L15
        FH();     // Catch: java.lang.Throwable -> L15
        monitor-exit(this);
    }

    public synchronized void j6() {
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L4:
        if (this.FH == false) goto L7;
        monitor-exit(this);
        return;
    L7:
        this.Hw = android.os.SystemClock.elapsedRealtime();     // Catch: java.lang.Throwable -> L10
        this.v5 = 0;     // Catch: java.lang.Throwable -> L10
        monitor-exit(this);
    }
}
