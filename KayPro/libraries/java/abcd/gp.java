package abcd;

class gp implements java.util.Comparator<abcd.co.b> {
    final abcd.hp j6;

    gp(abcd.hp r1) {
        this.j6 = r1;
    }

    @Override
    public int compare(abcd.co.b r1, abcd.co.b r2) {
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

    public int j6(abcd.co.b r1, abcd.co.b r2) {
        return r1.we() - r2.we();
    }
}
