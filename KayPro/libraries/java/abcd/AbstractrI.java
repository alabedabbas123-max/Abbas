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
            this.Hw = DW(r3);
            if ("auth".equals(this.Hw.get("qop")) == false) goto L6;
            byte[] r4 = new byte[8];
            DW.nextBytes(r4);
            this.Hw.put("cnonce", abcd.kK.j6(r4));
            return;
        }

        private static java.lang.String DW(java.lang.String r2, java.lang.String r3) {
            java.security.MessageDigest r1 = j6();     // Catch: java.io.UnsupportedEncodingException -> L5
            r1.update(r2.getBytes("UTF-8"));     // Catch: java.io.UnsupportedEncodingException -> L5
            r1.update((byte) 58);     // Catch: java.io.UnsupportedEncodingException -> L5
            r1.update(r3.getBytes("UTF-8"));     // Catch: java.io.UnsupportedEncodingException -> L5
            return j6(r1.digest());
        L5:
            e = move-exception;
            throw new java.lang.RuntimeException("UTF-8 encoding not available", e);
        }

        private static java.util.Map<java.lang.String, java.lang.String> DW(java.lang.String r8) {
            java.util.HashMap r0 = new java.util.HashMap();
            int r1 = 0;
        L4:
            if (r1 >= r8.length()) goto L5;
            if (r1 >= r8.length()) goto L12;
            if (r8.charAt(r1) != ',') goto L12;
            r1 = r1 + 1;
        L12:
            if (r1 >= r8.length()) goto L15;
            if (java.lang.Character.isWhitespace(r8.charAt(r1)) == false) goto L15;
            r1 = r1 + 1;
        L15:
            int r2 = r8.indexOf(61, r1);
            if (r2 < 0) goto L35;
            int r4 = r2 + 1;
            if (r4 == r8.length()) goto L35;
            java.lang.String r3 = r8.substring(r1, r2);
            if (r8.charAt(r4) != '\"') goto L27;
            int r5 = r2 + 2;
            int r6 = r8.indexOf(34, r5);
            if (r6 < 0) goto L25;
            java.lang.String r7 = r8.substring(r5, r6);
            int r9 = r6 + 1;
        L33:
            r0.put(r3, r7);
            r1 = r9;
            goto L4
        L25:
            return java.util.Collections.emptyMap();
        L27:
            int r10 = r8.indexOf(32, r4);
            int r11 = r8.indexOf(44, r4);
            if (r10 >= 0) goto L30;
            r10 = r8.length();
        L30:
            if (r11 >= 0) goto L32;
            r11 = r8.length();
        L32:
            int r12 = java.lang.Math.min(r10, r11);
            java.lang.String r13 = r8.substring(r4, r12);
            r9 = r12 + 1;
            r7 = r13;
        L35:
            return java.util.Collections.emptyMap();
        L5:
            return r0;
        }

        private static java.lang.String j6(java.lang.String r2) {
            java.security.MessageDigest r0 = j6();     // Catch: java.io.UnsupportedEncodingException -> L4
            r0.update(r2.getBytes("UTF-8"));     // Catch: java.io.UnsupportedEncodingException -> L4
            return j6(r0.digest());
        L4:
            e = move-exception;
            throw new java.lang.RuntimeException("UTF-8 encoding not available", e);
        }

        private static java.lang.String j6(java.net.URL r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder();
            r0.append(r3.getProtocol());
            r0.append("://");
            r0.append(r3.getHost());
            if (r3.getPort() > 0) goto L5;
        L15:
            r0.append(r3.getPath());
            if (r3.getQuery() == null) goto L19;
            r0.append('?');
            r0.append(r3.getQuery());
        L19:
            return r0.toString();
        L5:
            if (r3.getPort() != 80) goto L10;
            if ("http".equals(r3.getProtocol()) == true) goto L15;
        L10:
            if (r3.getPort() == 443) goto L12;
        L14:
            r0.append(':');
            r0.append(r3.getPort());
            goto L15
        L12:
            if ("https".equals(r3.getProtocol()) == false) goto L14;
            goto L14
        }

        private static java.lang.String j6(byte[] r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder(r5.length * 2);
            int r1 = 0;
        L4:
            if (r1 >= r5.length) goto L6;
            byte r2 = r5[r1];
            r0.append(FH[(r2 >>> 4) & 15]);
            r0.append(FH[r2 & 15]);
            r1 = r1 + 1;
            goto L4
        L6:
            return r0.toString();
        }

        private static java.security.MessageDigest j6() {
            return java.security.MessageDigest.getInstance("MD5");
        L4:
            e = move-exception;
            throw new java.lang.RuntimeException("No MD5 available", e);
        }

        @Override
        void j6(java.lang.String r1, java.lang.String r2) {
            this.Zo = r1;
            this.VH = r2;
        }

        @Override
        void j6(java.net.HttpURLConnection r17) {
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap();
            java.lang.String r2 = this.Hw.get("realm");
            java.lang.String r4 = this.Hw.get("nonce");
            java.lang.String r6 = this.Hw.get("cnonce");
            java.lang.String r8 = j6(r17.getURL());
            java.lang.String r9 = this.Hw.get("qop");
            java.lang.String r11 = r17.getRequestMethod();
            java.lang.String r12 = java.lang.String.valueOf(this.Zo) + ":" + r2 + ":" + this.VH;
            java.lang.String r13 = java.lang.String.valueOf(r11) + ":" + r8;
            r1.put("username", this.Zo);
            r1.put("realm", r2);
            r1.put("nonce", r4);
            r1.put("uri", r8);
            if ("auth".equals(r9) == false) goto L5;
            int r10 = this.v5 + 1;
            this.v5 = r10;
            java.lang.String r3 = java.lang.String.format("%08x", new java.lang.Object[]{java.lang.Integer.valueOf(r10)});
            java.lang.String r5 = DW(j6(r12), java.lang.String.valueOf(r4) + ":" + r3 + ":" + r6 + ":" + r9 + ":" + j6(r13));
        L6:
            r1.put("response", r5);
            if (this.Hw.containsKey("algorithm") == false) goto L9;
            r1.put("algorithm", "MD5");
        L9:
            if (r6 == null) goto L13;
            if (r9 == null) goto L13;
            r1.put("cnonce", r6);
        L13:
            if (this.Hw.containsKey("opaque") == false) goto L15;
            r1.put("opaque", this.Hw.get("opaque"));
        L15:
            if (r9 == null) goto L17;
            r1.put("qop", r9);
        L17:
            if (r3 == null) goto L19;
            r1.put("nc", r3);
        L19:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder();
            java.util.Iterator r14 = r1.entrySet().iterator();
        L21:
            if (r14.hasNext() == false) goto L22;
            java.util.Map.Entry r15 = (java.util.Map.Entry) r14.next();
            if (r7.length() <= 0) goto L27;
            r7.append(", ");
        L27:
            r7.append((java.lang.String) r15.getKey());
            r7.append('=');
            r7.append('\"');
            r7.append((java.lang.String) r15.getValue());
            r7.append('\"');
            goto L21
        L22:
            r17.setRequestProperty("Authorization", "Digest " + r7);
            return;
        L5:
            r3 = null;
            r5 = DW(j6(r12), java.lang.String.valueOf(r4) + ":" + j6(r13));
            goto L6
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
        java.lang.String r4 = r3.getHeaderField("WWW-Authenticate");
        if (r4 == null) goto L22;
        if (r4.length() == 0) goto L22;
        int r0 = r4.indexOf(32);
        if (r0 < 0) goto L10;
        java.lang.String r1 = r4.substring(0, r0);
        if ("Basic".equalsIgnoreCase(r1) == false) goto L16;
        return new abcd.AbstractrI.a(null);
    L16:
        if ("Digest".equalsIgnoreCase(r1) == false) goto L20;
        return new abcd.AbstractrI.b(r4.substring(r0 + 1));
    L20:
        return j6;
    L10:
        return j6;
    L22:
        return j6;
    }

    abstract void j6(java.lang.String r1, java.lang.String r2);

    abstract void j6(java.net.HttpURLConnection r1);

    boolean j6(abcd.HJ r8, abcd.AbstractkI r9) {
        if (r9 == null) goto L10;
        abcd.AbstractjI.e r2 = new abcd.AbstractjI.e();
        abcd.AbstractjI.c r3 = new abcd.AbstractjI.c();
        if (r9.j6(new abcd.AbstractjI[]{r2, r3}) == true) goto L7;
    L9:
        return false;
    L7:
        if (r9.j6(r8, new abcd.AbstractjI[]{r2, r3}) == false) goto L9;
        java.lang.String r10 = r2.DW();
        java.lang.String r11 = new java.lang.String(r3.FH());
        r3.DW();
    L11:
        if (r10 == null) goto L14;
        j6(r10, r11);
        return true;
    L14:
        return false;
    L10:
        java.lang.String r12 = r8.gn();
        r11 = r8.FH();
        r10 = r12;
        goto L11
    }
}
