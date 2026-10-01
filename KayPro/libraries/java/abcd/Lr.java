package abcd;

public final class Lr implements java.lang.Comparable<abcd.Lr> {
    private final abcd.Abstractms DW;
    private final abcd.Js j6;

    public Lr(abcd.Js r1, abcd.Abstractms r2) {
        if (r1 == null) goto L10;
        if (r2 == null) goto L8;
        this.j6 = r1;
        this.DW = r2;
        return;
    L8:
        throw new java.lang.NullPointerException("value == null");
    L10:
        throw new java.lang.NullPointerException("name == null");
    }

    public abcd.Js Hw() {
        return this.j6;
    }

    public abcd.Abstractms Zo() {
        return this.DW;
    }

    @Override
    public int compareTo(abcd.Lr r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r4) {
        if ((r4 instanceof abcd.Lr) == true) goto L5;
        return false;
    L5:
        abcd.Lr r5 = (abcd.Lr) r4;
        if (this.j6.equals(r5.j6) == true) goto L8;
        return false;
    L8:
        if (this.DW.equals(r5.DW) == false) goto L12;
        return true;
    L12:
        return false;
    }

    public int hashCode() {
        return (this.j6.hashCode() * 31) + this.DW.hashCode();
    }

    public int j6(abcd.Lr r3) {
        int r0 = this.j6.j6(r3.j6);
        if (r0 == 0) goto L6;
        return r0;
    L6:
        return this.DW.j6(r3.DW);
    }

    public java.lang.String toString() {
        return this.j6.aM() + ":" + this.DW;
    }
}
