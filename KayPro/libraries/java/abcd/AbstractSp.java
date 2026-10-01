package abcd;

public abstract class AbstractSp extends abcd.AbstractKp {
    public AbstractSp(java.lang.String r1, abcd.jp r2, int r3) {
        super(r1, r2, r3);
    }

    @Override
    protected final void FH(abcd.Lt r5) {
        abcd.jp r0 = DW();
        int r1 = j6();
        java.util.Iterator<? extends abcd.Abstractvp> r2 = Hw().iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        r2.next().j6(r0, r5);
        r5.Hw(r1);
        goto L4
    }

    @Override
    protected final void Zo() {
        abcd.jp r0 = DW();
        tp();
        java.util.Iterator<? extends abcd.Abstractvp> r1 = Hw().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        r1.next().j6(r0);
        goto L4
    }

    @Override
    public final int j6(abcd.Abstractvp r2) {
        abcd.Abstractup r3 = (abcd.Abstractup) r2;
        return j6(r3.we() * r3.VH());
    }

    protected abstract void tp();

    @Override
    public final int u7() {
        java.util.Collection<? extends abcd.Abstractvp> r0 = Hw();
        int r1 = r0.size();
        if (r1 != 0) goto L7;
        return 0;
    L7:
        return r1 * r0.iterator().next().VH();
    }
}
