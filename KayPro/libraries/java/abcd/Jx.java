package abcd;

final class Jx {
    private final java.lang.ref.ReferenceQueue<java.lang.Throwable> DW;
    private final java.util.concurrent.ConcurrentHashMap<abcd.Kx, java.util.List<java.lang.Throwable>> j6;

    Jx() {
        this.j6 = new java.util.concurrent.ConcurrentHashMap(16, 0.75f, 10);
        this.DW = new java.lang.ref.ReferenceQueue();
    }

    public final java.util.List<java.lang.Throwable> j6(java.lang.Throwable r4, boolean r5) {
        java.lang.ref.Reference<? extends java.lang.Throwable> r6 = this.DW.poll();
    L3:
        if (r6 == null) goto L5;
        this.j6.remove(r6);
        r6 = this.DW.poll();
        goto L3
    L5:
        abcd.Kx r7 = new abcd.Kx(r4, null);
        java.util.List<java.lang.Throwable> r8 = this.j6.get(r7);
        if (r8 == null) goto L8;
        return r8;
    L8:
        java.util.Vector r9 = new java.util.Vector(2);
        java.util.List<java.lang.Throwable> r10 = this.j6.putIfAbsent(new abcd.Kx(r4, this.DW), r9);
        if (r10 != null) goto L11;
        return r9;
    L11:
        return r10;
    }
}
