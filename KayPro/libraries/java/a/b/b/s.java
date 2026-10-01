package a.b.b;

public class s extends a.b.b.b {

    private byte[] f101a;
    private java.lang.String b;

    public s() {
    }

    public s(java.lang.String r2) {
        this.f101a = null;
        this.b = r2;
    }

    private java.lang.String b(byte[] r10) {
        char[] r7 = new char[r10.length];
        int r0 = 0;
        int r2 = 0;
    L4:
        if (r0 >= r10.length) goto L19;
        int r4 = r0 + 1;
        int r5 = r10[r0] & 255;
        int r3 = r2 + 1;
        if (r5 >= 192) goto L11;
        r0 = r4;
        int r6 = r5;
    L20:
        r7[r2] = (char) r6;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15
        r2 = r3;
    L17:
        throw new java.io.UnsupportedEncodingException("Missing UTF-8 bytes after initial byte [0x" + java.lang.Integer.toHexString(r5) + "] in string [" + new java.lang.String(r7, 0, r3) + "]");
    L11:
        if (r5 >= 224) goto L13;
        int r8 = r4 + 1;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15
        r6 = ((r5 & 31) << 6) | (r10[r4] & 63);     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15
        r0 = r8;
        goto L20
    L13:
        int r9 = r4 + 1;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15
        int r1 = ((r5 & 15) << 12) | ((r10[r4] & 63) << 6);     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15
        int r11 = r9 + 1;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15
        int r12 = r1 | (r10[r9] & 63);
        r0 = r11;
        r6 = r12;
        goto L20
    L19:
        return new java.lang.String(r7, 0, r2);
    }

    private byte[] b(java.lang.String r10) {
        int r2 = 0;
        int r5 = r10.length();
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r5) goto L13;
        char r0 = r10.charAt(r3);
        if (r0 != 0) goto L8;
        int r1 = 2;
    L7:
        r4 = r4 + r1;
        r3 = r3 + 1;
        goto L3
    L8:
        if (r0 >= 128) goto L10;
        r1 = 1;
        goto L7
    L10:
        if (r0 >= 2048) goto L12;
        r1 = 2;
        goto L7
    L12:
        r1 = 3;
        goto L7
    L13:
        byte[] r6 = new byte[r4];
        int r7 = 0;
    L14:
        if (r7 >= r5) goto L24;
        char r8 = r10.charAt(r7);
        if (r8 != 0) goto L19;
        int r9 = r2 + 1;
        r6[r2] = -64;
        int r11 = r9 + 1;
        r6[r9] = -128;
    L18:
        r7 = r7 + 1;
        r2 = r11;
        goto L14
    L19:
        if (r8 >= 128) goto L21;
        r11 = r2 + 1;
        r6[r2] = (byte) r8;
        goto L18
    L21:
        if (r8 >= 2048) goto L23;
        int r12 = r2 + 1;
        r6[r2] = (byte) (((r8 >>> 6) & 31) | 192);
        r11 = r12 + 1;
        r6[r12] = (byte) ((r8 & '?') | 128);
        goto L18
    L23:
        int r13 = r2 + 1;
        r6[r2] = (byte) (((r8 >>> '\f') & 15) | 224);
        int r14 = r13 + 1;
        r6[r13] = (byte) (((r8 >>> 6) & 63) | 128);
        r11 = r14 + 1;
        r6[r14] = (byte) ((r8 & '?') | 128);
        goto L18
    L24:
        return r6;
    }

    private void d() {
        if (this.f101a != null) goto L6;
        this.f101a = b(this.b);
        this.b = null;
        return;
    }

    private void e() {
        if (this.b != null) goto L6;
        this.b = b(this.f101a);
        this.f101a = null;
        return;
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public void a(a.b.c r1, a.b.b.a.f r2) {
        r2.a(r1, this);
    }

    public void a(java.lang.String r2) {
        this.f101a = null;
        this.b = r2;
    }

    public void a(byte[] r2) {
        this.f101a = r2;
        this.b = null;
    }

    public byte[] b() {
        d();     // Catch: java.io.UnsupportedEncodingException -> L5
        return this.f101a;
    L5:
        e = move-exception;
        throw new java.lang.RuntimeException(e.getMessage());
    }

    public java.lang.String c() {
        e();     // Catch: java.io.UnsupportedEncodingException -> L5
        return this.b;
    L5:
        e = move-exception;
        throw new java.lang.RuntimeException(e.getMessage());
    }
}
