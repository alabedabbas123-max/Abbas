package com.jcraft.jsch;

class IdentityFile implements com.jcraft.jsch.Identity {
    private com.jcraft.jsch.KeyPair DW;
    private java.lang.String FH;
    private com.jcraft.jsch.JSch j6;

    private IdentityFile(com.jcraft.jsch.JSch r1, java.lang.String r2, com.jcraft.jsch.KeyPair r3) {
        this.j6 = r1;
        this.FH = r2;
        this.DW = r3;
    }

    static com.jcraft.jsch.IdentityFile j6(java.lang.String r1, java.lang.String r2, com.jcraft.jsch.JSch r3) {
        return new com.jcraft.jsch.IdentityFile(r3, r1, com.jcraft.jsch.KeyPair.j6(r3, r1, r2));
    }

    static com.jcraft.jsch.IdentityFile j6(java.lang.String r0, byte[] r1, byte[] r2, com.jcraft.jsch.JSch r3) {
        return new com.jcraft.jsch.IdentityFile(r3, r0, com.jcraft.jsch.KeyPair.j6(r3, r1, r2));
    }

    @Override
    public boolean DW() {
        return this.DW.v5();
    }

    @Override
    public byte[] DW(byte[] r2) {
        return this.DW.DW(r2);
    }

    @Override
    public byte[] FH() {
        return this.DW.Hw();
    }

    public com.jcraft.jsch.KeyPair Hw() {
        return this.DW;
    }

    @Override
    public void clear() {
        this.DW.j6();
        this.DW = null;
    }

    @Override
    public java.lang.String getName() {
        return this.FH;
    }

    @Override
    public java.lang.String j6() {
        return new java.lang.String(this.DW.FH());
    }

    @Override
    public boolean j6(byte[] r2) {
        return this.DW.j6(r2);
    }
}
