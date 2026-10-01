package abcd;

class oI {
    boolean DW;
    java.lang.String FH;
    abcd.HJ Hw;
    abcd.yE j6;

    oI() {
    }

    void j6(java.io.Writer r5) {
        java.lang.String r0 = null;
        java.lang.String r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.FH.startsWith("refs/heads/") == false) { $pc0 = 6; continue $sw0; }
                    r0 = this.FH.substring(11);
                    r1 = "branch";
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    r5.write(this.j6.we());
                    r5.write(9);
                    if (this.DW == false) { $pc0 = 15; continue $sw0; }
                    r5.write("not-for-merge");
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    r5.write(9);
                    r5.write(r1);
                    r5.write(" '");
                    r5.write(r0);
                    r5.write("' of ");
                    r5.write(this.Hw.toString());
                    r5.write("\n");
                    return;
                }
                case 6: {
                    if (this.FH.startsWith("refs/tags/") == false) { $pc0 = 9; continue $sw0; }
                    r0 = this.FH.substring(10);
                    r1 = "tag";
                    { $pc0 = 12; continue $sw0; }
                }
                case 9: {
                    if (this.FH.startsWith("refs/remotes/") == false) { $pc0 = 11; continue $sw0; }
                    r0 = this.FH.substring(13);
                    r1 = "remote branch";
                    { $pc0 = 12; continue $sw0; }
                }
                case 11: {
                    r0 = this.FH;
                    r1 = "";
                    { $pc0 = 12; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
