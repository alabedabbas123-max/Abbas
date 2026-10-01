package abcd;

class LP implements abcd.AP {
    final abcd.MP j6;

    LP(abcd.MP r1) {
        this.j6 = r1;
    }

    @Override
    public abcd.InterfacezP j6(abcd.wN r4) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    return new abcd.KP(this, r4, new abcd.MP.a(this.j6, abcd.MP.j6(this.j6).j6(r4)));
                }
                case 5: {
                    e = $ex0;
                    throw new abcd.BP("exception on setup: " + e, e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
