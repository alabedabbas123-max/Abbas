package com.aide.uidesigner;

@abcd.Interfacexu
public class ka {

    @abcd.Interfaceru(field = -5980997643940799179L)
    private static com.aide.uidesigner.ClassA DW;

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfaceru(field = -4959448495746857200L)
    private static com.aide.uidesigner.ClassS j6;

    static {
        abcd.wu.j6(com.aide.uidesigner.ka.class, 2051778340695604592L, 2051778340695604592L);
    }

    public ka() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 28778740740534600L, null);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(28778740740534600L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    static com.aide.uidesigner.ClassA DW() {
        return DW;
    }

    public static void DW(android.app.Activity r7, com.aide.uidesigner.ClassS r8) {
    L7:
        th = move-exception;
        if (Hw == false) goto L11;
        abcd.wu.j6(th, -1517536325098742816L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-1517536325098742816L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        java.util.ArrayList r0 = new java.util.ArrayList(r8.getAllUserStyles());     // Catch: java.lang.Throwable -> L7
        java.util.Collections.sort(r0);     // Catch: java.lang.Throwable -> L7
        r0.add("other...");     // Catch: java.lang.Throwable -> L7
        r0.add("none");     // Catch: java.lang.Throwable -> L7
        com.aide.common.Abstractma.j6(r7, "Style", r0, new com.aide.uidesigner.W(r8, r7));     // Catch: java.lang.Throwable -> L7
    }

    static void DW(android.app.Activity r0, com.aide.uidesigner.ClassS r1, com.aide.uidesigner.ClassA r2) {
        VH(r0, r1, r2);
    }

    @abcd.Interfacesu(method = -1740071476523258971L)
    private static void DW(android.app.Activity r9, com.aide.uidesigner.ClassS r10, com.aide.uidesigner.ClassA r11, java.lang.String r12) {
    L11:
        th = move-exception;
        if (Hw == false) goto L15;
        abcd.wu.j6(th, 156701052413333672L, null, r9, r10, r11, r12);
    L15:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(156701052413333672L, null, r9, r10, r11, r12);     // Catch: java.lang.Throwable -> L11
    L5:
        java.lang.String r0 = r11.Hw;     // Catch: java.lang.Throwable -> L11
        if (r0 != null) goto L8;
        java.lang.String r5 = r12;
    L9:
        com.aide.common.Abstractma.j6(r9, r11.FH.j6(), null, "None", r5, new com.aide.uidesigner.S(r10, r11), new com.aide.uidesigner.T(r10, r11));     // Catch: java.lang.Throwable -> L11
        return;
    L8:
        r5 = r0;
        goto L9
    }

    @abcd.Interfacesu(method = 3225116787713462576L)
    private static void DW(android.app.Activity r10, com.aide.uidesigner.ClassS r11, com.aide.uidesigner.ClassA r12, java.lang.String r13, java.lang.String r14) {
    L10:
        th = move-exception;
        if (Hw == false) goto L14;
        abcd.wu.j6(th, 1425978316435705725L, null, r10, r11, r12, r13, r14);
    L14:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(1425978316435705725L, null, r10, r11, r12, r13, r14);     // Catch: java.lang.Throwable -> L10
    L5:
        if (r13 != null) goto L7;
        java.lang.String r0 = r14;
    L8:
        com.aide.common.Abstractma.j6(r10, new com.aide.common.Fa(r12.FH.j6(), r0, new com.aide.uidesigner.P(r11, r12), new com.aide.uidesigner.Q(r11, r12)));     // Catch: java.lang.Throwable -> L10
        return;
    L7:
        r0 = r13;
        goto L8
    }

    @abcd.Interfacesu(method = -2663837737152084924L)
    private static void DW(android.app.Activity r9, com.aide.uidesigner.ClassS r10, com.aide.uidesigner.ClassA r11, java.lang.String... r12) {
    L10:
        th = move-exception;
        if (Hw == false) goto L15;
        abcd.wu.j6(th, 585535013346904095L, null, r9, r10, r11, r12);
    L15:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(585535013346904095L, null, r9, r10, r11, r12);     // Catch: java.lang.Throwable -> L10
    L5:
        java.util.ArrayList r0 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L10
        int r1 = r12.length;     // Catch: java.lang.Throwable -> L10
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L8;
        r0.add(com.aide.uidesigner.ClassA.j6(r12[r2]));     // Catch: java.lang.Throwable -> L10
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L10
        goto L6
    L8:
        r0.add("none");     // Catch: java.lang.Throwable -> L10
        com.aide.common.Abstractma.DW(r9, r11.FH.j6(), r0, new com.aide.uidesigner.fa(r0, r10, r11, r12));     // Catch: java.lang.Throwable -> L10
    }

    @abcd.Interfacesu(method = -2073714533731865332L)
    private static void EQ(android.app.Activity r8, com.aide.uidesigner.ClassS r9, com.aide.uidesigner.ClassA r10) {
    L10:
        th = move-exception;
        if (Hw == false) goto L14;
        abcd.wu.j6(th, -29985993058513239L, null, r8, r9, r10);
    L14:
        throw th;
    L3:
        if (FH == false) goto L6;
        abcd.wu.j6(-29985993058513239L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L10
    L6:
        if (r10.Hw != null) goto L8;
        QX(r8, r9, r10);     // Catch: java.lang.Throwable -> L10
        return;
    L8:
        com.aide.common.Abstractma.j6(r8, r10.FH.j6(), java.util.Arrays.asList(new java.lang.String[]{"View...", "none"}), new com.aide.uidesigner.ca(r8, r9, r10));     // Catch: java.lang.Throwable -> L10
    }

    static void FH(android.app.Activity r0, com.aide.uidesigner.ClassS r1, com.aide.uidesigner.ClassA r2) {
        u7(r0, r1, r2);
    }

    static void Hw(android.app.Activity r0, com.aide.uidesigner.ClassS r1, com.aide.uidesigner.ClassA r2) {
        we(r0, r1, r2);
    }

    @abcd.Interfacesu(method = 1993814663591816599L)
    private static void J0(android.app.Activity r12, com.aide.uidesigner.ClassS r13, com.aide.uidesigner.ClassA r14) {
    L40:
        th = move-exception;
        if (Hw == false) goto L45;
        abcd.wu.j6(th, -895850946703636392L, null, r12, r13, r14);
    L45:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-895850946703636392L, null, r12, r13, r14);     // Catch: java.lang.Throwable -> L40
    L5:
        int r4 = 0;
        if ("android:visibility".equals(r14.FH.Zo) == false) goto L9;
        DW(r12, r13, r14, new java.lang.String[]{"visible", "invisible", "gone"});     // Catch: java.lang.Throwable -> L40
        return;
    L9:
        if ("android:orientation".equals(r14.FH.Zo) == false) goto L12;
        DW(r12, r13, r14, new java.lang.String[]{"horizontal", "vertical"});     // Catch: java.lang.Throwable -> L40
        return;
    L12:
        if ("android:typeface".equals(r14.FH.Zo) == false) goto L15;
        DW(r12, r13, r14, new java.lang.String[]{"normal", "sans", "serif", "monospace"});     // Catch: java.lang.Throwable -> L40
        return;
    L15:
        if ("android:alignmentMode".equals(r14.FH.Zo) == false) goto L19;
        DW(r12, r13, r14, new java.lang.String[]{"alignBounds", "alignMargins"});     // Catch: java.lang.Throwable -> L40
        return;
    L19:
        if ("android:textAlignment".equals(r14.FH.Zo) == false) goto L22;
        DW(r12, r13, r14, new java.lang.String[]{"inherit", "gravity", "textStart", "textEnd", "center", "viewStart", "viewEnd"});     // Catch: java.lang.Throwable -> L40
        return;
    L22:
        if ("android.view.Gravity".equals(r14.FH.u7) == false) goto L26;
        j6(r12, r13, r14, new java.lang.String[]{"top", "bottom", "left", "right", "center", "center_vertical", "center_horizontal", "fill", "fill_vertical", "fill_horizontal", "clip_vertical", "clip_horizontal", "start", "end"});     // Catch: java.lang.Throwable -> L40
        return;
    L26:
        if (r14.FH.tp != null) goto L28;
    L38:
        DW(r12, r13, r14, "");     // Catch: java.lang.Throwable -> L40
        return;
    L28:
        if (r14.FH.v5 == null) goto L38;
        java.util.ArrayList r0 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L40
        java.lang.reflect.Field[] r2 = r14.FH.gn.getFields();     // Catch: java.lang.Throwable -> L40
        int r3 = r2.length;     // Catch: java.lang.Throwable -> L40
    L30:
        if (r4 >= r3) goto L37;
        java.lang.reflect.Field r5 = r2[r4];     // Catch: java.lang.Throwable -> L40
        java.lang.String r6 = r5.getName();     // Catch: java.lang.Throwable -> L40
        if ((r5.getModifiers() & 8) == 0) goto L36;
        if (r6.startsWith(r14.FH.tp) == false) goto L36;
        r0.add(r6.substring(r14.FH.tp.length()).replace("_", ""));     // Catch: java.lang.Throwable -> L40
    L36:
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L40
        goto L30
    L37:
        java.util.Collections.sort(r0);     // Catch: java.lang.Throwable -> L40
        j6(r12, r13, r14, r0);     // Catch: java.lang.Throwable -> L40
    }

    @abcd.Interfacesu(method = -533331036259378236L)
    private static void J8(android.app.Activity r8, com.aide.uidesigner.ClassS r9, com.aide.uidesigner.ClassA r10) {
    L7:
        th = move-exception;
        if (Hw == false) goto L11;
        abcd.wu.j6(th, 59394711500843085L, null, r8, r9, r10);
    L11:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(59394711500843085L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L7
    L5:
        com.aide.common.Abstractma.j6(r8, r10.FH.j6(), java.util.Arrays.asList(new java.lang.String[]{"Wrap Content", "Match Parent", "Fixed size..."}), new com.aide.uidesigner.O(r9, r10, r8));     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = -1405867015791855552L)
    private static void QX(android.app.Activity r8, com.aide.uidesigner.ClassS r9, com.aide.uidesigner.ClassA r10) {
    L7:
        th = move-exception;
        if (Hw == false) goto L11;
        abcd.wu.j6(th, -3316322168945826183L, null, r8, r9, r10);
    L11:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-3316322168945826183L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L7
    L5:
        com.almlkaide.kaypro.util.Toasty.toast(r8, "Select another view", 0).show();     // Catch: java.lang.Throwable -> L7
        r9.j6(new com.aide.uidesigner.da(r9, r10, r8));     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = -2152729137236443936L)
    private static void VH(android.app.Activity r8, com.aide.uidesigner.ClassS r9, com.aide.uidesigner.ClassA r10) {
    L7:
        th = move-exception;
        if (Hw == false) goto L11;
        abcd.wu.j6(th, -3373378528347596289L, null, r8, r9, r10);
    L11:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-3373378528347596289L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L7
    L5:
        com.aide.common.Abstractma.j6(r8, new com.almlkaide.kaypro.manifesteditor.colorpicker.ColorPickerDialog(r10.FH.j6(), r10.Hw, new com.aide.uidesigner.ja(r9, r10)));     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = 495942782007439760L)
    private static void Ws(android.app.Activity r8, com.aide.uidesigner.ClassS r9, com.aide.uidesigner.ClassA r10) {
    L7:
        th = move-exception;
        if (Hw == false) goto L11;
        abcd.wu.j6(th, 6933850848823222603L, null, r8, r9, r10);
    L11:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(6933850848823222603L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r8, r9, r10, "?android:attr/", new java.lang.String[]{"?android:attr/textAppearanceSmall", "?android:attr/textAppearanceMedium", "?android:attr/textAppearanceLarge"});     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = 238741641814319585L)
    private static void Zo(android.app.Activity r8, com.aide.uidesigner.ClassS r9, com.aide.uidesigner.ClassA r10) {
    L7:
        th = move-exception;
        if (Hw == false) goto L11;
        abcd.wu.j6(th, -4195348454891185576L, null, r8, r9, r10);
    L11:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-4195348454891185576L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L7
    L5:
        DW(r8, r9, r10, new java.lang.String[]{"true", "false"});     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = 353579590572593511L)
    private static void gn(android.app.Activity r8, com.aide.uidesigner.ClassS r9, com.aide.uidesigner.ClassA r10) {
    L13:
        th = move-exception;
        if (Hw == false) goto L17;
        abcd.wu.j6(th, -65978018837029320L, null, r8, r9, r10);
    L17:
        throw th;
    L3:
        if (FH == false) goto L6;
        abcd.wu.j6(-65978018837029320L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L13
    L6:
        if (r10.Hw != null) goto L9;
        com.aide.common.Abstractma.j6(r8, r10.FH.j6(), java.util.Arrays.asList(new java.lang.String[]{"Color...", "Drawable...", "none"}), new com.aide.uidesigner.ga(r8, r9, r10));     // Catch: java.lang.Throwable -> L13
        return;
    L9:
        if (r10.Hw.startsWith("#") == false) goto L11;
        VH(r8, r9, r10);     // Catch: java.lang.Throwable -> L13
        return;
    L11:
        u7(r8, r9, r10);     // Catch: java.lang.Throwable -> L13
    }

    static com.aide.uidesigner.ClassA j6(com.aide.uidesigner.ClassA r0) {
        DW = r0;
        return r0;
    }

    static com.aide.uidesigner.ClassS j6() {
        return j6;
    }

    static com.aide.uidesigner.ClassS j6(com.aide.uidesigner.ClassS r0) {
        j6 = r0;
        return r0;
    }

    public static void j6(android.app.Activity r7, android.content.Intent r8) {
    L9:
        th = move-exception;
        if (Hw == false) goto L13;
        abcd.wu.j6(th, 715108979836938084L, null, r7, r8);
    L13:
        throw th;
    L3:
        if (FH == false) goto L6;
        abcd.wu.j6(715108979836938084L, null, r7, r8);     // Catch: java.lang.Throwable -> L9
    L6:
        if (j6 == null) goto L16;
        com.aide.common.Abstractma.j6(r7, "Choose Name", "Enter a name for the image", j6.tp(), new com.aide.uidesigner.aa(r8));     // Catch: java.lang.Throwable -> L9
        return;
    }

    public static void j6(android.app.Activity r8, com.aide.uidesigner.ClassS r9) {
    L11:
        th = move-exception;
        if (Hw == false) goto L15;
        abcd.wu.j6(th, 1577388307852217168L, null, r8, r9);
    L15:
        throw th;
    L3:
        if (FH == false) goto L6;
        abcd.wu.j6(1577388307852217168L, null, r8, r9);     // Catch: java.lang.Throwable -> L11
    L6:
        if (r9.getViewID() == null) goto L8;
        java.lang.String r0 = r9.getViewID();     // Catch: java.lang.Throwable -> L11
    L9:
        com.aide.common.Abstractma.j6(r8, "ID", null, "None", r0, new com.aide.uidesigner.X(r9), new com.aide.uidesigner.Y(r9));     // Catch: java.lang.Throwable -> L11
        return;
    L8:
        r0 = r9.EQ();     // Catch: java.lang.Throwable -> L11
        goto L9
    }

    static void j6(android.app.Activity r0, com.aide.uidesigner.ClassS r1, com.aide.uidesigner.ClassA r2) {
        QX(r0, r1, r2);
    }

    static void j6(android.app.Activity r0, com.aide.uidesigner.ClassS r1, com.aide.uidesigner.ClassA r2, java.lang.String r3) {
        DW(r0, r1, r2, r3);
    }

    static void j6(android.app.Activity r0, com.aide.uidesigner.ClassS r1, com.aide.uidesigner.ClassA r2, java.lang.String r3, java.lang.String r4) {
        DW(r0, r1, r2, r3, r4);
    }

    @abcd.Interfacesu(method = 2010827179277068368L)
    private static void j6(android.app.Activity r10, com.aide.uidesigner.ClassS r11, com.aide.uidesigner.ClassA r12, java.lang.String r13, java.util.List<java.lang.String> r14) {
    L11:
        th = move-exception;
        if (Hw == false) goto L16;
        abcd.wu.j6(th, -1280708677041101633L, null, r10, r11, r12, r13, r14);
    L16:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-1280708677041101633L, null, r10, r11, r12, r13, r14);     // Catch: java.lang.Throwable -> L11
    L5:
        java.util.ArrayList r7 = new java.util.ArrayList(r14);     // Catch: java.lang.Throwable -> L11
        java.util.Collections.sort(r7);     // Catch: java.lang.Throwable -> L11
        java.util.ArrayList r0 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L11
        java.util.Iterator r1 = r7.iterator();     // Catch: java.lang.Throwable -> L11
    L7:
        if (r1.hasNext() == false) goto L9;
        r0.add(com.aide.uidesigner.ClassA.j6((java.lang.String) r1.next()));     // Catch: java.lang.Throwable -> L11
        goto L7
    L9:
        r0.add("other...");     // Catch: java.lang.Throwable -> L11
        r0.add("none");     // Catch: java.lang.Throwable -> L11
        com.aide.common.Abstractma.DW(r10, r12.FH.j6(), r0, new com.aide.uidesigner.ia(r0, r11, r12, r10, r13, r7));     // Catch: java.lang.Throwable -> L11
    }

    @abcd.Interfacesu(method = 1537002333442138464L)
    private static void j6(android.app.Activity r10, com.aide.uidesigner.ClassS r11, com.aide.uidesigner.ClassA r12, java.lang.String r13, java.lang.String... r14) {
    L7:
        th = move-exception;
        if (Hw == false) goto L11;
        abcd.wu.j6(th, -909963853786902595L, null, r10, r11, r12, r13, r14);
    L11:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-909963853786902595L, null, r10, r11, r12, r13, r14);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r10, r11, r12, r13, java.util.Arrays.asList(r14));     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = 5901572919764762625L)
    private static void j6(android.app.Activity r9, com.aide.uidesigner.ClassS r10, com.aide.uidesigner.ClassA r11, java.util.List<java.lang.String> r12) {
    L7:
        th = move-exception;
        if (Hw == false) goto L11;
        abcd.wu.j6(th, 5754110875469342904L, null, r9, r10, r11, r12);
    L11:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(5754110875469342904L, null, r9, r10, r11, r12);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r9, r10, r11, (java.lang.String[]) r12.toArray(new java.lang.String[r12.size()]));     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = -6754499492487883665L)
    private static void j6(android.app.Activity r9, com.aide.uidesigner.ClassS r10, com.aide.uidesigner.ClassA r11, java.lang.String... r12) {
    L10:
        th = move-exception;
        if (Hw == false) goto L15;
        abcd.wu.j6(th, -5389415207739713280L, null, r9, r10, r11, r12);
    L15:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-5389415207739713280L, null, r9, r10, r11, r12);     // Catch: java.lang.Throwable -> L10
    L5:
        java.util.ArrayList r4 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L10
        int r0 = r12.length;     // Catch: java.lang.Throwable -> L10
        int r1 = 0;
    L6:
        if (r1 >= r0) goto L8;
        r4.add(com.aide.uidesigner.ClassA.j6(r12[r1]));     // Catch: java.lang.Throwable -> L10
        r1 = r1 + 1;     // Catch: java.lang.Throwable -> L10
        goto L6
    L8:
        com.aide.common.Abstractma.j6(r9, r11.FH.j6(), java.util.Arrays.asList(r12), r4, r11.Hw, new com.aide.uidesigner.ea(r10, r11));     // Catch: java.lang.Throwable -> L10
    }

    @abcd.Interfacesu(method = -1912468315732494885L)
    private static void tp(android.app.Activity r8, com.aide.uidesigner.ClassS r9, com.aide.uidesigner.ClassA r10) {
    L13:
        th = move-exception;
        if (Hw == false) goto L17;
        abcd.wu.j6(th, -1389135928833652688L, null, r8, r9, r10);
    L17:
        throw th;
    L3:
        if (FH == false) goto L6;
        abcd.wu.j6(-1389135928833652688L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L13
    L6:
        if ("android.widget.ImageView$ScaleType".equals(r10.FH.u7) == false) goto L9;
        DW(r8, r9, r10, new java.lang.String[]{"matrix", "fitXY", "fitStart", "fitCenter", "fitEnd", "center", "centerCrop", "centerInside"});     // Catch: java.lang.Throwable -> L13
        return;
    L9:
        if ("android.text.TextUtils$TruncateAt".equals(r10.FH.u7) == false) goto L11;
        DW(r8, r9, r10, new java.lang.String[]{"start", "middle", "end", "marquee"});     // Catch: java.lang.Throwable -> L13
        return;
    L11:
        DW(r8, r9, r10, "");     // Catch: java.lang.Throwable -> L13
    }

    @abcd.Interfacesu(method = -1054673934552909799L)
    private static void u7(android.app.Activity r9, com.aide.uidesigner.ClassS r10, com.aide.uidesigner.ClassA r11) {
    L11:
        th = move-exception;
        if (Hw == false) goto L16;
        abcd.wu.j6(th, -121503139297225984L, null, r9, r10, r11);
    L16:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-121503139297225984L, null, r9, r10, r11);     // Catch: java.lang.Throwable -> L11
    L5:
        java.util.ArrayList r6 = new java.util.ArrayList(r10.getAllUserDrawables());     // Catch: java.lang.Throwable -> L11
        java.util.Collections.sort(r6);     // Catch: java.lang.Throwable -> L11
        java.util.ArrayList r0 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L11
        java.util.Iterator r1 = r6.iterator();     // Catch: java.lang.Throwable -> L11
    L7:
        if (r1.hasNext() == false) goto L9;
        r0.add(com.aide.uidesigner.ClassA.j6((java.lang.String) r1.next()));     // Catch: java.lang.Throwable -> L11
        goto L7
    L9:
        r0.add("other...");     // Catch: java.lang.Throwable -> L11
        r0.add("add...");     // Catch: java.lang.Throwable -> L11
        r0.add("none");     // Catch: java.lang.Throwable -> L11
        com.aide.common.Abstractma.DW(r9, r11.FH.j6(), r0, new com.aide.uidesigner.ha(r0, r10, r11, r9, r6));     // Catch: java.lang.Throwable -> L11
    }

    public static void v5(android.app.Activity r8, com.aide.uidesigner.ClassS r9, com.aide.uidesigner.ClassA r10) {
    L26:
        th = move-exception;
        if (Hw == false) goto L30;
        abcd.wu.j6(th, -199477826138700013L, null, r8, r9, r10);
    L30:
        throw th;
    L3:
        if (FH == false) goto L7;
        abcd.wu.j6(-199477826138700013L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L26
    L7:
        switch(com.aide.uidesigner.Z.j6[r10.FH.VH.ordinal()]) {
            case 1: goto L23;
            case 2: goto L22;
            case 3: goto L21;
            case 4: goto L20;
            case 5: goto L19;
            case 6: goto L18;
            case 7: goto L17;
            case 8: goto L17;
            case 9: goto L16;
            case 10: goto L15;
            case 11: goto L14;
            case 12: goto L13;
            case 13: goto L12;
            case 14: goto L11;
            case 15: goto L10;
            case 16: goto L9;
            default: goto L24;
        };
    L9:
        Ws(r8, r9, r10);     // Catch: java.lang.Throwable -> L26
        return;
    L10:
        EQ(r8, r9, r10);     // Catch: java.lang.Throwable -> L26
        return;
    L11:
        J0(r8, r9, r10);     // Catch: java.lang.Throwable -> L26
        return;
    L12:
        tp(r8, r9, r10);     // Catch: java.lang.Throwable -> L26
        return;
    L13:
        DW(r8, r9, r10, "");     // Catch: java.lang.Throwable -> L26
        return;
    L14:
        DW(r8, r9, r10, "");     // Catch: java.lang.Throwable -> L26
        return;
    L15:
        Zo(r8, r9, r10);     // Catch: java.lang.Throwable -> L26
        return;
    L16:
        J8(r8, r9, r10);     // Catch: java.lang.Throwable -> L26
        return;
    L17:
        DW(r8, r9, r10, r10.Hw, "10dp");     // Catch: java.lang.Throwable -> L26
        return;
    L18:
        DW(r8, r9, r10, r10.Hw, "10sp");     // Catch: java.lang.Throwable -> L26
        return;
    L19:
        DW(r8, r9, r10, "1");     // Catch: java.lang.Throwable -> L26
        return;
    L20:
        DW(r8, r9, r10, "1.0");     // Catch: java.lang.Throwable -> L26
        return;
    L21:
        VH(r8, r9, r10);     // Catch: java.lang.Throwable -> L26
        return;
    L22:
        u7(r8, r9, r10);     // Catch: java.lang.Throwable -> L26
        return;
    L23:
        gn(r8, r9, r10);     // Catch: java.lang.Throwable -> L26
        return;
    L24:
        DW(r8, r9, r10, "");     // Catch: java.lang.Throwable -> L26
    }

    @abcd.Interfacesu(method = 18678944857778968L)
    private static void we(android.app.Activity r8, com.aide.uidesigner.ClassS r9, com.aide.uidesigner.ClassA r10) {
    L7:
        th = move-exception;
        if (Hw == false) goto L11;
        abcd.wu.j6(th, 4745848013109277833L, null, r8, r9, r10);
    L11:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(4745848013109277833L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.Intent r0 = new android.content.Intent();     // Catch: java.lang.Throwable -> L7
        r0.setType("image/*");     // Catch: java.lang.Throwable -> L7
        r0.setAction("android.intent.action.GET_CONTENT");     // Catch: java.lang.Throwable -> L7
        r8.startActivityForResult(r0, 3424345);     // Catch: java.lang.Throwable -> L7
        j6 = r9;     // Catch: java.lang.Throwable -> L7
        DW = r10;     // Catch: java.lang.Throwable -> L7
    }
}
