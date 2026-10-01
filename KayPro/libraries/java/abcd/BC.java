package abcd;

public class BC {
    private static int[] DW;
    private static final java.util.Comparator<abcd.hC> j6 = null;
    private boolean EQ;
    private java.util.List<abcd.hC> FH;
    private java.util.List<abcd.hC> Hw;
    private final abcd.UE VH;
    private boolean Zo;
    private int gn;
    private int tp;
    private int u7;
    private java.util.List<abcd.hC> v5;

    static {
        j6 = new abcd.AC();
    }

    public BC(abcd.UE r2) {
        this.gn = 60;
        this.u7 = -1;
        this.VH = r2;
        this.tp = ((abcd.gC) r2.Zo().j6(abcd.gC.j6)).j6();
        v5();
    }

    private static abcd.hC DW(abcd.hC r2, abcd.hC r3) {
        return abcd.hC.j6(abcd.hC.a.Hw, r2, r3, 100);
    }

    private static abcd.AbstractrE DW(abcd.hC r2) {
        if (r2.VH != abcd.hC.a.FH) goto L6;
        return r2.v5;
    L6:
        return r2.Zo;
    }

    private void DW(abcd.LE r15) {
        r15.j6(org.eclipse.jgit.JGitText.j6().renamesFindingExact, ((this.v5.size() + this.v5.size()) + this.Hw.size()) + (this.v5.size() * this.Hw.size()));
        java.util.HashMap<abcd.WD, java.lang.Object> r0 = j6(this.Hw, r15);
        java.util.HashMap<abcd.WD, java.lang.Object> r1 = j6(this.v5, r15);
        java.util.ArrayList r2 = new java.util.ArrayList(this.v5.size());
        java.util.ArrayList r3 = new java.util.ArrayList();
        java.util.Iterator<java.lang.Object> r4 = r1.values().iterator();
    L4:
        if (r4.hasNext() == false) goto L5;
        java.lang.Object r5 = r4.next();
        if ((r5 instanceof abcd.hC) == true) goto L80;
        r3.add((java.util.List) r5);
        goto L4
    L80:
        r2.add((abcd.hC) r5);
        goto L4
    L5:
        java.util.ArrayList r6 = new java.util.ArrayList(this.v5.size());
        java.util.Iterator r7 = r2.iterator();
    L7:
        if (r7.hasNext() == false) goto L8;
        abcd.hC r8 = (abcd.hC) r7.next();
        java.lang.Object r9 = r0.get(r8.tp);
        if ((r9 instanceof abcd.hC) == false) goto L71;
        abcd.hC r10 = (abcd.hC) r9;
        if (j6(r10.v5, r8.Zo) == false) goto L70;
        r10.VH = abcd.hC.a.Hw;
        this.FH.add(DW(r10, r8));
    L77:
        r15.update(1);
        goto L7
    L70:
        r6.add(r8);
        goto L77
    L71:
        if (r9 == null) goto L76;
        abcd.hC r11 = j6(r8, (java.util.List) r9);
        if (r11 == null) goto L75;
        r11.VH = abcd.hC.a.Hw;
        this.FH.add(DW(r11, r8));
        goto L77
    L75:
        r6.add(r8);
        goto L77
    L76:
        r6.add(r8);
        goto L77
    L8:
        java.util.Iterator r12 = r3.iterator();
    L10:
        if (r12.hasNext() == false) goto L11;
        java.util.List r13 = (java.util.List) r12.next();
        java.lang.Object r14 = r0.get(((abcd.hC) r13.get(0)).tp);
        if ((r14 instanceof abcd.hC) == true) goto L30;
        if (r14 != null) goto L44;
        r6.addAll(r13);
        goto L10
    L44:
        java.util.List r16 = (java.util.List) r14;
        long[] r17 = new long[r16.size() * r13.size()];
        int r18 = 0;
        int r19 = 0;
    L46:
        if (r18 >= r16.size()) goto L47;
        java.lang.String r110 = ((abcd.hC) r16.get(r18)).FH;
        int r111 = r19;
        int r20 = 0;
    L61:
        if (r20 >= r13.size()) goto L62;
        r17[r111] = abcd.FC.j6(abcd.FC.j6(((abcd.hC) r13.get(r20)).Hw, r110), r18, r20);
        r111 = r111 + 1;
        r20 = r20 + 1;
        goto L61
    L62:
        r18 = r18 + 1;
        r19 = r111;
        goto L46
    L47:
        java.util.Arrays.sort(r17);
    L48:
        r19 = r19 - 1;
        if (r19 < 0) goto L10;
        long r112 = r17[r19];
        int r21 = abcd.FC.DW(r112);
        int r22 = abcd.FC.j6(r112);
        abcd.hC r23 = (abcd.hC) r16.get(r21);
        abcd.hC r113 = (abcd.hC) r13.get(r22);
        if (r113 == null) goto L53;
        if (r23.VH != abcd.hC.a.FH) goto L57;
        abcd.hC.a r114 = abcd.hC.a.Hw;
        r23.VH = r114;
    L58:
        this.FH.add(abcd.hC.j6(r114, r23, r113, 100));
        r13.set(r22, null);
        r15.update(1);
        goto L48
    L57:
        r114 = abcd.hC.a.v5;
        goto L58
    L53:
        r15.update(1);
        goto L48
    L30:
        abcd.hC r24 = (abcd.hC) r14;
        abcd.hC r25 = j6(r24, r13);
        if (r25 != null) goto L32;
        r6.addAll(r13);
        goto L10
    L32:
        r24.VH = abcd.hC.a.Hw;
        this.FH.add(DW(r24, r25));
        java.util.Iterator r26 = r13.iterator();
    L34:
        if (r26.hasNext() == false) goto L10;
        abcd.hC r27 = (abcd.hC) r26.next();
        if (r27 == r25) goto L34;
        if (j6(r24.v5, r27.Zo) == true) goto L40;
        r6.add(r27);
        goto L34
    L40:
        this.FH.add(j6(r24, r27));
        goto L34
    L11:
        this.v5 = r6;
        this.Hw = new java.util.ArrayList(r0.size());
        java.util.Iterator<java.lang.Object> r28 = r0.values().iterator();
    L13:
        if (r28.hasNext() == false) goto L14;
        java.lang.Object r29 = r28.next();
        if ((r29 instanceof abcd.hC) == true) goto L18;
        java.util.Iterator r30 = ((java.util.List) r29).iterator();
    L23:
        if (r30.hasNext() == false) goto L13;
        abcd.hC r31 = (abcd.hC) r30.next();
        if (r31.VH != abcd.hC.a.FH) goto L23;
        this.Hw.add(r31);
        goto L23
    L18:
        abcd.hC r32 = (abcd.hC) r29;
        if (r32.VH != abcd.hC.a.FH) goto L13;
        this.Hw.add(r32);
        goto L13
    L14:
        r15.j6();
    }

