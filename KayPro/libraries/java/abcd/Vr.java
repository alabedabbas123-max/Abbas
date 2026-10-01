package abcd;

public class Vr implements java.lang.Comparable<abcd.Vr> {
    private final abcd.Js DW;
    private final abcd.Js j6;

    private Vr(abcd.Js r1, abcd.Js r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    private static int DW(abcd.Js r0, abcd.Js r1) {
        if (r0 != r1) goto L5;
        return 0;
    L5:
        if (r0 != null) goto L8;
        return -1;
    L8:
        if (r1 != null) goto L12;
        return 1;
    L12:
        return r0.j6(r1);
    }

    public static abcd.Vr j6(abcd.Js r1, abcd.Js r2) {
        if (r1 != null) goto L7;
        if (r2 != null) goto L7;
        return null;
    L7:
        return new abcd.Vr(r1, r2);
    }

    public abcd.Js Hw() {
        return this.j6;
    }

    public abcd.Js Zo() {
        return this.DW;
    }

    @Override
    public int compareTo(abcd.Vr r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r3) {
        if ((r3 instanceof abcd.Vr) == true) goto L6;
        return false;
    L6:
        if (j6((abcd.Vr) r3) != 0) goto L9;
        return true;
    L9:
        return false;
    }

    public int hashCode() {
        abcd.Js r0 = this.j6;
        int r1 = 0;
        if (r0 != null) goto L5;
        int r2 = 0;
    L6:
        int r3 = r2 * 31;
        abcd.Js r4 = this.DW;
        if (r4 == null) goto L11;
        r1 = r4.hashCode();
    L11:
        return r3 + r1;
    L5:
        r2 = r0.hashCode();
        goto L6
    }

    public int j6(abcd.Vr r3) {
        int r0 = DW(this.j6, r3.j6);
        if (r0 == 0) goto L6;
        return r0;
    L6:
        return DW(this.DW, r3.DW);
    }

    public java.lang.String toString() {
        abcd.Js r0 = this.j6;
        if (r0 != null) goto L5;
    L8:
        java.lang.String r1 = "";
        if (this.j6 == null) goto L11;
    L13:
        java.lang.StringBuilder r2 = new java.lang.StringBuilder();
        r2.append("[");
        abcd.Js r3 = this.j6;
        if (r3 != null) goto L16;
        java.lang.String r4 = "";
    L17:
        r2.append(r4);
        r2.append("|");
        abcd.Js r5 = this.DW;
        if (r5 == null) goto L21;
        r1 = r5.lg();
    L21:
        r2.append(r1);
        return r2.toString();
    L16:
        r4 = r3.lg();
        goto L17
    L11:
        if (this.DW != null) goto L13;
        return "";
    L5:
        if (this.DW != null) goto L8;
        return r0.lg();
    }
}
