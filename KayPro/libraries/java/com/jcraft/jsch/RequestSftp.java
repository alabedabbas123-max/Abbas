package com.jcraft.jsch;

public class RequestSftp extends com.jcraft.jsch.Request {
    RequestSftp() {
        j6(true);
    }

    @Override
    public void j6(com.jcraft.jsch.Session r3, com.jcraft.jsch.Channel r4) {
        super.j6(r3, r4);
        com.jcraft.jsch.Buffer r5 = new com.jcraft.jsch.Buffer();
        com.jcraft.jsch.Packet r0 = new com.jcraft.jsch.Packet(r5);
        r0.DW();
        r5.j6((byte) 98);
        r5.FH(r4.tp());
        r5.Hw(com.jcraft.jsch.Util.FH("subsystem"));
        if (j6() == false) goto L5;
        int r6 = 1;
    L6:
        r5.j6((byte) r6);
        r5.Hw(com.jcraft.jsch.Util.FH("sftp"));
        j6(r0);
        return;
    L5:
        r6 = 0;
        goto L6
    }
}
