package abcd;

@abcd.Interfacexu
public class Vl {

    @abcd.Interfaceru(field = -536732734201478387L)
    private static android.content.Context DW;

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfaceru(field = 5423035936608927923L)
    private static abcd.Dc j6;

    static {
        abcd.wu.j6(abcd.Vl.class, 1736030230469303457L, 1736030230469303457L);     // Catch: java.lang.Throwable -> L8
        if (FH == false) goto L6;
        abcd.wu.j6(-34971939147887744L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new abcd.Dc();     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -34971939147887744L, null);
    L12:
        throw th;
    }

    public Vl() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -215856102185202381L, null);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-215856102185202381L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @abcd.Interfacesu(method = 6298653007269346464L)
    private static java.io.Reader BT(java.lang.String r6) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 3229512865657389337L, null, r6);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(3229512865657389337L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        java.lang.String r3 = er(r6);     // Catch: java.lang.Throwable -> L8
        java.lang.String r4 = yS(r6);     // Catch: java.lang.Throwable -> L8
        return new abcd.Ul(j6.j6(r3, r4, null));
    }

    public static java.lang.String DW() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -4207137317683362816L, null);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-4207137317683362816L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return DW.getCacheDir().getPath();
    }

    public static java.lang.String DW(java.lang.String r7, java.lang.String r8) {
    L13:
        th = move-exception;
        java.lang.String r5 = r7;
        if (Hw == false) goto L18;
        abcd.wu.j6(th, -5135200951586704995L, null, r5, r8);
    L18:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-5135200951586704995L, null, r7, r8);     // Catch: java.lang.Throwable -> L13
    L5:
        r7 = EQ(r7);     // Catch: java.lang.Throwable -> L13
    L6:
        if (r7 == null) goto L12;
        if (tp(r7).equals(r8) == true) goto L9;
        r7 = EQ(r7);     // Catch: java.lang.Throwable -> L13
        goto L6
    L9:
        return r7;
    L12:
        return null;
    }

    @abcd.Interfacesu(method = -1541882398594178841L)
    private static void DW(java.io.File r7) {
    L19:
        th = move-exception;
        if (Hw == false) goto L24;
        abcd.wu.j6(th, -252711464193231680L, null, r7);
    L24:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-252711464193231680L, null, r7);     // Catch: java.lang.Throwable -> L19
    L7:
        if (r7.isDirectory() == false) goto L15;
        java.lang.String[] r3 = r7.list();     // Catch: java.lang.Throwable -> L19
        if (r3 == null) goto L15;
        int r4 = 0;
    L12:
        if (r4 >= r3.length) goto L15;
        DW(new java.io.File(r7, r3[r4]));     // Catch: java.lang.Throwable -> L19
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L19
    L15:
        if (r7.delete() == false) goto L18;
        return;
    L18:
        throw new java.io.IOException(r7.getPath() + " could not be deleted");     // Catch: java.lang.Throwable -> L19
    }

    public static void DW(java.lang.String r6) {
    L12:
        th = move-exception;
        if (Hw == false) goto L16;
        abcd.wu.j6(th, 1483811229604750224L, null, r6);
    L16:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(1483811229604750224L, null, r6);     // Catch: java.lang.Throwable -> L12
    L7:
        if (new java.io.File(r6).exists() == true) goto L11;
        new java.io.File(r6).createNewFile();     // Catch: java.lang.Throwable -> L12
        return;
    L11:
        throw new java.io.IOException(r6 + " already exists");     // Catch: java.lang.Throwable -> L12
    }

    public static java.lang.String EQ(java.lang.String r5) {
    L20:
        th = move-exception;
        if (Hw == false) goto L24;
        abcd.wu.j6(th, 288844778091542652L, null, r5);
    L24:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(288844778091542652L, null, r5);     // Catch: java.lang.Throwable -> L20
    L7:
        if (r5.length() != 0) goto L10;
        return null;
    L10:
        if (r5.equals("/") == false) goto L12;
        return null;
    L12:
        int r4 = r5.lastIndexOf(47);     // Catch: java.lang.Throwable -> L20
        if (r4 != 0) goto L16;
        return "/";
    L16:
        if (r4 != (-1)) goto L18;
        return null;
    L18:
        return r5.substring(0, r4);
    }

    public static java.lang.String FH() {
    L11:
        th = move-exception;
        if (Hw == false) goto L15;
        abcd.wu.j6(th, -4757022740826299475L, null);
    L15:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-4757022740826299475L, null);     // Catch: java.lang.Throwable -> L11
    L6:
        java.io.File r3 = DW.getExternalCacheDir();     // Catch: java.lang.Throwable -> L11
        if (r3 != null) goto L9;
        r3 = DW.getCacheDir();     // Catch: java.lang.Throwable -> L11
    L9:
        return r3.getPath();
    }

    public static java.lang.String FH(java.lang.String r7, java.lang.String r8) {
    L11:
        th = move-exception;
        if (Hw == false) goto L15;
        abcd.wu.j6(th, 2555070330157146741L, null, r7, r8);
    L15:
        throw th;
    L3:
        if (FH == false) goto L6;
        abcd.wu.j6(2555070330157146741L, null, r7, r8);     // Catch: java.lang.Throwable -> L11
    L6:
        if (r7.equals(r8) == false) goto L9;
        return "";
    L9:
        return r8.substring(r7.length() + 1, r8.length());
    }

    public static void FH(java.lang.String r5) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 18369231772589555L, null, r5);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(18369231772589555L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        DW(new java.io.File(r5));     // Catch: java.lang.Throwable -> L8
    }

    public static java.lang.String Hw() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 281068964592893352L, null);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(281068964592893352L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return DW.getPackageName() + ".fileprovider";
    }

    public static boolean Hw(java.lang.String r5) {
    L14:
        th = move-exception;
        if (Hw == false) goto L18;
        abcd.wu.j6(th, 86298649490941376L, null, r5);
    L18:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(86298649490941376L, null, r5);     // Catch: java.lang.Throwable -> L14
    L7:
        if (new java.io.File(r5).exists() == true) goto L12;
        if (XL(r5) == true) goto L12;
        return false;
    L12:
        return true;
    }

    public static boolean Hw(java.lang.String r7, java.lang.String r8) {
    L13:
        th = move-exception;
        if (Hw == false) goto L17;
        abcd.wu.j6(th, -3593682895902197605L, null, r7, r8);
    L17:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-3593682895902197605L, null, r7, r8);     // Catch: java.lang.Throwable -> L13
    L5:
        if (r8 != null) goto L7;
    L11:
        return false;
    L7:
        if (r8.equals(r7) == true) goto L10;
        if (r8.startsWith(r7 + "/") == false) goto L11;
    L10:
        return true;
    }

    public static boolean J0(java.lang.String r5) {
    L14:
        th = move-exception;
        if (Hw == false) goto L18;
        abcd.wu.j6(th, -129217535771189385L, null, r5);
    L18:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-129217535771189385L, null, r5);     // Catch: java.lang.Throwable -> L14
    L7:
        if (aM(r5) == true) goto L12;
        if (Ws(r5) == true) goto L12;
        return false;
    L12:
        return true;
    }

    public static boolean J8(java.lang.String r5) {
    L15:
        th = move-exception;
        if (Hw == false) goto L19;
        abcd.wu.j6(th, -9012159671588932488L, null, r5);
    L19:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-9012159671588932488L, null, r5);     // Catch: java.lang.Throwable -> L15
    L7:
        if (j3(r5) == false) goto L9;
    L10:
        if (gW(r5) == true) goto L13;
        return true;
    L13:
        return false;
    L9:
        if (XL(r5) == false) goto L13;
        goto L10
    }

    public static boolean Mr(java.lang.String r5) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 52699472292212800L, null, r5);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(52699472292212800L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return r5.equals("/");
    }

    public static boolean QX(java.lang.String r5) {
    L11:
        th = move-exception;
        if (Hw == false) goto L15;
        abcd.wu.j6(th, -2157979276541302775L, null, r5);
    L15:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-2157979276541302775L, null, r5);     // Catch: java.lang.Throwable -> L11
    L6:
        if (er(r5) == null) goto L9;
        return true;
    L9:
        return false;
    }

    public static boolean U2(java.lang.String r5) {
    L13:
        th = move-exception;
        if (Hw == false) goto L17;
        abcd.wu.j6(th, -4151694166275401025L, null, r5);
    L17:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-4151694166275401025L, null, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if (r5.startsWith("/") == false) goto L11;
        if (aM(EQ(r5)) == false) goto L11;
        return true;
    L11:
        return false;
    }

    public static java.lang.String VH() {
        java.lang.String r0 = null;
    L12:
        th = move-exception;
        if (Hw == false) goto L16;
        abcd.wu.j6(th, -3558726583697401800L, r0);
    L16:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-3558726583697401800L, null);     // Catch: java.lang.Throwable -> L12
    L6:
        java.io.File r3 = android.os.Environment.getExternalStorageDirectory();     // Catch: java.lang.Throwable -> L12
        if (r3.exists() == false) goto L10;
        r0 = r3.getPath();     // Catch: java.lang.Throwable -> L12
        return r0;
    L10:
        return "/mnt/sdcard";
    }

    public static java.lang.String VH(java.lang.String r6) {
    L12:
        th = move-exception;
        if (Hw == false) goto L16;
        abcd.wu.j6(th, 777233767327094583L, null, r6);
    L16:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(777233767327094583L, null, r6);     // Catch: java.lang.Throwable -> L12
    L6:
        java.lang.String r3 = tp(r6);     // Catch: java.lang.Throwable -> L12
        int r4 = r3.lastIndexOf(46);     // Catch: java.lang.Throwable -> L12
        if (r4 >= 0) goto L10;
        return "";
    L10:
        return r3.substring(r4 + 1, r3.length());
    }

    public static java.lang.String VH(java.lang.String r7, java.lang.String r8) {
    L7:
        th = move-exception;
        if (Hw == false) goto L11;
        abcd.wu.j6(th, -2450947388167519769L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-2450947388167519769L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        return u7(r7, r8);
    }

    public static boolean Ws(java.lang.String r5) {
    L13:
        th = move-exception;
        if (Hw == false) goto L17;
        abcd.wu.j6(th, -4633359068939577120L, null, r5);
    L17:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-4633359068939577120L, null, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if (er(r5) == null) goto L11;
        if (j6.FH(r5) == true) goto L11;
        return true;
    L11:
        return false;
    }

    public static boolean XL(java.lang.String r5) {
    L13:
        th = move-exception;
        if (Hw == false) goto L17;
        abcd.wu.j6(th, -3556820254293970915L, null, r5);
    L17:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-3556820254293970915L, null, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if (er(r5) == null) goto L11;
        if (j6.FH(r5) == false) goto L11;
        return true;
    L11:
        return false;
    }

    public static java.lang.String Zo() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 8935315508610390168L, null);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(8935315508610390168L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return android.support.v4.content.b.DW(DW).getPath();
    }

    public static java.util.List<java.lang.String> Zo(java.lang.String r12) {
        java.lang.String r0 = "/";
    L38:
        th = move-exception;
        if (Hw == false) goto L43;
        abcd.wu.j6(th, -2383992720345998160L, null, r12);
    L43:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-2383992720345998160L, null, r12);     // Catch: java.lang.Throwable -> L38
    L7:
        if (QX(r12) == false) goto L12;
        java.util.List<java.lang.String> r1 = j6.j6(er(r12), yS(r12));     // Catch: java.lang.Throwable -> L38
        if (r1 == null) goto L11;
        return r1;
    L11:
        return new java.util.ArrayList();
    L12:
        java.lang.String[] r4 = new java.io.File(r12).list();     // Catch: java.lang.Throwable -> L38
        int r5 = 0;
        if (r4 != null) goto L29;
        java.lang.String r13 = j6(new java.io.File(r12));     // Catch: java.lang.Throwable -> L38
        if (r13.endsWith(java.io.File.separator) == true) goto L17;
        r13 = r13 + java.io.File.separator;     // Catch: java.lang.Throwable -> L38
    L17:
        java.lang.String[] r6 = {VH()};     // Catch: java.lang.Throwable -> L38
        java.util.ArrayList r7 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L38
        int r8 = r6.length;     // Catch: java.lang.Throwable -> L38
        int r9 = 0;
    L18:
        if (r9 >= r8) goto L28;
        java.lang.String r10 = j6(new java.io.File(r6[r9]));     // Catch: java.lang.Throwable -> L38
        if (r10.startsWith(r13) == false) goto L27;
        if (r10.equals(r13) == true) goto L27;
        int r11 = r10.indexOf(java.io.File.separator, r13.length() + 1);     // Catch: java.lang.Throwable -> L38
        if (r11 >= 0) goto L26;
        r11 = r10.length();     // Catch: java.lang.Throwable -> L38
    L26:
        r7.add(r10.substring(0, r11));     // Catch: java.lang.Throwable -> L38
    L27:
        r9 = r9 + 1;     // Catch: java.lang.Throwable -> L38
        goto L18
    L28:
        return r7;
    L29:
        java.lang.String[] r14 = new java.lang.String[r4.length];     // Catch: java.lang.Throwable -> L38
        if (r12.equals("/") == true) goto L34;
        r0 = r12 + java.io.File.separator;     // Catch: java.lang.Throwable -> L38
    L34:
        if (r5 >= r14.length) goto L37;
        r14[r5] = r0 + r4[r5];     // Catch: java.lang.Throwable -> L38
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L38
        goto L34
    L37:
        return java.util.Arrays.asList(r14);
    }

    public static void Zo(java.lang.String r7, java.lang.String r8) {
    L14:
        th = move-exception;
        if (Hw == false) goto L18;
        abcd.wu.j6(th, 57658662308545600L, null, r7, r8);
    L18:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(57658662308545600L, null, r7, r8);     // Catch: java.lang.Throwable -> L14
    L5:
        java.io.File r0 = new java.io.File(r8);     // Catch: java.lang.Throwable -> L14
        if (r0.exists() == true) goto L13;
        if (new java.io.File(r7).renameTo(r0) == false) goto L11;
        return;
    L11:
        throw new java.io.IOException(r7 + " could not be renamed");     // Catch: java.lang.Throwable -> L14
    L13:
        throw new java.io.IOException(r8 + " already exists");     // Catch: java.lang.Throwable -> L14
    }

    public static boolean a8(java.lang.String r5) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -14207538927135840L, null, r5);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-14207538927135840L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new java.io.File(r5).mkdirs();
    }

    public static boolean aM(java.lang.String r5) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -6265010126763345620L, null, r5);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-6265010126763345620L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new java.io.File(r5).isDirectory();
    }

    @abcd.Interfacesu(method = -4515002782207948224L)
    private static java.lang.String er(java.lang.String r5) {
    L16:
        th = move-exception;
        if (Hw == false) goto L21;
        abcd.wu.j6(th, 5013616696742686395L, null, r5);
    L21:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(5013616696742686395L, null, r5);     // Catch: java.lang.Throwable -> L16
    L7:
        if (gW(r5) == false) goto L9;
        return r5;
    L9:
        java.lang.String r3 = r5;
    L10:
        r3 = EQ(r3);     // Catch: java.lang.Throwable -> L16
        if (r3 == null) goto L12;
        if (gW(r3) == false) goto L10;
        return r3;
    L12:
        return null;
    }

    @abcd.Interfacesu(method = 50649138316466872L)
    private static boolean gW(java.lang.String r5) {
    L15:
        th = move-exception;
        if (Hw == false) goto L19;
        abcd.wu.j6(th, -8064278559476058399L, null, r5);
    L19:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-8064278559476058399L, null, r5);     // Catch: java.lang.Throwable -> L15
    L7:
        if (new java.io.File(r5).isFile() == true) goto L9;
    L13:
        return false;
    L9:
        if (r5.endsWith(".jar") == true) goto L12;
        if (r5.endsWith(".zip") == false) goto L13;
    L12:
        return true;
    }

    public static long gn(java.lang.String r5) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -3038342380781504439L, null, r5);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-3038342380781504439L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new java.io.File(r5).lastModified();
    }

    public static java.lang.String gn(java.lang.String r7, java.lang.String r8) {
    L10:
        th = move-exception;
        if (Hw == false) goto L14;
        abcd.wu.j6(th, 1277790635005095079L, null, r7, r8);
    L14:
        throw th;
    L3:
        if (FH == false) goto L6;
        abcd.wu.j6(1277790635005095079L, null, r7, r8);     // Catch: java.lang.Throwable -> L10
    L6:
        if (Hw(r7, r8) == false) goto L9;
        return r8.substring(r7.length() + 1, r8.length());
    L9:
        return r8;
    }

    public static boolean j3(java.lang.String r5) {
    L13:
        th = move-exception;
        if (Hw == false) goto L17;
        abcd.wu.j6(th, 1701458594852363739L, null, r5);
    L17:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(1701458594852363739L, null, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if (new java.io.File(r5).isFile() == false) goto L11;
        if (gW(r5) == true) goto L11;
        return true;
    L11:
        return false;
    }

    public static int j6(java.lang.String r8, int r9, java.lang.String... r10) {
    L25:
        th = move-exception;
        if (Hw == false) goto L30;
        abcd.wu.j6(th, 9414144586089529L, null, r8, new java.lang.Integer(r9), r10);
    L30:
        throw th;
    L3:
        if (FH == false) goto L6;
        abcd.wu.j6(9414144586089529L, null, r8, new java.lang.Integer(r9), r10);     // Catch: java.lang.Throwable -> L25
    L6:
        int r1 = 0;
        if (aM(r8) == false) goto L16;
        java.util.Iterator<java.lang.String> r0 = Zo(r8).iterator();     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L25
    L10:
        if (r0.hasNext() == false) goto L14;
        r1 = r1 + j6(r0.next(), r9, r10);
        if (r1 < r9) goto L10;
    L14:
        return r1;
    L16:
        if (j3(r8) == false) goto L24;
        int r2 = r10.length;     // Catch: java.lang.Throwable -> L25
        int r3 = 0;
    L18:
        if (r3 >= r2) goto L24;
        if (r8.endsWith(r10[r3]) == true) goto L21;
        r3 = r3 + 1;
        goto L18
    L21:
        return 1;
    L24:
        return 0;
    }

    static abcd.Dc j6() {
        return j6;
    }

    public static java.lang.String j6(java.io.File r10) {
    L31:
        th = move-exception;
        if (Hw == false) goto L36;
        abcd.wu.j6(th, 81175897695934767L, null, r10);
    L36:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(81175897695934767L, null, r10);     // Catch: java.lang.Throwable -> L31
    L6:
        java.util.ArrayList r3 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L31
        java.lang.String r4 = r10.getAbsolutePath();     // Catch: java.lang.Throwable -> L31
        java.lang.String[] r5 = r4.split("/|\\\\");     // Catch: java.lang.Throwable -> L31
        int r6 = r5.length;     // Catch: java.lang.Throwable -> L31
        int r7 = 0;
    L7:
        if (r7 >= r6) goto L21;
        java.lang.String r8 = r5[r7];     // Catch: java.lang.Throwable -> L31
        if (r8.length() == 0) goto L20;
        if (".".equals(r8) == true) goto L20;
        if ("..".equals(r8) == true) goto L16;
        r3.add(r8);     // Catch: java.lang.Throwable -> L31
        goto L20
    L16:
        if (r3.isEmpty() == true) goto L17;
        r3.remove(r3.size() - 1);     // Catch: java.lang.Throwable -> L31
        goto L20
    L17:
        return r4;
    L20:
        r7 = r7 + 1;     // Catch: java.lang.Throwable -> L31
        goto L7
    L21:
        java.lang.StringBuilder r9 = new java.lang.StringBuilder();     // Catch: java.lang.Throwable -> L31
        java.util.Iterator r11 = r3.iterator();     // Catch: java.lang.Throwable -> L31
    L24:
        if (r11.hasNext() == false) goto L27;
        java.lang.String r12 = (java.lang.String) r11.next();     // Catch: java.lang.Throwable -> L31
        r9.append("/");     // Catch: java.lang.Throwable -> L31
        r9.append(r12);     // Catch: java.lang.Throwable -> L31
        goto L24
    L27:
        if (r4.endsWith("/") == false) goto L29;
        r9.append("/");     // Catch: java.lang.Throwable -> L31
    L29:
        return r9.toString();
    }

    public static java.lang.String j6(java.io.Reader r7) {
    L12:
        th = move-exception;
        if (Hw == false) goto L17;
        abcd.wu.j6(th, -404394288049635744L, null, r7);
    L17:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-404394288049635744L, null, r7);     // Catch: java.lang.Throwable -> L12
    L6:
        char[] r3 = new char[4096];     // Catch: java.lang.Throwable -> L12
        java.lang.StringBuffer r4 = new java.lang.StringBuffer();     // Catch: java.lang.Throwable -> L12
    L7:
        int r5 = r7.read(r3);     // Catch: java.lang.Throwable -> L12
        if (r5 <= 0) goto L10;
        r4.append(r3, 0, r5);     // Catch: java.lang.Throwable -> L12
        goto L7
    L10:
        return r4.toString();
    }

    public static java.lang.String j6(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
    L7:
        th = move-exception;
        if (Hw == false) goto L11;
        abcd.wu.j6(th, -3197553558419385989L, null, r8, r9, r10);
    L11:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-3197553558419385989L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L7
    L5:
        return r10 + r8.substring(r9.length(), r8.length());
    }

    public static void j6(android.content.Context r5) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -2011097585176329125L, null, r5);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-2011097585176329125L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        DW = r5;     // Catch: java.lang.Throwable -> L8
    }

    public static void j6(java.io.InputStream r8, java.lang.String r9, boolean r10) {
    L17:
        th = move-exception;
        if (Hw == false) goto L22;
        abcd.wu.j6(th, -295414839780222864L, null, r8, r9, new java.lang.Boolean(r10));
    L22:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-295414839780222864L, null, r8, r9, new java.lang.Boolean(r10));     // Catch: java.lang.Throwable -> L17
    L5:
        java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream(r8);     // Catch: java.lang.Throwable -> L17
    L6:
        java.util.zip.ZipEntry r1 = r0.getNextEntry();     // Catch: java.lang.Throwable -> L17
        if (r1 == null) goto L16;
        java.lang.String r2 = r9 + java.io.File.separator + r1.getName();     // Catch: java.lang.Throwable -> L17
        if (r1.isDirectory() == true) goto L10;
        if (r10 == true) goto L14;
        if (new java.io.File(r2).isFile() == true) goto L6;
    L14:
        new java.io.File(r2).getParentFile().mkdirs();     // Catch: java.lang.Throwable -> L17
        java.io.FileOutputStream r3 = new java.io.FileOutputStream(r2);     // Catch: java.lang.Throwable -> L17
        com.aide.common.Xa.j6(r0, r3, false);     // Catch: java.lang.Throwable -> L17
        r3.close();     // Catch: java.lang.Throwable -> L17
        goto L6
    L10:
        new java.io.File(r2).mkdirs();     // Catch: java.lang.Throwable -> L17
        goto L6
    }

    public static void j6(java.lang.String r6) {
    L11:
        th = move-exception;
        if (Hw == false) goto L15;
        abcd.wu.j6(th, -723687878665901797L, null, r6);
    L15:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-723687878665901797L, null, r6);     // Catch: java.lang.Throwable -> L11
    L7:
        if (new java.io.File(r6).mkdir() == false) goto L10;
        return;
    L10:
        throw new java.io.IOException(r6 + " could not be created");     // Catch: java.lang.Throwable -> L11
    }

    public static void j6(java.lang.String r7, java.io.Reader r8) {
    L7:
        th = move-exception;
        if (Hw == false) goto L11;
        abcd.wu.j6(th, -15941858901400005L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-15941858901400005L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        java.io.FileWriter r0 = new java.io.FileWriter(r7, false);     // Catch: java.lang.Throwable -> L7
        r0.append(j6(r8));     // Catch: java.lang.Throwable -> L7
        r0.close();     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(java.lang.String r7, java.lang.String r8) {
    L11:
        th = move-exception;
        if (Hw == false) goto L15;
        abcd.wu.j6(th, 2025472790921070648L, null, r7, r8);
    L15:
        throw th;
    L3:
        if (FH == false) goto L6;
        abcd.wu.j6(2025472790921070648L, null, r7, r8);     // Catch: java.lang.Throwable -> L11
    L6:
        if (new java.io.File(r7).exists() == true) goto L10;
        java.io.FileWriter r0 = new java.io.FileWriter(r7);     // Catch: java.lang.Throwable -> L11
        r0.write(r8);     // Catch: java.lang.Throwable -> L11
        r0.close();     // Catch: java.lang.Throwable -> L11
        return;
    L10:
        throw new java.io.IOException(r7 + " already exists");     // Catch: java.lang.Throwable -> L11
    }

    public static boolean j6(long r19, long r21) {
    L32:
        th = move-exception;
        if (Hw == false) goto L36;
        abcd.wu.j6(th, -1542902813803950633L, null, new java.lang.Long(r19), new java.lang.Long(r21));
    L36:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-1542902813803950633L, null, new java.lang.Long(r19), new java.lang.Long(r21));     // Catch: java.lang.Throwable -> L32
    L6:
        long r5 = java.lang.Math.abs(r19 - r21);     // Catch: java.lang.Throwable -> L32
        if (r5 > 1000) goto L10;
        return true;
    L10:
        if ((r5 % 3600000) > 0) goto L17;
        if (r5 <= 46800000) goto L39;
        return false;
    L39:
        return true;
    L17:
        if (((r5 - 1000) % 3600000) == 0) goto L19;
        if (((1000 + r5) % 3600000) == 0) goto L27;
        return false;
    L27:
        if (r5 <= 46800000) goto L41;
        return false;
    L41:
        return true;
    L19:
        if (r5 <= 46800000) goto L40;
        return false;
    L40:
        return true;
    }

    public static java.io.Reader lg(java.lang.String r5) {
    L16:
        th = move-exception;
        if (Hw == false) goto L20;
        abcd.wu.j6(th, -728787099937647160L, null, r5);
    L20:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-728787099937647160L, null, r5);     // Catch: java.lang.Throwable -> L16
    L7:
        if (j3(r5) == false) goto L11;
        return new java.io.FileReader(r5);
    L11:
        if (XL(r5) == false) goto L15;
        return BT(r5);
    L15:
        throw new java.io.IOException();     // Catch: java.lang.Throwable -> L16
    }

    public static void rN(java.lang.String r9) {
    L17:
        th = move-exception;
        if (Hw == false) goto L21;
        abcd.wu.j6(th, 3567576755361035985L, null, r9);
    L21:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(3567576755361035985L, null, r9);     // Catch: java.lang.Throwable -> L17
    L6:
        java.io.File r3 = new java.io.File(r9);     // Catch: java.lang.Throwable -> L17
        if (r3.exists() == true) goto L9;
        return;
    L9:
        if (r3.setLastModified(java.lang.System.currentTimeMillis()) == true) goto L25;
        java.io.RandomAccessFile r4 = new java.io.RandomAccessFile(r3, "rw");     // Catch: java.lang.Throwable -> L17
        long r5 = r4.length();     // Catch: java.lang.Throwable -> L13
        r4.setLength(1 + r5);     // Catch: java.lang.Throwable -> L13
        r4.setLength(r5);     // Catch: java.lang.Throwable -> L13
        r4.close();     // Catch: java.lang.Throwable -> L17
        return;
    L13:
        th = move-exception;
        r4.close();     // Catch: java.lang.Throwable -> L17
        throw th;     // Catch: java.lang.Throwable -> L17
    }

    public static java.lang.String tp(java.lang.String r5) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -482240675072262407L, null, r5);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-482240675072262407L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return r5.substring(r5.lastIndexOf(47) + 1);
    }

    public static long u7(java.lang.String r5) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -2464643554325931693L, null, r5);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-2464643554325931693L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new java.io.File(r5).length();
    }

    @abcd.Interfacesu(method = 197188509315324520L)
    private static java.lang.String u7(java.lang.String r7, java.lang.String r8) {
    L17:
        th = move-exception;
        if (Hw == false) goto L21;
        abcd.wu.j6(th, 5017540230360799131L, null, r7, r8);
    L21:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(5017540230360799131L, null, r7, r8);     // Catch: java.lang.Throwable -> L17
    L6:
        java.lang.String r1 = r8.replace("\\\\", "/").replace("\\", "/");     // Catch: java.lang.Throwable -> L17
        if (r1.contains("/") == true) goto L11;
        return r7 + "/" + r1;
    L11:
        if (r1.startsWith("/") == false) goto L13;
        r1 = ".." + r1;     // Catch: java.lang.Throwable -> L17
    L13:
        java.lang.String r0 = j6(new java.io.File(r7, r1));     // Catch: java.lang.Throwable -> L17
        if (new java.io.File(r0).exists() == false) goto L16;
        return r0;
    L16:
        return r8;
    }

    public static java.lang.String v5() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 1600707000363707025L, null);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(1600707000363707025L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return DW.getFilesDir().getPath();
    }

    public static java.util.List<java.lang.String> v5(java.lang.String r7) {
    L14:
        th = move-exception;
        if (Hw == false) goto L19;
        abcd.wu.j6(th, -6943778665509984075L, null, r7);
    L19:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-6943778665509984075L, null, r7);     // Catch: java.lang.Throwable -> L14
    L6:
        java.util.ArrayList r3 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L14
        java.util.Iterator<java.lang.String> r4 = Zo(r7).iterator();     // Catch: java.lang.Throwable -> L14
    L7:
        if (r4.hasNext() == false) goto L13;
        java.lang.String r5 = r4.next();     // Catch: java.lang.Throwable -> L14
        if (J0(r5) == false) goto L7;
        r3.add(r5);     // Catch: java.lang.Throwable -> L14
        goto L7
    L13:
        return r3;
    }

    public static boolean v5(java.lang.String r7, java.lang.String r8) {
    L21:
        th = move-exception;
        if (Hw == false) goto L26;
        abcd.wu.j6(th, -5476940013961158979L, null, r7, r8);
    L26:
        throw th;
    L3:
        if (FH == false) goto L28;
        abcd.wu.j6(-5476940013961158979L, null, r7, r8);     // Catch: java.lang.Throwable -> L21
    L28:
        java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r7);     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L21
        java.io.Reader r2 = lg(r8);     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L21
        java.io.BufferedReader r3 = new java.io.BufferedReader(r2);     // Catch: java.lang.Throwable -> L17
    L8:
        java.lang.String r4 = r3.readLine();     // Catch: java.lang.Throwable -> L17
        if (r4 == null) goto L15;
        if (r1.matcher(r4).find() == false) goto L8;
        r2.close();     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L21
        return true;
    L15:
        r2.close();     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L21
        return false;
    L17:
        th = move-exception;
        r2.close();     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L21
        throw th;     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L21
    L20:
        return false;
    }

    public static boolean we(java.lang.String r9) {
    L29:
        th = move-exception;
        if (Hw == false) goto L34;
        abcd.wu.j6(th, 1084099894898311057L, null, r9);
    L34:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(1084099894898311057L, null, r9);     // Catch: java.lang.Throwable -> L29
    L7:
        if (XL(r9) == false) goto L9;
        return false;
    L9:
        long r5 = new java.io.File(r9).length();     // Catch: java.lang.Throwable -> L29
        if (8000 >= r5) goto L13;
        int r3 = 8000;
    L39:
        java.io.FileInputStream r6 = new java.io.FileInputStream(r9);     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L29
        byte[] r4 = new byte[r3];     // Catch: java.lang.Throwable -> L25
        new java.io.DataInputStream(r6).readFully(r4);     // Catch: java.lang.Throwable -> L25
        int r7 = 0;
    L17:
        if (r7 >= r4.length) goto L23;
        if (r4[r7] == 0) goto L20;
        r7 = r7 + 1;     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L29
        goto L17
    L20:
        r6.close();     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L29
        return true;
    L23:
        r6.close();     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L29
        return false;
    L25:
        th = move-exception;
        r6.close();     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L29
        throw th;     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L29
    L28:
        return false;
    L13:
        r3 = (int) r5;
        goto L39
    }

    @abcd.Interfacesu(method = -2600256375630916405L)
    private static java.lang.String yS(java.lang.String r6) {
    L12:
        th = move-exception;
        if (Hw == false) goto L16;
        abcd.wu.j6(th, 3537424169481326592L, null, r6);
    L16:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(3537424169481326592L, null, r6);     // Catch: java.lang.Throwable -> L12
    L6:
        java.lang.String r3 = er(r6);     // Catch: java.lang.Throwable -> L12
        if (r3.length() != r6.length()) goto L10;
        return "";
    L10:
        return r6.substring(r3.length() + 1, r6.length());
    }
}
