package a.b;

public class b {

    private final java.util.Map f79a;

    public b() {
        this.f79a = new java.util.TreeMap();
    }

    public a.b.c a(java.lang.String r2) {
        return (a.b.c) this.f79a.get(r2);
    }

    public void a() {
        this.f79a.clear();
    }

    public void a(a.b.c r3) {
        this.f79a.put(r3.b(), r3);
    }

    public void a(a.b.g.n r1) {
        r1.a(this);
    }

    public void a(a.b.g.s r3) {
        java.util.Iterator r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = this.f79a.values().iterator();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc0 = 6; continue $sw0; }
                    ((a.b.c) r1.next()).a(r3);
                    { $pc0 = 4; continue $sw0; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a(java.lang.String r2, a.b.g.s r3) {
        a.b.c r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = a(r2);
                    if (r0 == null) { $pc1 = 6; continue $sw1; }
                    r0.a(r3);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.Iterator b() {
        return this.f79a.keySet().iterator();
    }

    public void b(a.b.g.s r3) {
        java.util.Iterator r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r1 = this.f79a.values().iterator();
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc2 = 6; continue $sw2; }
                    ((a.b.c) r1.next()).a(r3);
                    { $pc2 = 4; continue $sw2; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int c() {
        return this.f79a.size();
    }
}
