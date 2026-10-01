package abcd;

public class fK extends abcd.AbstractjK {
    final java.lang.String FH;
    final byte[] Hw;

    private fK(java.lang.String r1) {
        this.FH = r1;
        this.Hw = abcd.hE.j6(this.FH);
    }

    public static abcd.fK j6(java.lang.String r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 3: {
                    if (r2.endsWith("/") == false) { $pc0 = 5; continue $sw0; }
                    r2 = r2.substring(0, r2.length() - 1);
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    if (r2.length() == 0) { $pc0 = 9; continue $sw0; }
                    return new abcd.fK(r2);
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().emptyPathNotPermitted);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String DW() {
        return this.FH;
    }

    public boolean DW(abcd.YJ r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.Hw.length != r2.FH()) { $pc1 = 6; continue $sw1; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.fK clone() {
        return this;
    }

    @Override
    public abcd.AbstractjK clone() {
        clone();
        return this;
    }

    @Override
    public boolean j6() {
        byte[] r0 = null;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.Hw;
                    r1 = r0.length;
                    r3 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r3 >= r1) { $pc2 = 4; continue $sw2; }
                    if (r0[r3] == 47) { $pc2 = 7; continue $sw2; }
                    r3 = r3 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 7: {
                    return true;
                }
                case 4: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean j6(abcd.YJ r3) {
        byte[] r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.Hw;
                    if (r3.j6(r0, r0.length) != 0) { $pc3 = 6; continue $sw3; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String toString() {
        return "PATH(\"" + this.FH + "\")";
    }
}
