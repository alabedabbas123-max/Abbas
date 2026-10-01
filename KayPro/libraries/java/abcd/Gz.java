package abcd;

class Gz extends Hz.a<abcd.Hz> {
    final java.io.InputStream FH;
    final java.io.OutputStream Hw;
    final abcd.Hz v5;

    Gz(abcd.Hz r1, java.io.Closeable r2, boolean r3, java.io.InputStream r4, java.io.OutputStream r5) {
        this.v5 = r1;
        this.FH = r4;
        this.Hw = r5;
        super(r2, r3);
    }

    public abcd.Hz DW() {
        byte[] r0 = new byte[abcd.Hz.j6(this.v5)];
    L3:
        int r1 = this.FH.read(r0);
        if (r1 == (-1)) goto L7;
        this.Hw.write(r0, 0, r1);
        goto L3
    L7:
        return this.v5;
    }

    public java.lang.Object m6DW() {
        return DW();
    }
}
