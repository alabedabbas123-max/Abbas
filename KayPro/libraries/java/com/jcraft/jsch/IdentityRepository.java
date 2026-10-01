package com.jcraft.jsch;

public interface IdentityRepository {

    public static class Wrapper implements com.jcraft.jsch.IdentityRepository {
        private java.util.Vector DW;
        private boolean FH;
        private com.jcraft.jsch.IdentityRepository j6;

        Wrapper(com.jcraft.jsch.IdentityRepository r2) {
            this(r2, false);
        }

        Wrapper(com.jcraft.jsch.IdentityRepository r2, boolean r3) {
            this.DW = new java.util.Vector();
            this.FH = false;
            this.j6 = r2;
            this.FH = r3;
        }

        void DW() {
            java.lang.Object[] r0 = null;
            int r1 = 0;
            com.jcraft.jsch.Identity r2 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (this.DW.size() <= 0) { $pc0 = 9; continue $sw0; }
                        r0 = this.DW.toArray();
                        r1 = 0;
                        $pc0 = 6; continue $sw0;
                    }
                    case 6: {
                        if (r1 >= r0.length) { $pc0 = 11; continue $sw0; }
                        r2 = (com.jcraft.jsch.Identity) r0[r1];
                        this.DW.removeElement(r2);
                        j6(r2);
                        r1 = r1 + 1;
                        { $pc0 = 6; continue $sw0; }
                    }
                    case 11: {
                        return;
                    }
                    case 9: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean DW(byte[] r2) {
            return this.j6.DW(r2);
        }

        @Override
        public java.util.Vector j6() {
            java.util.Vector r0 = null;
            int r1 = 0;
            int r2 = 0;
            java.util.Vector r3 = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = new java.util.Vector();
                        r1 = 0;
                        r2 = 0;
                        $pc1 = 4; continue $sw1;
                    }
                    case 4: {
                        if (r2 >= this.DW.size()) { $pc1 = 5; continue $sw1; }
                        r0.add((com.jcraft.jsch.Identity) this.DW.elementAt(r2));
                        r2 = r2 + 1;
                        { $pc1 = 4; continue $sw1; }
                    }
                    case 5: {
                        r3 = this.j6.j6();
                        $pc1 = 7; continue $sw1;
                    }
                    case 7: {
                        if (r1 >= r3.size()) { $pc1 = 8; continue $sw1; }
                        r0.add(r3.elementAt(r1));
                        r1 = r1 + 1;
                        { $pc1 = 7; continue $sw1; }
                    }
                    case 8: {
                        return r0;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        void j6(com.jcraft.jsch.Identity r2) {
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        if (this.FH == false) { $pc2 = 5; continue $sw2; }
                        $pc2 = 10; continue $sw2;
                    }
                    case 10: {
                        this.DW.addElement(r2);
                        return;
                    }
                    case 5: {
                        if (r2.DW() == true) { $pc2 = 10; continue $sw2; }
                        if ((r2 instanceof com.jcraft.jsch.IdentityFile) == false) { $pc2 = 10; continue $sw2; }
                        try {
                            this.j6.j6(((com.jcraft.jsch.IdentityFile) r2).Hw().DW());
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            if ($t instanceof com.jcraft.jsch.JSchException) { $pc2 = 12; continue $sw2; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        return;
                    }
                    case 12: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean j6(byte[] r2) {
            return this.j6.j6(r2);
        }

        @Override
        public void removeAll() {
            this.DW.removeAllElements();
            this.j6.removeAll();
        }
    }

    boolean DW(byte[] r1);

    java.util.Vector j6();

    boolean j6(byte[] r1);

    void removeAll();
}
