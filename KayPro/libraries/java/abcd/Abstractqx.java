package abcd;

public abstract class Abstractqx<T> {
    private T DW;
    private final java.lang.String j6;

    public static class a extends java.lang.Exception {
        public a(java.lang.String r1) {
            super(r1);
        }

        public a(java.lang.String r1, java.lang.Throwable r2) {
            super(r1, r2);
        }
    }

    protected Abstractqx(java.lang.String r1) {
        this.j6 = r1;
    }

    protected final T j6(android.content.Context r3) {
        android.content.Context r4 = null;
        java.lang.ClassLoader r5 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.DW != null) { $pc0 = 21; continue $sw0; }
                    com.google.android.gms.common.internal.r.j6(r3);
                    r4 = com.google.android.gms.common.f.getRemoteContext(r3);
                    if (r4 == null) { $pc0 = 19; continue $sw0; }
                    r5 = r4.getClassLoader();
                    try {
                        this.DW = j6((android.os.IBinder) r5.loadClass(this.j6).newInstance());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.IllegalAccessException) { $pc0 = 9; continue $sw0; }
                        if ($t instanceof java.lang.InstantiationException) { $pc0 = 12; continue $sw0; }
                        if ($t instanceof java.lang.ClassNotFoundException) { $pc0 = 15; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    e = $ex0;
                    throw new abcd.Abstractqx.a("Could not load creator class.", e);
                }
                case 9: {
                    e = $ex0;
                    throw new abcd.Abstractqx.a("Could not access creator.", e);
                }
                case 12: {
                    e = $ex0;
                    throw new abcd.Abstractqx.a("Could not instantiate creator.", e);
                }
                case 19: {
                    throw new abcd.Abstractqx.a("Could not get remote context.");
                }
                case 21: {
                    return this.DW;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract T j6(android.os.IBinder r1);
}
