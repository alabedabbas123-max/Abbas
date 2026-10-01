package abcd;

public abstract class RK extends java.io.OutputStream {
    private int DW;
    private java.io.OutputStream FH;
    private java.util.ArrayList<abcd.RK.a> j6;

    static class a {
        int DW;
        final byte[] j6;

        a() {
            this.j6 = new byte[8192];
        }

        a(int r1) {
            this.j6 = new byte[r1];
        }

        boolean j6() {
            if (this.DW != this.j6.length) goto L6;
            return true;
        L6:
            return false;
        }
    }

    private class b extends java.io.InputStream {
        private int DW;
        private abcd.RK.a FH;
        private int Hw;
        private byte[] j6;
        final abcd.RK v5;

        b(abcd.RK r2) {
            this.v5 = r2;
            this.FH = (abcd.RK.a) abcd.RK.j6(r2).get(this.DW);
        }

        private boolean j6() {
            int r0 = this.DW + 1;
            this.DW = r0;
            if (r0 >= abcd.RK.j6(this.v5).size()) goto L6;
            this.FH = (abcd.RK.a) abcd.RK.j6(this.v5).get(this.DW);
            this.Hw = 0;
            return true;
        L6:
            return false;
        }

        @Override
        public int read() {
            if (this.j6 != null) goto L6;
            this.j6 = new byte[1];
        L6:
            if (read(this.j6) == 1) goto L10;
            return -1;
        L10:
            return this.j6[0] & 255;
        }

        @Override
        public int read(byte[] r5, int r6, int r7) {
            int r0 = 0;
            if (r7 != 0) goto L5;
            return 0;
        L5:
            if (r7 <= 0) goto L13;
            int r1 = java.lang.Math.min(this.FH.DW - this.Hw, r7);
            if (r1 > 0) goto L9;
            if (j6() == false) goto L13;
        L9:
            java.lang.System.arraycopy(this.FH.j6, this.Hw, r5, r6, r1);
            this.Hw += r1;
            r6 = r6 + r1;
            r7 = r7 - r1;
            r0 = r0 + r1;
        L13:
            if (r0 > 0) goto L24;
            return -1;
        L24:
            return r0;
        }

        @Override
        public long skip(long r7) {
            long r2 = 0;
        L4:
            if (0 >= r7) goto L12;
            int r5 = (int) java.lang.Math.min(this.FH.DW - this.Hw, r7);
            if (r5 > 0) goto L8;
            if (j6() == false) goto L12;
        L8:
            this.Hw += r5;
            long r4 = r5;
            r2 = r2 + r4;
            r7 = r7 - r4;
        L12:
            return r2;
        }
    }

    public static class c extends abcd.RK {
        public c(int r1) {
            super(r1);
        }

