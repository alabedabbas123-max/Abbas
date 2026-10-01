package abcd;

public abstract class Abstractlv extends abcd.Abstractjw implements com.appfour.backbone.api.runtime.a {
    private java.lang.Object v5;

    @java.lang.FunctionalInterface
    public interface a {
        com.appfour.backbone.api.objects.EventData getValue();
    }

    public Abstractlv() {
    }

    public com.appfour.backbone.api.objects.EventData j6(java.lang.Object r2, abcd.Abstractlv.a r3) {
        com.appfour.backbone.api.objects.EventData r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        this.v5 = r2;
                        r4 = r3.getValue();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 6; continue $sw0;
                    }
                    this.v5 = null;
                    return r4;
                }
                case 6: {
                    th = $ex0;
                    this.v5 = null;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.Class<?> j6(long r1) {
        return abcd.Ev.j6(r1);
    }

    @Override
    public <T> T j6(java.lang.Class<T> r2) {
        return (T) abcd.Ev.j6(this.v5, r2);
    }

    @Override
    public java.lang.Object j6(java.lang.Object r1, long r2, long r4) {
        java.lang.reflect.Field r3 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        r3 = abcd.Ev.j6(r2, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 8; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r3 == null) { $pc1 = 7; continue $sw1; }
                    try {
                        r3.setAccessible(true);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 8; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r3.get(r1);
                }
                case 7: {
                    try {
                        throw new java.lang.IllegalAccessError("Field not found");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 8; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 8: {
                    e = $ex1;
                    throw new java.lang.IllegalAccessError(e.getMessage());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.Object j6(java.lang.Object r1, java.lang.Object[] r2, long r3, long r5) {
        java.lang.reflect.Method r4 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    try {
                        r4 = abcd.Ev.DW(r3, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 8; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r4 == null) { $pc2 = 7; continue $sw2; }
                    try {
                        r4.setAccessible(true);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 8; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r4.invoke(r1, r2);
                }
                case 7: {
                    throw new java.lang.IllegalAccessError("Invocation failed");
                }
                case 8: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean j6(java.lang.Object r1, long r2) {
        return abcd.Ev.DW(r1, r2);
    }
}
