package abcd;

public abstract class Yx<TResult> {
    public Yx() {
    }

    public <TContinuationResult> Yx<TContinuationResult> DW(java.util.concurrent.Executor r1, Sx<TResult, Yx<TContinuationResult>> r2) {
        throw new java.lang.UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract TResult DW();

    public abstract boolean FH();

    public abstract boolean Hw();

    public <TContinuationResult> Yx<TContinuationResult> j6(java.util.concurrent.Executor r1, Sx<TResult, TContinuationResult> r2) {
        throw new java.lang.UnsupportedOperationException("continueWith is not implemented");
    }

    public Yx<TResult> j6(java.util.concurrent.Executor r1, abcd.Tx r2) {
        throw new java.lang.UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public Yx<TResult> j6(java.util.concurrent.Executor r1, Ux<TResult> r2) {
        throw new java.lang.UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract Yx<TResult> j6(java.util.concurrent.Executor r1, abcd.Vx r2);

    public abstract Yx<TResult> j6(java.util.concurrent.Executor r1, Wx<? super TResult> r2);

    public abstract java.lang.Exception j6();

    public abstract <X extends java.lang.Throwable> TResult j6(java.lang.Class<X> r1);

    public abstract boolean v5();
}
