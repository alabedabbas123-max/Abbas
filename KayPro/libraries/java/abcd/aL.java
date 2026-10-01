package abcd;

public class aL extends java.io.OutputStream {
    private final abcd.VK DW;
    private int FH;
    private final java.io.OutputStream j6;

    public aL(java.io.OutputStream r1, abcd.VK r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    private void DW() {
        this.DW.j6();
    }

    private static java.io.InterruptedIOException FH() {
        return new java.io.InterruptedIOException(org.eclipse.jgit.JGitText.j6().writeTimedOut);
    }

    private void j6() {
        this.DW.j6(this.FH);
    }

    @Override
    public void close() {
        j6();     // Catch: java.lang.Throwable -> L5 java.io.InterruptedIOException -> L7
        this.j6.close();     // Catch: java.lang.Throwable -> L5 java.io.InterruptedIOException -> L7
        DW();
        return;
    L5:
        th = move-exception;
        DW();
        throw th;
    L8:
        throw FH();     // Catch: java.lang.Throwable -> L5
    }

    @Override
    public void flush() {
        j6();     // Catch: java.lang.Throwable -> L5 java.io.InterruptedIOException -> L7
        this.j6.flush();     // Catch: java.lang.Throwable -> L5 java.io.InterruptedIOException -> L7
        DW();
        return;
    L5:
        th = move-exception;
        DW();
        throw th;
    L8:
        throw FH();     // Catch: java.lang.Throwable -> L5
    }

    public void j6(int r5) {
        if (r5 < 0) goto L6;
        this.FH = r5;
        return;
    L6:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidTimeout, new java.lang.Object[]{java.lang.Integer.valueOf(r5)}));
    }

    @Override
    public void write(int r2) {
        j6();     // Catch: java.lang.Throwable -> L5 java.io.InterruptedIOException -> L7
        this.j6.write(r2);     // Catch: java.lang.Throwable -> L5 java.io.InterruptedIOException -> L7
        DW();
        return;
    L5:
        th = move-exception;
        DW();
        throw th;
    L8:
        throw FH();     // Catch: java.lang.Throwable -> L5
    }

    @Override
    public void write(byte[] r3) {
        write(r3, 0, r3.length);
    }

    @Override
    public void write(byte[] r2, int r3, int r4) {
        j6();     // Catch: java.lang.Throwable -> L5 java.io.InterruptedIOException -> L7
        this.j6.write(r2, r3, r4);     // Catch: java.lang.Throwable -> L5 java.io.InterruptedIOException -> L7
        DW();
        return;
    L5:
        th = move-exception;
        DW();
        throw th;
    L8:
        throw FH();     // Catch: java.lang.Throwable -> L5
    }
}
