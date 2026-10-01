package abcd;

final class Jx {
    private final java.lang.ref.ReferenceQueue<java.lang.Throwable> DW;
    private final java.util.concurrent.ConcurrentHashMap<abcd.Kx, java.util.List<java.lang.Throwable>> j6;

    Jx() {
        this.j6 = new java.util.concurrent.ConcurrentHashMap(16, 0.75f, 10);
        this.DW = new java.lang.ref.ReferenceQueue();
    }

    public final java.util.List<java.lang.Throwable> j6(java.lang.Throwable r4, boolean r5) {
        java.lang.ref.Reference<? extends java.lang.Throwable> r6 = null;
        abcd.Kx r7 = null;
        java.util.List<java.lang.Throwable> r8 = null;
        java.util.Vector r9 = null;
        java.util.List<java.lang.Throwable> r10 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r6 = this.DW.poll();
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r6 == null) { $pc0 = 5; continue $sw0; }
                    this.j6.remove(r6);
                    r6 = this.DW.poll();
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    r7 = new abcd.Kx(r4, null);
                    r8 = this.j6.get(r7);
                    if (r8 == null) { $pc0 = 8; continue $sw0; }
                    return r8;
                }
                case 8: {
                    r9 = new java.util.Vector(2);
                    r10 = this.j6.putIfAbsent(new abcd.Kx(r4, this.DW), r9);
                    if (r10 != null) { $pc0 = 11; continue $sw0; }
                    return r9;
                }
                case 11: {
                    return r10;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
