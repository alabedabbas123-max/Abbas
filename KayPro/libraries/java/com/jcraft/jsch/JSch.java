package com.jcraft.jsch;

public class JSch {
    private static final com.jcraft.jsch.Logger DW = null;
    static com.jcraft.jsch.Logger FH;
    static java.util.Hashtable j6;
    private java.util.Vector Hw;
    private com.jcraft.jsch.ConfigRepository VH;
    private com.jcraft.jsch.IdentityRepository Zo;
    private com.jcraft.jsch.HostKeyRepository gn;
    private com.jcraft.jsch.IdentityRepository v5;

    static {
        j6 = new java.util.Hashtable();
        j6.put("kex", "diffie-hellman-group1-sha1,diffie-hellman-group14-sha1,diffie-hellman-group-exchange-sha1");
        j6.put("server_host_key", "ssh-rsa,ssh-dss");
        j6.put("cipher.s2c", "aes128-ctr,aes128-cbc,3des-ctr,3des-cbc,blowfish-cbc,aes192-cbc,aes256-cbc");
        j6.put("cipher.c2s", "aes128-ctr,aes128-cbc,3des-ctr,3des-cbc,blowfish-cbc,aes192-cbc,aes256-cbc");
        j6.put("mac.s2c", "hmac-md5,hmac-sha1,hmac-sha2-256,hmac-sha1-96,hmac-md5-96");
        j6.put("mac.c2s", "hmac-md5,hmac-sha1,hmac-sha2-256,hmac-sha1-96,hmac-md5-96");
        j6.put("compression.s2c", "none");
        j6.put("compression.c2s", "none");
        j6.put("lang.s2c", "");
        j6.put("lang.c2s", "");
        j6.put("compression_level", "6");
        j6.put("diffie-hellman-group-exchange-sha1", "com.jcraft.jsch.DHGEX");
        j6.put("diffie-hellman-group1-sha1", "com.jcraft.jsch.DHG1");
        j6.put("diffie-hellman-group14-sha1", "com.jcraft.jsch.DHG14");
        j6.put("diffie-hellman-group-exchange-sha256", "com.jcraft.jsch.DHGEX256");
        j6.put("dh", "com.jcraft.jsch.jce.DH");
        j6.put("3des-cbc", "com.jcraft.jsch.jce.TripleDESCBC");
        j6.put("blowfish-cbc", "com.jcraft.jsch.jce.BlowfishCBC");
        j6.put("hmac-sha1", "com.jcraft.jsch.jce.HMACSHA1");
        j6.put("hmac-sha1-96", "com.jcraft.jsch.jce.HMACSHA196");
        j6.put("hmac-sha2-256", "com.jcraft.jsch.jce.HMACSHA256");
        j6.put("hmac-md5", "com.jcraft.jsch.jce.HMACMD5");
        j6.put("hmac-md5-96", "com.jcraft.jsch.jce.HMACMD596");
        j6.put("sha-1", "com.jcraft.jsch.jce.SHA1");
        j6.put("sha-256", "com.jcraft.jsch.jce.SHA256");
        j6.put("md5", "com.jcraft.jsch.jce.MD5");
        j6.put("signature.dss", "com.jcraft.jsch.jce.SignatureDSA");
        j6.put("signature.rsa", "com.jcraft.jsch.jce.SignatureRSA");
        j6.put("keypairgen.dsa", "com.jcraft.jsch.jce.KeyPairGenDSA");
        j6.put("keypairgen.rsa", "com.jcraft.jsch.jce.KeyPairGenRSA");
        j6.put("random", "com.jcraft.jsch.jce.Random");
        j6.put("none", "com.jcraft.jsch.CipherNone");
        j6.put("aes128-cbc", "com.jcraft.jsch.jce.AES128CBC");
        j6.put("aes192-cbc", "com.jcraft.jsch.jce.AES192CBC");
        j6.put("aes256-cbc", "com.jcraft.jsch.jce.AES256CBC");
        j6.put("aes128-ctr", "com.jcraft.jsch.jce.AES128CTR");
        j6.put("aes192-ctr", "com.jcraft.jsch.jce.AES192CTR");
        j6.put("aes256-ctr", "com.jcraft.jsch.jce.AES256CTR");
        j6.put("3des-ctr", "com.jcraft.jsch.jce.TripleDESCTR");
        j6.put("arcfour", "com.jcraft.jsch.jce.ARCFOUR");
        j6.put("arcfour128", "com.jcraft.jsch.jce.ARCFOUR128");
        j6.put("arcfour256", "com.jcraft.jsch.jce.ARCFOUR256");
        j6.put("userauth.none", "com.jcraft.jsch.UserAuthNone");
        j6.put("userauth.password", "com.jcraft.jsch.UserAuthPassword");
        j6.put("userauth.keyboard-interactive", "com.jcraft.jsch.UserAuthKeyboardInteractive");
        j6.put("userauth.publickey", "com.jcraft.jsch.UserAuthPublicKey");
        j6.put("userauth.gssapi-with-mic", "com.jcraft.jsch.UserAuthGSSAPIWithMIC");
        j6.put("gssapi-with-mic.krb5", "com.jcraft.jsch.jgss.GSSContextKrb5");
        j6.put("zlib", "com.jcraft.jsch.jcraft.Compression");
        j6.put("zlib@openssh.com", "com.jcraft.jsch.jcraft.Compression");
        j6.put("pbkdf", "com.jcraft.jsch.jce.PBKDF");
        j6.put("StrictHostKeyChecking", "ask");
        j6.put("HashKnownHosts", "no");
        j6.put("PreferredAuthentications", "gssapi-with-mic,publickey,keyboard-interactive,password");
        j6.put("CheckCiphers", "aes256-ctr,aes192-ctr,aes128-ctr,aes256-cbc,aes192-cbc,aes128-cbc,3des-ctr,arcfour,arcfour128,arcfour256");
        j6.put("CheckKexes", "diffie-hellman-group14-sha1");
        j6.put("MaxAuthTries", "6");
        j6.put("ClearAllForwardings", "no");
        DW = new com.jcraft.jsch.JSch.AnonymousClass1();
        FH = DW;
    }

