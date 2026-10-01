package abcd;

class wt implements abcd.Abstractvt.a {
    final abcd.yt j6;

    wt(abcd.yt r1) {
        this.j6 = r1;
    }

    @Override
    public void DW(abcd.mt r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3.u7() == null) { $pc0 = 6; continue $sw0; }
                    abcd.yt.j6(this.j6)[r3.u7().we()] = r3;
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
    public void j6(abcd.mt r3) {
        abcd.yt.j6(this.j6)[r3.u7().we()] = r3;
    }

    @Override
    public void j6(abcd.ot r3) {
        abcd.yt.j6(this.j6)[r3.u7().we()] = r3;
    }
}
