package abcd;

public class nH extends abcd.OE {
    private static final java.lang.String[] DW = null;
    private final java.util.concurrent.atomic.AtomicInteger EQ;
    private final abcd.IG FH;
    private final java.io.File Hw;
    private final java.io.File VH;
    private final java.io.File Zo;
    private final java.io.File gn;
    private final java.util.concurrent.atomic.AtomicReference<abcd.nH.g> tp;
    private final java.util.concurrent.atomic.AtomicReference<KK<abcd.nH.c>> u7;
    private final java.io.File v5;
    private final java.util.concurrent.atomic.AtomicInteger we;

    private static final class a extends abcd.BE.a implements abcd.nH.c {
        private final abcd.LG Hw;

        a(abcd.LG r2, java.lang.String r3, abcd.yE r4) {
            super(abcd.ME.a.DW, r3, r4);
            this.Hw = r2;
        }

        @Override
        public abcd.LG VH() {
            return this.Hw;
        }

        @Override
        public abcd.nH.c j6(abcd.BE r1) {
            return this;
        }
    }

    private static final class b extends abcd.BE.b implements abcd.nH.c {
        private final abcd.LG v5;

        b(abcd.LG r2, java.lang.String r3, abcd.yE r4, abcd.yE r5) {
            super(abcd.ME.a.DW, r3, r4, r5);
            this.v5 = r2;
        }

        @Override
        public abcd.LG VH() {
            return this.v5;
        }

        @Override
        public abcd.nH.c j6(abcd.BE r1) {
            return this;
        }
    }

    private interface c extends abcd.ME {
        abcd.LG VH();

        abcd.nH.c j6(abcd.BE r1);
    }

    private class d {
        private int DW;
        final KK.a<abcd.ME> FH;
        KK.a<abcd.nH.c> Hw;
        private final KK<abcd.nH.c> j6;
        final abcd.nH v5;

        d(abcd.nH r2, KK<abcd.nH.c> r3) {
            this.v5 = r2;
            this.FH = new abcd.KK.a(4);
            this.j6 = r3;
        }

