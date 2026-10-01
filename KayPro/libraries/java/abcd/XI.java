package abcd;

public class XI implements java.io.Serializable {
    private java.util.List<abcd.HJ> DW;
    private java.util.List<abcd.HJ> FH;
    private java.util.List<abcd.WI> Hw;
    private java.lang.String VH;
    private java.lang.String Zo;
    private abcd.EnumeJ gn;
    private java.lang.String j6;
    private int tp;
    private boolean u7;
    private java.util.List<abcd.WI> v5;

    public XI(abcd.gE r8, java.lang.String r9) {
        java.lang.String[] r10 = null;
        int r1 = 0;
        int r3 = 0;
        java.lang.String r4 = null;
        java.lang.String[] r5 = null;
        int r6 = 0;
        int r11 = 0;
        java.lang.String r2 = null;
        java.lang.String[] r7 = null;
        int r12 = 0;
        int r13 = 0;
        java.lang.String r14 = null;
        java.lang.String[] r15 = null;
        int r16 = 0;
        int r17 = 0;
        java.lang.String r18 = null;
        java.lang.String r19 = null;
        java.lang.String r20 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.j6 = r9;
                    r10 = r8.DW("remote", this.j6, "url");
                    this.DW = new java.util.ArrayList(r10.length);
                    r1 = r10.length;
                    r3 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r3 >= r1) { $pc0 = 4; continue $sw0; }
                    r4 = r10[r3];
                    this.DW.add(new abcd.HJ(r4));
                    r3 = r3 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 4: {
                    r5 = r8.DW("remote", this.j6, "pushurl");
                    this.FH = new java.util.ArrayList(r5.length);
                    r6 = r5.length;
                    r11 = 0;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    if (r11 >= r6) { $pc0 = 6; continue $sw0; }
                    r2 = r5[r11];
                    this.FH.add(new abcd.HJ(r2));
                    r11 = r11 + 1;
                    { $pc0 = 5; continue $sw0; }
                }
                case 6: {
                    r7 = r8.DW("remote", this.j6, "fetch");
                    this.Hw = new java.util.ArrayList(r7.length);
                    r12 = r7.length;
                    r13 = 0;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r13 >= r12) { $pc0 = 8; continue $sw0; }
                    r14 = r7[r13];
                    this.Hw.add(new abcd.WI(r14));
                    r13 = r13 + 1;
                    { $pc0 = 7; continue $sw0; }
                }
                case 8: {
                    r15 = r8.DW("remote", this.j6, "push");
                    this.v5 = new java.util.ArrayList(r15.length);
                    r16 = r15.length;
                    r17 = 0;
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (r17 >= r16) { $pc0 = 10; continue $sw0; }
                    r18 = r15[r17];
                    this.v5.add(new abcd.WI(r18));
                    r17 = r17 + 1;
                    { $pc0 = 9; continue $sw0; }
                }
                case 10: {
                    r19 = r8.j6("remote", this.j6, "uploadpack");
                    if (r19 != null) { $pc0 = 13; continue $sw0; }
                    r19 = "git-upload-pack";
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    this.Zo = r19;
                    r20 = r8.j6("remote", this.j6, "receivepack");
                    if (r20 != null) { $pc0 = 16; continue $sw0; }
                    r20 = "git-receive-pack";
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    this.VH = r20;
                    this.gn = abcd.EnumeJ.j6(r8.j6("remote", this.j6, "tagopt"));
                    this.u7 = r8.j6("remote", this.j6, "mirror", false);
                    this.tp = r8.j6("remote", this.j6, "timeout", 0);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.gE r3, java.lang.String r4) {
        r3.FH("remote", DW(), r4);
    }

    private void j6(abcd.gE r2, java.lang.String r3, int r4, int r5) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r5 != r4) { $pc1 = 4; continue $sw1; }
                    j6(r2, r3);
                    return;
                }
                case 4: {
                    r2.DW("remote", DW(), r3, r4);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.gE r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r5.equals(r4) == false) { $pc2 = 5; continue $sw2; }
                    j6(r2, r3);
                    return;
                }
                case 5: {
                    r2.j6("remote", DW(), r3, r4);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.gE r2, java.lang.String r3, boolean r4, boolean r5) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r5 != r4) { $pc3 = 4; continue $sw3; }
                    j6(r2, r3);
                    return;
                }
                case 4: {
                    r2.DW("remote", DW(), r3, r4);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String DW() {
        return this.j6;
    }

    public java.util.List<abcd.WI> FH() {
        return java.util.Collections.unmodifiableList(this.v5);
    }

    public java.util.List<abcd.HJ> Hw() {
        return java.util.Collections.unmodifiableList(this.FH);
    }

    public int VH() {
        return this.tp;
    }

    public abcd.EnumeJ Zo() {
        return this.gn;
    }

    public java.util.List<abcd.HJ> gn() {
        return java.util.Collections.unmodifiableList(this.DW);
    }

    public java.util.List<abcd.WI> j6() {
        return java.util.Collections.unmodifiableList(this.Hw);
    }

    public void j6(abcd.gE r5) {
        java.util.ArrayList r0 = null;
        java.util.Iterator<abcd.HJ> r1 = null;
        java.util.Iterator<abcd.HJ> r3 = null;
        java.util.Iterator<abcd.WI> r2 = null;
        java.util.Iterator<abcd.WI> r4 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new java.util.ArrayList();
                    r0.clear();
                    r1 = gn().iterator();
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc4 = 5; continue $sw4; }
                    r0.add(r1.next().u7());
                    { $pc4 = 4; continue $sw4; }
                }
                case 5: {
                    r5.j6("remote", DW(), "url", r0);
                    r0.clear();
                    r3 = Hw().iterator();
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (r3.hasNext() == false) { $pc4 = 8; continue $sw4; }
                    r0.add(r3.next().u7());
                    { $pc4 = 7; continue $sw4; }
                }
                case 8: {
                    r5.j6("remote", DW(), "pushurl", r0);
                    r0.clear();
                    r2 = j6().iterator();
                    $pc4 = 10; continue $sw4;
                }
                case 10: {
                    if (r2.hasNext() == false) { $pc4 = 11; continue $sw4; }
                    r0.add(r2.next().toString());
                    { $pc4 = 10; continue $sw4; }
                }
                case 11: {
                    r5.j6("remote", DW(), "fetch", r0);
                    r0.clear();
                    r4 = FH().iterator();
                    $pc4 = 13; continue $sw4;
                }
                case 13: {
                    if (r4.hasNext() == false) { $pc4 = 14; continue $sw4; }
                    r0.add(r4.next().toString());
                    { $pc4 = 13; continue $sw4; }
                }
                case 14: {
                    r5.j6("remote", DW(), "push", r0);
                    j6(r5, "uploadpack", u7(), "git-upload-pack");
                    j6(r5, "receivepack", v5(), "git-receive-pack");
                    j6(r5, "tagopt", Zo().Hw(), abcd.EnumeJ.j6.Hw());
                    j6(r5, "mirror", this.u7, false);
                    j6(r5, "timeout", this.tp, 0);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(abcd.HJ r2) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (this.DW.contains(r2) == false) { $pc5 = 7; continue $sw5; }
                    return false;
                }
                case 7: {
                    return this.DW.add(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(abcd.WI r2) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (this.Hw.contains(r2) == false) { $pc6 = 7; continue $sw6; }
                    return false;
                }
                case 7: {
                    return this.Hw.add(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String u7() {
        return this.Zo;
    }

    public java.lang.String v5() {
        return this.VH;
    }
}
