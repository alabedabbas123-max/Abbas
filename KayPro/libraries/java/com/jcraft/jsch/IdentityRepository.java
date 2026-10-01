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
            if (this.DW.size() <= 0) goto L9;
            java.lang.Object[] r0 = this.DW.toArray();
            int r1 = 0;
        L6:
            if (r1 >= r0.length) goto L11;
            com.jcraft.jsch.Identity r2 = (com.jcraft.jsch.Identity) r0[r1];
            this.DW.removeElement(r2);
            j6(r2);
            r1 = r1 + 1;
            goto L6
        L11:
            return;
        }

        @Override
        public boolean DW(byte[] r2) {
            return this.j6.DW(r2);
        }

        @Override
        public java.util.Vector j6() {
            java.util.Vector r0 = new java.util.Vector();
            int r1 = 0;
            int r2 = 0;
        L4:
            if (r2 >= this.DW.size()) goto L5;
            r0.add((com.jcraft.jsch.Identity) this.DW.elementAt(r2));
            r2 = r2 + 1;
            goto L4
        L5:
            java.util.Vector r3 = this.j6.j6();
        L7:
            if (r1 >= r3.size()) goto L8;
            r0.add(r3.elementAt(r1));
            r1 = r1 + 1;
            goto L7
        L8:
            return r0;
        }

        void j6(com.jcraft.jsch.Identity r2) {
            if (this.FH == false) goto L5;
        L10:
            this.DW.addElement(r2);
            return;
        L5:
            if (r2.DW() == true) goto L10;
            if ((r2 instanceof com.jcraft.jsch.IdentityFile) == false) goto L10;
            this.j6.j6(((com.jcraft.jsch.IdentityFile) r2).Hw().DW());     // Catch: com.jcraft.jsch.JSchException -> L12
            return;
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
