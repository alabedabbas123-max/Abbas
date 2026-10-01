package abcd;

class XD extends java.util.zip.Inflater {
    private static final byte[] j6 = null;

    static {
        j6 = new byte[1];
    }

    XD() {
        super(false);
    }

    @Override
    public void end() {
    }

    @Override
    public int inflate(byte[] r1) {
        return super.inflate(r1);
    }

    @Override
    public int inflate(byte[] r1, int r2, int r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3 == 0) { $pc0 = 6; continue $sw0; }
                    return super.inflate(r1, r2, r3);
                }
                case 6: {
                    if (super.inflate(j6, 0, 1) > 0) { $pc0 = 9; continue $sw0; }
                    return 0;
                }
                case 9: {
                    throw new java.lang.RuntimeException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6() {
        super.end();
    }
}
