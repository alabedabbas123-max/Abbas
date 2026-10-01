package abcd;

public class bP implements abcd.InterfaceaP {
    protected final java.lang.String j6;

    public bP(java.lang.String r1) {
        this.j6 = r1;
    }

    @Override
    public java.security.MessageDigest DW(java.lang.String r2) {
        return java.security.MessageDigest.getInstance(r2, this.j6);
    }

    @Override
    public java.security.Signature j6(java.lang.String r2) {
        return java.security.Signature.getInstance(r2, this.j6);
    }
}
