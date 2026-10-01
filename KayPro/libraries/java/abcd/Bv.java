package abcd;

public abstract class Bv extends abcd.Vu {
    private boolean EQ;
    private boolean J0;
    private boolean J8;
    private boolean Mr;
    private boolean QX;
    private boolean U2;
    private boolean Ws;
    private boolean XL;
    private boolean a8;
    private boolean aM;
    private int er;
    private boolean j3;
    private boolean lg;
    private java.lang.Class<? extends android.app.Activity> rN;
    private boolean tp;
    private boolean u7;
    private boolean we;

    public Bv() {
        this.er = -1;
    }

    public java.lang.Class<? extends android.app.Activity> EQ() {
        return this.rN;
    }

    public boolean J0() {
        return this.u7;
    }

    public boolean J8() {
        return this.tp;
    }

    public boolean Mr() {
        return this.aM;
    }

    public boolean QX() {
        return this.j3;
    }

    public boolean U2() {
        return this.U2;
    }

    public boolean Ws() {
        return this.EQ;
    }

    public boolean XL() {
        return this.XL;
    }

    public boolean a8() {
        return this.Mr;
    }

    public boolean aM() {
        return this.a8;
    }

    public boolean er() {
        return this.QX;
    }

    public boolean gW() {
        return this.we;
    }

    public boolean j3() {
        return this.lg;
    }

