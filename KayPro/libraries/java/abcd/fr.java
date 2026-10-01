package abcd;

public final class fr implements java.lang.Comparable<abcd.fr> {
    public static final abcd.fr j6 = null;
    private final abcd.iq DW;
    private final short[] FH;

    static {
        j6 = new abcd.fr(null, new short[0]);
    }

    public fr(abcd.iq r1, short[] r2) {
        this.DW = r1;
        this.FH = r2;
    }

    public short[] Hw() {
        return this.FH;
    }

    @Override
    public int compareTo(abcd.fr r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L9;
        return false;
    L9:
        if (abcd.fr.class == r5.getClass()) goto L12;
        return false;
    L12:
        if (java.util.Arrays.equals(this.FH, ((abcd.fr) r5).FH) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return 31 + java.util.Arrays.hashCode(this.FH);
    }

    public int j6(abcd.fr r6) {
        int r0 = 0;
    L3:
        short[] r1 = this.FH;
        if (r0 >= r1.length) goto L13;
        short[] r2 = r6.FH;
        if (r0 >= r2.length) goto L13;
        if (r1[r0] != r2[r0]) goto L10;
        r0 = r0 + 1;
        goto L3
    L10:
        return abcd.nu.j6(r1[r0], r2[r0]);
    L13:
        return abcd.nu.j6(this.FH.length, r6.FH.length);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append("(");
        int r1 = this.FH.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        abcd.iq r3 = this.DW;
        if (r3 == null) goto L7;
        java.lang.Object r4 = r3.Hw().get(this.FH[r2]);
    L8:
        r0.append(r4);
        r2 = r2 + 1;
        goto L3
    L7:
        r4 = java.lang.Short.valueOf(this.FH[r2]);
        goto L8
    L9:
        r0.append(")");
        return r0.toString();
    }
}
