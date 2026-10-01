package abcd;

public class kv {
    private static boolean DW;
    private static java.lang.Object FH;
    private static abcd.kv.b Hw;
    private static java.lang.ThreadLocal<java.lang.Boolean> j6;

    private static class a {
        public static long DW;
        public static java.util.Map<java.lang.Integer, java.util.Set<java.lang.Class>> EQ;
        public static boolean FH;
        public static boolean Hw;
        public static java.util.Map<java.lang.Integer, java.util.Set<java.lang.Class>> J0;
        public static java.util.Map<java.lang.Integer, java.util.Set<java.lang.Class>> J8;
        public static java.util.Set<java.lang.Long> QX;
        public static boolean VH;
        public static java.util.Set<java.lang.Long> Ws;
        public static boolean Zo;
        public static boolean gn;
        public static boolean j6;
        public static java.util.Map<java.lang.Integer, java.util.Set<java.lang.Class>> tp;
        public static boolean u7;
        public static boolean v5;
        public static java.util.Map<java.lang.Integer, java.util.Set<java.lang.Class>> we;

        static {
            tp = new java.util.HashMap();
            EQ = new java.util.HashMap();
            we = new java.util.HashMap();
            J0 = new java.util.HashMap();
            J8 = new java.util.HashMap();
            Ws = new java.util.HashSet();
            QX = new java.util.HashSet();
        }
    }

    public static class b {
        public java.util.List<abcd.Abstractiv> DW;
        public java.util.List<abcd.Abstractiv> EQ;
        public java.util.List<abcd.Abstractiv> FH;
        public java.util.List<abcd.Abstractiv> Hw;
        public java.util.Map<java.lang.Long, java.util.List<abcd.Abstractiv>> J0;
        public java.util.Map<java.lang.Long, java.util.List<abcd.Abstractiv>> J8;
        public java.util.List<abcd.Abstractiv> Mr;
        public java.util.List<abcd.Abstractiv> QX;
        public java.util.List<abcd.Abstractiv> U2;
        public java.util.List<abcd.Abstractiv> VH;
        public java.util.List<abcd.Abstractiv> Ws;
        public java.util.List<abcd.Abstractiv> XL;
        public java.util.List<abcd.Abstractiv> Zo;
        public java.util.Map<java.lang.Integer, java.util.List<abcd.Abstractiv>> a8;
        public java.util.List<abcd.Abstractiv> aM;
        public java.util.Map<java.lang.Integer, java.util.List<abcd.Abstractiv>> er;
        public java.util.List<abcd.Abstractiv> gn;
        public java.util.List<abcd.Abstractiv> j3;
        public java.util.List<abcd.Abstractiv> j6;
        public java.util.Map<java.lang.Integer, java.util.List<abcd.Abstractiv>> lg;
        public java.util.Map<java.lang.Integer, java.util.List<abcd.Abstractiv>> rN;
        public java.util.List<abcd.Abstractiv> tp;
        public java.util.List<abcd.Abstractiv> u7;
        public java.util.List<abcd.Abstractiv> v5;
        public java.util.List<abcd.Abstractiv> we;
        public java.util.Map<java.lang.Integer, java.util.List<abcd.Abstractiv>> yS;

        public b() {
            this.j6 = new java.util.ArrayList();
            this.DW = new java.util.ArrayList();
            this.FH = new java.util.ArrayList();
            this.Hw = new java.util.ArrayList();
            this.v5 = new java.util.ArrayList();
            this.Zo = new java.util.ArrayList();
            this.VH = new java.util.ArrayList();
            this.gn = new java.util.ArrayList();
            this.u7 = new java.util.ArrayList();
            this.tp = new java.util.ArrayList();
            this.EQ = new java.util.ArrayList();
            this.we = new java.util.ArrayList();
            this.J0 = new java.util.HashMap();
            this.J8 = new java.util.HashMap();
            this.Ws = new java.util.ArrayList();
            this.QX = new java.util.ArrayList();
            this.XL = new java.util.ArrayList();
            this.aM = new java.util.ArrayList();
            this.j3 = new java.util.ArrayList();
            this.Mr = new java.util.ArrayList();
            this.U2 = new java.util.ArrayList();
            this.a8 = new java.util.HashMap();
            this.lg = new java.util.HashMap();
            this.rN = new java.util.HashMap();
            this.er = new java.util.HashMap();
            this.yS = new java.util.HashMap();
        }
    }

    static {
        j6 = new java.lang.ThreadLocal();
        FH = new java.lang.Object();
        Hw = new abcd.kv.b();
    }

    public static long DW() {
        return java.lang.System.currentTimeMillis();
    }

