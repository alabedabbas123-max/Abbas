package abcd;

public class FA {
    byte[] DW;
    byte[] FH;
    javax.crypto.Cipher Hw;
    byte[] j6;
    java.security.MessageDigest v5;

    public FA() {
        this.j6 = new byte[]{48, 33};
        this.DW = new byte[]{48, 9, 6, 5, 43, 14, 3, 2, 26, 5, 0};
        this.FH = new byte[]{4, 20};
        this.v5 = java.security.MessageDigest.getInstance("SHA1");
        this.Hw = javax.crypto.Cipher.getInstance("RSA/ECB/PKCS1Padding");
    }

    public void j6(java.security.PrivateKey r3) {
        this.Hw.init(1, r3);
    }

    public void j6(byte[] r2) {
        this.v5.update(r2);
    }

    public byte[] j6() {
        this.Hw.update(this.j6);
        this.Hw.update(this.DW);
        this.Hw.update(this.FH);
        this.Hw.update(this.v5.digest());
        return this.Hw.doFinal();
    }
}
