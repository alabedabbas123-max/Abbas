package abcd;

public abstract class AbstractvG extends abcd.AbstractyG {

    private static class a extends abcd.AbstractvG {
        private final boolean VH;
        private final abcd.AbstractyG Zo;
        private final abcd.AbstractyG v5;

        a(abcd.AbstractyG r1, abcd.AbstractyG r2) {
            boolean r3 = false;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        this.v5 = r1;
                        this.Zo = r2;
                        if (this.v5.j6() == false) { $pc0 = 5; continue $sw0; }
                        $pc0 = 7; continue $sw0;
                    }
                    case 7: {
                        r3 = true;
                        $pc0 = 8; continue $sw0;
                    }
                    case 8: {
                        this.VH = r3;
                        return;
                    }
                    case 5: {
                        if (this.Zo.j6() == true) { $pc0 = 7; continue $sw0; }
                        r3 = false;
                        { $pc0 = 8; continue $sw0; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public abcd.AbstractyG clone() {
            return new abcd.AbstractvG.a(this.v5.clone(), this.Zo.clone());
        }

        @Override
        public boolean j6() {
            return this.VH;
        }

        @Override
        public boolean j6(abcd.qG r2, abcd.dG r3) {
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (this.v5.j6(r2, r3) == true) { $pc1 = 5; continue $sw1; }
                        return false;
                    }
                    case 5: {
                        if (this.Zo.j6(r2, r3) == false) { $pc1 = 10; continue $sw1; }
                        return true;
                    }
                    case 10: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public java.lang.String toString() {
            return "(" + this.v5.toString() + " AND " + this.Zo.toString() + ")";
        }
    }

    public AbstractvG() {
    }

    public static abcd.AbstractyG j6(abcd.AbstractyG r1, abcd.AbstractyG r2) {
        abcd.AbstractyG r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = abcd.AbstractyG.j6;
                    if (r1 != r0) { $pc2 = 5; continue $sw2; }
                    return r2;
                }
                case 5: {
                    if (r2 != r0) { $pc2 = 8; continue $sw2; }
                    return r1;
                }
                case 8: {
                    return new abcd.AbstractvG.a(r1, r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
