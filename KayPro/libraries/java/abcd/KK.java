package abcd;

public class KK<T extends abcd.ME> implements java.lang.Iterable<abcd.ME> {
    private static final KK<abcd.ME> j6 = null;
    private final abcd.ME[] DW;
    private final int FH;

    public static class a<T extends abcd.ME> {
        private int DW;
        private abcd.ME[] j6;

        public a() {
            this(16);
        }

        public a(int r1) {
            this.j6 = new abcd.ME[r1];
        }

        public void DW() {
            java.util.Arrays.sort(this.j6, 0, this.DW, abcd.NE.j6);
        }

        public void DW(int r4) {
            abcd.ME[] r0 = this.j6;
            int r1 = r4 + 1;
            java.lang.System.arraycopy(r0, r1, r0, r4, this.DW - r1);
            this.DW--;
        }

        public KK<T> FH() {
            return new abcd.KK(this.j6, this.DW);
        }

        public int j6() {
            return this.DW;
        }

        public T j6(int r2) {
            return (T) this.j6[r2];
        }

        public void j6(int r2, T r3) {
            this.j6[r2] = r3;
        }

        public void j6(T r5) {
            abcd.ME[] r0 = this.j6;
            int r1 = r0.length;
            int r2 = this.DW;
            if (r1 != r2) goto L5;
            abcd.ME[] r3 = new abcd.ME[r2 * 2];
            java.lang.System.arraycopy(r0, 0, r3, 0, r2);
            this.j6 = r3;
        L5:
            abcd.ME[] r4 = this.j6;
            int r6 = this.DW;
            this.DW = r6 + 1;
            r4[r6] = r5;
        }

        public void j6(abcd.ME[] r5, int r6, int r7) {
            int r0 = this.j6.length;
            int r1 = this.DW;
            if (r0 >= (r1 + r7)) goto L5;
            abcd.ME[] r2 = new abcd.ME[java.lang.Math.max(r1 * 2, r1 + r7)];
            java.lang.System.arraycopy(this.j6, 0, r2, 0, this.DW);
            this.j6 = r2;
        L5:
            java.lang.System.arraycopy(r5, r6, this.j6, this.DW, r7);
            this.DW += r7;
        }

        public java.lang.String toString() {
            return FH().toString();
        }
    }

    static {
        j6 = new abcd.KK(new abcd.ME[0], 0);
    }

    protected KK(KK<T> r2) {
        this.DW = r2.DW;
        this.FH = r2.FH;
    }

    KK(abcd.ME[] r1, int r2) {
        this.DW = r1;
        this.FH = r2;
    }

    public static <T extends abcd.ME> KK<T> DW() {
        return (KK<T>) j6;
    }

    static abcd.ME[] DW(abcd.KK r0) {
        return r0.DW;
    }

    static int j6(abcd.KK r0) {
        return r0.FH;
    }

    public final int DW(java.lang.String r5) {
        int r0 = this.FH;
        if (r0 != 0) goto L6;
        return -1;
    L6:
        int r1 = 0;
    L7:
        int r2 = (r1 + r0) >>> 1;
        int r3 = abcd.NE.j6(this.DW[r2], r5);
        if (r3 >= 0) goto L10;
        r1 = r2 + 1;
    L13:
        if (r1 < r0) goto L7;
        return -(r1 + 1);
    L10:
        if (r3 == 0) goto L11;
        r0 = r2;
        goto L13
    L11:
        return r2;
    }

    public final KK<T> DW(int r5, T r6) {
        int r0 = this.FH;
        abcd.ME[] r1 = new abcd.ME[r0];
        java.lang.System.arraycopy(this.DW, 0, r1, 0, r0);
        r1[r5] = r6;
        return new abcd.KK(r1, this.FH);
    }

    public final T FH(java.lang.String r1) {
        int r2 = DW(r1);
        if (r2 >= 0) goto L7;
        return null;
    L7:
        return (T) get(r2);
    }

    public final T get(int r2) {
        return (T) this.DW[r2];
    }

    public final boolean isEmpty() {
        if (this.FH != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override
    public java.util.Iterator<abcd.ME> iterator() {
        return new abcd.JK(this);
    }

    public final KK<T> j6(int r4, T r5) {
        if (r4 >= 0) goto L4;
        r4 = -(r4 + 1);
    L4:
        abcd.ME[] r0 = new abcd.ME[this.FH + 1];
        if (r4 <= 0) goto L7;
        java.lang.System.arraycopy(this.DW, 0, r0, 0, r4);
    L7:
        r0[r4] = r5;
        int r6 = this.FH;
        if (r4 >= r6) goto L11;
        java.lang.System.arraycopy(this.DW, r4, r0, r4 + 1, r6 - r4);
    L11:
        return new abcd.KK(r0, this.FH + 1);
    }

    public final KK<T> j6(T r2) {
        int r0 = DW(r2.getName());
        if (r0 < 0) goto L7;
        return DW(r0, r2);
    L7:
        return j6(r0, r2);
    }

    public final java.util.List<abcd.ME> j6() {
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(this.DW).subList(0, this.FH));
    }

    public final boolean j6(java.lang.String r1) {
        if (DW(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final KK<T> remove(int r6) {
        int r0 = this.FH;
        if (r0 == 1) goto L5;
        abcd.ME[] r1 = new abcd.ME[r0 - 1];
        if (r6 <= 0) goto L9;
        java.lang.System.arraycopy(this.DW, 0, r1, 0, r6);
    L9:
        int r2 = r6 + 1;
        int r3 = this.FH;
        if (r2 >= r3) goto L13;
        java.lang.System.arraycopy(this.DW, r2, r1, r6, r3 - r2);
    L13:
        return new abcd.KK(r1, this.FH - 1);
    L5:
        return DW();
    }

    public final int size() {
        return this.FH;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append('[');
        if (this.FH <= 0) goto L9;
        r0.append(this.DW[0]);
        int r1 = 1;
    L6:
        if (r1 >= this.FH) goto L9;
        r0.append(", ");
        r0.append(this.DW[r1]);
        r1 = r1 + 1;
    L9:
        r0.append(']');
        return r0.toString();
    }

    public final KK.a<T> v5(int r4) {
        abcd.KK.a r0 = new abcd.KK.a(java.lang.Math.max(16, r4));
        r0.j6(this.DW, 0, r4);
        return r0;
    }
}