    private void DW(abcd.AbstractcC.c r8, abcd.LE r9) {
        java.util.ArrayList r0 = new java.util.ArrayList(this.FH.size());
        r9.j6(org.eclipse.jgit.JGitText.j6().renamesBreakingModifies, this.FH.size());
        int r2 = 0;
    L4:
        if (r2 >= this.FH.size()) goto L5;
        abcd.hC r3 = this.FH.get(r2);
        if (r3.DW() != abcd.hC.a.DW) goto L13;
        int r4 = j6(r8, r3);
        if (r4 >= this.u7) goto L12;
        java.util.List<abcd.hC> r5 = abcd.hC.j6(r3);
        abcd.hC r6 = r5.get(0);
        r6.gn = r4;
        this.Hw.add(r6);
        this.v5.add(r5.get(1));
    L14:
        r9.update(1);
        r2 = r2 + 1;
        goto L4
    L12:
        r0.add(r3);
        goto L14
    L13:
        r0.add(r3);
        goto L14
    L5:
        this.FH = r0;
    }

    private static java.lang.String FH(abcd.hC r2) {
        if (r2.VH != abcd.hC.a.FH) goto L6;
        return r2.FH;
    L6:
        return r2.Hw;
    }

    private void FH(abcd.LE r10) {
        java.util.HashMap r0 = new java.util.HashMap();
        java.util.ArrayList r1 = new java.util.ArrayList(this.v5.size());
        r10.j6(org.eclipse.jgit.JGitText.j6().renamesRejoiningModifies, this.v5.size() + this.Hw.size());
        java.util.Iterator<abcd.hC> r2 = this.Hw.iterator();
    L4:
        if (r2.hasNext() == false) goto L5;
        abcd.hC r3 = r2.next();
        r0.put(r3.FH, r3);
        r10.update(1);
        goto L4
    L5:
        java.util.Iterator<abcd.hC> r4 = this.v5.iterator();
    L7:
        if (r4.hasNext() == false) goto L8;
        abcd.hC r5 = r4.next();
        abcd.hC r6 = (abcd.hC) r0.remove(r5.Hw);
        if (r6 != null) goto L13;
        r1.add(r5);
    L17:
        r10.update(1);
        goto L7
    L13:
        if (j6(r6.v5, r5.Zo) == false) goto L15;
        this.FH.add(abcd.hC.j6(abcd.hC.a.DW, r6, r5, r6.gn));
        goto L17
    L15:
        r0.put(r6.FH, r6);
        r1.add(r5);
        goto L17
    L8:
        this.v5 = r1;
        this.Hw = new java.util.ArrayList(r0.values());
    }