        @Override
        protected java.io.OutputStream Hw() {
            throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().inMemoryBufferLimitExceeded);
        }
    }

    public static class d extends abcd.RK {
        private final java.io.File Hw;
        private java.io.File v5;

        public d() {
            this(null, 1048576);
        }

        public d(java.io.File r1, int r2) {
            super(r2);
            this.Hw = r1;
        }

        @Override
        public long DW() {
            java.io.File r0 = this.v5;
            if (r0 != null) goto L7;
            return super.DW();
        L7:
            return r0.length();
        }

        @Override
        protected java.io.OutputStream Hw() {
            this.v5 = java.io.File.createTempFile("jgit_", ".buf", this.Hw);
            return new java.io.FileOutputStream(this.v5);
        }

        @Override
        public void j6() {
            super.j6();
            java.io.File r0 = this.v5;
            if (r0 != null) goto L13;
            return;
        L13:
        L9:
            th = move-exception;
            this.v5 = null;
            throw th;
        L6:
            if (r0.delete() == true) goto L8;
            this.v5.deleteOnExit();     // Catch: java.lang.Throwable -> L9
        L8:
            this.v5 = null;
        }

        @Override
        public void j6(java.io.OutputStream r5, abcd.LE r6) {
            if (this.v5 != null) goto L6;
            super.j6(r5, r6);
            return;
        L6:
            if (r6 != null) goto L8;
            r6 = abcd.vE.j6;
        L8:
            java.io.FileInputStream r0 = new java.io.FileInputStream(this.v5);
            byte[] r1 = new byte[8192];     // Catch: java.lang.Throwable -> L17
        L10:
            int r2 = r0.read(r1);     // Catch: java.lang.Throwable -> L17
            if (r2 < 0) goto L12;
            r5.write(r1, 0, r2);     // Catch: java.lang.Throwable -> L17
            r6.update(r2 / 1024);     // Catch: java.lang.Throwable -> L17
            goto L10
        L12:
            r0.close();
            return;
        L17:
            th = move-exception;
            r0.close();
            throw th;
        }
    }

    protected RK(int r1) {
        this.DW = r1;
        v5();
    }

    private long VH() {
        abcd.RK.a r0 = gn();
        return ((((long) this.j6.size()) - 1) * 8192) + ((long) r0.DW);
    }

    private abcd.RK.a gn() {
        java.util.ArrayList<abcd.RK.a> r0 = this.j6;
        return r0.get(r0.size() - 1);
    }

    static java.util.ArrayList j6(abcd.RK r0) {
        return r0.j6;
    }

    private void tp() {
        this.FH = Hw();
        java.util.ArrayList<abcd.RK.a> r0 = this.j6;
        abcd.RK.a r1 = r0.remove(r0.size() - 1);
        java.util.Iterator<abcd.RK.a> r2 = this.j6.iterator();
    L4:
        if (r2.hasNext() == false) goto L5;
        abcd.RK.a r3 = r2.next();
        this.FH.write(r3.j6, 0, r3.DW);
        goto L4
    L5:
        this.j6 = null;
        this.FH = new abcd.XK(this.FH, 8192);
        this.FH.write(r1.j6, 0, r1.DW);
    }

    private boolean u7() {
        if (VH() >= this.DW) goto L6;
        return false;
    L6:
        tp();
        return true;
    }

    public long DW() {
        return VH();
    }

    public java.io.InputStream FH() {
        return new abcd.RK.b(this);
    }

    protected abstract java.io.OutputStream Hw();

    public byte[] Zo() {
        long r0 = DW();
        if (2147483647L < r0) goto L10;
        byte[] r1 = new byte[(int) r0];
        java.util.Iterator<abcd.RK.a> r2 = this.j6.iterator();
        int r3 = 0;
    L6:
        if (r2.hasNext() == false) goto L7;
        abcd.RK.a r4 = r2.next();
        java.lang.System.arraycopy(r4.j6, 0, r1, r3, r4.DW);
        r3 = r3 + r4.DW;
        goto L6
    L7:
        return r1;
    L10:
        throw new java.lang.OutOfMemoryError(org.eclipse.jgit.JGitText.j6().lengthExceedsMaximumArraySize);
    }

    @Override
    public void close() {
        java.io.OutputStream r0 = this.FH;
        if (r0 != null) goto L11;
        return;
    L11:
        r0.close();     // Catch: java.lang.Throwable -> L7
        this.FH = null;
        return;
    L7:
        th = move-exception;
        this.FH = null;
        throw th;
    }

    public void j6() {
        this.j6 = null;
        java.io.OutputStream r1 = this.FH;
        if (r1 == null) goto L14;
        r1.close();     // Catch: java.lang.Throwable -> L6 java.io.IOException -> L11
    L6:
        th = move-exception;
        this.FH = null;
        throw th;
    L9:
        this.FH = null;
        return;
    }

    public void j6(java.io.InputStream r5) {
        if (this.j6 == null) goto L14;
    L4:
        abcd.RK.a r0 = gn();
        if (r0.j6() == true) goto L7;
    L10:
        byte[] r1 = r0.j6;
        int r2 = r0.DW;
        int r3 = r5.read(r1, r2, r1.length - r2);
        if (r3 < 1) goto L12;
        r0.DW += r3;
        goto L4
    L12:
        return;
    L7:
        if (u7() == true) goto L14;
        r0 = new abcd.RK.a();
        this.j6.add(r0);
    L14:
        byte[] r4 = new byte[8192];
    L15:
        int r6 = r5.read(r4);
        if (r6 <= 0) goto L17;
        this.FH.write(r4, 0, r6);
        goto L15
    }

    public void j6(java.io.OutputStream r6, abcd.LE r7) {
        if (r7 != null) goto L4;
        r7 = abcd.vE.j6;
    L4:
        java.util.Iterator<abcd.RK.a> r0 = this.j6.iterator();
    L6:
        if (r0.hasNext() == false) goto L7;
        abcd.RK.a r1 = r0.next();
        r6.write(r1.j6, 0, r1.DW);
        r7.update(r1.DW / 1024);
        goto L6
    }

    public void v5() {
        if (this.FH == null) goto L5;
        j6();
    L5:
        int r0 = this.DW;
        if (r0 >= 8192) goto L8;
        this.j6 = new java.util.ArrayList(1);
        this.j6.add(new abcd.RK.a(this.DW));
        return;
    L8:
        this.j6 = new java.util.ArrayList(r0 / 8192);
        this.j6.add(new abcd.RK.a());
    }

    @Override
    public void write(int r5) {
        java.io.OutputStream r0 = this.FH;
        if (r0 == null) goto L6;
        r0.write(r5);
        return;
    L6:
        abcd.RK.a r1 = gn();
        if (r1.j6() == true) goto L9;
    L13:
        byte[] r2 = r1.j6;
        int r3 = r1.DW;
        r1.DW = r3 + 1;
        r2[r3] = (byte) r5;
        return;
    L9:
        if (u7() == false) goto L12;
        this.FH.write(r5);
        return;
    L12:
        r1 = new abcd.RK.a();
        this.j6.add(r1);
        goto L13
    }

    @Override
    public void write(byte[] r5, int r6, int r7) {
        if (this.FH != null) goto L13;
    L4:
        if (r7 <= 0) goto L13;
        abcd.RK.a r0 = gn();
        if (r0.j6() == false) goto L12;
        if (u7() == true) goto L13;
        r0 = new abcd.RK.a();
        this.j6.add(r0);
    L12:
        int r1 = java.lang.Math.min(r0.j6.length - r0.DW, r7);
        java.lang.System.arraycopy(r5, r6, r0.j6, r0.DW, r1);
        r0.DW += r1;
        r7 = r7 - r1;
        r6 = r6 + r1;
    L13:
        if (r7 <= 0) goto L20;
        this.FH.write(r5, r6, r7);
        return;
    }
}
