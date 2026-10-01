package abcd;

@abcd.Interfacexu
class Vi {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.Vi.class, 5055569416012248315L, 5055569416012248315L);
    }

    @abcd.Interfacesu(method = -2746829644629080871L)
    Vi() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 329814685272620568L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(329814685272620568L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @abcd.Interfacesu(method = 597287778549131195L)
    public static boolean BT(java.lang.String r6) {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -908934281112909600L, null, r6);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-908934281112909600L, null, r6);     // Catch: java.lang.Throwable -> L15
    L7:
        if (new java.io.File(r6 + "/src").exists() == true) goto L9;
    L13:
        return false;
    L9:
        if (new java.io.File(r6 + "/build.gradle").exists() == false) goto L13;
        if (yS(r6) == true) goto L13;
        return true;
    }

    @abcd.Interfacesu(method = 1021319146108111072L)
    public static java.lang.String DW(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1165870240618862163L, null, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1165870240618862163L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return abcd.Vl.tp(r5) + ".apk";
    }

    @abcd.Interfacesu(method = 3616478081290032L)
    public static java.lang.String DW(java.lang.String r7, java.lang.String r8) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 2525556916911377917L, null, r7, r8);
    L18:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(2525556916911377917L, null, r7, r8);     // Catch: java.lang.Throwable -> L14
    L6:
        if (BT(r7) == false) goto L13;
        if (r8 == null) goto L13;
        if ("main".equals(r8) == true) goto L13;
        java.lang.String r0 = r7 + "/src/" + r8 + "/res";     // Catch: java.lang.Throwable -> L14
        if (abcd.Vl.aM(r0) == false) goto L13;
        return r0;
    L13:
        return null;
    }

    @abcd.Interfacesu(method = 441700784036517303L)
    public static java.util.List<java.lang.String> DW(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
    L22:
        th = move-exception;
        if (DW == false) goto L26;
        abcd.wu.j6(th, -2705127839778416768L, null, r8, r9, r10);
    L26:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2705127839778416768L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L22
    L6:
        if (gW(r8) == false) goto L10;
        return java.util.Collections.singletonList(r8 + "/jni");
    L10:
        if (BT(r8) == false) goto L21;
        java.util.ArrayList r0 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L22
        r0.add(r8 + "/src/main/jniLibs");     // Catch: java.lang.Throwable -> L22
        if (r10 != null) goto L15;
    L17:
        if (r9 == null) goto L19;
        r0.add(r8 + "/src/" + r9 + "/jniLibs");     // Catch: java.lang.Throwable -> L22
    L19:
        return r0;
    L15:
        if ("main".equals(r10) == true) goto L17;
        r0.add(r8 + "/src/" + r10 + "/jniLibs");     // Catch: java.lang.Throwable -> L22
        goto L17
    L21:
        return java.util.Collections.singletonList(r8 + "/libs");
    }

    @abcd.Interfacesu(method = 1397656539040602456L)
    public static java.lang.String EQ(java.lang.String r5) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -339943079727375475L, null, r5);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-339943079727375475L, null, r5);     // Catch: java.lang.Throwable -> L11
    L7:
        if (BT(r5) == false) goto L10;
        return FH(r5) + "/generated";
    L10:
        return null;
    }

    @abcd.Interfacesu(method = 3261126412797577584L)
    public static java.lang.String FH(java.lang.String r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -229172250814450911L, null, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-229172250814450911L, null, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (BT(r5) == false) goto L11;
        return r5 + "/build/bin";
    L11:
        return r5 + "/bin";
    }

    @abcd.Interfacesu(method = 333278616578380375L)
    public static java.lang.String FH(java.lang.String r7, java.lang.String r8) {
    L18:
        th = move-exception;
        if (DW == false) goto L22;
        abcd.wu.j6(th, -5867559191916800280L, null, r7, r8);
    L22:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5867559191916800280L, null, r7, r8);     // Catch: java.lang.Throwable -> L18
    L6:
        if (BT(r7) == false) goto L10;
        return r7 + "/src/main/AndroidManifest.xml";
    L10:
        if (r8 == null) goto L17;
        if ("main".equals(r8) == true) goto L17;
        java.lang.String r1 = r7 + "/flavors/" + r8 + "/AndroidManifest.xml";     // Catch: java.lang.Throwable -> L18
        if (abcd.Vl.j3(r1) == false) goto L17;
        return r1;
    L17:
        return r7 + "/AndroidManifest.xml";
    }

    @abcd.Interfacesu(method = 874401604928226293L)
    public static java.lang.String Hw(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -802055225629460440L, null, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-802055225629460440L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return FH(r5) + "/res";
    }

    @abcd.Interfacesu(method = -958043168284638213L)
    public static java.lang.String[] Hw(java.lang.String r8, java.lang.String r9) {
    L20:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, -190303033313080408L, null, r8, r9);
    L24:
        throw th;
    L3:
        if (j6 == false) goto L7;
        abcd.wu.j6(-190303033313080408L, null, r8, r9);     // Catch: java.lang.Throwable -> L20
    L7:
        if (BT(r8) == false) goto L19;
        if (r9 == null) goto L17;
        if ("main".equals(r9) == true) goto L17;
        java.lang.String r5 = r8 + "/src/" + r9 + "/java";     // Catch: java.lang.Throwable -> L20
        if (abcd.Vl.aM(r5) == false) goto L17;
        return new java.lang.String[]{r8 + "/src/main/java", r8 + "/src/main/aidl", r5};
    L17:
        return new java.lang.String[]{r8 + "/src/main/java", r8 + "/src/main/aidl"};
    L19:
        return new java.lang.String[]{r8 + "/src"};
    }

    @abcd.Interfacesu(method = 1150311299387222464L)
    public static java.lang.String J0(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -70864024740859473L, null, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-70864024740859473L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return FH(r5) + "/jardex";
    }

    @abcd.Interfacesu(method = -2240853136297844991L)
    public static java.lang.String J8(java.lang.String r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -1721378713251393040L, null, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1721378713251393040L, null, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (BT(r5) == false) goto L11;
        return r5 + "/src/main/jni";
    L11:
        return r5 + "/jni";
    }

    @abcd.Interfacesu(method = 2248435439880355260L)
    public static java.lang.String Mr(java.lang.String r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 2229986576859501127L, null, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(2229986576859501127L, null, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (BT(r5) == false) goto L11;
        return r5 + "/src/main/res";
    L11:
        return r5 + "/res";
    }

    @abcd.Interfacesu(method = -828567314079558555L)
    public static boolean P8(java.lang.String r5) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -1879071983851456608L, null, r5);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1879071983851456608L, null, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if (er(r5) == false) goto L11;
        if (abcd.Vl.Hw(aM(r5)) == false) goto L11;
        return true;
    L11:
        return false;
    }

    @abcd.Interfacesu(method = 25823367571262619L)
    public static java.lang.String QX(java.lang.String r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -1483645710251643276L, null, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1483645710251643276L, null, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (BT(r5) == false) goto L11;
        return r5 + "/src/main/assets";
    L11:
        return r5 + "/assets";
    }

    public static java.lang.String U2(java.lang.String r1) {
        return com.almlkaide.kaypro.aide.AdvancedSetting.getBuildApkPath(r1);
    }

    @abcd.Interfacesu(method = -66863009208285521L)
    public static java.lang.String VH(java.lang.String r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -8223220009466489156L, null, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-8223220009466489156L, null, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (BT(r5) == false) goto L10;
        return "";
    L10:
        return r5 + "/.classpath";
    }

    @abcd.Interfacesu(method = 55857002621040105L)
    public static java.lang.String Ws(java.lang.String r5) {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -2143162816375976616L, null, r5);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L8;
        abcd.wu.j6(-2143162816375976616L, null, r5);     // Catch: java.lang.Throwable -> L17
    L8:
        if (gW(r5) == false) goto L12;
        return r5 + "/libs";
    L12:
        if (BT(r5) == false) goto L16;
        return r5 + "/libs";
    L16:
        return r5 + "/libs";
    }

    @abcd.Interfacesu(method = 291631321996582785L)
    public static java.lang.String XL(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -290462525071335900L, null, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-290462525071335900L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return FH(r5) + "/merged/AndroidManifest.xml";
    }

    @abcd.Interfacesu(method = -33912775131369204L)
    public static java.lang.String Zo(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 8147758450608217111L, null, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(8147758450608217111L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return FH(r5);
    }

    @abcd.Interfacesu(method = -2744657450497666676L)
    public static java.lang.String a8(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 985099596843497631L, null, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(985099596843497631L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return FH(r5) + "/resources.ap_";
    }

    @abcd.Interfacesu(method = 696660510040861608L)
    public static java.lang.String aM(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -17700344372257197L, null, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-17700344372257197L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return QX(r5) + "/www";
    }

    @abcd.Interfacesu(method = -322999388407107720L)
    private static boolean ei(java.lang.String r5) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 3200180194929264755L, null, r5);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(3200180194929264755L, null, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if ("src".equals(abcd.Vl.tp(abcd.Vl.EQ(r5))) == false) goto L11;
        if (BT(abcd.Vl.EQ(abcd.Vl.EQ(r5))) == false) goto L11;
        return true;
    L11:
        return false;
    }

    @abcd.Interfacesu(method = 4763181167407726219L)
    public static boolean er(java.lang.String r5) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 4896364450023516960L, null, r5);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(4896364450023516960L, null, r5);     // Catch: java.lang.Throwable -> L14
    L7:
        if (yS(r5) == true) goto L12;
        if (BT(r5) == true) goto L12;
        return false;
    L12:
        return true;
    }

    @abcd.Interfacesu(method = 9500144567062080L)
    public static boolean gW(java.lang.String r5) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -1498082708627040741L, null, r5);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1498082708627040741L, null, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if (abcd.Vl.Hw(j6(r5)) == false) goto L11;
        if (abcd.Vl.Hw(FH(r5, null)) == false) goto L11;
        return true;
    L11:
        return false;
    }

    @abcd.Interfacesu(method = 3003472507983836000L)
    public static java.util.List<java.lang.String> gn(java.lang.String r8) {
    L18:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, 2151865509126595915L, null, r8);
    L23:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(2151865509126595915L, null, r8);     // Catch: java.lang.Throwable -> L18
    L7:
        if (abcd.Vl.aM(r8 + "/flavors") == true) goto L28;
    L17:
        return null;
    L28:
        java.util.ArrayList r4 = new java.util.ArrayList();     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L18
        java.util.Iterator<java.lang.String> r0 = abcd.Vl.Zo(r8 + "/flavors").iterator();     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L18
    L10:
        if (r0.hasNext() == false) goto L14;
        java.lang.String r5 = r0.next();     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L18
        if (abcd.Vl.J8(r5 + "/AndroidManifest.xml") == false) goto L10;
        r4.add(abcd.Vl.tp(r5));     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L18
        goto L10
    L14:
        if (r4.size() <= 0) goto L17;
        return r4;
        goto L17
    }

    @abcd.Interfacesu(method = 117369853506687936L)
    public static java.lang.String j3(java.lang.String r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -5103387868992549331L, null, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-5103387868992549331L, null, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (BT(r5) == false) goto L10;
        return "";
    L10:
        return r5 + "/project.properties";
    }

    @abcd.Interfacesu(method = -3963442482895129647L)
    public static java.lang.String j6(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -7988407728649668984L, null, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-7988407728649668984L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return r5 + "/classes.jar";
    }

    @abcd.Interfacesu(method = 1521775742238204115L)
    public static java.lang.String j6(java.lang.String r7, java.lang.String r8) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 1013853298467179160L, null, r7, r8);
    L18:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(1013853298467179160L, null, r7, r8);     // Catch: java.lang.Throwable -> L14
    L6:
        if (BT(r7) == false) goto L13;
        if (r8 == null) goto L13;
        if ("main".equals(r8) == true) goto L13;
        java.lang.String r0 = r7 + "/src/" + r8 + "/AndroidManifest.xml";     // Catch: java.lang.Throwable -> L14
        if (abcd.Vl.j3(r0) == false) goto L13;
        return r0;
    L13:
        return null;
    }

    @abcd.Interfacesu(method = 4086758386955887032L)
    public static java.lang.String j6(java.lang.String r7, boolean r8) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -425360667011199651L, null, r7, new java.lang.Boolean(r8));
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-425360667011199651L, null, r7, new java.lang.Boolean(r8));     // Catch: java.lang.Throwable -> L10
    L5:
        if (r8 == false) goto L9;
        return FH(r7) + "/classesdebug";
    L9:
        return FH(r7) + "/classesrelease";
    }

    @abcd.Interfacesu(method = 5299441812555281607L)
    public static java.util.List<java.lang.String> j6(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
    L18:
        th = move-exception;
        if (DW == false) goto L22;
        abcd.wu.j6(th, 5091541062928197408L, null, r8, r9, r10);
    L22:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(5091541062928197408L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L18
    L6:
        if (BT(r8) == false) goto L17;
        java.util.ArrayList r0 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L18
        r0.add(QX(r8));     // Catch: java.lang.Throwable -> L18
        if (r10 != null) goto L11;
    L13:
        if (r9 == null) goto L15;
        r0.add(r8 + "/src/" + r9 + "/assets");     // Catch: java.lang.Throwable -> L18
    L15:
        return r0;
    L11:
        if ("main".equals(r10) == true) goto L13;
        r0.add(r8 + "/src/" + r10 + "/assets");     // Catch: java.lang.Throwable -> L18
        goto L13
    L17:
        return java.util.Collections.singletonList(QX(r8));
    }

    @abcd.Interfacesu(method = -7315831205860313488L)
    public static java.lang.String lg(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 7236813190115014173L, null, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(7236813190115014173L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return abcd.Vl.VH(r5, "../build.gradle");
    }

    @abcd.Interfacesu(method = -646906257065111445L)
    public static java.lang.String rN(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1066898492866624120L, null, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1066898492866624120L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return abcd.Vl.VH(r5, "../settings.gradle");
    }

    @abcd.Interfacesu(method = -2010563693572571495L)
    public static java.lang.String tp(java.lang.String r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 2923344691364490576L, null, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(2923344691364490576L, null, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (BT(r5) == false) goto L11;
        return r5 + "/build/gen";
    L11:
        return r5 + "/gen";
    }

    @abcd.Interfacesu(method = -655757880434760112L)
    public static java.lang.String u7(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 24795661799075881L, null, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(24795661799075881L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return FH(r5) + "/exploded-aar";
    }

    @abcd.Interfacesu(method = -168757717452118877L)
    public static java.lang.String v5(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 643150827880796484L, null, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(643150827880796484L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return r5 + "/build.gradle";
    }

    @abcd.Interfacesu(method = 2624883019095671925L)
    public static boolean vy(java.lang.String r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -1814780239257932280L, null, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1814780239257932280L, null, r5);     // Catch: java.lang.Throwable -> L12
    L6:
        boolean r4 = BT(r5);     // Catch: java.lang.Throwable -> L12
        java.lang.StringBuilder r3 = new java.lang.StringBuilder();     // Catch: java.lang.Throwable -> L12
        r3.append(r5);     // Catch: java.lang.Throwable -> L12
        if (r4 == true) goto L9;
        java.lang.String r6 = "/jni/Android.mk";
    L10:
        r3.append(r6);     // Catch: java.lang.Throwable -> L12
        return abcd.Vl.j3(r3.toString());
    L9:
        r6 = "/src/main/jni/Android.mk";
        goto L10
    }

    @abcd.Interfacesu(method = 353658387465895099L)
    public static java.lang.String we(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1277078547273840624L, null, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1277078547273840624L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return FH(r5) + "/injected/AndroidManifest.xml";
    }

    @abcd.Interfacesu(method = 1187046122809283061L)
    public static boolean yS(java.lang.String r6) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 1932078902069940876L, null, r6);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1932078902069940876L, null, r6);     // Catch: java.lang.Throwable -> L13
    L7:
        if (new java.io.File(r6 + "/AndroidManifest.xml").exists() == false) goto L11;
        if (ei(r6) == true) goto L11;
        return true;
    L11:
        return false;
    }
}
