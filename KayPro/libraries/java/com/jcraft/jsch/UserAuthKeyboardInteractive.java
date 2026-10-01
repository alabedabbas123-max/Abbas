package com.jcraft.jsch;

class UserAuthKeyboardInteractive extends com.jcraft.jsch.UserAuth {
    UserAuthKeyboardInteractive() {
    }

    @Override
    public boolean j6(com.jcraft.jsch.Session r18) {
        super.j6(r18);
        com.jcraft.jsch.UserInfo r2 = this.j6;
        if (r2 != null) goto L5;
    L7:
        java.lang.String r3 = java.lang.String.valueOf(this.Hw) + "@" + r18.lp;
        if (r18.br == 22) goto L10;
        r3 = java.lang.String.valueOf(r3) + ":" + r18.br;
    L10:
        byte[] r4 = r18.kQ;
        byte[] r10 = com.jcraft.jsch.Util.FH(this.Hw);
        boolean r5 = false;
    L12:
        if (r18.aj >= r18.sy) goto L13;
        this.DW.DW();
        this.FH.j6((byte) 50);
        this.FH.Hw(r10);
        this.FH.Hw(com.jcraft.jsch.Util.FH("ssh-connection"));
        this.FH.Hw(com.jcraft.jsch.Util.FH("keyboard-interactive"));
        this.FH.Hw(com.jcraft.jsch.Util.FH);
        this.FH.Hw(com.jcraft.jsch.Util.FH);
        r18.DW(this.DW);
        byte[] r14 = r4;
        boolean r13 = r5;
        boolean r6 = true;
    L15:
        this.FH = r18.j6(this.FH);
        int r7 = this.FH.DW() & 255;
        if (r7 == 52) goto L17;
        if (r7 == 53) goto L20;
        if (r7 == 51) goto L25;
        if (r7 != 60) goto L87;
        this.FH.FH();
        this.FH.j6();
        this.FH.j6();
        java.lang.String r8 = com.jcraft.jsch.Util.j6(this.FH.tp());
        java.lang.String r9 = com.jcraft.jsch.Util.j6(this.FH.tp());
        com.jcraft.jsch.Util.j6(this.FH.tp());
        int r15 = this.FH.FH();
        java.lang.String[] r11 = new java.lang.String[r15];
        boolean[] r12 = new boolean[r15];
        int r16 = 0;
    L39:
        if (r16 >= r15) goto L40;
        r11[r16] = com.jcraft.jsch.Util.j6(this.FH.tp());
        if (this.FH.j6() == 0) goto L85;
        boolean r17 = true;
    L86:
        r12[r16] = r17;
        r16 = r16 + 1;
        goto L39
    L85:
        r17 = false;
        goto L86
    L40:
        byte[] r19 = null;
        if (r14 != null) goto L43;
    L49:
        if (r15 <= 0) goto L51;
    L54:
        com.jcraft.jsch.UserInfo r20 = this.j6;
        if (r20 == null) goto L63;
        java.lang.String[] r21 = ((com.jcraft.jsch.UIKeyboardInteractive) r20).j6(r3, r8, r9, r11, r12);
        if (r21 == null) goto L63;
        byte[][] r22 = new byte[r21.length][];
        int r23 = 0;
    L60:
        if (r23 >= r21.length) goto L64;
        r22[r23] = com.jcraft.jsch.Util.FH(r21[r23]);
        r23 = r23 + 1;
    L64:
        r19 = r14;
    L65:
        this.DW.DW();
        this.FH.j6((byte) 61);
        if (r15 <= 0) goto L78;
        if (r22 != null) goto L69;
    L70:
        if (r22 != null) goto L75;
        this.FH.FH(r15);
        int r24 = 0;
    L72:
        if (r24 >= r15) goto L76;
        this.FH.Hw(com.jcraft.jsch.Util.FH);
        r24 = r24 + 1;
    L76:
        if (r22 != null) goto L80;
        r13 = true;
    L80:
        r18.DW(this.DW);
        r14 = r19;
        r6 = false;
        goto L15
    L75:
        this.FH.FH(0);
        goto L76
    L69:
        if (r15 != r22.length) goto L70;
    L78:
        this.FH.FH(r15);
        int r25 = 0;
    L79:
        if (r25 >= r15) goto L80;
        this.FH.Hw(r22[r25]);
        r25 = r25 + 1;
    L63:
        r22 = null;
        goto L64
    L51:
        if (r8.length() > 0) goto L54;
        if (r9.length() <= 0) goto L63;
    L43:
        if (r11.length != 1) goto L49;
        if (r12[0] == true) goto L49;
        if (r11[0].toLowerCase().indexOf("password:") < 0) goto L49;
        r22 = new byte[][]{r14};
        goto L65
    L87:
        return false;
    L25:
        this.FH.FH();
        this.FH.j6();
        this.FH.j6();
        byte[] r26 = this.FH.tp();
        if (this.FH.j6() != 0) goto L35;
        if (r6 == true) goto L28;
        r18.aj++;
        if (r13 == true) goto L33;
        r5 = r13;
        r4 = r14;
        goto L12
    L33:
        throw new com.jcraft.jsch.JSchAuthCancelException("keyboard-interactive");
    L28:
        return false;
    L35:
        throw new com.jcraft.jsch.JSchPartialAuthException(com.jcraft.jsch.Util.j6(r26));
    L20:
        this.FH.FH();
        this.FH.j6();
        this.FH.j6();
        byte[] r27 = this.FH.tp();
        this.FH.tp();
        java.lang.String r28 = com.jcraft.jsch.Util.j6(r27);
        com.jcraft.jsch.UserInfo r29 = this.j6;
        if (r29 == null) goto L15;
        r29.DW(r28);
        goto L15
    L17:
        return true;
    L13:
        return false;
    L5:
        if ((r2 instanceof com.jcraft.jsch.UIKeyboardInteractive) == true) goto L7;
        return false;
    }
}
