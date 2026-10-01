package abcd;

public class nM extends abcd.EL implements abcd.KL {
    private byte[] j6;

    nM(byte[] r1) {
        this.j6 = r1;
    }

    @Override
    boolean Zo() {
        return false;
    }

    @Override
    public java.lang.String getString() {
        return abcd.TP.DW(this.j6);
    }

    @Override
    public int hashCode() {
        return abcd.OP.DW(this.j6);
    }

    @Override
    void j6(abcd.CL r3) {
        r3.j6(18, this.j6);
    }

    @Override
    boolean j6(abcd.EL r2) {
        if ((r2 instanceof abcd.nM) == true) goto L7;
        return false;
    L7:
        return abcd.OP.j6(this.j6, ((abcd.nM) r2).j6);
    }

    public java.lang.String toString() {
        return getString();
    }

    @Override
    int v5() {
        return (abcd.OM.j6(this.j6.length) + 1) + this.j6.length;
    }
}
