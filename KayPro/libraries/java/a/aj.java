package a;

public class aj {

    private final a.h f18a;

    public aj(a.h r1) {
        this.f18a = r1;
    }

    public void a(a.b.b r4) {
        java.util.HashSet r0 = null;
        java.util.Iterator r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.f18a.T == null) { $pc0 = 15; continue $sw0; }
                    r0 = null;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r4.a(new a.b.g.r(this.f18a.g, r0));
                    if (r0 != null) { $pc0 = 8; continue $sw0; }
                    return;
                }
                case 8: {
                    if (r0.size() <= 0) { $pc0 = 26; continue $sw0; }
                    a.j.l.a("Warning: some classes have more recent versions (");
                    r1 = r0.iterator();
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    if (r1.hasNext() == false) { $pc0 = 16; continue $sw0; }
                    a.j.l.a(a.b.f.i.d(((java.lang.Integer) r1.next()).intValue()));
                    if (r1.hasNext() == false) { $pc0 = 11; continue $sw0; }
                    a.j.l.a(",");
                    { $pc0 = 11; continue $sw0; }
                }
                case 16: {
                    a.j.l.a(")");
                    a.j.l.a("         than the target version (" + a.b.f.i.d(this.f18a.g) + ").");
                    if (this.f18a.U == true) { $pc0 = 27; continue $sw0; }
                    a.j.l.a("         If you are sure this is not a problem,");
                    a.j.l.a("         you could try your luck using the '-ignorewarnings' option.");
                    throw new java.io.IOException("Please correct the above warnings first.");
                }
                case 27: {
                    return;
                }
                case 26: {
                    return;
                }
                case 15: {
                    r0 = new java.util.HashSet();
                    { $pc0 = 5; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
