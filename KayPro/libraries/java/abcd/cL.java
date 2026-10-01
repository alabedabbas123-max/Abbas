package abcd;

public class cL extends java.io.InputStream {
    private static final java.io.InputStream j6 = null;
    private final java.util.LinkedList<java.io.InputStream> DW;

    static {
        j6 = new abcd.bL();
    }

    public cL(java.io.InputStream... r4) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.DW = new java.util.LinkedList();
                    r0 = r4.length;
                    r1 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r1 >= r0) { $pc0 = 4; continue $sw0; }
                    j6(r4[r1]);
                    r1 = r1 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 4: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.DW.isEmpty() == true) { $pc1 = 6; continue $sw1; }
                    this.DW.removeFirst().close();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.io.InputStream j6() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.DW.isEmpty() == false) { $pc2 = 6; continue $sw2; }
                    return j6;
                }
                case 6: {
                    return this.DW.getFirst();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int available() {
        return j6().available();
    }

    @Override
    public void close() {
        java.util.Iterator<java.io.InputStream> r0 = null;
        java.io.IOException e = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.DW.iterator();
                    e = null;
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc3 = 5; continue $sw3; }
                    try {
                        r0.next().close();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.IOException) { $pc3 = 10; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    r0.remove();
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    e = e;
                    { $pc3 = 11; continue $sw3; }
                }
                case 5: {
                    if (e != null) { $pc3 = 7; continue $sw3; }
                    return;
                }
                case 7: {
                    throw e;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.io.InputStream r2) {
        this.DW.add(r2);
    }

    @Override
    public int read() {
        java.io.InputStream r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 2;
        $sw4: while (true) {
            switch ($pc4) {
                case 2: {
                    r0 = j6();
                    r1 = r0.read();
                    if (r1 >= 0) { $pc4 = 4; continue $sw4; }
                    if (r0 == j6) { $pc4 = 7; continue $sw4; }
                    DW();
                    { $pc4 = 2; continue $sw4; }
                }
                case 7: {
                    return -1;
                }
                case 4: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int read(byte[] r4, int r5, int r6) {
        int r0 = 0;
        java.io.InputStream r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = 0;
                    $pc5 = 3; continue $sw5;
                }
                case 3: {
                    if (r6 <= 0) { $pc5 = 16; continue $sw5; }
                    r1 = j6();
                    r2 = r1.read(r4, r5, r6);
                    if (r2 > 0) { $pc5 = 7; continue $sw5; }
                    if (r1 == j6) { $pc5 = 10; continue $sw5; }
                    DW();
                    if (r0 <= 0) { $pc5 = 3; continue $sw5; }
                    $pc5 = 10; continue $sw5;
                }
                case 10: {
                    if (r0 > 0) { $pc5 = 25; continue $sw5; }
                    return -1;
                }
                case 25: {
                    return r0;
                }
                case 7: {
                    r0 = r0 + r2;
                    r5 = r5 + r2;
                    r6 = r6 - r2;
                    $pc5 = 16; continue $sw5;
                }
                case 16: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public long skip(long r9) {
        long r2 = 0L;
        java.io.InputStream r4 = null;
        long r5 = 0L;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r2 = 0;
                    $pc6 = 4; continue $sw6;
                }
                case 4: {
                    if (0 >= r9) { $pc6 = 16; continue $sw6; }
                    r4 = j6();
                    r5 = r4.skip(r9);
                    if (0 < r5) { $pc6 = 8; continue $sw6; }
                    if (r4 == j6) { $pc6 = 11; continue $sw6; }
                    if (r4.read() < 0) { $pc6 = 14; continue $sw6; }
                    r2 = r2 + 1;
                    r9 = r9 - 1;
                    { $pc6 = 4; continue $sw6; }
                }
                case 14: {
                    DW();
                    if (0 >= r2) { $pc6 = 4; continue $sw6; }
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    return r2;
                }
                case 8: {
                    r2 = r2 + r5;
                    r9 = r9 - r5;
                    $pc6 = 16; continue $sw6;
                }
                case 16: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
