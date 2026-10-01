package abcd;

public class _K extends java.io.FilterInputStream {
    private int DW;
    private final abcd.VK j6;

    public _K(java.io.InputStream r1, abcd.VK r2) {
        super(r1);
        this.j6 = r2;
    }

    private void DW() {
        this.j6.j6(this.DW);
    }

    private void FH() {
        this.j6.j6();
    }

    private static java.io.InterruptedIOException Hw() {
        return new java.io.InterruptedIOException(org.eclipse.jgit.JGitText.j6().readTimedOut);
    }

    public int j6() {
        return this.DW;
    }

    public void j6(int r5) {
        if (r5 < 0) goto L6;
        this.DW = r5;
        return;
    L6:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidTimeout, new java.lang.Object[]{java.lang.Integer.valueOf(r5)}));
    }

    @Override
    public int read() {
        DW();     // Catch: java.lang.Throwable -> L5 java.io.InterruptedIOException -> L7
        int r0 = super.read();     // Catch: java.lang.Throwable -> L5 java.io.InterruptedIOException -> L7
        FH();
        return r0;
    L5:
        th = move-exception;
        FH();
        throw th;
    L8:
        throw Hw();     // Catch: java.lang.Throwable -> L5
    }

    @Override
    public int read(byte[] r3) {
        return read(r3, 0, r3.length);
    }

    @Override
    public int read(byte[] r1, int r2, int r3) {
        DW();     // Catch: java.lang.Throwable -> L5 java.io.InterruptedIOException -> L7
        int r4 = super.read(r1, r2, r3);     // Catch: java.lang.Throwable -> L5 java.io.InterruptedIOException -> L7
        FH();
        return r4;
    L5:
        th = move-exception;
        FH();
        throw th;
    L8:
        throw Hw();     // Catch: java.lang.Throwable -> L5
    }

    @Override
    public long skip(long r1) {
        DW();     // Catch: java.lang.Throwable -> L5 java.io.InterruptedIOException -> L7
        long r2 = super.skip(r1);     // Catch: java.lang.Throwable -> L5 java.io.InterruptedIOException -> L7
        FH();
        return r2;
    L5:
        th = move-exception;
        FH();
        throw th;
    L8:
        throw Hw();     // Catch: java.lang.Throwable -> L5
    }
}
