package abcd;

public abstract class AbstractzI {
    abcd.HJ DW;
    final java.util.SortedMap<java.lang.String, abcd.C0773gJ> FH;
    java.lang.StringBuilder Hw;
    java.util.Map<java.lang.String, abcd.ME> j6;

    public AbstractzI() {
        this.j6 = java.util.Collections.emptyMap();
        this.FH = new java.util.TreeMap();
    }

    public final abcd.ME DW(java.lang.String r2) {
        return this.j6.get(r2);
    }

    public java.lang.String DW() {
        java.lang.StringBuilder r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.Hw;
                    if (r0 != null) { $pc0 = 7; continue $sw0; }
                    return "";
                }
                case 7: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.Collection<abcd.ME> j6() {
        return java.util.Collections.unmodifiableCollection(this.j6.values());
    }

    void j6(abcd.HJ r1, java.util.Map<java.lang.String, abcd.ME> r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    void j6(abcd.C0773gJ r3) {
        this.FH.put(r3.j6(), r3);
    }

    void j6(java.lang.String r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r2 != null) { $pc1 = 4; continue $sw1; }
                    return;
                }
                case 4: {
                    if (r2.length() > 0) { $pc1 = 6; continue $sw1; }
                    return;
                }
                case 6: {
                    if (this.Hw != null) { $pc1 = 8; continue $sw1; }
                    this.Hw = new java.lang.StringBuilder();
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    this.Hw.append(r2);
                    if (r2.endsWith("\n") == true) { $pc1 = 14; continue $sw1; }
                    this.Hw.append('\n');
                    return;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
