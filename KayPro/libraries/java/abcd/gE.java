package abcd;

public class gE {
    private static final java.lang.String DW = null;
    private static final java.lang.String[] j6 = null;
    private final abcd.HD FH;
    private final java.util.concurrent.atomic.AtomicReference<abcd.gE.c> Hw;
    private final abcd.gE v5;

    private static class a {
        java.lang.String DW;
        java.lang.String FH;
        java.lang.String Hw;
        java.lang.String Zo;
        java.lang.String j6;
        java.lang.String v5;

        private a() {
        }

        a(abcd.gE.a r1) {
            this();
        }

        private static boolean DW(java.lang.String r0, java.lang.String r1) {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (r0 != null) { $pc0 = 6; continue $sw0; }
                        if (r1 != null) { $pc0 = 6; continue $sw0; }
                        return true;
                    }
                    case 6: {
                        if (r0 == null) { $pc0 = 11; continue $sw0; }
                        if (r1 != null) { $pc0 = 10; continue $sw0; }
                        return false;
                    }
                    case 10: {
                        return abcd.NK.j6(r0, r1);
                    }
                    case 11: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private static boolean FH(java.lang.String r0, java.lang.String r1) {
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (r0 != null) { $pc1 = 6; continue $sw1; }
                        if (r1 != null) { $pc1 = 6; continue $sw1; }
                        return true;
                    }
                    case 6: {
                        if (r0 == null) { $pc1 = 11; continue $sw1; }
                        if (r1 != null) { $pc1 = 10; continue $sw1; }
                        return false;
                    }
                    case 10: {
                        return r0.equals(r1);
                    }
                    case 11: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        abcd.gE.a j6(java.lang.String r3) {
            abcd.gE.a r0 = new abcd.gE.a();
            r0.j6 = this.j6;
            r0.DW = this.DW;
            r0.FH = this.FH;
            r0.Hw = this.Hw;
            r0.v5 = r3;
            r0.Zo = this.Zo;
            return r0;
        }

