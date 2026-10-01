package abcd;

final class dy<TResult, TContinuationResult> implements abcd.Tx, abcd.Vx, Wx<TContinuationResult>, ny<TResult> {
    private final Sx<TResult, Yx<TContinuationResult>> DW;
    private final qy<TContinuationResult> FH;
    private final java.util.concurrent.Executor j6;

    public dy(java.util.concurrent.Executor r1, Sx<TResult, Yx<TContinuationResult>> r2, qy<TContinuationResult> r3) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
    }

    static abcd.qy DW(abcd.dy r0) {
        return r0.FH;
    }

    static abcd.Sx j6(abcd.dy r0) {
        return r0.DW;
    }

    @Override
    public final void j6() {
        this.FH.Zo();
    }

    public final void j6(Yx<TResult> r3) {
        this.j6.execute(new abcd.Runnableey(this, r3));
    }

    @Override
    public final void j6(java.lang.Exception r2) {
        this.FH.j6(r2);
    }

    public final void j6(TContinuationResult r2) {
        this.FH.j6(r2);
    }
}
