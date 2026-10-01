package abcd;

public abstract class SE {
    private final java.util.Collection<abcd.ME> j6;

    public SE(KK<abcd.ME> r1) {
        this.j6 = r1.j6();
    }

    public SE(java.util.Collection<abcd.ME> r1) {
        this.j6 = abcd.NE.j6(r1);
    }

    public void DW() {
        java.util.Iterator<abcd.ME> r0 = null;
        abcd.ME r1 = null;
        boolean r2 = false;
        java.io.StringWriter r3 = null;
        char[] r4 = null;
        java.util.Iterator<abcd.ME> r5 = null;
        abcd.ME r6 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.j6.iterator();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc0 = 5; continue $sw0; }
                    r1 = r0.next();
                    if (r1.j6().Zo() == false) { $pc0 = 4; continue $sw0; }
                    if (r1.Hw() == false) { $pc0 = 4; continue $sw0; }
                    r2 = true;
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    r3 = new java.io.StringWriter();
                    if (r2 == false) { $pc0 = 17; continue $sw0; }
                    r3.write("# pack-refs with:");
                    if (r2 == false) { $pc0 = 16; continue $sw0; }
                    r3.write(" peeled");
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    r3.write(10);
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    r4 = new char[40];
                    r5 = this.j6.iterator();
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    if (r5.hasNext() == false) { $pc0 = 20; continue $sw0; }
                    r6 = r5.next();
                    if (r6.j6() != abcd.ME.a.FH) { $pc0 = 19; continue $sw0; }
                    r6.DW().j6(r4, r3);
                    r3.write(32);
                    r3.write(r6.getName());
                    r3.write(10);
                    if (r6.FH() == null) { $pc0 = 19; continue $sw0; }
                    r3.write(94);
                    r6.FH().j6(r4, r3);
                    r3.write(10);
                    { $pc0 = 19; continue $sw0; }
                }
                case 20: {
                    j6("packed-refs", abcd.hE.j6(r3.toString()));
                    return;
                }
                case 5: {
                    r2 = false;
                    { $pc0 = 11; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        java.io.StringWriter r0 = null;
        char[] r1 = null;
        java.util.Iterator<abcd.ME> r2 = null;
        abcd.ME r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new java.io.StringWriter();
                    r1 = new char[40];
                    r2 = this.j6.iterator();
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r2.hasNext() == false) { $pc1 = 5; continue $sw1; }
                    r3 = r2.next();
                    if ("HEAD".equals(r3.getName()) == true) { $pc1 = 4; continue $sw1; }
                    r3.DW().j6(r1, r0);
                    r0.write(9);
                    r0.write(r3.getName());
                    r0.write(10);
                    if (r3.FH() == null) { $pc1 = 4; continue $sw1; }
                    r3.FH().j6(r1, r0);
                    r0.write(9);
                    r0.write(r3.getName());
                    r0.write("^{}\n");
                    { $pc1 = 4; continue $sw1; }
                }
                case 5: {
                    j6("info/refs", abcd.hE.j6(r0.toString()));
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract void j6(java.lang.String r1, byte[] r2);
}
