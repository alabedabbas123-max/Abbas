package com.aide.ui;

@abcd.Interfacexu
public class aa {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;

    @abcd.Interfaceru(field = 3417054187342388200L)
    private static android.content.Context j6;

    static {
        abcd.wu.j6(com.aide.ui.aa.class, 480679063369465845L, 480679063369465845L);
    }

    public aa() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -3306790757542697732L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-3306790757542697732L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static java.lang.String BT() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 940932671106983727L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(940932671106983727L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getString("app_language", "default");
    }

    public static void DW(android.content.Context r7, android.content.SharedPreferences.OnSharedPreferenceChangeListener r8) {
    L7:
        th = move-exception;
        if (FH == false) goto L11;
        abcd.wu.j6(th, -2237353505197559952L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(-2237353505197559952L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        Hw(j6).unregisterOnSharedPreferenceChangeListener(r8);     // Catch: java.lang.Throwable -> L7
    }

    public static void DW(java.lang.String r7) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 2018674844428176585L, null, r7);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(2018674844428176585L, null, r7);     // Catch: java.lang.Throwable -> L8
    L6:
        android.content.SharedPreferences r4 = android.preference.PreferenceManager.getDefaultSharedPreferences(j6);     // Catch: java.lang.Throwable -> L8
        android.content.SharedPreferences.Editor r5 = r4.edit();     // Catch: java.lang.Throwable -> L8
        java.util.Set<java.lang.String> r6 = r4.getStringSet("intel_libs_warned_projects", new java.util.HashSet());     // Catch: java.lang.Throwable -> L8
        r6.add(r7);     // Catch: java.lang.Throwable -> L8
        r5.putStringSet("intel_libs_warned_projects", r6);     // Catch: java.lang.Throwable -> L8
        r5.commit();     // Catch: java.lang.Throwable -> L8
    }

