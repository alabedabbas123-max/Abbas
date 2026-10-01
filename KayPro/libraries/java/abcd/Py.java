package abcd;

public abstract class Py<T> implements Ry<T> {
    private final Ry<T> j6;

    public Py(Ry<T> r1) {
        this.j6 = r1;
    }

    private void DW(android.content.Context r1, T r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == null) { $pc0 = 6; continue $sw0; }
                    j6(r1, r2);
                    return;
                }
                case 6: {
                    throw new java.lang.NullPointerException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract T j6(android.content.Context r1);

    public final synchronized T j6(android.content.Context r2, Sy<T> r3) {
        synchronized (this) {
            T r0 = null;
            java.lang.Object r4 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        try {
                            r0 = j6(r2);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 12; continue $sw1;
                        }
                        if (r0 == null) { $pc1 = 6; continue $sw1; }
                        $pc1 = 10; continue $sw1;
                    }
                    case 10: {
                        return r0;
                    }
                    case 6: {
                        if (this.j6 == null) { $pc1 = 8; continue $sw1; }
                        try {
                            r4 = this.j6.j6(r2, r3);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 12; continue $sw1;
                        }
                        $pc1 = 9; continue $sw1;
                    }
                    case 9: {
                        r0 = (T) r4;
                        try {
                            DW(r2, r0);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 12; continue $sw1;
                        }
                        { $pc1 = 10; continue $sw1; }
                    }
                    case 8: {
                        try {
                            r4 = r3.j6(r2);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 12; continue $sw1;
                        }
                        throw new java.lang.IllegalStateException();
                    }
                    case 12: {
                        th = $ex1;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    protected abstract void j6(android.content.Context r1, T r2);
}
