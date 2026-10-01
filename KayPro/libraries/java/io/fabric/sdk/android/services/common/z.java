package io.fabric.sdk.android.services.common;

public class z implements java.io.Closeable {
    private static final java.util.logging.Logger j6 = null;
    private final java.io.RandomAccessFile DW;
    int FH;
    private int Hw;
    private final byte[] VH;
    private io.fabric.sdk.android.services.common.z.a Zo;
    private io.fabric.sdk.android.services.common.z.a v5;

    static class a {
        static final io.fabric.sdk.android.services.common.z.a j6 = null;
        final int DW;
        final int FH;

        static {
            j6 = new io.fabric.sdk.android.services.common.z.a(0, 0);
        }

        a(int r1, int r2) {
            this.DW = r1;
            this.FH = r2;
        }

        public java.lang.String toString() {
            return io.fabric.sdk.android.services.common.z.a.class.getSimpleName() + "[position = " + this.DW + ", length = " + this.FH + "]";
        }
    }

    private final class b extends java.io.InputStream {
        private int DW;
        final io.fabric.sdk.android.services.common.z FH;
        private int j6;

        private b(io.fabric.sdk.android.services.common.z r2, io.fabric.sdk.android.services.common.z.a r3) {
            this.FH = r2;
            this.j6 = io.fabric.sdk.android.services.common.z.j6(r2, r3.DW + 4);
            this.DW = r3.FH;
        }

        b(io.fabric.sdk.android.services.common.z r1, io.fabric.sdk.android.services.common.z.a r2, io.fabric.sdk.android.services.common.y r3) {
            this(r1, r2);
        }

