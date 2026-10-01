package abcd;

@abcd.Interfacexu
public class Kj {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;

    @abcd.Interfaceru(field = -4202060075032220128L)
    private static final java.lang.String[] j6 = null;

    @abcd.Interfaceru(field = 989806457798188968L)
    private long EQ;

    @abcd.Interfaceru(field = 4433282344342142808L)
    private java.util.List<abcd.Kj.e> Hw;

    @abcd.Interfaceru(field = -4738582443023003125L)
    private int VH;

    @abcd.Interfaceru(field = 4562881294852079121L)
    private abcd.Kj.d Zo;

    @abcd.Interfaceru(field = 2903019151407850277L)
    private int gn;

    @abcd.Interfaceru(field = 742594865030139220L)
    private java.lang.String tp;

    @abcd.Interfaceru(field = 8011871614383065288L)
    private java.lang.String u7;

    @abcd.Interfaceru(field = 2804031065431800971L)
    private final java.util.concurrent.ExecutorService v5;

    @abcd.Interfacexu
    private class a implements java.util.concurrent.Callable<java.lang.Void> {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = 3082869889477183360L)
        private android.app.Activity FH;

        @abcd.Interfaceru(field = -2358735417931783149L)
        private final java.lang.String Hw;

        @abcd.Interfaceru(field = 2198247884211197952L)
        private final java.util.List<java.lang.Boolean> VH;

        @abcd.Interfaceru(field = -3600953705733070375L)
        private final java.util.List<java.lang.String> Zo;

        @abcd.Interfaceru(field = -2377537357297047651L)
        private final java.util.List<java.lang.Boolean> gn;

        @abcd.Interfacevu
        final abcd.Kj tp;

        @abcd.Interfaceru(field = -1086624133356398643L)
        private java.lang.Runnable u7;

        @abcd.Interfaceru(field = -1070877179123963525L)
        private final java.util.List<java.lang.String> v5;

        static {
            abcd.wu.j6(abcd.Kj.a.class, -3145251390647306304L, -3145251390647306304L);
        }

        @abcd.Interfacesu(method = 24453236163896040L)
        public a(abcd.Kj r6, android.app.Activity r7, java.util.List<java.lang.String> r8, java.util.List<java.lang.String> r9, java.util.List<java.lang.Boolean> r10, java.util.List<java.lang.Boolean> r11, java.lang.String r12, java.lang.Runnable r13) {
            if (j6 == false) goto L5;
            abcd.wu.j6(1974883876875097528L, null, new java.lang.Object[]{r6, r7, r8, r9, r10, r11, r12, r13});
        L5:
            this.tp = r6;
            this.v5 = r8;
            this.Zo = r9;
            this.VH = r10;
            this.gn = r11;
            this.Hw = r12;
            this.FH = r7;
            this.u7 = r13;
        }

        @abcd.Interfacesu(method = 1669136765763900083L)
        private void DW(java.lang.String r12, java.lang.String r13) {
        L47:
            th = move-exception;
            if (DW == false) goto L52;
            abcd.wu.j6(th, 6163114749508265008L, this, r12, r13);
        L52:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(6163114749508265008L, this, r12, r13);     // Catch: java.lang.Throwable -> L47
        L5:
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile(r13);     // Catch: java.lang.Throwable -> L47
            java.util.Enumeration<? extends java.util.zip.ZipEntry> r1 = r0.entries();     // Catch: java.lang.Throwable -> L44
            java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L44
        L8:
            if (r1.hasMoreElements() == false) goto L10;
            r2.add(r1.nextElement());     // Catch: java.lang.Throwable -> L44
            goto L8
        L10:
            int r3 = 0;
        L12:
            if (r3 >= r2.size()) goto L42;
            if (java.lang.Thread.interrupted() == true) goto L41;
            java.util.zip.ZipEntry r4 = (java.util.zip.ZipEntry) r2.get(r3);     // Catch: java.lang.Throwable -> L44
            java.io.File r5 = new java.io.File(r12, r4.getName());     // Catch: java.lang.Throwable -> L44
            if (r4.isDirectory() == false) goto L19;
            r5.mkdirs();     // Catch: java.lang.Throwable -> L44
        L39:
            abcd.Kj.j6(this.tp, (r3 * 100) / r2.size());     // Catch: java.lang.Throwable -> L44
            r3 = r3 + 1;     // Catch: java.lang.Throwable -> L44
            goto L12
        L19:
            if (r5.exists() == true) goto L21;
        L25:
            boolean r6 = false;
        L26:
            if (r6 == true) goto L39;
            j6(r12, r4.getName());     // Catch: java.lang.Throwable -> L44
            java.io.InputStream r7 = r0.getInputStream(r4);     // Catch: java.lang.Throwable -> L44
            java.io.FileOutputStream r8 = new java.io.FileOutputStream(r5);     // Catch: java.lang.Throwable -> L36
            com.aide.common.Xa.j6(r7, r8, false);     // Catch: java.lang.Throwable -> L33
            r8.close();     // Catch: java.lang.Throwable -> L36
            r7.close();     // Catch: java.lang.Throwable -> L44
            goto L39
        L33:
            th = move-exception;
            r8.close();     // Catch: java.lang.Throwable -> L36
            throw th;     // Catch: java.lang.Throwable -> L36
        L36:
            th = move-exception;
            r7.close();     // Catch: java.lang.Throwable -> L44
            throw th;     // Catch: java.lang.Throwable -> L44
        L21:
            if (r4.getSize() == (-1)) goto L25;
            if (r5.length() != r4.getSize()) goto L25;
            r6 = true;
            goto L26
        L41:
            throw new java.lang.InterruptedException();     // Catch: java.lang.Throwable -> L44
        L42:
            r0.close();     // Catch: java.lang.Throwable -> L47
            new java.io.File(r13).delete();     // Catch: java.lang.Throwable -> L47
            return;
        L44:
            th = move-exception;
            r0.close();     // Catch: java.lang.Throwable -> L47
            throw th;     // Catch: java.lang.Throwable -> L47
        }

        @abcd.Interfacesu(method = -84815219172732432L)
        private void FH(java.lang.String r8, java.lang.String r9) {
        L24:
            th = move-exception;
            if (DW == false) goto L29;
            abcd.wu.j6(th, 1322617374622443525L, this, r8, r9);
        L29:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(1322617374622443525L, this, r8, r9);     // Catch: java.lang.Throwable -> L24
        L5:
            java.lang.String r0 = "";
            java.lang.String[] r1 = abcd.Kj.j6();     // Catch: java.lang.Throwable -> L24
            int r2 = r1.length;     // Catch: java.lang.Throwable -> L24
            int r3 = 0;
        L6:
            if (r3 >= r2) goto L12;
            java.lang.String r4 = r1[r3];     // Catch: java.lang.Throwable -> L24
            if (r9.contains(r4) == true) goto L9;
            r3 = r3 + 1;     // Catch: java.lang.Throwable -> L24
            goto L6
        L9:
            r0 = r4;
        L12:
            if (r0.isEmpty() == false) goto L14;
            return;
        L14:
            java.util.Iterator<java.lang.String> r5 = abcd.Vl.v5(r8).iterator();     // Catch: java.lang.Throwable -> L24
        L15:
            if (r5.hasNext() == false) goto L23;
            java.lang.String r6 = r5.next();     // Catch: java.lang.Throwable -> L24
            if (r6.contains(r0) == false) goto L15;
            if (r6.contains(r9) == true) goto L15;
            abcd.Vl.FH(r6);     // Catch: java.lang.Throwable -> L24
            goto L15
        }

