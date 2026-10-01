package abcd;

public final class Hr extends abcd.hu implements java.lang.Comparable<abcd.Hr>, abcd.Interfacelu {
    private final abcd.Ks DW;
    private final abcd.Ir FH;
    private final java.util.TreeMap<abcd.Js, abcd.Lr> Hw;

    public Hr(abcd.Ks r1, abcd.Ir r2) {
        if (r1 == null) goto L10;
        if (r2 == null) goto L8;
        this.DW = r1;
        this.FH = r2;
        this.Hw = new java.util.TreeMap();
        return;
    L8:
        throw new java.lang.NullPointerException("visibility == null");
    L10:
        throw new java.lang.NullPointerException("type == null");
    }

    public void DW(abcd.Lr r3) {
        J8();
        if (r3 == null) goto L7;
        this.Hw.put(r3.Hw(), r3);
        return;
    L7:
        throw new java.lang.NullPointerException("pair == null");
    }

    @Override
    public java.lang.String aM() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append(this.FH.aM());
        r0.append("-annotation ");
        r0.append(this.DW.aM());
        r0.append(" {");
        java.util.Iterator<abcd.Lr> r1 = this.Hw.values().iterator();
        boolean r2 = true;
    L4:
        if (r1.hasNext() == false) goto L10;
        abcd.Lr r3 = r1.next();
        if (r2 == false) goto L8;
        r2 = false;
    L9:
        r0.append(r3.Hw().aM());
        r0.append(": ");
        r0.append(r3.Zo().aM());
        goto L4
    L8:
        r0.append(", ");
        goto L9
    L10:
        r0.append("}");
        return r0.toString();
    }

    @Override
    public int compareTo(abcd.Hr r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r4) {
        if ((r4 instanceof abcd.Hr) == true) goto L5;
        return false;
    L5:
        abcd.Hr r5 = (abcd.Hr) r4;
        if (this.DW.equals(r5.DW) == true) goto L8;
    L12:
        return false;
    L8:
        if (this.FH != r5.FH) goto L12;
        return this.Hw.equals(r5.Hw);
    }

    public abcd.Ks getType() {
        return this.DW;
    }

    public int hashCode() {
        return (((this.DW.hashCode() * 31) + this.Hw.hashCode()) * 31) + this.FH.hashCode();
    }

    public int j6(abcd.Hr r4) {
        int r0 = this.DW.j6(r4.DW);
        if (r0 == 0) goto L5;
        return r0;
    L5:
        int r1 = this.FH.compareTo(r4.FH);
        if (r1 == 0) goto L8;
        return r1;
    L8:
        java.util.Iterator<abcd.Lr> r2 = this.Hw.values().iterator();
        java.util.Iterator<abcd.Lr> r5 = r4.Hw.values().iterator();
    L10:
        if (r2.hasNext() == false) goto L17;
        if (r5.hasNext() == false) goto L17;
        int r3 = r2.next().j6(r5.next());
        if (r3 == 0) goto L10;
        return r3;
    L17:
        if (r2.hasNext() == false) goto L21;
        return 1;
    L21:
        if (r5.hasNext() == false) goto L24;
        return -1;
    L24:
        return 0;
    }

    public void j6(abcd.Lr r4) {
        J8();
        if (r4 == null) goto L11;
        abcd.Js r0 = r4.Hw();
        if (this.Hw.get(r0) != null) goto L9;
        this.Hw.put(r0, r4);
        return;
    L9:
        throw new java.lang.IllegalArgumentException("name already added: " + r0);
    L11:
        throw new java.lang.NullPointerException("pair == null");
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
