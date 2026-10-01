package abcd;

public class ClassV<T> extends u<T> {
    private final java.lang.Object FH;

    public ClassV(int r1) {
        super(r1);
        this.FH = new java.lang.Object();
    }

    public boolean j6(T r2) {
        synchronized (this.FH) {
            java.lang.Object r0 = null;
            boolean r3 = false;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = this.FH;
                        try {
                            r3 = super.j6(r2);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 7; continue $sw0;
                        }
                        return r3;
                    }
                    case 7: {
                        th = $ex0;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
