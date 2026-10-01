package abcd;

public class XK extends java.io.BufferedOutputStream {
    public XK(java.io.OutputStream r1) {
        super(r1);
    }

    public XK(java.io.OutputStream r1, int r2) {
        super(r1);
    }

    @Override
    public void close() {
        flush();     // Catch: java.lang.Throwable -> L5
        super.close();
        return;
    L5:
        th = move-exception;
        super.close();
        throw th;
    }
}
