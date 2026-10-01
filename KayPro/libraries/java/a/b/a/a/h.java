package a.b.a.a;

public abstract class h implements a.b.o {
    public int c;
    public a.b.c d;
    public a.b.j e;
    public java.lang.Object f;

    protected h() {
    }

    protected h(int r1) {
        this.c = r1;
    }

    public abstract char a();

    public abstract void a(a.b.c r1, a.b.a.a.a r2, a.b.a.a.b.g r3);

    public void a(a.b.g.aq r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.e == null) { $pc0 = 6; continue $sw0; }
                    this.e.a(this.d, r3);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void a(java.lang.Object r1) {
        this.f = r1;
    }

    public java.lang.String b(a.b.c r2) {
        return r2.c(this.c);
    }

    @Override
    public java.lang.Object f() {
        return this.f;
    }
}
