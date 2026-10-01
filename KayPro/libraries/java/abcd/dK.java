package abcd;

public class dK extends abcd.AbstractjK {
    private final int FH;
    private final int Hw;
    private final java.util.LinkedList<java.lang.String> VH;
    private final java.util.Set<java.lang.String> Zo;
    private final java.util.LinkedList<java.lang.String> gn;
    private final boolean v5;

    public dK(int r2, int r3) {
        this(r2, r3, true);
    }

    public dK(int r2, int r3, boolean r4) {
        this.Zo = new java.util.HashSet();
        this.VH = new java.util.LinkedList();
        this.gn = new java.util.LinkedList();
        this.FH = r2;
        this.Hw = r3;
        this.v5 = r4;
    }

    private abcd._J DW(abcd.YJ r3) {
        return (abcd._J) r3.j6(this.Hw, abcd._J.class);
    }

    private void j6(java.lang.String r4) {
        java.lang.String r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = null;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (this.VH.isEmpty() == true) { $pc0 = 9; continue $sw0; }
                    if (r4.startsWith(java.lang.String.valueOf(this.VH.getFirst()) + "/") == true) { $pc0 = 9; continue $sw0; }
                    r0 = this.VH.removeFirst();
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (r0 != null) { $pc0 = 11; continue $sw0; }
                    return;
                }
                case 11: {
                    if (this.gn.isEmpty() == true) { $pc0 = 16; continue $sw0; }
                    if (this.gn.getLast().startsWith(r0) == false) { $pc0 = 16; continue $sw0; }
                    this.gn.removeLast();
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    this.gn.addLast(r0);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.Set<java.lang.String> DW() {
        return this.Zo;
    }

    @Override
    public abcd.AbstractjK clone() {
        return this;
    }

    @Override
    public boolean j6() {
        return true;
    }

    @Override
    public boolean j6(abcd.YJ r7) {
        int r0 = 0;
        int r1 = 0;
        java.lang.String r2 = null;
        int r4 = 0;
        int r3 = 0;
        int r5 = 0;
        int r6 = 0;
        abcd._J r8 = null;
        int r9 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r7.Zo();
                    r1 = r7.FH(this.Hw);
                    r2 = r7.Hw();
                    r4 = 0;
                    if (r7.VH() == true) { $pc1 = 18; continue $sw1; }
                    if (abcd.AbstractrE.j6.j6(r1) == false) { $pc1 = 7; continue $sw1; }
                    j6(r2);
                    this.VH.addFirst(r2);
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    r3 = 0;
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    if (r3 >= r0) { $pc1 = 18; continue $sw1; }
                    r5 = r7.FH(r3);
                    if (r3 == this.Hw) { $pc1 = 16; continue $sw1; }
                    if (r5 == 0) { $pc1 = 16; continue $sw1; }
                    if (abcd.AbstractrE.j6.j6(r5) == false) { $pc1 = 16; continue $sw1; }
                    this.VH.clear();
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    r3 = r3 + 1;
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    if (r1 != 0) { $pc1 = 20; continue $sw1; }
                    return true;
                }
                case 20: {
                    r6 = r7.FH(this.FH);
                    r8 = DW(r7);
                    if (r6 != 0) { $pc1 = 42; continue $sw1; }
                    if (this.v5 == true) { $pc1 = 25; continue $sw1; }
                    $pc1 = 40; continue $sw1;
                }
                case 40: {
                    return true;
                }
                case 25: {
                    if (r8.U2() == false) { $pc1 = 40; continue $sw1; }
                    this.Zo.add(r8.Zo());
                    r9 = 0;
                    $pc1 = 27; continue $sw1;
                }
                case 27: {
                    if (r9 >= r0) { $pc1 = 36; continue $sw1; }
                    if (r9 == this.FH) { $pc1 = 39; continue $sw1; }
                    if (r9 == this.Hw) { $pc1 = 39; continue $sw1; }
                    if (r7.FH(r9) != 0) { $pc1 = 36; continue $sw1; }
                    $pc1 = 39; continue $sw1;
                }
                case 39: {
                    r9 = r9 + 1;
                    $pc1 = 36; continue $sw1;
                }
                case 36: {
                    if (r9 != r0) { $pc1 = 74; continue $sw1; }
                    return false;
                }
                case 74: {
                    return true;
                }
                case 42: {
                    if (r7.u7() == false) { $pc1 = 44; continue $sw1; }
                    return true;
                }
                case 44: {
                    if (r4 >= r0) { $pc1 = 46; continue $sw1; }
                    if (r4 == this.FH) { $pc1 = 57; continue $sw1; }
                    if (r4 == this.Hw) { $pc1 = 57; continue $sw1; }
                    if (r7.FH(r4) != r6) { $pc1 = 56; continue $sw1; }
                    if (r7.j6(r4, this.FH) == true) { $pc1 = 57; continue $sw1; }
                    $pc1 = 56; continue $sw1;
                }
                case 56: {
                    return true;
                }
                case 57: {
                    r4 = r4 + 1;
                    { $pc1 = 44; continue $sw1; }
                }
                case 46: {
                    return r8.j6(((abcd.RC) r7.j6(this.FH, abcd.RC.class)).J8(), true);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String toString() {
        return "INDEX_DIFF_FILTER";
    }
}
