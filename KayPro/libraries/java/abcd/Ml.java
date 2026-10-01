package abcd;

@abcd.Interfacexu
class Ml extends java.lang.Thread {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Ol FH;

    static {
        abcd.wu.j6(abcd.Ml.class, -5925735092384612688L, -3471751321666830100L);
    }

    Ml(abcd.Ol r1, java.lang.String r2) {
        this.FH = r1;
        super(r2);
    }

    @Override
    @abcd.Interfacesu(method = -683558885977978496L)
    public void run() {
        synchronized (abcd.Ol.VH(this.FH)) {
            byte[] r3 = null;
            int r0 = 0;
            java.lang.Object r1 = null;
            abcd.Ol r2 = null;
            abcd.Ol r4 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 4;
            $sw0: while (true) {
                switch ($pc0) {
                    case 52: {
                        th = $ex0;
                        if (DW == false) { $pc0 = 57; continue $sw0; }
                        abcd.wu.j6(th, -4717426943430638892L, this);
                        $pc0 = 57; continue $sw0;
                    }
                    case 57: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc0 = 6; continue $sw0; }
                        try {
                            abcd.wu.j6(-4717426943430638892L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 52; continue $sw0;
                        }
                        $pc0 = 6; continue $sw0;
                    }
                    case 6: {
                        r3 = new byte[6];
                        if (abcd.Ol.Zo(this.FH) == null) { $pc0 = 40; continue $sw0; }
                        try {
                            r0 = com.a.a(abcd.Ol.Zo(this.FH), r3);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.io.IOException) { $pc0 = 36; continue $sw0; }
                            $pc0 = 31; continue $sw0;
                        }
                        $pc0 = 10; continue $sw0;
                    }
                    case 10: {
                        if (r0 <= 0) { $pc0 = 27; continue $sw0; }
                        try {
                            r1 = abcd.Ol.VH(this.FH);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.io.IOException) { $pc0 = 36; continue $sw0; }
                            $pc0 = 31; continue $sw0;
                        }
                        $pc0 = 14; continue $sw0;
                    }
                    case 23: {
                        th = $ex0;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.io.IOException) { $pc0 = 36; continue $sw0; }
                            $pc0 = 31; continue $sw0;
                        }
                    }
                    case 14: {
                        if (abcd.Ol.gn(this.FH) == true) { $pc0 = 15; continue $sw0; }
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 23; continue $sw0;
                        }
                        if (abcd.Ol.u7(this.FH) == null) { $pc0 = 21; continue $sw0; }
                        try {
                            abcd.Ol.u7(this.FH).write(r3, 0, r0);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.io.IOException) { $pc0 = 36; continue $sw0; }
                            $pc0 = 31; continue $sw0;
                        }
                        $pc0 = 21; continue $sw0;
                    }
                    case 21: {
                        try {
                            r0 = com.a.a(abcd.Ol.Zo(this.FH), r3);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.io.IOException) { $pc0 = 36; continue $sw0; }
                            $pc0 = 31; continue $sw0;
                        }
                        { $pc0 = 10; continue $sw0; }
                    }
                    case 15: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 23; continue $sw0;
                        }
                        $pc0 = 27; continue $sw0;
                    }
                    case 27: {
                        if (abcd.Ol.u7(this.FH) == null) { $pc0 = 40; continue $sw0; }
                        try {
                            r2 = this.FH;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.io.IOException) { $pc0 = 59; continue $sw0; }
                            $pc0 = 62; continue $sw0;
                        }
                        $pc0 = 29; continue $sw0;
                    }
                    case 29: {
                        try {
                            abcd.Ol.u7(r2).close();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.io.IOException) { $pc0 = 59; continue $sw0; }
                            $pc0 = 62; continue $sw0;
                        }
                        $pc0 = 35; continue $sw0;
                    }
                    case 31: {
                        th = $ex0;
                        if (abcd.Ol.u7(this.FH) == null) { $pc0 = 35; continue $sw0; }
                        try {
                            abcd.Ol.u7(this.FH).close();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.io.IOException) { $pc0 = 61; continue $sw0; }
                            $pc0 = 62; continue $sw0;
                        }
                        $pc0 = 35; continue $sw0;
                    }
                    case 35: {
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 62; continue $sw0;
                        }
                    }
                    case 37: {
                        if (abcd.Ol.u7(this.FH) == null) { $pc0 = 40; continue $sw0; }
                        try {
                            r2 = this.FH;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.io.IOException) { $pc0 = 59; continue $sw0; }
                            $pc0 = 62; continue $sw0;
                        }
                        $pc0 = 40; continue $sw0;
                    }
                    case 40: {
                        try {
                            r4 = this.FH;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 62; continue $sw0;
                        }
                        try {
                            abcd.Ol.Hw(this.FH);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 48; continue $sw0;
                        }
                        if (abcd.Ol.FH(this.FH) > 0) { $pc0 = 46; continue $sw0; }
                        try {
                            this.FH.notifyAll();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 48; continue $sw0;
                        }
                        try {
                            abcd.Ol.v5(this.FH).j6();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.io.IOException) { $pc0 = 60; continue $sw0; }
                            $pc0 = 48; continue $sw0;
                        }
                        $pc0 = 46; continue $sw0;
                    }
                    case 46: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 48; continue $sw0;
                        }
                        { $pc0 = 82; continue $sw0; }
                    }
                    case 51: {
                        return;
                    }
                    case 48: {
                        th = $ex0;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 62; continue $sw0;
                        }
                    }
                    case 36: {
                        $pc0 = 82; continue $sw0;
                    }
                    case 59: {
                        $pc0 = 82; continue $sw0;
                    }
                    case 60: {
                        $pc0 = 82; continue $sw0;
                    }
                    case 61: {
                        $pc0 = 82; continue $sw0;
                    }
                    case 62: {
                        $pc0 = 82; continue $sw0;
                    }
                    case 82: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
