package abcd;

public class jz implements _y<abcd.Interfacelz>, abcd.Interfacehz, abcd.Interfacelz {
    private final java.util.concurrent.atomic.AtomicBoolean DW;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> FH;
    private final java.util.List<abcd.Interfacelz> j6;

    public jz() {
        this.j6 = new java.util.ArrayList();
        this.DW = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.FH = new java.util.concurrent.atomic.AtomicReference(null);
    }

    public static boolean DW(java.lang.Object r3) {
        abcd._y r1 = null;
        abcd.Interfacelz r2 = null;
        abcd.Interfacehz r4 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        r1 = (abcd._y) r3;
                        r2 = (abcd.Interfacelz) r3;
                        r4 = (abcd.Interfacehz) r3;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.ClassCastException) { $pc0 = 9; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r1 == null) { $pc0 = 12; continue $sw0; }
                    if (r2 == null) { $pc0 = 13; continue $sw0; }
                    if (r4 == null) { $pc0 = 14; continue $sw0; }
                    return true;
                }
                case 14: {
                    return false;
                }
                case 13: {
                    return false;
                }
                case 12: {
                    return false;
                }
                case 15: {
                    return false;
                }
                case 9: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean DW() {
        java.util.Iterator<abcd.Interfacelz> r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = FH().iterator();
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc1 = 9; continue $sw1; }
                    if (r0.next().j6() == true) { $pc1 = 4; continue $sw1; }
                    return false;
                }
                case 9: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public synchronized java.util.Collection<abcd.Interfacelz> FH() {
        java.util.Collection<abcd.Interfacelz> r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    monitor-enter(this);
                    try {
                        r0 = java.util.Collections.unmodifiableCollection(this.j6);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 6; continue $sw2;
                    }
                    monitor-exit(this);
                    return r0;
                }
                case 6: {
                    th = $ex2;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int compareTo(java.lang.Object r1) {
        return abcd.Enumcz.j6(this, r1);
    }

    public synchronized void j6(abcd.Interfacelz r2) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    monitor-enter(this);
                    try {
                        this.j6.add(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 6; continue $sw3;
                    }
                    monitor-exit(this);
                    return;
                }
                case 6: {
                    th = $ex3;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.Object r1) {
        j6((abcd.Interfacelz) r1);
    }

    @Override
    public void j6(java.lang.Throwable r2) {
        this.FH.set(r2);
    }

    @Override
    public synchronized void j6(boolean r2) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    monitor-enter(this);
                    try {
                        this.DW.set(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 6; continue $sw4;
                    }
                    monitor-exit(this);
                    return;
                }
                case 6: {
                    th = $ex4;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean j6() {
        return this.DW.get();
    }

    @Override
    public abcd.Enumcz v5() {
        return abcd.Enumcz.DW;
    }
}
