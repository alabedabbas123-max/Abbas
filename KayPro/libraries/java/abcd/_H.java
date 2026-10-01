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
            java.lang.StringBuilder r0 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = this.v5;
                        if (r0 == null) { $pc0 = 6; continue $sw0; }
                        r0.append(r2, r3, r4);
                        return;
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void endElement(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if ("Key".equals(r2) == false) { $pc1 = 6; continue $sw1; }
                        this.j6.add(this.v5.toString().substring(this.FH.length()));
                        $pc1 = 8; continue $sw1;
                    }
                    case 8: {
                        this.v5 = null;
                        return;
                    }
                    case 6: {
                        if ("IsTruncated".equals(r2) == false) { $pc1 = 8; continue $sw1; }
                        this.Hw = abcd.NK.j6("true", this.v5.toString());
                        { $pc1 = 8; continue $sw1; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void ignorableWhitespace(char[] r2, int r3, int r4) {
            java.lang.StringBuilder r0 = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r0 = this.v5;
                        if (r0 == null) { $pc2 = 6; continue $sw2; }
                        r0.append(r2, r3, r4);
                        return;
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        void j6() {
            java.util.TreeMap r0 = null;
            java.lang.StringBuilder r1 = null;
            java.util.List<java.lang.String> r3 = null;
            int r4 = 0;
            java.net.HttpURLConnection r5 = null;
            int r6 = 0;
            org.xml.sax.XMLReader r2 = null;
            java.io.InputStream r7 = null;
            java.io.IOException r8 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        r0 = new java.util.TreeMap();
                        if (this.FH.length() <= 0) { $pc3 = 6; continue $sw3; }
                        r0.put("prefix", this.FH);
                        $pc3 = 6; continue $sw3;
                    }
                    case 6: {
                        if (this.j6.isEmpty() == true) { $pc3 = 8; continue $sw3; }
                        r1 = new java.lang.StringBuilder(java.lang.String.valueOf(this.FH));
                        r3 = this.j6;
                        r1.append(r3.get(r3.size() - 1));
                        r0.put("marker", r1.toString());
                        $pc3 = 8; continue $sw3;
                    }
                    case 8: {
                        r4 = 0;
                        $pc3 = 10; continue $sw3;
                    }
                    case 10: {
                        if (r4 >= abcd._H.j6(this.Zo)) { $pc3 = 34; continue $sw3; }
                        r5 = abcd._H.j6(this.Zo, "GET", this.DW, "", r0);
                        abcd._H.j6(this.Zo, r5);
                        r6 = abcd.AK.j6(r5);
                        if (r6 == 200) { $pc3 = 18; continue $sw3; }
                        if (r6 != 500) { $pc3 = 17; continue $sw3; }
                        r4 = r4 + 1;
                        { $pc3 = 10; continue $sw3; }
                    }
                    case 17: {
                        throw abcd._H.j6(this.Zo, "Listing", this.FH, r5);
                    }
                    case 18: {
                        this.Hw = false;
                        this.v5 = null;
                        try {
                            r2 = org.xml.sax.helpers.XMLReaderFactory.createXMLReader();
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            if ($t instanceof org.xml.sax.SAXException) { $pc3 = 31; continue $sw3; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        r2.setContentHandler(this);
                        r7 = r5.getInputStream();
                        try {
                            r2.parse(new org.xml.sax.InputSource(r7));
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            if ($t instanceof org.xml.sax.SAXException) { $pc3 = 26; continue $sw3; }
                            $pc3 = 24; continue $sw3;
                        }
                        r7.close();
                        return;
                    }
                    case 24: {
                        th = $ex3;
                        r7.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 26: {
                        e = $ex3;
                        try {
                            r8 = new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().errorListing, new java.lang.Object[]{this.FH}));
                            r8.initCause(e);
                            throw r8;
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 24; continue $sw3;
                        }
                    }
                    case 32: {
                        throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().noXMLParserAvailable);
                    }
                    case 34: {
                        throw abcd._H.j6(this.Zo, "Listing", this.FH);
                    }
                    case 31: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void startElement(java.lang.String r1, java.lang.String r2, java.lang.String r3, org.xml.sax.Attributes r4) {
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        if ("Key".equals(r2) == false) { $pc4 = 5; continue $sw4; }
                        $pc4 = 6; continue $sw4;
                    }
                    case 6: {
                        this.v5 = new java.lang.StringBuilder();
                        return;
                    }
                    case 5: {
                        if ("IsTruncated".equals(r2) == true) { $pc4 = 6; continue $sw4; }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        j6 = new java.util.HashSet();
        j6.add("content-type");
        j6.add("content-md5");
        j6.add("date");
    }

    public _H(java.util.Properties r4) {
        java.lang.String r0 = null;
        java.lang.String r1 = null;
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    this.DW = r4.getProperty("accesskey");
                    if (this.DW == null) { $pc5 = 38; continue $sw5; }
                    r0 = r4.getProperty("secretkey");
                    if (r0 == null) { $pc5 = 36; continue $sw5; }
                    this.FH = new javax.crypto.spec.SecretKeySpec(abcd.hE.DW(r0), "HmacSHA1");
                    r1 = r4.getProperty("acl", "PRIVATE");
                    if (abcd.NK.j6("PRIVATE", r1) == false) { $pc5 = 10; continue $sw5; }
                    this.v5 = "private";
                    $pc5 = 39; continue $sw5;
                }
                case 39: {
                    try {
                        r2 = r4.getProperty("password");
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.security.NoSuchAlgorithmException) { $pc5 = 27; continue $sw5; }
                        if ($t instanceof java.security.spec.InvalidKeySpecException) { $pc5 = 30; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r2 == null) { $pc5 = 24; continue $sw5; }
                    try {
                        r3 = r4.getProperty("crypto.algorithm");
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.security.NoSuchAlgorithmException) { $pc5 = 27; continue $sw5; }
                        if ($t instanceof java.security.spec.InvalidKeySpecException) { $pc5 = 30; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r3 != null) { $pc5 = 23; continue $sw5; }
                    r3 = "PBEWithMD5AndDES";
                    $pc5 = 23; continue $sw5;
                }
                case 23: {
                    try {
                        this.VH = new abcd.NJ.b(r3, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.security.NoSuchAlgorithmException) { $pc5 = 27; continue $sw5; }
                        if ($t instanceof java.security.spec.InvalidKeySpecException) { $pc5 = 30; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 25; continue $sw5;
                }
                case 25: {
                    this.Zo = java.lang.Integer.parseInt(r4.getProperty("httpclient.retry-max", "3"));
                    this.Hw = java.net.ProxySelector.getDefault();
                    return;
                }
                case 24: {
                    try {
                        this.VH = abcd.NJ.j6;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.security.NoSuchAlgorithmException) { $pc5 = 27; continue $sw5; }
                        if ($t instanceof java.security.spec.InvalidKeySpecException) { $pc5 = 30; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 10; continue $sw5;
                }
                case 27: {
                    e = $ex5;
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().invalidEncryption, e);
                }
                case 30: {
                    e = $ex5;
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().invalidEncryption, e);
                }
                case 10: {
                    if (abcd.NK.j6("PUBLIC", r1) == false) { $pc5 = 13; continue $sw5; }
                    this.v5 = "public-read";
                    { $pc5 = 39; continue $sw5; }
                }
                case 13: {
                    if (abcd.NK.j6("PUBLIC-READ", r1) == false) { $pc5 = 16; continue $sw5; }
                    this.v5 = "public-read";
                    { $pc5 = 39; continue $sw5; }
                }
                case 16: {
                    if (abcd.NK.j6("PUBLIC_READ", r1) == false) { $pc5 = 34; continue $sw5; }
                    this.v5 = "public-read";
                    { $pc5 = 39; continue $sw5; }
                }
                case 34: {
                    throw new java.lang.IllegalArgumentException("Invalid acl: " + r1);
                }
                case 36: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().missingSecretkey);
                }
                case 38: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().missingAccesskey);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.security.MessageDigest DW() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    return java.security.MessageDigest.getInstance("MD5");
                }
                case 4: {
                    e = $ex6;
                    throw new java.lang.RuntimeException(org.eclipse.jgit.JGitText.j6().JRELacksMD5Implementation, e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.io.IOException r0 = null;
        java.io.ByteArrayOutputStream r8 = null;
        byte[] r9 = null;
        int r1 = 0;
        byte[] r10 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().amazonS3ActionFailed, new java.lang.Object[]{r5, r6, java.lang.Integer.valueOf(abcd.AK.j6(r7)), r7.getResponseMessage()}));
                    r8 = new java.io.ByteArrayOutputStream();
                    r9 = new byte[2048];
                    $pc7 = 3; continue $sw7;
                }
                case 3: {
                    r1 = r7.getErrorStream().read(r9);
                    if (r1 < 0) { $pc7 = 5; continue $sw7; }
                    if (r1 <= 0) { $pc7 = 3; continue $sw7; }
                    r8.write(r9, 0, r1);
                    { $pc7 = 3; continue $sw7; }
                }
                case 5: {
                    r10 = r8.toByteArray();
                    if (r10.length <= 0) { $pc7 = 8; continue $sw7; }
                    r0.initCause(new java.io.IOException("\n" + new java.lang.String(r10)));
                    $pc7 = 8; continue $sw7;
                }
                case 8: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String j6() {
        java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss", java.util.Locale.US);
        r0.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
        return java.lang.String.valueOf(r0.format(new java.util.Date())) + " GMT";
    }

    private static java.lang.String j6(java.util.List<java.lang.String> r4) {
        java.lang.StringBuilder r0 = null;
        java.util.Iterator<java.lang.String> r5 = null;
        java.lang.String r1 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r5 = r4.iterator();
                    $pc8 = 4; continue $sw8;
                }
                case 4: {
                    if (r5.hasNext() == false) { $pc8 = 6; continue $sw8; }
                    r1 = r5.next();
                    if (r0.length() <= 0) { $pc8 = 10; continue $sw8; }
                    r0.append(',');
                    $pc8 = 10; continue $sw8;
                }
                case 10: {
                    r0.append(r1.replaceAll("\n", "").trim());
                    { $pc8 = 4; continue $sw8; }
                }
                case 6: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String j6(java.util.Map<java.lang.String, java.lang.String> r0, java.lang.String r1) {
        java.lang.String r2 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r2 = r0.remove(r1);
                    if (r2 != null) { $pc9 = 7; continue $sw9; }
                    return "";
                }
                case 7: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.net.HttpURLConnection j6(abcd._H r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.util.Map r4) {
        return r0.j6(r1, r2, r3, r4);
    }

    private java.net.HttpURLConnection j6(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        return j6(r2, r3, r4, java.util.Collections.emptyMap());
    }

    private java.net.HttpURLConnection j6(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6) {
        java.lang.StringBuilder r0 = null;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> r7 = null;
        java.util.Map.Entry<java.lang.String, java.lang.String> r8 = null;
        java.net.URL r9 = null;
        java.net.HttpURLConnection r10 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append("http://");
                    r0.append(r4);
                    r0.append('.');
                    r0.append("s3.amazonaws.com");
                    r0.append('/');
                    if (r5.length() <= 0) { $pc10 = 6; continue $sw10; }
                    abcd.AK.j6(r0, r5);
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    if (r6.isEmpty() == true) { $pc10 = 14; continue $sw10; }
                    r0.append('?');
                    r7 = r6.entrySet().iterator();
                    $pc10 = 9; continue $sw10;
                }
                case 9: {
                    if (r7.hasNext() == false) { $pc10 = 14; continue $sw10; }
                    r8 = r7.next();
                    r0.append(r8.getKey());
                    r0.append('=');
                    abcd.AK.j6(r0, r8.getValue());
                    if (r7.hasNext() == false) { $pc10 = 9; continue $sw10; }
                    r0.append('&');
                    $pc10 = 14; continue $sw10;
                }
                case 14: {
                    r9 = new java.net.URL(r0.toString());
                    r10 = (java.net.HttpURLConnection) r9.openConnection(abcd.AK.j6(this.Hw, r9));
                    r10.setRequestMethod(r3);
                    r10.setRequestProperty("User-Agent", "jgit/1.0");
                    r10.setRequestProperty("Date", j6());
                    return r10;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.util.Properties j6(java.io.File r2) {
        java.util.Properties r0 = null;
        java.io.FileInputStream r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = new java.util.Properties();
                    r1 = new java.io.FileInputStream(r2);
                    try {
                        r0.load(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 6; continue $sw11;
                    }
                    r1.close();
                    return r0;
                }
                case 6: {
                    th = $ex11;
                    r1.close();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(abcd._H r0, java.lang.String r1, java.lang.String r2, byte[] r3, abcd.RK r4, abcd.LE r5, java.lang.String r6) {
        r0.j6(r1, r2, r3, r4, r5, r6);
    }

    static void j6(abcd._H r0, java.net.HttpURLConnection r1) {
        r0.j6(r1);
    }

    private void j6(java.lang.String r10, java.lang.String r11, byte[] r12, abcd.RK r13, abcd.LE r14, java.lang.String r15) {
        int r0 = 0;
        java.lang.String r16 = null;
        long r2 = 0L;
        java.lang.String r4 = null;
        java.net.HttpURLConnection r5 = null;
        java.io.OutputStream r7 = null;
        int r8 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (r14 != null) { $pc12 = 4; continue $sw12; }
                    r14 = abcd.vE.j6;
                    $pc12 = 4; continue $sw12;
                }
                case 4: {
                    r0 = 0;
                    if (r15 != null) { $pc12 = 7; continue $sw12; }
                    r15 = java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().progressMonUploading, new java.lang.Object[]{r11});
                    $pc12 = 7; continue $sw12;
                }
                case 7: {
                    r16 = abcd.kK.j6(r12);
                    r2 = r13.DW();
                    r4 = java.lang.String.valueOf(r2);
                    $pc12 = 9; continue $sw12;
                }
                case 9: {
                    if (r0 >= this.Zo) { $pc12 = 24; continue $sw12; }
                    r5 = j6("PUT", r10, r11);
                    r5.setRequestProperty("Content-Length", r4);
                    r5.setRequestProperty("Content-MD5", r16);
                    r5.setRequestProperty("x-amz-acl", this.v5);
                    this.VH.j6(r5, "x-amz-meta-");
                    j6(r5);
                    r5.setDoOutput(true);
                    r5.setFixedLengthStreamingMode((int) r2);
                    r14.j6(r15, (int) (r2 / 1024));
                    r7 = r5.getOutputStream();
                    try {
                        r13.j6(r7, r14);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 20; continue $sw12;
                    }
                    r14.j6();
                    r7.close();
                    r8 = abcd.AK.j6(r5);
                    if (r8 == 200) { $pc12 = 19; continue $sw12; }
                    if (r8 != 500) { $pc12 = 18; continue $sw12; }
                    r0 = r0 + 1;
                    { $pc12 = 9; continue $sw12; }
                }
                case 18: {
                    throw j6("Writing", r11, r5);
                }
                case 19: {
                    return;
                }
                case 20: {
                    th = $ex12;
                    r14.j6();
                    r7.close();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 24: {
                    throw Hw("Writing", r11);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.net.HttpURLConnection r7) {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = null;
        java.util.TreeMap r2 = null;
        java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> r4 = null;
        java.lang.String r5 = null;
        java.lang.StringBuilder r6 = null;
        java.util.Iterator r8 = null;
        java.util.Map.Entry r9 = null;
        java.lang.String r10 = null;
        javax.crypto.Mac r11 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r1 = r7.getRequestProperties();
                    r2 = new java.util.TreeMap();
                    java.util.Iterator<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> r3 = r1.entrySet().iterator();
                    $pc13 = 4; continue $sw13;
                }
                case 4: {
                    if (r3.hasNext() == false) { $pc13 = 5; continue $sw13; }
                    r4 = r3.next();
                    r5 = r4.getKey();
                    if (j6(r5) == false) { $pc13 = 4; continue $sw13; }
                    r2.put(abcd.NK.Hw(r5), j6(r4.getValue()));
                    { $pc13 = 4; continue $sw13; }
                }
                case 5: {
                    r6 = new java.lang.StringBuilder();
                    r6.append(r7.getRequestMethod());
                    r6.append('\n');
                    r6.append(j6(r2, "content-md5"));
                    r6.append('\n');
                    r6.append(j6(r2, "content-type"));
                    r6.append('\n');
                    r6.append(j6(r2, "date"));
                    r6.append('\n');
                    r8 = r2.entrySet().iterator();
                    $pc13 = 7; continue $sw13;
                }
                case 7: {
                    if (r8.hasNext() == false) { $pc13 = 8; continue $sw13; }
                    r9 = (java.util.Map.Entry) r8.next();
                    r6.append((java.lang.String) r9.getKey());
                    r6.append(':');
                    r6.append((java.lang.String) r9.getValue());
                    r6.append('\n');
                    { $pc13 = 7; continue $sw13; }
                }
                case 8: {
                    r10 = r7.getURL().getHost();
                    r6.append('/');
                    r6.append(r10.substring(0, (r10.length() - 16) - 1));
                    r6.append(r7.getURL().getPath());
                    try {
                        r11 = javax.crypto.Mac.getInstance("HmacSHA1");
                        r11.init(this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        if ($t instanceof java.security.InvalidKeyException) { $pc13 = 12; continue $sw13; }
                        if ($t instanceof java.security.NoSuchAlgorithmException) { $pc13 = 14; continue $sw13; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r7.setRequestProperty("Authorization", "AWS " + this.DW + ":" + abcd.kK.j6(r11.doFinal(r6.toString().getBytes("UTF-8"))));
                    return;
                }
                case 12: {
                    e = $ex13;
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidKey, new java.lang.Object[]{e.getMessage()}));
                }
                case 14: {
                    e = $ex13;
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().noHMACsupport, new java.lang.Object[]{"HmacSHA1", e.getMessage()}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(java.lang.String r1) {
        java.lang.String r2 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r2 = abcd.NK.Hw(r1);
                    if (j6.contains(r2) == false) { $pc14 = 5; continue $sw14; }
                    return true;
                }
                case 5: {
                    if (r2.startsWith("x-amz-") == true) { $pc14 = 10; continue $sw14; }
                    return false;
                }
                case 10: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.net.URLConnection DW(java.lang.String r6, java.lang.String r7) {
        int r0 = 0;
        java.net.HttpURLConnection r1 = null;
        int r3 = 0;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r0 = 0;
                    $pc15 = 4; continue $sw15;
                }
                case 4: {
                    if (r0 >= this.Zo) { $pc15 = 19; continue $sw15; }
                    r1 = j6("GET", r6, r7);
                    j6(r1);
                    r3 = abcd.AK.j6(r1);
                    if (r3 == 200) { $pc15 = 16; continue $sw15; }
                    if (r3 == 404) { $pc15 = 15; continue $sw15; }
                    if (r3 != 500) { $pc15 = 13; continue $sw15; }
                    r0 = r0 + 1;
                    { $pc15 = 4; continue $sw15; }
                }
                case 13: {
                    throw j6("Reading", r7, r1);
                }
                case 15: {
                    throw new java.io.FileNotFoundException(r7);
                }
                case 16: {
                    this.VH.DW(r1, "x-amz-meta-");
                    return r1;
                }
                case 19: {
                    throw Hw("Reading", r7);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<java.lang.String> FH(java.lang.String r3, java.lang.String r4) {
        abcd._H.a r0 = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    if (r4.length() > 0) { $pc16 = 5; continue $sw16; }
                    $pc16 = 7; continue $sw16;
                }
                case 7: {
                    r0 = new abcd._H.a(this, r3, r4);
                    $pc16 = 8; continue $sw16;
                }
                case 8: {
                    r0.j6();
                    if (r0.Hw == true) { $pc16 = 8; continue $sw16; }
                    return r0.j6;
                }
                case 5: {
                    if (r4.endsWith("/") == true) { $pc16 = 7; continue $sw16; }
                    r4 = java.lang.String.valueOf(r4) + "/";
                    { $pc16 = 7; continue $sw16; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.net.HttpURLConnection r1 = null;
        int r3 = 0;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    r0 = 0;
                    $pc17 = 4; continue $sw17;
                }
                case 4: {
                    if (r0 >= this.Zo) { $pc17 = 14; continue $sw17; }
                    r1 = j6("DELETE", r6, r7);
                    j6(r1);
                    r3 = abcd.AK.j6(r1);
                    if (r3 == 204) { $pc17 = 12; continue $sw17; }
                    if (r3 != 500) { $pc17 = 11; continue $sw17; }
                    r0 = r0 + 1;
                    { $pc17 = 4; continue $sw17; }
                }
                case 11: {
                    throw j6("Deletion", r7, r1);
                }
                case 12: {
                    return;
                }
                case 14: {
                    throw Hw("Deletion", r7);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r8, java.lang.String r9, byte[] r10) {
        java.io.OutputStream r11 = null;
        java.lang.String r0 = null;
        java.lang.String r1 = null;
        int r2 = 0;
        java.net.HttpURLConnection r3 = null;
        java.io.OutputStream r5 = null;
        int r6 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    if (this.VH == abcd.NJ.j6) { $pc18 = 6; continue $sw18; }
                    r11 = j6(r8, r9, null, null);
                    r11.write(r10);
                    r11.close();
                    return;
                }
                case 6: {
                    r0 = abcd.kK.j6(DW().digest(r10));
                    r1 = java.lang.String.valueOf(r10.length);
                    r2 = 0;
                    $pc18 = 8; continue $sw18;
                }
                case 8: {
                    if (r2 >= this.Zo) { $pc18 = 23; continue $sw18; }
                    r3 = j6("PUT", r8, r9);
                    r3.setRequestProperty("Content-Length", r1);
                    r3.setRequestProperty("Content-MD5", r0);
                    r3.setRequestProperty("x-amz-acl", this.v5);
                    j6(r3);
                    r3.setDoOutput(true);
                    r3.setFixedLengthStreamingMode(r10.length);
                    r5 = r3.getOutputStream();
                    try {
                        r5.write(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 19; continue $sw18;
                    }
                    r5.close();
                    r6 = abcd.AK.j6(r3);
                    if (r6 == 200) { $pc18 = 18; continue $sw18; }
                    if (r6 != 500) { $pc18 = 17; continue $sw18; }
                    r2 = r2 + 1;
                    { $pc18 = 8; continue $sw18; }
                }
                case 17: {
                    throw j6("Writing", r9, r3);
                }
                case 18: {
                    return;
                }
                case 19: {
                    th = $ex18;
                    r5.close();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 23: {
                    throw Hw("Writing", r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
