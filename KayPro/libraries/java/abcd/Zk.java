package abcd;

@abcd.Interfacexu
public class Zk {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 5559310445213730275L)
    private java.lang.String FH;

    @abcd.Interfaceru(field = -2807433242458730292L)
    private abcd.InterfaceUi Hw;

    @abcd.Interfaceru(field = 2732902873124185344L)
    private boolean VH;

    @abcd.Interfaceru(field = -1577160821126137227L)
    private java.util.List<java.lang.String> Zo;

    @abcd.Interfaceru(field = 4037317727639421675L)
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> v5;

    static {
        abcd.wu.j6(abcd.Zk.class, -8061245974084835088L, -8061245974084835088L);
    }

    public Zk() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2382173340504915675L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2382173340504915675L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    static void DW(abcd.Zk r0) {
        r0.P8();
    }

    static abcd.InterfaceUi FH(abcd.Zk r0) {
        return r0.Hw;
    }

    @abcd.Interfacesu(method = 19972929142758720L)
    private static java.lang.String P8(java.lang.String r6) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 3863473146047596000L, null, r6);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3863473146047596000L, null, r6);     // Catch: java.lang.Throwable -> L11
    L6:
        java.lang.String[] r3 = r6.split(" ");     // Catch: java.lang.Throwable -> L11
        if (r3.length < 1) goto L10;
        return r3[r3.length - 1];
    L10:
        return null;
    }

    @abcd.Interfacesu(method = 4108770960147403200L)
    private void P8() {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -4824585592582923680L, this);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-4824585592582923680L, this);     // Catch: java.lang.Throwable -> L14
    L7:
        if (this.FH != null) goto L9;
    L11:
        com.aide.ui.U.EQ().j6(new com.aide.engine.EngineSolution(new java.util.ArrayList(), null, com.aide.engine.service.x.j6(com.aide.ui.U.FH()), com.aide.ui.U.FH()));     // Catch: java.lang.Throwable -> L14
    L12:
        com.aide.ui.U.EQ().gn();     // Catch: java.lang.Throwable -> L14
        com.aide.ui.U.EQ().VH();     // Catch: java.lang.Throwable -> L14
        return;
    L9:
        if (this.Hw == null) goto L11;
        com.aide.ui.U.EQ().j6(this.Hw.VH());     // Catch: java.lang.Throwable -> L14
        goto L12
    }

    @abcd.Interfacesu(method = 6326551089815932960L)
    private void SI(java.lang.String r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3482704925138385472L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3482704925138385472L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = r6;     // Catch: java.lang.Throwable -> L8
        android.content.SharedPreferences.Editor r2 = com.aide.ui.U.Zo().getSharedPreferences("ProjectService", 0).edit();     // Catch: java.lang.Throwable -> L8
        r2.putString("CurrentAppHome", r6);     // Catch: java.lang.Throwable -> L8
        r2.commit();     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 6026010427097000787L)
    private abcd.InterfaceUi ei(java.lang.String r9) {
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, 1518958727664245875L, this, r9);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1518958727664245875L, this, r9);     // Catch: java.lang.Throwable -> L16
    L7:
        if (r9 != null) goto L9;
        return null;
    L9:
        abcd.InterfaceUi[] r3 = com.aide.ui.U.Hw();     // Catch: java.lang.Throwable -> L16
        int r4 = r3.length;     // Catch: java.lang.Throwable -> L16
        int r5 = 0;
    L10:
        if (r5 >= r4) goto L15;
        abcd.InterfaceUi r6 = r3[r5];     // Catch: java.lang.Throwable -> L16
        if (r6.QX(r9) == true) goto L13;
        r5 = r5 + 1;
        goto L10
    L13:
        return r6;
    L15:
        return null;
    }

    @abcd.Interfacesu(method = -7638808182986252025L)
    private void ei() {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -2145916920446227977L, this);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(-2145916920446227977L, this);     // Catch: java.lang.Throwable -> L7
        return;
    }

    static java.lang.String j6(java.lang.String r0) {
        return P8(r0);
    }

    static void j6(abcd.Zk r0) {
        r0.vy();
    }

    @abcd.Interfacesu(method = -1273168545277243923L)
    private void nw(java.lang.String r6) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 887456182767660957L, this, r6);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(887456182767660957L, this, r6);     // Catch: java.lang.Throwable -> L10
    L7:
        if (this.FH == null) goto L17;
        com.aide.ui.U.Zo().getSharedPreferences("ProjectService", 0).edit().putString("BuildVariant_" + this.FH, r6).commit();     // Catch: java.lang.Throwable -> L10
        return;
    }

    @abcd.Interfacesu(method = 2666878262908131121L)
    private void vy() {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -4059245137445733503L, this);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4059245137445733503L, this);     // Catch: java.lang.Throwable -> L10
    L6:
        this.Zo = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L10
        this.v5 = new java.util.HashMap();     // Catch: java.lang.Throwable -> L10
        if (this.FH == null) goto L17;
        this.Hw.j6(this.FH, this.v5, this.Zo);     // Catch: java.lang.Throwable -> L10
        return;
    }

    public static java.lang.String we(java.lang.String r8) {
    L28:
        th = move-exception;
        if (DW == false) goto L32;
        abcd.wu.j6(th, 5899873950325593160L, null, r8);
    L32:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5899873950325593160L, null, r8);     // Catch: java.lang.Throwable -> L28
    L6:
        if (r8 != null) goto L8;
        return null;
    L8:
        byte r3 = -1;
        int r4 = r8.hashCode();     // Catch: java.lang.Throwable -> L28
        if (r4 == (-1886964253)) goto L23;
        if (r4 == 95458899) goto L20;
        if (r4 == 1090594823) goto L17;
    L25:
        if (r3 == 0) goto L27;
        return "debug";
    L27:
        return "release";
    L17:
        if (r8.equals("release") == false) goto L25;
        r3 = 0;
        goto L25
    L20:
        if (r8.equals("debug") == false) goto L25;
        r3 = 1;
        goto L25
    L23:
        if (r8.equals("debug-aide") == false) goto L25;
        r3 = 2;
        goto L25
    }

    public void BT(java.lang.String r7) {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 1869396883276581620L, this, r7);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1869396883276581620L, this, r7);     // Catch: java.lang.Throwable -> L15
    L7:
        if (this.FH != null) goto L9;
        return;
    L9:
        if (r7.equals(u7()) == false) goto L11;
        return;
    L11:
        if (com.aide.ui.U.v5().VH() == false) goto L13;
        com.almlkaide.kaypro.util.Toasty.toast(com.aide.ui.U.lg(), com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.view_toast_cannot_switch_variant, new java.lang.Object[0]), 0).show();     // Catch: java.lang.Throwable -> L15
        return;
    L13:
        com.almlkaide.kaypro.util.Toasty.toast(com.aide.ui.U.lg(), com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.view_toast_switched_variant, new java.lang.Object[]{r7}), 0).show();     // Catch: java.lang.Throwable -> L15
        nw(r7);     // Catch: java.lang.Throwable -> L15
        com.aide.ui.U.gn().DW(this.Hw.EQ());     // Catch: java.lang.Throwable -> L15
        com.aide.ui.U.v5().tp();     // Catch: java.lang.Throwable -> L15
        yS();     // Catch: java.lang.Throwable -> L15
    }

    public boolean BT() {
    L18:
        th = move-exception;
        if (DW == false) goto L22;
        abcd.wu.j6(th, 869119721943040075L, this);
    L22:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(869119721943040075L, this);     // Catch: java.lang.Throwable -> L18
    L6:
        java.lang.String r2 = com.aide.ui.U.er().DW();     // Catch: java.lang.Throwable -> L18
        if (r2 != null) goto L9;
        return false;
    L9:
        boolean r4 = com.a.a(r2);     // Catch: java.lang.Throwable -> L18
        if (r4 == false) goto L13;
        com.a.a(com.aide.ui.U.lg(), r2);     // Catch: java.lang.Throwable -> L18
        return r4;
    L13:
        java.lang.String r5 = EQ(r2);     // Catch: java.lang.Throwable -> L18
        if (r5 != null) goto L16;
        return false;
    L16:
        com.aide.ui.U.er().j6(true, false);     // Catch: java.lang.Throwable -> L18
        com.aide.ui.U.lg().J8().J8();     // Catch: java.lang.Throwable -> L18
        ei(r5).j3(r2);     // Catch: java.lang.Throwable -> L18
        return true;
    }

    public void DW(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -980468576272611825L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-980468576272611825L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw.VH(r5);     // Catch: java.lang.Throwable -> L8
        yS();     // Catch: java.lang.Throwable -> L8
    }

    public boolean DW() {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 271137455803007316L, this);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(271137455803007316L, this);     // Catch: java.lang.Throwable -> L15
    L7:
        if (j6() == true) goto L9;
    L13:
        return false;
    L9:
        if (this.Hw == null) goto L13;
        if (this.Hw.we() == false) goto L13;
        return true;
    }

    public java.lang.String EQ() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1434222098368715217L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1434222098368715217L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return P8(u7());
    }

    public java.lang.String EQ(java.lang.String r5) {
    L17:
        th = move-exception;
        if (DW == false) goto L22;
        abcd.wu.j6(th, -906248565229061496L, this, r5);
    L22:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-906248565229061496L, this, r5);     // Catch: java.lang.Throwable -> L17
    L7:
        if (abcd.Vl.XL(r5) == true) goto L15;
    L8:
        if (abcd.Vl.Mr(r5) == true) goto L28;
        if (ei(r5) != null) goto L12;
        r5 = abcd.Vl.EQ(r5);     // Catch: java.lang.Throwable -> L17
        goto L8
    L12:
        return r5;
    L28:
        return null;
    L15:
        return null;
    }

    public void FH(java.lang.String r9) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 483545176023419328L, this, r9);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(483545176023419328L, this, r9);     // Catch: java.lang.Throwable -> L12
    L7:
        if (XL(r9) == true) goto L19;
        java.lang.String r2 = EQ(r9);     // Catch: java.lang.Throwable -> L12
        if (r2 == null) goto L20;
        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.dialog_open_project_title, new java.lang.Object[0]), com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.dialog_open_project_message, new java.lang.Object[]{r2}), new abcd.RunnableC0398Uk(this, r2, r9), null);     // Catch: java.lang.Throwable -> L12
        return;
    L20:
        return;
    }

    public boolean FH() {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -3819494747190928292L, this);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-3819494747190928292L, this);     // Catch: java.lang.Throwable -> L15
    L7:
        if (j6() == true) goto L9;
    L13:
        return false;
    L9:
        if (this.Hw == null) goto L13;
        if (this.Hw.tp() == false) goto L13;
        return true;
    }

    public boolean Hw() {
    L22:
        th = move-exception;
        if (DW == false) goto L26;
        abcd.wu.j6(th, 3510671084018159325L, this);
    L26:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3510671084018159325L, this);     // Catch: java.lang.Throwable -> L22
    L6:
        java.lang.String r2 = com.aide.ui.U.er().DW();     // Catch: java.lang.Throwable -> L22
        if (r2 != null) goto L9;
        return false;
    L9:
        boolean r4 = com.a.a(r2);     // Catch: java.lang.Throwable -> L22
        if (r4 == false) goto L12;
        return r4;
    L12:
        java.lang.String r5 = EQ(r2);     // Catch: java.lang.Throwable -> L22
        if (r5 != null) goto L16;
        return false;
    L16:
        if (com.aide.ui.U.dx() == true) goto L18;
    L20:
        return ei(r5).DW(r2);
    L18:
        if (com.aide.ui.U.SI().Hw(r2) == true) goto L20;
        return false;
    }

    public boolean Hw(java.lang.String r5) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -2692660267116489407L, this, r5);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-2692660267116489407L, this, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if (this.Hw == null) goto L11;
        if (this.Hw.EQ(r5) == false) goto L11;
        return true;
    L11:
        return false;
    }

    public int J0(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1522453859998231625L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1522453859998231625L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return ei(r5).gn(r5);
    }

    public java.lang.String J0() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 751721934180813995L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(751721934180813995L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH;
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> J8() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -462204135503730256L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-462204135503730256L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.v5;
    }

    public java.lang.String[] J8(java.lang.String r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -3409552205770714608L, this, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3409552205770714608L, this, r5);     // Catch: java.lang.Throwable -> L12
    L6:
        java.util.List<java.lang.String> r2 = this.v5.get(r5);     // Catch: java.lang.Throwable -> L12
        if (r2 == null) goto L9;
        java.lang.String[] r3 = new java.lang.String[r2.size()];     // Catch: java.lang.Throwable -> L12
        r2.toArray(r3);     // Catch: java.lang.Throwable -> L12
        return r3;
    L9:
        return new java.lang.String[0];
    }

    public boolean Mr() {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -2962999036658341392L, this);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-2962999036658341392L, this);     // Catch: java.lang.Throwable -> L15
    L7:
        if (j3() == true) goto L9;
    L13:
        return false;
    L9:
        if (com.aide.ui.U.dx() == true) goto L13;
        if (this.Hw.Zo() == false) goto L13;
        return true;
    }

    public boolean Mr(java.lang.String r5) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 4782243159373282880L, this, r5);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4782243159373282880L, this, r5);     // Catch: java.lang.Throwable -> L11
    L6:
        if (ei(r5) == null) goto L9;
        return true;
    L9:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    public java.lang.String QX() {
        long r0 = 14875035873500811(0x34d8c42d42de8b, double:1.1596385954953945E-307);
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, r0, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(14875035873500811L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (this.Hw == null) goto L10;
        r0 = this.Hw.gn();     // Catch: java.lang.Throwable -> L12
        return r0;
    L10:
        return "";
    }

    public boolean QX(java.lang.String r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -2720295604977672883L, this, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2720295604977672883L, this, r5);     // Catch: java.lang.Throwable -> L12
    L6:
        abcd.InterfaceUi r2 = ei(r5);     // Catch: java.lang.Throwable -> L12
        if (r2 == null) goto L10;
        return r2.J8(r5);
    L10:
        return false;
    }

    public void U2(java.lang.String r7) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -2909647131119937431L, this, r7);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2909647131119937431L, this, r7);     // Catch: java.lang.Throwable -> L11
    L6:
        java.util.HashMap r2 = new java.util.HashMap();     // Catch: java.lang.Throwable -> L11
        r2.put("isPremium", java.lang.Boolean.toString(Mr()));     // Catch: java.lang.Throwable -> L11
        r2.put("libraryCount", java.lang.Integer.toString(this.v5.size()));     // Catch: java.lang.Throwable -> L11
        r2.put("referrer", r7);     // Catch: java.lang.Throwable -> L11
        if (abcd.C0790gj.P8(J0()) == false) goto L9;
        r2.put("package", abcd.C0790gj.FH(J0(), null));     // Catch: java.lang.Throwable -> L11
    L9:
        abcd.F.j6("Project opened", r2);     // Catch: java.lang.Throwable -> L11
    }

    public boolean U2() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 868075045964082540L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(868075045964082540L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (this.Hw != null) goto L10;
        return false;
    L10:
        return this.Hw.DW();
    }

    public int VH(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -91030233404512675L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-91030233404512675L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Hw.J0(r5);
    }

    public java.util.List<java.lang.String> VH() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -5547925765679293920L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-5547925765679293920L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (this.FH != null) goto L10;
        return null;
    L10:
        return this.Hw.XL(J0());
    }

    public java.util.List<java.lang.String> Ws() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -912561763897109036L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-912561763897109036L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L8
        r2.add(J0());     // Catch: java.lang.Throwable -> L8
        java.util.HashSet r3 = new java.util.HashSet(this.v5.keySet());     // Catch: java.lang.Throwable -> L8
        r3.remove(J0());     // Catch: java.lang.Throwable -> L8
        r2.addAll(r3);     // Catch: java.lang.Throwable -> L8
        return r2;
    }

    public void Ws(java.lang.String r8) {
    L25:
        th = move-exception;
        if (DW == false) goto L29;
        abcd.wu.j6(th, -7689472675009447593L, this, r8);
    L29:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-7689472675009447593L, this, r8);     // Catch: java.lang.Throwable -> L25
    L6:
        android.content.SharedPreferences r2 = com.aide.ui.U.Zo().getSharedPreferences("ProjectService", 0);     // Catch: java.lang.Throwable -> L25
        if (com.aide.ui.U.dx() == false) goto L10;
    L18:
        this.Hw = ei(this.FH);     // Catch: java.lang.Throwable -> L25
        vy();     // Catch: java.lang.Throwable -> L25
        if (this.Hw == null) goto L22;
        com.aide.ui.U.gn().j6(this.Hw.EQ(), true);     // Catch: java.lang.Throwable -> L25
    L22:
        if (this.FH == null) goto L32;
        abcd.F.j6("App init: Opened existing project");     // Catch: java.lang.Throwable -> L25
        ei();     // Catch: java.lang.Throwable -> L25
        j6(null, false);     // Catch: java.lang.Throwable -> L25
        U2("init");     // Catch: java.lang.Throwable -> L25
        return;
    L32:
        return;
    L10:
        if (com.aide.ui.U.lg().FH("android.permission.WRITE_EXTERNAL_STORAGE") == false) goto L18;
        if (r8 == null) goto L13;
        abcd.F.j6("App init: From intent");     // Catch: java.lang.Throwable -> L25
        SI(EQ(r8));     // Catch: java.lang.Throwable -> L25
        goto L18
    L13:
        this.FH = r2.getString("CurrentAppHome", null);     // Catch: java.lang.Throwable -> L25
        if (this.FH == null) goto L18;
        if (ei(this.FH) != null) goto L18;
        this.FH = null;     // Catch: java.lang.Throwable -> L25
        goto L18
    }

    public void XL() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3124596026214908685L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3124596026214908685L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        P8();     // Catch: java.lang.Throwable -> L8
    }

    public boolean XL(java.lang.String r5) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 1131068104562442488L, this, r5);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1131068104562442488L, this, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if (this.Hw == null) goto L11;
        if (this.Hw.v5(r5) == false) goto L11;
        return true;
    L11:
        return false;
    }

    public java.lang.String Zo() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 3704763573539393248L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3704763573539393248L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        java.lang.String r2 = com.aide.ui.aa.sh();     // Catch: java.lang.Throwable -> L11
        if (abcd.Vl.Hw(r2) == false) goto L9;
        return r2;
    L9:
        return com.aide.ui.U.DW().j6();
    }

    public boolean Zo(java.lang.String r5) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 2050637378074025664L, this, r5);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(2050637378074025664L, this, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if (this.Hw == null) goto L11;
        if (this.Hw.Zo(r5) == false) goto L11;
        return true;
    L11:
        return false;
    }

    public java.lang.String a8(java.lang.String r5) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 6759872802985947L, this, r5);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(6759872802985947L, this, r5);     // Catch: java.lang.Throwable -> L11
    L7:
        if (this.Hw == null) goto L18;
        return this.Hw.tp(r5);
    L18:
        return null;
    }

    public void a8() {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 6983608691437058309L, this);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(6983608691437058309L, this);     // Catch: java.lang.Throwable -> L15
    L7:
        if (com.aide.ui.U.dx() == false) goto L10;
        com.aide.ui.U.ei().DW();     // Catch: java.lang.Throwable -> L15
        return;
    L10:
        if (this.Hw != null) goto L12;
        return;
    L12:
        if (this.VH == false) goto L23;
        this.VH = false;     // Catch: java.lang.Throwable -> L15
        this.Hw.j6();     // Catch: java.lang.Throwable -> L15
        return;
    }

    public boolean aM() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 5675126715919091692L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(5675126715919091692L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (this.Hw == null) goto L10;
        return this.Hw.v5();
    L10:
        return false;
    }

    public boolean aM(java.lang.String r5) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 1014183343352128464L, this, r5);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1014183343352128464L, this, r5);     // Catch: java.lang.Throwable -> L11
    L6:
        if (EQ(r5) == null) goto L9;
        return true;
    L9:
        return false;
    }

    public void er() {
    L16:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, -699920592258047832L, this);
    L20:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-699920592258047832L, this);     // Catch: java.lang.Throwable -> L16
    L7:
        if (this.FH == null) goto L12;
        if (ei(this.FH) != null) goto L12;
        v5();     // Catch: java.lang.Throwable -> L16
    L12:
        if (this.FH == null) goto L14;
        vy();     // Catch: java.lang.Throwable -> L16
    L14:
        P8();     // Catch: java.lang.Throwable -> L16
    }

    public void er(java.lang.String r7) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 1701212675942497257L, this, r7);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1701212675942497257L, this, r7);     // Catch: java.lang.Throwable -> L13
    L6:
        abcd.InterfaceUi r2 = ei(r7);     // Catch: java.lang.Throwable -> L13
        if (r2 == null) goto L19;
        java.lang.String r3 = r2.FH(r7);     // Catch: java.lang.Throwable -> L13
        if (r3 == null) goto L11;
        com.aide.ui.U.U2().FH(com.aide.ui.U.lg(), r3, "open_project");     // Catch: java.lang.Throwable -> L13
        return;
    L11:
        rN(r7);     // Catch: java.lang.Throwable -> L13
        U2("openProjectUser");     // Catch: java.lang.Throwable -> L13
        return;
    }

    public void gW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2777945406619223076L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2777945406619223076L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.dialog_variants_title, new java.lang.Object[0]), gn(), u7(), new abcd.C0382Tk(this));     // Catch: java.lang.Throwable -> L8
    }

    public void gW(java.lang.String r5) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -2598799904126168400L, this, r5);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-2598799904126168400L, this, r5);     // Catch: java.lang.Throwable -> L10
    L7:
        if (abcd.Vl.Hw(r5) == false) goto L17;
        com.aide.ui.aa.v5(r5);     // Catch: java.lang.Throwable -> L10
        P8();     // Catch: java.lang.Throwable -> L10
        return;
    }

    public int gn(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1241454175710987008L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1241454175710987008L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Hw.Ws(r5);
    }

    public java.util.List<java.lang.String> gn() {
    L18:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, -1199098342882209165L, this);
    L23:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1199098342882209165L, this);     // Catch: java.lang.Throwable -> L18
    L7:
        if (this.FH != null) goto L10;
        return null;
    L10:
        java.util.ArrayList r6 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L18
        r6.add("release");     // Catch: java.lang.Throwable -> L18
        r6.add("debug");     // Catch: java.lang.Throwable -> L18
        r6.add("debug-aide");     // Catch: java.lang.Throwable -> L18
        java.util.List<java.lang.String> r7 = this.Hw.XL(J0());     // Catch: java.lang.Throwable -> L18
        if (r7 == null) goto L17;
        java.util.Iterator<java.lang.String> r8 = r7.iterator();     // Catch: java.lang.Throwable -> L18
    L13:
        if (r8.hasNext() == false) goto L17;
        java.lang.String r9 = r8.next();     // Catch: java.lang.Throwable -> L18
        r6.add(r9 + " release");     // Catch: java.lang.Throwable -> L18
        r6.add(r9 + " debug");     // Catch: java.lang.Throwable -> L18
        r6.add(r9 + " debug-aide");     // Catch: java.lang.Throwable -> L18
    L17:
        return r6;
    }

    public boolean j3() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 4094684098358750280L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4094684098358750280L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        if (this.FH == null) goto L9;
        return true;
    L9:
        return false;
    }

    public boolean j3(java.lang.String r5) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 1071910327664708661L, this, r5);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1071910327664708661L, this, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if (this.Hw == null) goto L11;
        if (this.Hw.aM(r5) == false) goto L11;
        return true;
    L11:
        return false;
    }

    public void j6(java.lang.String r8, com.aide.common.ab<java.lang.String> r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -881301638471749509L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-881301638471749509L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        this.Hw.j6(r8, r9);     // Catch: java.lang.Throwable -> L7
    }

    public void j6(java.lang.String r8, java.lang.String r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 3940653092578028557L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(3940653092578028557L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        this.Hw.j6(r8, r9);     // Catch: java.lang.Throwable -> L7
    }

    public void j6(java.lang.String r8, boolean r9) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 1988636870405400561L, this, r8, new java.lang.Boolean(r9));
    L17:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(1988636870405400561L, this, r8, new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L13
    L6:
        if (QX(r8) == true) goto L8;
        return;
    L8:
        if (r8 != null) goto L10;
        return;
    L10:
        if (r8.equals(J0()) == true) goto L21;
        SI(r8);     // Catch: java.lang.Throwable -> L13
        ei();     // Catch: java.lang.Throwable -> L13
        com.aide.ui.U.we().j6();     // Catch: java.lang.Throwable -> L13
        com.aide.ui.U.XL().Hw();     // Catch: java.lang.Throwable -> L13
        com.aide.ui.U.er().j6();     // Catch: java.lang.Throwable -> L13
        com.aide.ui.U.v5().u7();     // Catch: java.lang.Throwable -> L13
        com.aide.ui.U.rN().DW();     // Catch: java.lang.Throwable -> L13
        this.Hw = ei(r8);     // Catch: java.lang.Throwable -> L13
        com.aide.ui.U.j6(com.aide.ui.U.lg(), "Opening project...", new abcd.RunnableVk(this), new abcd.RunnableC0430Wk(this, r9));     // Catch: java.lang.Throwable -> L13
        return;
    }

    public void j6(java.util.List<java.lang.String> r8, boolean r9) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, -1064425621880724340L, this, r8, new java.lang.Boolean(r9));
    L13:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1064425621880724340L, this, r8, new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L9
    L6:
        if (this.Hw == null) goto L16;
        this.Hw.j6(r8, r9);     // Catch: java.lang.Throwable -> L9
        return;
    }

    public void j6(boolean r5) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 2296922460084943041L, this, new java.lang.Boolean(r5));
    L18:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2296922460084943041L, this, r5);     // Catch: java.lang.Throwable -> L14
    L6:
        if (r5 == false) goto L9;
        er();     // Catch: java.lang.Throwable -> L14
    L9:
        if (FH() == false) goto L11;
        this.VH = true;     // Catch: java.lang.Throwable -> L14
        this.Hw.j6(r5);     // Catch: java.lang.Throwable -> L14
        return;
    L11:
        if (r5 == false) goto L21;
        com.aide.ui.U.EQ().v5();     // Catch: java.lang.Throwable -> L14
        return;
    }

    public boolean j6() {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -1437092493407831113L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1437092493407831113L, this);     // Catch: java.lang.Throwable -> L13
    L7:
        if (j3() == false) goto L11;
        if (com.aide.ui.U.v5().VH() == true) goto L11;
        return true;
    L11:
        return false;
    }

    public java.lang.String lg(java.lang.String r5) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -6224985091426817961L, this, r5);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-6224985091426817961L, this, r5);     // Catch: java.lang.Throwable -> L11
    L7:
        if (this.Hw == null) goto L18;
        return this.Hw.j6(r5);
    L18:
        return null;
    }

    public void lg() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 827393935361282867L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(827393935361282867L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw.u7();     // Catch: java.lang.Throwable -> L8
    }

    public void rN() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3899046423914606316L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3899046423914606316L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw.Hw();     // Catch: java.lang.Throwable -> L8
    }

    public void rN(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3355195788006222432L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3355195788006222432L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        j6(r5, true);     // Catch: java.lang.Throwable -> L8
    }

    public java.lang.String tp() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 507252140888673019L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(507252140888673019L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        java.lang.String[] r2 = u7().split(" ");     // Catch: java.lang.Throwable -> L12
        if (r2.length != 2) goto L10;
        return r2[0];
    L10:
        return null;
    }

    public java.util.List<java.lang.String> tp(java.lang.String r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 2793557493527432544L, this, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(2793557493527432544L, this, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (this.Hw != null) goto L10;
        return null;
    L10:
        return this.Hw.u7(r5);
    }

    public java.lang.String u7() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -4791029522100934433L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-4791029522100934433L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (this.FH != null) goto L10;
        return "";
    L10:
        return com.aide.ui.U.Zo().getSharedPreferences("ProjectService", 0).getString("BuildVariant_" + this.FH, "debug");
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> u7(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -877705586190917880L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-877705586190917880L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return abcd.Ti.j6(r5, this.v5);
    }

    public void v5() {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -903356770592154456L, this);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-903356770592154456L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (this.FH == null) goto L17;
        SI(null);     // Catch: java.lang.Throwable -> L10
        ei();     // Catch: java.lang.Throwable -> L10
        com.aide.ui.U.we().j6();     // Catch: java.lang.Throwable -> L10
        com.aide.ui.U.XL().Hw();     // Catch: java.lang.Throwable -> L10
        com.aide.ui.U.er().j6();     // Catch: java.lang.Throwable -> L10
        this.Hw = null;     // Catch: java.lang.Throwable -> L10
        this.v5 = new java.util.HashMap();     // Catch: java.lang.Throwable -> L10
        com.aide.ui.U.gn().j6();     // Catch: java.lang.Throwable -> L10
        com.aide.ui.U.lg().ef();     // Catch: java.lang.Throwable -> L10
        P8();     // Catch: java.lang.Throwable -> L10
        return;
    }

    public boolean v5(java.lang.String r5) {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 270920001954221664L, this, r5);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(270920001954221664L, this, r5);     // Catch: java.lang.Throwable -> L15
    L7:
        if (j3() == true) goto L9;
    L13:
        return false;
    L9:
        if (this.Hw == null) goto L13;
        if (this.Hw.we(r5) == false) goto L13;
        return true;
    }

    public void vy(java.lang.String r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 5365972511710753536L, this, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5365972511710753536L, this, r5);     // Catch: java.lang.Throwable -> L12
    L6:
        java.lang.String r2 = tp();     // Catch: java.lang.Throwable -> L12
        if (r2 == null) goto L9;
        java.lang.String r3 = r2 + " " + r5;     // Catch: java.lang.Throwable -> L12
    L10:
        BT(r3);     // Catch: java.lang.Throwable -> L12
        return;
    L9:
        r3 = r5;
        goto L10
    }

    public java.util.List<java.lang.String> we() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1635664609308324055L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1635664609308324055L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Zo;
    }

    public void yS() {
    L16:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, -3339093473334731723L, this);
    L20:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-3339093473334731723L, this);     // Catch: java.lang.Throwable -> L16
    L7:
        if (this.FH != null) goto L9;
    L11:
        com.aide.ui.U.gn().j3();     // Catch: java.lang.Throwable -> L16
        if (this.FH == null) goto L14;
        com.aide.ui.U.j6(com.aide.ui.U.lg(), "Reloading project...", new abcd.RunnableXk(this), new abcd.RunnableC0462Yk(this));     // Catch: java.lang.Throwable -> L16
        return;
    L14:
        vy();     // Catch: java.lang.Throwable -> L16
        P8();     // Catch: java.lang.Throwable -> L16
        return;
    L9:
        if (ei(this.FH) != null) goto L11;
        v5();     // Catch: java.lang.Throwable -> L16
        goto L11
    }

    public void yS(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3083412232993272960L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3083412232993272960L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw.Hw(r5);     // Catch: java.lang.Throwable -> L8
        yS();     // Catch: java.lang.Throwable -> L8
    }
}
