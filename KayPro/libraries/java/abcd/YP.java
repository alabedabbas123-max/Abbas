package abcd;

public class YP extends java.io.OutputStream {
    private java.io.OutputStream DW;
    private java.io.OutputStream j6;

    public YP(java.io.OutputStream r1, java.io.OutputStream r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    @Override
    public void close() {
        this.j6.close();
        this.DW.close();
    }

    @Override
    public void flush() {
        this.j6.flush();
        this.DW.flush();
    }

    @Override
    public void write(int r2) {
        this.j6.write(r2);
        this.DW.write(r2);
    }

    @Override
    public void write(byte[] r2) {
        this.j6.write(r2);
        this.DW.write(r2);
    }

    @Override
    public void write(byte[] r2, int r3, int r4) {
        this.j6.write(r2, r3, r4);
        this.DW.write(r2, r3, r4);
    }
}
