package abcd;

public abstract class Abstractjw implements com.appfour.backbone.api.define.DefineAnalytics {
    private java.util.List<abcd.lw> DW;
    private java.util.Set<java.lang.String> FH;
    private abcd.lw Hw;
    private java.lang.Object j6;

    public interface a {
        void get();
    }

    public Abstractjw() {
        this.j6 = new java.lang.Object();
    }

    private void XL() {
        abcd.lw r0 = this.Hw;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.DW != null) goto L7;
        return;
    L7:
        if (j6(r0.DW()) == true) goto L16;
        java.util.Set<java.lang.String> r1 = this.FH;
        if (r1 != null) goto L11;
        return;
    L11:
        if (r1.contains(this.Hw.DW()) == true) goto L18;
        this.DW.add(this.Hw);
        return;
    L18:
        return;
    }

    private boolean j6(java.lang.String r3) {
        java.util.Iterator<abcd.lw> r0 = this.DW.iterator();
    L4:
        if (r0.hasNext() == false) goto L9;
        if (r3.equals(r0.next().DW()) == false) goto L4;
        return true;
    L9:
        return false;
    }

    @Override
    public com.appfour.backbone.api.define.DefineOccurrences defineEvent(java.lang.String r2) {
        XL();
        abcd.lw r0 = new abcd.lw(r2);
        this.Hw = r0;
        return r0;
    }

    public void j6(abcd.Abstractjw.a r3, java.util.List<abcd.lw> r4) {
        java.lang.Object r0 = this.j6;
        monitor-enter(r0);
        this.DW = r4;     // Catch: java.lang.Throwable -> L9
        this.FH = new java.util.HashSet();     // Catch: java.lang.Throwable -> L9
        this.Hw = null;     // Catch: java.lang.Throwable -> L9
        r3.get();     // Catch: java.lang.Throwable -> L9
        XL();     // Catch: java.lang.Throwable -> L12
        this.DW = null;     // Catch: java.lang.Throwable -> L12
        this.FH = null;     // Catch: java.lang.Throwable -> L12
        this.Hw = null;     // Catch: java.lang.Throwable -> L12
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L12
        return;
    L12:
        th = move-exception;
        throw th;
    L9:
        th = move-exception;
        XL();     // Catch: java.lang.Throwable -> L12
        this.DW = null;     // Catch: java.lang.Throwable -> L12
        this.FH = null;     // Catch: java.lang.Throwable -> L12
        this.Hw = null;     // Catch: java.lang.Throwable -> L12
        throw th;     // Catch: java.lang.Throwable -> L12
    }

    @Override
    public void onDefineEventError(java.lang.Throwable r4) {
        abcd.lw r0 = this.Hw;
        if (r0 == null) goto L6;
        abcd.ow.j6(r0, java.lang.System.currentTimeMillis(), r4);
        this.Hw = null;
        return;
    }

    @Override
    public void undefineEvent(java.lang.String r2) {
        java.util.Set<java.lang.String> r0 = this.FH;
        if (r0 == null) goto L6;
        r0.add(r2);
        return;
    }
}
