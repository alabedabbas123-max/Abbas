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
        java.lang.String[] r11 = null;
        int r1 = 0;
        int r3 = 0;
        java.lang.String r4 = null;
        int r5 = 0;
        int r6 = 0;
        java.io.File r8 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r9 != null) { $pc0 = 5; continue $sw0; }
                    return null;
                }
                case 5: {
                    r11 = r9.split(java.io.File.pathSeparator);
                    r1 = r11.length;
                    r3 = 0;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r3 >= r1) { $pc0 = 7; continue $sw0; }
                    r4 = r11[r3];
                    r5 = r10.length;
                    r6 = 0;
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (r6 >= r5) { $pc0 = 10; continue $sw0; }
                    r8 = new java.io.File(r4, r10[r6]);
                    if (r8.isFile() == true) { $pc0 = 14; continue $sw0; }
                    r6 = r6 + 1;
                    { $pc0 = 9; continue $sw0; }
                }
                case 14: {
                    return r8.getAbsoluteFile();
                }
                case 10: {
                    r3 = r3 + 1;
                    { $pc0 = 6; continue $sw0; }
                }
                case 7: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.AbstractpK j6() {
        return j6(null);
    }

    public static abcd.AbstractpK j6(java.lang.Boolean r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (abcd.vK.gn() == false) { $pc1 = 13; continue $sw1; }
                    if (r1 != null) { $pc1 = 7; continue $sw1; }
                    r1 = java.lang.Boolean.valueOf(abcd.yK.u7());
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r1.booleanValue() == false) { $pc1 = 11; continue $sw1; }
                    return new abcd.yK();
                }
                case 11: {
                    return new abcd.vK();
                }
                case 13: {
                    if (abcd.tK.gn() == false) { $pc1 = 17; continue $sw1; }
                    return new abcd.tK();
                }
                case 17: {
                    return new abcd.sK();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static java.lang.String j6(java.io.File r7, java.lang.String[] r8, java.lang.String r9) {
        boolean r0 = false;
        java.lang.Process r10 = null;
        java.io.BufferedReader r11 = null;
        java.util.concurrent.atomic.AtomicBoolean r12 = null;
        abcd.oK r2 = null;
        java.lang.String r3 = null;
        java.lang.String r4 = null;
        int r13 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = java.lang.Boolean.parseBoolean(abcd.QK.FH().j6("jgit.fs.debug"));
                    if (r0 == true) { $pc2 = 40; continue $sw2; }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        r10 = java.lang.Runtime.getRuntime().exec(r8, null, r7);
                        r11 = new java.io.BufferedReader(new java.io.InputStreamReader(r10.getInputStream(), r9));
                        r10.getOutputStream().close();
                        r12 = new java.util.concurrent.atomic.AtomicBoolean(false);
                        r2 = new abcd.oK(r10, r0, r12);
                        r2.start();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 29; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r3 = r11.readLine();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 26; continue $sw2;
                    }
                    if (r0 == false) { $pc2 = 9; continue $sw2; }
                    try {
                        java.lang.System.err.println("readpipe may return '" + r3 + "'");
                        java.lang.System.err.println("(ignoring remaing output:");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 26; continue $sw2;
                    }
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    try {
                        r4 = r11.readLine();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 26; continue $sw2;
                    }
                    if (r4 == null) { $pc2 = 11; continue $sw2; }
                    if (r0 == false) { $pc2 = 9; continue $sw2; }
                    try {
                        java.lang.System.err.println(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 26; continue $sw2;
                    }
                    { $pc2 = 9; continue $sw2; }
                }
                case 11: {
                    try {
                        r10.getErrorStream().close();
                        r11.close();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 29; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 36; continue $sw2;
                }
                case 36: {
                    try {
                        r13 = r10.waitFor();
                        r2.join();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc2 = 35; continue $sw2; }
                        if ($t instanceof java.io.IOException) { $pc2 = 29; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r13 != 0) { $pc2 = 20; continue $sw2; }
                    if (r3 == null) { $pc2 = 20; continue $sw2; }
                    if (r3.length() <= 0) { $pc2 = 20; continue $sw2; }
                    if (r12.get() == true) { $pc2 = 20; continue $sw2; }
                    return r3;
                }
                case 20: {
                    if (r0 == false) { $pc2 = 32; continue $sw2; }
                    try {
                        java.lang.System.err.println("readpipe rc=" + r13);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc2 = 35; continue $sw2; }
                        if ($t instanceof java.io.IOException) { $pc2 = 29; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 32; continue $sw2;
                }
                case 32: {
                    if (r0 == false) { $pc2 = 34; continue $sw2; }
                    java.lang.System.err.println("readpipe returns null");
                    $pc2 = 34; continue $sw2;
                }
                case 34: {
                    return null;
                }
                case 26: {
                    th = $ex2;
                    try {
                        r10.getErrorStream().close();
                        r11.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 29; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 29: {
                    e = $ex2;
                    if (r0 == false) { $pc2 = 32; continue $sw2; }
                    java.lang.System.err.println(e);
                    { $pc2 = 32; continue $sw2; }
                }
                case 40: {
                    try {
                        java.lang.System.err.println("readpipe " + java.util.Arrays.asList(r8) + "," + r7);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 29; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc2 = 5; continue $sw2; }
                }
                case 35: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.AbstractpK DW(java.io.File r2) {
        this.DW = new abcd.AbstractpK.a(r2);
        return this;
    }

    protected abstract java.io.File DW();

    /* JADX WARN: Multi-variable type inference failed */
    public java.io.File FH() {
        pK.a<java.io.File> r0 = null;
        java.lang.String r1 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.FH;
                    if (r0 != null) { $pc3 = 10; continue $sw3; }
                    r1 = abcd.QK.FH().j6("jgit.gitprefix");
                    if (r1 == null) { $pc3 = 7; continue $sw3; }
                    r0 = new abcd.AbstractpK.a(new java.io.File(r1));
                    $pc3 = 8; continue $sw3;
                }
                case 8: {
                    this.FH = r0;
                    { $pc3 = 10; continue $sw3; }
                }
                case 7: {
                    r0 = new abcd.AbstractpK.a(DW());
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    return (java.io.File) r0.j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract boolean Hw();

    protected java.io.File VH() {
        java.lang.String r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = (java.lang.String) java.security.AccessController.doPrivileged(new abcd.nK(this));
                    if (r0 != null) { $pc4 = 5; continue $sw4; }
                    return null;
                }
                case 5: {
                    if (r0.length() != 0) { $pc4 = 8; continue $sw4; }
                    return null;
                }
                case 8: {
                    return new java.io.File(r0).getAbsoluteFile();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.io.File Zo() {
        abcd.AbstractpK.a r0 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.DW;
                    if (r0 != null) { $pc5 = 6; continue $sw5; }
                    r0 = new abcd.AbstractpK.a(VH());
                    this.DW = r0;
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    return (java.io.File) r0.j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.io.File j6(java.io.File r3, java.lang.String r4) {
        java.io.File r0 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = new java.io.File(r4);
                    if (r0.isAbsolute() == false) { $pc6 = 6; continue $sw6; }
                    return r0;
                }
                case 6: {
                    return new java.io.File(r3, r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract java.lang.ProcessBuilder j6(java.lang.String r1, java.lang.String[] r2);

    public abstract boolean j6(java.io.File r1);

    public abstract boolean j6(java.io.File r1, boolean r2);

    public abstract boolean v5();
}
