package abcd;

public class tw {
    private final boolean DW;
    private java.io.RandomAccessFile FH;
    private java.nio.channels.FileLock Hw;
    private final java.io.File j6;

    public tw(java.io.File r1, boolean r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    public void DW() {
        java.io.RandomAccessFile r0 = this.FH;
        if (r0 != null) goto L12;
        return;
    L12:
        r0.close();     // Catch: java.lang.Throwable -> L9
        this.FH = null;
        this.Hw = null;
        return;
    L9:
        th = move-exception;
        this.FH = null;
        this.Hw = null;
        throw th;
    }

    public void j6() {
        if (this.Hw == null) goto L5;
        return;
    L5:
        this.FH = new java.io.RandomAccessFile(this.j6, "rw");
        this.Hw = this.FH.getChannel().lock(0, Long.MAX_VALUE, this.DW);     // Catch: java.io.IOException -> L8
        return;
    L8:
        e = move-exception;
        this.FH.close();     // Catch: java.io.IOException -> L12
    L10:
        this.FH = null;
        throw e;
    }
}
