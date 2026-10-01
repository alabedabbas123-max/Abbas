package abcd;

public class dt {
    private int DW;
    private java.util.ArrayList<abcd.dt.a> FH;
    private abcd.yt j6;

    static class a {
        abcd.dt.b DW;
        java.util.ArrayList<abcd.dt.a> FH;
        java.util.ArrayList<abcd.dt.a> Hw;
        java.util.BitSet j6;
        boolean v5;

        a(int r2, int r3, abcd.dt.b r4) {
            this.j6 = new java.util.BitSet(r3);
            this.j6.set(r2);
            this.DW = r4;
            this.FH = new java.util.ArrayList();
            this.Hw = new java.util.ArrayList();
            this.v5 = false;
        }
    }

    public static final enum b extends java.lang.Enum<abcd.dt.b> {
        public static final abcd.dt.b DW = null;
        public static final abcd.dt.b FH = null;
        public static final abcd.dt.b Hw = null;
        private static final abcd.dt.b[] Zo = null;
        public static final abcd.dt.b j6 = null;
        public static final abcd.dt.b v5 = null;

        static {
            j6 = new abcd.dt.b("TOP", 0);
            DW = new abcd.dt.b("NONE", 1);
            FH = new abcd.dt.b("METHOD", 2);
            Hw = new abcd.dt.b("INTER", 3);
            v5 = new abcd.dt.b("GLOBAL", 4);
            Zo = new abcd.dt.b[]{j6, DW, FH, Hw, v5};
        }

        private b(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.dt.b valueOf(java.lang.String r1) {
            return (abcd.dt.b) java.lang.Enum.valueOf(abcd.dt.b.class, r1);
        }

        public static abcd.dt.b[] values() {
            return (abcd.dt.b[]) Zo.clone();
        }
    }

    private dt(abcd.yt r1) {
        this.j6 = r1;
        this.DW = r1.u7();
        this.FH = new java.util.ArrayList();
    }

    private abcd.Abstractvt DW(abcd.Abstractvt r3) {
        int r4 = r3.DW().Ws().nextSetBit(0);
        return this.j6.DW().get(r4).FH().get(0);
    }

    private void DW() {
        this.j6.j6(new abcd.ct(this));
        java.util.Iterator<abcd.dt.a> r0 = this.FH.iterator();
    L4:
        if (r0.hasNext() == false) goto L13;
        abcd.dt.a r1 = r0.next();
        if (r1.DW == abcd.dt.b.DW) goto L4;
        java.util.Iterator<abcd.dt.a> r2 = r1.FH.iterator();
    L9:
        if (r2.hasNext() == false) goto L4;
        abcd.dt.a r3 = r2.next();
        if (r1.DW.compareTo(r3.DW) <= 0) goto L9;
        r3.DW = r1.DW;
        goto L9
    L13:
        FH();
    }

    private void DW(abcd.dt.a r4, abcd.dt.a r5) {
        java.util.Iterator<abcd.dt.a> r0 = r5.Hw.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        abcd.dt.a r1 = r0.next();
        r1.FH.remove(r5);
        r1.FH.add(r4);
        r4.Hw.add(r1);
        goto L4
    L6:
        java.util.Iterator<abcd.dt.a> r2 = r5.FH.iterator();
    L8:
        if (r2.hasNext() == false) goto L10;
        abcd.dt.a r3 = r2.next();
        r3.Hw.remove(r5);
        r3.Hw.add(r4);
        r4.FH.add(r3);
        goto L8
    }

    private void DW(abcd.Abstractvt r8, abcd.cs r9, abcd.bs r10, int r11, abcd.Abstractms r12) {
        abcd.Tr r0 = r8.gn();
        abcd.es r2 = abcd.gs.j6(r11, r10, r9, r12);
        if (r12 != null) goto L5;
        abcd.Tr r13 = new abcd.ks(r2, r0.Zo(), r9, abcd.Ps.FH);
    L6:
        abcd.mt r14 = new abcd.mt(r13, r8.DW());
        java.util.ArrayList<abcd.Abstractvt> r15 = r8.DW().FH();
        r15.add(r15.lastIndexOf(r8), r14);
        this.j6.j6(r14);
        return;
    L5:
        r13 = new abcd.js(r2, r0.Zo(), r9, abcd.Ps.FH, r12);
        goto L6
    }

