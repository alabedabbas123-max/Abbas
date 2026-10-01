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
        java.util.Iterator<abcd.Hr> r0 = this.FH.values().iterator();
        java.util.Iterator<abcd.Hr> r5 = r4.FH.values().iterator();
    L4:
        if (r0.hasNext() == false) goto L11;
        if (r5.hasNext() == false) goto L11;
        int r1 = r0.next().j6(r5.next());
        if (r1 == 0) goto L4;
        return r1;
    L11:
        if (r0.hasNext() == false) goto L15;
        return 1;
    L15:
        if (r5.hasNext() == false) goto L18;
        return -1;
    L18:
        return 0;
    }

    @Override
    public int compareTo(abcd.Jr r1) {
        return DW(r1);
    }

    public boolean equals(java.lang.Object r2) {
        if ((r2 instanceof abcd.Jr) == true) goto L7;
        return false;
    L7:
        return this.FH.equals(((abcd.Jr) r2).FH);
    }

    public int hashCode() {
        return this.FH.hashCode();
    }

    public void j6(abcd.Hr r4) {
        J8();
        if (r4 == null) goto L11;
        abcd.Ks r0 = r4.getType();
        if (this.FH.containsKey(r0) == true) goto L9;
        this.FH.put(r0, r4);
        return;
    L9:
        throw new java.lang.IllegalArgumentException("duplicate type: " + r0.aM());
    L11:
        throw new java.lang.NullPointerException("annotation == null");
    }

    public void j6(abcd.Jr r2) {
        J8();
        if (r2 == null) goto L10;
        java.util.Iterator<abcd.Hr> r3 = r2.FH.values().iterator();
    L6:
        if (r3.hasNext() == false) goto L8;
        j6(r3.next());
        goto L6
    L8:
        return;
    L10:
        throw new java.lang.NullPointerException("toAdd == null");
    }

    public java.util.Collection<abcd.Hr> lg() {
        return java.util.Collections.unmodifiableCollection(this.FH.values());
    }

    public int size() {
        return this.FH.size();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append("annotations{");
        java.util.Iterator<abcd.Hr> r1 = this.FH.values().iterator();
        boolean r2 = true;
    L4:
        if (r1.hasNext() == false) goto L10;
        abcd.Hr r3 = r1.next();
        if (r2 == false) goto L8;
        r2 = false;
    L9:
        r0.append(r3.aM());
        goto L4
    L8:
        r0.append(", ");
        goto L9
    L10:
        r0.append("}");
        return r0.toString();
    }
}
