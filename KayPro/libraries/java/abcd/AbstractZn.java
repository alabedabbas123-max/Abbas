package abcd;

public abstract class AbstractZn extends abcd.AbstractVn {
    public AbstractZn(abcd.Xn r1, abcd.hs r2, abcd.cs r3) {
        super(r1, r2, r3);
    }

    @Override
    public final int DW() {
        return Zo().DW().j6();
    }

    @Override
    public final abcd.AbstractVn DW(int r2) {
        return j6(gn().v5(r2));
    }

    @Override
    protected final java.lang.String j6(boolean r2) {
        return Zo().DW().DW(this, r2);
    }

    @Override
    public final void j6(abcd.Lt r2) {
        Zo().DW().j6(r2, this);
    }
}
