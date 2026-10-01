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
            java.lang.Boolean r0 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = this.VH;
                        if (r0 != null) { $pc0 = 5; continue $sw0; }
                        return false;
                    }
                    case 5: {
                        if (r0.booleanValue() == false) { $pc0 = 10; continue $sw0; }
                        return true;
                    }
                    case 10: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public java.lang.String Zo() {
            return this.v5;
        }

        public java.lang.String j6() {
            return this.DW;
        }

        void j6(abcd.yI.a r2) {
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (this.DW != null) { $pc1 = 6; continue $sw1; }
                        this.DW = r2.DW;
                        $pc1 = 6; continue $sw1;
                    }
                    case 6: {
                        if (this.FH != 0) { $pc1 = 9; continue $sw1; }
                        this.FH = r2.FH;
                        $pc1 = 9; continue $sw1;
                    }
                    case 9: {
                        if (this.Hw != null) { $pc1 = 12; continue $sw1; }
                        this.Hw = r2.Hw;
                        $pc1 = 12; continue $sw1;
                    }
                    case 12: {
                        if (this.v5 != null) { $pc1 = 15; continue $sw1; }
                        this.v5 = r2.v5;
                        $pc1 = 15; continue $sw1;
                    }
                    case 15: {
                        if (this.Zo != null) { $pc1 = 18; continue $sw1; }
                        this.Zo = r2.Zo;
                        $pc1 = 18; continue $sw1;
                    }
                    case 18: {
                        if (this.VH != null) { $pc1 = 21; continue $sw1; }
                        this.VH = r2.VH;
                        $pc1 = 21; continue $sw1;
                    }
                    case 21: {
                        if (this.gn != null) { $pc1 = 24; continue $sw1; }
                        this.gn = r2.gn;
                        return;
                    }
                    case 24: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2.startsWith("\"") == true) { $pc2 = 5; continue $sw2; }
                    return r2;
                }
                case 5: {
                    if (r2.endsWith("\"") == true) { $pc2 = 7; continue $sw2; }
                    return r2;
                }
                case 7: {
                    return r2.substring(1, r2.length() - 1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private synchronized java.util.Map<java.lang.String, abcd.yI.a> DW() {
        long r0 = 0L;
        java.util.Map<java.lang.String, abcd.yI.a> r1 = null;
        java.io.FileInputStream r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    monitor-enter(this);
                    try {
                        r0 = this.DW.lastModified();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 18; continue $sw3;
                    }
                    if (r0 != this.FH) { $pc3 = 24; continue $sw3; }
                    $pc3 = 15; continue $sw3;
                }
                case 15: {
                    try {
                        r1 = this.Hw;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 18; continue $sw3;
                    }
                    monitor-exit(this);
                    return r1;
                }
                case 24: {
                    try {
                        r2 = new java.io.FileInputStream(this.DW);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.IOException) { $pc3 = 12; continue $sw3; }
                        if ($t instanceof java.io.FileNotFoundException) { $pc3 = 13; continue $sw3; }
                        $pc3 = 18; continue $sw3;
                    }
                    try {
                        this.Hw = j6(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 9; continue $sw3;
                    }
                    try {
                        r2.close();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.IOException) { $pc3 = 12; continue $sw3; }
                        if ($t instanceof java.io.FileNotFoundException) { $pc3 = 13; continue $sw3; }
                        $pc3 = 18; continue $sw3;
                    }
                    $pc3 = 14; continue $sw3;
                }
                case 14: {
                    try {
                        this.FH = r0;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 18; continue $sw3;
                    }
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    th = $ex3;
                    try {
                        r2.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.IOException) { $pc3 = 12; continue $sw3; }
                        if ($t instanceof java.io.FileNotFoundException) { $pc3 = 13; continue $sw3; }
                        $pc3 = 18; continue $sw3;
                    }
                }
                case 13: {
                    try {
                        this.Hw = java.util.Collections.emptyMap();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 18; continue $sw3;
                    }
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    try {
                        this.Hw = java.util.Collections.emptyMap();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 18; continue $sw3;
                    }
                    $pc3 = 18; continue $sw3;
                }
                case 18: {
                    th = $ex3;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean FH(java.lang.String r1) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r1.indexOf(42) < 0) { $pc4 = 5; continue $sw4; }
                    return true;
                }
                case 5: {
                    if (r1.indexOf(63) >= 0) { $pc4 = 10; continue $sw4; }
                    return false;
                }
                case 10: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String Hw(java.lang.String r3) {
        java.lang.StringBuilder r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r1 = 0;
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    if (r1 >= r3.length()) { $pc5 = 6; continue $sw5; }
                    if (java.lang.Character.isSpaceChar(r3.charAt(r1)) == true) { $pc5 = 10; continue $sw5; }
                    r0.append(r3.charAt(r1));
                    $pc5 = 10; continue $sw5;
                }
                case 10: {
                    r1 = r1 + 1;
                    { $pc5 = 4; continue $sw5; }
                }
                case 6: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.Boolean Zo(java.lang.String r1) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (abcd.NK.j6("yes", r1) == false) { $pc6 = 7; continue $sw6; }
                    return java.lang.Boolean.TRUE;
                }
                case 7: {
                    return java.lang.Boolean.FALSE;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.yI j6(abcd.AbstractpK r3) {
        java.io.File r4 = null;
        abcd.yI r1 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r4 = r3.Zo();
                    if (r4 != null) { $pc7 = 5; continue $sw7; }
                    r4 = new java.io.File(".").getAbsoluteFile();
                    $pc7 = 5; continue $sw7;
                }
                case 5: {
                    r1 = new abcd.yI(r4, new java.io.File(new java.io.File(r4, ".ssh"), "config"));
                    r1.DW();
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String j6() {
        return (java.lang.String) java.security.AccessController.doPrivileged(new abcd.xI());
    }

    private java.util.Map<java.lang.String, abcd.yI.a> j6(java.io.InputStream r8) {
        java.util.LinkedHashMap r0 = null;
        java.io.BufferedReader r1 = null;
        java.util.ArrayList r9 = null;
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        java.lang.String[] r4 = null;
        int r5 = 0;
        java.lang.String r6 = null;
        java.lang.String r7 = null;
        int r10 = 0;
        java.util.Iterator r11 = null;
        abcd.yI.a r12 = null;
        java.lang.String r13 = null;
        java.util.Iterator r14 = null;
        abcd.yI.a r15 = null;
        java.util.Iterator r16 = null;
        abcd.yI.a r17 = null;
        java.util.Iterator r18 = null;
        abcd.yI.a r19 = null;
        java.util.Iterator r20 = null;
        abcd.yI.a r21 = null;
        java.util.Iterator r22 = null;
        abcd.yI.a r23 = null;
        java.util.Iterator r24 = null;
        abcd.yI.a r25 = null;
        java.lang.String[] r26 = null;
        int r27 = 0;
        java.lang.String r28 = null;
        abcd.yI.a r29 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = new java.util.LinkedHashMap();
                    r1 = new java.io.BufferedReader(new java.io.InputStreamReader(r8));
                    r9 = new java.util.ArrayList(4);
                    $pc8 = 3; continue $sw8;
                }
                case 3: {
                    r2 = r1.readLine();
                    if (r2 == null) { $pc8 = 5; continue $sw8; }
                    r3 = r2.trim();
                    if (r3.length() == 0) { $pc8 = 3; continue $sw8; }
                    if (r3.startsWith("#") == true) { $pc8 = 3; continue $sw8; }
                    r4 = r3.split("[ \t]*[= \t]", 2);
                    r5 = 0;
                    r6 = r4[0].trim();
                    r7 = r4[1].trim();
                    if (abcd.NK.j6("Host", r6) == true) { $pc8 = 13; continue $sw8; }
                    if (r9.isEmpty() == true) { $pc8 = 3; continue $sw8; }
                    if (abcd.NK.j6("HostName", r6) == true) { $pc8 = 25; continue $sw8; }
                    if (abcd.NK.j6("User", r6) == true) { $pc8 = 34; continue $sw8; }
                    if (abcd.NK.j6("Port", r6) == false) { $pc8 = 53; continue $sw8; }
                    try {
                        r10 = java.lang.Integer.parseInt(DW(r7));
                        r11 = r9.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc8 = 51; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc8 = 45; continue $sw8;
                }
                case 45: {
                    if (r11.hasNext() == false) { $pc8 = 3; continue $sw8; }
                    try {
                        r12 = (abcd.yI.a) r11.next();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc8 = 51; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r12.FH != 0) { $pc8 = 45; continue $sw8; }
                    try {
                        r12.FH = r10;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc8 = 51; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc8 = 53; continue $sw8;
                }
                case 53: {
                    if (abcd.NK.j6("IdentityFile", r6) == true) { $pc8 = 54; continue $sw8; }
                    if (abcd.NK.j6("PreferredAuthentications", r6) == true) { $pc8 = 63; continue $sw8; }
                    if (abcd.NK.j6("BatchMode", r6) == true) { $pc8 = 72; continue $sw8; }
                    if (abcd.NK.j6("StrictHostKeyChecking", r6) == false) { $pc8 = 3; continue $sw8; }
                    r13 = DW(r7);
                    r14 = r9.iterator();
                    $pc8 = 83; continue $sw8;
                }
                case 83: {
                    if (r14.hasNext() == false) { $pc8 = 3; continue $sw8; }
                    r15 = (abcd.yI.a) r14.next();
                    if (r15.gn != null) { $pc8 = 83; continue $sw8; }
                    r15.gn = r13;
                    { $pc8 = 83; continue $sw8; }
                }
                case 72: {
                    r16 = r9.iterator();
                    $pc8 = 74; continue $sw8;
                }
                case 74: {
                    if (r16.hasNext() == false) { $pc8 = 3; continue $sw8; }
                    r17 = (abcd.yI.a) r16.next();
                    if (r17.VH != null) { $pc8 = 74; continue $sw8; }
                    r17.VH = Zo(DW(r7));
                    { $pc8 = 74; continue $sw8; }
                }
                case 63: {
                    r18 = r9.iterator();
                    $pc8 = 65; continue $sw8;
                }
                case 65: {
                    if (r18.hasNext() == false) { $pc8 = 3; continue $sw8; }
                    r19 = (abcd.yI.a) r18.next();
                    if (r19.Zo != null) { $pc8 = 65; continue $sw8; }
                    r19.Zo = Hw(DW(r7));
                    { $pc8 = 65; continue $sw8; }
                }
                case 54: {
                    r20 = r9.iterator();
                    $pc8 = 56; continue $sw8;
                }
                case 56: {
                    if (r20.hasNext() == false) { $pc8 = 3; continue $sw8; }
                    r21 = (abcd.yI.a) r20.next();
                    if (r21.Hw != null) { $pc8 = 56; continue $sw8; }
                    r21.Hw = v5(DW(r7));
                    { $pc8 = 56; continue $sw8; }
                }
                case 34: {
                    r22 = r9.iterator();
                    $pc8 = 36; continue $sw8;
                }
                case 36: {
                    if (r22.hasNext() == false) { $pc8 = 3; continue $sw8; }
                    r23 = (abcd.yI.a) r22.next();
                    if (r23.v5 != null) { $pc8 = 36; continue $sw8; }
                    r23.v5 = DW(r7);
                    { $pc8 = 36; continue $sw8; }
                }
                case 25: {
                    r24 = r9.iterator();
                    $pc8 = 27; continue $sw8;
                }
                case 27: {
                    if (r24.hasNext() == false) { $pc8 = 3; continue $sw8; }
                    r25 = (abcd.yI.a) r24.next();
                    if (r25.DW != null) { $pc8 = 27; continue $sw8; }
                    r25.DW = DW(r7);
                    { $pc8 = 27; continue $sw8; }
                }
                case 13: {
                    r9.clear();
                    r26 = r7.split("[ \t]");
                    r27 = r26.length;
                    $pc8 = 14; continue $sw8;
                }
                case 14: {
                    if (r5 >= r27) { $pc8 = 3; continue $sw8; }
                    r28 = DW(r26[r5]);
                    r29 = (abcd.yI.a) r0.get(r28);
                    if (r29 != null) { $pc8 = 19; continue $sw8; }
                    r29 = new abcd.yI.a();
                    r0.put(r28, r29);
                    $pc8 = 19; continue $sw8;
                }
                case 19: {
                    r9.add(r29);
                    r5 = r5 + 1;
                    { $pc8 = 14; continue $sw8; }
                }
                case 5: {
                    return r0;
                }
                case 51: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(java.lang.String r2, java.lang.String r3) {
        abcd.OD r0 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    try {
                        r0 = new abcd.OD(r2, null);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof abcd.bD) { $pc9 = 5; continue $sw9; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r0.j6(r3);
                    return r0.j6();
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.io.File v5(java.lang.String r4) {
        java.io.File r0 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (r4.startsWith("~/") == true) { $pc10 = 5; continue $sw10; }
                    r0 = new java.io.File(r4);
                    if (r0.isAbsolute() == false) { $pc10 = 10; continue $sw10; }
                    return r0;
                }
                case 10: {
                    return new java.io.File(this.j6, r4);
                }
                case 5: {
                    return new java.io.File(this.j6, r4.substring(2));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.yI.a j6(java.lang.String r5) {
        java.util.Map<java.lang.String, abcd.yI.a> r0 = null;
        abcd.yI.a r1 = null;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.yI.a>> r2 = null;
        java.util.Map.Entry<java.lang.String, abcd.yI.a> r3 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = DW();
                    r1 = r0.get(r5);
                    if (r1 != null) { $pc11 = 6; continue $sw11; }
                    r1 = new abcd.yI.a();
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    if (r1.j6 == false) { $pc11 = 8; continue $sw11; }
                    return r1;
                }
                case 8: {
                    r2 = r0.entrySet().iterator();
                    $pc11 = 10; continue $sw11;
                }
                case 10: {
                    if (r2.hasNext() == false) { $pc11 = 12; continue $sw11; }
                    r3 = r2.next();
                    if (FH(r3.getKey()) == false) { $pc11 = 10; continue $sw11; }
                    if (j6(r3.getKey(), r5) == false) { $pc11 = 10; continue $sw11; }
                    r1.j6(r3.getValue());
                    { $pc11 = 10; continue $sw11; }
                }
                case 12: {
                    if (r1.DW != null) { $pc11 = 15; continue $sw11; }
                    r1.DW = r5;
                    $pc11 = 15; continue $sw11;
                }
                case 15: {
                    if (r1.v5 != null) { $pc11 = 18; continue $sw11; }
                    r1.v5 = j6();
                    $pc11 = 18; continue $sw11;
                }
                case 18: {
                    if (r1.FH != 0) { $pc11 = 20; continue $sw11; }
                    r1.FH = 22;
                    $pc11 = 20; continue $sw11;
                }
                case 20: {
                    r1.j6 = true;
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
