package abcd;

public abstract class Iu extends abcd.Bv {
    private boolean BT;
    private boolean KD;
    private boolean P8;
    private boolean SI;
    private boolean ei;
    private boolean gW;
    private boolean nw;
    private boolean vy;
    private boolean yS;

    public Iu() {
    }

    public boolean BT() {
        return this.KD;
    }

    public boolean KD() {
        return this.vy;
    }

    public boolean P8() {
        return this.SI;
    }

    public boolean SI() {
        return this.P8;
    }

    public boolean cn() {
        return this.gW;
    }

    public boolean ei() {
        return this.nw;
    }

    public boolean nw() {
        return this.yS;
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onApplicationCreate(com.appfour.backbone.api.closures.OnApplicationClosure r2) {
        abcd.Hu r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.ei = true;
                    if (r2 != null) { $pc0 = 5; continue $sw0; }
                    r3 = null;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    this.j6 = r3;
                    return j6();
                }
                case 5: {
                    r3 = new abcd.Hu(this, r2);
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onCrash(com.appfour.backbone.api.closures.OnCrashClosure r2) {
        abcd.Bu r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.KD = true;
                    if (r2 != null) { $pc1 = 5; continue $sw1; }
                    r3 = null;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    this.j6 = r3;
                    return j6();
                }
                case 5: {
                    r3 = new abcd.Bu(this, r2);
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onInAppProductImpression(com.appfour.backbone.api.closures.OnInAppProductClosure r2) {
        abcd.Cu r3 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    this.SI = true;
                    if (r2 != null) { $pc2 = 5; continue $sw2; }
                    r3 = null;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    this.j6 = r3;
                    return j6();
                }
                case 5: {
                    r3 = new abcd.Cu(this, r2);
                    { $pc2 = 6; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onInAppProductPurchase(com.appfour.backbone.api.closures.OnInAppProductClosure r2) {
        abcd.Du r3 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    this.nw = true;
                    if (r2 != null) { $pc3 = 5; continue $sw3; }
                    r3 = null;
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    this.j6 = r3;
                    return j6();
                }
                case 5: {
                    r3 = new abcd.Du(this, r2);
                    { $pc3 = 6; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onInstall(com.appfour.backbone.api.closures.OnMarketClosure r2) {
        abcd.Eu r3 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    this.yS = true;
                    if (r2 != null) { $pc4 = 5; continue $sw4; }
                    r3 = null;
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    this.j6 = r3;
                    return j6();
                }
                case 5: {
                    r3 = new abcd.Eu(this, r2);
                    { $pc4 = 6; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onNewVersion(com.appfour.backbone.api.closures.OnVoidClosure r2) {
        abcd.Gu r3 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    this.BT = true;
                    if (r2 != null) { $pc5 = 5; continue $sw5; }
                    r3 = null;
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    this.j6 = r3;
                    return j6();
                }
                case 5: {
                    r3 = new abcd.Gu(this, r2);
                    { $pc5 = 6; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onReferrerMarketClick(com.appfour.backbone.api.closures.OnMarketClosure r2) {
        abcd.Au r3 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    this.P8 = true;
                    if (r2 != null) { $pc6 = 5; continue $sw6; }
                    r3 = null;
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    this.j6 = r3;
                    return j6();
                }
                case 5: {
                    r3 = new abcd.Au(this, r2);
                    { $pc6 = 6; continue $sw6; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onReferrerMarketImpression(com.appfour.backbone.api.closures.OnMarketImpressionClosure r2) {
        abcd.zu r3 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    this.vy = true;
                    if (r2 != null) { $pc7 = 5; continue $sw7; }
                    r3 = null;
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    this.j6 = r3;
                    return j6();
                }
                case 5: {
                    r3 = new abcd.zu(this, r2);
                    { $pc7 = 6; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onUpdate(com.appfour.backbone.api.closures.OnVoidClosure r2) {
        abcd.Fu r3 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    this.gW = true;
                    if (r2 != null) { $pc8 = 5; continue $sw8; }
                    r3 = null;
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    this.j6 = r3;
                    return j6();
                }
                case 5: {
                    r3 = new abcd.Fu(this, r2);
                    { $pc8 = 6; continue $sw8; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean ro() {
        return this.BT;
    }

    public boolean vy() {
        return this.ei;
    }
}
