package abcd;

public class ClassX<K, V> {
    static int DW;
    static java.lang.Object[] FH;
    static int Hw;
    static java.lang.Object[] j6;
    int VH;
    java.lang.Object[] Zo;
    int[] v5;

    public ClassX() {
        this.v5 = abcd.ClassN.j6;
        this.Zo = abcd.ClassN.FH;
        this.VH = 0;
    }

    public ClassX(int r1) {
        if (r1 != 0) goto L5;
        this.v5 = abcd.ClassN.j6;
        this.Zo = abcd.ClassN.FH;
    L6:
        this.VH = 0;
        return;
    L5:
        v5(r1);
        goto L6
    }

    private static int j6(int[] r0, int r1, int r2) {
        return abcd.ClassN.j6(r0, r1, r2);
    L5:
        throw new java.util.ConcurrentModificationException();
    }

    private static void j6(int[] r7, java.lang.Object[] r8, int r9) {
        if (r7.length != 8) goto L18;
        monitor-enter(abcd.ClassK.class);
    L14:
        th = move-exception;
        throw th;
    L7:
        if (Hw >= 10) goto L12;
        r8[0] = FH;     // Catch: java.lang.Throwable -> L14
        r8[1] = r7;     // Catch: java.lang.Throwable -> L14
        int r10 = (r9 << 1) - 1;     // Catch: java.lang.Throwable -> L14
    L9:
        if (r10 < 2) goto L11;
        r8[r10] = null;     // Catch: java.lang.Throwable -> L14
        r10 = r10 - 1;     // Catch: java.lang.Throwable -> L14
        goto L9
    L11:
        FH = r8;     // Catch: java.lang.Throwable -> L14
        Hw++;     // Catch: java.lang.Throwable -> L14
    L12:
        monitor-exit(abcd.ClassK.class);     // Catch: java.lang.Throwable -> L14
        return;
    L18:
        if (r7.length == 4) goto L20;
        return;
    L20:
        monitor-enter(abcd.ClassK.class);
    L29:
        th = move-exception;
        throw th;
    L22:
        if (DW >= 10) goto L27;
        r8[0] = j6;     // Catch: java.lang.Throwable -> L29
        r8[1] = r7;     // Catch: java.lang.Throwable -> L29
        int r11 = (r9 << 1) - 1;     // Catch: java.lang.Throwable -> L29
    L24:
        if (r11 < 2) goto L26;
        r8[r11] = null;     // Catch: java.lang.Throwable -> L29
        r11 = r11 - 1;     // Catch: java.lang.Throwable -> L29
        goto L24
    L26:
        j6 = r8;     // Catch: java.lang.Throwable -> L29
        DW++;     // Catch: java.lang.Throwable -> L29
    L27:
        monitor-exit(abcd.ClassK.class);     // Catch: java.lang.Throwable -> L29
    }

    private void v5(int r6) {
        if (r6 != 8) goto L17;
        monitor-enter(abcd.ClassK.class);
    L13:
        th = move-exception;
        throw th;
    L7:
        if (FH == null) goto L11;
        java.lang.Object[] r7 = FH;     // Catch: java.lang.Throwable -> L13
        this.Zo = r7;     // Catch: java.lang.Throwable -> L13
        FH = (java.lang.Object[]) r7[0];     // Catch: java.lang.Throwable -> L13
        this.v5 = (int[]) r7[1];     // Catch: java.lang.Throwable -> L13
        r7[1] = null;     // Catch: java.lang.Throwable -> L13
        r7[0] = null;     // Catch: java.lang.Throwable -> L13
        Hw--;     // Catch: java.lang.Throwable -> L13
        monitor-exit(abcd.ClassK.class);     // Catch: java.lang.Throwable -> L13
        return;
    L11:
        monitor-exit(abcd.ClassK.class);     // Catch: java.lang.Throwable -> L13
    L30:
        this.v5 = new int[r6];
        this.Zo = new java.lang.Object[r6 << 1];
        return;
    L17:
        if (r6 != 4) goto L30;
        monitor-enter(abcd.ClassK.class);
    L27:
        th = move-exception;
        throw th;
    L21:
        if (j6 == null) goto L25;
        java.lang.Object[] r8 = j6;     // Catch: java.lang.Throwable -> L27
        this.Zo = r8;     // Catch: java.lang.Throwable -> L27
        j6 = (java.lang.Object[]) r8[0];     // Catch: java.lang.Throwable -> L27
        this.v5 = (int[]) r8[1];     // Catch: java.lang.Throwable -> L27
        r8[1] = null;     // Catch: java.lang.Throwable -> L27
        r8[0] = null;     // Catch: java.lang.Throwable -> L27
        DW--;     // Catch: java.lang.Throwable -> L27
        monitor-exit(abcd.ClassK.class);     // Catch: java.lang.Throwable -> L27
        return;
    L25:
        monitor-exit(abcd.ClassK.class);     // Catch: java.lang.Throwable -> L27
        goto L30
    }

