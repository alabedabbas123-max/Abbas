package abcd;

public final class ClassM<E> implements java.util.Collection<E>, java.util.Set<E> {
    private static final java.lang.Object[] DW = null;
    static java.lang.Object[] FH;
    static int Hw;
    static int Zo;
    private static final int[] j6 = null;
    static java.lang.Object[] v5;
    r<E, E> EQ;
    final boolean VH;
    int[] gn;
    int tp;
    java.lang.Object[] u7;

    static {
        j6 = new int[0];
        DW = new java.lang.Object[0];
    }

    public ClassM() {
        this(0, false);
    }

    public ClassM(int r2) {
        this(r2, false);
    }

    public ClassM(int r1, boolean r2) {
        this.VH = r2;
        if (r1 != 0) goto L5;
        this.gn = j6;
        this.u7 = DW;
    L6:
        this.tp = 0;
        return;
    L5:
        gn(r1);
        goto L6
    }

    private int DW() {
        int r0 = this.tp;
        if (r0 != 0) goto L5;
        return -1;
    L5:
        int r2 = abcd.ClassN.j6(this.gn, r0, 0);
        if (r2 >= 0) goto L9;
        return r2;
    L9:
        if (this.u7[r2] != null) goto L11;
        return r2;
    L11:
        int r3 = r2 + 1;
    L12:
        if (r3 >= r0) goto L19;
        if (this.gn[r3] != 0) goto L19;
        if (this.u7[r3] == null) goto L17;
        r3 = r3 + 1;
        goto L12
    L17:
        return r3;
    L19:
        int r4 = r2 - 1;
    L20:
        if (r4 < 0) goto L28;
        if (this.gn[r4] != 0) goto L28;
        if (this.u7[r4] == null) goto L25;
        r4 = r4 - 1;
        goto L20
    L25:
        return r4;
    L28:
        return r3 ^ (-1);
    }

    private void gn(int r6) {
        if (r6 != 8) goto L17;
        monitor-enter(abcd.ClassM.class);
    L13:
        th = move-exception;
        throw th;
    L7:
        if (v5 == null) goto L11;
        java.lang.Object[] r7 = v5;     // Catch: java.lang.Throwable -> L13
        this.u7 = r7;     // Catch: java.lang.Throwable -> L13
        v5 = (java.lang.Object[]) r7[0];     // Catch: java.lang.Throwable -> L13
        this.gn = (int[]) r7[1];     // Catch: java.lang.Throwable -> L13
        r7[1] = null;     // Catch: java.lang.Throwable -> L13
        r7[0] = null;     // Catch: java.lang.Throwable -> L13
        Zo--;     // Catch: java.lang.Throwable -> L13
        monitor-exit(abcd.ClassM.class);     // Catch: java.lang.Throwable -> L13
        return;
    L11:
        monitor-exit(abcd.ClassM.class);     // Catch: java.lang.Throwable -> L13
    L30:
        this.gn = new int[r6];
        this.u7 = new java.lang.Object[r6];
        return;
    L17:
        if (r6 != 4) goto L30;
        monitor-enter(abcd.ClassM.class);
    L27:
        th = move-exception;
        throw th;
    L21:
        if (FH == null) goto L25;
        java.lang.Object[] r8 = FH;     // Catch: java.lang.Throwable -> L27
        this.u7 = r8;     // Catch: java.lang.Throwable -> L27
        FH = (java.lang.Object[]) r8[0];     // Catch: java.lang.Throwable -> L27
        this.gn = (int[]) r8[1];     // Catch: java.lang.Throwable -> L27
        r8[1] = null;     // Catch: java.lang.Throwable -> L27
        r8[0] = null;     // Catch: java.lang.Throwable -> L27
        Hw--;     // Catch: java.lang.Throwable -> L27
        monitor-exit(abcd.ClassM.class);     // Catch: java.lang.Throwable -> L27
        return;
    L25:
        monitor-exit(abcd.ClassM.class);     // Catch: java.lang.Throwable -> L27
        goto L30
    }

