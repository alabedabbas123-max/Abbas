package abcd;

public class BA {
    java.security.cert.X509Certificate DW;
    java.security.PrivateKey FH;
    byte[] Hw;
    java.lang.String j6;

    public BA() {
        this.DW = null;
        this.FH = null;
        this.Hw = null;
    }

    public BA(java.lang.String r2, java.security.cert.X509Certificate r3, java.security.PrivateKey r4, byte[] r5) {
        this.DW = null;
        this.FH = null;
        this.Hw = null;
        this.j6 = r2;
        this.DW = r3;
        this.FH = r4;
        this.Hw = r5;
    }

    public java.security.PrivateKey DW() {
        return this.FH;
    }

    public java.security.cert.X509Certificate FH() {
        return this.DW;
    }

    public byte[] Hw() {
        return this.Hw;
    }

    public java.lang.String j6() {
        return this.j6;
    }

    public void j6(java.lang.String r1) {
        this.j6 = r1;
    }

    public void j6(java.security.PrivateKey r1) {
        this.FH = r1;
    }

    public void j6(java.security.cert.X509Certificate r1) {
        this.DW = r1;
    }

    public void j6(byte[] r1) {
        this.Hw = r1;
    }
}
