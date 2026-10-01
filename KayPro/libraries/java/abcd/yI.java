package abcd;

public class yI {
    private final java.io.File DW;
    private long FH;
    private java.util.Map<java.lang.String, abcd.yI.a> Hw;
    private final java.io.File j6;

    public static class a {
        java.lang.String DW;
        int FH;
        java.io.File Hw;
        java.lang.Boolean VH;
        java.lang.String Zo;
        java.lang.String gn;
        boolean j6;
        java.lang.String v5;

        public a() {
        }

        public java.io.File DW() {
            return this.Hw;
        }

        public int FH() {
            return this.FH;
        }

        public java.lang.String Hw() {
            return this.Zo;
        }

        public boolean VH() {
            java.lang.Boolean r0 = this.VH;
            if (r0 != null) goto L5;
            return false;
        L5:
            if (r0.booleanValue() == false) goto L10;
            return true;
        L10:
            return false;
        }

        public java.lang.String Zo() {
            return this.v5;
        }

        public java.lang.String j6() {
            return this.DW;
        }

        void j6(abcd.yI.a r2) {
            if (this.DW != null) goto L6;
            this.DW = r2.DW;
        L6:
            if (this.FH != 0) goto L9;
            this.FH = r2.FH;
        L9:
            if (this.Hw != null) goto L12;
            this.Hw = r2.Hw;
        L12:
            if (this.v5 != null) goto L15;
            this.v5 = r2.v5;
        L15:
            if (this.Zo != null) goto L18;
            this.Zo = r2.Zo;
        L18:
            if (this.VH != null) goto L21;
            this.VH = r2.VH;
        L21:
            if (this.gn != null) goto L24;
            this.gn = r2.gn;
            return;
        }

        public java.lang.String v5() {
            return this.gn;
        }
    }

    yI(java.io.File r1, java.io.File r2) {
        this.j6 = r1;
        this.DW = r2;
        this.Hw = java.util.Collections.emptyMap();
    }

    private static java.lang.String DW(java.lang.String r2) {
        if (r2.startsWith("\"") == true) goto L5;
        return r2;
    L5:
        if (r2.endsWith("\"") == true) goto L7;
        return r2;
    L7:
        return r2.substring(1, r2.length() - 1);
    }

    private synchronized java.util.Map<java.lang.String, abcd.yI.a> DW() {
        monitor-enter(this);
        long r0 = this.DW.lastModified();     // Catch: java.lang.Throwable -> L18
        if (r0 != this.FH) goto L24;
    L15:
        java.util.Map<java.lang.String, abcd.yI.a> r1 = this.Hw;     // Catch: java.lang.Throwable -> L18
        monitor-exit(this);
        return r1;
    L24:
        java.io.FileInputStream r2 = new java.io.FileInputStream(this.DW);     // Catch: java.io.IOException -> L12 java.io.FileNotFoundException -> L13 java.lang.Throwable -> L18
        this.Hw = j6(r2);     // Catch: java.lang.Throwable -> L9
        r2.close();     // Catch: java.io.IOException -> L12 java.io.FileNotFoundException -> L13 java.lang.Throwable -> L18
    L14:
        this.FH = r0;     // Catch: java.lang.Throwable -> L18
    L9:
        th = move-exception;
        r2.close();     // Catch: java.io.IOException -> L12 java.io.FileNotFoundException -> L13 java.lang.Throwable -> L18
        throw th;     // Catch: java.io.IOException -> L12 java.io.FileNotFoundException -> L13 java.lang.Throwable -> L18
    L13:
        this.Hw = java.util.Collections.emptyMap();     // Catch: java.lang.Throwable -> L18
    L12:
        this.Hw = java.util.Collections.emptyMap();     // Catch: java.lang.Throwable -> L18
    L18:
        th = move-exception;
        throw th;
    }

    private static boolean FH(java.lang.String r1) {
        if (r1.indexOf(42) < 0) goto L5;
        return true;
    L5:
        if (r1.indexOf(63) >= 0) goto L10;
        return false;
    L10:
        return true;
    }

