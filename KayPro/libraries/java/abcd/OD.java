package abcd;

public class OD {
    private static final java.util.regex.Pattern DW = null;
    static final java.util.List<abcd.QD> j6 = null;
    private java.util.List<abcd.QD> FH;
    private java.util.List<abcd.QD> Hw;
    private java.util.List<abcd.QD> v5;

    static {
        j6 = java.util.Collections.emptyList();
        DW = java.util.regex.Pattern.compile("\\[[.:=]");
    }

    public OD(java.lang.String r1, java.lang.Character r2) {
        this(j6(r1, r2));
    }

    private OD(java.util.List<abcd.QD> r1) {
        this(r1, r1);
    }

    private OD(java.util.List<abcd.QD> r2, java.util.List<abcd.QD> r3) {
        this.FH = r2;
        this.Hw = new java.util.ArrayList(r3.size());
        this.Hw.addAll(r3);
        this.v5 = new java.util.ArrayList(r3.size());
    }

    private static java.util.List<abcd.MD> DW(java.lang.String r5, java.lang.Character r6) {
        java.util.ArrayList r0 = null;
        int r2 = 0;
        char r3 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.util.ArrayList(r5.length());
                    r2 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r2 >= r5.length()) { $pc0 = 5; continue $sw0; }
                    r3 = r5.charAt(r2);
                    if (r3 != '*') { $pc0 = 9; continue $sw0; }
                    r0.add(j6(r6, true));
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    r2 = r2 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 9: {
                    if (r3 == '?') { $pc0 = 11; continue $sw0; }
                    r0.add(new abcd.ND(r3));
                    { $pc0 = 13; continue $sw0; }
                }
                case 11: {
                    r0.add(j6(r6, false));
                    { $pc0 = 13; continue $sw0; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.util.List<abcd.MD> FH(java.lang.String r4, java.lang.Character r5) {
        java.util.ArrayList r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new java.util.ArrayList();
                    r1 = 0;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r1 >= r4.length()) { $pc1 = 5; continue $sw1; }
                    r2 = r4.indexOf(91, r1);
                    if (r2 == (-1)) { $pc1 = 8; continue $sw1; }
                    r0.addAll(DW(r4.substring(r1, r2), r5));
                    r3 = j6(r2, r4);
                    r0.add(new abcd.PD(r4.substring(r2 + 1, r3), r4));
                    r1 = r3 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 8: {
                    r0.addAll(DW(r4.substring(r1), r5));
                    r1 = r4.length();
                    { $pc1 = 4; continue $sw1; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(int r9, java.lang.String r10) {
        int r0 = 0;
        int r1 = 0;
        java.util.regex.Matcher r2 = null;
        int r6 = 0;
        int r3 = 0;
        int r7 = 0;
        java.lang.String r4 = null;
        java.lang.String r8 = null;
        int r11 = 0;
        int r12 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = r9 + 1;
                    r1 = r9 + 2;
                    if (r0 >= r10.length()) { $pc2 = 25; continue $sw2; }
                    if (r10.charAt(r0) != '!') { $pc2 = 7; continue $sw2; }
                    r0 = r0 + 1;
                    r1 = r1 + 1;
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    r2 = DW.matcher(r10);
                    r6 = r0;
                    r3 = -1;
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    if (r3 != (-1)) { $pc2 = 9; continue $sw2; }
                    r7 = r10.indexOf(93, r1);
                    if (r7 == (-1)) { $pc2 = 23; continue $sw2; }
                    if (r2.find(r6) == false) { $pc2 = 21; continue $sw2; }
                    if (r2.start() >= r7) { $pc2 = 21; continue $sw2; }
                    r4 = r2.group(0);
                    r8 = java.lang.String.valueOf(r4.charAt(1)) + "]";
                    r11 = r2.start();
                    r12 = r10.indexOf(r8, r11 + 2);
                    if (r12 == (-1)) { $pc2 = 20; continue $sw2; }
                    r6 = r12 + 2;
                    r1 = r6;
                    { $pc2 = 8; continue $sw2; }
                }
                case 20: {
                    throw new abcd.gD(r11, r4, r8, r10);
                }
                case 21: {
                    r3 = r7;
                    { $pc2 = 8; continue $sw2; }
                }
                case 23: {
                    throw new abcd.gD(r9, "[", "]", r10);
                }
                case 9: {
                    return r3;
                }
                case 25: {
                    throw new abcd.gD(r9, "[", "]", r10);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.MD j6(java.lang.Character r1, boolean r2) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r1 == null) { $pc3 = 6; continue $sw3; }
                    return new abcd.SD(r1.charValue(), r2);
                }
                case 6: {
                    return new abcd.TD(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.util.List<abcd.QD> j6(java.lang.String r4, java.lang.Character r5) {
        java.util.List<abcd.MD> r6 = null;
        java.util.ArrayList r7 = null;
        int r1 = 0;
        abcd.MD r2 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r6 = FH(r4, r5);
                    r7 = new java.util.ArrayList(2);
                    r7.add(abcd.RD.j6);
                    r1 = r6.size() - 1;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r1 < 0) { $pc4 = 4; continue $sw4; }
                    r2 = r6.get(r1);
                    if (r2.j6() == false) { $pc4 = 8; continue $sw4; }
                    r7.add(r2);
                    r2.j6(r7);
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    r1 = r1 - 1;
                    { $pc4 = 3; continue $sw4; }
                }
                case 8: {
                    r2.j6(r7);
                    r7 = new java.util.ArrayList(2);
                    r7.add(r2);
                    { $pc4 = 9; continue $sw4; }
                }
                case 4: {
                    return r7;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(char r5) {
        java.util.List<abcd.QD> r0 = null;
        java.util.List<abcd.QD> r1 = null;
        int r2 = 0;
        java.util.List<abcd.QD> r3 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.v5;
                    r0.clear();
                    r1 = null;
                    r2 = 0;
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    if (r2 >= this.Hw.size()) { $pc5 = 5; continue $sw5; }
                    r3 = this.Hw.get(r2).j6(r5);
                    if (r3 == r1) { $pc5 = 10; continue $sw5; }
                    r0.addAll(r3);
                    r1 = r3;
                    $pc5 = 10; continue $sw5;
                }
                case 10: {
                    r2 = r2 + 1;
                    { $pc5 = 4; continue $sw5; }
                }
                case 5: {
                    this.v5 = this.Hw;
                    this.Hw = r0;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW() {
        this.Hw.clear();
        this.Hw.addAll(this.FH);
    }

    public void j6(java.lang.String r3) {
        int r0 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = 0;
                    $pc6 = 4; continue $sw6;
                }
                case 4: {
                    if (r0 >= r3.length()) { $pc6 = 5; continue $sw6; }
                    j6(r3.charAt(r0));
                    r0 = r0 + 1;
                    { $pc6 = 4; continue $sw6; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6() {
        java.util.List<abcd.QD> r0 = null;
        java.util.ListIterator<abcd.QD> r1 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = this.Hw;
                    r1 = r0.listIterator(r0.size());
                    $pc7 = 4; continue $sw7;
                }
                case 4: {
                    if (r1.hasPrevious() == false) { $pc7 = 5; continue $sw7; }
                    if (r1.previous() != abcd.RD.j6) { $pc7 = 4; continue $sw7; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
