package io.fabric.sdk.android.services.common;

public class z implements java.io.Closeable {
    private static final java.util.logging.Logger j6 = null;
    private final java.io.RandomAccessFile DW;
    int FH;
    private int Hw;
    private final byte[] VH;
    private io.fabric.sdk.android.services.common.z.a Zo;
    private io.fabric.sdk.android.services.common.z.a v5;

    static class a {
        static final io.fabric.sdk.android.services.common.z.a j6 = null;
        final int DW;
        final int FH;

        static {
            j6 = new io.fabric.sdk.android.services.common.z.a(0, 0);
        }

        a(int r1, int r2) {
            this.DW = r1;
            this.FH = r2;
        }

        public java.lang.String toString() {
            return io.fabric.sdk.android.services.common.z.a.class.getSimpleName() + "[position = " + this.DW + ", length = " + this.FH + "]";
        }
    }

    private final class b extends java.io.InputStream {
        private int DW;
        final io.fabric.sdk.android.services.common.z FH;
        private int j6;

        private b(io.fabric.sdk.android.services.common.z r2, io.fabric.sdk.android.services.common.z.a r3) {
            this.FH = r2;
            this.j6 = io.fabric.sdk.android.services.common.z.j6(r2, r3.DW + 4);
            this.DW = r3.FH;
        }

        b(io.fabric.sdk.android.services.common.z r1, io.fabric.sdk.android.services.common.z.a r2, io.fabric.sdk.android.services.common.y r3) {
            this(r1, r2);
        }

        @Override
        public int read() {
            if (this.DW != 0) goto L6;
            return -1;
        L6:
            io.fabric.sdk.android.services.common.z.j6(this.FH).seek(this.j6);
            int r0 = io.fabric.sdk.android.services.common.z.j6(this.FH).read();
            this.j6 = io.fabric.sdk.android.services.common.z.j6(this.FH, this.j6 + 1);
            this.DW--;
            return r0;
        }

        @Override
        public int read(byte[] r3, int r4, int r5) {
            io.fabric.sdk.android.services.common.z.j6(r3, "buffer");
            if ((r4 | r5) < 0) goto L15;
            if (r5 > (r3.length - r4)) goto L15;
            int r0 = this.DW;
            if (r0 <= 0) goto L12;
            if (r5 <= r0) goto L10;
            r5 = r0;
        L10:
            io.fabric.sdk.android.services.common.z.j6(this.FH, this.j6, r3, r4, r5);
            this.j6 = io.fabric.sdk.android.services.common.z.j6(this.FH, this.j6 + r5);
            this.DW -= r5;
            return r5;
        L12:
            return -1;
        L15:
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
    }

    public interface c {
        void j6(java.io.InputStream r1, int r2);
    }

    static {
        j6 = java.util.logging.Logger.getLogger(io.fabric.sdk.android.services.common.z.class.getName());
    }

    public z(java.io.File r2) {
        this.VH = new byte[16];
        if (r2.exists() == true) goto L5;
        j6(r2);
    L5:
        this.DW = DW(r2);
        v5();
    }

    private io.fabric.sdk.android.services.common.z.a DW(int r4) {
        if (r4 == 0) goto L4;
        this.DW.seek(r4);
        return new io.fabric.sdk.android.services.common.z.a(r4, this.DW.readInt());
    L4:
        return io.fabric.sdk.android.services.common.z.a.j6;
    }

    private static java.io.RandomAccessFile DW(java.io.File r2) {
        return new java.io.RandomAccessFile(r2, "rwd");
    }

    private static <T> T DW(T r0, java.lang.String r1) {
        if (r0 == null) goto L5;
        return r0;
    L5:
        throw new java.lang.NullPointerException(r1);
    }

