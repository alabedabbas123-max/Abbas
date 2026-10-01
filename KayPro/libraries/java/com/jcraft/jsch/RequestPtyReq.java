package com.jcraft.jsch;

class RequestPtyReq extends com.jcraft.jsch.Request {
    private java.lang.String Hw;
    private int VH;
    private int Zo;
    private int gn;
    private byte[] u7;
    private int v5;

    RequestPtyReq() {
        this.Hw = "vt100";
        this.v5 = 80;
        this.Zo = 24;
        this.VH = 640;
        this.gn = 480;
        this.u7 = com.jcraft.jsch.Util.FH;
    }

    void j6(int r1, int r2, int r3, int r4) {
        this.v5 = r1;
        this.Zo = r2;
        this.VH = r3;
        this.gn = r4;
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
                    r5.Hw(com.jcraft.jsch.Util.FH("pty-req"));
                    if (j6() == false) { $pc0 = 5; continue $sw0; }
                    r6 = 1;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r5.j6((byte) r6);
                    r5.Hw(com.jcraft.jsch.Util.FH(this.Hw));
                    r5.FH(this.v5);
                    r5.FH(this.Zo);
                    r5.FH(this.VH);
                    r5.FH(this.gn);
                    r5.Hw(this.u7);
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

    void j6(java.lang.String r1) {
        this.Hw = r1;
    }

    void j6(byte[] r1) {
        this.u7 = r1;
    }
}
