package abcd;

public class YJ {
    private static final abcd.TJ[] j6 = null;
    private final abcd.IE DW;
    abcd.TJ EQ;
    private final abcd.uE FH;
    private abcd.AbstractjK Hw;
    private boolean VH;
    private boolean Zo;
    private int gn;
    private boolean tp;
    private boolean u7;
    abcd.TJ[] v5;

    static {
        j6 = new abcd.TJ[0];
    }

    public YJ(abcd.IE r2) {
        this.FH = new abcd.uE();
        this.DW = r2;
        this.Hw = abcd.AbstractjK.j6;
        this.v5 = j6;
    }

    public YJ(abcd.UE r1) {
        this(r1.j3());
    }

    static java.lang.String DW(abcd.TJ r3) {
        return abcd.IK.j6(abcd.hE.Zo, r3.Zo, 0, r3.gn);
    }

    private abcd.UJ FH(abcd.YD r3) {
        abcd.UJ r0 = new abcd.UJ();
        r0.DW(this.DW, r3);
        return r0;
    }

    private void QX() {
        this.gn--;
        int r0 = 0;
        int r1 = 0;
    L3:
        abcd.TJ[] r2 = this.v5;
        if (r1 >= r2.length) goto L5;
        r2[r1] = r2[r1].DW;
        r1 = r1 + 1;
        goto L3
    L5:
        abcd.TJ r3 = null;
        int r4 = r2.length;
    L6:
        if (r0 >= r4) goto L7;
        abcd.TJ r5 = r2[r0];
        if (r5.FH != r5) goto L16;
        if (r3 != null) goto L14;
    L15:
        r3 = r5;
        goto L16
    L14:
        if (r5.DW(r3) < 0) goto L15;
    L16:
        r0 = r0 + 1;
        goto L6
    L7:
        this.EQ = r3;
    }

    public static abcd.YJ j6(abcd.IE r1, java.lang.String r2, abcd.YD... r3) {
        abcd.YJ r0 = new abcd.YJ(r1);
        abcd.fK r4 = abcd.fK.j6(r2);
        r0.j6(r4);
        r0.j6(r3);
        r0.j6(false);
    L4:
        if (r0.EQ() == false) goto L5;
        if (r4.DW(r0) == true) goto L9;
        if (r0.u7() == false) goto L4;
        r0.j6();
        goto L4
    L9:
        return r0;
    L5:
        return null;
    }

    public static abcd.YJ j6(abcd.UE r2, java.lang.String r3, abcd.mG r4) {
        return j6(r2, r3, new abcd.yE[]{r4});
    }

    public static abcd.YJ j6(abcd.UE r0, java.lang.String r1, abcd.YD... r2) {
        abcd.IE r3 = r0.j3();
        abcd.YJ r4 = j6(r3, r1, r2);     // Catch: java.lang.Throwable -> L6
        r3.FH();
        return r4;
    L6:
        th = move-exception;
        r3.FH();
        throw th;
    }

    static java.lang.String j6(byte[] r1, int r2, int r3) {
        return abcd.IK.j6(abcd.hE.Zo, r1, r2, r3);
    }

    public abcd.AbstractjK DW() {
        return this.Hw;
    }

    public abcd.yE DW(int r3) {
        abcd.TJ r4 = this.v5[r3];
        if (r4.FH != this.EQ) goto L6;
        return r4.v5();
    L6:
        return abcd.yE.Ws();
    }

    public void DW(abcd.YD r5) {
        abcd.TJ[] r0 = this.v5;
        if (r0.length != 1) goto L12;
        abcd.TJ r1 = r0[0];
    L5:
        abcd.TJ r2 = r1.DW;
        if (r2 == null) goto L8;
        r1 = r2;
        goto L5
    L8:
        if ((r1 instanceof abcd.UJ) == false) goto L10;
        r1.FH = null;
        r1.Hw = 0;
        ((abcd.UJ) r1).DW(this.DW, r5);
        this.v5[0] = r1;
    L13:
        this.u7 = false;
        this.gn = 0;
        return;
    L10:
        this.v5[0] = FH(r5);
        goto L13
    L12:
        this.v5 = new abcd.TJ[]{FH(r5)};
        goto L13
    }

