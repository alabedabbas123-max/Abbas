package abcd;

public class YK extends java.lang.Thread {
    private final java.io.OutputStream DW;
    private volatile boolean FH;
    private final java.io.InputStream j6;

    public YK(java.io.InputStream r3, java.io.OutputStream r4) {
        setName(java.lang.String.valueOf(java.lang.Thread.currentThread().getName()) + "-StreamCopy");
        this.j6 = r3;
        this.DW = r4;
    }

    public void DW() {
    L2:
        join(250);
        if (isAlive() == false) goto L5;
        this.FH = true;
        interrupt();
        goto L2
    }

    public void j6() {
        interrupt();
    }

    @Override
    public void run() {
        byte[] r0 = new byte[1024];     // Catch: java.lang.Throwable -> L23
        int r2 = 0;
    L5:
        if (r2 <= 0) goto L8;
        this.DW.flush();     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L23
        r2 = r2 - 1;     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L23
    L36:
        this.j6.close();     // Catch: java.io.IOException -> L30
    L34:
        this.DW.close();     // Catch: java.io.IOException -> L31
        return;
    L56:
        return;
    L8:
        if (this.FH == true) goto L36;
        int r3 = this.j6.read(r0);     // Catch: java.io.InterruptedIOException -> L19 java.io.IOException -> L29 java.lang.Throwable -> L23
        if (r3 < 0) goto L36;
        boolean r4 = false;
    L44:
        this.DW.write(r0, 0, r3);     // Catch: java.io.InterruptedIOException -> L18 java.io.IOException -> L29 java.lang.Throwable -> L23
        if (r4 == false) goto L5;
        interrupt();     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L23
    L18:
        r4 = true;
    L19:
        r2 = r2 + 1;
    L23:
        th = move-exception;
        this.j6.close();     // Catch: java.io.IOException -> L32
    L38:
        this.DW.close();     // Catch: java.io.IOException -> L33
    L27:
        throw th;
    }
}
