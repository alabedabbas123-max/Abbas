package com.jcraft.jsch;

class RequestAgentForwarding extends com.jcraft.jsch.Request {
    RequestAgentForwarding() {
    }

    @Override
    public void j6(com.jcraft.jsch.Session r5, com.jcraft.jsch.Channel r6) {
        super.j6(r5, r6);
        int r0 = 0;
        j6(false);
        com.jcraft.jsch.Buffer r1 = new com.jcraft.jsch.Buffer();
        com.jcraft.jsch.Packet r2 = new com.jcraft.jsch.Packet(r1);
        r2.DW();
        r1.j6((byte) 98);
        r1.FH(r6.tp());
        r1.Hw(com.jcraft.jsch.Util.FH("auth-agent-req@openssh.com"));
        if (j6() == false) goto L5;
        r0 = 1;
    L5:
        r1.j6((byte) r0);
        j6(r2);
        r5.KD = true;
    }
}
