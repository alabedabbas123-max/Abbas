package abcd;

public class Ex {
    private static final java.lang.ClassLoader j6 = null;

    static {
        j6 = abcd.Ex.class.getClassLoader();
    }

    private Ex() {
    }

    public static <T extends android.os.Parcelable> T j6(android.os.Parcel r1, android.os.Parcelable.Creator<T> r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1.readInt() != 0) { $pc0 = 7; continue $sw0; }
                    return null;
                }
                case 7: {
                    return r2.createFromParcel(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.os.Parcel r0, android.os.IInterface r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r1 != null) { $pc1 = 5; continue $sw1; }
                    r0.writeStrongBinder(null);
                    return;
                }
                case 5: {
                    r0.writeStrongBinder(r1.asBinder());
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.os.Parcel r2, android.os.Parcelable r3) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r3 != null) { $pc2 = 6; continue $sw2; }
                    r2.writeInt(0);
                    return;
                }
                case 6: {
                    r2.writeInt(1);
                    r3.writeToParcel(r2, 0);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.os.Parcel r0, boolean r1) {
        r0.writeInt(r1 ? 1 : 0);
    }

    public static boolean j6(android.os.Parcel r0) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r0.readInt() == 0) { $pc3 = 6; continue $sw3; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
