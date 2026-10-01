package com.aide.uidesigner;

@abcd.Interfacexu
public class ClassS extends com.aide.common.ClassN {

    @abcd.Interfacetu
    private static boolean gn;

    @abcd.Interfaceuu
    private static boolean u7;

    @abcd.Interfaceru(field = 224562302322451389L)
    private com.aide.uidesigner.ClassC EQ;

    @abcd.Interfaceru(field = -1894959334754137872L)
    private com.aide.uidesigner.Pa J0;

    @abcd.Interfaceru(field = 2467908523754801685L)
    private com.aide.uidesigner.ClassS J8;

    @abcd.Interfaceru(field = -871566903097814784L)
    private int Ws;

    @abcd.Interfaceru(field = 1728932783690474857L)
    private org.w3c.dom.Element tp;

    @abcd.Interfaceru(field = -3556725367138142672L)
    private com.aide.uidesigner.ClassC we;

    static {
        abcd.wu.j6(com.aide.uidesigner.ClassS.class, -706587840109084875L, -706587840109084875L);
    }

    public ClassS(android.content.Context r7, android.view.View r8, org.w3c.dom.Element r9, com.aide.uidesigner.ClassC r10, com.aide.uidesigner.ClassC r11, com.aide.uidesigner.ClassS r12, int r13, com.aide.uidesigner.Pa r14) {
        if (gn == false) goto L5;
        abcd.wu.j6(-1628815987762237804L, null, new java.lang.Object[]{r7, r8, r9, r10, r11, r12, new java.lang.Integer(r13), r14});
    L5:
        super(r7, r8);
        this.tp = r9;
        this.EQ = r10;
        this.we = r11;
        this.J0 = r14;
        this.J8 = r12;
        this.Ws = r13;
    }

    @abcd.Interfacesu(method = 111422129680084600L)
    private void j6(com.aide.uidesigner.ClassB r8, com.aide.uidesigner.N.a r9) {
    L10:
        th = move-exception;
        if (u7 == false) goto L14;
        abcd.wu.j6(th, -262745760184814144L, this, r8, r9);
    L14:
        throw th;
    L3:
        if (gn == false) goto L5;
        abcd.wu.j6(-262745760184814144L, this, r8, r9);     // Catch: java.lang.Throwable -> L10
    L5:
        java.lang.String r0 = getViewID();     // Catch: java.lang.Throwable -> L10
        if (r0 != null) goto L8;
        r0 = EQ();     // Catch: java.lang.Throwable -> L10
    L8:
        java.lang.String r6 = r0;
        this.J0.j6(getParentView().tp, r8, this.tp, r9, r6);     // Catch: java.lang.Throwable -> L10
    }

    @abcd.Interfacesu(method = 4149385309121686447L)
    private boolean we() {
    L15:
        th = move-exception;
        if (u7 == false) goto L19;
        abcd.wu.j6(th, 1592452833680740647L, this);
    L19:
        throw th;
    L4:
        if (gn == false) goto L7;
        abcd.wu.j6(1592452833680740647L, this);     // Catch: java.lang.Throwable -> L15
    L7:
        if (this.EQ != null) goto L9;
    L13:
        return false;
    L9:
        if ((this.EQ.FH instanceof android.view.ViewGroup) == false) goto L13;
        if ((this.EQ.FH instanceof android.widget.AdapterView) == true) goto L13;
        return true;
    }

    public void DW(com.aide.uidesigner.ClassB r5) {
    L11:
        th = move-exception;
        if (u7 == false) goto L15;
        abcd.wu.j6(th, 521311967931615669L, this, r5);
    L15:
        throw th;
    L4:
        if (gn == false) goto L7;
        abcd.wu.j6(521311967931615669L, this, r5);     // Catch: java.lang.Throwable -> L11
    L7:
        if (getParentView().gn() == false) goto L9;
        j6(r5, com.aide.uidesigner.N.DW);     // Catch: java.lang.Throwable -> L11
        return;
    L9:
        this.J0.j6(this.tp, r5);     // Catch: java.lang.Throwable -> L11
    }

    public boolean DW() {
    L13:
        th = move-exception;
        if (u7 == false) goto L17;
        abcd.wu.j6(th, -2917501330826488552L, this);
    L17:
        throw th;
    L4:
        if (gn == false) goto L7;
        abcd.wu.j6(-2917501330826488552L, this);     // Catch: java.lang.Throwable -> L13
    L7:
        if (u7() == true) goto L11;
        if (getParentView().gn() == false) goto L11;
        return true;
    L11:
        return false;
    }

    public java.lang.String EQ() {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, -1747891648708810256L, this);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(-1747891648708810256L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.J0.FH(this.tp);
    }

