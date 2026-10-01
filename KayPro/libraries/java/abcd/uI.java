package abcd;

class uI extends java.io.PipedOutputStream {
    private final abcd.YK DW;
    final abcd.vI.a j6;

    uI(abcd.vI.a r1, java.io.PipedInputStream r2, abcd.YK r3) {
        this.j6 = r1;
        this.DW = r3;
        super(r2);
    }

    @Override
    public void close() {
        super.close();
        this.DW.join(abcd.vI.a.j6(this.j6) * 1000);     // Catch: java.lang.InterruptedException -> L5
        return;
    }

    @Override
    public void flush() {
        super.flush();
        this.DW.j6();
    }
}
