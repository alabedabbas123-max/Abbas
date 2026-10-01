package com.jcraft.jsch;

public abstract class KeyExchange {
    protected com.jcraft.jsch.HASH DW;
    protected byte[] FH;
    protected byte[] Hw;
    protected com.jcraft.jsch.Session j6;
    protected byte[] v5;

    public KeyExchange() {
        this.j6 = null;
        this.DW = null;
        this.FH = null;
        this.Hw = null;
        this.v5 = null;
    }

    protected static java.lang.String[] j6(byte[] r14, byte[] r15) {
        java.lang.String[] r1 = new java.lang.String[10];
        com.jcraft.jsch.Buffer r2 = new com.jcraft.jsch.Buffer(r14);
        r2.Hw(17);
        com.jcraft.jsch.Buffer r3 = new com.jcraft.jsch.Buffer(r15);
        r3.Hw(17);
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L11;
        int r16 = 0;
    L5:
        if (r16 >= 10) goto L6;
        com.jcraft.jsch.JSch.v5().j6(1, "kex: server: " + com.jcraft.jsch.Util.j6(r2.tp()));
        r16 = r16 + 1;
        goto L5
    L6:
        int r17 = 0;
    L7:
        if (r17 >= 10) goto L8;
        com.jcraft.jsch.JSch.v5().j6(1, "kex: client: " + com.jcraft.jsch.Util.j6(r3.tp()));
        r17 = r17 + 1;
        goto L7
    L8:
        r2.Hw(17);
        r3.Hw(17);
    L11:
        int r18 = 0;
    L12:
        if (r18 >= 10) goto L14;
        byte[] r19 = r2.tp();
        byte[] r6 = r3.tp();
        int r7 = 0;
        int r8 = 0;
    L19:
        if (r7 >= r6.length) goto L44;
    L22:
        if (r7 >= r6.length) goto L27;
        if (r6[r7] == 44) goto L27;
        r7 = r7 + 1;
    L27:
        if (r8 == r7) goto L28;
        java.lang.String r9 = com.jcraft.jsch.Util.j6(r6, r8, r7 - r8);
        int r10 = 0;
        int r12 = 0;
    L31:
        if (r10 >= r19.length) goto L32;
    L34:
        if (r10 >= r19.length) goto L39;
        if (r19[r10] == 44) goto L39;
        r10 = r10 + 1;
    L39:
        if (r12 == r10) goto L40;
        if (r9.equals(com.jcraft.jsch.Util.j6(r19, r12, r10 - r12)) == true) goto L43;
        r12 = r10 + 1;
        r10 = r12;
        goto L31
    L43:
        r1[r18] = r9;
        goto L44
    L40:
        return null;
    L32:
        r8 = r7 + 1;
        r7 = r8;
        goto L19
    L28:
        return null;
    L44:
        if (r7 != 0) goto L47;
        r1[r18] = "";
    L49:
        r18 = r18 + 1;
        goto L12
    L47:
        if (r1[r18] != null) goto L49;
        return null;
    L14:
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L16;
        com.jcraft.jsch.JSch.v5().j6(1, "kex: server->client " + r1[3] + " " + r1[5] + " " + r1[7]);
        com.jcraft.jsch.JSch.v5().j6(1, "kex: client->server " + r1[2] + " " + r1[4] + " " + r1[6]);
    L16:
        return r1;
    }

    byte[] DW() {
        return this.Hw;
    }

    com.jcraft.jsch.HASH FH() {
        return this.DW;
    }

    byte[] Hw() {
        return this.v5;
    }

    public abstract int VH();

    public abstract java.lang.String Zo();

    public java.lang.String j6() {
        com.jcraft.jsch.HASH r0 = (com.jcraft.jsch.HASH) java.lang.Class.forName(this.j6.DW("md5")).newInstance();     // Catch: java.lang.Exception -> L4
    L7:
        return com.jcraft.jsch.Util.j6(r0, Hw());
    L4:
        e = move-exception;
        java.lang.System.err.println("getFingerPrint: " + e);
        r0 = null;
        goto L7
    }

    public abstract void j6(com.jcraft.jsch.Session r1, byte[] r2, byte[] r3, byte[] r4, byte[] r5);

    public abstract boolean j6(com.jcraft.jsch.Buffer r1);

    protected byte[] j6(byte[] r5) {
        if (r5.length > 1) goto L5;
        return r5;
    L5:
        if (r5[0] == 0) goto L7;
        return r5;
    L7:
        if ((r5[1] & 128) != 0) goto L12;
        byte[] r2 = new byte[r5.length - 1];
        java.lang.System.arraycopy(r5, 1, r2, 0, r2.length);
        return j6(r2);
    L12:
        return r5;
    }

    byte[] v5() {
        return this.FH;
    }
}
