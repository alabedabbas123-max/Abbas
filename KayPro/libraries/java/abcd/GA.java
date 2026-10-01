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
        if (j6 != null) goto L6;
        j6 = abcd.uA.j6(abcd.GA.class.getName());
    L6:
        return j6;
    }

    private java.security.spec.KeySpec j6(byte[] r4, java.lang.String r5) {
        javax.crypto.EncryptedPrivateKeyInfo r0 = new javax.crypto.EncryptedPrivateKeyInfo(r4);     // Catch: java.io.IOException -> L9
        char[] r6 = r5.toCharArray();
        javax.crypto.SecretKey r7 = javax.crypto.SecretKeyFactory.getInstance(r0.getAlgName()).generateSecret(new javax.crypto.spec.PBEKeySpec(r6));
        javax.crypto.Cipher r8 = javax.crypto.Cipher.getInstance(r0.getAlgName());
        r8.init(2, r7, r0.getAlgParameters());
        return r0.getKeySpec(r8);
    L6:
        e = move-exception;
        j6().j6("signapk: Password for private key may be bad.");
        throw e;
    L9:
        return null;
    }

    private java.util.jar.Manifest j6(java.util.Map<java.lang.String, abcd.IA> r13) {
        abcd.IA r1 = r13.get("META-INF/MANIFEST.MF");
        if (r1 == null) goto L5;
        java.util.jar.Manifest r3 = new java.util.jar.Manifest();
        r3.read(r1.u7());
    L6:
        java.util.jar.Manifest r2 = new java.util.jar.Manifest();
        java.util.jar.Attributes r4 = r2.getMainAttributes();
        if (r3 == null) goto L9;
        r4.putAll(r3.getMainAttributes());
    L10:
        java.security.MessageDigest r5 = java.security.MessageDigest.getInstance("SHA1");
        byte[] r6 = new byte[512];
        java.util.TreeMap r7 = new java.util.TreeMap();
        r7.putAll(r13);
        boolean r14 = j6().isDebugEnabled();
        if (r14 == false) goto L13;
        j6().FH("Manifest entries:");
    L13:
        java.util.Iterator r8 = r7.values().iterator();
    L15:
        if (r8.hasNext() == false) goto L46;
        abcd.IA r9 = (abcd.IA) r8.next();
        if (this.Hw == true) goto L46;
        java.lang.String r10 = r9.EQ();
        if (r14 == false) goto L23;
        j6().FH(r10);
    L23:
        if (r9.j3() == true) goto L15;
        if (r10.equals("META-INF/MANIFEST.MF") == true) goto L15;
        if (r10.equals("META-INF/CERT.SF") == true) goto L15;
        if (r10.equals("META-INF/CERT.RSA") == true) goto L15;
        java.util.regex.Pattern r11 = DW;
        if (r11 == null) goto L34;
        if (r11.matcher(r10).matches() == true) goto L15;
    L34:
        this.v5.j6(0, "Generating manifest");
        java.io.InputStream r12 = r9.u7();
    L35:
        int r15 = r12.read(r6);
        if (r15 <= 0) goto L38;
        r5.update(r6, 0, r15);
        goto L35
    L38:
        if (r3 == null) goto L42;
        java.util.jar.Attributes r16 = r3.getAttributes(r10);
        if (r16 == null) goto L42;
        java.util.jar.Attributes r17 = new java.util.jar.Attributes(r16);
    L43:
        if (r17 != null) goto L45;
        r17 = new java.util.jar.Attributes();
    L45:
        r17.putValue("SHA1-Digest", abcd.yA.j6(r5.digest()));
        r2.getEntries().put(r10, r17);
    L42:
        r17 = null;
    L46:
        return r2;
    L9:
        r4.putValue("Manifest-Version", "1.0");
        r4.putValue("Created-By", "1.0 (Android SignApk)");
        goto L10
    L5:
        r3 = null;
        goto L6
    }

    private void j6(java.util.Map<java.lang.String, abcd.IA> r9, abcd.NA r10) {
        java.util.Iterator<abcd.IA> r0 = r9.values().iterator();
        int r2 = 1;
    L4:
        if (r0.hasNext() == false) goto L9;
        abcd.IA r3 = r0.next();
        if (this.Hw == true) goto L12;
        this.v5.j6(0, java.lang.String.format("Copying zip entry %d of %d", new java.lang.Object[]{java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r9.size())}));
        r2 = r2 + 1;
        r10.j6(r3);
        goto L4
    L12:
        return;
    }

    private void j6(java.util.jar.Manifest r10, java.io.OutputStream r11) {
        r11.write("Signature-Version: 1.0\r\n".getBytes());
        r11.write("Created-By: 1.0 (Android SignApk)\r\n".getBytes());
        java.security.MessageDigest r0 = java.security.MessageDigest.getInstance("SHA1");
        java.io.PrintStream r1 = new java.io.PrintStream(new java.security.DigestOutputStream(new java.io.ByteArrayOutputStream(), r0), true, "UTF-8");
        r10.write(r1);
        r1.flush();
        r11.write(("SHA1-Digest-Manifest: " + abcd.yA.j6(r0.digest()) + "\r\n\r\n").getBytes());
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.util.jar.Attributes>> r12 = r10.getEntries().entrySet().iterator();
    L4:
        if (r12.hasNext() == false) goto L13;
        java.util.Map.Entry<java.lang.String, java.util.jar.Attributes> r2 = r12.next();
        if (this.Hw == true) goto L17;
        this.v5.j6(0, "Generating signature file");
        java.lang.String r4 = "Name: " + r2.getKey() + "\r\n";
        r1.print(r4);
        java.util.Iterator<java.util.Map.Entry<java.lang.Object, java.lang.Object>> r3 = r2.getValue().entrySet().iterator();
    L10:
        if (r3.hasNext() == false) goto L12;
        java.util.Map.Entry<java.lang.Object, java.lang.Object> r6 = r3.next();
        r1.print(r6.getKey() + ": " + r6.getValue() + "\r\n");
        goto L10
    L12:
        r1.print("\r\n");
        r1.flush();
        r11.write(r4.getBytes());
        r11.write(("SHA1-Digest: " + abcd.yA.j6(r0.digest()) + "\r\n\r\n").getBytes());
        goto L4
    L17:
        return;
    }

    private void j6(java.util.jar.Manifest r9, java.util.Map<java.lang.String, abcd.IA> r10, abcd.NA r11, long r12) {
        java.util.ArrayList r0 = new java.util.ArrayList(r9.getEntries().keySet());
        java.util.Collections.sort(r0);
        java.util.Iterator r13 = r0.iterator();
        int r2 = 1;
    L4:
        if (r13.hasNext() == false) goto L9;
        java.lang.String r3 = (java.lang.String) r13.next();
        if (this.Hw == true) goto L12;
        this.v5.j6(0, java.lang.String.format("Copying zip entry %d of %d", new java.lang.Object[]{java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r0.size())}));
        r2 = r2 + 1;
        abcd.IA r4 = r10.get(r3);
        r4.j6(r12);
        r11.j6(r4);
        goto L4
    L12:
        return;
    }

    private void j6(byte[] r8, byte[] r9, java.security.cert.X509Certificate r10, java.io.OutputStream r11) {
        if (r8 == null) goto L14;
        r11.write(r8);
        r11.write(r9);
        return;
    L14:
        java.lang.reflect.Method r12 = java.lang.Class.forName("kellinwood.sigblock.SignatureBlockWriter").getMethod("writeSignatureBlock", new java.lang.Class[]{new byte[1].getClass(), java.security.cert.X509Certificate.class, java.io.OutputStream.class});     // Catch: java.lang.Exception -> L11
        if (r12 == null) goto L10;
        r12.invoke(null, new java.lang.Object[]{r9, r10, r11});     // Catch: java.lang.Exception -> L11
        return;
    L10:
        throw new java.lang.IllegalStateException("writeSignatureBlock() method not found.");     // Catch: java.lang.Exception -> L11
    L11:
        e = move-exception;
        j6().j6(e.getMessage(), e);
        throw new java.lang.IllegalStateException("Failed to invoke writeSignatureBlock(): " + e.getClass().getName() + ": " + e.getMessage());
    }

    public java.security.cert.X509Certificate DW(java.net.URL r2) {
        java.io.InputStream r3 = r2.openStream();
        java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(r3);     // Catch: java.lang.Throwable -> L6
        r3.close();
        return r0;
    L6:
        th = move-exception;
        r3.close();
        throw th;
    }

    public void DW(java.lang.String r4) {
        if (j6().isDebugEnabled() == false) goto L5;
        j6().FH("setKeymode: " + r4);
    L5:
        this.gn = r4;
        if (this.gn.startsWith("auto") == false) goto L8;
        this.VH = null;
        return;
    L8:
        this.v5.j6();
        j6(this.gn);
    }

    protected java.lang.String j6(java.lang.String r10, java.util.Map<java.lang.String, abcd.IA> r11) {
        boolean r0 = j6().isDebugEnabled();
        if (r10.startsWith("auto") == true) goto L5;
        return r10;
    L5:
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.IA>> r12 = r11.entrySet().iterator();
        java.lang.String r2 = null;
    L7:
        if (r12.hasNext() == false) goto L28;
        java.util.Map.Entry<java.lang.String, abcd.IA> r3 = r12.next();
        java.lang.String r4 = r3.getKey();
        if (r4.startsWith("META-INF/") == false) goto L7;
        if (r4.endsWith(".RSA") == false) goto L7;
        java.security.MessageDigest r5 = java.security.MessageDigest.getInstance("MD5");
        byte[] r6 = r3.getValue().v5();
        if (r6.length < 1458) goto L28;
        r5.update(r6, 0, 1458);
        byte[] r7 = r5.digest();
        java.lang.StringBuilder r8 = new java.lang.StringBuilder();
        int r9 = r7.length;
        int r13 = 0;
    L17:
        if (r13 >= r9) goto L19;
        r8.append(java.lang.String.format("%02x", new java.lang.Object[]{java.lang.Byte.valueOf(r7[r13])}));
        r13 = r13 + 1;
        goto L17
    L19:
        java.lang.String r14 = r8.toString();
        java.lang.String r15 = this.u7.get(r14);
        if (r0 == false) goto L24;
        if (r15 == null) goto L23;
        j6().FH(java.lang.String.format("Auto-determined key=%s using md5=%s", new java.lang.Object[]{r15, r14}));
        goto L24
    L23:
        j6().FH(java.lang.String.format("Auto key determination failed for md5=%s", new java.lang.Object[]{r14}));
    L24:
        if (r15 != null) goto L25;
        r2 = r15;
        goto L7
    L25:
        return r15;
    L28:
        if (r10.equals("auto-testkey") == false) goto L34;
        if (r0 == false) goto L50;
        j6().FH("Falling back to key=" + r2);
        return "testkey";
    L50:
        return "testkey";
    L34:
        if (r10.equals("auto-none") == false) goto L39;
        if (r0 == false) goto L51;
        j6().FH("Unable to determine key, returning: none");
        return "none";
    L51:
        return "none";
    L39:
        return null;
    }

    public java.security.PrivateKey j6(java.net.URL r2, java.lang.String r3) {
        java.io.DataInputStream r0 = new java.io.DataInputStream(r2.openStream());
        byte[] r4 = j6(r0);     // Catch: java.lang.Throwable -> L12
        java.security.spec.KeySpec r5 = j6(r4, r3);     // Catch: java.lang.Throwable -> L12
        if (r5 != null) goto L17;
        r5 = new java.security.spec.PKCS8EncodedKeySpec(r4);     // Catch: java.lang.Throwable -> L12
    L17:
        java.security.PrivateKey r6 = java.security.KeyFactory.getInstance("RSA").generatePrivate(r5);     // Catch: java.security.spec.InvalidKeySpecException -> L9 java.lang.Throwable -> L12
        r0.close();
        return r6;
    L9:
        java.security.PrivateKey r7 = java.security.KeyFactory.getInstance("DSA").generatePrivate(r5);     // Catch: java.lang.Throwable -> L12
        r0.close();
        return r7;
    L12:
        th = move-exception;
        r0.close();
        throw th;
    }

    public void j6(java.lang.String r5) {
        this.VH = this.Zo.get(r5);
        if (this.VH == null) goto L5;
        return;
    L5:
        this.VH = new abcd.BA();
        this.VH.j6(r5);
        this.Zo.put(r5, this.VH);
        if ("none".equals(r5) == false) goto L8;
        return;
    L8:
        this.v5.j6(1, "Loading certificate and private key");
        this.VH.j6(j6(abcd.GA.class.getResource("/keys/" + r5 + ".pk8"), null));
        this.VH.j6(DW(abcd.GA.class.getResource("/keys/" + r5 + ".x509.pem")));
        java.net.URL r6 = abcd.GA.class.getResource("/keys/" + r5 + ".sbt");
        if (r6 == null) goto L12;
        this.VH.j6(j6(r6));
        return;
    }

    public void j6(java.lang.String r4, java.lang.String r5) {
        if (new java.io.File(r4).getCanonicalFile().equals(new java.io.File(r5).getCanonicalFile()) == true) goto L7;
        this.v5.j6();
        this.v5.j6(1, "Parsing the input's central directory");
        j6(abcd.LA.j6(r4).j6(), new java.io.FileOutputStream(r5), r5);
        return;
    L7:
        throw new java.lang.IllegalArgumentException("Input and output files are the same.  Specify a different name for the output.");
    }

    public void j6(java.lang.String r2, java.security.cert.X509Certificate r3, java.security.PrivateKey r4, byte[] r5) {
        this.VH = new abcd.BA(r2, r3, r4, r5);
    }

    public void j6(java.util.Map<java.lang.String, abcd.IA> r17, java.io.OutputStream r18, java.lang.String r19) {
        boolean r1 = j6().isDebugEnabled();
        this.v5.j6();
        if (this.VH != null) goto L127;
        if (this.gn.startsWith("auto") == false) goto L12;
        java.lang.String r2 = j6(this.gn, r17);
        if (r2 == null) goto L10;
        this.tp.notifyObservers(r2);
        j6(r2);
        goto L127
    L10:
        throw new abcd.xA("Unable to auto-select key for signing " + new java.io.File(r19).getName());
    L12:
        throw new java.lang.IllegalStateException("No keys configured for signing the file!");
    L127:
        abcd.NA r10 = new abcd.NA(r18);     // Catch: java.lang.Throwable -> L100
    L98:
        th = move-exception;
        java.lang.Throwable r3 = th;
    L102:
        r10.j6();
        if (this.Hw == false) goto L161;
        if (r19 == null) goto L162;
        new java.io.File(r19).delete();     // Catch: java.lang.Throwable -> L107
        throw r3;
    L107:
        th = move-exception;
        j6().DW(th.getClass().getName() + ":" + th.getMessage());
        throw r3;
    L162:
        throw r3;
    L161:
        throw r3;
    L16:
        if ("none".equals(this.VH.j6()) == false) goto L26;
        this.v5.DW(r17.size());     // Catch: java.lang.Throwable -> L98
        this.v5.j6(0);     // Catch: java.lang.Throwable -> L98
        j6(r17, r10);     // Catch: java.lang.Throwable -> L98
        r10.j6();
        if (this.Hw == false) goto L143;
        if (r19 == null) goto L144;
        new java.io.File(r19).delete();     // Catch: java.lang.Throwable -> L23
        return;
    L23:
        th = move-exception;
        j6().DW(th.getClass().getName() + ":" + th.getMessage());
        return;
    L144:
        return;
    L143:
        return;
    L26:
        java.util.Iterator<abcd.IA> r4 = r17.values().iterator();     // Catch: java.lang.Throwable -> L98
        int r5 = 0;
    L29:
        if (r4.hasNext() == false) goto L43;
        abcd.IA r6 = r4.next();     // Catch: java.lang.Throwable -> L98
        java.lang.String r13 = r6.EQ();     // Catch: java.lang.Throwable -> L98
        if (r6.j3() == true) goto L29;
        if (r13.equals("META-INF/MANIFEST.MF") == true) goto L29;
        if (r13.equals("META-INF/CERT.SF") == true) goto L29;
        if (r13.equals("META-INF/CERT.RSA") == true) goto L29;
        if (DW == null) goto L42;
        if (DW.matcher(r13).matches() == true) goto L29;
    L42:
        r5 = r5 + 3;     // Catch: java.lang.Throwable -> L98
        goto L29
    L43:
        this.v5.DW(r5 + 1);     // Catch: java.lang.Throwable -> L98
        this.v5.j6(0);     // Catch: java.lang.Throwable -> L98
        long r14 = 3600000 + this.VH.FH().getNotBefore().getTime();     // Catch: java.lang.Throwable -> L98
        java.util.jar.Manifest r7 = j6(r17);     // Catch: java.lang.Throwable -> L98
        if (this.Hw == false) goto L53;
        r10.j6();
        if (this.Hw == false) goto L146;
        if (r19 == null) goto L147;
        new java.io.File(r19).delete();     // Catch: java.lang.Throwable -> L50
        return;
    L50:
        th = move-exception;
        j6().DW(th.getClass().getName() + ":" + th.getMessage());
        return;
    L147:
        return;
    L146:
        return;
    L53:
        abcd.IA r8 = new abcd.IA("META-INF/MANIFEST.MF");     // Catch: java.lang.Throwable -> L98
        r8.j6(r14);     // Catch: java.lang.Throwable -> L98
        r7.write(r8.J0());     // Catch: java.lang.Throwable -> L98
        r10.j6(r8);     // Catch: java.lang.Throwable -> L98
        abcd.FA r9 = new abcd.FA();     // Catch: java.lang.Throwable -> L98
        r9.j6(this.VH.DW());     // Catch: java.lang.Throwable -> L98
        abcd.IA r11 = new abcd.IA("META-INF/CERT.SF");     // Catch: java.lang.Throwable -> L98
        r11.j6(r14);     // Catch: java.lang.Throwable -> L98
        java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream();     // Catch: java.lang.Throwable -> L98
        j6(r7, r12);     // Catch: java.lang.Throwable -> L98
        if (this.Hw == false) goto L63;
        r10.j6();
        if (this.Hw == false) goto L149;
        if (r19 == null) goto L150;
        new java.io.File(r19).delete();     // Catch: java.lang.Throwable -> L60
        return;
    L60:
        th = move-exception;
        j6().DW(th.getClass().getName() + ":" + th.getMessage());
        return;
    L150:
        return;
    L149:
        return;
    L63:
        byte[] r15 = r12.toByteArray();     // Catch: java.lang.Throwable -> L98
        if (r1 == false) goto L66;
        j6().FH("Signature File: \n" + new java.lang.String(r15) + "\n" + abcd.zA.j6(r15));     // Catch: java.lang.Throwable -> L98
    L66:
        r11.J0().write(r15);     // Catch: java.lang.Throwable -> L98
        r10.j6(r11);     // Catch: java.lang.Throwable -> L98
        r9.j6(r15);     // Catch: java.lang.Throwable -> L98
        byte[] r16 = r9.j6();     // Catch: java.lang.Throwable -> L98
        if (r1 == false) goto L69;
        java.security.MessageDigest r20 = java.security.MessageDigest.getInstance("SHA1");     // Catch: java.lang.Throwable -> L98
        r20.update(r15);     // Catch: java.lang.Throwable -> L98
        byte[] r21 = r20.digest();     // Catch: java.lang.Throwable -> L98
        j6().FH("Sig File SHA1: \n" + abcd.zA.j6(r21));     // Catch: java.lang.Throwable -> L98
        j6().FH("Signature: \n" + abcd.zA.j6(r16));     // Catch: java.lang.Throwable -> L98
        javax.crypto.Cipher r22 = javax.crypto.Cipher.getInstance("RSA/ECB/PKCS1Padding");     // Catch: java.lang.Throwable -> L98
        r22.init(2, this.VH.FH());     // Catch: java.lang.Throwable -> L98
        byte[] r23 = r22.doFinal(r16);     // Catch: java.lang.Throwable -> L98
        j6().FH("Signature Decrypted: \n" + abcd.zA.j6(r23));     // Catch: java.lang.Throwable -> L98
    L69:
        this.v5.j6(0, "Generating signature block file");     // Catch: java.lang.Throwable -> L98
        abcd.IA r24 = new abcd.IA("META-INF/CERT.RSA");     // Catch: java.lang.Throwable -> L98
        r24.j6(r14);     // Catch: java.lang.Throwable -> L98
        j6(this.VH.Hw(), r16, this.VH.FH(), r24.J0());     // Catch: java.lang.Throwable -> L98
        r10.j6(r24);     // Catch: java.lang.Throwable -> L98
        if (this.Hw == false) goto L80;
        r10.j6();
        if (this.Hw == false) goto L152;
        if (r19 == null) goto L153;
        new java.io.File(r19).delete();     // Catch: java.lang.Throwable -> L76
        return;
    L76:
        th = move-exception;
        j6().DW(th.getClass().getName() + ":" + th.getMessage());
        return;
    L153:
        return;
    L152:
        return;
    L80:
        j6(r7, r17, r10, r14);     // Catch: java.lang.Throwable -> L98
        if (this.Hw == false) goto L90;
        r10.j6();
        if (this.Hw == false) goto L155;
        if (r19 == null) goto L156;
        new java.io.File(r19).delete();     // Catch: java.lang.Throwable -> L87
        return;
    L87:
        th = move-exception;
        j6().DW(th.getClass().getName() + ":" + th.getMessage());
        return;
    L156:
        return;
    L155:
        return;
    L90:
        r10.j6();
        if (this.Hw == false) goto L158;
        if (r19 == null) goto L159;
        new java.io.File(r19).delete();     // Catch: java.lang.Throwable -> L95
        return;
    L95:
        th = move-exception;
        j6().DW(th.getClass().getName() + ":" + th.getMessage());
        return;
    L159:
        return;
    L158:
        return;
    L100:
        th = move-exception;
        r3 = th;
        r10 = null;
        goto L102
    }

    public byte[] j6(java.io.InputStream r5) {
        java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream();
        byte[] r1 = new byte[2048];
        int r2 = r5.read(r1);
    L4:
        if (r2 == (-1)) goto L7;
        r0.write(r1, 0, r2);
        r2 = r5.read(r1);
        goto L4
    L7:
        return r0.toByteArray();
    }

    public byte[] j6(java.net.URL r1) {
        return j6(r1.openStream());
    }
}
