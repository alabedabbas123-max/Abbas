package abcd;

@abcd.Interfacexu
public class Sk {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacexu
    public static class a {

        @abcd.Interfacetu
        private static boolean j6;
        public java.lang.String DW;
        public java.lang.String FH;
        public java.lang.String[] Hw;
        public abcd.Sk.b VH;
        public int Zo;
        public java.lang.String v5;

        static {
            abcd.wu.j6(abcd.Sk.a.class, -6653661092914885695L, -6653661092914885695L);
        }

        public a(java.lang.String r7, abcd.Sk.b r8, int r9, java.lang.String r10, java.lang.String[] r11, java.lang.String r12) {
            if (j6 == false) goto L5;
            abcd.wu.j6(4102622381281402985L, null, new java.lang.Object[]{r7, r8, new java.lang.Integer(r9), r10, r11, r12});
        L5:
            this.DW = r7;
            this.Zo = r9;
            this.FH = r10;
            this.Hw = r11;
            this.VH = r8;
            this.v5 = r12;
        }
    }

    @abcd.Interfacexu
    public static class b {

        @abcd.Interfacetu
        private static boolean j6;
        public abcd.InterfaceUi DW;
        public int EQ;
        public java.lang.String FH;
        public java.lang.String Hw;
        public boolean VH;
        public java.lang.String Zo;
        public boolean gn;
        public boolean tp;
        public java.lang.String u7;
        public java.lang.String v5;
        public java.lang.String we;

        static {
            abcd.wu.j6(abcd.Sk.b.class, -52437224023328959L, -52437224023328959L);
        }

        public b(abcd.InterfaceUi r18, int r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23, boolean r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, boolean r28) {
            if (j6 == false) goto L5;
            abcd.wu.j6(530564291834568140L, null, new java.lang.Object[]{r18, new java.lang.Integer(r19), r20, r21, r22, new java.lang.Boolean(r23), new java.lang.Boolean(r24), r25, r26, r27, new java.lang.Boolean(r28)});
        L5:
            this.DW = r18;
            this.Zo = r22;
            this.v5 = r20;
            this.FH = r21;
            this.Hw = r25;
            this.VH = r23;
            this.gn = r24;
            this.u7 = r26;
            this.tp = r28;
            this.EQ = r19;
            this.we = r27;
        }
    }

    static {
        abcd.wu.j6(abcd.Sk.class, -510280536001576560L, -510280536001576560L);
    }

