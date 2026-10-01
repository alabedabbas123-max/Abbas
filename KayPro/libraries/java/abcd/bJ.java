package abcd;

class bJ extends abcd.AbstracteE {
    private boolean VH;
    private final java.io.OutputStream Zo;

    bJ(java.io.OutputStream r1) {
        this.Zo = r1;
        this.VH = true;
    }

    private void j6(java.lang.StringBuilder r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.VH == false) { $pc0 = 10; continue $sw0; }
                    try {
                        this.Zo.write(abcd.hE.j6(r2.toString()));
                        this.Zo.flush();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 6; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 6: {
                    this.VH = false;
                    return;
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.lang.StringBuilder r1, java.lang.String r2, int r3) {
        r1.append(r2);
        r1.append(": ");
        r1.append(r3);
    }

    private void j6(java.lang.StringBuilder r2, java.lang.String r3, int r4, int r5, int r6) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r2.append(r3);
                    r2.append(": ");
                    if (r6 >= 100) { $pc1 = 6; continue $sw1; }
                    r2.append(' ');
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r6 >= 10) { $pc1 = 8; continue $sw1; }
                    r2.append(' ');
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    r2.append(r6);
                    r2.append("% (");
                    r2.append(r4);
                    r2.append("/");
                    r2.append(r5);
                    r2.append(")");
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void DW(java.lang.String r2, int r3) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        j6(r0, r2, r3);
        r0.append(", done\n");
        j6(r0);
    }

    @Override
    protected void DW(java.lang.String r8, int r9, int r10, int r11) {
        java.lang.StringBuilder r6 = new java.lang.StringBuilder();
        j6(r6, r8, r9, r10, r11);
        r6.append("   \r");
        j6(r6);
    }

    @Override
    protected void FH(java.lang.String r2, int r3) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        j6(r0, r2, r3);
        r0.append("   \r");
        j6(r0);
    }

    @Override
    protected void j6(java.lang.String r8, int r9, int r10, int r11) {
        java.lang.StringBuilder r6 = new java.lang.StringBuilder();
        j6(r6, r8, r9, r10, r11);
        r6.append("\n");
        j6(r6);
    }
}
