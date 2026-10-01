package abcd;

public final class Hm implements abcd.Interfacecu {
    private final int DW;
    private final int FH;
    private final abcd.au Hw;
    private final int j6;
    private final abcd.Jm v5;

    public Hm(int r4, int r5, int r6, abcd.au r7, abcd.Jm r8) {
        if (r4 < 0) goto L26;
        if (r5 < 0) goto L24;
        if (r6 <= r5) goto L22;
        if (r7 == null) goto L20;
        int r0 = r7.size();
        int r1 = 0;
    L8:
        if (r1 >= r0) goto L14;
        if (r7.get(r1) < 0) goto L13;
        r1 = r1 + 1;
        goto L8
    L13:
        throw new java.lang.IllegalArgumentException("successors[" + r1 + "] == " + r7.get(r1));
    L14:
        if (r8 == null) goto L18;
        this.j6 = r4;
        this.DW = r5;
        this.FH = r6;
        this.Hw = r7;
        this.v5 = r8;
        return;
    L18:
        throw new java.lang.NullPointerException("catches == null");
    L20:
        throw new java.lang.NullPointerException("targets == null");
    L22:
        throw new java.lang.IllegalArgumentException("end <= start");
    L24:
        throw new java.lang.IllegalArgumentException("start < 0");
    L26:
        throw new java.lang.IllegalArgumentException("label < 0");
    }

    @Override
    public int DW() {
        return this.j6;
    }

    public int FH() {
        return this.FH;
    }

    public int Hw() {
        return this.DW;
    }

    public abcd.Jm j6() {
        return this.v5;
    }

    public java.lang.String toString() {
        return '{' + abcd.Yt.v5(this.j6) + ": " + abcd.Yt.v5(this.DW) + ".." + abcd.Yt.v5(this.FH) + '}';
    }

    public abcd.au v5() {
        return this.Hw;
    }
}
