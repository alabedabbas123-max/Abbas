package abcd;

abstract class NJ {
    static final abcd.NJ j6 = null;

    private static class a extends abcd.NJ {
        private a() {
        }

        a(abcd.NJ.a r1) {
            this();
        }

        @Override
        void DW(java.net.HttpURLConnection r2, java.lang.String r3) {
            j6(r2, r3, "", "");
        }

        @Override
        java.io.InputStream j6(java.io.InputStream r1) {
            return r1;
        }

        @Override
        java.io.OutputStream j6(java.io.OutputStream r1) {
            return r1;
        }

        @Override
        void j6(java.net.HttpURLConnection r1, java.lang.String r2) {
        }
    }

    static class b extends abcd.NJ {
        private static int DW = 5000;
        private static byte[] FH;
        private final java.lang.String Hw;
        private final javax.crypto.spec.PBEParameterSpec Zo;
        private final javax.crypto.SecretKey v5;

        static {
            FH = new byte[]{-92, 11, -56, 52, -42, -107, -13, 19};
        }

        b(java.lang.String r5, java.lang.String r6) {
            this.Hw = r5;
            javax.crypto.spec.PBEKeySpec r0 = new javax.crypto.spec.PBEKeySpec(r6.toCharArray(), FH, DW, 32);
            this.v5 = javax.crypto.SecretKeyFactory.getInstance(r5).generateSecret(r0);
            this.Zo = new javax.crypto.spec.PBEParameterSpec(FH, DW);
        }

        @Override
        void DW(java.net.HttpURLConnection r3, java.lang.String r4) {
            j6(r3, r4, "2", this.Hw);
        }

        @Override
        java.io.InputStream j6(java.io.InputStream r5) {
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(this.Hw);     // Catch: java.security.InvalidAlgorithmParameterException -> L4 java.security.InvalidKeyException -> L7 javax.crypto.NoSuchPaddingException -> L10 java.security.NoSuchAlgorithmException -> L13
            r0.init(2, this.v5, this.Zo);     // Catch: java.security.InvalidAlgorithmParameterException -> L4 java.security.InvalidKeyException -> L7 javax.crypto.NoSuchPaddingException -> L10 java.security.NoSuchAlgorithmException -> L13
            return new javax.crypto.CipherInputStream(r5, r0);
        L4:
            e = move-exception;
            throw j6(e);
        L7:
            e = move-exception;
            throw j6(e);
        L13:
            e = move-exception;
            throw j6(e);
        L10:
            e = move-exception;
            throw j6(e);
        }

        @Override
        java.io.OutputStream j6(java.io.OutputStream r5) {
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(this.Hw);     // Catch: java.security.InvalidAlgorithmParameterException -> L4 java.security.InvalidKeyException -> L7 javax.crypto.NoSuchPaddingException -> L10 java.security.NoSuchAlgorithmException -> L13
            r0.init(1, this.v5, this.Zo);     // Catch: java.security.InvalidAlgorithmParameterException -> L4 java.security.InvalidKeyException -> L7 javax.crypto.NoSuchPaddingException -> L10 java.security.NoSuchAlgorithmException -> L13
            return new javax.crypto.CipherOutputStream(r5, r0);
        L4:
            e = move-exception;
            throw j6(e);
        L7:
            e = move-exception;
            throw j6(e);
        L13:
            e = move-exception;
            throw j6(e);
        L10:
            e = move-exception;
            throw j6(e);
        }

        @Override
        void j6(java.net.HttpURLConnection r3, java.lang.String r4) {
            r3.setRequestProperty(java.lang.String.valueOf(r4) + "jets3t-crypto-ver", "2");
            r3.setRequestProperty(java.lang.String.valueOf(r4) + "jets3t-crypto-alg", this.Hw);
        }
    }

    static {
        j6 = new abcd.NJ.a(null);
    }

    NJ() {
    }

    abstract void DW(java.net.HttpURLConnection r1, java.lang.String r2);

    java.io.IOException j6(java.lang.Throwable r6) {
        java.io.IOException r0 = new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().encryptionError, new java.lang.Object[]{r6.getMessage()}));
        r0.initCause(r6);
        return r0;
    }

    abstract java.io.InputStream j6(java.io.InputStream r1);

    abstract java.io.OutputStream j6(java.io.OutputStream r1);

    abstract void j6(java.net.HttpURLConnection r1, java.lang.String r2);

    protected void j6(java.net.HttpURLConnection r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        java.lang.String r0 = r3.getHeaderField(java.lang.String.valueOf(r4) + "jets3t-crypto-ver");
        if (r0 != null) goto L6;
        r0 = "";
    L6:
        if (r5.equals(r0) == false) goto L16;
        java.lang.String r7 = r3.getHeaderField(java.lang.String.valueOf(r4) + "jets3t-crypto-alg");
        if (r7 != null) goto L11;
        r7 = "";
    L11:
        if (r6.equals(r7) == false) goto L14;
        return;
    L14:
        throw new java.io.IOException(java.lang.String.valueOf(org.eclipse.jgit.JGitText.j6().unsupportedEncryptionAlgorithm) + r7);
    L16:
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unsupportedEncryptionVersion, new java.lang.Object[]{r0}));
    }
}
