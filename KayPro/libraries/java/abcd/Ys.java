package abcd;

public class Ys {
    private static boolean j6;
    private final abcd.yt DW;
    private final java.util.ArrayList<abcd.tt> FH;
    private final abcd.Ys.a[] Hw;

    public static class a {
        public int DW;
        public abcd.Interfacebu j6;

        public a() {
            this.DW = -1;
        }
    }

    public Ys(abcd.yt r4) {
        int r5 = 0;
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.DW = r4;
                    this.FH = r4.DW();
                    r5 = this.FH.size();
                    this.Hw = new abcd.Ys.a[r5];
                    r0 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r0 >= r5) { $pc0 = 5; continue $sw0; }
                    this.Hw[r0] = new abcd.Ys.a();
                    r0 = r0 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW() {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.FH.size();
                    r1 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r1 >= r0) { $pc1 = 9; continue $sw1; }
                    r2 = this.Hw[r1].DW;
                    if (r2 == (-1)) { $pc1 = 8; continue $sw1; }
                    this.FH.get(r2).DW(this.FH.get(r1));
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    r1 = r1 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH() {
        int r0 = 0;
        int r2 = 0;
        abcd.tt r3 = null;
        abcd.Ys.a r4 = null;
        java.util.BitSet r5 = null;
        int r6 = 0;
        int r7 = 0;
        abcd.Ys.a r8 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.FH.size();
                    r2 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r2 >= r0) { $pc2 = 20; continue $sw2; }
                    r3 = this.FH.get(r2);
                    r4 = this.Hw[r2];
                    r5 = r3.VH();
                    if (r5.cardinality() <= 1) { $pc2 = 19; continue $sw2; }
                    r6 = r5.nextSetBit(0);
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r6 < 0) { $pc2 = 19; continue $sw2; }
                    r7 = r6;
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    if (r7 == r4.DW) { $pc2 = 18; continue $sw2; }
                    if (r7 == (-1)) { $pc2 = 18; continue $sw2; }
                    r8 = this.Hw[r7];
                    if (r8.j6.j6(r2) == true) { $pc2 = 18; continue $sw2; }
                    r8.j6.add(r2);
                    r7 = r8.DW;
                    $pc2 = 18; continue $sw2;
                }
                case 18: {
                    r6 = r5.nextSetBit(r6 + 1);
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    r2 = r2 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Hw() {
        int r0 = 0;
        int r2 = 0;
        abcd.tt r3 = null;
        java.lang.StringBuffer r4 = null;
        java.util.Iterator<abcd.tt> r5 = null;
        boolean r6 = false;
        abcd.tt r7 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.FH.size();
                    r2 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r2 >= r0) { $pc3 = 12; continue $sw3; }
                    r3 = this.FH.get(r2);
                    r4 = new java.lang.StringBuffer();
                    r4.append('{');
                    r5 = r3.j6().iterator();
                    r6 = false;
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    if (r5.hasNext() == false) { $pc3 = 11; continue $sw3; }
                    r7 = r5.next();
                    if (r6 == false) { $pc3 = 10; continue $sw3; }
                    r4.append(',');
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    r4.append(r7);
                    r6 = true;
                    { $pc3 = 6; continue $sw3; }
                }
                case 11: {
                    r4.append('}');
                    java.lang.System.out.println("domChildren[" + r3 + "]: " + r4);
                    r2 = r2 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Ys.a[] j6() {
        int r0 = 0;
        int r3 = 0;
        int r1 = 0;
        abcd.tt r4 = null;
        int r2 = 0;
        abcd.Ys.a r5 = null;
        int r6 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.FH.size();
                    r3 = 0;
                    if (j6 == false) { $pc4 = 7; continue $sw4; }
                    r1 = 0;
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    if (r1 >= r0) { $pc4 = 7; continue $sw4; }
                    r4 = this.FH.get(r1);
                    java.lang.System.out.println("pred[" + r1 + "]: " + r4.VH());
                    r1 = r1 + 1;
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    abcd._s.j6(this.DW, this.Hw, false);
                    if (j6 == false) { $pc4 = 12; continue $sw4; }
                    r2 = 0;
                    $pc4 = 10; continue $sw4;
                }
                case 10: {
                    if (r2 >= r0) { $pc4 = 12; continue $sw4; }
                    r5 = this.Hw[r2];
                    java.lang.System.out.println("idom[" + r2 + "]: " + r5.DW);
                    r2 = r2 + 1;
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    DW();
                    if (j6 == false) { $pc4 = 15; continue $sw4; }
                    Hw();
                    $pc4 = 15; continue $sw4;
                }
                case 15: {
                    r6 = 0;
                    $pc4 = 16; continue $sw4;
                }
                case 16: {
                    if (r6 >= r0) { $pc4 = 18; continue $sw4; }
                    this.Hw[r6].j6 = abcd.st.j6(r0);
                    r6 = r6 + 1;
                    { $pc4 = 16; continue $sw4; }
                }
                case 18: {
                    FH();
                    if (j6 == false) { $pc4 = 23; continue $sw4; }
                    $pc4 = 20; continue $sw4;
                }
                case 20: {
                    if (r3 >= r0) { $pc4 = 23; continue $sw4; }
                    java.lang.System.out.println("df[" + r3 + "]: " + this.Hw[r3].j6);
                    r3 = r3 + 1;
                    $pc4 = 23; continue $sw4;
                }
                case 23: {
                    return this.Hw;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
