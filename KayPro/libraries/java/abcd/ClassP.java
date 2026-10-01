package abcd;

public class ClassP extends java.io.Writer {
    private java.lang.StringBuilder DW;
    private final java.lang.String j6;

    public ClassP(java.lang.String r3) {
        this.DW = new java.lang.StringBuilder(128);
        this.j6 = r3;
    }

    private void j6() {
        java.lang.StringBuilder r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.DW.length() <= 0) { $pc0 = 6; continue $sw0; }
                    android.util.Log.d(this.j6, this.DW.toString());
                    r0 = this.DW;
                    r0.delete(0, r0.length());
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void close() {
        j6();
    }

    @Override
    public void flush() {
        j6();
    }

    @Override
    public void write(char[] r4, int r5, int r6) {
        int r0 = 0;
        char r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r0 >= r6) { $pc1 = 9; continue $sw1; }
                    r1 = r4[r5 + r0];
                    if (r1 != '\n') { $pc1 = 7; continue $sw1; }
                    j6();
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    r0 = r0 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 7: {
                    this.DW.append(r1);
                    { $pc1 = 8; continue $sw1; }
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
