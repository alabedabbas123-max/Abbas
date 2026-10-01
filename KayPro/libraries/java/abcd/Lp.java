package abcd;

public final class Lp {
    private final java.util.HashMap<java.lang.String, abcd.Lp.a> j6;

    private static class a {
        private int DW;
        private int FH;
        private int Hw;
        private final java.lang.String j6;
        private int v5;

        public a(abcd.Abstractvp r1, java.lang.String r2) {
            int r3 = r1.VH();
            this.j6 = r2;
            this.DW = 1;
            this.FH = r3;
            this.Hw = r3;
            this.v5 = r3;
        }

        static java.lang.String j6(abcd.Lp.a r0) {
            return r0.j6;
        }

        public java.lang.String j6() {
            java.lang.StringBuilder r0 = null;
            java.lang.StringBuilder r1 = null;
            java.lang.String r2 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = new java.lang.StringBuilder();
                        r1 = new java.lang.StringBuilder();
                        r1.append("  ");
                        r1.append(this.j6);
                        r1.append(": ");
                        r1.append(this.DW);
                        r1.append(" item");
                        if (this.DW != 1) { $pc0 = 5; continue $sw0; }
                        r2 = "";
                        $pc0 = 6; continue $sw0;
                    }
                    case 6: {
                        r1.append(r2);
                        r1.append("; ");
                        r1.append(this.FH);
                        r1.append(" bytes total\n");
                        r0.append(r1.toString());
                        if (this.v5 != this.Hw) { $pc0 = 9; continue $sw0; }
                        r0.append("    " + this.v5 + " bytes/item\n");
                        $pc0 = 11; continue $sw0;
                    }
                    case 11: {
                        return r0.toString();
                    }
                    case 9: {
                        r0.append("    " + this.v5 + ".." + this.Hw + " bytes/item; average " + (this.FH / this.DW) + "\n");
                        { $pc0 = 11; continue $sw0; }
                    }
                    case 5: {
                        r2 = "s";
                        { $pc0 = 6; continue $sw0; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public void j6(abcd.Lt r2) {
            r2.j6(j6());
        }

        public void j6(abcd.Abstractvp r2) {
            int r3 = 0;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r3 = r2.VH();
                        this.DW++;
                        this.FH += r3;
                        if (r3 <= this.Hw) { $pc1 = 6; continue $sw1; }
                        this.Hw = r3;
                        $pc1 = 6; continue $sw1;
                    }
                    case 6: {
                        if (r3 >= this.v5) { $pc1 = 9; continue $sw1; }
                        this.v5 = r3;
                        return;
                    }
                    case 9: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public Lp() {
        this.j6 = new java.util.HashMap(50);
    }

    public void j6(abcd.AbstractKp r2) {
        java.util.Iterator<? extends abcd.Abstractvp> r3 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r3 = r2.Hw().iterator();
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r3.hasNext() == false) { $pc2 = 6; continue $sw2; }
                    j6(r3.next());
                    { $pc2 = 4; continue $sw2; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final void j6(abcd.Lt r5) {
        java.util.TreeMap r0 = null;
        java.util.Iterator<abcd.Lp.a> r1 = null;
        abcd.Lp.a r2 = null;
        java.util.Iterator r3 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.j6.size() != 0) { $pc3 = 5; continue $sw3; }
                    return;
                }
                case 5: {
                    r5.j6(0, "\nstatistics:\n");
                    r0 = new java.util.TreeMap();
                    r1 = this.j6.values().iterator();
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (r1.hasNext() == false) { $pc3 = 9; continue $sw3; }
                    r2 = r1.next();
                    r0.put(abcd.Lp.a.j6(r2), r2);
                    { $pc3 = 7; continue $sw3; }
                }
                case 9: {
                    r3 = r0.values().iterator();
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    if (r3.hasNext() == false) { $pc3 = 13; continue $sw3; }
                    ((abcd.Lp.a) r3.next()).j6(r5);
                    { $pc3 = 11; continue $sw3; }
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.Abstractvp r4) {
        java.lang.String r0 = null;
        abcd.Lp.a r1 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = r4.Zo();
                    r1 = this.j6.get(r0);
                    if (r1 != null) { $pc4 = 5; continue $sw4; }
                    this.j6.put(r0, new abcd.Lp.a(r4, r0));
                    return;
                }
                case 5: {
                    r1.j6(r4);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
