package abcd;

public final class lp extends abcd.Abstractmp implements java.lang.Comparable<abcd.lp> {
    private final abcd.ws DW;

    public lp(abcd.ws r1, int r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r2);
                    if (r1 == null) { $pc0 = 7; continue $sw0; }
                    this.DW = r1;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("field == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.ws Zo() {
        return this.DW;
    }

    @Override
    public java.lang.String aM() {
        return this.DW.aM();
    }

    @Override
    public int compareTo(abcd.lp r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r3 instanceof abcd.lp) == true) { $pc1 = 6; continue $sw1; }
                    return false;
                }
                case 6: {
                    if (j6((abcd.lp) r3) != 0) { $pc1 = 9; continue $sw1; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return this.DW.hashCode();
    }

    @Override
    public int j6(abcd.jp r5, abcd.Lt r6, int r7, int r8) {
        int r9 = 0;
        int r10 = 0;
        int r0 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r9 = r5.v5().j6(this.DW);
                    r10 = r9 - r7;
                    r0 = Hw();
                    if (r6.Hw() == false) { $pc2 = 5; continue $sw2; }
                    r6.j6(0, java.lang.String.format("  [%x] %s", new java.lang.Object[]{java.lang.Integer.valueOf(r8), this.DW.aM()}));
                    r6.j6(abcd.eu.j6(r10), "    field_idx:    " + abcd.Yt.gn(r9));
                    r6.j6(abcd.eu.j6(r0), "    access_flags: " + abcd.Mr.DW(r0));
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    r6.DW(r10);
                    r6.DW(r0);
                    return r9;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(abcd.lp r2) {
        return this.DW.j6(r2.DW);
    }

    public void j6(abcd.jp r2) {
        r2.v5().DW(this.DW);
    }

    public java.lang.String toString() {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(100);
        r0.append(abcd.lp.class.getName());
        r0.append('{');
        r0.append(abcd.Yt.v5(Hw()));
        r0.append(' ');
        r0.append(this.DW);
        r0.append('}');
        return r0.toString();
    }
}
