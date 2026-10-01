package abcd;

class rH extends java.util.zip.InflaterInputStream {
    private final abcd.yE DW;
    private long j6;

    rH(java.io.InputStream r1, java.util.zip.Inflater r2, long r3, abcd.yE r5) {
        this.DW = r5;
        super(r1, r2);
        this.j6 = r3;
    }

    @Override
    public void close() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    abcd.tE.j6(((java.util.zip.InflaterInputStream) this).inf);
                    super.close();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (this.j6 > 0) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.sH.j6(((java.util.zip.InflaterInputStream) this).in, ((java.util.zip.InflaterInputStream) this).inf, this.DW, new byte[64]);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    abcd.tE.j6(((java.util.zip.InflaterInputStream) this).inf);
                    super.close();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int read(byte[] r3, int r4, int r5) {
        int r6 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        r6 = super.read(r3, r4, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc1 = 6; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r6 <= 0) { $pc1 = 5; continue $sw1; }
                    try {
                        this.j6 -= (long) r6;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc1 = 6; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    return r6;
                }
                case 7: {
                    throw new abcd.YC(this.DW, org.eclipse.jgit.JGitText.j6().corruptObjectBadStream);
                }
                case 6: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
