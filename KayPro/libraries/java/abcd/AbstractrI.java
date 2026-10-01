package abcd;

abstract class AbstractrI {
    static final abcd.AbstractrI j6 = null;

    private static class a extends abcd.AbstractrI {
        private java.lang.String DW;
        private java.lang.String FH;

        private a() {
        }

        a(abcd.AbstractrI.a r1) {
            this();
        }

        @Override
        void j6(java.lang.String r1, java.lang.String r2) {
            this.DW = r1;
            this.FH = r2;
        }

        @Override
        void j6(java.net.HttpURLConnection r4) {
            java.lang.String r0 = abcd.kK.j6((java.lang.String.valueOf(this.DW) + ":" + this.FH).getBytes("UTF-8"));
            java.lang.StringBuilder r1 = new java.lang.StringBuilder("Basic ");
            r1.append(r0);
            r4.setRequestProperty("Authorization", r1.toString());
        }
    }

    private static class b extends abcd.AbstractrI {
        private static final java.util.Random DW = null;
        private static final char[] FH = null;
        private final java.util.Map<java.lang.String, java.lang.String> Hw;
        private java.lang.String VH;
        private java.lang.String Zo;
        private int v5;

        static {
            DW = new java.util.Random();
            FH = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        }

        b(java.lang.String r3) {
            byte[] r4 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        this.Hw = DW(r3);
                        if ("auth".equals(this.Hw.get("qop")) == false) { $pc0 = 6; continue $sw0; }
                        r4 = new byte[8];
                        DW.nextBytes(r4);
                        this.Hw.put("cnonce", abcd.kK.j6(r4));
                        return;
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private static java.lang.String DW(java.lang.String r2, java.lang.String r3) {
            java.security.MessageDigest r1 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        try {
                            r1 = j6();
                            r1.update(r2.getBytes("UTF-8"));
                            r1.update((byte) 58);
                            r1.update(r3.getBytes("UTF-8"));
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.UnsupportedEncodingException) { $pc1 = 5; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        return j6(r1.digest());
                    }
                    case 5: {
                        e = $ex1;
                        throw new java.lang.RuntimeException("UTF-8 encoding not available", e);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private static java.util.Map<java.lang.String, java.lang.String> DW(java.lang.String r8) {
            java.util.HashMap r0 = null;
            int r1 = 0;
            int r2 = 0;
            int r4 = 0;
            java.lang.String r3 = null;
            int r5 = 0;
            int r6 = 0;
            java.lang.String r7 = null;
            int r9 = 0;
            int r10 = 0;
            int r11 = 0;
            int r12 = 0;
            java.lang.String r13 = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r0 = new java.util.HashMap();
                        r1 = 0;
                        $pc2 = 4; continue $sw2;
                    }
                    case 4: {
                        if (r1 >= r8.length()) { $pc2 = 5; continue $sw2; }
                        if (r1 >= r8.length()) { $pc2 = 12; continue $sw2; }
                        if (r8.charAt(r1) != ',') { $pc2 = 12; continue $sw2; }
                        r1 = r1 + 1;
                        $pc2 = 12; continue $sw2;
                    }
                    case 12: {
                        if (r1 >= r8.length()) { $pc2 = 15; continue $sw2; }
                        if (java.lang.Character.isWhitespace(r8.charAt(r1)) == false) { $pc2 = 15; continue $sw2; }
                        r1 = r1 + 1;
                        $pc2 = 15; continue $sw2;
                    }
                    case 15: {
                        r2 = r8.indexOf(61, r1);
                        if (r2 < 0) { $pc2 = 35; continue $sw2; }
                        r4 = r2 + 1;
                        if (r4 == r8.length()) { $pc2 = 35; continue $sw2; }
                        r3 = r8.substring(r1, r2);
                        if (r8.charAt(r4) != '\"') { $pc2 = 27; continue $sw2; }
                        r5 = r2 + 2;
                        r6 = r8.indexOf(34, r5);
                        if (r6 < 0) { $pc2 = 25; continue $sw2; }
                        r7 = r8.substring(r5, r6);
                        r9 = r6 + 1;
                        $pc2 = 33; continue $sw2;
                    }
                    case 33: {
                        r0.put(r3, r7);
                        r1 = r9;
                        { $pc2 = 4; continue $sw2; }
                    }
                    case 25: {
                        return java.util.Collections.emptyMap();
                    }
                    case 27: {
                        r10 = r8.indexOf(32, r4);
                        r11 = r8.indexOf(44, r4);
                        if (r10 >= 0) { $pc2 = 30; continue $sw2; }
                        r10 = r8.length();
                        $pc2 = 30; continue $sw2;
                    }
                    case 30: {
                        if (r11 >= 0) { $pc2 = 32; continue $sw2; }
                        r11 = r8.length();
                        $pc2 = 32; continue $sw2;
                    }
                    case 32: {
                        r12 = java.lang.Math.min(r10, r11);
                        r13 = r8.substring(r4, r12);
                        r9 = r12 + 1;
                        r7 = r13;
                        $pc2 = 35; continue $sw2;
                    }
                    case 35: {
                        return java.util.Collections.emptyMap();
                    }
                    case 5: {
                        return r0;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private static java.lang.String j6(java.lang.String r2) {
            java.security.MessageDigest r0 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        try {
                            r0 = j6();
                            r0.update(r2.getBytes("UTF-8"));
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            if ($t instanceof java.io.UnsupportedEncodingException) { $pc3 = 4; continue $sw3; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        return j6(r0.digest());
                    }
                    case 4: {
                        e = $ex3;
                        throw new java.lang.RuntimeException("UTF-8 encoding not available", e);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private static java.lang.String j6(java.net.URL r3) {
            java.lang.StringBuilder r0 = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        r0 = new java.lang.StringBuilder();
                        r0.append(r3.getProtocol());
                        r0.append("://");
                        r0.append(r3.getHost());
                        if (r3.getPort() > 0) { $pc4 = 5; continue $sw4; }
                        $pc4 = 15; continue $sw4;
                    }
                    case 15: {
                        r0.append(r3.getPath());
                        if (r3.getQuery() == null) { $pc4 = 19; continue $sw4; }
                        r0.append('?');
                        r0.append(r3.getQuery());
                        $pc4 = 19; continue $sw4;
                    }
                    case 19: {
                        return r0.toString();
                    }
                    case 5: {
                        if (r3.getPort() != 80) { $pc4 = 10; continue $sw4; }
                        if ("http".equals(r3.getProtocol()) == true) { $pc4 = 15; continue $sw4; }
                        $pc4 = 10; continue $sw4;
                    }
                    case 10: {
                        if (r3.getPort() == 443) { $pc4 = 12; continue $sw4; }
                        $pc4 = 14; continue $sw4;
                    }
                    case 14: {
                        r0.append(':');
                        r0.append(r3.getPort());
                        { $pc4 = 15; continue $sw4; }
                    }
                    case 12: {
                        if ("https".equals(r3.getProtocol()) == false) { $pc4 = 14; continue $sw4; }
                        { $pc4 = 14; continue $sw4; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private static java.lang.String j6(byte[] r5) {
            java.lang.StringBuilder r0 = null;
            int r1 = 0;
            byte r2 = 0;
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        r0 = new java.lang.StringBuilder(r5.length * 2);
                        r1 = 0;
                        $pc5 = 4; continue $sw5;
                    }
                    case 4: {
                        if (r1 >= r5.length) { $pc5 = 6; continue $sw5; }
                        r2 = r5[r1];
                        r0.append(FH[(r2 >>> 4) & 15]);
                        r0.append(FH[r2 & 15]);
                        r1 = r1 + 1;
                        { $pc5 = 4; continue $sw5; }
                    }
                    case 6: {
                        return r0.toString();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private static java.security.MessageDigest j6() {
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
                        throw new java.lang.RuntimeException("No MD5 available", e);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        void j6(java.lang.String r1, java.lang.String r2) {
            this.Zo = r1;
            this.VH = r2;
        }

        @Override
        void j6(java.net.HttpURLConnection r17) {
            java.util.LinkedHashMap r1 = null;
            java.lang.String r2 = null;
            java.lang.String r4 = null;
            java.lang.String r6 = null;
            java.lang.String r8 = null;
            java.lang.String r9 = null;
            java.lang.String r11 = null;
            java.lang.String r12 = null;
            java.lang.String r13 = null;
            int r10 = 0;
            java.lang.String r3 = null;
            java.lang.String r5 = null;
            java.lang.StringBuilder r7 = null;
            java.util.Iterator r14 = null;
            java.util.Map.Entry r15 = null;
            java.lang.Throwable $ex7 = null;
            int $pc7 = -1;
            $sw7: while (true) {
                switch ($pc7) {
                    case -1: {
                        r1 = new java.util.LinkedHashMap();
                        r2 = this.Hw.get("realm");
                        r4 = this.Hw.get("nonce");
                        r6 = this.Hw.get("cnonce");
                        r8 = j6(r17.getURL());
                        r9 = this.Hw.get("qop");
                        r11 = r17.getRequestMethod();
                        r12 = java.lang.String.valueOf(this.Zo) + ":" + r2 + ":" + this.VH;
                        r13 = java.lang.String.valueOf(r11) + ":" + r8;
                        r1.put("username", this.Zo);
                        r1.put("realm", r2);
                        r1.put("nonce", r4);
                        r1.put("uri", r8);
                        if ("auth".equals(r9) == false) { $pc7 = 5; continue $sw7; }
                        r10 = this.v5 + 1;
                        this.v5 = r10;
                        r3 = java.lang.String.format("%08x", new java.lang.Object[]{java.lang.Integer.valueOf(r10)});
                        r5 = DW(j6(r12), java.lang.String.valueOf(r4) + ":" + r3 + ":" + r6 + ":" + r9 + ":" + j6(r13));
                        $pc7 = 6; continue $sw7;
                    }
                    case 6: {
                        r1.put("response", r5);
                        if (this.Hw.containsKey("algorithm") == false) { $pc7 = 9; continue $sw7; }
                        r1.put("algorithm", "MD5");
                        $pc7 = 9; continue $sw7;
                    }
                    case 9: {
                        if (r6 == null) { $pc7 = 13; continue $sw7; }
                        if (r9 == null) { $pc7 = 13; continue $sw7; }
                        r1.put("cnonce", r6);
                        $pc7 = 13; continue $sw7;
                    }
                    case 13: {
                        if (this.Hw.containsKey("opaque") == false) { $pc7 = 15; continue $sw7; }
                        r1.put("opaque", this.Hw.get("opaque"));
                        $pc7 = 15; continue $sw7;
                    }
                    case 15: {
                        if (r9 == null) { $pc7 = 17; continue $sw7; }
                        r1.put("qop", r9);
                        $pc7 = 17; continue $sw7;
                    }
                    case 17: {
                        if (r3 == null) { $pc7 = 19; continue $sw7; }
                        r1.put("nc", r3);
                        $pc7 = 19; continue $sw7;
                    }
                    case 19: {
                        r7 = new java.lang.StringBuilder();
                        r14 = r1.entrySet().iterator();
                        $pc7 = 21; continue $sw7;
                    }
                    case 21: {
                        if (r14.hasNext() == false) { $pc7 = 22; continue $sw7; }
                        r15 = (java.util.Map.Entry) r14.next();
                        if (r7.length() <= 0) { $pc7 = 27; continue $sw7; }
                        r7.append(", ");
                        $pc7 = 27; continue $sw7;
                    }
                    case 27: {
                        r7.append((java.lang.String) r15.getKey());
                        r7.append('=');
                        r7.append('\"');
                        r7.append((java.lang.String) r15.getValue());
                        r7.append('\"');
                        { $pc7 = 21; continue $sw7; }
                    }
                    case 22: {
                        r17.setRequestProperty("Authorization", "Digest " + r7);
                        return;
                    }
                    case 5: {
                        r3 = null;
                        r5 = DW(j6(r12), java.lang.String.valueOf(r4) + ":" + j6(r13));
                        { $pc7 = 6; continue $sw7; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    private static class c extends abcd.AbstractrI {
        private c() {
        }

        c(abcd.AbstractrI.c r1) {
            this();
        }

        @Override
        void j6(java.lang.String r1, java.lang.String r2) {
        }

        @Override
        void j6(java.net.HttpURLConnection r1) {
        }
    }

    static {
        j6 = new abcd.AbstractrI.c(null);
    }

    AbstractrI() {
    }

    static abcd.AbstractrI DW(java.net.HttpURLConnection r3) {
        java.lang.String r4 = null;
        int r0 = 0;
        java.lang.String r1 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r4 = r3.getHeaderField("WWW-Authenticate");
                    if (r4 == null) { $pc8 = 22; continue $sw8; }
                    if (r4.length() == 0) { $pc8 = 22; continue $sw8; }
                    r0 = r4.indexOf(32);
                    if (r0 < 0) { $pc8 = 10; continue $sw8; }
                    r1 = r4.substring(0, r0);
                    if ("Basic".equalsIgnoreCase(r1) == false) { $pc8 = 16; continue $sw8; }
                    return new abcd.AbstractrI.a(null);
                }
                case 16: {
                    if ("Digest".equalsIgnoreCase(r1) == false) { $pc8 = 20; continue $sw8; }
                    return new abcd.AbstractrI.b(r4.substring(r0 + 1));
                }
                case 20: {
                    return j6;
                }
                case 10: {
                    return j6;
                }
                case 22: {
                    return j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abstract void j6(java.lang.String r1, java.lang.String r2);

    abstract void j6(java.net.HttpURLConnection r1);

    boolean j6(abcd.HJ r8, abcd.AbstractkI r9) {
        abcd.AbstractjI.e r2 = null;
        abcd.AbstractjI.c r3 = null;
        java.lang.String r10 = null;
        java.lang.String r11 = null;
        java.lang.String r12 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (r9 == null) { $pc9 = 10; continue $sw9; }
                    r2 = new abcd.AbstractjI.e();
                    r3 = new abcd.AbstractjI.c();
                    if (r9.j6(new abcd.AbstractjI[]{r2, r3}) == true) { $pc9 = 7; continue $sw9; }
                    $pc9 = 9; continue $sw9;
                }
                case 9: {
                    return false;
                }
                case 7: {
                    if (r9.j6(r8, new abcd.AbstractjI[]{r2, r3}) == false) { $pc9 = 9; continue $sw9; }
                    r10 = r2.DW();
                    r11 = new java.lang.String(r3.FH());
                    r3.DW();
                    $pc9 = 11; continue $sw9;
                }
                case 11: {
                    if (r10 == null) { $pc9 = 14; continue $sw9; }
                    j6(r10, r11);
                    return true;
                }
                case 14: {
                    return false;
                }
                case 10: {
                    r12 = r8.gn();
                    r11 = r8.FH();
                    r10 = r12;
                    { $pc9 = 11; continue $sw9; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
