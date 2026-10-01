package abcd;

@abcd.Interfacexu
public class el {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.el.class, 1486310305192075776L, 1486310305192075776L);
    }

    public el() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 7539703334770653333L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(7539703334770653333L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @abcd.Interfacesu(method = -2911632786970837164L)
    private java.lang.String FH(com.aide.ui.trainer.g.j r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2786744079914630671L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2786744079914630671L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return abcd.Vl.v5() + "/Samples/" + r5.Hw();
    }

    static java.lang.String j6(abcd.el r0, com.aide.ui.trainer.g.j r1) {
        return r0.FH(r1);
    }

    static void j6(abcd.el r0, android.app.Activity r1, com.aide.ui.trainer.g.j r2, boolean r3, java.lang.Runnable r4) {
        r0.j6(r1, r2, r3, r4);
    }

    @abcd.Interfacesu(method = -1393200438706896681L)
    private void j6(android.app.Activity r10, com.aide.ui.trainer.g.j r11, boolean r12, java.lang.Runnable r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -227529794135990808L, this, r10, r11, new java.lang.Boolean(r12), r13);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-227529794135990808L, this, r10, r11, new java.lang.Boolean(r12), r13);     // Catch: java.lang.Throwable -> L7
    L5:
        com.aide.ui.U.j6(r10, "Expanding sample...", new abcd.RunnableC0661dl(this, r11, r12, r13), null);     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = -1361661233544515904L)
    private void j6(com.aide.ui.trainer.g.j r10, java.util.List<java.lang.String> r11, java.lang.String r12) {
    L53:
        th = move-exception;
        if (DW == false) goto L58;
        abcd.wu.j6(th, -87760768498570791L, this, r10, r11, r12);
    L58:
        throw th;
    L4:
        if (j6 == false) goto L61;
        abcd.wu.j6(-87760768498570791L, this, r10, r11, r12);     // Catch: java.lang.Throwable -> L53
    L61:
        java.io.InputStream r1 = com.aide.ui.U.Zo().getAssets().open(r12 + ".zip");     // Catch: java.io.IOException -> L60 java.lang.Throwable -> L53
        java.lang.String r2 = FH(r10);     // Catch: java.io.IOException -> L60 java.lang.Throwable -> L53
        java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream(r1);     // Catch: java.io.IOException -> L60 java.lang.Throwable -> L53
    L7:
        java.util.zip.ZipEntry r4 = r3.getNextEntry();     // Catch: java.io.IOException -> L60 java.lang.Throwable -> L53
        if (r4 == null) goto L51;
        java.lang.String r5 = r4.getName();     // Catch: java.io.IOException -> L60 java.lang.Throwable -> L53
        java.lang.String r6 = r12 + "/" + r10.DW().v5() + "/" + r10.Hw() + "/";     // Catch: java.io.IOException -> L60 java.lang.Throwable -> L53
        if (r5.startsWith(r6) == false) goto L7;
        java.lang.String r7 = r2 + "/" + r5.substring(r6.length(), r5.length());     // Catch: java.io.IOException -> L60 java.lang.Throwable -> L53
        com.aide.common.ClassH.j6("Extract " + r5 + " to " + r7);     // Catch: java.io.IOException -> L60 java.lang.Throwable -> L53
        java.util.Iterator<java.lang.String> r8 = r10.j6().iterator();     // Catch: java.io.IOException -> L60 java.lang.Throwable -> L53
    L13:
        if (r8.hasNext() == true) goto L15;
        if (r4.isDirectory() == true) goto L20;
        new java.io.File(r7).getParentFile().mkdirs();     // Catch: java.io.IOException -> L49 java.lang.Throwable -> L53
        java.lang.String r9 = r7.toLowerCase(java.util.Locale.ENGLISH);     // Catch: java.io.IOException -> L49 java.lang.Throwable -> L53
        if (r9.endsWith("build.gradle") == true) goto L47;
        if (r9.endsWith(".java") == true) goto L47;
        if (r9.endsWith(".xml") == true) goto L47;
        if (r9.endsWith(".c") == true) goto L47;
        if (r9.endsWith(".cpp") == true) goto L47;
        if (r9.endsWith(".cc") == true) goto L47;
        if (r9.endsWith(".h") == true) goto L47;
        if (r9.endsWith(".hpp") == true) goto L47;
        if (r9.endsWith(".html") == true) goto L47;
        if (r9.endsWith(".htm") == true) goto L47;
        if (r9.endsWith(".css") == true) goto L47;
        if (r9.endsWith(".js") == true) goto L47;
        java.io.FileOutputStream r13 = new java.io.FileOutputStream(r7);     // Catch: java.io.IOException -> L49 java.lang.Throwable -> L53
        com.aide.common.Xa.j6(r3, r13, false);     // Catch: java.io.IOException -> L49 java.lang.Throwable -> L53
        r13.close();     // Catch: java.io.IOException -> L49 java.lang.Throwable -> L53
    L47:
        java.lang.String r14 = com.aide.common.Xa.j6(new java.io.BufferedReader(new java.io.InputStreamReader(r3))).replace("\r\n", "\n");     // Catch: java.io.IOException -> L49 java.lang.Throwable -> L53
        java.io.OutputStreamWriter r15 = new java.io.OutputStreamWriter(new java.io.FileOutputStream(r7));     // Catch: java.io.IOException -> L49 java.lang.Throwable -> L53
        r15.write(r14);     // Catch: java.io.IOException -> L49 java.lang.Throwable -> L53
        r15.close();     // Catch: java.io.IOException -> L49 java.lang.Throwable -> L53
        goto L7
    L20:
        new java.io.File(r7).mkdirs();     // Catch: java.io.IOException -> L49 java.lang.Throwable -> L53
    L49:
        e = move-exception;
        com.aide.common.ClassH.DW(e);     // Catch: java.io.IOException -> L60 java.lang.Throwable -> L53
        goto L7
    L15:
        if (r7.endsWith("/" + r8.next()) == false) goto L13;
        r11.add(r7);     // Catch: java.io.IOException -> L60 java.lang.Throwable -> L53
        goto L13
    L51:
        r1.close();     // Catch: java.io.IOException -> L60 java.lang.Throwable -> L53
        return;
    }

    public boolean DW(com.aide.ui.trainer.g.j r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1674155159137567520L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1674155159137567520L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new java.io.File(FH(r5)).isDirectory();
    }

    @abcd.Interfacesu(method = 3580238858067612432L)
    protected java.util.List<java.lang.String> j6(com.aide.ui.trainer.g.j r8) {
    L11:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -35471735511811273L, this, r8);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-35471735511811273L, this, r8);     // Catch: java.lang.Throwable -> L11
    L6:
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L11
        int r5 = 0;
        java.lang.String[] r3 = {"AIDESamples", "AIDEWebSamples"};     // Catch: java.lang.Throwable -> L11
        int r4 = r3.length;     // Catch: java.lang.Throwable -> L11
    L7:
        if (r5 >= r4) goto L10;
        j6(r8, r2, r3[r5]);     // Catch: java.lang.Throwable -> L11
        r5 = r5 + 1;
        goto L7
    L10:
        return r2;
    }

    public void j6(android.app.Activity r10, com.aide.ui.trainer.g.j r11, java.lang.Runnable r12) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 5716089233789182605L, this, r10, r11, r12);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(5716089233789182605L, this, r10, r11, r12);     // Catch: java.lang.Throwable -> L10
    L6:
        if (DW(r11) == false) goto L8;
        com.aide.common.Abstractma.j6(r10, r11.gn(), r10.getResources().getString(com.almlkaide.kaypro.R.string.trainer_sample_overwrite_message), r10.getResources().getString(com.almlkaide.kaypro.R.string.trainer_sample_overwrite_overwrite), new abcd.Runnable_k(this, r10, r11, r12), r10.getResources().getString(com.almlkaide.kaypro.R.string.trainer_sample_overwrite_continue), new abcd.Runnableal(this, r10, r11, r12), null);     // Catch: java.lang.Throwable -> L10
        return;
    L8:
        com.aide.common.Abstractma.j6(r10, r11.gn(), r10.getResources().getString(com.almlkaide.kaypro.R.string.trainer_sample_mode_message), new abcd.Runnablebl(this, r10, r11, r12));     // Catch: java.lang.Throwable -> L10
    }
}
