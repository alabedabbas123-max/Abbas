package abcd;

public final class Binderpx<T> extends abcd.Interfaceox.a {
    private final T j6;

    private Binderpx(T r1) {
        this.j6 = r1;
    }

    public static <T> abcd.Interfaceox j6(T r1) {
        return new abcd.Binderpx(r1);
    }

    public static <T> T j6(abcd.Interfaceox r7) {
        if ((r7 instanceof abcd.Binderpx) == true) goto L5;
        android.os.IBinder r8 = r7.asBinder();
        java.lang.reflect.Field[] r0 = r8.getClass().getDeclaredFields();
        int r2 = r0.length;
        int r3 = 0;
        java.lang.reflect.Field r4 = null;
        int r1 = 0;
    L7:
        if (r3 >= r2) goto L13;
        java.lang.reflect.Field r5 = r0[r3];
        if (r5.isSynthetic() == true) goto L11;
        r1 = r1 + 1;
        r4 = r5;
    L11:
        r3 = r3 + 1;
        goto L7
    L13:
        if (r1 == 1) goto L15;
        int r6 = r0.length;
        java.lang.StringBuilder r9 = new java.lang.StringBuilder(64);
        r9.append("Unexpected number of IObjectWrapper declared fields: ");
        r9.append(r6);
        throw new java.lang.IllegalArgumentException(r9.toString());
    L15:
        if (r4.isAccessible() == true) goto L26;
        r4.setAccessible(true);
        return (T) r4.get(r8);
    L19:
        e = move-exception;
        throw new java.lang.IllegalArgumentException("Could not access the field in remoteBinder.", e);
    L22:
        e = move-exception;
        throw new java.lang.IllegalArgumentException("Binder object is null.", e);
    L26:
        throw new java.lang.IllegalArgumentException("IObjectWrapper declared field not private!");
    L5:
        return ((abcd.Binderpx) r7).j6;
    }
}
