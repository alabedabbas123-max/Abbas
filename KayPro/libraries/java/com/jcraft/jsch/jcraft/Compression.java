package com.jcraft.jsch.jcraft;

public class Compression implements com.jcraft.jsch.Compression {
    private int DW;
    private abcd.Oy FH;
    private byte[] Hw;
    private final int j6;
    private byte[] v5;

    public Compression() {
        this.j6 = 52;
        this.Hw = new byte[4096];
        this.FH = new abcd.Oy();
    }

    @Override
    public byte[] DW(byte[] r9, int r10, int[] r11) {
        abcd.Oy r0 = null;
        int r1 = 0;
        abcd.Oy r2 = null;
        int r3 = 0;
        byte[] r4 = null;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        byte[] r12 = null;
        byte[] r13 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.FH;
                    r0.j6 = r9;
                    r0.DW = r10;
                    r0.FH = r11[0];
                    r1 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    r2 = this.FH;
                    r2.v5 = this.Hw;
                    r2.Zo = 0;
                    r2.VH = 4096;
                    r3 = r2.FH(1);
                    if (r3 == (-5)) { $pc0 = 16; continue $sw0; }
                    if (r3 != 0) { $pc0 = 6; continue $sw0; }
                    r4 = this.v5;
                    r5 = r4.length;
                    r6 = r1 + 4096;
                    r7 = this.FH.VH;
                    if (r5 >= (r6 - r7)) { $pc0 = 14; continue $sw0; }
                    r8 = r4.length * 2;
                    if (r8 >= (r6 - r7)) { $pc0 = 13; continue $sw0; }
                    r8 = r6 - r7;
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    r12 = new byte[r8];
                    java.lang.System.arraycopy(this.v5, 0, r12, 0, r1);
                    this.v5 = r12;
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    java.lang.System.arraycopy(this.Hw, 0, this.v5, r1, 4096 - this.FH.VH);
                    r1 = r1 + (4096 - this.FH.VH);
                    r11[0] = r1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 6: {
                    java.lang.System.err.println("uncompress: inflate returnd " + r3);
                    return null;
                }
                case 16: {
                    if (r1 <= (r9.length - r10)) { $pc0 = 18; continue $sw0; }
                    r13 = new byte[r1 + r10];
                    java.lang.System.arraycopy(r9, 0, r13, 0, r10);
                    java.lang.System.arraycopy(this.v5, 0, r13, r10, r1);
                    r9 = r13;
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    r11[0] = r1;
                    return r9;
                }
                case 18: {
                    java.lang.System.arraycopy(this.v5, 0, r9, r10, r1);
                    { $pc0 = 19; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(int r2, int r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r2 != 1) { $pc1 = 5; continue $sw1; }
                    this.FH.DW(r3);
                    this.DW = 1;
                    return;
                }
                case 5: {
                    if (r2 != 0) { $pc1 = 9; continue $sw1; }
                    this.FH.DW();
                    this.v5 = new byte[4096];
                    this.DW = 0;
                    return;
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public byte[] j6(byte[] r6, int r7, int[] r8) {
        abcd.Oy r0 = null;
        abcd.Oy r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        byte[] r9 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.FH;
                    r0.j6 = r6;
                    r0.DW = r7;
                    r0.FH = r8[0] - r7;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    r1 = this.FH;
                    r1.v5 = this.Hw;
                    r1.Zo = 0;
                    r1.VH = 4096;
                    r2 = r1.j6(1);
                    if (r2 == 0) { $pc2 = 6; continue $sw2; }
                    java.lang.System.err.println("compress: deflate returnd " + r2);
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    if (this.FH.VH == 0) { $pc2 = 3; continue $sw2; }
                    r8[0] = r7;
                    return r6;
                }
                case 6: {
                    r3 = 4096 - this.FH.VH;
                    r4 = r7 + r3;
                    r5 = r4 + 52;
                    if (r6.length >= r5) { $pc2 = 9; continue $sw2; }
                    r9 = new byte[r5 * 2];
                    java.lang.System.arraycopy(r6, 0, r9, 0, r6.length);
                    r6 = r9;
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    java.lang.System.arraycopy(this.Hw, 0, r6, r7, r3);
                    r7 = r4;
                    { $pc2 = 11; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
