package abcd;

public class aL extends java.io.OutputStream {
    private final abcd.VK DW;
    private int FH;
    private final java.io.OutputStream j6;

    public aL(java.io.OutputStream r1, abcd.VK r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    private void DW() {
        this.DW.j6();
    }

    private static java.io.InterruptedIOException FH() {
        return new java.io.InterruptedIOException(org.eclipse.jgit.JGitText.j6().writeTimedOut);
    }

    private void j6() {
        this.DW.j6(this.FH);
    }

    @Override
    public void close() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        j6();
                        this.j6.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.InterruptedIOException) { $pc0 = 7; continue $sw0; }
                        $pc0 = 5; continue $sw0;
                    }
                    DW();
                    return;
                }
                case 5: {
                    th = $ex0;
                    DW();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 8: {
                    try {
                        throw FH();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 5; continue $sw0;
                    }
                }
                case 7: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void flush() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        j6();
                        this.j6.flush();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.InterruptedIOException) { $pc1 = 7; continue $sw1; }
                        $pc1 = 5; continue $sw1;
                    }
                    DW();
                    return;
                }
                case 5: {
                    th = $ex1;
                    DW();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 8: {
                    try {
                        throw FH();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 5; continue $sw1;
                    }
                }
                case 7: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r5) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r5 < 0) { $pc2 = 6; continue $sw2; }
                    this.FH = r5;
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
    public void write(int r2) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    try {
                        j6();
                        this.j6.write(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.InterruptedIOException) { $pc3 = 7; continue $sw3; }
                        $pc3 = 5; continue $sw3;
                    }
                    DW();
                    return;
                }
                case 5: {
                    th = $ex3;
                    DW();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 8: {
                    try {
                        throw FH();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 5; continue $sw3;
                    }
                }
                case 7: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void write(byte[] r3) {
        write(r3, 0, r3.length);
    }

    @Override
    public void write(byte[] r2, int r3, int r4) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    try {
                        j6();
                        this.j6.write(r2, r3, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.InterruptedIOException) { $pc4 = 7; continue $sw4; }
                        $pc4 = 5; continue $sw4;
                    }
                    DW();
                    return;
                }
                case 5: {
                    th = $ex4;
                    DW();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 8: {
                    try {
                        throw FH();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 5; continue $sw4;
                    }
                }
                case 7: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
