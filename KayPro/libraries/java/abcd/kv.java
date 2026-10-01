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
        java.lang.Object r0 = FH;
        monitor-enter(r0);
        abcd.kv.b r1 = Hw;     // Catch: java.lang.Throwable -> L102
        if (r9.tp() == false) goto L12;
        long r4 = r9.u7();     // Catch: java.lang.Throwable -> L102
        long r6 = r9.gn();     // Catch: java.lang.Throwable -> L102
        java.util.List<abcd.Abstractiv> r2 = r1.J0.get(java.lang.Long.valueOf(r4));     // Catch: java.lang.Throwable -> L102
        if (r2 == null) goto L100;
        r2.remove(r9);     // Catch: java.lang.Throwable -> L102
        if (r2.isEmpty() == false) goto L100;
        r1.J0.remove(java.lang.Long.valueOf(r4));     // Catch: java.lang.Throwable -> L102
        abcd.Ev.j6(r6, r4, false);     // Catch: java.lang.Throwable -> L102
    L100:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L102
        return;
    L12:
        if (r9.vy() == false) goto L15;
        r1.gn.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L15:
        if (r9.ro() == false) goto L18;
        r1.v5.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L18:
        if (r9.nw() == false) goto L21;
        r1.FH.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L21:
        if (r9.cn() == false) goto L24;
        r1.Hw.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L24:
        if (r9.P8() == false) goto L27;
        r1.VH.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L27:
        if (r9.ei() == false) goto L30;
        r1.Zo.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L30:
        if (r9.KD() == false) goto L33;
        r1.j6.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L33:
        if (r9.SI() == false) goto L36;
        r1.DW.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L36:
        if (r9.VH() == false) goto L43;
        long r5 = r9.Zo();     // Catch: java.lang.Throwable -> L102
        long r7 = r9.v5();     // Catch: java.lang.Throwable -> L102
        java.util.List<abcd.Abstractiv> r3 = r1.J8.get(java.lang.Long.valueOf(r5));     // Catch: java.lang.Throwable -> L102
        if (r3 == null) goto L100;
        r3.remove(r9);     // Catch: java.lang.Throwable -> L102
        if (r3.isEmpty() == false) goto L100;
        r1.J8.remove(java.lang.Long.valueOf(r5));     // Catch: java.lang.Throwable -> L102
        abcd.Ev.DW(r7, r5, false);     // Catch: java.lang.Throwable -> L102
        goto L100
    L43:
        if (r9.BT() == false) goto L46;
        r1.we.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L46:
        if (r9.Mr() == false) goto L49;
        r1.Ws.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L49:
        if (r9.J0() == false) goto L52;
        r1.u7.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L52:
        if (r9.J8() == false) goto L55;
        r1.tp.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L55:
        if (r9.Ws() == false) goto L58;
        r1.EQ.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L58:
        if (r9.rN() == false) goto L61;
        r1.aM.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L61:
        if (r9.lg() == false) goto L64;
        r1.j3.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L64:
        if (r9.yS() == false) goto L67;
        r1.XL.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L67:
        if (r9.gW() == false) goto L70;
        r1.QX.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L70:
        if (r9.XL() == false) goto L73;
        r1.U2.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L73:
        if (r9.er() == false) goto L76;
        r1.Mr.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L76:
        if (r9.QX() == false) goto L81;
        java.util.List<abcd.Abstractiv> r8 = r1.a8.get(java.lang.Integer.valueOf(r9.we()));     // Catch: java.lang.Throwable -> L102
        if (r8 == null) goto L100;
        r8.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L81:
        if (r9.U2() == false) goto L86;
        java.util.List<abcd.Abstractiv> r10 = r1.lg.get(java.lang.Integer.valueOf(r9.we()));     // Catch: java.lang.Throwable -> L102
        if (r10 == null) goto L100;
        r10.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L86:
        if (r9.aM() == false) goto L91;
        java.util.List<abcd.Abstractiv> r11 = r1.rN.get(java.lang.Integer.valueOf(r9.we()));     // Catch: java.lang.Throwable -> L102
        if (r11 == null) goto L100;
        r11.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L91:
        if (r9.j3() == false) goto L96;
        java.util.List<abcd.Abstractiv> r12 = r1.er.get(java.lang.Integer.valueOf(r9.we()));     // Catch: java.lang.Throwable -> L102
        if (r12 == null) goto L100;
        r12.remove(r9);     // Catch: java.lang.Throwable -> L102
        goto L100
    L96:
        if (r9.a8() == false) goto L100;
        java.util.List<abcd.Abstractiv> r13 = r1.yS.get(java.lang.Integer.valueOf(r9.we()));     // Catch: java.lang.Throwable -> L102
        if (r13 == null) goto L100;
        r13.remove(r9);     // Catch: java.lang.Throwable -> L102
    L102:
        th = move-exception;
        throw th;
    }

    public static void DW(android.app.Activity r6) {
        j6("onActivityStarted", com.appfour.backbone.api.Api.identifier(r6) + "");
        long r0 = DW();
        java.util.Iterator r2 = new java.util.ArrayList(Hw().tp).iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        j6(r0, (abcd.Abstractiv) r2.next(), new java.lang.Object[]{r6});
        goto L4
    }

    public static void DW(android.app.Activity r7, com.appfour.backbone.api.objects.InAppProduct r8) {
        j6("onInAppProductPurchase", r8.getProductId());
        if (abcd.kv.a.j6 == false) goto L5;
        abcd.kv.a.Hw = true;
    L5:
        long r2 = DW();
        java.util.Iterator r0 = new java.util.ArrayList(Hw().Zo).iterator();
    L7:
        if (r0.hasNext() == false) goto L9;
        j6(r2, (abcd.Abstractiv) r0.next(), new java.lang.Object[]{r7, r8});
        goto L7
    }

    public static void DW(com.appfour.backbone.api.objects.UserActionWindow r0) {
    }

    public static void DW(com.appfour.backbone.api.objects.UserTouchAction r7, android.view.View r8) {
        j6("onLongPress", r7.toString());
        if (abcd.kv.a.j6 == true) goto L5;
    L8:
        long r0 = DW();
        if (Hw().lg.containsKey(java.lang.Integer.valueOf(r8.getId())) == false) goto L18;
        java.util.Iterator r2 = new java.util.ArrayList(Hw().lg.get(java.lang.Integer.valueOf(r8.getId()))).iterator();
    L12:
        if (r2.hasNext() == false) goto L26;
        abcd.Abstractiv r3 = (abcd.Abstractiv) r2.next();
        if (r3.EQ() == null) goto L12;
        if (r3.EQ().isInstance(r7.getActivity()) == false) goto L12;
        j6(r0, r3, new java.lang.Object[]{r7.getActivity(), r8});
        goto L12
    L26:
        return;
    L18:
        return;
    L5:
        if (abcd.kv.a.EQ.containsKey(java.lang.Integer.valueOf(r8.getId())) == true) goto L7;
        abcd.kv.a.EQ.put(java.lang.Integer.valueOf(r8.getId()), new java.util.HashSet());
    L7:
        abcd.kv.a.EQ.get(java.lang.Integer.valueOf(r8.getId())).add(r7.getActivityClass());
        goto L8
    }

    public static void DW(com.appfour.backbone.api.objects.UserTouchAction r7, android.view.View r8, java.lang.Object r9, int r10, android.view.View r11) {
        j6("onItemLongPress", r7.toString());
        if (abcd.kv.a.j6 == true) goto L5;
    L8:
        long r0 = DW();
        if (Hw().er.containsKey(java.lang.Integer.valueOf(r8.getId())) == false) goto L18;
        java.util.Iterator r2 = new java.util.ArrayList(Hw().er.get(java.lang.Integer.valueOf(r8.getId()))).iterator();
    L12:
        if (r2.hasNext() == false) goto L26;
        abcd.Abstractiv r3 = (abcd.Abstractiv) r2.next();
        if (r3.EQ() == null) goto L12;
        if (r3.EQ().isInstance(r7.getActivity()) == false) goto L12;
        j6(r0, r3, new java.lang.Object[]{r7.getActivity(), r8, r9, java.lang.Integer.valueOf(r10), r11});
        goto L12
    L26:
        return;
    L18:
        return;
    L5:
        if (abcd.kv.a.J0.containsKey(java.lang.Integer.valueOf(r8.getId())) == true) goto L7;
        abcd.kv.a.J0.put(java.lang.Integer.valueOf(r8.getId()), new java.util.HashSet());
    L7:
        abcd.kv.a.J0.get(java.lang.Integer.valueOf(r8.getId())).add(r7.getActivityClass());
        goto L8
    }

    public static void DW(java.util.List<? extends abcd.Abstractiv> r1) {
        java.util.Iterator<? extends abcd.Abstractiv> r2 = r1.iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        DW(r2.next());
        goto L4
    }

    public static void FH() {
        j6("onUpdate", "");
        java.util.Iterator r0 = new java.util.ArrayList(Hw().Hw).iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        abcd.Abstractiv r1 = (abcd.Abstractiv) r0.next();
        j6(com.appfour.backbone.api.Api.getLastUpdateTime(), r1, new java.lang.Object[0]);
        goto L4
    L6:
        java.util.Iterator r2 = new java.util.ArrayList(Hw().v5).iterator();
    L8:
        if (r2.hasNext() == false) goto L10;
        abcd.Abstractiv r3 = (abcd.Abstractiv) r2.next();
        j6(com.appfour.backbone.api.Api.getLastUpdateTime(), r3, new java.lang.Object[0]);
        goto L8
    }

    public static void FH(android.app.Activity r6) {
        j6("onActivityStopped", com.appfour.backbone.api.Api.identifier(r6) + "");
        long r0 = DW();
        java.util.Iterator r2 = new java.util.ArrayList(Hw().EQ).iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        j6(r0, (abcd.Abstractiv) r2.next(), new java.lang.Object[]{r6});
        goto L4
    }

    public static void FH(com.appfour.backbone.api.objects.UserActionWindow r6) {
        if (r6.toString().endsWith(":editor_handle") == false) goto L5;
        return;
    L5:
        j6("onWindowHidden", r6 + "");
        long r0 = DW();
        java.util.Iterator r2 = new java.util.ArrayList(Hw().XL).iterator();
    L7:
        if (r2.hasNext() == false) goto L9;
        j6(r0, (abcd.Abstractiv) r2.next(), new java.lang.Object[]{r6});
        goto L7
    }

    private static abcd.kv.b Hw() {
        java.lang.Object r0 = FH;
        monitor-enter(r0);
        abcd.kv.b r1 = Hw;     // Catch: java.lang.Throwable -> L7
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public static void Hw(com.appfour.backbone.api.objects.UserActionWindow r6) {
        if (r6.toString().endsWith(":editor_handle") == false) goto L5;
        return;
    L5:
        j6("onWindowShown", r6 + "");
        long r0 = DW();
        java.util.Iterator r2 = new java.util.ArrayList(Hw().QX).iterator();
    L7:
        if (r2.hasNext() == false) goto L9;
        j6(r0, (abcd.Abstractiv) r2.next(), new java.lang.Object[]{r6});
        goto L7
    }

    public static long j6(abcd.Abstractiv r3, long r4, long r6) {
        if (r3.KD() == false) goto L10;
        if (com.appfour.backbone.api.Api.isMainProcess() == false) goto L8;
        return r4;
    L8:
        return 0;
    L10:
        if (r3.SI() == false) goto L17;
        if (com.appfour.backbone.api.Api.isMainProcess() == false) goto L15;
        return r4;
    L15:
        return 0;
    L17:
        if (r3.ro() == false) goto L24;
        if (com.appfour.backbone.api.Api.isMainProcess() == false) goto L22;
        return r4;
    L22:
        return 0;
    L24:
        if (r3.cn() == false) goto L31;
        if (com.appfour.backbone.api.Api.isMainProcess() == false) goto L29;
        return r4;
    L29:
        return 0;
    L31:
        if (r3.nw() == false) goto L38;
        if (com.appfour.backbone.api.Api.isMainProcess() == false) goto L36;
        return r4;
    L36:
        return 0;
    L38:
        if (r3.tp() == false) goto L46;
        if (abcd.kv.a.j6 == true) goto L42;
    L44:
        return r4;
    L42:
        if (abcd.kv.a.QX.contains(java.lang.Long.valueOf(r3.gn())) == true) goto L44;
        return r6;
    L46:
        if (r3.vy() == false) goto L49;
        return r4;
    L49:
        if (r3.P8() == false) goto L57;
        if (abcd.kv.a.j6 == true) goto L53;
    L55:
        return r4;
    L53:
        if (abcd.kv.a.v5 == true) goto L55;
        return r6;
    L57:
        if (r3.ei() == false) goto L65;
        if (abcd.kv.a.j6 == true) goto L61;
    L63:
        return r4;
    L61:
        if (abcd.kv.a.Hw == true) goto L63;
        return r6;
    L65:
        if (r3.VH() == false) goto L73;
        if (abcd.kv.a.j6 == true) goto L69;
    L71:
        return r4;
    L69:
        if (abcd.kv.a.QX.contains(java.lang.Long.valueOf(r3.v5())) == true) goto L71;
        return r6;
    L73:
        if (r3.BT() == false) goto L81;
        if (abcd.kv.a.j6 == true) goto L77;
    L79:
        return r4;
    L77:
        if (abcd.kv.a.FH == true) goto L79;
        return r6;
    L81:
        if (r3.J8() == false) goto L84;
        return r4;
    L84:
        if (r3.Ws() == false) goto L87;
        return r4;
    L87:
        if (r3.J0() == false) goto L90;
        return r4;
    L90:
        if (r3.Mr() == false) goto L93;
        return r4;
    L93:
        if (r3.gW() == false) goto L96;
        return r4;
    L96:
        if (r3.rN() == false) goto L104;
        if (abcd.kv.a.j6 == true) goto L100;
    L102:
        return r4;
    L100:
        if (abcd.kv.a.gn == true) goto L102;
        return r6;
    L104:
        if (r3.lg() == false) goto L112;
        if (abcd.kv.a.j6 == true) goto L108;
    L110:
        return r4;
    L108:
        if (abcd.kv.a.u7 == true) goto L110;
        return r6;
    L112:
        if (r3.yS() == false) goto L115;
        return r4;
    L115:
        if (r3.er() == false) goto L123;
        if (abcd.kv.a.j6 == true) goto L119;
    L121:
        return r4;
    L119:
        if (abcd.kv.a.VH == true) goto L121;
        return r6;
    L123:
        if (r3.XL() == false) goto L131;
        if (abcd.kv.a.j6 == true) goto L127;
    L129:
        return r4;
    L127:
        if (abcd.kv.a.Zo == true) goto L129;
        return r6;
    L131:
        if (r3.QX() == false) goto L148;
        if (abcd.kv.a.j6 == true) goto L135;
    L146:
        return r4;
    L135:
        if (r3.we() == (-1)) goto L137;
        java.util.Set<java.lang.Class> r0 = abcd.kv.a.tp.get(java.lang.Integer.valueOf(r3.we()));
        if (r0 != null) goto L142;
    L145:
        return r6;
    L142:
        if (r3.EQ() == null) goto L146;
        if (r0.contains(r3.EQ()) == true) goto L146;
    L137:
        if (abcd.kv.a.tp.isEmpty() == false) goto L146;
        return r6;
    L148:
        if (r3.U2() == false) goto L165;
        if (abcd.kv.a.j6 == true) goto L152;
    L163:
        return r4;
    L152:
        if (r3.we() == (-1)) goto L154;
        java.util.Set<java.lang.Class> r1 = abcd.kv.a.EQ.get(java.lang.Integer.valueOf(r3.we()));
        if (r1 != null) goto L159;
    L162:
        return r6;
    L159:
        if (r3.EQ() == null) goto L163;
        if (r1.contains(r3.EQ()) == true) goto L163;
    L154:
        if (abcd.kv.a.EQ.isEmpty() == false) goto L163;
        return r6;
    L165:
        if (r3.aM() == false) goto L182;
        if (abcd.kv.a.j6 == true) goto L169;
    L180:
        return r4;
    L169:
        if (r3.we() == (-1)) goto L171;
        java.util.Set<java.lang.Class> r2 = abcd.kv.a.we.get(java.lang.Integer.valueOf(r3.we()));
        if (r2 != null) goto L176;
    L179:
        return r6;
    L176:
        if (r3.EQ() == null) goto L180;
        if (r2.contains(r3.EQ()) == true) goto L180;
    L171:
        if (abcd.kv.a.we.isEmpty() == false) goto L180;
        return r6;
    L182:
        if (r3.j3() == false) goto L199;
        if (abcd.kv.a.j6 == true) goto L186;
    L197:
        return r4;
    L186:
        if (r3.we() == (-1)) goto L188;
        java.util.Set<java.lang.Class> r5 = abcd.kv.a.J0.get(java.lang.Integer.valueOf(r3.we()));
        if (r5 != null) goto L193;
    L196:
        return r6;
    L193:
        if (r3.EQ() == null) goto L197;
        if (r5.contains(r3.EQ()) == true) goto L197;
    L188:
        if (abcd.kv.a.J0.isEmpty() == false) goto L197;
        return r6;
    L199:
        if (r3.a8() == true) goto L201;
    L214:
        return r4;
    L201:
        if (abcd.kv.a.j6 == false) goto L214;
        if (r3.we() == (-1)) goto L205;
        java.util.Set<java.lang.Class> r7 = abcd.kv.a.J8.get(java.lang.Integer.valueOf(r3.we()));
        if (r7 != null) goto L210;
    L213:
        return r6;
    L210:
        if (r3.EQ() == null) goto L214;
        if (r7.contains(r3.EQ()) == true) goto L214;
    L205:
        if (abcd.kv.a.J8.isEmpty() == false) goto L214;
        return r6;
    }

    public static void j6() {
        abcd.kv.a.QX = new java.util.HashSet(abcd.kv.a.Ws);
    }

    public static void j6(long r0, long r2) {
        if (abcd.kv.a.j6 == false) goto L5;
    L6:
        abcd.kv.a.Ws.add(java.lang.Long.valueOf(r0));
        return;
    L5:
        if (DW == false) goto L6;
    }

    private static void j6(long r3, abcd.Abstractiv r5, java.lang.Object... r6) {
        if (r5.DW() == null) goto L16;
        com.appfour.backbone.api.objects.EventData r0 = null;
        j6.set(true);     // Catch: java.lang.Throwable -> L7 java.lang.Throwable -> L9
        r0 = r5.DW().j6(r6);     // Catch: java.lang.Throwable -> L7 java.lang.Throwable -> L9
    L11:
        j6.remove();
        if (r0 == null) goto L20;
        r5.j6(r3, r0);
        return;
    L20:
        return;
    L9:
        th = move-exception;
        r5.j6(r3, th);     // Catch: java.lang.Throwable -> L7
    L7:
        th = move-exception;
        j6.remove();
        throw th;
    }

    public static void j6(long r5, java.lang.Object r7, java.lang.Object... r8) {
        if (v5() == true) goto L14;
        j6("onEnter", "" + r5);
        long r0 = DW();
        java.util.List<abcd.Abstractiv> r6 = Hw().J0.get(java.lang.Long.valueOf(r5));
        if (r6 == null) goto L17;
        java.util.Iterator r9 = new java.util.ArrayList(r6).iterator();
    L8:
        if (r9.hasNext() == false) goto L18;
        abcd.Abstractiv r10 = (abcd.Abstractiv) r9.next();
        java.lang.Object[] r2 = new java.lang.Object[r8.length + 1];
        int r3 = 0;
        r2[0] = r7;
    L11:
        if (r3 >= r8.length) goto L13;
        int r4 = r3 + 1;
        r2[r4] = r8[r3];
        r3 = r4;
        goto L11
    L13:
        j6(r0, r10, r2);
        goto L8
    L18:
        return;
    L17:
        return;
    }

    public static void j6(long r6, java.lang.Throwable r8, java.lang.Object r9, java.lang.Object... r10) {
        if (v5() == true) goto L20;
        j6("onThrow", "" + r6);
        long r0 = DW();
        java.util.List<abcd.Abstractiv> r7 = Hw().J8.get(java.lang.Long.valueOf(r6));
        if (r7 == null) goto L28;
        java.util.Iterator r11 = new java.util.ArrayList(r7).iterator();
    L8:
        if (r11.hasNext() == false) goto L29;
        abcd.Abstractiv r12 = (abcd.Abstractiv) r11.next();
        if (r12.FH() == null) goto L14;
        if (r12.FH().isInstance(r8) == false) goto L14;
    L15:
        java.lang.Object[] r2 = new java.lang.Object[r10.length + 2];
        int r3 = 0;
        r2[0] = r9;
        r2[1] = r8;
    L17:
        if (r3 >= r10.length) goto L19;
        r2[r3 + 2] = r10[r3];
        r3 = r3 + 1;
        goto L17
    L19:
        j6(r0, r12, r2);
    L14:
        if (abcd.Ev.DW(r8, r12.Hw()) == false) goto L8;
    L29:
        return;
    L28:
        return;
    }

    private static void j6(abcd.Abstractiv r10) {
        java.lang.Object r0 = FH;
        monitor-enter(r0);
        abcd.kv.b r1 = Hw;     // Catch: java.lang.Throwable -> L105
        if (r10.tp() == false) goto L11;
        long r4 = r10.u7();     // Catch: java.lang.Throwable -> L105
        long r6 = r10.gn();     // Catch: java.lang.Throwable -> L105
        if (r1.J0.containsKey(java.lang.Long.valueOf(r4)) == true) goto L9;
        r1.J0.put(java.lang.Long.valueOf(r4), new java.util.ArrayList());     // Catch: java.lang.Throwable -> L105
    L9:
        r1.J0.get(java.lang.Long.valueOf(r4)).add(r10);     // Catch: java.lang.Throwable -> L105
        abcd.Ev.j6(r6, r4, true);     // Catch: java.lang.Throwable -> L105
    L103:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L105
        return;
    L11:
        if (r10.vy() == false) goto L14;
        r1.gn.add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L14:
        if (r10.ro() == false) goto L17;
        r1.v5.add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L17:
        if (r10.nw() == false) goto L20;
        r1.FH.add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L20:
        if (r10.cn() == false) goto L23;
        r1.Hw.add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L23:
        if (r10.P8() == false) goto L26;
        r1.VH.add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L26:
        if (r10.ei() == false) goto L29;
        r1.Zo.add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L29:
        if (r10.KD() == false) goto L32;
        r1.j6.add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L32:
        if (r10.SI() == false) goto L35;
        r1.DW.add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L35:
        if (r10.VH() == false) goto L41;
        long r5 = r10.Zo();     // Catch: java.lang.Throwable -> L105
        long r7 = r10.v5();     // Catch: java.lang.Throwable -> L105
        if (r1.J8.containsKey(java.lang.Long.valueOf(r5)) == true) goto L39;
        r1.J8.put(java.lang.Long.valueOf(r5), new java.util.ArrayList());     // Catch: java.lang.Throwable -> L105
    L39:
        r1.J8.get(java.lang.Long.valueOf(r5)).add(r10);     // Catch: java.lang.Throwable -> L105
        abcd.Ev.DW(r7, r5, true);     // Catch: java.lang.Throwable -> L105
        goto L103
    L41:
        if (r10.BT() == false) goto L44;
        r1.we.add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L44:
        if (r10.J8() == false) goto L47;
        r1.tp.add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L47:
        if (r10.Ws() == false) goto L50;
        r1.EQ.add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L50:
        if (r10.J0() == false) goto L53;
        r1.u7.add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L53:
        if (r10.Mr() == false) goto L56;
        r1.Ws.add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L56:
        if (r10.rN() == false) goto L59;
        r1.aM.add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L59:
        if (r10.lg() == false) goto L62;
        r1.j3.add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L62:
        if (r10.gW() == false) goto L65;
        r1.QX.add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L65:
        if (r10.yS() == false) goto L68;
        r1.XL.add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L68:
        if (r10.er() == false) goto L71;
        r1.Mr.add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L71:
        if (r10.XL() == false) goto L74;
        r1.U2.add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L74:
        if (r10.QX() == false) goto L80;
        if (r1.a8.containsKey(java.lang.Integer.valueOf(r10.we())) == true) goto L78;
        r1.a8.put(java.lang.Integer.valueOf(r10.we()), new java.util.ArrayList());     // Catch: java.lang.Throwable -> L105
    L78:
        r1.a8.get(java.lang.Integer.valueOf(r10.we())).add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L80:
        if (r10.U2() == false) goto L86;
        if (r1.lg.containsKey(java.lang.Integer.valueOf(r10.we())) == true) goto L84;
        r1.lg.put(java.lang.Integer.valueOf(r10.we()), new java.util.ArrayList());     // Catch: java.lang.Throwable -> L105
    L84:
        r1.lg.get(java.lang.Integer.valueOf(r10.we())).add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L86:
        if (r10.aM() == false) goto L92;
        if (r1.rN.containsKey(java.lang.Integer.valueOf(r10.we())) == true) goto L90;
        r1.rN.put(java.lang.Integer.valueOf(r10.we()), new java.util.ArrayList());     // Catch: java.lang.Throwable -> L105
    L90:
        r1.rN.get(java.lang.Integer.valueOf(r10.we())).add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L92:
        if (r10.j3() == false) goto L98;
        if (r1.er.containsKey(java.lang.Integer.valueOf(r10.we())) == true) goto L96;
        r1.er.put(java.lang.Integer.valueOf(r10.we()), new java.util.ArrayList());     // Catch: java.lang.Throwable -> L105
    L96:
        r1.er.get(java.lang.Integer.valueOf(r10.we())).add(r10);     // Catch: java.lang.Throwable -> L105
        goto L103
    L98:
        if (r10.a8() == false) goto L103;
        if (r1.yS.containsKey(java.lang.Integer.valueOf(r10.we())) == true) goto L102;
        r1.yS.put(java.lang.Integer.valueOf(r10.we()), new java.util.ArrayList());     // Catch: java.lang.Throwable -> L105
    L102:
        r1.yS.get(java.lang.Integer.valueOf(r10.we())).add(r10);     // Catch: java.lang.Throwable -> L105
    L105:
        th = move-exception;
        throw th;
    }

    public static void j6(android.app.Activity r6) {
        j6("onActivityCreated", com.appfour.backbone.api.Api.identifier(r6) + "");
        long r0 = DW();
        java.util.Iterator r2 = new java.util.ArrayList(Hw().u7).iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        j6(r0, (abcd.Abstractiv) r2.next(), new java.lang.Object[]{r6});
        goto L4
    }

    public static void j6(android.app.Activity r7, com.appfour.backbone.api.objects.InAppProduct r8) {
        j6("onInAppProductImpression", r8.getProductId());
        if (abcd.kv.a.j6 == false) goto L5;
        abcd.kv.a.v5 = true;
    L5:
        long r2 = DW();
        java.util.Iterator r0 = new java.util.ArrayList(Hw().VH).iterator();
    L7:
        if (r0.hasNext() == false) goto L9;
        j6(r2, (abcd.Abstractiv) r0.next(), new java.lang.Object[]{r7, r8});
        goto L7
    }

    public static void j6(android.app.Application r6) {
        j6("onApplicationCreate", r6.getPackageName());
        long r0 = DW();
        java.util.Iterator r2 = new java.util.ArrayList(Hw().gn).iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        j6(r0, (abcd.Abstractiv) r2.next(), new java.lang.Object[]{r6});
        goto L4
    }

    public static void j6(com.appfour.backbone.api.objects.Market r6) {
        j6("onInstall", "");
        java.util.Iterator r0 = new java.util.ArrayList(Hw().FH).iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        abcd.Abstractiv r1 = (abcd.Abstractiv) r0.next();
        j6(com.appfour.backbone.api.Api.getInstallTime(), r1, new java.lang.Object[]{r6});
        goto L4
    L6:
        java.util.Iterator r7 = new java.util.ArrayList(Hw().v5).iterator();
    L8:
        if (r7.hasNext() == false) goto L10;
        j6(com.appfour.backbone.api.Api.getInstallTime(), (abcd.Abstractiv) r7.next(), new java.lang.Object[0]);
        goto L8
    }

    public static void j6(com.appfour.backbone.api.objects.MarketReferrer r4, long r5, long r7) {
        java.util.Iterator r0 = new java.util.ArrayList(Hw().j6).iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        j6(r5, (abcd.Abstractiv) r0.next(), new java.lang.Object[]{r4});
        goto L4
    L6:
        java.util.Iterator r6 = new java.util.ArrayList(Hw().DW).iterator();
    L8:
        if (r6.hasNext() == false) goto L10;
        j6(r7, (abcd.Abstractiv) r6.next(), new java.lang.Object[]{r4.getMarket()});
        goto L8
    }

    public static void j6(com.appfour.backbone.api.objects.UserActionWindow r0) {
    }

    public static void j6(com.appfour.backbone.api.objects.UserInputAction r7) {
        j6("onInput", r7 + "");
        if (abcd.kv.a.j6 == false) goto L5;
        abcd.kv.a.Zo = true;
    L5:
        long r2 = DW();
        java.util.Iterator r0 = new java.util.ArrayList(Hw().U2).iterator();
    L7:
        if (r0.hasNext() == false) goto L9;
        j6(r2, (abcd.Abstractiv) r0.next(), new java.lang.Object[]{r7});
        goto L7
    }

    public static void j6(com.appfour.backbone.api.objects.UserLaunchAction r6) {
        j6("onLaunched", com.appfour.backbone.api.Api.identifier(r6) + "");
        long r0 = DW();
        java.util.Iterator r2 = new java.util.ArrayList(Hw().Ws).iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        j6(r0, (abcd.Abstractiv) r2.next(), new java.lang.Object[]{r6});
        goto L4
    }

    public static void j6(com.appfour.backbone.api.objects.UserNotification r7) {
        j6("onNotification", r7 + "");
        if (abcd.kv.a.j6 == false) goto L5;
        abcd.kv.a.gn = true;
    L5:
        long r2 = DW();
        java.util.Iterator r0 = new java.util.ArrayList(Hw().aM).iterator();
    L7:
        if (r0.hasNext() == false) goto L9;
        j6(r2, (abcd.Abstractiv) r0.next(), new java.lang.Object[]{r7});
        goto L7
    }

    public static void j6(com.appfour.backbone.api.objects.UserNotificationAction r7) {
        j6("onNotificationAction", r7 + "");
        if (abcd.kv.a.j6 == false) goto L5;
        abcd.kv.a.u7 = true;
    L5:
        long r2 = DW();
        java.util.Iterator r0 = new java.util.ArrayList(Hw().j3).iterator();
    L7:
        if (r0.hasNext() == false) goto L9;
        j6(r2, (abcd.Abstractiv) r0.next(), new java.lang.Object[]{r7});
        goto L7
    }

    public static void j6(com.appfour.backbone.api.objects.UserTouchAction r7) {
        j6("onTouch", r7 + "");
        if (abcd.kv.a.j6 == false) goto L5;
        abcd.kv.a.VH = true;
    L5:
        long r2 = DW();
        java.util.Iterator r0 = new java.util.ArrayList(Hw().Mr).iterator();
    L7:
        if (r0.hasNext() == false) goto L9;
        j6(r2, (abcd.Abstractiv) r0.next(), new java.lang.Object[]{r7});
        goto L7
    }

    public static void j6(com.appfour.backbone.api.objects.UserTouchAction r6, android.view.MenuItem r7) {
        j6("onMenuItemSelected", r6.toString());
        if (abcd.kv.a.j6 == true) goto L5;
    L8:
        long r0 = DW();
        if (Hw().yS.containsKey(java.lang.Integer.valueOf(r7.getItemId())) == false) goto L18;
        java.util.Iterator r2 = new java.util.ArrayList(Hw().yS.get(java.lang.Integer.valueOf(r7.getItemId()))).iterator();
    L12:
        if (r2.hasNext() == false) goto L26;
        abcd.Abstractiv r3 = (abcd.Abstractiv) r2.next();
        if (r3.EQ() == null) goto L12;
        if (r3.EQ().isInstance(r6.getActivity()) == false) goto L12;
        j6(r0, r3, new java.lang.Object[]{r6, r7});
        goto L12
    L26:
        return;
    L18:
        return;
    L5:
        if (abcd.kv.a.J8.containsKey(java.lang.Integer.valueOf(r7.getItemId())) == true) goto L7;
        abcd.kv.a.J8.put(java.lang.Integer.valueOf(r7.getItemId()), new java.util.HashSet());
    L7:
        abcd.kv.a.J8.get(java.lang.Integer.valueOf(r7.getItemId())).add(r6.getActivityClass());
        goto L8
    }

    public static void j6(com.appfour.backbone.api.objects.UserTouchAction r7, android.view.View r8) {
        j6("onClick", r7.toString());
        if (abcd.kv.a.j6 == true) goto L5;
    L8:
        long r0 = DW();
        if (Hw().a8.containsKey(java.lang.Integer.valueOf(r8.getId())) == false) goto L20;
        java.util.Iterator r2 = new java.util.ArrayList(Hw().a8.get(java.lang.Integer.valueOf(r8.getId()))).iterator();
    L12:
        if (r2.hasNext() == false) goto L30;
        abcd.Abstractiv r3 = (abcd.Abstractiv) r2.next();
        if (r3.EQ() == null) goto L12;
        if (r3.EQ() == null) goto L12;
        if (r3.EQ().isInstance(r7.getActivity()) == false) goto L12;
        j6(r0, r3, new java.lang.Object[]{r7.getActivity(), r8});
        goto L12
    L30:
        return;
    L20:
        return;
    L5:
        if (abcd.kv.a.tp.containsKey(java.lang.Integer.valueOf(r8.getId())) == true) goto L7;
        abcd.kv.a.tp.put(java.lang.Integer.valueOf(r8.getId()), new java.util.HashSet());
    L7:
        abcd.kv.a.tp.get(java.lang.Integer.valueOf(r8.getId())).add(r7.getActivityClass());
        goto L8
    }

    public static void j6(com.appfour.backbone.api.objects.UserTouchAction r7, android.view.View r8, java.lang.Object r9, int r10, android.view.View r11) {
        j6("onItemClick", r7.toString());
        if (abcd.kv.a.j6 == true) goto L5;
    L8:
        long r0 = DW();
        if (Hw().rN.containsKey(java.lang.Integer.valueOf(r8.getId())) == false) goto L18;
        java.util.Iterator r2 = new java.util.ArrayList(Hw().rN.get(java.lang.Integer.valueOf(r8.getId()))).iterator();
    L12:
        if (r2.hasNext() == false) goto L26;
        abcd.Abstractiv r3 = (abcd.Abstractiv) r2.next();
        if (r3.EQ() == null) goto L12;
        if (r3.EQ().isInstance(r7.getActivity()) == false) goto L12;
        j6(r0, r3, new java.lang.Object[]{r7.getActivity(), r8, r9, java.lang.Integer.valueOf(r10), r11});
        goto L12
    L26:
        return;
    L18:
        return;
    L5:
        if (abcd.kv.a.we.containsKey(java.lang.Integer.valueOf(r8.getId())) == true) goto L7;
        abcd.kv.a.we.put(java.lang.Integer.valueOf(r8.getId()), new java.util.HashSet());
    L7:
        abcd.kv.a.we.get(java.lang.Integer.valueOf(r8.getId())).add(r7.getActivityClass());
        goto L8
    }

    private static void j6(java.lang.String r1, java.lang.CharSequence r2) {
        abcd.yw.j6("Hook", r1 + " " + r2);
    }

    public static void j6(java.lang.Thread r7, java.lang.Throwable r8) {
        if (abcd.kv.a.j6 == false) goto L5;
        abcd.kv.a.FH = true;
    L5:
        long r2 = DW();
        java.util.Iterator r0 = new java.util.ArrayList(Hw().we).iterator();
    L7:
        if (r0.hasNext() == false) goto L13;
        abcd.Abstractiv r4 = (abcd.Abstractiv) r0.next();
        if (r4.FH() == null) goto L12;
        if (r4.FH().isInstance(r8) == false) goto L7;
    L12:
        j6(r2, r4, new java.lang.Object[]{r7, r8});
        goto L7
    }

    public static void j6(java.util.List<? extends abcd.Abstractiv> r1) {
        java.util.Iterator<? extends abcd.Abstractiv> r2 = r1.iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        j6(r2.next());
        goto L4
    }

    public static void j6(boolean r2) {
        DW = true;
        abcd.kv.a.j6 = r2;
        abcd.kv.a.DW = DW();
    }

    private static boolean v5() {
        if (j6.get() != null) goto L5;
    L7:
        return false;
    L5:
        if (j6.get().booleanValue() == false) goto L7;
        return true;
    }
}