    int DW(java.lang.Object r6) {
        int r0 = this.VH * 2;
        java.lang.Object[] r1 = this.Zo;
        if (r6 != null) goto L11;
        int r7 = 1;
    L5:
        if (r7 >= r0) goto L18;
        if (r1[r7] == null) goto L9;
        r7 = r7 + 2;
        goto L5
    L9:
        return r7 >> 1;
    L18:
        return -1;
    L11:
        int r3 = 1;
    L12:
        if (r3 >= r0) goto L24;
        if (r6.equals(r1[r3]) == true) goto L16;
        r3 = r3 + 2;
        goto L12
    L16:
        return r3 >> 1;
    L24:
        return -1;
    }

    public K DW(int r2) {
        return (K) this.Zo[r2 << 1];
    }

    public V FH(int r11) {
        java.lang.Object[] r0 = this.Zo;
        int r1 = r11 << 1;
        V r2 = (V) r0[r1 + 1];
        int r3 = this.VH;
        if (r3 > 1) goto L5;
        j6(this.v5, r0, r3);
        this.v5 = abcd.ClassN.j6;
        this.Zo = abcd.ClassN.FH;
        int r4 = 0;
    L23:
        if (r3 != this.VH) goto L27;
        this.VH = r4;
        return r2;
    L27:
        throw new java.util.ConcurrentModificationException();
    L5:
        r4 = r3 - 1;
        int[] r6 = this.v5;
        int r8 = 8;
        if (r6.length > 8) goto L8;
    L19:
        if (r11 >= r4) goto L21;
        int[] r5 = this.v5;
        int r7 = r11 + 1;
        int r9 = r4 - r11;
        java.lang.System.arraycopy(r5, r7, r5, r11, r9);
        java.lang.Object[] r12 = this.Zo;
        java.lang.System.arraycopy(r12, r7 << 1, r12, r1, r9 << 1);
    L21:
        java.lang.Object[] r13 = this.Zo;
        int r10 = r4 << 1;
        r13[r10] = null;
        r13[r10 + 1] = null;
        goto L23
    L8:
        if (r3 >= (r6.length / 3)) goto L19;
        if (r3 <= 8) goto L11;
        r8 = r3 + (r3 >> 1);
    L11:
        int[] r14 = this.v5;
        java.lang.Object[] r15 = this.Zo;
        v5(r8);
        if (r3 != this.VH) goto L18;
        if (r11 <= 0) goto L15;
        java.lang.System.arraycopy(r14, 0, this.v5, 0, r11);
        java.lang.System.arraycopy(r15, 0, this.Zo, 0, r1);
    L15:
        if (r11 >= r4) goto L23;
        int r16 = r11 + 1;
        int r17 = r4 - r11;
        java.lang.System.arraycopy(r14, r16, this.v5, r11, r17);
        java.lang.System.arraycopy(r15, r16 << 1, this.Zo, r1, r17 << 1);
        goto L23
    L18:
        throw new java.util.ConcurrentModificationException();
    }

    public V Hw(int r2) {
        return (V) this.Zo[(r2 << 1) + 1];
    }

    public void clear() {
        int r0 = this.VH;
        if (r0 <= 0) goto L6;
        int[] r1 = this.v5;
        java.lang.Object[] r2 = this.Zo;
        this.v5 = abcd.ClassN.j6;
        this.Zo = abcd.ClassN.FH;
        this.VH = 0;
        j6(r1, r2, r0);
    L6:
        if (this.VH > 0) goto L9;
        return;
    L9:
        throw new java.util.ConcurrentModificationException();
    }

