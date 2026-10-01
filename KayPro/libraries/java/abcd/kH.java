package abcd;

public class kH {
    private final abcd.AbstractpK DW;
    private final java.io.File j6;

    public kH(java.io.File r6, abcd.AbstractpK r7) {
        java.io.File r0 = r6.getParentFile();
        java.lang.String r8 = r6.getName();
        this.j6 = new java.io.File(r0, java.lang.String.valueOf(r8.substring(0, r8.length() - 5)) + ".keep");
        this.DW = r7;
    }

    public void j6() {
        abcd.zK.j6(this.j6);
    }

    public boolean j6(java.lang.String r5) {
        abcd.WG r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r5 != null) { $pc0 = 6; continue $sw0; }
                    return false;
                }
                case 6: {
                    if (r5.endsWith("\n") == true) { $pc0 = 8; continue $sw0; }
                    r5 = java.lang.String.valueOf(r5) + "\n";
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    r1 = new abcd.WG(this.j6, this.DW);
                    if (r1.Hw() == true) { $pc0 = 11; continue $sw0; }
                    return false;
                }
                case 11: {
                    r1.j6(abcd.hE.j6(r5));
                    return r1.j6();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
