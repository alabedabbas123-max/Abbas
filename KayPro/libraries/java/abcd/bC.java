package abcd;

class bC extends abcd.FE {
    private final java.io.File DW;
    final abcd.AbstractcC.a j6;

    bC(abcd.AbstractcC.a r1, java.io.File r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    @Override
    public long DW() {
        return this.DW.length();
    }

    @Override
    public int FH() {
        return 3;
    }

    @Override
    public boolean Hw() {
        return true;
    }

    @Override
    public byte[] j6() {
        throw new abcd.cD();
    }

    @Override
    public abcd.JE v5() {
        java.io.FileInputStream r0 = new java.io.FileInputStream(this.DW);
        long r1 = r0.getChannel().size();
        return new abcd.JE.a(FH(), r1, new java.io.BufferedInputStream(r0));
    }
}