    public static void DW(boolean r5) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -1566447609235003872L, null, new java.lang.Boolean(r5));
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-1566447609235003872L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        android.content.SharedPreferences.Editor r3 = ef().edit();     // Catch: java.lang.Throwable -> L8
        r3.putBoolean("trainer_voice", r5);     // Catch: java.lang.Throwable -> L8
        r3.commit();     // Catch: java.lang.Throwable -> L8
    }

    public static boolean DW() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -3777844239107300655L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-3777844239107300655L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getBoolean("complete_after_letter", true);
    }

    public static boolean DW(android.content.Context r6) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -5239206207633216000L, null, r6);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-5239206207633216000L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        return Hw(r6).getBoolean("send_analytics_data", true);
    }

    public static boolean EQ() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -3073219316032118856L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-3073219316032118856L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getBoolean("browser_swipe", true);
    }

    @abcd.Interfacesu(method = -649079287232705280L)
    private static int FH(android.content.Context r5) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -1102431900638387781L, null, r5);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-1102431900638387781L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return com.aide.common.ClassG.j6(r5, 14);
    }

    public static void FH(java.lang.String r5) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -3023428463941171305L, null, r5);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-3023428463941171305L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        android.content.SharedPreferences.Editor r3 = ef().edit();     // Catch: java.lang.Throwable -> L8
        r3.putString("user_keystore", r5);     // Catch: java.lang.Throwable -> L8
        r3.commit();     // Catch: java.lang.Throwable -> L8
    }

    public static boolean FH() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 6979242308255709779L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(6979242308255709779L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getBoolean("complete_all_types", true);
    }

    public static int Hw() {
    L14:
        th = move-exception;
        if (FH == false) goto L18;
        abcd.wu.j6(th, 4401739661892457984L, null);
    L18:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(4401739661892457984L, null);     // Catch: java.lang.Throwable -> L14
    L7:
        if (com.aide.ui.U.dx() == false) goto L19;
        return 5;
    L19:
        return java.lang.Integer.parseInt(ef().getString("autosafe_time", "-1"));
    L12:
        return -1;
    }

    @abcd.Interfacesu(method = 534994003005623856L)
    private static android.content.SharedPreferences Hw(android.content.Context r5) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 52723629260042395L, null, r5);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(52723629260042395L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return android.preference.PreferenceManager.getDefaultSharedPreferences(r5);
    }

    public static void Hw(java.lang.String r5) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -1554192697156476832L, null, r5);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-1554192697156476832L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        android.content.SharedPreferences.Editor r3 = ef().edit();     // Catch: java.lang.Throwable -> L8
        r3.putString("local_doc_dir_path", r5);     // Catch: java.lang.Throwable -> L8
        r3.commit();     // Catch: java.lang.Throwable -> L8
    }

    public static boolean J0() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 1929840242518963776L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(1929840242518963776L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getBoolean("trainer_sound", true);
    }

    public static boolean J8() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 2196232330926342261L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(2196232330926342261L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getBoolean("trainer_voice", false);
    }

    public static boolean KD() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -3284377389251581129L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-3284377389251581129L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getBoolean("send_analytics_data", true);
    }

    public static int Mr() {
    L10:
        th = move-exception;
        if (FH == false) goto L14;
        abcd.wu.j6(th, -2107437416648218704L, null);
    L14:
        throw th;
    L4:
        if (DW == false) goto L17;
        abcd.wu.j6(-2107437416648218704L, null);     // Catch: java.lang.Throwable -> L10
    L17:
        return java.lang.Integer.parseInt(ef().getString("html_indentation_size", "2"));
    L8:
        return 2;
    }

    public static int P8() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 3679176581644527315L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L15;
        abcd.wu.j6(3679176581644527315L, null);     // Catch: java.lang.Throwable -> L8
        return 1000;
    L15:
        return 1000;
    }

    public static java.lang.String QX() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 4263462807678454935L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(4263462807678454935L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getString("git_dot_ssh_dir", "");
    }

    public static boolean SI() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -1043557988735804048L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-1043557988735804048L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getBoolean("run_as_root", true);
    }

    public static java.util.Map<java.lang.String, java.lang.Integer> U2() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -3530845519441695840L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-3530845519441695840L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        java.util.HashMap r3 = new java.util.HashMap();     // Catch: java.lang.Throwable -> L8
        r3.put("Java", java.lang.Integer.valueOf(er()));     // Catch: java.lang.Throwable -> L8
        r3.put("JavaScript", java.lang.Integer.valueOf(gW()));     // Catch: java.lang.Throwable -> L8
        r3.put("XML", java.lang.Integer.valueOf(sG()));     // Catch: java.lang.Throwable -> L8
        r3.put("HTML", java.lang.Integer.valueOf(Mr()));     // Catch: java.lang.Throwable -> L8
        return r3;
    }

    public static int VH() {
    L10:
        th = move-exception;
        if (FH == false) goto L14;
        abcd.wu.j6(th, 5107163184652813356L, null);
    L14:
        throw th;
    L4:
        if (DW == false) goto L17;
        abcd.wu.j6(5107163184652813356L, null);     // Catch: java.lang.Throwable -> L10
    L17:
        return java.lang.Integer.parseInt(ef().getString("cpp_indentation_size", "4"));
    L8:
        return 4;
    }

    public static boolean Ws() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 2173117525636686720L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(2173117525636686720L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getBoolean("force_soft_keyboard", false);
    }

    public static boolean XL() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -430656149389117224L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-430656149389117224L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getBoolean("git_keep_ssh_session_info", false);
    }

    public static java.util.Map<java.lang.String, java.util.List<java.lang.String>> Zo() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 7588154889979986512L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(7588154889979986512L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        java.util.HashMap r3 = new java.util.HashMap();     // Catch: java.lang.Throwable -> L8
        r3.put("Java", rN());     // Catch: java.lang.Throwable -> L8
        r3.put("JavaScript", yS());     // Catch: java.lang.Throwable -> L8
        return r3;
    }

    public static boolean a8() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 378799975405072375L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(378799975405072375L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getBoolean("use_spaces_for_tabs", false);
    }

    public static java.lang.String aM() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 254784319546006012L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(254784319546006012L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getString("git_user_email", "");
    }

    public static java.lang.String cb() {
    L12:
        th = move-exception;
        if (FH == false) goto L16;
        abcd.wu.j6(th, -385192645559649280L, null);
    L16:
        throw th;
    L4:
        if (DW == false) goto L8;
        abcd.wu.j6(-385192645559649280L, null);     // Catch: java.lang.Throwable -> L12
    L8:
        if (ef().getBoolean("use_user_keystore", false) == false) goto L11;
        return ef().getString("user_keystore", "").trim();
    L11:
        return "";
    }

    public static int cn() {
    L10:
        th = move-exception;
        if (FH == false) goto L14;
        abcd.wu.j6(th, 2374018288218094375L, null);
    L14:
        throw th;
    L4:
        if (DW == false) goto L17;
        abcd.wu.j6(2374018288218094375L, null);     // Catch: java.lang.Throwable -> L10
    L17:
        return java.lang.Integer.parseInt(ef().getString("tabsize", "4"));
    L8:
        return 4;
    }

    public static java.lang.String dx() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -6116185992377498525L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-6116185992377498525L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getString("user_m2repositories", "");
    }

    @abcd.Interfacesu(method = 5534343383408724303L)
    private static android.content.SharedPreferences ef() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 467253668715616776L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(467253668715616776L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return Hw(j6);
    }

    public static int ei() {
    L10:
        th = move-exception;
        if (FH == false) goto L14;
        abcd.wu.j6(th, -3085243704335756051L, null);
    L14:
        throw th;
    L4:
        if (DW == false) goto L17;
        abcd.wu.j6(-3085243704335756051L, null);     // Catch: java.lang.Throwable -> L10
    L17:
        return java.lang.Integer.parseInt(ef().getString("max_single_imports", "100"));
    L8:
        return 0;
    }

    public static int er() {
    L10:
        th = move-exception;
        if (FH == false) goto L14;
        abcd.wu.j6(th, -2237108322076730267L, null);
    L14:
        throw th;
    L4:
        if (DW == false) goto L17;
        abcd.wu.j6(-2237108322076730267L, null);     // Catch: java.lang.Throwable -> L10
    L17:
        return java.lang.Integer.parseInt(ef().getString("java_indentation_size", "4"));
    L8:
        return 4;
    }

    public static int gW() {
    L10:
        th = move-exception;
        if (FH == false) goto L14;
        abcd.wu.j6(th, -658339769779281096L, null);
    L14:
        throw th;
    L4:
        if (DW == false) goto L17;
        abcd.wu.j6(-658339769779281096L, null);     // Catch: java.lang.Throwable -> L10
    L17:
        return java.lang.Integer.parseInt(ef().getString("js_indentation_size", "4"));
    L8:
        return 4;
    }

    public static boolean gn() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -141058983325704852L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-141058983325704852L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getBoolean("git_create_for_projects", false);
    }

    public static java.lang.String j3() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -246558571514946033L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-246558571514946033L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getString("git_user_name", "");
    }

    public static void j6(android.content.Context r7, android.content.SharedPreferences.OnSharedPreferenceChangeListener r8) {
    L7:
        th = move-exception;
        if (FH == false) goto L11;
        abcd.wu.j6(th, 149547865968935471L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(149547865968935471L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        Hw(j6).registerOnSharedPreferenceChangeListener(r8);     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(java.lang.String r7, java.util.List<java.lang.String> r8) {
    L17:
        th = move-exception;
        if (FH == false) goto L22;
        abcd.wu.j6(th, -301007177741209940L, null, r7, r8);
    L22:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(-301007177741209940L, null, r7, r8);     // Catch: java.lang.Throwable -> L17
    L5:
        android.content.SharedPreferences.Editor r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(j6).edit();     // Catch: java.lang.Throwable -> L17
        int r2 = 0;
        if ("Java".equals(r7) == false) goto L11;
        abcd.Enumid[] r1 = abcd.Enumid.values();     // Catch: java.lang.Throwable -> L17
        int r3 = r1.length;     // Catch: java.lang.Throwable -> L17
        int r4 = 0;
    L8:
        if (r4 >= r3) goto L11;
        abcd.Enumid r5 = r1[r4];     // Catch: java.lang.Throwable -> L17
        r0.putBoolean(r5.VH(), r8.contains(r5.getName()));     // Catch: java.lang.Throwable -> L17
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L17
    L11:
        if ("JavaScript".equals(r7) == false) goto L15;
        abcd.EnumMd[] r6 = abcd.EnumMd.values();     // Catch: java.lang.Throwable -> L17
        int r9 = r6.length;     // Catch: java.lang.Throwable -> L17
    L13:
        if (r2 >= r9) goto L15;
        abcd.EnumMd r10 = r6[r2];     // Catch: java.lang.Throwable -> L17
        r0.putBoolean(r10.VH(), r8.contains(r10.getName()));     // Catch: java.lang.Throwable -> L17
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L17
    L15:
        r0.commit();     // Catch: java.lang.Throwable -> L17
    }

    public static void j6(boolean r5) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -7596170990134917183L, null, new java.lang.Boolean(r5));
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-7596170990134917183L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        android.content.SharedPreferences.Editor r3 = ef().edit();     // Catch: java.lang.Throwable -> L8
        r3.putBoolean("trainer_sound", r5);     // Catch: java.lang.Throwable -> L8
        r3.commit();     // Catch: java.lang.Throwable -> L8
    }

    public static boolean j6() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -3261086782531761064L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-3261086782531761064L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getBoolean("complete_after_dot", true);
    }

    public static boolean j6(android.content.Context r15) {
    L29:
        th = move-exception;
        if (FH == false) goto L34;
        abcd.wu.j6(th, -1758713947606532160L, null, r15);
    L34:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-1758713947606532160L, null, r15);     // Catch: java.lang.Throwable -> L29
    L6:
        j6 = r15;     // Catch: java.lang.Throwable -> L29
        boolean r7 = false;
        android.preference.PreferenceManager.setDefaultValues(r15, com.almlkaide.kaypro.R.xml.preferences_codestyle, false);     // Catch: java.lang.Throwable -> L29
        android.preference.PreferenceManager.setDefaultValues(r15, com.almlkaide.kaypro.R.xml.preferences_dropbox, false);     // Catch: java.lang.Throwable -> L29
        android.preference.PreferenceManager.setDefaultValues(r15, com.almlkaide.kaypro.R.xml.preferences_sourcecontrol, false);     // Catch: java.lang.Throwable -> L29
        android.preference.PreferenceManager.setDefaultValues(r15, com.almlkaide.kaypro.R.xml.preferences_editor, false);     // Catch: java.lang.Throwable -> L29
        android.preference.PreferenceManager.setDefaultValues(r15, com.almlkaide.kaypro.R.xml.preferences_application, false);     // Catch: java.lang.Throwable -> L29
        android.preference.PreferenceManager.setDefaultValues(r15, com.almlkaide.kaypro.R.xml.preferences_compiler, false);     // Catch: java.lang.Throwable -> L29
        android.content.SharedPreferences r6 = android.preference.PreferenceManager.getDefaultSharedPreferences(r15);     // Catch: java.lang.Throwable -> L29
        android.content.SharedPreferences.Editor r8 = r6.edit();     // Catch: java.lang.Throwable -> L29
        abcd.Enumid[] r9 = abcd.Enumid.values();     // Catch: java.lang.Throwable -> L29
        int r10 = r9.length;     // Catch: java.lang.Throwable -> L29
        int r11 = 0;
    L7:
        if (r11 >= r10) goto L12;
        abcd.Enumid r12 = r9[r11];     // Catch: java.lang.Throwable -> L29
        if (r6.contains(r12.VH()) == true) goto L11;
        r8.putBoolean(r12.VH(), abcd.Enumid.Hw().contains(r12));     // Catch: java.lang.Throwable -> L29
    L11:
        r11 = r11 + 1;     // Catch: java.lang.Throwable -> L29
        goto L7
    L12:
        abcd.EnumMd[] r13 = abcd.EnumMd.values();     // Catch: java.lang.Throwable -> L29
        int r14 = r13.length;     // Catch: java.lang.Throwable -> L29
        int r16 = 0;
    L13:
        if (r16 >= r14) goto L19;
        abcd.EnumMd r17 = r13[r16];     // Catch: java.lang.Throwable -> L29
        if (r6.contains(r17.VH()) == true) goto L17;
        r8.putBoolean(r17.VH(), abcd.EnumMd.Hw().contains(r17));     // Catch: java.lang.Throwable -> L29
    L17:
        r16 = r16 + 1;     // Catch: java.lang.Throwable -> L29
        goto L13
    L19:
        if (r6.contains("git_dot_ssh_dir") == true) goto L22;
        r8.putString("git_dot_ssh_dir", new java.io.File(abcd.Vl.VH(), ".ssh").getPath());     // Catch: java.lang.Throwable -> L29
    L22:
        if (r6.contains("editor_font_size") == true) goto L25;
        r8.putString("editor_font_size", FH(r15) + "");     // Catch: java.lang.Throwable -> L29
        r7 = true;
    L25:
        if (r6.contains("editor_tabs") == true) goto L27;
        r8.putBoolean("editor_tabs", true);     // Catch: java.lang.Throwable -> L29
    L27:
        r8.commit();     // Catch: java.lang.Throwable -> L29
        return r7;
    }

    public static boolean j6(java.lang.String r6) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 385582699326382839L, null, r6);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(385582699326382839L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getStringSet("intel_libs_warned_projects", java.util.Collections.emptySet()).contains(r6);
    }

    public static boolean lg() {
    L11:
        th = move-exception;
        if (FH == false) goto L15;
        abcd.wu.j6(th, -1866735274213651336L, null);
    L15:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(-1866735274213651336L, null);     // Catch: java.lang.Throwable -> L11
    L7:
        if (com.aide.ui.U.dx() == false) goto L9;
        return true;
    L9:
        return ef().getBoolean("light_theme", true);
    }

    public static boolean nw() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 7462582116003675684L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(7462582116003675684L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getBoolean("native_build_parallel", false);
    }

    public static java.util.List<java.lang.String> rN() {
    L13:
        th = move-exception;
        if (FH == false) goto L18;
        abcd.wu.j6(th, -23443534234028304L, null);
    L18:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-23443534234028304L, null);     // Catch: java.lang.Throwable -> L13
    L6:
        java.util.ArrayList r3 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L13
        abcd.Enumid[] r4 = abcd.Enumid.values();     // Catch: java.lang.Throwable -> L13
        int r5 = r4.length;     // Catch: java.lang.Throwable -> L13
        int r7 = 0;
    L7:
        if (r7 >= r5) goto L12;
        abcd.Enumid r8 = r4[r7];     // Catch: java.lang.Throwable -> L13
        if (ef().getBoolean(r8.VH(), false) == false) goto L11;
        r3.add(r8.name());     // Catch: java.lang.Throwable -> L13
    L11:
        r7 = r7 + 1;
        goto L7
    L12:
        return r3;
    }

    public static boolean ro() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -4503613780028743347L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-4503613780028743347L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getBoolean("editor_tabs", false);
    }

    public static int sG() {
    L10:
        th = move-exception;
        if (FH == false) goto L14;
        abcd.wu.j6(th, -4297796710664064520L, null);
    L14:
        throw th;
    L4:
        if (DW == false) goto L17;
        abcd.wu.j6(-4297796710664064520L, null);     // Catch: java.lang.Throwable -> L10
    L17:
        return java.lang.Integer.parseInt(ef().getString("xml_indentation_size", "4"));
    L8:
        return 4;
    }

    public static java.lang.String sh() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 394558037932236720L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(394558037932236720L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getString("user_androidjar", "");
    }

    public static int tp() {
    L10:
        th = move-exception;
        if (FH == false) goto L14;
        abcd.wu.j6(th, -2718147785048677520L, null);
    L14:
        throw th;
    L4:
        if (DW == false) goto L15;
        abcd.wu.j6(-2718147785048677520L, null);     // Catch: java.lang.Throwable -> L10
    L15:
        return java.lang.Integer.parseInt(ef().getString("editor_font_size", "10"));
    L8:
        return FH(j6);
    }

    public static int u7() {
    L10:
        th = move-exception;
        if (FH == false) goto L14;
        abcd.wu.j6(th, -5073543638064685608L, null);
    L14:
        throw th;
    L4:
        if (DW == false) goto L17;
        abcd.wu.j6(-5073543638064685608L, null);     // Catch: java.lang.Throwable -> L10
    L17:
        return java.lang.Integer.parseInt(ef().getString("css_indentation_size", "2"));
    L8:
        return 2;
    }

    public static void v5(java.lang.String r5) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 34090245869341544L, null, r5);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(34090245869341544L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        android.content.SharedPreferences.Editor r3 = ef().edit();     // Catch: java.lang.Throwable -> L8
        r3.putString("user_androidjar", r5);     // Catch: java.lang.Throwable -> L8
        r3.commit();     // Catch: java.lang.Throwable -> L8
    }

    public static boolean v5() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -4584856093610713047L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-4584856093610713047L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getBoolean("auto_sync_dropbox", true);
    }

    public static java.lang.String vy() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 1847300521903980000L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(1847300521903980000L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getString("local_doc_dir_path", null);
    }

    public static boolean we() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -179801648103059120L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-179801648103059120L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return ef().getBoolean("optimze_dex", false);
    }

    public static java.util.List<java.lang.String> yS() {
    L13:
        th = move-exception;
        if (FH == false) goto L18;
        abcd.wu.j6(th, -1201739983827008737L, null);
    L18:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-1201739983827008737L, null);     // Catch: java.lang.Throwable -> L13
    L6:
        java.util.ArrayList r3 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L13
        abcd.EnumMd[] r4 = abcd.EnumMd.values();     // Catch: java.lang.Throwable -> L13
        int r5 = r4.length;     // Catch: java.lang.Throwable -> L13
        int r7 = 0;
    L7:
        if (r7 >= r5) goto L12;
        abcd.EnumMd r8 = r4[r7];     // Catch: java.lang.Throwable -> L13
        if (ef().getBoolean(r8.VH(), false) == false) goto L11;
        r3.add(r8.name());     // Catch: java.lang.Throwable -> L13
    L11:
        r7 = r7 + 1;
        goto L7
    L12:
        return r3;
    }
}
