package abcd;

public class bM extends abcd.EL implements abcd.KL {
    private char[] j6;

    bM(char[] r1) {
        this.j6 = r1;
    }

    @Override
    boolean Zo() {
        return false;
    }

    @Override
    public java.lang.String getString() {
        return new java.lang.String(this.j6);
    }

    @Override
    public int hashCode() {
        return abcd.OP.j6(this.j6);
    }

    @Override
    void j6(abcd.CL r4) {
        r4.j6(30);
        r4.DW(this.j6.length * 2);
        int r0 = 0;
    L3:
        char[] r1 = this.j6;
        if (r0 == r1.length) goto L5;
        char r2 = r1[r0];
        r4.j6((byte) (r2 >> '\b'));
        r4.j6((byte) r2);
        r0 = r0 + 1;
        goto L3
    }

    @Override
    protected boolean j6(abcd.EL r2) {
        if ((r2 instanceof abcd.bM) == true) goto L7;
        return false;
    L7:
        return abcd.OP.j6(this.j6, ((abcd.bM) r2).j6);
    }

    public java.lang.String toString() {
        return getString();
    }

    @Override
    int v5() {
        return (abcd.OM.j6(this.j6.length * 2) + 1) + (this.j6.length * 2);
    }
}
