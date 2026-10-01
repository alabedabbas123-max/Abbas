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
        monitor-enter(this);
        if (r5 != null) goto L7;
        monitor-exit(this);
        return false;
    L7:
        int r1 = 0;
    L27:
    L22:
        th = move-exception;
        throw th;
    L9:
        if (r1 >= this.j6.size()) goto L10;
        com.jcraft.jsch.Identity r2 = (com.jcraft.jsch.Identity) this.j6.elementAt(r1);     // Catch: java.lang.Throwable -> L22
        byte[] r3 = r2.FH();     // Catch: java.lang.Throwable -> L22
        if (r3 == null) goto L21;
        if (com.jcraft.jsch.Util.j6(r5, r3) == false) goto L21;
        this.j6.removeElement(r2);     // Catch: java.lang.Throwable -> L22
        r2.clear();     // Catch: java.lang.Throwable -> L22
        monitor-exit(this);
        return true;
    L21:
        r1 = r1 + 1;
        goto L27
    L10:
        monitor-exit(this);
        return false;
    }

    @Override
    public synchronized java.util.Vector j6() {
        monitor-enter(this);
        java.util.Vector r0 = new java.util.Vector();     // Catch: java.lang.Throwable -> L10
        int r1 = 0;
    L5:
        if (r1 >= this.j6.size()) goto L6;
        r0.addElement(this.j6.elementAt(r1));     // Catch: java.lang.Throwable -> L10
        r1 = r1 + 1;
        goto L5
    L6:
        monitor-exit(this);
        return r0;
    L10:
        th = move-exception;
        throw th;
    }

    public synchronized void j6(com.jcraft.jsch.Identity r2) {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.j6.contains(r2) == true) goto L6;
        this.j6.addElement(r2);     // Catch: java.lang.Throwable -> L8
    L6:
        monitor-exit(this);
    }

    @Override
    public synchronized boolean j6(byte[] r4) {
        monitor-enter(this);
        com.jcraft.jsch.IdentityFile r5 = com.jcraft.jsch.IdentityFile.j6("from remote:", r4, null, this.DW);     // Catch: java.lang.Throwable -> L7 com.jcraft.jsch.JSchException -> L10
        this.j6.addElement(r5);     // Catch: java.lang.Throwable -> L7 com.jcraft.jsch.JSchException -> L10
    L5:
        monitor-exit(this);
        return true;
    L10:
        return false;
    L7:
        th = move-exception;
        throw th;
    }

    @Override
    public synchronized void removeAll() {
        monitor-enter(this);
        int r0 = 0;
    L16:
    L11:
        th = move-exception;
        throw th;
    L5:
        if (r0 >= this.j6.size()) goto L6;
        ((com.jcraft.jsch.Identity) this.j6.elementAt(r0)).clear();     // Catch: java.lang.Throwable -> L11
        r0 = r0 + 1;
        goto L16
    L6:
        this.j6.removeAllElements();     // Catch: java.lang.Throwable -> L11
        monitor-exit(this);
    }
}
