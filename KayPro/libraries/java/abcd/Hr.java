package abcd;

public final class Hr extends abcd.hu implements java.lang.Comparable<abcd.Hr>, abcd.Interfacelu {
    private final abcd.Ks DW;
    private final abcd.Ir FH;
    private final java.util.TreeMap<abcd.Js, abcd.Lr> Hw;

    public Hr(abcd.Ks r1, abcd.Ir r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1 == null) { $pc0 = 10; continue $sw0; }
                    if (r2 == null) { $pc0 = 8; continue $sw0; }
                    this.DW = r1;
                    this.FH = r2;
                    this.Hw = new java.util.TreeMap();
                    return;
                }
                case 8: {
                    throw new java.lang.NullPointerException("visibility == null");
                }
                case 10: {
                    throw new java.lang.NullPointerException("type == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(abcd.Lr r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    J8();
                    if (r3 == null) { $pc1 = 7; continue $sw1; }
                    this.Hw.put(r3.Hw(), r3);
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("pair == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String aM() {
        java.lang.StringBuilder r0 = null;
        java.util.Iterator<abcd.Lr> r1 = null;
        boolean r2 = false;
        abcd.Lr r3 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append(this.FH.aM());
                    r0.append("-annotation ");
                    r0.append(this.DW.aM());
                    r0.append(" {");
                    r1 = this.Hw.values().iterator();
                    r2 = true;
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc2 = 10; continue $sw2; }
                    r3 = r1.next();
                    if (r2 == false) { $pc2 = 8; continue $sw2; }
                    r2 = false;
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    r0.append(r3.Hw().aM());
                    r0.append(": ");
                    r0.append(r3.Zo().aM());
                    { $pc2 = 4; continue $sw2; }
                }
                case 8: {
                    r0.append(", ");
                    { $pc2 = 9; continue $sw2; }
                }
                case 10: {
                    r0.append("}");
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int compareTo(abcd.Hr r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r4) {
        abcd.Hr r5 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if ((r4 instanceof abcd.Hr) == true) { $pc3 = 5; continue $sw3; }
                    return false;
                }
                case 5: {
                    r5 = (abcd.Hr) r4;
                    if (this.DW.equals(r5.DW) == true) { $pc3 = 8; continue $sw3; }
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    return false;
                }
                case 8: {
                    if (this.FH != r5.FH) { $pc3 = 12; continue $sw3; }
                    return this.Hw.equals(r5.Hw);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Ks getType() {
        return this.DW;
    }

    public int hashCode() {
        return (((this.DW.hashCode() * 31) + this.Hw.hashCode()) * 31) + this.FH.hashCode();
    }

    public int j6(abcd.Hr r4) {
        int r0 = 0;
        int r1 = 0;
        java.util.Iterator<abcd.Lr> r2 = null;
        java.util.Iterator<abcd.Lr> r5 = null;
        int r3 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.DW.j6(r4.DW);
                    if (r0 == 0) { $pc4 = 5; continue $sw4; }
                    return r0;
                }
                case 5: {
                    r1 = this.FH.compareTo(r4.FH);
                    if (r1 == 0) { $pc4 = 8; continue $sw4; }
                    return r1;
                }
                case 8: {
                    r2 = this.Hw.values().iterator();
                    r5 = r4.Hw.values().iterator();
                    $pc4 = 10; continue $sw4;
                }
                case 10: {
                    if (r2.hasNext() == false) { $pc4 = 17; continue $sw4; }
                    if (r5.hasNext() == false) { $pc4 = 17; continue $sw4; }
                    r3 = r2.next().j6(r5.next());
                    if (r3 == 0) { $pc4 = 10; continue $sw4; }
                    return r3;
                }
                case 17: {
                    if (r2.hasNext() == false) { $pc4 = 21; continue $sw4; }
                    return 1;
                }
                case 21: {
                    if (r5.hasNext() == false) { $pc4 = 24; continue $sw4; }
                    return -1;
                }
                case 24: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.Lr r4) {
        abcd.Js r0 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    J8();
                    if (r4 == null) { $pc5 = 11; continue $sw5; }
                    r0 = r4.Hw();
                    if (this.Hw.get(r0) != null) { $pc5 = 9; continue $sw5; }
                    this.Hw.put(r0, r4);
                    return;
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException("name already added: " + r0);
                }
                case 11: {
                    throw new java.lang.NullPointerException("pair == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.Collection<abcd.Lr> lg() {
        return java.util.Collections.unmodifiableCollection(this.Hw.values());
    }

    public abcd.Ir rN() {
        return this.FH;
    }

    public java.lang.String toString() {
        return aM();
    }
}
