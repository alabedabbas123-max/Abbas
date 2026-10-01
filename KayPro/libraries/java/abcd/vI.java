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
            this.Zo = r2;
            this.DW = r4;
            this.j6 = (com.jcraft.jsch.ChannelExec) abcd.vI.j6(r2).FH("exec");     // Catch: com.jcraft.jsch.JSchException -> L12
            this.j6.DW(r3);     // Catch: com.jcraft.jsch.JSchException -> L12
            DW();     // Catch: com.jcraft.jsch.JSchException -> L12
            com.jcraft.jsch.ChannelExec r5 = this.j6;     // Catch: com.jcraft.jsch.JSchException -> L12
            if (this.DW <= 0) goto L6;
            int r6 = this.DW * 1000;     // Catch: com.jcraft.jsch.JSchException -> L12
        L7:
            r5.j6(r6);     // Catch: com.jcraft.jsch.JSchException -> L12
            if (this.j6.J0() == false) goto L11;
            return;
        L11:
            throw new abcd.yD(abcd.vI.DW(r2), "connection failed");     // Catch: com.jcraft.jsch.JSchException -> L12
        L6:
            r6 = 0;
        L12:
            e = move-exception;
            throw new abcd.yD(abcd.vI.DW(r2), e.getMessage(), e);
        }

        a(abcd.vI r1, java.lang.String r2, int r3, abcd.vI.a r4) {
            this(r1, r2, r3);
        }

        private void DW() {
            this.FH = this.j6.gn();
            java.io.OutputStream r0 = this.j6.u7();
            if (this.DW > 0) goto L5;
            this.Hw = r0;
        L6:
            this.v5 = this.j6.aM();
            return;
        L5:
            java.io.PipedInputStream r1 = new java.io.PipedInputStream();
            abcd.YK r2 = new abcd.YK(r1, r0);
            abcd.uI r3 = new abcd.uI(this, r1, r2);
            r2.start();
            this.Hw = r3;
            goto L6
        }

        static int j6(abcd.vI.a r0) {
            return r0.DW;
        }

        private boolean j6() {
            if (this.j6.Zo() < 0) goto L5;
            return false;
        L5:
            if (this.j6.J0() == false) goto L10;
            return true;
        L10:
            return false;
        }

        @Override
        public void destroy() {
            if (this.j6.J0() == false) goto L6;
            this.j6.DW();
            return;
        }

        @Override
        public int exitValue() {
            if (j6() == true) goto L7;
            return this.j6.Zo();
        L7:
            throw new java.lang.IllegalStateException();
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
        L3:
            if (j6() == false) goto L5;
            java.lang.Thread.sleep(100);
            goto L3
        L5:
            return exitValue();
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
        if (this.j6.tp() == false) goto L6;
        this.j6.j6();
        return;
    }

    public com.jcraft.jsch.Channel j6() {
        return this.j6.FH("sftp");
    }

    @Override
    public java.lang.Process j6(java.lang.String r3, int r4) {
        return new abcd.vI.a(this, r3, r4, null);
    }
}
