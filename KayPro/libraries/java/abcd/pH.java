package abcd;

public class pH implements java.io.Serializable {
    private abcd.yE DW;
    private abcd.KE FH;
    private java.lang.String Hw;
    private abcd.yE j6;

    pH(byte[] r3, int r4) {
        int r5 = 0;
        int r0 = 0;
        int r1 = 0;
        int r6 = 0;
        int r7 = 0;
        java.lang.String r2 = null;
        int r8 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.j6 = abcd.yE.v5(r3, r4);
                    r5 = r4 + 40;
                    r0 = r5 + 1;
                    if (r3[r5] != 32) { $pc0 = 17; continue $sw0; }
                    this.DW = abcd.yE.v5(r3, r0);
                    r1 = r0 + 40;
                    r6 = r1 + 1;
                    if (r3[r1] != 32) { $pc0 = 15; continue $sw0; }
                    this.FH = abcd.IK.tp(r3, r6);
                    r7 = abcd.IK.j6(r3, r6, '\t');
                    r2 = "";
                    if (r7 < r3.length) { $pc0 = 9; continue $sw0; }
                    this.Hw = "";
                    return;
                }
                case 9: {
                    r8 = abcd.IK.Zo(r3, r7);
                    if (r8 <= r7) { $pc0 = 12; continue $sw0; }
                    r2 = abcd.IK.j6(r3, r7, r8 - 1);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    this.Hw = r2;
                    return;
                }
                case 15: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().rawLogMessageDoesNotParseAsLogEntry);
                }
                case 17: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().rawLogMessageDoesNotParseAsLogEntry);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.yE DW() {
        return this.DW;
    }

    public abcd.KE FH() {
        return this.FH;
    }

    public java.lang.String j6() {
        return this.Hw;
    }

    public java.lang.String toString() {
        return "Entry[" + this.j6.we() + ", " + this.DW.we() + ", " + FH() + ", " + j6() + "]";
    }
}
