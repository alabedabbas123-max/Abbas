package abcd;

public class vI implements abcd.ZI {
    private final abcd.HJ DW;
    private final com.jcraft.jsch.Session j6;

    private class a extends java.lang.Process {
        private final int DW;
        private java.io.InputStream FH;
        private java.io.OutputStream Hw;
        final abcd.vI Zo;
        private com.jcraft.jsch.ChannelExec j6;
        private java.io.InputStream v5;

        private a(abcd.vI r2, java.lang.String r3, int r4) {
            com.jcraft.jsch.ChannelExec r5 = null;
            int r6 = 0;
            java.lang.Throwable e = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        this.Zo = r2;
                        this.DW = r4;
                        try {
                            this.j6 = (com.jcraft.jsch.ChannelExec) abcd.vI.j6(r2).FH("exec");
                            this.j6.DW(r3);
                            DW();
                            r5 = this.j6;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof com.jcraft.jsch.JSchException) { $pc0 = 12; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        if (this.DW <= 0) { $pc0 = 6; continue $sw0; }
                        try {
                            r6 = this.DW * 1000;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof com.jcraft.jsch.JSchException) { $pc0 = 12; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        $pc0 = 7; continue $sw0;
                    }
                    case 7: {
                        try {
                            r5.j6(r6);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof com.jcraft.jsch.JSchException) { $pc0 = 12; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        if (this.j6.J0() == false) { $pc0 = 11; continue $sw0; }
                        return;
                    }
                    case 11: {
                        try {
                            throw new abcd.yD(abcd.vI.DW(r2), "connection failed");
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof com.jcraft.jsch.JSchException) { $pc0 = 12; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                    }
                    case 6: {
                        r6 = 0;
                        return;
                    }
                    case 12: {
                        e = $ex0;
                        throw new abcd.yD(abcd.vI.DW(r2), e.getMessage(), e);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        a(abcd.vI r1, java.lang.String r2, int r3, abcd.vI.a r4) {
            this(r1, r2, r3);
        }

        private void DW() {
            java.io.OutputStream r0 = null;
            java.io.PipedInputStream r1 = null;
            abcd.YK r2 = null;
            abcd.uI r3 = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        this.FH = this.j6.gn();
                        r0 = this.j6.u7();
                        if (this.DW > 0) { $pc1 = 5; continue $sw1; }
                        this.Hw = r0;
                        $pc1 = 6; continue $sw1;
                    }
                    case 6: {
                        this.v5 = this.j6.aM();
                        return;
                    }
                    case 5: {
                        r1 = new java.io.PipedInputStream();
                        r2 = new abcd.YK(r1, r0);
                        r3 = new abcd.uI(this, r1, r2);
                        r2.start();
                        this.Hw = r3;
                        { $pc1 = 6; continue $sw1; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        static int j6(abcd.vI.a r0) {
            return r0.DW;
        }

        private boolean j6() {
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        if (this.j6.Zo() < 0) { $pc2 = 5; continue $sw2; }
                        return false;
                    }
                    case 5: {
                        if (this.j6.J0() == false) { $pc2 = 10; continue $sw2; }
                        return true;
                    }
                    case 10: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void destroy() {
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        if (this.j6.J0() == false) { $pc3 = 6; continue $sw3; }
                        this.j6.DW();
                        return;
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public int exitValue() {
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        if (j6() == true) { $pc4 = 7; continue $sw4; }
                        return this.j6.Zo();
                    }
                    case 7: {
                        throw new java.lang.IllegalStateException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public java.io.InputStream getErrorStream() {
            return this.v5;
        }

        @Override
        public java.io.InputStream getInputStream() {
            return this.FH;
        }

        @Override
        public java.io.OutputStream getOutputStream() {
            return this.Hw;
        }

        @Override
        public int waitFor() {
            java.lang.Throwable $ex5 = null;
            int $pc5 = 3;
            $sw5: while (true) {
                switch ($pc5) {
                    case 3: {
                        if (j6() == false) { $pc5 = 5; continue $sw5; }
                        java.lang.Thread.sleep(100);
                        { $pc5 = 3; continue $sw5; }
                    }
                    case 5: {
                        return exitValue();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public vI(com.jcraft.jsch.Session r1, abcd.HJ r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    static abcd.HJ DW(abcd.vI r0) {
        return r0.DW;
    }

    static com.jcraft.jsch.Session j6(abcd.vI r0) {
        return r0.j6;
    }

    @Override
    public void disconnect() {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (this.j6.tp() == false) { $pc6 = 6; continue $sw6; }
                    this.j6.j6();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public com.jcraft.jsch.Channel j6() {
        return this.j6.FH("sftp");
    }

    @Override
    public java.lang.Process j6(java.lang.String r3, int r4) {
        return new abcd.vI.a(this, r3, r4, null);
    }
}
