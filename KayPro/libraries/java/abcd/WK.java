package abcd;

public class WK extends java.io.Writer {
    private final java.io.OutputStreamWriter DW;
    private final java.io.ByteArrayOutputStream j6;

    public WK() {
        this.j6 = new java.io.ByteArrayOutputStream();
        this.DW = new java.io.OutputStreamWriter(j6(), abcd.hE.Zo);
    }

    @Override
    public void close() {
    }

    @Override
    public void flush() {
    }

    public java.io.OutputStream j6() {
        return this.j6;
    }

    public java.lang.String toString() {
        return abcd.IK.j6(this.j6.toByteArray());
    }

    @Override
    public void write(char[] r3, int r4, int r5) {
        java.io.ByteArrayOutputStream r0 = this.j6;
        monitor-enter(r0);
        this.DW.write(r3, r4, r5);     // Catch: java.lang.Throwable -> L7
        this.DW.flush();     // Catch: java.lang.Throwable -> L7
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
