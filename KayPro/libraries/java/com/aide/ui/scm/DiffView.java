package com.aide.ui.scm;

@abcd.Interfacexu
public class DiffView extends com.aide.ui.views.CodeEditText {

    @abcd.Interfacetu
    private static boolean J0;

    @abcd.Interfaceuu
    private static boolean J8;

    @abcd.Interfaceru(field = 2189486516427060765L)
    private java.lang.Object QX;

    @abcd.Interfaceru(field = 3040277300493817989L)
    private com.aide.ui.scm.DiffView.a Ws;

    @abcd.Interfaceru(field = -636136340544233200L)
    private int XL;

    @abcd.Interfaceru(field = -636169269069296487L)
    private int aM;

    @abcd.Interfaceru(field = 2968802806890530263L)
    private com.aide.common.KeyStrokeDetector j3;

    @abcd.Interfacexu
    public class a extends com.aide.ui.views.CodeEditText.b {

        @abcd.Interfaceuu
        private static boolean SI;

        @abcd.Interfacetu
        private static boolean nw;

        @abcd.Interfaceru(field = 1348204581343355400L)
        private java.util.List<com.aide.ui.scm.DiffView.c> KD;

        @abcd.Interfaceru(field = 583724768663328465L)
        private com.aide.engine.ClassO cb;

        @abcd.Interfaceru(field = 2545998618238386224L)
        private java.util.ArrayList<java.lang.Integer> cn;

        @abcd.Interfaceru(field = 583692788180474280L)
        private com.aide.engine.ClassO dx;

        @abcd.Interfaceru(field = -880815428847654123L)
        private java.util.ArrayList<java.lang.Integer> ro;

        @abcd.Interfacevu
        final com.aide.ui.scm.DiffView sG;

        @abcd.Interfaceru(field = 2546098541940689505L)
        private java.util.ArrayList<java.lang.Integer> sh;

        static {
            abcd.wu.j6(com.aide.ui.scm.DiffView.a.class, -858911175984304184L, -858911175984304184L);
        }

