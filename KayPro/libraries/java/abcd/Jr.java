package abcd;

public final class Jr extends abcd.hu implements java.lang.Comparable<abcd.Jr> {
    public static final abcd.Jr DW = null;
    private final java.util.TreeMap<abcd.Ks, abcd.Hr> FH;

    static {
        DW = new abcd.Jr();
        DW.we();
    }

    public Jr() {
        this.FH = new java.util.TreeMap();
    }

    public static abcd.Jr j6(abcd.Jr r1, abcd.Hr r2) {
        abcd.Jr r0 = new abcd.Jr();
        r0.j6(r1);
        r0.j6(r2);
        r0.we();
        return r0;
    }

    public static abcd.Jr j6(abcd.Jr r1, abcd.Jr r2) {
        abcd.Jr r0 = new abcd.Jr();
        r0.j6(r1);
        r0.j6(r2);
        r0.we();
        return r0;
    }

    public int DW(abcd.Jr r4) {
        java.util.Iterator<abcd.Hr> r0 = null;
        java.util.Iterator<abcd.Hr> r5 = null;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.FH.values().iterator();
                    r5 = r4.FH.values().iterator();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc0 = 11; continue $sw0; }
                    if (r5.hasNext() == false) { $pc0 = 11; continue $sw0; }
                    r1 = r0.next().j6(r5.next());
                    if (r1 == 0) { $pc0 = 4; continue $sw0; }
                    return r1;
                }
                case 11: {
                    if (r0.hasNext() == false) { $pc0 = 15; continue $sw0; }
                    return 1;
                }
                case 15: {
                    if (r5.hasNext() == false) { $pc0 = 18; continue $sw0; }
                    return -1;
                }
                case 18: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int compareTo(abcd.Jr r1) {
        return DW(r1);
    }

    public boolean equals(java.lang.Object r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r2 instanceof abcd.Jr) == true) { $pc1 = 7; continue $sw1; }
                    return false;
                }
                case 7: {
                    return this.FH.equals(((abcd.Jr) r2).FH);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return this.FH.hashCode();
    }

    public void j6(abcd.Hr r4) {
        abcd.Ks r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    J8();
                    if (r4 == null) { $pc2 = 11; continue $sw2; }
                    r0 = r4.getType();
                    if (this.FH.containsKey(r0) == true) { $pc2 = 9; continue $sw2; }
                    this.FH.put(r0, r4);
                    return;
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException("duplicate type: " + r0.aM());
                }
                case 11: {
                    throw new java.lang.NullPointerException("annotation == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.Jr r2) {
        java.util.Iterator<abcd.Hr> r3 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    J8();
                    if (r2 == null) { $pc3 = 10; continue $sw3; }
                    r3 = r2.FH.values().iterator();
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    if (r3.hasNext() == false) { $pc3 = 8; continue $sw3; }
                    j6(r3.next());
                    { $pc3 = 6; continue $sw3; }
                }
                case 8: {
                    return;
                }
                case 10: {
                    throw new java.lang.NullPointerException("toAdd == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.Collection<abcd.Hr> lg() {
        return java.util.Collections.unmodifiableCollection(this.FH.values());
    }

    public int size() {
        return this.FH.size();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        java.util.Iterator<abcd.Hr> r1 = null;
        boolean r2 = false;
        abcd.Hr r3 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append("annotations{");
                    r1 = this.FH.values().iterator();
                    r2 = true;
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc4 = 10; continue $sw4; }
                    r3 = r1.next();
                    if (r2 == false) { $pc4 = 8; continue $sw4; }
                    r2 = false;
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    r0.append(r3.aM());
                    { $pc4 = 4; continue $sw4; }
                }
                case 8: {
                    r0.append(", ");
                    { $pc4 = 9; continue $sw4; }
                }
                case 10: {
                    r0.append("}");
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
