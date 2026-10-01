package abcd;

public class ClassS<F, S> {
    public final S DW;
    public final F j6;

    public ClassS(F r1, S r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    private static boolean j6(java.lang.Object r0, java.lang.Object r1) {
        if (r0 == r1) goto L8;
        if (r0 != null) goto L5;
    L7:
        return false;
    L5:
        if (r0.equals(r1) == false) goto L7;
    L8:
        return true;
    }

    public boolean equals(java.lang.Object r4) {
        if ((r4 instanceof abcd.ClassS) == true) goto L5;
        return false;
    L5:
        abcd.ClassS r5 = (abcd.ClassS) r4;
        if (j6(r5.j6, this.j6) == true) goto L8;
        return false;
    L8:
        if (j6(r5.DW, this.DW) == false) goto L12;
        return true;
    L12:
        return false;
    }

    public int hashCode() {
        F r0 = this.j6;
        int r1 = 0;
        if (r0 != null) goto L5;
        int r2 = 0;
    L6:
        S r3 = this.DW;
        if (r3 == null) goto L11;
        r1 = r3.hashCode();
    L11:
        return r2 ^ r1;
    L5:
        r2 = r0.hashCode();
        goto L6
    }

    public java.lang.String toString() {
        return "Pair{" + java.lang.String.valueOf(this.j6) + " " + java.lang.String.valueOf(this.DW) + "}";
    }
}
