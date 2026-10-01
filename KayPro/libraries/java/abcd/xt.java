package abcd;

class xt implements abcd.Abstractvt.a {
    final abcd.yt j6;

    xt(abcd.yt r1) {
        this.j6 = r1;
    }

    private void j6(abcd.Abstractvt r6) {
        abcd.cs r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r6.tp();
                    r1 = r0.size();
                    r2 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r2 >= r1) { $pc0 = 5; continue $sw0; }
                    abcd.yt.DW(this.j6)[r0.get(r2).we()].add(r6);
                    r2 = r2 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void DW(abcd.mt r1) {
        j6(r1);
    }

    @Override
    public void j6(abcd.mt r1) {
        j6(r1);
    }

    @Override
    public void j6(abcd.ot r1) {
        j6(r1);
    }
}
