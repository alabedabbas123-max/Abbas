package com.aide.ui;

@abcd.Interfacexu
public class LogCatConsole extends com.aide.ui.views.CodeEditText {

    @abcd.Interfacetu
    private static boolean J0;

    @abcd.Interfaceuu
    private static boolean J8;

    @abcd.Interfaceru(field = -5191424561062524288L)
    private com.aide.ui.Z QX;

    @abcd.Interfaceru(field = 4316204482976094932L)
    private com.aide.ui.Z Ws;

    @abcd.Interfaceru(field = 4338252878867198361L)
    private Sl<abcd.Gk.a> XL;

    @abcd.Interfaceru(field = -3109630105064670124L)
    private android.os.Handler aM;

    @abcd.Interfacexu
    private class a extends com.aide.ui.views.editor.ClassG {

        @abcd.Interfacetu
        private static boolean Mr;

        @abcd.Interfaceuu
        private static boolean U2;

        @abcd.Interfaceru(field = -2719369476068567056L)
        private java.lang.String BT;

        @abcd.Interfaceru(field = -2414098544799711273L)
        private Sl<abcd.Gk.a> a8;

        @abcd.Interfaceru(field = -488254138348913907L)
        private java.lang.String er;

        @abcd.Interfaceru(field = -2654179849536441807L)
        private java.lang.String gW;

        @abcd.Interfaceru(field = 1993501496039044960L)
        private Sl<java.lang.CharSequence> lg;

        @abcd.Interfaceru(field = -4619310223678231935L)
        private int rN;

        @abcd.Interfacevu
        final com.aide.ui.LogCatConsole vy;

        @abcd.Interfaceru(field = 2721951416661405005L)
        private java.lang.String yS;

        static {
            abcd.wu.j6(com.aide.ui.LogCatConsole.a.class, -190089136410662853L, -190089136410662853L);
        }