    private void FH() {
        java.util.Iterator<abcd.dt.a> r0 = this.FH.iterator();
    L4:
        if (r0.hasNext() == false) goto L15;
        abcd.dt.a r1 = r0.next();
        if (r1.v5 == false) goto L4;
        if (r1.DW != abcd.dt.b.DW) goto L4;
        int r2 = r1.j6.nextSetBit(0);
        abcd.Abstractvt r3 = this.j6.FH(r2);
        abcd.Abstractvt r4 = j6(r3);
        int r5 = ((abcd.Ds) r4.tp().get(0).J8()).Ws();
        java.util.ArrayList<abcd.bs> r6 = new java.util.ArrayList(r5);
        java.util.HashSet<abcd.Abstractvt> r7 = new java.util.HashSet();
        j6(r3, r4, r5, r6);
        r7.add(r4);
        r7.add(r3);
        java.util.Iterator<abcd.Abstractvt> r8 = this.j6.Hw(r2).iterator();
    L12:
        if (r8.hasNext() == false) goto L14;
        abcd.Abstractvt r9 = r8.next();
        j6(r9, r4, r6, r7);
        r7.add(r9);
        goto L12
    L14:
        this.j6.j6(r7);
        this.j6.J8();
        abcd.C1400ut.j6(this.j6, this.DW);
        j6();
        goto L4
    }

    private void FH(abcd.Abstractvt r5) {
        int r0 = r5.v5().Hw();
        abcd.bs r1 = r5.u7();
        if (r0 != 56) goto L8;
        if (r1.J8().j3() != 9) goto L8;
        j6(r1, Hw(r5));
        return;
    L8:
        if (r0 != 3) goto L13;
        if (r1.J8().j3() != 9) goto L13;
        abcd.dt.a r6 = new abcd.dt.a(r1.we(), this.DW, abcd.dt.b.DW);
        this.FH.add(r6);
        j6(r1, r6);
        return;
    L13:
        if (r0 == 55) goto L15;
        return;
    L15:
        if (r1.J8().j3() != 9) goto L21;
        abcd.dt.a r7 = new abcd.dt.a(r1.we(), this.DW, abcd.dt.b.DW);
        this.FH.add(r7);
        j6(r1, r7);
        return;
    }

    private abcd.dt.a Hw(abcd.Abstractvt r5) {
        abcd.bs r0 = r5.u7();
        abcd.Abstractvt r6 = j6(r5);
        int r1 = r6.v5().Hw();
        if (r1 != 5) goto L5;
    L26:
        abcd.dt.a r7 = new abcd.dt.a(r0.we(), this.DW, abcd.dt.b.DW);
    L27:
        this.FH.add(r7);
        return r7;
    L5:
        if (r1 != 38) goto L7;
    L18:
        abcd.bs r8 = r6.tp().get(0);
        int r2 = j6(r8);
        if (r2 == this.FH.size()) goto L23;
        abcd.dt.a r9 = this.FH.get(r2);
        r9.j6.set(r0.we());
        return r9;
    L23:
        if (r8.getType() != abcd.Qs.EQ) goto L25;
        r7 = new abcd.dt.a(r0.we(), this.DW, abcd.dt.b.DW);
        goto L27
    L25:
        r7 = new abcd.dt.a(r0.we(), this.DW, abcd.dt.b.v5);
        goto L27
    L7:
        if (r1 == 45) goto L18;
        if (r1 == 46) goto L17;
        switch(r1) {
            case 40: goto L26;
            case 41: goto L14;
            case 42: goto L14;
            case 43: goto L18;
            default: goto L11;
        };
    L11:
        return null;
    L14:
        if (r6.tp().get(0).J8().a8() == false) goto L16;
        r7 = new abcd.dt.a(r0.we(), this.DW, abcd.dt.b.DW);
        r7.v5 = true;
        goto L27
    L16:
        r7 = new abcd.dt.a(r0.we(), this.DW, abcd.dt.b.v5);
        goto L27
    L17:
        r7 = new abcd.dt.a(r0.we(), this.DW, abcd.dt.b.v5);
        goto L27
    }

