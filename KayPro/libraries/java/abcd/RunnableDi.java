package abcd;

@abcd.Interfacexu
class RunnableDi implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Ji FH;

    static {
        abcd.wu.j6(abcd.RunnableDi.class, 4379885248179836745L, -159569957877605768L);
    }

    RunnableDi(abcd.Ji r1) {
        this.FH = r1;
    }

    @abcd.Interfacesu(method = -810438471020312864L)
    private boolean j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 16: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 20; continue $sw0; }
                    abcd.wu.j6(th, 1957726046461692465L, this);
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(1957726046461692465L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 16; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (abcd.Ji.v5(this.FH).size() <= 0) { $pc0 = 9; continue $sw0; }
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    return true;
                }
                case 9: {
                    if (abcd.Ji.Zo(this.FH) != null) { $pc0 = 14; continue $sw0; }
                    if (abcd.Ji.gn(this.FH) != null) { $pc0 = 14; continue $sw0; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 143580761192065080L)
    public void run() {
        synchronized (abcd.Ji.j6(this.FH)) {
            java.lang.Object r2 = null;
            java.lang.Object r4 = null;
            java.lang.Object r5 = null;
            abcd.Ji r6 = null;
            java.util.Iterator r7 = null;
            abcd.Ji.e r8 = null;
            java.lang.Object r9 = null;
            java.lang.String r10 = null;
            java.util.ArrayList r3 = null;
            abcd.Dw.e r11 = null;
            java.util.Iterator<abcd.Dw.e> r12 = null;
            abcd.Dw.e r13 = null;
            java.lang.String r14 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 4;
            $sw1: while (true) {
                switch ($pc1) {
                    case 99: {
                        th = $ex1;
                        if (DW == false) { $pc1 = 104; continue $sw1; }
                        abcd.wu.j6(th, -3643927213099545845L, this);
                        $pc1 = 104; continue $sw1;
                    }
                    case 104: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc1 = 6; continue $sw1; }
                        try {
                            abcd.wu.j6(-3643927213099545845L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 99; continue $sw1;
                        }
                        $pc1 = 6; continue $sw1;
                    }
                    case 6: {
                        try {
                            r2 = abcd.Ji.j6(this.FH);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 99; continue $sw1;
                        }
                        $pc1 = 110; continue $sw1;
                    }
                    case 110: {
                        if (j6() == true) { $pc1 = 11; continue $sw1; }
                        $pc1 = 108; continue $sw1;
                    }
                    case 108: {
                        try {
                            abcd.Ji.j6(this.FH).wait();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc1 = 106; continue $sw1; }
                            $pc1 = 96; continue $sw1;
                        }
                        { $pc1 = 110; continue $sw1; }
                    }
                    case 11: {
                        if (abcd.Ji.DW(this.FH) == true) { $pc1 = 108; continue $sw1; }
                        try {
                            abcd.Ji.Hw(this.FH).clear();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 96; continue $sw1;
                        }
                        $pc1 = 15; continue $sw1;
                    }
                    case 15: {
                        if (abcd.Ji.v5(this.FH).size() <= 0) { $pc1 = 19; continue $sw1; }
                        try {
                            abcd.Ji.Hw(this.FH).addAll(abcd.Ji.v5(this.FH));
                            abcd.Ji.v5(this.FH).clear();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 96; continue $sw1;
                        }
                        try {
                            abcd.Ji.j6(this.FH).wait(100);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc1 = 107; continue $sw1; }
                            $pc1 = 96; continue $sw1;
                        }
                        { $pc1 = 15; continue $sw1; }
                    }
                    case 19: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 96; continue $sw1;
                        }
                        if (abcd.Ji.Zo(this.FH) != null) { $pc1 = 23; continue $sw1; }
                        if (abcd.Ji.gn(this.FH) != null) { $pc1 = 29; continue $sw1; }
                        $pc1 = 46; continue $sw1;
                    }
                    case 84: {
                        th = $ex1;
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 99; continue $sw1;
                        }
                        try {
                            abcd.Ji.Hw(this.FH).clear();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 91; continue $sw1;
                        }
                        try {
                            abcd.Ji.j6(this.FH, false, "Done", 100.0f);
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 99; continue $sw1;
                        }
                    }
                    case 91: {
                        th = $ex1;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 99; continue $sw1;
                        }
                    }
                    case 46: {
                        if (abcd.Ji.VH(this.FH) == true) { $pc1 = 65; continue $sw1; }
                        try {
                            r4 = abcd.Ji.j6(this.FH);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 84; continue $sw1;
                        }
                        try {
                            abcd.Ji.v5(this.FH).addAll(abcd.Ji.Hw(this.FH));
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 61; continue $sw1;
                        }
                        try {
                            r5 = abcd.Ji.j6(this.FH);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 99; continue $sw1;
                        }
                        try {
                            abcd.Ji.Hw(this.FH).clear();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 58; continue $sw1;
                        }
                        try {
                            r6 = this.FH;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 99; continue $sw1;
                        }
                        $pc1 = 56; continue $sw1;
                    }
                    case 56: {
                        try {
                            abcd.Ji.j6(r6, false, "Done", 100.0f);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 99; continue $sw1;
                        }
                        { $pc1 = 6; continue $sw1; }
                    }
                    case 58: {
                        th = $ex1;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 99; continue $sw1;
                        }
                    }
                    case 61: {
                        th = $ex1;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 84; continue $sw1;
                        }
                    }
                    case 65: {
                        if (abcd.Ji.EQ(this.FH) == false) { $pc1 = 127; continue $sw1; }
                        try {
                            com.aide.ui.U.j6(new abcd.RunnableC1560yi(this));
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 84; continue $sw1;
                        }
                        $pc1 = 127; continue $sw1;
                    }
                    case 127: {
                        try {
                            r7 = abcd.Ji.Hw(this.FH).iterator();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Exception) { $pc1 = 72; continue $sw1; }
                            if ($t instanceof abcd.Ji.a) { $pc1 = 74; continue $sw1; }
                            $pc1 = 84; continue $sw1;
                        }
                        $pc1 = 69; continue $sw1;
                    }
                    case 69: {
                        if (r7.hasNext() == false) { $pc1 = 75; continue $sw1; }
                        try {
                            r8 = (abcd.Ji.e) r7.next();
                            abcd.Ji.j6(this.FH, true, "Connecting...", 0.0f);
                            abcd.Ji.j6(this.FH, r8);
                            com.aide.ui.U.j6(new abcd.RunnableC1603zi(this));
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Exception) { $pc1 = 72; continue $sw1; }
                            if ($t instanceof abcd.Ji.a) { $pc1 = 74; continue $sw1; }
                            $pc1 = 84; continue $sw1;
                        }
                        $pc1 = 75; continue $sw1;
                    }
                    case 75: {
                        try {
                            r9 = abcd.Ji.j6(this.FH);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 99; continue $sw1;
                        }
                        try {
                            abcd.Ji.Hw(this.FH).clear();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 81; continue $sw1;
                        }
                        try {
                            r6 = this.FH;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 99; continue $sw1;
                        }
                        { $pc1 = 56; continue $sw1; }
                    }
                    case 81: {
                        th = $ex1;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 99; continue $sw1;
                        }
                    }
                    case 74: {
                        try {
                            com.aide.common.ClassH.j6("Canceled");
                            abcd.Ji.j6(this.FH, false, "Done", 100.0f);
                            com.aide.ui.U.j6(new abcd.RunnableC0077Ai(this));
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 84; continue $sw1;
                        }
                        $pc1 = 29; continue $sw1;
                    }
                    case 72: {
                        e = $ex1;
                        try {
                            com.aide.common.ClassH.DW(e);
                            abcd.Ji.j6(this.FH, false, "Done", 100.0f);
                            com.aide.ui.U.j6(new abcd.RunnableC0109Ci(this, e));
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 84; continue $sw1;
                        }
                        { $pc1 = 75; continue $sw1; }
                    }
                    case 29: {
                        if (abcd.Ji.VH(this.FH) == false) { $pc1 = 6; continue $sw1; }
                        try {
                            r10 = abcd.Ji.gn(this.FH);
                            abcd.Ji.DW(this.FH, null);
                            r3 = new java.util.ArrayList();
                            r11 = abcd.Ji.u7(this.FH).j6(r10, 0, null, true, null);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof abcd.Jw) { $pc1 = 41; continue $sw1; }
                            $pc1 = 99; continue $sw1;
                        }
                        $pc1 = 32; continue $sw1;
                    }
                    case 32: {
                        if (r11.Ws == null) { $pc1 = 39; continue $sw1; }
                        try {
                            r12 = r11.Ws.iterator();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof abcd.Jw) { $pc1 = 41; continue $sw1; }
                            $pc1 = 99; continue $sw1;
                        }
                        $pc1 = 35; continue $sw1;
                    }
                    case 35: {
                        if (r12.hasNext() == false) { $pc1 = 39; continue $sw1; }
                        try {
                            r13 = r12.next();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof abcd.Jw) { $pc1 = 41; continue $sw1; }
                            $pc1 = 99; continue $sw1;
                        }
                        if (r13.v5 == false) { $pc1 = 35; continue $sw1; }
                        try {
                            r3.add(r13.gn);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof abcd.Jw) { $pc1 = 41; continue $sw1; }
                            $pc1 = 99; continue $sw1;
                        }
                        $pc1 = 39; continue $sw1;
                    }
                    case 39: {
                        try {
                            com.aide.ui.U.j6(new abcd.Runnablewi(this, r3));
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof abcd.Jw) { $pc1 = 41; continue $sw1; }
                            $pc1 = 99; continue $sw1;
                        }
                        $pc1 = 23; continue $sw1;
                    }
                    case 41: {
                        e = $ex1;
                        try {
                            com.aide.common.ClassH.DW(e);
                            com.aide.ui.U.j6(new abcd.Runnablexi(this, e));
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 99; continue $sw1;
                        }
                        { $pc1 = 6; continue $sw1; }
                    }
                    case 23: {
                        if (abcd.Ji.VH(this.FH) == false) { $pc1 = 6; continue $sw1; }
                        try {
                            r14 = abcd.Ji.Zo(this.FH);
                            abcd.Ji.j6(this.FH, null);
                            com.aide.ui.U.j6(new abcd.RunnableC1432vi(this, r14));
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 99; continue $sw1;
                        }
                        { $pc1 = 6; continue $sw1; }
                    }
                    case 96: {
                        th = $ex1;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 99; continue $sw1;
                        }
                    }
                    case 106: {
                        return;
                    }
                    case 107: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
