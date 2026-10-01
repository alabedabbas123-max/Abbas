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
        com.jcraft.jsch.Session r0 = null;
        boolean r1 = false;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = EQ();
                    try {
                        XL();
                        new com.jcraft.jsch.RequestExec(this.KD).j6(r0, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 11; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.EQ.j6 == null) { $pc0 = 20; continue $sw0; }
                    this.we = new java.lang.Thread(this);
                    this.we.setName("Exec thread " + r0.DW());
                    r1 = r0.x9;
                    if (r1 == false) { $pc0 = 9; continue $sw0; }
                    this.we.setDaemon(r1);
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    this.we.start();
                    return;
                }
                case 20: {
                    return;
                }
                case 11: {
                    e = $ex0;
                    if ((e instanceof com.jcraft.jsch.JSchException) == true) { $pc0 = 17; continue $sw0; }
                    throw new com.jcraft.jsch.JSchException("ChannelExec", e);
                }
                case 17: {
                    throw ((com.jcraft.jsch.JSchException) e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
