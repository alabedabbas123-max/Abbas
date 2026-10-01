package abcd;

public abstract class EE {
    private byte[] DW;
    private final java.security.MessageDigest j6;

    public static class a extends abcd.EE {
        public a() {
        }

        @Override
        public void FH() {
        }

        @Override
        public void Hw() {
        }

        @Override
        public abcd.AI j6(java.io.InputStream r1) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override
        public abcd.yE j6(int r1, long r2, java.io.InputStream r4) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    protected EE() {
        this.j6 = abcd.hE.j6();
    }

    public abcd.yE DW(int r3, byte[] r4) {
        return DW(r3, r4, 0, r4.length);
    }

    public abcd.yE DW(int r4, byte[] r5, int r6, int r7) {
        return j6(r4, r7, new java.io.ByteArrayInputStream(r5, r6, r7));
    }

    protected java.security.MessageDigest DW() {
        this.j6.reset();
        return this.j6;
    }

    public abstract void FH();

    public abstract void Hw();

    public abstract abcd.AI j6(java.io.InputStream r1);

    public abstract abcd.yE j6(int r1, long r2, java.io.InputStream r4);

    public abcd.yE j6(int r3, byte[] r4) {
        return j6(r3, r4, 0, r4.length);
    }

    public abcd.yE j6(int r4, byte[] r5, int r6, int r7) {
        java.security.MessageDigest r0 = DW();
        r0.update(abcd.hE.j6(r4));
        r0.update((byte) 32);
        r0.update(abcd.hE.j6(r7));
        r0.update((byte) 0);
        r0.update(r5, r6, r7);
        return abcd.yE.j6(r0.digest());
    }

    public final abcd.yE j6(abcd.fE r2) {
        return DW(1, r2.j6());
    }

    public final abcd.yE j6(abcd.mF r1) {
        return r1.j6(this);
    }

    protected byte[] j6() {
        if (this.DW != null) goto L6;
        this.DW = new byte[8192];
    L6:
        return this.DW;
    }
}
