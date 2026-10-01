package abcd;

public class GA {
    private static java.util.regex.Pattern DW;
    public static final java.lang.String[] FH = null;
    static abcd.InterfacetA j6;
    private boolean Hw;
    abcd.BA VH;
    java.util.Map<java.lang.String, abcd.BA> Zo;
    java.lang.String gn;
    abcd.GA.a tp;
    java.util.Map<java.lang.String, java.lang.String> u7;
    private abcd.DA v5;

    public static class a extends java.util.Observable {
        public a() {
        }

        @Override
        public void notifyObservers(java.lang.Object r1) {
            super.setChanged();
            super.notifyObservers(r1);
        }
    }

    static {
        DW = java.util.regex.Pattern.compile("^META-INF/(.*)[.](SF|RSA|DSA)$");
        FH = new java.lang.String[]{"auto-testkey", "auto", "auto-none", "media", "platform", "shared", "testkey", "none"};
    }

    public GA() {
        this.Hw = false;
        this.v5 = new abcd.DA();
        this.Zo = new java.util.HashMap();
        this.VH = null;
        this.gn = "testkey";
        this.u7 = new java.util.HashMap();
        this.tp = new abcd.GA.a();
        this.u7.put("aa9852bc5a53272ac8031d49b65e4b0e", "media");
        this.u7.put("e60418c4b638f20d0721e115674ca11f", "platform");
        this.u7.put("3e24e49741b60c215c010dc6048fca7d", "shared");
        this.u7.put("dab2cead827ef5313f28e22b6fa8479f", "testkey");
    }