    private void FH(abcd.AbstractcC.c r4, abcd.LE r5) {
        int r0 = java.lang.Math.max(this.v5.size(), this.Hw.size());
        if (FH() != 0) goto L5;
    L8:
        abcd.FC r1 = new abcd.FC(r4, this.Hw, this.v5);
        r1.j6(Hw());
        r1.j6(r5);
        this.EQ |= r1.Hw();
        this.Hw = r1.DW();
        this.v5 = r1.j6();
        this.FH.addAll(r1.FH());
        return;
    L5:
        if (r0 <= FH()) goto L8;
        this.EQ = true;
    }

    private int j6(abcd.AbstractcC.c r4, abcd.hC r5) {
        abcd.EC r0 = new abcd.EC();     // Catch: abcd.EC.a -> L4
        r0.j6(r4.j6(abcd.hC.b.j6, r5));     // Catch: abcd.EC.a -> L4
        r0.j6();     // Catch: abcd.EC.a -> L4
        abcd.EC r1 = new abcd.EC();     // Catch: abcd.EC.a -> L4
        r1.j6(r4.j6(abcd.hC.b.DW, r5));     // Catch: abcd.EC.a -> L4
        r1.j6();     // Catch: abcd.EC.a -> L4
        return r0.j6(r1, 100);
    L4:
        this.EQ = true;
        return this.u7 + 1;
    }

    private static abcd.WD j6(abcd.hC r2) {
        if (r2.VH != abcd.hC.a.FH) goto L6;
        return r2.u7;
    L6:
        return r2.tp;
    }

    private static abcd.hC j6(abcd.hC r2, abcd.hC r3) {
        return abcd.hC.j6(abcd.hC.a.v5, r2, r3, 100);
    }

    private static abcd.hC j6(abcd.hC r5, java.util.List<abcd.hC> r6) {
        java.util.Iterator<abcd.hC> r7 = r6.iterator();
        abcd.hC r0 = null;
        int r1 = -1;
    L4:
        if (r7.hasNext() == false) goto L5;
        abcd.hC r2 = r7.next();
        if (j6(DW(r2), DW(r5)) == false) goto L4;
        int r3 = abcd.FC.j6(FH(r2), FH(r5));
        if (r3 <= r1) goto L4;
        r0 = r2;
        r1 = r3;
        goto L4
    L5:
        return r0;
    }

    private java.util.HashMap<abcd.WD, java.lang.Object> j6(java.util.List<abcd.hC> r6, abcd.LE r7) {
        java.util.HashMap<abcd.WD, java.lang.Object> r0 = new java.util.HashMap();
        java.util.Iterator<abcd.hC> r8 = r6.iterator();
    L4:
        if (r8.hasNext() == false) goto L5;
        abcd.hC r1 = r8.next();
        java.lang.Object r2 = r0.put(j6(r1), r1);
        if ((r2 instanceof abcd.hC) == false) goto L9;
        java.util.ArrayList r3 = new java.util.ArrayList(2);
        r3.add((abcd.hC) r2);
        r3.add(r1);
        r0.put(j6(r1), r3);
    L11:
        r7.update(1);
        goto L4
    L9:
        if (r2 == null) goto L11;
        ((java.util.List) r2).add(r1);
        r0.put(j6(r1), r2);
        goto L11
    L5:
        return r0;
    }

