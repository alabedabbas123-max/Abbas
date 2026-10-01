package abcd;

class CH {
    private final int DW;
    private final java.lang.ref.ReferenceQueue<byte[]> FH;
    private long Hw;
    private final long j6;

    static class a extends java.lang.ref.SoftReference<byte[]> {
        final int j6;

        a(byte[] r1, java.lang.ref.ReferenceQueue<byte[]> r2) {
            super(r1, r2);
            this.j6 = r1.length;
        }
    }

    CH(abcd.NH r3) {
        this.j6 = r3.Hw();
        this.DW = r3.FH();
        this.FH = new java.lang.ref.ReferenceQueue();
    }

    private void j6() {
        abcd.CH.a r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 2;
        $sw0: while (true) {
            switch ($pc0) {
                case 2: {
                    r0 = (abcd.CH.a) this.FH.poll();
                    if (r0 == null) { $pc0 = 4; continue $sw0; }
                    this.Hw -= (long) r0.j6;
                    { $pc0 = 2; continue $sw0; }
                }
                case 4: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abcd.CH.a j6(byte[] r3, int r4, int r5) {
        byte[] r6 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r6 = j6(r3, r4);
                    if (r5 == r6.length) { $pc1 = 6; continue $sw1; }
                    this.Hw -= (long) r5;
                    this.Hw += (long) r6.length;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return new abcd.CH.a(r6, this.FH);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(int r5) {
        this.Hw -= (long) r5;
    }

    boolean j6(int r11, abcd.MH r12, abcd.MH r13) {
        long r0 = 0L;
        long r7 = 0L;
        long r1 = 0L;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.j6;
                    if (0 >= r0) { $pc2 = 12; continue $sw2; }
                    r7 = r11;
                    if (r0 >= (this.Hw + r7)) { $pc2 = 12; continue $sw2; }
                    j6();
                    r1 = this.j6;
                    if (0 >= r1) { $pc2 = 12; continue $sw2; }
                    if (r1 >= (this.Hw + r7)) { $pc2 = 12; continue $sw2; }
                    return false;
                }
                case 12: {
                    if (r11 >= this.DW) { $pc2 = 16; continue $sw2; }
                    this.Hw += (long) r11;
                    return true;
                }
                case 16: {
                    if ((r11 >> 10) >= ((r12.gW() >> 20) + (r13.gW() >> 21))) { $pc2 = 19; continue $sw2; }
                    this.Hw += (long) r11;
                    return true;
                }
                case 19: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    byte[] j6(byte[] r3, int r4) {
        byte[] r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r3.length == r4) { $pc3 = 6; continue $sw3; }
                    r0 = new byte[r4];
                    java.lang.System.arraycopy(r3, 0, r0, 0, r4);
                    return r0;
                }
                case 6: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