    public Sk() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -5827190512860628025L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5827190512860628025L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @abcd.Interfacesu(method = 1732506954455036683L)
    private java.util.Map<java.lang.String, java.lang.String> j6(java.io.InputStream r17, boolean r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String[] r24) {
        java.lang.String r2 = r19;
        if (j6 == false) goto L6;
        abcd.wu.j6(-578687135325702144L, this, new java.lang.Object[]{r17, new java.lang.Boolean(r18), r2, r20, r21, r22, r23, r24});
    L6:
        java.util.HashMap r8 = new java.util.HashMap();
        java.util.zip.ZipInputStream r10 = new java.util.zip.ZipInputStream(r17);
    L7:
        java.util.zip.ZipEntry r0 = r10.getNextEntry();
        if (r0 == null) goto L59;
        java.lang.String r11 = r0.getName().replace("$package_name$", r21.replace('.', java.io.File.separatorChar)).replace("$project_name$", r20).replace("$flavor_name$", r23);
        java.lang.String r9 = r2 + java.io.File.separator + r11;
        com.aide.common.ClassH.j6("Extract " + r11 + " to " + r9);
        if (r0.isDirectory() == false) goto L14;
        new java.io.File(r9).mkdirs();     // Catch: java.io.IOException -> L55
    L58:
        r2 = r19;
        goto L7
    L14:
        int r1 = r24.length;     // Catch: java.io.IOException -> L55
        int r3 = 0;
    L15:
        if (r3 >= r1) goto L20;
        java.lang.String r12 = r24[r3];     // Catch: java.io.IOException -> L55
        java.lang.StringBuilder r15 = new java.lang.StringBuilder();     // Catch: java.io.IOException -> L55
        int r110 = r1;
        r15.append("/");     // Catch: java.io.IOException -> L55
        r15.append(r12);     // Catch: java.io.IOException -> L55
        if (r9.endsWith(r15.toString()) == false) goto L19;
        r8.put(r12, r9);     // Catch: java.io.IOException -> L55
    L19:
        r3 = r3 + 1;     // Catch: java.io.IOException -> L55
        r1 = r110;
        goto L15
    L20:
        if (r18 == false) goto L22;
    L23:
        new java.io.File(r9).getParentFile().mkdirs();     // Catch: java.io.IOException -> L55
        java.lang.String r4 = r9.toLowerCase(java.util.Locale.ENGLISH);     // Catch: java.io.IOException -> L55
        if (r4.endsWith("build.gradle") == false) goto L26;
    L51:
        java.lang.String r5 = com.aide.common.Xa.j6(new java.io.BufferedReader(new java.io.InputStreamReader(r10))).replace("\r\n", "\n").replace("$project_name$", r20).replace("$package_name$", r21).replace("$package_name_jni$", r22);     // Catch: java.io.IOException -> L53
        java.io.OutputStreamWriter r13 = new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9));     // Catch: java.io.IOException -> L53
        r13.write(r5);     // Catch: java.io.IOException -> L53
        r13.close();     // Catch: java.io.IOException -> L53
        goto L58
    L26:
        if (r4.endsWith(".java") == true) goto L51;
        if (r4.endsWith(".xml") == true) goto L51;
        if (r4.endsWith(".c") == true) goto L51;
        if (r4.endsWith(".cpp") == true) goto L51;
        if (r4.endsWith(".cc") == true) goto L51;
        if (r4.endsWith(".h") == true) goto L51;
        if (r4.endsWith(".hpp") == true) goto L51;
        if (r4.endsWith(".html") == true) goto L51;
        if (r4.endsWith(".htm") == true) goto L51;
        if (r4.endsWith(".css") == true) goto L51;
        if (r4.endsWith(".js") == true) goto L51;
        java.io.FileOutputStream r6 = new java.io.FileOutputStream(r9);     // Catch: java.io.IOException -> L55
        com.aide.common.Xa.j6(r10, r6, false);     // Catch: java.io.IOException -> L53
        r6.close();     // Catch: java.io.IOException -> L53
    L53:
        e = e;
    L57:
        com.aide.common.ClassH.DW(e);
        goto L58
    L22:
        if (new java.io.File(r9).isFile() == true) goto L58;
    L55:
        e = e;
        goto L57
    L59:
        return r8;
    }

    public boolean DW(java.lang.String r5) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -1131038541868682601L, this, r5);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1131038541868682601L, this, r5);     // Catch: java.lang.Throwable -> L14
    L6:
        if (r5 != null) goto L8;
    L12:
        return false;
    L8:
        if (abcd.Vl.QX(r5) == true) goto L12;
        if (com.aide.ui.U.vy().aM(r5) == true) goto L12;
        return true;
    }

    public boolean DW(java.lang.String r8, java.lang.String r9) {
    L30:
        th = move-exception;
        if (DW == false) goto L35;
        abcd.wu.j6(th, -1096803074613189888L, this, r8, r9);
    L35:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1096803074613189888L, this, r8, r9);     // Catch: java.lang.Throwable -> L30
    L7:
        if (r9.startsWith(".") == false) goto L10;
        return false;
    L10:
        if (r9.contains(".") == true) goto L12;
        return false;
    L12:
        int r0 = 0;
    L14:
        if (r0 >= r9.length()) goto L26;
        char r1 = r9.charAt(r0);     // Catch: java.lang.Throwable -> L30
        if (r1 != '.') goto L23;
        if (r0 == (r9.length() - 1)) goto L21;
        if (r9.charAt(r0 + 1) == '.') goto L21;
    L25:
        r0 = r0 + 1;     // Catch: java.lang.Throwable -> L30
    L21:
        return false;
    L23:
        if (java.lang.Character.isJavaIdentifierPart(r1) == true) goto L25;
        return false;
    L26:
        if (r9.length() <= 0) goto L45;
        return true;
    L45:
        return false;
    }

    public java.lang.String FH(java.lang.String r2) {
        return com.almlkaide.kaypro.aide.AdvancedSetting.getPackagePrefix(r2);
    }

    public boolean FH(java.lang.String r8, java.lang.String r9) {
    L20:
        th = move-exception;
        if (DW == false) goto L25;
        abcd.wu.j6(th, 884602314080812035L, this, r8, r9);
    L25:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(884602314080812035L, this, r8, r9);     // Catch: java.lang.Throwable -> L20
    L6:
        if (r9.length() != 0) goto L8;
        return false;
    L8:
        int r0 = 0;
    L10:
        if (r0 >= r9.length()) goto L15;
        if (java.lang.Character.isJavaIdentifierPart(r9.charAt(r0)) == false) goto L13;
        r0 = r0 + 1;     // Catch: java.lang.Throwable -> L20
        goto L10
    L13:
        return false;
    L15:
        if (new java.io.File(j6(r8, r9)).exists() == false) goto L18;
        return false;
    L18:
        return true;
    }

    public java.lang.String Hw(java.lang.String r8, java.lang.String r9) {
    L14:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 1108071910755106619L, this, r8, r9);
    L19:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(1108071910755106619L, this, r8, r9);     // Catch: java.lang.Throwable -> L14
    L6:
        if (FH(r8, r9) == false) goto L8;
        return r9;
    L8:
        int r0 = 2;
    L10:
        if (FH(r8, r9 + r0) == true) goto L12;
        r0 = r0 + 1;     // Catch: java.lang.Throwable -> L14
        goto L10
    L12:
        return r9 + r0;
    }

    public java.lang.String j6(java.lang.String r8, java.lang.String r9) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -629786007677663856L, this, r8, r9);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-629786007677663856L, this, r8, r9);     // Catch: java.lang.Throwable -> L10
    L6:
        if (r9.length() != 0) goto L8;
        return r8;
    L8:
        return r8 + java.io.File.separator + r9;
    }

    public java.util.List<java.util.List<abcd.Sk.a>> j6() {
    L35:
        th = move-exception;
        if (DW == false) goto L40;
        abcd.wu.j6(th, -1376822099607405640L, this);
    L40:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1376822099607405640L, this);     // Catch: java.lang.Throwable -> L35
    L6:
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L35
        java.util.ArrayList r3 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L35
        abcd.InterfaceUi[] r4 = com.aide.ui.U.Hw();     // Catch: java.lang.Throwable -> L35
        int r5 = r4.length;     // Catch: java.lang.Throwable -> L35
        int r7 = 0;
    L7:
        if (r7 >= r5) goto L14;
        abcd.Sk.a[] r8 = r4[r7].getTemplates();     // Catch: java.lang.Throwable -> L35
        if (r8 == null) goto L13;
        int r9 = r8.length;     // Catch: java.lang.Throwable -> L35
        int r10 = 0;
    L11:
        if (r10 >= r9) goto L13;
        r3.add(r8[r10]);     // Catch: java.lang.Throwable -> L35
        r10 = r10 + 1;     // Catch: java.lang.Throwable -> L35
    L13:
        r7 = r7 + 1;     // Catch: java.lang.Throwable -> L35
        goto L7
    L14:
        java.util.Collections.sort(r3, new abcd.Rk(this));     // Catch: java.lang.Throwable -> L35
        java.util.Iterator r6 = r3.iterator();     // Catch: java.lang.Throwable -> L35
    L16:
        if (r6.hasNext() == false) goto L20;
        abcd.Sk.a r11 = (abcd.Sk.a) r6.next();     // Catch: java.lang.Throwable -> L35
        if (r11.VH.tp == false) goto L16;
        r2.add(r11);     // Catch: java.lang.Throwable -> L35
        goto L16
    L20:
        java.util.Iterator r12 = r3.iterator();     // Catch: java.lang.Throwable -> L35
    L22:
        if (r12.hasNext() == false) goto L26;
        abcd.Sk.a r13 = (abcd.Sk.a) r12.next();     // Catch: java.lang.Throwable -> L35
        if (r13.VH.tp == true) goto L22;
        r2.add(r13);     // Catch: java.lang.Throwable -> L35
        goto L22
    L26:
        java.util.ArrayList r14 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L35
        java.lang.String r15 = "";
        java.util.Iterator r16 = r2.iterator();     // Catch: java.lang.Throwable -> L35
    L27:
        if (r16.hasNext() == false) goto L34;
        abcd.Sk.a r17 = (abcd.Sk.a) r16.next();     // Catch: java.lang.Throwable -> L35
        if (r15.equals(r17.VH.v5) == true) goto L32;
        r14.add(new java.util.ArrayList());     // Catch: java.lang.Throwable -> L35
        r15 = r17.VH.v5;     // Catch: java.lang.Throwable -> L35
    L32:
        ((java.util.List) r14.get(r14.size() - 1)).add(r17);     // Catch: java.lang.Throwable -> L35
        goto L27
    L34:
        return r14;
    }

    public java.util.List<abcd.Sk.a> j6(java.lang.String r13) {
    L19:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, 199091487846819368L, this, r13);
    L24:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(199091487846819368L, this, r13);     // Catch: java.lang.Throwable -> L19
    L6:
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L19
        abcd.InterfaceUi[] r3 = com.aide.ui.U.Hw();     // Catch: java.lang.Throwable -> L19
        int r4 = r3.length;     // Catch: java.lang.Throwable -> L19
        int r6 = 0;
    L7:
        if (r6 >= r4) goto L17;
        abcd.Sk.a[] r7 = r3[r6].getTemplates();     // Catch: java.lang.Throwable -> L19
        if (r7 == null) goto L16;
        int r8 = r7.length;     // Catch: java.lang.Throwable -> L19
        int r9 = 0;
    L11:
        if (r9 >= r8) goto L16;
        abcd.Sk.a r10 = r7[r9];     // Catch: java.lang.Throwable -> L19
        if (r13.equals(r10.VH.we) == false) goto L15;
        r2.add(r10);     // Catch: java.lang.Throwable -> L19
    L15:
        r9 = r9 + 1;     // Catch: java.lang.Throwable -> L19
    L16:
        r6 = r6 + 1;     // Catch: java.lang.Throwable -> L19
        goto L7
    L17:
        java.util.Collections.sort(r2, new abcd.Qk(this));     // Catch: java.lang.Throwable -> L19
        return r2;
    }

    public java.util.List<java.lang.String> j6(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, abcd.Sk.a r24) {
    L22:
        th = th;
    L25:
        if (DW == false) goto L28;
        abcd.wu.j6(th, 1908222987627071904L, this, r20, r21, r22, r23, r24);
    L28:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1908222987627071904L, this, r20, r21, r22, r23, r24);     // Catch: java.lang.Throwable -> L22
    L6:
        abcd.F.j6("Create project " + r24.VH.u7, java.util.Collections.singletonMap("template", r24.DW));     // Catch: java.lang.Throwable -> L22
        java.lang.String r16 = r22.replace('.', '_');     // Catch: java.lang.Throwable -> L20
        java.util.ArrayList r1 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L20
        java.lang.String r0 = j6(r20, r21);     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L20
        new java.io.File(r0).mkdirs();     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L20
        java.io.InputStream r2 = com.aide.ui.U.Zo().getAssets().open("templates/" + r24.FH);     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L20
        java.util.Map<java.lang.String, java.lang.String> r3 = j6(r2, true, r0, r21, r22, r16, r23, r24.Hw);     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L20
        r2.close();     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L20
        java.lang.String[] r4 = r24.Hw;     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L20
        int r5 = r4.length;     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L20
        int r6 = 0;
    L10:
        if (r6 >= r5) goto L15;
        java.lang.String r7 = r4[r6];     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L20
        if (r3.containsKey(r7) == false) goto L14;
        r1.add(r3.get(r7));     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L20
    L14:
        r6 = r6 + 1;     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L20
        goto L10
    L15:
        com.aide.ui.U.tp().DW(r0);     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L20
    L19:
        return r1;
    L17:
        e = move-exception;
        com.aide.common.ClassH.DW(e);     // Catch: java.lang.Throwable -> L20
    L20:
        th = th;
        goto L25
    }

    public java.util.Map<java.lang.String, java.lang.String> j6(java.io.InputStream r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.util.List<java.lang.String> r15) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -106947585237952096L, this, r11, r12, r13, r14, r15);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-106947585237952096L, this, r11, r12, r13, r14, r15);     // Catch: java.lang.Throwable -> L7
    L5:
        return j6(r11, false, r12, r13, r14, r14, "", (java.lang.String[]) r15.toArray(new java.lang.String[r15.size()]));
    }
}
