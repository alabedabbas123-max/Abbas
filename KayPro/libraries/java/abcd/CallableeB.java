package abcd;

public class CallableeB implements java.util.concurrent.Callable<abcd.cB> {
    private boolean DW;
    private java.io.File j6;

    public CallableeB() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public abcd.cB call() {
        abcd.VE r0 = new abcd.VE();     // Catch: java.io.IOException -> L26
        if (this.DW == false) goto L5;
        r0.QX();     // Catch: java.io.IOException -> L26
    L5:
        r0.we();     // Catch: java.io.IOException -> L26
        if (this.j6 == null) goto L13;
        java.io.File r1 = this.j6;     // Catch: java.io.IOException -> L26
        if (this.DW == true) goto L11;
        r1 = new java.io.File(r1, ".git");     // Catch: java.io.IOException -> L26
    L11:
        r0.FH(r1);     // Catch: java.io.IOException -> L26
    L21:
        abcd.UE r2 = r0.j6();     // Catch: java.io.IOException -> L26
        if (r2.EQ().DW() == true) goto L24;
        r2.j6(this.DW);     // Catch: java.io.IOException -> L26
    L24:
        return new abcd.cB(r2);
    L13:
        if (r0.v5() != null) goto L21;
        java.io.File r3 = new java.io.File(".");     // Catch: java.io.IOException -> L26
        if (r3.getParentFile() == null) goto L18;
        r3 = r3.getParentFile();     // Catch: java.io.IOException -> L26
    L18:
        if (this.DW == true) goto L20;
        r3 = new java.io.File(r3, ".git");     // Catch: java.io.IOException -> L26
    L20:
        r0.FH(r3);     // Catch: java.io.IOException -> L26
    L26:
        e = move-exception;
        throw new abcd.SB(e.getMessage(), e);
    }

    @Override
    public abcd.cB call() {
        return call();
    }

    public abcd.CallableeB j6(java.io.File r1) {
        this.j6 = r1;
        return this;
    }

    public abcd.CallableeB j6(boolean r1) {
        this.DW = r1;
        return this;
    }
}