    public void FH(com.aide.uidesigner.ClassB r5) {
    L11:
        th = move-exception;
        if (u7 == false) goto L15;
        abcd.wu.j6(th, -4022161658055400264L, this, r5);
    L15:
        throw th;
    L4:
        if (gn == false) goto L7;
        abcd.wu.j6(-4022161658055400264L, this, r5);     // Catch: java.lang.Throwable -> L11
    L7:
        if (getParentView().gn() == false) goto L9;
        j6(r5, com.aide.uidesigner.N.j6);     // Catch: java.lang.Throwable -> L11
        return;
    L9:
        this.J0.DW(this.tp, r5);     // Catch: java.lang.Throwable -> L11
    }

    public boolean FH() {
    L9:
        th = move-exception;
        if (u7 == false) goto L13;
        abcd.wu.j6(th, -2873787071630574400L, this);
    L13:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(-2873787071630574400L, this);     // Catch: java.lang.Throwable -> L9
    L6:
        return !u7();
    }

    public void Hw(com.aide.uidesigner.ClassB r5) {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, 1158415758373284875L, this, r5);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(1158415758373284875L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        j6(r5, com.aide.uidesigner.N.FH);     // Catch: java.lang.Throwable -> L8
    }

    public boolean Hw() {
    L9:
        th = move-exception;
        if (u7 == false) goto L13;
        abcd.wu.j6(th, -2868549134115936999L, this);
    L13:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(-2868549134115936999L, this);     // Catch: java.lang.Throwable -> L9
    L6:
        return !u7();
    }

    public void VH() {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, -2556865680408999701L, this);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(-2556865680408999701L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.J0.j6(this.tp);     // Catch: java.lang.Throwable -> L8
    }

    public void Zo(com.aide.uidesigner.ClassB r5) {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, -3872641062152939447L, this, r5);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(-3872641062152939447L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.J0.Hw(this.tp, r5);     // Catch: java.lang.Throwable -> L8
    }

    public boolean Zo() {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, 1826432615644948693L, this);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(1826432615644948693L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return we();
    }

    public java.util.List<java.lang.String> getAllIDs() {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, -233750301492986935L, this);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(-233750301492986935L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.J0.Hw();
    }

    public java.util.List<java.lang.String> getAllUserDrawables() {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, 5726123150203421175L, this);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(5726123150203421175L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.J0.v5();
    }

    public java.util.List<java.lang.String> getAllUserStyles() {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, 5897349360065094236L, this);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(5897349360065094236L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.J0.Zo();
    }

    public java.util.List<com.aide.uidesigner.ClassA> getAttributes() {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, -4175529149073282717L, this);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(-4175529149073282717L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.J0.j6(this.EQ, this.we, this.tp);
    }

    public int getDepth() {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, 1013293843477500763L, this);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(1013293843477500763L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Ws;
    }

    public java.lang.String getNodeName() {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, 526405200586421405L, this);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(526405200586421405L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.tp.getNodeName();
    }

    public com.aide.uidesigner.ClassS getParentView() {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, -1068956617206192667L, this);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(-1068956617206192667L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.J8;
    }

