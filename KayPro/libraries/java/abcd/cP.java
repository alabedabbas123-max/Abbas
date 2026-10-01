package abcd;

public class cP implements abcd.InterfaceaP {
    protected final java.security.Provider j6;

    public cP(java.security.Provider r1) {
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
