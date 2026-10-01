package com.jcraft.jsch;

class RequestAgentForwarding extends com.jcraft.jsch.Request {
    RequestAgentForwarding() {
    }

    @Override
    public void j6(com.jcraft.jsch.Session r5, com.jcraft.jsch.Channel r6) {
        int r0 = 0;
        com.jcraft.jsch.Buffer r1 = null;
        com.jcraft.jsch.Packet r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super.j6(r5, r6);
                    r0 = 0;
                    j6(false);
                    r1 = new com.jcraft.jsch.Buffer();
                    r2 = new com.jcraft.jsch.Packet(r1);
                    r2.DW();
                    r1.j6((byte) 98);
                    r1.FH(r6.tp());
                    r1.Hw(com.jcraft.jsch.Util.FH("auth-agent-req@openssh.com"));
                    if (j6() == false) { $pc0 = 5; continue $sw0; }
                    r0 = 1;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r1.j6((byte) r0);
                    j6(r2);
                    r5.KD = true;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
