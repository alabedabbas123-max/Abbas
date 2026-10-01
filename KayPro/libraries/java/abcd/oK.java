package abcd;

class oK extends java.lang.Thread {
    private final boolean DW;
    private final java.util.concurrent.atomic.AtomicBoolean FH;
    private final java.lang.Process j6;

    oK(java.lang.Process r1, boolean r2, java.util.concurrent.atomic.AtomicBoolean r3) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
    }

    @Override
    public void run() {
        java.io.InputStream r0 = this.j6.getErrorStream();
    L12:
        e = move-exception;
        if (this.DW == false) goto L16;
        e.printStackTrace(java.lang.System.err);
    L16:
        this.FH.set(true);
    L25:
        r0.close();     // Catch: java.io.IOException -> L19
        return;
    L19:
        e = move-exception;
        if (this.DW == false) goto L23;
        e.printStackTrace(java.lang.System.err);
    L23:
        this.FH.set(true);
        return;
    L4:
        if (this.DW == false) goto L10;
    L5:
        int r2 = r0.read();     // Catch: java.io.IOException -> L12
        if (r2 == (-1)) goto L25;
        java.lang.System.err.print((char) r2);     // Catch: java.io.IOException -> L12
    L10:
        if (r0.read() != (-1)) goto L10;
        goto L25
    }
}
