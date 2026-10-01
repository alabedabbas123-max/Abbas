package a;

public class ad extends a.an {

    private final java.io.LineNumberReader f13a;
    private final java.lang.String b;

    public ad(java.io.LineNumberReader r1, java.lang.String r2, java.io.File r3) {
        super(r3);
        this.f13a = r1;
        this.b = r2;
    }

    @Override
    protected java.lang.String a() {
        return this.f13a.readLine();
    }

    @Override
    protected java.lang.String b() {
        return "line " + this.f13a.getLineNumber() + " of " + this.b;
    }

    @Override
    public void c() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super.c();
                    if (this.f13a == null) { $pc0 = 6; continue $sw0; }
                    this.f13a.close();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
