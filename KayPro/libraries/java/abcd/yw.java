package abcd;

public class yw {
    private static java.lang.reflect.Method DW;
    private static java.lang.reflect.Method j6;

    static {
        if (abcd.sw.j6() == false) goto L15;
        return;
    L15:
        java.lang.Class<?> r0 = java.lang.Class.forName("com.crashlytics.android.Crashlytics");     // Catch: java.lang.Throwable -> L14
        j6 = r0.getMethod("log", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.String.class, java.lang.String.class});     // Catch: java.lang.Throwable -> L14
        DW = r0.getMethod("logException", new java.lang.Class[]{java.lang.Throwable.class});     // Catch: java.lang.Throwable -> L14
        java.lang.reflect.Method r1 = java.lang.Class.forName("io.fabric.sdk.android.Fabric").getMethod("with", new java.lang.Class[]{android.content.Context.class, java.lang.Class.forName("[Labcd/io.fabric.sdk.android.Kit;")});     // Catch: java.lang.Throwable -> L14
        android.app.Application r2 = abcd.wu.j6();     // Catch: java.lang.Throwable -> L14
        if (r2 == null) goto L12;
        java.lang.Object r3 = java.lang.reflect.Array.newInstance(java.lang.Class.forName("io.fabric.sdk.android.Kit"), 1);     // Catch: java.lang.Throwable -> L14
        java.lang.reflect.Array.set(r3, 0, r0.newInstance());     // Catch: java.lang.Throwable -> L14
        r1.invoke(null, new java.lang.Object[]{r2, r3});     // Catch: java.lang.Throwable -> L14
        return;
    L12:
        throw new java.lang.NullPointerException();     // Catch: java.lang.Throwable -> L14
    }

    private static void DW(java.lang.String r3, java.lang.Throwable r4) {
        if (DW == null) goto L10;
        j6(7, r3);
        DW.invoke(null, new java.lang.Object[]{r4});     // Catch: java.lang.Throwable -> L7
        return;
    L11:
        return;
    }

    private static void j6(int r4, java.lang.String r5) {
        java.lang.reflect.Method r0 = j6;
        if (r0 != null) goto L8;
        return;
    L8:
        r0.invoke(null, new java.lang.Object[]{java.lang.Integer.valueOf(r4), "BACKBONE", r5});     // Catch: java.lang.Throwable -> L7
        return;
    }

    private static void j6(int r2, java.lang.String r3, java.lang.Throwable r4) {
        java.io.StringWriter r0 = new java.io.StringWriter();
        java.io.PrintWriter r1 = new java.io.PrintWriter(r0);
        r4.printStackTrace(r1);
        r1.flush();
        j6(r2, r3);
        j6(r2, r0.toString());
    }

    public static void j6(java.lang.String r3, java.lang.String r4) {
        if (abcd.sw.j6() == false) goto L5;
        android.util.Log.d("BACKBONE", r3 + ": " + r4);
        return;
    L5:
        j6(3, r3 + ": " + r4);
    }

    public static void j6(java.lang.String r3, java.lang.String r4, java.lang.Throwable r5) {
        if (abcd.sw.j6() == false) goto L5;
        android.util.Log.d("BACKBONE", r3 + ": " + r4, r5);
        return;
    L5:
        j6(3, r3 + ": " + r4, r5);
    }

    public static void j6(java.lang.String r1, java.lang.Throwable r2) {
        android.util.Log.e("BACKBONE", r1, r2);
        if (abcd.sw.j6() == true) goto L6;
        DW(r1, r2);
        return;
    }
}
