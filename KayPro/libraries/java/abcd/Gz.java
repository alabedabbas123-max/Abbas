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
        byte[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new byte[abcd.Hz.j6(this.v5)];
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    r1 = this.FH.read(r0);
                    if (r1 == (-1)) { $pc0 = 7; continue $sw0; }
                    this.Hw.write(r0, 0, r1);
                    { $pc0 = 3; continue $sw0; }
                }
                case 7: {
                    return this.v5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.Object m6DW() {
        return DW();
    }
}
