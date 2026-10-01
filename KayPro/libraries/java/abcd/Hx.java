package abcd;

public final class Hx {
    private static final int DW = 0;
    private static final abcd.Ix j6 = null;

    static final class a extends abcd.Ix {
        a() {
        }

        @Override
        public final void j6(java.lang.Throwable r1, java.lang.Throwable r2) {
        }
    }

    static {
        int r0 = 1;
        java.lang.Integer r1 = j6();     // Catch: java.lang.Throwable -> L15
        if (r1 == null) goto L9;
    L13:
        th = th;
    L17:
        java.io.PrintStream r3 = java.lang.System.err;
        java.lang.String r4 = abcd.Hx.a.class.getName();
        java.lang.StringBuilder r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 132);
        r6.append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ");
        r6.append(r4);
        r6.append("will be used. The error is: ");
        r3.println(r6.toString());
        th.printStackTrace(java.lang.System.err);
        abcd.Ix r2 = new abcd.Hx.a();
    L18:
        j6 = r2;
        if (r1 == null) goto L22;
        r0 = r1.intValue();
    L22:
        DW = r0;
        return;
    L6:
        if (r1.intValue() < 19) goto L9;
        r2 = new abcd.Mx();     // Catch: java.lang.Throwable -> L13
    L24:
    L9:
        if ((!java.lang.Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) == false) goto L11;
        r2 = new abcd.Lx();     // Catch: java.lang.Throwable -> L13
        goto L24
    L11:
        r2 = new abcd.Hx.a();     // Catch: java.lang.Throwable -> L13
    L15:
        th = th;
        r1 = null;
        goto L17
    }

    private static java.lang.Integer j6() {
        return (java.lang.Integer) java.lang.Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
    L5:
        e = move-exception;
        java.lang.System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
        e.printStackTrace(java.lang.System.err);
        return null;
    }

    public static void j6(java.lang.Throwable r1, java.lang.Throwable r2) {
        j6.j6(r1, r2);
    }
}