        @Override
        public int read() {
            int r0 = 0;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (this.DW != 0) { $pc0 = 6; continue $sw0; }
                        return -1;
                    }
                    case 6: {
                        io.fabric.sdk.android.services.common.z.j6(this.FH).seek(this.j6);
                        r0 = io.fabric.sdk.android.services.common.z.j6(this.FH).read();
                        this.j6 = io.fabric.sdk.android.services.common.z.j6(this.FH, this.j6 + 1);
                        this.DW--;
                        return r0;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public int read(byte[] r3, int r4, int r5) {
            int r0 = 0;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        io.fabric.sdk.android.services.common.z.j6(r3, "buffer");
                        if ((r4 | r5) < 0) { $pc1 = 15; continue $sw1; }
                        if (r5 > (r3.length - r4)) { $pc1 = 15; continue $sw1; }
                        r0 = this.DW;
                        if (r0 <= 0) { $pc1 = 12; continue $sw1; }
                        if (r5 <= r0) { $pc1 = 10; continue $sw1; }
                        r5 = r0;
                        $pc1 = 10; continue $sw1;
                    }
                    case 10: {
                        io.fabric.sdk.android.services.common.z.j6(this.FH, this.j6, r3, r4, r5);
                        this.j6 = io.fabric.sdk.android.services.common.z.j6(this.FH, this.j6 + r5);
                        this.DW -= r5;
                        return r5;
                    }
                    case 12: {
                        return -1;
                    }
                    case 15: {
                        throw new java.lang.ArrayIndexOutOfBoundsException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public interface c {
        void j6(java.io.InputStream r1, int r2);
    }

    static {
        j6 = java.util.logging.Logger.getLogger(io.fabric.sdk.android.services.common.z.class.getName());
    }

    public z(java.io.File r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    this.VH = new byte[16];
                    if (r2.exists() == true) { $pc2 = 5; continue $sw2; }
                    j6(r2);
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    this.DW = DW(r2);
                    v5();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private io.fabric.sdk.android.services.common.z.a DW(int r4) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r4 == 0) { $pc3 = 4; continue $sw3; }
                    this.DW.seek(r4);
                    return new io.fabric.sdk.android.services.common.z.a(r4, this.DW.readInt());
                }
                case 4: {
                    return io.fabric.sdk.android.services.common.z.a.j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.io.RandomAccessFile DW(java.io.File r2) {
        return new java.io.RandomAccessFile(r2, "rwd");
    }

    private static <T> T DW(T r0, java.lang.String r1) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r0 == null) { $pc4 = 5; continue $sw4; }
                    return r0;
                }
                case 5: {
                    throw new java.lang.NullPointerException(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(int r5, byte[] r6, int r7, int r8) {
        int r9 = 0;
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r9 = Hw(r5);
                    r0 = r9 + r8;
                    r1 = this.FH;
                    if (r0 > r1) { $pc5 = 5; continue $sw5; }
                    this.DW.seek(r9);
                    this.DW.write(r6, r7, r8);
                    return;
                }
                case 5: {
                    r2 = r1 - r9;
                    this.DW.seek(r9);
                    this.DW.write(r6, r7, r2);
                    this.DW.seek(16);
                    this.DW.write(r6, r7 + r2, r8 - r2);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void DW(byte[] r2, int r3, int r4) {
        r2[r3] = (byte) (r4 >> 24);
        r2[r3 + 1] = (byte) (r4 >> 16);
        r2[r3 + 2] = (byte) (r4 >> 8);
        r2[r3 + 3] = (byte) r4;
    }

    private void FH(int r4) {
        this.DW.setLength(r4);
        this.DW.getChannel().force(true);
    }

    private int Hw(int r2) {
        int r0 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = this.FH;
                    if (r2 >= r0) { $pc6 = 6; continue $sw6; }
                    return r2;
                }
                case 6: {
                    return (r2 + 16) - r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int Zo() {
        return this.FH - Hw();
    }

    static int j6(io.fabric.sdk.android.services.common.z r0, int r1) {
        return r0.Hw(r1);
    }

    private static int j6(byte[] r2, int r3) {
        return ((((r2[r3] & 255) << 24) + ((r2[r3 + 1] & 255) << 16)) + ((r2[r3 + 2] & 255) << 8)) + (r2[r3 + 3] & 255);
    }

    static java.io.RandomAccessFile j6(io.fabric.sdk.android.services.common.z r0) {
        return r0.DW;
    }

    static java.lang.Object j6(java.lang.Object r0, java.lang.String r1) {
        DW(r0, r1);
        return r0;
    }

    private void j6(int r11) {
        int r12 = 0;
        int r0 = 0;
        int r1 = 0;
        io.fabric.sdk.android.services.common.z.a r13 = null;
        int r14 = 0;
        java.nio.channels.FileChannel r7 = null;
        long r8 = 0L;
        int r15 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r12 = r11 + 4;
                    r0 = Zo();
                    if (r0 < r12) { $pc7 = 5; continue $sw7; }
                    return;
                }
                case 5: {
                    r1 = this.FH;
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    r0 = r0 + r1;
                    r1 = r1 << 1;
                    if (r0 < r12) { $pc7 = 6; continue $sw7; }
                    FH(r1);
                    r13 = this.Zo;
                    r14 = Hw((r13.DW + 4) + r13.FH);
                    if (r14 >= this.v5.DW) { $pc7 = 15; continue $sw7; }
                    r7 = this.DW.getChannel();
                    r7.position(this.FH);
                    r8 = r14 - 4;
                    if (r7.transferTo(16, r8, r7) == r8) { $pc7 = 15; continue $sw7; }
                    throw new java.lang.AssertionError("Copied insufficient number of bytes!");
                }
                case 15: {
                    r15 = this.Zo.DW;
                    r2 = this.v5.DW;
                    if (r15 >= r2) { $pc7 = 18; continue $sw7; }
                    r3 = (this.FH + r15) - 16;
                    j6(r1, this.Hw, r2, r3);
                    this.Zo = new io.fabric.sdk.android.services.common.z.a(r3, this.Zo.FH);
                    $pc7 = 19; continue $sw7;
                }
                case 19: {
                    this.FH = r1;
                    return;
                }
                case 18: {
                    j6(r1, this.Hw, r2, r15);
                    { $pc7 = 19; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(int r4, int r5, int r6, int r7) {
        j6(this.VH, new int[]{r4, r5, r6, r7});
        this.DW.seek(0);
        this.DW.write(this.VH);
    }

    private void j6(int r5, byte[] r6, int r7, int r8) {
        int r9 = 0;
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r9 = Hw(r5);
                    r0 = r9 + r8;
                    r1 = this.FH;
                    if (r0 > r1) { $pc8 = 5; continue $sw8; }
                    this.DW.seek(r9);
                    this.DW.readFully(r6, r7, r8);
                    return;
                }
                case 5: {
                    r2 = r1 - r9;
                    this.DW.seek(r9);
                    this.DW.readFully(r6, r7, r2);
                    this.DW.seek(16);
                    this.DW.readFully(r6, r7 + r2, r8 - r2);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(io.fabric.sdk.android.services.common.z r0, int r1, byte[] r2, int r3, int r4) {
        r0.j6(r1, r2, r3, r4);
    }

    private static void j6(java.io.File r6) {
        java.io.File r0 = null;
        java.io.RandomAccessFile r1 = null;
        byte[] r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = new java.io.File(r6.getPath() + ".tmp");
                    r1 = DW(r0);
                    try {
                        r1.setLength(4096);
                        r1.seek(0);
                        r2 = new byte[16];
                        j6(r2, new int[]{4096, 0, 0, 0});
                        r1.write(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 9; continue $sw9;
                    }
                    r1.close();
                    if (r0.renameTo(r6) == false) { $pc9 = 8; continue $sw9; }
                    return;
                }
                case 8: {
                    throw new java.io.IOException("Rename failed!");
                }
                case 9: {
                    th = $ex9;
                    r1.close();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(byte[] r4, int... r5) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = r5.length;
                    r1 = 0;
                    r2 = 0;
                    $pc10 = 3; continue $sw10;
                }
                case 3: {
                    if (r1 >= r0) { $pc10 = 5; continue $sw10; }
                    DW(r4, r2, r5[r1]);
                    r2 = r2 + 4;
                    r1 = r1 + 1;
                    { $pc10 = 3; continue $sw10; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void v5() {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    this.DW.seek(0);
                    this.DW.readFully(this.VH);
                    this.FH = j6(this.VH, 0);
                    if (this.FH > this.DW.length()) { $pc11 = 7; continue $sw11; }
                    this.Hw = j6(this.VH, 4);
                    r0 = j6(this.VH, 8);
                    r1 = j6(this.VH, 12);
                    this.v5 = DW(r0);
                    this.Zo = DW(r1);
                    return;
                }
                case 7: {
                    throw new java.io.IOException("File is truncated. Expected length: " + this.FH + ", Actual length: " + this.DW.length());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public synchronized boolean DW() {
        boolean r0 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    monitor-enter(this);
                    if (this.Hw != 0) { $pc12 = 6; continue $sw12; }
                    r0 = true;
                    $pc12 = 7; continue $sw12;
                }
                case 7: {
                    monitor-exit(this);
                    return r0;
                }
                case 6: {
                    r0 = false;
                    $pc12 = 9; continue $sw12;
                }
                case 9: {
                    th = $ex12;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public synchronized void FH() {
        int r0 = 0;
        int r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    monitor-enter(this);
                    $pc13 = 13; continue $sw13;
                }
                case 13: {
                    th = $ex13;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW() == true) { $pc13 = 12; continue $sw13; }
                    if (this.Hw != 1) { $pc13 = 8; continue $sw13; }
                    try {
                        j6();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 13; continue $sw13;
                    }
                    $pc13 = 9; continue $sw13;
                }
                case 9: {
                    monitor-exit(this);
                    return;
                }
                case 8: {
                    try {
                        r0 = Hw((this.v5.DW + 4) + this.v5.FH);
                        j6(r0, this.VH, 0, 4);
                        r2 = j6(this.VH, 0);
                        j6(this.FH, this.Hw - 1, r0, this.Zo.DW);
                        this.Hw--;
                        this.v5 = new io.fabric.sdk.android.services.common.z.a(r0, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 13; continue $sw13;
                    }
                    { $pc13 = 9; continue $sw13; }
                }
                case 12: {
                    try {
                        throw new java.util.NoSuchElementException();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 13; continue $sw13;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int Hw() {
        io.fabric.sdk.android.services.common.z.a r0 = null;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    if (this.Hw != 0) { $pc14 = 5; continue $sw14; }
                    return 16;
                }
                case 5: {
                    r0 = this.Zo;
                    r2 = r0.DW;
                    r3 = this.v5.DW;
                    if (r2 < r3) { $pc14 = 10; continue $sw14; }
                    return (((r2 - r3) + 4) + r0.FH) + 16;
                }
                case 10: {
                    return (((r2 + 4) + r0.FH) + this.FH) - r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public synchronized void close() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    monitor-enter(this);
                    try {
                        this.DW.close();
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 6; continue $sw15;
                    }
                    monitor-exit(this);
                    return;
                }
                case 6: {
                    th = $ex15;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public synchronized void j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    monitor-enter(this);
                    try {
                        j6(4096, 0, 0, 0);
                        this.Hw = 0;
                        this.v5 = io.fabric.sdk.android.services.common.z.a.j6;
                        this.Zo = io.fabric.sdk.android.services.common.z.a.j6;
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 10; continue $sw16;
                    }
                    if (this.FH <= 4096) { $pc16 = 7; continue $sw16; }
                    try {
                        FH(4096);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 10; continue $sw16;
                    }
                    $pc16 = 7; continue $sw16;
                }
                case 7: {
                    try {
                        this.FH = 4096;
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 10; continue $sw16;
                    }
                    monitor-exit(this);
                    return;
                }
                case 10: {
                    th = $ex16;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public synchronized void j6(io.fabric.sdk.android.services.common.z.c r5) {
        int r0 = 0;
        int r1 = 0;
        io.fabric.sdk.android.services.common.z.a r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    monitor-enter(this);
                    try {
                        r0 = this.v5.DW;
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 10; continue $sw17;
                    }
                    r1 = 0;
                    $pc17 = 5; continue $sw17;
                }
                case 5: {
                    if (r1 >= this.Hw) { $pc17 = 8; continue $sw17; }
                    try {
                        r2 = DW(r0);
                        r5.j6(new io.fabric.sdk.android.services.common.z.b(this, r2, null), r2.FH);
                        r0 = Hw((r2.DW + 4) + r2.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 10; continue $sw17;
                    }
                    r1 = r1 + 1;
                    { $pc17 = 5; continue $sw17; }
                }
                case 8: {
                    monitor-exit(this);
                    return;
                }
                case 10: {
                    th = $ex17;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(byte[] r3) {
        j6(r3, 0, r3.length);
    }

    public synchronized void j6(byte[] r7, int r8, int r9) {
        boolean r0 = false;
        int r2 = 0;
        io.fabric.sdk.android.services.common.z.a r3 = null;
        int r10 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    monitor-enter(this);
                    try {
                        DW(r7, "buffer");
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 22; continue $sw18;
                    }
                    if ((r8 | r9) < 0) { $pc18 = 21; continue $sw18; }
                    if (r9 > (r7.length - r8)) { $pc18 = 21; continue $sw18; }
                    try {
                        j6(r9);
                        r0 = DW();
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 22; continue $sw18;
                    }
                    if (r0 == false) { $pc18 = 10; continue $sw18; }
                    r2 = 16;
                    $pc18 = 11; continue $sw18;
                }
                case 11: {
                    try {
                        r3 = new io.fabric.sdk.android.services.common.z.a(r2, r9);
                        DW(this.VH, 0, r9);
                        DW(r3.DW, this.VH, 0, 4);
                        DW(r3.DW + 4, r7, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 22; continue $sw18;
                    }
                    if (r0 == false) { $pc18 = 14; continue $sw18; }
                    try {
                        r10 = r3.DW;
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 22; continue $sw18;
                    }
                    $pc18 = 15; continue $sw18;
                }
                case 15: {
                    try {
                        j6(this.FH, this.Hw + 1, r10, r3.DW);
                        this.Zo = r3;
                        this.Hw++;
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 22; continue $sw18;
                    }
                    if (r0 == false) { $pc18 = 18; continue $sw18; }
                    try {
                        this.v5 = this.Zo;
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 22; continue $sw18;
                    }
                    $pc18 = 18; continue $sw18;
                }
                case 18: {
                    monitor-exit(this);
                    return;
                }
                case 14: {
                    try {
                        r10 = this.v5.DW;
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 22; continue $sw18;
                    }
                    { $pc18 = 15; continue $sw18; }
                }
                case 10: {
                    try {
                        r2 = Hw((this.Zo.DW + 4) + this.Zo.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 22; continue $sw18;
                    }
                    $pc18 = 21; continue $sw18;
                }
                case 21: {
                    try {
                        throw new java.lang.IndexOutOfBoundsException();
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 22; continue $sw18;
                    }
                }
                case 22: {
                    th = $ex18;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(int r2, int r3) {
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    if (((Hw() + 4) + r2) > r3) { $pc19 = 5; continue $sw19; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append(io.fabric.sdk.android.services.common.z.class.getSimpleName());
                    r0.append('[');
                    r0.append("fileLength=");
                    r0.append(this.FH);
                    r0.append(", size=");
                    r0.append(this.Hw);
                    r0.append(", first=");
                    r0.append(this.v5);
                    r0.append(", last=");
                    r0.append(this.Zo);
                    r0.append(", element lengths=[");
                    try {
                        j6(new io.fabric.sdk.android.services.common.y(this, r0));
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        if ($t instanceof java.io.IOException) { $pc20 = 5; continue $sw20; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc20 = 7; continue $sw20;
                }
                case 7: {
                    r0.append("]]");
                    return r0.toString();
                }
                case 5: {
                    e = $ex20;
                    j6.log(java.util.logging.Level.WARNING, "read error", e);
                    { $pc20 = 7; continue $sw20; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
