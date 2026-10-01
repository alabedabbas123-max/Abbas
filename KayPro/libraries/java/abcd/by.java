package abcd;

final class by<TResult, TContinuationResult> implements ny<TResult> {
    private final Sx<TResult, TContinuationResult> DW;
    private final qy<TContinuationResult> FH;
    private final java.util.concurrent.Executor j6;

    public by(java.util.concurrent.Executor r1, Sx<TResult, TContinuationResult> r2, qy<TContinuationResult> r3) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
    }

    static abcd.Sx DW(abcd.by r0) {
        return r0.DW;
    }

    static abcd.qy j6(abcd.by r0) {
        return r0.FH;
    }

    public final void j6(Yx<TResult> r3) {
        this.j6.execute(new abcd.Runnablecy(this, r3));
    }
}
