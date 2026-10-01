package com.jcraft.jsch;

public class ChannelExec extends com.jcraft.jsch.ChannelSession {
    byte[] KD;

    public ChannelExec() {
        this.KD = new byte[0];
    }

    public void DW(java.lang.String r1) {
        this.KD = com.jcraft.jsch.Util.FH(r1);
    }

    @Override
    public void DW(boolean r1) {
        super.DW(r1);
    }

    @Override
    public void QX() {
        com.jcraft.jsch.Session r0 = EQ();
        XL();     // Catch: java.lang.Exception -> L11
        new com.jcraft.jsch.RequestExec(this.KD).j6(r0, this);     // Catch: java.lang.Exception -> L11
        if (this.EQ.j6 == null) goto L20;
        this.we = new java.lang.Thread(this);
        this.we.setName("Exec thread " + r0.DW());
        boolean r1 = r0.x9;
        if (r1 == false) goto L9;
        this.we.setDaemon(r1);
    L9:
        this.we.start();
        return;
    L20:
        return;
    L11:
        e = move-exception;
        if ((e instanceof com.jcraft.jsch.JSchException) == true) goto L17;
        throw new com.jcraft.jsch.JSchException("ChannelExec", e);
    L17:
        throw ((com.jcraft.jsch.JSchException) e);
    }

    public java.io.InputStream aM() {
        return VH();
    }

    @Override
    public void j6(boolean r1) {
        super.j6(r1);
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    void we() {
        this.EQ.j6(EQ().ro);
        this.EQ.DW(EQ().cn);
    }
}