        @abcd.Interfacesu(method = 382444491516858376L)
        private a(com.aide.ui.LogCatConsole r6) {
        L8:
            th = move-exception;
            if (U2 == false) goto L12;
            abcd.wu.j6(th, 1767246146162564769L, null, r6);
        L12:
            throw th;
        L4:
            if (Mr == false) goto L6;
            abcd.wu.j6(1767246146162564769L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.vy = r6;     // Catch: java.lang.Throwable -> L8
            this.a8 = new abcd.Sl(200);     // Catch: java.lang.Throwable -> L8
            this.lg = new abcd.Sl(200);     // Catch: java.lang.Throwable -> L8
        }

        a(com.aide.ui.LogCatConsole r8, com.aide.ui.C1788ga r9) {
        L7:
            th = move-exception;
            if (U2 == false) goto L11;
            abcd.wu.j6(th, 2036567014628253632L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (Mr == false) goto L5;
            abcd.wu.j6(2036567014628253632L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this(r8);     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = 1244727379411648000L)
        private void DW(Sl<abcd.Gk.a> r8) {
        L25:
            th = move-exception;
            if (U2 == false) goto L30;
            abcd.wu.j6(th, -800200258202867547L, this, r8);
        L30:
            throw th;
        L4:
            if (Mr == false) goto L6;
            abcd.wu.j6(-800200258202867547L, this, r8);     // Catch: java.lang.Throwable -> L25
        L6:
            Sl<abcd.Gk.a> r2 = this.a8;     // Catch: java.lang.Throwable -> L25
            monitor-enter(r2);     // Catch: java.lang.Throwable -> L25
            java.util.ArrayList r3 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L22
            int r4 = r8.Hw() - 1;     // Catch: java.lang.Throwable -> L22
        L9:
            if (r4 < 0) goto L16;
            if (r3.size() >= this.a8.DW()) goto L16;
            abcd.Gk.a r5 = (abcd.Gk.a) r8.j6(r4);     // Catch: java.lang.Throwable -> L22
            if (DW(r5) == false) goto L15;
            r3.add(r5);     // Catch: java.lang.Throwable -> L22
        L15:
            r4 = r4 - 1;     // Catch: java.lang.Throwable -> L22
        L16:
            this.a8.j6();     // Catch: java.lang.Throwable -> L22
            this.lg.j6();     // Catch: java.lang.Throwable -> L22
            this.rN = 10;     // Catch: java.lang.Throwable -> L22
            int r6 = r3.size() - 1;     // Catch: java.lang.Throwable -> L22
        L17:
            if (r6 < 0) goto L19;
            abcd.Gk.a r7 = (abcd.Gk.a) r3.get(r6);     // Catch: java.lang.Throwable -> L22
            this.a8.j6(r7);     // Catch: java.lang.Throwable -> L22
            java.lang.CharSequence r9 = r7.j6();     // Catch: java.lang.Throwable -> L22
            this.lg.j6(r9);     // Catch: java.lang.Throwable -> L22
            this.rN = java.lang.Math.max(this.rN, r9.length());     // Catch: java.lang.Throwable -> L22
            r6 = r6 - 1;     // Catch: java.lang.Throwable -> L22
            goto L17
        L19:
            XL();     // Catch: java.lang.Throwable -> L22
            monitor-exit(r2);     // Catch: java.lang.Throwable -> L22
            return;
        L22:
            th = move-exception;
            throw th;     // Catch: java.lang.Throwable -> L25
        }

        @abcd.Interfacesu(method = -6367332142765307616L)
        private java.lang.String ei() {
        L13:
            th = move-exception;
            if (U2 == false) goto L17;
            abcd.wu.j6(th, 2226875937256018193L, this);
        L17:
            throw th;
        L4:
            if (Mr == false) goto L8;
            abcd.wu.j6(2226875937256018193L, this);     // Catch: java.lang.Throwable -> L13
        L8:
            if (com.aide.ui.LogCatConsole.DW(this.vy).P8() == false) goto L12;
            return "<" + this.vy.getContext().getResources().getString(com.almlkaide.kaypro.R.string.view_logcat_no_match) + ">";
        L12:
            return "<" + this.vy.getContext().getResources().getString(com.almlkaide.kaypro.R.string.view_logcat_run_app) + ">";
        }

        @abcd.Interfacesu(method = -943875658457719256L)
        public void DW(java.lang.String r8, Sl<abcd.Gk.a> r9) {
        L7:
            th = move-exception;
            if (U2 == false) goto L11;
            abcd.wu.j6(th, -1010032137716609L, this, r8, r9);
        L11:
            throw th;
        L3:
            if (Mr == false) goto L5;
            abcd.wu.j6(-1010032137716609L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.BT = null;     // Catch: java.lang.Throwable -> L7
            this.er = r8;     // Catch: java.lang.Throwable -> L7
            this.gW = null;     // Catch: java.lang.Throwable -> L7
            this.yS = null;     // Catch: java.lang.Throwable -> L7
            DW(r9);     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = -966048692930667249L)
        public boolean DW(abcd.Gk.a r5) {
        L26:
            th = move-exception;
            if (U2 == false) goto L30;
            abcd.wu.j6(th, -505482065664382028L, this, r5);
        L30:
            throw th;
        L4:
            if (Mr == false) goto L7;
            abcd.wu.j6(-505482065664382028L, this, r5);     // Catch: java.lang.Throwable -> L26
        L7:
            if (this.yS == null) goto L11;
            if (r5.gn.equals(this.yS) == true) goto L11;
        L23:
            return false;
        L11:
            if (this.gW == null) goto L15;
            if (r5.VH.equals(this.gW) == false) goto L23;
        L15:
            if (this.er == null) goto L19;
            if (r5.Zo.equals(this.er) == false) goto L23;
        L19:
            if (this.BT == null) goto L24;
            if (r5.j6(this.BT) == false) goto L23;
        L24:
            return true;
        }

        @Override
        @abcd.Interfacesu(method = 2462324800202266675L)
        public int EQ(int r5) {
        L21:
            th = move-exception;
            if (U2 == false) goto L25;
            abcd.wu.j6(th, -1449416696112694800L, this, new java.lang.Integer(r5));
        L25:
            throw th;
        L4:
            if (Mr == false) goto L6;
            abcd.wu.j6(-1449416696112694800L, this, r5);     // Catch: java.lang.Throwable -> L21
        L6:
            Sl<abcd.Gk.a> r2 = this.a8;     // Catch: java.lang.Throwable -> L21
            monitor-enter(r2);     // Catch: java.lang.Throwable -> L21
            if (r5 >= 0) goto L26;
        L15:
            int r3 = ei().length();     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2);     // Catch: java.lang.Throwable -> L18
            return r3;
        L26:
        L18:
            th = move-exception;
            throw th;     // Catch: java.lang.Throwable -> L21
        L10:
            if (r5 >= this.lg.Hw()) goto L15;
            int r4 = ((java.lang.CharSequence) this.lg.j6(r5)).length();     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2);     // Catch: java.lang.Throwable -> L18
            return r4;
        }

        @Override
        @abcd.Interfacesu(method = -717764823121731216L)
        public char FH(int r8, int r9) {
        L25:
            th = move-exception;
            if (U2 == false) goto L29;
            abcd.wu.j6(th, -4122406925871701597L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
        L29:
            throw th;
        L3:
            if (Mr == false) goto L5;
            abcd.wu.j6(-4122406925871701597L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L25
        L5:
            Sl<abcd.Gk.a> r0 = this.a8;     // Catch: java.lang.Throwable -> L25
            monitor-enter(r0);     // Catch: java.lang.Throwable -> L25
            if (r9 >= 0) goto L30;
        L19:
            char r1 = ei().charAt(r8);     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0);     // Catch: java.lang.Throwable -> L22
            return r1;
        L30:
        L22:
            th = move-exception;
            throw th;     // Catch: java.lang.Throwable -> L25
        L9:
            if (r9 >= this.lg.Hw()) goto L19;
            java.lang.CharSequence r2 = (java.lang.CharSequence) this.lg.j6(r9);     // Catch: java.lang.Throwable -> L22
            if (r8 >= r2.length()) goto L14;
            char r3 = r2.charAt(r8);     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0);     // Catch: java.lang.Throwable -> L22
            return r3;
        L14:
            monitor-exit(r0);     // Catch: java.lang.Throwable -> L22
            return ' ';
        }

        @Override
        @abcd.Interfacesu(method = -5283798537473392912L)
        public com.aide.ui.views.editor.ClassS FH(int r11) {
        L44:
            th = move-exception;
            if (U2 == false) goto L48;
            abcd.wu.j6(th, 2157105801270817917L, this, new java.lang.Integer(r11));
        L48:
            throw th;
        L4:
            if (Mr == false) goto L6;
            abcd.wu.j6(2157105801270817917L, this, r11);     // Catch: java.lang.Throwable -> L44
        L6:
            int r2 = -16777216;
            if (r11 != 0) goto L15;
            if (this.vy.J0() == true) goto L13;
            r2 = -3355444;
        L13:
            return new com.aide.ui.views.editor.ClassS(r2, 0);
        L15:
            if (r11 != 1) goto L19;
            return new com.aide.ui.views.editor.ClassS(-16738048, 0);
        L19:
            if (r11 != 2) goto L23;
            return new com.aide.ui.views.editor.ClassS(-48128, 0);
        L23:
            if (r11 != 3) goto L27;
            return new com.aide.ui.views.editor.ClassS(-65536, 0);
        L27:
            if (r11 != 4) goto L35;
            if (this.vy.J0() == true) goto L33;
            r2 = -3355444;
        L33:
            return new com.aide.ui.views.editor.ClassS(r2, 1);
        L35:
            if (r11 != 5) goto L39;
            return new com.aide.ui.views.editor.ClassS(-16738048, 1);
        L39:
            if (r11 != 6) goto L43;
            return new com.aide.ui.views.editor.ClassS(-48128, 1);
        L43:
            return new com.aide.ui.views.editor.ClassS(-65536, 1);
        }

        @abcd.Interfacesu(method = 570650789519121355L)
        public void FH(java.lang.String r8, Sl<abcd.Gk.a> r9) {
        L7:
            th = move-exception;
            if (U2 == false) goto L11;
            abcd.wu.j6(th, -5687070894142221012L, this, r8, r9);
        L11:
            throw th;
        L3:
            if (Mr == false) goto L5;
            abcd.wu.j6(-5687070894142221012L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.BT = null;     // Catch: java.lang.Throwable -> L7
            this.er = null;     // Catch: java.lang.Throwable -> L7
            this.yS = r8;     // Catch: java.lang.Throwable -> L7
            this.gW = null;     // Catch: java.lang.Throwable -> L7
            DW(r9);     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = 4883823520621563192L)
        public void Hw(java.lang.String r8, Sl<abcd.Gk.a> r9) {
        L7:
            th = move-exception;
            if (U2 == false) goto L11;
            abcd.wu.j6(th, -2252435674725849835L, this, r8, r9);
        L11:
            throw th;
        L3:
            if (Mr == false) goto L5;
            abcd.wu.j6(-2252435674725849835L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.BT = null;     // Catch: java.lang.Throwable -> L7
            this.er = null;     // Catch: java.lang.Throwable -> L7
            this.gW = r8;     // Catch: java.lang.Throwable -> L7
            this.yS = null;     // Catch: java.lang.Throwable -> L7
            DW(r9);     // Catch: java.lang.Throwable -> L7
        }

        @Override
        @abcd.Interfacesu(method = 5831280427337596728L)
        public int J8() {
        L14:
            th = move-exception;
            if (U2 == false) goto L18;
            abcd.wu.j6(th, 5355508575918082297L, this);
        L18:
            throw th;
        L4:
            if (Mr == false) goto L6;
            abcd.wu.j6(5355508575918082297L, this);     // Catch: java.lang.Throwable -> L14
        L6:
            Sl<abcd.Gk.a> r2 = this.a8;     // Catch: java.lang.Throwable -> L14
            monitor-enter(r2);     // Catch: java.lang.Throwable -> L14
            int r3 = this.rN;     // Catch: java.lang.Throwable -> L11
            monitor-exit(r2);     // Catch: java.lang.Throwable -> L11
            return r3;
        L11:
            th = move-exception;
            throw th;     // Catch: java.lang.Throwable -> L14
        }

        @abcd.Interfacesu(method = -272153989329789575L)
        public abcd.Gk.a J8(int r5) {
        L21:
            th = move-exception;
            if (U2 == false) goto L25;
            abcd.wu.j6(th, 547272239235404952L, this, new java.lang.Integer(r5));
        L25:
            throw th;
        L4:
            if (Mr == false) goto L6;
            abcd.wu.j6(547272239235404952L, this, r5);     // Catch: java.lang.Throwable -> L21
        L6:
            Sl<abcd.Gk.a> r2 = this.a8;     // Catch: java.lang.Throwable -> L21
            monitor-enter(r2);     // Catch: java.lang.Throwable -> L21
            if (r5 < 0) goto L16;
        L18:
            th = move-exception;
            throw th;     // Catch: java.lang.Throwable -> L21
        L10:
            if (r5 >= this.a8.Hw()) goto L16;
            abcd.Gk.a r3 = (abcd.Gk.a) this.a8.j6(r5);     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2);     // Catch: java.lang.Throwable -> L18
            return r3;
        L16:
            monitor-exit(r2);     // Catch: java.lang.Throwable -> L18
            return null;
        }

        @abcd.Interfacesu(method = -2756155064600250300L)
        public boolean P8() {
        L16:
            th = move-exception;
            if (U2 == false) goto L20;
            abcd.wu.j6(th, 1329474583749133703L, this);
        L20:
            throw th;
        L4:
            if (Mr == false) goto L7;
            abcd.wu.j6(1329474583749133703L, this);     // Catch: java.lang.Throwable -> L16
        L7:
            if (this.er == null) goto L9;
        L14:
            return true;
        L9:
            if (this.yS != null) goto L14;
            if (this.gW != null) goto L14;
            return false;
        }

        @Override
        @abcd.Interfacesu(method = -780608268084545511L)
        public int VH(int r8, int r9) {
        L54:
            th = move-exception;
            if (U2 == false) goto L58;
            abcd.wu.j6(th, 885996928058718332L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
        L58:
            throw th;
        L3:
            if (Mr == false) goto L5;
            abcd.wu.j6(885996928058718332L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L54
        L5:
            Sl<abcd.Gk.a> r0 = this.a8;     // Catch: java.lang.Throwable -> L54
            monitor-enter(r0);     // Catch: java.lang.Throwable -> L54
            if (r9 >= 0) goto L59;
        L49:
            monitor-exit(r0);     // Catch: java.lang.Throwable -> L51
            return 0;
        L59:
        L51:
            th = move-exception;
            throw th;     // Catch: java.lang.Throwable -> L54
        L10:
            if (r9 >= this.a8.Hw()) goto L49;
            abcd.Gk.a r2 = (abcd.Gk.a) this.a8.j6(r9);     // Catch: java.lang.Throwable -> L51
            if (r2.j6(r8) == true) goto L32;
            if (r2.FH() == false) goto L20;
            monitor-exit(r0);     // Catch: java.lang.Throwable -> L51
            return 1;
        L20:
            if (r2.DW() == false) goto L25;
            monitor-exit(r0);     // Catch: java.lang.Throwable -> L51
            return 3;
        L25:
            if (r2.Hw() == true) goto L27;
            monitor-exit(r0);     // Catch: java.lang.Throwable -> L51
            return 0;
        L27:
            monitor-exit(r0);     // Catch: java.lang.Throwable -> L51
            return 2;
        L32:
            if (r2.FH() == false) goto L37;
            monitor-exit(r0);     // Catch: java.lang.Throwable -> L51
            return 5;
        L37:
            if (r2.DW() == false) goto L42;
            monitor-exit(r0);     // Catch: java.lang.Throwable -> L51
            return 7;
        L42:
            if (r2.Hw() == false) goto L47;
            monitor-exit(r0);     // Catch: java.lang.Throwable -> L51
            return 6;
        L47:
            monitor-exit(r0);     // Catch: java.lang.Throwable -> L51
            return 4;
        }

        @Override
        @abcd.Interfacesu(method = -2869179543573570157L)
        public void j6(int r8, char[] r9) {
        L21:
            th = move-exception;
            if (U2 == false) goto L26;
            abcd.wu.j6(th, 1673013995458542332L, this, new java.lang.Integer(r8), r9);
        L26:
            throw th;
        L3:
            if (Mr == false) goto L5;
            abcd.wu.j6(1673013995458542332L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L21
        L5:
            Sl<abcd.Gk.a> r0 = this.a8;     // Catch: java.lang.Throwable -> L21
            monitor-enter(r0);     // Catch: java.lang.Throwable -> L21
            if (r8 >= 0) goto L28;
        L12:
            java.lang.CharSequence r1 = ei();     // Catch: java.lang.Throwable -> L18
        L13:
            int r2 = java.lang.Math.min(r9.length, r1.length());     // Catch: java.lang.Throwable -> L18
            int r3 = 0;
        L14:
            if (r3 >= r2) goto L16;
            r9[r3] = r1.charAt(r3);     // Catch: java.lang.Throwable -> L18
            r3 = r3 + 1;     // Catch: java.lang.Throwable -> L18
            goto L14
        L16:
            monitor-exit(r0);     // Catch: java.lang.Throwable -> L18
            return;
        L18:
            th = move-exception;
            throw th;     // Catch: java.lang.Throwable -> L21
        L28:
            if (r8 >= this.lg.Hw()) goto L12;
            r1 = (java.lang.CharSequence) this.lg.j6(r8);     // Catch: java.lang.Throwable -> L18
            goto L13
        }

        @abcd.Interfacesu(method = -1229277814819216387L)
        public void j6(abcd.Gk.a r7) {
        L20:
            th = move-exception;
            if (U2 == false) goto L24;
            abcd.wu.j6(th, 88516656248203880L, this, r7);
        L24:
            throw th;
        L4:
            if (Mr == false) goto L7;
            abcd.wu.j6(88516656248203880L, this, r7);     // Catch: java.lang.Throwable -> L20
        L7:
            if (DW(r7) == false) goto L19;
            Sl<abcd.Gk.a> r2 = this.a8;     // Catch: java.lang.Throwable -> L20
            monitor-enter(r2);     // Catch: java.lang.Throwable -> L20
            abcd.Gk.a r3 = (abcd.Gk.a) this.a8.j6(r7);     // Catch: java.lang.Throwable -> L16
            java.lang.CharSequence r4 = r7.j6();     // Catch: java.lang.Throwable -> L16
            this.lg.j6(r4);     // Catch: java.lang.Throwable -> L16
            this.rN = java.lang.Math.max(this.rN, r4.length());     // Catch: java.lang.Throwable -> L16
            if (r3 == null) goto L13;
            com.aide.ui.LogCatConsole.FH(this.vy).J8();     // Catch: java.lang.Throwable -> L16
        L13:
            XL();     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2);     // Catch: java.lang.Throwable -> L16
        L29:
            return;
        L16:
            th = move-exception;
            throw th;     // Catch: java.lang.Throwable -> L20
        }

        @abcd.Interfacesu(method = -735658588128645864L)
        public void j6(Sl<abcd.Gk.a> r5) {
        L8:
            th = move-exception;
            if (U2 == false) goto L12;
            abcd.wu.j6(th, 2133783066557640713L, this, r5);
        L12:
            throw th;
        L4:
            if (Mr == false) goto L6;
            abcd.wu.j6(2133783066557640713L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            this.BT = null;     // Catch: java.lang.Throwable -> L8
            this.er = null;     // Catch: java.lang.Throwable -> L8
            this.yS = null;     // Catch: java.lang.Throwable -> L8
            this.gW = null;     // Catch: java.lang.Throwable -> L8
            DW(r5);     // Catch: java.lang.Throwable -> L8
        }

        @abcd.Interfacesu(method = -4147756172488890365L)
        public void j6(java.lang.String r8, Sl<abcd.Gk.a> r9) {
        L7:
            th = move-exception;
            if (U2 == false) goto L11;
            abcd.wu.j6(th, -330249648793530240L, this, r8, r9);
        L11:
            throw th;
        L3:
            if (Mr == false) goto L5;
            abcd.wu.j6(-330249648793530240L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.BT = r8;     // Catch: java.lang.Throwable -> L7
            this.er = null;     // Catch: java.lang.Throwable -> L7
            this.yS = null;     // Catch: java.lang.Throwable -> L7
            this.gW = null;     // Catch: java.lang.Throwable -> L7
            DW(r9);     // Catch: java.lang.Throwable -> L7
        }

        @Override
        @abcd.Interfacesu(method = -1261444221839732740L)
        public boolean j6(int r5) {
        L14:
            th = move-exception;
            if (U2 == false) goto L18;
            abcd.wu.j6(th, 1997144178375150675L, this, new java.lang.Integer(r5));
        L18:
            throw th;
        L4:
            if (Mr == false) goto L6;
            abcd.wu.j6(1997144178375150675L, this, r5);     // Catch: java.lang.Throwable -> L14
        L6:
            abcd.Gk.a r2 = J8(r5 - 1);     // Catch: java.lang.Throwable -> L14
            abcd.Gk.a r3 = J8(r5);     // Catch: java.lang.Throwable -> L14
            if (r2 == null) goto L12;
            if (r3 == null) goto L12;
            if (r2.Hw == r3.Hw) goto L12;
            return true;
        L12:
            return false;
        }

        @Override
        @abcd.Interfacesu(method = 1416570764153201960L)
        public int tp() {
        L8:
            th = move-exception;
            if (U2 == false) goto L12;
            abcd.wu.j6(th, -2354106764602153899L, this);
        L12:
            throw th;
        L4:
            if (Mr == false) goto L15;
            abcd.wu.j6(-2354106764602153899L, this);     // Catch: java.lang.Throwable -> L8
            return 8;
        L15:
            return 8;
        }

        @Override
        @abcd.Interfacesu(method = 3319974157180106985L)
        public int v5() {
        L15:
            th = move-exception;
            if (U2 == false) goto L19;
            abcd.wu.j6(th, 1569120911265108672L, this);
        L19:
            throw th;
        L4:
            if (Mr == false) goto L6;
            abcd.wu.j6(1569120911265108672L, this);     // Catch: java.lang.Throwable -> L15
        L6:
            Sl<abcd.Gk.a> r2 = this.a8;     // Catch: java.lang.Throwable -> L15
            monitor-enter(r2);     // Catch: java.lang.Throwable -> L15
            int r3 = java.lang.Math.max(1, this.a8.Hw());     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2);     // Catch: java.lang.Throwable -> L12
            return r3;
        L12:
            th = move-exception;
            throw th;     // Catch: java.lang.Throwable -> L15
        }

        @abcd.Interfacesu(method = -1182155265343046519L)
        public void vy() {
        L8:
            th = move-exception;
            if (U2 == false) goto L12;
            abcd.wu.j6(th, 1126356008378719104L, this);
        L12:
            throw th;
        L4:
            if (Mr == false) goto L6;
            abcd.wu.j6(1126356008378719104L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            DW(new abcd.Sl(1));     // Catch: java.lang.Throwable -> L8
        }
    }

    static {
        abcd.wu.j6(com.aide.ui.LogCatConsole.class, -3643350297993287765L, -3643350297993287765L);
    }

    public LogCatConsole(android.content.Context r7) {
    L8:
        th = move-exception;
        if (J8 == false) goto L12;
        abcd.wu.j6(th, -685576631655635029L, null, r7);
    L12:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(-685576631655635029L, null, r7);     // Catch: java.lang.Throwable -> L8
    L6:
        super(r7);     // Catch: java.lang.Throwable -> L8
        this.Ws = new com.aide.ui.Z(com.aide.ui.U.lg(), com.almlkaide.kaypro.R.menu.logcatbrowser_menu);     // Catch: java.lang.Throwable -> L8
        this.QX = new com.aide.ui.Z(com.aide.ui.U.lg(), com.almlkaide.kaypro.R.menu.logcatbrowser_context_menu);     // Catch: java.lang.Throwable -> L8
        this.XL = new abcd.Sl(10000);     // Catch: java.lang.Throwable -> L8
        yS();     // Catch: java.lang.Throwable -> L8
    }

    public LogCatConsole(android.content.Context r8, android.util.AttributeSet r9) {
    L7:
        th = move-exception;
        if (J8 == false) goto L11;
        abcd.wu.j6(th, -3991601548306025280L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (J0 == false) goto L5;
        abcd.wu.j6(-3991601548306025280L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        super(r8, r9);     // Catch: java.lang.Throwable -> L7
        this.Ws = new com.aide.ui.Z(com.aide.ui.U.lg(), com.almlkaide.kaypro.R.menu.logcatbrowser_menu);     // Catch: java.lang.Throwable -> L7
        this.QX = new com.aide.ui.Z(com.aide.ui.U.lg(), com.almlkaide.kaypro.R.menu.logcatbrowser_context_menu);     // Catch: java.lang.Throwable -> L7
        this.XL = new abcd.Sl(10000);     // Catch: java.lang.Throwable -> L7
        yS();     // Catch: java.lang.Throwable -> L7
    }

    public LogCatConsole(android.content.Context r9, android.util.AttributeSet r10, int r11) {
    L7:
        th = move-exception;
        if (J8 == false) goto L11;
        abcd.wu.j6(th, -73371350780186399L, null, r9, r10, new java.lang.Integer(r11));
    L11:
        throw th;
    L3:
        if (J0 == false) goto L5;
        abcd.wu.j6(-73371350780186399L, null, r9, r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
    L5:
        super(r9, r10, r11);     // Catch: java.lang.Throwable -> L7
        this.Ws = new com.aide.ui.Z(com.aide.ui.U.lg(), com.almlkaide.kaypro.R.menu.logcatbrowser_menu);     // Catch: java.lang.Throwable -> L7
        this.QX = new com.aide.ui.Z(com.aide.ui.U.lg(), com.almlkaide.kaypro.R.menu.logcatbrowser_context_menu);     // Catch: java.lang.Throwable -> L7
        this.XL = new abcd.Sl(10000);     // Catch: java.lang.Throwable -> L7
        yS();     // Catch: java.lang.Throwable -> L7
    }

    static com.aide.ui.LogCatConsole.a DW(com.aide.ui.LogCatConsole r0) {
        return r0.getLogCatModel();
    }

    @abcd.Interfacesu(method = 6716249590159796412L)
    private void DW(abcd.Gk.a r11) {
    L31:
        th = move-exception;
        if (J8 == false) goto L35;
        abcd.wu.j6(th, -4277607793179753088L, this, r11);
    L35:
        throw th;
    L4:
        if (J0 == false) goto L7;
        abcd.wu.j6(-4277607793179753088L, this, r11);     // Catch: java.lang.Throwable -> L31
    L7:
        if (com.aide.ui.U.vy().j3() == true) goto L10;
        return;
    L10:
        if (abcd.C0790gj.P8(com.aide.ui.U.vy().J0()) == true) goto L13;
        return;
    L13:
        if (r11.u7.startsWith("at ") == false) goto L41;
        int r2 = r11.u7.indexOf(40);     // Catch: java.lang.Throwable -> L31
        if (r2 <= 0) goto L42;
        java.lang.String r3 = r11.u7.substring(3, r2);     // Catch: java.lang.Throwable -> L31
        int r4 = r3.lastIndexOf(46);     // Catch: java.lang.Throwable -> L31
        if (r4 <= 0) goto L43;
        java.lang.String r5 = r3.substring(0, r4);     // Catch: java.lang.Throwable -> L31
        int r6 = r5.indexOf(36);     // Catch: java.lang.Throwable -> L31
        if (r6 <= 0) goto L21;
        r5 = r5.substring(0, r6);     // Catch: java.lang.Throwable -> L31
    L21:
        java.lang.String r7 = com.aide.ui.U.vy().a8(r5.replace('.', '/') + ".java");     // Catch: java.lang.Throwable -> L31
        if (r7 == null) goto L44;
        int r8 = r11.u7.lastIndexOf(58);     // Catch: java.lang.Throwable -> L31
        if (r8 > 0) goto L39;
    L28:
        int r9 = 1;
    L29:
        com.aide.ui.U.lg().j6(new abcd.Tl(r7, r9, 1, r9, 1));     // Catch: java.lang.Throwable -> L31
        return;
    L39:
        r9 = java.lang.Integer.parseInt(r11.u7.substring(r8 + 1, r11.u7.length() - 1));     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L31
        goto L29
    L44:
        return;
    L43:
        return;
    L42:
        return;
    }

    static com.aide.ui.views.CodeEditText.c FH(com.aide.ui.LogCatConsole r0) {
        return r0.getOEditorView();
    }

    @abcd.Interfacesu(method = -4277866530002708876L)
    private com.aide.ui.LogCatConsole.a getLogCatModel() {
    L8:
        th = move-exception;
        if (J8 == false) goto L12;
        abcd.wu.j6(th, -2153899854821870176L, this);
    L12:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(-2153899854821870176L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return (com.aide.ui.LogCatConsole.a) getOEditorView().getModel();
    }

    static com.aide.ui.Z j6(com.aide.ui.LogCatConsole r0) {
        return r0.QX;
    }

    static void j6(com.aide.ui.LogCatConsole r0, abcd.Gk.a r1) {
        r0.DW(r1);
    }

    @abcd.Interfacesu(method = 65008566491412760L)
    private void setHeader(java.lang.String r5) {
    L8:
        th = move-exception;
        if (J8 == false) goto L12;
        abcd.wu.j6(th, -82111632252358800L, this, r5);
    L12:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(-82111632252358800L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        ((android.widget.TextView) getScrollView().getHeaderView().findViewById(com.almlkaide.kaypro.R.id.logcatHeaderText)).setText(r5);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -2966324543769245095L)
    private void yS() {
    L8:
        th = move-exception;
        if (J8 == false) goto L12;
        abcd.wu.j6(th, -1419905485765560195L, this);
    L12:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(-1419905485765560195L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.aM = new android.os.Handler();     // Catch: java.lang.Throwable -> L8
        getOEditorView().setModel(new com.aide.ui.LogCatConsole.a(this, null));     // Catch: java.lang.Throwable -> L8
        getOEditorView().setHidden(false);     // Catch: java.lang.Throwable -> L8
        getOEditorView().setEditable(false);     // Catch: java.lang.Throwable -> L8
        DW(new com.aide.ui.C1788ga(this));     // Catch: java.lang.Throwable -> L8
        VH(new com.aide.ui.C1790ha(this));     // Catch: java.lang.Throwable -> L8
        rN();     // Catch: java.lang.Throwable -> L8
    }

    public void DW(java.lang.String r6) {
    L15:
        th = move-exception;
        if (J8 == false) goto L19;
        abcd.wu.j6(th, 2853888219823191747L, this, r6);
    L19:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(2853888219823191747L, this, r6);     // Catch: java.lang.Throwable -> L15
    L6:
        Sl<abcd.Gk.a> r2 = this.XL;     // Catch: java.lang.Throwable -> L15
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L15
        getLogCatModel().j6(r6, this.XL);     // Catch: java.lang.Throwable -> L12
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L12
        setHeader("LogCat - " + r6);     // Catch: java.lang.Throwable -> L15
        return;
    L12:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L15
    }

    @Override
    @abcd.Interfacesu(method = 223825901452050816L)
    protected boolean DW() {
    L8:
        th = move-exception;
        if (J8 == false) goto L12;
        abcd.wu.j6(th, 6640775518227927012L, this);
    L12:
        throw th;
    L4:
        if (J0 == false) goto L15;
        abcd.wu.j6(6640775518227927012L, this);     // Catch: java.lang.Throwable -> L8
        return false;
    L15:
        return false;
    }

    public void FH(java.lang.String r6) {
    L15:
        th = move-exception;
        if (J8 == false) goto L19;
        abcd.wu.j6(th, -6250329773944750944L, this, r6);
    L19:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(-6250329773944750944L, this, r6);     // Catch: java.lang.Throwable -> L15
    L6:
        Sl<abcd.Gk.a> r2 = this.XL;     // Catch: java.lang.Throwable -> L15
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L15
        getLogCatModel().DW(r6, this.XL);     // Catch: java.lang.Throwable -> L12
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L12
        setHeader("LogCat - " + r6);     // Catch: java.lang.Throwable -> L15
        return;
    L12:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L15
    }

    public void Hw(java.lang.String r6) {
    L15:
        th = move-exception;
        if (J8 == false) goto L19;
        abcd.wu.j6(th, -2635555264285180557L, this, r6);
    L19:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(-2635555264285180557L, this, r6);     // Catch: java.lang.Throwable -> L15
    L6:
        Sl<abcd.Gk.a> r2 = this.XL;     // Catch: java.lang.Throwable -> L15
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L15
        getLogCatModel().FH(r6, this.XL);     // Catch: java.lang.Throwable -> L12
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L12
        setHeader("LogCat - " + r6);     // Catch: java.lang.Throwable -> L15
        return;
    L12:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L15
    }

    public void a8() {
    L14:
        th = move-exception;
        if (J8 == false) goto L18;
        abcd.wu.j6(th, -1702557619388754272L, this);
    L18:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(-1702557619388754272L, this);     // Catch: java.lang.Throwable -> L14
    L6:
        Sl<abcd.Gk.a> r2 = this.XL;     // Catch: java.lang.Throwable -> L14
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L14
        this.XL.j6();     // Catch: java.lang.Throwable -> L11
        getLogCatModel().vy();     // Catch: java.lang.Throwable -> L11
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L11
        return;
    L11:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L14
    }

    public void er() {
    L8:
        th = move-exception;
        if (J8 == false) goto L12;
        abcd.wu.j6(th, -3109667150796251635L, this);
    L12:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(-3109667150796251635L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        getScrollView().getHeaderView().setVisibility(0);     // Catch: java.lang.Throwable -> L8
    }

    public java.util.List<java.lang.String> getAllPriortities() {
    L8:
        th = move-exception;
        if (J8 == false) goto L12;
        abcd.wu.j6(th, 6167495559102190200L, this);
    L12:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(6167495559102190200L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return java.util.Arrays.asList(new java.lang.String[]{"E", "W", "I", "D", "V"});
    }

    public java.util.List<java.lang.String> getAllProcesses() {
    L21:
        th = move-exception;
        if (J8 == false) goto L26;
        abcd.wu.j6(th, 3949294376043856407L, this);
    L26:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(3949294376043856407L, this);     // Catch: java.lang.Throwable -> L21
    L6:
        Sl<abcd.Gk.a> r2 = this.XL;     // Catch: java.lang.Throwable -> L21
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L21
        java.util.HashSet r3 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L18
        int r4 = 0;
    L10:
        if (r4 >= this.XL.Hw()) goto L15;
        abcd.Gk.a r5 = (abcd.Gk.a) this.XL.j6(r4);     // Catch: java.lang.Throwable -> L18
        if (r5.gn.length() <= 0) goto L14;
        r3.add(r5.gn);     // Catch: java.lang.Throwable -> L18
    L14:
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L18
        goto L10
    L15:
        java.util.ArrayList r6 = new java.util.ArrayList(r3);     // Catch: java.lang.Throwable -> L18
        java.util.Collections.sort(r6, java.lang.String.CASE_INSENSITIVE_ORDER);     // Catch: java.lang.Throwable -> L18
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L18
        return r6;
    L18:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L21
    }

    public java.util.List<java.lang.String> getAllTags() {
    L21:
        th = move-exception;
        if (J8 == false) goto L26;
        abcd.wu.j6(th, 2065450672828709181L, this);
    L26:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(2065450672828709181L, this);     // Catch: java.lang.Throwable -> L21
    L6:
        Sl<abcd.Gk.a> r2 = this.XL;     // Catch: java.lang.Throwable -> L21
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L21
        java.util.HashSet r3 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L18
        int r4 = 0;
    L10:
        if (r4 >= this.XL.Hw()) goto L15;
        abcd.Gk.a r5 = (abcd.Gk.a) this.XL.j6(r4);     // Catch: java.lang.Throwable -> L18
        if (r5.VH.length() <= 0) goto L14;
        r3.add(r5.VH);     // Catch: java.lang.Throwable -> L18
    L14:
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L18
        goto L10
    L15:
        java.util.ArrayList r6 = new java.util.ArrayList(r3);     // Catch: java.lang.Throwable -> L18
        java.util.Collections.sort(r6, java.lang.String.CASE_INSENSITIVE_ORDER);     // Catch: java.lang.Throwable -> L18
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L18
        return r6;
    L18:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L21
    }

    @Override
    public java.util.List<abcd.InterfaceWl> getCustomEditorCommands() {
    L8:
        th = move-exception;
        if (J8 == false) goto L12;
        abcd.wu.j6(th, -139750305018865863L, this);
    L12:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(-139750305018865863L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return com.aide.ui.V.Zo();
    }

    @Override
    public com.aide.common.KeyStrokeDetector getKeyStrokeDetector() {
    L8:
        th = move-exception;
        if (J8 == false) goto L12;
        abcd.wu.j6(th, -1195023969372518416L, this);
    L12:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(-1195023969372518416L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return com.aide.ui.U.lg().j3();
    }

    @Override
    public java.util.List<com.aide.common.ClassU> j6(abcd.InterfaceWl r5) {
    L8:
        th = move-exception;
        if (J8 == false) goto L12;
        abcd.wu.j6(th, -810841701614928320L, this, r5);
    L12:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(-810841701614928320L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return com.aide.ui.U.j3().j6(r5);
    }

    public void j6(abcd.Gk.a r5) {
    L15:
        th = move-exception;
        if (J8 == false) goto L19;
        abcd.wu.j6(th, 710538411134095124L, this, r5);
    L19:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(710538411134095124L, this, r5);     // Catch: java.lang.Throwable -> L15
    L6:
        Sl<abcd.Gk.a> r2 = this.XL;     // Catch: java.lang.Throwable -> L15
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L15
        this.XL.j6(r5);     // Catch: java.lang.Throwable -> L12
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L12
        this.aM.post(new com.aide.ui.Runnableia(this, r5));     // Catch: java.lang.Throwable -> L15
        return;
    L12:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L15
    }

    public void j6(android.view.View r8, boolean r9) {
    L7:
        th = move-exception;
        if (J8 == false) goto L11;
        abcd.wu.j6(th, -5495744820131307257L, this, r8, new java.lang.Boolean(r9));
    L11:
        throw th;
    L3:
        if (J0 == false) goto L5;
        abcd.wu.j6(-5495744820131307257L, this, r8, new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        this.Ws.j6(r8, r9);     // Catch: java.lang.Throwable -> L7
    }

    public void lg() {
    L15:
        th = move-exception;
        if (J8 == false) goto L19;
        abcd.wu.j6(th, 3669529684739791840L, this);
    L19:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(3669529684739791840L, this);     // Catch: java.lang.Throwable -> L15
    L6:
        Sl<abcd.Gk.a> r2 = this.XL;     // Catch: java.lang.Throwable -> L15
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L15
        getLogCatModel().j6(this.XL);     // Catch: java.lang.Throwable -> L12
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L12
        setHeader("LogCat");     // Catch: java.lang.Throwable -> L15
        return;
    L12:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L15
    }

    public void rN() {
    L8:
        th = move-exception;
        if (J8 == false) goto L12;
        abcd.wu.j6(th, 607781048857928097L, this);
    L12:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(607781048857928097L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        setIsLightTheme(com.aide.ui.aa.lg());     // Catch: java.lang.Throwable -> L8
        getOEditorView().setTabSize(com.aide.ui.aa.cn());     // Catch: java.lang.Throwable -> L8
        getOEditorView().setInsertTabsAsSpaces(com.aide.ui.aa.a8());     // Catch: java.lang.Throwable -> L8
        getOEditorView().setFontSize(com.aide.ui.aa.tp());     // Catch: java.lang.Throwable -> L8
    }

    public void v5(java.lang.String r6) {
    L15:
        th = move-exception;
        if (J8 == false) goto L19;
        abcd.wu.j6(th, 345424038760917944L, this, r6);
    L19:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(345424038760917944L, this, r6);     // Catch: java.lang.Throwable -> L15
    L6:
        Sl<abcd.Gk.a> r2 = this.XL;     // Catch: java.lang.Throwable -> L15
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L15
        getLogCatModel().Hw(r6, this.XL);     // Catch: java.lang.Throwable -> L12
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L12
        setHeader("LogCat - " + r6);     // Catch: java.lang.Throwable -> L15
        return;
    L12:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L15
    }
}
