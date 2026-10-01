package com.jcraft.jsch;

class RequestEnv extends com.jcraft.jsch.Request {
    byte[] Hw;
    byte[] v5;

    RequestEnv() {
        this.Hw = new byte[0];
        this.v5 = new byte[0];
    }

    @Override
    public void j6(com.jcraft.jsch.Session r3, com.jcraft.jsch.Channel r4) {
        com.jcraft.jsch.Buffer r5 = null;
        com.jcraft.jsch.Packet r0 = null;
        int r6 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super.j6(r3, r4);
                    r5 = new com.jcraft.jsch.Buffer();
                    r0 = new com.jcraft.jsch.Packet(r5);
                    r0.DW();
                    r5.j6((byte) 98);
                    r5.FH(r4.tp());
                    r5.Hw(com.jcraft.jsch.Util.FH("env"));
                    if (j6() == false) { $pc0 = 5; continue $sw0; }
                    r6 = 1;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r5.j6((byte) r6);
                    r5.Hw(this.Hw);
                    r5.Hw(this.v5);
                    j6(r0);
                    return;
                }
                case 5: {
                    r6 = 0;
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(byte[] r1, byte[] r2) {
        this.Hw = r1;
        this.v5 = r2;
    }
}