    static boolean j6(abcd.AbstractrE r1, abcd.AbstractrE r2) {
        if ((r1.DW() & 61440) != (r2.DW() & 61440)) goto L6;
        return true;
    L6:
        return false;
    }

    static int[] j6() {
        int[] r0 = DW;
        if (r0 == null) goto L5;
        return r0;
    L5:
        int[] r1 = new int[abcd.hC.a.values().length];
        r1[abcd.hC.a.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L13
    L18:
        r1[abcd.hC.a.v5.ordinal()] = 5;     // Catch: java.lang.NoSuchFieldError -> L14
    L24:
        r1[abcd.hC.a.FH.ordinal()] = 3;     // Catch: java.lang.NoSuchFieldError -> L15
    L26:
        r1[abcd.hC.a.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L16
    L20:
        r1[abcd.hC.a.Hw.ordinal()] = 4;     // Catch: java.lang.NoSuchFieldError -> L17
    L11:
        DW = r1;
        return r1;
    }

    public java.util.List<abcd.hC> DW() {
        return j6(abcd.vE.j6);
    }

    public int FH() {
        return this.tp;
    }

    public int Hw() {
        return this.gn;
    }

    public java.util.List<abcd.hC> j6(abcd.IE r2, abcd.LE r3) {
        abcd.AbstractcC r4 = abcd.AbstractcC.j6(r2);
        return j6(new abcd.AbstractcC.c(r4, r4), r3);
    }

    public java.util.List<abcd.hC> j6(abcd.LE r2) {
        if (this.Zo == true) goto L12;
        abcd.IE r0 = this.VH.j3();
        java.util.List<abcd.hC> r3 = j6(r0, r2);     // Catch: java.lang.Throwable -> L8
        r0.FH();
        return r3;
    L8:
        th = move-exception;
        r0.FH();
        throw th;
    L12:
        return java.util.Collections.unmodifiableList(this.FH);
    }

    public java.util.List<abcd.hC> j6(abcd.AbstractcC.c r2, abcd.LE r3) {
        if (this.Zo == true) goto L29;
        this.Zo = true;
        if (r3 != null) goto L8;
        r3 = abcd.vE.j6;
    L8:
        if (this.u7 <= 0) goto L11;
        DW(r2, r3);
    L11:
        if (this.v5.isEmpty() == true) goto L16;
        if (this.Hw.isEmpty() == true) goto L16;
        DW(r3);
    L16:
        if (this.v5.isEmpty() == true) goto L21;
        if (this.Hw.isEmpty() == true) goto L21;
        FH(r2, r3);
    L21:
        if (this.u7 > 0) goto L23;
    L27:
        this.FH.addAll(this.v5);
        this.v5 = null;
        this.FH.addAll(this.Hw);
        this.Hw = null;
        java.util.Collections.sort(this.FH, j6);
        goto L29
    L23:
        if (this.v5.isEmpty() == true) goto L27;
        if (this.Hw.isEmpty() == true) goto L27;
        FH(r3);
    L29:
        return java.util.Collections.unmodifiableList(this.FH);
    }

    public void j6(java.util.Collection<abcd.hC> r5) {
        if (this.Zo == true) goto L22;
        java.util.Iterator<abcd.hC> r6 = r5.iterator();
    L6:
        if (r6.hasNext() == false) goto L7;
        abcd.hC r0 = r6.next();
        int r1 = j6()[r0.DW().ordinal()];
        if (r1 != 1) goto L11;
        this.v5.add(r0);
        goto L6
    L11:
        if (r1 != 2) goto L13;
        if (j6(r0.VH(), r0.Hw()) == true) goto L18;
        java.util.List<abcd.hC> r2 = abcd.hC.j6(r0);
        this.Hw.add(r2.get(0));
        this.v5.add(r2.get(1));
        goto L6
    L18:
        this.FH.add(r0);
        goto L6
    L13:
        if (r1 != 3) goto L14;
        this.Hw.add(r0);
        goto L6
    L14:
        this.FH.add(r0);
        goto L6
    L7:
        return;
    L22:
        throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().renamesAlreadyFound);
    }

    public void v5() {
        this.FH = new java.util.ArrayList();
        this.Hw = new java.util.ArrayList();
        this.v5 = new java.util.ArrayList();
        this.Zo = false;
    }
}
