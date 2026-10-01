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
        java.util.Hashtable r0 = j6;
        monitor-enter(r0);
        java.lang.String r3 = (java.lang.String) j6.get(r2);     // Catch: java.lang.Throwable -> L7
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L7
        return r3;
    L7:
        th = move-exception;
        throw th;
    }

    static com.jcraft.jsch.Logger v5() {
        return FH;
    }

    public com.jcraft.jsch.HostKeyRepository DW() {
        if (this.gn != null) goto L6;
        this.gn = new com.jcraft.jsch.KnownHosts(this);
    L6:
        return this.gn;
    }

    protected boolean DW(com.jcraft.jsch.Session r3) {
        java.util.Vector r0 = this.Hw;
        monitor-enter(r0);
        boolean r4 = this.Hw.remove(r3);     // Catch: java.lang.Throwable -> L7
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L7
        return r4;
    L7:
        th = move-exception;
        throw th;
    }

    public java.util.Vector FH() {
        java.util.Vector r0 = new java.util.Vector();
        java.util.Vector r1 = this.Zo.j6();
        int r2 = 0;
    L4:
        if (r2 >= r1.size()) goto L5;
        r0.addElement(((com.jcraft.jsch.Identity) r1.elementAt(r2)).getName());
        r2 = r2 + 1;
        goto L4
    L5:
        return r0;
    }

    public synchronized com.jcraft.jsch.IdentityRepository Hw() {
        monitor-enter(this);
        com.jcraft.jsch.IdentityRepository r0 = this.Zo;     // Catch: java.lang.Throwable -> L6
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    }

    public com.jcraft.jsch.ConfigRepository j6() {
        return this.VH;
    }

    public com.jcraft.jsch.Session j6(java.lang.String r2, java.lang.String r3, int r4) {
        if (r3 == null) goto L6;
        return new com.jcraft.jsch.Session(this, r2, r3, r4);
    L6:
        throw new com.jcraft.jsch.JSchException("host must not be null.");
    }

    public void j6(com.jcraft.jsch.HostKeyRepository r1) {
        this.gn = r1;
    }

    public void j6(com.jcraft.jsch.Identity r4, byte[] r5) {
        if (r5 != null) goto L31;
    L11:
        com.jcraft.jsch.IdentityRepository r6 = this.Zo;
        if ((r6 instanceof com.jcraft.jsch.LocalIdentityRepository) == false) goto L15;
        ((com.jcraft.jsch.LocalIdentityRepository) r6).j6(r4);
        return;
    L15:
        if ((r4 instanceof com.jcraft.jsch.IdentityFile) == true) goto L17;
    L19:
        monitor-enter(this);
    L26:
        th = move-exception;
        throw th;
    L21:
        if ((this.Zo instanceof com.jcraft.jsch.IdentityRepository.Wrapper) == true) goto L23;
        j6(new com.jcraft.jsch.IdentityRepository.Wrapper(this.Zo));     // Catch: java.lang.Throwable -> L26
    L23:
        monitor-exit(this);     // Catch: java.lang.Throwable -> L26
        ((com.jcraft.jsch.IdentityRepository.Wrapper) this.Zo).j6(r4);
        return;
    L17:
        if (r4.DW() == true) goto L19;
        this.Zo.j6(((com.jcraft.jsch.IdentityFile) r4).Hw().DW());
        return;
    L31:
        byte[] r0 = new byte[r5.length];     // Catch: java.lang.Throwable -> L8
        java.lang.System.arraycopy(r5, 0, r0, 0, r5.length);     // Catch: java.lang.Throwable -> L8
        r4.j6(r0);     // Catch: java.lang.Throwable -> L6
        com.jcraft.jsch.Util.DW(r0);
    L6:
        th = th;
        r5 = r0;
    L9:
        com.jcraft.jsch.Util.DW(r5);
        throw th;
    L8:
        th = th;
        goto L9
    }

    public synchronized void j6(com.jcraft.jsch.IdentityRepository r1) {
        monitor-enter(this);
        if (r1 != null) goto L5;
        this.Zo = this.v5;     // Catch: java.lang.Throwable -> L8
    L6:
        monitor-exit(this);
        return;
    L5:
        this.Zo = r1;     // Catch: java.lang.Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    protected void j6(com.jcraft.jsch.Session r3) {
        java.util.Vector r0 = this.Hw;
        monitor-enter(r0);
        this.Hw.addElement(r3);     // Catch: java.lang.Throwable -> L7
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void j6(java.io.InputStream r3) {
        if (this.gn != null) goto L5;
        this.gn = new com.jcraft.jsch.KnownHosts(this);
    L5:
        com.jcraft.jsch.HostKeyRepository r0 = this.gn;
        if ((r0 instanceof com.jcraft.jsch.KnownHosts) == false) goto L14;
        monitor-enter(r0);
        ((com.jcraft.jsch.KnownHosts) this.gn).j6(r3);     // Catch: java.lang.Throwable -> L11
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L11
        return;
    L11:
        th = move-exception;
        throw th;
    }

    public void j6(java.lang.String r2) {
        j6(r2, null);
    }

    public void j6(java.lang.String r2, byte[] r3) {
        j6(com.jcraft.jsch.IdentityFile.j6(r2, null, this), r3);
    }
}