    private void DW(int r5, byte[] r6, int r7, int r8) {
        int r9 = Hw(r5);
        int r0 = r9 + r8;
        int r1 = this.FH;
        if (r0 > r1) goto L5;
        this.DW.seek(r9);
        this.DW.write(r6, r7, r8);
        return;
    L5:
        int r2 = r1 - r9;
        this.DW.seek(r9);
        this.DW.write(r6, r7, r2);
        this.DW.seek(16);
        this.DW.write(r6, r7 + r2, r8 - r2);
    }

    private static void DW(byte[] r2, int r3, int r4) {
        r2[r3] = (byte) (r4 >> 24);
        r2[r3 + 1] = (byte) (r4 >> 16);
        r2[r3 + 2] = (byte) (r4 >> 8);
        r2[r3 + 3] = (byte) r4;
    }

    private void FH(int r4) {
        this.DW.setLength(r4);
        this.DW.getChannel().force(true);
    }

    private int Hw(int r2) {
        int r0 = this.FH;
        if (r2 >= r0) goto L6;
        return r2;
    L6:
        return (r2 + 16) - r0;
    }

    private int Zo() {
        return this.FH - Hw();
    }

    static int j6(io.fabric.sdk.android.services.common.z r0, int r1) {
        return r0.Hw(r1);
    }

    private static int j6(byte[] r2, int r3) {
        return ((((r2[r3] & 255) << 24) + ((r2[r3 + 1] & 255) << 16)) + ((r2[r3 + 2] & 255) << 8)) + (r2[r3 + 3] & 255);
    }

    static java.io.RandomAccessFile j6(io.fabric.sdk.android.services.common.z r0) {
        return r0.DW;
    }

    static java.lang.Object j6(java.lang.Object r0, java.lang.String r1) {
        DW(r0, r1);
        return r0;
    }

    private void j6(int r11) {
        int r12 = r11 + 4;
        int r0 = Zo();
        if (r0 < r12) goto L5;
        return;
    L5:
        int r1 = this.FH;
    L6:
        r0 = r0 + r1;
        r1 = r1 << 1;
        if (r0 < r12) goto L6;
        FH(r1);
        io.fabric.sdk.android.services.common.z.a r13 = this.Zo;
        int r14 = Hw((r13.DW + 4) + r13.FH);
        if (r14 >= this.v5.DW) goto L15;
        java.nio.channels.FileChannel r7 = this.DW.getChannel();
        r7.position(this.FH);
        long r8 = r14 - 4;
        if (r7.transferTo(16, r8, r7) == r8) goto L15;
        throw new java.lang.AssertionError("Copied insufficient number of bytes!");
    L15:
        int r15 = this.Zo.DW;
        int r2 = this.v5.DW;
        if (r15 >= r2) goto L18;
        int r3 = (this.FH + r15) - 16;
        j6(r1, this.Hw, r2, r3);
        this.Zo = new io.fabric.sdk.android.services.common.z.a(r3, this.Zo.FH);
    L19:
        this.FH = r1;
        return;
    L18:
        j6(r1, this.Hw, r2, r15);
        goto L19
    }

    private void j6(int r4, int r5, int r6, int r7) {
        j6(this.VH, new int[]{r4, r5, r6, r7});
        this.DW.seek(0);
        this.DW.write(this.VH);
    }

    private void j6(int r5, byte[] r6, int r7, int r8) {
        int r9 = Hw(r5);
        int r0 = r9 + r8;
        int r1 = this.FH;
        if (r0 > r1) goto L5;
        this.DW.seek(r9);
        this.DW.readFully(r6, r7, r8);
        return;
    L5:
        int r2 = r1 - r9;
        this.DW.seek(r9);
        this.DW.readFully(r6, r7, r2);
        this.DW.seek(16);
        this.DW.readFully(r6, r7 + r2, r8 - r2);
    }

    static void j6(io.fabric.sdk.android.services.common.z r0, int r1, byte[] r2, int r3, int r4) {
        r0.j6(r1, r2, r3, r4);
    }

