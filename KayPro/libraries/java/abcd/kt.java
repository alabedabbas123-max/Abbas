package abcd;

class kt implements abcd.Abstractvt.a {
    final java.util.HashSet DW;
    final abcd.lt FH;
    final abcd.bs[] j6;

    kt(abcd.lt r1, abcd.bs[] r2, java.util.HashSet r3) {
        this.FH = r1;
        this.j6 = r2;
        this.DW = r3;
    }

    @Override
    public void DW(abcd.mt r6) {
        int r0 = 0;
        abcd.bs[] r1 = null;
        abcd.bs r2 = null;
        abcd.bs r3 = null;
        abcd.Vr r4 = null;
        abcd.Vr r5 = null;
        abcd.jt r7 = null;
        java.util.List<abcd.Abstractvt> r8 = null;
        int r9 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r6.v5().Hw() == 3) { $pc0 = 5; continue $sw0; }
                    return;
                }
                case 5: {
                    r0 = abcd.lt.j6(this.FH, r6);
                    r1 = this.j6;
                    if (r1[r0] != null) { $pc0 = 8; continue $sw0; }
                    r1[r0] = r6.u7();
                    return;
                }
                case 8: {
                    r2 = r1[r0];
                    r3 = r6.u7();
                    r4 = r2.Zo();
                    r5 = r3.Zo();
                    if (r4 != null) { $pc0 = 11; continue $sw0; }
                    r4 = r5;
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    abcd.lt.j6(this.FH).FH(r2.we()).j6(r4);
                    r7 = new abcd.jt(this, r3, r2);
                    r8 = abcd.lt.j6(this.FH).Hw(r3.we());
                    r9 = r8.size() - 1;
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    if (r9 < 0) { $pc0 = 18; continue $sw0; }
                    r8.get(r9).DW(r7);
                    r9 = r9 - 1;
                    { $pc0 = 16; continue $sw0; }
                }
                case 18: {
                    this.DW.add(r6);
                    return;
                }
                case 11: {
                    if (r5 == null) { $pc0 = 15; continue $sw0; }
                    if (r4.equals(r5) == true) { $pc0 = 15; continue $sw0; }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.mt r1) {
    }

    @Override
    public void j6(abcd.ot r1) {
    }
}
