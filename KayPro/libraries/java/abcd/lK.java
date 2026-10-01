package abcd;

public class lK<T> extends java.util.AbstractList<T> {
    private int DW;
    private int FH;
    private int Hw;
    private T[][] j6;
    private T[] v5;

    private class a implements java.util.Iterator<T> {
        private int DW;
        private int FH;
        private T[] Hw;
        private int j6;
        final abcd.lK v5;

        private a(abcd.lK r2) {
            this.v5 = r2;
            this.Hw = (T[]) abcd.lK.j6(r2)[0];
        }

        a(abcd.lK r1, abcd.lK.a r2) {
            this(r1);
        }

        @Override
        public boolean hasNext() {
            if (this.j6 >= abcd.lK.DW(this.v5)) goto L6;
            return true;
        L6:
            return false;
        }

        @Override
        public T next() {
            if (abcd.lK.DW(this.v5) <= this.j6) goto L14;
            T[] r0 = this.Hw;
            int r1 = this.FH;
            T r2 = r0[r1];
            int r3 = r1 + 1;
            this.FH = r3;
            if (r3 != 1024) goto L11;
            int r4 = this.DW + 1;
            this.DW = r4;
            if (r4 >= abcd.lK.j6(this.v5).length) goto L9;
            this.Hw = (T[]) abcd.lK.j6(this.v5)[this.DW];
        L10:
            this.FH = 0;
            goto L11
        L9:
            this.Hw = null;
        L11:
            this.j6++;
            return r2;
        L14:
            throw new java.util.NoSuchElementException();
        }

        @Override
        public void remove() {
            int r0 = this.j6;
            if (r0 == 0) goto L7;
            abcd.lK r1 = this.v5;
            int r2 = r0 - 1;
            this.j6 = r2;
            r1.remove(r2);
            this.DW = abcd.lK.v5(this.j6);
            this.FH = abcd.lK.Zo(this.j6);
            this.Hw = (T[]) abcd.lK.j6(this.v5)[this.DW];
            return;
        L7:
            throw new java.lang.IllegalStateException();
        }
    }

    public lK() {
        this.j6 = (T[][]) VH(256);
        ((T[][]) this.j6)[0] = j6();
        this.v5 = this.j6[0];
    }

    public lK(int r3) {
        int r0 = u7(r3);
        if ((r3 & 1023) != 0) goto L5;
        if (r0 == 0) goto L5;
    L6:
        this.j6 = (T[][]) VH(r0);
        ((T[][]) this.j6)[0] = j6();
        this.v5 = this.j6[0];
        return;
    L5:
        r0 = r0 + 1;
        goto L6
    }

    static int DW(abcd.lK r0) {
        return r0.DW;
    }

    private void DW() {
        this.FH = u7(this.DW);
        this.Hw = gn(this.DW);
        this.v5 = this.j6[this.FH];
    }

    private static <T> T[][] VH(int r0) {
        return (T[][]) new java.lang.Object[r0][];
    }

    static int Zo(int r0) {
        return gn(r0);
    }

    private static final int gn(int r0) {
        return r0 & 1023;
    }

    private static <T> T[] j6() {
        return (T[]) new java.lang.Object[1024];
    }

    static java.lang.Object[][] j6(abcd.lK r0) {
        return r0.j6;
    }

    private static final int u7(int r0) {
        return r0 >>> 10;
    }

    static int v5(int r0) {
        return u7(r0);
    }

    public void FH(lK<T> r5) {
        if (r5.DW != 0) goto L5;
        return;
    L5:
        int r1 = 0;
    L7:
        if (r1 >= r5.FH) goto L8;
        j6(r5.j6[r1], 0, 1024);
        r1 = r1 + 1;
        goto L7
    L8:
        int r2 = r5.Hw;
        if (r2 == 0) goto L14;
        j6(r5.v5, 0, r2);
        return;
    }

