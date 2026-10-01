package abcd;

final class Runnablecy implements java.lang.Runnable {
    private final abcd.by DW;
    private final abcd.Yx j6;

    Runnablecy(abcd.by r1, abcd.Yx r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public final void run() {
        if (this.j6.FH() == false) goto L19;
        abcd.by.j6(this.DW).Zo();
        return;
    L19:
        java.lang.Object r0 = abcd.by.DW(this.DW).j6(this.j6);     // Catch: java.lang.Exception -> L9 abcd.Xx -> L12
        abcd.by.j6(this.DW).j6(r0);
        return;
    L12:
        e = move-exception;
        if ((e.getCause() instanceof java.lang.Exception) == false) goto L17;
        abcd.by.j6(this.DW).j6((java.lang.Exception) e.getCause());
        return;
    L17:
        abcd.by.j6(this.DW).j6(e);
        return;
    L9:
        e = move-exception;
        abcd.by.j6(this.DW).j6(e);
    }
}
