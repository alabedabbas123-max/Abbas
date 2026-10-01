package abcd;

public final class Ls extends abcd.hu implements abcd.Interfacens {
    private final abcd.Abstractms[] DW;

    public Ls(int r3) {
        if (r3 <= 1) goto L5;
        boolean r1 = true;
    L6:
        super(r1);
        if (r3 < 1) goto L11;
        this.DW = new abcd.Abstractms[r3];
        return;
    L11:
        throw new java.lang.IllegalArgumentException("size < 1");
    L5:
        r1 = false;
        goto L6
    }

    private static abcd.Abstractms FH(int r3) {
        throw new abcd.Vt("invalid constant pool index " + abcd.Yt.v5(r3));
    }

    public abcd.Abstractms DW(int r2) {
        return this.DW[r2];
    L4:
        FH(r2);
        throw null;
    }

    @Override
    public abcd.Abstractms get(int r3) {
        abcd.Abstractms r1 = this.DW[r3];     // Catch: java.lang.IndexOutOfBoundsException -> L8
        if (r1 == null) goto L6;
        return r1;
    L6:
        FH(r3);     // Catch: java.lang.IndexOutOfBoundsException -> L8
        throw null;
    L8:
        FH(r3);
        throw null;
    }

    @Override
    public abcd.Abstractms j6(int r1) {
        if (r1 != 0) goto L6;
        return null;
    L6:
        return get(r1);
    }

    public void j6(int r5, abcd.Abstractms r6) {
        J8();
        if (r6 != null) goto L5;
    L7:
        boolean r1 = false;
    L8:
        if (r5 < 1) goto L27;
        if (r1 == false) goto L16;
        abcd.Abstractms[] r2 = this.DW;
        if (r5 == (r2.length - 1)) goto L15;
        r2[r5 + 1] = null;
        goto L16
    L15:
        throw new java.lang.IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
    L16:
        if (r6 == null) goto L24;
        abcd.Abstractms[] r0 = this.DW;
        if (r0[r5] != null) goto L24;
        int r3 = r5 - 1;
        abcd.Abstractms r4 = r0[r3];
        if (r4 == null) goto L24;
        if (r4.Hw() == false) goto L24;
        this.DW[r3] = null;
    L24:
        this.DW[r5] = r6;
        return;
    L27:
        throw new java.lang.IllegalArgumentException("n < 1");
    L5:
        if (r6.Hw() == false) goto L7;
        r1 = true;
        goto L8
    }
}
