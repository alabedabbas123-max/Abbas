package abcd;

class QJ extends abcd.AbstractaI implements abcd.LI {
    private final abcd.UE Hw;
    private final abcd.AbstractjJ VH;
    private final abcd.RJ Zo;
    private java.util.LinkedHashMap<java.lang.String, java.lang.String> gn;
    private java.util.Collection<abcd.YI> tp;
    private java.util.Map<java.lang.String, abcd.ME> u7;
    private final abcd.HJ v5;

    /* JADX WARN: Multi-variable type inference failed */
    QJ(abcd.SJ r2, abcd.RJ r3) {
        this.VH = (abcd.AbstractjJ) r2;
        abcd.AbstractjJ r4 = this.VH;
        this.Hw = r4.v5;
        this.v5 = r4.tp();
        this.Zo = r3;
    }

    private static java.lang.String DW(java.util.List<abcd.YI> r3) {
        java.util.Iterator<abcd.YI> r0 = null;
        java.lang.String r1 = null;
        java.util.Iterator<abcd.YI> r2 = null;
        java.lang.String r4 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r3.iterator();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc0 = 5; continue $sw0; }
                    r1 = r0.next().FH();
                    if (r1.equals("refs/heads/master") == false) { $pc0 = 4; continue $sw0; }
                    return r1;
                }
                case 5: {
                    r2 = r3.iterator();
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r2.hasNext() == false) { $pc0 = 9; continue $sw0; }
                    r4 = r2.next().FH();
                    if (r4.startsWith("refs/heads/") == false) { $pc0 = 7; continue $sw0; }
                    return r4;
                }
                case 9: {
                    return r3.get(0).FH();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(abcd.YI r7) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        this.Zo.j6(r7.FH(), r7.DW());
                        this.u7.put(r7.FH(), new abcd.BE.c(abcd.ME.a.DW, r7.FH(), r7.DW()));
                        r7.j6(abcd.YI.a.u7);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 4; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 4: {
                    e = $ex1;
                    r7.j6(abcd.YI.a.Zo);
                    r7.j6(e.getMessage());
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(java.lang.String r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 == null) { $pc2 = 8; continue $sw2; }
                    try {
                        this.Zo.j6(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 5; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 9: {
                    return;
                }
                case 5: {
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static abcd.RJ j6(abcd.QJ r0) {
        return r0.Zo;
    }

    private void j6(abcd.YI r3) {
        abcd.ME r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.u7.remove(r3.FH());
                    if (r0 != null) { $pc3 = 7; continue $sw3; }
                    r3.j6(abcd.YI.a.u7);
                    return;
                }
                case 7: {
                    if (r0.j6().Zo() == false) { $pc3 = 10; continue $sw3; }
                    this.tp.add(r3);
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    if (r0.j6().Hw() == true) { $pc3 = 22; continue $sw3; }
                    $pc3 = 20; continue $sw3;
                }
                case 20: {
                    try {
                        this.Zo.FH(r3.FH());
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.IOException) { $pc3 = 17; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 17: {
                    e = $ex3;
                    r3.j6(abcd.YI.a.Zo);
                    r3.j6(e.getMessage());
                    return;
                }
                case 22: {
                    try {
                        this.Zo.DW(r3.FH());
                        r3.j6(abcd.YI.a.u7);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.IOException) { $pc3 = 13; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 13: {
                    e = $ex3;
                    r3.j6(abcd.YI.a.Zo);
                    r3.j6(e.getMessage());
                    { $pc3 = 20; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.util.List<abcd.YI> r4) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    try {
                        this.Zo.j6("../HEAD", abcd.hE.j6("ref: " + DW(r4) + "\n"));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 8; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        this.Zo.j6("../config", abcd.hE.j6("[core]\n\trepositoryformatversion = 0\n"));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 5; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 5: {
                    e = $ex4;
                    throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().cannotCreateConfig, e);
                }
                case 8: {
                    e = $ex4;
                    throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().cannotCreateHEAD, e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.util.List<abcd.YI> r9, abcd.LE r10) {
        abcd.TH r1 = null;
        java.util.HashSet r3 = null;
        java.util.HashSet r4 = null;
        java.util.Iterator<abcd.YI> r11 = null;
        java.util.Iterator<abcd.ME> r12 = null;
        abcd.ME r5 = null;
        java.util.Iterator<java.lang.String> r13 = null;
        java.lang.String r6 = null;
        java.lang.String r14 = null;
        java.lang.String r7 = null;
        java.lang.String r8 = null;
        java.lang.String r2 = null;
        java.lang.String r15 = null;
        java.io.OutputStream r0 = null;
        abcd.XK r16 = null;
        java.io.OutputStream r17 = null;
        abcd.XK r18 = null;
        java.util.ArrayList r19 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r1 = new abcd.TH(this.VH.Zo(), this.Hw.j3());
                    try {
                        r3 = new java.util.HashSet();
                        r4 = new java.util.HashSet();
                        r11 = r9.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 50; continue $sw5; }
                        $pc5 = 48; continue $sw5;
                    }
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    if (r11.hasNext() == false) { $pc5 = 6; continue $sw5; }
                    try {
                        r3.add(r11.next().DW());
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 50; continue $sw5; }
                        $pc5 = 48; continue $sw5;
                    }
                    { $pc5 = 5; continue $sw5; }
                }
                case 6: {
                    try {
                        r12 = DW().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 50; continue $sw5; }
                        $pc5 = 48; continue $sw5;
                    }
                    $pc5 = 8; continue $sw5;
                }
                case 8: {
                    if (r12.hasNext() == false) { $pc5 = 9; continue $sw5; }
                    try {
                        r5 = r12.next();
                        r4.add(r5.DW());
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 50; continue $sw5; }
                        $pc5 = 48; continue $sw5;
                    }
                    if (r5.FH() == null) { $pc5 = 8; continue $sw5; }
                    try {
                        r4.add(r5.FH());
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 50; continue $sw5; }
                        $pc5 = 48; continue $sw5;
                    }
                    { $pc5 = 8; continue $sw5; }
                }
                case 9: {
                    try {
                        r1.j6(r10, r3, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 50; continue $sw5; }
                        $pc5 = 48; continue $sw5;
                    }
                    if (r1.Hw() != 0) { $pc5 = 14; continue $sw5; }
                    r1.VH();
                    return;
                }
                case 14: {
                    try {
                        this.gn = new java.util.LinkedHashMap();
                        r13 = this.Zo.FH().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 50; continue $sw5; }
                        $pc5 = 48; continue $sw5;
                    }
                    $pc5 = 16; continue $sw5;
                }
                case 16: {
                    if (r13.hasNext() == false) { $pc5 = 17; continue $sw5; }
                    try {
                        r6 = r13.next();
                        this.gn.put(r6, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 50; continue $sw5; }
                        $pc5 = 48; continue $sw5;
                    }
                    { $pc5 = 16; continue $sw5; }
                }
                case 17: {
                    try {
                        r14 = "pack-" + r1.FH().we();
                        r7 = java.lang.String.valueOf(r14) + ".pack";
                        r8 = "pack/" + r7;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 50; continue $sw5; }
                        $pc5 = 48; continue $sw5;
                    }
                    try {
                        r2 = "pack/" + r14 + ".idx";
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 40; continue $sw5; }
                        $pc5 = 48; continue $sw5;
                    }
                    if (this.gn.remove(r7) == null) { $pc5 = 21; continue $sw5; }
                    try {
                        this.Zo.j6(this.gn.keySet());
                        this.Zo.j6(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 40; continue $sw5; }
                        $pc5 = 48; continue $sw5;
                    }
                    $pc5 = 21; continue $sw5;
                }
                case 21: {
                    try {
                        r15 = "Put " + r14.substring(0, 12);
                        r0 = this.Zo.j6(r8, r10, java.lang.String.valueOf(r15) + "..pack");
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 40; continue $sw5; }
                        $pc5 = 48; continue $sw5;
                    }
                    try {
                        r16 = new abcd.XK(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 37; continue $sw5;
                    }
                    try {
                        r1.j6(r10, r10, r16);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 35; continue $sw5;
                    }
                    try {
                        r16.close();
                        r17 = this.Zo.j6(r2, r10, java.lang.String.valueOf(r15) + "..idx");
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 40; continue $sw5; }
                        $pc5 = 48; continue $sw5;
                    }
                    try {
                        r18 = new abcd.XK(r17);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 32; continue $sw5;
                    }
                    try {
                        r1.j6(r18);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 30; continue $sw5;
                    }
                    try {
                        r18.close();
                        r19 = new java.util.ArrayList();
                        r19.add(r7);
                        r19.addAll(this.gn.keySet());
                        this.Zo.j6(r19);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 40; continue $sw5; }
                        $pc5 = 48; continue $sw5;
                    }
                    r1.VH();
                    return;
                }
                case 30: {
                    th = $ex5;
                    th = th;
                    r17 = r18;
                    $pc5 = 33; continue $sw5;
                }
                case 33: {
                    try {
                        r17.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 40; continue $sw5; }
                        $pc5 = 48; continue $sw5;
                    }
                }
                case 32: {
                    th = th;
                    $pc5 = 38; continue $sw5;
                }
                case 35: {
                    th = th;
                    r0 = r16;
                    $pc5 = 38; continue $sw5;
                }
                case 38: {
                    try {
                        r0.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 40; continue $sw5; }
                        $pc5 = 48; continue $sw5;
                    }
                }
                case 37: {
                    th = th;
                    $pc5 = 52; continue $sw5;
                }
                case 40: {
                    e = e;
                    $pc5 = 52; continue $sw5;
                }
                case 52: {
                    try {
                        DW(null);
                        DW(r8);
                        throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().cannotStoreObjects, e);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 48; continue $sw5;
                    }
                }
                case 48: {
                    th = $ex5;
                    r1.VH();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 50: {
                    e = e;
                    r8 = null;
                    { $pc5 = 52; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean u7() {
        java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (FH().isEmpty() == false) { $pc6 = 10; continue $sw6; }
                    r0 = this.gn;
                    if (r0 != null) { $pc6 = 7; continue $sw6; }
                    return false;
                }
                case 7: {
                    if (r0.isEmpty() == false) { $pc6 = 13; continue $sw6; }
                    return true;
                }
                case 13: {
                    return false;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void close() {
        this.Zo.j6();
    }

    @Override
    public void j6(abcd.LE r5, java.util.Map<java.lang.String, abcd.YI> r6) {
        java.util.ArrayList r0 = null;
        java.util.Iterator<abcd.YI> r7 = null;
        abcd.YI r1 = null;
        java.lang.String r2 = null;
        java.util.Iterator<abcd.YI> r3 = null;
        abcd.PJ r8 = null;
        java.util.Iterator<abcd.YI> r9 = null;
        java.util.Iterator<abcd.YI> r10 = null;
        abcd.YI r4 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    gn();
                    this.gn = null;
                    this.u7 = new java.util.TreeMap(FH());
                    this.tp = new java.util.ArrayList(r6.size());
                    r0 = new java.util.ArrayList();
                    r7 = r6.values().iterator();
                    $pc7 = 4; continue $sw7;
                }
                case 4: {
                    if (r7.hasNext() == false) { $pc7 = 6; continue $sw7; }
                    r1 = r7.next();
                    r2 = r1.FH();
                    if (r2.startsWith("refs/") == false) { $pc7 = 46; continue $sw7; }
                    if (abcd.UE.DW(r2) == false) { $pc7 = 46; continue $sw7; }
                    if (abcd.YD.j6(abcd.yE.Ws(), r1.DW()) == true) { $pc7 = 44; continue $sw7; }
                    r0.add(r1);
                    { $pc7 = 4; continue $sw7; }
                }
                case 44: {
                    j6(r1);
                    $pc7 = 46; continue $sw7;
                }
                case 46: {
                    r1.j6(abcd.YI.a.Zo);
                    r1.j6(org.eclipse.jgit.JGitText.j6().funnyRefname);
                    { $pc7 = 4; continue $sw7; }
                }
                case 6: {
                    if (r0.isEmpty() == true) { $pc7 = 8; continue $sw7; }
                    j6(r0, r5);
                    $pc7 = 8; continue $sw7;
                }
                case 8: {
                    r3 = r0.iterator();
                    $pc7 = 10; continue $sw7;
                }
                case 10: {
                    if (r3.hasNext() == false) { $pc7 = 12; continue $sw7; }
                    DW(r3.next());
                    { $pc7 = 10; continue $sw7; }
                }
                case 12: {
                    if (r0.isEmpty() == false) { $pc7 = 14; continue $sw7; }
                    $pc7 = 16; continue $sw7;
                }
                case 16: {
                    r8 = new abcd.PJ(this, this.u7.values());
                    if (this.tp.isEmpty() == false) { $pc7 = 49; continue $sw7; }
                    $pc7 = 47; continue $sw7;
                }
                case 47: {
                    try {
                        r8.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.io.IOException) { $pc7 = 33; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 33: {
                    e = $ex7;
                    throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().failedUpdatingRefs, e);
                }
                case 49: {
                    try {
                        r8.DW();
                        r9 = this.tp.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.io.IOException) { $pc7 = 24; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc7 = 20; continue $sw7;
                }
                case 20: {
                    if (r9.hasNext() == false) { $pc7 = 47; continue $sw7; }
                    try {
                        r9.next().j6(abcd.YI.a.u7);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.io.IOException) { $pc7 = 24; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc7 = 27; continue $sw7;
                }
                case 24: {
                    e = $ex7;
                    r10 = this.tp.iterator();
                    $pc7 = 27; continue $sw7;
                }
                case 27: {
                    if (r10.hasNext() == false) { $pc7 = 30; continue $sw7; }
                    r4 = r10.next();
                    r4.j6(abcd.YI.a.Zo);
                    r4.j6(e.getMessage());
                    { $pc7 = 27; continue $sw7; }
                }
                case 30: {
                    throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().failedUpdatingRefs, e);
                }
                case 14: {
                    if (u7() == false) { $pc7 = 16; continue $sw7; }
                    j6(r0);
                    { $pc7 = 16; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