        boolean j6(java.lang.String r2, java.lang.String r3) {
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        if (DW(this.DW, r2) == true) { $pc2 = 5; continue $sw2; }
                        return false;
                    }
                    case 5: {
                        if (FH(this.FH, r3) == false) { $pc2 = 10; continue $sw2; }
                        return true;
                    }
                    case 10: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        boolean j6(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        if (DW(this.DW, r2) == true) { $pc3 = 5; continue $sw3; }
                        return false;
                    }
                    case 5: {
                        if (FH(this.FH, r3) == true) { $pc3 = 7; continue $sw3; }
                        return false;
                    }
                    case 7: {
                        if (DW(this.Hw, r4) == false) { $pc3 = 13; continue $sw3; }
                        return true;
                    }
                    case 13: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public java.lang.String toString() {
            java.lang.String r0 = null;
            java.lang.StringBuilder r1 = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        r0 = this.DW;
                        if (r0 != null) { $pc4 = 6; continue $sw4; }
                        return "<empty>";
                    }
                    case 6: {
                        r1 = new java.lang.StringBuilder(r0);
                        if (this.FH == null) { $pc4 = 10; continue $sw4; }
                        r1.append(".");
                        r1.append(this.FH);
                        $pc4 = 10; continue $sw4;
                    }
                    case 10: {
                        if (this.Hw == null) { $pc4 = 13; continue $sw4; }
                        r1.append(".");
                        r1.append(this.Hw);
                        $pc4 = 13; continue $sw4;
                    }
                    case 13: {
                        if (this.v5 == null) { $pc4 = 16; continue $sw4; }
                        r1.append("=");
                        r1.append(this.v5);
                        $pc4 = 16; continue $sw4;
                    }
                    case 16: {
                        return r1.toString();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public interface b<T> {
        T j6(abcd.gE r1);
    }

    private static class c {
        final java.util.Map<java.lang.Object, java.lang.Object> DW;
        final abcd.gE.c FH;
        final java.util.List<abcd.gE.a> j6;

        c(java.util.List<abcd.gE.a> r4, abcd.gE.c r5) {
            this.j6 = r4;
            this.DW = new java.util.concurrent.ConcurrentHashMap(16, 0.75f, 1);
            this.FH = r5;
        }
    }

    private static class d {
        private int DW;
        private final char[] j6;

        d(java.lang.String r1) {
            this.j6 = r1.toCharArray();
        }

        void DW() {
            this.DW--;
        }

        int j6() {
            char[] r0 = null;
            int r1 = 0;
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        try {
                            r0 = this.j6;
                            r1 = this.DW;
                            this.DW = r1 + 1;
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc5 = 4; continue $sw5; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        return r0[r1];
                    }
                    case 4: {
                        this.DW = this.j6.length;
                        return -1;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        j6 = new java.lang.String[0];
        DW = new java.lang.String();
    }

    public gE() {
        this(null);
    }

    public gE(abcd.gE r2) {
        this.FH = new abcd.HD();
        this.v5 = r2;
        this.Hw = new java.util.concurrent.atomic.AtomicReference(VH());
    }

    private static java.lang.String DW(abcd.gE.d r7) {
        java.lang.StringBuilder r0 = null;
        int r1 = 0;
        char r4 = 0;
        int r2 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    $pc6 = 3; continue $sw6;
                }
                case 3: {
                    r1 = r7.j6();
                    if (r1 < 0) { $pc6 = 37; continue $sw6; }
                    if (93 == r1) { $pc6 = 7; continue $sw6; }
                    if (32 == r1) { $pc6 = 22; continue $sw6; }
                    if (9 == r1) { $pc6 = 22; continue $sw6; }
                    r4 = (char) r1;
                    if (java.lang.Character.isLetterOrDigit(r4) == true) { $pc6 = 21; continue $sw6; }
                    if (46 == r1) { $pc6 = 21; continue $sw6; }
                    if (45 == r1) { $pc6 = 21; continue $sw6; }
                    throw new abcd.XC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().badSectionEntry, new java.lang.Object[]{r0}));
                }
                case 21: {
                    r0.append(r4);
                    $pc6 = 22; continue $sw6;
                }
                case 22: {
                    r2 = r7.j6();
                    if (r2 < 0) { $pc6 = 35; continue $sw6; }
                    if (34 == r2) { $pc6 = 26; continue $sw6; }
                    if (32 == r2) { $pc6 = 22; continue $sw6; }
                    if (9 == r2) { $pc6 = 22; continue $sw6; }
                    throw new abcd.XC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().badSectionEntry, new java.lang.Object[]{r0}));
                }
                case 26: {
                    r7.DW();
                    $pc6 = 28; continue $sw6;
                }
                case 28: {
                    return r0.toString();
                }
                case 35: {
                    throw new abcd.XC(org.eclipse.jgit.JGitText.j6().unexpectedEndOfConfigFile);
                }
                case 7: {
                    r7.DW();
                    { $pc6 = 28; continue $sw6; }
                }
                case 37: {
                    throw new abcd.XC(org.eclipse.jgit.JGitText.j6().unexpectedEndOfConfigFile);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String DW(java.lang.String r9) {
        java.lang.StringBuilder r0 = null;
        int r2 = 0;
        boolean r3 = false;
        int r4 = 0;
        char r5 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = new java.lang.StringBuilder(r9.length());
                    r2 = 0;
                    r3 = false;
                    r4 = 0;
                    $pc7 = 4; continue $sw7;
                }
                case 4: {
                    if (r2 >= r9.length()) { $pc7 = 5; continue $sw7; }
                    r5 = r9.charAt(r2);
                    if (r5 != ' ') { $pc7 = 12; continue $sw7; }
                    if (r3 == false) { $pc7 = 32; continue $sw7; }
                    $pc7 = 36; continue $sw7;
                }
                case 36: {
                    r0.append(' ');
                    $pc7 = 37; continue $sw7;
                }
                case 37: {
                    r2 = r2 + 1;
                    { $pc7 = 4; continue $sw7; }
                }
                case 32: {
                    if (r0.length() <= 0) { $pc7 = 36; continue $sw7; }
                    if (r0.charAt(r0.length() - 1) != ' ') { $pc7 = 36; continue $sw7; }
                    r0.insert(r4, '\"');
                    r3 = true;
                    { $pc7 = 36; continue $sw7; }
                }
                case 12: {
                    if (r5 != ';') { $pc7 = 14; continue $sw7; }
                    $pc7 = 27; continue $sw7;
                }
                case 27: {
                    if (r3 == true) { $pc7 = 29; continue $sw7; }
                    r0.insert(r4, '\"');
                    r3 = true;
                    $pc7 = 29; continue $sw7;
                }
                case 29: {
                    r0.append(r5);
                    { $pc7 = 37; continue $sw7; }
                }
                case 14: {
                    if (r5 == '\\') { $pc7 = 26; continue $sw7; }
                    if (r5 != '\"') { $pc7 = 17; continue $sw7; }
                    r0.append("\\\"");
                    { $pc7 = 37; continue $sw7; }
                }
                case 17: {
                    if (r5 == '#') { $pc7 = 27; continue $sw7; }
                    switch(r5) {
                        case 8: { $pc7 = 24; continue $sw7; }
                        case 9: { $pc7 = 23; continue $sw7; }
                        case 10: { $pc7 = 20; continue $sw7; }
                        default: { $pc7 = 19; continue $sw7; }
                    };
                }
                case 19: {
                    r0.append(r5);
                    { $pc7 = 37; continue $sw7; }
                }
                case 20: {
                    if (r3 == false) { $pc7 = 22; continue $sw7; }
                    r0.append('\"');
                    r3 = false;
                    $pc7 = 22; continue $sw7;
                }
                case 22: {
                    r0.append("\\n\\\n");
                    r4 = r0.length();
                    { $pc7 = 37; continue $sw7; }
                }
                case 23: {
                    r0.append("\\t");
                    { $pc7 = 37; continue $sw7; }
                }
                case 24: {
                    r0.append("\\b");
                    { $pc7 = 37; continue $sw7; }
                }
                case 26: {
                    r0.append("\\\\");
                    { $pc7 = 37; continue $sw7; }
                }
                case 5: {
                    if (r3 == false) { $pc7 = 8; continue $sw7; }
                    r0.append('\"');
                    $pc7 = 8; continue $sw7;
                }
                case 8: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String Hw(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        java.util.List<java.lang.String> r0 = null;
        abcd.gE r1 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = v5(r2, r3, r4);
                    if (r0 != null) { $pc8 = 5; continue $sw8; }
                    r1 = this.v5;
                    if (r1 != null) { $pc8 = 9; continue $sw8; }
                    return null;
                }
                case 9: {
                    return r1.Hw(r2, r3, r4);
                }
                case 5: {
                    return r0.get(0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.gE.c VH() {
        return new abcd.gE.c(java.util.Collections.emptyList(), v5());
    }

    private abcd.gE.c Zo() {
        abcd.gE.c r0 = null;
        abcd.gE.c r1 = null;
        abcd.gE.c r2 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 2;
        $sw9: while (true) {
            switch ($pc9) {
                case 2: {
                    r0 = this.Hw.get();
                    r1 = v5();
                    if (r0.FH == r1) { $pc9 = 4; continue $sw9; }
                    r2 = new abcd.gE.c(r0.j6, r1);
                    if (this.Hw.compareAndSet(r0, r2) == false) { $pc9 = 2; continue $sw9; }
                    return r2;
                }
                case 4: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(java.util.List<abcd.gE.a> r3, java.lang.String r4, java.lang.String r5) {
        int r0 = 0;
        abcd.gE.a r1 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = 0;
                    $pc10 = 4; continue $sw10;
                }
                case 4: {
                    if (r0 >= r3.size()) { $pc10 = 5; continue $sw10; }
                    if (r3.get(r0).j6(r4, r5, null) == true) { $pc10 = 9; continue $sw10; }
                    r0 = r0 + 1;
                    $pc10 = 9; continue $sw10;
                }
                case 9: {
                    r0 = r0 + 1;
                    if (r0 >= r3.size()) { $pc10 = 15; continue $sw10; }
                    r1 = r3.get(r0);
                    if (r1.j6(r4, r5, r1.Hw) == true) { $pc10 = 9; continue $sw10; }
                    $pc10 = 15; continue $sw10;
                }
                case 15: {
                    return r0;
                }
                case 5: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.gE.c j6(abcd.gE.c r5, java.lang.String r6, java.lang.String r7) {
        java.util.ArrayList r1 = null;
        java.util.Iterator<abcd.gE.a> r8 = null;
        boolean r0 = false;
        abcd.gE.a r2 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r1 = new java.util.ArrayList(r5.j6.size());
                    r8 = r5.j6.iterator();
                    r0 = false;
                    $pc11 = 4; continue $sw11;
                }
                case 4: {
                    if (r8.hasNext() == false) { $pc11 = 6; continue $sw11; }
                    r2 = r8.next();
                    if (r2.j6(r6, r7) == true) { $pc11 = 9; continue $sw11; }
                    if (r0 == false) { $pc11 = 16; continue $sw11; }
                    if (r2.DW != null) { $pc11 = 16; continue $sw11; }
                    if (r2.FH == null) { $pc11 = 4; continue $sw11; }
                    $pc11 = 16; continue $sw11;
                }
                case 16: {
                    r1.add(r2);
                    { $pc11 = 4; continue $sw11; }
                }
                case 9: {
                    r0 = true;
                    { $pc11 = 4; continue $sw11; }
                }
                case 6: {
                    return j6(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.gE.c j6(abcd.gE.c r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.List<java.lang.String> r11) {
        java.util.List<abcd.gE.a> r12 = null;
        int r1 = 0;
        int r0 = 0;
        int r2 = 0;
        abcd.gE.a r3 = null;
        int r4 = 0;
        abcd.gE.a r5 = null;
        abcd.gE.a r6 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r12 = j6(r7, r11);
                    r1 = 0;
                    r0 = 0;
                    r2 = -1;
                    $pc12 = 4; continue $sw12;
                }
                case 4: {
                    if (r1 >= r12.size()) { $pc12 = 13; continue $sw12; }
                    if (r0 >= r11.size()) { $pc12 = 13; continue $sw12; }
                    r3 = r12.get(r1);
                    if (r3.j6(r8, r9, r10) == false) { $pc12 = 11; continue $sw12; }
                    r12.set(r1, r3.j6(r11.get(r0)));
                    r2 = r1 + 1;
                    r0 = r0 + 1;
                    $pc12 = 11; continue $sw12;
                }
                case 11: {
                    r1 = r1 + 1;
                    $pc12 = 13; continue $sw12;
                }
                case 13: {
                    if (r0 != r11.size()) { $pc12 = 24; continue $sw12; }
                    if (r1 >= r12.size()) { $pc12 = 24; continue $sw12; }
                    $pc12 = 17; continue $sw12;
                }
                case 17: {
                    if (r1 >= r12.size()) { $pc12 = 24; continue $sw12; }
                    r4 = r1 + 1;
                    if (r12.get(r1).j6(r8, r9, r10) == true) { $pc12 = 21; continue $sw12; }
                    r1 = r4;
                    { $pc12 = 17; continue $sw12; }
                }
                case 21: {
                    r1 = r4 - 1;
                    r12.remove(r1);
                    $pc12 = 24; continue $sw12;
                }
                case 24: {
                    if (r0 >= r11.size()) { $pc12 = 37; continue $sw12; }
                    if (r1 != r12.size()) { $pc12 = 37; continue $sw12; }
                    if (r2 >= 0) { $pc12 = 30; continue $sw12; }
                    r2 = j6(r12, r8, r9);
                    $pc12 = 30; continue $sw12;
                }
                case 30: {
                    if (r2 >= 0) { $pc12 = 33; continue $sw12; }
                    r5 = new abcd.gE.a(null);
                    r5.DW = r8;
                    r5.FH = r9;
                    r12.add(r5);
                    r2 = r12.size();
                    $pc12 = 33; continue $sw12;
                }
                case 33: {
                    if (r0 >= r11.size()) { $pc12 = 37; continue $sw12; }
                    r6 = new abcd.gE.a(null);
                    r6.DW = r8;
                    r6.FH = r9;
                    r6.Hw = r10;
                    r6.v5 = r11.get(r0);
                    r12.add(r2, r6);
                    r2 = r2 + 1;
                    r0 = r0 + 1;
                    $pc12 = 37; continue $sw12;
                }
                case 37: {
                    return j6(r12);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.gE.c j6(java.util.List<abcd.gE.a> r3) {
        return new abcd.gE.c(java.util.Collections.unmodifiableList(r3), v5());
    }

    private static java.lang.String j6(abcd.gE.d r7) {
        java.lang.StringBuilder r0 = null;
        int r1 = 0;
        char r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    $pc13 = 3; continue $sw13;
                }
                case 3: {
                    r1 = r7.j6();
                    if (r1 < 0) { $pc13 = 43; continue $sw13; }
                    if (61 == r1) { $pc13 = 39; continue $sw13; }
                    if (32 == r1) { $pc13 = 22; continue $sw13; }
                    if (9 == r1) { $pc13 = 22; continue $sw13; }
                    r2 = (char) r1;
                    if (java.lang.Character.isLetterOrDigit(r2) == true) { $pc13 = 21; continue $sw13; }
                    if (r1 == 45) { $pc13 = 21; continue $sw13; }
                    if (10 != r1) { $pc13 = 20; continue $sw13; }
                    r7.DW();
                    r0.append(r2);
                    { $pc13 = 39; continue $sw13; }
                }
                case 20: {
                    throw new abcd.XC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().badEntryName, new java.lang.Object[]{r0}));
                }
                case 21: {
                    r0.append(r2);
                    $pc13 = 22; continue $sw13;
                }
                case 22: {
                    r3 = r7.j6();
                    if (r3 < 0) { $pc13 = 41; continue $sw13; }
                    if (61 == r3) { $pc13 = 39; continue $sw13; }
                    if (59 == r3) { $pc13 = 37; continue $sw13; }
                    if (35 == r3) { $pc13 = 37; continue $sw13; }
                    if (10 == r3) { $pc13 = 37; continue $sw13; }
                    if (32 == r3) { $pc13 = 22; continue $sw13; }
                    if (9 == r3) { $pc13 = 22; continue $sw13; }
                    throw new abcd.XC(org.eclipse.jgit.JGitText.j6().badEntryDelimiter);
                }
                case 37: {
                    r7.DW();
                    { $pc13 = 39; continue $sw13; }
                }
                case 41: {
                    throw new abcd.XC(org.eclipse.jgit.JGitText.j6().unexpectedEndOfConfigFile);
                }
                case 39: {
                    return r0.toString();
                }
                case 43: {
                    throw new abcd.XC(org.eclipse.jgit.JGitText.j6().unexpectedEndOfConfigFile);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String j6(abcd.gE.d r9, boolean r10, int r11) {
        java.lang.StringBuilder r0 = null;
        boolean r3 = false;
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r3 = false;
                    $pc14 = 3; continue $sw14;
                }
                case 3: {
                    r4 = r9.j6();
                    if (r4 < 0) { $pc14 = 6; continue $sw14; }
                    if (10 == r4) { $pc14 = 12; continue $sw14; }
                    if (r11 == r4) { $pc14 = 28; continue $sw14; }
                    if (r10 == true) { $pc14 = 32; continue $sw14; }
                    if (java.lang.Character.isWhitespace((char) r4) == true) { $pc14 = 21; continue $sw14; }
                    if (59 == r4) { $pc14 = 26; continue $sw14; }
                    if (35 != r4) { $pc14 = 32; continue $sw14; }
                    $pc14 = 26; continue $sw14;
                }
                case 26: {
                    r9.DW();
                    { $pc14 = 28; continue $sw14; }
                }
                case 21: {
                    r3 = true;
                    $pc14 = 32; continue $sw14;
                }
                case 32: {
                    if (r3 == false) { $pc14 = 38; continue $sw14; }
                    if (r0.length() <= 0) { $pc14 = 36; continue $sw14; }
                    r0.append(' ');
                    $pc14 = 36; continue $sw14;
                }
                case 36: {
                    r3 = false;
                    $pc14 = 38; continue $sw14;
                }
                case 38: {
                    if (92 == r4) { $pc14 = 39; continue $sw14; }
                    if (34 == r4) { $pc14 = 60; continue $sw14; }
                    r0.append((char) r4);
                    { $pc14 = 3; continue $sw14; }
                }
                case 60: {
                    if (r10 == true) { $pc14 = 61; continue $sw14; }
                    r10 = true;
                    { $pc14 = 3; continue $sw14; }
                }
                case 61: {
                    r10 = false;
                    { $pc14 = 3; continue $sw14; }
                }
                case 39: {
                    r5 = r9.j6();
                    if (r5 == (-1)) { $pc14 = 58; continue $sw14; }
                    if (r5 == 10) { $pc14 = 3; continue $sw14; }
                    if (r5 != 34) { $pc14 = 43; continue $sw14; }
                    r0.append('\"');
                    { $pc14 = 3; continue $sw14; }
                }
                case 43: {
                    if (r5 != 92) { $pc14 = 45; continue $sw14; }
                    r0.append('\\');
                    { $pc14 = 3; continue $sw14; }
                }
                case 45: {
                    if (r5 != 98) { $pc14 = 47; continue $sw14; }
                    r0.append('\b');
                    { $pc14 = 3; continue $sw14; }
                }
                case 47: {
                    if (r5 != 110) { $pc14 = 49; continue $sw14; }
                    r0.append('\n');
                    { $pc14 = 3; continue $sw14; }
                }
                case 49: {
                    if (r5 != 116) { $pc14 = 52; continue $sw14; }
                    r0.append('\t');
                    { $pc14 = 3; continue $sw14; }
                }
                case 52: {
                    throw new abcd.XC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().badEscape, new java.lang.Object[]{java.lang.Character.valueOf((char) r5)}));
                }
                case 58: {
                    throw new abcd.XC(org.eclipse.jgit.JGitText.j6().endOfFileInEscape);
                }
                case 28: {
                    if (r0.length() > 0) { $pc14 = 100; continue $sw14; }
                    return null;
                }
                case 100: {
                    return r0.toString();
                }
                case 12: {
                    if (r10 == true) { $pc14 = 15; continue $sw14; }
                    r9.DW();
                    { $pc14 = 28; continue $sw14; }
                }
                case 15: {
                    throw new abcd.XC(org.eclipse.jgit.JGitText.j6().newlineInQuotesNotAllowed);
                }
                case 6: {
                    if (r0.length() != 0) { $pc14 = 28; continue $sw14; }
                    throw new abcd.XC(org.eclipse.jgit.JGitText.j6().unexpectedEndOfConfigFile);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.util.List<abcd.gE.a> j6(abcd.gE.c r1, java.util.List<java.lang.String> r2) {
        java.util.ArrayList r3 = new java.util.ArrayList((r1.j6.size() + r2.size()) + 1);
        r3.addAll(r1.j6);
        return r3;
    }

    private static java.util.List<java.lang.String> j6(java.util.List<java.lang.String> r2, java.lang.String r3) {
        java.util.ArrayList r0 = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    if (r2 != null) { $pc15 = 6; continue $sw15; }
                    return java.util.Collections.singletonList(r3);
                }
                case 6: {
                    if (r2.size() != 1) { $pc15 = 9; continue $sw15; }
                    r0 = new java.util.ArrayList(2);
                    r0.add(r2.get(0));
                    r0.add(r3);
                    return r0;
                }
                case 9: {
                    r2.add(r3);
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static <T> T[] j6(T r4) {
        java.lang.String r5 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    return (T[]) ((java.lang.Object[]) r4.getClass().getMethod("values", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]));
                }
                case 5: {
                    e = $ex16;
                    r5 = r4.getClass().getName();
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().enumValuesNotAvailable, new java.lang.Object[]{r5}), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.gE.c v5() {
        abcd.gE r0 = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    r0 = this.v5;
                    if (r0 != null) { $pc17 = 7; continue $sw17; }
                    return null;
                }
                case 7: {
                    return r0.Zo();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.util.List<java.lang.String> v5(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        java.util.Iterator<abcd.gE.a> r0 = null;
        java.util.List<java.lang.String> r1 = null;
        abcd.gE.a r2 = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    r0 = this.Hw.get().j6.iterator();
                    r1 = null;
                    $pc18 = 4; continue $sw18;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc18 = 5; continue $sw18; }
                    r2 = r0.next();
                    if (r2.j6(r5, r6, r7) == false) { $pc18 = 4; continue $sw18; }
                    r1 = j6(r1, r2.v5);
                    { $pc18 = 4; continue $sw18; }
                }
                case 5: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void DW() {
        this.FH.j6(new abcd.CD());
    }

    public void DW(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10) {
        DW(r7, r8, r9, r10);
    }

    public void DW(java.lang.String r8, java.lang.String r9, java.lang.String r10, long r11) {
        java.lang.String r12 = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    if (r11 < 1073741824) { $pc19 = 8; continue $sw19; }
                    if ((r11 % 1073741824) != 0) { $pc19 = 8; continue $sw19; }
                    r12 = java.lang.String.valueOf(java.lang.String.valueOf(r11 / 1073741824)) + " g";
                    $pc19 = 18; continue $sw19;
                }
                case 18: {
                    j6(r8, r9, r10, r12);
                    return;
                }
                case 8: {
                    if (r11 < 1048576) { $pc19 = 13; continue $sw19; }
                    if ((r11 % 1048576) != 0) { $pc19 = 13; continue $sw19; }
                    r12 = java.lang.String.valueOf(java.lang.String.valueOf(r11 / 1048576)) + " m";
                    $pc19 = 13; continue $sw19;
                }
                case 13: {
                    if (r11 >= 1024) { $pc19 = 15; continue $sw19; }
                    $pc19 = 17; continue $sw19;
                }
                case 17: {
                    r12 = java.lang.String.valueOf(r11);
                    { $pc19 = 18; continue $sw19; }
                }
                case 15: {
                    if ((r11 % 1024) != 0) { $pc19 = 17; continue $sw19; }
                    r12 = java.lang.String.valueOf(java.lang.String.valueOf(r11 / 1024)) + " k";
                    { $pc19 = 18; continue $sw19; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4) {
        java.lang.String r5 = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    if (r4 == false) { $pc20 = 4; continue $sw20; }
                    r5 = "true";
                    $pc20 = 5; continue $sw20;
                }
                case 5: {
                    j6(r1, r2, r3, r5);
                    return;
                }
                case 4: {
                    r5 = "false";
                    { $pc20 = 5; continue $sw20; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String[] DW(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        abcd.gE r0 = null;
        java.lang.String[] r1 = null;
        java.util.List<java.lang.String> r6 = null;
        java.lang.String[] r7 = null;
        int r8 = 0;
        java.util.Iterator<java.lang.String> r9 = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    r0 = this.v5;
                    if (r0 == null) { $pc21 = 5; continue $sw21; }
                    r1 = r0.DW(r3, r4, r5);
                    $pc21 = 6; continue $sw21;
                }
                case 6: {
                    r6 = v5(r3, r4, r5);
                    if (r6 == null) { $pc21 = 13; continue $sw21; }
                    r7 = new java.lang.String[r1.length + r6.size()];
                    r8 = r1.length;
                    java.lang.System.arraycopy(r1, 0, r7, 0, r8);
                    r9 = r6.iterator();
                    $pc21 = 10; continue $sw21;
                }
                case 10: {
                    if (r9.hasNext() == false) { $pc21 = 11; continue $sw21; }
                    r7[r8] = r9.next();
                    r8 = r8 + 1;
                    { $pc21 = 10; continue $sw21; }
                }
                case 11: {
                    return r7;
                }
                case 13: {
                    return r1;
                }
                case 5: {
                    r1 = j6;
                    { $pc21 = 6; continue $sw21; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        j6(r2, r3, r4, java.util.Collections.emptyList());
    }

    protected boolean FH() {
        return true;
    }

    public java.lang.String Hw() {
        java.lang.StringBuilder r0 = null;
        java.util.Iterator<abcd.gE.a> r1 = null;
        abcd.gE.a r2 = null;
        java.lang.String r3 = null;
        java.lang.String r4 = null;
        boolean r5 = false;
        java.lang.String r6 = null;
        java.lang.String r7 = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r1 = this.Hw.get().j6.iterator();
                    $pc22 = 4; continue $sw22;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc22 = 6; continue $sw22; }
                    r2 = r1.next();
                    r3 = r2.j6;
                    if (r3 == null) { $pc22 = 11; continue $sw22; }
                    r0.append(r3);
                    $pc22 = 11; continue $sw22;
                }
                case 11: {
                    if (r2.DW == null) { $pc22 = 30; continue $sw22; }
                    if (r2.Hw != null) { $pc22 = 30; continue $sw22; }
                    r0.append('[');
                    r0.append(r2.DW);
                    if (r2.FH == null) { $pc22 = 28; continue $sw22; }
                    r0.append(' ');
                    r4 = DW(r2.FH);
                    if (r4.startsWith("\"") == true) { $pc22 = 19; continue $sw22; }
                    $pc22 = 21; continue $sw22;
                }
                case 21: {
                    r5 = false;
                    $pc22 = 23; continue $sw22;
                }
                case 23: {
                    if (r5 == true) { $pc22 = 25; continue $sw22; }
                    r0.append('\"');
                    $pc22 = 25; continue $sw22;
                }
                case 25: {
                    r0.append(r4);
                    if (r5 == true) { $pc22 = 28; continue $sw22; }
                    r0.append('\"');
                    { $pc22 = 28; continue $sw22; }
                }
                case 19: {
                    if (r4.endsWith("\"") == false) { $pc22 = 21; continue $sw22; }
                    r5 = true;
                    $pc22 = 28; continue $sw22;
                }
                case 28: {
                    r0.append(']');
                    $pc22 = 46; continue $sw22;
                }
                case 46: {
                    r6 = r2.Zo;
                    if (r6 == null) { $pc22 = 49; continue $sw22; }
                    r0.append(r6);
                    $pc22 = 49; continue $sw22;
                }
                case 49: {
                    r0.append('\n');
                    $pc22 = 30; continue $sw22;
                }
                case 30: {
                    if (r2.DW == null) { $pc22 = 46; continue $sw22; }
                    if (r2.Hw == null) { $pc22 = 46; continue $sw22; }
                    r7 = r2.j6;
                    if (r7 != null) { $pc22 = 36; continue $sw22; }
                    $pc22 = 37; continue $sw22;
                }
                case 37: {
                    r0.append('\t');
                    $pc22 = 38; continue $sw22;
                }
                case 38: {
                    r0.append(r2.Hw);
                    if (DW == r2.v5) { $pc22 = 44; continue $sw22; }
                    r0.append(" =");
                    if (r2.v5 == null) { $pc22 = 44; continue $sw22; }
                    r0.append(' ');
                    r0.append(DW(r2.v5));
                    $pc22 = 44; continue $sw22;
                }
                case 44: {
                    if (r2.Zo == null) { $pc22 = 46; continue $sw22; }
                    r0.append(' ');
                    { $pc22 = 46; continue $sw22; }
                }
                case 36: {
                    if ("".equals(r7) == false) { $pc22 = 38; continue $sw22; }
                    $pc22 = 6; continue $sw22;
                }
                case 6: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(java.lang.String r2, java.lang.String r3, int r4) {
        return j6(r2, null, r3, r4);
    }

    public int j6(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10) {
        long r0 = 0L;
        java.lang.Throwable $ex23 = null;
        int $pc23 = -1;
        $sw23: while (true) {
            switch ($pc23) {
                case -1: {
                    r0 = j6(r7, r8, r9, r10);
                    if ((-2147483648L) > r0) { $pc23 = 9; continue $sw23; }
                    if (r0 > 2147483647L) { $pc23 = 9; continue $sw23; }
                    return (int) r0;
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().integerValueOutOfRange, new java.lang.Object[]{r7, r9}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public long j6(java.lang.String r7, java.lang.String r8, long r9) {
        return j6(r7, null, r8, r9);
    }

    public long j6(java.lang.String r9, java.lang.String r10, java.lang.String r11, long r12) {
        java.lang.String r13 = null;
        java.lang.String r0 = null;
        char r1 = 0;
        long r6 = 0L;
        java.lang.Throwable $ex24 = null;
        int $pc24 = -1;
        $sw24: while (true) {
            switch ($pc24) {
                case -1: {
                    r13 = j6(r9, r10, r11);
                    if (r13 != null) { $pc24 = 5; continue $sw24; }
                    return r12;
                }
                case 5: {
                    r0 = r13.trim();
                    if (r0.length() != 0) { $pc24 = 8; continue $sw24; }
                    return r12;
                }
                case 8: {
                    r1 = abcd.NK.j6(r0.charAt(r0.length() - 1));
                    if (r1 != 'g') { $pc24 = 11; continue $sw24; }
                    r6 = 1073741824;
                    $pc24 = 19; continue $sw24;
                }
                case 19: {
                    if (r6 <= 1) { $pc24 = 22; continue $sw24; }
                    r0 = r0.substring(0, r0.length() - 1).trim();
                    $pc24 = 22; continue $sw24;
                }
                case 22: {
                    if (r0.length() != 0) { $pc24 = 29; continue $sw24; }
                    return r12;
                }
                case 29: {
                    return r6 * java.lang.Long.parseLong(r0);
                }
                case 28: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidIntegerValue, new java.lang.Object[]{r9, r11, r13}));
                }
                case 11: {
                    if (r1 != 'k') { $pc24 = 13; continue $sw24; }
                    r6 = 1024;
                    { $pc24 = 19; continue $sw24; }
                }
                case 13: {
                    if (r1 == 'm') { $pc24 = 15; continue $sw24; }
                    r6 = 1;
                    { $pc24 = 19; continue $sw24; }
                }
                case 15: {
                    r6 = 1048576;
                    { $pc24 = 19; continue $sw24; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.GD j6(abcd.DD r2) {
        return this.FH.j6(r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends java.lang.Enum<?>> T j6(java.lang.String r8, java.lang.String r9, java.lang.String r10, T r11) {
        return (T) j6((java.lang.Enum[]) j6(r11), r8, r9, r10, r11);
    }

    public <T extends java.lang.Enum<?>> T j6(T[] r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, T r14) {
        java.lang.String r0 = null;
        java.lang.String r15 = null;
        int r1 = 0;
        T r4 = null;
        T r5 = null;
        int r2 = 0;
        T r6 = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = -1;
        $sw25: while (true) {
            switch ($pc25) {
                case -1: {
                    r0 = j6(r11, r12, r13);
                    if (r0 != null) { $pc25 = 5; continue $sw25; }
                    return r14;
                }
                case 5: {
                    r15 = r0.replace(' ', '_');
                    r1 = r10.length;
                    r4 = null;
                    r5 = null;
                    r2 = 0;
                    $pc25 = 6; continue $sw25;
                }
                case 6: {
                    if (r2 >= r1) { $pc25 = 7; continue $sw25; }
                    r6 = r10[r2];
                    if (abcd.NK.j6(r6.name(), r15) == true) { $pc25 = 23; continue $sw25; }
                    if (abcd.NK.j6(r6.name(), "TRUE") == false) { $pc25 = 28; continue $sw25; }
                    r4 = r6;
                    $pc25 = 30; continue $sw25;
                }
                case 30: {
                    r2 = r2 + 1;
                    { $pc25 = 6; continue $sw25; }
                }
                case 28: {
                    if (abcd.NK.j6(r6.name(), "FALSE") == false) { $pc25 = 30; continue $sw25; }
                    r5 = r6;
                    { $pc25 = 30; continue $sw25; }
                }
                case 23: {
                    return r6;
                }
                case 7: {
                    if (r4 == null) { $pc25 = 16; continue $sw25; }
                    if (r5 == null) { $pc25 = 16; continue $sw25; }
                    if (abcd.NK.DW(r15) == false) { $pc25 = 13; continue $sw25; }
                    return r4;
                }
                case 13: {
                    return r5;
                }
                case 16: {
                    if (r12 == null) { $pc25 = 20; continue $sw25; }
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().enumValueNotSupported3, new java.lang.Object[]{r11, r13, r0}));
                }
                case 20: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().enumValueNotSupported2, new java.lang.Object[]{r11, r13, r0}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public <T> T j6(gE.b<T> r3) {
        abcd.gE.c r0 = null;
        T r1 = null;
        T r2 = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = -1;
        $sw26: while (true) {
            switch ($pc26) {
                case -1: {
                    r0 = Zo();
                    r1 = (T) r0.DW.get(r3);
                    if (r1 != null) { $pc26 = 6; continue $sw26; }
                    r2 = (T) r3.j6(this);
                    r0.DW.put(r3, r2);
                    return r2;
                }
                case 6: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String j6(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
        return Hw(r1, r2, r3);
    }

    protected void j6() {
        this.Hw.set(VH());
    }

    public void j6(java.lang.String r10) {
        java.util.ArrayList r0 = null;
        abcd.gE.d r1 = null;
        abcd.gE.a r11 = null;
        abcd.gE.a r3 = null;
        int r4 = 0;
        char r5 = 0;
        java.lang.String r6 = null;
        java.lang.String r7 = null;
        int r8 = 0;
        java.lang.Throwable $ex27 = null;
        int $pc27 = -1;
        $sw27: while (true) {
            switch ($pc27) {
                case -1: {
                    r0 = new java.util.ArrayList();
                    r1 = new abcd.gE.d(r10);
                    r11 = new abcd.gE.a(null);
                    r3 = null;
                    $pc27 = 3; continue $sw27;
                }
                case 3: {
                    r4 = r1.j6();
                    if ((-1) == r4) { $pc27 = 5; continue $sw27; }
                    r5 = (char) r4;
                    if ('\n' == r5) { $pc27 = 9; continue $sw27; }
                    r6 = r11.Zo;
                    if (r6 != null) { $pc27 = 15; continue $sw27; }
                    if (';' == r5) { $pc27 = 46; continue $sw27; }
                    if ('#' == r5) { $pc27 = 46; continue $sw27; }
                    if (r11.DW != null) { $pc27 = 30; continue $sw27; }
                    if (java.lang.Character.isWhitespace(r5) == false) { $pc27 = 30; continue $sw27; }
                    if (r11.j6 != null) { $pc27 = 28; continue $sw27; }
                    r11.j6 = "";
                    $pc27 = 28; continue $sw27;
                }
                case 28: {
                    r11.j6 = java.lang.String.valueOf(r11.j6) + r5;
                    $pc27 = 30; continue $sw27;
                }
                case 30: {
                    if ('[' == r5) { $pc27 = 31; continue $sw27; }
                    if (r3 == null) { $pc27 = 45; continue $sw27; }
                    r11.DW = r3.DW;
                    r11.FH = r3.FH;
                    r1.DW();
                    r11.Hw = j6(r1);
                    if (r11.Hw.endsWith("\n") == true) { $pc27 = 42; continue $sw27; }
                    r11.v5 = j6(r1, false, -1);
                    { $pc27 = 3; continue $sw27; }
                }
                case 42: {
                    r7 = r11.Hw;
                    r11.Hw = r7.substring(0, r7.length() - 1);
                    r11.v5 = DW;
                    { $pc27 = 3; continue $sw27; }
                }
                case 45: {
                    throw new abcd.XC(org.eclipse.jgit.JGitText.j6().invalidLineInConfigFile);
                }
                case 31: {
                    r11.DW = DW(r1);
                    r8 = r1.j6();
                    if (34 != r8) { $pc27 = 35; continue $sw27; }
                    r11.FH = j6(r1, true, 34);
                    r8 = r1.j6();
                    $pc27 = 35; continue $sw27;
                }
                case 35: {
                    if (93 != r8) { $pc27 = 38; continue $sw27; }
                    r11.Zo = "";
                    { $pc27 = 3; continue $sw27; }
                }
                case 38: {
                    throw new abcd.XC(org.eclipse.jgit.JGitText.j6().badGroupHeader);
                }
                case 46: {
                    r11.Zo = java.lang.String.valueOf(r5);
                    { $pc27 = 3; continue $sw27; }
                }
                case 15: {
                    r11.Zo = java.lang.String.valueOf(r6) + r5;
                    { $pc27 = 3; continue $sw27; }
                }
                case 9: {
                    r0.add(r11);
                    if (r11.DW == null) { $pc27 = 12; continue $sw27; }
                    r3 = r11;
                    $pc27 = 12; continue $sw27;
                }
                case 12: {
                    r11 = new abcd.gE.a(null);
                    { $pc27 = 3; continue $sw27; }
                }
                case 5: {
                    this.Hw.set(j6(r0));
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r4, java.lang.String r5) {
        abcd.gE.c r0 = null;
        abcd.gE.c r1 = null;
        java.lang.Throwable $ex28 = null;
        int $pc28 = 2;
        $sw28: while (true) {
            switch ($pc28) {
                case 2: {
                    r0 = this.Hw.get();
                    r1 = j6(r0, r4, r5);
                    if (this.Hw.compareAndSet(r0, r1) == false) { $pc28 = 2; continue $sw28; }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        j6(r1, r2, r3, java.util.Collections.singletonList(r4));
    }

    public void j6(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.List<java.lang.String> r11) {
        abcd.gE.c r0 = null;
        abcd.gE.c r1 = null;
        java.lang.Throwable $ex29 = null;
        int $pc29 = 2;
        $sw29: while (true) {
            switch ($pc29) {
                case 2: {
                    r0 = this.Hw.get();
                    r1 = j6(r0, r8, r9, r10, r11);
                    if (this.Hw.compareAndSet(r0, r1) == false) { $pc29 = 2; continue $sw29; }
                    if (FH() == false) { $pc29 = 10; continue $sw29; }
                    DW();
                    return;
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8) {
        java.lang.String r9 = null;
        java.lang.Throwable $ex30 = null;
        int $pc30 = -1;
        $sw30: while (true) {
            switch ($pc30) {
                case -1: {
                    r9 = Hw(r5, r6, r7);
                    if (r9 != null) { $pc30 = 6; continue $sw30; }
                    return r8;
                }
                case 6: {
                    if (DW != r9) { $pc30 = 12; continue $sw30; }
                    return true;
                }
                case 12: {
                    return abcd.NK.DW(r9);
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidBooleanValue, new java.lang.Object[]{r5, r7, r9}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(java.lang.String r2, java.lang.String r3, boolean r4) {
        return j6(r2, null, r3, r4);
    }
}