        static java.lang.Runnable j6(abcd.Kj.a r0) {
            return r0.u7;
        }

        @abcd.Interfacesu(method = -4271541019289853188L)
        private void j6(java.lang.String r8, java.lang.String r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -3941310768045594229L, this, r8, r9);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-3941310768045594229L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            new java.io.File(r8, r9).getParentFile().mkdirs();     // Catch: java.lang.Throwable -> L7
        }

        @Override
        public java.lang.Void call() {
            return call2();
        }

        @Override
        @abcd.Interfacesu(method = 2343864346493592160L)
        public java.lang.Void call2() {
        L9:
            th = move-exception;
            if (DW == false) goto L13;
            abcd.wu.j6(th, 2173232752141261023L, this);
        L13:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(2173232752141261023L, this);     // Catch: java.lang.Throwable -> L9
        L6:
            j6();     // Catch: java.lang.Throwable -> L9
            return null;
        }

        @abcd.Interfacesu(method = 1428980225888223099L)
        public void j6() {
        L38:
            th = move-exception;
            if (DW == false) goto L43;
            abcd.wu.j6(th, 1172204763922790700L, this);
        L43:
            throw th;
        L4:
            if (j6 == false) goto L7;
            abcd.wu.j6(1172204763922790700L, this);     // Catch: java.lang.Throwable -> L38
        L7:
            if (new java.io.File(this.Hw).isDirectory() == false) goto L9;
        L13:
            java.io.IOException e = null;
            int r2 = 0;
        L15:
            if (r2 >= this.v5.size()) goto L34;
            java.lang.String r5 = this.v5.get(r2);     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L38
            java.lang.String r6 = this.Zo.get(r2);     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L38
            boolean r8 = true;
            if (this.VH != null) goto L19;
        L21:
            boolean r7 = false;
        L23:
            if (this.gn != null) goto L25;
        L27:
            r8 = false;
        L28:
            java.io.File r10 = new java.io.File(new java.io.File(this.Hw, r6).getPath() + ".tmp");     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L38
            int r12 = r2 * 100;     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L38
            abcd.Kj.j6(this.tp, "Downloading " + r6, r12 / this.v5.size(), 0);     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L38
            abcd.Kj.j6(this.tp, r5, r10.getPath(), r7);     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L38
            if (r8 == false) goto L33;
            abcd.Kj.j6(this.tp, "Extracting " + r6, r12 / this.v5.size(), 0);     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L38
            DW(this.Hw + "/" + r6, r10.getPath());     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L38
            r10.delete();     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L38
            abcd.Kj.j6(this.tp, "Removing old libraries", r12 / this.v5.size(), 50);     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L38
            FH(this.Hw, r6);     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L38
        L33:
            r2 = r2 + 1;
            goto L15
        L25:
            if (this.gn.get(r2).booleanValue() == false) goto L27;
        L19:
            if (this.VH.get(r2).booleanValue() == false) goto L21;
            r7 = true;
        L32:
            e = e;
            goto L33
        L34:
            if (e != null) goto L37;
            com.aide.ui.U.j6(new abcd.RunnableJj(this));     // Catch: java.lang.Throwable -> L38
            return;
        L37:
            throw e;     // Catch: java.lang.Throwable -> L38
        L9:
            if (new java.io.File(this.Hw).mkdirs() == true) goto L13;
            throw new java.io.IOException("Could not create directory: " + this.Hw);     // Catch: java.lang.Throwable -> L38
        }
    }

    @abcd.Interfacexu
    private class b implements java.util.concurrent.Callable<java.lang.Void> {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = 811756249331064113L)
        private android.app.Activity FH;

        @abcd.Interfaceru(field = 2048489441362397260L)
        private java.lang.Runnable Hw;

        @abcd.Interfacevu
        final abcd.Kj VH;

        @abcd.Interfaceru(field = 4132327847824836064L)
        private java.util.List<abcd.Be.m> Zo;

        @abcd.Interfaceru(field = 896385643373546748L)
        private java.util.List<abcd.Be.g> v5;

        static {
            abcd.wu.j6(abcd.Kj.b.class, 1775716618827084105L, 1775716618827084105L);
        }

        @abcd.Interfacesu(method = 1636572046011079667L)
        public b(abcd.Kj r11, android.app.Activity r12, java.util.List<abcd.Be.g> r13, java.util.List<abcd.Be.m> r14, java.lang.Runnable r15) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 730983366186194460L, null, r11, r12, r13, r14, r15);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(730983366186194460L, null, r11, r12, r13, r14, r15);     // Catch: java.lang.Throwable -> L7
        L5:
            this.VH = r11;     // Catch: java.lang.Throwable -> L7
            this.FH = r12;     // Catch: java.lang.Throwable -> L7
            this.Hw = r15;     // Catch: java.lang.Throwable -> L7
            this.v5 = r13;     // Catch: java.lang.Throwable -> L7
            this.Zo = r14;     // Catch: java.lang.Throwable -> L7
        }

        static java.lang.Runnable j6(abcd.Kj.b r0) {
            return r0.Hw;
        }

        @Override
        public java.lang.Void call() {
            return call2();
        }

        @Override
        @abcd.Interfacesu(method = 2363662118935744157L)
        public java.lang.Void call2() {
            java.lang.String r2 = ".jar";
            java.lang.String r3 = ".aar";
            java.lang.String r4 = ".pom";
        L80:
            th = move-exception;
            if (DW == false) goto L85;
            abcd.wu.j6(th, -1470332521460336188L, this);
        L85:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1470332521460336188L, this);     // Catch: java.lang.Throwable -> L80
        L6:
            java.util.ArrayList r7 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L80
            java.util.Iterator<abcd.Be.m> r8 = this.Zo.iterator();     // Catch: java.lang.Throwable -> L80
        L8:
            if (r8.hasNext() == false) goto L12;
            abcd.Be.m r9 = r8.next();     // Catch: java.lang.Throwable -> L80
            if (r7.contains(r9) == true) goto L8;
            r7.add(r9);     // Catch: java.lang.Throwable -> L80
            goto L8
        L12:
            java.util.Iterator<abcd.Be.g> r10 = this.v5.iterator();     // Catch: java.lang.Throwable -> L80
            boolean r11 = false;
            boolean r12 = false;
            int r13 = 0;
        L14:
            if (r10.hasNext() == false) goto L77;
            abcd.Be.g r14 = r10.next();     // Catch: java.lang.Throwable -> L80
            java.util.Iterator r15 = r7.iterator();     // Catch: java.lang.Throwable -> L80
        L17:
            if (r15.hasNext() == false) goto L71;
            abcd.Be.m r16 = (abcd.Be.m) r15.next();     // Catch: java.lang.Throwable -> L80
            java.lang.String r5 = abcd.Jk.DW(r16, r14);     // Catch: java.io.IOException -> L66 java.lang.Throwable -> L80
            java.lang.String r6 = abcd.Jk.j6(r16, r14);     // Catch: java.io.IOException -> L66 java.lang.Throwable -> L80
            abcd.Kj.j6(this.VH, r5, r6, r11);     // Catch: java.io.IOException -> L66 java.lang.Throwable -> L80
            if (new java.io.File(r6).exists() == false) goto L63;
            java.lang.String r17 = ((abcd.He) new abcd.He().j6(r6)).FH(r14.tp);     // Catch: java.io.IOException -> L66 java.lang.Throwable -> L80
            if (r17 == null) goto L63;
            java.lang.String r18 = abcd.Jk.DW(r16, r14, r17, r4);     // Catch: java.io.IOException -> L66 java.lang.Throwable -> L80
            java.lang.String r19 = abcd.Jk.j6(r16, r14, r17, r4);     // Catch: java.io.IOException -> L66 java.lang.Throwable -> L80
            java.lang.String r20 = abcd.Jk.DW(r16, r14, r17, r3);     // Catch: java.io.IOException -> L66 java.lang.Throwable -> L80
            java.lang.String r110 = r4;
            java.lang.String r21 = abcd.Jk.j6(r16, r14, r17, r3);     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L80
            java.lang.String r111 = r3;
            java.lang.String r22 = abcd.Jk.DW(r16, r14, r17, r2);     // Catch: java.io.IOException -> L61 java.lang.Throwable -> L80
            java.lang.String r112 = abcd.Jk.j6(r16, r14, r17, r2);     // Catch: java.io.IOException -> L61 java.lang.Throwable -> L80
            java.lang.String r113 = r2;
            if (new java.io.File(r112).exists() == true) goto L34;
            if (new java.io.File(r21).exists() == true) goto L34;
        L35:
            abcd.Kj r23 = this.VH;     // Catch: java.io.IOException -> L92 java.lang.Throwable -> L80
            java.util.ArrayList r114 = r7;
            java.lang.StringBuilder r24 = new java.lang.StringBuilder();     // Catch: java.io.IOException -> L91 java.lang.Throwable -> L80
            java.util.Iterator<abcd.Be.g> r25 = r10;
            r24.append(r14.gn);     // Catch: java.io.IOException -> L90 java.lang.Throwable -> L80
            r24.append(":");     // Catch: java.io.IOException -> L90 java.lang.Throwable -> L80
            r24.append(r14.u7);     // Catch: java.io.IOException -> L90 java.lang.Throwable -> L80
            r24.append(":");     // Catch: java.io.IOException -> L90 java.lang.Throwable -> L80
            r24.append(r17);     // Catch: java.io.IOException -> L90 java.lang.Throwable -> L80
            java.lang.String r26 = r24.toString();     // Catch: java.io.IOException -> L90 java.lang.Throwable -> L80
            int r27 = r13 + 1;
            int r115 = r13 * 100;
            abcd.Kj.j6(r23, r26, r115 / this.v5.size(), 0);     // Catch: java.io.IOException -> L59 java.lang.Throwable -> L80
            abcd.Kj.j6(this.VH, r18, r19, true);     // Catch: java.io.IOException -> L89 java.lang.Throwable -> L80
            abcd.Kj.j6(this.VH, r20, r21, true);     // Catch: java.io.IOException -> L87 java.lang.Throwable -> L80
        L95:
            abcd.Kj.j6(this.VH, r22, r112, true);     // Catch: java.io.IOException -> L88 java.lang.Throwable -> L80
        L53:
            if (new java.io.File(r112).exists() == true) goto L57;
            if (new java.io.File(r21).exists() == false) goto L65;
        L57:
            if (new java.io.File(r19).exists() == false) goto L65;
            r13 = r27;
            r4 = r110;
            r3 = r111;
            r2 = r113;
            r7 = r114;
            r10 = r25;
            r11 = false;
            r12 = true;
        L65:
            r13 = r27;
        L70:
            r4 = r110;
            r3 = r111;
            r2 = r113;
            r7 = r114;
            r10 = r25;
            r11 = false;
        L68:
            r25 = r10;
        L34:
            if (new java.io.File(r19).exists() == false) goto L35;
        L64:
            r114 = r7;
            r25 = r10;
            r27 = r13;
        L67:
            r114 = r7;
        L61:
            r113 = r2;
        L62:
            r113 = r2;
            r111 = r3;
        L63:
            r113 = r2;
            r111 = r3;
            r110 = r4;
        L66:
            r113 = r2;
            r111 = r3;
            r110 = r4;
            goto L67
        L71:
            java.lang.String r116 = r2;
            java.lang.String r117 = r3;
            java.lang.String r118 = r4;
            java.util.ArrayList r119 = r7;
            java.util.Iterator<abcd.Be.g> r28 = r10;
            if (java.lang.Thread.interrupted() == true) goto L76;
            r4 = r118;
            r3 = r117;
            r2 = r116;
            r7 = r119;
            r10 = r28;
            r11 = false;
            goto L14
        L76:
            throw new java.lang.InterruptedException();     // Catch: java.lang.Throwable -> L80
        L77:
            com.aide.ui.U.j6(new abcd.RunnableLj(this, r12));     // Catch: java.lang.Throwable -> L80
            return null;
        }
    }

    @abcd.Interfacexu
    private class c implements java.util.concurrent.Callable<java.lang.Void> {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = 2925924587991985125L)
        private final java.io.File FH;

        @abcd.Interfaceru(field = 2031208876039285137L)
        private android.app.Activity Hw;

        @abcd.Interfacevu
        final abcd.Kj v5;

        static {
            abcd.wu.j6(abcd.Kj.c.class, -765257841527394565L, -765257841527394565L);
        }

        @abcd.Interfacesu(method = 1847457920836429425L)
        public c(abcd.Kj r9, android.app.Activity r10, java.io.File r11) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 7756105238798265680L, null, r9, r10, r11);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(7756105238798265680L, null, r9, r10, r11);     // Catch: java.lang.Throwable -> L7
        L5:
            this.v5 = r9;     // Catch: java.lang.Throwable -> L7
            this.FH = r11;     // Catch: java.lang.Throwable -> L7
            this.Hw = r10;     // Catch: java.lang.Throwable -> L7
        }

        static android.app.Activity j6(abcd.Kj.c r0) {
            return r0.Hw;
        }

        @Override
        public java.lang.Void call() {
            return call2();
        }

        @Override
        @abcd.Interfacesu(method = -1936327786269343235L)
        public java.lang.Void call2() {
        L23:
            th = move-exception;
            if (DW == false) goto L27;
            abcd.wu.j6(th, 2129064633578234068L, this);
        L27:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(2129064633578234068L, this);     // Catch: java.lang.Throwable -> L23
        L6:
            java.io.File r4 = com.aide.ui.build.android.Q.FH();     // Catch: java.lang.Throwable -> L23
            if (r4.isDirectory() == false) goto L9;
        L13:
            abcd.Kj.j6(this.v5, "Installing NDK support (might take several minutes)", 0, 0);     // Catch: java.lang.Throwable -> L23
            java.lang.String r5 = new java.io.File(r4, "busybox").getPath();     // Catch: java.lang.Throwable -> L23
            abcd.Kj.j6(this.Hw, "busybox", r5);     // Catch: java.lang.Throwable -> L23
            java.io.File r1 = new java.io.File(this.FH, "ndkinstall.sh");     // Catch: java.lang.Throwable -> L23
            abcd.Kj.j6(this.Hw, "ndkinstall.sh", r1.getPath());     // Catch: java.lang.Throwable -> L23
            abcd.Kj.j6(this.v5, r5);     // Catch: java.lang.Throwable -> L23
            java.util.List r7 = java.util.Arrays.asList(new java.lang.String[]{r5, "ash", r1.getPath(), com.aide.ui.build.android.Q.v5()});     // Catch: java.lang.Throwable -> L23
            if (java.lang.Thread.interrupted() == true) goto L22;
            abcd.InterfacePl r0 = abcd.Rl.j6(r7, r4.getPath(), null, true, null, null);     // Catch: java.lang.Throwable -> L23
            if (r0.DW() != 0) goto L20;
            r1.delete();     // Catch: java.lang.Throwable -> L23
            com.aide.ui.U.j6(new abcd.RunnableC0285Nj(this));     // Catch: java.lang.Throwable -> L23
            return null;
        L20:
            throw new java.io.IOException(abcd.Kj.j6(this.v5, r0.j6(), r0.DW()));     // Catch: java.lang.Throwable -> L23
        L22:
            throw new java.lang.InterruptedException();     // Catch: java.lang.Throwable -> L23
        L9:
            if (r4.mkdirs() == true) goto L13;
            throw new java.io.IOException("Could not create directory: " + r4.getPath());     // Catch: java.lang.Throwable -> L23
        }
    }

    @abcd.Interfacexu
    private class d extends java.util.concurrent.FutureTask<java.lang.Void> {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = 2880281372734206215L)
        private android.app.Activity FH;

        @abcd.Interfacevu
        final abcd.Kj Hw;

        static {
            abcd.wu.j6(abcd.Kj.d.class, 5884104101721941200L, 5884104101721941200L);
        }

        @abcd.Interfacesu(method = 292195037055316836L)
        public d(abcd.Kj r9, android.app.Activity r10, java.util.concurrent.Callable<java.lang.Void> r11) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -1596322257627964476L, null, r9, r10, r11);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-1596322257627964476L, null, r9, r10, r11);     // Catch: java.lang.Throwable -> L7
        L5:
            this.Hw = r9;     // Catch: java.lang.Throwable -> L7
            super(r11);     // Catch: java.lang.Throwable -> L7
            this.FH = r10;     // Catch: java.lang.Throwable -> L7
        }

        static android.app.Activity j6(abcd.Kj.d r0) {
            return r0.FH;
        }

        @Override
        @abcd.Interfacesu(method = -2305601103037444791L)
        protected void done() {
        L16:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, -1387865085839080236L, this);
        L20:
            throw th;
        L4:
            if (j6 == false) goto L7;
            abcd.wu.j6(-1387865085839080236L, this);     // Catch: java.lang.Throwable -> L16
        L7:
            if (isCancelled() == false) goto L22;
            com.aide.ui.U.j6(new abcd.RunnableRj(this));     // Catch: java.lang.Throwable -> L16
            return;
        L22:
            get();     // Catch: java.util.concurrent.ExecutionException -> L10 java.lang.InterruptedException -> L12 java.lang.Throwable -> L16
            com.aide.ui.U.j6(new abcd.RunnableOj(this));     // Catch: java.util.concurrent.ExecutionException -> L10 java.lang.InterruptedException -> L12 java.lang.Throwable -> L16
        L26:
            return;
        L12:
            e = move-exception;
            com.aide.common.ClassH.DW(e);     // Catch: java.lang.Throwable -> L16
            com.aide.ui.U.j6(new abcd.RunnableC0317Pj(this, e));     // Catch: java.lang.Throwable -> L16
            return;
        L10:
            e = move-exception;
            com.aide.common.ClassH.DW(e);     // Catch: java.lang.Throwable -> L16
            com.aide.ui.U.j6(new abcd.RunnableC0333Qj(this, e));     // Catch: java.lang.Throwable -> L16
        }
    }

    public interface e {
        void FH();

        void j6();
    }

    static {
        abcd.wu.j6(abcd.Kj.class, 144659656370786727L, 144659656370786727L);     // Catch: java.lang.Throwable -> L8
        if (DW == false) goto L6;
        abcd.wu.j6(-1734812296278077355L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new java.lang.String[]{"google_m2repository", "android_m2repository"};     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -1734812296278077355L, null);
    L12:
        throw th;
    }

    public Kj() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 3401377218976517560L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(3401377218976517560L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L8
        this.v5 = java.util.concurrent.Executors.newSingleThreadExecutor();     // Catch: java.lang.Throwable -> L8
    }

    static int DW(abcd.Kj r0, int r1) {
        r0.gn = r1;
        return r1;
    }

    static abcd.Kj.d DW(abcd.Kj r0) {
        return r0.Zo;
    }

    static java.lang.String DW(abcd.Kj r0, java.lang.String r1) {
        r0.u7 = r1;
        return r1;
    }

    @abcd.Interfacesu(method = -103294737400022979L)
    private void DW(int r10) {
    L11:
        th = move-exception;
        if (FH == false) goto L15;
        abcd.wu.j6(th, -2857012969847673951L, this, new java.lang.Integer(r10));
    L15:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-2857012969847673951L, this, r10);     // Catch: java.lang.Throwable -> L11
    L6:
        long r2 = java.lang.System.currentTimeMillis();     // Catch: java.lang.Throwable -> L11
        if ((r2 - this.EQ) >= 1000) goto L9;
        return;
    L9:
        this.EQ = r2;     // Catch: java.lang.Throwable -> L11
        com.aide.ui.U.j6(new abcd.Runnablexj(this, r10));     // Catch: java.lang.Throwable -> L11
    }

    @abcd.Interfacesu(method = 628017763248795663L)
    private void DW(android.app.Activity r8, java.lang.String r9) {
    L19:
        th = move-exception;
        if (FH == false) goto L24;
        abcd.wu.j6(th, -938275142224642797L, this, r8, r9);
    L24:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(-938275142224642797L, this, r8, r9);     // Catch: java.lang.Throwable -> L19
    L5:
        java.io.File r0 = new java.io.File(r9);     // Catch: java.lang.Throwable -> L19
        if (r0.isAbsolute() == true) goto L8;
        return;
    L8:
        if (r0 == null) goto L12;
        if (r0.exists() == true) goto L12;
        r0 = r0.getParentFile();     // Catch: java.lang.Throwable -> L19
    L12:
        if (r0 != null) goto L15;
        return;
    L15:
        if (j6(r0.getPath(), com.aide.ui.activities.Enumo.aM()) == true) goto L17;
        com.aide.common.Abstractma.j6(r8, "Download documents", "There doesn't seem to be enough space on the file system, at least" + ((com.aide.ui.activities.Enumo.aM() / 1000) / 1000) + "MB，是否继续？", new abcd.RunnableBj(this, r8, r9), null);     // Catch: java.lang.Throwable -> L19
        return;
    L17:
        FH(r8, r9);     // Catch: java.lang.Throwable -> L19
    }

    @abcd.Interfacesu(method = 5229319481629725800L)
    @android.annotation.SuppressLint({"NewApi"})
    private static void DW(android.content.Context r9, java.lang.String r10, java.lang.String r11) {
    L38:
        th = move-exception;
        if (FH == false) goto L42;
        abcd.wu.j6(th, -359937338776396056L, null, r9, r10, r11);
    L42:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(-359937338776396056L, null, r9, r10, r11);     // Catch: java.lang.Throwable -> L38
    L5:
        java.io.InputStream r0 = r9.createPackageContext("com.aide.ndk", 0).getAssets().open(r10);     // Catch: java.lang.Throwable -> L38
        java.lang.Throwable r1 = null;
        java.io.FileOutputStream r2 = new java.io.FileOutputStream(r11);     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
        com.aide.common.Xa.j6(r0, r2);     // Catch: java.lang.Throwable -> L13 java.lang.Throwable -> L15
        r2.close();     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
        if (r0 == null) goto L54;
        r0.close();     // Catch: java.lang.Throwable -> L38
        return;
    L54:
        return;
    L13:
        java.lang.Throwable th = th;
        java.lang.Throwable r4 = null;
    L19:
        if (r4 != null) goto L47;
        r2.close();     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
        throw th;     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
    L47:
        r2.close();     // Catch: java.lang.Throwable -> L22 java.lang.Throwable -> L26
        throw th;     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
    L22:
        th = move-exception;
        r4.addSuppressed(th);     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
        throw th;     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
    L15:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L17
    L17:
        th = move-exception;
        r4 = th;
        th = th;
    L28:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L26
    L26:
        th = move-exception;
        if (r0 == null) goto L37;
        if (0 != 0) goto L50;
        r0.close();     // Catch: java.lang.Throwable -> L38
        goto L37
    L50:
        r0.close();     // Catch: java.lang.Throwable -> L34
    L34:
        th = move-exception;
        r1.addSuppressed(th);     // Catch: java.lang.Throwable -> L38
    L37:
        throw th;     // Catch: java.lang.Throwable -> L38
    }

    static int FH(abcd.Kj r0, int r1) {
        r0.VH = r1;
        return r1;
    }

    static java.lang.String FH(abcd.Kj r0, java.lang.String r1) {
        r0.tp = r1;
        return r1;
    }

    static java.util.concurrent.ExecutorService FH(abcd.Kj r0) {
        return r0.v5;
    }

    @abcd.Interfacesu(method = 1347762535711949480L)
    private void FH(android.app.Activity r5) {
    L12:
        th = move-exception;
        if (FH == false) goto L16;
        abcd.wu.j6(th, 94216401131110128L, this, r5);
    L16:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(94216401131110128L, this, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (this.Zo == null) goto L10;
        com.aide.common.Abstractma.j6(r5, new abcd.C0315Ph());     // Catch: java.lang.Throwable -> L12
        return;
    L10:
        DW(r5, abcd.Vl.Zo() + "/docs");     // Catch: java.lang.Throwable -> L12
    }

    @abcd.Interfacesu(method = 1035600556512919824L)
    private void FH(android.app.Activity r12, java.lang.String r13) {
    L18:
        th = move-exception;
        if (FH == false) goto L23;
        abcd.wu.j6(th, -635227546968661536L, this, r12, r13);
    L23:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(-635227546968661536L, this, r12, r13);     // Catch: java.lang.Throwable -> L18
    L5:
        com.aide.ui.aa.Hw(r13);     // Catch: java.lang.Throwable -> L18
        if (this.Zo == null) goto L8;
        this.Zo.cancel(true);     // Catch: java.lang.Throwable -> L18
        this.Zo = null;     // Catch: java.lang.Throwable -> L18
    L8:
        java.util.ArrayList r4 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L18
        java.util.ArrayList r5 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L18
        java.util.ArrayList r6 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L18
        com.aide.ui.activities.Enumo[] r0 = com.aide.ui.activities.Enumo.Mr();     // Catch: java.lang.Throwable -> L18
        int r1 = r0.length;     // Catch: java.lang.Throwable -> L18
        int r2 = 0;
    L9:
        if (r2 >= r1) goto L16;
        com.aide.ui.activities.Enumo r3 = r0[r2];     // Catch: java.lang.Throwable -> L18
        if (r3.Zo() == null) goto L15;
        if (r4.contains(r3.VH()) == true) goto L15;
        r4.add(r3.VH());     // Catch: java.lang.Throwable -> L18
        r5.add(r3.Zo());     // Catch: java.lang.Throwable -> L18
        r6.add(java.lang.Boolean.valueOf(r3.Hw()));     // Catch: java.lang.Throwable -> L18
    L15:
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L18
        goto L9
    L16:
        this.Zo = new abcd.Kj.d(this, r12, new abcd.Kj.a(this, r12, r4, r5, r6, null, r13, new abcd.RunnableCj(this)));     // Catch: java.lang.Throwable -> L18
        this.u7 = "Installation documentation";     // Catch: java.lang.Throwable -> L18
        this.v5.execute(this.Zo);     // Catch: java.lang.Throwable -> L18
        com.aide.common.Abstractma.j6(r12, new abcd.C0315Ph());     // Catch: java.lang.Throwable -> L18
    }

    static void Hw(abcd.Kj r0) {
        r0.u7();
    }

    @abcd.Interfacesu(method = 2760131776093308360L)
    private void Hw(android.app.Activity r5) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -1149880843046871000L, this, r5);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-1149880843046871000L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        j6(r5, "Download documents", new abcd.RunnableAj(this, r5));     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 4575825327920922467L)
    private void gn() {
    L12:
        th = move-exception;
        if (FH == false) goto L17;
        abcd.wu.j6(th, 3106041240484178775L, this);
    L17:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(3106041240484178775L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        java.util.Iterator<abcd.Kj.e> r2 = this.Hw.iterator();     // Catch: java.lang.Throwable -> L12
    L7:
        if (r2.hasNext() == false) goto L11;
        r2.next().FH();     // Catch: java.lang.Throwable -> L12
        goto L7
    }

    static abcd.Kj.d j6(abcd.Kj r0, abcd.Kj.d r1) {
        r0.Zo = r1;
        return r1;
    }

    static java.lang.String j6(abcd.Kj r0, byte[] r1, int r2) {
        return r0.j6(r1, r2);
    }

    @abcd.Interfacesu(method = -7689254782209305136L)
    private java.lang.String j6(byte[] r8, int r9) {
    L12:
        th = move-exception;
        if (FH == false) goto L16;
        abcd.wu.j6(th, 4582069672216390136L, this, r8, new java.lang.Integer(r9));
    L16:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(4582069672216390136L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L12
    L5:
        java.lang.String r0 = "";
        r0 = com.aide.common.Xa.j6(new java.io.InputStreamReader(new java.io.ByteArrayInputStream(r8)));     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L12
    L7:
        java.lang.String r1 = r0.trim();     // Catch: java.lang.Throwable -> L12
        if (r1.length() == 0) goto L10;
        r1 = r1 + '\n';     // Catch: java.lang.Throwable -> L12
    L10:
        return r1 + " ### binary exited with code " + r9;
    }

    static void j6(abcd.Kj r0) {
        r0.gn();
    }

    static void j6(abcd.Kj r0, int r1) {
        r0.DW(r1);
    }

    static void j6(abcd.Kj r0, android.app.Activity r1) {
        r0.FH(r1);
    }

    static void j6(abcd.Kj r0, android.app.Activity r1, java.io.File r2) {
        r0.j6(r1, r2);
    }

    static void j6(abcd.Kj r0, android.app.Activity r1, java.lang.String r2) {
        r0.FH(r1, r2);
    }

    static void j6(abcd.Kj r0, java.lang.String r1) {
        r0.j6(r1);
    }

    static void j6(abcd.Kj r0, java.lang.String r1, int r2, int r3) {
        r0.j6(r1, r2, r3);
    }

    static void j6(abcd.Kj r0, java.lang.String r1, java.lang.String r2, boolean r3) {
        r0.j6(r1, r2, r3);
    }

    @abcd.Interfacesu(method = -3431680285534130799L)
    private void j6(android.app.Activity r8, java.io.File r9) {
    L10:
        th = move-exception;
        if (FH == false) goto L14;
        abcd.wu.j6(th, -436815280658991083L, this, r8, r9);
    L14:
        throw th;
    L3:
        if (DW == false) goto L6;
        abcd.wu.j6(-436815280658991083L, this, r8, r9);     // Catch: java.lang.Throwable -> L10
    L6:
        if (this.Zo == null) goto L8;
        this.Zo.cancel(true);     // Catch: java.lang.Throwable -> L10
        this.Zo = null;     // Catch: java.lang.Throwable -> L10
    L8:
        this.Zo = new abcd.Kj.d(this, r8, new abcd.Kj.c(this, r8, r9));     // Catch: java.lang.Throwable -> L10
        this.u7 = "Install support for native code (C / C + +)";     // Catch: java.lang.Throwable -> L10
        this.v5.execute(this.Zo);     // Catch: java.lang.Throwable -> L10
        com.aide.common.Abstractma.j6(r8, new abcd.C0315Ph());     // Catch: java.lang.Throwable -> L10
    }

    @abcd.Interfacesu(method = -490872077590993365L)
    private void j6(android.app.Activity r9, java.lang.String r10, java.lang.Runnable r11) {
    L22:
        th = move-exception;
        if (FH == false) goto L26;
        abcd.wu.j6(th, 1911670666599768663L, this, r9, r10, r11);
    L26:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(1911670666599768663L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L22
    L5:
        android.net.NetworkInfo r0 = ((android.net.ConnectivityManager) r9.getSystemService("connectivity")).getActiveNetworkInfo();     // Catch: java.lang.Throwable -> L22
        if (r0 != null) goto L8;
    L20:
        com.aide.common.Abstractma.j6(r9, r10, "There seems to be no active network connection. Do you want to continue?", r11, null);     // Catch: java.lang.Throwable -> L22
        return;
    L8:
        if (r0.isConnectedOrConnecting() == false) goto L20;
        if (r0.getType() != 1) goto L13;
    L18:
        r11.run();     // Catch: java.lang.Throwable -> L22
        return;
    L13:
        if (r0.getType() == 7) goto L18;
        if (r0.getType() == 9) goto L18;
        com.aide.common.Abstractma.j6(r9, r10, "Do you want to continue downloading via mobile Internet?", r11, null);     // Catch: java.lang.Throwable -> L22
    }

    static void j6(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
        DW(r0, r1, r2);
    }

    @abcd.Interfacesu(method = -1993651585384904421L)
    private void j6(java.lang.String r20) {
    L21:
        th = move-exception;
        if (FH == false) goto L25;
        abcd.wu.j6(th, -2514308002856759921L, this, r20);
    L25:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(-2514308002856759921L, this, r20);     // Catch: java.lang.Throwable -> L21
    L7:
        if (java.lang.Thread.interrupted() == true) goto L20;
        abcd.InterfacePl r11 = abcd.Rl.j6(java.util.Arrays.asList(new java.lang.String[]{"/system/bin/chmod", "755", r20}), null, null, true, null, null);     // Catch: java.io.IOException -> L14 java.lang.Throwable -> L21
        if (r11.DW() != 0) goto L13;
        return;
    L13:
        throw new java.io.IOException("Could not make " + r20 + " executable - exit code " + r11.DW());     // Catch: java.io.IOException -> L14 java.lang.Throwable -> L21
    L14:
        abcd.InterfacePl r4 = abcd.Rl.j6(java.util.Arrays.asList(new java.lang.String[]{"/system/xbin/chmod", "755", r20}), null, null, true, null, null);     // Catch: java.lang.Throwable -> L21
        if (r4.DW() != 0) goto L18;
        return;
    L18:
        throw new java.io.IOException("Could not make " + r20 + " executable - exit code " + r4.DW());     // Catch: java.lang.Throwable -> L21
    L20:
        throw new java.lang.InterruptedException();     // Catch: java.lang.Throwable -> L21
    }

    @abcd.Interfacesu(method = 3718113849926677885L)
    private void j6(java.lang.String r9, int r10, int r11) {
    L7:
        th = move-exception;
        if (FH == false) goto L11;
        abcd.wu.j6(th, -2508467732859247959L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
    L11:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(-2508467732859247959L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
    L5:
        this.EQ = java.lang.System.currentTimeMillis();     // Catch: java.lang.Throwable -> L7
        com.aide.ui.U.j6(new abcd.Runnableyj(this, r9, r10, r11));     // Catch: java.lang.Throwable -> L7
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    @abcd.Interfacesu(method = -3874464954827275745L)
    private void j6(java.lang.String r30, java.lang.String r31, boolean r32) {
        abcd.Kj r8 = this;
    L124:
        th = th;
    L127:
        if (FH == false) goto L130;
        abcd.wu.j6(th, 980541538863681675L, this, r30, r31, new java.lang.Boolean(r32));
    L130:
        throw th;
    L4:
        if (DW == false) goto L148;
        abcd.wu.j6(980541538863681675L, this, r30, r31, new java.lang.Boolean(r32));     // Catch: java.lang.Throwable -> L124
    L148:
        if (java.lang.Thread.interrupted() == true) goto L121;
        java.io.File r0 = new java.io.File(r31);     // Catch: java.lang.Throwable -> L124
        long r1 = 0;
        if (r32 == true) goto L11;
    L14:
        long r3 = 0;
    L15:
        int r11 = 0;
        if (r3 <= 0) goto L32;
        java.net.HttpURLConnection r14 = (java.net.HttpURLConnection) new java.net.URL(r30).openConnection();     // Catch: java.lang.Throwable -> L124
        r14.setRequestMethod("HEAD");     // Catch: java.lang.Throwable -> L29
        r14.setRequestProperty("Accept-Encoding", "identity");     // Catch: java.lang.Throwable -> L29
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> r15 = r14.getHeaderFields();     // Catch: java.lang.Throwable -> L29
        if (r8.j6(r14.getResponseCode()) == false) goto L27;
        if (r15 == null) goto L27;
        java.util.List<java.lang.String> r12 = r15.get("content-Length");     // Catch: java.lang.Throwable -> L29
        if (r12 == null) goto L27;
        if (r12.isEmpty() == true) goto L27;
        long r13 = java.lang.Long.parseLong(r12.get(0));     // Catch: java.lang.NumberFormatException -> L132 java.lang.Throwable -> L29
    L28:
        r14.disconnect();     // Catch: java.lang.Throwable -> L124
    L34:
        if (r3 != r13) goto L36;
        return;
    L36:
        java.net.HttpURLConnection r16 = (java.net.HttpURLConnection) new java.net.URL(r30).openConnection();     // Catch: java.lang.Throwable -> L124
        r16.setRequestProperty("Accept-Encoding", "identity");     // Catch: java.lang.Throwable -> L116
        if (r13 > 0) goto L40;
    L44:
        int r5 = r16.getResponseCode();     // Catch: java.lang.Throwable -> L116
    L45:
        boolean r6 = false;
    L46:
        ?? r17 = r8.j6(r5);     // Catch: java.lang.Throwable -> L116
        if (r17 != 0) goto L49;
        r17 = r16;
        java.lang.StringBuilder r2 = new java.lang.StringBuilder();     // Catch: java.lang.Throwable -> L114
        r2.append("HTTP connection to ");     // Catch: java.lang.Throwable -> L114
        r2.append(r30);     // Catch: java.lang.Throwable -> L112
        r2.append(" failed with response code ");     // Catch: java.lang.Throwable -> L112
        r2.append(r5);     // Catch: java.lang.Throwable -> L112
        throw new java.io.IOException(r2.toString());     // Catch: java.lang.Throwable -> L112
    L112:
        th = th;
    L118:
        r17.disconnect();     // Catch: java.lang.Throwable -> L122
        throw th;     // Catch: java.lang.Throwable -> L122
    L49:
        if (r13 != (-1)) goto L59;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r16.getHeaderFields();     // Catch: java.lang.Throwable -> L116
        if (r7 == null) goto L59;
        java.util.List<java.lang.String> r4 = r7.get("content-Length");     // Catch: java.lang.Throwable -> L116
        if (r4 == null) goto L59;
        if (r4.isEmpty() == true) goto L59;
        r13 = java.lang.Long.parseLong(r4.get(0));     // Catch: java.lang.NumberFormatException -> L58 java.lang.Throwable -> L116
    L58:
        r13 = -1;
    L59:
        if (r6 == true) goto L146;
        r3 = 0;
    L146:
        java.lang.System.currentTimeMillis();     // Catch: java.lang.Throwable -> L106
        if (r6 == true) goto L64;
        new java.io.File(r31).delete();     // Catch: java.lang.Throwable -> L116
    L64:
        new java.io.File(r31).getParentFile().mkdirs();     // Catch: java.lang.Throwable -> L106
        java.io.FileOutputStream r9 = new java.io.FileOutputStream(r31, r6);     // Catch: java.lang.Throwable -> L106
        byte[] r10 = new byte[32768];     // Catch: java.lang.Throwable -> L102
        long r18 = java.lang.System.currentTimeMillis();     // Catch: java.lang.Throwable -> L102
        int r19 = -1;
        long r21 = 0;
        long r110 = r18;
    L67:
        int r111 = r16.getInputStream().read(r10);     // Catch: java.lang.Throwable -> L102
        if (r111 <= 0) goto L96;
        if (java.lang.Thread.interrupted() == true) goto L93;
        r9.write(r10, r11, r111);     // Catch: java.lang.Throwable -> L102
        long r24 = r13;
        r1 = r1 + ((long) r111);     // Catch: java.lang.Throwable -> L102
        long r112 = java.lang.System.currentTimeMillis();     // Catch: java.lang.Throwable -> L102
        long r20 = r112 - r110;
        if (r20 <= 5000) goto L84;
        long r113 = r1 - r21;
        long r22 = r112 - r18;
        java.io.PrintStream r23 = java.lang.System.out;     // Catch: java.lang.Throwable -> L80
        java.lang.StringBuilder r114 = new java.lang.StringBuilder();     // Catch: java.lang.Throwable -> L80
        r114.append("Last 5 secs Average input bytes/sec: ");     // Catch: java.lang.Throwable -> L80
        double r115 = r113;
        java.lang.Double.isNaN(r115);
        double r25 = r20;
        java.lang.Double.isNaN(r25);
        r114.append((r115 * 1000.0d) / r25);     // Catch: java.lang.Throwable -> L80
        r23.println(r114.toString());     // Catch: java.lang.Throwable -> L80
        java.io.PrintStream r26 = java.lang.System.out;     // Catch: java.lang.Throwable -> L80
        java.lang.StringBuilder r27 = new java.lang.StringBuilder();     // Catch: java.lang.Throwable -> L80
        r27.append("Total Average input bytes/sec: ");     // Catch: java.lang.Throwable -> L80
        double r116 = r1;
        java.lang.Double.isNaN(r116);
        double r28 = r22;
        java.lang.Double.isNaN(r28);
        r27.append((r116 * 1000.0d) / r28);     // Catch: java.lang.Throwable -> L80
        r26.println(r27.toString());     // Catch: java.lang.Throwable -> L80
        r21 = r1;
        r110 = r112;
    L80:
        th = th;
    L104:
        r9.close();     // Catch: java.lang.Throwable -> L114
        throw th;     // Catch: java.lang.Throwable -> L114
    L84:
        if (r24 != (-1)) goto L86;
    L90:
        abcd.Kj r29 = this;
    L91:
        r8 = r29;
        r16 = r16;
        r13 = r24;
        r10 = r10;
        r11 = 0;
        goto L67
    L86:
        int r33 = (int) (((r3 + r1) * 100) / r24);
        if (r19 == r33) goto L90;
        r29 = this;
        r29.DW(r33);     // Catch: java.lang.Throwable -> L94
        r19 = r33;
    L94:
        th = th;
        goto L104
    L93:
        throw new java.lang.InterruptedException();     // Catch: java.lang.Throwable -> L94
    L96:
        java.net.HttpURLConnection r117 = r16;
        r9.close();     // Catch: java.lang.Throwable -> L114
        r117.disconnect();     // Catch: java.lang.Throwable -> L100
        return;
    L100:
        th = th;
    L102:
        th = th;
    L106:
        th = th;
        r17 = r16;
    L114:
        th = th;
        goto L118
    L40:
        if (r3 <= 0) goto L44;
        r16.setRequestProperty("Range", "bytes=" + r3 + "-");     // Catch: java.lang.Throwable -> L116
        r5 = r16.getResponseCode();     // Catch: java.lang.Throwable -> L116
        if (r5 != 206) goto L45;
        r6 = true;
    L116:
        th = th;
        r17 = r16;
        goto L118
    L27:
        r13 = -1;
    L29:
        th = move-exception;
        r14.disconnect();     // Catch: java.lang.Throwable -> L124
        throw th;     // Catch: java.lang.Throwable -> L124
    L32:
        r13 = -1;
        goto L34
    L11:
        if (r0.exists() == false) goto L14;
        r3 = r0.length();     // Catch: java.lang.Throwable -> L124
        goto L15
    L121:
        throw new java.lang.InterruptedException();     // Catch: java.lang.Throwable -> L122
    L122:
        th = th;
        goto L127
    }

    @abcd.Interfacesu(method = 62385971052779160L)
    private boolean j6(int r5) {
    L13:
        th = move-exception;
        if (FH == false) goto L17;
        abcd.wu.j6(th, 1102941307242553368L, this, new java.lang.Integer(r5));
    L17:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(1102941307242553368L, this, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if (r5 >= 200) goto L9;
    L11:
        return false;
    L9:
        if (r5 >= 300) goto L11;
        return true;
    }

    @abcd.Interfacesu(method = -5956746909814501608L)
    private boolean j6(java.lang.String r8, long r9) {
    L11:
        th = move-exception;
        if (FH == false) goto L15;
        abcd.wu.j6(th, 5421331127921477760L, this, r8, new java.lang.Long(r9));
    L15:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(5421331127921477760L, this, r8, new java.lang.Long(r9));     // Catch: java.lang.Throwable -> L11
    L5:
        android.os.StatFs r0 = new android.os.StatFs(r8);     // Catch: java.lang.Throwable -> L11
        if ((r0.getAvailableBlocks() * ((long) r0.getBlockSize())) <= r9) goto L9;
        return true;
    L9:
        return false;
    }

    static java.lang.String[] j6() {
        return j6;
    }

    @abcd.Interfacesu(method = -6429436051174786783L)
    private void u7() {
    L12:
        th = move-exception;
        if (FH == false) goto L17;
        abcd.wu.j6(th, 5745705053264358605L, this);
    L17:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(5745705053264358605L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        java.util.Iterator<abcd.Kj.e> r2 = this.Hw.iterator();     // Catch: java.lang.Throwable -> L12
    L7:
        if (r2.hasNext() == false) goto L11;
        r2.next().j6();     // Catch: java.lang.Throwable -> L12
        goto L7
    }

    @abcd.Interfacesu(method = -7154755893037973880L)
    private void v5(android.app.Activity r7) {
    L12:
        th = move-exception;
        if (FH == false) goto L16;
        abcd.wu.j6(th, 1581038918728490352L, this, r7);
    L16:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(1581038918728490352L, this, r7);     // Catch: java.lang.Throwable -> L12
    L6:
        com.aide.ui.build.android.Q.DW();     // Catch: java.lang.Throwable -> L12
        java.io.File r2 = new java.io.File(abcd.Vl.FH());     // Catch: java.lang.Throwable -> L12
        if (j6(abcd.Vl.Zo(), 750000000) == true) goto L10;
        com.aide.common.Abstractma.j6(r7, "Download support for native code (C / C + +)", "There doesn't seem to be enough space on the internal memory, which requires at least 200MB.Continue?", new abcd.Runnablewj(this, r7, r2), null);     // Catch: java.lang.Throwable -> L12
        return;
    L10:
        j6(r7, r2);     // Catch: java.lang.Throwable -> L12
    }

    public void DW() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -1028873464844655003L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-1028873464844655003L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Zo.cancel(true);     // Catch: java.lang.Throwable -> L8
    }

    public void DW(abcd.Kj.e r5) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -117280532438165727L, this, r5);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-117280532438165727L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw.remove(r5);     // Catch: java.lang.Throwable -> L8
    }

    public void DW(android.app.Activity r7) {
    L11:
        th = move-exception;
        if (FH == false) goto L15;
        abcd.wu.j6(th, 3009125045795206316L, this, r7);
    L15:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(3009125045795206316L, this, r7);     // Catch: java.lang.Throwable -> L11
    L7:
        if (com.aide.ui.build.android.Q.VH() == false) goto L9;
        com.aide.common.Abstractma.j6(r7, "Support for native code (C/C++)", "Uninstall support for native code?", new abcd.RunnableC0126Dj(this, r7), null);     // Catch: java.lang.Throwable -> L11
        return;
    L9:
        com.almlkaide.kaypro.manifesteditor.ndk.InstallNdk.a(r7);     // Catch: java.lang.Throwable -> L11
    }

    public java.lang.String FH() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -258467314333153413L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-258467314333153413L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.u7;
    }

    public int Hw() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -4719786361984446696L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-4719786361984446696L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.VH;
    }

    public boolean VH() {
    L11:
        th = move-exception;
        if (FH == false) goto L15;
        abcd.wu.j6(th, -319444074868741328L, this);
    L15:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-319444074868741328L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        if (this.Zo == null) goto L9;
        return true;
    L9:
        return false;
    }

    public java.lang.String Zo() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 889241999412804771L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(889241999412804771L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.tp;
    }

    public void j6(abcd.Kj.e r5) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -4764645981434530240L, this, r5);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-4764645981434530240L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw.add(r5);     // Catch: java.lang.Throwable -> L8
    }

    public void j6(android.app.Activity r5) {
    L10:
        th = move-exception;
        if (FH == false) goto L14;
        abcd.wu.j6(th, 216170759644784888L, this, r5);
    L14:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(216170759644784888L, this, r5);     // Catch: java.lang.Throwable -> L10
    L7:
        if (com.aide.ui.U.U2().j6(r5, "offline_docs") == false) goto L17;
        Hw(r5);     // Catch: java.lang.Throwable -> L10
        return;
    }

    public void j6(android.app.Activity r8, java.lang.String r9) {
    L20:
        th = move-exception;
        if (FH == false) goto L24;
        abcd.wu.j6(th, -2159692624017865617L, this, r8, r9);
    L24:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(-2159692624017865617L, this, r8, r9);     // Catch: java.lang.Throwable -> L20
    L5:
        int r0 = abcd.zj.j6[com.aide.ui.build.android.Q.j6(r8).ordinal()];     // Catch: java.lang.Throwable -> L20
        if (r0 != 2) goto L9;
        com.aide.common.Abstractma.j6(r8, "NDK Support package is outdated", r9 + ".\n\nThe AIDE NDK Support package is outdated. Open Play Store to update?", new abcd.RunnableC0174Gj(this), null);     // Catch: java.lang.Throwable -> L20
        return;
    L9:
        if (r0 != 3) goto L11;
        com.aide.common.Abstractma.j6(r8, "AIDE is outdated", r9 + ".\n\nYour version of AIDE is outdated and does not support the updated AIDE NDK Support package. Open Play Store to update?", new abcd.RunnableC0190Hj(this), null);     // Catch: java.lang.Throwable -> L20
        return;
    L11:
        if (r0 != 4) goto L13;
        com.aide.common.Abstractma.j6(r8, "Install support for native code (C/C++)", r9 + "The AIDE NDK Support Package has not been completely installed. Open AIDE NDK Support Package to download expansion file?", new abcd.RunnableC0205Ij(this, r8), null);     // Catch: java.lang.Throwable -> L20
        return;
    L13:
        if (r0 == 5) goto L15;
        com.aide.common.Abstractma.j6(r8, "Install support for native code (C/C++)", r9 + "After installing support for native code you can build apps using native-code languages such as C and C++. The native code support takes about 750MB of space on internal storage space once installed.\n\nDownload native code support package now?", new abcd.RunnableC0158Fj(this), null);     // Catch: java.lang.Throwable -> L20
        return;
    L15:
        v5(r8);     // Catch: java.lang.Throwable -> L20
    }

    public void j6(android.app.Activity r10, java.util.List<abcd.Be.g> r11, java.util.List<abcd.Be.m> r12, java.lang.Runnable r13) {
    L7:
        th = move-exception;
        if (FH == false) goto L11;
        abcd.wu.j6(th, -139018920714890249L, this, r10, r11, r12, r13);
    L11:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(-139018920714890249L, this, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r10, "Download Maven Library", new abcd.RunnableC0142Ej(this, r10, r11, r12, r13));     // Catch: java.lang.Throwable -> L7
    }

    public int v5() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -3945926478657840480L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-3945926478657840480L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.gn;
    }
}
