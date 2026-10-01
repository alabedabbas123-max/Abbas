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
        super.j6(r3, r4);
        com.jcraft.jsch.Buffer r5 = new com.jcraft.jsch.Buffer();
        com.jcraft.jsch.Packet r0 = new com.jcraft.jsch.Packet(r5);
        r0.DW();
        r5.j6((byte) 98);
        r5.FH(r4.tp());
        r5.Hw(com.jcraft.jsch.Util.FH("env"));
        if (j6() == false) goto L5;
        int r6 = 1;
    L6:
        r5.j6((byte) r6);
        r5.Hw(this.Hw);
        r5.Hw(this.v5);
        j6(r0);
        return;
    L5:
        r6 = 0;
        goto L6
    }

    void j6(byte[] r1, byte[] r2) {
        this.Hw = r1;
        this.v5 = r2;
    }
}
