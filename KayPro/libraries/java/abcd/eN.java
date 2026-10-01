package abcd;

public class eN extends abcd.cM {
    public eN(abcd.cM r2) {
        super(r2.u7(), r2.tp());
    }

    @Override
    public java.lang.String toString() {
        return "NetscapeCertType: 0x" + java.lang.Integer.toHexString(this.DW[0] & 255);
    }
}