    public boolean EQ() {
    L26:
        abcd.TJ[] r1 = this.v5;
        int r2 = r1.length;
        int r3 = 0;
    L27:
        if (r3 >= r2) goto L28;
        r1[r3].J0();
        r3 = r3 + 1;
        goto L27
    L28:
        return false;
    L4:
        if (this.u7 == false) goto L6;
        this.u7 = false;     // Catch: abcd.sD -> L26
        this.tp = false;     // Catch: abcd.sD -> L26
        we();     // Catch: abcd.sD -> L26
    L6:
        abcd.TJ r4 = tp();     // Catch: abcd.sD -> L26
        if (r4.DW() == true) goto L9;
        this.EQ = r4;     // Catch: abcd.sD -> L26
        if (this.Hw.j6(this) == false) goto L18;
        if (this.Zo == false) goto L24;
        if (abcd.AbstractrE.j6.j6(r4.v5) == false) goto L24;
        j6();     // Catch: abcd.sD -> L26
    L24:
        this.u7 = true;     // Catch: abcd.sD -> L26
        return true;
    L18:
        Ws();     // Catch: abcd.sD -> L26
        goto L6
    L9:
        if (this.gn <= 0) goto L15;
        QX();     // Catch: abcd.sD -> L26
        if (this.VH == true) goto L12;
        we();     // Catch: abcd.sD -> L26
        goto L6
    L12:
        this.u7 = true;     // Catch: abcd.sD -> L26
        this.tp = true;     // Catch: abcd.sD -> L26
        return true;
    L15:
        return false;
    }

    public int FH() {
        return this.EQ.gn;
    }

    public int FH(int r3) {
        abcd.TJ r4 = this.v5[r3];
        if (r4.FH == this.EQ) goto L7;
        return 0;
    L7:
        return r4.v5;
    }

    public java.lang.String Hw() {
        return DW(this.EQ);
    }

    public void J0() {
        this.DW.FH();
    }

    public void J8() {
        this.v5 = j6;
        this.u7 = false;
        this.gn = 0;
    }

    public boolean VH() {
        return this.VH;
    }

    void Ws() {
        abcd.TJ r0 = this.EQ;
        int r1 = 0;
    L3:
        abcd.TJ[] r2 = this.v5;
        if (r1 >= r2.length) goto L5;
        abcd.TJ r3 = r2[r1];
        if (r3.FH != r0) goto L9;
        r3.we();
        r3.FH = null;
    L9:
        r1 = r1 + 1;
        goto L3
    }

    public int Zo() {
        return this.v5.length;
    }

    public boolean gn() {
        return this.Zo;
    }

    public int j6(abcd.TJ r5) {
        abcd.TJ[] r0 = this.v5;
        int r1 = r0.length;
        abcd.TJ[] r2 = new abcd.TJ[r1 + 1];
        java.lang.System.arraycopy(r0, 0, r2, 0, r1);
        r2[r1] = r5;
        r5.FH = null;
        r5.Hw = 0;
        this.v5 = r2;
        return r1;
    }

    public int j6(abcd.YD r1) {
        return j6(FH(r1));
    }

    public int j6(byte[] r7, int r8) {
        abcd.TJ r0 = this.EQ;
        byte[] r1 = r0.Zo;
        int r2 = r0.gn;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L11;
        if (r3 >= r8) goto L11;
        int r4 = (r1[r3] & 255) - (r7[r3] & 255);
        if (r4 != 0) goto L8;
        r3 = r3 + 1;
        goto L3
    L8:
        return r4;
    L11:
        if (r3 < r2) goto L13;
        if (r3 < r8) goto L19;
        return 0;
    L19:
        if (r7[r3] == 47) goto L28;
        return -1;
    L28:
        return 0;
    L13:
        if (r1[r3] == 47) goto L26;
        return -1;
    L26:
        return 0;
    }

    public <T extends abcd.TJ> T j6(int r2, java.lang.Class<T> r3) {
        T r4 = (T) this.v5[r2];
        if (r4.FH == this.EQ) goto L7;
        return null;
    L7:
        return r4;
    }

    public abcd.AbstractrE j6(int r1) {
        return abcd.AbstractrE.DW(FH(r1));
    }