    public boolean containsKey(java.lang.Object r1) {
        if (j6(r1) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean containsValue(java.lang.Object r1) {
        if (DW(r1) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean equals(java.lang.Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if ((r7 instanceof abcd.ClassX) == false) goto L26;
        abcd.ClassX r8 = (abcd.ClassX) r7;
        if (size() == r8.size()) goto L10;
        return false;
    L10:
        int r1 = 0;
    L48:
        if (r1 >= this.VH) goto L23;
        K r3 = DW(r1);     // Catch: java.lang.Throwable -> L24
        V r4 = Hw(r1);     // Catch: java.lang.Throwable -> L24
        java.lang.Object r5 = r8.get(r3);     // Catch: java.lang.Throwable -> L24
        if (r4 != null) goto L20;
        if (r5 != null) goto L18;
        if (r8.containsKey(r3) == false) goto L18;
    L22:
        r1 = r1 + 1;
    L18:
        return false;
    L20:
        if (r4.equals(r5) == true) goto L22;
        return false;
    L23:
        return true;
    L24:
        return false;
    L26:
        if ((r7 instanceof java.util.Map) == false) goto L44;
        java.util.Map r9 = (java.util.Map) r7;
        if (size() == r9.size()) goto L30;
        return false;
    L30:
        int r2 = 0;
    L46:
        if (r2 >= this.VH) goto L43;
        K r6 = DW(r2);     // Catch: java.lang.Throwable -> L45
        V r10 = Hw(r2);     // Catch: java.lang.Throwable -> L45
        java.lang.Object r11 = r9.get(r6);     // Catch: java.lang.Throwable -> L45
        if (r10 != null) goto L40;
        if (r11 != null) goto L38;
        if (r9.containsKey(r6) == false) goto L38;
    L42:
        r2 = r2 + 1;
    L38:
        return false;
    L40:
        if (r10.equals(r11) == true) goto L42;
        return false;
    L43:
        return true;
    L44:
        return false;
    }

    public V get(java.lang.Object r2) {
        int r3 = j6(r2);
        if (r3 >= 0) goto L7;
        return null;
    L7:
        return (V) this.Zo[(r3 << 1) + 1];
    }

    public int hashCode() {
        int[] r0 = this.v5;
        java.lang.Object[] r1 = this.Zo;
        int r2 = this.VH;
        int r3 = 0;
        int r5 = 0;
        int r6 = 1;
    L3:
        if (r3 >= r2) goto L9;
        java.lang.Object r7 = r1[r6];
        int r8 = r0[r3];
        if (r7 != null) goto L7;
        int r9 = 0;
    L8:
        r5 = r5 + (r9 ^ r8);
        r3 = r3 + 1;
        r6 = r6 + 2;
        goto L3
    L7:
        r9 = r7.hashCode();
        goto L8
    L9:
        return r5;
    }

    public boolean isEmpty() {
        if (this.VH > 0) goto L5;
        return true;
    L5:
        return false;
    }

    int j6() {
        int r0 = this.VH;
        if (r0 != 0) goto L5;
        return -1;
    L5:
        int r2 = j6(this.v5, r0, 0);
        if (r2 >= 0) goto L9;
        return r2;
    L9:
        if (this.Zo[r2 << 1] != null) goto L11;
        return r2;
    L11:
        int r3 = r2 + 1;
    L12:
        if (r3 >= r0) goto L19;
        if (this.v5[r3] != 0) goto L19;
        if (this.Zo[r3 << 1] == null) goto L17;
        r3 = r3 + 1;
        goto L12
    L17:
        return r3;
    L19:
        int r4 = r2 - 1;
    L20:
        if (r4 < 0) goto L28;
        if (this.v5[r4] != 0) goto L28;
        if (this.Zo[r4 << 1] == null) goto L25;
        r4 = r4 - 1;
        goto L20
    L25:
        return r4;
    L28:
        return r3 ^ (-1);
    }

    public int j6(java.lang.Object r2) {
        if (r2 != null) goto L5;
        return j6();
    L5:
        return j6(r2, r2.hashCode());
    }

    int j6(java.lang.Object r7, int r8) {
        int r0 = this.VH;
        if (r0 != 0) goto L5;
        return -1;
    L5:
        int r2 = j6(this.v5, r0, r8);
        if (r2 >= 0) goto L9;
        return r2;
    L9:
        if (r7.equals(this.Zo[r2 << 1]) == false) goto L11;
        return r2;
    L11:
        int r3 = r2 + 1;
    L12:
        if (r3 >= r0) goto L19;
        if (this.v5[r3] != r8) goto L19;
        if (r7.equals(this.Zo[r3 << 1]) == true) goto L17;
        r3 = r3 + 1;
        goto L12
    L17:
        return r3;
    L19:
        int r4 = r2 - 1;
    L20:
        if (r4 < 0) goto L28;
        if (this.v5[r4] != r8) goto L28;
        if (r7.equals(this.Zo[r4 << 1]) == true) goto L25;
        r4 = r4 - 1;
        goto L20
    L25:
        return r4;
    L28:
        return r3 ^ (-1);
    }

    public V j6(int r3, V r4) {
        int r5 = (r3 << 1) + 1;
        java.lang.Object[] r0 = this.Zo;
        V r1 = (V) r0[r5];
        r0[r5] = r4;
        return r1;
    }

    public void j6(int r6) {
        int r0 = this.VH;
        int[] r1 = this.v5;
        if (r1.length >= r6) goto L9;
        java.lang.Object[] r2 = this.Zo;
        v5(r6);
        if (this.VH <= 0) goto L7;
        java.lang.System.arraycopy(r1, 0, this.v5, 0, r0);
        java.lang.System.arraycopy(r2, 0, this.Zo, 0, r0 << 1);
    L7:
        j6(r1, r2, r0);
    L9:
        if (this.VH != r0) goto L12;
        return;
    L12:
        throw new java.util.ConcurrentModificationException();
    }

    public V put(K r10, V r11) {
        int r0 = this.VH;
        if (r10 != null) goto L5;
        int r2 = j6();
        int r3 = 0;
    L6:
        if (r2 < 0) goto L9;
        int r12 = (r2 << 1) + 1;
        java.lang.Object[] r1 = this.Zo;
        V r4 = (V) r1[r12];
        r1[r12] = r11;
        return r4;
    L9:
        int r5 = r2 ^ (-1);
        if (r0 < this.v5.length) goto L24;
        int r6 = 4;
        if (r0 < 8) goto L14;
        r6 = (r0 >> 1) + r0;
    L16:
        int[] r7 = this.v5;
        java.lang.Object[] r8 = this.Zo;
        v5(r6);
        if (r0 != this.VH) goto L23;
        int[] r9 = this.v5;
        if (r9.length <= 0) goto L21;
        java.lang.System.arraycopy(r7, 0, r9, 0, r7.length);
        java.lang.System.arraycopy(r8, 0, this.Zo, 0, r8.length);
    L21:
        j6(r7, r8, r0);
        goto L24
    L23:
        throw new java.util.ConcurrentModificationException();
    L14:
        if (r0 < 4) goto L16;
        r6 = 8;
    L24:
        if (r5 >= r0) goto L26;
        int[] r13 = this.v5;
        int r14 = r5 + 1;
        java.lang.System.arraycopy(r13, r5, r13, r14, r0 - r5);
        java.lang.Object[] r15 = this.Zo;
        java.lang.System.arraycopy(r15, r5 << 1, r15, r14 << 1, (this.VH - r5) << 1);
    L26:
        int r16 = this.VH;
        if (r0 != r16) goto L33;
        int[] r17 = this.v5;
        if (r5 >= r17.length) goto L33;
        r17[r5] = r3;
        java.lang.Object[] r18 = this.Zo;
        int r19 = r5 << 1;
        r18[r19] = r10;
        r18[r19 + 1] = r11;
        this.VH = r16 + 1;
        return null;
    L33:
        throw new java.util.ConcurrentModificationException();
    L5:
        int r20 = r10.hashCode();
        r3 = r20;
        r2 = j6(r10, r20);
        goto L6
    }

    public V remove(java.lang.Object r1) {
        int r2 = j6(r1);
        if (r2 >= 0) goto L5;
        return null;
    L5:
        return FH(r2);
    }

    public int size() {
        return this.VH;
    }

    public java.lang.String toString() {
        if (isEmpty() == false) goto L6;
        return "{}";
    L6:
        java.lang.StringBuilder r0 = new java.lang.StringBuilder(this.VH * 28);
        r0.append('{');
        int r1 = 0;
    L8:
        if (r1 >= this.VH) goto L20;
        if (r1 <= 0) goto L11;
        r0.append(", ");
    L11:
        K r2 = DW(r1);
        if (r2 == this) goto L14;
        r0.append(r2);
    L15:
        r0.append('=');
        V r3 = Hw(r1);
        if (r3 == this) goto L18;
        r0.append(r3);
    L19:
        r1 = r1 + 1;
        goto L8
    L18:
        r0.append("(this Map)");
        goto L19
    L14:
        r0.append("(this Map)");
        goto L15
    L20:
        r0.append('}');
        return r0.toString();
    }
}
