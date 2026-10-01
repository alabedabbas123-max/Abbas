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
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (j6 == false) { $pc0 = 5; continue $sw0; }
                        abcd.wu.j6(1974883876875097528L, null, new java.lang.Object[]{r6, r7, r8, r9, r10, r11, r12, r13});
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
                        this.tp = r6;
                        this.v5 = r8;
                        this.Zo = r9;
                        this.VH = r10;
                        this.gn = r11;
                        this.Hw = r12;
                        this.FH = r7;
                        this.u7 = r13;
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = 1669136765763900083L)
        private void DW(java.lang.String r12, java.lang.String r13) {
            java.util.zip.ZipFile r0 = null;
            java.util.Enumeration<? extends java.util.zip.ZipEntry> r1 = null;
            java.util.ArrayList r2 = null;
            int r3 = 0;
            java.util.zip.ZipEntry r4 = null;
            java.io.File r5 = null;
            boolean r6 = false;
            java.io.InputStream r7 = null;
            java.io.FileOutputStream r8 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 3;
            $sw1: while (true) {
                switch ($pc1) {
                    case 47: {
                        th = $ex1;
                        if (DW == false) { $pc1 = 52; continue $sw1; }
                        abcd.wu.j6(th, 6163114749508265008L, this, r12, r13);
                        $pc1 = 52; continue $sw1;
                    }
                    case 52: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc1 = 5; continue $sw1; }
                        try {
                            abcd.wu.j6(6163114749508265008L, this, r12, r13);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 47; continue $sw1;
                        }
                        $pc1 = 5; continue $sw1;
                    }
                    case 5: {
                        try {
                            r0 = new java.util.zip.ZipFile(r13);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 47; continue $sw1;
                        }
                        try {
                            r1 = r0.entries();
                            r2 = new java.util.ArrayList();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 44; continue $sw1;
                        }
                        $pc1 = 8; continue $sw1;
                    }
                    case 8: {
                        if (r1.hasMoreElements() == false) { $pc1 = 10; continue $sw1; }
                        try {
                            r2.add(r1.nextElement());
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 44; continue $sw1;
                        }
                        { $pc1 = 8; continue $sw1; }
                    }
                    case 10: {
                        r3 = 0;
                        $pc1 = 12; continue $sw1;
                    }
                    case 12: {
                        if (r3 >= r2.size()) { $pc1 = 42; continue $sw1; }
                        if (java.lang.Thread.interrupted() == true) { $pc1 = 41; continue $sw1; }
                        try {
                            r4 = (java.util.zip.ZipEntry) r2.get(r3);
                            r5 = new java.io.File(r12, r4.getName());
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 44; continue $sw1;
                        }
                        if (r4.isDirectory() == false) { $pc1 = 19; continue $sw1; }
                        try {
                            r5.mkdirs();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 44; continue $sw1;
                        }
                        $pc1 = 39; continue $sw1;
                    }
                    case 39: {
                        try {
                            abcd.Kj.j6(this.tp, (r3 * 100) / r2.size());
                            r3 = r3 + 1;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 44; continue $sw1;
                        }
                        { $pc1 = 12; continue $sw1; }
                    }
                    case 19: {
                        if (r5.exists() == true) { $pc1 = 21; continue $sw1; }
                        $pc1 = 25; continue $sw1;
                    }
                    case 25: {
                        r6 = false;
                        $pc1 = 26; continue $sw1;
                    }
                    case 26: {
                        if (r6 == true) { $pc1 = 39; continue $sw1; }
                        try {
                            j6(r12, r4.getName());
                            r7 = r0.getInputStream(r4);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 44; continue $sw1;
                        }
                        try {
                            r8 = new java.io.FileOutputStream(r5);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 36; continue $sw1;
                        }
                        try {
                            com.aide.common.Xa.j6(r7, r8, false);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 33; continue $sw1;
                        }
                        try {
                            r8.close();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 36; continue $sw1;
                        }
                        try {
                            r7.close();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 44; continue $sw1;
                        }
                        { $pc1 = 39; continue $sw1; }
                    }
                    case 33: {
                        th = $ex1;
                        try {
                            r8.close();
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 36; continue $sw1;
                        }
                    }
                    case 36: {
                        th = $ex1;
                        try {
                            r7.close();
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 44; continue $sw1;
                        }
                    }
                    case 21: {
                        if (r4.getSize() == (-1)) { $pc1 = 25; continue $sw1; }
                        if (r5.length() != r4.getSize()) { $pc1 = 25; continue $sw1; }
                        r6 = true;
                        { $pc1 = 26; continue $sw1; }
                    }
                    case 41: {
                        try {
                            throw new java.lang.InterruptedException();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 44; continue $sw1;
                        }
                    }
                    case 42: {
                        try {
                            r0.close();
                            new java.io.File(r13).delete();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 47; continue $sw1;
                        }
                        return;
                    }
                    case 44: {
                        th = $ex1;
                        try {
                            r0.close();
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 47; continue $sw1;
                        }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = -84815219172732432L)
        private void FH(java.lang.String r8, java.lang.String r9) {
            java.lang.String r0 = null;
            java.lang.String[] r1 = null;
            int r2 = 0;
            int r3 = 0;
            java.lang.String r4 = null;
            java.util.Iterator<java.lang.String> r5 = null;
            java.lang.String r6 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = 3;
            $sw2: while (true) {
                switch ($pc2) {
                    case 24: {
                        th = $ex2;
                        if (DW == false) { $pc2 = 29; continue $sw2; }
                        abcd.wu.j6(th, 1322617374622443525L, this, r8, r9);
                        $pc2 = 29; continue $sw2;
                    }
                    case 29: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc2 = 5; continue $sw2; }
                        try {
                            abcd.wu.j6(1322617374622443525L, this, r8, r9);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 24; continue $sw2;
                        }
                        $pc2 = 5; continue $sw2;
                    }
                    case 5: {
                        r0 = "";
                        try {
                            r1 = abcd.Kj.j6();
                            r2 = r1.length;
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 24; continue $sw2;
                        }
                        r3 = 0;
                        $pc2 = 6; continue $sw2;
                    }
                    case 6: {
                        if (r3 >= r2) { $pc2 = 12; continue $sw2; }
                        try {
                            r4 = r1[r3];
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 24; continue $sw2;
                        }
                        if (r9.contains(r4) == true) { $pc2 = 9; continue $sw2; }
                        try {
                            r3 = r3 + 1;
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 24; continue $sw2;
                        }
                        { $pc2 = 6; continue $sw2; }
                    }
                    case 9: {
                        r0 = r4;
                        $pc2 = 12; continue $sw2;
                    }
                    case 12: {
                        if (r0.isEmpty() == false) { $pc2 = 14; continue $sw2; }
                        return;
                    }
                    case 14: {
                        try {
                            r5 = abcd.Vl.v5(r8).iterator();
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 24; continue $sw2;
                        }
                        $pc2 = 15; continue $sw2;
                    }
                    case 15: {
                        if (r5.hasNext() == false) { $pc2 = 23; continue $sw2; }
                        try {
                            r6 = r5.next();
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 24; continue $sw2;
                        }
                        if (r6.contains(r0) == false) { $pc2 = 15; continue $sw2; }
                        if (r6.contains(r9) == true) { $pc2 = 15; continue $sw2; }
                        try {
                            abcd.Vl.FH(r6);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 24; continue $sw2;
                        }
                        { $pc2 = 15; continue $sw2; }
                    }
                    case 23: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        static java.lang.Runnable j6(abcd.Kj.a r0) {
            return r0.u7;
        }

        @abcd.Interfacesu(method = -4271541019289853188L)
        private void j6(java.lang.String r8, java.lang.String r9) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = 3;
            $sw3: while (true) {
                switch ($pc3) {
                    case 7: {
                        th = $ex3;
                        if (DW == false) { $pc3 = 11; continue $sw3; }
                        abcd.wu.j6(th, -3941310768045594229L, this, r8, r9);
                        $pc3 = 11; continue $sw3;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc3 = 5; continue $sw3; }
                        try {
                            abcd.wu.j6(-3941310768045594229L, this, r8, r9);
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 7; continue $sw3;
                        }
                        $pc3 = 5; continue $sw3;
                    }
                    case 5: {
                        try {
                            new java.io.File(r8, r9).getParentFile().mkdirs();
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 7; continue $sw3;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public java.lang.Void call() {
            return call2();
        }

        @Override
        @abcd.Interfacesu(method = 2343864346493592160L)
        public java.lang.Void call2() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = 4;
            $sw4: while (true) {
                switch ($pc4) {
                    case 9: {
                        th = $ex4;
                        if (DW == false) { $pc4 = 13; continue $sw4; }
                        abcd.wu.j6(th, 2173232752141261023L, this);
                        $pc4 = 13; continue $sw4;
                    }
                    case 13: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc4 = 6; continue $sw4; }
                        try {
                            abcd.wu.j6(2173232752141261023L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 9; continue $sw4;
                        }
                        $pc4 = 6; continue $sw4;
                    }
                    case 6: {
                        try {
                            j6();
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 9; continue $sw4;
                        }
                        return null;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = 1428980225888223099L)
        public void j6() {
            java.io.IOException e = null;
            int r2 = 0;
            java.lang.String r5 = null;
            java.lang.String r6 = null;
            boolean r8 = false;
            boolean r7 = false;
            java.io.File r10 = null;
            int r12 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex5 = null;
            int $pc5 = 4;
            $sw5: while (true) {
                switch ($pc5) {
                    case 38: {
                        th = $ex5;
                        if (DW == false) { $pc5 = 43; continue $sw5; }
                        abcd.wu.j6(th, 1172204763922790700L, this);
                        $pc5 = 43; continue $sw5;
                    }
                    case 43: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc5 = 7; continue $sw5; }
                        try {
                            abcd.wu.j6(1172204763922790700L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 38; continue $sw5;
                        }
                        $pc5 = 7; continue $sw5;
                    }
                    case 7: {
                        if (new java.io.File(this.Hw).isDirectory() == false) { $pc5 = 9; continue $sw5; }
                        $pc5 = 13; continue $sw5;
                    }
                    case 13: {
                        e = null;
                        r2 = 0;
                        $pc5 = 15; continue $sw5;
                    }
                    case 15: {
                        if (r2 >= this.v5.size()) { $pc5 = 34; continue $sw5; }
                        try {
                            r5 = this.v5.get(r2);
                            r6 = this.Zo.get(r2);
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            if ($t instanceof java.io.IOException) { $pc5 = 32; continue $sw5; }
                            $pc5 = 38; continue $sw5;
                        }
                        r8 = true;
                        if (this.VH != null) { $pc5 = 19; continue $sw5; }
                        $pc5 = 21; continue $sw5;
                    }
                    case 21: {
                        r7 = false;
                        $pc5 = 23; continue $sw5;
                    }
                    case 23: {
                        if (this.gn != null) { $pc5 = 25; continue $sw5; }
                        $pc5 = 27; continue $sw5;
                    }
                    case 27: {
                        r8 = false;
                        $pc5 = 28; continue $sw5;
                    }
                    case 28: {
                        try {
                            r10 = new java.io.File(new java.io.File(this.Hw, r6).getPath() + ".tmp");
                            r12 = r2 * 100;
                            abcd.Kj.j6(this.tp, "Downloading " + r6, r12 / this.v5.size(), 0);
                            abcd.Kj.j6(this.tp, r5, r10.getPath(), r7);
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            if ($t instanceof java.io.IOException) { $pc5 = 32; continue $sw5; }
                            $pc5 = 38; continue $sw5;
                        }
                        if (r8 == false) { $pc5 = 33; continue $sw5; }
                        try {
                            abcd.Kj.j6(this.tp, "Extracting " + r6, r12 / this.v5.size(), 0);
                            DW(this.Hw + "/" + r6, r10.getPath());
                            r10.delete();
                            abcd.Kj.j6(this.tp, "Removing old libraries", r12 / this.v5.size(), 50);
                            FH(this.Hw, r6);
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            if ($t instanceof java.io.IOException) { $pc5 = 32; continue $sw5; }
                            $pc5 = 38; continue $sw5;
                        }
                        $pc5 = 33; continue $sw5;
                    }
                    case 33: {
                        r2 = r2 + 1;
                        { $pc5 = 15; continue $sw5; }
                    }
                    case 25: {
                        if (this.gn.get(r2).booleanValue() == false) { $pc5 = 27; continue $sw5; }
                        $pc5 = 19; continue $sw5;
                    }
                    case 19: {
                        if (this.VH.get(r2).booleanValue() == false) { $pc5 = 21; continue $sw5; }
                        r7 = true;
                        $pc5 = 32; continue $sw5;
                    }
                    case 32: {
                        e = e;
                        { $pc5 = 33; continue $sw5; }
                    }
                    case 34: {
                        if (e != null) { $pc5 = 37; continue $sw5; }
                        try {
                            com.aide.ui.U.j6(new abcd.RunnableJj(this));
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 38; continue $sw5;
                        }
                        return;
                    }
                    case 37: {
                        try {
                            throw e;
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 38; continue $sw5;
                        }
                    }
                    case 9: {
                        if (new java.io.File(this.Hw).mkdirs() == true) { $pc5 = 13; continue $sw5; }
                        try {
                            throw new java.io.IOException("Could not create directory: " + this.Hw);
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 38; continue $sw5;
                        }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            java.lang.Throwable th = null;
            java.lang.Throwable $ex6 = null;
            int $pc6 = 3;
            $sw6: while (true) {
                switch ($pc6) {
                    case 7: {
                        th = $ex6;
                        if (DW == false) { $pc6 = 11; continue $sw6; }
                        abcd.wu.j6(th, 730983366186194460L, null, r11, r12, r13, r14, r15);
                        $pc6 = 11; continue $sw6;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc6 = 5; continue $sw6; }
                        try {
                            abcd.wu.j6(730983366186194460L, null, r11, r12, r13, r14, r15);
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 7; continue $sw6;
                        }
                        $pc6 = 5; continue $sw6;
                    }
                    case 5: {
                        try {
                            this.VH = r11;
                            this.FH = r12;
                            this.Hw = r15;
                            this.v5 = r13;
                            this.Zo = r14;
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 7; continue $sw6;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            java.lang.String r2 = null;
            java.lang.String r3 = null;
            java.lang.String r4 = null;
            java.util.ArrayList r7 = null;
            java.util.Iterator<abcd.Be.m> r8 = null;
            abcd.Be.m r9 = null;
            java.util.Iterator<abcd.Be.g> r10 = null;
            boolean r11 = false;
            boolean r12 = false;
            int r13 = 0;
            abcd.Be.g r14 = null;
            java.util.Iterator r15 = null;
            abcd.Be.m r16 = null;
            java.lang.String r5 = null;
            java.lang.String r6 = null;
            java.lang.String r17 = null;
            java.lang.String r18 = null;
            java.lang.String r19 = null;
            java.lang.String r20 = null;
            java.lang.String r110 = null;
            java.lang.String r21 = null;
            java.lang.String r111 = null;
            java.lang.String r22 = null;
            java.lang.String r112 = null;
            java.lang.String r113 = null;
            abcd.Kj r23 = null;
            java.util.ArrayList r114 = null;
            java.lang.StringBuilder r24 = null;
            java.util.Iterator<abcd.Be.g> r25 = null;
            java.lang.String r26 = null;
            int r27 = 0;
            int r115 = 0;
            java.lang.String r116 = null;
            java.lang.String r117 = null;
            java.lang.String r118 = null;
            java.util.ArrayList r119 = null;
            java.util.Iterator<abcd.Be.g> r28 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex7 = null;
            int $pc7 = -1;
            $sw7: while (true) {
                switch ($pc7) {
                    case -1: {
                        r2 = ".jar";
                        r3 = ".aar";
                        r4 = ".pom";
                        $pc7 = 80; continue $sw7;
                    }
                    case 80: {
                        th = $ex7;
                        if (DW == false) { $pc7 = 85; continue $sw7; }
                        abcd.wu.j6(th, -1470332521460336188L, this);
                        $pc7 = 85; continue $sw7;
                    }
                    case 85: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc7 = 6; continue $sw7; }
                        try {
                            abcd.wu.j6(-1470332521460336188L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 80; continue $sw7;
                        }
                        $pc7 = 6; continue $sw7;
                    }
                    case 6: {
                        try {
                            r7 = new java.util.ArrayList();
                            r8 = this.Zo.iterator();
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 80; continue $sw7;
                        }
                        $pc7 = 8; continue $sw7;
                    }
                    case 8: {
                        if (r8.hasNext() == false) { $pc7 = 12; continue $sw7; }
                        try {
                            r9 = r8.next();
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 80; continue $sw7;
                        }
                        if (r7.contains(r9) == true) { $pc7 = 8; continue $sw7; }
                        try {
                            r7.add(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 80; continue $sw7;
                        }
                        { $pc7 = 8; continue $sw7; }
                    }
                    case 12: {
                        try {
                            r10 = this.v5.iterator();
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 80; continue $sw7;
                        }
                        r11 = false;
                        r12 = false;
                        r13 = 0;
                        $pc7 = 14; continue $sw7;
                    }
                    case 14: {
                        if (r10.hasNext() == false) { $pc7 = 77; continue $sw7; }
                        try {
                            r14 = r10.next();
                            r15 = r7.iterator();
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 80; continue $sw7;
                        }
                        $pc7 = 17; continue $sw7;
                    }
                    case 17: {
                        if (r15.hasNext() == false) { $pc7 = 71; continue $sw7; }
                        try {
                            r16 = (abcd.Be.m) r15.next();
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 80; continue $sw7;
                        }
                        try {
                            r5 = abcd.Jk.DW(r16, r14);
                            r6 = abcd.Jk.j6(r16, r14);
                            abcd.Kj.j6(this.VH, r5, r6, r11);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof java.io.IOException) { $pc7 = 66; continue $sw7; }
                            $pc7 = 80; continue $sw7;
                        }
                        if (new java.io.File(r6).exists() == false) { $pc7 = 63; continue $sw7; }
                        try {
                            r17 = ((abcd.He) new abcd.He().j6(r6)).FH(r14.tp);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof java.io.IOException) { $pc7 = 66; continue $sw7; }
                            $pc7 = 80; continue $sw7;
                        }
                        if (r17 == null) { $pc7 = 63; continue $sw7; }
                        try {
                            r18 = abcd.Jk.DW(r16, r14, r17, r4);
                            r19 = abcd.Jk.j6(r16, r14, r17, r4);
                            r20 = abcd.Jk.DW(r16, r14, r17, r3);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof java.io.IOException) { $pc7 = 66; continue $sw7; }
                            $pc7 = 80; continue $sw7;
                        }
                        r110 = r4;
                        try {
                            r21 = abcd.Jk.j6(r16, r14, r17, r3);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof java.io.IOException) { $pc7 = 62; continue $sw7; }
                            $pc7 = 80; continue $sw7;
                        }
                        r111 = r3;
                        try {
                            r22 = abcd.Jk.DW(r16, r14, r17, r2);
                            r112 = abcd.Jk.j6(r16, r14, r17, r2);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof java.io.IOException) { $pc7 = 61; continue $sw7; }
                            $pc7 = 80; continue $sw7;
                        }
                        r113 = r2;
                        if (new java.io.File(r112).exists() == true) { $pc7 = 34; continue $sw7; }
                        if (new java.io.File(r21).exists() == true) { $pc7 = 34; continue $sw7; }
                        $pc7 = 35; continue $sw7;
                    }
                    case 35: {
                        try {
                            r23 = this.VH;
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof java.io.IOException) { $pc7 = 92; continue $sw7; }
                            $pc7 = 80; continue $sw7;
                        }
                        r114 = r7;
                        try {
                            r24 = new java.lang.StringBuilder();
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof java.io.IOException) { $pc7 = 91; continue $sw7; }
                            $pc7 = 80; continue $sw7;
                        }
                        r25 = r10;
                        try {
                            r24.append(r14.gn);
                            r24.append(":");
                            r24.append(r14.u7);
                            r24.append(":");
                            r24.append(r17);
                            r26 = r24.toString();
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof java.io.IOException) { $pc7 = 90; continue $sw7; }
                            $pc7 = 80; continue $sw7;
                        }
                        r27 = r13 + 1;
                        r115 = r13 * 100;
                        try {
                            abcd.Kj.j6(r23, r26, r115 / this.v5.size(), 0);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof java.io.IOException) { $pc7 = 59; continue $sw7; }
                            $pc7 = 80; continue $sw7;
                        }
                        try {
                            abcd.Kj.j6(this.VH, r18, r19, true);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof java.io.IOException) { $pc7 = 89; continue $sw7; }
                            $pc7 = 80; continue $sw7;
                        }
                        try {
                            abcd.Kj.j6(this.VH, r20, r21, true);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof java.io.IOException) { $pc7 = 87; continue $sw7; }
                            $pc7 = 80; continue $sw7;
                        }
                        $pc7 = 95; continue $sw7;
                    }
                    case 95: {
                        try {
                            abcd.Kj.j6(this.VH, r22, r112, true);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof java.io.IOException) { $pc7 = 88; continue $sw7; }
                            $pc7 = 80; continue $sw7;
                        }
                        $pc7 = 53; continue $sw7;
                    }
                    case 53: {
                        if (new java.io.File(r112).exists() == true) { $pc7 = 57; continue $sw7; }
                        if (new java.io.File(r21).exists() == false) { $pc7 = 65; continue $sw7; }
                        $pc7 = 57; continue $sw7;
                    }
                    case 57: {
                        if (new java.io.File(r19).exists() == false) { $pc7 = 65; continue $sw7; }
                        r13 = r27;
                        r4 = r110;
                        r3 = r111;
                        r2 = r113;
                        r7 = r114;
                        r10 = r25;
                        r11 = false;
                        r12 = true;
                        $pc7 = 65; continue $sw7;
                    }
                    case 65: {
                        r13 = r27;
                        $pc7 = 70; continue $sw7;
                    }
                    case 70: {
                        r4 = r110;
                        r3 = r111;
                        r2 = r113;
                        r7 = r114;
                        r10 = r25;
                        r11 = false;
                        $pc7 = 68; continue $sw7;
                    }
                    case 68: {
                        r25 = r10;
                        $pc7 = 34; continue $sw7;
                    }
                    case 34: {
                        if (new java.io.File(r19).exists() == false) { $pc7 = 35; continue $sw7; }
                        $pc7 = 64; continue $sw7;
                    }
                    case 64: {
                        r114 = r7;
                        r25 = r10;
                        r27 = r13;
                        $pc7 = 67; continue $sw7;
                    }
                    case 67: {
                        r114 = r7;
                        $pc7 = 61; continue $sw7;
                    }
                    case 61: {
                        r113 = r2;
                        $pc7 = 62; continue $sw7;
                    }
                    case 62: {
                        r113 = r2;
                        r111 = r3;
                        $pc7 = 63; continue $sw7;
                    }
                    case 63: {
                        r113 = r2;
                        r111 = r3;
                        r110 = r4;
                        $pc7 = 66; continue $sw7;
                    }
                    case 66: {
                        r113 = r2;
                        r111 = r3;
                        r110 = r4;
                        { $pc7 = 67; continue $sw7; }
                    }
                    case 71: {
                        r116 = r2;
                        r117 = r3;
                        r118 = r4;
                        r119 = r7;
                        r28 = r10;
                        if (java.lang.Thread.interrupted() == true) { $pc7 = 76; continue $sw7; }
                        r4 = r118;
                        r3 = r117;
                        r2 = r116;
                        r7 = r119;
                        r10 = r28;
                        r11 = false;
                        { $pc7 = 14; continue $sw7; }
                    }
                    case 76: {
                        try {
                            throw new java.lang.InterruptedException();
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 80; continue $sw7;
                        }
                    }
                    case 77: {
                        try {
                            com.aide.ui.U.j6(new abcd.RunnableLj(this, r12));
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 80; continue $sw7;
                        }
                        return null;
                    }
                    case 59: {
                        $pc7 = 87; continue $sw7;
                    }
                    case 87: {
                        $pc7 = 88; continue $sw7;
                    }
                    case 88: {
                        $pc7 = 89; continue $sw7;
                    }
                    case 89: {
                        $pc7 = 90; continue $sw7;
                    }
                    case 90: {
                        $pc7 = 91; continue $sw7;
                    }
                    case 91: {
                        $pc7 = 92; continue $sw7;
                    }
                    case 92: {
                        throw new java.lang.IllegalStateException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            java.lang.Throwable th = null;
            java.lang.Throwable $ex8 = null;
            int $pc8 = 3;
            $sw8: while (true) {
                switch ($pc8) {
                    case 7: {
                        th = $ex8;
                        if (DW == false) { $pc8 = 11; continue $sw8; }
                        abcd.wu.j6(th, 7756105238798265680L, null, r9, r10, r11);
                        $pc8 = 11; continue $sw8;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc8 = 5; continue $sw8; }
                        try {
                            abcd.wu.j6(7756105238798265680L, null, r9, r10, r11);
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 7; continue $sw8;
                        }
                        $pc8 = 5; continue $sw8;
                    }
                    case 5: {
                        try {
                            this.v5 = r9;
                            this.FH = r11;
                            this.Hw = r10;
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 7; continue $sw8;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            java.io.File r4 = null;
            java.lang.String r5 = null;
            java.io.File r1 = null;
            java.util.List r7 = null;
            abcd.InterfacePl r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex9 = null;
            int $pc9 = 4;
            $sw9: while (true) {
                switch ($pc9) {
                    case 23: {
                        th = $ex9;
                        if (DW == false) { $pc9 = 27; continue $sw9; }
                        abcd.wu.j6(th, 2129064633578234068L, this);
                        $pc9 = 27; continue $sw9;
                    }
                    case 27: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc9 = 6; continue $sw9; }
                        try {
                            abcd.wu.j6(2129064633578234068L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 23; continue $sw9;
                        }
                        $pc9 = 6; continue $sw9;
                    }
                    case 6: {
                        try {
                            r4 = com.aide.ui.build.android.Q.FH();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 23; continue $sw9;
                        }
                        if (r4.isDirectory() == false) { $pc9 = 9; continue $sw9; }
                        $pc9 = 13; continue $sw9;
                    }
                    case 13: {
                        try {
                            abcd.Kj.j6(this.v5, "Installing NDK support (might take several minutes)", 0, 0);
                            r5 = new java.io.File(r4, "busybox").getPath();
                            abcd.Kj.j6(this.Hw, "busybox", r5);
                            r1 = new java.io.File(this.FH, "ndkinstall.sh");
                            abcd.Kj.j6(this.Hw, "ndkinstall.sh", r1.getPath());
                            abcd.Kj.j6(this.v5, r5);
                            r7 = java.util.Arrays.asList(new java.lang.String[]{r5, "ash", r1.getPath(), com.aide.ui.build.android.Q.v5()});
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 23; continue $sw9;
                        }
                        if (java.lang.Thread.interrupted() == true) { $pc9 = 22; continue $sw9; }
                        try {
                            r0 = abcd.Rl.j6(r7, r4.getPath(), null, true, null, null);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 23; continue $sw9;
                        }
                        if (r0.DW() != 0) { $pc9 = 20; continue $sw9; }
                        try {
                            r1.delete();
                            com.aide.ui.U.j6(new abcd.RunnableC0285Nj(this));
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 23; continue $sw9;
                        }
                        return null;
                    }
                    case 20: {
                        try {
                            throw new java.io.IOException(abcd.Kj.j6(this.v5, r0.j6(), r0.DW()));
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 23; continue $sw9;
                        }
                    }
                    case 22: {
                        try {
                            throw new java.lang.InterruptedException();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 23; continue $sw9;
                        }
                    }
                    case 9: {
                        if (r4.mkdirs() == true) { $pc9 = 13; continue $sw9; }
                        try {
                            throw new java.io.IOException("Could not create directory: " + r4.getPath());
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 23; continue $sw9;
                        }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            java.lang.Throwable th = null;
            java.lang.Throwable $ex10 = null;
            int $pc10 = 3;
            $sw10: while (true) {
                switch ($pc10) {
                    case 7: {
                        th = $ex10;
                        if (DW == false) { $pc10 = 11; continue $sw10; }
                        abcd.wu.j6(th, -1596322257627964476L, null, r9, r10, r11);
                        $pc10 = 11; continue $sw10;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc10 = 5; continue $sw10; }
                        try {
                            abcd.wu.j6(-1596322257627964476L, null, r9, r10, r11);
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 7; continue $sw10;
                        }
                        $pc10 = 5; continue $sw10;
                    }
                    case 5: {
                        try {
                            this.Hw = r9;
                            super(r11);
                            this.FH = r10;
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 7; continue $sw10;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        static android.app.Activity j6(abcd.Kj.d r0) {
            return r0.FH;
        }

        @Override
        @abcd.Interfacesu(method = -2305601103037444791L)
        protected void done() {
            java.lang.Throwable e = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex11 = null;
            int $pc11 = 4;
            $sw11: while (true) {
                switch ($pc11) {
                    case 16: {
                        th = $ex11;
                        if (DW == false) { $pc11 = 20; continue $sw11; }
                        abcd.wu.j6(th, -1387865085839080236L, this);
                        $pc11 = 20; continue $sw11;
                    }
                    case 20: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc11 = 7; continue $sw11; }
                        try {
                            abcd.wu.j6(-1387865085839080236L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 16; continue $sw11;
                        }
                        $pc11 = 7; continue $sw11;
                    }
                    case 7: {
                        if (isCancelled() == false) { $pc11 = 22; continue $sw11; }
                        try {
                            com.aide.ui.U.j6(new abcd.RunnableRj(this));
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 16; continue $sw11;
                        }
                        return;
                    }
                    case 22: {
                        try {
                            get();
                            com.aide.ui.U.j6(new abcd.RunnableOj(this));
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            if ($t instanceof java.util.concurrent.ExecutionException) { $pc11 = 10; continue $sw11; }
                            if ($t instanceof java.lang.InterruptedException) { $pc11 = 12; continue $sw11; }
                            $pc11 = 16; continue $sw11;
                        }
                        $pc11 = 26; continue $sw11;
                    }
                    case 26: {
                        return;
                    }
                    case 12: {
                        e = $ex11;
                        try {
                            com.aide.common.ClassH.DW(e);
                            com.aide.ui.U.j6(new abcd.RunnableC0317Pj(this, e));
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 16; continue $sw11;
                        }
                        return;
                    }
                    case 10: {
                        e = $ex11;
                        try {
                            com.aide.common.ClassH.DW(e);
                            com.aide.ui.U.j6(new abcd.RunnableC0333Qj(this, e));
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 16; continue $sw11;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public interface e {
        void FH();

        void j6();
    }

    static {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    try {
                        abcd.wu.j6(abcd.Kj.class, 144659656370786727L, 144659656370786727L);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 8; continue $sw12;
                    }
                    if (DW == false) { $pc12 = 6; continue $sw12; }
                    try {
                        abcd.wu.j6(-1734812296278077355L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 8; continue $sw12;
                    }
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    try {
                        j6 = new java.lang.String[]{"google_m2repository", "android_m2repository"};
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 8; continue $sw12;
                    }
                    return;
                }
                case 8: {
                    th = $ex12;
                    if (FH == false) { $pc12 = 12; continue $sw12; }
                    abcd.wu.j6(th, -1734812296278077355L, null);
                    $pc12 = 12; continue $sw12;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public Kj() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 8: {
                    th = $ex13;
                    if (FH == false) { $pc13 = 12; continue $sw13; }
                    abcd.wu.j6(th, 3401377218976517560L, null);
                    $pc13 = 12; continue $sw13;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc13 = 6; continue $sw13; }
                    try {
                        abcd.wu.j6(3401377218976517560L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 8; continue $sw13;
                    }
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    try {
                        this.Hw = new java.util.ArrayList();
                        this.v5 = java.util.concurrent.Executors.newSingleThreadExecutor();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 8; continue $sw13;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        long r2 = 0L;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 11: {
                    th = $ex14;
                    if (FH == false) { $pc14 = 15; continue $sw14; }
                    abcd.wu.j6(th, -2857012969847673951L, this, new java.lang.Integer(r10));
                    $pc14 = 15; continue $sw14;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc14 = 6; continue $sw14; }
                    try {
                        abcd.wu.j6(-2857012969847673951L, this, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 11; continue $sw14;
                    }
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    try {
                        r2 = java.lang.System.currentTimeMillis();
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 11; continue $sw14;
                    }
                    if ((r2 - this.EQ) >= 1000) { $pc14 = 9; continue $sw14; }
                    return;
                }
                case 9: {
                    try {
                        this.EQ = r2;
                        com.aide.ui.U.j6(new abcd.Runnablexj(this, r10));
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 11; continue $sw14;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 628017763248795663L)
    private void DW(android.app.Activity r8, java.lang.String r9) {
        java.io.File r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 3;
        $sw15: while (true) {
            switch ($pc15) {
                case 19: {
                    th = $ex15;
                    if (FH == false) { $pc15 = 24; continue $sw15; }
                    abcd.wu.j6(th, -938275142224642797L, this, r8, r9);
                    $pc15 = 24; continue $sw15;
                }
                case 24: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc15 = 5; continue $sw15; }
                    try {
                        abcd.wu.j6(-938275142224642797L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 19; continue $sw15;
                    }
                    $pc15 = 5; continue $sw15;
                }
                case 5: {
                    try {
                        r0 = new java.io.File(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 19; continue $sw15;
                    }
                    if (r0.isAbsolute() == true) { $pc15 = 8; continue $sw15; }
                    return;
                }
                case 8: {
                    if (r0 == null) { $pc15 = 12; continue $sw15; }
                    if (r0.exists() == true) { $pc15 = 12; continue $sw15; }
                    try {
                        r0 = r0.getParentFile();
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 19; continue $sw15;
                    }
                    $pc15 = 12; continue $sw15;
                }
                case 12: {
                    if (r0 != null) { $pc15 = 15; continue $sw15; }
                    return;
                }
                case 15: {
                    if (j6(r0.getPath(), com.aide.ui.activities.Enumo.aM()) == true) { $pc15 = 17; continue $sw15; }
                    try {
                        com.aide.common.Abstractma.j6(r8, "Download documents", "There doesn't seem to be enough space on the file system, at least" + ((com.aide.ui.activities.Enumo.aM() / 1000) / 1000) + "MB，是否继续？", new abcd.RunnableBj(this, r8, r9), null);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 19; continue $sw15;
                    }
                    return;
                }
                case 17: {
                    try {
                        FH(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 19; continue $sw15;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 5229319481629725800L)
    @android.annotation.SuppressLint({"NewApi"})
    private static void DW(android.content.Context r9, java.lang.String r10, java.lang.String r11) {
        java.io.InputStream r0 = null;
        java.lang.Throwable r1 = null;
        java.io.FileOutputStream r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 3;
        $sw16: while (true) {
            switch ($pc16) {
                case 38: {
                    th = $ex16;
                    if (FH == false) { $pc16 = 42; continue $sw16; }
                    abcd.wu.j6(th, -359937338776396056L, null, r9, r10, r11);
                    $pc16 = 42; continue $sw16;
                }
                case 42: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc16 = 5; continue $sw16; }
                    try {
                        abcd.wu.j6(-359937338776396056L, null, r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 38; continue $sw16;
                    }
                    $pc16 = 5; continue $sw16;
                }
                case 5: {
                    try {
                        r0 = r9.createPackageContext("com.aide.ndk", 0).getAssets().open(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 38; continue $sw16;
                    }
                    r1 = null;
                    try {
                        r2 = new java.io.FileOutputStream(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc16 = 28; continue $sw16; }
                        $pc16 = 26; continue $sw16;
                    }
                    try {
                        com.aide.common.Xa.j6(r0, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc16 = 15; continue $sw16; }
                        $pc16 = 13; continue $sw16;
                    }
                    try {
                        r2.close();
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc16 = 28; continue $sw16; }
                        $pc16 = 26; continue $sw16;
                    }
                    if (r0 == null) { $pc16 = 54; continue $sw16; }
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 38; continue $sw16;
                    }
                    return;
                }
                case 54: {
                    return;
                }
                case 13: {
                    th = th;
                    r4 = null;
                    $pc16 = 19; continue $sw16;
                }
                case 19: {
                    if (r4 != null) { $pc16 = 47; continue $sw16; }
                    try {
                        r2.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc16 = 28; continue $sw16; }
                        $pc16 = 26; continue $sw16;
                    }
                }
                case 47: {
                    try {
                        r2.close();
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc16 = 26; continue $sw16; }
                        $pc16 = 22; continue $sw16;
                    }
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc16 = 28; continue $sw16; }
                        $pc16 = 26; continue $sw16;
                    }
                }
                case 22: {
                    th = $ex16;
                    try {
                        r4.addSuppressed(th);
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc16 = 28; continue $sw16; }
                        $pc16 = 26; continue $sw16;
                    }
                }
                case 15: {
                    th = $ex16;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 17; continue $sw16;
                    }
                }
                case 17: {
                    th = $ex16;
                    r4 = th;
                    th = th;
                    $pc16 = 28; continue $sw16;
                }
                case 28: {
                    th = $ex16;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 26; continue $sw16;
                    }
                }
                case 26: {
                    th = $ex16;
                    if (r0 == null) { $pc16 = 37; continue $sw16; }
                    if (0 != 0) { $pc16 = 50; continue $sw16; }
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 38; continue $sw16;
                    }
                    { $pc16 = 37; continue $sw16; }
                }
                case 50: {
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 34; continue $sw16;
                    }
                    $pc16 = 34; continue $sw16;
                }
                case 34: {
                    th = $ex16;
                    try {
                        r1.addSuppressed(th);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 38; continue $sw16;
                    }
                    $pc16 = 37; continue $sw16;
                }
                case 37: {
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 38; continue $sw16;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = 4;
        $sw17: while (true) {
            switch ($pc17) {
                case 12: {
                    th = $ex17;
                    if (FH == false) { $pc17 = 16; continue $sw17; }
                    abcd.wu.j6(th, 94216401131110128L, this, r5);
                    $pc17 = 16; continue $sw17;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc17 = 7; continue $sw17; }
                    try {
                        abcd.wu.j6(94216401131110128L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 12; continue $sw17;
                    }
                    $pc17 = 7; continue $sw17;
                }
                case 7: {
                    if (this.Zo == null) { $pc17 = 10; continue $sw17; }
                    try {
                        com.aide.common.Abstractma.j6(r5, new abcd.C0315Ph());
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 12; continue $sw17;
                    }
                    return;
                }
                case 10: {
                    try {
                        DW(r5, abcd.Vl.Zo() + "/docs");
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 12; continue $sw17;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1035600556512919824L)
    private void FH(android.app.Activity r12, java.lang.String r13) {
        java.util.ArrayList r4 = null;
        java.util.ArrayList r5 = null;
        java.util.ArrayList r6 = null;
        com.aide.ui.activities.Enumo[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        com.aide.ui.activities.Enumo r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = 3;
        $sw18: while (true) {
            switch ($pc18) {
                case 18: {
                    th = $ex18;
                    if (FH == false) { $pc18 = 23; continue $sw18; }
                    abcd.wu.j6(th, -635227546968661536L, this, r12, r13);
                    $pc18 = 23; continue $sw18;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc18 = 5; continue $sw18; }
                    try {
                        abcd.wu.j6(-635227546968661536L, this, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 18; continue $sw18;
                    }
                    $pc18 = 5; continue $sw18;
                }
                case 5: {
                    try {
                        com.aide.ui.aa.Hw(r13);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 18; continue $sw18;
                    }
                    if (this.Zo == null) { $pc18 = 8; continue $sw18; }
                    try {
                        this.Zo.cancel(true);
                        this.Zo = null;
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 18; continue $sw18;
                    }
                    $pc18 = 8; continue $sw18;
                }
                case 8: {
                    try {
                        r4 = new java.util.ArrayList();
                        r5 = new java.util.ArrayList();
                        r6 = new java.util.ArrayList();
                        r0 = com.aide.ui.activities.Enumo.Mr();
                        r1 = r0.length;
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 18; continue $sw18;
                    }
                    r2 = 0;
                    $pc18 = 9; continue $sw18;
                }
                case 9: {
                    if (r2 >= r1) { $pc18 = 16; continue $sw18; }
                    try {
                        r3 = r0[r2];
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 18; continue $sw18;
                    }
                    if (r3.Zo() == null) { $pc18 = 15; continue $sw18; }
                    if (r4.contains(r3.VH()) == true) { $pc18 = 15; continue $sw18; }
                    try {
                        r4.add(r3.VH());
                        r5.add(r3.Zo());
                        r6.add(java.lang.Boolean.valueOf(r3.Hw()));
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 18; continue $sw18;
                    }
                    $pc18 = 15; continue $sw18;
                }
                case 15: {
                    try {
                        r2 = r2 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 18; continue $sw18;
                    }
                    { $pc18 = 9; continue $sw18; }
                }
                case 16: {
                    try {
                        this.Zo = new abcd.Kj.d(this, r12, new abcd.Kj.a(this, r12, r4, r5, r6, null, r13, new abcd.RunnableCj(this)));
                        this.u7 = "Installation documentation";
                        this.v5.execute(this.Zo);
                        com.aide.common.Abstractma.j6(r12, new abcd.C0315Ph());
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 18; continue $sw18;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void Hw(abcd.Kj r0) {
        r0.u7();
    }

    @abcd.Interfacesu(method = 2760131776093308360L)
    private void Hw(android.app.Activity r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = 4;
        $sw19: while (true) {
            switch ($pc19) {
                case 8: {
                    th = $ex19;
                    if (FH == false) { $pc19 = 12; continue $sw19; }
                    abcd.wu.j6(th, -1149880843046871000L, this, r5);
                    $pc19 = 12; continue $sw19;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc19 = 6; continue $sw19; }
                    try {
                        abcd.wu.j6(-1149880843046871000L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 8; continue $sw19;
                    }
                    $pc19 = 6; continue $sw19;
                }
                case 6: {
                    try {
                        j6(r5, "Download documents", new abcd.RunnableAj(this, r5));
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 8; continue $sw19;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 4575825327920922467L)
    private void gn() {
        java.util.Iterator<abcd.Kj.e> r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = 4;
        $sw20: while (true) {
            switch ($pc20) {
                case 12: {
                    th = $ex20;
                    if (FH == false) { $pc20 = 17; continue $sw20; }
                    abcd.wu.j6(th, 3106041240484178775L, this);
                    $pc20 = 17; continue $sw20;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc20 = 6; continue $sw20; }
                    try {
                        abcd.wu.j6(3106041240484178775L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 12; continue $sw20;
                    }
                    $pc20 = 6; continue $sw20;
                }
                case 6: {
                    try {
                        r2 = this.Hw.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 12; continue $sw20;
                    }
                    $pc20 = 7; continue $sw20;
                }
                case 7: {
                    if (r2.hasNext() == false) { $pc20 = 11; continue $sw20; }
                    try {
                        r2.next().FH();
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 12; continue $sw20;
                    }
                    { $pc20 = 7; continue $sw20; }
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.String r0 = null;
        java.lang.String r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = 3;
        $sw21: while (true) {
            switch ($pc21) {
                case 12: {
                    th = $ex21;
                    if (FH == false) { $pc21 = 16; continue $sw21; }
                    abcd.wu.j6(th, 4582069672216390136L, this, r8, new java.lang.Integer(r9));
                    $pc21 = 16; continue $sw21;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc21 = 5; continue $sw21; }
                    try {
                        abcd.wu.j6(4582069672216390136L, this, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 12; continue $sw21;
                    }
                    $pc21 = 5; continue $sw21;
                }
                case 5: {
                    r0 = "";
                    try {
                        r0 = com.aide.common.Xa.j6(new java.io.InputStreamReader(new java.io.ByteArrayInputStream(r8)));
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.io.IOException) { $pc21 = 17; continue $sw21; }
                        $pc21 = 12; continue $sw21;
                    }
                    $pc21 = 7; continue $sw21;
                }
                case 7: {
                    try {
                        r1 = r0.trim();
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 12; continue $sw21;
                    }
                    if (r1.length() == 0) { $pc21 = 10; continue $sw21; }
                    try {
                        r1 = r1 + '\n';
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 12; continue $sw21;
                    }
                    $pc21 = 10; continue $sw21;
                }
                case 10: {
                    return r1 + " ### binary exited with code " + r9;
                }
                case 17: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = 3;
        $sw22: while (true) {
            switch ($pc22) {
                case 10: {
                    th = $ex22;
                    if (FH == false) { $pc22 = 14; continue $sw22; }
                    abcd.wu.j6(th, -436815280658991083L, this, r8, r9);
                    $pc22 = 14; continue $sw22;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc22 = 6; continue $sw22; }
                    try {
                        abcd.wu.j6(-436815280658991083L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 10; continue $sw22;
                    }
                    $pc22 = 6; continue $sw22;
                }
                case 6: {
                    if (this.Zo == null) { $pc22 = 8; continue $sw22; }
                    try {
                        this.Zo.cancel(true);
                        this.Zo = null;
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 10; continue $sw22;
                    }
                    $pc22 = 8; continue $sw22;
                }
                case 8: {
                    try {
                        this.Zo = new abcd.Kj.d(this, r8, new abcd.Kj.c(this, r8, r9));
                        this.u7 = "Install support for native code (C / C + +)";
                        this.v5.execute(this.Zo);
                        com.aide.common.Abstractma.j6(r8, new abcd.C0315Ph());
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 10; continue $sw22;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -490872077590993365L)
    private void j6(android.app.Activity r9, java.lang.String r10, java.lang.Runnable r11) {
        android.net.NetworkInfo r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = 3;
        $sw23: while (true) {
            switch ($pc23) {
                case 22: {
                    th = $ex23;
                    if (FH == false) { $pc23 = 26; continue $sw23; }
                    abcd.wu.j6(th, 1911670666599768663L, this, r9, r10, r11);
                    $pc23 = 26; continue $sw23;
                }
                case 26: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc23 = 5; continue $sw23; }
                    try {
                        abcd.wu.j6(1911670666599768663L, this, r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 22; continue $sw23;
                    }
                    $pc23 = 5; continue $sw23;
                }
                case 5: {
                    try {
                        r0 = ((android.net.ConnectivityManager) r9.getSystemService("connectivity")).getActiveNetworkInfo();
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 22; continue $sw23;
                    }
                    if (r0 != null) { $pc23 = 8; continue $sw23; }
                    $pc23 = 20; continue $sw23;
                }
                case 20: {
                    try {
                        com.aide.common.Abstractma.j6(r9, r10, "There seems to be no active network connection. Do you want to continue?", r11, null);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 22; continue $sw23;
                    }
                    return;
                }
                case 8: {
                    if (r0.isConnectedOrConnecting() == false) { $pc23 = 20; continue $sw23; }
                    if (r0.getType() != 1) { $pc23 = 13; continue $sw23; }
                    $pc23 = 18; continue $sw23;
                }
                case 18: {
                    try {
                        r11.run();
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 22; continue $sw23;
                    }
                    return;
                }
                case 13: {
                    if (r0.getType() == 7) { $pc23 = 18; continue $sw23; }
                    if (r0.getType() == 9) { $pc23 = 18; continue $sw23; }
                    try {
                        com.aide.common.Abstractma.j6(r9, r10, "Do you want to continue downloading via mobile Internet?", r11, null);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 22; continue $sw23;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
        DW(r0, r1, r2);
    }

    @abcd.Interfacesu(method = -1993651585384904421L)
    private void j6(java.lang.String r20) {
        abcd.InterfacePl r11 = null;
        abcd.InterfacePl r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = 4;
        $sw24: while (true) {
            switch ($pc24) {
                case 21: {
                    th = $ex24;
                    if (FH == false) { $pc24 = 25; continue $sw24; }
                    abcd.wu.j6(th, -2514308002856759921L, this, r20);
                    $pc24 = 25; continue $sw24;
                }
                case 25: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc24 = 7; continue $sw24; }
                    try {
                        abcd.wu.j6(-2514308002856759921L, this, r20);
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 21; continue $sw24;
                    }
                    $pc24 = 7; continue $sw24;
                }
                case 7: {
                    if (java.lang.Thread.interrupted() == true) { $pc24 = 20; continue $sw24; }
                    try {
                        r11 = abcd.Rl.j6(java.util.Arrays.asList(new java.lang.String[]{"/system/bin/chmod", "755", r20}), null, null, true, null, null);
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        if ($t instanceof java.io.IOException) { $pc24 = 14; continue $sw24; }
                        $pc24 = 21; continue $sw24;
                    }
                    if (r11.DW() != 0) { $pc24 = 13; continue $sw24; }
                    return;
                }
                case 13: {
                    try {
                        throw new java.io.IOException("Could not make " + r20 + " executable - exit code " + r11.DW());
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        if ($t instanceof java.io.IOException) { $pc24 = 14; continue $sw24; }
                        $pc24 = 21; continue $sw24;
                    }
                }
                case 14: {
                    try {
                        r4 = abcd.Rl.j6(java.util.Arrays.asList(new java.lang.String[]{"/system/xbin/chmod", "755", r20}), null, null, true, null, null);
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 21; continue $sw24;
                    }
                    if (r4.DW() != 0) { $pc24 = 18; continue $sw24; }
                    return;
                }
                case 18: {
                    try {
                        throw new java.io.IOException("Could not make " + r20 + " executable - exit code " + r4.DW());
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 21; continue $sw24;
                    }
                }
                case 20: {
                    try {
                        throw new java.lang.InterruptedException();
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 21; continue $sw24;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 3718113849926677885L)
    private void j6(java.lang.String r9, int r10, int r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = 3;
        $sw25: while (true) {
            switch ($pc25) {
                case 7: {
                    th = $ex25;
                    if (FH == false) { $pc25 = 11; continue $sw25; }
                    abcd.wu.j6(th, -2508467732859247959L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc25 = 11; continue $sw25;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc25 = 5; continue $sw25; }
                    try {
                        abcd.wu.j6(-2508467732859247959L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 7; continue $sw25;
                    }
                    $pc25 = 5; continue $sw25;
                }
                case 5: {
                    try {
                        this.EQ = java.lang.System.currentTimeMillis();
                        com.aide.ui.U.j6(new abcd.Runnableyj(this, r9, r10, r11));
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 7; continue $sw25;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        abcd.Kj r8 = null;
        java.io.File r0 = null;
        long r1 = 0L;
        long r3 = 0L;
        int r11 = 0;
        java.net.HttpURLConnection r14 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> r15 = null;
        java.util.List<java.lang.String> r12 = null;
        long r13 = 0L;
        java.net.HttpURLConnection r16 = null;
        int r5 = 0;
        boolean r6 = false;
        java.lang.Object r17 = null;
        java.lang.StringBuilder r2 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = null;
        java.util.List<java.lang.String> r4 = null;
        java.io.FileOutputStream r9 = null;
        byte[] r10 = null;
        long r18 = 0L;
        int r19 = 0;
        long r21 = 0L;
        long r110 = 0L;
        int r111 = 0;
        long r24 = 0L;
        long r112 = 0L;
        long r20 = 0L;
        long r113 = 0L;
        long r22 = 0L;
        java.io.PrintStream r23 = null;
        java.lang.StringBuilder r114 = null;
        double r115 = 0.0d;
        double r25 = 0.0d;
        java.io.PrintStream r26 = null;
        java.lang.StringBuilder r27 = null;
        double r116 = 0.0d;
        double r28 = 0.0d;
        abcd.Kj r29 = null;
        int r33 = 0;
        java.net.HttpURLConnection r117 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = -1;
        $sw26: while (true) {
            switch ($pc26) {
                case -1: {
                    r8 = this;
                    $pc26 = 124; continue $sw26;
                }
                case 124: {
                    th = th;
                    $pc26 = 127; continue $sw26;
                }
                case 127: {
                    if (FH == false) { $pc26 = 130; continue $sw26; }
                    abcd.wu.j6(th, 980541538863681675L, this, r30, r31, new java.lang.Boolean(r32));
                    $pc26 = 130; continue $sw26;
                }
                case 130: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc26 = 148; continue $sw26; }
                    try {
                        abcd.wu.j6(980541538863681675L, this, r30, r31, new java.lang.Boolean(r32));
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 124; continue $sw26;
                    }
                    $pc26 = 148; continue $sw26;
                }
                case 148: {
                    if (java.lang.Thread.interrupted() == true) { $pc26 = 121; continue $sw26; }
                    try {
                        r0 = new java.io.File(r31);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 124; continue $sw26;
                    }
                    r1 = 0;
                    if (r32 == true) { $pc26 = 11; continue $sw26; }
                    $pc26 = 14; continue $sw26;
                }
                case 14: {
                    r3 = 0;
                    $pc26 = 15; continue $sw26;
                }
                case 15: {
                    r11 = 0;
                    if (r3 <= 0) { $pc26 = 32; continue $sw26; }
                    try {
                        r14 = (java.net.HttpURLConnection) new java.net.URL(r30).openConnection();
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 124; continue $sw26;
                    }
                    try {
                        r14.setRequestMethod("HEAD");
                        r14.setRequestProperty("Accept-Encoding", "identity");
                        r15 = r14.getHeaderFields();
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 29; continue $sw26;
                    }
                    if (r8.j6(r14.getResponseCode()) == false) { $pc26 = 27; continue $sw26; }
                    if (r15 == null) { $pc26 = 27; continue $sw26; }
                    try {
                        r12 = r15.get("content-Length");
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 29; continue $sw26;
                    }
                    if (r12 == null) { $pc26 = 27; continue $sw26; }
                    if (r12.isEmpty() == true) { $pc26 = 27; continue $sw26; }
                    try {
                        r13 = java.lang.Long.parseLong(r12.get(0));
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc26 = 132; continue $sw26; }
                        $pc26 = 29; continue $sw26;
                    }
                    $pc26 = 28; continue $sw26;
                }
                case 28: {
                    try {
                        r14.disconnect();
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 124; continue $sw26;
                    }
                    $pc26 = 34; continue $sw26;
                }
                case 34: {
                    if (r3 != r13) { $pc26 = 36; continue $sw26; }
                    return;
                }
                case 36: {
                    try {
                        r16 = (java.net.HttpURLConnection) new java.net.URL(r30).openConnection();
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 124; continue $sw26;
                    }
                    try {
                        r16.setRequestProperty("Accept-Encoding", "identity");
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 116; continue $sw26;
                    }
                    if (r13 > 0) { $pc26 = 40; continue $sw26; }
                    $pc26 = 44; continue $sw26;
                }
                case 44: {
                    try {
                        r5 = r16.getResponseCode();
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 116; continue $sw26;
                    }
                    $pc26 = 45; continue $sw26;
                }
                case 45: {
                    r6 = false;
                    $pc26 = 46; continue $sw26;
                }
                case 46: {
                    try {
                        r17 = r8.j6(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 116; continue $sw26;
                    }
                    if (r17 != 0) { $pc26 = 49; continue $sw26; }
                    r17 = r16;
                    try {
                        r2 = new java.lang.StringBuilder();
                        r2.append("HTTP connection to ");
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 114; continue $sw26;
                    }
                    try {
                        r2.append(r30);
                        r2.append(" failed with response code ");
                        r2.append(r5);
                        throw new java.io.IOException(r2.toString());
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 112; continue $sw26;
                    }
                }
                case 112: {
                    th = th;
                    $pc26 = 118; continue $sw26;
                }
                case 118: {
                    try {
                        r17.disconnect();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 122; continue $sw26;
                    }
                }
                case 49: {
                    if (r13 != (-1)) { $pc26 = 59; continue $sw26; }
                    try {
                        r7 = r16.getHeaderFields();
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 116; continue $sw26;
                    }
                    if (r7 == null) { $pc26 = 59; continue $sw26; }
                    try {
                        r4 = r7.get("content-Length");
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 116; continue $sw26;
                    }
                    if (r4 == null) { $pc26 = 59; continue $sw26; }
                    if (r4.isEmpty() == true) { $pc26 = 59; continue $sw26; }
                    try {
                        r13 = java.lang.Long.parseLong(r4.get(0));
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc26 = 58; continue $sw26; }
                        $pc26 = 116; continue $sw26;
                    }
                    $pc26 = 58; continue $sw26;
                }
                case 58: {
                    r13 = -1;
                    $pc26 = 59; continue $sw26;
                }
                case 59: {
                    if (r6 == true) { $pc26 = 146; continue $sw26; }
                    r3 = 0;
                    $pc26 = 146; continue $sw26;
                }
                case 146: {
                    try {
                        java.lang.System.currentTimeMillis();
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 106; continue $sw26;
                    }
                    if (r6 == true) { $pc26 = 64; continue $sw26; }
                    try {
                        new java.io.File(r31).delete();
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 116; continue $sw26;
                    }
                    $pc26 = 64; continue $sw26;
                }
                case 64: {
                    try {
                        new java.io.File(r31).getParentFile().mkdirs();
                        r9 = new java.io.FileOutputStream(r31, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 106; continue $sw26;
                    }
                    try {
                        r10 = new byte[32768];
                        r18 = java.lang.System.currentTimeMillis();
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 102; continue $sw26;
                    }
                    r19 = -1;
                    r21 = 0;
                    r110 = r18;
                    $pc26 = 67; continue $sw26;
                }
                case 67: {
                    try {
                        r111 = r16.getInputStream().read(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 102; continue $sw26;
                    }
                    if (r111 <= 0) { $pc26 = 96; continue $sw26; }
                    if (java.lang.Thread.interrupted() == true) { $pc26 = 93; continue $sw26; }
                    try {
                        r9.write(r10, r11, r111);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 102; continue $sw26;
                    }
                    r24 = r13;
                    try {
                        r1 = r1 + ((long) r111);
                        r112 = java.lang.System.currentTimeMillis();
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 102; continue $sw26;
                    }
                    r20 = r112 - r110;
                    if (r20 <= 5000) { $pc26 = 84; continue $sw26; }
                    r113 = r1 - r21;
                    r22 = r112 - r18;
                    try {
                        r23 = java.lang.System.out;
                        r114 = new java.lang.StringBuilder();
                        r114.append("Last 5 secs Average input bytes/sec: ");
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 80; continue $sw26;
                    }
                    r115 = r113;
                    java.lang.Double.isNaN(r115);
                    r25 = r20;
                    java.lang.Double.isNaN(r25);
                    try {
                        r114.append((r115 * 1000.0d) / r25);
                        r23.println(r114.toString());
                        r26 = java.lang.System.out;
                        r27 = new java.lang.StringBuilder();
                        r27.append("Total Average input bytes/sec: ");
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 80; continue $sw26;
                    }
                    r116 = r1;
                    java.lang.Double.isNaN(r116);
                    r28 = r22;
                    java.lang.Double.isNaN(r28);
                    try {
                        r27.append((r116 * 1000.0d) / r28);
                        r26.println(r27.toString());
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 80; continue $sw26;
                    }
                    r21 = r1;
                    r110 = r112;
                    $pc26 = 80; continue $sw26;
                }
                case 80: {
                    th = th;
                    $pc26 = 104; continue $sw26;
                }
                case 104: {
                    try {
                        r9.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 114; continue $sw26;
                    }
                }
                case 84: {
                    if (r24 != (-1)) { $pc26 = 86; continue $sw26; }
                    $pc26 = 90; continue $sw26;
                }
                case 90: {
                    r29 = this;
                    $pc26 = 91; continue $sw26;
                }
                case 91: {
                    r8 = r29;
                    r16 = r16;
                    r13 = r24;
                    r10 = r10;
                    r11 = 0;
                    { $pc26 = 67; continue $sw26; }
                }
                case 86: {
                    r33 = (int) (((r3 + r1) * 100) / r24);
                    if (r19 == r33) { $pc26 = 90; continue $sw26; }
                    r29 = this;
                    try {
                        r29.DW(r33);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 94; continue $sw26;
                    }
                    r19 = r33;
                    $pc26 = 94; continue $sw26;
                }
                case 94: {
                    th = th;
                    { $pc26 = 104; continue $sw26; }
                }
                case 93: {
                    try {
                        throw new java.lang.InterruptedException();
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 94; continue $sw26;
                    }
                }
                case 96: {
                    r117 = r16;
                    try {
                        r9.close();
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 114; continue $sw26;
                    }
                    try {
                        r117.disconnect();
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 100; continue $sw26;
                    }
                    return;
                }
                case 100: {
                    th = th;
                    $pc26 = 102; continue $sw26;
                }
                case 102: {
                    th = th;
                    $pc26 = 106; continue $sw26;
                }
                case 106: {
                    th = th;
                    r17 = r16;
                    $pc26 = 114; continue $sw26;
                }
                case 114: {
                    th = th;
                    { $pc26 = 118; continue $sw26; }
                }
                case 40: {
                    if (r3 <= 0) { $pc26 = 44; continue $sw26; }
                    try {
                        r16.setRequestProperty("Range", "bytes=" + r3 + "-");
                        r5 = r16.getResponseCode();
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 116; continue $sw26;
                    }
                    if (r5 != 206) { $pc26 = 45; continue $sw26; }
                    r6 = true;
                    $pc26 = 116; continue $sw26;
                }
                case 116: {
                    th = th;
                    r17 = r16;
                    { $pc26 = 118; continue $sw26; }
                }
                case 27: {
                    r13 = -1;
                    $pc26 = 29; continue $sw26;
                }
                case 29: {
                    th = $ex26;
                    try {
                        r14.disconnect();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 124; continue $sw26;
                    }
                }
                case 32: {
                    r13 = -1;
                    { $pc26 = 34; continue $sw26; }
                }
                case 11: {
                    if (r0.exists() == false) { $pc26 = 14; continue $sw26; }
                    try {
                        r3 = r0.length();
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 124; continue $sw26;
                    }
                    { $pc26 = 15; continue $sw26; }
                }
                case 121: {
                    try {
                        throw new java.lang.InterruptedException();
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 122; continue $sw26;
                    }
                }
                case 122: {
                    th = th;
                    { $pc26 = 127; continue $sw26; }
                }
                case 132: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 62385971052779160L)
    private boolean j6(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex27 = null;
        int $pc27 = 4;
        $sw27: while (true) {
            switch ($pc27) {
                case 13: {
                    th = $ex27;
                    if (FH == false) { $pc27 = 17; continue $sw27; }
                    abcd.wu.j6(th, 1102941307242553368L, this, new java.lang.Integer(r5));
                    $pc27 = 17; continue $sw27;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc27 = 7; continue $sw27; }
                    try {
                        abcd.wu.j6(1102941307242553368L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 13; continue $sw27;
                    }
                    $pc27 = 7; continue $sw27;
                }
                case 7: {
                    if (r5 >= 200) { $pc27 = 9; continue $sw27; }
                    $pc27 = 11; continue $sw27;
                }
                case 11: {
                    return false;
                }
                case 9: {
                    if (r5 >= 300) { $pc27 = 11; continue $sw27; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -5956746909814501608L)
    private boolean j6(java.lang.String r8, long r9) {
        android.os.StatFs r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex28 = null;
        int $pc28 = 3;
        $sw28: while (true) {
            switch ($pc28) {
                case 11: {
                    th = $ex28;
                    if (FH == false) { $pc28 = 15; continue $sw28; }
                    abcd.wu.j6(th, 5421331127921477760L, this, r8, new java.lang.Long(r9));
                    $pc28 = 15; continue $sw28;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc28 = 5; continue $sw28; }
                    try {
                        abcd.wu.j6(5421331127921477760L, this, r8, new java.lang.Long(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 11; continue $sw28;
                    }
                    $pc28 = 5; continue $sw28;
                }
                case 5: {
                    try {
                        r0 = new android.os.StatFs(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 11; continue $sw28;
                    }
                    if ((r0.getAvailableBlocks() * ((long) r0.getBlockSize())) <= r9) { $pc28 = 9; continue $sw28; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String[] j6() {
        return j6;
    }

    @abcd.Interfacesu(method = -6429436051174786783L)
    private void u7() {
        java.util.Iterator<abcd.Kj.e> r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex29 = null;
        int $pc29 = 4;
        $sw29: while (true) {
            switch ($pc29) {
                case 12: {
                    th = $ex29;
                    if (FH == false) { $pc29 = 17; continue $sw29; }
                    abcd.wu.j6(th, 5745705053264358605L, this);
                    $pc29 = 17; continue $sw29;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc29 = 6; continue $sw29; }
                    try {
                        abcd.wu.j6(5745705053264358605L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 12; continue $sw29;
                    }
                    $pc29 = 6; continue $sw29;
                }
                case 6: {
                    try {
                        r2 = this.Hw.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 12; continue $sw29;
                    }
                    $pc29 = 7; continue $sw29;
                }
                case 7: {
                    if (r2.hasNext() == false) { $pc29 = 11; continue $sw29; }
                    try {
                        r2.next().j6();
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 12; continue $sw29;
                    }
                    { $pc29 = 7; continue $sw29; }
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -7154755893037973880L)
    private void v5(android.app.Activity r7) {
        java.io.File r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex30 = null;
        int $pc30 = 4;
        $sw30: while (true) {
            switch ($pc30) {
                case 12: {
                    th = $ex30;
                    if (FH == false) { $pc30 = 16; continue $sw30; }
                    abcd.wu.j6(th, 1581038918728490352L, this, r7);
                    $pc30 = 16; continue $sw30;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc30 = 6; continue $sw30; }
                    try {
                        abcd.wu.j6(1581038918728490352L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 12; continue $sw30;
                    }
                    $pc30 = 6; continue $sw30;
                }
                case 6: {
                    try {
                        com.aide.ui.build.android.Q.DW();
                        r2 = new java.io.File(abcd.Vl.FH());
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 12; continue $sw30;
                    }
                    if (j6(abcd.Vl.Zo(), 750000000) == true) { $pc30 = 10; continue $sw30; }
                    try {
                        com.aide.common.Abstractma.j6(r7, "Download support for native code (C / C + +)", "There doesn't seem to be enough space on the internal memory, which requires at least 200MB.Continue?", new abcd.Runnablewj(this, r7, r2), null);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 12; continue $sw30;
                    }
                    return;
                }
                case 10: {
                    try {
                        j6(r7, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 12; continue $sw30;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex31 = null;
        int $pc31 = 4;
        $sw31: while (true) {
            switch ($pc31) {
                case 8: {
                    th = $ex31;
                    if (FH == false) { $pc31 = 12; continue $sw31; }
                    abcd.wu.j6(th, -1028873464844655003L, this);
                    $pc31 = 12; continue $sw31;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc31 = 6; continue $sw31; }
                    try {
                        abcd.wu.j6(-1028873464844655003L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 8; continue $sw31;
                    }
                    $pc31 = 6; continue $sw31;
                }
                case 6: {
                    try {
                        this.Zo.cancel(true);
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 8; continue $sw31;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(abcd.Kj.e r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex32 = null;
        int $pc32 = 4;
        $sw32: while (true) {
            switch ($pc32) {
                case 8: {
                    th = $ex32;
                    if (FH == false) { $pc32 = 12; continue $sw32; }
                    abcd.wu.j6(th, -117280532438165727L, this, r5);
                    $pc32 = 12; continue $sw32;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc32 = 6; continue $sw32; }
                    try {
                        abcd.wu.j6(-117280532438165727L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 8; continue $sw32;
                    }
                    $pc32 = 6; continue $sw32;
                }
                case 6: {
                    try {
                        this.Hw.remove(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 8; continue $sw32;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(android.app.Activity r7) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex33 = null;
        int $pc33 = 4;
        $sw33: while (true) {
            switch ($pc33) {
                case 11: {
                    th = $ex33;
                    if (FH == false) { $pc33 = 15; continue $sw33; }
                    abcd.wu.j6(th, 3009125045795206316L, this, r7);
                    $pc33 = 15; continue $sw33;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc33 = 7; continue $sw33; }
                    try {
                        abcd.wu.j6(3009125045795206316L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex33 = $t;
                        $pc33 = 11; continue $sw33;
                    }
                    $pc33 = 7; continue $sw33;
                }
                case 7: {
                    if (com.aide.ui.build.android.Q.VH() == false) { $pc33 = 9; continue $sw33; }
                    try {
                        com.aide.common.Abstractma.j6(r7, "Support for native code (C/C++)", "Uninstall support for native code?", new abcd.RunnableC0126Dj(this, r7), null);
                    } catch (java.lang.Throwable $t) {
                        $ex33 = $t;
                        $pc33 = 11; continue $sw33;
                    }
                    return;
                }
                case 9: {
                    try {
                        com.almlkaide.kaypro.manifesteditor.ndk.InstallNdk.a(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex33 = $t;
                        $pc33 = 11; continue $sw33;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String FH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex34 = null;
        int $pc34 = 4;
        $sw34: while (true) {
            switch ($pc34) {
                case 8: {
                    th = $ex34;
                    if (FH == false) { $pc34 = 12; continue $sw34; }
                    abcd.wu.j6(th, -258467314333153413L, this);
                    $pc34 = 12; continue $sw34;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc34 = 6; continue $sw34; }
                    try {
                        abcd.wu.j6(-258467314333153413L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 8; continue $sw34;
                    }
                    $pc34 = 6; continue $sw34;
                }
                case 6: {
                    return this.u7;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int Hw() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex35 = null;
        int $pc35 = 4;
        $sw35: while (true) {
            switch ($pc35) {
                case 8: {
                    th = $ex35;
                    if (FH == false) { $pc35 = 12; continue $sw35; }
                    abcd.wu.j6(th, -4719786361984446696L, this);
                    $pc35 = 12; continue $sw35;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc35 = 6; continue $sw35; }
                    try {
                        abcd.wu.j6(-4719786361984446696L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex35 = $t;
                        $pc35 = 8; continue $sw35;
                    }
                    $pc35 = 6; continue $sw35;
                }
                case 6: {
                    return this.VH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean VH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex36 = null;
        int $pc36 = 4;
        $sw36: while (true) {
            switch ($pc36) {
                case 11: {
                    th = $ex36;
                    if (FH == false) { $pc36 = 15; continue $sw36; }
                    abcd.wu.j6(th, -319444074868741328L, this);
                    $pc36 = 15; continue $sw36;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc36 = 6; continue $sw36; }
                    try {
                        abcd.wu.j6(-319444074868741328L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex36 = $t;
                        $pc36 = 11; continue $sw36;
                    }
                    $pc36 = 6; continue $sw36;
                }
                case 6: {
                    if (this.Zo == null) { $pc36 = 9; continue $sw36; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String Zo() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex37 = null;
        int $pc37 = 4;
        $sw37: while (true) {
            switch ($pc37) {
                case 8: {
                    th = $ex37;
                    if (FH == false) { $pc37 = 12; continue $sw37; }
                    abcd.wu.j6(th, 889241999412804771L, this);
                    $pc37 = 12; continue $sw37;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc37 = 6; continue $sw37; }
                    try {
                        abcd.wu.j6(889241999412804771L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex37 = $t;
                        $pc37 = 8; continue $sw37;
                    }
                    $pc37 = 6; continue $sw37;
                }
                case 6: {
                    return this.tp;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.Kj.e r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex38 = null;
        int $pc38 = 4;
        $sw38: while (true) {
            switch ($pc38) {
                case 8: {
                    th = $ex38;
                    if (FH == false) { $pc38 = 12; continue $sw38; }
                    abcd.wu.j6(th, -4764645981434530240L, this, r5);
                    $pc38 = 12; continue $sw38;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc38 = 6; continue $sw38; }
                    try {
                        abcd.wu.j6(-4764645981434530240L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex38 = $t;
                        $pc38 = 8; continue $sw38;
                    }
                    $pc38 = 6; continue $sw38;
                }
                case 6: {
                    try {
                        this.Hw.add(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex38 = $t;
                        $pc38 = 8; continue $sw38;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(android.app.Activity r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex39 = null;
        int $pc39 = 4;
        $sw39: while (true) {
            switch ($pc39) {
                case 10: {
                    th = $ex39;
                    if (FH == false) { $pc39 = 14; continue $sw39; }
                    abcd.wu.j6(th, 216170759644784888L, this, r5);
                    $pc39 = 14; continue $sw39;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc39 = 7; continue $sw39; }
                    try {
                        abcd.wu.j6(216170759644784888L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex39 = $t;
                        $pc39 = 10; continue $sw39;
                    }
                    $pc39 = 7; continue $sw39;
                }
                case 7: {
                    if (com.aide.ui.U.U2().j6(r5, "offline_docs") == false) { $pc39 = 17; continue $sw39; }
                    try {
                        Hw(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex39 = $t;
                        $pc39 = 10; continue $sw39;
                    }
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(android.app.Activity r8, java.lang.String r9) {
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex40 = null;
        int $pc40 = 3;
        $sw40: while (true) {
            switch ($pc40) {
                case 20: {
                    th = $ex40;
                    if (FH == false) { $pc40 = 24; continue $sw40; }
                    abcd.wu.j6(th, -2159692624017865617L, this, r8, r9);
                    $pc40 = 24; continue $sw40;
                }
                case 24: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc40 = 5; continue $sw40; }
                    try {
                        abcd.wu.j6(-2159692624017865617L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex40 = $t;
                        $pc40 = 20; continue $sw40;
                    }
                    $pc40 = 5; continue $sw40;
                }
                case 5: {
                    try {
                        r0 = abcd.zj.j6[com.aide.ui.build.android.Q.j6(r8).ordinal()];
                    } catch (java.lang.Throwable $t) {
                        $ex40 = $t;
                        $pc40 = 20; continue $sw40;
                    }
                    if (r0 != 2) { $pc40 = 9; continue $sw40; }
                    try {
                        com.aide.common.Abstractma.j6(r8, "NDK Support package is outdated", r9 + ".\n\nThe AIDE NDK Support package is outdated. Open Play Store to update?", new abcd.RunnableC0174Gj(this), null);
                    } catch (java.lang.Throwable $t) {
                        $ex40 = $t;
                        $pc40 = 20; continue $sw40;
                    }
                    return;
                }
                case 9: {
                    if (r0 != 3) { $pc40 = 11; continue $sw40; }
                    try {
                        com.aide.common.Abstractma.j6(r8, "AIDE is outdated", r9 + ".\n\nYour version of AIDE is outdated and does not support the updated AIDE NDK Support package. Open Play Store to update?", new abcd.RunnableC0190Hj(this), null);
                    } catch (java.lang.Throwable $t) {
                        $ex40 = $t;
                        $pc40 = 20; continue $sw40;
                    }
                    return;
                }
                case 11: {
                    if (r0 != 4) { $pc40 = 13; continue $sw40; }
                    try {
                        com.aide.common.Abstractma.j6(r8, "Install support for native code (C/C++)", r9 + "The AIDE NDK Support Package has not been completely installed. Open AIDE NDK Support Package to download expansion file?", new abcd.RunnableC0205Ij(this, r8), null);
                    } catch (java.lang.Throwable $t) {
                        $ex40 = $t;
                        $pc40 = 20; continue $sw40;
                    }
                    return;
                }
                case 13: {
                    if (r0 == 5) { $pc40 = 15; continue $sw40; }
                    try {
                        com.aide.common.Abstractma.j6(r8, "Install support for native code (C/C++)", r9 + "After installing support for native code you can build apps using native-code languages such as C and C++. The native code support takes about 750MB of space on internal storage space once installed.\n\nDownload native code support package now?", new abcd.RunnableC0158Fj(this), null);
                    } catch (java.lang.Throwable $t) {
                        $ex40 = $t;
                        $pc40 = 20; continue $sw40;
                    }
                    return;
                }
                case 15: {
                    try {
                        v5(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex40 = $t;
                        $pc40 = 20; continue $sw40;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(android.app.Activity r10, java.util.List<abcd.Be.g> r11, java.util.List<abcd.Be.m> r12, java.lang.Runnable r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex41 = null;
        int $pc41 = 3;
        $sw41: while (true) {
            switch ($pc41) {
                case 7: {
                    th = $ex41;
                    if (FH == false) { $pc41 = 11; continue $sw41; }
                    abcd.wu.j6(th, -139018920714890249L, this, r10, r11, r12, r13);
                    $pc41 = 11; continue $sw41;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc41 = 5; continue $sw41; }
                    try {
                        abcd.wu.j6(-139018920714890249L, this, r10, r11, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex41 = $t;
                        $pc41 = 7; continue $sw41;
                    }
                    $pc41 = 5; continue $sw41;
                }
                case 5: {
                    try {
                        j6(r10, "Download Maven Library", new abcd.RunnableC0142Ej(this, r10, r11, r12, r13));
                    } catch (java.lang.Throwable $t) {
                        $ex41 = $t;
                        $pc41 = 7; continue $sw41;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int v5() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex42 = null;
        int $pc42 = 4;
        $sw42: while (true) {
            switch ($pc42) {
                case 8: {
                    th = $ex42;
                    if (FH == false) { $pc42 = 12; continue $sw42; }
                    abcd.wu.j6(th, -3945926478657840480L, this);
                    $pc42 = 12; continue $sw42;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc42 = 6; continue $sw42; }
                    try {
                        abcd.wu.j6(-3945926478657840480L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex42 = $t;
                        $pc42 = 8; continue $sw42;
                    }
                    $pc42 = 6; continue $sw42;
                }
                case 6: {
                    return this.gn;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
