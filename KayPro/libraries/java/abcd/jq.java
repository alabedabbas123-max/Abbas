package abcd;

public final class jq implements java.lang.Comparable<abcd.jq> {
    private final byte[] j6;

    public jq(byte[] r1) {
        this.j6 = r1;
    }

    public abcd.St Hw() {
        return new abcd.Rt(this.j6);
    }

    @Override
    public int compareTo(abcd.jq r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L9;
        return false;
    L9:
        if (abcd.jq.class == r5.getClass()) goto L12;
        return false;
    L12:
        if (java.util.Arrays.equals(this.j6, ((abcd.jq) r5).j6) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return 31 + java.util.Arrays.hashCode(this.j6);
    }

    public int j6(abcd.jq r7) {
        int r0 = java.lang.Math.min(this.j6.length, r7.j6.length);
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L10;
        byte[] r2 = this.j6;
        byte r3 = r2[r1];
        byte[] r4 = r7.j6;
        if (r3 != r4[r1]) goto L7;
        r1 = r1 + 1;
        goto L3
    L7:
        return (r2[r1] & 255) - (r4[r1] & 255);
    L10:
        return this.j6.length - r7.j6.length;
    }

    public void j6(abcd.hr.a r2) {
        r2.write(this.j6);
    }

    public java.lang.String toString() {
        return java.lang.Integer.toHexString(this.j6[0] & 255) + "...(" + this.j6.length + ")";
    }
}
