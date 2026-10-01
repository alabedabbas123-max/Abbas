package abcd;

class LM extends abcd.FL {
    private byte[] DW;

    LM(byte[] r1) {
        this.DW = r1;
    }

    private void we() {
        abcd.KM r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new abcd.KM(this.DW);
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0.hasMoreElements() == false) { $pc0 = 5; continue $sw0; }
                    this.j6.addElement(r0.nextElement());
                    { $pc0 = 4; continue $sw0; }
                }
                case 5: {
                    this.DW = null;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    abcd.EL VH() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.DW == null) { $pc1 = 6; continue $sw1; }
                    we();
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return super.VH();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    abcd.EL gn() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.DW == null) { $pc2 = 6; continue $sw2; }
                    we();
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return super.gn();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public synchronized abcd.InterfaceqL j6(int r2) {
        abcd.InterfaceqL r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    monitor-enter(this);
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    th = $ex3;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (this.DW == null) { $pc3 = 6; continue $sw3; }
                    try {
                        we();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 9; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        r3 = super.j6(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 9; continue $sw3;
                    }
                    monitor-exit(this);
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    void j6(abcd.CL r3) {
        byte[] r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.DW;
                    if (r0 == null) { $pc4 = 5; continue $sw4; }
                    r3.j6(48, r0);
                    return;
                }
                case 5: {
                    super.gn().j6(r3);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public synchronized int tp() {
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    monitor-enter(this);
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    th = $ex5;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (this.DW == null) { $pc5 = 6; continue $sw5; }
                    try {
                        we();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 9; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    try {
                        r0 = super.tp();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 9; continue $sw5;
                    }
                    monitor-exit(this);
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public synchronized java.util.Enumeration u7() {
        java.util.Enumeration r0 = null;
        abcd.KM r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    monitor-enter(this);
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    th = $ex6;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (this.DW != null) { $pc6 = 8; continue $sw6; }
                    try {
                        r0 = super.u7();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 11; continue $sw6;
                    }
                    monitor-exit(this);
                    return r0;
                }
                case 8: {
                    try {
                        r1 = new abcd.KM(this.DW);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 11; continue $sw6;
                    }
                    monitor-exit(this);
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    int v5() {
        byte[] r0 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = this.DW;
                    if (r0 == null) { $pc7 = 7; continue $sw7; }
                    return (abcd.OM.j6(r0.length) + 1) + this.DW.length;
                }
                case 7: {
                    return super.gn().v5();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
