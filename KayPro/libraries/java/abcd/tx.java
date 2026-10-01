package abcd;

public class tx {
    private static final java.lang.ClassLoader j6 = null;

    static {
        j6 = abcd.tx.class.getClassLoader();
    }

    private tx() {
    }

    public static void j6(android.os.Parcel r0, boolean r1) {
        r0.writeInt(1);
    }

    public static boolean j6(android.os.Parcel r0) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r0.readInt() == 0) { $pc0 = 6; continue $sw0; }
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