    private static java.lang.String Hw(java.lang.String r3) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        int r1 = 0;
    L4:
        if (r1 >= r3.length()) goto L6;
        if (java.lang.Character.isSpaceChar(r3.charAt(r1)) == true) goto L10;
        r0.append(r3.charAt(r1));
    L10:
        r1 = r1 + 1;
        goto L4
    L6:
        return r0.toString();
    }

    private static java.lang.Boolean Zo(java.lang.String r1) {
        if (abcd.NK.j6("yes", r1) == false) goto L7;
        return java.lang.Boolean.TRUE;
    L7:
        return java.lang.Boolean.FALSE;
    }

    public static abcd.yI j6(abcd.AbstractpK r3) {
        java.io.File r4 = r3.Zo();
        if (r4 != null) goto L5;
        r4 = new java.io.File(".").getAbsoluteFile();
    L5:
        abcd.yI r1 = new abcd.yI(r4, new java.io.File(new java.io.File(r4, ".ssh"), "config"));
        r1.DW();
        return r1;
    }

    static java.lang.String j6() {
        return (java.lang.String) java.security.AccessController.doPrivileged(new abcd.xI());
    }

    private java.util.Map<java.lang.String, abcd.yI.a> j6(java.io.InputStream r8) {
        java.util.LinkedHashMap r0 = new java.util.LinkedHashMap();
        java.io.BufferedReader r1 = new java.io.BufferedReader(new java.io.InputStreamReader(r8));
        java.util.ArrayList r9 = new java.util.ArrayList(4);
    L3:
        java.lang.String r2 = r1.readLine();
        if (r2 == null) goto L5;
        java.lang.String r3 = r2.trim();
        if (r3.length() == 0) goto L3;
        if (r3.startsWith("#") == true) goto L3;
        java.lang.String[] r4 = r3.split("[ \t]*[= \t]", 2);
        int r5 = 0;
        java.lang.String r6 = r4[0].trim();
        java.lang.String r7 = r4[1].trim();
        if (abcd.NK.j6("Host", r6) == true) goto L13;
        if (r9.isEmpty() == true) goto L3;
        if (abcd.NK.j6("HostName", r6) == true) goto L25;
        if (abcd.NK.j6("User", r6) == true) goto L34;
        if (abcd.NK.j6("Port", r6) == false) goto L53;
        int r10 = java.lang.Integer.parseInt(DW(r7));     // Catch: java.lang.NumberFormatException -> L51
        java.util.Iterator r11 = r9.iterator();     // Catch: java.lang.NumberFormatException -> L51
    L45:
        if (r11.hasNext() == false) goto L3;
        abcd.yI.a r12 = (abcd.yI.a) r11.next();     // Catch: java.lang.NumberFormatException -> L51
        if (r12.FH != 0) goto L45;
        r12.FH = r10;     // Catch: java.lang.NumberFormatException -> L51
    L53:
        if (abcd.NK.j6("IdentityFile", r6) == true) goto L54;
        if (abcd.NK.j6("PreferredAuthentications", r6) == true) goto L63;
        if (abcd.NK.j6("BatchMode", r6) == true) goto L72;
        if (abcd.NK.j6("StrictHostKeyChecking", r6) == false) goto L3;
        java.lang.String r13 = DW(r7);
        java.util.Iterator r14 = r9.iterator();
    L83:
        if (r14.hasNext() == false) goto L3;
        abcd.yI.a r15 = (abcd.yI.a) r14.next();
        if (r15.gn != null) goto L83;
        r15.gn = r13;
        goto L83
    L72:
        java.util.Iterator r16 = r9.iterator();
    L74:
        if (r16.hasNext() == false) goto L3;
        abcd.yI.a r17 = (abcd.yI.a) r16.next();
        if (r17.VH != null) goto L74;
        r17.VH = Zo(DW(r7));
        goto L74
    L63:
        java.util.Iterator r18 = r9.iterator();
    L65:
        if (r18.hasNext() == false) goto L3;
        abcd.yI.a r19 = (abcd.yI.a) r18.next();
        if (r19.Zo != null) goto L65;
        r19.Zo = Hw(DW(r7));
        goto L65
    L54:
        java.util.Iterator r20 = r9.iterator();
    L56:
        if (r20.hasNext() == false) goto L3;
        abcd.yI.a r21 = (abcd.yI.a) r20.next();
        if (r21.Hw != null) goto L56;
        r21.Hw = v5(DW(r7));
        goto L56
    L34:
        java.util.Iterator r22 = r9.iterator();
    L36:
        if (r22.hasNext() == false) goto L3;
        abcd.yI.a r23 = (abcd.yI.a) r22.next();
        if (r23.v5 != null) goto L36;
        r23.v5 = DW(r7);
        goto L36
    L25:
        java.util.Iterator r24 = r9.iterator();
    L27:
        if (r24.hasNext() == false) goto L3;
        abcd.yI.a r25 = (abcd.yI.a) r24.next();
        if (r25.DW != null) goto L27;
        r25.DW = DW(r7);
        goto L27
    L13:
        r9.clear();
        java.lang.String[] r26 = r7.split("[ \t]");
        int r27 = r26.length;
    L14:
        if (r5 >= r27) goto L3;
        java.lang.String r28 = DW(r26[r5]);
        abcd.yI.a r29 = (abcd.yI.a) r0.get(r28);
        if (r29 != null) goto L19;
        r29 = new abcd.yI.a();
        r0.put(r28, r29);
    L19:
        r9.add(r29);
        r5 = r5 + 1;
        goto L14
    L5:
        return r0;
    }

    private static boolean j6(java.lang.String r2, java.lang.String r3) {
        abcd.OD r0 = new abcd.OD(r2, null);     // Catch: abcd.bD -> L5
        r0.j6(r3);
        return r0.j6();
    L5:
        return false;
    }

    private java.io.File v5(java.lang.String r4) {
        if (r4.startsWith("~/") == true) goto L5;
        java.io.File r0 = new java.io.File(r4);
        if (r0.isAbsolute() == false) goto L10;
        return r0;
    L10:
        return new java.io.File(this.j6, r4);
    L5:
        return new java.io.File(this.j6, r4.substring(2));
    }

    public abcd.yI.a j6(java.lang.String r5) {
        java.util.Map<java.lang.String, abcd.yI.a> r0 = DW();
        abcd.yI.a r1 = r0.get(r5);
        if (r1 != null) goto L6;
        r1 = new abcd.yI.a();
    L6:
        if (r1.j6 == false) goto L8;
        return r1;
    L8:
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.yI.a>> r2 = r0.entrySet().iterator();
    L10:
        if (r2.hasNext() == false) goto L12;
        java.util.Map.Entry<java.lang.String, abcd.yI.a> r3 = r2.next();
        if (FH(r3.getKey()) == false) goto L10;
        if (j6(r3.getKey(), r5) == false) goto L10;
        r1.j6(r3.getValue());
        goto L10
    L12:
        if (r1.DW != null) goto L15;
        r1.DW = r5;
    L15:
        if (r1.v5 != null) goto L18;
        r1.v5 = j6();
    L18:
        if (r1.FH != 0) goto L20;
        r1.FH = 22;
    L20:
        r1.j6 = true;
        return r1;
    }
}
