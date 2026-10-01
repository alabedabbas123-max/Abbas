package abcd;

final class wI<V> {
    private int DW;
    private int FH;
    private wI.a<V>[] j6;

    private static class a<V> {
        V DW;
        wI.a<V> FH;
        final long j6;

        a(long r1, V r3) {
            this.j6 = r1;
            this.DW = r3;
        }
    }

    wI() {
        this.j6 = j6(64);
        this.FH = (int) (this.j6.length * 0.75f);
    }

    private final int DW(long r2) {
        int r3 = ((int) r2) >>> 1;
        return (r3 ^ ((r3 >>> 20) ^ (r3 >>> 12))) & (this.j6.length - 1);
    }

    private void j6() {
        abcd.wI.a[] r0 = this.j6;
        int r1 = r0.length;
        this.j6 = j6(r1 << 1);
        this.FH = (int) (this.j6.length * 0.75f);
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L4;
        abcd.wI.a r3 = r0[r2];
    L6:
        if (r3 == null) goto L7;
        abcd.wI.a r4 = r3.FH;
        j6(r3);
        r3 = r4;
        goto L6
    L7:
        r2 = r2 + 1;
        goto L3
    }

    private void j6(wI.a<V> r4) {
        int r0 = DW(r4.j6);
        wI.a<V>[] r1 = this.j6;
        r4.FH = r1[r0];
        r1[r0] = r4;
    }

    private static final <V> wI.a<V>[] j6(int r0) {
        return new abcd.wI.a[r0];
    }

    V j6(long r8) {
        abcd.wI.a r0 = this.j6[DW(r8)];
        abcd.wI.a r2 = null;
    L3:
        if (r0 == null) goto L4;
        if (r0.j6 == r8) goto L7;
        r2 = r0;
        r0 = r0.FH;
        goto L3
    L7:
        if (r2 != null) goto L9;
        this.j6[DW(r8)] = r0.FH;
    L10:
        this.DW--;
        return r0.DW;
    L9:
        r2.FH = r0.FH;
        goto L10
    L4:
        return null;
    }

    V j6(long r5, V r7) {
        wI.a<V> r0 = this.j6[DW(r5)];
    L3:
        if (r0 == null) goto L4;
        if (r0.j6 == r5) goto L11;
        r0 = r0.FH;
        goto L3
    L11:
        V r6 = r0.DW;
        r0.DW = r7;
        return r6;
    L4:
        int r1 = this.DW + 1;
        this.DW = r1;
        if (r1 != this.FH) goto L7;
        j6();
    L7:
        j6(new abcd.wI.a(r5, r7));
        return null;
    }
}
