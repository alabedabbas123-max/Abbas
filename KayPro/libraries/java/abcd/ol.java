package abcd;

@abcd.Interfacexu
public class ol {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.ol.class, -1401858080030435915L, -1401858080030435915L);
    }

    public ol() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 3074699047031413017L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(3074699047031413017L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 52244996607952165L)
    private void DW(java.util.List<com.aide.engine.Modification> r20) {
        int r6 = 0;
        boolean r7 = false;
        com.aide.engine.Modification r0 = null;
        int r9 = 0;
        java.lang.String r10 = null;
        java.lang.String r1 = null;
        java.util.List<com.aide.engine.Modification> r2 = null;
        int r8 = 0;
        abcd.C0445Xj r3 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 82: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 87; continue $sw1; }
                    abcd.wu.j6(th, 8759941853249604240L, this, r20);
                    $pc1 = 87; continue $sw1;
                }
                case 87: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 95; continue $sw1; }
                    try {
                        abcd.wu.j6(8759941853249604240L, this, r20);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 82; continue $sw1;
                    }
                    $pc1 = 95; continue $sw1;
                }
                case 95: {
                    try {
                        com.aide.ui.U.EQ().we();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    r6 = 0;
                    r7 = false;
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    if (r6 >= r20.size()) { $pc1 = 104; continue $sw1; }
                    try {
                        r0 = r20.get(r6);
                        r9 = r0.tp();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    if (r9 == 0) { $pc1 = 93; continue $sw1; }
                    if (r9 != 1) { $pc1 = 15; continue $sw1; }
                    try {
                        r10 = r0.v5();
                        r1 = abcd.Vl.EQ(r10) + java.io.File.separator + r0.VH();
                        abcd.Vl.Zo(r10, r1);
                        com.aide.ui.U.er().j6(r10, r1);
                        com.aide.ui.U.tp().DW(abcd.Vl.EQ(r10));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 56; continue $sw1; }
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    r7 = true;
                    $pc1 = 63; continue $sw1;
                }
                case 63: {
                    r6 = r6 + 1;
                    $pc1 = 56; continue $sw1;
                }
                case 56: {
                    e = $ex1;
                    try {
                        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), "Modify Files", e);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    { $pc1 = 63; continue $sw1; }
                }
                case 15: {
                    if (r9 != 2) { $pc1 = 17; continue $sw1; }
                    try {
                        com.aide.ui.U.EQ().gn();
                        r2 = com.aide.ui.U.EQ().DW(r0.v5(), r0.u7(), r0.Hw(), com.aide.ui.aa.cn());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    if (r2 == null) { $pc1 = 52; continue $sw1; }
                    try {
                        r8 = r2.size() - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    $pc1 = 50; continue $sw1;
                }
                case 50: {
                    if (r8 < 0) { $pc1 = 52; continue $sw1; }
                    try {
                        r20.add(r6 + 1, r2.get(r8));
                        r8 = r8 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    $pc1 = 52; continue $sw1;
                }
                case 52: {
                    try {
                        com.aide.ui.U.EQ().we();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    { $pc1 = 63; continue $sw1; }
                }
                case 17: {
                    if (r9 != 3) { $pc1 = 19; continue $sw1; }
                    try {
                        com.aide.ui.U.er().v5(r0.v5()).j6(r0.u7(), r0.gn(), r0.Hw(), r0.FH(), r0.DW(), r0.j6());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 45; continue $sw1; }
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    $pc1 = 45; continue $sw1;
                }
                case 45: {
                    e = $ex1;
                    try {
                        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), "Modify Files", e);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    { $pc1 = 63; continue $sw1; }
                }
                case 19: {
                    if (r9 != 7) { $pc1 = 21; continue $sw1; }
                    try {
                        com.aide.ui.U.er().v5(r0.v5()).DW(r0.u7(), r0.gn(), r0.Hw(), r0.FH(), r0.DW(), r0.j6());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 40; continue $sw1; }
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    $pc1 = 40; continue $sw1;
                }
                case 40: {
                    e = $ex1;
                    try {
                        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), "Modify Files", e);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    { $pc1 = 63; continue $sw1; }
                }
                case 21: {
                    if (r9 != 8) { $pc1 = 23; continue $sw1; }
                    try {
                        com.aide.ui.U.lg().j6(new abcd.Tl(r0.v5(), r0.u7(), r0.gn(), r0.Hw(), r0.FH()), false);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    { $pc1 = 63; continue $sw1; }
                }
                case 23: {
                    if (r9 != 11) { $pc1 = 25; continue $sw1; }
                    try {
                        com.aide.ui.U.er().v5(r0.v5()).j6(r0.u7(), r0.Zo());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 34; continue $sw1; }
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    $pc1 = 34; continue $sw1;
                }
                case 34: {
                    e = $ex1;
                    try {
                        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), "Modify Files", e);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    { $pc1 = 63; continue $sw1; }
                }
                case 25: {
                    if (r9 != 12) { $pc1 = 63; continue $sw1; }
                    try {
                        abcd.Vl.a8(abcd.Vl.EQ(r0.v5()));
                        abcd.Vl.j6(r0.v5(), r0.VH());
                        com.aide.ui.U.er().v5(r0.v5());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 29; continue $sw1; }
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    $pc1 = 29; continue $sw1;
                }
                case 29: {
                    e = $ex1;
                    try {
                        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), "Modify Files", e);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    { $pc1 = 63; continue $sw1; }
                }
                case 93: {
                    try {
                        com.aide.ui.U.er().v5(r0.v5()).j6(r0.u7(), r0.gn(), r0.Hw(), r0.FH(), r0.VH(), r0.EQ(), r0.v5().equals(com.aide.ui.U.er().DW()));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 61; continue $sw1; }
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    $pc1 = 61; continue $sw1;
                }
                case 61: {
                    e = $ex1;
                    try {
                        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), "Modify Files", e);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    { $pc1 = 63; continue $sw1; }
                }
                case 104: {
                    try {
                        com.aide.ui.U.er().J0();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 66; continue $sw1; }
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    $pc1 = 68; continue $sw1;
                }
                case 68: {
                    if (r7 == false) { $pc1 = 70; continue $sw1; }
                    try {
                        com.aide.ui.U.vy().er();
                        com.aide.ui.U.J8().Hw();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    $pc1 = 70; continue $sw1;
                }
                case 70: {
                    try {
                        com.aide.ui.U.EQ().VH();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    try {
                        r3 = com.aide.ui.U.EQ();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 82; continue $sw1;
                    }
                    $pc1 = 72; continue $sw1;
                }
                case 72: {
                    try {
                        r3.gn();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 82; continue $sw1;
                    }
                    return;
                }
                case 66: {
                    e = $ex1;
                    try {
                        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), "Modify Files", e);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc1 = 76; continue $sw1; }
                        $pc1 = 74; continue $sw1;
                    }
                    $pc1 = 74; continue $sw1;
                }
                case 74: {
                    th = $ex1;
                    try {
                        com.aide.ui.U.EQ().gn();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 82; continue $sw1;
                    }
                }
                case 76: {
                    th = $ex1;
                    try {
                        com.aide.common.ClassH.j6(th);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 74; continue $sw1;
                    }
                    try {
                        r3 = com.aide.ui.U.EQ();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 82; continue $sw1;
                    }
                    { $pc1 = 72; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(abcd.ol r0, java.util.List r1) {
        r0.DW(r1);
    }

    public void j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, -3705311679461573176L, this);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-3705311679461573176L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        com.aide.ui.U.EQ().j6(new abcd.Binderml(this));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.util.List<com.aide.engine.Modification> r10) {
        java.util.HashSet r2 = null;
        boolean r3 = false;
        java.util.Iterator<com.aide.engine.Modification> r4 = null;
        com.aide.engine.Modification r5 = null;
        int r6 = 0;
        java.util.ArrayList r7 = null;
        java.util.Iterator r8 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 34: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 39; continue $sw3; }
                    abcd.wu.j6(th, -4627938854537139501L, this, r10);
                    $pc3 = 39; continue $sw3;
                }
                case 39: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-4627938854537139501L, this, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 34; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        com.aide.ui.U.lg().Hw();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 34; continue $sw3;
                    }
                    if (r10 != null) { $pc3 = 9; continue $sw3; }
                    return;
                }
                case 9: {
                    try {
                        r2 = new java.util.HashSet();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 34; continue $sw3;
                    }
                    r3 = false;
                    try {
                        r4 = r10.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 34; continue $sw3;
                    }
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    if (r4.hasNext() == false) { $pc3 = 26; continue $sw3; }
                    try {
                        r5 = r4.next();
                        r6 = r5.tp();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 34; continue $sw3;
                    }
                    if (r6 == 0) { $pc3 = 23; continue $sw3; }
                    if (r6 == 3) { $pc3 = 23; continue $sw3; }
                    if (r6 == 7) { $pc3 = 23; continue $sw3; }
                    if (r6 == 11) { $pc3 = 23; continue $sw3; }
                    if (r6 != 12) { $pc3 = 11; continue $sw3; }
                    $pc3 = 23; continue $sw3;
                }
                case 23: {
                    try {
                        r2.add(r5.v5());
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 34; continue $sw3;
                    }
                    if (r5.v5().equals(com.aide.ui.U.er().DW()) == true) { $pc3 = 11; continue $sw3; }
                    r3 = true;
                    { $pc3 = 11; continue $sw3; }
                }
                case 26: {
                    if (r3 == true) { $pc3 = 28; continue $sw3; }
                    try {
                        DW(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 34; continue $sw3;
                    }
                    return;
                }
                case 28: {
                    try {
                        r7 = new java.util.ArrayList();
                        r8 = r2.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 34; continue $sw3;
                    }
                    $pc3 = 30; continue $sw3;
                }
                case 30: {
                    if (r8.hasNext() == false) { $pc3 = 32; continue $sw3; }
                    try {
                        r7.add(abcd.Vl.tp((java.lang.String) r8.next()));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 34; continue $sw3;
                    }
                    { $pc3 = 30; continue $sw3; }
                }
                case 32: {
                    try {
                        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), com.almlkaide.kaypro.R.string.dialog_modify_title, com.almlkaide.kaypro.R.string.dialog_modify_message, r7, new abcd.Runnablenl(this, r10), null);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 34; continue $sw3;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
