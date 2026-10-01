package abcd;

public class MA {
    static java.text.DateFormat j6;

    static {
        j6 = new java.text.SimpleDateFormat("MM-dd-yy HH:mm");
    }

    public static void j6(abcd.InterfacetA r1) {
        r1.FH(" Length   Method    Size  Ratio   Date   Time   CRC-32    Name");
        r1.FH("--------  ------  ------- -----   ----   ----   ------    ----");
    }

    public static void j6(abcd.InterfacetA r6, abcd.IA r7) {
        int r0 = 0;
        java.lang.Object[] r2 = null;
        java.lang.String r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r7.QX() <= 0) { $pc0 = 5; continue $sw0; }
                    r0 = ((r7.QX() - r7.j6()) * 100) / r7.QX();
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r2 = new java.lang.Object[7];
                    r2[0] = java.lang.Integer.valueOf(r7.QX());
                    if (r7.DW() != 0) { $pc0 = 9; continue $sw0; }
                    r3 = "Stored";
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    r2[1] = r3;
                    r2[2] = java.lang.Integer.valueOf(r7.j6());
                    r2[3] = java.lang.Integer.valueOf(r0);
                    r2[4] = j6.format(new java.util.Date(r7.XL()));
                    r2[5] = java.lang.Integer.valueOf(r7.FH());
                    r2[6] = r7.EQ();
                    r6.FH(java.lang.String.format("%8d  %6s %8d %4d%% %s  %08x  %s", r2));
                    return;
                }
                case 9: {
                    r3 = "Defl:N";
                    { $pc0 = 10; continue $sw0; }
                }
                case 5: {
                    r0 = 0;
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
