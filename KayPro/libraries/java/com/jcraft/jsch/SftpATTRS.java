package com.jcraft.jsch;

public class SftpATTRS {
    long DW;
    int FH;
    int Hw;
    int VH;
    int Zo;
    java.lang.String[] gn;
    int j6;
    int v5;

    private SftpATTRS() {
        this.j6 = 0;
        this.gn = null;
    }

    static com.jcraft.jsch.SftpATTRS DW(com.jcraft.jsch.Buffer r6) {
        com.jcraft.jsch.SftpATTRS r0 = new com.jcraft.jsch.SftpATTRS();
        r0.j6 = r6.FH();
        if ((r0.j6 & 1) == 0) goto L6;
        r0.DW = r6.v5();
    L6:
        if ((r0.j6 & 2) == 0) goto L9;
        r0.FH = r6.FH();
        r0.Hw = r6.FH();
    L9:
        if ((r0.j6 & 4) == 0) goto L12;
        r0.v5 = r6.FH();
    L12:
        if ((r0.j6 & 8) == 0) goto L15;
        r0.Zo = r6.FH();
    L15:
        if ((r0.j6 & 8) == 0) goto L18;
        r0.VH = r6.FH();
    L18:
        if ((r0.j6 & Integer.MIN_VALUE) == 0) goto L25;
        int r1 = r6.FH();
        if (r1 <= 0) goto L25;
        r0.gn = new java.lang.String[r1 * 2];
        int r2 = 0;
    L22:
        if (r2 >= r1) goto L25;
        int r4 = r2 * 2;
        r0.gn[r4] = com.jcraft.jsch.Util.j6(r6.tp());
        r0.gn[r4 + 1] = com.jcraft.jsch.Util.j6(r6.tp());
        r2 = r2 + 1;
    L25:
        return r0;
    }

    private boolean j6(int r3) {
        if ((this.j6 & 4) != 0) goto L5;
        return false;
    L5:
        if ((this.v5 & 61440) != r3) goto L10;
        return true;
    L10:
        return false;
    }

    public int DW() {
        return this.Hw;
    }

    public int FH() {
        return this.VH;
    }

    public java.lang.String Hw() {
        return new java.util.Date(((long) this.VH) * 1000).toString();
    }

    public int VH() {
        return this.FH;
    }

    public long Zo() {
        return this.DW;
    }

    public boolean gn() {
        return j6(16384);
    }

    public int j6() {
        return this.j6;
    }

    void j6(com.jcraft.jsch.Buffer r5) {
        r5.FH(this.j6);
        if ((this.j6 & 1) == 0) goto L6;
        r5.j6(this.DW);
    L6:
        if ((this.j6 & 2) == 0) goto L9;
        r5.FH(this.FH);
        r5.FH(this.Hw);
    L9:
        if ((this.j6 & 4) == 0) goto L12;
        r5.FH(this.v5);
    L12:
        if ((this.j6 & 8) == 0) goto L15;
        r5.FH(this.Zo);
    L15:
        if ((this.j6 & 8) == 0) goto L18;
        r5.FH(this.VH);
    L18:
        if ((this.j6 & Integer.MIN_VALUE) == 0) goto L25;
        int r0 = this.gn.length / 2;
        if (r0 <= 0) goto L27;
        int r1 = 0;
    L22:
        if (r1 >= r0) goto L28;
        int r3 = r1 * 2;
        r5.Hw(com.jcraft.jsch.Util.FH(this.gn[r3]));
        r5.Hw(com.jcraft.jsch.Util.FH(this.gn[r3 + 1]));
        r1 = r1 + 1;
        goto L22
    L28:
        return;
    L27:
        return;
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(v5()) + " " + VH() + " " + DW() + " " + Zo() + " " + Hw();
    }

    int tp() {
        if ((this.j6 & 1) == 0) goto L5;
        int r0 = 12;
    L7:
        if ((this.j6 & 2) == 0) goto L10;
        r0 = r0 + 8;
    L10:
        if ((this.j6 & 4) == 0) goto L13;
        r0 = r0 + 4;
    L13:
        if ((this.j6 & 8) == 0) goto L16;
        r0 = r0 + 8;
    L16:
        if ((this.j6 & Integer.MIN_VALUE) == 0) goto L23;
        r0 = r0 + 4;
        int r2 = this.gn.length / 2;
        if (r2 <= 0) goto L23;
        int r3 = 0;
    L20:
        if (r3 >= r2) goto L23;
        int r5 = r3 * 2;
        r0 = (((r0 + 4) + this.gn[r5].length()) + 4) + this.gn[r5 + 1].length();
        r3 = r3 + 1;
    L23:
        return r0;
    L5:
        r0 = 4;
        goto L7
    }

    public boolean u7() {
        return j6(40960);
    }

    public java.lang.String v5() {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(10);
        if (gn() == false) goto L6;
        r0.append('d');
    L10:
        if ((this.v5 & 256) == 0) goto L12;
        r0.append('r');
    L14:
        if ((this.v5 & 128) == 0) goto L16;
        r0.append('w');
    L17:
        int r1 = this.v5;
        if ((r1 & 2048) == 0) goto L21;
        r0.append('s');
    L25:
        if ((this.v5 & 32) == 0) goto L27;
        r0.append('r');
    L29:
        if ((this.v5 & 16) == 0) goto L31;
        r0.append('w');
    L32:
        int r2 = this.v5;
        if ((r2 & 1024) == 0) goto L36;
        r0.append('s');
    L40:
        if ((this.v5 & 4) == 0) goto L42;
        r0.append('r');
    L44:
        if ((this.v5 & 2) == 0) goto L46;
        r0.append('w');
    L48:
        if ((this.v5 & 1) == 0) goto L50;
        r0.append('x');
    L52:
        return r0.toString();
    L50:
        r0.append('-');
        goto L52
    L46:
        r0.append('-');
        goto L48
    L42:
        r0.append('-');
        goto L44
    L36:
        if ((r2 & 8) == 0) goto L38;
        r0.append('x');
        goto L40
    L38:
        r0.append('-');
        goto L40
    L31:
        r0.append('-');
        goto L32
    L27:
        r0.append('-');
        goto L29
    L21:
        if ((r1 & 64) == 0) goto L23;
        r0.append('x');
        goto L25
    L23:
        r0.append('-');
        goto L25
    L16:
        r0.append('-');
        goto L17
    L12:
        r0.append('-');
        goto L14
    L6:
        if (u7() == false) goto L8;
        r0.append('l');
        goto L10
    L8:
        r0.append('-');
        goto L10
    }
}
