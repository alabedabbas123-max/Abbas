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
        if (r0.readInt() == 0) goto L6;
        return true;
    L6:
        return false;
    }
}
