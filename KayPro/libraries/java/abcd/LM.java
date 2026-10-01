package abcd;

class LM extends abcd.FL {
    private byte[] DW;

    LM(byte[] r1) {
        this.DW = r1;
    }

    private void we() {
        abcd.KM r0 = new abcd.KM(this.DW);
    L4:
        if (r0.hasMoreElements() == false) goto L5;
        this.j6.addElement(r0.nextElement());
        goto L4
    L5:
        this.DW = null;
    }

    @Override
    abcd.EL VH() {
        if (this.DW == null) goto L6;
        we();
    L6:
        return super.VH();
    }

    @Override
    abcd.EL gn() {
        if (this.DW == null) goto L6;
        we();
    L6:
        return super.gn();
    }

    @Override
    public synchronized abcd.InterfaceqL j6(int r2) {
        monitor-enter(this);
    L9:
        th = move-exception;
        throw th;
    L4:
        if (this.DW == null) goto L6;
        we();     // Catch: java.lang.Throwable -> L9
    L6:
        abcd.InterfaceqL r3 = super.j6(r2);     // Catch: java.lang.Throwable -> L9
        monitor-exit(this);
        return r3;
    }

    @Override
    void j6(abcd.CL r3) {
        byte[] r0 = this.DW;
        if (r0 == null) goto L5;
        r3.j6(48, r0);
        return;
    L5:
        super.gn().j6(r3);
    }

    @Override
    public synchronized int tp() {
        monitor-enter(this);
    L9:
        th = move-exception;
        throw th;
    L4:
        if (this.DW == null) goto L6;
        we();     // Catch: java.lang.Throwable -> L9
    L6:
        int r0 = super.tp();     // Catch: java.lang.Throwable -> L9
        monitor-exit(this);
        return r0;
    }

    @Override
    public synchronized java.util.Enumeration u7() {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L4:
        if (this.DW != null) goto L8;
        java.util.Enumeration r0 = super.u7();     // Catch: java.lang.Throwable -> L11
        monitor-exit(this);
        return r0;
    L8:
        abcd.KM r1 = new abcd.KM(this.DW);     // Catch: java.lang.Throwable -> L11
        monitor-exit(this);
        return r1;
    }

    @Override
    int v5() {
        byte[] r0 = this.DW;
        if (r0 == null) goto L7;
        return (abcd.OM.j6(r0.length) + 1) + this.DW.length;
    L7:
        return super.gn().v5();
    }
}