    private int j6(abcd.bs r4) {
        int r0 = 0;
    L4:
        if (r0 >= this.FH.size()) goto L9;
        if (this.FH.get(r0).j6.get(r4.we()) == true) goto L7;
        r0 = r0 + 1;
        goto L4
    L7:
        return r0;
    L9:
        return r0;
    }

    private abcd.Abstractvt j6(abcd.Abstractvt r2) {
        java.util.ArrayList<abcd.Abstractvt> r3 = this.j6.DW().get(r2.DW().VH().nextSetBit(0)).FH();
        return r3.get(r3.size() - 1);
    }

    static abcd.yt j6(abcd.dt r0) {
        return r0.j6;
    }

    private void j6() {
        int r1 = 0;
    L4:
        if (r1 >= this.j6.u7()) goto L22;
        abcd.Abstractvt r2 = this.j6.FH(r1);
        if (r2 == null) goto L21;
        if (r2.v5() == null) goto L21;
        if (r2.v5().Hw() != 2) goto L21;
        java.util.ArrayList<abcd.Abstractvt>[] r3 = this.j6.tp();
        abcd.bs r4 = r2.tp().get(0);
        abcd.bs r5 = r2.u7();
        if (r4.we() < this.DW) goto L15;
    L17:
        abcd.at r6 = new abcd.at(this, r5, r4);
        java.util.Iterator<abcd.Abstractvt> r7 = r3[r5.we()].iterator();
    L19:
        if (r7.hasNext() == false) goto L21;
        r7.next().DW(r6);
        goto L19
    L15:
        if (r5.we() >= this.DW) goto L17;
    L21:
        r1 = r1 + 1;
        goto L4
    }

    private void j6(abcd.bs r5, abcd.dt.a r6) {
        java.util.ArrayList<abcd.bs> r0 = new java.util.ArrayList();
        r0.add(r5);
    L4:
        if (r0.isEmpty() == true) goto L12;
        abcd.bs r7 = r0.remove(r0.size() - 1);
        java.util.Iterator<abcd.Abstractvt> r1 = this.j6.Hw(r7.we()).iterator();
    L7:
        if (r1.hasNext() == false) goto L4;
        abcd.Abstractvt r2 = r1.next();
        if (r2.v5() == null) goto L10;
        j6(r7, r2, r6, r0);
        goto L7
    L10:
        j6(r2, r6, r0);
        goto L7
    }

