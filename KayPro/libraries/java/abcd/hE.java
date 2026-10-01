package abcd;

public final class hE {
    private static final byte[] DW = null;
    private static final byte[] FH = null;
    private static final byte[] Hw = null;
    public static final abcd.yE VH = null;
    public static final java.nio.charset.Charset Zo = null;
    private static final byte[] j6 = null;
    public static final byte[] v5 = null;

    static {
        j6 = DW("commit");
        DW = DW("blob");
        FH = DW("tree");
        Hw = DW("tag");
        v5 = new byte[]{80, 65, 67, 75};
        if (20 != j6().getDigestLength()) goto L7;
        Zo = java.nio.charset.Charset.forName("UTF-8");
        VH = abcd.yE.j6("e69de29bb2d1d6434b8b29ae775ad8c2e48c5391");
        return;
    L7:
        throw new java.lang.LinkageError(org.eclipse.jgit.JGitText.j6().incorrectOBJECT_ID_LENGTH);
    }

    public static java.lang.String DW(int r4) {
        if (r4 != 1) goto L5;
        return "commit";
    L5:
        if (r4 != 2) goto L7;
        return "tree";
    L7:
        if (r4 != 3) goto L9;
        return "blob";
    L9:
        if (r4 != 4) goto L13;
        return "tag";
    L13:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().badObjectType, new java.lang.Object[]{java.lang.Integer.valueOf(r4)}));
    }

    public static byte[] DW(java.lang.String r5) {
        byte[] r0 = new byte[r5.length()];
        int r1 = r0.length - 1;
    L3:
        if (r1 < 0) goto L4;
        char r3 = r5.charAt(r1);
        if (r3 > 127) goto L9;
        r0[r1] = (byte) r3;
        r1 = r1 - 1;
        goto L3
    L9:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().notASCIIString, new java.lang.Object[]{r5}));
    L4:
        return r0;
    }

    public static int j6(abcd.YD r5, byte[] r6, byte r7, abcd.EK r8) {
        int r0 = r8.j6;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
        byte r1 = r6[r0];     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
        if (r1 == 98) goto L50;
        if (r1 == 99) goto L34;
        if (r1 != 116) goto L32;
        byte r2 = r6[r0 + 1];     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
        if (r2 == 97) goto L24;
        if (r2 != 114) goto L22;
        if (r6[r0 + 2] != 101) goto L20;
        if (r6[r0 + 3] != 101) goto L20;
        if (r6[r0 + 4] != r7) goto L20;
        r8.j6 = r0 + 5;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
        return 2;
    L20:
        throw new abcd.YC(r5, org.eclipse.jgit.JGitText.j6().corruptObjectInvalidType);     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
    L22:
        throw new abcd.YC(r5, org.eclipse.jgit.JGitText.j6().corruptObjectInvalidType);     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
    L24:
        if (r6[r0 + 2] != 103) goto L30;
        if (r6[r0 + 3] != r7) goto L30;
        r8.j6 = r0 + 4;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
        return 4;
    L30:
        throw new abcd.YC(r5, org.eclipse.jgit.JGitText.j6().corruptObjectInvalidType);     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
    L32:
        throw new abcd.YC(r5, org.eclipse.jgit.JGitText.j6().corruptObjectInvalidType);     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
    L34:
        if (r6[r0 + 1] != 111) goto L48;
        if (r6[r0 + 2] != 109) goto L48;
        if (r6[r0 + 3] != 109) goto L48;
        if (r6[r0 + 4] != 105) goto L48;
        if (r6[r0 + 5] != 116) goto L48;
        if (r6[r0 + 6] != r7) goto L48;
        r8.j6 = r0 + 7;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
        return 1;
    L48:
        throw new abcd.YC(r5, org.eclipse.jgit.JGitText.j6().corruptObjectInvalidType);     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
    L50:
        if (r6[r0 + 1] != 108) goto L60;
        if (r6[r0 + 2] != 111) goto L60;
        if (r6[r0 + 3] != 98) goto L60;
        if (r6[r0 + 4] != r7) goto L60;
        r8.j6 = r0 + 5;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
        return 3;
    L60:
        throw new abcd.YC(r5, org.eclipse.jgit.JGitText.j6().corruptObjectInvalidType);     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
    L62:
        throw new abcd.YC(r5, org.eclipse.jgit.JGitText.j6().corruptObjectInvalidType);
    }

    public static java.security.MessageDigest j6() {
        return java.security.MessageDigest.getInstance("SHA-1");
    L5:
        e = move-exception;
        throw new java.lang.RuntimeException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().requiredHashFunctionNotAvailable, new java.lang.Object[]{"SHA-1"}), e);
    }

    public static byte[] j6(int r4) {
        if (r4 == 1) goto L19;
        if (r4 == 2) goto L17;
        if (r4 == 3) goto L15;
        if (r4 != 4) goto L13;
        return Hw;
    L13:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().badObjectType, new java.lang.Object[]{java.lang.Integer.valueOf(r4)}));
    L15:
        return DW;
    L17:
        return FH;
    L19:
        return j6;
    }

    public static byte[] j6(long r0) {
        return DW(java.lang.Long.toString(r0));
    }

    public static byte[] j6(java.lang.String r3) {
        java.nio.ByteBuffer r4 = Zo.encode(r3);
        int r0 = r4.limit();
        if (r4.hasArray() == true) goto L5;
    L9:
        byte[] r1 = new byte[r0];
        r4.get(r1);
        return r1;
    L5:
        if (r4.arrayOffset() != 0) goto L9;
        byte[] r2 = r4.array();
        if (r2.length != r0) goto L9;
        return r2;
    }
}
