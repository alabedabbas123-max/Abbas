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
        java.lang.StringBuilder r0 = this.Hw;
        if (r0 != null) goto L7;
        return "";
    L7:
        return r0.toString();
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
        if (r2 != null) goto L4;
        return;
    L4:
        if (r2.length() > 0) goto L6;
        return;
    L6:
        if (this.Hw != null) goto L8;
        this.Hw = new java.lang.StringBuilder();
    L8:
        this.Hw.append(r2);
        if (r2.endsWith("\n") == true) goto L14;
        this.Hw.append('\n');
        return;
    }
}
