package com.jcraft.jsch;

class LocalIdentityRepository implements com.jcraft.jsch.IdentityRepository {
    private com.jcraft.jsch.JSch DW;
    private java.util.Vector j6;

    LocalIdentityRepository(com.jcraft.jsch.JSch r2) {
        this.j6 = new java.util.Vector();
        this.DW = r2;
    }

    @Override
    public synchronized boolean DW(byte[] r5) {
        synchronized (this) {
            int r1 = 0;
            com.jcraft.jsch.Identity r2 = null;
            byte[] r3 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (r5 != null) { $pc0 = 7; continue $sw0; }
                        return false;
                    }
                    case 7: {
                        r1 = 0;
                        $pc0 = 27; continue $sw0;
                    }
                    case 27: {
                        $pc0 = 9; continue $sw0;
                    }
                    case 22: {
                        th = $ex0;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 9: {
                        if (r1 >= this.j6.size()) { $pc0 = 10; continue $sw0; }
                        try {
                            r2 = (com.jcraft.jsch.Identity) this.j6.elementAt(r1);
                            r3 = r2.FH();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 22; continue $sw0;
                        }
                        if (r3 == null) { $pc0 = 21; continue $sw0; }
                        if (com.jcraft.jsch.Util.j6(r5, r3) == false) { $pc0 = 21; continue $sw0; }
                        try {
                            this.j6.removeElement(r2);
                            r2.clear();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 22; continue $sw0;
                        }
                        return true;
                    }
                    case 21: {
                        r1 = r1 + 1;
                        { $pc0 = 27; continue $sw0; }
                    }
                    case 10: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    @Override
    public synchronized java.util.Vector j6() {
        synchronized (this) {
            java.util.Vector r0 = null;
            int r1 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        try {
                            r0 = new java.util.Vector();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 10; continue $sw1;
                        }
                        r1 = 0;
                        $pc1 = 5; continue $sw1;
                    }
                    case 5: {
                        if (r1 >= this.j6.size()) { $pc1 = 6; continue $sw1; }
                        try {
                            r0.addElement(this.j6.elementAt(r1));
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 10; continue $sw1;
                        }
                        r1 = r1 + 1;
                        { $pc1 = 5; continue $sw1; }
                    }
                    case 6: {
                        return r0;
                    }
                    case 10: {
                        th = $ex1;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public synchronized void j6(com.jcraft.jsch.Identity r2) {
        synchronized (this) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        $pc2 = 4; continue $sw2;
                    }
                    case 8: {
                        th = $ex2;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (this.j6.contains(r2) == true) { $pc2 = 6; continue $sw2; }
                        try {
                            this.j6.addElement(r2);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 8; continue $sw2;
                        }
                        $pc2 = 6; continue $sw2;
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    @Override
    public synchronized boolean j6(byte[] r4) {
        synchronized (this) {
            com.jcraft.jsch.IdentityFile r5 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        try {
                            r5 = com.jcraft.jsch.IdentityFile.j6("from remote:", r4, null, this.DW);
                            this.j6.addElement(r5);
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            if ($t instanceof com.jcraft.jsch.JSchException) { $pc3 = 10; continue $sw3; }
                            $pc3 = 7; continue $sw3;
                        }
                        $pc3 = 5; continue $sw3;
                    }
                    case 5: {
                        return true;
                    }
                    case 10: {
                        return false;
                    }
                    case 7: {
                        th = $ex3;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    @Override
    public synchronized void removeAll() {
        synchronized (this) {
            int r0 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        r0 = 0;
                        $pc4 = 16; continue $sw4;
                    }
                    case 16: {
                        $pc4 = 5; continue $sw4;
                    }
                    case 11: {
                        th = $ex4;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 5: {
                        if (r0 >= this.j6.size()) { $pc4 = 6; continue $sw4; }
                        try {
                            ((com.jcraft.jsch.Identity) this.j6.elementAt(r0)).clear();
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 11; continue $sw4;
                        }
                        r0 = r0 + 1;
                        { $pc4 = 16; continue $sw4; }
                    }
                    case 6: {
                        try {
                            this.j6.removeAllElements();
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 11; continue $sw4;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