    @Override
    public void add(int r4, T r5) {
        int r0 = this.DW;
        if (r4 != r0) goto L5;
        add(r5);
        return;
    L5:
        if (r4 < 0) goto L13;
        if (r0 < r4) goto L13;
        add(null);
        int r1 = this.DW - 2;
    L8:
        if (r4 > r1) goto L9;
        set(r1 + 1, get(r1));
        r1 = r1 - 1;
        goto L8
    L9:
        set(r4, r5);
        return;
    L13:
        throw new java.lang.IndexOutOfBoundsException(java.lang.String.valueOf(r4));
    }

    @Override
    public boolean add(T r6) {
        int r0 = this.Hw;
        if (r0 >= 1024) goto L6;
        this.v5[r0] = r6;
        this.Hw = r0 + 1;
        this.DW++;
        return true;
    L6:
        int r1 = this.FH + 1;
        this.FH = r1;
        T[][] r2 = this.j6;
        if (r1 != r2.length) goto L9;
        T[][] r3 = (T[][]) VH(r2.length << 1);
        T[][] r4 = this.j6;
        java.lang.System.arraycopy(r4, 0, r3, 0, r4.length);
        this.j6 = r3;
    L9:
        T[] r5 = this.j6[this.FH];
        if (r5 != null) goto L12;
        r5 = (T[]) j6();
        this.j6[this.FH] = r5;
    L12:
        r5[0] = r6;
        this.v5 = r5;
        this.Hw = 1;
        this.DW++;
        return true;
    }

    @Override
    public void clear() {
        T[][] r0 = this.j6;
        int r1 = r0.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L4;
        T[] r4 = r0[r3];
        if (r4 == null) goto L9;
        java.util.Arrays.fill(r4, null);
    L9:
        r3 = r3 + 1;
        goto L3
    L4:
        this.DW = 0;
        this.FH = 0;
        this.Hw = 0;
        this.v5 = this.j6[0];
    }

    @Override
    public T get(int r3) {
        if (r3 < 0) goto L8;
        if (this.DW <= r3) goto L8;
        return this.j6[u7(r3)][gn(r3)];
    L8:
        throw new java.lang.IndexOutOfBoundsException(java.lang.String.valueOf(r3));
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new abcd.lK.a(this, null);
    }

    public void j6(T[] r4, int r5, int r6) {
    L2:
        if (r6 <= 0) goto L3;
        int r0 = this.Hw;
        int r1 = java.lang.Math.min(r6, 1024 - r0);
        if (r1 == 0) goto L6;
        java.lang.System.arraycopy(r4, r5, this.v5, r0, r1);
        this.Hw += r1;
        this.DW += r1;
        r5 = r5 + r1;
        r6 = r6 - r1;
        goto L2
    L6:
        add(r4[r5]);
        r6 = r6 - 1;
        r5 = r5 + 1;
        goto L2
    }

    @Override
    public T remove(int r5) {
        int r0 = this.DW;
        if (r5 != (r0 - 1)) goto L9;
        T[] r1 = this.j6[u7(r5)];
        int r6 = gn(r5);
        T r2 = r1[r6];
        r1[r6] = null;
        this.DW--;
        int r7 = this.Hw;
        if (r7 <= 0) goto L7;
        this.Hw = r7 - 1;
    L8:
        return r2;
    L7:
        DW();
        goto L8
    L9:
        if (r5 < 0) goto L18;
        if (r0 <= r5) goto L18;
        T r3 = get(r5);
    L12:
        int r4 = this.DW;
        if (r5 >= (r4 - 1)) goto L14;
        int r8 = r5 + 1;
        set(r5, get(r8));
        r5 = r8;
        goto L12
    L14:
        set(r4 - 1, null);
        this.DW--;
        DW();
        return r3;
    L18:
        throw new java.lang.IndexOutOfBoundsException(java.lang.String.valueOf(r5));
    }

    @Override
    public T set(int r3, T r4) {
        if (r3 < 0) goto L8;
        if (this.DW <= r3) goto L8;
        T[] r0 = this.j6[u7(r3)];
        int r5 = gn(r3);
        T r1 = r0[r5];
        r0[r5] = r4;
        return r1;
    L8:
        throw new java.lang.IndexOutOfBoundsException(java.lang.String.valueOf(r3));
    }

    @Override
    public int size() {
        return this.DW;
    }
}
