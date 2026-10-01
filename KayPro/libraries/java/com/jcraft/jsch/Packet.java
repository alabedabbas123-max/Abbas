package com.jcraft.jsch;

public class Packet {
    private static com.jcraft.jsch.Random j6;
    com.jcraft.jsch.Buffer DW;
    byte[] FH;

    public Packet(com.jcraft.jsch.Buffer r2) {
        this.FH = new byte[4];
        this.DW = r2;
    }

    static void j6(com.jcraft.jsch.Random r0) {
        j6 = r0;
    }

    public void DW() {
        this.DW.FH = 5;
    }

    int j6(int r5, int r6, int r7) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        com.jcraft.jsch.Buffer r8 = null;
        byte[] r9 = null;
        int r3 = 0;
        int r10 = 0;
        byte[] r11 = null;
        com.jcraft.jsch.Buffer r12 = null;
        byte[] r13 = null;
        com.jcraft.jsch.Buffer r14 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = (r5 + 5) + 9;
                    r1 = (-r0) & (r6 - 1);
                    if (r1 >= r6) { $pc0 = 5; continue $sw0; }
                    r1 = r1 + r6;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r2 = ((r1 + r0) + r7) + 32;
                    r8 = this.DW;
                    r9 = r8.DW;
                    r3 = r9.length;
                    r10 = r8.FH;
                    if (r3 >= ((((r2 + r10) - 5) - 9) - r5)) { $pc0 = 8; continue $sw0; }
                    r11 = new byte[(((r10 + r2) - 5) - 9) - r5];
                    java.lang.System.arraycopy(r9, 0, r11, 0, r9.length);
                    this.DW.DW = r11;
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    r12 = this.DW;
                    r13 = r12.DW;
                    java.lang.System.arraycopy(r13, r0, r13, r2, ((r12.FH - 5) - 9) - r5);
                    r14 = this.DW;
                    r14.FH = 10;
                    r14.FH(r5);
                    this.DW.FH = r0;
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    com.jcraft.jsch.Buffer j6() {
        return this.DW;
    }

    void j6(byte r3, int r4, int r5, int r6) {
        byte[] r0 = this.DW.DW;
        java.lang.System.arraycopy(r0, r5, r0, 14, r6);
        com.jcraft.jsch.Buffer r7 = this.DW;
        r7.DW[5] = r3;
        r7.FH = 6;
        r7.FH(r4);
        this.DW.FH(r6);
        int r8 = (r6 + 5) + 9;
        this.DW.FH = r8;
    }

    void j6(int r7) {
        synchronized (j6) {
            int r0 = 0;
            int r1 = 0;
            int r2 = 0;
            byte[] r3 = null;
            com.jcraft.jsch.Random r8 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = this.DW.FH;
                        r1 = (-r0) & (r7 - 1);
                        if (r1 >= r7) { $pc1 = 5; continue $sw1; }
                        r1 = r1 + r7;
                        $pc1 = 5; continue $sw1;
                    }
                    case 5: {
                        r2 = (r0 + r1) - 4;
                        r3 = this.FH;
                        r3[0] = (byte) (r2 >>> 24);
                        r3[1] = (byte) (r2 >>> 16);
                        r3[2] = (byte) (r2 >>> 8);
                        r3[3] = (byte) r2;
                        java.lang.System.arraycopy(r3, 0, this.DW.DW, 0, 4);
                        this.DW.DW[4] = (byte) r1;
                        r8 = j6;
                        try {
                            j6.j6(this.DW.DW, this.DW.FH, r1);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 11; continue $sw1;
                        }
                        this.DW.v5(r1);
                        return;
                    }
                    case 11: {
                        th = $ex1;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
