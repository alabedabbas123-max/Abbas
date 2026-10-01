package abcd;

public class XL implements abcd.IL {
    private abcd.JL j6;

    XL(abcd.JL r1) {
        this.j6 = r1;
    }

    @Override
    public abcd.EL DW() {
        return j6();
    L4:
        e = move-exception;
        throw new abcd.DL(e.getMessage(), e);
    }

    @Override
    public abcd.EL j6() {
        return new abcd.WL(this.j6.DW());
    }
}
