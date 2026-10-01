package com.jcraft.jsch;

class RequestX11 extends com.jcraft.jsch.Request {
    RequestX11() {
    }

    @Override
    public void j6(com.jcraft.jsch.Session r5, com.jcraft.jsch.Channel r6) {
        super.j6(r5, r6);
        com.jcraft.jsch.Buffer r0 = new com.jcraft.jsch.Buffer();
        com.jcraft.jsch.Packet r1 = new com.jcraft.jsch.Packet(r0);
        r1.DW();
        r0.j6((byte) 98);
        r0.FH(r6.tp());
        r0.Hw(com.jcraft.jsch.Util.FH("x11-req"));
        if (j6() == false) goto L5;
        int r7 = 1;
    L6:
        r0.j6((byte) r7);
        r0.j6((byte) 0);
        r0.Hw(com.jcraft.jsch.Util.FH("MIT-MAGIC-COOKIE-1"));
        r0.Hw(com.jcraft.jsch.ChannelX11.FH(r5));
        r0.FH(0);
        j6(r1);
        r5.SI = true;
        return;
    L5:
        r7 = 0;
        goto L6
    }
}
