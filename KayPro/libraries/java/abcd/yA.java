package abcd;

public class yA {
    static java.lang.Object DW;
    static java.lang.reflect.Method FH;
    static abcd.InterfacetA Hw;
    static java.lang.reflect.Method j6;

    static {
        Hw = abcd.uA.j6(abcd.yA.class.getName());
        java.lang.Class<?> r2 = java.lang.Class.forName("android.util.Base64");     // Catch: java.lang.Exception -> L5 java.lang.ClassNotFoundException -> L21
        j6 = r2.getMethod("encode", new java.lang.Class[]{byte[].class, java.lang.Integer.TYPE});     // Catch: java.lang.Exception -> L5 java.lang.ClassNotFoundException -> L21
        Hw.Hw(r2.getName() + " is available.");     // Catch: java.lang.Exception -> L5 java.lang.ClassNotFoundException -> L21
    L5:
        e = move-exception;
        Hw.j6("Failed to initialize use of android.util.Base64", e);
    L22:
        java.lang.Class<?> r3 = java.lang.Class.forName("org.bouncycastle.util.encoders.Base64Encoder");     // Catch: java.lang.Exception -> L10 java.lang.ClassNotFoundException -> L12
        DW = r3.newInstance();     // Catch: java.lang.Exception -> L10 java.lang.ClassNotFoundException -> L12
        FH = r3.getMethod("encode", new java.lang.Class[]{byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.io.OutputStream.class});     // Catch: java.lang.Exception -> L10 java.lang.ClassNotFoundException -> L12
        Hw.Hw(r3.getName() + " is available.");     // Catch: java.lang.Exception -> L10 java.lang.ClassNotFoundException -> L12
    L10:
        e = move-exception;
        Hw.j6("Failed to initialize use of org.bouncycastle.util.encoders.Base64Encoder", e);
    L14:
        if (j6 == null) goto L16;
        return;
    L16:
        if (FH == null) goto L19;
        return;
    L19:
        throw new java.lang.IllegalStateException("No base64 encoder implementation is available.");
    }

    public yA() {
    }

    public static java.lang.String j6(byte[] r7) {
    L12:
        e = move-exception;
        throw new java.lang.IllegalStateException(e.getClass().getName() + ": " + e.getMessage());
    L3:
        if (j6 == null) goto L7;
        return new java.lang.String((byte[]) j6.invoke(null, new java.lang.Object[]{r7, 2}));
    L7:
        if (FH == null) goto L11;
        java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream();     // Catch: java.lang.Exception -> L12
        FH.invoke(DW, new java.lang.Object[]{r7, 0, java.lang.Integer.valueOf(r7.length), r0});     // Catch: java.lang.Exception -> L12
        return new java.lang.String(r0.toByteArray());
    L11:
        throw new java.lang.IllegalStateException("No base64 encoder implementation is available.");
    }
}
