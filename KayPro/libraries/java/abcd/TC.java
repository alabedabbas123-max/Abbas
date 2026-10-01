package abcd;

public class TC {
    private static final abcd.TC[] DW = null;
    private static final java.util.Comparator<abcd.TC> FH = null;
    private static final byte[] j6 = null;
    private abcd.TC Hw;
    private abcd.yE VH;
    private int Zo;
    private abcd.TC[] gn;
    private int u7;
    private byte[] v5;

    static {
        j6 = new byte[0];
        DW = new abcd.TC[0];
        FH = new abcd.SC();
    }

    TC() {
        this.v5 = j6;
        this.gn = DW;
        this.u7 = 0;
        this.Zo = -1;
    }

    private TC(abcd.TC r2, byte[] r3, int r4, int r5) {
        this.Hw = r2;
        this.v5 = new byte[r5];
        java.lang.System.arraycopy(r3, r4, this.v5, 0, r5);
        this.gn = DW;
        this.u7 = 0;
        this.Zo = -1;
    }

    TC(byte[] r7, abcd.EK r8, abcd.TC r9) {
        this.Hw = r9;
        int r10 = abcd.IK.j6(r7, r8.j6, 0);
        int r1 = r8.j6;
        boolean r3 = true;
        int r2 = (r10 - r1) - 1;
        if (r2 <= 0) goto L5;
        this.v5 = new byte[r2];
        java.lang.System.arraycopy(r7, r1, this.v5, 0, r2);
    L6:
        this.Zo = abcd.IK.j6(r7, r10, r8);
        int r11 = abcd.IK.j6(r7, r8.j6, r8);
        r8.j6 = abcd.IK.j6(r7, r8.j6, '\n');
        if (this.Zo < 0) goto L9;
        this.VH = abcd.yE.Hw(r7, r8.j6);
        r8.j6 += 20;
    L9:
        if (r11 <= 0) goto L21;
        this.gn = new abcd.TC[r11];
        int r4 = 0;
    L11:
        if (r4 >= r11) goto L12;
        this.gn[r4] = new abcd.TC(r7, r8, this);
        if (r3 == false) goto L20;
        if (r4 <= 0) goto L20;
        java.util.Comparator<abcd.TC> r5 = FH;
        abcd.TC[] r6 = this.gn;
        if (r5.compare(r6[r4 - 1], r6[r4]) <= 0) goto L20;
        r3 = false;
    L20:
        r4 = r4 + 1;
        goto L11
    L12:
        if (r3 == true) goto L22;
        java.util.Arrays.sort(this.gn, 0, r11, FH);
    L22:
        this.u7 = r11;
        return;
    L21:
        this.gn = DW;
        goto L22
    L5:
        this.v5 = j6;
        goto L6
    }

