package abcd;

public abstract class FE {

    public static class a extends abcd.FE {
        private final byte[] DW;
        private final int j6;

        public a(int r1, byte[] r2) {
            this.j6 = r1;
            this.DW = r2;
        }

        @Override
        public long DW() {
            return j6().length;
        }

        @Override
        public int FH() {
            return this.j6;
        }

        @Override
        public boolean Hw() {
            return false;
        }

        @Override
        public byte[] j6() {
            return this.DW;
        }

        @Override
        public abcd.JE v5() {
            return new abcd.JE.b(this);
        }
    }

    public FE() {
    }

    private static byte[] j6(byte[] r3) {
        byte[] r0 = new byte[r3.length];
        java.lang.System.arraycopy(r3, 0, r0, 0, r3.length);
        return r0;
    }

    public abstract long DW();

    public byte[] DW(int r6) {
        if (Hw() == false) goto L5;
        abcd.JE r0 = v5();
        long r1 = r0.j6();     // Catch: java.lang.Throwable -> L25
        long r3 = r6;
        if (r3 < r1) goto L24;
        if (2147483647L < r1) goto L22;
        byte[] r7 = new byte[(int) r1];     // Catch: java.lang.OutOfMemoryError -> L18 java.lang.Throwable -> L25
    L15:
        abcd.BK.j6(r0, r7, 0, r7.length);     // Catch: java.lang.Throwable -> L25
        r0.close();
        return r7;
    L18:
        e = move-exception;
        throw new abcd.cD.c(e);     // Catch: java.lang.Throwable -> L25
    L22:
        throw new abcd.cD.a();     // Catch: java.lang.Throwable -> L25
    L24:
        throw new abcd.cD.b(r3, r1);     // Catch: java.lang.Throwable -> L25
    L25:
        th = move-exception;
        r0.close();
        throw th;
    L5:
        return j6();
    }

    public abstract int FH();

    public abstract boolean Hw();

    public void j6(java.io.OutputStream r9) {
        if (Hw() == false) goto L21;
        abcd.JE r0 = v5();
        long r1 = r0.j6();     // Catch: java.lang.Throwable -> L18
        byte[] r3 = new byte[8192];     // Catch: java.lang.Throwable -> L18
        long r4 = 0;
    L7:
        if (r4 >= r1) goto L9;
        int r6 = r0.read(r3);     // Catch: java.lang.Throwable -> L18
        if (r6 < 0) goto L17;
        r9.write(r3, 0, r6);     // Catch: java.lang.Throwable -> L18
        r4 = r4 + ((long) r6);     // Catch: java.lang.Throwable -> L18
        goto L7
    L17:
        throw new java.io.EOFException();     // Catch: java.lang.Throwable -> L18
    L9:
        if (r0.read() >= 0) goto L12;
        r0.close();
        return;
    L12:
        throw new java.io.EOFException();     // Catch: java.lang.Throwable -> L18
    L18:
        th = move-exception;
        r0.close();
        throw th;
    L21:
        r9.write(j6());
    }

    public abstract byte[] j6();

    public final byte[] j6(int r2) {
        return j6(DW(r2));
    L5:
        e = move-exception;
        throw new abcd.cD.c(e);
    }

    public abstract abcd.JE v5();
}
