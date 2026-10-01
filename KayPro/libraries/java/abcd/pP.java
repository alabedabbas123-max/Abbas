package abcd;

public final class pP extends java.security.Provider implements abcd.InterfacegP {
    public static java.lang.String DW = "SC";
    public static final abcd.InterfacehP FH = null;
    private static final java.util.Map Hw = null;
    private static final java.lang.String[] VH = null;
    private static final java.lang.String[] Zo = null;
    private static final java.lang.String[] gn = null;
    private static java.lang.String j6 = "BouncyCastle Security Provider v1.47";
    private static final java.lang.String[] v5 = null;

    static {
        FH = new abcd.qP();
        Hw = new java.util.HashMap();
        v5 = new java.lang.String[]{"AES", "ARC4", "Blowfish", "Camellia", "CAST5", "CAST6", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Skipjack", "TEA", "Twofish", "VMPC", "VMPCKSA3", "XTEA"};
        Zo = new java.lang.String[]{"X509"};
        VH = new java.lang.String[]{"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal"};
        gn = new java.lang.String[]{"GOST3411", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "Tiger", "Whirlpool"};
    }

    public pP() {
        super(DW, 1.47d, j6);
        java.security.AccessController.doPrivileged(new abcd.oP(this));
    }

    private void DW() {
        j6("org.spongycastle.jcajce.provider.digest.", gn);
        j6("org.spongycastle.jcajce.provider.symmetric.", v5);
        j6("org.spongycastle.jcajce.provider.asymmetric.", Zo);
        j6("org.spongycastle.jcajce.provider.asymmetric.", VH);
        put("X509Store.CERTIFICATE/COLLECTION", "org.spongycastle.jce.provider.X509StoreCertCollection");
        put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.spongycastle.jce.provider.X509StoreAttrCertCollection");
        put("X509Store.CRL/COLLECTION", "org.spongycastle.jce.provider.X509StoreCRLCollection");
        put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.spongycastle.jce.provider.X509StoreCertPairCollection");
        put("X509Store.CERTIFICATE/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCerts");
        put("X509Store.CRL/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCRLs");
        put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPAttrCerts");
        put("X509Store.CERTIFICATEPAIR/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCertPairs");
        put("X509StreamParser.CERTIFICATE", "org.spongycastle.jce.provider.X509CertParser");
        put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.spongycastle.jce.provider.X509AttrCertParser");
        put("X509StreamParser.CRL", "org.spongycastle.jce.provider.X509CRLParser");
        put("X509StreamParser.CERTIFICATEPAIR", "org.spongycastle.jce.provider.X509CertPairParser");
        put("KeyStore.BKS", "org.spongycastle.jce.provider.JDKKeyStore");
        put("KeyStore.BouncyCastle", "org.spongycastle.jce.provider.JDKKeyStore$BouncyCastleStore");
        put("KeyStore.PKCS12", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore");
        put("KeyStore.BCPKCS12", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore");
        put("KeyStore.PKCS12-DEF", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$DefPKCS12KeyStore");
        put("KeyStore.PKCS12-3DES-40RC2", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore");
        put("KeyStore.PKCS12-3DES-3DES", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore3DES");
        put("KeyStore.PKCS12-DEF-3DES-40RC2", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$DefPKCS12KeyStore");
        put("KeyStore.PKCS12-DEF-3DES-3DES", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$DefPKCS12KeyStore3DES");
        put("Alg.Alias.KeyStore.UBER", "BouncyCastle");
        put("Alg.Alias.KeyStore.BOUNCYCASTLE", "BouncyCastle");
        put("Alg.Alias.KeyStore.spongycastle", "BouncyCastle");
        put("AlgorithmParameters.IES", "org.spongycastle.jce.provider.JDKAlgorithmParameters$IES");
        put("AlgorithmParameters.PKCS12PBE", "org.spongycastle.jce.provider.JDKAlgorithmParameters$PKCS12PBE");
        put("AlgorithmParameters." + abcd.InterfacelN.yS, "org.spongycastle.jce.provider.JDKAlgorithmParameters$PBKDF2");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC2", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC4", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2-CBC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES3KEY-CBC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES2KEY-CBC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC2-CBC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC4", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC2-CBC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC4", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH-CBC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.1", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.2", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.3", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.4", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.5", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.6", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWithSHAAnd3KeyTripleDES", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters." + abcd.PM.we.tp(), "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters." + abcd.PM.J0.tp(), "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters." + abcd.PM.J8.tp(), "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters." + abcd.PM.Ws.tp(), "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters." + abcd.PM.QX.tp(), "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters." + abcd.PM.XL.tp(), "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
        put("AlgorithmParameters.SHA1WITHECDSA", "org.spongycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        put("AlgorithmParameters.SHA224WITHECDSA", "org.spongycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        put("AlgorithmParameters.SHA256WITHECDSA", "org.spongycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        put("AlgorithmParameters.SHA384WITHECDSA", "org.spongycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        put("AlgorithmParameters.SHA512WITHECDSA", "org.spongycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        put("Alg.Alias.Cipher.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        put("Cipher.ECIES", "org.spongycastle.jce.provider.JCEIESCipher$ECIES");
        put("Cipher.BrokenECIES", "org.spongycastle.jce.provider.JCEIESCipher$BrokenECIES");
        put("Cipher.IES", "org.spongycastle.jce.provider.JCEIESCipher$IES");
        put("Cipher.BrokenIES", "org.spongycastle.jce.provider.JCEIESCipher$BrokenIES");
        put("Cipher.PBEWITHMD5ANDDES", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithMD5AndDES");
        put("Cipher.BROKENPBEWITHMD5ANDDES", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        put("Cipher.PBEWITHMD5ANDRC2", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithMD5AndRC2");
        put("Cipher.PBEWITHSHA1ANDDES", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithSHA1AndDES");
        put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        put("Cipher.PBEWITHSHA1ANDRC2", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithSHA1AndRC2");
        put("Cipher.PBEWITHSHAAND128BITRC2-CBC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithSHAAnd128BitRC2");
        put("Cipher.PBEWITHSHAAND40BITRC2-CBC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithSHAAnd40BitRC2");
        put("Cipher.PBEWITHSHAAND128BITRC4", "org.spongycastle.jce.provider.JCEStreamCipher$PBEWithSHAAnd128BitRC4");
        put("Cipher.PBEWITHSHAAND40BITRC4", "org.spongycastle.jce.provider.JCEStreamCipher$PBEWithSHAAnd40BitRC4");
        put("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC2-CBC", "PBEWITHSHAAND128BITRC2-CBC");
        put("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC2-CBC", "PBEWITHSHAAND40BITRC2-CBC");
        put("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC4", "PBEWITHSHAAND128BITRC4");
        put("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC4", "PBEWITHSHAAND40BITRC4");
        put("Alg.Alias.Cipher." + abcd.PM.we.tp(), "PBEWITHSHAAND128BITAES-CBC-BC");
        put("Alg.Alias.Cipher." + abcd.PM.J0.tp(), "PBEWITHSHAAND192BITAES-CBC-BC");
        put("Alg.Alias.Cipher." + abcd.PM.J8.tp(), "PBEWITHSHAAND256BITAES-CBC-BC");
        put("Alg.Alias.Cipher." + abcd.PM.Ws.tp(), "PBEWITHSHA256AND128BITAES-CBC-BC");
        put("Alg.Alias.Cipher." + abcd.PM.QX.tp(), "PBEWITHSHA256AND192BITAES-CBC-BC");
        put("Alg.Alias.Cipher." + abcd.PM.XL.tp(), "PBEWITHSHA256AND256BITAES-CBC-BC");
        put("Cipher.PBEWITHSHAAND128BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        put("Cipher.PBEWITHSHAAND192BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        put("Cipher.PBEWITHSHAAND256BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        put("Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        put("Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        put("Cipher.PBEWITHSHA256AND256BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        put("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
        put("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
        put("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
        put("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
        put("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
        put("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
        put("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
        put("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
        put("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
        put("Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        put("Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        put("Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        put("Cipher.PBEWITHSHAANDTWOFISH-CBC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithSHAAndTwofish");
        put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        put("Alg.Alias.Cipher." + abcd.InterfacelN.j3, "PBEWITHMD2ANDDES");
        put("Alg.Alias.Cipher." + abcd.InterfacelN.Mr, "PBEWITHMD2ANDRC2");
        put("Alg.Alias.Cipher." + abcd.InterfacelN.U2, "PBEWITHMD5ANDDES");
        put("Alg.Alias.Cipher." + abcd.InterfacelN.a8, "PBEWITHMD5ANDDES");
        put("Alg.Alias.Cipher." + abcd.InterfacelN.lg, "PBEWITHSHA1ANDDES");
        put("Alg.Alias.Cipher." + abcd.InterfacelN.rN, "PBEWITHSHA1ANDRC2");
        put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.1", "PBEWITHSHAAND128BITRC4");
        put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.2", "PBEWITHSHAAND40BITRC4");
        put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.5", "PBEWITHSHAAND128BITRC2-CBC");
        put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.6", "PBEWITHSHAAND40BITRC2-CBC");
        put("SecretKeyFactory.PBEWITHMD2ANDDES", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD2AndDES");
        put("Alg.Alias.SecretKeyFactory." + abcd.InterfacelN.j3, "PBEWITHMD2ANDDES");
        put("Alg.Alias.SecretKeyFactory." + abcd.InterfacelN.Mr, "PBEWITHMD2ANDRC2");
        put("Alg.Alias.SecretKeyFactory." + abcd.InterfacelN.U2, "PBEWITHMD5ANDDES");
        put("Alg.Alias.SecretKeyFactory." + abcd.InterfacelN.a8, "PBEWITHMD5ANDDES");
        put("Alg.Alias.SecretKeyFactory." + abcd.InterfacelN.lg, "PBEWITHSHA1ANDDES");
        put("Alg.Alias.SecretKeyFactory." + abcd.InterfacelN.rN, "PBEWITHSHA1ANDRC2");
        put("SecretKeyFactory.PBEWITHMD2ANDRC2", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD2AndRC2");
        put("SecretKeyFactory.PBEWITHMD5ANDDES", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5AndDES");
        put("SecretKeyFactory.PBEWITHMD5ANDRC2", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5AndRC2");
        put("SecretKeyFactory.PBEWITHSHA1ANDDES", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA1AndDES");
        put("SecretKeyFactory.PBEWITHSHA1ANDRC2", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA1AndRC2");
        put("SecretKeyFactory.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAndDES3Key");
        put("SecretKeyFactory.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAndDES2Key");
        put("SecretKeyFactory.PBEWITHSHAAND128BITRC4", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd128BitRC4");
        put("SecretKeyFactory.PBEWITHSHAAND40BITRC4", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd40BitRC4");
        put("SecretKeyFactory.PBEWITHSHAAND128BITRC2-CBC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd128BitRC2");
        put("SecretKeyFactory.PBEWITHSHAAND40BITRC2-CBC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd40BitRC2");
        put("SecretKeyFactory.PBEWITHSHAANDTWOFISH-CBC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAndTwofish");
        put("SecretKeyFactory.PBEWITHHMACRIPEMD160", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithRIPEMD160");
        put("SecretKeyFactory.PBEWITHHMACSHA1", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA");
        put("SecretKeyFactory.PBEWITHHMACTIGER", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithTiger");
        put("SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5And128BitAESCBCOpenSSL");
        put("SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5And192BitAESCBCOpenSSL");
        put("SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5And256BitAESCBCOpenSSL");
        put("Alg.Alias.SecretKeyFactory.PBE", "PBE/PKCS5");
        put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHMD5ANDDES", "PBE/PKCS5");
        put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHSHA1ANDDES", "PBE/PKCS5");
        put("Alg.Alias.SecretKeyFactory.OLDPBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PBE/PKCS12");
        put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PBE/PKCS12");
        put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHSHAAND2-KEYTRIPLEDES-CBC", "PBE/PKCS12");
        put("Alg.Alias.SecretKeyFactory.OLDPBEWITHSHAANDTWOFISH-CBC", "PBE/PKCS12");
        put("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
        put("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDRC2-CBC", "PBEWITHMD2ANDRC2");
        put("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES");
        put("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDRC2-CBC", "PBEWITHMD5ANDRC2");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDRC2-CBC", "PBEWITHSHA1ANDRC2");
        put("Alg.Alias.SecretKeyFactory." + abcd.InterfacelN.j3, "PBEWITHMD2ANDDES");
        put("Alg.Alias.SecretKeyFactory." + abcd.InterfacelN.Mr, "PBEWITHMD2ANDRC2");
        put("Alg.Alias.SecretKeyFactory." + abcd.InterfacelN.U2, "PBEWITHMD5ANDDES");
        put("Alg.Alias.SecretKeyFactory." + abcd.InterfacelN.a8, "PBEWITHMD5ANDRC2");
        put("Alg.Alias.SecretKeyFactory." + abcd.InterfacelN.lg, "PBEWITHSHA1ANDDES");
        put("Alg.Alias.SecretKeyFactory." + abcd.InterfacelN.rN, "PBEWITHSHA1ANDRC2");
        put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.1", "PBEWITHSHAAND128BITRC4");
        put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.2", "PBEWITHSHAAND40BITRC4");
        put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.3", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.4", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
        put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.5", "PBEWITHSHAAND128BITRC2-CBC");
        put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.6", "PBEWITHSHAAND40BITRC2-CBC");
        put("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA", "PBEWITHHMACSHA1");
        put("Alg.Alias.SecretKeyFactory.1.3.14.3.2.26", "PBEWITHHMACSHA1");
        put("Alg.Alias.SecretKeyFactory.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        put("SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd128BitAESBC");
        put("SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd192BitAESBC");
        put("SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd256BitAESBC");
        put("SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And128BitAESBC");
        put("SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And192BitAESBC");
        put("SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And256BitAESBC");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory." + abcd.PM.we.tp(), "PBEWITHSHAAND128BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory." + abcd.PM.J0.tp(), "PBEWITHSHAAND192BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory." + abcd.PM.J8.tp(), "PBEWITHSHAAND256BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory." + abcd.PM.Ws.tp(), "PBEWITHSHA256AND128BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory." + abcd.PM.QX.tp(), "PBEWITHSHA256AND192BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory." + abcd.PM.XL.tp(), "PBEWITHSHA256AND256BITAES-CBC-BC");
        j6();
        put("CertPathValidator.RFC3281", "org.spongycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        put("CertPathBuilder.RFC3281", "org.spongycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        put("CertPathValidator.RFC3280", "org.spongycastle.jce.provider.PKIXCertPathValidatorSpi");
        put("CertPathBuilder.RFC3280", "org.spongycastle.jce.provider.PKIXCertPathBuilderSpi");
        put("CertPathValidator.PKIX", "org.spongycastle.jce.provider.PKIXCertPathValidatorSpi");
        put("CertPathBuilder.PKIX", "org.spongycastle.jce.provider.PKIXCertPathBuilderSpi");
        put("CertStore.Collection", "org.spongycastle.jce.provider.CertStoreCollectionSpi");
        put("CertStore.LDAP", "org.spongycastle.jce.provider.X509LDAPCertStoreSpi");
        put("CertStore.Multi", "org.spongycastle.jce.provider.MultiCertStoreSpi");
        put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }

    public static java.security.PublicKey j6(abcd.CN r2) {
        abcd.InterfacelP r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = (abcd.InterfacelP) Hw.get(r2.v5().v5());
                    if (r0 != null) { $pc0 = 7; continue $sw0; }
                    return null;
                }
                case 7: {
                    return r0.generatePublic(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6() {
        put("Mac.DESWITHISO9797", "org.spongycastle.jce.provider.JCEMac$DES9797Alg3");
        put("Alg.Alias.Mac.DESISO9797MAC", "DESWITHISO9797");
        put("Mac.ISO9797ALG3MAC", "org.spongycastle.jce.provider.JCEMac$DES9797Alg3");
        put("Alg.Alias.Mac.ISO9797ALG3", "ISO9797ALG3MAC");
        put("Mac.ISO9797ALG3WITHISO7816-4PADDING", "org.spongycastle.jce.provider.JCEMac$DES9797Alg3with7816d4");
        put("Alg.Alias.Mac.ISO9797ALG3MACWITHISO7816-4PADDING", "ISO9797ALG3WITHISO7816-4PADDING");
        put("Mac.OLDHMACSHA384", "org.spongycastle.jce.provider.JCEMac$OldSHA384");
        put("Mac.OLDHMACSHA512", "org.spongycastle.jce.provider.JCEMac$OldSHA512");
        put("Mac.PBEWITHHMACSHA", "org.spongycastle.jce.provider.JCEMac$PBEWithSHA");
        put("Mac.PBEWITHHMACSHA1", "org.spongycastle.jce.provider.JCEMac$PBEWithSHA");
        put("Mac.PBEWITHHMACRIPEMD160", "org.spongycastle.jce.provider.JCEMac$PBEWithRIPEMD160");
        put("Alg.Alias.Mac.1.3.14.3.2.26", "PBEWITHHMACSHA");
    }

    static void j6(abcd.pP r0) {
        r0.DW();
    }

    private void j6(java.lang.String r7, java.lang.String[] r8) {
        int r0 = 0;
        java.lang.Class<?> r1 = null;
        java.lang.ClassLoader r2 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = 0;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r0 == r8.length) { $pc1 = 5; continue $sw1; }
                    r1 = null;
                    try {
                        r2 = getClass().getClassLoader();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.ClassNotFoundException) { $pc1 = 13; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r2 == null) { $pc1 = 11; continue $sw1; }
                    try {
                        r1 = r2.loadClass(java.lang.String.valueOf(r7) + r8[r0] + "$Mappings");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.ClassNotFoundException) { $pc1 = 13; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc1 = 14; continue $sw1; }
                }
                case 11: {
                    try {
                        r1 = java.lang.Class.forName(java.lang.String.valueOf(r7) + r8[r0] + "$Mappings");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.ClassNotFoundException) { $pc1 = 13; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    if (r1 == null) { $pc1 = 20; continue $sw1; }
                    try {
                        ((abcd.AbstractjP) r1.newInstance()).configure(this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 17; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    e = $ex1;
                    e.printStackTrace();
                    throw new java.lang.InternalError("cannot create instance of " + r7 + r8[r0] + "$Mappings : " + e);
                }
                case 20: {
                    r0 = r0 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 5: {
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(java.lang.String r3, java.lang.String r4) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (containsKey(r3) == true) { $pc2 = 7; continue $sw2; }
                    put(r3, r4);
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalStateException("duplicate provider key (" + r3 + ") found");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