    private static void DW(abcd.Abstractiv r9) {
        synchronized (FH) {
            java.lang.Object r0 = null;
            abcd.kv.b r1 = null;
            long r4 = 0L;
            long r6 = 0L;
            java.util.List<abcd.Abstractiv> r2 = null;
            long r5 = 0L;
            long r7 = 0L;
            java.util.List<abcd.Abstractiv> r3 = null;
            java.util.List<abcd.Abstractiv> r8 = null;
            java.util.List<abcd.Abstractiv> r10 = null;
            java.util.List<abcd.Abstractiv> r11 = null;
            java.util.List<abcd.Abstractiv> r12 = null;
            java.util.List<abcd.Abstractiv> r13 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = FH;
                        try {
                            r1 = Hw;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        if (r9.tp() == false) { $pc0 = 12; continue $sw0; }
                        try {
                            r4 = r9.u7();
                            r6 = r9.gn();
                            r2 = r1.J0.get(java.lang.Long.valueOf(r4));
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        if (r2 == null) { $pc0 = 100; continue $sw0; }
                        try {
                            r2.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        if (r2.isEmpty() == false) { $pc0 = 100; continue $sw0; }
                        try {
                            r1.J0.remove(java.lang.Long.valueOf(r4));
                            abcd.Ev.j6(r6, r4, false);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        $pc0 = 100; continue $sw0;
                    }
                    case 100: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        return;
                    }
                    case 12: {
                        if (r9.vy() == false) { $pc0 = 15; continue $sw0; }
                        try {
                            r1.gn.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 15: {
                        if (r9.ro() == false) { $pc0 = 18; continue $sw0; }
                        try {
                            r1.v5.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 18: {
                        if (r9.nw() == false) { $pc0 = 21; continue $sw0; }
                        try {
                            r1.FH.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 21: {
                        if (r9.cn() == false) { $pc0 = 24; continue $sw0; }
                        try {
                            r1.Hw.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 24: {
                        if (r9.P8() == false) { $pc0 = 27; continue $sw0; }
                        try {
                            r1.VH.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 27: {
                        if (r9.ei() == false) { $pc0 = 30; continue $sw0; }
                        try {
                            r1.Zo.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 30: {
                        if (r9.KD() == false) { $pc0 = 33; continue $sw0; }
                        try {
                            r1.j6.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 33: {
                        if (r9.SI() == false) { $pc0 = 36; continue $sw0; }
                        try {
                            r1.DW.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 36: {
                        if (r9.VH() == false) { $pc0 = 43; continue $sw0; }
                        try {
                            r5 = r9.Zo();
                            r7 = r9.v5();
                            r3 = r1.J8.get(java.lang.Long.valueOf(r5));
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        if (r3 == null) { $pc0 = 100; continue $sw0; }
                        try {
                            r3.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        if (r3.isEmpty() == false) { $pc0 = 100; continue $sw0; }
                        try {
                            r1.J8.remove(java.lang.Long.valueOf(r5));
                            abcd.Ev.DW(r7, r5, false);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 43: {
                        if (r9.BT() == false) { $pc0 = 46; continue $sw0; }
                        try {
                            r1.we.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 46: {
                        if (r9.Mr() == false) { $pc0 = 49; continue $sw0; }
                        try {
                            r1.Ws.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 49: {
                        if (r9.J0() == false) { $pc0 = 52; continue $sw0; }
                        try {
                            r1.u7.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 52: {
                        if (r9.J8() == false) { $pc0 = 55; continue $sw0; }
                        try {
                            r1.tp.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 55: {
                        if (r9.Ws() == false) { $pc0 = 58; continue $sw0; }
                        try {
                            r1.EQ.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 58: {
                        if (r9.rN() == false) { $pc0 = 61; continue $sw0; }
                        try {
                            r1.aM.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 61: {
                        if (r9.lg() == false) { $pc0 = 64; continue $sw0; }
                        try {
                            r1.j3.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 64: {
                        if (r9.yS() == false) { $pc0 = 67; continue $sw0; }
                        try {
                            r1.XL.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 67: {
                        if (r9.gW() == false) { $pc0 = 70; continue $sw0; }
                        try {
                            r1.QX.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 70: {
                        if (r9.XL() == false) { $pc0 = 73; continue $sw0; }
                        try {
                            r1.U2.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 73: {
                        if (r9.er() == false) { $pc0 = 76; continue $sw0; }
                        try {
                            r1.Mr.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 76: {
                        if (r9.QX() == false) { $pc0 = 81; continue $sw0; }
                        try {
                            r8 = r1.a8.get(java.lang.Integer.valueOf(r9.we()));
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        if (r8 == null) { $pc0 = 100; continue $sw0; }
                        try {
                            r8.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 81: {
                        if (r9.U2() == false) { $pc0 = 86; continue $sw0; }
                        try {
                            r10 = r1.lg.get(java.lang.Integer.valueOf(r9.we()));
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        if (r10 == null) { $pc0 = 100; continue $sw0; }
                        try {
                            r10.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 86: {
                        if (r9.aM() == false) { $pc0 = 91; continue $sw0; }
                        try {
                            r11 = r1.rN.get(java.lang.Integer.valueOf(r9.we()));
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        if (r11 == null) { $pc0 = 100; continue $sw0; }
                        try {
                            r11.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 91: {
                        if (r9.j3() == false) { $pc0 = 96; continue $sw0; }
                        try {
                            r12 = r1.er.get(java.lang.Integer.valueOf(r9.we()));
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        if (r12 == null) { $pc0 = 100; continue $sw0; }
                        try {
                            r12.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        { $pc0 = 100; continue $sw0; }
                    }
                    case 96: {
                        if (r9.a8() == false) { $pc0 = 100; continue $sw0; }
                        try {
                            r13 = r1.yS.get(java.lang.Integer.valueOf(r9.we()));
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        if (r13 == null) { $pc0 = 100; continue $sw0; }
                        try {
                            r13.remove(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 102; continue $sw0;
                        }
                        return;
                    }
                    case 102: {
                        th = $ex0;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public static void DW(android.app.Activity r6) {
        long r0 = 0L;
        java.util.Iterator r2 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    j6("onActivityStarted", com.appfour.backbone.api.Api.identifier(r6) + "");
                    r0 = DW();
                    r2 = new java.util.ArrayList(Hw().tp).iterator();
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r2.hasNext() == false) { $pc1 = 6; continue $sw1; }
                    j6(r0, (abcd.Abstractiv) r2.next(), new java.lang.Object[]{r6});
                    { $pc1 = 4; continue $sw1; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void DW(android.app.Activity r7, com.appfour.backbone.api.objects.InAppProduct r8) {
        long r2 = 0L;
        java.util.Iterator r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    j6("onInAppProductPurchase", r8.getProductId());
                    if (abcd.kv.a.j6 == false) { $pc2 = 5; continue $sw2; }
                    abcd.kv.a.Hw = true;
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    r2 = DW();
                    r0 = new java.util.ArrayList(Hw().Zo).iterator();
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r0.hasNext() == false) { $pc2 = 9; continue $sw2; }
                    j6(r2, (abcd.Abstractiv) r0.next(), new java.lang.Object[]{r7, r8});
                    { $pc2 = 7; continue $sw2; }
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void DW(com.appfour.backbone.api.objects.UserActionWindow r0) {
    }

    public static void DW(com.appfour.backbone.api.objects.UserTouchAction r7, android.view.View r8) {
        long r0 = 0L;
        java.util.Iterator r2 = null;
        abcd.Abstractiv r3 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    j6("onLongPress", r7.toString());
                    if (abcd.kv.a.j6 == true) { $pc3 = 5; continue $sw3; }
                    $pc3 = 8; continue $sw3;
                }
                case 8: {
                    r0 = DW();
                    if (Hw().lg.containsKey(java.lang.Integer.valueOf(r8.getId())) == false) { $pc3 = 18; continue $sw3; }
                    r2 = new java.util.ArrayList(Hw().lg.get(java.lang.Integer.valueOf(r8.getId()))).iterator();
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    if (r2.hasNext() == false) { $pc3 = 26; continue $sw3; }
                    r3 = (abcd.Abstractiv) r2.next();
                    if (r3.EQ() == null) { $pc3 = 12; continue $sw3; }
                    if (r3.EQ().isInstance(r7.getActivity()) == false) { $pc3 = 12; continue $sw3; }
                    j6(r0, r3, new java.lang.Object[]{r7.getActivity(), r8});
                    { $pc3 = 12; continue $sw3; }
                }
                case 26: {
                    return;
                }
                case 18: {
                    return;
                }
                case 5: {
                    if (abcd.kv.a.EQ.containsKey(java.lang.Integer.valueOf(r8.getId())) == true) { $pc3 = 7; continue $sw3; }
                    abcd.kv.a.EQ.put(java.lang.Integer.valueOf(r8.getId()), new java.util.HashSet());
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    abcd.kv.a.EQ.get(java.lang.Integer.valueOf(r8.getId())).add(r7.getActivityClass());
                    { $pc3 = 8; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void DW(com.appfour.backbone.api.objects.UserTouchAction r7, android.view.View r8, java.lang.Object r9, int r10, android.view.View r11) {
        long r0 = 0L;
        java.util.Iterator r2 = null;
        abcd.Abstractiv r3 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    j6("onItemLongPress", r7.toString());
                    if (abcd.kv.a.j6 == true) { $pc4 = 5; continue $sw4; }
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    r0 = DW();
                    if (Hw().er.containsKey(java.lang.Integer.valueOf(r8.getId())) == false) { $pc4 = 18; continue $sw4; }
                    r2 = new java.util.ArrayList(Hw().er.get(java.lang.Integer.valueOf(r8.getId()))).iterator();
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    if (r2.hasNext() == false) { $pc4 = 26; continue $sw4; }
                    r3 = (abcd.Abstractiv) r2.next();
                    if (r3.EQ() == null) { $pc4 = 12; continue $sw4; }
                    if (r3.EQ().isInstance(r7.getActivity()) == false) { $pc4 = 12; continue $sw4; }
                    j6(r0, r3, new java.lang.Object[]{r7.getActivity(), r8, r9, java.lang.Integer.valueOf(r10), r11});
                    { $pc4 = 12; continue $sw4; }
                }
                case 26: {
                    return;
                }
                case 18: {
                    return;
                }
                case 5: {
                    if (abcd.kv.a.J0.containsKey(java.lang.Integer.valueOf(r8.getId())) == true) { $pc4 = 7; continue $sw4; }
                    abcd.kv.a.J0.put(java.lang.Integer.valueOf(r8.getId()), new java.util.HashSet());
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    abcd.kv.a.J0.get(java.lang.Integer.valueOf(r8.getId())).add(r7.getActivityClass());
                    { $pc4 = 8; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void DW(java.util.List<? extends abcd.Abstractiv> r1) {
        java.util.Iterator<? extends abcd.Abstractiv> r2 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r2 = r1.iterator();
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    if (r2.hasNext() == false) { $pc5 = 6; continue $sw5; }
                    DW(r2.next());
                    { $pc5 = 4; continue $sw5; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void FH() {
        java.util.Iterator r0 = null;
        abcd.Abstractiv r1 = null;
        java.util.Iterator r2 = null;
        abcd.Abstractiv r3 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    j6("onUpdate", "");
                    r0 = new java.util.ArrayList(Hw().Hw).iterator();
                    $pc6 = 4; continue $sw6;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc6 = 6; continue $sw6; }
                    r1 = (abcd.Abstractiv) r0.next();
                    j6(com.appfour.backbone.api.Api.getLastUpdateTime(), r1, new java.lang.Object[0]);
                    { $pc6 = 4; continue $sw6; }
                }
                case 6: {
                    r2 = new java.util.ArrayList(Hw().v5).iterator();
                    $pc6 = 8; continue $sw6;
                }
                case 8: {
                    if (r2.hasNext() == false) { $pc6 = 10; continue $sw6; }
                    r3 = (abcd.Abstractiv) r2.next();
                    j6(com.appfour.backbone.api.Api.getLastUpdateTime(), r3, new java.lang.Object[0]);
                    { $pc6 = 8; continue $sw6; }
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void FH(android.app.Activity r6) {
        long r0 = 0L;
        java.util.Iterator r2 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    j6("onActivityStopped", com.appfour.backbone.api.Api.identifier(r6) + "");
                    r0 = DW();
                    r2 = new java.util.ArrayList(Hw().EQ).iterator();
                    $pc7 = 4; continue $sw7;
                }
                case 4: {
                    if (r2.hasNext() == false) { $pc7 = 6; continue $sw7; }
                    j6(r0, (abcd.Abstractiv) r2.next(), new java.lang.Object[]{r6});
                    { $pc7 = 4; continue $sw7; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void FH(com.appfour.backbone.api.objects.UserActionWindow r6) {
        long r0 = 0L;
        java.util.Iterator r2 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (r6.toString().endsWith(":editor_handle") == false) { $pc8 = 5; continue $sw8; }
                    return;
                }
                case 5: {
                    j6("onWindowHidden", r6 + "");
                    r0 = DW();
                    r2 = new java.util.ArrayList(Hw().XL).iterator();
                    $pc8 = 7; continue $sw8;
                }
                case 7: {
                    if (r2.hasNext() == false) { $pc8 = 9; continue $sw8; }
                    j6(r0, (abcd.Abstractiv) r2.next(), new java.lang.Object[]{r6});
                    { $pc8 = 7; continue $sw8; }
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.kv.b Hw() {
        synchronized (FH) {
            java.lang.Object r0 = null;
            abcd.kv.b r1 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex9 = null;
            int $pc9 = -1;
            $sw9: while (true) {
                switch ($pc9) {
                    case -1: {
                        r0 = FH;
                        try {
                            r1 = Hw;
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 7; continue $sw9;
                        }
                        return r1;
                    }
                    case 7: {
                        th = $ex9;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public static void Hw(com.appfour.backbone.api.objects.UserActionWindow r6) {
        long r0 = 0L;
        java.util.Iterator r2 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (r6.toString().endsWith(":editor_handle") == false) { $pc10 = 5; continue $sw10; }
                    return;
                }
                case 5: {
                    j6("onWindowShown", r6 + "");
                    r0 = DW();
                    r2 = new java.util.ArrayList(Hw().QX).iterator();
                    $pc10 = 7; continue $sw10;
                }
                case 7: {
                    if (r2.hasNext() == false) { $pc10 = 9; continue $sw10; }
                    j6(r0, (abcd.Abstractiv) r2.next(), new java.lang.Object[]{r6});
                    { $pc10 = 7; continue $sw10; }
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static long j6(abcd.Abstractiv r3, long r4, long r6) {
        java.util.Set<java.lang.Class> r0 = null;
        java.util.Set<java.lang.Class> r1 = null;
        java.util.Set<java.lang.Class> r2 = null;
        java.util.Set<java.lang.Class> r5 = null;
        java.util.Set<java.lang.Class> r7 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    if (r3.KD() == false) { $pc11 = 10; continue $sw11; }
                    if (com.appfour.backbone.api.Api.isMainProcess() == false) { $pc11 = 8; continue $sw11; }
                    return r4;
                }
                case 8: {
                    return 0;
                }
                case 10: {
                    if (r3.SI() == false) { $pc11 = 17; continue $sw11; }
                    if (com.appfour.backbone.api.Api.isMainProcess() == false) { $pc11 = 15; continue $sw11; }
                    return r4;
                }
                case 15: {
                    return 0;
                }
                case 17: {
                    if (r3.ro() == false) { $pc11 = 24; continue $sw11; }
                    if (com.appfour.backbone.api.Api.isMainProcess() == false) { $pc11 = 22; continue $sw11; }
                    return r4;
                }
                case 22: {
                    return 0;
                }
                case 24: {
                    if (r3.cn() == false) { $pc11 = 31; continue $sw11; }
                    if (com.appfour.backbone.api.Api.isMainProcess() == false) { $pc11 = 29; continue $sw11; }
                    return r4;
                }
                case 29: {
                    return 0;
                }
                case 31: {
                    if (r3.nw() == false) { $pc11 = 38; continue $sw11; }
                    if (com.appfour.backbone.api.Api.isMainProcess() == false) { $pc11 = 36; continue $sw11; }
                    return r4;
                }
                case 36: {
                    return 0;
                }
                case 38: {
                    if (r3.tp() == false) { $pc11 = 46; continue $sw11; }
                    if (abcd.kv.a.j6 == true) { $pc11 = 42; continue $sw11; }
                    $pc11 = 44; continue $sw11;
                }
                case 44: {
                    return r4;
                }
                case 42: {
                    if (abcd.kv.a.QX.contains(java.lang.Long.valueOf(r3.gn())) == true) { $pc11 = 44; continue $sw11; }
                    return r6;
                }
                case 46: {
                    if (r3.vy() == false) { $pc11 = 49; continue $sw11; }
                    return r4;
                }
                case 49: {
                    if (r3.P8() == false) { $pc11 = 57; continue $sw11; }
                    if (abcd.kv.a.j6 == true) { $pc11 = 53; continue $sw11; }
                    $pc11 = 55; continue $sw11;
                }
                case 55: {
                    return r4;
                }
                case 53: {
                    if (abcd.kv.a.v5 == true) { $pc11 = 55; continue $sw11; }
                    return r6;
                }
                case 57: {
                    if (r3.ei() == false) { $pc11 = 65; continue $sw11; }
                    if (abcd.kv.a.j6 == true) { $pc11 = 61; continue $sw11; }
                    $pc11 = 63; continue $sw11;
                }
                case 63: {
                    return r4;
                }
                case 61: {
                    if (abcd.kv.a.Hw == true) { $pc11 = 63; continue $sw11; }
                    return r6;
                }
                case 65: {
                    if (r3.VH() == false) { $pc11 = 73; continue $sw11; }
                    if (abcd.kv.a.j6 == true) { $pc11 = 69; continue $sw11; }
                    $pc11 = 71; continue $sw11;
                }
                case 71: {
                    return r4;
                }
                case 69: {
                    if (abcd.kv.a.QX.contains(java.lang.Long.valueOf(r3.v5())) == true) { $pc11 = 71; continue $sw11; }
                    return r6;
                }
                case 73: {
                    if (r3.BT() == false) { $pc11 = 81; continue $sw11; }
                    if (abcd.kv.a.j6 == true) { $pc11 = 77; continue $sw11; }
                    $pc11 = 79; continue $sw11;
                }
                case 79: {
                    return r4;
                }
                case 77: {
                    if (abcd.kv.a.FH == true) { $pc11 = 79; continue $sw11; }
                    return r6;
                }
                case 81: {
                    if (r3.J8() == false) { $pc11 = 84; continue $sw11; }
                    return r4;
                }
                case 84: {
                    if (r3.Ws() == false) { $pc11 = 87; continue $sw11; }
                    return r4;
                }
                case 87: {
                    if (r3.J0() == false) { $pc11 = 90; continue $sw11; }
                    return r4;
                }
                case 90: {
                    if (r3.Mr() == false) { $pc11 = 93; continue $sw11; }
                    return r4;
                }
                case 93: {
                    if (r3.gW() == false) { $pc11 = 96; continue $sw11; }
                    return r4;
                }
                case 96: {
                    if (r3.rN() == false) { $pc11 = 104; continue $sw11; }
                    if (abcd.kv.a.j6 == true) { $pc11 = 100; continue $sw11; }
                    $pc11 = 102; continue $sw11;
                }
                case 102: {
                    return r4;
                }
                case 100: {
                    if (abcd.kv.a.gn == true) { $pc11 = 102; continue $sw11; }
                    return r6;
                }
                case 104: {
                    if (r3.lg() == false) { $pc11 = 112; continue $sw11; }
                    if (abcd.kv.a.j6 == true) { $pc11 = 108; continue $sw11; }
                    $pc11 = 110; continue $sw11;
                }
                case 110: {
                    return r4;
                }
                case 108: {
                    if (abcd.kv.a.u7 == true) { $pc11 = 110; continue $sw11; }
                    return r6;
                }
                case 112: {
                    if (r3.yS() == false) { $pc11 = 115; continue $sw11; }
                    return r4;
                }
                case 115: {
                    if (r3.er() == false) { $pc11 = 123; continue $sw11; }
                    if (abcd.kv.a.j6 == true) { $pc11 = 119; continue $sw11; }
                    $pc11 = 121; continue $sw11;
                }
                case 121: {
                    return r4;
                }
                case 119: {
                    if (abcd.kv.a.VH == true) { $pc11 = 121; continue $sw11; }
                    return r6;
                }
                case 123: {
                    if (r3.XL() == false) { $pc11 = 131; continue $sw11; }
                    if (abcd.kv.a.j6 == true) { $pc11 = 127; continue $sw11; }
                    $pc11 = 129; continue $sw11;
                }
                case 129: {
                    return r4;
                }
                case 127: {
                    if (abcd.kv.a.Zo == true) { $pc11 = 129; continue $sw11; }
                    return r6;
                }
                case 131: {
                    if (r3.QX() == false) { $pc11 = 148; continue $sw11; }
                    if (abcd.kv.a.j6 == true) { $pc11 = 135; continue $sw11; }
                    $pc11 = 146; continue $sw11;
                }
                case 146: {
                    return r4;
                }
                case 135: {
                    if (r3.we() == (-1)) { $pc11 = 137; continue $sw11; }
                    r0 = abcd.kv.a.tp.get(java.lang.Integer.valueOf(r3.we()));
                    if (r0 != null) { $pc11 = 142; continue $sw11; }
                    $pc11 = 145; continue $sw11;
                }
                case 145: {
                    return r6;
                }
                case 142: {
                    if (r3.EQ() == null) { $pc11 = 146; continue $sw11; }
                    if (r0.contains(r3.EQ()) == true) { $pc11 = 146; continue $sw11; }
                    $pc11 = 137; continue $sw11;
                }
                case 137: {
                    if (abcd.kv.a.tp.isEmpty() == false) { $pc11 = 146; continue $sw11; }
                    return r6;
                }
                case 148: {
                    if (r3.U2() == false) { $pc11 = 165; continue $sw11; }
                    if (abcd.kv.a.j6 == true) { $pc11 = 152; continue $sw11; }
                    $pc11 = 163; continue $sw11;
                }
                case 163: {
                    return r4;
                }
                case 152: {
                    if (r3.we() == (-1)) { $pc11 = 154; continue $sw11; }
                    r1 = abcd.kv.a.EQ.get(java.lang.Integer.valueOf(r3.we()));
                    if (r1 != null) { $pc11 = 159; continue $sw11; }
                    $pc11 = 162; continue $sw11;
                }
                case 162: {
                    return r6;
                }
                case 159: {
                    if (r3.EQ() == null) { $pc11 = 163; continue $sw11; }
                    if (r1.contains(r3.EQ()) == true) { $pc11 = 163; continue $sw11; }
                    $pc11 = 154; continue $sw11;
                }
                case 154: {
                    if (abcd.kv.a.EQ.isEmpty() == false) { $pc11 = 163; continue $sw11; }
                    return r6;
                }
                case 165: {
                    if (r3.aM() == false) { $pc11 = 182; continue $sw11; }
                    if (abcd.kv.a.j6 == true) { $pc11 = 169; continue $sw11; }
                    $pc11 = 180; continue $sw11;
                }
                case 180: {
                    return r4;
                }
                case 169: {
                    if (r3.we() == (-1)) { $pc11 = 171; continue $sw11; }
                    r2 = abcd.kv.a.we.get(java.lang.Integer.valueOf(r3.we()));
                    if (r2 != null) { $pc11 = 176; continue $sw11; }
                    $pc11 = 179; continue $sw11;
                }
                case 179: {
                    return r6;
                }
                case 176: {
                    if (r3.EQ() == null) { $pc11 = 180; continue $sw11; }
                    if (r2.contains(r3.EQ()) == true) { $pc11 = 180; continue $sw11; }
                    $pc11 = 171; continue $sw11;
                }
                case 171: {
                    if (abcd.kv.a.we.isEmpty() == false) { $pc11 = 180; continue $sw11; }
                    return r6;
                }
                case 182: {
                    if (r3.j3() == false) { $pc11 = 199; continue $sw11; }
                    if (abcd.kv.a.j6 == true) { $pc11 = 186; continue $sw11; }
                    $pc11 = 197; continue $sw11;
                }
                case 197: {
                    return r4;
                }
                case 186: {
                    if (r3.we() == (-1)) { $pc11 = 188; continue $sw11; }
                    r5 = abcd.kv.a.J0.get(java.lang.Integer.valueOf(r3.we()));
                    if (r5 != null) { $pc11 = 193; continue $sw11; }
                    $pc11 = 196; continue $sw11;
                }
                case 196: {
                    return r6;
                }
                case 193: {
                    if (r3.EQ() == null) { $pc11 = 197; continue $sw11; }
                    if (r5.contains(r3.EQ()) == true) { $pc11 = 197; continue $sw11; }
                    $pc11 = 188; continue $sw11;
                }
                case 188: {
                    if (abcd.kv.a.J0.isEmpty() == false) { $pc11 = 197; continue $sw11; }
                    return r6;
                }
                case 199: {
                    if (r3.a8() == true) { $pc11 = 201; continue $sw11; }
                    $pc11 = 214; continue $sw11;
                }
                case 214: {
                    return r4;
                }
                case 201: {
                    if (abcd.kv.a.j6 == false) { $pc11 = 214; continue $sw11; }
                    if (r3.we() == (-1)) { $pc11 = 205; continue $sw11; }
                    r7 = abcd.kv.a.J8.get(java.lang.Integer.valueOf(r3.we()));
                    if (r7 != null) { $pc11 = 210; continue $sw11; }
                    $pc11 = 213; continue $sw11;
                }
                case 213: {
                    return r6;
                }
                case 210: {
                    if (r3.EQ() == null) { $pc11 = 214; continue $sw11; }
                    if (r7.contains(r3.EQ()) == true) { $pc11 = 214; continue $sw11; }
                    $pc11 = 205; continue $sw11;
                }
                case 205: {
                    if (abcd.kv.a.J8.isEmpty() == false) { $pc11 = 214; continue $sw11; }
                    return r6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6() {
        abcd.kv.a.QX = new java.util.HashSet(abcd.kv.a.Ws);
    }

    public static void j6(long r0, long r2) {
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (abcd.kv.a.j6 == false) { $pc12 = 5; continue $sw12; }
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    abcd.kv.a.Ws.add(java.lang.Long.valueOf(r0));
                    return;
                }
                case 5: {
                    if (DW == false) { $pc12 = 6; continue $sw12; }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(long r3, abcd.Abstractiv r5, java.lang.Object... r6) {
        com.appfour.backbone.api.objects.EventData r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    if (r5.DW() == null) { $pc13 = 16; continue $sw13; }
                    r0 = null;
                    try {
                        j6.set(true);
                        r0 = r5.DW().j6(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc13 = 9; continue $sw13; }
                        $pc13 = 7; continue $sw13;
                    }
                    $pc13 = 11; continue $sw13;
                }
                case 11: {
                    j6.remove();
                    if (r0 == null) { $pc13 = 20; continue $sw13; }
                    r5.j6(r3, r0);
                    return;
                }
                case 20: {
                    return;
                }
                case 9: {
                    th = $ex13;
                    try {
                        r5.j6(r3, th);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 7; continue $sw13;
                    }
                    $pc13 = 16; continue $sw13;
                }
                case 7: {
                    th = $ex13;
                    j6.remove();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(long r5, java.lang.Object r7, java.lang.Object... r8) {
        long r0 = 0L;
        java.util.List<abcd.Abstractiv> r6 = null;
        java.util.Iterator r9 = null;
        abcd.Abstractiv r10 = null;
        java.lang.Object[] r2 = null;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    if (v5() == true) { $pc14 = 14; continue $sw14; }
                    j6("onEnter", "" + r5);
                    r0 = DW();
                    r6 = Hw().J0.get(java.lang.Long.valueOf(r5));
                    if (r6 == null) { $pc14 = 17; continue $sw14; }
                    r9 = new java.util.ArrayList(r6).iterator();
                    $pc14 = 8; continue $sw14;
                }
                case 8: {
                    if (r9.hasNext() == false) { $pc14 = 18; continue $sw14; }
                    r10 = (abcd.Abstractiv) r9.next();
                    r2 = new java.lang.Object[r8.length + 1];
                    r3 = 0;
                    r2[0] = r7;
                    $pc14 = 11; continue $sw14;
                }
                case 11: {
                    if (r3 >= r8.length) { $pc14 = 13; continue $sw14; }
                    r4 = r3 + 1;
                    r2[r4] = r8[r3];
                    r3 = r4;
                    { $pc14 = 11; continue $sw14; }
                }
                case 13: {
                    j6(r0, r10, r2);
                    { $pc14 = 8; continue $sw14; }
                }
                case 18: {
                    return;
                }
                case 17: {
                    return;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(long r6, java.lang.Throwable r8, java.lang.Object r9, java.lang.Object... r10) {
        long r0 = 0L;
        java.util.List<abcd.Abstractiv> r7 = null;
        java.util.Iterator r11 = null;
        abcd.Abstractiv r12 = null;
        java.lang.Object[] r2 = null;
        int r3 = 0;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    if (v5() == true) { $pc15 = 20; continue $sw15; }
                    j6("onThrow", "" + r6);
                    r0 = DW();
                    r7 = Hw().J8.get(java.lang.Long.valueOf(r6));
                    if (r7 == null) { $pc15 = 28; continue $sw15; }
                    r11 = new java.util.ArrayList(r7).iterator();
                    $pc15 = 8; continue $sw15;
                }
                case 8: {
                    if (r11.hasNext() == false) { $pc15 = 29; continue $sw15; }
                    r12 = (abcd.Abstractiv) r11.next();
                    if (r12.FH() == null) { $pc15 = 14; continue $sw15; }
                    if (r12.FH().isInstance(r8) == false) { $pc15 = 14; continue $sw15; }
                    $pc15 = 15; continue $sw15;
                }
                case 15: {
                    r2 = new java.lang.Object[r10.length + 2];
                    r3 = 0;
                    r2[0] = r9;
                    r2[1] = r8;
                    $pc15 = 17; continue $sw15;
                }
                case 17: {
                    if (r3 >= r10.length) { $pc15 = 19; continue $sw15; }
                    r2[r3 + 2] = r10[r3];
                    r3 = r3 + 1;
                    { $pc15 = 17; continue $sw15; }
                }
                case 19: {
                    j6(r0, r12, r2);
                    $pc15 = 14; continue $sw15;
                }
                case 14: {
                    if (abcd.Ev.DW(r8, r12.Hw()) == false) { $pc15 = 8; continue $sw15; }
                    $pc15 = 29; continue $sw15;
                }
                case 29: {
                    return;
                }
                case 28: {
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(abcd.Abstractiv r10) {
        synchronized (FH) {
            java.lang.Object r0 = null;
            abcd.kv.b r1 = null;
            long r4 = 0L;
            long r6 = 0L;
            long r5 = 0L;
            long r7 = 0L;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex16 = null;
            int $pc16 = -1;
            $sw16: while (true) {
                switch ($pc16) {
                    case -1: {
                        r0 = FH;
                        try {
                            r1 = Hw;
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        if (r10.tp() == false) { $pc16 = 11; continue $sw16; }
                        try {
                            r4 = r10.u7();
                            r6 = r10.gn();
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        if (r1.J0.containsKey(java.lang.Long.valueOf(r4)) == true) { $pc16 = 9; continue $sw16; }
                        try {
                            r1.J0.put(java.lang.Long.valueOf(r4), new java.util.ArrayList());
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        $pc16 = 9; continue $sw16;
                    }
                    case 9: {
                        try {
                            r1.J0.get(java.lang.Long.valueOf(r4)).add(r10);
                            abcd.Ev.j6(r6, r4, true);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        $pc16 = 103; continue $sw16;
                    }
                    case 103: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        return;
                    }
                    case 11: {
                        if (r10.vy() == false) { $pc16 = 14; continue $sw16; }
                        try {
                            r1.gn.add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 14: {
                        if (r10.ro() == false) { $pc16 = 17; continue $sw16; }
                        try {
                            r1.v5.add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 17: {
                        if (r10.nw() == false) { $pc16 = 20; continue $sw16; }
                        try {
                            r1.FH.add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 20: {
                        if (r10.cn() == false) { $pc16 = 23; continue $sw16; }
                        try {
                            r1.Hw.add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 23: {
                        if (r10.P8() == false) { $pc16 = 26; continue $sw16; }
                        try {
                            r1.VH.add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 26: {
                        if (r10.ei() == false) { $pc16 = 29; continue $sw16; }
                        try {
                            r1.Zo.add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 29: {
                        if (r10.KD() == false) { $pc16 = 32; continue $sw16; }
                        try {
                            r1.j6.add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 32: {
                        if (r10.SI() == false) { $pc16 = 35; continue $sw16; }
                        try {
                            r1.DW.add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 35: {
                        if (r10.VH() == false) { $pc16 = 41; continue $sw16; }
                        try {
                            r5 = r10.Zo();
                            r7 = r10.v5();
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        if (r1.J8.containsKey(java.lang.Long.valueOf(r5)) == true) { $pc16 = 39; continue $sw16; }
                        try {
                            r1.J8.put(java.lang.Long.valueOf(r5), new java.util.ArrayList());
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        $pc16 = 39; continue $sw16;
                    }
                    case 39: {
                        try {
                            r1.J8.get(java.lang.Long.valueOf(r5)).add(r10);
                            abcd.Ev.DW(r7, r5, true);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 41: {
                        if (r10.BT() == false) { $pc16 = 44; continue $sw16; }
                        try {
                            r1.we.add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 44: {
                        if (r10.J8() == false) { $pc16 = 47; continue $sw16; }
                        try {
                            r1.tp.add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 47: {
                        if (r10.Ws() == false) { $pc16 = 50; continue $sw16; }
                        try {
                            r1.EQ.add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 50: {
                        if (r10.J0() == false) { $pc16 = 53; continue $sw16; }
                        try {
                            r1.u7.add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 53: {
                        if (r10.Mr() == false) { $pc16 = 56; continue $sw16; }
                        try {
                            r1.Ws.add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 56: {
                        if (r10.rN() == false) { $pc16 = 59; continue $sw16; }
                        try {
                            r1.aM.add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 59: {
                        if (r10.lg() == false) { $pc16 = 62; continue $sw16; }
                        try {
                            r1.j3.add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 62: {
                        if (r10.gW() == false) { $pc16 = 65; continue $sw16; }
                        try {
                            r1.QX.add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 65: {
                        if (r10.yS() == false) { $pc16 = 68; continue $sw16; }
                        try {
                            r1.XL.add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 68: {
                        if (r10.er() == false) { $pc16 = 71; continue $sw16; }
                        try {
                            r1.Mr.add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 71: {
                        if (r10.XL() == false) { $pc16 = 74; continue $sw16; }
                        try {
                            r1.U2.add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 74: {
                        if (r10.QX() == false) { $pc16 = 80; continue $sw16; }
                        if (r1.a8.containsKey(java.lang.Integer.valueOf(r10.we())) == true) { $pc16 = 78; continue $sw16; }
                        try {
                            r1.a8.put(java.lang.Integer.valueOf(r10.we()), new java.util.ArrayList());
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        $pc16 = 78; continue $sw16;
                    }
                    case 78: {
                        try {
                            r1.a8.get(java.lang.Integer.valueOf(r10.we())).add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 80: {
                        if (r10.U2() == false) { $pc16 = 86; continue $sw16; }
                        if (r1.lg.containsKey(java.lang.Integer.valueOf(r10.we())) == true) { $pc16 = 84; continue $sw16; }
                        try {
                            r1.lg.put(java.lang.Integer.valueOf(r10.we()), new java.util.ArrayList());
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        $pc16 = 84; continue $sw16;
                    }
                    case 84: {
                        try {
                            r1.lg.get(java.lang.Integer.valueOf(r10.we())).add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 86: {
                        if (r10.aM() == false) { $pc16 = 92; continue $sw16; }
                        if (r1.rN.containsKey(java.lang.Integer.valueOf(r10.we())) == true) { $pc16 = 90; continue $sw16; }
                        try {
                            r1.rN.put(java.lang.Integer.valueOf(r10.we()), new java.util.ArrayList());
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        $pc16 = 90; continue $sw16;
                    }
                    case 90: {
                        try {
                            r1.rN.get(java.lang.Integer.valueOf(r10.we())).add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 92: {
                        if (r10.j3() == false) { $pc16 = 98; continue $sw16; }
                        if (r1.er.containsKey(java.lang.Integer.valueOf(r10.we())) == true) { $pc16 = 96; continue $sw16; }
                        try {
                            r1.er.put(java.lang.Integer.valueOf(r10.we()), new java.util.ArrayList());
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        $pc16 = 96; continue $sw16;
                    }
                    case 96: {
                        try {
                            r1.er.get(java.lang.Integer.valueOf(r10.we())).add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        { $pc16 = 103; continue $sw16; }
                    }
                    case 98: {
                        if (r10.a8() == false) { $pc16 = 103; continue $sw16; }
                        if (r1.yS.containsKey(java.lang.Integer.valueOf(r10.we())) == true) { $pc16 = 102; continue $sw16; }
                        try {
                            r1.yS.put(java.lang.Integer.valueOf(r10.we()), new java.util.ArrayList());
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        $pc16 = 102; continue $sw16;
                    }
                    case 102: {
                        try {
                            r1.yS.get(java.lang.Integer.valueOf(r10.we())).add(r10);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 105; continue $sw16;
                        }
                        return;
                    }
                    case 105: {
                        th = $ex16;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public static void j6(android.app.Activity r6) {
        long r0 = 0L;
        java.util.Iterator r2 = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    j6("onActivityCreated", com.appfour.backbone.api.Api.identifier(r6) + "");
                    r0 = DW();
                    r2 = new java.util.ArrayList(Hw().u7).iterator();
                    $pc17 = 4; continue $sw17;
                }
                case 4: {
                    if (r2.hasNext() == false) { $pc17 = 6; continue $sw17; }
                    j6(r0, (abcd.Abstractiv) r2.next(), new java.lang.Object[]{r6});
                    { $pc17 = 4; continue $sw17; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.app.Activity r7, com.appfour.backbone.api.objects.InAppProduct r8) {
        long r2 = 0L;
        java.util.Iterator r0 = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    j6("onInAppProductImpression", r8.getProductId());
                    if (abcd.kv.a.j6 == false) { $pc18 = 5; continue $sw18; }
                    abcd.kv.a.v5 = true;
                    $pc18 = 5; continue $sw18;
                }
                case 5: {
                    r2 = DW();
                    r0 = new java.util.ArrayList(Hw().VH).iterator();
                    $pc18 = 7; continue $sw18;
                }
                case 7: {
                    if (r0.hasNext() == false) { $pc18 = 9; continue $sw18; }
                    j6(r2, (abcd.Abstractiv) r0.next(), new java.lang.Object[]{r7, r8});
                    { $pc18 = 7; continue $sw18; }
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.app.Application r6) {
        long r0 = 0L;
        java.util.Iterator r2 = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    j6("onApplicationCreate", r6.getPackageName());
                    r0 = DW();
                    r2 = new java.util.ArrayList(Hw().gn).iterator();
                    $pc19 = 4; continue $sw19;
                }
                case 4: {
                    if (r2.hasNext() == false) { $pc19 = 6; continue $sw19; }
                    j6(r0, (abcd.Abstractiv) r2.next(), new java.lang.Object[]{r6});
                    { $pc19 = 4; continue $sw19; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(com.appfour.backbone.api.objects.Market r6) {
        java.util.Iterator r0 = null;
        abcd.Abstractiv r1 = null;
        java.util.Iterator r7 = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    j6("onInstall", "");
                    r0 = new java.util.ArrayList(Hw().FH).iterator();
                    $pc20 = 4; continue $sw20;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc20 = 6; continue $sw20; }
                    r1 = (abcd.Abstractiv) r0.next();
                    j6(com.appfour.backbone.api.Api.getInstallTime(), r1, new java.lang.Object[]{r6});
                    { $pc20 = 4; continue $sw20; }
                }
                case 6: {
                    r7 = new java.util.ArrayList(Hw().v5).iterator();
                    $pc20 = 8; continue $sw20;
                }
                case 8: {
                    if (r7.hasNext() == false) { $pc20 = 10; continue $sw20; }
                    j6(com.appfour.backbone.api.Api.getInstallTime(), (abcd.Abstractiv) r7.next(), new java.lang.Object[0]);
                    { $pc20 = 8; continue $sw20; }
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(com.appfour.backbone.api.objects.MarketReferrer r4, long r5, long r7) {
        java.util.Iterator r0 = null;
        java.util.Iterator r6 = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    r0 = new java.util.ArrayList(Hw().j6).iterator();
                    $pc21 = 4; continue $sw21;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc21 = 6; continue $sw21; }
                    j6(r5, (abcd.Abstractiv) r0.next(), new java.lang.Object[]{r4});
                    { $pc21 = 4; continue $sw21; }
                }
                case 6: {
                    r6 = new java.util.ArrayList(Hw().DW).iterator();
                    $pc21 = 8; continue $sw21;
                }
                case 8: {
                    if (r6.hasNext() == false) { $pc21 = 10; continue $sw21; }
                    j6(r7, (abcd.Abstractiv) r6.next(), new java.lang.Object[]{r4.getMarket()});
                    { $pc21 = 8; continue $sw21; }
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(com.appfour.backbone.api.objects.UserActionWindow r0) {
    }

    public static void j6(com.appfour.backbone.api.objects.UserInputAction r7) {
        long r2 = 0L;
        java.util.Iterator r0 = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    j6("onInput", r7 + "");
                    if (abcd.kv.a.j6 == false) { $pc22 = 5; continue $sw22; }
                    abcd.kv.a.Zo = true;
                    $pc22 = 5; continue $sw22;
                }
                case 5: {
                    r2 = DW();
                    r0 = new java.util.ArrayList(Hw().U2).iterator();
                    $pc22 = 7; continue $sw22;
                }
                case 7: {
                    if (r0.hasNext() == false) { $pc22 = 9; continue $sw22; }
                    j6(r2, (abcd.Abstractiv) r0.next(), new java.lang.Object[]{r7});
                    { $pc22 = 7; continue $sw22; }
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(com.appfour.backbone.api.objects.UserLaunchAction r6) {
        long r0 = 0L;
        java.util.Iterator r2 = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = -1;
        $sw23: while (true) {
            switch ($pc23) {
                case -1: {
                    j6("onLaunched", com.appfour.backbone.api.Api.identifier(r6) + "");
                    r0 = DW();
                    r2 = new java.util.ArrayList(Hw().Ws).iterator();
                    $pc23 = 4; continue $sw23;
                }
                case 4: {
                    if (r2.hasNext() == false) { $pc23 = 6; continue $sw23; }
                    j6(r0, (abcd.Abstractiv) r2.next(), new java.lang.Object[]{r6});
                    { $pc23 = 4; continue $sw23; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(com.appfour.backbone.api.objects.UserNotification r7) {
        long r2 = 0L;
        java.util.Iterator r0 = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = -1;
        $sw24: while (true) {
            switch ($pc24) {
                case -1: {
                    j6("onNotification", r7 + "");
                    if (abcd.kv.a.j6 == false) { $pc24 = 5; continue $sw24; }
                    abcd.kv.a.gn = true;
                    $pc24 = 5; continue $sw24;
                }
                case 5: {
                    r2 = DW();
                    r0 = new java.util.ArrayList(Hw().aM).iterator();
                    $pc24 = 7; continue $sw24;
                }
                case 7: {
                    if (r0.hasNext() == false) { $pc24 = 9; continue $sw24; }
                    j6(r2, (abcd.Abstractiv) r0.next(), new java.lang.Object[]{r7});
                    { $pc24 = 7; continue $sw24; }
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(com.appfour.backbone.api.objects.UserNotificationAction r7) {
        long r2 = 0L;
        java.util.Iterator r0 = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = -1;
        $sw25: while (true) {
            switch ($pc25) {
                case -1: {
                    j6("onNotificationAction", r7 + "");
                    if (abcd.kv.a.j6 == false) { $pc25 = 5; continue $sw25; }
                    abcd.kv.a.u7 = true;
                    $pc25 = 5; continue $sw25;
                }
                case 5: {
                    r2 = DW();
                    r0 = new java.util.ArrayList(Hw().j3).iterator();
                    $pc25 = 7; continue $sw25;
                }
                case 7: {
                    if (r0.hasNext() == false) { $pc25 = 9; continue $sw25; }
                    j6(r2, (abcd.Abstractiv) r0.next(), new java.lang.Object[]{r7});
                    { $pc25 = 7; continue $sw25; }
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(com.appfour.backbone.api.objects.UserTouchAction r7) {
        long r2 = 0L;
        java.util.Iterator r0 = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = -1;
        $sw26: while (true) {
            switch ($pc26) {
                case -1: {
                    j6("onTouch", r7 + "");
                    if (abcd.kv.a.j6 == false) { $pc26 = 5; continue $sw26; }
                    abcd.kv.a.VH = true;
                    $pc26 = 5; continue $sw26;
                }
                case 5: {
                    r2 = DW();
                    r0 = new java.util.ArrayList(Hw().Mr).iterator();
                    $pc26 = 7; continue $sw26;
                }
                case 7: {
                    if (r0.hasNext() == false) { $pc26 = 9; continue $sw26; }
                    j6(r2, (abcd.Abstractiv) r0.next(), new java.lang.Object[]{r7});
                    { $pc26 = 7; continue $sw26; }
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(com.appfour.backbone.api.objects.UserTouchAction r6, android.view.MenuItem r7) {
        long r0 = 0L;
        java.util.Iterator r2 = null;
        abcd.Abstractiv r3 = null;
        java.lang.Throwable $ex27 = null;
        int $pc27 = -1;
        $sw27: while (true) {
            switch ($pc27) {
                case -1: {
                    j6("onMenuItemSelected", r6.toString());
                    if (abcd.kv.a.j6 == true) { $pc27 = 5; continue $sw27; }
                    $pc27 = 8; continue $sw27;
                }
                case 8: {
                    r0 = DW();
                    if (Hw().yS.containsKey(java.lang.Integer.valueOf(r7.getItemId())) == false) { $pc27 = 18; continue $sw27; }
                    r2 = new java.util.ArrayList(Hw().yS.get(java.lang.Integer.valueOf(r7.getItemId()))).iterator();
                    $pc27 = 12; continue $sw27;
                }
                case 12: {
                    if (r2.hasNext() == false) { $pc27 = 26; continue $sw27; }
                    r3 = (abcd.Abstractiv) r2.next();
                    if (r3.EQ() == null) { $pc27 = 12; continue $sw27; }
                    if (r3.EQ().isInstance(r6.getActivity()) == false) { $pc27 = 12; continue $sw27; }
                    j6(r0, r3, new java.lang.Object[]{r6, r7});
                    { $pc27 = 12; continue $sw27; }
                }
                case 26: {
                    return;
                }
                case 18: {
                    return;
                }
                case 5: {
                    if (abcd.kv.a.J8.containsKey(java.lang.Integer.valueOf(r7.getItemId())) == true) { $pc27 = 7; continue $sw27; }
                    abcd.kv.a.J8.put(java.lang.Integer.valueOf(r7.getItemId()), new java.util.HashSet());
                    $pc27 = 7; continue $sw27;
                }
                case 7: {
                    abcd.kv.a.J8.get(java.lang.Integer.valueOf(r7.getItemId())).add(r6.getActivityClass());
                    { $pc27 = 8; continue $sw27; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(com.appfour.backbone.api.objects.UserTouchAction r7, android.view.View r8) {
        long r0 = 0L;
        java.util.Iterator r2 = null;
        abcd.Abstractiv r3 = null;
        java.lang.Throwable $ex28 = null;
        int $pc28 = -1;
        $sw28: while (true) {
            switch ($pc28) {
                case -1: {
                    j6("onClick", r7.toString());
                    if (abcd.kv.a.j6 == true) { $pc28 = 5; continue $sw28; }
                    $pc28 = 8; continue $sw28;
                }
                case 8: {
                    r0 = DW();
                    if (Hw().a8.containsKey(java.lang.Integer.valueOf(r8.getId())) == false) { $pc28 = 20; continue $sw28; }
                    r2 = new java.util.ArrayList(Hw().a8.get(java.lang.Integer.valueOf(r8.getId()))).iterator();
                    $pc28 = 12; continue $sw28;
                }
                case 12: {
                    if (r2.hasNext() == false) { $pc28 = 30; continue $sw28; }
                    r3 = (abcd.Abstractiv) r2.next();
                    if (r3.EQ() == null) { $pc28 = 12; continue $sw28; }
                    if (r3.EQ() == null) { $pc28 = 12; continue $sw28; }
                    if (r3.EQ().isInstance(r7.getActivity()) == false) { $pc28 = 12; continue $sw28; }
                    j6(r0, r3, new java.lang.Object[]{r7.getActivity(), r8});
                    { $pc28 = 12; continue $sw28; }
                }
                case 30: {
                    return;
                }
                case 20: {
                    return;
                }
                case 5: {
                    if (abcd.kv.a.tp.containsKey(java.lang.Integer.valueOf(r8.getId())) == true) { $pc28 = 7; continue $sw28; }
                    abcd.kv.a.tp.put(java.lang.Integer.valueOf(r8.getId()), new java.util.HashSet());
                    $pc28 = 7; continue $sw28;
                }
                case 7: {
                    abcd.kv.a.tp.get(java.lang.Integer.valueOf(r8.getId())).add(r7.getActivityClass());
                    { $pc28 = 8; continue $sw28; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(com.appfour.backbone.api.objects.UserTouchAction r7, android.view.View r8, java.lang.Object r9, int r10, android.view.View r11) {
        long r0 = 0L;
        java.util.Iterator r2 = null;
        abcd.Abstractiv r3 = null;
        java.lang.Throwable $ex29 = null;
        int $pc29 = -1;
        $sw29: while (true) {
            switch ($pc29) {
                case -1: {
                    j6("onItemClick", r7.toString());
                    if (abcd.kv.a.j6 == true) { $pc29 = 5; continue $sw29; }
                    $pc29 = 8; continue $sw29;
                }
                case 8: {
                    r0 = DW();
                    if (Hw().rN.containsKey(java.lang.Integer.valueOf(r8.getId())) == false) { $pc29 = 18; continue $sw29; }
                    r2 = new java.util.ArrayList(Hw().rN.get(java.lang.Integer.valueOf(r8.getId()))).iterator();
                    $pc29 = 12; continue $sw29;
                }
                case 12: {
                    if (r2.hasNext() == false) { $pc29 = 26; continue $sw29; }
                    r3 = (abcd.Abstractiv) r2.next();
                    if (r3.EQ() == null) { $pc29 = 12; continue $sw29; }
                    if (r3.EQ().isInstance(r7.getActivity()) == false) { $pc29 = 12; continue $sw29; }
                    j6(r0, r3, new java.lang.Object[]{r7.getActivity(), r8, r9, java.lang.Integer.valueOf(r10), r11});
                    { $pc29 = 12; continue $sw29; }
                }
                case 26: {
                    return;
                }
                case 18: {
                    return;
                }
                case 5: {
                    if (abcd.kv.a.we.containsKey(java.lang.Integer.valueOf(r8.getId())) == true) { $pc29 = 7; continue $sw29; }
                    abcd.kv.a.we.put(java.lang.Integer.valueOf(r8.getId()), new java.util.HashSet());
                    $pc29 = 7; continue $sw29;
                }
                case 7: {
                    abcd.kv.a.we.get(java.lang.Integer.valueOf(r8.getId())).add(r7.getActivityClass());
                    { $pc29 = 8; continue $sw29; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(java.lang.String r1, java.lang.CharSequence r2) {
        abcd.yw.j6("Hook", r1 + " " + r2);
    }

    public static void j6(java.lang.Thread r7, java.lang.Throwable r8) {
        long r2 = 0L;
        java.util.Iterator r0 = null;
        abcd.Abstractiv r4 = null;
        java.lang.Throwable $ex30 = null;
        int $pc30 = -1;
        $sw30: while (true) {
            switch ($pc30) {
                case -1: {
                    if (abcd.kv.a.j6 == false) { $pc30 = 5; continue $sw30; }
                    abcd.kv.a.FH = true;
                    $pc30 = 5; continue $sw30;
                }
                case 5: {
                    r2 = DW();
                    r0 = new java.util.ArrayList(Hw().we).iterator();
                    $pc30 = 7; continue $sw30;
                }
                case 7: {
                    if (r0.hasNext() == false) { $pc30 = 13; continue $sw30; }
                    r4 = (abcd.Abstractiv) r0.next();
                    if (r4.FH() == null) { $pc30 = 12; continue $sw30; }
                    if (r4.FH().isInstance(r8) == false) { $pc30 = 7; continue $sw30; }
                    $pc30 = 12; continue $sw30;
                }
                case 12: {
                    j6(r2, r4, new java.lang.Object[]{r7, r8});
                    { $pc30 = 7; continue $sw30; }
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.util.List<? extends abcd.Abstractiv> r1) {
        java.util.Iterator<? extends abcd.Abstractiv> r2 = null;
        java.lang.Throwable $ex31 = null;
        int $pc31 = -1;
        $sw31: while (true) {
            switch ($pc31) {
                case -1: {
                    r2 = r1.iterator();
                    $pc31 = 4; continue $sw31;
                }
                case 4: {
                    if (r2.hasNext() == false) { $pc31 = 6; continue $sw31; }
                    j6(r2.next());
                    { $pc31 = 4; continue $sw31; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(boolean r2) {
        DW = true;
        abcd.kv.a.j6 = r2;
        abcd.kv.a.DW = DW();
    }

    private static boolean v5() {
        java.lang.Throwable $ex32 = null;
        int $pc32 = -1;
        $sw32: while (true) {
            switch ($pc32) {
                case -1: {
                    if (j6.get() != null) { $pc32 = 5; continue $sw32; }
                    $pc32 = 7; continue $sw32;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (j6.get().booleanValue() == false) { $pc32 = 7; continue $sw32; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
