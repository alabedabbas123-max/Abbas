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
        this.u7 = true;
        if (r2 != null) goto L5;
        abcd.uv r3 = null;
    L6:
        this.j6 = r3;
        return j6();
    L5:
        r3 = new abcd.uv(this, r2);
        goto L6
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onActivityStart(com.appfour.backbone.api.closures.OnActivityClosure r2) {
        this.tp = true;
        if (r2 != null) goto L5;
        abcd.sv r3 = null;
    L6:
        this.j6 = r3;
        return j6();
    L5:
        r3 = new abcd.sv(this, r2);
        goto L6
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onActivityStop(com.appfour.backbone.api.closures.OnActivityClosure r2) {
        this.EQ = true;
        if (r2 != null) goto L5;
        abcd.tv r3 = null;
    L6:
        this.j6 = r3;
        return j6();
    L5:
        r3 = new abcd.tv(this, r2);
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public <A extends android.app.Activity> com.appfour.backbone.api.define.DefineHook onClick(java.lang.Class<A> r2, int r3, com.appfour.backbone.api.closures.OnClickClosure<A> r4) {
        this.j3 = true;
        this.rN = r2;
        this.er = r3;
        if (r4 != null) goto L5;
        abcd.Av r5 = null;
    L6:
        this.j6 = r5;
        return j6();
    L5:
        r5 = new abcd.Av(this, r4);
        goto L6
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onInput(com.appfour.backbone.api.closures.OnInputClosure r2) {
        this.XL = true;
        if (r2 != null) goto L5;
        abcd.nv r3 = null;
    L6:
        this.j6 = r3;
        return j6();
    L5:
        r3 = new abcd.nv(this, r2);
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public <A extends android.app.Activity> com.appfour.backbone.api.define.DefineHook onItemClick(java.lang.Class<A> r2, int r3, com.appfour.backbone.api.closures.OnItemClickClosure<A> r4) {
        this.a8 = true;
        this.er = r3;
        this.rN = r2;
        if (r4 != null) goto L5;
        abcd.yv r5 = null;
    L6:
        this.j6 = r5;
        return j6();
    L5:
        r5 = new abcd.yv(this, r4);
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public <A extends android.app.Activity> com.appfour.backbone.api.define.DefineHook onItemLongPress(java.lang.Class<A> r2, int r3, com.appfour.backbone.api.closures.OnItemClickClosure<A> r4) {
        this.lg = true;
        this.er = r3;
        this.rN = r2;
        if (r4 != null) goto L5;
        abcd.zv r5 = null;
    L6:
        this.j6 = r5;
        return j6();
    L5:
        r5 = new abcd.zv(this, r4);
        goto L6
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onLaunch(com.appfour.backbone.api.closures.OnLaunchClosure r2) {
        this.aM = true;
        if (r2 != null) goto L5;
        abcd.rv r3 = null;
    L6:
        this.j6 = r3;
        return j6();
    L5:
        r3 = new abcd.rv(this, r2);
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public <A extends android.app.Activity> com.appfour.backbone.api.define.DefineHook onLongPress(java.lang.Class<A> r2, int r3, com.appfour.backbone.api.closures.OnClickClosure<A> r4) {
        this.U2 = true;
        this.rN = r2;
        this.er = r3;
        if (r4 != null) goto L5;
        abcd.mv r5 = null;
    L6:
        this.j6 = r5;
        return j6();
    L5:
        r5 = new abcd.mv(this, r4);
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public <A extends android.app.Activity> com.appfour.backbone.api.define.DefineHook onMenuItemSelected(java.lang.Class<A> r2, int r3, com.appfour.backbone.api.closures.OnMenuItemSelectedClosure<A> r4) {
        this.Mr = true;
        this.er = r3;
        this.rN = r2;
        if (r4 != null) goto L5;
        abcd.xv r5 = null;
    L6:
        this.j6 = r5;
        return j6();
    L5:
        r5 = new abcd.xv(this, r4);
        goto L6
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onNotificationAction(com.appfour.backbone.api.closures.OnNotificationActionClosure r2) {
        this.Ws = true;
        if (r2 != null) goto L5;
        abcd.qv r3 = null;
    L6:
        this.j6 = r3;
        return j6();
    L5:
        r3 = new abcd.qv(this, r2);
        goto L6
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onNotificationShown(com.appfour.backbone.api.closures.OnNotificationClosure r2) {
        this.J8 = true;
        if (r2 != null) goto L5;
        abcd.pv r3 = null;
    L6:
        this.j6 = r3;
        return j6();
    L5:
        r3 = new abcd.pv(this, r2);
        goto L6
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onTouch(com.appfour.backbone.api.closures.OnTouchClosure r2) {
        this.QX = true;
        if (r2 != null) goto L5;
        abcd.ov r3 = null;
    L6:
        this.j6 = r3;
        return j6();
    L5:
        r3 = new abcd.ov(this, r2);
        goto L6
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onWindowHidden(com.appfour.backbone.api.closures.OnWindowClosure r2) {
        this.J0 = true;
        if (r2 != null) goto L5;
        abcd.wv r3 = null;
    L6:
        this.j6 = r3;
        return j6();
    L5:
        r3 = new abcd.wv(this, r2);
        goto L6
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook onWindowShown(com.appfour.backbone.api.closures.OnWindowClosure r2) {
        this.we = true;
        if (r2 != null) goto L5;
        abcd.vv r3 = null;
    L6:
        this.j6 = r3;
        return j6();
    L5:
        r3 = new abcd.vv(this, r2);
        goto L6
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
