package com.crashlytics.android.core;

final class ClassD {
    public static final com.crashlytics.android.core.ClassD j6 = null;
    private final byte[] DW;
    private volatile int FH;

    static {
        j6 = new com.crashlytics.android.core.ClassD(new byte[0]);
    }

    private ClassD(byte[] r2) {
        this.FH = 0;
        this.DW = r2;
    }

    public static com.crashlytics.android.core.ClassD j6(java.lang.String r2) {
        return new com.crashlytics.android.core.ClassD(r2.getBytes("UTF-8"));
    L4:
        e = move-exception;
        throw new java.lang.RuntimeException("UTF-8 not supported.", e);
    }

    public static com.crashlytics.android.core.ClassD j6(byte[] r2, int r3, int r4) {
        byte[] r0 = new byte[r4];
        java.lang.System.arraycopy(r2, r3, r0, 0, r4);
        return new com.crashlytics.android.core.ClassD(r0);
    }

    public int DW() {
        return this.DW.length;
    }

    public boolean equals(java.lang.Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof com.crashlytics.android.core.ClassD) == true) goto L8;
        return false;
    L8:
        byte[] r1 = this.DW;
        int r3 = r1.length;
        byte[] r9 = ((com.crashlytics.android.core.ClassD) r8).DW;
        if (r3 == r9.length) goto L11;
        return false;
    L11:
        int r4 = 0;
    L12:
        if (r4 >= r3) goto L17;
        if (r1[r4] != r9[r4]) goto L15;
        r4 = r4 + 1;
        goto L12
    L15:
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r0 = this.FH;
        if (r0 != 0) goto L11;
        byte[] r1 = this.DW;
        int r2 = r1.length;
        int r3 = 0;
        int r4 = r2;
    L5:
        if (r3 >= r2) goto L7;
        r4 = (r4 * 31) + r1[r3];
        r3 = r3 + 1;
        goto L5
    L7:
        if (r4 != 0) goto L9;
        r0 = 1;
    L10:
        this.FH = r0;
        goto L11
    L9:
        r0 = r4;
    L11:
        return r0;
    }

    public java.io.InputStream j6() {
        return new java.io.ByteArrayInputStream(this.DW);
    }

    public void j6(byte[] r2, int r3, int r4, int r5) {
        java.lang.System.arraycopy(this.DW, r3, r2, r4, r5);
    }
}
