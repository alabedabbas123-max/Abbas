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
        this.ei = true;
        if (r2 != null) goto L5;
        abcd.Hu r3 = null;
    L6:
        this.j6 = r3;
        return j6();
    L5:
        r3 = new abcd.Hu(this, r2);
        goto L6
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onCrash(com.appfour.backbone.api.closures.OnCrashClosure r2) {
        this.KD = true;
        if (r2 != null) goto L5;
        abcd.Bu r3 = null;
    L6:
        this.j6 = r3;
        return j6();
    L5:
        r3 = new abcd.Bu(this, r2);
        goto L6
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onInAppProductImpression(com.appfour.backbone.api.closures.OnInAppProductClosure r2) {
        this.SI = true;
        if (r2 != null) goto L5;
        abcd.Cu r3 = null;
    L6:
        this.j6 = r3;
        return j6();
    L5:
        r3 = new abcd.Cu(this, r2);
        goto L6
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onInAppProductPurchase(com.appfour.backbone.api.closures.OnInAppProductClosure r2) {
        this.nw = true;
        if (r2 != null) goto L5;
        abcd.Du r3 = null;
    L6:
        this.j6 = r3;
        return j6();
    L5:
        r3 = new abcd.Du(this, r2);
        goto L6
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onInstall(com.appfour.backbone.api.closures.OnMarketClosure r2) {
        this.yS = true;
        if (r2 != null) goto L5;
        abcd.Eu r3 = null;
    L6:
        this.j6 = r3;
        return j6();
    L5:
        r3 = new abcd.Eu(this, r2);
        goto L6
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onNewVersion(com.appfour.backbone.api.closures.OnVoidClosure r2) {
        this.BT = true;
        if (r2 != null) goto L5;
        abcd.Gu r3 = null;
    L6:
        this.j6 = r3;
        return j6();
    L5:
        r3 = new abcd.Gu(this, r2);
        goto L6
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onReferrerMarketClick(com.appfour.backbone.api.closures.OnMarketClosure r2) {
        this.P8 = true;
        if (r2 != null) goto L5;
        abcd.Au r3 = null;
    L6:
        this.j6 = r3;
        return j6();
    L5:
        r3 = new abcd.Au(this, r2);
        goto L6
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onReferrerMarketImpression(com.appfour.backbone.api.closures.OnMarketImpressionClosure r2) {
        this.vy = true;
        if (r2 != null) goto L5;
        abcd.zu r3 = null;
    L6:
        this.j6 = r3;
        return j6();
    L5:
        r3 = new abcd.zu(this, r2);
        goto L6
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onUpdate(com.appfour.backbone.api.closures.OnVoidClosure r2) {
        this.gW = true;
        if (r2 != null) goto L5;
        abcd.Fu r3 = null;
    L6:
        this.j6 = r3;
        return j6();
    L5:
        r3 = new abcd.Fu(this, r2);
        goto L6
    }

    public boolean ro() {
        return this.BT;
    }

    public boolean vy() {
        return this.ei;
    }
}
