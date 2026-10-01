package abcd;

public abstract class AbstractwG extends abcd.AbstractyG {
    final int v5;

    private static class a extends abcd.AbstractwG {
        a(long r1) {
            super(r1);
        }

        @Override
        public boolean j6(abcd.qG r1, abcd.dG r2) {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (r2.U2() < this.v5) { $pc0 = 7; continue $sw0; }
                        return true;
                    }
                    case 7: {
                        throw abcd.sD.j6;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public java.lang.String toString() {
            return java.lang.String.valueOf(super.toString()) + "(" + new java.util.Date(((long) this.v5) * 1000) + ")";
        }
    }

    AbstractwG(long r3) {
        this.v5 = (int) (r3 / 1000);
    }

    public static final abcd.AbstractyG j6(long r1) {
        return new abcd.AbstractwG.a(r1);
    }

    public static final abcd.AbstractyG j6(java.util.Date r2) {
        return j6(r2.getTime());
    }

    @Override
    public abcd.AbstractyG clone() {
        return this;
    }

    @Override
    public boolean j6() {
        return false;
    }
}