    private void j6(abcd.bs r5, abcd.Abstractvt r6, abcd.dt.a r7, java.util.ArrayList<abcd.bs> r8) {
        int r0 = r6.v5().Hw();
        if (r0 != 2) goto L5;
        r7.j6.set(r6.u7().we());
        r8.add(r6.u7());
        return;
    L5:
        if (r0 != 33) goto L7;
    L45:
        r7.DW = abcd.dt.b.Hw;
        return;
    L7:
        if (r0 == 35) goto L45;
        if (r0 == 43) goto L43;
        if (r0 == 7) goto L43;
        if (r0 == 8) goto L43;
        if (r0 == 38) goto L40;
        if (r0 == 39) goto L22;
        switch(r0) {
            case 47: goto L25;
            case 48: goto L20;
            case 49: goto L45;
            case 50: goto L45;
            case 51: goto L45;
            case 52: goto L45;
            case 53: goto L45;
            default: goto L60;
        };
    L20:
        r7.DW = abcd.dt.b.v5;
        return;
    L60:
        return;
    L25:
        if (r6.tp().get(0).J8().j3() != 9) goto L61;
        r7.v5 = false;
        abcd.cs r9 = r6.tp();
        if (r9.get(0).we() != r5.we()) goto L34;
        int r10 = j6(r9.get(1));
        if (r10 == this.FH.size()) goto L49;
        abcd.dt.a r11 = this.FH.get(r10);
        j6(r11, r7);
        if (r7.DW.compareTo(r11.DW) >= 0) goto L50;
        r7.DW = r11.DW;
        return;
    L50:
        return;
    L49:
        return;
    L34:
        int r12 = j6(r9.get(0));
        if (r12 == this.FH.size()) goto L52;
        abcd.dt.a r13 = this.FH.get(r12);
        j6(r7, r13);
        if (r13.DW.compareTo(r7.DW) >= 0) goto L53;
        r13.DW = r7.DW;
        return;
    L53:
        return;
    L52:
        return;
    L61:
        return;
    L22:
        if (r6.tp().get(2).J8().a8() == true) goto L25;
        r7.v5 = false;
        goto L25
    L40:
        if (r6.tp().get(1).J8().a8() == true) goto L55;
        r7.v5 = false;
        return;
    L55:
        return;
    L43:
        if (r7.DW.compareTo(abcd.dt.b.FH) >= 0) goto L57;
        r7.DW = abcd.dt.b.FH;
        return;
    }

    private void j6(abcd.dt.a r2, abcd.dt.a r3) {
        if (r3.Hw.contains(r2) == true) goto L6;
        r3.Hw.add(r2);
    L6:
        if (r2.FH.contains(r3) == true) goto L9;
        r2.FH.add(r3);
        return;
    }

    static void j6(abcd.dt r0, abcd.Abstractvt r1) {
        r0.FH(r1);
    }

    private void j6(abcd.Abstractvt r14, abcd.bs r15, java.util.HashSet<abcd.Abstractvt> r16) {
        abcd.Ks r8 = new abcd.Ks(abcd.Rr.DW);
        DW(r14, abcd.cs.FH, null, 40, r8);
        abcd.tt r0 = r14.DW();
        abcd.tt r9 = r0.Hw(r0.gn());
        abcd.Abstractvt r1 = r9.FH().get(0);
        abcd.bs r11 = abcd.bs.j6(this.j6.J0(), r8);
        j6(r1, abcd.cs.FH, r11, 56, null);
        abcd.tt r10 = r9.Hw(r9.gn());
        abcd.Abstractvt r12 = r10.FH().get(0);
        abcd.Abstractms r5 = new abcd.Gs(r8, new abcd.Hs(new abcd.Js("<init>"), new abcd.Js("(I)V")));
        DW(r12, abcd.cs.j6(r11, r15), null, 52, r5);
        r16.add(r12);
        abcd.tt r13 = r10.Hw(r10.gn());
        abcd.Abstractvt r17 = r13.FH().get(0);
        DW(r17, abcd.cs.j6(r11), null, 35, null);
        r13.j6(r13.u7(), this.j6.Zo().DW());
        r16.add(r17);
    }

    private void j6(abcd.Abstractvt r8, abcd.cs r9, abcd.bs r10, int r11, abcd.Abstractms r12) {
        abcd.Tr r0 = r8.gn();
        if (r11 != 56) goto L5;
        abcd.es r13 = abcd.gs.J0(r10.getType());
    L6:
        abcd.es r2 = r13;
        if (r12 != null) goto L9;
        abcd.Tr r14 = new abcd.Zr(r2, r0.Zo(), r10, r9);
    L10:
        abcd.mt r15 = new abcd.mt(r14, r8.DW());
        java.util.ArrayList<abcd.Abstractvt> r16 = r8.DW().FH();
        r16.add(r16.lastIndexOf(r8), r15);
        this.j6.j6(r15);
        return;
    L9:
        r14 = new abcd.Yr(r2, r0.Zo(), r10, r9, r12);
        goto L10
    L5:
        r13 = abcd.gs.j6(r11, r10, r9, r12);
        goto L6
    }

