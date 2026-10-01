package abcd;

public class qM implements abcd.BL {
    private abcd.HM j6;

    qM(abcd.HM r1) {
        this.j6 = r1;
    }

    @Override
    public abcd.EL DW() {
        return j6();
    L4:
        e = move-exception;
        throw new abcd.DL("IOException converting stream to byte array: " + e.getMessage(), e);
    }

    @Override
    public java.io.InputStream FH() {
        return this.j6;
    }

    @Override
    public abcd.EL j6() {
        return new abcd.pM(this.j6.DW());
    }
}