    public java.lang.String getPath() {
    L12:
        th = move-exception;
        if (u7 == false) goto L16;
        abcd.wu.j6(th, -1394422998855237901L, this);
    L16:
        throw th;
    L4:
        if (gn == false) goto L7;
        abcd.wu.j6(-1394422998855237901L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (this.J8 == null) goto L11;
        return this.J8.getPath() + " > " + getNodeName();
    L11:
        return getNodeName();
    }

    public int getSourceColumn() {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, 629531352497565041L, this);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(629531352497565041L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return java.lang.Integer.parseInt((java.lang.String) this.tp.getUserData("column"));
    }

    public int getSourceLine() {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, -3679638924770922367L, this);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(-3679638924770922367L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return java.lang.Integer.parseInt((java.lang.String) this.tp.getUserData("line"));
    }

    public java.lang.String getStyle() {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, 1737418395914239101L, this);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(1737418395914239101L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.J0.DW(this.tp);
    }

    public java.lang.String getViewID() {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, 2146379560382166228L, this);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(2146379560382166228L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.J0.j6(this.tp);
    }

    public boolean gn() {
    L13:
        th = move-exception;
        if (u7 == false) goto L17;
        abcd.wu.j6(th, 5305899016871590800L, this);
    L17:
        throw th;
    L4:
        if (gn == false) goto L7;
        abcd.wu.j6(5305899016871590800L, this);     // Catch: java.lang.Throwable -> L13
    L7:
        if (this.EQ == null) goto L11;
        if ((this.EQ.FH instanceof android.widget.RelativeLayout) == false) goto L11;
        return true;
    L11:
        return false;
    }

    @Override
    @abcd.Interfacesu(method = -2336004718696859640L)
    protected void j6() {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, -1528670939420321216L, this);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(-1528670939420321216L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.J0.DW(this);     // Catch: java.lang.Throwable -> L8
    }

    public void j6(com.aide.common.ab<com.aide.uidesigner.ClassS> r5) {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, 1509307065945923040L, this, r5);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(1509307065945923040L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.J0.j6(this.tp, r5);     // Catch: java.lang.Throwable -> L8
    }

    public void j6(com.aide.uidesigner.XmlLayoutDesignActivity r5) {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, -2329136150321508339L, this, r5);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(-2329136150321508339L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        r5.j6(getSourceLine(), getSourceColumn());     // Catch: java.lang.Throwable -> L8
    }

    public void j6(com.aide.uidesigner.ClassA r9, com.aide.uidesigner.ClassS r10, java.lang.String r11) {
    L11:
        th = move-exception;
        if (u7 == false) goto L15;
        abcd.wu.j6(th, 177431308788048107L, this, r9, r10, r11);
    L15:
        throw th;
    L3:
        if (gn == false) goto L5;
        abcd.wu.j6(177431308788048107L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L11
    L5:
        com.aide.uidesigner.Pa r0 = this.J0;     // Catch: java.lang.Throwable -> L11
        org.w3c.dom.Element r1 = this.tp;     // Catch: java.lang.Throwable -> L11
        com.aide.uidesigner.N.a r2 = r9.FH;     // Catch: java.lang.Throwable -> L11
        if (r10 != null) goto L8;
        org.w3c.dom.Element r3 = null;
    L9:
        r0.j6(r1, r2, r3, r11);     // Catch: java.lang.Throwable -> L11
        return;
    L8:
        r3 = r10.tp;     // Catch: java.lang.Throwable -> L11
        goto L9
    }

    public void j6(com.aide.uidesigner.ClassA r8, java.lang.String r9) {
    L7:
        th = move-exception;
        if (u7 == false) goto L11;
        abcd.wu.j6(th, 1117778902033477729L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (gn == false) goto L5;
        abcd.wu.j6(1117778902033477729L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        this.J0.j6(this.tp, r8.FH, r9);     // Catch: java.lang.Throwable -> L7
    }

    public void j6(com.aide.uidesigner.ClassB r5) {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, 917907031588883819L, this, r5);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(917907031588883819L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        j6(r5, com.aide.uidesigner.N.Hw);     // Catch: java.lang.Throwable -> L8
    }

    public void j6(java.lang.String r8, android.content.Intent r9) {
    L7:
        th = move-exception;
        if (u7 == false) goto L11;
        abcd.wu.j6(th, -2363206505147598096L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (gn == false) goto L5;
        abcd.wu.j6(-2363206505147598096L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        this.J0.j6(r8, r9);     // Catch: java.lang.Throwable -> L7
    }

    public void setStyle(java.lang.String r5) {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, 971021530899392667L, this, r5);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(971021530899392667L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.J0.j6(this.tp, r5);     // Catch: java.lang.Throwable -> L8
    }

    public void setViewID(java.lang.String r5) {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, -597241802526823664L, this, r5);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(-597241802526823664L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.J0.DW(this.tp, r5);     // Catch: java.lang.Throwable -> L8
    }

    public java.lang.String tp() {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, 56860918993370208L, this);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(56860918993370208L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.J0.QX();
    }

    public boolean u7() {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, 1610904284143631925L, this);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(1610904284143631925L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.tp.getParentNode() instanceof org.w3c.dom.Document;
    }

    public void v5(com.aide.uidesigner.ClassB r5) {
    L8:
        th = move-exception;
        if (u7 == false) goto L12;
        abcd.wu.j6(th, 3675099219237646200L, this, r5);
    L12:
        throw th;
    L4:
        if (gn == false) goto L6;
        abcd.wu.j6(3675099219237646200L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.J0.FH(this.tp, r5);     // Catch: java.lang.Throwable -> L8
    }

    public boolean v5() {
    L13:
        th = move-exception;
        if (u7 == false) goto L17;
        abcd.wu.j6(th, -2856060604732147600L, this);
    L17:
        throw th;
    L4:
        if (gn == false) goto L7;
        abcd.wu.j6(-2856060604732147600L, this);     // Catch: java.lang.Throwable -> L13
    L7:
        if (u7() == true) goto L11;
        if (getParentView().gn() == false) goto L11;
        return true;
    L11:
        return false;
    }
}