    public JSch() {
        this.Hw = new java.util.Vector();
        this.v5 = new com.jcraft.jsch.LocalIdentityRepository(this);
        this.Zo = this.v5;
        this.VH = null;
        this.gn = null;
    }

    public static java.lang.String DW(java.lang.String r2) {
        synchronized (j6) {
            java.util.Hashtable r0 = null;
            java.lang.String r3 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = j6;
                        try {
                            r3 = (java.lang.String) j6.get(r2);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 7; continue $sw0;
                        }
                        return r3;
                    }
                    case 7: {
                        th = $ex0;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    static com.jcraft.jsch.Logger v5() {
        return FH;
    }

    public com.jcraft.jsch.HostKeyRepository DW() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.gn != null) { $pc1 = 6; continue $sw1; }
                    this.gn = new com.jcraft.jsch.KnownHosts(this);
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return this.gn;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected boolean DW(com.jcraft.jsch.Session r3) {
        synchronized (this.Hw) {
            java.util.Vector r0 = null;
            boolean r4 = false;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r0 = this.Hw;
                        try {
                            r4 = this.Hw.remove(r3);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 7; continue $sw2;
                        }
                        return r4;
                    }
                    case 7: {
                        th = $ex2;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public java.util.Vector FH() {
        java.util.Vector r0 = null;
        java.util.Vector r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new java.util.Vector();
                    r1 = this.Zo.j6();
                    r2 = 0;
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r2 >= r1.size()) { $pc3 = 5; continue $sw3; }
                    r0.addElement(((com.jcraft.jsch.Identity) r1.elementAt(r2)).getName());
                    r2 = r2 + 1;
                    { $pc3 = 4; continue $sw3; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public synchronized com.jcraft.jsch.IdentityRepository Hw() {
        synchronized (this) {
            com.jcraft.jsch.IdentityRepository r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        try {
                            r0 = this.Zo;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 6; continue $sw4;
                        }
                        return r0;
                    }
                    case 6: {
                        th = $ex4;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public com.jcraft.jsch.ConfigRepository j6() {
        return this.VH;
    }

    public com.jcraft.jsch.Session j6(java.lang.String r2, java.lang.String r3, int r4) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r3 == null) { $pc5 = 6; continue $sw5; }
                    return new com.jcraft.jsch.Session(this, r2, r3, r4);
                }
                case 6: {
                    throw new com.jcraft.jsch.JSchException("host must not be null.");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(com.jcraft.jsch.HostKeyRepository r1) {
        this.gn = r1;
    }

    public void j6(com.jcraft.jsch.Identity r4, byte[] r5) {
        synchronized (this) {
            com.jcraft.jsch.IdentityRepository r6 = null;
            byte[] r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex6 = null;
            int $pc6 = -1;
            $sw6: while (true) {
                switch ($pc6) {
                    case -1: {
                        if (r5 != null) { $pc6 = 31; continue $sw6; }
                        $pc6 = 11; continue $sw6;
                    }
                    case 11: {
                        r6 = this.Zo;
                        if ((r6 instanceof com.jcraft.jsch.LocalIdentityRepository) == false) { $pc6 = 15; continue $sw6; }
                        ((com.jcraft.jsch.LocalIdentityRepository) r6).j6(r4);
                        return;
                    }
                    case 15: {
                        if ((r4 instanceof com.jcraft.jsch.IdentityFile) == true) { $pc6 = 17; continue $sw6; }
                        $pc6 = 19; continue $sw6;
                    }
                    case 19: {
                        $pc6 = 21; continue $sw6;
                    }
                    case 26: {
                        th = $ex6;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 21: {
                        if ((this.Zo instanceof com.jcraft.jsch.IdentityRepository.Wrapper) == true) { $pc6 = 23; continue $sw6; }
                        try {
                            j6(new com.jcraft.jsch.IdentityRepository.Wrapper(this.Zo));
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 26; continue $sw6;
                        }
                        $pc6 = 23; continue $sw6;
                    }
                    case 23: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 26; continue $sw6;
                        }
                        ((com.jcraft.jsch.IdentityRepository.Wrapper) this.Zo).j6(r4);
                        return;
                    }
                    case 17: {
                        if (r4.DW() == true) { $pc6 = 19; continue $sw6; }
                        this.Zo.j6(((com.jcraft.jsch.IdentityFile) r4).Hw().DW());
                        return;
                    }
                    case 31: {
                        try {
                            r0 = new byte[r5.length];
                            java.lang.System.arraycopy(r5, 0, r0, 0, r5.length);
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 8; continue $sw6;
                        }
                        try {
                            r4.j6(r0);
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 6; continue $sw6;
                        }
                        com.jcraft.jsch.Util.DW(r0);
                        $pc6 = 9; continue $sw6;
                    }
                    case 6: {
                        th = th;
                        r5 = r0;
                        $pc6 = 9; continue $sw6;
                    }
                    case 9: {
                        com.jcraft.jsch.Util.DW(r5);
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 8: {
                        th = th;
                        { $pc6 = 9; continue $sw6; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public synchronized void j6(com.jcraft.jsch.IdentityRepository r1) {
        synchronized (this) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex7 = null;
            int $pc7 = -1;
            $sw7: while (true) {
                switch ($pc7) {
                    case -1: {
                        if (r1 != null) { $pc7 = 5; continue $sw7; }
                        try {
                            this.Zo = this.v5;
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 8; continue $sw7;
                        }
                        $pc7 = 6; continue $sw7;
                    }
                    case 6: {
                        return;
                    }
                    case 5: {
                        try {
                            this.Zo = r1;
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 8; continue $sw7;
                        }
                        return;
                    }
                    case 8: {
                        th = $ex7;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    protected void j6(com.jcraft.jsch.Session r3) {
        synchronized (this.Hw) {
            java.util.Vector r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex8 = null;
            int $pc8 = -1;
            $sw8: while (true) {
                switch ($pc8) {
                    case -1: {
                        r0 = this.Hw;
                        try {
                            this.Hw.addElement(r3);
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 7; continue $sw8;
                        }
                        return;
                    }
                    case 7: {
                        th = $ex8;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public void j6(java.io.InputStream r3) {
        synchronized (this.gn) {
            com.jcraft.jsch.HostKeyRepository r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex9 = null;
            int $pc9 = -1;
            $sw9: while (true) {
                switch ($pc9) {
                    case -1: {
                        if (this.gn != null) { $pc9 = 5; continue $sw9; }
                        this.gn = new com.jcraft.jsch.KnownHosts(this);
                        $pc9 = 5; continue $sw9;
                    }
                    case 5: {
                        r0 = this.gn;
                        if ((r0 instanceof com.jcraft.jsch.KnownHosts) == false) { $pc9 = 14; continue $sw9; }
                        try {
                            ((com.jcraft.jsch.KnownHosts) this.gn).j6(r3);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 11; continue $sw9;
                        }
                        return;
                    }
                    case 11: {
                        th = $ex9;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 14: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public void j6(java.lang.String r2) {
        j6(r2, null);
    }

    public void j6(java.lang.String r2, byte[] r3) {
        j6(com.jcraft.jsch.IdentityFile.j6(r2, null, this), r3);
    }
}
