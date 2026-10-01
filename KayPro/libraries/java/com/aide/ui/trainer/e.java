package com.aide.ui.trainer;

@abcd.Interfacexu
public class e {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 2853263377798123500L)
    private boolean FH;

    @abcd.Interfaceru(field = 4503584321728343015L)
    private java.util.Set<java.lang.Long> Hw;

    @abcd.Interfaceru(field = -2645097344141993192L)
    private android.widget.Toast v5;

    static {
        abcd.wu.j6(com.aide.ui.trainer.e.class, 221157201561947787L, 221157201561947787L);
    }

    public e() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -297574364462958549L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-297574364462958549L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = true;     // Catch: java.lang.Throwable -> L8
        this.Hw = new java.util.HashSet();     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 892486056931509375L)
    private void DW(android.content.Context r8, boolean r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 420420788734058880L, this, r8, new java.lang.Boolean(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(420420788734058880L, this, r8, new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.SharedPreferences.Editor r0 = r8.getSharedPreferences("RunAppController", 0).edit();     // Catch: java.lang.Throwable -> L7
        r0.putBoolean("WAS_STARTED_SETTING", r9);     // Catch: java.lang.Throwable -> L7
        r0.commit();     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = -3566859795971533516L)
    private java.lang.String FH(android.content.Context r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3225740262230010471L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3225740262230010471L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        return r6.getSharedPreferences("RunAppController", 0).getString("TOAST_BUTTON_SETTING", "");
    }

    @abcd.Interfacesu(method = 2584547906189071680L)
    private int Hw(android.content.Context r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4053417970824357001L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4053417970824357001L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        return r6.getSharedPreferences("RunAppController", 0).getInt("TOAST_DURATION_SETTING", 0);
    }

    @abcd.Interfacesu(method = -4478451687526743223L)
    private boolean VH(android.content.Context r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2827354588986762816L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2827354588986762816L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        return r6.getSharedPreferences("RunAppController", 0).getBoolean("HAS_RUN_SETTING", false);
    }

    @abcd.Interfacesu(method = -4400174861997036720L)
    private java.lang.String Zo(android.content.Context r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 220874735420168871L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(220874735420168871L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        return r6.getSharedPreferences("RunAppController", 0).getString("TOAST_TITLE_SETTING", "");
    }

    @abcd.Interfacesu(method = 3654868819262592153L)
    private boolean gn(android.content.Context r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2282516770321706292L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2282516770321706292L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        return r6.getSharedPreferences("RunAppController", 0).getBoolean("SOUND_ENABLED", false);
    }

    static android.widget.Toast j6(com.aide.ui.trainer.e r0) {
        return r0.v5;
    }

    @abcd.Interfacesu(method = -4585183239225438080L)
    private void j6(android.content.Context r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15) {
    L20:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, -1280659570339275091L, this, r11, r12, r13, r14, new java.lang.Integer(r15));
    L24:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1280659570339275091L, this, r11, r12, r13, r14, new java.lang.Integer(r15));     // Catch: java.lang.Throwable -> L20
    L5:
        android.view.View r0 = android.view.LayoutInflater.from(r11).inflate(com.almlkaide.kaypro.R.layout.trainer_toast, null);     // Catch: java.lang.Throwable -> L20
        android.widget.TextView r1 = (android.widget.TextView) r0.findViewById(com.almlkaide.kaypro.R.id.trainerToastTitle);     // Catch: java.lang.Throwable -> L20
        android.widget.TextView r2 = (android.widget.TextView) r0.findViewById(com.almlkaide.kaypro.R.id.trainerToastText);     // Catch: java.lang.Throwable -> L20
        android.widget.TextView r3 = (android.widget.TextView) r0.findViewById(com.almlkaide.kaypro.R.id.trainerToastButton);     // Catch: java.lang.Throwable -> L20
        r1.setText(r12);     // Catch: java.lang.Throwable -> L20
        r2.setText(android.text.Html.fromHtml(r13));     // Catch: java.lang.Throwable -> L20
        if (r14 == null) goto L8;
        r3.setText(r14);     // Catch: java.lang.Throwable -> L20
    L9:
        r1.setTextSize(com.aide.common.ClassG.gn(r11));     // Catch: java.lang.Throwable -> L20
        r2.setTextSize(com.aide.common.ClassG.u7(r11));     // Catch: java.lang.Throwable -> L20
        r3.setTextSize(com.aide.common.ClassG.v5(r11));     // Catch: java.lang.Throwable -> L20
        if (this.v5 == null) goto L12;
        this.v5.cancel();     // Catch: java.lang.Throwable -> L20
    L12:
        this.v5 = new android.widget.Toast(r11);     // Catch: java.lang.Throwable -> L20
        if ("P".equals(android.os.Build.VERSION.CODENAME) == false) goto L15;
        this.v5.setDuration(1);     // Catch: java.lang.Throwable -> L20
    L18:
        this.v5.setGravity(49, this.v5.getXOffset(), this.v5.getYOffset());     // Catch: java.lang.Throwable -> L20
        this.v5.setView(r0);     // Catch: java.lang.Throwable -> L20
        this.v5.show();     // Catch: java.lang.Throwable -> L20
        return;
    L15:
        this.v5.setDuration(0);     // Catch: java.lang.Throwable -> L20
        if (r15 <= 2) goto L18;
        new com.aide.ui.trainer.c(this, r15 * 1000, 1000).start();     // Catch: java.lang.Throwable -> L20
        goto L18
    L8:
        r3.setVisibility(8);     // Catch: java.lang.Throwable -> L20
        goto L9
    }

    @abcd.Interfacesu(method = -4494442696519281413L)
    private void j6(android.content.Context r8, boolean r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -1181747296391785084L, this, r8, new java.lang.Boolean(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1181747296391785084L, this, r8, new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.SharedPreferences.Editor r0 = r8.getSharedPreferences("RunAppController", 0).edit();     // Catch: java.lang.Throwable -> L7
        r0.putBoolean("WAS_RUN_SETTING", r9);     // Catch: java.lang.Throwable -> L7
        r0.commit();     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = -13235061828226875L)
    private void j6(android.content.Context r8, boolean r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, boolean r14) {
        if (j6 == false) goto L5;
        abcd.wu.j6(530569127130955440L, this, new java.lang.Object[]{r8, new java.lang.Boolean(r9), r10, r11, r12, new java.lang.Integer(r13), new java.lang.Boolean(r14)});
    L5:
        android.content.SharedPreferences.Editor r15 = r8.getSharedPreferences("RunAppController", 0).edit();
        r15.putBoolean("WAS_STARTED_SETTING", true);
        r15.putBoolean("IS_PLAYGROUND_SETTING", r9);
        r15.putString("TOAST_TITLE_SETTING", r10);
        r15.putString("TOAST_MESSAGE_SETTING", r11);
        r15.putString("TOAST_BUTTON_SETTING", r12);
        r15.putInt("TOAST_DURATION_SETTING", r13);
        r15.putBoolean("SOUND_ENABLED", r14);
        r15.commit();
    }

    static boolean j6(com.aide.ui.trainer.e r0, android.content.Context r1) {
        return r0.gn(r1);
    }

    @abcd.Interfacesu(method = -868530212890861839L)
    private void u7(android.content.Context r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3370410740114890440L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3370410740114890440L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        android.content.SharedPreferences.Editor r2 = r6.getSharedPreferences("RunAppController", 0).edit();     // Catch: java.lang.Throwable -> L8
        r2.putBoolean("HAS_RUN_SETTING", true);     // Catch: java.lang.Throwable -> L8
        r2.commit();     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -140775756344569689L)
    private java.lang.String v5(android.content.Context r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1954103076871647512L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1954103076871647512L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        return r6.getSharedPreferences("RunAppController", 0).getString("TOAST_MESSAGE_SETTING", "");
    }

    public void DW() {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 2395072917251341135L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2395072917251341135L, this);     // Catch: java.lang.Throwable -> L13
    L6:
        this.FH = true;     // Catch: java.lang.Throwable -> L13
        if (j6(com.aide.ui.U.Zo()) == false) goto L20;
        j6(com.aide.ui.U.Zo(), false);     // Catch: java.lang.Throwable -> L13
        if (this.v5 == null) goto L11;
        this.v5.cancel();     // Catch: java.lang.Throwable -> L13
        this.v5 = null;     // Catch: java.lang.Throwable -> L13
    L11:
        new android.os.Handler().postDelayed(new com.aide.ui.trainer.d(this), 500);     // Catch: java.lang.Throwable -> L13
        return;
    }

    public boolean DW(android.content.Context r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -199396731430747321L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-199396731430747321L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        return r6.getSharedPreferences("RunAppController", 0).getBoolean("WAS_STARTED_SETTING", false);
    }

    public boolean FH() {
    L18:
        th = move-exception;
        if (DW == false) goto L22;
        abcd.wu.j6(th, -529265911346797729L, this);
    L22:
        throw th;
    L4:
        if (j6 == false) goto L23;
        abcd.wu.j6(-529265911346797729L, this);     // Catch: java.lang.Throwable -> L18
    L23:
        android.content.Context r9 = com.aide.ui.U.Zo();     // Catch: android.provider.Settings.SettingNotFoundException -> L17 java.lang.Throwable -> L18
        if (android.provider.Settings.Secure.getInt(r9.getContentResolver(), "install_non_market_apps") != 1) goto L10;
        boolean r10 = true;
    L11:
        if (r10 == true) goto L14;
        abcd.F.j6("Exercise app was not run unknown sources: " + com.aide.ui.U.SI().J8());     // Catch: android.provider.Settings.SettingNotFoundException -> L17 java.lang.Throwable -> L18
        java.lang.String r11 = r9.getResources().getString(com.almlkaide.kaypro.R.string.trainer_on_enable_unknown_sources);     // Catch: android.provider.Settings.SettingNotFoundException -> L17 java.lang.Throwable -> L18
        j6(r9, "⚠", r11, null, 5);     // Catch: android.provider.Settings.SettingNotFoundException -> L17 java.lang.Throwable -> L18
        r9.startActivity(new android.content.Intent("android.settings.SECURITY_SETTINGS"));     // Catch: android.provider.Settings.SettingNotFoundException -> L17 java.lang.Throwable -> L18
        com.aide.ui.U.SI().DW(r11);     // Catch: android.provider.Settings.SettingNotFoundException -> L17 java.lang.Throwable -> L18
    L16:
        return r10;
    L14:
        if (VH(r9) == true) goto L16;
        java.lang.String r12 = r9.getResources().getString(com.almlkaide.kaypro.R.string.trainer_on_first_install);     // Catch: android.provider.Settings.SettingNotFoundException -> L17 java.lang.Throwable -> L18
        j6(r9, "⚠", r12, null, 5);     // Catch: android.provider.Settings.SettingNotFoundException -> L17 java.lang.Throwable -> L18
        com.aide.ui.U.SI().DW(r12);     // Catch: android.provider.Settings.SettingNotFoundException -> L17 java.lang.Throwable -> L18
        goto L16
    L10:
        r10 = false;
    L17:
        return true;
    }

    public void j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4422172288166470288L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4422172288166470288L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = false;     // Catch: java.lang.Throwable -> L8
    }

    public void j6(android.content.Context r8, long r9) {
    L19:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, 878924841870323508L, this, r8, new java.lang.Long(r9));
    L23:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(878924841870323508L, this, r8, new java.lang.Long(r9));     // Catch: java.lang.Throwable -> L19
    L6:
        if (DW(r8) == false) goto L25;
        DW(r8, false);     // Catch: java.lang.Throwable -> L19
        u7(r8);     // Catch: java.lang.Throwable -> L19
        if (this.Hw.contains(java.lang.Long.valueOf(r9)) == true) goto L26;
        this.Hw.add(java.lang.Long.valueOf(r9));     // Catch: java.lang.Throwable -> L19
        if (com.aide.ui.U.sh() == false) goto L12;
        j6(r8, true);     // Catch: java.lang.Throwable -> L19
        new android.os.Handler().postDelayed(new com.aide.ui.trainer.b(this, r8), 2000);     // Catch: java.lang.Throwable -> L19
        return;
    L12:
        abcd.F.j6("Exercise app was run: " + com.aide.ui.U.SI().J8());     // Catch: java.lang.Throwable -> L19
        if (this.FH == false) goto L15;
        com.aide.ui.U.SI().nw();     // Catch: java.lang.Throwable -> L19
        return;
    L15:
        j6(r8, true);     // Catch: java.lang.Throwable -> L19
        com.aide.ui.U.SI().er();     // Catch: java.lang.Throwable -> L19
        if (com.aide.ui.U.SI().a8() == true) goto L29;
        j6(r8, Zo(r8), v5(r8), FH(r8), Hw(r8));     // Catch: java.lang.Throwable -> L19
        return;
    L29:
        return;
    L26:
        return;
    }

    public void j6(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 267554450065614045L, this, r10, r11, r12);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(267554450065614045L, this, r10, r11, r12);     // Catch: java.lang.Throwable -> L10
    L6:
        if (r12.length() <= 0) goto L8;
        com.aide.ui.activities.AndroidTrainerActivity.j6(com.aide.ui.U.lg(), r12, com.aide.ui.U.SI().J0(), com.aide.ui.U.SI().VH().we(), com.aide.ui.U.SI().Ws(), com.aide.ui.U.SI().VH().EQ(), com.aide.ui.U.SI().a8());     // Catch: java.lang.Throwable -> L10
        return;
    L8:
        j6(com.aide.ui.U.Zo(), com.aide.ui.U.SI().a8(), com.aide.ui.U.SI().J0(), com.aide.ui.U.SI().VH().we(), com.aide.ui.U.SI().Hw(), com.aide.ui.U.SI().VH().EQ(), com.aide.ui.aa.J0());     // Catch: java.lang.Throwable -> L10
        com.aide.ui.U.J0().j6(r10, r11);     // Catch: java.lang.Throwable -> L10
    }

    public boolean j6(android.content.Context r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -375650919703520625L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-375650919703520625L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        return r6.getSharedPreferences("RunAppController", 0).getBoolean("WAS_RUN_SETTING", false);
    }
}
