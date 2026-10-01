package a;

public class a extends a.an {

    private final java.lang.String[] f0a;
    private int b;

    public a(java.lang.String[] r2, java.io.File r3) {
        super(r3);
        this.b = 0;
        this.f0a = r2;
    }

    @Override
    protected java.lang.String a() {
        java.lang.String[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.b >= this.f0a.length) { $pc0 = 6; continue $sw0; }
                    r0 = this.f0a;
                    r1 = this.b;
                    this.b = r1 + 1;
                    return r0[r1];
                }
                case 6: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected java.lang.String b() {
        return "argument number " + this.b;
    }
}
