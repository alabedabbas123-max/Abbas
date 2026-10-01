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
        if (this.DW != null) goto L21;
        com.google.android.gms.common.internal.r.j6(r3);
        android.content.Context r4 = com.google.android.gms.common.f.getRemoteContext(r3);
        if (r4 == null) goto L19;
        java.lang.ClassLoader r5 = r4.getClassLoader();
        this.DW = j6((android.os.IBinder) r5.loadClass(this.j6).newInstance());     // Catch: java.lang.IllegalAccessException -> L9 java.lang.InstantiationException -> L12 java.lang.ClassNotFoundException -> L15
    L15:
        e = move-exception;
        throw new abcd.Abstractqx.a("Could not load creator class.", e);
    L9:
        e = move-exception;
        throw new abcd.Abstractqx.a("Could not access creator.", e);
    L12:
        e = move-exception;
        throw new abcd.Abstractqx.a("Could not instantiate creator.", e);
    L19:
        throw new abcd.Abstractqx.a("Could not get remote context.");
    L21:
        return this.DW;
    }

    protected abstract T j6(android.os.IBinder r1);
}
