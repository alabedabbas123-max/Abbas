package a;

public class ak {

    private final a.h f19a;

    public ak(a.h r1) {
        this.f19a = r1;
    }

    public boolean a() {
        a.am r2 = null;
        a.d r3 = null;
        a.d r4 = null;
        int r1 = 0;
        a.e r5 = null;
        int r6 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        r2 = new a.am(null);
                        r2.a(this.f19a.h);
                        r3 = this.f19a.b;
                        r4 = this.f19a.c;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.IllegalStateException) { $pc0 = 17; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r3 == null) { $pc0 = 9; continue $sw0; }
                    r1 = 0;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r1 >= r3.b()) { $pc0 = 9; continue $sw0; }
                    try {
                        r5 = r3.a(r1);
                        r2.a(r5.b(), r5.c());
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.IllegalStateException) { $pc0 = 17; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (r4 == null) { $pc0 = 14; continue $sw0; }
                    r6 = 0;
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    if (r6 >= r4.b()) { $pc0 = 14; continue $sw0; }
                    try {
                        r2.a(r4.a(r6).b(), false);
                        r6 = r6 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.IllegalStateException) { $pc0 = 17; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    try {
                        r2.a(this.f19a.y);
                        r2.a(this.f19a.z);
                        r2.a(this.f19a.A);
                        r2.a(this.f19a.B);
                        r2.b(this.f19a.j);
                        r2.b(this.f19a.l);
                        r2.b(this.f19a.x);
                        r2.b(this.f19a.V);
                        r2.b(this.f19a.W);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.IllegalStateException) { $pc0 = 17; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    a.j.l.a("The output seems up to date");
                    return true;
                }
                case 23: {
                    return false;
                }
                case 17: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
