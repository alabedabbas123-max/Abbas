package abcd;

final class Runnableey implements java.lang.Runnable {
    private final abcd.dy DW;
    private final abcd.Yx j6;

    Runnableey(abcd.dy r1, abcd.Yx r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public final void run() {
        abcd.Yx r0 = (abcd.Yx) abcd.dy.j6(this.DW).j6(this.j6);     // Catch: java.lang.Exception -> L8 abcd.Xx -> L11
        if (r0 != null) goto L6;
        this.DW.j6(new java.lang.NullPointerException("Continuation returned null"));
        return;
    L6:
        r0.j6(abcd._x.DW, this.DW);
        r0.j6(abcd._x.DW, this.DW);
        r0.j6(abcd._x.DW, this.DW);
        return;
    L11:
        e = move-exception;
        if ((e.getCause() instanceof java.lang.Exception) == false) goto L16;
        abcd.dy.DW(this.DW).j6((java.lang.Exception) e.getCause());
        return;
    L16:
        abcd.dy.DW(this.DW).j6(e);
        return;
    L8:
        e = move-exception;
        abcd.dy.DW(this.DW).j6(e);
    }
}