    private static void j6(java.io.File r6) {
        java.io.File r0 = new java.io.File(r6.getPath() + ".tmp");
        java.io.RandomAccessFile r1 = DW(r0);
        r1.setLength(4096);     // Catch: java.lang.Throwable -> L9
        r1.seek(0);     // Catch: java.lang.Throwable -> L9
        byte[] r2 = new byte[16];     // Catch: java.lang.Throwable -> L9
        j6(r2, new int[]{4096, 0, 0, 0});     // Catch: java.lang.Throwable -> L9
        r1.write(r2);     // Catch: java.lang.Throwable -> L9
        r1.close();
        if (r0.renameTo(r6) == false) goto L8;
        return;
    L8:
        throw new java.io.IOException("Rename failed!");
    L9:
        th = move-exception;
        r1.close();
        throw th;
    }

    private static void j6(byte[] r4, int... r5) {
        int r0 = r5.length;
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r0) goto L5;
        DW(r4, r2, r5[r1]);
        r2 = r2 + 4;
        r1 = r1 + 1;
        goto L3
    }

    private void v5() {
        this.DW.seek(0);
        this.DW.readFully(this.VH);
        this.FH = j6(this.VH, 0);
        if (this.FH > this.DW.length()) goto L7;
        this.Hw = j6(this.VH, 4);
        int r0 = j6(this.VH, 8);
        int r1 = j6(this.VH, 12);
        this.v5 = DW(r0);
        this.Zo = DW(r1);
        return;
    L7:
        throw new java.io.IOException("File is truncated. Expected length: " + this.FH + ", Actual length: " + this.DW.length());
    }

    public synchronized boolean DW() {
        monitor-enter(this);
        if (this.Hw != 0) goto L6;
        boolean r0 = true;
    L7:
        monitor-exit(this);
        return r0;
    L6:
        r0 = false;
    L9:
        th = move-exception;
        throw th;
    }

    public synchronized void FH() {
        monitor-enter(this);
    L13:
        th = move-exception;
        throw th;
    L4:
        if (DW() == true) goto L12;
        if (this.Hw != 1) goto L8;
        j6();     // Catch: java.lang.Throwable -> L13
    L9:
        monitor-exit(this);
        return;
    L8:
        int r0 = Hw((this.v5.DW + 4) + this.v5.FH);     // Catch: java.lang.Throwable -> L13
        j6(r0, this.VH, 0, 4);     // Catch: java.lang.Throwable -> L13
        int r2 = j6(this.VH, 0);     // Catch: java.lang.Throwable -> L13
        j6(this.FH, this.Hw - 1, r0, this.Zo.DW);     // Catch: java.lang.Throwable -> L13
        this.Hw--;     // Catch: java.lang.Throwable -> L13
        this.v5 = new io.fabric.sdk.android.services.common.z.a(r0, r2);     // Catch: java.lang.Throwable -> L13
        goto L9
    L12:
        throw new java.util.NoSuchElementException();     // Catch: java.lang.Throwable -> L13
    }

    public int Hw() {
        if (this.Hw != 0) goto L5;
        return 16;
    L5:
        io.fabric.sdk.android.services.common.z.a r0 = this.Zo;
        int r2 = r0.DW;
        int r3 = this.v5.DW;
        if (r2 < r3) goto L10;
        return (((r2 - r3) + 4) + r0.FH) + 16;
    L10:
        return (((r2 + 4) + r0.FH) + this.FH) - r3;
    }

    @Override
    public synchronized void close() {
        monitor-enter(this);
        this.DW.close();     // Catch: java.lang.Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized void j6() {
        monitor-enter(this);
        j6(4096, 0, 0, 0);     // Catch: java.lang.Throwable -> L10
        this.Hw = 0;     // Catch: java.lang.Throwable -> L10
        this.v5 = io.fabric.sdk.android.services.common.z.a.j6;     // Catch: java.lang.Throwable -> L10
        this.Zo = io.fabric.sdk.android.services.common.z.a.j6;     // Catch: java.lang.Throwable -> L10
        if (this.FH <= 4096) goto L7;
        FH(4096);     // Catch: java.lang.Throwable -> L10
    L7:
        this.FH = 4096;     // Catch: java.lang.Throwable -> L10
        monitor-exit(this);
        return;
    L10:
        th = move-exception;
        throw th;
    }