    private int DW(abcd.QC[] r8, int r9, int r10, abcd.EE r11) {
        int r0 = this.Zo + r9;
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r9 >= r0) goto L4;
        abcd.QC r3 = r8[r9];
        if (r3.VH() != 0) goto L14;
        byte[] r4 = r3.Hw;
        if (r2 >= this.u7) goto L12;
        abcd.TC r5 = this.gn[r2];
        if (r5.j6(r4, r10, r4.length) == false) goto L12;
        r5.j6(r8, r9, (r5.v5() + r10) + 1, r11);
        r1 = r1 + abcd.mF.j6(abcd.AbstractrE.j6, r5.v5());
        r9 = r9 + r5.Zo;
        r2 = r2 + 1;
    L12:
        r1 = r1 + abcd.mF.j6(r3.j6(), r4.length - r10);
        r9 = r9 + 1;
        goto L3
    L14:
        throw new abcd.zD(r3);
    L4:
        return r1;
    }

    private void DW(int r5) {
        int r0 = this.u7 - 1;
        this.u7 = r0;
        if (r5 >= r0) goto L5;
        abcd.TC[] r1 = this.gn;
        java.lang.System.arraycopy(r1, r5 + 1, r1, r5, r0 - r5);
    L5:
        this.gn[r0] = null;
    }

    private static int j6(byte[] r3, int r4) {
        int r0 = r3.length;
    L3:
        if (r4 >= r0) goto L4;
        if (r3[r4] == 47) goto L8;
        r4 = r4 + 1;
        goto L3
    L8:
        return r4;
    L4:
        return -1;
    }

    private static int j6(byte[] r7, int r8, abcd.TC r9) {
        if (r9 != null) goto L5;
        return -1;
    L5:
        byte[] r10 = r9.v5;
        int r1 = r7.length;
        int r2 = r10.length;
        int r4 = 0;
    L6:
        if (r8 >= r1) goto L13;
        if (r4 >= r2) goto L13;
        int r5 = (r7[r8] & 255) - (r10[r4] & 255);
        if (r5 != 0) goto L11;
        r8 = r8 + 1;
        r4 = r4 + 1;
        goto L6
    L11:
        return r5;
    L13:
        if (r4 != r2) goto L19;
        if (r7[r8] != 47) goto L23;
        return 0;
    L23:
        return -1;
    L19:
        return r1 - r2;
    }

    private void j6(int r5, abcd.TC r6) {
        abcd.TC[] r0 = this.gn;
        int r1 = this.u7;
        if ((r1 + 1) > r0.length) goto L8;
        if (r5 >= r1) goto L6;
        java.lang.System.arraycopy(r0, r5, r0, r5 + 1, r1 - r5);
    L6:
        r0[r5] = r6;
        this.u7++;
        return;
    L8:
        int r2 = r0.length;
        abcd.TC[] r3 = new abcd.TC[r2 + 1];
        if (r5 <= 0) goto L11;
        java.lang.System.arraycopy(r0, 0, r3, 0, r5);
    L11:
        r3[r5] = r6;
        if (r5 >= r2) goto L14;
        java.lang.System.arraycopy(r0, r5, r3, r5 + 1, r2 - r5);
    L14:
        this.gn = r3;
        this.u7++;
    }

    static boolean j6(byte[] r3, byte[] r4, int r5) {
        if (r4.length >= r5) goto L5;
        return false;
    L5:
        r5 = r5 - 1;
        if (r5 < 0) goto L7;
        if (r3[r5] == r4[r5]) goto L5;
        return false;
    L7:
        return true;
    }

    static byte[] j6(abcd.TC r0) {
        return r0.v5;
    }

    public int DW() {
        return this.Zo;
    }

    abcd.yE FH() {
        return this.VH;
    }

    public boolean Hw() {
        if (this.VH == null) goto L6;
        return true;
    L6:
        return false;
    }

    public int j6() {
        return this.u7;
    }

    public abcd.TC j6(int r2) {
        return this.gn[r2];
    }

    abcd.yE j6(abcd.QC[] r11, int r12, int r13, abcd.EE r14) {
        if (this.VH != null) goto L14;
        int r0 = this.Zo + r12;
        abcd.mF r8 = new abcd.mF(DW(r11, r12, r13, r14));
        int r9 = 0;
    L5:
        if (r12 >= r0) goto L6;
        abcd.QC r1 = r11[r12];
        byte[] r2 = r1.Hw;
        if (r9 >= this.u7) goto L12;
        abcd.TC r3 = this.gn[r9];
        if (r3.j6(r2, r13, r2.length) == false) goto L12;
        r8.j6(r3.v5, abcd.AbstractrE.j6, r3.VH);
        r12 = r12 + r3.Zo;
        r9 = r9 + 1;
    L12:
        r8.j6(r2, r13, r2.length - r13, r1.j6(), r1.gn(), r1.u7());
        r12 = r12 + 1;
        goto L5
    L6:
        this.VH = r14.j6(r8);
    L14:
        return this.VH;
    }

    void j6(byte[] r4, java.io.OutputStream r5) {
        int r0 = r4.length - 1;
        r4[r0] = 10;
        int r1 = abcd.IK.FH(r4, r0, this.u7) - 1;
        r4[r1] = 32;
        if (Hw() == false) goto L5;
        int r2 = this.Zo;
    L6:
        int r3 = abcd.IK.FH(r4, r1, r2) - 1;
        int r6 = 0;
        r4[r3] = 0;
        r5.write(this.v5);
        r5.write(r4, r3, r4.length - r3);
        if (Hw() == false) goto L10;
        this.VH.DW(r4, 0);
        r5.write(r4, 0, 20);
    L10:
        if (r6 >= this.u7) goto L11;
        this.gn[r6].j6(r4, r5);
        r6 = r6 + 1;
        goto L10
    L11:
        return;
    L5:
        r2 = -1;
        goto L6
    }

    void j6(abcd.QC[] r6, int r7, int r8, int r9) {
        if (this.Zo < 0) goto L5;
        return;
    L5:
        int r0 = 0;
        this.Zo = 0;
        if (r7 != 0) goto L8;
        return;
    L8:
        byte[] r1 = r6[r8].Hw;
    L9:
        if (r8 >= r7) goto L15;
        byte[] r2 = r6[r8].Hw;
        if (r9 <= 0) goto L20;
        if (j6(r1, r2, r9) == false) goto L15;
    L20:
        if (r0 >= this.u7) goto L22;
        abcd.TC r3 = this.gn[r0];
    L23:
        int r4 = j6(r2, r9, r3);
        if (r4 > 0) goto L25;
        if (r4 >= 0) goto L31;
        int r5 = j6(r2, r9);
        if (r5 < 0) goto L29;
        abcd.TC r10 = new abcd.TC(this, r2, r9, r5 - r9);
        j6(r0, r10);
        r3 = r10;
        goto L31
    L29:
        r8 = r8 + 1;
        this.Zo++;
    L31:
        r3.j6(r6, r7, r8, (r3.v5() + r9) + 1);
        int r11 = r3.Zo;
        r8 = r8 + r11;
        this.Zo += r11;
        r0 = r0 + 1;
        goto L9
    L25:
        DW(r0);
        goto L9
    L22:
        r3 = null;
    L15:
        int r12 = this.u7;
        if (r0 >= r12) goto L17;
        DW(r12 - 1);
        goto L15
    }

    final boolean j6(byte[] r7, int r8, int r9) {
        byte[] r0 = this.v5;
        int r1 = r0.length;
        int r3 = r8;
        int r10 = 0;
    L3:
        if (r10 >= r1) goto L10;
        if (r3 >= r9) goto L10;
        if (r0[r10] != r7[r3]) goto L8;
        r10 = r10 + 1;
        r3 = r3 + 1;
        goto L3
    L8:
        return false;
    L10:
        if (r3 != r9) goto L13;
        return false;
    L13:
        if (r7[r3] != 47) goto L16;
        return true;
    L16:
        return false;
    }

    final int v5() {
        return this.v5.length;
    }
}