    private int j6(java.lang.Object r6, int r7) {
        int r0 = this.tp;
        if (r0 != 0) goto L5;
        return -1;
    L5:
        int r2 = abcd.ClassN.j6(this.gn, r0, r7);
        if (r2 >= 0) goto L9;
        return r2;
    L9:
        if (r6.equals(this.u7[r2]) == false) goto L11;
        return r2;
    L11:
        int r3 = r2 + 1;
    L12:
        if (r3 >= r0) goto L19;
        if (this.gn[r3] != r7) goto L19;
        if (r6.equals(this.u7[r3]) == true) goto L17;
        r3 = r3 + 1;
        goto L12
    L17:
        return r3;
    L19:
        int r4 = r2 - 1;
    L20:
        if (r4 < 0) goto L28;
        if (this.gn[r4] != r7) goto L28;
        if (r6.equals(this.u7[r4]) == true) goto L25;
        r4 = r4 - 1;
        goto L20
    L25:
        return r4;
    L28:
        return r3 ^ (-1);
    }

    private r<E, E> j6() {
        if (this.EQ != null) goto L6;
        this.EQ = new abcd.l(this);
    L6:
        return this.EQ;
    }

    private static void j6(int[] r7, java.lang.Object[] r8, int r9) {
        if (r7.length != 8) goto L18;
        monitor-enter(abcd.ClassM.class);
    L14:
        th = move-exception;
        throw th;
    L7:
        if (Zo >= 10) goto L12;
        r8[0] = v5;     // Catch: java.lang.Throwable -> L14
        r8[1] = r7;     // Catch: java.lang.Throwable -> L14
        int r10 = r9 - 1;     // Catch: java.lang.Throwable -> L14
    L9:
        if (r10 < 2) goto L11;
        r8[r10] = null;     // Catch: java.lang.Throwable -> L14
        r10 = r10 - 1;     // Catch: java.lang.Throwable -> L14
        goto L9
    L11:
        v5 = r8;     // Catch: java.lang.Throwable -> L14
        Zo++;     // Catch: java.lang.Throwable -> L14
    L12:
        monitor-exit(abcd.ClassM.class);     // Catch: java.lang.Throwable -> L14
        return;
    L18:
        if (r7.length == 4) goto L20;
        return;
    L20:
        monitor-enter(abcd.ClassM.class);
    L29:
        th = move-exception;
        throw th;
    L22:
        if (Hw >= 10) goto L27;
        r8[0] = FH;     // Catch: java.lang.Throwable -> L29
        r8[1] = r7;     // Catch: java.lang.Throwable -> L29
        int r11 = r9 - 1;     // Catch: java.lang.Throwable -> L29
    L24:
        if (r11 < 2) goto L26;
        r8[r11] = null;     // Catch: java.lang.Throwable -> L29
        r11 = r11 - 1;     // Catch: java.lang.Throwable -> L29
        goto L24
    L26:
        FH = r8;     // Catch: java.lang.Throwable -> L29
        Hw++;     // Catch: java.lang.Throwable -> L29
    L27:
        monitor-exit(abcd.ClassM.class);     // Catch: java.lang.Throwable -> L29
    }

    public E VH(int r2) {
        return (E) this.u7[r2];
    }