    public void j6() {
        abcd.TJ r0 = this.EQ;
        abcd.TJ[] r1 = new abcd.TJ[this.v5.length];
        int r3 = 0;
    L3:
        abcd.TJ[] r4 = this.v5;
        if (r3 >= r4.length) goto L5;
        abcd.TJ r5 = r4[r3];
        if (r5.FH == r0) goto L10;
    L14:
        abcd.TJ r6 = r5.j6();
    L15:
        r1[r3] = r6;
        r3 = r3 + 1;
        goto L3
    L10:
        if (r5.DW() == true) goto L14;
        if (abcd.AbstractrE.j6.j6(r5.v5) == false) goto L14;
        r6 = r5.j6(this.DW, this.FH);
        goto L15
    L5:
        this.gn++;
        this.u7 = false;
        java.lang.System.arraycopy(r1, 0, r4, 0, r4.length);
    }

    public void j6(abcd.AbstractjK r1) {
        if (r1 != null) goto L5;
        r1 = abcd.AbstractjK.j6;
    L5:
        this.Hw = r1;
    }

    public void j6(abcd.uE r3, int r4) {
        abcd.TJ r5 = this.v5[r4];
        if (r5.FH != this.EQ) goto L5;
        r5.j6(r3);
        return;
    L5:
        r3.Ws();
    }

    public void j6(boolean r1) {
        this.Zo = r1;
    }

    public void j6(abcd.YD... r10) {
        abcd.TJ[] r0 = this.v5;
        int r1 = r0.length;
        int r2 = r10.length;
        if (r2 == r1) goto L6;
        r0 = new abcd.TJ[r2];
    L6:
        int r4 = 0;
    L7:
        if (r4 >= r2) goto L8;
        if (r4 >= r1) goto L20;
        abcd.TJ r5 = this.v5[r4];
    L12:
        abcd.TJ r6 = r5.DW;
        if (r6 == null) goto L15;
        r5 = r6;
        goto L12
    L15:
        if ((r5 instanceof abcd.UJ) == false) goto L20;
        if (r5.VH != 0) goto L20;
        r5.FH = null;
        r5.Hw = 0;
        ((abcd.UJ) r5).DW(this.DW, r10[r4]);
        r0[r4] = r5;
    L21:
        r4 = r4 + 1;
    L20:
        r0[r4] = FH(r10[r4]);
        goto L21
    L8:
        this.v5 = r0;
        this.u7 = false;
        this.gn = 0;
    }

    public boolean j6(int r4, int r5) {
        abcd.TJ r0 = this.EQ;
        abcd.TJ[] r1 = this.v5;
        abcd.TJ r6 = r1[r4];
        abcd.TJ r7 = r1[r5];
        if (r6.FH == r0) goto L9;
        if (r7.FH == r0) goto L9;
        return true;
    L9:
        if (r6.gn() == true) goto L11;
    L19:
        return false;
    L11:
        if (r7.gn() == false) goto L19;
        if (r6.FH != r0) goto L19;
        if (r7.FH != r0) goto L19;
        return r6.j6(r7);
    }

    abcd.TJ tp() {
        int r1 = 0;
        abcd.TJ r0 = this.v5[0];
    L4:
        if (r0.DW() == false) goto L10;
        r1 = r1 + 1;
        abcd.TJ[] r2 = this.v5;
        if (r1 >= r2.length) goto L10;
        r0 = r2[r1];
    L10:
        if (r0.DW() == false) goto L12;
        return r0;
    L12:
        r0.FH = r0;
    L13:
        r1 = r1 + 1;
        abcd.TJ[] r3 = this.v5;
        if (r1 >= r3.length) goto L15;
        abcd.TJ r4 = r3[r1];
        if (r4.DW() == true) goto L13;
        int r5 = r4.DW(r0);
        if (r5 < 0) goto L21;
        if (r5 != 0) goto L13;
        r4.FH = r0;
        goto L13
    L21:
        r4.FH = r4;
        r0 = r4;
        goto L13
    L15:
        return r0;
    }

    public boolean u7() {
        return abcd.AbstractrE.j6.j6(this.EQ.v5);
    }

    public byte[] v5() {
        abcd.TJ r0 = this.EQ;
        int r1 = r0.gn;
        byte[] r2 = new byte[r1];
        java.lang.System.arraycopy(r0.Zo, 0, r2, 0, r1);
        return r2;
    }

    void we() {
        abcd.TJ r0 = this.EQ;
        int r1 = 0;
    L3:
        abcd.TJ[] r2 = this.v5;
        if (r1 >= r2.length) goto L5;
        abcd.TJ r3 = r2[r1];
        if (r3.FH != r0) goto L9;
        r3.FH(1);
        r3.FH = null;
    L9:
        r1 = r1 + 1;
        goto L3
    }
}
