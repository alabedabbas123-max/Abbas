package abcd;

public class JP {
    private java.security.SecureRandom DW;
    private java.lang.String FH;
    private abcd.wN Hw;
    private abcd.NP j6;

    private class a extends java.io.OutputStream {
        final abcd.JP DW;
        private java.security.Signature j6;

        a(abcd.JP r1, java.security.Signature r2) {
            this.DW = r1;
            this.j6 = r2;
        }

        byte[] j6() {
            return this.j6.sign();
        }

        @Override
        public void write(int r4) {
            this.j6.update((byte) r4);     // Catch: java.security.SignatureException -> L4
            return;
        L4:
            e = move-exception;
            throw new abcd.DP("exception in content signer: " + e.getMessage(), e);
        }

        @Override
        public void write(byte[] r4) {
            this.j6.update(r4);     // Catch: java.security.SignatureException -> L4
            return;
        L4:
            e = move-exception;
            throw new abcd.DP("exception in content signer: " + e.getMessage(), e);
        }

        @Override
        public void write(byte[] r2, int r3, int r4) {
            this.j6.update(r2, r3, r4);     // Catch: java.security.SignatureException -> L4
            return;
        L4:
            e = move-exception;
            throw new abcd.DP("exception in content signer: " + e.getMessage(), e);
        }
    }

    public JP(java.lang.String r3) {
        this.j6 = new abcd.NP(new abcd._O());
        this.FH = r3;
        this.Hw = new abcd.xP().j6(r3);
    }

    static abcd.wN j6(abcd.JP r0) {
        return r0.Hw;
    }

    public abcd.JP j6(java.security.Provider r3) {
        this.j6 = new abcd.NP(new abcd.cP(r3));
        return this;
    }

    public abcd.JP j6(java.security.SecureRandom r1) {
        this.DW = r1;
        return this;
    }

    public abcd.InterfacevP j6(java.security.PrivateKey r4) {
        java.security.Signature r0 = this.j6.DW(this.Hw);     // Catch: java.security.GeneralSecurityException -> L8
        if (this.DW == null) goto L5;
        r0.initSign(r4, this.DW);     // Catch: java.security.GeneralSecurityException -> L8
    L6:
        return new abcd.IP(this, r0);
    L5:
        r0.initSign(r4);     // Catch: java.security.GeneralSecurityException -> L8
    L8:
        e = move-exception;
        throw new abcd.BP("cannot create signer: " + e.getMessage(), e);
    }
}