    public E Zo(int r8) {
        java.lang.Object[] r0 = this.u7;
        E r1 = (E) r0[r8];
        int r2 = this.tp;
        if (r2 > 1) goto L5;
        j6(this.gn, r0, r2);
        this.gn = j6;
        this.u7 = DW;
        this.tp = 0;
    L21:
        return r1;
    L5:
        int[] r3 = this.gn;
        int r6 = 8;
        if (r3.length > 8) goto L8;
    L17:
        this.tp--;
        int r4 = this.tp;
        if (r8 >= r4) goto L20;
        int[] r5 = this.gn;
        int r7 = r8 + 1;
        java.lang.System.arraycopy(r5, r7, r5, r8, r4 - r8);
        java.lang.Object[] r9 = this.u7;
        java.lang.System.arraycopy(r9, r7, r9, r8, this.tp - r8);
    L20:
        this.u7[this.tp] = null;
        goto L21
    L8:
        if (r2 >= (r3.length / 3)) goto L17;
        if (r2 <= 8) goto L11;
        r6 = r2 + (r2 >> 1);
    L11:
        int[] r10 = this.gn;
        java.lang.Object[] r11 = this.u7;
        gn(r6);
        this.tp--;
        if (r8 <= 0) goto L14;
        java.lang.System.arraycopy(r10, 0, this.gn, 0, r8);
        java.lang.System.arraycopy(r11, 0, this.u7, 0, r8);
    L14:
        int r12 = this.tp;
        if (r8 >= r12) goto L21;
        int r13 = r8 + 1;
        java.lang.System.arraycopy(r10, r13, this.gn, r8, r12 - r8);
        java.lang.System.arraycopy(r11, r13, this.u7, r8, this.tp - r8);
        goto L21
    }

    @Override
    public boolean add(E r9) {
        if (r9 != null) goto L6;
        int r1 = DW();
        int r2 = 0;
    L10:
        if (r1 < 0) goto L12;
        return false;
    L12:
        int r3 = r1 ^ (-1);
        int r4 = this.tp;
        if (r4 < this.gn.length) goto L23;
        int r5 = 4;
        if (r4 < 8) goto L17;
        r5 = (r4 >> 1) + r4;
    L19:
        int[] r6 = this.gn;
        java.lang.Object[] r7 = this.u7;
        gn(r5);
        int[] r8 = this.gn;
        if (r8.length <= 0) goto L22;
        java.lang.System.arraycopy(r6, 0, r8, 0, r6.length);
        java.lang.System.arraycopy(r7, 0, this.u7, 0, r7.length);
    L22:
        j6(r6, r7, this.tp);
        goto L23
    L17:
        if (r4 < 4) goto L19;
        r5 = 8;
    L23:
        int r0 = this.tp;
        if (r3 >= r0) goto L26;
        int[] r10 = this.gn;
        int r11 = r3 + 1;
        java.lang.System.arraycopy(r10, r3, r10, r11, r0 - r3);
        java.lang.Object[] r12 = this.u7;
        java.lang.System.arraycopy(r12, r3, r12, r11, this.tp - r3);
    L26:
        this.gn[r3] = r2;
        this.u7[r3] = r9;
        this.tp++;
        return true;
    L6:
        if (this.VH == false) goto L8;
        int r13 = java.lang.System.identityHashCode(r9);
    L9:
        r2 = r13;
        r1 = j6(r9, r13);
        goto L10
    L8:
        r13 = r9.hashCode();
        goto L9
    }

    @Override
    public boolean addAll(java.util.Collection<? extends E> r3) {
        v5(this.tp + r3.size());
        java.util.Iterator<? extends E> r4 = r3.iterator();
        boolean r0 = false;
    L4:
        if (r4.hasNext() == false) goto L6;
        r0 = r0 | add(r4.next());
        goto L4
    L6:
        return r0;
    }

    @Override
    public void clear() {
        int r0 = this.tp;
        if (r0 == 0) goto L6;
        j6(this.gn, this.u7, r0);
        this.gn = j6;
        this.u7 = DW;
        this.tp = 0;
        return;
    }

    @Override
    public boolean contains(java.lang.Object r1) {
        if (indexOf(r1) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override
    public boolean containsAll(java.util.Collection<?> r2) {
        java.util.Iterator<?> r3 = r2.iterator();
    L4:
        if (r3.hasNext() == false) goto L9;
        if (contains(r3.next()) == true) goto L4;
        return false;
    L9:
        return true;
    }

    @Override
    public boolean equals(java.lang.Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof java.util.Set) == false) goto L18;
        java.util.Set r6 = (java.util.Set) r5;
        if (size() == r6.size()) goto L10;
        return false;
    L10:
        int r1 = 0;
    L20:
        if (r1 >= this.tp) goto L17;
        if (r6.contains(VH(r1)) == false) goto L15;
        r1 = r1 + 1;
        goto L20
    L15:
        return false;
    L17:
        return true;
    L18:
        return false;
    }

