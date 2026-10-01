package abcd;

public class WI implements java.io.Serializable {
    private boolean DW;
    private java.lang.String FH;
    private java.lang.String Hw;
    private boolean j6;

    public WI() {
        this.j6 = false;
        this.DW = false;
        this.FH = "HEAD";
        this.Hw = null;
    }

    private WI(abcd.WI r2) {
        this.j6 = r2.FH();
        this.DW = r2.Hw();
        this.FH = r2.DW();
        this.Hw = r2.j6();
    }

    public WI(java.lang.String r6) {
        java.lang.String r0 = null;
        int r2 = 0;
        java.lang.String r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r6.startsWith("+") == false) { $pc0 = 5; continue $sw0; }
                    this.j6 = true;
                    r0 = r6.substring(1);
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r2 = r0.lastIndexOf(58);
                    if (r2 != 0) { $pc0 = 13; continue $sw0; }
                    r1 = r0.substring(1);
                    if (FH(r1) == true) { $pc0 = 12; continue $sw0; }
                    this.Hw = r1;
                    return;
                }
                case 12: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidWildcards, new java.lang.Object[]{r6}));
                }
                case 13: {
                    if (r2 <= 0) { $pc0 = 27; continue $sw0; }
                    this.FH = r0.substring(0, r2);
                    this.Hw = r0.substring(r2 + 1);
                    if (FH(this.FH) == false) { $pc0 = 20; continue $sw0; }
                    if (FH(this.Hw) == false) { $pc0 = 20; continue $sw0; }
                    this.DW = true;
                    return;
                }
                case 20: {
                    if (FH(this.FH) == true) { $pc0 = 25; continue $sw0; }
                    if (FH(this.Hw) == true) { $pc0 = 25; continue $sw0; }
                    return;
                }
                case 25: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidWildcards, new java.lang.Object[]{r6}));
                }
                case 27: {
                    if (FH(r0) == true) { $pc0 = 31; continue $sw0; }
                    this.FH = r0;
                    return;
                }
                case 31: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidWildcards, new java.lang.Object[]{r6}));
                }
                case 5: {
                    r0 = r6;
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean DW(java.lang.String r0, java.lang.String r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r0 != r1) { $pc1 = 5; continue $sw1; }
                    return true;
                }
                case 5: {
                    if (r0 == null) { $pc1 = 10; continue $sw1; }
                    if (r1 != null) { $pc1 = 9; continue $sw1; }
                    return false;
                }
                case 9: {
                    return r0.equals(r1);
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean FH(java.lang.String r1) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r1 != null) { $pc2 = 4; continue $sw2; }
                    return false;
                }
                case 4: {
                    if (r1.endsWith("/*") == false) { $pc2 = 9; continue $sw2; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean FH(java.lang.String r3, java.lang.String r4) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r4 != null) { $pc3 = 6; continue $sw3; }
                    return false;
                }
                case 6: {
                    if (Hw() == false) { $pc3 = 10; continue $sw3; }
                    return r3.startsWith(r4.substring(0, r4.length() - 1));
                }
                case 10: {
                    return r3.equals(r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.WI gn(java.lang.String r6) {
        java.lang.String r0 = this.FH;
        java.lang.String r1 = this.Hw;
        this.DW = false;
        this.FH = java.lang.String.valueOf(r0.substring(0, r0.length() - 1)) + r6.substring(r1.length() - 1);
        this.Hw = r6;
        return this;
    }

    private abcd.WI u7(java.lang.String r6) {
        java.lang.String r0 = this.FH;
        java.lang.String r1 = this.Hw;
        this.DW = false;
        this.FH = r6;
        this.Hw = java.lang.String.valueOf(r1.substring(0, r1.length() - 1)) + r6.substring(r0.length() - 1);
        return this;
    }

    public abcd.WI DW(java.lang.String r2) {
        abcd.WI r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (Hw() == false) { $pc4 = 6; continue $sw4; }
                    r0 = new abcd.WI(this);
                    r0.u7(r2);
                    return r0;
                }
                case 6: {
                    return this;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String DW() {
        return this.FH;
    }

    public boolean DW(abcd.ME r2) {
        return FH(r2.getName(), DW());
    }

    public boolean FH() {
        return this.j6;
    }

    public boolean Hw() {
        return this.DW;
    }

    public boolean Hw(java.lang.String r2) {
        return FH(r2, j6());
    }

    public abcd.WI VH(java.lang.String r3) {
        abcd.WI r0 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = new abcd.WI(this);
                    r0.FH = r3;
                    if (FH(r0.FH) == false) { $pc5 = 10; continue $sw5; }
                    if (r0.Hw != null) { $pc5 = 10; continue $sw5; }
                    throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().destinationIsNotAWildcard);
                }
                case 10: {
                    if (FH(r0.FH) != FH(r0.Hw)) { $pc5 = 13; continue $sw5; }
                    return r0;
                }
                case 13: {
                    throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().sourceDestinationMustMatch);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.WI Zo(java.lang.String r3) {
        abcd.WI r0 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = new abcd.WI(this);
                    r0.Hw = r3;
                    if (FH(r0.Hw) == false) { $pc6 = 10; continue $sw6; }
                    if (r0.FH != null) { $pc6 = 10; continue $sw6; }
                    throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().sourceIsNotAWildcard);
                }
                case 10: {
                    if (FH(r0.FH) != FH(r0.Hw)) { $pc6 = 13; continue $sw6; }
                    return r0;
                }
                case 13: {
                    throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().sourceDestinationMustMatch);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean equals(java.lang.Object r4) {
        abcd.WI r5 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if ((r4 instanceof abcd.WI) == true) { $pc7 = 5; continue $sw7; }
                    return false;
                }
                case 5: {
                    r5 = (abcd.WI) r4;
                    if (FH() == r5.FH()) { $pc7 = 9; continue $sw7; }
                    return false;
                }
                case 9: {
                    if (Hw() == r5.Hw()) { $pc7 = 12; continue $sw7; }
                    return false;
                }
                case 12: {
                    if (DW(DW(), r5.DW()) == true) { $pc7 = 15; continue $sw7; }
                    return false;
                }
                case 15: {
                    if (DW(j6(), r5.j6()) == true) { $pc7 = 17; continue $sw7; }
                    return false;
                }
                case 17: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        int r1 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r1 = 0;
                    if (DW() == null) { $pc8 = 6; continue $sw8; }
                    r1 = 0 + DW().hashCode();
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    if (j6() != null) { $pc8 = 8; continue $sw8; }
                    return r1;
                }
                case 8: {
                    return (r1 * 31) + j6().hashCode();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.WI j6(abcd.ME r1) {
        return DW(r1.getName());
    }

    public abcd.WI j6(java.lang.String r2) {
        abcd.WI r0 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (Hw() == false) { $pc9 = 6; continue $sw9; }
                    r0 = new abcd.WI(this);
                    r0.gn(r2);
                    return r0;
                }
                case 6: {
                    return this;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.WI j6(java.lang.String r3, java.lang.String r4) {
        abcd.WI r0 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (FH(r3) != FH(r4)) { $pc10 = 7; continue $sw10; }
                    r0 = new abcd.WI(this);
                    r0.DW = FH(r3);
                    r0.FH = r3;
                    r0.Hw = r4;
                    return r0;
                }
                case 7: {
                    throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().sourceDestinationMustMatch);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.WI j6(boolean r2) {
        abcd.WI r0 = new abcd.WI(this);
        r0.j6 = r2;
        return r0;
    }

    public java.lang.String j6() {
        return this.Hw;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    if (FH() == false) { $pc11 = 6; continue $sw11; }
                    r0.append('+');
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    if (DW() == null) { $pc11 = 9; continue $sw11; }
                    r0.append(DW());
                    $pc11 = 9; continue $sw11;
                }
                case 9: {
                    if (j6() == null) { $pc11 = 12; continue $sw11; }
                    r0.append(':');
                    r0.append(j6());
                    $pc11 = 12; continue $sw11;
                }
                case 12: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean v5(java.lang.String r2) {
        return FH(r2, DW());
    }
}
