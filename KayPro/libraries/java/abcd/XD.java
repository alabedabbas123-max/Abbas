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
        if (r3 == 0) goto L6;
        return super.inflate(r1, r2, r3);
    L6:
        if (super.inflate(j6, 0, 1) > 0) goto L9;
        return 0;
    L9:
        throw new java.lang.RuntimeException();
    }

    void j6() {
        super.end();
    }
}
