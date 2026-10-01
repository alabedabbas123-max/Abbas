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
            java.lang.Throwable e = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        try {
                            this.j6.update((byte) r4);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.security.SignatureException) { $pc0 = 4; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        return;
                    }
                    case 4: {
                        e = $ex0;
                        throw new abcd.DP("exception in content signer: " + e.getMessage(), e);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void write(byte[] r4) {
            java.lang.Throwable e = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        try {
                            this.j6.update(r4);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.security.SignatureException) { $pc1 = 4; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        return;
                    }
                    case 4: {
                        e = $ex1;
                        throw new abcd.DP("exception in content signer: " + e.getMessage(), e);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void write(byte[] r2, int r3, int r4) {
            java.lang.Throwable e = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        try {
                            this.j6.update(r2, r3, r4);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            if ($t instanceof java.security.SignatureException) { $pc2 = 4; continue $sw2; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        return;
                    }
                    case 4: {
                        e = $ex2;
                        throw new abcd.DP("exception in content signer: " + e.getMessage(), e);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
        java.security.Signature r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    try {
                        r0 = this.j6.DW(this.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.security.GeneralSecurityException) { $pc3 = 8; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.DW == null) { $pc3 = 5; continue $sw3; }
                    try {
                        r0.initSign(r4, this.DW);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.security.GeneralSecurityException) { $pc3 = 8; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return new abcd.IP(this, r0);
                }
                case 5: {
                    try {
                        r0.initSign(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.security.GeneralSecurityException) { $pc3 = 8; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    throw new java.lang.IllegalStateException();
                }
                case 8: {
                    e = $ex3;
                    throw new abcd.BP("cannot create signer: " + e.getMessage(), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
