package abcd;

public class rF {
    public rF() {
    }

    public void j6(java.io.OutputStream r11, uF<abcd.tC> r12, java.util.List<java.lang.String> r13, java.lang.String r14) {
        boolean r0 = false;
        java.util.Iterator<abcd.qF> r1 = null;
        java.lang.String r3 = null;
        abcd.qF r4 = null;
        abcd.tC r7 = null;
        int r5 = 0;
        java.lang.String r6 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r12.FH().size() != 3) { $pc0 = 5; continue $sw0; }
                    r0 = true;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r1 = r12.iterator();
                    r3 = null;
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    if (r1.hasNext() == false) { $pc0 = 9; continue $sw0; }
                    r4 = r1.next();
                    r7 = (abcd.tC) r12.FH().get(r4.Hw());
                    if (r3 == null) { $pc0 = 18; continue $sw0; }
                    if (r4.DW() == abcd.qF.a.FH) { $pc0 = 18; continue $sw0; }
                    r11.write((">>>>>>> " + r3 + "\n").getBytes(r14));
                    r3 = null;
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    if (r4.DW() != abcd.qF.a.DW) { $pc0 = 21; continue $sw0; }
                    r11.write(("<<<<<<< " + r13.get(r4.Hw()) + "\n").getBytes(r14));
                    r3 = r13.get(r4.Hw());
                    $pc0 = 27; continue $sw0;
                }
                case 27: {
                    r5 = r4.j6();
                    $pc0 = 29; continue $sw0;
                }
                case 29: {
                    if (r5 >= r4.FH()) { $pc0 = 8; continue $sw0; }
                    r7.j6(r11, r5);
                    r11.write(10);
                    r5 = r5 + 1;
                    { $pc0 = 29; continue $sw0; }
                }
                case 21: {
                    if (r4.DW() != abcd.qF.a.FH) { $pc0 = 27; continue $sw0; }
                    r3 = r13.get(r4.Hw());
                    if (r0 == false) { $pc0 = 25; continue $sw0; }
                    r6 = "=======\n";
                    $pc0 = 26; continue $sw0;
                }
                case 26: {
                    r11.write(r6.getBytes(r14));
                    { $pc0 = 27; continue $sw0; }
                }
                case 25: {
                    r6 = "======= " + r3 + "\n";
                    { $pc0 = 26; continue $sw0; }
                }
                case 9: {
                    if (r3 == null) { $pc0 = 34; continue $sw0; }
                    r11.write((">>>>>>> " + r3 + "\n").getBytes(r14));
                    return;
                }
                case 34: {
                    return;
                }
                case 5: {
                    r0 = false;
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
