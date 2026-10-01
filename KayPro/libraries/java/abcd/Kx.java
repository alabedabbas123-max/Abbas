package abcd;

final class Kx extends java.lang.ref.WeakReference<java.lang.Throwable> {
    private final int j6;

    public Kx(java.lang.Throwable r1, java.lang.ref.ReferenceQueue<java.lang.Throwable> r2) {
        super(r1, r2);
        if (r1 == null) goto L7;
        this.j6 = java.lang.System.identityHashCode(r1);
        return;
    L7:
        throw new java.lang.NullPointerException("The referent cannot be null");
    }

    public final boolean equals(java.lang.Object r5) {
        if (r5 != null) goto L5;
    L15:
        return false;
    L5:
        if (r5.getClass() != abcd.Kx.class) goto L15;
        if (this != r5) goto L10;
        return true;
    L10:
        abcd.Kx r6 = (abcd.Kx) r5;
        if (this.j6 != r6.j6) goto L15;
        if (get() != r6.get()) goto L15;
        return true;
    }

    public final int hashCode() {
        return this.j6;
    }
}
