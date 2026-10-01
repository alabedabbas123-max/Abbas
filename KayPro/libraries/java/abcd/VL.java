package abcd;

public class VL implements abcd.GL {
    private abcd.JL j6;

    VL(abcd.JL r1) {
        this.j6 = r1;
    }

    @Override
    public abcd.EL DW() {
        return j6();
    L4:
        e = move-exception;
        throw new java.lang.IllegalStateException(e.getMessage());
    }

    @Override
    public abcd.EL j6() {
        return new abcd.UL(this.j6.DW());
    }
}
