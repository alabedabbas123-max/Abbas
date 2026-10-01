package abcd;

public final class ps extends abcd.Abstractms {
    private final abcd.ps.a j6;

    public static final class a extends abcd.Xt implements java.lang.Comparable<abcd.ps.a> {
        public a(int r1) {
            super(r1);
        }

        @Override
        public int compareTo(abcd.ps.a r1) {
            return j6(r1);
        }

        public abcd.Abstractms get(int r1) {
            return (abcd.Abstractms) DW(r1);
        }

        public int j6(abcd.ps.a r8) {
            int r0 = 0;
            int r1 = 0;
            int r2 = 0;
            int r4 = 0;
            int r5 = 0;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = size();
                        r1 = r8.size();
                        if (r0 >= r1) { $pc0 = 5; continue $sw0; }
                        r2 = r0;
                        $pc0 = 6; continue $sw0;
                    }
                    case 6: {
                        r4 = 0;
                        $pc0 = 7; continue $sw0;
                    }
                    case 7: {
                        if (r4 >= r2) { $pc0 = 12; continue $sw0; }
                        r5 = ((abcd.Abstractms) DW(r4)).j6((abcd.Abstractms) r8.DW(r4));
                        if (r5 != 0) { $pc0 = 10; continue $sw0; }
                        r4 = r4 + 1;
                        { $pc0 = 7; continue $sw0; }
                    }
                    case 10: {
                        return r5;
                    }
                    case 12: {
                        if (r0 >= r1) { $pc0 = 15; continue $sw0; }
                        return -1;
                    }
                    case 15: {
                        if (r0 <= r1) { $pc0 = 18; continue $sw0; }
                        return 1;
                    }
                    case 18: {
                        return 0;
                    }
                    case 5: {
                        r2 = r1;
                        { $pc0 = 6; continue $sw0; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public void j6(int r1, abcd.Abstractms r2) {
            j6(r1, r2);
        }
    }

    public ps(abcd.ps.a r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r2 == null) { $pc1 = 7; continue $sw1; }
                    r2.Ws();
                    this.j6 = r2;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("list == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected int DW(abcd.Abstractms r2) {
        return this.j6.j6(((abcd.ps) r2).j6);
    }

    @Override
    public boolean Hw() {
        return false;
    }

    public abcd.ps.a VH() {
        return this.j6;
    }

    @Override
    public java.lang.String Zo() {
        return "array";
    }

    @Override
    public java.lang.String aM() {
        return this.j6.j6("{", ", ", "}");
    }

    public boolean equals(java.lang.Object r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if ((r2 instanceof abcd.ps) == true) { $pc2 = 7; continue $sw2; }
                    return false;
                }
                case 7: {
                    return this.j6.equals(((abcd.ps) r2).j6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return this.j6.hashCode();
    }

    public java.lang.String toString() {
        return this.j6.DW("array{", ", ", "}");
    }
}
