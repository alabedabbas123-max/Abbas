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
        this.v5 = r2;     // Catch: java.lang.Throwable -> L6
        com.appfour.backbone.api.objects.EventData r4 = r3.getValue();     // Catch: java.lang.Throwable -> L6
        this.v5 = null;
        return r4;
    L6:
        th = move-exception;
        this.v5 = null;
        throw th;
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
        java.lang.reflect.Field r3 = abcd.Ev.j6(r2, r4);     // Catch: java.lang.Exception -> L8
        if (r3 == null) goto L7;
        r3.setAccessible(true);     // Catch: java.lang.Exception -> L8
        return r3.get(r1);
    L7:
        throw new java.lang.IllegalAccessError("Field not found");     // Catch: java.lang.Exception -> L8
    L8:
        e = move-exception;
        throw new java.lang.IllegalAccessError(e.getMessage());
    }

    @Override
    public java.lang.Object j6(java.lang.Object r1, java.lang.Object[] r2, long r3, long r5) {
        java.lang.reflect.Method r4 = abcd.Ev.DW(r3, r5);     // Catch: java.lang.Exception -> L8
        if (r4 == null) goto L7;
        r4.setAccessible(true);     // Catch: java.lang.Exception -> L8
        return r4.invoke(r1, r2);
    L7:
        throw new java.lang.IllegalAccessError("Invocation failed");
    }

    @Override
    public boolean j6(java.lang.Object r1, long r2) {
        return abcd.Ev.DW(r1, r2);
    }
}
