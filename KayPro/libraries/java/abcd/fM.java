package abcd;

public class fM extends abcd.EL {
    private abcd.wL DW;
    private abcd.EL FH;
    private int Hw;
    private abcd.zL j6;
    private abcd.EL v5;

    public fM(abcd.rL r5) {
        int r0 = 0;
        abcd.EL r1 = j6(r5, 0);
        if ((r1 instanceof abcd.zL) == false) goto L6;
        this.j6 = (abcd.zL) r1;
        r1 = j6(r5, 1);
        r0 = 1;
    L6:
        if ((r1 instanceof abcd.wL) == false) goto L9;
        this.DW = (abcd.wL) r1;
        r0 = r0 + 1;
        r1 = j6(r5, r0);
    L9:
        if ((r1 instanceof abcd.yM) == true) goto L12;
        this.FH = r1;
        r0 = r0 + 1;
        r1 = j6(r5, r0);
    L12:
        if (r5.j6() != (r0 + 1)) goto L20;
        if ((r1 instanceof abcd.yM) == false) goto L18;
        abcd.yM r2 = (abcd.yM) r1;
        j6(r2.tp());
        this.v5 = r2.u7();
        return;
    L18:
        throw new java.lang.IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
    L20:
        throw new java.lang.IllegalArgumentException("input vector too large");
    }

    private abcd.EL j6(abcd.rL r2, int r3) {
        if (r2.j6() <= r3) goto L7;
        return r2.j6(r3).DW();
    L7:
        throw new java.lang.IllegalArgumentException("too few objects in input vector");
    }

    private void j6(int r4) {
        if (r4 < 0) goto L8;
        if (r4 > 2) goto L8;
        this.Hw = r4;
        return;
    L8:
        throw new java.lang.IllegalArgumentException("invalid encoding value: " + r4);
    }

    public int EQ() {
        return this.Hw;
    }

    public abcd.wL J0() {
        return this.DW;
    }

    @Override
    boolean Zo() {
        return true;
    }

    @Override
    public int hashCode() {
        abcd.zL r0 = this.j6;
        if (r0 == null) goto L5;
        int r1 = r0.hashCode();
    L6:
        abcd.wL r2 = this.DW;
        if (r2 == null) goto L9;
        r1 = r1 ^ r2.hashCode();
    L9:
        abcd.EL r3 = this.FH;
        if (r3 == null) goto L13;
        r1 = r1 ^ r3.hashCode();
    L13:
        return r1 ^ this.v5.hashCode();
    L5:
        r1 = 0;
        goto L6
    }

    @Override
    void j6(abcd.CL r7) {
        java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream();
        abcd.zL r1 = this.j6;
        if (r1 == null) goto L5;
        r0.write(r1.j6("DER"));
    L5:
        abcd.wL r2 = this.DW;
        if (r2 == null) goto L8;
        r0.write(r2.j6("DER"));
    L8:
        abcd.EL r3 = this.FH;
        if (r3 == null) goto L11;
        r0.write(r3.j6("DER"));
    L11:
        r0.write(new abcd.yM(true, this.Hw, this.v5).j6("DER"));
        r7.j6(32, 8, r0.toByteArray());
    }

    @Override
    boolean j6(abcd.EL r4) {
        if ((r4 instanceof abcd.fM) == true) goto L5;
        return false;
    L5:
        if (this != r4) goto L8;
        return true;
    L8:
        abcd.fM r5 = (abcd.fM) r4;
        abcd.zL r0 = this.j6;
        if (r0 == null) goto L15;
        abcd.zL r2 = r5.j6;
        if (r2 != null) goto L13;
    L14:
        return false;
    L13:
        if (r2.equals(r0) == false) goto L14;
    L15:
        abcd.wL r1 = this.DW;
        if (r1 == null) goto L22;
        abcd.wL r3 = r5.DW;
        if (r3 != null) goto L20;
    L21:
        return false;
    L20:
        if (r3.equals(r1) == false) goto L21;
    L22:
        abcd.EL r6 = this.FH;
        if (r6 == null) goto L30;
        abcd.EL r7 = r5.FH;
        if (r7 != null) goto L27;
    L28:
        return false;
    L27:
        if (r7.equals(r6) == false) goto L28;
    L30:
        return this.v5.equals(r5.v5);
    }

    public abcd.zL tp() {
        return this.j6;
    }

    public abcd.EL u7() {
        return this.FH;
    }

    @Override
    int v5() {
        return Hw().length;
    }

    public abcd.EL we() {
        return this.v5;
    }
}
