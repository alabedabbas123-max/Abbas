package com.jcraft.jsch;

public class UserAuthGSSAPIWithMIC extends com.jcraft.jsch.UserAuth {
    private static final java.lang.String[] Zo = null;
    private static final byte[][] v5 = null;

    static {
        v5 = new byte[][]{new byte[]{6, 9, 42, -122, 72, -122, -9, 18, 1, 2, 2}};
        Zo = new java.lang.String[]{"gssapi-with-mic.krb5"};
    }

    public UserAuthGSSAPIWithMIC() {
    }

    @Override
    public boolean j6(com.jcraft.jsch.Session r12) {
        super.j6(r12);
        byte[] r0 = com.jcraft.jsch.Util.FH(this.Hw);
        this.DW.DW();
        this.FH.j6((byte) 50);
        this.FH.Hw(r0);
        this.FH.Hw(com.jcraft.jsch.Util.FH("ssh-connection"));
        this.FH.Hw(com.jcraft.jsch.Util.FH("gssapi-with-mic"));
        this.FH.FH(v5.length);
        int r5 = 0;
    L3:
        byte[][] r6 = v5;
        if (r5 >= r6.length) goto L5;
        this.FH.Hw(r6[r5]);
        r5 = r5 + 1;
        goto L3
    L5:
        r12.DW(this.DW);
        java.lang.String r7 = null;
    L6:
        this.FH = r12.j6(this.FH);
        int r8 = this.FH.DW() & 255;
        if (r8 == 51) goto L8;
        if (r8 == 60) goto L11;
        if (r8 != 53) goto L60;
        this.FH.FH();
        this.FH.j6();
        this.FH.j6();
        byte[] r9 = this.FH.tp();
        this.FH.tp();
        java.lang.String r10 = com.jcraft.jsch.Util.j6(r9);
        com.jcraft.jsch.UserInfo r11 = this.j6;
        if (r11 == null) goto L6;
        r11.DW(r10);
        goto L6
    L60:
        return false;
    L11:
        this.FH.FH();
        this.FH.j6();
        this.FH.j6();
        byte[] r13 = this.FH.tp();
        int r14 = 0;
    L12:
        byte[][] r15 = v5;
        if (r14 >= r15.length) goto L18;
        if (com.jcraft.jsch.Util.j6(r13, r15[r14]) == true) goto L17;
        r14 = r14 + 1;
        goto L12
    L17:
        r7 = Zo[r14];
    L18:
        if (r7 != null) goto L62;
        return false;
    L62:
        com.jcraft.jsch.GSSContext r16 = (com.jcraft.jsch.GSSContext) java.lang.Class.forName(r12.DW(r7)).newInstance();     // Catch: java.lang.Throwable -> L53
        r16.j6(this.Hw, r12.lp);
        byte[] r17 = new byte[0];
    L23:
        if (r16.DW() == true) goto L24;
        r17 = r16.j6(r17, 0, r17.length);     // Catch: java.lang.Throwable -> L53
        if (r17 == null) goto L42;
        this.DW.DW();
        this.FH.j6((byte) 61);
        this.FH.Hw(r17);
        r12.DW(this.DW);
    L42:
        if (r16.DW() == true) goto L23;
        this.FH = r12.j6(this.FH);
        int r18 = this.FH.DW() & 255;
        if (r18 != 64) goto L48;
        this.FH = r12.j6(this.FH);
        byte r19 = this.FH.DW();
    L46:
        r18 = r19 & 255;
    L50:
        if (r18 == 51) goto L51;
        this.FH.FH();
        this.FH.j6();
        this.FH.j6();
        r17 = this.FH.tp();
        goto L23
    L51:
        return false;
    L48:
        if (r18 != 65) goto L50;
        this.FH = r12.j6(this.FH);
        r19 = this.FH.DW();
        goto L46
    L24:
        com.jcraft.jsch.Buffer r20 = new com.jcraft.jsch.Buffer();
        r20.Hw(r12.Zo());
        r20.j6((byte) 50);
        r20.Hw(r0);
        r20.Hw(com.jcraft.jsch.Util.FH("ssh-connection"));
        r20.Hw(com.jcraft.jsch.Util.FH("gssapi-with-mic"));
        byte[] r1 = r16.DW(r20.DW, 0, r20.Hw());
        if (r1 != null) goto L27;
        return false;
    L27:
        this.DW.DW();
        this.FH.j6((byte) 66);
        this.FH.Hw(r1);
        r12.DW(this.DW);
        r16.j6();
        this.FH = r12.j6(this.FH);
        int r110 = this.FH.DW() & 255;
        if (r110 != 52) goto L31;
        return true;
    L31:
        if (r110 != 51) goto L37;
        this.FH.FH();
        this.FH.j6();
        this.FH.j6();
        byte[] r111 = this.FH.tp();
        if (this.FH.j6() == 0) goto L37;
        throw new com.jcraft.jsch.JSchPartialAuthException(com.jcraft.jsch.Util.j6(r111));
    L37:
        return false;
    L53:
        return false;
    L8:
        return false;
    }
}
