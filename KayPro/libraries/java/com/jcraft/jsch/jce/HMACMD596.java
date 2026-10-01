package com.jcraft.jsch.jce;

public class HMACMD596 extends com.jcraft.jsch.jce.HMACMD5 {
    private final byte[] Zo;

    public HMACMD596() {
        this.Zo = new byte[16];
        this.j6 = "hmac-md5-96";
    }

    @Override
    public int j6() {
        return 12;
    }

    @Override
    public void j6(byte[] r1) {
        super.j6(r1);
    }

    @Override
    public void j6(byte[] r4, int r5) {
        super.j6(this.Zo, 0);
        java.lang.System.arraycopy(this.Zo, 0, r4, r5, 12);
    }

    @Override
    public void update(int r1) {
        super.update(r1);
    }

    @Override
    public void update(byte[] r1, int r2, int r3) {
        super.update(r1, r2, r3);
    }
}