    @Override
    public int hashCode() {
        int[] r0 = this.gn;
        int r1 = this.tp;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r3 = r3 + r0[r2];
        r2 = r2 + 1;
        goto L3
    L5:
        return r3;
    }

    public int indexOf(java.lang.Object r2) {
        if (r2 != null) goto L5;
        return DW();
    L5:
        if (this.VH == false) goto L7;
        int r0 = java.lang.System.identityHashCode(r2);
    L9:
        return j6(r2, r0);
    L7:
        r0 = r2.hashCode();
        goto L9
    }

    @Override
    public boolean isEmpty() {
        if (this.tp > 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override
    public java.util.Iterator<E> iterator() {
        return j6().v5().iterator();
    }

    @Override
    public boolean remove(java.lang.Object r1) {
        int r2 = indexOf(r1);
        if (r2 < 0) goto L6;
        Zo(r2);
        return true;
    L6:
        return false;
    }

    @Override
    public boolean removeAll(java.util.Collection<?> r3) {
        java.util.Iterator<?> r4 = r3.iterator();
        boolean r0 = false;
    L4:
        if (r4.hasNext() == false) goto L6;
        r0 = r0 | remove(r4.next());
        goto L4
    L6:
        return r0;
    }

    @Override
    public boolean retainAll(java.util.Collection<?> r5) {
        int r0 = this.tp - 1;
        boolean r2 = false;
    L3:
        if (r0 < 0) goto L8;
        if (r5.contains(this.u7[r0]) == true) goto L7;
        Zo(r0);
        r2 = true;
    L7:
        r0 = r0 - 1;
        goto L3
    L8:
        return r2;
    }

    @Override
    public int size() {
        return this.tp;
    }

    @Override
    public java.lang.Object[] toArray() {
        int r0 = this.tp;
        java.lang.Object[] r1 = new java.lang.Object[r0];
        java.lang.System.arraycopy(this.u7, 0, r1, 0, r0);
        return r1;
    }

    @Override
    public <T> T[] toArray(T[] r4) {
        if (r4.length >= this.tp) goto L5;
        r4 = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(r4.getClass().getComponentType(), this.tp));
    L5:
        T[] r5 = r4;
        java.lang.System.arraycopy(this.u7, 0, r5, 0, this.tp);
        int r0 = r4.length;
        int r1 = this.tp;
        if (r0 <= r1) goto L8;
        r4[r1] = null;
    L8:
        return r4;
    }

    public java.lang.String toString() {
        if (isEmpty() == false) goto L6;
        return "{}";
    L6:
        java.lang.StringBuilder r0 = new java.lang.StringBuilder(this.tp * 14);
        r0.append('{');
        int r1 = 0;
    L8:
        if (r1 >= this.tp) goto L16;
        if (r1 <= 0) goto L11;
        r0.append(", ");
    L11:
        E r2 = VH(r1);
        if (r2 == this) goto L14;
        r0.append(r2);
    L15:
        r1 = r1 + 1;
        goto L8
    L14:
        r0.append("(this Set)");
        goto L15
    L16:
        r0.append('}');
        return r0.toString();
    }

    public void v5(int r5) {
        int[] r0 = this.gn;
        if (r0.length >= r5) goto L9;
        java.lang.Object[] r1 = this.u7;
        gn(r5);
        int r6 = this.tp;
        if (r6 <= 0) goto L7;
        java.lang.System.arraycopy(r0, 0, this.gn, 0, r6);
        java.lang.System.arraycopy(r1, 0, this.u7, 0, this.tp);
    L7:
        j6(r0, r1, this.tp);
        return;
    }
}
