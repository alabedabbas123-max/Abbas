package abcd;

public abstract class DC<S extends abcd.CC> {
    public DC() {
    }

    public abstract int j6(S r1, int r2);

    public abcd.jC j6(S r4, S r5, abcd.jC r6) {
    L2:
        int r0 = r6.j6;
        if (r0 >= r6.DW) goto L10;
        int r1 = r6.FH;
        if (r1 >= r6.Hw) goto L10;
        if (j6(r4, r0, r5, r1) == false) goto L10;
        r6.j6++;
        r6.FH++;
    L10:
        int r2 = r6.j6;
        int r3 = r6.DW;
        if (r2 >= r3) goto L18;
        int r7 = r6.FH;
        int r8 = r6.Hw;
        if (r7 >= r8) goto L18;
        if (j6(r4, r3 - 1, r5, r8 - 1) == false) goto L18;
        r6.DW--;
        r6.Hw--;
    L18:
        return r6;
    }

    public abstract boolean j6(S r1, int r2, S r3, int r4);
}
