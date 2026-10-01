package abcd;

public class Hy implements java.lang.Cloneable {
    private boolean DW;
    boolean EQ;
    long FH;
    int Hw;
    byte[] VH;
    byte[] Zo;
    byte[] gn;
    boolean j6;
    long tp;
    int u7;
    int v5;
    long we;

    public Hy() {
        this.j6 = false;
        this.DW = false;
        this.v5 = 255;
        this.EQ = false;
        this.we = 0;
    }

    public java.lang.Object clone() {
        abcd.Hy r0 = (abcd.Hy) super.clone();
        byte[] r1 = r0.Zo;
        if (r1 == null) goto L5;
        byte[] r3 = new byte[r1.length];
        java.lang.System.arraycopy(r1, 0, r3, 0, r3.length);
        r0.Zo = r3;
    L5:
        byte[] r2 = r0.VH;
        if (r2 == null) goto L8;
        byte[] r4 = new byte[r2.length];
        java.lang.System.arraycopy(r2, 0, r4, 0, r4.length);
        r0.VH = r4;
    L8:
        byte[] r5 = r0.gn;
        if (r5 == null) goto L11;
        byte[] r6 = new byte[r5.length];
        java.lang.System.arraycopy(r5, 0, r6, 0, r6.length);
        r0.gn = r6;
    L11:
        return r0;
    }

    public void j6(long r1) {
        this.tp = r1;
    }

    void j6(abcd.Gy r7) {
        if (this.j6 == false) goto L5;
        int r0 = 1;
    L7:
        if (this.DW == false) goto L10;
        r0 = r0 | 2;
    L10:
        if (this.Zo == null) goto L13;
        r0 = r0 | 4;
    L13:
        if (this.VH == null) goto L16;
        r0 = r0 | 8;
    L16:
        if (this.gn == null) goto L18;
        r0 = r0 | 16;
    L18:
        int r3 = r7.ro;
        if (r3 != 1) goto L22;
        int r1 = 4;
    L25:
        r7.VH(-29921);
        r7.j6((byte) 8);
        r7.j6((byte) r0);
        r7.j6((byte) this.we);
        r7.j6((byte) (this.we >> 8));
        r7.j6((byte) (this.we >> 16));
        r7.j6((byte) (this.we >> 24));
        r7.j6((byte) r1);
        r7.j6((byte) this.v5);
        byte[] r2 = this.Zo;
        if (r2 == null) goto L28;
        r7.j6((byte) r2.length);
        r7.j6((byte) (this.Zo.length >> 8));
        byte[] r4 = this.Zo;
        r7.j6(r4, 0, r4.length);
    L28:
        byte[] r5 = this.VH;
        if (r5 == null) goto L31;
        r7.j6(r5, 0, r5.length);
        r7.j6((byte) 0);
    L31:
        byte[] r6 = this.gn;
        if (r6 == null) goto L35;
        r7.j6(r6, 0, r6.length);
        r7.j6((byte) 0);
        return;
    L35:
        return;
    L22:
        if (r3 != 9) goto L24;
        r1 = 2;
        goto L25
    L24:
        r1 = 0;
        goto L25
    L5:
        r0 = 0;
        goto L7
    }
}
