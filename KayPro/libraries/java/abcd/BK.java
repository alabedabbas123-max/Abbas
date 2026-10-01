package abcd;

public class BK {
    public static final byte[] DW(java.io.File r3, int r4) {
        java.io.FileInputStream r0 = new java.io.FileInputStream(r3);
        byte[] r5 = new byte[r4];     // Catch: java.lang.Throwable -> L14
        int r1 = 0;
    L4:
        int r2 = r0.read(r5, r1, r5.length - r1);     // Catch: java.lang.Throwable -> L14
        if (r2 <= 0) goto L7;
        r1 = r1 + r2;
        goto L4
    L7:
        if (r1 == r5.length) goto L24;
        byte[] r6 = new byte[r1];     // Catch: java.lang.Throwable -> L14
        java.lang.System.arraycopy(r5, 0, r6, 0, r1);     // Catch: java.lang.Throwable -> L14
        r0.close();     // Catch: java.io.IOException -> L19
    L12:
        return r6;
    L24:
        r0.close();     // Catch: java.io.IOException -> L20
    L9:
        return r5;
    L14:
        th = move-exception;
        r0.close();     // Catch: java.io.IOException -> L21
    L17:
        throw th;
    }

    public static int j6(java.io.InputStream r3, byte[] r4, int r5) {
        int r0 = 0;
    L3:
        int r1 = r3.read(r4, r5, r4.length - r5);
        if (r1 < 0) goto L9;
        if (r0 >= r4.length) goto L9;
        r5 = r5 + r1;
        r0 = r0 + r1;
    L9:
        return r0;
    }

    public static java.nio.ByteBuffer j6(java.io.InputStream r3, int r4) {
        byte[] r5 = new byte[r4];
        int r1 = 0;
    L4:
        if (r1 >= r5.length) goto L5;
        int r2 = r3.read(r5, r1, r5.length - r1);
        if (r2 < 0) goto L14;
        r1 = r1 + r2;
        goto L4
    L14:
        return java.nio.ByteBuffer.wrap(r5, 0, r1);
    L5:
        int r6 = r3.read();
        if (r6 < 0) goto L8;
        abcd.RK.c r0 = new abcd.RK.c(Integer.MAX_VALUE);
        r0.write(r5);
        r0.write(r6);
        r0.j6(r3);
        return java.nio.ByteBuffer.wrap(r0.Zo());
    L8:
        return java.nio.ByteBuffer.wrap(r5, 0, r1);
    }

    public static void j6(java.io.InputStream r5, long r6) {
    L3:
        if (r6 <= 0) goto L4;
        long r2 = r5.skip(r6);
        if (r2 <= 0) goto L9;
        r6 = r6 - r2;
        goto L3
    L9:
        throw new java.io.EOFException(org.eclipse.jgit.JGitText.j6().shortSkipOfBlock);
    }

    public static void j6(java.io.InputStream r1, byte[] r2, int r3, int r4) {
    L2:
        if (r4 <= 0) goto L3;
        int r0 = r1.read(r2, r3, r4);
        if (r0 <= 0) goto L8;
        r3 = r3 + r0;
        r4 = r4 - r0;
        goto L2
    L8:
        throw new java.io.EOFException(org.eclipse.jgit.JGitText.j6().shortReadOfBlock);
    }

    public static final byte[] j6(java.io.File r1) {
        return j6(r1, Integer.MAX_VALUE);
    }

    public static final byte[] j6(java.io.File r7, int r8) {
        java.io.FileInputStream r0 = new java.io.FileInputStream(r7);
        long r1 = r0.getChannel().size();     // Catch: java.lang.Throwable -> L14
        if (r1 > r8) goto L13;
        byte[] r9 = new byte[(int) r1];     // Catch: java.lang.Throwable -> L14
        int r3 = j6(r0, r9, 0);     // Catch: java.lang.Throwable -> L14
        if (r3 != r1) goto L25;
        byte[] r2 = new byte[r3];     // Catch: java.lang.Throwable -> L14
        java.lang.System.arraycopy(r9, 0, r2, 0, r3);     // Catch: java.lang.Throwable -> L14
        r0.close();     // Catch: java.io.IOException -> L17
    L9:
        return r2;
    L25:
        r0.close();     // Catch: java.io.IOException -> L18
    L11:
        return r9;
    L13:
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().fileIsTooLarge, new java.lang.Object[]{r7}));     // Catch: java.lang.Throwable -> L14
    L14:
        th = move-exception;
        r0.close();     // Catch: java.io.IOException -> L19
    L16:
        throw th;
    }
}
