package com.jcraft.jsch.jce;

public class HMACMD5 extends com.jcraft.jsch.jce.HMAC {
    public HMACMD5() {
        this.j6 = "hmac-md5";
        this.DW = 16;
        this.FH = "HmacMD5";
    }

    @Override
    public int j6() {
        return super.j6();
    }

    @Override
    public void j6(byte[] r1) {
        super.j6(r1);
    }

    @Override
    public void j6(byte[] r1, int r2) {
        super.j6(r1, r2);
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