    public static abcd.InterfacetA j6() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (j6 != null) { $pc0 = 6; continue $sw0; }
                    j6 = abcd.uA.j6(abcd.GA.class.getName());
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.security.spec.KeySpec j6(byte[] r4, java.lang.String r5) {
        javax.crypto.EncryptedPrivateKeyInfo r0 = null;
        char[] r6 = null;
        javax.crypto.SecretKey r7 = null;
        javax.crypto.Cipher r8 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        r0 = new javax.crypto.EncryptedPrivateKeyInfo(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 9; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r6 = r5.toCharArray();
                    r7 = javax.crypto.SecretKeyFactory.getInstance(r0.getAlgName()).generateSecret(new javax.crypto.spec.PBEKeySpec(r6));
                    r8 = javax.crypto.Cipher.getInstance(r0.getAlgName());
                    r8.init(2, r7, r0.getAlgParameters());
                    return r0.getKeySpec(r8);
                }
                case 6: {
                    e = $ex1;
                    j6().j6("signapk: Password for private key may be bad.");
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 9: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.util.jar.Manifest j6(java.util.Map<java.lang.String, abcd.IA> r13) {
        abcd.IA r1 = null;
        java.util.jar.Manifest r3 = null;
        java.util.jar.Manifest r2 = null;
        java.util.jar.Attributes r4 = null;
        java.security.MessageDigest r5 = null;
        byte[] r6 = null;
        java.util.TreeMap r7 = null;
        boolean r14 = false;
        java.util.Iterator r8 = null;
        abcd.IA r9 = null;
        java.lang.String r10 = null;
        java.util.regex.Pattern r11 = null;
        java.io.InputStream r12 = null;
        int r15 = 0;
        java.util.jar.Attributes r16 = null;
        java.util.jar.Attributes r17 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r1 = r13.get("META-INF/MANIFEST.MF");
                    if (r1 == null) { $pc2 = 5; continue $sw2; }
                    r3 = new java.util.jar.Manifest();
                    r3.read(r1.u7());
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    r2 = new java.util.jar.Manifest();
                    r4 = r2.getMainAttributes();
                    if (r3 == null) { $pc2 = 9; continue $sw2; }
                    r4.putAll(r3.getMainAttributes());
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    r5 = java.security.MessageDigest.getInstance("SHA1");
                    r6 = new byte[512];
                    r7 = new java.util.TreeMap();
                    r7.putAll(r13);
                    r14 = j6().isDebugEnabled();
                    if (r14 == false) { $pc2 = 13; continue $sw2; }
                    j6().FH("Manifest entries:");
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    r8 = r7.values().iterator();
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    if (r8.hasNext() == false) { $pc2 = 46; continue $sw2; }
                    r9 = (abcd.IA) r8.next();
                    if (this.Hw == true) { $pc2 = 46; continue $sw2; }
                    r10 = r9.EQ();
                    if (r14 == false) { $pc2 = 23; continue $sw2; }
                    j6().FH(r10);
                    $pc2 = 23; continue $sw2;
                }
                case 23: {
                    if (r9.j3() == true) { $pc2 = 15; continue $sw2; }
                    if (r10.equals("META-INF/MANIFEST.MF") == true) { $pc2 = 15; continue $sw2; }
                    if (r10.equals("META-INF/CERT.SF") == true) { $pc2 = 15; continue $sw2; }
                    if (r10.equals("META-INF/CERT.RSA") == true) { $pc2 = 15; continue $sw2; }
                    r11 = DW;
                    if (r11 == null) { $pc2 = 34; continue $sw2; }
                    if (r11.matcher(r10).matches() == true) { $pc2 = 15; continue $sw2; }
                    $pc2 = 34; continue $sw2;
                }
                case 34: {
                    this.v5.j6(0, "Generating manifest");
                    r12 = r9.u7();
                    $pc2 = 35; continue $sw2;
                }
                case 35: {
                    r15 = r12.read(r6);
                    if (r15 <= 0) { $pc2 = 38; continue $sw2; }
                    r5.update(r6, 0, r15);
                    { $pc2 = 35; continue $sw2; }
                }
                case 38: {
                    if (r3 == null) { $pc2 = 42; continue $sw2; }
                    r16 = r3.getAttributes(r10);
                    if (r16 == null) { $pc2 = 42; continue $sw2; }
                    r17 = new java.util.jar.Attributes(r16);
                    $pc2 = 43; continue $sw2;
                }
                case 43: {
                    if (r17 != null) { $pc2 = 45; continue $sw2; }
                    r17 = new java.util.jar.Attributes();
                    $pc2 = 45; continue $sw2;
                }
                case 45: {
                    r17.putValue("SHA1-Digest", abcd.yA.j6(r5.digest()));
                    r2.getEntries().put(r10, r17);
                    $pc2 = 42; continue $sw2;
                }
                case 42: {
                    r17 = null;
                    $pc2 = 46; continue $sw2;
                }
                case 46: {
                    return r2;
                }
                case 9: {
                    r4.putValue("Manifest-Version", "1.0");
                    r4.putValue("Created-By", "1.0 (Android SignApk)");
                    { $pc2 = 10; continue $sw2; }
                }
                case 5: {
                    r3 = null;
                    { $pc2 = 6; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.util.Map<java.lang.String, abcd.IA> r9, abcd.NA r10) {
        java.util.Iterator<abcd.IA> r0 = null;
        int r2 = 0;
        abcd.IA r3 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = r9.values().iterator();
                    r2 = 1;
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc3 = 9; continue $sw3; }
                    r3 = r0.next();
                    if (this.Hw == true) { $pc3 = 12; continue $sw3; }
                    this.v5.j6(0, java.lang.String.format("Copying zip entry %d of %d", new java.lang.Object[]{java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r9.size())}));
                    r2 = r2 + 1;
                    r10.j6(r3);
                    { $pc3 = 4; continue $sw3; }
                }
                case 12: {
                    return;
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.util.jar.Manifest r10, java.io.OutputStream r11) {
        java.security.MessageDigest r0 = null;
        java.io.PrintStream r1 = null;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.util.jar.Attributes>> r12 = null;
        java.util.Map.Entry<java.lang.String, java.util.jar.Attributes> r2 = null;
        java.lang.String r4 = null;
        java.util.Iterator<java.util.Map.Entry<java.lang.Object, java.lang.Object>> r3 = null;
        java.util.Map.Entry<java.lang.Object, java.lang.Object> r6 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r11.write("Signature-Version: 1.0\r\n".getBytes());
                    r11.write("Created-By: 1.0 (Android SignApk)\r\n".getBytes());
                    r0 = java.security.MessageDigest.getInstance("SHA1");
                    r1 = new java.io.PrintStream(new java.security.DigestOutputStream(new java.io.ByteArrayOutputStream(), r0), true, "UTF-8");
                    r10.write(r1);
                    r1.flush();
                    r11.write(("SHA1-Digest-Manifest: " + abcd.yA.j6(r0.digest()) + "\r\n\r\n").getBytes());
                    r12 = r10.getEntries().entrySet().iterator();
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r12.hasNext() == false) { $pc4 = 13; continue $sw4; }
                    r2 = r12.next();
                    if (this.Hw == true) { $pc4 = 17; continue $sw4; }
                    this.v5.j6(0, "Generating signature file");
                    r4 = "Name: " + r2.getKey() + "\r\n";
                    r1.print(r4);
                    r3 = r2.getValue().entrySet().iterator();
                    $pc4 = 10; continue $sw4;
                }
                case 10: {
                    if (r3.hasNext() == false) { $pc4 = 12; continue $sw4; }
                    r6 = r3.next();
                    r1.print(r6.getKey() + ": " + r6.getValue() + "\r\n");
                    { $pc4 = 10; continue $sw4; }
                }
                case 12: {
                    r1.print("\r\n");
                    r1.flush();
                    r11.write(r4.getBytes());
                    r11.write(("SHA1-Digest: " + abcd.yA.j6(r0.digest()) + "\r\n\r\n").getBytes());
                    { $pc4 = 4; continue $sw4; }
                }
                case 17: {
                    return;
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.util.jar.Manifest r9, java.util.Map<java.lang.String, abcd.IA> r10, abcd.NA r11, long r12) {
        java.util.ArrayList r0 = null;
        java.util.Iterator r13 = null;
        int r2 = 0;
        java.lang.String r3 = null;
        abcd.IA r4 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = new java.util.ArrayList(r9.getEntries().keySet());
                    java.util.Collections.sort(r0);
                    r13 = r0.iterator();
                    r2 = 1;
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    if (r13.hasNext() == false) { $pc5 = 9; continue $sw5; }
                    r3 = (java.lang.String) r13.next();
                    if (this.Hw == true) { $pc5 = 12; continue $sw5; }
                    this.v5.j6(0, java.lang.String.format("Copying zip entry %d of %d", new java.lang.Object[]{java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r0.size())}));
                    r2 = r2 + 1;
                    r4 = r10.get(r3);
                    r4.j6(r12);
                    r11.j6(r4);
                    { $pc5 = 4; continue $sw5; }
                }
                case 12: {
                    return;
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(byte[] r8, byte[] r9, java.security.cert.X509Certificate r10, java.io.OutputStream r11) {
        java.lang.reflect.Method r12 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r8 == null) { $pc6 = 14; continue $sw6; }
                    r11.write(r8);
                    r11.write(r9);
                    return;
                }
                case 14: {
                    try {
                        r12 = java.lang.Class.forName("kellinwood.sigblock.SignatureBlockWriter").getMethod("writeSignatureBlock", new java.lang.Class[]{new byte[1].getClass(), java.security.cert.X509Certificate.class, java.io.OutputStream.class});
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 11; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r12 == null) { $pc6 = 10; continue $sw6; }
                    try {
                        r12.invoke(null, new java.lang.Object[]{r9, r10, r11});
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 11; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 10: {
                    try {
                        throw new java.lang.IllegalStateException("writeSignatureBlock() method not found.");
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 11; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 11: {
                    e = $ex6;
                    j6().j6(e.getMessage(), e);
                    throw new java.lang.IllegalStateException("Failed to invoke writeSignatureBlock(): " + e.getClass().getName() + ": " + e.getMessage());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.security.cert.X509Certificate DW(java.net.URL r2) {
        java.io.InputStream r3 = null;
        java.security.cert.X509Certificate r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r3 = r2.openStream();
                    try {
                        r0 = (java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 6; continue $sw7;
                    }
                    r3.close();
                    return r0;
                }
                case 6: {
                    th = $ex7;
                    r3.close();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(java.lang.String r4) {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (j6().isDebugEnabled() == false) { $pc8 = 5; continue $sw8; }
                    j6().FH("setKeymode: " + r4);
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    this.gn = r4;
                    if (this.gn.startsWith("auto") == false) { $pc8 = 8; continue $sw8; }
                    this.VH = null;
                    return;
                }
                case 8: {
                    this.v5.j6();
                    j6(this.gn);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected java.lang.String j6(java.lang.String r10, java.util.Map<java.lang.String, abcd.IA> r11) {
        boolean r0 = false;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.IA>> r12 = null;
        java.lang.String r2 = null;
        java.util.Map.Entry<java.lang.String, abcd.IA> r3 = null;
        java.lang.String r4 = null;
        java.security.MessageDigest r5 = null;
        byte[] r6 = null;
        byte[] r7 = null;
        java.lang.StringBuilder r8 = null;
        int r9 = 0;
        int r13 = 0;
        java.lang.String r14 = null;
        java.lang.String r15 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = j6().isDebugEnabled();
                    if (r10.startsWith("auto") == true) { $pc9 = 5; continue $sw9; }
                    return r10;
                }
                case 5: {
                    r12 = r11.entrySet().iterator();
                    r2 = null;
                    $pc9 = 7; continue $sw9;
                }
                case 7: {
                    if (r12.hasNext() == false) { $pc9 = 28; continue $sw9; }
                    r3 = r12.next();
                    r4 = r3.getKey();
                    if (r4.startsWith("META-INF/") == false) { $pc9 = 7; continue $sw9; }
                    if (r4.endsWith(".RSA") == false) { $pc9 = 7; continue $sw9; }
                    r5 = java.security.MessageDigest.getInstance("MD5");
                    r6 = r3.getValue().v5();
                    if (r6.length < 1458) { $pc9 = 28; continue $sw9; }
                    r5.update(r6, 0, 1458);
                    r7 = r5.digest();
                    r8 = new java.lang.StringBuilder();
                    r9 = r7.length;
                    r13 = 0;
                    $pc9 = 17; continue $sw9;
                }
                case 17: {
                    if (r13 >= r9) { $pc9 = 19; continue $sw9; }
                    r8.append(java.lang.String.format("%02x", new java.lang.Object[]{java.lang.Byte.valueOf(r7[r13])}));
                    r13 = r13 + 1;
                    { $pc9 = 17; continue $sw9; }
                }
                case 19: {
                    r14 = r8.toString();
                    r15 = this.u7.get(r14);
                    if (r0 == false) { $pc9 = 24; continue $sw9; }
                    if (r15 == null) { $pc9 = 23; continue $sw9; }
                    j6().FH(java.lang.String.format("Auto-determined key=%s using md5=%s", new java.lang.Object[]{r15, r14}));
                    { $pc9 = 24; continue $sw9; }
                }
                case 23: {
                    j6().FH(java.lang.String.format("Auto key determination failed for md5=%s", new java.lang.Object[]{r14}));
                    $pc9 = 24; continue $sw9;
                }
                case 24: {
                    if (r15 != null) { $pc9 = 25; continue $sw9; }
                    r2 = r15;
                    { $pc9 = 7; continue $sw9; }
                }
                case 25: {
                    return r15;
                }
                case 28: {
                    if (r10.equals("auto-testkey") == false) { $pc9 = 34; continue $sw9; }
                    if (r0 == false) { $pc9 = 50; continue $sw9; }
                    j6().FH("Falling back to key=" + r2);
                    return "testkey";
                }
                case 50: {
                    return "testkey";
                }
                case 34: {
                    if (r10.equals("auto-none") == false) { $pc9 = 39; continue $sw9; }
                    if (r0 == false) { $pc9 = 51; continue $sw9; }
                    j6().FH("Unable to determine key, returning: none");
                    return "none";
                }
                case 51: {
                    return "none";
                }
                case 39: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.security.PrivateKey j6(java.net.URL r2, java.lang.String r3) {
        java.io.DataInputStream r0 = null;
        byte[] r4 = null;
        java.security.spec.KeySpec r5 = null;
        java.security.PrivateKey r6 = null;
        java.security.PrivateKey r7 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = new java.io.DataInputStream(r2.openStream());
                    try {
                        r4 = j6(r0);
                        r5 = j6(r4, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 12; continue $sw10;
                    }
                    if (r5 != null) { $pc10 = 17; continue $sw10; }
                    try {
                        r5 = new java.security.spec.PKCS8EncodedKeySpec(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 12; continue $sw10;
                    }
                    $pc10 = 17; continue $sw10;
                }
                case 17: {
                    try {
                        r6 = java.security.KeyFactory.getInstance("RSA").generatePrivate(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.security.spec.InvalidKeySpecException) { $pc10 = 9; continue $sw10; }
                        $pc10 = 12; continue $sw10;
                    }
                    r0.close();
                    return r6;
                }
                case 9: {
                    try {
                        r7 = java.security.KeyFactory.getInstance("DSA").generatePrivate(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 12; continue $sw10;
                    }
                    r0.close();
                    return r7;
                }
                case 12: {
                    th = $ex10;
                    r0.close();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r5) {
        java.net.URL r6 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    this.VH = this.Zo.get(r5);
                    if (this.VH == null) { $pc11 = 5; continue $sw11; }
                    return;
                }
                case 5: {
                    this.VH = new abcd.BA();
                    this.VH.j6(r5);
                    this.Zo.put(r5, this.VH);
                    if ("none".equals(r5) == false) { $pc11 = 8; continue $sw11; }
                    return;
                }
                case 8: {
                    this.v5.j6(1, "Loading certificate and private key");
                    this.VH.j6(j6(abcd.GA.class.getResource("/keys/" + r5 + ".pk8"), null));
                    this.VH.j6(DW(abcd.GA.class.getResource("/keys/" + r5 + ".x509.pem")));
                    r6 = abcd.GA.class.getResource("/keys/" + r5 + ".sbt");
                    if (r6 == null) { $pc11 = 12; continue $sw11; }
                    this.VH.j6(j6(r6));
                    return;
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r4, java.lang.String r5) {
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (new java.io.File(r4).getCanonicalFile().equals(new java.io.File(r5).getCanonicalFile()) == true) { $pc12 = 7; continue $sw12; }
                    this.v5.j6();
                    this.v5.j6(1, "Parsing the input's central directory");
                    j6(abcd.LA.j6(r4).j6(), new java.io.FileOutputStream(r5), r5);
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("Input and output files are the same.  Specify a different name for the output.");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r2, java.security.cert.X509Certificate r3, java.security.PrivateKey r4, byte[] r5) {
        this.VH = new abcd.BA(r2, r3, r4, r5);
    }

    public void j6(java.util.Map<java.lang.String, abcd.IA> r17, java.io.OutputStream r18, java.lang.String r19) {
        boolean r1 = false;
        java.lang.String r2 = null;
        abcd.NA r10 = null;
        java.lang.Throwable r3 = null;
        java.util.Iterator<abcd.IA> r4 = null;
        int r5 = 0;
        abcd.IA r6 = null;
        java.lang.String r13 = null;
        long r14 = 0L;
        java.util.jar.Manifest r7 = null;
        abcd.IA r8 = null;
        abcd.FA r9 = null;
        abcd.IA r11 = null;
        java.io.ByteArrayOutputStream r12 = null;
        byte[] r15 = null;
        byte[] r16 = null;
        java.security.MessageDigest r20 = null;
        byte[] r21 = null;
        javax.crypto.Cipher r22 = null;
        byte[] r23 = null;
        abcd.IA r24 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r1 = j6().isDebugEnabled();
                    this.v5.j6();
                    if (this.VH != null) { $pc13 = 127; continue $sw13; }
                    if (this.gn.startsWith("auto") == false) { $pc13 = 12; continue $sw13; }
                    r2 = j6(this.gn, r17);
                    if (r2 == null) { $pc13 = 10; continue $sw13; }
                    this.tp.notifyObservers(r2);
                    j6(r2);
                    { $pc13 = 127; continue $sw13; }
                }
                case 10: {
                    throw new abcd.xA("Unable to auto-select key for signing " + new java.io.File(r19).getName());
                }
                case 12: {
                    throw new java.lang.IllegalStateException("No keys configured for signing the file!");
                }
                case 127: {
                    try {
                        r10 = new abcd.NA(r18);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 100; continue $sw13;
                    }
                    $pc13 = 98; continue $sw13;
                }
                case 98: {
                    th = $ex13;
                    r3 = th;
                    $pc13 = 102; continue $sw13;
                }
                case 102: {
                    r10.j6();
                    if (this.Hw == false) { $pc13 = 161; continue $sw13; }
                    if (r19 == null) { $pc13 = 162; continue $sw13; }
                    try {
                        new java.io.File(r19).delete();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 107; continue $sw13;
                    }
                    throw r3;
                }
                case 107: {
                    th = $ex13;
                    j6().DW(th.getClass().getName() + ":" + th.getMessage());
                    throw r3;
                }
                case 162: {
                    throw r3;
                }
                case 161: {
                    throw r3;
                }
                case 16: {
                    if ("none".equals(this.VH.j6()) == false) { $pc13 = 26; continue $sw13; }
                    try {
                        this.v5.DW(r17.size());
                        this.v5.j6(0);
                        j6(r17, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 98; continue $sw13;
                    }
                    r10.j6();
                    if (this.Hw == false) { $pc13 = 143; continue $sw13; }
                    if (r19 == null) { $pc13 = 144; continue $sw13; }
                    try {
                        new java.io.File(r19).delete();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 23; continue $sw13;
                    }
                    return;
                }
                case 23: {
                    th = $ex13;
                    j6().DW(th.getClass().getName() + ":" + th.getMessage());
                    return;
                }
                case 144: {
                    return;
                }
                case 143: {
                    return;
                }
                case 26: {
                    try {
                        r4 = r17.values().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 98; continue $sw13;
                    }
                    r5 = 0;
                    $pc13 = 29; continue $sw13;
                }
                case 29: {
                    if (r4.hasNext() == false) { $pc13 = 43; continue $sw13; }
                    try {
                        r6 = r4.next();
                        r13 = r6.EQ();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 98; continue $sw13;
                    }
                    if (r6.j3() == true) { $pc13 = 29; continue $sw13; }
                    if (r13.equals("META-INF/MANIFEST.MF") == true) { $pc13 = 29; continue $sw13; }
                    if (r13.equals("META-INF/CERT.SF") == true) { $pc13 = 29; continue $sw13; }
                    if (r13.equals("META-INF/CERT.RSA") == true) { $pc13 = 29; continue $sw13; }
                    if (DW == null) { $pc13 = 42; continue $sw13; }
                    if (DW.matcher(r13).matches() == true) { $pc13 = 29; continue $sw13; }
                    $pc13 = 42; continue $sw13;
                }
                case 42: {
                    try {
                        r5 = r5 + 3;
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 98; continue $sw13;
                    }
                    { $pc13 = 29; continue $sw13; }
                }
                case 43: {
                    try {
                        this.v5.DW(r5 + 1);
                        this.v5.j6(0);
                        r14 = 3600000 + this.VH.FH().getNotBefore().getTime();
                        r7 = j6(r17);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 98; continue $sw13;
                    }
                    if (this.Hw == false) { $pc13 = 53; continue $sw13; }
                    r10.j6();
                    if (this.Hw == false) { $pc13 = 146; continue $sw13; }
                    if (r19 == null) { $pc13 = 147; continue $sw13; }
                    try {
                        new java.io.File(r19).delete();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 50; continue $sw13;
                    }
                    return;
                }
                case 50: {
                    th = $ex13;
                    j6().DW(th.getClass().getName() + ":" + th.getMessage());
                    return;
                }
                case 147: {
                    return;
                }
                case 146: {
                    return;
                }
                case 53: {
                    try {
                        r8 = new abcd.IA("META-INF/MANIFEST.MF");
                        r8.j6(r14);
                        r7.write(r8.J0());
                        r10.j6(r8);
                        r9 = new abcd.FA();
                        r9.j6(this.VH.DW());
                        r11 = new abcd.IA("META-INF/CERT.SF");
                        r11.j6(r14);
                        r12 = new java.io.ByteArrayOutputStream();
                        j6(r7, r12);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 98; continue $sw13;
                    }
                    if (this.Hw == false) { $pc13 = 63; continue $sw13; }
                    r10.j6();
                    if (this.Hw == false) { $pc13 = 149; continue $sw13; }
                    if (r19 == null) { $pc13 = 150; continue $sw13; }
                    try {
                        new java.io.File(r19).delete();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 60; continue $sw13;
                    }
                    return;
                }
                case 60: {
                    th = $ex13;
                    j6().DW(th.getClass().getName() + ":" + th.getMessage());
                    return;
                }
                case 150: {
                    return;
                }
                case 149: {
                    return;
                }
                case 63: {
                    try {
                        r15 = r12.toByteArray();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 98; continue $sw13;
                    }
                    if (r1 == false) { $pc13 = 66; continue $sw13; }
                    try {
                        j6().FH("Signature File: \n" + new java.lang.String(r15) + "\n" + abcd.zA.j6(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 98; continue $sw13;
                    }
                    $pc13 = 66; continue $sw13;
                }
                case 66: {
                    try {
                        r11.J0().write(r15);
                        r10.j6(r11);
                        r9.j6(r15);
                        r16 = r9.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 98; continue $sw13;
                    }
                    if (r1 == false) { $pc13 = 69; continue $sw13; }
                    try {
                        r20 = java.security.MessageDigest.getInstance("SHA1");
                        r20.update(r15);
                        r21 = r20.digest();
                        j6().FH("Sig File SHA1: \n" + abcd.zA.j6(r21));
                        j6().FH("Signature: \n" + abcd.zA.j6(r16));
                        r22 = javax.crypto.Cipher.getInstance("RSA/ECB/PKCS1Padding");
                        r22.init(2, this.VH.FH());
                        r23 = r22.doFinal(r16);
                        j6().FH("Signature Decrypted: \n" + abcd.zA.j6(r23));
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 98; continue $sw13;
                    }
                    $pc13 = 69; continue $sw13;
                }
                case 69: {
                    try {
                        this.v5.j6(0, "Generating signature block file");
                        r24 = new abcd.IA("META-INF/CERT.RSA");
                        r24.j6(r14);
                        j6(this.VH.Hw(), r16, this.VH.FH(), r24.J0());
                        r10.j6(r24);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 98; continue $sw13;
                    }
                    if (this.Hw == false) { $pc13 = 80; continue $sw13; }
                    r10.j6();
                    if (this.Hw == false) { $pc13 = 152; continue $sw13; }
                    if (r19 == null) { $pc13 = 153; continue $sw13; }
                    try {
                        new java.io.File(r19).delete();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 76; continue $sw13;
                    }
                    return;
                }
                case 76: {
                    th = $ex13;
                    j6().DW(th.getClass().getName() + ":" + th.getMessage());
                    return;
                }
                case 153: {
                    return;
                }
                case 152: {
                    return;
                }
                case 80: {
                    try {
                        j6(r7, r17, r10, r14);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 98; continue $sw13;
                    }
                    if (this.Hw == false) { $pc13 = 90; continue $sw13; }
                    r10.j6();
                    if (this.Hw == false) { $pc13 = 155; continue $sw13; }
                    if (r19 == null) { $pc13 = 156; continue $sw13; }
                    try {
                        new java.io.File(r19).delete();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 87; continue $sw13;
                    }
                    return;
                }
                case 87: {
                    th = $ex13;
                    j6().DW(th.getClass().getName() + ":" + th.getMessage());
                    return;
                }
                case 156: {
                    return;
                }
                case 155: {
                    return;
                }
                case 90: {
                    r10.j6();
                    if (this.Hw == false) { $pc13 = 158; continue $sw13; }
                    if (r19 == null) { $pc13 = 159; continue $sw13; }
                    try {
                        new java.io.File(r19).delete();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 95; continue $sw13;
                    }
                    return;
                }
                case 95: {
                    th = $ex13;
                    j6().DW(th.getClass().getName() + ":" + th.getMessage());
                    return;
                }
                case 159: {
                    return;
                }
                case 158: {
                    return;
                }
                case 100: {
                    th = $ex13;
                    r3 = th;
                    r10 = null;
                    { $pc13 = 102; continue $sw13; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public byte[] j6(java.io.InputStream r5) {
        java.io.ByteArrayOutputStream r0 = null;
        byte[] r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = new java.io.ByteArrayOutputStream();
                    r1 = new byte[2048];
                    r2 = r5.read(r1);
                    $pc14 = 4; continue $sw14;
                }
                case 4: {
                    if (r2 == (-1)) { $pc14 = 7; continue $sw14; }
                    r0.write(r1, 0, r2);
                    r2 = r5.read(r1);
                    { $pc14 = 4; continue $sw14; }
                }
                case 7: {
                    return r0.toByteArray();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public byte[] j6(java.net.URL r1) {
        return j6(r1.openStream());
    }
}
