package abcd;

public class KE implements java.io.Serializable {
    private final java.lang.String DW;
    private final long FH;
    private final int Hw;
    private final java.lang.String j6;

    public KE(abcd.KE r2) {
        this(r2.DW(), r2.j6());
    }

    public KE(abcd.UE r3) {
        abcd.oF r4 = (abcd.oF) r3.Zo().j6(abcd.oF.j6);
        this.j6 = r4.DW();
        this.DW = r4.j6();
        this.FH = abcd.QK.FH().j6();
        this.Hw = abcd.QK.FH().j6(this.FH);
    }

    public KE(java.lang.String r3, java.lang.String r4) {
        this.j6 = r3;
        this.DW = r4;
        this.FH = abcd.QK.FH().j6();
        this.Hw = abcd.QK.FH().j6(this.FH);
    }

    public KE(java.lang.String r1, java.lang.String r2, long r3, int r5) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r5;
    }

    private void j6(java.lang.StringBuilder r5) {
        int r0 = 0;
        char r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.Hw;
                    if (r0 >= 0) { $pc0 = 5; continue $sw0; }
                    r1 = '-';
                    r0 = -r0;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r2 = r0 / 60;
                    r3 = r0 % 60;
                    r5.append(r1);
                    if (r2 >= 10) { $pc0 = 9; continue $sw0; }
                    r5.append('0');
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    r5.append(r2);
                    if (r3 >= 10) { $pc0 = 12; continue $sw0; }
                    r5.append('0');
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    r5.append(r3);
                    return;
                }
                case 5: {
                    r1 = '+';
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String DW() {
        return this.j6;
    }

    public java.util.TimeZone FH() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder(8);
        r0.append("GMT");
        j6(r0);
        return java.util.TimeZone.getTimeZone(r0.toString());
    }

    public java.lang.String Hw() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append(DW());
        r0.append(" <");
        r0.append(j6());
        r0.append("> ");
        r0.append(this.FH / 1000);
        r0.append(' ');
        j6(r0);
        return r0.toString();
    }

    public boolean equals(java.lang.Object r9) {
        abcd.KE r10 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r9 instanceof abcd.KE) == false) { $pc1 = 12; continue $sw1; }
                    r10 = (abcd.KE) r9;
                    if (DW().equals(r10.DW()) == false) { $pc1 = 12; continue $sw1; }
                    if (j6().equals(r10.j6()) == false) { $pc1 = 12; continue $sw1; }
                    if ((this.FH / 1000) != (r10.FH / 1000)) { $pc1 = 12; continue $sw1; }
                    return true;
                }
                case 12: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return (j6().hashCode() * 31) + ((int) (this.FH / 1000));
    }

    public java.lang.String j6() {
        return this.DW;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat("EEE MMM d HH:mm:ss yyyy Z", java.util.Locale.US);
        r1.setTimeZone(FH());
        r0.append("PersonIdent[");
        r0.append(DW());
        r0.append(", ");
        r0.append(j6());
        r0.append(", ");
        r0.append(r1.format(java.lang.Long.valueOf(this.FH)));
        r0.append("]");
        return r0.toString();
    }
}
