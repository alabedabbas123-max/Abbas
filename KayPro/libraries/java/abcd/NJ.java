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
            javax.crypto.Cipher r0 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        try {
                            r0 = javax.crypto.Cipher.getInstance(this.Hw);
                            r0.init(2, this.v5, this.Zo);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.security.InvalidAlgorithmParameterException) { $pc0 = 4; continue $sw0; }
                            if ($t instanceof java.security.InvalidKeyException) { $pc0 = 7; continue $sw0; }
                            if ($t instanceof javax.crypto.NoSuchPaddingException) { $pc0 = 10; continue $sw0; }
                            if ($t instanceof java.security.NoSuchAlgorithmException) { $pc0 = 13; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        return new javax.crypto.CipherInputStream(r5, r0);
                    }
                    case 4: {
                        e = $ex0;
                        throw j6(e);
                    }
                    case 7: {
                        e = $ex0;
                        throw j6(e);
                    }
                    case 13: {
                        e = $ex0;
                        throw j6(e);
                    }
                    case 10: {
                        e = $ex0;
                        throw j6(e);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        java.io.OutputStream j6(java.io.OutputStream r5) {
            javax.crypto.Cipher r0 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        try {
                            r0 = javax.crypto.Cipher.getInstance(this.Hw);
                            r0.init(1, this.v5, this.Zo);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.security.InvalidAlgorithmParameterException) { $pc1 = 4; continue $sw1; }
                            if ($t instanceof java.security.InvalidKeyException) { $pc1 = 7; continue $sw1; }
                            if ($t instanceof javax.crypto.NoSuchPaddingException) { $pc1 = 10; continue $sw1; }
                            if ($t instanceof java.security.NoSuchAlgorithmException) { $pc1 = 13; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        return new javax.crypto.CipherOutputStream(r5, r0);
                    }
                    case 4: {
                        e = $ex1;
                        throw j6(e);
                    }
                    case 7: {
                        e = $ex1;
                        throw j6(e);
                    }
                    case 13: {
                        e = $ex1;
                        throw j6(e);
                    }
                    case 10: {
                        e = $ex1;
                        throw j6(e);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
        java.lang.String r0 = null;
        java.lang.String r7 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = r3.getHeaderField(java.lang.String.valueOf(r4) + "jets3t-crypto-ver");
                    if (r0 != null) { $pc2 = 6; continue $sw2; }
                    r0 = "";
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (r5.equals(r0) == false) { $pc2 = 16; continue $sw2; }
                    r7 = r3.getHeaderField(java.lang.String.valueOf(r4) + "jets3t-crypto-alg");
                    if (r7 != null) { $pc2 = 11; continue $sw2; }
                    r7 = "";
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    if (r6.equals(r7) == false) { $pc2 = 14; continue $sw2; }
                    return;
                }
                case 14: {
                    throw new java.io.IOException(java.lang.String.valueOf(org.eclipse.jgit.JGitText.j6().unsupportedEncryptionAlgorithm) + r7);
                }
                case 16: {
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unsupportedEncryptionVersion, new java.lang.Object[]{r0}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
