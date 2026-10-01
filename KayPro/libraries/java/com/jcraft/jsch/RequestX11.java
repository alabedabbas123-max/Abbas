package com.jcraft.jsch;

class RequestX11 extends com.jcraft.jsch.Request {
    RequestX11() {
    }

    @Override
    public void j6(com.jcraft.jsch.Session r5, com.jcraft.jsch.Channel r6) {
        com.jcraft.jsch.Buffer r0 = null;
        com.jcraft.jsch.Packet r1 = null;
        int r7 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super.j6(r5, r6);
                    r0 = new com.jcraft.jsch.Buffer();
                    r1 = new com.jcraft.jsch.Packet(r0);
                    r1.DW();
                    r0.j6((byte) 98);
                    r0.FH(r6.tp());
                    r0.Hw(com.jcraft.jsch.Util.FH("x11-req"));
                    if (j6() == false) { $pc0 = 5; continue $sw0; }
                    r7 = 1;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r0.j6((byte) r7);
                    r0.j6((byte) 0);
                    r0.Hw(com.jcraft.jsch.Util.FH("MIT-MAGIC-COOKIE-1"));
                    r0.Hw(com.jcraft.jsch.ChannelX11.FH(r5));
                    r0.FH(0);
                    j6(r1);
                    r5.SI = true;
                    return;
                }
                case 5: {
                    r7 = 0;
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