    public synchronized void j6(io.fabric.sdk.android.services.common.z.c r5) {
        monitor-enter(this);
        int r0 = this.v5.DW;     // Catch: java.lang.Throwable -> L10
        int r1 = 0;
    L5:
        if (r1 >= this.Hw) goto L8;
        io.fabric.sdk.android.services.common.z.a r2 = DW(r0);     // Catch: java.lang.Throwable -> L10
        r5.j6(new io.fabric.sdk.android.services.common.z.b(this, r2, null), r2.FH);     // Catch: java.lang.Throwable -> L10
        r0 = Hw((r2.DW + 4) + r2.FH);     // Catch: java.lang.Throwable -> L10
        r1 = r1 + 1;
        goto L5
    L8:
        monitor-exit(this);
        return;
    L10:
        th = move-exception;
        throw th;
    }

    public void j6(byte[] r3) {
        j6(r3, 0, r3.length);
    }

    public synchronized void j6(byte[] r7, int r8, int r9) {
        monitor-enter(this);
        DW(r7, "buffer");     // Catch: java.lang.Throwable -> L22
        if ((r8 | r9) < 0) goto L21;
        if (r9 > (r7.length - r8)) goto L21;
        j6(r9);     // Catch: java.lang.Throwable -> L22
        boolean r0 = DW();     // Catch: java.lang.Throwable -> L22
        if (r0 == false) goto L10;
        int r2 = 16;
    L11:
        io.fabric.sdk.android.services.common.z.a r3 = new io.fabric.sdk.android.services.common.z.a(r2, r9);     // Catch: java.lang.Throwable -> L22
        DW(this.VH, 0, r9);     // Catch: java.lang.Throwable -> L22
        DW(r3.DW, this.VH, 0, 4);     // Catch: java.lang.Throwable -> L22
        DW(r3.DW + 4, r7, r8, r9);     // Catch: java.lang.Throwable -> L22
        if (r0 == false) goto L14;
        int r10 = r3.DW;     // Catch: java.lang.Throwable -> L22
    L15:
        j6(this.FH, this.Hw + 1, r10, r3.DW);     // Catch: java.lang.Throwable -> L22
        this.Zo = r3;     // Catch: java.lang.Throwable -> L22
        this.Hw++;     // Catch: java.lang.Throwable -> L22
        if (r0 == false) goto L18;
        this.v5 = this.Zo;     // Catch: java.lang.Throwable -> L22
    L18:
        monitor-exit(this);
        return;
    L14:
        r10 = this.v5.DW;     // Catch: java.lang.Throwable -> L22
        goto L15
    L10:
        r2 = Hw((this.Zo.DW + 4) + this.Zo.FH);     // Catch: java.lang.Throwable -> L22
    L21:
        throw new java.lang.IndexOutOfBoundsException();     // Catch: java.lang.Throwable -> L22
    L22:
        th = move-exception;
        throw th;
    }

    public boolean j6(int r2, int r3) {
        if (((Hw() + 4) + r2) > r3) goto L5;
        return true;
    L5:
        return false;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append(io.fabric.sdk.android.services.common.z.class.getSimpleName());
        r0.append('[');
        r0.append("fileLength=");
        r0.append(this.FH);
        r0.append(", size=");
        r0.append(this.Hw);
        r0.append(", first=");
        r0.append(this.v5);
        r0.append(", last=");
        r0.append(this.Zo);
        r0.append(", element lengths=[");
        j6(new io.fabric.sdk.android.services.common.y(this, r0));     // Catch: java.io.IOException -> L5
    L7:
        r0.append("]]");
        return r0.toString();
    L5:
        e = move-exception;
        j6.log(java.util.logging.Level.WARNING, "read error", e);
        goto L7
    }
}
