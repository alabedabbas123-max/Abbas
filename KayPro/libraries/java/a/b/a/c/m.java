package a.b.a.c;

public abstract class m implements a.b.o {
    public int e;
    public java.lang.Object f;

    public m() {
    }

    public abstract int a();

    public abstract void a(a.b.c r1, a.b.j r2, a.b.a.d r3, int r4, a.b.a.c.a.a r5);

    @Override
    public void a(java.lang.Object r1) {
        this.f = r1;
    }

    public int b() {
        return this.e;
    }

    public boolean equals(java.lang.Object r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r4 != null) { $pc0 = 5; continue $sw0; }
                    return false;
                }
                case 5: {
                    if (getClass() == r4.getClass()) { $pc0 = 8; continue $sw0; }
                    return false;
                }
                case 8: {
                    if (this.e != ((a.b.a.c.m) r4).e) { $pc0 = 11; continue $sw0; }
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.Object f() {
        return this.f;
    }

    public int hashCode() {
        return getClass().hashCode() ^ this.e;
    }

    public java.lang.String toString() {
        return "[" + this.e + "] ";
    }
}
