package abcd;

public class _H {
    private static final java.util.Set<java.lang.String> j6 = null;
    private final java.lang.String DW;
    private final javax.crypto.spec.SecretKeySpec FH;
    private final java.net.ProxySelector Hw;
    private final abcd.NJ VH;
    private final int Zo;
    private final java.lang.String v5;

    private final class a extends org.xml.sax.helpers.DefaultHandler {
        private final java.lang.String DW;
        private final java.lang.String FH;
        boolean Hw;
        final abcd._H Zo;
        final java.util.List<java.lang.String> j6;
        private java.lang.StringBuilder v5;

        a(abcd._H r1, java.lang.String r2, java.lang.String r3) {
            this.Zo = r1;
            this.j6 = new java.util.ArrayList();
            this.DW = r2;
            this.FH = r3;
        }

        @Override
        public void characters(char[] r2, int r3, int r4) {
            java.lang.StringBuilder r0 = this.v5;
            if (r0 == null) goto L6;
            r0.append(r2, r3, r4);
            return;
        }

        @Override
        public void endElement(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            if ("Key".equals(r2) == false) goto L6;
            this.j6.add(this.v5.toString().substring(this.FH.length()));
        L8:
            this.v5 = null;
            return;
        L6:
            if ("IsTruncated".equals(r2) == false) goto L8;
            this.Hw = abcd.NK.j6("true", this.v5.toString());
            goto L8
        }

        @Override
        public void ignorableWhitespace(char[] r2, int r3, int r4) {
            java.lang.StringBuilder r0 = this.v5;
            if (r0 == null) goto L6;
            r0.append(r2, r3, r4);
            return;
        }

