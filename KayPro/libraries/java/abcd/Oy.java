package abcd;

@java.lang.Deprecated
public class Oy {
    public int DW;
    abcd.Ly EQ;
    public int FH;
    public long Hw;
    abcd.Fy J0;
    public int VH;
    public int Zo;
    public long gn;
    public byte[] j6;
    abcd.Gy tp;
    public java.lang.String u7;
    public byte[] v5;
    int we;

    public Oy() {
        this(new abcd.Dy());
    }

    public Oy(abcd.Fy r1) {
        this.J0 = r1;
    }

    public int DW() {
        return Hw(15);
    }

    public int DW(int r2) {
        return j6(r2, 15);
    }

    public int FH(int r2) {
        abcd.Ly r0 = this.EQ;
        if (r0 != null) goto L7;
        return -2;
    L7:
        return r0.j6(r2);
    }

    public int Hw(int r2) {
        return j6(r2, false);
    }

    public int j6(int r2) {
        abcd.Gy r0 = this.tp;
        if (r0 != null) goto L7;
        return -2;
    L7:
        return r0.j6(r2);
    }

    public int j6(int r2, int r3) {
        return j6(r2, r3, false);
    }

    public int j6(int r2, int r3, boolean r4) {
        this.tp = new abcd.Gy(this);
        abcd.Gy r0 = this.tp;
        if (r4 == false) goto L6;
        r3 = -r3;
    L6:
        return r0.DW(r2, r3);
    }

    public int j6(int r2, boolean r3) {
        this.EQ = new abcd.Ly(this);
        abcd.Ly r0 = this.EQ;
        if (r3 == false) goto L6;
        r2 = -r2;
    L6:
        return r0.DW(r2);
    }

    int j6(byte[] r4, int r5, int r6) {
        int r0 = this.FH;
        if (r0 > r6) goto L6;
        r6 = r0;
    L6:
        if (r6 != 0) goto L9;
        return 0;
    L9:
        this.FH -= r6;
        if (this.tp.u7 == 0) goto L12;
        this.J0.update(this.j6, this.DW, r6);
    L12:
        java.lang.System.arraycopy(this.j6, this.DW, r4, r5, r6);
        this.DW += r6;
        this.Hw += (long) r6;
        return r6;
    }

    void j6() {
        int r0 = this.tp.gn;
        int r1 = this.VH;
        if (r0 <= r1) goto L5;
        r0 = r1;
    L5:
        if (r0 != 0) goto L7;
        return;
    L7:
        abcd.Gy r2 = this.tp;
        byte[] r3 = r2.v5;
        int r4 = r3.length;
        int r5 = r2.VH;
        if (r4 <= r5) goto L14;
        byte[] r6 = this.v5;
        if (r6.length <= this.Zo) goto L14;
        if (r3.length < (r5 + r0)) goto L14;
        int r7 = r6.length;
    L14:
        abcd.Gy r8 = this.tp;
        java.lang.System.arraycopy(r8.v5, r8.VH, this.v5, this.Zo, r0);
        this.Zo += r0;
        abcd.Gy r9 = this.tp;
        r9.VH += r0;
        this.gn += (long) r0;
        this.VH -= r0;
        r9.gn -= r0;
        if (r9.gn != 0) goto L18;
        r9.VH = 0;
        return;
    }
}
