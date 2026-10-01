package abcd;

public class Ws {
    private static boolean DW;
    private static boolean j6;
    private final abcd.yt FH;

    private Ws(abcd.yt r1) {
        this.FH = r1;
    }

    private void DW() {
        int r1 = this.FH.u7();
        java.util.ArrayList<abcd.Ms> r2 = j6();
        int r3 = java.lang.Math.min(r2.size(), 5);
        abcd.tt r4 = this.FH.Hw();
        java.util.HashMap<abcd.Ms, abcd.bs> r5 = new java.util.HashMap(r3);
        int r6 = 0;
    L3:
        if (r6 >= r3) goto L9;
        abcd.Ms r7 = r2.get(r6);
        abcd.bs r14 = abcd.bs.j6(this.FH.J0(), r7);
        abcd.es r9 = abcd.gs.v5(r7);
        if (r9.DW() != 1) goto L7;
        r4.j6(new abcd.Yr(abcd.gs.v5(r7), abcd.hs.j6, r14, abcd.cs.FH, r7));
    L8:
        r5.put(r7, r14);
        r6 = r6 + 1;
        r3 = r3;
        r2 = r2;
        goto L3
    L7:
        abcd.tt r8 = this.FH.Hw();
        abcd.tt r15 = r8.gn();
        abcd.tt r13 = r8.Hw(r15);
        r13.DW(new abcd.js(r9, abcd.hs.j6, abcd.cs.FH, abcd.Ps.FH, r7));
        r13.Hw(r15).j6(new abcd.Zr(abcd.gs.J0(r14.J8()), abcd.hs.j6, r14, abcd.cs.FH));
        goto L8
    L9:
        j6(r5, r1);
    }

    static abcd.yt j6(abcd.Ws r0) {
        return r0.FH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private java.util.ArrayList<abcd.Ms> j6() {
        int r0 = this.FH.u7();
        java.util.HashMap r1 = new java.util.HashMap();
        java.util.HashSet r2 = new java.util.HashSet();
        int r4 = 0;
    L4:
        if (r4 >= r0) goto L40;
        abcd.Abstractvt r6 = this.FH.FH(r4);
        if (r6 == null) goto L39;
        if (r6.v5() == null) goto L39;
        abcd.bs r7 = r6.u7();
        abcd.Rs r8 = r7.J8();
        if (r8.a8() == false) goto L39;
        abcd.Ms r9 = (abcd.Ms) r8;
        if (r6.v5().Hw() != 56) goto L17;
        int r10 = r6.DW().VH().nextSetBit(0);
        java.util.ArrayList<abcd.Abstractvt> r11 = this.FH.DW().get(r10).FH();
        r6 = r11.get(r11.size() - 1);
    L17:
        if (r6.j6() == false) goto L27;
        if ((r9 instanceof abcd.Js) == false) goto L39;
        if (j6 == false) goto L39;
        if (r6.DW().Ws().cardinality() > 1) goto L39;
    L27:
        if (this.FH.j6(r7) == true) goto L29;
    L35:
        java.lang.Integer r12 = (java.lang.Integer) r1.get(r9);
        if (r12 != null) goto L38;
        r1.put(r9, 1);
        goto L39
    L38:
        r1.put(r9, java.lang.Integer.valueOf(r12.intValue() + 1));
        goto L39
    L29:
        if (DW == false) goto L39;
        if (r2.contains(r9) == true) goto L39;
        r2.add(r9);
    L39:
        r4 = r4 + 1;
        goto L4
    L40:
        java.util.ArrayList<abcd.Ms> r3 = new java.util.ArrayList();
        java.util.Iterator r5 = r1.entrySet().iterator();
    L42:
        if (r5.hasNext() == false) goto L46;
        java.util.Map.Entry r13 = (java.util.Map.Entry) r5.next();
        if (((java.lang.Integer) r13.getValue()).intValue() <= 1) goto L42;
        r3.add(r13.getKey());
        goto L42
    L46:
        java.util.Collections.sort(r3, new abcd.Us(this, r1));
        return r3;
    }

    private void j6(abcd.bs r7, abcd.bs r8) {
        java.util.Iterator<abcd.Abstractvt> r9 = this.FH.Hw(r7.we()).iterator();
    L4:
        if (r9.hasNext() == false) goto L12;
        abcd.Abstractvt r0 = r9.next();
        abcd.bs r1 = r0.FH();
        if (r1 == null) goto L4;
        if (r0.u7() == null) goto L4;
        abcd.Vr r2 = r1.Zo();
        r0.j6(null);
        r8 = r8.j6(r2);
        abcd.Abstractvt r3 = abcd.Abstractvt.j6(new abcd.Zr(abcd.gs.gn(r8), abcd.hs.j6, null, abcd.cs.j6(r8)), r0.DW());
        java.util.ArrayList<abcd.Abstractvt> r4 = r0.DW().FH();
        r4.add(r4.indexOf(r0) + 1, r3);
        goto L4
    }

    public static void j6(abcd.yt r1) {
        new abcd.Ws(r1).DW();
    }

    private void j6(java.util.HashMap<abcd.Ms, abcd.bs> r9, int r10) {
        java.util.HashSet r0 = new java.util.HashSet();
        java.util.ArrayList<abcd.Abstractvt>[] r1 = this.FH.tp();
        int r2 = 0;
    L3:
        if (r2 >= r10) goto L32;
        abcd.Abstractvt r3 = this.FH.FH(r2);
        if (r3 == null) goto L31;
        abcd.bs r4 = r3.u7();
        abcd.Rs r5 = r3.u7().J8();
        if (r5.a8() == false) goto L31;
        abcd.Ms r6 = (abcd.Ms) r5;
        abcd.bs r7 = r9.get(r6);
        if (r7 == null) goto L31;
        if (this.FH.j6(r4) == true) goto L16;
    L22:
        abcd.Vs r8 = new abcd.Vs(this, r4, r7);
        java.util.Iterator<abcd.Abstractvt> r11 = r1[r4.we()].iterator();
    L24:
        if (r11.hasNext() == false) goto L31;
        abcd.Abstractvt r12 = r11.next();
        if (r12.j6() == false) goto L30;
        if (r12.DW().Ws().cardinality() > 1) goto L24;
    L30:
        r12.DW(r8);
        goto L24
    L16:
        if (DW == false) goto L31;
        if (r0.contains(r6) == true) goto L31;
        r0.add(r6);
        j6(r4, r9.get(r6));
    L31:
        r2 = r2 + 1;
        goto L3
    }
}
