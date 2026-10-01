package abcd;

public class ClassU<T> implements t<T> {
    private int DW;
    private final java.lang.Object[] j6;

    public ClassU(int r2) {
        if (r2 <= 0) goto L7;
        this.j6 = new java.lang.Object[r2];
        return;
    L7:
        throw new java.lang.IllegalArgumentException("The max pool size must be > 0");
    }

    private boolean DW(T r4) {
        int r1 = 0;
    L4:
        if (r1 >= this.DW) goto L10;
        if (this.j6[r1] == r4) goto L7;
        r1 = r1 + 1;
        goto L4
    L7:
        return true;
    L10:
        return false;
    }

    public boolean j6(T r4) {
        if (DW(r4) == true) goto L11;
        int r0 = this.DW;
        java.lang.Object[] r1 = this.j6;
        if (r0 >= r1.length) goto L8;
        r1[r0] = r4;
        this.DW = r0 + 1;
        return true;
    L8:
        return false;
    L11:
        throw new java.lang.IllegalStateException("Already in the pool!");
    }
}
