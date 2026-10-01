package com.jcraft.jsch;

public class HostKey {
    private static final byte[] DW = null;
    private static final byte[] j6 = null;
    protected java.lang.String FH;
    protected java.lang.String Hw;
    protected java.lang.String VH;
    protected byte[] Zo;
    protected int v5;

    static {
        j6 = com.jcraft.jsch.Util.FH("ssh-dss");
        DW = com.jcraft.jsch.Util.FH("ssh-rsa");
    }

    public HostKey(java.lang.String r2, int r3, byte[] r4) {
        this(r2, r3, r4, null);
    }

    public HostKey(java.lang.String r7, int r8, byte[] r9, java.lang.String r10) {
        this("", r7, r8, r9, r10);
    }

    public HostKey(java.lang.String r1, java.lang.String r2, int r3, byte[] r4, java.lang.String r5) {
        this.FH = r1;
        this.Hw = r2;
        if (r3 == 0) goto L5;
        this.v5 = r3;
    L13:
        this.Zo = r4;
        this.VH = r5;
        return;
    L5:
        if (r4[8] != 100) goto L8;
        this.v5 = 1;
        goto L13
    L8:
        if (r4[8] != 114) goto L11;
        this.v5 = 2;
        goto L13
    L11:
        throw new com.jcraft.jsch.JSchException("invalid key type");
    }

    public HostKey(java.lang.String r2, byte[] r3) {
        this(r2, 0, r3);
    }

    private boolean DW(java.lang.String r12) {
        java.lang.String r6 = this.Hw;
        int r7 = r6.length();
        int r8 = r12.length();
        int r2 = 0;
    L3:
        if (r2 >= r7) goto L4;
        int r10 = r6.indexOf(44, r2);
        if (r10 == (-1)) goto L8;
        if (r8 != (r10 - r2)) goto L18;
        if (r6.regionMatches(true, r2, r12, 0, r8) == false) goto L18;
        return true;
    L18:
        r2 = r10 + 1;
        goto L3
    L8:
        if (r8 == (r7 - r2)) goto L11;
        return false;
    L11:
        return r6.regionMatches(true, r2, r12, 0, r8);
    L4:
        return false;
    }

    public java.lang.String DW() {
        return this.Hw;
    }

    public java.lang.String FH() {
        byte[] r0 = this.Zo;
        return com.jcraft.jsch.Util.j6(com.jcraft.jsch.Util.FH(r0, 0, r0.length));
    }

    public java.lang.String Hw() {
        return this.FH;
    }

    public java.lang.String j6() {
        return this.VH;
    }

    boolean j6(java.lang.String r1) {
        return DW(r1);
    }

    public java.lang.String v5() {
        int r0 = this.v5;
        if (r0 != 1) goto L7;
        return com.jcraft.jsch.Util.j6(j6);
    L7:
        if (r0 == 2) goto L9;
        return "UNKNOWN";
    L9:
        return com.jcraft.jsch.Util.j6(DW);
    }
}
