package abcd;

class fp implements java.util.Comparator<abcd.io.a> {
    final abcd.hp j6;

    fp(abcd.hp r1) {
        this.j6 = r1;
    }

    @Override
    public int compare(abcd.io.a r1, abcd.io.a r2) {
        return j6(r1, r2);
    }

    @Override
    public boolean equals(java.lang.Object r1) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1 != this) { $pc0 = 4; continue $sw0; }
                    return true;
                }
                case 4: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(abcd.io.a r1, abcd.io.a r2) {
        return r1.j6() - r2.j6();
    }
}
