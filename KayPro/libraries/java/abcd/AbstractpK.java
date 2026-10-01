package abcd;

public abstract class AbstractpK {
    public static final abcd.AbstractpK j6 = null;
    private volatile pK.a<java.io.File> DW;
    private volatile pK.a<java.io.File> FH;

    private static class a<V> {
        final V j6;

        a(V r1) {
            this.j6 = r1;
        }
    }

    static {
        j6 = j6();
    }

    protected AbstractpK() {
    }

    static java.io.File DW(java.lang.String r9, java.lang.String... r10) {
        if (r9 != null) goto L5;
        return null;
    L5:
        java.lang.String[] r11 = r9.split(java.io.File.pathSeparator);
        int r1 = r11.length;
        int r3 = 0;
    L6:
        if (r3 >= r1) goto L7;
        java.lang.String r4 = r11[r3];
        int r5 = r10.length;
        int r6 = 0;
    L9:
        if (r6 >= r5) goto L10;
        java.io.File r8 = new java.io.File(r4, r10[r6]);
        if (r8.isFile() == true) goto L14;
        r6 = r6 + 1;
        goto L9
    L14:
        return r8.getAbsoluteFile();
    L10:
        r3 = r3 + 1;
        goto L6
    L7:
        return null;
    }

    public static abcd.AbstractpK j6() {
        return j6(null);
    }

    public static abcd.AbstractpK j6(java.lang.Boolean r1) {
        if (abcd.vK.gn() == false) goto L13;
        if (r1 != null) goto L7;
        r1 = java.lang.Boolean.valueOf(abcd.yK.u7());
    L7:
        if (r1.booleanValue() == false) goto L11;
        return new abcd.yK();
    L11:
        return new abcd.vK();
    L13:
        if (abcd.tK.gn() == false) goto L17;
        return new abcd.tK();
    L17:
        return new abcd.sK();
    }

    protected static java.lang.String j6(java.io.File r7, java.lang.String[] r8, java.lang.String r9) {
        boolean r0 = java.lang.Boolean.parseBoolean(abcd.QK.FH().j6("jgit.fs.debug"));
        if (r0 == true) goto L40;
    L5:
        java.lang.Process r10 = java.lang.Runtime.getRuntime().exec(r8, null, r7);     // Catch: java.io.IOException -> L29
        java.io.BufferedReader r11 = new java.io.BufferedReader(new java.io.InputStreamReader(r10.getInputStream(), r9));     // Catch: java.io.IOException -> L29
        r10.getOutputStream().close();     // Catch: java.io.IOException -> L29
        java.util.concurrent.atomic.AtomicBoolean r12 = new java.util.concurrent.atomic.AtomicBoolean(false);     // Catch: java.io.IOException -> L29
        abcd.oK r2 = new abcd.oK(r10, r0, r12);     // Catch: java.io.IOException -> L29
        r2.start();     // Catch: java.io.IOException -> L29
        java.lang.String r3 = r11.readLine();     // Catch: java.lang.Throwable -> L26
        if (r0 == false) goto L9;
        java.lang.System.err.println("readpipe may return '" + r3 + "'");     // Catch: java.lang.Throwable -> L26
        java.lang.System.err.println("(ignoring remaing output:");     // Catch: java.lang.Throwable -> L26
    L9:
        java.lang.String r4 = r11.readLine();     // Catch: java.lang.Throwable -> L26
        if (r4 == null) goto L11;
        if (r0 == false) goto L9;
        java.lang.System.err.println(r4);     // Catch: java.lang.Throwable -> L26
        goto L9
    L11:
        r10.getErrorStream().close();     // Catch: java.io.IOException -> L29
        r11.close();     // Catch: java.io.IOException -> L29
    L36:
        int r13 = r10.waitFor();     // Catch: java.lang.InterruptedException -> L35 java.io.IOException -> L29
        r2.join();     // Catch: java.lang.InterruptedException -> L35 java.io.IOException -> L29
        if (r13 != 0) goto L20;
        if (r3 == null) goto L20;
        if (r3.length() <= 0) goto L20;
        if (r12.get() == true) goto L20;
        return r3;
    L20:
        if (r0 == false) goto L32;
        java.lang.System.err.println("readpipe rc=" + r13);     // Catch: java.lang.InterruptedException -> L35 java.io.IOException -> L29
    L32:
        if (r0 == false) goto L34;
        java.lang.System.err.println("readpipe returns null");
    L34:
        return null;
    L26:
        th = move-exception;
        r10.getErrorStream().close();     // Catch: java.io.IOException -> L29
        r11.close();     // Catch: java.io.IOException -> L29
        throw th;     // Catch: java.io.IOException -> L29
    L29:
        e = move-exception;
        if (r0 == false) goto L32;
        java.lang.System.err.println(e);
        goto L32
    L40:
        java.lang.System.err.println("readpipe " + java.util.Arrays.asList(r8) + "," + r7);     // Catch: java.io.IOException -> L29
        goto L5
    }

    public abcd.AbstractpK DW(java.io.File r2) {
        this.DW = new abcd.AbstractpK.a(r2);
        return this;
    }

    protected abstract java.io.File DW();

    /* JADX WARN: Multi-variable type inference failed */
    public java.io.File FH() {
        pK.a<java.io.File> r0 = this.FH;
        if (r0 != null) goto L10;
        java.lang.String r1 = abcd.QK.FH().j6("jgit.gitprefix");
        if (r1 == null) goto L7;
        r0 = new abcd.AbstractpK.a(new java.io.File(r1));
    L8:
        this.FH = r0;
        goto L10
    L7:
        r0 = new abcd.AbstractpK.a(DW());
    L10:
        return (java.io.File) r0.j6;
    }

    public abstract boolean Hw();

    protected java.io.File VH() {
        java.lang.String r0 = (java.lang.String) java.security.AccessController.doPrivileged(new abcd.nK(this));
        if (r0 != null) goto L5;
        return null;
    L5:
        if (r0.length() != 0) goto L8;
        return null;
    L8:
        return new java.io.File(r0).getAbsoluteFile();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.io.File Zo() {
        abcd.AbstractpK.a r0 = this.DW;
        if (r0 != null) goto L6;
        r0 = new abcd.AbstractpK.a(VH());
        this.DW = r0;
    L6:
        return (java.io.File) r0.j6;
    }

    public java.io.File j6(java.io.File r3, java.lang.String r4) {
        java.io.File r0 = new java.io.File(r4);
        if (r0.isAbsolute() == false) goto L6;
        return r0;
    L6:
        return new java.io.File(r3, r4);
    }

    public abstract java.lang.ProcessBuilder j6(java.lang.String r1, java.lang.String[] r2);

    public abstract boolean j6(java.io.File r1);

    public abstract boolean j6(java.io.File r1, boolean r2);

    public abstract boolean v5();
}
