package a.b.a;

public abstract class a implements a.b.o {

    public int f23a;
    public java.lang.Object b;

    protected a() {
    }

    protected a(int r1) {
        this.f23a = r1;
    }

    public java.lang.String a(a.b.c r2) {
        return r2.c(this.f23a);
    }

    public void a(a.b.c r4, a.b.a.d.i r5) {
        throw new java.lang.UnsupportedOperationException("Method must be overridden in [" + getClass().getName() + "] if ever called");
    }

    public void a(a.b.c r4, a.b.d r5, a.b.a.d.i r6) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r5 != null) { $pc0 = 6; continue $sw0; }
                    a(r4, r6);
                    return;
                }
                case 6: {
                    throw new java.lang.UnsupportedOperationException("Method must be overridden in [" + getClass().getName() + "] if ever called");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a(a.b.c r4, a.b.j r5, a.b.a.d.i r6) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r5 != null) { $pc1 = 6; continue $sw1; }
                    a(r4, (a.b.d) null, r6);
                    return;
                }
                case 6: {
                    throw new java.lang.UnsupportedOperationException("Method must be overridden in [" + getClass().getName() + "] if ever called");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a(a.b.c r4, a.b.j r5, a.b.a.d r6, a.b.a.d.i r7) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r6 != null) { $pc2 = 6; continue $sw2; }
                    a(r4, r5, r7);
                    return;
                }
                case 6: {
                    throw new java.lang.UnsupportedOperationException("Method must be overridden in [" + getClass().getName() + "] if ever called");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void a(java.lang.Object r1) {
        this.b = r1;
    }

    @Override
    public java.lang.Object f() {
        return this.b;
    }
}
