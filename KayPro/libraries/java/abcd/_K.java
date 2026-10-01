package abcd;

public class _K extends java.io.FilterInputStream {
    private int DW;
    private final abcd.VK j6;

    public _K(java.io.InputStream r1, abcd.VK r2) {
        super(r1);
        this.j6 = r2;
    }

    private void DW() {
        this.j6.j6(this.DW);
    }

    private void FH() {
        this.j6.j6();
    }

    private static java.io.InterruptedIOException Hw() {
        return new java.io.InterruptedIOException(org.eclipse.jgit.JGitText.j6().readTimedOut);
    }

    public int j6() {
        return this.DW;
    }

    public void j6(int r5) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r5 < 0) { $pc0 = 6; continue $sw0; }
                    this.DW = r5;
                    return;
                }
                case 6: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidTimeout, new java.lang.Object[]{java.lang.Integer.valueOf(r5)}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int read() {
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        DW();
                        r0 = super.read();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.InterruptedIOException) { $pc1 = 7; continue $sw1; }
                        $pc1 = 5; continue $sw1;
                    }
                    FH();
                    return r0;
                }
                case 5: {
                    th = $ex1;
                    FH();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 8: {
                    try {
                        throw Hw();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 5; continue $sw1;
                    }
                }
                case 7: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int read(byte[] r3) {
        return read(r3, 0, r3.length);
    }

    @Override
    public int read(byte[] r1, int r2, int r3) {
        int r4 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    try {
                        DW();
                        r4 = super.read(r1, r2, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.InterruptedIOException) { $pc2 = 7; continue $sw2; }
                        $pc2 = 5; continue $sw2;
                    }
                    FH();
                    return r4;
                }
                case 5: {
                    th = $ex2;
                    FH();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 8: {
                    try {
                        throw Hw();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 5; continue $sw2;
                    }
                }
                case 7: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public long skip(long r1) {
        long r2 = 0L;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    try {
                        DW();
                        r2 = super.skip(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.InterruptedIOException) { $pc3 = 7; continue $sw3; }
                        $pc3 = 5; continue $sw3;
                    }
                    FH();
                    return r2;
                }
                case 5: {
                    th = $ex3;
                    FH();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 8: {
                    try {
                        throw Hw();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 5; continue $sw3;
                    }
                }
                case 7: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
