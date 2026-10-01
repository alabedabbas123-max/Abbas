package abcd;

public class mF {
    private int DW;
    private abcd.RK.c FH;
    private byte[] j6;

    public mF(int r1) {
        this.j6 = new byte[r1];
    }

    private void DW(byte[] r5, int r6, int r7, abcd.AbstractrE r8) {
        if (this.j6 == null) goto L5;
        this.FH = new abcd.RK.c(Integer.MAX_VALUE);
        this.FH.write(this.j6, 0, this.DW);
        this.j6 = null;
    L5:
        r8.j6(this.FH);
        this.FH.write(32);
        this.FH.write(r5, r6, r7);
        this.FH.write(0);
    }

    public static int j6(abcd.AbstractrE r0, int r1) {
        return ((r0.j6() + r1) + 20) + 2;
    }

    private boolean j6(byte[] r5, int r6, int r7, abcd.AbstractrE r8) {
        byte[] r0 = this.j6;
        if (r0 != null) goto L5;
    L9:
        return false;
    L5:
        if (r0.length < (this.DW + j6(r8, r7))) goto L9;
        r8.j6(this.j6, this.DW);
        this.DW += r8.j6();
        byte[] r9 = this.j6;
        int r1 = this.DW;
        this.DW = r1 + 1;
        r9[r1] = 32;
        java.lang.System.arraycopy(r5, r6, r9, this.DW, r7);
        this.DW += r7;
        byte[] r10 = this.j6;
        int r11 = this.DW;
        this.DW = r11 + 1;
        r10[r11] = 0;
        return true;
    }

    public abcd.yE j6(abcd.EE r5) {
        byte[] r0 = this.j6;
        if (r0 == null) goto L7;
        return r5.DW(2, r0, 0, this.DW);
    L7:
        return r5.j6(2, this.FH.DW(), this.FH.FH());
    }

    public void j6(byte[] r2, int r3, int r4, abcd.AbstractrE r5, abcd.YD r6) {
        if (j6(r2, r3, r4, r5) == false) goto L10;
        r6.DW(this.j6, this.DW);
        this.DW += 20;
        return;
    L10:
        DW(r2, r3, r4, r5);     // Catch: java.io.IOException -> L7
        r6.j6(this.FH);     // Catch: java.io.IOException -> L7
        return;
    L7:
        e = move-exception;
        throw new java.lang.RuntimeException(e);
    }

    public void j6(byte[] r3, int r4, int r5, abcd.AbstractrE r6, byte[] r7, int r8) {
        if (j6(r3, r4, r5, r6) == false) goto L10;
        java.lang.System.arraycopy(r7, r8, this.j6, this.DW, 20);
        this.DW += 20;
        return;
    L10:
        DW(r3, r4, r5, r6);     // Catch: java.io.IOException -> L7
        this.FH.write(r7, r8, 20);     // Catch: java.io.IOException -> L7
        return;
    L7:
        e = move-exception;
        throw new java.lang.RuntimeException(e);
    }

    public void j6(byte[] r7, abcd.AbstractrE r8, abcd.YD r9) {
        j6(r7, 0, r7.length, r8, r9);
    }

    public byte[] j6() {
        byte[] r0 = this.j6;
        if (r0 == null) goto L11;
        int r1 = this.DW;
        byte[] r2 = new byte[r1];
        java.lang.System.arraycopy(r0, 0, r2, 0, r1);
        return r2;
    L11:
        return this.FH.Zo();
    L8:
        e = move-exception;
        throw new java.lang.RuntimeException(e);
    }

    public java.lang.String toString() {
        byte[] r0 = j6();
        abcd.UJ r1 = new abcd.UJ();
        r1.j6(r0);
        java.lang.StringBuilder r2 = new java.lang.StringBuilder();
        r2.append("Tree={");
        if (r1.DW() == true) goto L10;
        r2.append('\n');
        new abcd.wE().Hw(r0);     // Catch: abcd.YC -> L7
    L7:
        e = move-exception;
        r2.append("*** ERROR: ");
        r2.append(e.getMessage());
        r2.append("\n");
        r2.append('\n');
    L10:
        if (r1.DW() == true) goto L11;
        abcd.AbstractrE r3 = r1.Hw();
        r2.append(r3);
        r2.append(' ');
        r2.append(abcd.hE.DW(r3.FH()));
        r2.append(' ');
        r2.append(r1.v5().we());
        r2.append(' ');
        r2.append(r1.Zo());
        r2.append('\n');
        r1.J8();
        goto L10
    L11:
        r2.append("}");
        return r2.toString();
    }
}
