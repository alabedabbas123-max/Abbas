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
        android.os.IBinder r8 = null;
        java.lang.reflect.Field[] r0 = null;
        int r2 = 0;
        int r3 = 0;
        java.lang.reflect.Field r4 = null;
        int r1 = 0;
        java.lang.reflect.Field r5 = null;
        int r6 = 0;
        java.lang.StringBuilder r9 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r7 instanceof abcd.Binderpx) == true) { $pc0 = 5; continue $sw0; }
                    r8 = r7.asBinder();
                    r0 = r8.getClass().getDeclaredFields();
                    r2 = r0.length;
                    r3 = 0;
                    r4 = null;
                    r1 = 0;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r3 >= r2) { $pc0 = 13; continue $sw0; }
                    r5 = r0[r3];
                    if (r5.isSynthetic() == true) { $pc0 = 11; continue $sw0; }
                    r1 = r1 + 1;
                    r4 = r5;
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    r3 = r3 + 1;
                    { $pc0 = 7; continue $sw0; }
                }
                case 13: {
                    if (r1 == 1) { $pc0 = 15; continue $sw0; }
                    r6 = r0.length;
                    r9 = new java.lang.StringBuilder(64);
                    r9.append("Unexpected number of IObjectWrapper declared fields: ");
                    r9.append(r6);
                    throw new java.lang.IllegalArgumentException(r9.toString());
                }
                case 15: {
                    if (r4.isAccessible() == true) { $pc0 = 26; continue $sw0; }
                    r4.setAccessible(true);
                    return (T) r4.get(r8);
                }
                case 19: {
                    e = $ex0;
                    throw new java.lang.IllegalArgumentException("Could not access the field in remoteBinder.", e);
                }
                case 22: {
                    e = $ex0;
                    throw new java.lang.IllegalArgumentException("Binder object is null.", e);
                }
                case 26: {
                    throw new java.lang.IllegalArgumentException("IObjectWrapper declared field not private!");
                }
                case 5: {
                    return ((abcd.Binderpx) r7).j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
