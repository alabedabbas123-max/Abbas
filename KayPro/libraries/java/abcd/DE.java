package abcd;

public class DE<V extends abcd.yE> implements java.lang.Iterable<V> {
    private int DW;
    private int FH;
    private V[] Hw;
    private int j6;

    public DE() {
        Zo(2048);
    }

    private void DW(V r5) {
        int r0 = this.FH;
        int r1 = r5.FH & r0;
        V[] r2 = this.Hw;
    L4:
        if (r2[r1] == null) goto L5;
        r1 = (r1 + 1) & r0;
        goto L4
    L5:
        r2[r1] = r5;
    }

    static abcd.yE[] DW(abcd.DE r0) {
        return r0.Hw;
    }

    private void Zo(int r2) {
        this.DW = r2 >> 1;
        this.FH = r2 - 1;
        this.Hw = (V[]) v5(r2);
    }

    static int j6(abcd.DE r0) {
        return r0.j6;
    }

    private void j6() {
        V[] r0 = this.Hw;
        int r1 = r0.length;
        Zo(r1 << 1);
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L4;
        V r3 = r0[r2];
        if (r3 == null) goto L8;
        DW(r3);
    L8:
        r2 = r2 + 1;
        goto L3
    }

    private final V[] v5(int r1) {
        return (V[]) new abcd.yE[r1];
    }

    public V DW(abcd.YD r6) {
        int r0 = this.FH;
        int r1 = r6.FH & r0;
        V[] r2 = this.Hw;
    L3:
        V r3 = r2[r1];
        if (r3 == null) goto L5;
        if (abcd.YD.j6(r3, r6) == true) goto L9;
        r1 = (r1 + 1) & r0;
        goto L3
    L9:
        return r3;
    L5:
        return null;
    }

    public boolean isEmpty() {
        if (this.j6 != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override
    public java.util.Iterator<V> iterator() {
        return new abcd.CE(this);
    }

    /* JADX WARN: Incorrect types in method signature: <Q:TV;>(TQ;)V */
    public void j6(abcd.yE r3) {
        int r0 = this.j6 + 1;
        this.j6 = r0;
        if (r0 != this.DW) goto L5;
        j6();
    L5:
        DW(r3);
    }

    public boolean j6(abcd.YD r1) {
        if (DW(r1) == null) goto L6;
        return true;
    L6:
        return false;
    }
}
