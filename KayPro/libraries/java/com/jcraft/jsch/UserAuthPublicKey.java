package com.jcraft.jsch;

class UserAuthPublicKey extends com.jcraft.jsch.UserAuth {
    UserAuthPublicKey() {
    }

    @Override
    public boolean j6(com.jcraft.jsch.Session r17) {
        synchronized (this) {
            java.util.Vector r2 = null;
            byte[] r3 = null;
            int r5 = 0;
            com.jcraft.jsch.Identity r6 = null;
            byte[] r7 = null;
            int r11 = 0;
            byte[] r12 = null;
            java.lang.String r13 = null;
            int r14 = 0;
            byte[] r15 = null;
            byte[] r8 = null;
            int r10 = 0;
            int r16 = 0;
            byte[] r18 = null;
            byte[] r9 = null;
            int r19 = 0;
            byte[] r20 = null;
            java.lang.String r21 = null;
            byte[] r22 = null;
            java.lang.String r110 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        super.j6(r17);
                        r2 = r17.Hw().j6();
                        $pc0 = 5; continue $sw0;
                    }
                    case 88: {
                        th = $ex0;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 5: {
                        if (r2.size() > 0) { $pc0 = 8; continue $sw0; }
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        return false;
                    }
                    case 8: {
                        try {
                            r3 = com.jcraft.jsch.Util.FH(this.Hw);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        r5 = 0;
                        $pc0 = 10; continue $sw0;
                    }
                    case 10: {
                        if (r5 >= r2.size()) { $pc0 = 69; continue $sw0; }
                        if (r17.aj >= r17.sy) { $pc0 = 14; continue $sw0; }
                        try {
                            r6 = (com.jcraft.jsch.Identity) r2.elementAt(r5);
                            r7 = r6.FH();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        if (r7 == null) { $pc0 = 30; continue $sw0; }
                        try {
                            this.DW.DW();
                            this.FH.j6((byte) 50);
                            this.FH.Hw(r3);
                            this.FH.Hw(com.jcraft.jsch.Util.FH("ssh-connection"));
                            this.FH.Hw(com.jcraft.jsch.Util.FH("publickey"));
                            this.FH.j6((byte) 0);
                            this.FH.Hw(com.jcraft.jsch.Util.FH(r6.j6()));
                            this.FH.Hw(r7);
                            r17.DW(this.DW);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        $pc0 = 19; continue $sw0;
                    }
                    case 19: {
                        try {
                            this.FH = r17.j6(this.FH);
                            r11 = this.FH.DW() & 255;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        if (r11 == 60) { $pc0 = 28; continue $sw0; }
                        if (r11 == 51) { $pc0 = 28; continue $sw0; }
                        if (r11 != 53) { $pc0 = 28; continue $sw0; }
                        try {
                            this.FH.FH();
                            this.FH.j6();
                            this.FH.j6();
                            r12 = this.FH.tp();
                            this.FH.tp();
                            r13 = com.jcraft.jsch.Util.j6(r12);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        if (this.j6 == null) { $pc0 = 19; continue $sw0; }
                        try {
                            this.j6.DW(r13);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        $pc0 = 28; continue $sw0;
                    }
                    case 28: {
                        if (r11 == 60) { $pc0 = 30; continue $sw0; }
                        $pc0 = 87; continue $sw0;
                    }
                    case 87: {
                        try {
                            r5 = r5 + 1;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        $pc0 = 30; continue $sw0;
                    }
                    case 30: {
                        r14 = 5;
                        $pc0 = 32; continue $sw0;
                    }
                    case 32: {
                        if (r6.DW() == true) { $pc0 = 34; continue $sw0; }
                        $pc0 = 47; continue $sw0;
                    }
                    case 47: {
                        r15 = null;
                        $pc0 = 49; continue $sw0;
                    }
                    case 49: {
                        if (r6.DW() == false) { $pc0 = 52; continue $sw0; }
                        if (r15 != null) { $pc0 = 52; continue $sw0; }
                        $pc0 = 57; continue $sw0;
                    }
                    case 57: {
                        try {
                            com.jcraft.jsch.Util.DW(r15);
                            r14 = r14 - 1;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        if (r14 != 0) { $pc0 = 32; continue $sw0; }
                        r15 = null;
                        $pc0 = 60; continue $sw0;
                    }
                    case 60: {
                        try {
                            com.jcraft.jsch.Util.DW(r15);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        if (r6.DW() == true) { $pc0 = 87; continue $sw0; }
                        if (r7 != null) { $pc0 = 65; continue $sw0; }
                        try {
                            r7 = r6.FH();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        $pc0 = 65; continue $sw0;
                    }
                    case 65: {
                        if (r7 == null) { $pc0 = 87; continue $sw0; }
                        try {
                            this.DW.DW();
                            this.FH.j6((byte) 50);
                            this.FH.Hw(r3);
                            this.FH.Hw(com.jcraft.jsch.Util.FH("ssh-connection"));
                            this.FH.Hw(com.jcraft.jsch.Util.FH("publickey"));
                            this.FH.j6((byte) 1);
                            this.FH.Hw(com.jcraft.jsch.Util.FH(r6.j6()));
                            this.FH.Hw(r7);
                            r8 = r17.Zo();
                            r10 = r8.length;
                            r16 = r10 + 4;
                            r18 = new byte[(this.FH.FH + r16) - 5];
                            r18[0] = (byte) (r10 >>> 24);
                            r18[1] = (byte) (r10 >>> 16);
                            r18[2] = (byte) (r10 >>> 8);
                            r18[3] = (byte) r10;
                            java.lang.System.arraycopy(r8, 0, r18, 4, r10);
                            java.lang.System.arraycopy(this.FH.DW, 5, r18, r16, this.FH.FH - 5);
                            r9 = r6.DW(r18);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        if (r9 == null) { $pc0 = 69; continue $sw0; }
                        try {
                            this.FH.Hw(r9);
                            r17.DW(this.DW);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        $pc0 = 72; continue $sw0;
                    }
                    case 72: {
                        try {
                            this.FH = r17.j6(this.FH);
                            r19 = this.FH.DW() & 255;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        if (r19 == 52) { $pc0 = 74; continue $sw0; }
                        if (r19 != 53) { $pc0 = 81; continue $sw0; }
                        try {
                            this.FH.FH();
                            this.FH.j6();
                            this.FH.j6();
                            r20 = this.FH.tp();
                            this.FH.tp();
                            r21 = com.jcraft.jsch.Util.j6(r20);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        if (this.j6 == null) { $pc0 = 72; continue $sw0; }
                        try {
                            this.j6.DW(r21);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        { $pc0 = 72; continue $sw0; }
                    }
                    case 81: {
                        if (r19 != 51) { $pc0 = 87; continue $sw0; }
                        try {
                            this.FH.FH();
                            this.FH.j6();
                            this.FH.j6();
                            r22 = this.FH.tp();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        if (this.FH.j6() != 0) { $pc0 = 86; continue $sw0; }
                        try {
                            r17.aj++;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        { $pc0 = 87; continue $sw0; }
                    }
                    case 86: {
                        try {
                            throw new com.jcraft.jsch.JSchPartialAuthException(com.jcraft.jsch.Util.j6(r22));
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                    }
                    case 74: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        return true;
                    }
                    case 52: {
                        if (r6.j6(r15) == false) { $pc0 = 57; continue $sw0; }
                        if (r15 == null) { $pc0 = 60; continue $sw0; }
                        if ((r17.Hw() instanceof com.jcraft.jsch.IdentityRepository.Wrapper) == false) { $pc0 = 60; continue $sw0; }
                        try {
                            ((com.jcraft.jsch.IdentityRepository.Wrapper) r17.Hw()).DW();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        { $pc0 = 60; continue $sw0; }
                    }
                    case 34: {
                        if (this.j6 == null) { $pc0 = 46; continue $sw0; }
                        if (r6.DW() == true) { $pc0 = 38; continue $sw0; }
                        $pc0 = 42; continue $sw0;
                    }
                    case 42: {
                        try {
                            r110 = this.j6.j6();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        if (r110 == null) { $pc0 = 47; continue $sw0; }
                        try {
                            r15 = com.jcraft.jsch.Util.FH(r110);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        { $pc0 = 49; continue $sw0; }
                    }
                    case 38: {
                        if (this.j6.FH("Passphrase for " + r6.getName()) == true) { $pc0 = 42; continue $sw0; }
                        try {
                            throw new com.jcraft.jsch.JSchAuthCancelException("publickey");
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                    }
                    case 46: {
                        try {
                            throw new com.jcraft.jsch.JSchException("USERAUTH fail");
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                    }
                    case 14: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        return false;
                    }
                    case 69: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 88; continue $sw0;
                        }
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