    public boolean lg() {
        return this.Ws;
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onActivityCreate(com.appfour.backbone.api.closures.OnActivityClosure r2) {
        abcd.uv r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.u7 = true;
                    if (r2 != null) { $pc0 = 5; continue $sw0; }
                    r3 = null;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    this.j6 = r3;
                    return j6();
                }
                case 5: {
                    r3 = new abcd.uv(this, r2);
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onActivityStart(com.appfour.backbone.api.closures.OnActivityClosure r2) {
        abcd.sv r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.tp = true;
                    if (r2 != null) { $pc1 = 5; continue $sw1; }
                    r3 = null;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    this.j6 = r3;
                    return j6();
                }
                case 5: {
                    r3 = new abcd.sv(this, r2);
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onActivityStop(com.appfour.backbone.api.closures.OnActivityClosure r2) {
        abcd.tv r3 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    this.EQ = true;
                    if (r2 != null) { $pc2 = 5; continue $sw2; }
                    r3 = null;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    this.j6 = r3;
                    return j6();
                }
                case 5: {
                    r3 = new abcd.tv(this, r2);
                    { $pc2 = 6; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public <A extends android.app.Activity> com.appfour.backbone.api.define.DefineHook onClick(java.lang.Class<A> r2, int r3, com.appfour.backbone.api.closures.OnClickClosure<A> r4) {
        abcd.Av r5 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    this.j3 = true;
                    this.rN = r2;
                    this.er = r3;
                    if (r4 != null) { $pc3 = 5; continue $sw3; }
                    r5 = null;
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    this.j6 = r5;
                    return j6();
                }
                case 5: {
                    r5 = new abcd.Av(this, r4);
                    { $pc3 = 6; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onInput(com.appfour.backbone.api.closures.OnInputClosure r2) {
        abcd.nv r3 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    this.XL = true;
                    if (r2 != null) { $pc4 = 5; continue $sw4; }
                    r3 = null;
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    this.j6 = r3;
                    return j6();
                }
                case 5: {
                    r3 = new abcd.nv(this, r2);
                    { $pc4 = 6; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public <A extends android.app.Activity> com.appfour.backbone.api.define.DefineHook onItemClick(java.lang.Class<A> r2, int r3, com.appfour.backbone.api.closures.OnItemClickClosure<A> r4) {
        abcd.yv r5 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    this.a8 = true;
                    this.er = r3;
                    this.rN = r2;
                    if (r4 != null) { $pc5 = 5; continue $sw5; }
                    r5 = null;
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    this.j6 = r5;
                    return j6();
                }
                case 5: {
                    r5 = new abcd.yv(this, r4);
                    { $pc5 = 6; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public <A extends android.app.Activity> com.appfour.backbone.api.define.DefineHook onItemLongPress(java.lang.Class<A> r2, int r3, com.appfour.backbone.api.closures.OnItemClickClosure<A> r4) {
        abcd.zv r5 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    this.lg = true;
                    this.er = r3;
                    this.rN = r2;
                    if (r4 != null) { $pc6 = 5; continue $sw6; }
                    r5 = null;
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    this.j6 = r5;
                    return j6();
                }
                case 5: {
                    r5 = new abcd.zv(this, r4);
                    { $pc6 = 6; continue $sw6; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onLaunch(com.appfour.backbone.api.closures.OnLaunchClosure r2) {
        abcd.rv r3 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    this.aM = true;
                    if (r2 != null) { $pc7 = 5; continue $sw7; }
                    r3 = null;
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    this.j6 = r3;
                    return j6();
                }
                case 5: {
                    r3 = new abcd.rv(this, r2);
                    { $pc7 = 6; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public <A extends android.app.Activity> com.appfour.backbone.api.define.DefineHook onLongPress(java.lang.Class<A> r2, int r3, com.appfour.backbone.api.closures.OnClickClosure<A> r4) {
        abcd.mv r5 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    this.U2 = true;
                    this.rN = r2;
                    this.er = r3;
                    if (r4 != null) { $pc8 = 5; continue $sw8; }
                    r5 = null;
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    this.j6 = r5;
                    return j6();
                }
                case 5: {
                    r5 = new abcd.mv(this, r4);
                    { $pc8 = 6; continue $sw8; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public <A extends android.app.Activity> com.appfour.backbone.api.define.DefineHook onMenuItemSelected(java.lang.Class<A> r2, int r3, com.appfour.backbone.api.closures.OnMenuItemSelectedClosure<A> r4) {
        abcd.xv r5 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    this.Mr = true;
                    this.er = r3;
                    this.rN = r2;
                    if (r4 != null) { $pc9 = 5; continue $sw9; }
                    r5 = null;
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    this.j6 = r5;
                    return j6();
                }
                case 5: {
                    r5 = new abcd.xv(this, r4);
                    { $pc9 = 6; continue $sw9; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onNotificationAction(com.appfour.backbone.api.closures.OnNotificationActionClosure r2) {
        abcd.qv r3 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    this.Ws = true;
                    if (r2 != null) { $pc10 = 5; continue $sw10; }
                    r3 = null;
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    this.j6 = r3;
                    return j6();
                }
                case 5: {
                    r3 = new abcd.qv(this, r2);
                    { $pc10 = 6; continue $sw10; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onNotificationShown(com.appfour.backbone.api.closures.OnNotificationClosure r2) {
        abcd.pv r3 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    this.J8 = true;
                    if (r2 != null) { $pc11 = 5; continue $sw11; }
                    r3 = null;
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    this.j6 = r3;
                    return j6();
                }
                case 5: {
                    r3 = new abcd.pv(this, r2);
                    { $pc11 = 6; continue $sw11; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onTouch(com.appfour.backbone.api.closures.OnTouchClosure r2) {
        abcd.ov r3 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    this.QX = true;
                    if (r2 != null) { $pc12 = 5; continue $sw12; }
                    r3 = null;
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    this.j6 = r3;
                    return j6();
                }
                case 5: {
                    r3 = new abcd.ov(this, r2);
                    { $pc12 = 6; continue $sw12; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onWindowHidden(com.appfour.backbone.api.closures.OnWindowClosure r2) {
        abcd.wv r3 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    this.J0 = true;
                    if (r2 != null) { $pc13 = 5; continue $sw13; }
                    r3 = null;
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    this.j6 = r3;
                    return j6();
                }
                case 5: {
                    r3 = new abcd.wv(this, r2);
                    { $pc13 = 6; continue $sw13; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onWindowShown(com.appfour.backbone.api.closures.OnWindowClosure r2) {
        abcd.vv r3 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    this.we = true;
                    if (r2 != null) { $pc14 = 5; continue $sw14; }
                    r3 = null;
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    this.j6 = r3;
                    return j6();
                }
                case 5: {
                    r3 = new abcd.vv(this, r2);
                    { $pc14 = 6; continue $sw14; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean rN() {
        return this.J8;
    }

    public int we() {
        return this.er;
    }

    public boolean yS() {
        return this.J0;
    }
}
