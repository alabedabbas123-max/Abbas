package abcd;

public class Ex {
    private static final java.lang.ClassLoader j6 = null;

    static {
        j6 = abcd.Ex.class.getClassLoader();
    }

    private Ex() {
    }

    public static <T extends android.os.Parcelable> T j6(android.os.Parcel r1, android.os.Parcelable.Creator<T> r2) {
        if (r1.readInt() != 0) goto L7;
        return null;
    L7:
        return r2.createFromParcel(r1);
    }

    public static void j6(android.os.Parcel r0, android.os.IInterface r1) {
        if (r1 != null) goto L5;
        r0.writeStrongBinder(null);
        return;
    L5:
        r0.writeStrongBinder(r1.asBinder());
    }

    public static void j6(android.os.Parcel r2, android.os.Parcelable r3) {
        if (r3 != null) goto L6;
        r2.writeInt(0);
        return;
    L6:
        r2.writeInt(1);
        r3.writeToParcel(r2, 0);
    }

    public static void j6(android.os.Parcel r0, boolean r1) {
        r0.writeInt(r1 ? 1 : 0);
    }

    public static boolean j6(android.os.Parcel r0) {
        if (r0.readInt() == 0) goto L6;
        return true;
    L6:
        return false;
    }
}
