package abcd;

@abcd.Interfacexu
public class Jk {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 2110153148064145584L)
    private java.util.Map<abcd.Be.g, java.lang.String> FH;

    @abcd.Interfaceru(field = -6792627744927873257L)
    private java.util.Map<java.lang.String, abcd.Be.g> Hw;

    static {
        abcd.wu.j6(abcd.Jk.class, 81765335761816225L, 81765335761816225L);
    }

    public Jk() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1919573803489456881L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1919573803489456881L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = new java.util.HashMap();     // Catch: java.lang.Throwable -> L8
        this.Hw = new java.util.HashMap();     // Catch: java.lang.Throwable -> L8
    }

    public static java.lang.String DW(abcd.Be.m r7, abcd.Be.g r8) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2572044967098615393L, null, r7, r8);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2572044967098615393L, null, r7, r8);     // Catch: java.lang.Throwable -> L8
    L6:
        return r7.gn + ("/" + r8.gn.replace('.', '/') + "/" + r8.u7) + "/maven-metadata.xml";
    }

    public static java.lang.String DW(abcd.Be.m r9, abcd.Be.g r10, java.lang.String r11, java.lang.String r12) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 6764316044284396800L, null, r9, r10, r11, r12);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(6764316044284396800L, null, r9, r10, r11, r12);     // Catch: java.lang.Throwable -> L8
    L6:
        return r9.gn + (("/" + r10.gn.replace('.', '/') + "/" + r10.u7) + "/" + r11 + "/" + r10.u7 + "-" + r11) + r12;
    }

    @abcd.Interfacesu(method = 1295558288185466300L)
    private static java.lang.String DW(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 388993344652078035L, null, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(388993344652078035L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        java.lang.String[] r3 = r5.split("/");     // Catch: java.lang.Throwable -> L8
        return r3[r3.length - 2];
    }

    @abcd.Interfacesu(method = 605728114992526400L)
    private java.lang.String DW(java.lang.String r8, java.lang.String r9) {
    L18:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, 73255881322655027L, this, r8, r9);
    L23:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(73255881322655027L, this, r8, r9);     // Catch: java.lang.Throwable -> L18
    L5:
        java.lang.String r0 = r8 + "/maven-metadata.xml";     // Catch: java.lang.Throwable -> L18
        if (abcd.Vl.j3(r0) == false) goto L27;
        java.lang.String r1 = ((abcd.He) new abcd.He().j6(r0)).FH(r9);     // Catch: java.lang.Throwable -> L18
        if (r1 == null) goto L27;
        return r1;
    L27:
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.io.IOException -> L16 java.lang.Throwable -> L18
        java.util.Iterator<java.lang.String> r3 = abcd.Vl.v5(r8).iterator();     // Catch: java.io.IOException -> L16 java.lang.Throwable -> L18
    L12:
        if (r3.hasNext() == false) goto L14;
        r2.add(abcd.Vl.tp(r3.next()));     // Catch: java.io.IOException -> L16 java.lang.Throwable -> L18
        goto L12
    L14:
        return abcd.He.j6(r2, r9);
    L16:
        return null;
    }

    @abcd.Interfacesu(method = 2563023333843019125L)
    private java.lang.String DW(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
    L24:
        th = move-exception;
        if (DW == false) goto L29;
        abcd.wu.j6(th, -491971663660499440L, this, r10, r11, r12, r13);
    L29:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-491971663660499440L, this, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L24
    L6:
        java.lang.String r1 = r10 + "/" + r12 + ".aar";     // Catch: java.lang.Throwable -> L24
        if (new java.io.File(r1).exists() == false) goto L9;
        return r1;
    L9:
        java.io.File[] r2 = new java.io.File(r10).listFiles();     // Catch: java.lang.Throwable -> L24
        if (r2 == null) goto L22;
        int r3 = r2.length;     // Catch: java.lang.Throwable -> L24
        int r4 = 0;
    L12:
        if (r4 >= r3) goto L38;
        java.io.File r5 = r2[r4];     // Catch: java.lang.Throwable -> L24
        if (r5.getName().startsWith(r12 + "-") == false) goto L21;
        if (r5.getName().endsWith(".aar") == false) goto L21;
        if (abcd.He.j6(r5.getName().substring(r12.length() + 1, r5.getName().length() - 4), r13) == false) goto L21;
        return r5.getPath();
    L21:
        r4 = r4 + 1;
        goto L12
    L38:
        return null;
    L22:
        return null;
    }

    @abcd.Interfacesu(method = 700805023949883311L)
    private abcd.Be.g FH(abcd.Be.g r5) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 1451429039697178800L, this, r5);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1451429039697178800L, this, r5);     // Catch: java.lang.Throwable -> L11
    L7:
        if (this.Hw.containsKey(r5.j6()) == true) goto L9;
        this.Hw.put(r5.j6(), r5);     // Catch: java.lang.Throwable -> L11
    L9:
        return this.Hw.get(r5.j6());
    }

    @abcd.Interfacesu(method = -2870112100034842880L)
    private java.lang.String FH(java.lang.String r7) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 2283614841323055303L, this, r7);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L8;
        abcd.wu.j6(2283614841323055303L, this, r7);     // Catch: java.lang.Throwable -> L13
    L8:
        if (r7.endsWith(".exploded.aar") == false) goto L12;
        return r7.substring(0, r7.length() - 13) + ".pom";
    L12:
        return r7.substring(0, r7.length() - 4) + ".pom";
    }

    @abcd.Interfacesu(method = 2737373558550281183L)
    private boolean FH(java.lang.String r10, java.lang.String r11) {
    L21:
        th = move-exception;
        if (DW == false) goto L26;
        abcd.wu.j6(th, 2540303925487190016L, this, r10, r11);
    L26:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(2540303925487190016L, this, r10, r11);     // Catch: java.lang.Throwable -> L21
    L6:
        if (new java.io.File(r11).isDirectory() == true) goto L8;
        return false;
    L8:
        java.io.File[] r0 = new java.io.File(r11).listFiles();     // Catch: java.lang.Throwable -> L21
        if (r0 == null) goto L19;
        long r2 = new java.io.File(r10).lastModified();     // Catch: java.lang.Throwable -> L21
        int r4 = r0.length;     // Catch: java.lang.Throwable -> L21
        int r5 = 0;
    L11:
        if (r5 >= r4) goto L34;
        java.io.File r6 = r0[r5];     // Catch: java.lang.Throwable -> L21
        if (r6.isFile() == false) goto L18;
        if (r6.lastModified() >= r2) goto L18;
        return false;
    L18:
        r5 = r5 + 1;
        goto L11
    L34:
        return true;
    L19:
        return true;
    }

    @abcd.Interfacesu(method = 7575944047079467941L)
    private java.lang.String Hw(abcd.Be.g r8) {
    L14:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -267474788919651628L, this, r8);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-267474788919651628L, this, r8);     // Catch: java.lang.Throwable -> L14
    L6:
        java.util.Iterator<java.lang.String> r2 = Zo().iterator();     // Catch: java.lang.Throwable -> L14
    L7:
        if (r2.hasNext() == false) goto L12;
        java.lang.String r3 = j6(r2.next(), r8.gn, r8.u7, r8.tp);     // Catch: java.lang.Throwable -> L14
        if (r3 == null) goto L7;
        return r3;
    L12:
        return null;
    }

    @abcd.Interfacesu(method = -14170022524454400L)
    private java.lang.String Hw(java.util.Map<java.lang.String, java.lang.String> r8, abcd.Be.g r9) {
    L25:
        th = move-exception;
        if (DW == false) goto L30;
        abcd.wu.j6(th, 169085231225213385L, this, r8, r9);
    L30:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(169085231225213385L, this, r8, r9);     // Catch: java.lang.Throwable -> L25
    L5:
        if (r8 == null) goto L14;
        java.util.Iterator<java.lang.String> r0 = r8.keySet().iterator();     // Catch: java.lang.Throwable -> L25
    L8:
        if (r0.hasNext() == false) goto L14;
        java.lang.String r1 = r0.next();     // Catch: java.lang.Throwable -> L25
        java.lang.String r2 = DW(r1, r9.gn, r9.u7, r9.tp);     // Catch: java.lang.Throwable -> L25
        if (r2 == null) goto L8;
        java.lang.String r3 = new java.io.File(r2).getName();     // Catch: java.lang.Throwable -> L25
        java.lang.String r4 = r8.get(r1) + "/" + r3.substring(0, r3.length() - 4) + ".exploded.aar";     // Catch: java.lang.Throwable -> L25
        j6(r2, r4);     // Catch: java.lang.Throwable -> L25
        return r4;
    L14:
        if (this.FH.containsKey(r9) == false) goto L20;
        java.lang.String r5 = this.FH.get(r9);     // Catch: java.lang.Throwable -> L25
        if (r5.length() != 0) goto L19;
        return null;
    L19:
        return r5;
    L20:
        java.lang.String r6 = Hw(r9);     // Catch: java.lang.Throwable -> L25
        if (r6 != null) goto L23;
        this.FH.put(r9, "");     // Catch: java.lang.Throwable -> L25
    L24:
        return r6;
    L23:
        this.FH.put(r9, r6);     // Catch: java.lang.Throwable -> L25
        goto L24
    }

    @abcd.Interfacesu(method = -974701426244437332L)
    private java.util.List<java.lang.String> Zo() {
    L14:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -3389736200021075805L, this);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3389736200021075805L, this);     // Catch: java.lang.Throwable -> L14
    L6:
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L14
        java.lang.String[] r3 = com.aide.ui.aa.dx().split(";");     // Catch: java.lang.Throwable -> L14
        int r4 = r3.length;     // Catch: java.lang.Throwable -> L14
        int r5 = 0;
    L7:
        if (r5 >= r4) goto L12;
        java.lang.String r6 = r3[r5];     // Catch: java.lang.Throwable -> L14
        if (r6.trim().isEmpty() == true) goto L11;
        r2.add(r6.trim());     // Catch: java.lang.Throwable -> L14
    L11:
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L14
        goto L7
    L12:
        r2.add(v5());     // Catch: java.lang.Throwable -> L14
        return r2;
    }

    static java.lang.String j6() {
        return v5();
    }

    public static java.lang.String j6(abcd.Be.m r7, abcd.Be.g r8) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1367533582825884320L, null, r7, r8);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1367533582825884320L, null, r7, r8);     // Catch: java.lang.Throwable -> L8
    L6:
        return v5() + ("/" + r8.gn.replace('.', '/') + "/" + r8.u7) + "/maven-metadata.xml";
    }

    public static java.lang.String j6(abcd.Be.m r9, abcd.Be.g r10, java.lang.String r11, java.lang.String r12) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -338639984554943227L, null, r9, r10, r11, r12);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-338639984554943227L, null, r9, r10, r11, r12);     // Catch: java.lang.Throwable -> L8
    L6:
        return v5() + (("/" + r10.gn.replace('.', '/') + "/" + r10.u7) + "/" + r11 + "/" + r10.u7 + "-" + r11) + r12;
    }

    @abcd.Interfacesu(method = 402604094452195044L)
    private java.lang.String j6(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
    L39:
        th = th;
    L44:
        if (DW == false) goto L46;
        abcd.wu.j6(th, -3029922917059497921L, this, r15, r16, r17, r18);
    L46:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3029922917059497921L, this, r15, r16, r17, r18);     // Catch: java.lang.Throwable -> L39
    L6:
        java.lang.StringBuilder r1 = new java.lang.StringBuilder();     // Catch: java.lang.Throwable -> L39
        r1.append(r15);     // Catch: java.lang.Throwable -> L37
        r1.append("/");     // Catch: java.lang.Throwable -> L37
        r1.append(r16.replace(".", "/"));     // Catch: java.lang.Throwable -> L35
        r1.append("/");     // Catch: java.lang.Throwable -> L35
        r1.append(r17);     // Catch: java.lang.Throwable -> L35
        java.lang.String r2 = r1.toString();     // Catch: java.lang.Throwable -> L35
        if (abcd.Vl.aM(r2) == true) goto L53;
        return null;
    L53:
        java.lang.String r3 = DW(r2, r18);     // Catch: java.lang.Throwable -> L31
        if (r3 == null) goto L54;
        java.lang.String r4 = r2 + "/" + r3 + "/" + r17 + "-" + r3;     // Catch: java.lang.Throwable -> L31
        if (new java.io.File(r4 + ".jar").isFile() == false) goto L20;
        return r4 + ".jar";
    L20:
        if (new java.io.File(r4 + ".aar").isDirectory() == false) goto L24;
        return r4 + ".aar";
    L24:
        if (new java.io.File(r4 + ".exploded.aar").isDirectory() == false) goto L28;
        return r4 + ".exploded.aar";
    L28:
        if (new java.io.File(r4 + ".aar").isFile() == false) goto L55;
        j6(r4 + ".aar", r4 + ".exploded.aar");     // Catch: java.lang.Throwable -> L31
        return r4 + ".exploded.aar";
    L55:
        return null;
    L54:
        return null;
    L31:
        th = th;
    L35:
        th = th;
    L37:
        th = th;
        goto L44
    }

    @abcd.Interfacesu(method = 898800227208765531L)
    private java.util.List<java.lang.String> j6(java.util.Map<java.lang.String, java.lang.String> r8, java.lang.String r9) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 551519948238882096L, this, r8, r9);
    L13:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(551519948238882096L, this, r8, r9);     // Catch: java.lang.Throwable -> L9
    L5:
        java.util.ArrayList r0 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L9
        if (r9 == null) goto L8;
        j6(r8, r9, r0, 3);     // Catch: java.lang.Throwable -> L9
    L8:
        return r0;
    }

    static java.util.Map j6(abcd.Jk r0) {
        return r0.FH;
    }

    @abcd.Interfacesu(method = 3778288329564524128L)
    private void j6(abcd.Be.g r8, int r9) {
    L21:
        th = move-exception;
        if (DW == false) goto L26;
        abcd.wu.j6(th, -1149247877005140615L, this, r8, new java.lang.Integer(r9));
    L26:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1149247877005140615L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L21
    L5:
        java.lang.String r0 = Hw(null, r8);     // Catch: java.lang.Throwable -> L21
        if (r0 == null) goto L20;
        java.lang.String r1 = DW(r0);     // Catch: java.lang.Throwable -> L21
        if (this.Hw.containsKey(r8.j6()) == true) goto L10;
    L11:
        this.Hw.put(r8.j6(), new abcd.Be.g(r8, r1));     // Catch: java.lang.Throwable -> L21
    L12:
        if (r9 <= 0) goto L35;
        java.util.Iterator<abcd.Be.g> r2 = ((abcd.Ie) new abcd.Ie().j6(FH(r0))).gn.iterator();     // Catch: java.lang.Throwable -> L21
    L14:
        if (r2.hasNext() == false) goto L36;
        abcd.Be.g r3 = r2.next();     // Catch: java.lang.Throwable -> L21
        if (v5(r3) == true) goto L14;
        j6(r3, r9 - 1);     // Catch: java.lang.Throwable -> L21
        goto L14
    L36:
        return;
    L35:
        return;
    L10:
        if (abcd.Fe.j6(r1, this.Hw.get(r8.j6()).tp) <= 0) goto L12;
    }

    @abcd.Interfacesu(method = 1368414381318599700L)
    private void j6(java.lang.String r8, java.lang.String r9) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 59007320860540679L, this, r8, r9);
    L16:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(59007320860540679L, this, r8, r9);     // Catch: java.lang.Throwable -> L12
    L6:
        if (FH(r8, r9) == true) goto L20;
        abcd.Vl.j6(new java.io.FileInputStream(r8), r9, true);     // Catch: java.io.IOException -> L9 java.lang.Throwable -> L12
        com.aide.common.ClassH.j6("Extracted AAR " + r8);     // Catch: java.io.IOException -> L9 java.lang.Throwable -> L12
    L21:
        return;
    L9:
        e = move-exception;
        e.printStackTrace();     // Catch: java.lang.Throwable -> L12
        return;
    }

    @abcd.Interfacesu(method = 1451914021381852535L)
    private void j6(java.util.Map<java.lang.String, java.lang.String> r10, abcd.Be.g r11, java.util.List<abcd.Be.g> r12, int r13) {
    L17:
        th = move-exception;
        if (DW == false) goto L22;
        abcd.wu.j6(th, -1846086220073315520L, this, r10, r11, r12, new java.lang.Integer(r13));
    L22:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1846086220073315520L, this, r10, r11, r12, new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L17
    L5:
        java.lang.String r0 = Hw(r10, FH(r11));     // Catch: java.lang.Throwable -> L17
        if (r0 != null) goto L8;
        r12.add(r11);     // Catch: java.lang.Throwable -> L17
        return;
    L8:
        if (r13 <= 0) goto L30;
        java.util.Iterator<abcd.Be.g> r1 = ((abcd.Ie) new abcd.Ie().j6(FH(r0))).gn.iterator();     // Catch: java.lang.Throwable -> L17
    L11:
        if (r1.hasNext() == false) goto L31;
        abcd.Be.g r2 = r1.next();     // Catch: java.lang.Throwable -> L17
        if (v5(r2) == true) goto L11;
        j6(r10, r2, r12, r13 - 1);     // Catch: java.lang.Throwable -> L17
        goto L11
    L31:
        return;
    }

    @abcd.Interfacesu(method = -7703984022876050688L)
    private void j6(java.util.Map<java.lang.String, java.lang.String> r10, java.lang.String r11, java.util.List<java.lang.String> r12, int r13) {
    L19:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, 4845131358560103537L, this, r10, r11, r12, new java.lang.Integer(r13));
    L24:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(4845131358560103537L, this, r10, r11, r12, new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L19
    L6:
        if (r12.contains(r11) == true) goto L18;
        r12.add(r11);     // Catch: java.lang.Throwable -> L19
        if (r13 <= 0) goto L35;
        java.util.Iterator<abcd.Be.g> r0 = ((abcd.Ie) new abcd.Ie().j6(FH(r11))).gn.iterator();     // Catch: java.lang.Throwable -> L19
    L10:
        if (r0.hasNext() == false) goto L36;
        abcd.Be.g r1 = r0.next();     // Catch: java.lang.Throwable -> L19
        if (v5(r1) == true) goto L10;
        java.lang.String r2 = Hw(r10, FH(r1));     // Catch: java.lang.Throwable -> L19
        if (r2 == null) goto L10;
        j6(r10, r2, r12, r13 - 1);     // Catch: java.lang.Throwable -> L19
        goto L10
    L36:
        return;
    L35:
        return;
    }

    @abcd.Interfacesu(method = 39456194121478700L)
    private static java.lang.String v5() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -232672621527975863L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-232672621527975863L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return abcd.Vl.Zo() + "/.aide/maven";
    }

    @abcd.Interfacesu(method = -826308770993964637L)
    private boolean v5(abcd.Be.g r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2038947085002048L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2038947085002048L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return r5.u7.contains("android-all");
    }

    public java.lang.String DW(abcd.Be.g r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 103543202825634429L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(103543202825634429L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return Hw(null, r5);
    }

    public java.util.List<abcd.Be.g> DW(java.util.Map<java.lang.String, java.lang.String> r8, abcd.Be.g r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 2385012762192692205L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2385012762192692205L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        java.util.ArrayList r0 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L7
        j6(r8, r9, r0, 3);     // Catch: java.lang.Throwable -> L7
        return r0;
    }

    public void DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1725747935280993635L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1725747935280993635L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.clear();     // Catch: java.lang.Throwable -> L8
    }

    public void FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2648004054380559600L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2648004054380559600L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw.clear();     // Catch: java.lang.Throwable -> L8
    }

    public boolean FH(java.util.Map<java.lang.String, java.lang.String> r8, abcd.Be.g r9) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -229095204801035904L, this, r8, r9);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-229095204801035904L, this, r8, r9);     // Catch: java.lang.Throwable -> L10
    L5:
        if (Hw(r8, FH(r9)) == null) goto L8;
        return true;
    L8:
        return false;
    }

    public void Hw() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3109471472272327344L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3109471472272327344L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.U.j6(com.aide.ui.U.VH(), "Refreshing...", new abcd.RunnableHk(this), new abcd.RunnableC0206Ik(this));     // Catch: java.lang.Throwable -> L8
    }

    public java.util.List<java.lang.String> j6(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2134096384285423581L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2134096384285423581L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return j6(null, r5);
    }

    public java.util.List<java.lang.String> j6(java.util.Map<java.lang.String, java.lang.String> r8, abcd.Be.g r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -194168109258797835L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-194168109258797835L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        return j6(r8, Hw(r8, FH(r9)));
    }

    public void j6(abcd.Be.g r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2211329915009514828L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2211329915009514828L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        j6(r5, 3);     // Catch: java.lang.Throwable -> L8
    }
}
