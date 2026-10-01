package abcd;

public class Vt extends java.lang.RuntimeException {
    private java.lang.StringBuffer j6;

    public Vt(java.lang.String r2) {
        this(r2, null);
    }

    public Vt(java.lang.String r3, java.lang.Throwable r4) {
        java.lang.String r5 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3 != null) { $pc0 = 7; continue $sw0; }
                    if (r4 == null) { $pc0 = 6; continue $sw0; }
                    r3 = r4.getMessage();
                    { $pc0 = 7; continue $sw0; }
                }
                case 6: {
                    r3 = null;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    super(r3, r4);
                    if ((r4 instanceof abcd.Vt) == false) { $pc0 = 10; continue $sw0; }
                    r5 = ((abcd.Vt) r4).j6.toString();
                    this.j6 = new java.lang.StringBuffer(r5.length() + 200);
                    this.j6.append(r5);
                    return;
                }
                case 10: {
                    this.j6 = new java.lang.StringBuffer(200);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public Vt(java.lang.Throwable r2) {
        this(null, r2);
    }

    public static abcd.Vt j6(java.lang.Throwable r1, java.lang.String r2) {
        abcd.Vt r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r1 instanceof abcd.Vt) == false) { $pc1 = 5; continue $sw1; }
                    r3 = (abcd.Vt) r1;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r3.j6(r2);
                    return r3;
                }
                case 5: {
                    r3 = new abcd.Vt(r1);
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 == null) { $pc2 = 8; continue $sw2; }
                    this.j6.append(r2);
                    if (r2.endsWith("\n") == true) { $pc2 = 9; continue $sw2; }
                    this.j6.append('\n');
                    return;
                }
                case 9: {
                    return;
                }
                case 8: {
                    throw new java.lang.NullPointerException("str == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void printStackTrace(java.io.PrintStream r2) {
        super.printStackTrace(r2);
        r2.println(this.j6);
    }

    @Override
    public void printStackTrace(java.io.PrintWriter r2) {
        super.printStackTrace(r2);
        r2.println(this.j6);
    }
}