    private void j6(abcd.Abstractvt r3, abcd.dt.a r4, java.util.ArrayList<abcd.bs> r5) {
        int r0 = j6(r3.u7());
        if (r0 == this.FH.size()) goto L10;
        abcd.dt.a r6 = this.FH.get(r0);
        if (r6 == r4) goto L12;
        r4.v5 = false;
        r4.j6.or(r6.j6);
        if (r4.DW.compareTo(r6.DW) >= 0) goto L9;
        r4.DW = r6.DW;
    L9:
        DW(r4, r6);
        this.FH.remove(r0);
        return;
    L12:
        return;
    L10:
        r4.j6.set(r3.u7().we());
        r5.add(r3.u7());
    }

    private void j6(abcd.Abstractvt r9, abcd.Abstractvt r10, int r11, java.util.ArrayList<abcd.bs> r12) {
        abcd.Qs r13 = r9.u7().getType();
        int r0 = 0;
    L3:
        if (r0 >= r11) goto L5;
        abcd.Abstractms r7 = abcd.Ns.j6(r13.we());
        int r2 = this.j6.J0();
        abcd.bs r5 = abcd.bs.j6(r2, (abcd.Ms) r7);
        r12.add(r5);
        j6(r9, abcd.cs.FH, r5, 5, r7);
        r0 = r0 + 1;
        goto L3
    }

    private void j6(abcd.Abstractvt r11, abcd.Abstractvt r12, java.util.ArrayList<abcd.bs> r13, java.util.HashSet<abcd.Abstractvt> r14) {
        int r0 = r13.size();
        int r1 = r11.v5().Hw();
        int r3 = 0;
        if (r1 != 34) goto L5;
        java.lang.Object r15 = r12.tp().get(0).J8();
        abcd.Abstractvt r16 = DW(r11);
        j6(r16, abcd.cs.FH, r16.u7(), 5, (abcd.Abstractms) r15);
        r14.add(r16);
        return;
    L5:
        if (r1 != 54) goto L7;
        return;
    L7:
        if (r1 != 57) goto L9;
        java.util.ArrayList<abcd.Abstractms> r17 = ((abcd.Sr) r11.gn()).EQ();
    L23:
        if (r3 >= r0) goto L33;
        abcd.bs r18 = abcd.bs.j6(r13.get(r3).we(), (abcd.Rs) r17.get(r3));
        j6(r11, abcd.cs.FH, r18, 5, r17.get(r3));
        r13.set(r3, r18);
        r3 = r3 + 1;
        goto L23
    L33:
        return;
    L9:
        if (r1 != 38) goto L11;
        abcd.Abstractvt r19 = DW(r11);
        abcd.cs r110 = r11.tp();
        int r4 = ((abcd.Ds) r110.get(1).J8()).Ws();
        if (r4 >= r0) goto L20;
        abcd.bs r111 = r13.get(r4);
        abcd.bs r5 = r111.FH(r19.u7().we());
        j6(r19, abcd.cs.j6(r111), r5, 2, null);
    L21:
        r14.add(r19);
        return;
    L20:
        j6(r19, r110.get(1), r14);
        r14.add(r19.DW().FH().get(2));
        goto L21
    L11:
        if (r1 != 39) goto L32;
        abcd.cs r112 = r11.tp();
        int r2 = ((abcd.Ds) r112.get(2).J8()).Ws();
        if (r2 >= r0) goto L16;
        abcd.bs r113 = r112.get(0);
        abcd.bs r114 = r113.FH(r13.get(r2).we());
        j6(r11, abcd.cs.j6(r113), r114, 2, null);
        r13.set(r2, r114.rN());
        return;
    L16:
        j6(r11, r112.get(2), r14);
        return;
    }

    public static void j6(abcd.yt r1) {
        new abcd.dt(r1).DW();
    }
}
