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
        abcd.lw r0 = null;
        java.util.Set<java.lang.String> r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.Hw;
                    if (r0 != null) { $pc0 = 5; continue $sw0; }
                    return;
                }
                case 5: {
                    if (this.DW != null) { $pc0 = 7; continue $sw0; }
                    return;
                }
                case 7: {
                    if (j6(r0.DW()) == true) { $pc0 = 16; continue $sw0; }
                    r1 = this.FH;
                    if (r1 != null) { $pc0 = 11; continue $sw0; }
                    return;
                }
                case 11: {
                    if (r1.contains(this.Hw.DW()) == true) { $pc0 = 18; continue $sw0; }
                    this.DW.add(this.Hw);
                    return;
                }
                case 18: {
                    return;
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean j6(java.lang.String r3) {
        java.util.Iterator<abcd.lw> r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.DW.iterator();
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc1 = 9; continue $sw1; }
                    if (r3.equals(r0.next().DW()) == false) { $pc1 = 4; continue $sw1; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.define.DefineOccurrences defineEvent(java.lang.String r2) {
        XL();
        abcd.lw r0 = new abcd.lw(r2);
        this.Hw = r0;
        return r0;
    }

    public void j6(abcd.Abstractjw.a r3, java.util.List<abcd.lw> r4) {
        java.lang.Object r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.j6;
                    monitor-enter(r0);
                    try {
                        this.DW = r4;
                        this.FH = new java.util.HashSet();
                        this.Hw = null;
                        r3.get();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 9; continue $sw2;
                    }
                    try {
                        XL();
                        this.DW = null;
                        this.FH = null;
                        this.Hw = null;
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 12; continue $sw2;
                    }
                    return;
                }
                case 12: {
                    th = $ex2;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 9: {
                    th = $ex2;
                    try {
                        XL();
                        this.DW = null;
                        this.FH = null;
                        this.Hw = null;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 12; continue $sw2;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void onDefineEventError(java.lang.Throwable r4) {
        abcd.lw r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.Hw;
                    if (r0 == null) { $pc3 = 6; continue $sw3; }
                    abcd.ow.j6(r0, java.lang.System.currentTimeMillis(), r4);
                    this.Hw = null;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void undefineEvent(java.lang.String r2) {
        java.util.Set<java.lang.String> r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.FH;
                    if (r0 == null) { $pc4 = 6; continue $sw4; }
                    r0.add(r2);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
