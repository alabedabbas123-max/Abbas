package abcd;

final class qy<TResult> extends Yx<TResult> {
    private final oy<TResult> DW;
    private boolean FH;
    private volatile boolean Hw;
    private java.lang.Exception Zo;
    private final java.lang.Object j6;
    private TResult v5;

    qy() {
        this.j6 = new java.lang.Object();
        this.DW = new abcd.oy();
    }

    private final void VH() {
        com.google.android.gms.common.internal.r.DW(this.FH, "Task is not yet complete");
    }

    private final void gn() {
        com.google.android.gms.common.internal.r.DW(!this.FH, "Task is already complete");
    }

    private final void tp() {
        synchronized (this.j6) {
            java.lang.Object r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = this.j6;
                        $pc0 = 5; continue $sw0;
                    }
                    case 11: {
                        th = $ex0;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 5: {
                        if (this.FH == true) { $pc0 = 8; continue $sw0; }
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 11; continue $sw0;
                        }
                        return;
                    }
                    case 8: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 11; continue $sw0;
                        }
                        this.DW.j6(this);
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    private final void u7() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.Hw == true) { $pc1 = 6; continue $sw1; }
                    return;
                }
                case 6: {
                    throw new java.util.concurrent.CancellationException("Task is already canceled.");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final <TContinuationResult> Yx<TContinuationResult> DW(java.util.concurrent.Executor r4, Sx<TResult, Yx<TContinuationResult>> r5) {
        abcd.qy r0 = new abcd.qy();
        this.DW.j6(new abcd.dy(r4, r5, r0));
        tp();
        return r0;
    }

    public final TResult DW() {
        synchronized (this.j6) {
            java.lang.Object r0 = null;
            TResult r1 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r0 = this.j6;
                        try {
                            VH();
                            u7();
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 11; continue $sw2;
                        }
                        if (this.Zo != null) { $pc2 = 10; continue $sw2; }
                        try {
                            r1 = this.v5;
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 11; continue $sw2;
                        }
                        return r1;
                    }
                    case 10: {
                        try {
                            throw new abcd.Xx(this.Zo);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 11; continue $sw2;
                        }
                    }
                    case 11: {
                        th = $ex2;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public final boolean DW(java.lang.Exception r3) {
        synchronized (this.j6) {
            java.lang.Object r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        com.google.android.gms.common.internal.r.j6(r3, "Exception must not be null");
                        r0 = this.j6;
                        $pc3 = 5; continue $sw3;
                    }
                    case 13: {
                        th = $ex3;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 5: {
                        if (this.FH == true) { $pc3 = 7; continue $sw3; }
                        try {
                            this.FH = true;
                            this.Zo = r3;
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 13; continue $sw3;
                        }
                        this.DW.j6(this);
                        return true;
                    }
                    case 7: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 13; continue $sw3;
                        }
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public final boolean DW(TResult r3) {
        synchronized (this.j6) {
            java.lang.Object r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        r0 = this.j6;
                        $pc4 = 5; continue $sw4;
                    }
                    case 13: {
                        th = $ex4;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 5: {
                        if (this.FH == true) { $pc4 = 7; continue $sw4; }
                        try {
                            this.FH = true;
                            this.v5 = r3;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 13; continue $sw4;
                        }
                        this.DW.j6(this);
                        return true;
                    }
                    case 7: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 13; continue $sw4;
                        }
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public final boolean FH() {
        return this.Hw;
    }

    public final boolean Hw() {
        synchronized (this.j6) {
            java.lang.Object r0 = null;
            boolean r1 = false;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        r0 = this.j6;
                        try {
                            r1 = this.FH;
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 7; continue $sw5;
                        }
                        return r1;
                    }
                    case 7: {
                        th = $ex5;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public final boolean Zo() {
        synchronized (this.j6) {
            java.lang.Object r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex6 = null;
            int $pc6 = -1;
            $sw6: while (true) {
                switch ($pc6) {
                    case -1: {
                        r0 = this.j6;
                        $pc6 = 5; continue $sw6;
                    }
                    case 13: {
                        th = $ex6;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 5: {
                        if (this.FH == true) { $pc6 = 7; continue $sw6; }
                        try {
                            this.FH = true;
                            this.Hw = true;
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 13; continue $sw6;
                        }
                        this.DW.j6(this);
                        return true;
                    }
                    case 7: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 13; continue $sw6;
                        }
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public final <TContinuationResult> Yx<TContinuationResult> j6(java.util.concurrent.Executor r4, Sx<TResult, TContinuationResult> r5) {
        abcd.qy r0 = new abcd.qy();
        this.DW.j6(new abcd.by(r4, r5, r0));
        tp();
        return r0;
    }

    public final Yx<TResult> j6(java.util.concurrent.Executor r3, abcd.Tx r4) {
        this.DW.j6(new abcd.fy(r3, r4));
        tp();
        return this;
    }

    public final Yx<TResult> j6(java.util.concurrent.Executor r3, Ux<TResult> r4) {
        this.DW.j6(new abcd.hy(r3, r4));
        tp();
        return this;
    }

    public final Yx<TResult> j6(java.util.concurrent.Executor r3, abcd.Vx r4) {
        this.DW.j6(new abcd.jy(r3, r4));
        tp();
        return this;
    }

    public final Yx<TResult> j6(java.util.concurrent.Executor r3, Wx<? super TResult> r4) {
        this.DW.j6(new abcd.ly(r3, r4));
        tp();
        return this;
    }

    public final java.lang.Exception j6() {
        synchronized (this.j6) {
            java.lang.Object r0 = null;
            java.lang.Exception r1 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex7 = null;
            int $pc7 = -1;
            $sw7: while (true) {
                switch ($pc7) {
                    case -1: {
                        r0 = this.j6;
                        try {
                            r1 = this.Zo;
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 7; continue $sw7;
                        }
                        return r1;
                    }
                    case 7: {
                        th = $ex7;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public final <X extends java.lang.Throwable> TResult j6(java.lang.Class<X> r3) {
        synchronized (this.j6) {
            java.lang.Object r0 = null;
            TResult r4 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex8 = null;
            int $pc8 = -1;
            $sw8: while (true) {
                switch ($pc8) {
                    case -1: {
                        r0 = this.j6;
                        try {
                            VH();
                            u7();
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 15; continue $sw8;
                        }
                        if (r3.isInstance(this.Zo) == true) { $pc8 = 14; continue $sw8; }
                        if (this.Zo != null) { $pc8 = 12; continue $sw8; }
                        try {
                            r4 = this.v5;
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 15; continue $sw8;
                        }
                        return r4;
                    }
                    case 12: {
                        try {
                            throw new abcd.Xx(this.Zo);
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 15; continue $sw8;
                        }
                    }
                    case 14: {
                        try {
                            throw r3.cast(this.Zo);
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 15; continue $sw8;
                        }
                    }
                    case 15: {
                        th = $ex8;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public final void j6(java.lang.Exception r3) {
        synchronized (this.j6) {
            java.lang.Object r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex9 = null;
            int $pc9 = -1;
            $sw9: while (true) {
                switch ($pc9) {
                    case -1: {
                        com.google.android.gms.common.internal.r.j6(r3, "Exception must not be null");
                        r0 = this.j6;
                        try {
                            gn();
                            this.FH = true;
                            this.Zo = r3;
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 8; continue $sw9;
                        }
                        this.DW.j6(this);
                        return;
                    }
                    case 8: {
                        th = $ex9;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public final void j6(TResult r3) {
        synchronized (this.j6) {
            java.lang.Object r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex10 = null;
            int $pc10 = -1;
            $sw10: while (true) {
                switch ($pc10) {
                    case -1: {
                        r0 = this.j6;
                        try {
                            gn();
                            this.FH = true;
                            this.v5 = r3;
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 8; continue $sw10;
                        }
                        this.DW.j6(this);
                        return;
                    }
                    case 8: {
                        th = $ex10;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public final boolean v5() {
        synchronized (this.j6) {
            java.lang.Object r0 = null;
            boolean r1 = false;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex11 = null;
            int $pc11 = -1;
            $sw11: while (true) {
                switch ($pc11) {
                    case -1: {
                        r0 = this.j6;
                        $pc11 = 5; continue $sw11;
                    }
                    case 14: {
                        th = $ex11;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 5: {
                        if (this.FH == true) { $pc11 = 7; continue $sw11; }
                        $pc11 = 11; continue $sw11;
                    }
                    case 11: {
                        r1 = false;
                        $pc11 = 12; continue $sw11;
                    }
                    case 12: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 14; continue $sw11;
                        }
                        return r1;
                    }
                    case 7: {
                        if (this.Hw == true) { $pc11 = 11; continue $sw11; }
                        if (this.Zo != null) { $pc11 = 11; continue $sw11; }
                        r1 = true;
                        { $pc11 = 12; continue $sw11; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
