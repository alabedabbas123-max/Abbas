package abcd;

class LK extends java.util.AbstractSet<java.util.Map.Entry<java.lang.String, abcd.ME>> {
    final abcd.MK j6;

    LK(abcd.MK r1) {
        this.j6 = r1;
    }

    @Override
    public void clear() {
        abcd.MK.j6(this.j6, abcd.KK.DW());
        abcd.MK.DW(this.j6, abcd.KK.DW());
        abcd.MK.FH(this.j6, abcd.KK.DW());
        abcd.MK.j6(this.j6, 0);
        abcd.MK.j6(this.j6, true);
    }

    @Override
    public boolean isEmpty() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (abcd.MK.Zo(this.j6) == false) { $pc0 = 10; continue $sw0; }
                    if (abcd.MK.j6(this.j6) != 0) { $pc0 = 7; continue $sw0; }
                    return true;
                }
                case 7: {
                    return false;
                }
                case 10: {
                    return !iterator().hasNext();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.ME>> iterator() {
        return new abcd.MK.b(this.j6);
    }

    @Override
    public int size() {
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.ME>> r0 = null;
        abcd.MK r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (abcd.MK.Zo(this.j6) == true) { $pc1 = 10; continue $sw1; }
                    abcd.MK.j6(this.j6, 0);
                    r0 = this.j6.entrySet().iterator();
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r0.hasNext() == false) { $pc1 = 7; continue $sw1; }
                    r1 = this.j6;
                    abcd.MK.j6(r1, abcd.MK.j6(r1) + 1);
                    r0.next();
                    { $pc1 = 6; continue $sw1; }
                }
                case 7: {
                    abcd.MK.j6(this.j6, true);
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    return abcd.MK.j6(this.j6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