        private void DW(java.lang.String r4) {
            abcd.nH.c r2 = null;
            abcd.nH.c r0 = null;
            int r1 = 0;
            KK.a<abcd.nH.c> r5 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r2 = null;
                        if (this.DW >= this.j6.size()) { $pc0 = 13; continue $sw0; }
                        $pc0 = 4; continue $sw0;
                    }
                    case 4: {
                        r0 = (abcd.nH.c) this.j6.get(this.DW);
                        r1 = abcd.NE.j6(r0, r4);
                        if (r1 >= 0) { $pc0 = 12; continue $sw0; }
                        if (this.Hw != null) { $pc0 = 9; continue $sw0; }
                        this.Hw = this.j6.v5(this.DW);
                        $pc0 = 9; continue $sw0;
                    }
                    case 9: {
                        this.DW++;
                        if (this.DW < this.j6.size()) { $pc0 = 4; continue $sw0; }
                        $pc0 = 12; continue $sw0;
                    }
                    case 12: {
                        if (r1 > 0) { $pc0 = 13; continue $sw0; }
                        $pc0 = 34; continue $sw0;
                    }
                    case 34: {
                        try {
                            r2 = abcd.nH.j6(this.v5, r0, r4);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.io.IOException) { $pc0 = 33; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        $pc0 = 15; continue $sw0;
                    }
                    case 15: {
                        if (r2 == null) { $pc0 = 26; continue $sw0; }
                        if (r0 != r2) { $pc0 = 18; continue $sw0; }
                        $pc0 = 20; continue $sw0;
                    }
                    case 20: {
                        r5 = this.Hw;
                        if (r5 == null) { $pc0 = 24; continue $sw0; }
                        r5.j6(r2);
                        $pc0 = 24; continue $sw0;
                    }
                    case 24: {
                        if (r2.Zo() == false) { $pc0 = 30; continue $sw0; }
                        this.FH.j6(r2);
                        $pc0 = 30; continue $sw0;
                    }
                    case 30: {
                        if (r0 == null) { $pc0 = 39; continue $sw0; }
                        this.DW++;
                        return;
                    }
                    case 39: {
                        return;
                    }
                    case 18: {
                        if (this.Hw != null) { $pc0 = 20; continue $sw0; }
                        this.Hw = this.j6.v5(this.DW);
                        { $pc0 = 20; continue $sw0; }
                    }
                    case 26: {
                        if (r0 == null) { $pc0 = 30; continue $sw0; }
                        if (this.Hw != null) { $pc0 = 30; continue $sw0; }
                        this.Hw = this.j6.v5(this.DW);
                        $pc0 = 13; continue $sw0;
                    }
                    case 13: {
                        r0 = null;
                        { $pc0 = 34; continue $sw0; }
                    }
                    case 33: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private boolean j6(java.lang.String r9, java.io.File r10) {
            java.lang.String[] r0 = null;
            int r1 = 0;
            int r2 = 0;
            int r4 = 0;
            java.lang.String r3 = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = r10.list(abcd.WG.j6);
                        r1 = 0;
                        if (r0 != null) { $pc1 = 6; continue $sw1; }
                        return false;
                    }
                    case 6: {
                        if (r0.length <= 0) { $pc1 = 22; continue $sw1; }
                        r2 = 0;
                        $pc1 = 9; continue $sw1;
                    }
                    case 9: {
                        if (r2 >= r0.length) { $pc1 = 10; continue $sw1; }
                        if (new java.io.File(r10, r0[r2]).isDirectory() == false) { $pc1 = 21; continue $sw1; }
                        r0[r2] = java.lang.String.valueOf(r0[r2]) + '/';
                        $pc1 = 21; continue $sw1;
                    }
                    case 21: {
                        r2 = r2 + 1;
                        { $pc1 = 9; continue $sw1; }
                    }
                    case 10: {
                        java.util.Arrays.sort(r0);
                        r4 = r0.length;
                        $pc1 = 11; continue $sw1;
                    }
                    case 11: {
                        if (r1 >= r4) { $pc1 = 22; continue $sw1; }
                        r3 = r0[r1];
                        if (r3.charAt(r3.length() - 1) != '/') { $pc1 = 16; continue $sw1; }
                        j6(java.lang.String.valueOf(r9) + r3, new java.io.File(r10, r3));
                        $pc1 = 17; continue $sw1;
                    }
                    case 17: {
                        r1 = r1 + 1;
                        { $pc1 = 11; continue $sw1; }
                    }
                    case 16: {
                        DW(java.lang.String.valueOf(r9) + r3);
                        $pc1 = 22; continue $sw1;
                    }
                    case 22: {
                        return true;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        void j6(java.lang.String r4) {
            KK.a<abcd.nH.c> r5 = null;
            KK<abcd.nH.c> r0 = null;
            int r1 = 0;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        if ("".equals(r4) == false) { $pc2 = 10; continue $sw2; }
                        DW("HEAD");
                        j6("refs/", abcd.nH.j6(this.v5));
                        if (this.Hw == null) { $pc2 = 7; continue $sw2; }
                        return;
                    }
                    case 7: {
                        if (this.DW >= this.j6.size()) { $pc2 = 35; continue $sw2; }
                        this.Hw = this.j6.v5(this.DW);
                        return;
                    }
                    case 35: {
                        return;
                    }
                    case 10: {
                        if (r4.startsWith("refs/") == true) { $pc2 = 12; continue $sw2; }
                        return;
                    }
                    case 12: {
                        if (r4.endsWith("/") == false) { $pc2 = 38; continue $sw2; }
                        this.DW = -(this.j6.DW(r4) + 1);
                        j6(r4, new java.io.File(abcd.nH.j6(this.v5), r4.substring(5)));
                        $pc2 = 15; continue $sw2;
                    }
                    case 15: {
                        if (this.DW >= this.j6.size()) { $pc2 = 20; continue $sw2; }
                        if (((abcd.nH.c) this.j6.get(this.DW)).getName().startsWith(r4) == false) { $pc2 = 20; continue $sw2; }
                        if (this.Hw != null) { $pc2 = 28; continue $sw2; }
                        this.Hw = this.j6.v5(this.DW);
                        $pc2 = 28; continue $sw2;
                    }
                    case 28: {
                        this.DW++;
                        $pc2 = 20; continue $sw2;
                    }
                    case 20: {
                        if (this.Hw != null) { $pc2 = 22; continue $sw2; }
                        return;
                    }
                    case 22: {
                        if (this.DW >= this.j6.size()) { $pc2 = 40; continue $sw2; }
                        r5 = this.Hw;
                        r0 = this.j6;
                        r1 = this.DW;
                        this.DW = r1 + 1;
                        r5.j6((abcd.nH.c) r0.get(r1));
                        { $pc2 = 22; continue $sw2; }
                    }
                    case 40: {
                        return;
                    }
                    case 38: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    private static final class e extends abcd.kF implements abcd.nH.c {
        private final abcd.LG FH;

        e(abcd.LG r1, java.lang.String r2, abcd.ME r3) {
            super(r2, r3);
            this.FH = r1;
        }

        @Override
        public abcd.LG VH() {
            return this.FH;
        }

        @Override
        public abcd.nH.c j6(abcd.BE r1) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private static final class f extends abcd.BE.c implements abcd.nH.c {
        private abcd.LG Hw;

        f(abcd.LG r2, java.lang.String r3, abcd.yE r4) {
            super(abcd.ME.a.DW, r3, r4);
            this.Hw = r2;
        }

        @Override
        public abcd.LG VH() {
            return this.Hw;
        }

        @Override
        public abcd.nH.c j6(abcd.BE r5) {
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        if (r5.FH() == null) { $pc3 = 7; continue $sw3; }
                        return new abcd.nH.b(this.Hw, getName(), DW(), r5.FH());
                    }
                    case 7: {
                        return new abcd.nH.a(this.Hw, getName(), DW());
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    private static class g extends KK<abcd.ME> {
        static final abcd.nH.g Hw = null;
        final abcd.LG v5;

        static {
            Hw = new abcd.nH.g(abcd.KK.DW(), abcd.LG.DW);
        }

        g(KK<abcd.ME> r1, abcd.LG r2) {
            super(r1);
            this.v5 = r2;
        }
    }

    static {
        DW = new java.lang.String[]{"MERGE_HEAD", "FETCH_HEAD", "ORIG_HEAD", "CHERRY_PICK_HEAD"};
    }

    nH(abcd.IG r3) {
        this.u7 = new java.util.concurrent.atomic.AtomicReference();
        this.tp = new java.util.concurrent.atomic.AtomicReference();
        this.EQ = new java.util.concurrent.atomic.AtomicInteger();
        this.we = new java.util.concurrent.atomic.AtomicInteger();
        abcd.AbstractpK r0 = r3.gn();
        this.FH = r3;
        this.Hw = r3.VH();
        this.v5 = r0.j6(this.Hw, "refs/");
        this.Zo = r0.j6(this.Hw, "logs");
        this.VH = r0.j6(this.Hw, "logs/refs/");
        this.gn = r0.j6(this.Hw, "packed-refs");
        this.u7.set(abcd.KK.DW());
        this.tp.set(abcd.nH.g.Hw);
    }

    private abcd.BE DW(abcd.ME r6) {
        abcd.qG r0 = null;
        abcd.AbstractiG r1 = null;
        abcd.BE.b r2 = null;
        abcd.BE.a r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new abcd.qG(FH());
                    try {
                        r1 = r0.Zo(r6.DW());
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    if ((r1 instanceof abcd.lG) == false) { $pc4 = 8; continue $sw4; }
                    try {
                        r2 = new abcd.BE.b(r6.j6(), r6.getName(), r6.DW(), r0.FH(r1).Hw());
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    r0.EQ();
                    return r2;
                }
                case 8: {
                    try {
                        r3 = new abcd.BE.a(r6.j6(), r6.getName(), r6.DW());
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    r0.EQ();
                    return r3;
                }
                case 11: {
                    th = $ex4;
                    r0.EQ();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.util.concurrent.atomic.AtomicReference DW(abcd.nH r0) {
        return r0.tp;
    }

    private void Hw() {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.we.get();
                    r1 = this.EQ.get();
                    if (r0 != r1) { $pc5 = 5; continue $sw5; }
                    return;
                }
                case 5: {
                    if (this.we.compareAndSet(r0, r1) == false) { $pc5 = 10; continue $sw5; }
                    if (r0 == 0) { $pc5 = 11; continue $sw5; }
                    this.FH.j6(new abcd.ID());
                    return;
                }
                case 11: {
                    return;
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean VH() {
        return ((abcd.jE) this.FH.Zo().j6(abcd.jE.j6)).Hw();
    }

    private boolean VH(java.lang.String r2) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r2.equals("HEAD") == false) { $pc6 = 5; continue $sw6; }
                    return true;
                }
                case 5: {
                    if (r2.startsWith("refs/heads/") == false) { $pc6 = 7; continue $sw6; }
                    return true;
                }
                case 7: {
                    if (r2.startsWith("refs/remotes/") == false) { $pc6 = 9; continue $sw6; }
                    return true;
                }
                case 9: {
                    if (r2.equals("refs/stash") == true) { $pc6 = 16; continue $sw6; }
                    return false;
                }
                case 16: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.nH.g Zo() {
        abcd.nH.g r0 = null;
        abcd.nH.g r1 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = this.tp.get();
                    if (r0.v5.j6(this.gn) == true) { $pc7 = 5; continue $sw7; }
                    return r0;
                }
                case 5: {
                    r1 = gn();
                    if (this.tp.compareAndSet(r0, r1) == false) { $pc7 = 8; continue $sw7; }
                    this.EQ.incrementAndGet();
                    $pc7 = 8; continue $sw7;
                }
                case 8: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.nH.g gn() {
        abcd.LG r0 = null;
        java.io.BufferedReader r1 = null;
        abcd.nH.g r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = abcd.LG.DW(this.gn);
                    try {
                        r1 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(this.gn), abcd.hE.Zo));
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.io.FileNotFoundException) { $pc8 = 10; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r2 = new abcd.nH.g(j6(r1), r0);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 7; continue $sw8;
                    }
                    r1.close();
                    return r2;
                }
                case 7: {
                    th = $ex8;
                    r1.close();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 11: {
                    return abcd.nH.g.Hw;
                }
                case 10: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private KK<abcd.ME> j6(KK<? extends abcd.ME> r1) {
        return r1;
    }

    private KK<abcd.ME> j6(java.io.BufferedReader r11) {
        abcd.KK.a r0 = null;
        abcd.ME r4 = null;
        boolean r2 = false;
        boolean r3 = false;
        java.lang.String r5 = null;
        abcd.ME r6 = null;
        int r7 = 0;
        abcd.yE r8 = null;
        java.lang.String r9 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = new abcd.KK.a();
                    r4 = null;
                    r2 = false;
                    r3 = false;
                    $pc9 = 3; continue $sw9;
                }
                case 3: {
                    r5 = r11.readLine();
                    if (r5 == null) { $pc9 = 5; continue $sw9; }
                    if (r5.charAt(0) == '#') { $pc9 = 12; continue $sw9; }
                    if (r5.charAt(0) != '^') { $pc9 = 21; continue $sw9; }
                    if (r4 == null) { $pc9 = 20; continue $sw9; }
                    r6 = new abcd.BE.b(abcd.ME.a.FH, r4.getName(), r4.DW(), abcd.yE.j6(r5.substring(1)));
                    r0.j6(r0.j6() - 1, r6);
                    $pc9 = 18; continue $sw9;
                }
                case 18: {
                    r4 = r6;
                    { $pc9 = 3; continue $sw9; }
                }
                case 20: {
                    throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().peeledLineBeforeRef);
                }
                case 21: {
                    r7 = r5.indexOf(32);
                    r8 = abcd.yE.j6(r5.substring(0, r7));
                    r9 = j6(r5, r7 + 1, r5.length());
                    if (r3 == false) { $pc9 = 24; continue $sw9; }
                    r6 = new abcd.BE.a(abcd.ME.a.FH, r9, r8);
                    $pc9 = 25; continue $sw9;
                }
                case 25: {
                    if (r4 != null) { $pc9 = 27; continue $sw9; }
                    $pc9 = 29; continue $sw9;
                }
                case 29: {
                    r0.j6(r6);
                    { $pc9 = 18; continue $sw9; }
                }
                case 27: {
                    if (abcd.NE.DW(r4, r6) <= 0) { $pc9 = 29; continue $sw9; }
                    r2 = true;
                    { $pc9 = 29; continue $sw9; }
                }
                case 24: {
                    r6 = new abcd.BE.c(abcd.ME.a.FH, r9, r8);
                    { $pc9 = 25; continue $sw9; }
                }
                case 12: {
                    if (r5.startsWith("# pack-refs with:") == false) { $pc9 = 3; continue $sw9; }
                    r3 = r5.substring(17).contains(" peeled");
                    { $pc9 = 3; continue $sw9; }
                }
                case 5: {
                    if (r2 == false) { $pc9 = 8; continue $sw9; }
                    r0.DW();
                    $pc9 = 8; continue $sw9;
                }
                case 8: {
                    return r0.FH();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.ME j6(abcd.ME r10, int r11, java.lang.String r12, KK<abcd.nH.c> r13, KK<abcd.ME> r14) {
        abcd.ME r0 = null;
        abcd.ME r1 = null;
        abcd.ME r15 = null;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (r10.Zo() == false) { $pc10 = 25; continue $sw10; }
                    r0 = r10.getTarget();
                    if (5 > r11) { $pc10 = 7; continue $sw10; }
                    return null;
                }
                case 7: {
                    if (r13 != null) { $pc10 = 9; continue $sw10; }
                    $pc10 = 17; continue $sw10;
                }
                case 17: {
                    r1 = j6(r0.getName(), r14);
                    if (r1 != null) { $pc10 = 20; continue $sw10; }
                    return r10;
                }
                case 20: {
                    r15 = j6(r1, r11 + 1, r12, r13, r14);
                    if (r15 != null) { $pc10 = 24; continue $sw10; }
                    return null;
                }
                case 24: {
                    return new abcd.kF(r10.getName(), r15);
                }
                case 9: {
                    if (r0.getName().startsWith(r12) == false) { $pc10 = 17; continue $sw10; }
                    r2 = r13.DW(r0.getName());
                    if (r2 < 0) { $pc10 = 13; continue $sw10; }
                    r1 = r13.get(r2);
                    { $pc10 = 20; continue $sw10; }
                }
                case 13: {
                    r3 = r14.DW(r0.getName());
                    if (r3 < 0) { $pc10 = 16; continue $sw10; }
                    r1 = r14.get(r3);
                    { $pc10 = 20; continue $sw10; }
                }
                case 16: {
                    return r10;
                }
                case 25: {
                    return r10;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.ME j6(abcd.ME r1, abcd.BE r2) {
        abcd.ME r3 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    if (r1.Zo() == false) { $pc11 = 6; continue $sw11; }
                    r3 = j6(r1.getTarget(), r2);
                    return new abcd.kF(r1.getName(), r3);
                }
                case 6: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.ME j6(java.lang.String r6, KK<abcd.ME> r7) {
        KK<abcd.nH.c> r0 = null;
        int r1 = 0;
        abcd.nH.c r2 = null;
        abcd.nH.c r3 = null;
        abcd.nH.c r4 = null;
        int r8 = 0;
        java.lang.String[] r5 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r0 = (abcd.KK) this.u7.get();
                    r1 = r0.DW(r6);
                    if (r1 < 0) { $pc12 = 17; continue $sw12; }
                    r2 = (abcd.nH.c) r0.get(r1);
                    r3 = j6(r2, r6);
                    if (r3 == null) { $pc12 = 7; continue $sw12; }
                    if (r2 != r3) { $pc12 = 14; continue $sw12; }
                    return r3;
                }
                case 14: {
                    if (this.u7.compareAndSet(r0, r0.DW(r1, r3)) == false) { $pc12 = 16; continue $sw12; }
                    this.EQ.incrementAndGet();
                    $pc12 = 16; continue $sw12;
                }
                case 16: {
                    return r3;
                }
                case 7: {
                    if (this.u7.compareAndSet(r0, r0.remove(r1)) == false) { $pc12 = 10; continue $sw12; }
                    this.EQ.incrementAndGet();
                    $pc12 = 10; continue $sw12;
                }
                case 10: {
                    return r7.FH(r6);
                }
                case 17: {
                    r4 = j6(null, r6);
                    if (r4 == null) { $pc12 = 20; continue $sw12; }
                    r8 = 0;
                    $pc12 = 22; continue $sw12;
                }
                case 22: {
                    r5 = DW;
                    if (r8 >= r5.length) { $pc12 = 25; continue $sw12; }
                    if (r6.equals(r5[r8]) == true) { $pc12 = 30; continue $sw12; }
                    r8 = r8 + 1;
                    { $pc12 = 22; continue $sw12; }
                }
                case 30: {
                    return r4;
                }
                case 25: {
                    if (this.u7.compareAndSet(r0, r0.j6(r1, r4)) == false) { $pc12 = 27; continue $sw12; }
                    this.EQ.incrementAndGet();
                    $pc12 = 27; continue $sw12;
                }
                case 27: {
                    return r4;
                }
                case 20: {
                    return r7.FH(r6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.nH.c j6(abcd.nH.c r12, java.lang.String r13) {
        java.io.File r0 = null;
        abcd.LG r14 = null;
        abcd.LG r2 = null;
        abcd.LG r3 = null;
        byte[] r1 = null;
        int r5 = 0;
        java.lang.String r4 = null;
        abcd.yE r6 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = Hw(r13);
                    if (r12 == null) { $pc13 = 8; continue $sw13; }
                    r14 = r12.VH();
                    if (r14.j6(r0) == true) { $pc13 = 7; continue $sw13; }
                    return r12;
                }
                case 7: {
                    r2 = r14;
                    r13 = r12.getName();
                    $pc13 = 9; continue $sw13;
                }
                case 9: {
                    r3 = abcd.LG.DW(r0);
                    try {
                        r1 = abcd.BK.DW(r0, 4096);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        if ($t instanceof java.io.FileNotFoundException) { $pc13 = 56; continue $sw13; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r5 = r1.length;
                    if (r5 != 0) { $pc13 = 15; continue $sw13; }
                    return null;
                }
                case 15: {
                    if (j6(r1, r5) == false) { $pc13 = 38; continue $sw13; }
                    if (r5 != 4096) { $pc13 = 18; continue $sw13; }
                    return null;
                }
                case 18: {
                    if (r5 <= 0) { $pc13 = 24; continue $sw13; }
                    if (java.lang.Character.isWhitespace(r1[r5 - 1]) == false) { $pc13 = 24; continue $sw13; }
                    r5 = r5 - 1;
                    $pc13 = 24; continue $sw13;
                }
                case 24: {
                    if (r5 < 6) { $pc13 = 36; continue $sw13; }
                    r4 = abcd.IK.j6(r1, 5, r5);
                    if (r12 == null) { $pc13 = 34; continue $sw13; }
                    if (r12.Zo() == false) { $pc13 = 34; continue $sw13; }
                    if (r12.getTarget().getName().equals(r4) == false) { $pc13 = 34; continue $sw13; }
                    r2.DW(r3);
                    return r12;
                }
                case 34: {
                    return j6(r3, r13, r4);
                }
                case 36: {
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().notARef, new java.lang.Object[]{r13, abcd.IK.j6(r1, 0, r5)}));
                }
                case 38: {
                    if (r5 >= 40) { $pc13 = 58; continue $sw13; }
                    return null;
                }
                case 58: {
                    try {
                        r6 = abcd.yE.v5(r1, 0);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        if ($t instanceof java.lang.IllegalArgumentException) { $pc13 = 57; continue $sw13; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r12 == null) { $pc13 = 49; continue $sw13; }
                    if (r12.Zo() == true) { $pc13 = 49; continue $sw13; }
                    if (r12.getTarget().DW().DW(r6) == false) { $pc13 = 49; continue $sw13; }
                    try {
                        r2.DW(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        if ($t instanceof java.lang.IllegalArgumentException) { $pc13 = 57; continue $sw13; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r12;
                }
                case 49: {
                    return new abcd.nH.f(r3, r13, r6);
                }
                case 50: {
                    if (r5 <= 0) { $pc13 = 55; continue $sw13; }
                    if (java.lang.Character.isWhitespace(r1[r5 - 1]) == false) { $pc13 = 55; continue $sw13; }
                    r5 = r5 - 1;
                    $pc13 = 55; continue $sw13;
                }
                case 55: {
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().notARef, new java.lang.Object[]{r13, abcd.IK.j6(r1, 0, r5)}));
                }
                case 56: {
                    return null;
                }
                case 8: {
                    r2 = null;
                    { $pc13 = 9; continue $sw13; }
                }
                case 57: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static abcd.nH.c j6(abcd.nH r0, abcd.nH.c r1, java.lang.String r2) {
        return r0.j6(r1, r2);
    }

    private static abcd.nH.e j6(abcd.LG r3, java.lang.String r4, java.lang.String r5) {
        return new abcd.nH.e(r3, r4, new abcd.BE.c(abcd.ME.a.j6, r5, null));
    }

    static java.io.File j6(abcd.nH r0) {
        return r0.v5;
    }

    private static java.lang.String j6(java.lang.String r2, int r3, int r4) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder(r4 - r3);
        r0.append(r2, r3, r4);
        return r0.toString();
    }

    private void j6(abcd.WG r8, KK<abcd.ME> r9, abcd.nH.g r10) {
        new abcd.mH(this, r9, r8, r10, r9).DW();
    }

    private void j6(abcd.nH.c r4) {
        KK<abcd.nH.c> r0 = null;
        KK<abcd.nH.c> r1 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 2;
        $sw14: while (true) {
            switch ($pc14) {
                case 2: {
                    r0 = (abcd.KK) this.u7.get();
                    r1 = r0.j6(r4);
                    if (this.u7.compareAndSet(r0, r1) == false) { $pc14 = 2; continue $sw14; }
                    this.EQ.incrementAndGet();
                    Hw();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(java.io.File r3, int r4) {
        int r1 = 0;
        java.io.File r5 = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r1 = 0;
                    if (r3.delete() == false) { $pc15 = 5; continue $sw15; }
                    $pc15 = 9; continue $sw15;
                }
                case 9: {
                    r5 = r3.getParentFile();
                    $pc15 = 10; continue $sw15;
                }
                case 10: {
                    if (r1 >= r4) { $pc15 = 14; continue $sw15; }
                    if (r5.delete() == false) { $pc15 = 18; continue $sw15; }
                    r5 = r5.getParentFile();
                    r1 = r1 + 1;
                    { $pc15 = 10; continue $sw15; }
                }
                case 18: {
                    return;
                }
                case 14: {
                    return;
                }
                case 5: {
                    if (r3.isFile() == false) { $pc15 = 9; continue $sw15; }
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().fileCannotBeDeleted, new java.lang.Object[]{r3}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.lang.String r7, byte[] r8) {
        java.io.File r0 = null;
        boolean r9 = false;
        abcd.yH r10 = null;
        java.io.FileOutputStream r1 = null;
        java.nio.channels.FileChannel r11 = null;
        java.nio.ByteBuffer r12 = null;
        java.io.File r4 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    r0 = Zo(r7);
                    if (VH() == false) { $pc16 = 8; continue $sw16; }
                    if (VH(r7) == false) { $pc16 = 8; continue $sw16; }
                    $pc16 = 9; continue $sw16;
                }
                case 9: {
                    r9 = true;
                    $pc16 = 11; continue $sw16;
                }
                case 11: {
                    if (r9 == false) { $pc16 = 39; continue $sw16; }
                    r10 = (abcd.yH) FH().Zo().j6(abcd.yH.j6);
                    try {
                        r1 = new java.io.FileOutputStream(r0, true);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        if ($t instanceof java.io.FileNotFoundException) { $pc16 = 15; continue $sw16; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc16 = 42; continue $sw16;
                }
                case 42: {
                    $pc16 = 27; continue $sw16;
                }
                case 35: {
                    th = $ex16;
                    r1.close();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 27: {
                    if (r10.FH() == false) { $pc16 = 33; continue $sw16; }
                    try {
                        r11 = r1.getChannel();
                        r12 = java.nio.ByteBuffer.wrap(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 35; continue $sw16;
                    }
                    $pc16 = 30; continue $sw16;
                }
                case 30: {
                    if (r12.remaining() <= 0) { $pc16 = 31; continue $sw16; }
                    try {
                        r11.write(r12);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 35; continue $sw16;
                    }
                    { $pc16 = 30; continue $sw16; }
                }
                case 31: {
                    try {
                        r11.force(true);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 35; continue $sw16;
                    }
                    $pc16 = 34; continue $sw16;
                }
                case 34: {
                    r1.close();
                    return;
                }
                case 33: {
                    try {
                        r1.write(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 35; continue $sw16;
                    }
                    $pc16 = 19; continue $sw16;
                }
                case 15: {
                    e = $ex16;
                    r4 = r0.getParentFile();
                    if (r4.exists() == false) { $pc16 = 19; continue $sw16; }
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 19: {
                    if (r4.mkdirs() == false) { $pc16 = 21; continue $sw16; }
                    $pc16 = 25; continue $sw16;
                }
                case 25: {
                    r1 = new java.io.FileOutputStream(r0, true);
                    { $pc16 = 42; continue $sw16; }
                }
                case 21: {
                    if (r4.isDirectory() == true) { $pc16 = 25; continue $sw16; }
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().cannotCreateDirectory, new java.lang.Object[]{r4}));
                }
                case 39: {
                    return;
                }
                case 8: {
                    if (r0.isFile() == true) { $pc16 = 9; continue $sw16; }
                    r9 = false;
                    { $pc16 = 11; continue $sw16; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(byte[] r3, int r4) {
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    if (r4 >= 6) { $pc17 = 6; continue $sw17; }
                    return false;
                }
                case 6: {
                    if (r3[0] == 114) { $pc17 = 8; continue $sw17; }
                    $pc17 = 16; continue $sw17;
                }
                case 16: {
                    return false;
                }
                case 8: {
                    if (r3[1] != 101) { $pc17 = 16; continue $sw17; }
                    if (r3[2] != 102) { $pc17 = 16; continue $sw17; }
                    if (r3[3] != 58) { $pc17 = 16; continue $sw17; }
                    if (r3[4] != 32) { $pc17 = 16; continue $sw17; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int v5(java.lang.String r3) {
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    r1 = r3.indexOf(47);
                    r2 = 0;
                    $pc18 = 3; continue $sw18;
                }
                case 3: {
                    if (r1 < 0) { $pc18 = 4; continue $sw18; }
                    r2 = r2 + 1;
                    r1 = r3.indexOf(47, r1 + 1);
                    { $pc18 = 3; continue $sw18; }
                }
                case 4: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private KK<abcd.nH.c> v5() {
        KK<abcd.nH.c> r0 = null;
        abcd.nH.d r1 = null;
        KK.a<abcd.nH.c> r2 = null;
        KK<abcd.nH.c> r3 = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    r0 = (abcd.KK) this.u7.get();
                    r1 = new abcd.nH.d(this, r0);
                    r1.j6("");
                    r2 = r1.Hw;
                    if (r2 == null) { $pc19 = 9; continue $sw19; }
                    r3 = r2.FH();
                    if (this.u7.compareAndSet(r0, r3) == false) { $pc19 = 8; continue $sw19; }
                    this.EQ.incrementAndGet();
                    $pc19 = 8; continue $sw19;
                }
                case 8: {
                    return r3;
                }
                case 9: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.util.Map<java.lang.String, abcd.ME> DW(java.lang.String r12) {
        abcd.nH.g r6 = null;
        abcd.KK r0 = null;
        abcd.nH.d r1 = null;
        KK.a<abcd.nH.c> r2 = null;
        abcd.KK r3 = null;
        KK.a<abcd.ME> r7 = null;
        abcd.KK r9 = null;
        int r8 = 0;
        abcd.ME r10 = null;
        abcd.ME r4 = null;
        int r5 = 0;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    r6 = Zo();
                    r0 = this.u7.get();
                    r1 = new abcd.nH.d(this, r0);
                    r1.j6(r12);
                    r2 = r1.Hw;
                    if (r2 == null) { $pc20 = 8; continue $sw20; }
                    r2.DW();
                    r3 = r1.Hw.FH();
                    if (this.u7.compareAndSet(r0, r3) == false) { $pc20 = 7; continue $sw20; }
                    this.EQ.incrementAndGet();
                    $pc20 = 7; continue $sw20;
                }
                case 7: {
                    r0 = r3;
                    $pc20 = 8; continue $sw20;
                }
                case 8: {
                    Hw();
                    r7 = r1.FH;
                    r9 = r0;
                    r8 = 0;
                    $pc20 = 10; continue $sw20;
                }
                case 10: {
                    if (r8 >= r7.j6()) { $pc20 = 11; continue $sw20; }
                    r10 = r7.j6(r8);
                    r4 = j6(r10, 0, r12, r9, r6);
                    if (r4 == null) { $pc20 = 18; continue $sw20; }
                    if (r4.DW() == null) { $pc20 = 18; continue $sw20; }
                    r7.j6(r8, r4);
                    r8 = r8 + 1;
                    $pc20 = 18; continue $sw20;
                }
                case 18: {
                    r7.DW(r8);
                    r5 = r9.DW(r10.getName());
                    if (r5 < 0) { $pc20 = 10; continue $sw20; }
                    r9 = r9.remove(r5);
                    { $pc20 = 10; continue $sw20; }
                }
                case 11: {
                    r7.DW();
                    j6(r9);
                    return new abcd.MK(r12, r6, r9, r7.FH());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void DW() {
        abcd.zK.DW(this.v5);
        abcd.zK.DW(this.Zo);
        abcd.zK.DW(this.VH);
        abcd.zK.DW(new java.io.File(this.v5, "refs/heads/".substring(5)));
        abcd.zK.DW(new java.io.File(this.v5, "refs/tags/".substring(5)));
        abcd.zK.DW(new java.io.File(this.VH, "refs/heads/".substring(5)));
    }

    abcd.UE FH() {
        return this.FH;
    }

    @Override
    public boolean FH(java.lang.String r8) {
        abcd.nH.g r0 = null;
        KK<abcd.nH.c> r1 = null;
        int r3 = 0;
        java.lang.String r4 = null;
        java.lang.String r9 = null;
        int r2 = 0;
        int r5 = 0;
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    r0 = Zo();
                    r1 = v5();
                    r3 = r8.lastIndexOf(47);
                    $pc21 = 4; continue $sw21;
                }
                case 4: {
                    if (r3 <= 0) { $pc21 = 5; continue $sw21; }
                    r4 = r8.substring(0, r3);
                    if (r1.j6(r4) == true) { $pc21 = 22; continue $sw21; }
                    if (r0.j6(r4) == true) { $pc21 = 22; continue $sw21; }
                    r3 = r8.lastIndexOf(47, r3 - 1);
                    $pc21 = 22; continue $sw21;
                }
                case 22: {
                    return true;
                }
                case 5: {
                    r9 = java.lang.String.valueOf(r8) + '/';
                    r2 = -(r0.DW(r9) + 1);
                    if (r2 < r0.size()) { $pc21 = 8; continue $sw21; }
                    $pc21 = 10; continue $sw21;
                }
                case 10: {
                    r5 = -(r1.DW(r9) + 1);
                    if (r5 < r1.size()) { $pc21 = 13; continue $sw21; }
                    $pc21 = 15; continue $sw21;
                }
                case 15: {
                    return false;
                }
                case 13: {
                    if (((abcd.nH.c) r1.get(r5)).getName().startsWith(r9) == false) { $pc21 = 15; continue $sw21; }
                    return true;
                }
                case 8: {
                    if (r0.get(r2).getName().startsWith(r9) == false) { $pc21 = 10; continue $sw21; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    java.io.File Hw(java.lang.String r3) {
        java.lang.String r4 = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    if (r3.startsWith("refs/") == false) { $pc22 = 7; continue $sw22; }
                    r4 = r3.substring(5);
                    return new java.io.File(this.v5, r4);
                }
                case 7: {
                    return new java.io.File(this.Hw, r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    java.io.File Zo(java.lang.String r3) {
        java.lang.String r4 = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = -1;
        $sw23: while (true) {
            switch ($pc23) {
                case -1: {
                    if (r3.startsWith("refs/") == false) { $pc23 = 7; continue $sw23; }
                    r4 = r3.substring(5);
                    return new java.io.File(this.VH, r4);
                }
                case 7: {
                    return new java.io.File(this.Zo, r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.ME j6(abcd.ME r6) {
        abcd.ME r0 = null;
        abcd.BE r1 = null;
        KK<abcd.nH.c> r2 = null;
        int r3 = 0;
        KK<abcd.nH.c> r4 = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = -1;
        $sw24: while (true) {
            switch ($pc24) {
                case -1: {
                    r0 = r6.v5();
                    if (r0.Hw() == false) { $pc24 = 5; continue $sw24; }
                    return r6;
                }
                case 5: {
                    if (r0.DW() == null) { $pc24 = 17; continue $sw24; }
                    r1 = DW(r0);
                    if (r0.j6().Hw() == false) { $pc24 = 15; continue $sw24; }
                    r2 = (abcd.KK) this.u7.get();
                    r3 = r2.DW(r0.getName());
                    if (r3 < 0) { $pc24 = 15; continue $sw24; }
                    if (r2.get(r3) != r0) { $pc24 = 15; continue $sw24; }
                    r4 = r2.DW(r3, ((abcd.nH.c) r0).j6(r1));
                    this.u7.compareAndSet(r2, r4);
                    $pc24 = 15; continue $sw24;
                }
                case 15: {
                    return j6(r6, r1);
                }
                case 17: {
                    return r6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.ME j6(java.lang.String r7) {
        abcd.nH.g r5 = null;
        java.lang.String[] r0 = null;
        int r1 = 0;
        abcd.ME r2 = null;
        int r3 = 0;
        java.lang.Throwable $ex25 = null;
        int $pc25 = -1;
        $sw25: while (true) {
            switch ($pc25) {
                case -1: {
                    r5 = Zo();
                    r0 = abcd.OE.j6;
                    r1 = r0.length;
                    r2 = null;
                    r3 = 0;
                    $pc25 = 3; continue $sw25;
                }
                case 3: {
                    if (r3 >= r1) { $pc25 = 8; continue $sw25; }
                    r2 = j6(java.lang.String.valueOf(r0[r3]) + r7, r5);
                    if (r2 != null) { $pc25 = 7; continue $sw25; }
                    r3 = r3 + 1;
                    { $pc25 = 3; continue $sw25; }
                }
                case 7: {
                    r2 = j6(r2, 0, null, null, r5);
                    $pc25 = 8; continue $sw25;
                }
                case 8: {
                    Hw();
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.RE j6(java.lang.String r1, boolean r2) {
        return j6(r1, r2);
    }

    @Override
    public abcd.C1117oH j6(java.lang.String r7, boolean r8) {
        abcd.nH.g r5 = null;
        abcd.ME r1 = null;
        boolean r0 = false;
        abcd.C1117oH r9 = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = -1;
        $sw26: while (true) {
            switch ($pc26) {
                case -1: {
                    r5 = Zo();
                    r1 = j6(r7, r5);
                    if (r1 == null) { $pc26 = 5; continue $sw26; }
                    r1 = j6(r1, 0, null, null, r5);
                    $pc26 = 5; continue $sw26;
                }
                case 5: {
                    r0 = false;
                    if (r1 != null) { $pc26 = 8; continue $sw26; }
                    r1 = new abcd.BE.c(abcd.ME.a.j6, r7, null);
                    $pc26 = 14; continue $sw26;
                }
                case 14: {
                    r9 = new abcd.C1117oH(this, r1);
                    if (r0 == false) { $pc26 = 17; continue $sw26; }
                    r9.Ws();
                    $pc26 = 17; continue $sw26;
                }
                case 17: {
                    return r9;
                }
                case 8: {
                    if (r8 == true) { $pc26 = 10; continue $sw26; }
                    $pc26 = 12; continue $sw26;
                }
                case 12: {
                    if (r0 == false) { $pc26 = 14; continue $sw26; }
                    r1 = new abcd.BE.c(abcd.ME.a.DW, r7, r1.DW());
                    { $pc26 = 14; continue $sw26; }
                }
                case 10: {
                    if (r1.Zo() == false) { $pc26 = 12; continue $sw26; }
                    r0 = true;
                    { $pc26 = 12; continue $sw26; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6() {
    }

    void j6(abcd.RE r5, java.lang.String r6, boolean r7) {
        abcd.yE r0 = null;
        abcd.yE r1 = null;
        abcd.ME r2 = null;
        abcd.KE r8 = null;
        abcd.KE r9 = null;
        byte[] r10 = null;
        java.lang.Throwable $ex27 = null;
        int $pc27 = -1;
        $sw27: while (true) {
            switch ($pc27) {
                case -1: {
                    r0 = r5.Zo();
                    r1 = r5.v5();
                    r2 = r5.VH();
                    r8 = r5.u7();
                    if (r8 != null) { $pc27 = 5; continue $sw27; }
                    r9 = new abcd.KE(this.FH);
                    $pc27 = 6; continue $sw27;
                }
                case 6: {
                    r10 = abcd.hE.j6(abcd.yE.j6(r0) + ' ' + abcd.yE.j6(r1) + ' ' + r9.Hw() + '\t' + r6 + '\n');
                    if (r7 == true) { $pc27 = 9; continue $sw27; }
                    $pc27 = 11; continue $sw27;
                }
                case 11: {
                    j6(r2.getName(), r10);
                    return;
                }
                case 9: {
                    if (r2.Zo() == false) { $pc27 = 11; continue $sw27; }
                    j6(r2.getName(), r10);
                    j6(r2.v5().getName(), r10);
                    return;
                }
                case 5: {
                    r9 = new abcd.KE(r8);
                    { $pc27 = 6; continue $sw27; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(abcd.C1117oH r7) {
        abcd.ME r0 = null;
        java.lang.String r1 = null;
        abcd.nH.g r2 = null;
        abcd.WG r3 = null;
        abcd.nH.g r4 = null;
        int r5 = 0;
        KK<abcd.nH.c> r6 = null;
        int r8 = 0;
        int r9 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex28 = null;
        int $pc28 = -1;
        $sw28: while (true) {
            switch ($pc28) {
                case -1: {
                    r0 = r7.VH().v5();
                    r1 = r0.getName();
                    r2 = Zo();
                    if (r2.j6(r1) == false) { $pc28 = 15; continue $sw28; }
                    r3 = new abcd.WG(this.gn, r7.EQ().gn());
                    if (r3.Hw() == false) { $pc28 = 14; continue $sw28; }
                    try {
                        r4 = gn();
                        r5 = r4.DW(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 10; continue $sw28;
                    }
                    if (r5 < 0) { $pc28 = 9; continue $sw28; }
                    try {
                        j6(r3, r4.remove(r5), r2);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 10; continue $sw28;
                    }
                    $pc28 = 9; continue $sw28;
                }
                case 9: {
                    r3.v5();
                    $pc28 = 14; continue $sw28;
                }
                case 10: {
                    th = $ex28;
                    r3.v5();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 14: {
                    throw new abcd.dD(this.gn);
                }
                case 15: {
                    r6 = (abcd.KK) this.u7.get();
                    r8 = r6.DW(r1);
                    if (r8 < 0) { $pc28 = 20; continue $sw28; }
                    if (this.u7.compareAndSet(r6, r6.remove(r8)) == false) { $pc28 = 15; continue $sw28; }
                    $pc28 = 20; continue $sw28;
                }
                case 20: {
                    r9 = v5(r1) - 2;
                    j6(Zo(r1), r9);
                    if (r0.j6().Hw() == false) { $pc28 = 23; continue $sw28; }
                    r7.QX();
                    j6(Hw(r1), r9);
                    $pc28 = 23; continue $sw28;
                }
                case 23: {
                    this.EQ.incrementAndGet();
                    Hw();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(abcd.C1117oH r3, abcd.LG r4) {
        abcd.yE r0 = r3.v5().Hw();
        j6(new abcd.nH.f(r4, r3.VH().v5().getName(), r0));
    }

    void j6(abcd.C1117oH r1, abcd.LG r2, java.lang.String r3) {
        j6(j6(r2, r1.VH().getName(), r3));
        Hw();
    }
}
