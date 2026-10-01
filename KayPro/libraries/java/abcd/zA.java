package abcd;

public class zA {
    static abcd.AA j6;

    static {
        j6 = new abcd.AA();
    }

    public static java.lang.String j6(byte[] r11) {
        java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream();     // Catch: java.io.IOException -> L25
        j6.j6(r11, 0, r11.length, r0);     // Catch: java.io.IOException -> L25
        byte[] r1 = r0.toByteArray();     // Catch: java.io.IOException -> L25
        java.lang.StringBuilder r2 = new java.lang.StringBuilder();     // Catch: java.io.IOException -> L25
        int r3 = 0;
    L4:
        if (r3 >= r1.length) goto L23;
        int r4 = r3 + 32;     // Catch: java.io.IOException -> L25
        int r5 = java.lang.Math.min(r4, r1.length);     // Catch: java.io.IOException -> L25
        java.lang.StringBuilder r6 = new java.lang.StringBuilder();     // Catch: java.io.IOException -> L25
        java.lang.StringBuilder r7 = new java.lang.StringBuilder();     // Catch: java.io.IOException -> L25
        r6.append(java.lang.String.format("%08x: ", new java.lang.Object[]{java.lang.Integer.valueOf(r3 / 2)}));     // Catch: java.io.IOException -> L25
    L7:
        if (r3 >= r5) goto L18;
        r6.append(java.lang.Character.valueOf((char) r1[r3]));     // Catch: java.io.IOException -> L25
        r6.append(java.lang.Character.valueOf((char) r1[r3 + 1]));     // Catch: java.io.IOException -> L25
        int r9 = r3 + 2;     // Catch: java.io.IOException -> L25
        if ((r9 % 4) != 0) goto L11;
        r6.append(' ');     // Catch: java.io.IOException -> L25
    L11:
        byte r8 = r11[r3 / 2];     // Catch: java.io.IOException -> L25
        if (r8 >= 32) goto L14;
    L16:
        r7.append('.');     // Catch: java.io.IOException -> L25
    L17:
        r3 = r9;
        goto L7
    L14:
        if (r8 >= 127) goto L16;
        r7.append(java.lang.Character.valueOf((char) r8));     // Catch: java.io.IOException -> L25
        goto L17
    L18:
        r2.append(r6.toString());     // Catch: java.io.IOException -> L25
        int r10 = r6.length();     // Catch: java.io.IOException -> L25
    L20:
        if (r10 >= 50) goto L22;
        r2.append(' ');     // Catch: java.io.IOException -> L25
        r10 = r10 + 1;     // Catch: java.io.IOException -> L25
        goto L20
    L22:
        r2.append("  ");     // Catch: java.io.IOException -> L25
        r2.append(r7);     // Catch: java.io.IOException -> L25
        r2.append("\n");     // Catch: java.io.IOException -> L25
        r3 = r4;
        goto L4
    L23:
        return r2.toString();
    L25:
        e = move-exception;
        throw new java.lang.IllegalStateException(e.getClass().getName() + ": " + e.getMessage());
    }
}
