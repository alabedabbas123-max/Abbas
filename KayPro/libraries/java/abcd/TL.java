package abcd;

public class TL implements abcd.BL {
    private abcd.JL j6;

    TL(abcd.JL r1) {
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
        return new abcd._L(this.j6);
    }

    @Override
    public abcd.EL j6() {
        return new abcd.SL(abcd.XP.j6(FH()));
    }
}
