package abcd;

public class Ws {
    private static boolean DW;
    private static boolean j6;
    private final abcd.yt FH;

    private Ws(abcd.yt r1) {
        this.FH = r1;
    }

    private void DW() {
        int r1 = 0;
        java.util.ArrayList<abcd.Ms> r2 = null;
        int r3 = 0;
        abcd.tt r4 = null;
        java.util.HashMap<abcd.Ms, abcd.bs> r5 = null;
        int r6 = 0;
        abcd.Ms r7 = null;
        abcd.bs r14 = null;
        abcd.es r9 = null;
        abcd.tt r8 = null;
        abcd.tt r15 = null;
        abcd.tt r13 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = this.FH.u7();
                    r2 = j6();
                    r3 = java.lang.Math.min(r2.size(), 5);
                    r4 = this.FH.Hw();
                    r5 = new java.util.HashMap(r3);
                    r6 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r6 >= r3) { $pc0 = 9; continue $sw0; }
                    r7 = r2.get(r6);
                    r14 = abcd.bs.j6(this.FH.J0(), r7);
                    r9 = abcd.gs.v5(r7);
                    if (r9.DW() != 1) { $pc0 = 7; continue $sw0; }
                    r4.j6(new abcd.Yr(abcd.gs.v5(r7), abcd.hs.j6, r14, abcd.cs.FH, r7));
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    r5.put(r7, r14);
                    r6 = r6 + 1;
                    r3 = r3;
                    r2 = r2;
                    { $pc0 = 3; continue $sw0; }
                }
                case 7: {
                    r8 = this.FH.Hw();
                    r15 = r8.gn();
                    r13 = r8.Hw(r15);
                    r13.DW(new abcd.js(r9, abcd.hs.j6, abcd.cs.FH, abcd.Ps.FH, r7));
                    r13.Hw(r15).j6(new abcd.Zr(abcd.gs.J0(r14.J8()), abcd.hs.j6, r14, abcd.cs.FH));
                    { $pc0 = 8; continue $sw0; }
                }
                case 9: {
                    j6(r5, r1);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static abcd.yt j6(abcd.Ws r0) {
        return r0.FH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private java.util.ArrayList<abcd.Ms> j6() {
        int r0 = 0;
        java.util.HashMap r1 = null;
        java.util.HashSet r2 = null;
        int r4 = 0;
        abcd.Abstractvt r6 = null;
        abcd.bs r7 = null;
        abcd.Rs r8 = null;
        abcd.Ms r9 = null;
        int r10 = 0;
        java.util.ArrayList<abcd.Abstractvt> r11 = null;
        java.lang.Integer r12 = null;
        java.util.ArrayList<abcd.Ms> r3 = null;
        java.util.Iterator r5 = null;
        java.util.Map.Entry r13 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.FH.u7();
                    r1 = new java.util.HashMap();
                    r2 = new java.util.HashSet();
                    r4 = 0;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r4 >= r0) { $pc1 = 40; continue $sw1; }
                    r6 = this.FH.FH(r4);
                    if (r6 == null) { $pc1 = 39; continue $sw1; }
                    if (r6.v5() == null) { $pc1 = 39; continue $sw1; }
                    r7 = r6.u7();
                    r8 = r7.J8();
                    if (r8.a8() == false) { $pc1 = 39; continue $sw1; }
                    r9 = (abcd.Ms) r8;
                    if (r6.v5().Hw() != 56) { $pc1 = 17; continue $sw1; }
                    r10 = r6.DW().VH().nextSetBit(0);
                    r11 = this.FH.DW().get(r10).FH();
                    r6 = r11.get(r11.size() - 1);
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    if (r6.j6() == false) { $pc1 = 27; continue $sw1; }
                    if ((r9 instanceof abcd.Js) == false) { $pc1 = 39; continue $sw1; }
                    if (j6 == false) { $pc1 = 39; continue $sw1; }
                    if (r6.DW().Ws().cardinality() > 1) { $pc1 = 39; continue $sw1; }
                    $pc1 = 27; continue $sw1;
                }
                case 27: {
                    if (this.FH.j6(r7) == true) { $pc1 = 29; continue $sw1; }
                    $pc1 = 35; continue $sw1;
                }
                case 35: {
                    r12 = (java.lang.Integer) r1.get(r9);
                    if (r12 != null) { $pc1 = 38; continue $sw1; }
                    r1.put(r9, 1);
                    { $pc1 = 39; continue $sw1; }
                }
                case 38: {
                    r1.put(r9, java.lang.Integer.valueOf(r12.intValue() + 1));
                    { $pc1 = 39; continue $sw1; }
                }
                case 29: {
                    if (DW == false) { $pc1 = 39; continue $sw1; }
                    if (r2.contains(r9) == true) { $pc1 = 39; continue $sw1; }
                    r2.add(r9);
                    $pc1 = 39; continue $sw1;
                }
                case 39: {
                    r4 = r4 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 40: {
                    r3 = new java.util.ArrayList();
                    r5 = r1.entrySet().iterator();
                    $pc1 = 42; continue $sw1;
                }
                case 42: {
                    if (r5.hasNext() == false) { $pc1 = 46; continue $sw1; }
                    r13 = (java.util.Map.Entry) r5.next();
                    if (((java.lang.Integer) r13.getValue()).intValue() <= 1) { $pc1 = 42; continue $sw1; }
                    r3.add(r13.getKey());
                    { $pc1 = 42; continue $sw1; }
                }
                case 46: {
                    java.util.Collections.sort(r3, new abcd.Us(this, r1));
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.bs r7, abcd.bs r8) {
        java.util.Iterator<abcd.Abstractvt> r9 = null;
        abcd.Abstractvt r0 = null;
        abcd.bs r1 = null;
        abcd.Vr r2 = null;
        abcd.Abstractvt r3 = null;
        java.util.ArrayList<abcd.Abstractvt> r4 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r9 = this.FH.Hw(r7.we()).iterator();
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r9.hasNext() == false) { $pc2 = 12; continue $sw2; }
                    r0 = r9.next();
                    r1 = r0.FH();
                    if (r1 == null) { $pc2 = 4; continue $sw2; }
                    if (r0.u7() == null) { $pc2 = 4; continue $sw2; }
                    r2 = r1.Zo();
                    r0.j6(null);
                    r8 = r8.j6(r2);
                    r3 = abcd.Abstractvt.j6(new abcd.Zr(abcd.gs.gn(r8), abcd.hs.j6, null, abcd.cs.j6(r8)), r0.DW());
                    r4 = r0.DW().FH();
                    r4.add(r4.indexOf(r0) + 1, r3);
                    { $pc2 = 4; continue $sw2; }
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(abcd.yt r1) {
        new abcd.Ws(r1).DW();
    }

    private void j6(java.util.HashMap<abcd.Ms, abcd.bs> r9, int r10) {
        java.util.HashSet r0 = null;
        java.util.ArrayList<abcd.Abstractvt>[] r1 = null;
        int r2 = 0;
        abcd.Abstractvt r3 = null;
        abcd.bs r4 = null;
        abcd.Rs r5 = null;
        abcd.Ms r6 = null;
        abcd.bs r7 = null;
        abcd.Vs r8 = null;
        java.util.Iterator<abcd.Abstractvt> r11 = null;
        abcd.Abstractvt r12 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new java.util.HashSet();
                    r1 = this.FH.tp();
                    r2 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r2 >= r10) { $pc3 = 32; continue $sw3; }
                    r3 = this.FH.FH(r2);
                    if (r3 == null) { $pc3 = 31; continue $sw3; }
                    r4 = r3.u7();
                    r5 = r3.u7().J8();
                    if (r5.a8() == false) { $pc3 = 31; continue $sw3; }
                    r6 = (abcd.Ms) r5;
                    r7 = r9.get(r6);
                    if (r7 == null) { $pc3 = 31; continue $sw3; }
                    if (this.FH.j6(r4) == true) { $pc3 = 16; continue $sw3; }
                    $pc3 = 22; continue $sw3;
                }
                case 22: {
                    r8 = new abcd.Vs(this, r4, r7);
                    r11 = r1[r4.we()].iterator();
                    $pc3 = 24; continue $sw3;
                }
                case 24: {
                    if (r11.hasNext() == false) { $pc3 = 31; continue $sw3; }
                    r12 = r11.next();
                    if (r12.j6() == false) { $pc3 = 30; continue $sw3; }
                    if (r12.DW().Ws().cardinality() > 1) { $pc3 = 24; continue $sw3; }
                    $pc3 = 30; continue $sw3;
                }
                case 30: {
                    r12.DW(r8);
                    { $pc3 = 24; continue $sw3; }
                }
                case 16: {
                    if (DW == false) { $pc3 = 31; continue $sw3; }
                    if (r0.contains(r6) == true) { $pc3 = 31; continue $sw3; }
                    r0.add(r6);
                    j6(r4, r9.get(r6));
                    $pc3 = 31; continue $sw3;
                }
                case 31: {
                    r2 = r2 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 32: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
