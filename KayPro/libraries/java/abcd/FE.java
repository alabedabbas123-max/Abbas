package abcd;

public abstract class FE {

    public static class a extends abcd.FE {
        private final byte[] DW;
        private final int j6;

        public a(int r1, byte[] r2) {
            this.j6 = r1;
            this.DW = r2;
        }

        @Override
        public long DW() {
            return j6().length;
        }

        @Override
        public int FH() {
            return this.j6;
        }

        @Override
        public boolean Hw() {
            return false;
        }

        @Override
        public byte[] j6() {
            return this.DW;
        }

        @Override
        public abcd.JE v5() {
            return new abcd.JE.b(this);
        }
    }

    public FE() {
    }

    private static byte[] j6(byte[] r3) {
        byte[] r0 = new byte[r3.length];
        java.lang.System.arraycopy(r3, 0, r0, 0, r3.length);
        return r0;
    }

    public abstract long DW();

    public byte[] DW(int r6) {
        abcd.JE r0 = null;
        long r1 = 0L;
        long r3 = 0L;
        byte[] r7 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (Hw() == false) { $pc0 = 5; continue $sw0; }
                    r0 = v5();
                    try {
                        r1 = r0.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 25; continue $sw0;
                    }
                    r3 = r6;
                    if (r3 < r1) { $pc0 = 24; continue $sw0; }
                    if (2147483647L < r1) { $pc0 = 22; continue $sw0; }
                    try {
                        r7 = new byte[(int) r1];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.OutOfMemoryError) { $pc0 = 18; continue $sw0; }
                        $pc0 = 25; continue $sw0;
                    }
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    try {
                        abcd.BK.j6(r0, r7, 0, r7.length);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 25; continue $sw0;
                    }
                    r0.close();
                    return r7;
                }
                case 18: {
                    e = $ex0;
                    try {
                        throw new abcd.cD.c(e);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 25; continue $sw0;
                    }
                }
                case 22: {
                    try {
                        throw new abcd.cD.a();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 25; continue $sw0;
                    }
                }
                case 24: {
                    try {
                        throw new abcd.cD.b(r3, r1);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 25; continue $sw0;
                    }
                }
                case 25: {
                    th = $ex0;
                    r0.close();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 5: {
                    return j6();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract int FH();

    public abstract boolean Hw();

    public void j6(java.io.OutputStream r9) {
        abcd.JE r0 = null;
        long r1 = 0L;
        byte[] r3 = null;
        long r4 = 0L;
        int r6 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (Hw() == false) { $pc1 = 21; continue $sw1; }
                    r0 = v5();
                    try {
                        r1 = r0.j6();
                        r3 = new byte[8192];
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 18; continue $sw1;
                    }
                    r4 = 0;
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r4 >= r1) { $pc1 = 9; continue $sw1; }
                    try {
                        r6 = r0.read(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 18; continue $sw1;
                    }
                    if (r6 < 0) { $pc1 = 17; continue $sw1; }
                    try {
                        r9.write(r3, 0, r6);
                        r4 = r4 + ((long) r6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 18; continue $sw1;
                    }
                    { $pc1 = 7; continue $sw1; }
                }
                case 17: {
                    try {
                        throw new java.io.EOFException();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 18; continue $sw1;
                    }
                }
                case 9: {
                    if (r0.read() >= 0) { $pc1 = 12; continue $sw1; }
                    r0.close();
                    return;
                }
                case 12: {
                    try {
                        throw new java.io.EOFException();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 18; continue $sw1;
                    }
                }
                case 18: {
                    th = $ex1;
                    r0.close();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 21: {
                    r9.write(j6());
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract byte[] j6();

    public final byte[] j6(int r2) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    return j6(DW(r2));
                }
                case 5: {
                    e = $ex2;
                    throw new abcd.cD.c(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract abcd.JE v5();
}