        void j6() {
            java.util.TreeMap r0 = new java.util.TreeMap();
            if (this.FH.length() <= 0) goto L6;
            r0.put("prefix", this.FH);
        L6:
            if (this.j6.isEmpty() == true) goto L8;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder(java.lang.String.valueOf(this.FH));
            java.util.List<java.lang.String> r3 = this.j6;
            r1.append(r3.get(r3.size() - 1));
            r0.put("marker", r1.toString());
        L8:
            int r4 = 0;
        L10:
            if (r4 >= abcd._H.j6(this.Zo)) goto L34;
            java.net.HttpURLConnection r5 = abcd._H.j6(this.Zo, "GET", this.DW, "", r0);
            abcd._H.j6(this.Zo, r5);
            int r6 = abcd.AK.j6(r5);
            if (r6 == 200) goto L18;
            if (r6 != 500) goto L17;
            r4 = r4 + 1;
            goto L10
        L17:
            throw abcd._H.j6(this.Zo, "Listing", this.FH, r5);
        L18:
            this.Hw = false;
            this.v5 = null;
            org.xml.sax.XMLReader r2 = org.xml.sax.helpers.XMLReaderFactory.createXMLReader();     // Catch: org.xml.sax.SAXException -> L31
            r2.setContentHandler(this);
            java.io.InputStream r7 = r5.getInputStream();
            r2.parse(new org.xml.sax.InputSource(r7));     // Catch: java.lang.Throwable -> L24 org.xml.sax.SAXException -> L26
            r7.close();
            return;
        L24:
            th = move-exception;
            r7.close();
            throw th;
        L26:
            e = move-exception;
            java.io.IOException r8 = new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().errorListing, new java.lang.Object[]{this.FH}));     // Catch: java.lang.Throwable -> L24
            r8.initCause(e);     // Catch: java.lang.Throwable -> L24
            throw r8;     // Catch: java.lang.Throwable -> L24
        L32:
            throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().noXMLParserAvailable);
        L34:
            throw abcd._H.j6(this.Zo, "Listing", this.FH);
        }

        @Override
        public void startElement(java.lang.String r1, java.lang.String r2, java.lang.String r3, org.xml.sax.Attributes r4) {
            if ("Key".equals(r2) == false) goto L5;
        L6:
            this.v5 = new java.lang.StringBuilder();
            return;
        L5:
            if ("IsTruncated".equals(r2) == true) goto L6;
        }
    }

    static {
        j6 = new java.util.HashSet();
        j6.add("content-type");
        j6.add("content-md5");
        j6.add("date");
    }

    public _H(java.util.Properties r4) {
        this.DW = r4.getProperty("accesskey");
        if (this.DW == null) goto L38;
        java.lang.String r0 = r4.getProperty("secretkey");
        if (r0 == null) goto L36;
        this.FH = new javax.crypto.spec.SecretKeySpec(abcd.hE.DW(r0), "HmacSHA1");
        java.lang.String r1 = r4.getProperty("acl", "PRIVATE");
        if (abcd.NK.j6("PRIVATE", r1) == false) goto L10;
        this.v5 = "private";
    L39:
        java.lang.String r2 = r4.getProperty("password");     // Catch: java.security.NoSuchAlgorithmException -> L27 java.security.spec.InvalidKeySpecException -> L30
        if (r2 == null) goto L24;
        java.lang.String r3 = r4.getProperty("crypto.algorithm");     // Catch: java.security.NoSuchAlgorithmException -> L27 java.security.spec.InvalidKeySpecException -> L30
        if (r3 != null) goto L23;
        r3 = "PBEWithMD5AndDES";
    L23:
        this.VH = new abcd.NJ.b(r3, r2);     // Catch: java.security.NoSuchAlgorithmException -> L27 java.security.spec.InvalidKeySpecException -> L30
    L25:
        this.Zo = java.lang.Integer.parseInt(r4.getProperty("httpclient.retry-max", "3"));
        this.Hw = java.net.ProxySelector.getDefault();
        return;
    L24:
        this.VH = abcd.NJ.j6;     // Catch: java.security.NoSuchAlgorithmException -> L27 java.security.spec.InvalidKeySpecException -> L30
    L27:
        e = move-exception;
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().invalidEncryption, e);
    L30:
        e = move-exception;
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().invalidEncryption, e);
    L10:
        if (abcd.NK.j6("PUBLIC", r1) == false) goto L13;
        this.v5 = "public-read";
        goto L39
    L13:
        if (abcd.NK.j6("PUBLIC-READ", r1) == false) goto L16;
        this.v5 = "public-read";
        goto L39
    L16:
        if (abcd.NK.j6("PUBLIC_READ", r1) == false) goto L34;
        this.v5 = "public-read";
        goto L39
    L34:
        throw new java.lang.IllegalArgumentException("Invalid acl: " + r1);
    L36:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().missingSecretkey);
    L38:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().missingAccesskey);
    }

    private static java.security.MessageDigest DW() {
        return java.security.MessageDigest.getInstance("MD5");
    L4:
        e = move-exception;
        throw new java.lang.RuntimeException(org.eclipse.jgit.JGitText.j6().JRELacksMD5Implementation, e);
    }

    private java.io.IOException Hw(java.lang.String r5, java.lang.String r6) {
        return new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().amazonS3ActionFailedGivingUp, new java.lang.Object[]{r5, r6, java.lang.Integer.valueOf(this.Zo)}));
    }

    static int j6(abcd._H r0) {
        return r0.Zo;
    }

    static java.io.IOException j6(abcd._H r0, java.lang.String r1, java.lang.String r2) {
        return r0.Hw(r1, r2);
    }

    static java.io.IOException j6(abcd._H r0, java.lang.String r1, java.lang.String r2, java.net.HttpURLConnection r3) {
        return r0.j6(r1, r2, r3);
    }

    private java.io.IOException j6(java.lang.String r5, java.lang.String r6, java.net.HttpURLConnection r7) {
        java.io.IOException r0 = new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().amazonS3ActionFailed, new java.lang.Object[]{r5, r6, java.lang.Integer.valueOf(abcd.AK.j6(r7)), r7.getResponseMessage()}));
        java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream();
        byte[] r9 = new byte[2048];
    L3:
        int r1 = r7.getErrorStream().read(r9);
        if (r1 < 0) goto L5;
        if (r1 <= 0) goto L3;
        r8.write(r9, 0, r1);
        goto L3
    L5:
        byte[] r10 = r8.toByteArray();
        if (r10.length <= 0) goto L8;
        r0.initCause(new java.io.IOException("\n" + new java.lang.String(r10)));
    L8:
        return r0;
    }

    private static java.lang.String j6() {
        java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss", java.util.Locale.US);
        r0.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
        return java.lang.String.valueOf(r0.format(new java.util.Date())) + " GMT";
    }

    private static java.lang.String j6(java.util.List<java.lang.String> r4) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        java.util.Iterator<java.lang.String> r5 = r4.iterator();
    L4:
        if (r5.hasNext() == false) goto L6;
        java.lang.String r1 = r5.next();
        if (r0.length() <= 0) goto L10;
        r0.append(',');
    L10:
        r0.append(r1.replaceAll("\n", "").trim());
        goto L4
    L6:
        return r0.toString();
    }

    private static java.lang.String j6(java.util.Map<java.lang.String, java.lang.String> r0, java.lang.String r1) {
        java.lang.String r2 = r0.remove(r1);
        if (r2 != null) goto L7;
        return "";
    L7:
        return r2;
    }

    static java.net.HttpURLConnection j6(abcd._H r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.util.Map r4) {
        return r0.j6(r1, r2, r3, r4);
    }

    private java.net.HttpURLConnection j6(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        return j6(r2, r3, r4, java.util.Collections.emptyMap());
    }

    private java.net.HttpURLConnection j6(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append("http://");
        r0.append(r4);
        r0.append('.');
        r0.append("s3.amazonaws.com");
        r0.append('/');
        if (r5.length() <= 0) goto L6;
        abcd.AK.j6(r0, r5);
    L6:
        if (r6.isEmpty() == true) goto L14;
        r0.append('?');
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> r7 = r6.entrySet().iterator();
    L9:
        if (r7.hasNext() == false) goto L14;
        java.util.Map.Entry<java.lang.String, java.lang.String> r8 = r7.next();
        r0.append(r8.getKey());
        r0.append('=');
        abcd.AK.j6(r0, r8.getValue());
        if (r7.hasNext() == false) goto L9;
        r0.append('&');
    L14:
        java.net.URL r9 = new java.net.URL(r0.toString());
        java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r9.openConnection(abcd.AK.j6(this.Hw, r9));
        r10.setRequestMethod(r3);
        r10.setRequestProperty("User-Agent", "jgit/1.0");
        r10.setRequestProperty("Date", j6());
        return r10;
    }

    static java.util.Properties j6(java.io.File r2) {
        java.util.Properties r0 = new java.util.Properties();
        java.io.FileInputStream r1 = new java.io.FileInputStream(r2);
        r0.load(r1);     // Catch: java.lang.Throwable -> L6
        r1.close();
        return r0;
    L6:
        th = move-exception;
        r1.close();
        throw th;
    }

    static void j6(abcd._H r0, java.lang.String r1, java.lang.String r2, byte[] r3, abcd.RK r4, abcd.LE r5, java.lang.String r6) {
        r0.j6(r1, r2, r3, r4, r5, r6);
    }

    static void j6(abcd._H r0, java.net.HttpURLConnection r1) {
        r0.j6(r1);
    }

    private void j6(java.lang.String r10, java.lang.String r11, byte[] r12, abcd.RK r13, abcd.LE r14, java.lang.String r15) {
        if (r14 != null) goto L4;
        r14 = abcd.vE.j6;
    L4:
        int r0 = 0;
        if (r15 != null) goto L7;
        r15 = java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().progressMonUploading, new java.lang.Object[]{r11});
    L7:
        java.lang.String r16 = abcd.kK.j6(r12);
        long r2 = r13.DW();
        java.lang.String r4 = java.lang.String.valueOf(r2);
    L9:
        if (r0 >= this.Zo) goto L24;
        java.net.HttpURLConnection r5 = j6("PUT", r10, r11);
        r5.setRequestProperty("Content-Length", r4);
        r5.setRequestProperty("Content-MD5", r16);
        r5.setRequestProperty("x-amz-acl", this.v5);
        this.VH.j6(r5, "x-amz-meta-");
        j6(r5);
        r5.setDoOutput(true);
        r5.setFixedLengthStreamingMode((int) r2);
        r14.j6(r15, (int) (r2 / 1024));
        java.io.OutputStream r7 = r5.getOutputStream();
        r13.j6(r7, r14);     // Catch: java.lang.Throwable -> L20
        r14.j6();
        r7.close();
        int r8 = abcd.AK.j6(r5);
        if (r8 == 200) goto L19;
        if (r8 != 500) goto L18;
        r0 = r0 + 1;
        goto L9
    L18:
        throw j6("Writing", r11, r5);
    L19:
        return;
    L20:
        th = move-exception;
        r14.j6();
        r7.close();
        throw th;
    L24:
        throw Hw("Writing", r11);
    }

    private void j6(java.net.HttpURLConnection r7) {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r7.getRequestProperties();
        java.util.TreeMap r2 = new java.util.TreeMap();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> r3 = r1.entrySet().iterator();
    L4:
        if (r3.hasNext() == false) goto L5;
        java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> r4 = r3.next();
        java.lang.String r5 = r4.getKey();
        if (j6(r5) == false) goto L4;
        r2.put(abcd.NK.Hw(r5), j6(r4.getValue()));
        goto L4
    L5:
        java.lang.StringBuilder r6 = new java.lang.StringBuilder();
        r6.append(r7.getRequestMethod());
        r6.append('\n');
        r6.append(j6(r2, "content-md5"));
        r6.append('\n');
        r6.append(j6(r2, "content-type"));
        r6.append('\n');
        r6.append(j6(r2, "date"));
        r6.append('\n');
        java.util.Iterator r8 = r2.entrySet().iterator();
    L7:
        if (r8.hasNext() == false) goto L8;
        java.util.Map.Entry r9 = (java.util.Map.Entry) r8.next();
        r6.append((java.lang.String) r9.getKey());
        r6.append(':');
        r6.append((java.lang.String) r9.getValue());
        r6.append('\n');
        goto L7
    L8:
        java.lang.String r10 = r7.getURL().getHost();
        r6.append('/');
        r6.append(r10.substring(0, (r10.length() - 16) - 1));
        r6.append(r7.getURL().getPath());
        javax.crypto.Mac r11 = javax.crypto.Mac.getInstance("HmacSHA1");     // Catch: java.security.InvalidKeyException -> L12 java.security.NoSuchAlgorithmException -> L14
        r11.init(this.FH);     // Catch: java.security.InvalidKeyException -> L12 java.security.NoSuchAlgorithmException -> L14
        r7.setRequestProperty("Authorization", "AWS " + this.DW + ":" + abcd.kK.j6(r11.doFinal(r6.toString().getBytes("UTF-8"))));
        return;
    L12:
        e = move-exception;
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidKey, new java.lang.Object[]{e.getMessage()}));
    L14:
        e = move-exception;
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().noHMACsupport, new java.lang.Object[]{"HmacSHA1", e.getMessage()}));
    }

    private static boolean j6(java.lang.String r1) {
        java.lang.String r2 = abcd.NK.Hw(r1);
        if (j6.contains(r2) == false) goto L5;
        return true;
    L5:
        if (r2.startsWith("x-amz-") == true) goto L10;
        return false;
    L10:
        return true;
    }

    public java.net.URLConnection DW(java.lang.String r6, java.lang.String r7) {
        int r0 = 0;
    L4:
        if (r0 >= this.Zo) goto L19;
        java.net.HttpURLConnection r1 = j6("GET", r6, r7);
        j6(r1);
        int r3 = abcd.AK.j6(r1);
        if (r3 == 200) goto L16;
        if (r3 == 404) goto L15;
        if (r3 != 500) goto L13;
        r0 = r0 + 1;
        goto L4
    L13:
        throw j6("Reading", r7, r1);
    L15:
        throw new java.io.FileNotFoundException(r7);
    L16:
        this.VH.DW(r1, "x-amz-meta-");
        return r1;
    L19:
        throw Hw("Reading", r7);
    }

    public java.util.List<java.lang.String> FH(java.lang.String r3, java.lang.String r4) {
        if (r4.length() > 0) goto L5;
    L7:
        abcd._H.a r0 = new abcd._H.a(this, r3, r4);
    L8:
        r0.j6();
        if (r0.Hw == true) goto L8;
        return r0.j6;
    L5:
        if (r4.endsWith("/") == true) goto L7;
        r4 = java.lang.String.valueOf(r4) + "/";
        goto L7
    }

    public java.io.InputStream j6(java.net.URLConnection r2) {
        return this.VH.j6(r2.getInputStream());
    }

    public java.io.OutputStream j6(java.lang.String r10, java.lang.String r11, abcd.LE r12, java.lang.String r13) {
        java.security.MessageDigest r7 = DW();
        abcd.ZH r8 = new abcd.ZH(this, r10, r11, r7, r12, r13);
        return this.VH.j6(new java.security.DigestOutputStream(r8, r7));
    }

    public void j6(java.lang.String r6, java.lang.String r7) {
        int r0 = 0;
    L4:
        if (r0 >= this.Zo) goto L14;
        java.net.HttpURLConnection r1 = j6("DELETE", r6, r7);
        j6(r1);
        int r3 = abcd.AK.j6(r1);
        if (r3 == 204) goto L12;
        if (r3 != 500) goto L11;
        r0 = r0 + 1;
        goto L4
    L11:
        throw j6("Deletion", r7, r1);
    L12:
        return;
    L14:
        throw Hw("Deletion", r7);
    }

    public void j6(java.lang.String r8, java.lang.String r9, byte[] r10) {
        if (this.VH == abcd.NJ.j6) goto L6;
        java.io.OutputStream r11 = j6(r8, r9, null, null);
        r11.write(r10);
        r11.close();
        return;
    L6:
        java.lang.String r0 = abcd.kK.j6(DW().digest(r10));
        java.lang.String r1 = java.lang.String.valueOf(r10.length);
        int r2 = 0;
    L8:
        if (r2 >= this.Zo) goto L23;
        java.net.HttpURLConnection r3 = j6("PUT", r8, r9);
        r3.setRequestProperty("Content-Length", r1);
        r3.setRequestProperty("Content-MD5", r0);
        r3.setRequestProperty("x-amz-acl", this.v5);
        j6(r3);
        r3.setDoOutput(true);
        r3.setFixedLengthStreamingMode(r10.length);
        java.io.OutputStream r5 = r3.getOutputStream();
        r5.write(r10);     // Catch: java.lang.Throwable -> L19
        r5.close();
        int r6 = abcd.AK.j6(r3);
        if (r6 == 200) goto L18;
        if (r6 != 500) goto L17;
        r2 = r2 + 1;
        goto L8
    L17:
        throw j6("Writing", r9, r3);
    L18:
        return;
    L19:
        th = move-exception;
        r5.close();
        throw th;
    L23:
        throw Hw("Writing", r9);
    }
}
