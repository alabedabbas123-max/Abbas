package abcd;

public final class Nr implements abcd.Interfacecu {
    private final abcd.Ur DW;
    private final abcd.au FH;
    private final int Hw;
    private final int j6;

    public interface a {
        void j6(abcd.Nr r1);
    }

    public Nr(int r5, abcd.Ur r6, abcd.au r7, int r8) {
        if (r5 < 0) goto L39;
        r6.Ws();     // Catch: java.lang.NullPointerException -> L36
        int r0 = r6.size();
        if (r0 == 0) goto L35;
        int r1 = r0 - 2;
    L9:
        if (r1 < 0) goto L16;
        if (r6.get(r1).v5().DW() != 1) goto L14;
        r1 = r1 - 1;
        goto L9
    L14:
        throw new java.lang.IllegalArgumentException("insns[" + r1 + "] is a branch or can throw");
    L16:
        if (r6.get(r0 - 1).v5().DW() == 1) goto L33;
        r7.Ws();     // Catch: java.lang.NullPointerException -> L30
        if (r8 < (-1)) goto L29;
        if (r8 >= 0) goto L22;
    L26:
        this.j6 = r5;
        this.DW = r6;
        this.FH = r7;
        this.Hw = r8;
        return;
    L22:
        if (r7.Hw(r8) == true) goto L26;
        throw new java.lang.IllegalArgumentException("primarySuccessor " + r8 + " not in successors " + r7);
    L29:
        throw new java.lang.IllegalArgumentException("primarySuccessor < -1");
    L31:
        throw new java.lang.NullPointerException("successors == null");
    L33:
        throw new java.lang.IllegalArgumentException("insns does not end with a branch or throwing instruction");
    L35:
        throw new java.lang.IllegalArgumentException("insns.size() == 0");
    L37:
        throw new java.lang.NullPointerException("insns == null");
    L39:
        throw new java.lang.IllegalArgumentException("label < 0");
    }

    @Override
    public int DW() {
        return this.j6;
    }

    public abcd.Tr FH() {
        return this.DW.get(0);
    }

    public abcd.Ur Hw() {
        return this.DW;
    }

    public int VH() {
        if (this.FH.size() != 2) goto L9;
        int r0 = this.FH.get(0);
        if (r0 == this.Hw) goto L7;
        return r0;
    L7:
        return this.FH.get(1);
    L9:
        throw new java.lang.UnsupportedOperationException("block doesn't have exactly two successors");
    }

    public int Zo() {
        return this.Hw;
    }

    public boolean equals(java.lang.Object r1) {
        if (this != r1) goto L4;
        return true;
    L4:
        return false;
    }

    public abcd.au gn() {
        return this.FH;
    }

    public int hashCode() {
        return java.lang.System.identityHashCode(this);
    }

    public boolean j6() {
        return this.DW.rN().j6();
    }

    public java.lang.String toString() {
        return '{' + abcd.Yt.v5(this.j6) + '}';
    }

    public boolean u7() {
        if (this.DW.rN().DW().size() == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public abcd.Tr v5() {
        return this.DW.rN();
    }
}
