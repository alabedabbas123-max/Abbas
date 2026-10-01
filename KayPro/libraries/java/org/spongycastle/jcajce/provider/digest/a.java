package org.spongycastle.jcajce.provider.digest;

public class a extends java.security.MessageDigest {
    protected abcd.InterfacesO j6;

    protected a(abcd.InterfacesO r2) {
        super(r2.j6());
        this.j6 = r2;
    }

    @Override
    public byte[] engineDigest() {
        byte[] r0 = new byte[this.j6.DW()];
        this.j6.j6(r0, 0);
        return r0;
    }

    @Override
    public void engineReset() {
        this.j6.reset();
    }

    @Override
    public void engineUpdate(byte r2) {
        this.j6.j6(r2);
    }

    @Override
    public void engineUpdate(byte[] r2, int r3, int r4) {
        this.j6.update(r2, r3, r4);
    }
}