        public a(com.aide.ui.scm.DiffView r6) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 4;
            $sw0: while (true) {
                switch ($pc0) {
                    case 8: {
                        th = $ex0;
                        if (SI == false) { $pc0 = 12; continue $sw0; }
                        abcd.wu.j6(th, -1899540583449713775L, null, r6);
                        $pc0 = 12; continue $sw0;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (nw == false) { $pc0 = 6; continue $sw0; }
                        try {
                            abcd.wu.j6(-1899540583449713775L, null, r6);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 8; continue $sw0;
                        }
                        $pc0 = 6; continue $sw0;
                    }
                    case 6: {
                        try {
                            this.sG = r6;
                            super(r6);
                            this.KD = new java.util.ArrayList();
                            j3();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 8; continue $sw0;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = 2594614560312257325L)
        private void DW(java.lang.String r7) {
            int r2 = 0;
            int r3 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 12;
            $sw1: while (true) {
                switch ($pc1) {
                    case 12: {
                        th = $ex1;
                        if (SI == false) { $pc1 = 16; continue $sw1; }
                        abcd.wu.j6(th, -1999544909227185920L, this, r7);
                        $pc1 = 16; continue $sw1;
                    }
                    case 16: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (nw == false) { $pc1 = 6; continue $sw1; }
                        try {
                            abcd.wu.j6(-1999544909227185920L, this, r7);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 12; continue $sw1;
                        }
                        $pc1 = 6; continue $sw1;
                    }
                    case 6: {
                        try {
                            r2 = v5() - 1;
                            r3 = EQ(r2) - 1;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 12; continue $sw1;
                        }
                        if (r3 != (-1)) { $pc1 = 9; continue $sw1; }
                        if (r2 != 0) { $pc1 = 9; continue $sw1; }
                        $pc1 = 20; continue $sw1;
                    }
                    case 20: {
                        try {
                            j6(0, 0, new com.aide.ui.scm.DiffView.b(r7), this);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.IOException) { $pc1 = 17; continue $sw1; }
                            $pc1 = 12; continue $sw1;
                        }
                        return;
                    }
                    case 21: {
                        return;
                    }
                    case 9: {
                        try {
                            j6(new abcd.hm(0, 0, r2, r3), this);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 12; continue $sw1;
                        }
                        { $pc1 = 20; continue $sw1; }
                    }
                    case 17: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = 1349658793897232104L)
        private void FH(java.lang.String r5) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = 4;
            $sw2: while (true) {
                switch ($pc2) {
                    case 8: {
                        th = $ex2;
                        if (SI == false) { $pc2 = 12; continue $sw2; }
                        abcd.wu.j6(th, 1266884240733767851L, this, r5);
                        $pc2 = 12; continue $sw2;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (nw == false) { $pc2 = 6; continue $sw2; }
                        try {
                            abcd.wu.j6(1266884240733767851L, this, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 8; continue $sw2;
                        }
                        $pc2 = 6; continue $sw2;
                    }
                    case 6: {
                        try {
                            this.KD.clear();
                            DW(r5);
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

        static void j6(com.aide.ui.scm.DiffView.a r0, java.lang.String r1) {
            r0.FH(r1);
        }

        @Override
        public void DW(char r1, int r2, int r3) {
            super.DW(r1, r2, r3);
        }

        @Override
        public void DW(int r1, int r2, int r3) {
            super.DW(r1, r2, r3);
        }

        @Override
        public void DW(com.aide.engine.Enumm[] r1, int[] r2, int[] r3, int[] r4, int[] r5, int r6) {
            super.DW(r1, r2, r3, r4, r5, r6);
        }

        @Override
        public com.aide.ui.views.editor.ClassS FH(int r1) {
            return super.FH(r1);
        }

        @Override
        public void J8(int r1, int r2) {
            super.J8(r1, r2);
        }

        @Override
        public void QX(int r1, int r2) {
            super.QX(r1, r2);
        }

        @Override
        public int VH(int r1, int r2) {
            return super.VH(r1, r2);
        }

        @Override
        public boolean Ws(int r1, int r2) {
            return super.Ws(r1, r2);
        }

        @Override
        public boolean gn(int r8, int r9) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = 3;
            $sw3: while (true) {
                switch ($pc3) {
                    case 12: {
                        th = $ex3;
                        if (SI == false) { $pc3 = 16; continue $sw3; }
                        abcd.wu.j6(th, 733658571807984289L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                        $pc3 = 16; continue $sw3;
                    }
                    case 16: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (nw == false) { $pc3 = 6; continue $sw3; }
                        try {
                            abcd.wu.j6(733658571807984289L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 12; continue $sw3;
                        }
                        $pc3 = 6; continue $sw3;
                    }
                    case 6: {
                        if (this.KD.size() <= r9) { $pc3 = 10; continue $sw3; }
                        if (this.KD.get(r9) != com.aide.ui.scm.DiffView.c.DW) { $pc3 = 10; continue $sw3; }
                        return true;
                    }
                    case 10: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void j6(char r1, int r2, int r3) {
            super.j6(r1, r2, r3);
        }

        @Override
        public void j6(int r1, int r2, int r3, int r4, java.lang.String r5) {
            super.j6(r1, r2, r3, r4, r5);
        }

        public void j6(java.util.List<java.lang.String> r12, java.util.List<java.lang.String> r13, java.util.List<com.aide.ui.scm.ClassB.a> r14) {
            java.io.StringWriter r0 = null;
            java.io.PrintWriter r1 = null;
            int r4 = 0;
            int r5 = 0;
            com.aide.ui.scm.ClassB.a r6 = null;
            int r7 = 0;
            int r8 = 0;
            int r9 = 0;
            int r10 = 0;
            int r11 = 0;
            int r15 = 0;
            int r16 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = 3;
            $sw4: while (true) {
                switch ($pc4) {
                    case 40: {
                        th = $ex4;
                        if (SI == false) { $pc4 = 45; continue $sw4; }
                        abcd.wu.j6(th, -5607053438206852760L, this, r12, r13, r14);
                        $pc4 = 45; continue $sw4;
                    }
                    case 45: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (nw == false) { $pc4 = 5; continue $sw4; }
                        try {
                            abcd.wu.j6(-5607053438206852760L, this, r12, r13, r14);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 40; continue $sw4;
                        }
                        $pc4 = 5; continue $sw4;
                    }
                    case 5: {
                        try {
                            this.cb = null;
                            this.dx = null;
                            this.KD = new java.util.ArrayList();
                            this.ro = new java.util.ArrayList();
                            this.cn = new java.util.ArrayList();
                            this.sh = new java.util.ArrayList();
                            r0 = new java.io.StringWriter();
                            r1 = new java.io.PrintWriter(r0);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 40; continue $sw4;
                        }
                        r4 = 0;
                        r5 = -1;
                        $pc4 = 7; continue $sw4;
                    }
                    case 7: {
                        if (r4 >= r14.size()) { $pc4 = 38; continue $sw4; }
                        try {
                            r6 = r14.get(r4);
                            r7 = r6.j6() - 3;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 40; continue $sw4;
                        }
                        $pc4 = 10; continue $sw4;
                    }
                    case 10: {
                        if (r7 >= r6.j6()) { $pc4 = 15; continue $sw4; }
                        if (r7 < r5) { $pc4 = 14; continue $sw4; }
                        if (r7 < 0) { $pc4 = 14; continue $sw4; }
                        try {
                            r1.println(r13.get(r7));
                            this.cn.add(-1);
                            this.sh.add(java.lang.Integer.valueOf(r7));
                            this.KD.add(com.aide.ui.scm.DiffView.c.FH);
                            this.ro.add(java.lang.Integer.valueOf(r7));
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 40; continue $sw4;
                        }
                        $pc4 = 14; continue $sw4;
                    }
                    case 14: {
                        try {
                            r7 = r7 + 1;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 40; continue $sw4;
                        }
                        { $pc4 = 10; continue $sw4; }
                    }
                    case 15: {
                        r8 = 0;
                        $pc4 = 17; continue $sw4;
                    }
                    case 17: {
                        if (r8 >= r6.Hw()) { $pc4 = 19; continue $sw4; }
                        try {
                            r1.println(r12.get(r6.FH() + r8));
                            this.cn.add(java.lang.Integer.valueOf(r6.FH() + r8));
                            this.sh.add(-1);
                            this.KD.add(com.aide.ui.scm.DiffView.c.j6);
                            this.ro.add(java.lang.Integer.valueOf(r6.j6()));
                            r8 = r8 + 1;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 40; continue $sw4;
                        }
                        { $pc4 = 17; continue $sw4; }
                    }
                    case 19: {
                        r9 = 0;
                        $pc4 = 21; continue $sw4;
                    }
                    case 21: {
                        if (r9 >= r6.DW()) { $pc4 = 23; continue $sw4; }
                        try {
                            r1.println(r13.get(r6.j6() + r9));
                            this.cn.add(-1);
                            this.sh.add(java.lang.Integer.valueOf(r6.j6() + r9));
                            this.KD.add(com.aide.ui.scm.DiffView.c.DW);
                            this.ro.add(java.lang.Integer.valueOf(r6.j6() + r9));
                            r9 = r9 + 1;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 40; continue $sw4;
                        }
                        { $pc4 = 21; continue $sw4; }
                    }
                    case 23: {
                        r10 = Integer.MAX_VALUE;
                        try {
                            r11 = r4 + 1;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 40; continue $sw4;
                        }
                        if (r11 >= r14.size()) { $pc4 = 26; continue $sw4; }
                        try {
                            r10 = r14.get(r11).j6();
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 40; continue $sw4;
                        }
                        $pc4 = 26; continue $sw4;
                    }
                    case 26: {
                        try {
                            r15 = r6.j6() + r6.DW();
                            r16 = r15 + 3;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 40; continue $sw4;
                        }
                        $pc4 = 27; continue $sw4;
                    }
                    case 27: {
                        if (r15 >= r16) { $pc4 = 33; continue $sw4; }
                        if (r15 >= r10) { $pc4 = 33; continue $sw4; }
                        if (r15 >= r13.size()) { $pc4 = 33; continue $sw4; }
                        try {
                            r1.println(r13.get(r15));
                            this.cn.add(-1);
                            this.sh.add(java.lang.Integer.valueOf(r15));
                            this.KD.add(com.aide.ui.scm.DiffView.c.FH);
                            this.ro.add(java.lang.Integer.valueOf(r15));
                            r15 = r15 + 1;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 40; continue $sw4;
                        }
                        $pc4 = 33; continue $sw4;
                    }
                    case 33: {
                        if (r16 >= (r10 - 3)) { $pc4 = 37; continue $sw4; }
                        if (r4 == (r14.size() - 1)) { $pc4 = 37; continue $sw4; }
                        try {
                            r1.println("");
                            this.cn.add(-1);
                            this.sh.add(-1);
                            this.KD.add(com.aide.ui.scm.DiffView.c.Hw);
                            this.ro.add(0);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 40; continue $sw4;
                        }
                        $pc4 = 37; continue $sw4;
                    }
                    case 37: {
                        r5 = r16;
                        r4 = r11;
                        { $pc4 = 7; continue $sw4; }
                    }
                    case 38: {
                        try {
                            r1.flush();
                            DW(r0.toString());
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 40; continue $sw4;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public void j6(boolean r15, com.aide.engine.Enumm[] r16, int[] r17, int[] r18, int[] r19, int[] r20, int r21) {
            int r3 = 0;
            com.aide.engine.ClassO r1 = null;
            int r2 = 0;
            int r4 = 0;
            int r5 = 0;
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        r3 = 0;
                        if (nw == false) { $pc5 = 6; continue $sw5; }
                        abcd.wu.j6(-4291566791386378392L, this, new java.lang.Object[]{new java.lang.Boolean(r15), r16, r17, r18, r19, r20, new java.lang.Integer(r21)});
                        $pc5 = 6; continue $sw5;
                    }
                    case 6: {
                        if (r15 == false) { $pc5 = 8; continue $sw5; }
                        this.dx = new com.aide.engine.ClassO();
                        this.dx.j6(r16, r17, r18, r19, r20, r21);
                        $pc5 = 10; continue $sw5;
                    }
                    case 10: {
                        if (this.dx != null) { $pc5 = 12; continue $sw5; }
                        return;
                    }
                    case 12: {
                        if (this.cb == null) { $pc5 = 35; continue $sw5; }
                        r1 = ei();
                        r1.j6();
                        r2 = 0;
                        $pc5 = 15; continue $sw5;
                    }
                    case 15: {
                        if (r2 >= this.cn.size()) { $pc5 = 21; continue $sw5; }
                        r4 = this.cn.get(r2).intValue();
                        if (r4 == (-1)) { $pc5 = 19; continue $sw5; }
                        r1.j6(r2, this.dx, r4);
                        $pc5 = 19; continue $sw5;
                    }
                    case 19: {
                        r2 = r2 + 1;
                        $pc5 = 21; continue $sw5;
                    }
                    case 21: {
                        if (r3 >= this.sh.size()) { $pc5 = 26; continue $sw5; }
                        r5 = this.sh.get(r3).intValue();
                        if (r5 == (-1)) { $pc5 = 25; continue $sw5; }
                        r1.j6(r3, this.cb, r5);
                        $pc5 = 25; continue $sw5;
                    }
                    case 25: {
                        r3 = r3 + 1;
                        { $pc5 = 21; continue $sw5; }
                    }
                    case 26: {
                        P8();
                        return;
                    }
                    case 35: {
                        return;
                    }
                    case 8: {
                        this.cb = new com.aide.engine.ClassO();
                        this.cb.j6(r16, r17, r18, r19, r20, r21);
                        { $pc5 = 10; continue $sw5; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void j6(com.aide.engine.Enumm[] r1, int[] r2, int[] r3, int[] r4, int[] r5, int r6) {
            super.j6(r1, r2, r3, r4, r5, r6);
        }

        @Override
        public boolean j6(int r5) {
            int r3 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex6 = null;
            int $pc6 = 4;
            $sw6: while (true) {
                switch ($pc6) {
                    case 14: {
                        th = $ex6;
                        if (SI == false) { $pc6 = 18; continue $sw6; }
                        abcd.wu.j6(th, 3176938342339038607L, this, new java.lang.Integer(r5));
                        $pc6 = 18; continue $sw6;
                    }
                    case 18: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (nw == false) { $pc6 = 6; continue $sw6; }
                        try {
                            abcd.wu.j6(3176938342339038607L, this, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 14; continue $sw6;
                        }
                        $pc6 = 6; continue $sw6;
                    }
                    case 6: {
                        if (r5 <= 0) { $pc6 = 12; continue $sw6; }
                        try {
                            r3 = r5 - 1;
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 14; continue $sw6;
                        }
                        if (this.KD.size() <= r3) { $pc6 = 12; continue $sw6; }
                        if (this.KD.get(r3) != com.aide.ui.scm.DiffView.c.Hw) { $pc6 = 12; continue $sw6; }
                        return true;
                    }
                    case 12: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public int tp() {
            return super.tp();
        }

        @Override
        public boolean tp(int r5) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex7 = null;
            int $pc7 = 4;
            $sw7: while (true) {
                switch ($pc7) {
                    case 8: {
                        th = $ex7;
                        if (SI == false) { $pc7 = 12; continue $sw7; }
                        abcd.wu.j6(th, -1537978937404656435L, this, new java.lang.Integer(r5));
                        $pc7 = 12; continue $sw7;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (nw == false) { $pc7 = 15; continue $sw7; }
                        try {
                            abcd.wu.j6(-1537978937404656435L, this, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 8; continue $sw7;
                        }
                        return false;
                    }
                    case 15: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean u7(int r8, int r9) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex8 = null;
            int $pc8 = 3;
            $sw8: while (true) {
                switch ($pc8) {
                    case 12: {
                        th = $ex8;
                        if (SI == false) { $pc8 = 16; continue $sw8; }
                        abcd.wu.j6(th, 325838956882811336L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                        $pc8 = 16; continue $sw8;
                    }
                    case 16: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (nw == false) { $pc8 = 6; continue $sw8; }
                        try {
                            abcd.wu.j6(325838956882811336L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 12; continue $sw8;
                        }
                        $pc8 = 6; continue $sw8;
                    }
                    case 6: {
                        if (this.KD.size() <= r9) { $pc8 = 10; continue $sw8; }
                        if (this.KD.get(r9) != com.aide.ui.scm.DiffView.c.j6) { $pc8 = 10; continue $sw8; }
                        return true;
                    }
                    case 10: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void vy() {
            super.vy();
        }
    }

    @abcd.Interfacexu
    private static class b extends java.io.Reader {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = 1959472078989220112L)
        private java.lang.String FH;

        @abcd.Interfaceru(field = -1236157226571306723L)
        private int Hw;

        @abcd.Interfaceru(field = -179639570537357472L)
        private int v5;

        static {
            abcd.wu.j6(com.aide.ui.scm.DiffView.b.class, 344059681158054648L, 344059681158054648L);
        }

        @abcd.Interfacesu(method = -205402445807323376L)
        public b(java.lang.String r6) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex9 = null;
            int $pc9 = 4;
            $sw9: while (true) {
                switch ($pc9) {
                    case 8: {
                        th = $ex9;
                        if (DW == false) { $pc9 = 12; continue $sw9; }
                        abcd.wu.j6(th, -2761510744926703464L, null, r6);
                        $pc9 = 12; continue $sw9;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc9 = 6; continue $sw9; }
                        try {
                            abcd.wu.j6(-2761510744926703464L, null, r6);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 8; continue $sw9;
                        }
                        $pc9 = 6; continue $sw9;
                    }
                    case 6: {
                        try {
                            j6(r6);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 8; continue $sw9;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = -2829168681434493112L)
        public void close() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex10 = null;
            int $pc10 = 4;
            $sw10: while (true) {
                switch ($pc10) {
                    case 7: {
                        th = $ex10;
                        if (DW == false) { $pc10 = 11; continue $sw10; }
                        abcd.wu.j6(th, -337100010472454541L, this);
                        $pc10 = 11; continue $sw10;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc10 = 14; continue $sw10; }
                        try {
                            abcd.wu.j6(-337100010472454541L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 7; continue $sw10;
                        }
                        return;
                    }
                    case 14: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = -2131931566749880125L)
        public void j6(java.lang.String r5) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex11 = null;
            int $pc11 = 4;
            $sw11: while (true) {
                switch ($pc11) {
                    case 8: {
                        th = $ex11;
                        if (DW == false) { $pc11 = 12; continue $sw11; }
                        abcd.wu.j6(th, 1422684757358836452L, this, r5);
                        $pc11 = 12; continue $sw11;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc11 = 6; continue $sw11; }
                        try {
                            abcd.wu.j6(1422684757358836452L, this, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 8; continue $sw11;
                        }
                        $pc11 = 6; continue $sw11;
                    }
                    case 6: {
                        try {
                            this.FH = r5;
                            this.Hw = r5.length();
                            this.v5 = 0;
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 8; continue $sw11;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = 129735231389024460L)
        public int read() {
            java.lang.String r2 = null;
            int r3 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex12 = null;
            int $pc12 = 4;
            $sw12: while (true) {
                switch ($pc12) {
                    case 17: {
                        th = $ex12;
                        if (DW == false) { $pc12 = 21; continue $sw12; }
                        abcd.wu.j6(th, 1188225919907983775L, this);
                        $pc12 = 21; continue $sw12;
                    }
                    case 21: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc12 = 7; continue $sw12; }
                        try {
                            abcd.wu.j6(1188225919907983775L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex12 = $t;
                            $pc12 = 17; continue $sw12;
                        }
                        $pc12 = 7; continue $sw12;
                    }
                    case 7: {
                        if (this.v5 >= this.Hw) { $pc12 = 11; continue $sw12; }
                        try {
                            r2 = this.FH;
                            r3 = this.v5;
                            this.v5 = r3 + 1;
                        } catch (java.lang.Throwable $t) {
                            $ex12 = $t;
                            $pc12 = 17; continue $sw12;
                        }
                        return r2.charAt(r3);
                    }
                    case 11: {
                        if (this.v5 != this.Hw) { $pc12 = 15; continue $sw12; }
                        try {
                            this.v5++;
                        } catch (java.lang.Throwable $t) {
                            $ex12 = $t;
                            $pc12 = 17; continue $sw12;
                        }
                        return 10;
                    }
                    case 15: {
                        return -1;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = 1063031570219061944L)
        public int read(char[] r9, int r10, int r11) {
            int r0 = 0;
            int r1 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex13 = null;
            int $pc13 = 3;
            $sw13: while (true) {
                switch ($pc13) {
                    case 27: {
                        th = $ex13;
                        if (DW == false) { $pc13 = 31; continue $sw13; }
                        abcd.wu.j6(th, 4171741386555731135L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                        $pc13 = 31; continue $sw13;
                    }
                    case 31: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc13 = 5; continue $sw13; }
                        try {
                            abcd.wu.j6(4171741386555731135L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                        } catch (java.lang.Throwable $t) {
                            $ex13 = $t;
                            $pc13 = 27; continue $sw13;
                        }
                        $pc13 = 5; continue $sw13;
                    }
                    case 5: {
                        if (r10 < 0) { $pc13 = 26; continue $sw13; }
                        if (r10 > r9.length) { $pc13 = 26; continue $sw13; }
                        if (r11 < 0) { $pc13 = 26; continue $sw13; }
                        try {
                            r0 = r10 + r11;
                        } catch (java.lang.Throwable $t) {
                            $ex13 = $t;
                            $pc13 = 27; continue $sw13;
                        }
                        if (r0 > r9.length) { $pc13 = 26; continue $sw13; }
                        if (r0 < 0) { $pc13 = 26; continue $sw13; }
                        if (r11 != 0) { $pc13 = 16; continue $sw13; }
                        return 0;
                    }
                    case 16: {
                        if (this.v5 <= this.Hw) { $pc13 = 20; continue $sw13; }
                        return -1;
                    }
                    case 20: {
                        if (this.v5 != this.Hw) { $pc13 = 23; continue $sw13; }
                        try {
                            r9[r10] = '\n';
                            this.v5++;
                        } catch (java.lang.Throwable $t) {
                            $ex13 = $t;
                            $pc13 = 27; continue $sw13;
                        }
                        return 1;
                    }
                    case 23: {
                        try {
                            r1 = java.lang.Math.min(this.Hw - this.v5, r11);
                            this.FH.getChars(this.v5, this.v5 + r1, r9, r10);
                            this.v5 += r1;
                        } catch (java.lang.Throwable $t) {
                            $ex13 = $t;
                            $pc13 = 27; continue $sw13;
                        }
                        return r1;
                    }
                    case 26: {
                        try {
                            throw new java.lang.IndexOutOfBoundsException();
                        } catch (java.lang.Throwable $t) {
                            $ex13 = $t;
                            $pc13 = 27; continue $sw13;
                        }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    @abcd.Interfacexu
    private static final class c extends com.almlkaide.kaypro.internal.EnumBase {

        @abcd.Interfaceru(field = -3315372281895001020L)
        public static final com.aide.ui.scm.DiffView.c DW = null;

        @abcd.Interfaceru(field = 148399580296853895L)
        public static final com.aide.ui.scm.DiffView.c FH = null;

        @abcd.Interfaceru(field = -716603339664427657L)
        public static final com.aide.ui.scm.DiffView.c Hw = null;

        @abcd.Interfaceuu
        private static boolean VH;

        @abcd.Interfacetu
        private static boolean Zo;

        @abcd.Interfaceru(field = -3289932142681750923L)
        public static final com.aide.ui.scm.DiffView.c j6 = null;
        private static final com.aide.ui.scm.DiffView.c[] v5 = null;

        static {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex14 = null;
            int $pc14 = -1;
            $sw14: while (true) {
                switch ($pc14) {
                    case -1: {
                        try {
                            abcd.wu.j6(com.aide.ui.scm.DiffView.c.class, -643176075855783200L, -643176075855783200L);
                        } catch (java.lang.Throwable $t) {
                            $ex14 = $t;
                            $pc14 = 8; continue $sw14;
                        }
                        if (Zo == false) { $pc14 = 6; continue $sw14; }
                        try {
                            abcd.wu.j6(2422059270640380000L, null);
                        } catch (java.lang.Throwable $t) {
                            $ex14 = $t;
                            $pc14 = 8; continue $sw14;
                        }
                        $pc14 = 6; continue $sw14;
                    }
                    case 6: {
                        try {
                            j6 = new com.aide.ui.scm.DiffView.c("deleted", 0);
                            DW = new com.aide.ui.scm.DiffView.c("inserted", 1);
                            FH = new com.aide.ui.scm.DiffView.c("normal", 2);
                            Hw = new com.aide.ui.scm.DiffView.c("separator", 3);
                            v5 = new com.aide.ui.scm.DiffView.c[]{j6, DW, FH, Hw};
                        } catch (java.lang.Throwable $t) {
                            $ex14 = $t;
                            $pc14 = 8; continue $sw14;
                        }
                        return;
                    }
                    case 8: {
                        th = $ex14;
                        if (VH == false) { $pc14 = 12; continue $sw14; }
                        abcd.wu.j6(th, 2422059270640380000L, null);
                        $pc14 = 12; continue $sw14;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = -109728416929794048L)
        private c(java.lang.String r8, int r9) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex15 = null;
            int $pc15 = 3;
            $sw15: while (true) {
                switch ($pc15) {
                    case 7: {
                        th = $ex15;
                        if (VH == false) { $pc15 = 11; continue $sw15; }
                        abcd.wu.j6(th, -6331272462828957300L, null, r8, new java.lang.Integer(r9));
                        $pc15 = 11; continue $sw15;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (Zo == false) { $pc15 = 5; continue $sw15; }
                        try {
                            abcd.wu.j6(-6331272462828957300L, null, r8, new java.lang.Integer(r9));
                        } catch (java.lang.Throwable $t) {
                            $ex15 = $t;
                            $pc15 = 7; continue $sw15;
                        }
                        $pc15 = 5; continue $sw15;
                    }
                    case 5: {
                        try {
                            super(r8, r9);
                        } catch (java.lang.Throwable $t) {
                            $ex15 = $t;
                            $pc15 = 7; continue $sw15;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = 650836046562999087L)
        public static com.aide.ui.scm.DiffView.c valueOf(java.lang.String r5) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex16 = null;
            int $pc16 = 4;
            $sw16: while (true) {
                switch ($pc16) {
                    case 8: {
                        th = $ex16;
                        if (VH == false) { $pc16 = 12; continue $sw16; }
                        abcd.wu.j6(th, -205199222549346272L, null, r5);
                        $pc16 = 12; continue $sw16;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (Zo == false) { $pc16 = 6; continue $sw16; }
                        try {
                            abcd.wu.j6(-205199222549346272L, null, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 8; continue $sw16;
                        }
                        $pc16 = 6; continue $sw16;
                    }
                    case 6: {
                        return (com.aide.ui.scm.DiffView.c) com.almlkaide.kaypro.internal.EnumBase.valueOf(com.aide.ui.scm.DiffView.c.values(), r5);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = 981975102083389773L)
        public static com.aide.ui.scm.DiffView.c[] values() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex17 = null;
            int $pc17 = 4;
            $sw17: while (true) {
                switch ($pc17) {
                    case 8: {
                        th = $ex17;
                        if (VH == false) { $pc17 = 12; continue $sw17; }
                        abcd.wu.j6(th, -1583076517914858000L, null);
                        $pc17 = 12; continue $sw17;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (Zo == false) { $pc17 = 6; continue $sw17; }
                        try {
                            abcd.wu.j6(-1583076517914858000L, null);
                        } catch (java.lang.Throwable $t) {
                            $ex17 = $t;
                            $pc17 = 8; continue $sw17;
                        }
                        $pc17 = 6; continue $sw17;
                    }
                    case 6: {
                        return (com.aide.ui.scm.DiffView.c[]) v5.clone();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        abcd.wu.j6(com.aide.ui.scm.DiffView.class, -2208139259786690749L, -2208139259786690749L);
    }

    public DiffView(android.content.Context r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = 4;
        $sw18: while (true) {
            switch ($pc18) {
                case 8: {
                    th = $ex18;
                    if (J8 == false) { $pc18 = 12; continue $sw18; }
                    abcd.wu.j6(th, 995507978695068615L, null, r6);
                    $pc18 = 12; continue $sw18;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (J0 == false) { $pc18 = 6; continue $sw18; }
                    try {
                        abcd.wu.j6(995507978695068615L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 8; continue $sw18;
                    }
                    $pc18 = 6; continue $sw18;
                }
                case 6: {
                    try {
                        super(r6);
                        this.QX = new java.lang.Object();
                        rN();
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 8; continue $sw18;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public DiffView(android.content.Context r8, android.util.AttributeSet r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = 3;
        $sw19: while (true) {
            switch ($pc19) {
                case 7: {
                    th = $ex19;
                    if (J8 == false) { $pc19 = 11; continue $sw19; }
                    abcd.wu.j6(th, -426445272046881660L, null, r8, r9);
                    $pc19 = 11; continue $sw19;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (J0 == false) { $pc19 = 5; continue $sw19; }
                    try {
                        abcd.wu.j6(-426445272046881660L, null, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 7; continue $sw19;
                    }
                    $pc19 = 5; continue $sw19;
                }
                case 5: {
                    try {
                        super(r8, r9);
                        this.QX = new java.lang.Object();
                        rN();
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 7; continue $sw19;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public DiffView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = 3;
        $sw20: while (true) {
            switch ($pc20) {
                case 7: {
                    th = $ex20;
                    if (J8 == false) { $pc20 = 11; continue $sw20; }
                    abcd.wu.j6(th, 3016008985590151361L, null, r9, r10, new java.lang.Integer(r11));
                    $pc20 = 11; continue $sw20;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (J0 == false) { $pc20 = 5; continue $sw20; }
                    try {
                        abcd.wu.j6(3016008985590151361L, null, r9, r10, new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 7; continue $sw20;
                    }
                    $pc20 = 5; continue $sw20;
                }
                case 5: {
                    try {
                        super(r9, r10, r11);
                        this.QX = new java.lang.Object();
                        rN();
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 7; continue $sw20;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 6296053236678548421L)
    private java.util.List<java.lang.String> j6(java.lang.String r8, java.lang.StringBuilder r9) {
        java.util.ArrayList r0 = null;
        java.io.Reader r1 = null;
        com.aide.ui.scm.ClassC r3 = null;
        java.io.BufferedReader r2 = null;
        java.lang.String r4 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = 3;
        $sw21: while (true) {
            switch ($pc21) {
                case 26: {
                    th = $ex21;
                    if (J8 == false) { $pc21 = 31; continue $sw21; }
                    abcd.wu.j6(th, -3409178666275389900L, this, r8, r9);
                    $pc21 = 31; continue $sw21;
                }
                case 31: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (J0 == false) { $pc21 = 5; continue $sw21; }
                    try {
                        abcd.wu.j6(-3409178666275389900L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 26; continue $sw21;
                    }
                    $pc21 = 5; continue $sw21;
                }
                case 5: {
                    if (r8 == null) { $pc21 = 25; continue $sw21; }
                    if (new java.io.File(r8).exists() == false) { $pc21 = 25; continue $sw21; }
                    try {
                        r0 = new java.util.ArrayList();
                        r1 = abcd.Vl.lg(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.io.IOException) { $pc21 = 21; continue $sw21; }
                        $pc21 = 26; continue $sw21;
                    }
                    try {
                        r3 = new com.aide.ui.scm.ClassC(this, r0, r9);
                        com.aide.ui.views.editor.ra.j6(r1, r3, new char[1024]);
                        r2 = new java.io.BufferedReader(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 18; continue $sw21;
                    }
                    $pc21 = 12; continue $sw21;
                }
                case 12: {
                    try {
                        r4 = r2.readLine();
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 18; continue $sw21;
                    }
                    if (r4 == null) { $pc21 = 16; continue $sw21; }
                    try {
                        r0.add(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 18; continue $sw21;
                    }
                    { $pc21 = 12; continue $sw21; }
                }
                case 16: {
                    try {
                        r1.close();
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.io.IOException) { $pc21 = 21; continue $sw21; }
                        $pc21 = 26; continue $sw21;
                    }
                    return r0;
                }
                case 18: {
                    th = $ex21;
                    try {
                        r1.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.io.IOException) { $pc21 = 21; continue $sw21; }
                        $pc21 = 26; continue $sw21;
                    }
                }
                case 21: {
                    e = $ex21;
                    try {
                        com.aide.common.ClassH.DW(e);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 26; continue $sw21;
                    }
                    return java.util.Collections.emptyList();
                }
                case 25: {
                    return java.util.Collections.emptyList();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2506261604080349775L)
    private void rN() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = 4;
        $sw22: while (true) {
            switch ($pc22) {
                case 8: {
                    th = $ex22;
                    if (J8 == false) { $pc22 = 12; continue $sw22; }
                    abcd.wu.j6(th, -1915893125802515200L, this);
                    $pc22 = 12; continue $sw22;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (J0 == false) { $pc22 = 6; continue $sw22; }
                    try {
                        abcd.wu.j6(-1915893125802515200L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 8; continue $sw22;
                    }
                    $pc22 = 6; continue $sw22;
                }
                case 6: {
                    try {
                        this.Ws = new com.aide.ui.scm.DiffView.a(this);
                        getOEditorView().setModel(this.Ws);
                        getOEditorView().setEditable(false);
                        getOEditorView().setCaretVisibility(false);
                        this.j3 = new com.aide.common.KeyStrokeDetector(getContext());
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 8; continue $sw22;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a8() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = 4;
        $sw23: while (true) {
            switch ($pc23) {
                case 8: {
                    th = $ex23;
                    if (J8 == false) { $pc23 = 12; continue $sw23; }
                    abcd.wu.j6(th, 387079889831802768L, this);
                    $pc23 = 12; continue $sw23;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (J0 == false) { $pc23 = 6; continue $sw23; }
                    try {
                        abcd.wu.j6(387079889831802768L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 8; continue $sw23;
                    }
                    $pc23 = 6; continue $sw23;
                }
                case 6: {
                    try {
                        setIsLightTheme(com.aide.ui.aa.lg());
                        getOEditorView().setTabSize(com.aide.ui.aa.cn());
                        getOEditorView().setInsertTabsAsSpaces(com.aide.ui.aa.a8());
                        getOEditorView().setFontSize(com.aide.ui.aa.tp());
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 8; continue $sw23;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public com.aide.ui.scm.DiffView.a getDiffViewModel() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = 4;
        $sw24: while (true) {
            switch ($pc24) {
                case 8: {
                    th = $ex24;
                    if (J8 == false) { $pc24 = 12; continue $sw24; }
                    abcd.wu.j6(th, -1843515684582880245L, this);
                    $pc24 = 12; continue $sw24;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (J0 == false) { $pc24 = 6; continue $sw24; }
                    try {
                        abcd.wu.j6(-1843515684582880245L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 8; continue $sw24;
                    }
                    $pc24 = 6; continue $sw24;
                }
                case 6: {
                    return this.Ws;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.aide.common.KeyStrokeDetector getKeyStrokeDetector() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = 4;
        $sw25: while (true) {
            switch ($pc25) {
                case 8: {
                    th = $ex25;
                    if (J8 == false) { $pc25 = 12; continue $sw25; }
                    abcd.wu.j6(th, 4042976247959491595L, this);
                    $pc25 = 12; continue $sw25;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (J0 == false) { $pc25 = 6; continue $sw25; }
                    try {
                        abcd.wu.j6(4042976247959491595L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 8; continue $sw25;
                    }
                    $pc25 = 6; continue $sw25;
                }
                case 6: {
                    return this.j3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(com.aide.engine.FileHighlightings r13) {
        java.lang.Object r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = 25;
        $sw26: while (true) {
            switch ($pc26) {
                case 25: {
                    th = $ex26;
                    if (J8 == false) { $pc26 = 29; continue $sw26; }
                    abcd.wu.j6(th, -934210217849879579L, this, r13);
                    $pc26 = 29; continue $sw26;
                }
                case 29: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (J0 == false) { $pc26 = 6; continue $sw26; }
                    try {
                        abcd.wu.j6(-934210217849879579L, this, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 25; continue $sw26;
                    }
                    $pc26 = 6; continue $sw26;
                }
                case 6: {
                    try {
                        r2 = this.QX;
                        monitor-enter(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 25; continue $sw26;
                    }
                    $pc26 = 22; continue $sw26;
                }
                case 22: {
                    th = $ex26;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 25; continue $sw26;
                    }
                }
                case 9: {
                    if (r13.tp != this.XL) { $pc26 = 11; continue $sw26; }
                    $pc26 = 14; continue $sw26;
                }
                case 14: {
                    try {
                        monitor-exit(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 22; continue $sw26;
                    }
                    if (r13.tp != this.XL) { $pc26 = 19; continue $sw26; }
                    try {
                        this.Ws.j6(true, r13.Hw, r13.v5, r13.Zo, r13.VH, r13.gn, r13.u7);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 25; continue $sw26;
                    }
                    return;
                }
                case 19: {
                    if (r13.tp != this.aM) { $pc26 = 33; continue $sw26; }
                    try {
                        this.Ws.j6(false, r13.Hw, r13.v5, r13.Zo, r13.VH, r13.gn, r13.u7);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 25; continue $sw26;
                    }
                    return;
                }
                case 33: {
                    return;
                }
                case 11: {
                    if (r13.tp == this.aM) { $pc26 = 14; continue $sw26; }
                    try {
                        monitor-exit(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 22; continue $sw26;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        java.lang.StringBuilder r0 = null;
        java.util.List<java.lang.String> r1 = null;
        java.lang.StringBuilder r2 = null;
        java.util.List<java.lang.String> r3 = null;
        java.util.List<com.aide.ui.scm.ClassB.a> r4 = null;
        java.lang.Object r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex27 = null;
        int $pc27 = 23;
        $sw27: while (true) {
            switch ($pc27) {
                case 23: {
                    th = $ex27;
                    if (J8 == false) { $pc27 = 27; continue $sw27; }
                    abcd.wu.j6(th, -7071736865925709887L, this, r9, r10, r11);
                    $pc27 = 27; continue $sw27;
                }
                case 27: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (J0 == false) { $pc27 = 5; continue $sw27; }
                    try {
                        abcd.wu.j6(-7071736865925709887L, this, r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 23; continue $sw27;
                    }
                    $pc27 = 5; continue $sw27;
                }
                case 5: {
                    try {
                        r0 = new java.lang.StringBuilder();
                        r1 = j6(r9, r0);
                        r2 = new java.lang.StringBuilder();
                        r3 = j6(r10, r2);
                        r4 = com.aide.ui.scm.ClassB.j6(r1, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 23; continue $sw27;
                    }
                    if (r4.size() == 0) { $pc27 = 8; continue $sw27; }
                    $pc27 = 10; continue $sw27;
                }
                case 10: {
                    try {
                        this.Ws.j6(r1, r3, r4);
                        getOEditorView().v5(0, 0);
                        getOEditorView().setSoftMaxWidthRealColumn(-1);
                        r5 = this.QX;
                        monitor-enter(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 23; continue $sw27;
                    }
                    $pc27 = 20; continue $sw27;
                }
                case 20: {
                    th = $ex27;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 23; continue $sw27;
                    }
                }
                case 13: {
                    if (r1.size() == 0) { $pc27 = 16; continue $sw27; }
                    try {
                        this.XL = com.aide.ui.U.EQ().DW(r11, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 20; continue $sw27;
                    }
                    $pc27 = 16; continue $sw27;
                }
                case 16: {
                    if (r3.size() == 0) { $pc27 = 18; continue $sw27; }
                    try {
                        this.aM = com.aide.ui.U.EQ().DW(r11, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 20; continue $sw27;
                    }
                    $pc27 = 18; continue $sw27;
                }
                case 18: {
                    try {
                        monitor-exit(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 20; continue $sw27;
                    }
                    return;
                }
                case 8: {
                    if (r0.toString().equals(r2.toString()) == true) { $pc27 = 10; continue $sw27; }
                    try {
                        setInformationalContent("Only the line separators differ");
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 23; continue $sw27;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void lg() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex28 = null;
        int $pc28 = 4;
        $sw28: while (true) {
            switch ($pc28) {
                case 8: {
                    th = $ex28;
                    if (J8 == false) { $pc28 = 12; continue $sw28; }
                    abcd.wu.j6(th, 2564329294907786848L, this);
                    $pc28 = 12; continue $sw28;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (J0 == false) { $pc28 = 6; continue $sw28; }
                    try {
                        abcd.wu.j6(2564329294907786848L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 8; continue $sw28;
                    }
                    $pc28 = 6; continue $sw28;
                }
                case 6: {
                    try {
                        this.Ws.j6(java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList());
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 8; continue $sw28;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setInformationalContent(java.lang.String r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex29 = null;
        int $pc29 = 4;
        $sw29: while (true) {
            switch ($pc29) {
                case 8: {
                    th = $ex29;
                    if (J8 == false) { $pc29 = 12; continue $sw29; }
                    abcd.wu.j6(th, 2716955397185413032L, this, r6);
                    $pc29 = 12; continue $sw29;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (J0 == false) { $pc29 = 6; continue $sw29; }
                    try {
                        abcd.wu.j6(2716955397185413032L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 8; continue $sw29;
                    }
                    $pc29 = 6; continue $sw29;
                }
                case 6: {
                    try {
                        com.aide.ui.scm.DiffView.a.j6(this.Ws, "\n >>> " + r6 + "\n");
                        getOEditorView().v5(0, 0);
                        getOEditorView().setSoftMaxWidthRealColumn(-1);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 8; continue $sw29;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
