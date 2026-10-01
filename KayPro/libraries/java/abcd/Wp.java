package abcd;

public class Wp {
    private final int[] DW;
    private final int[] FH;
    private final int[] Hw;
    private final int[] VH;
    private final int[] Zo;
    private final int j6;
    private final int[] v5;

    public Wp(int r1, int[] r2, int[] r3, int[] r4, int[] r5, int[] r6, int[] r7) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
        this.v5 = r5;
        this.Zo = r6;
        this.VH = r7;
    }

    public int[] DW() {
        return this.FH;
    }

    public int[] FH() {
        return this.DW;
    }

    public int[] Hw() {
        return this.v5;
    }

    public int[] VH() {
        return this.Zo;
    }

    public int[] Zo() {
        return this.VH;
    }

    public int j6() {
        return this.j6;
    }

    public void j6(abcd.hr.a r5) {
        r5.writeInt(this.j6);
        r5.writeInt(this.DW.length);
        r5.writeInt(this.Hw.length);
        r5.writeInt(this.Zo.length);
        int r0 = 0;
        int r1 = 0;
    L3:
        int[] r2 = this.DW;
        if (r1 >= r2.length) goto L6;
        r5.writeInt(r2[r1]);
        r5.writeInt(this.FH[r1]);
        r1 = r1 + 1;
        goto L3
    L6:
        int r3 = 0;
    L7:
        int[] r4 = this.Hw;
        if (r3 >= r4.length) goto L10;
        r5.writeInt(r4[r3]);
        r5.writeInt(this.v5[r3]);
        r3 = r3 + 1;
    L10:
        int[] r6 = this.Zo;
        if (r0 >= r6.length) goto L13;
        r5.writeInt(r6[r0]);
        r5.writeInt(this.VH[r0]);
        r0 = r0 + 1;
        goto L10
    }

    public int[] v5() {
        return this.Hw;
    }
}
