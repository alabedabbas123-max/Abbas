package abcd;

public abstract class JE extends java.io.InputStream {

    public static class a extends abcd.JE {
        private final long DW;
        private final java.io.InputStream FH;
        private final int j6;

        public a(int r1, long r2, java.io.InputStream r4) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = r4;
        }

        @Override
        public int available() {
            return this.FH.available();
        }

        @Override
        public void close() {
            this.FH.close();
        }

        @Override
        public long j6() {
            return this.DW;
        }

        @Override
        public void mark(int r2) {
            this.FH.mark(r2);
        }

        @Override
        public boolean markSupported() {
            return this.FH.markSupported();
        }

        @Override
        public int read() {
            return this.FH.read();
        }

        @Override
        public int read(byte[] r2, int r3, int r4) {
            return this.FH.read(r2, r3, r4);
        }

        @Override
        public void reset() {
            this.FH.reset();
        }

        @Override
        public long skip(long r2) {
            return this.FH.skip(r2);
        }
    }

    public static class b extends abcd.JE {
        private final byte[] DW;
        private int FH;
        private int Hw;
        private final int j6;

        public b(int r1, byte[] r2) {
            this.j6 = r1;
            this.DW = r2;
        }

        public b(abcd.FE r2) {
            this(r2.FH(), r2.j6());
        }

        @Override
        public int available() {
            return this.DW.length - this.FH;
        }

        @Override
        public long j6() {
            return this.DW.length;
        }

        @Override
        public void mark(int r1) {
            this.Hw = this.FH;
        }

        @Override
        public boolean markSupported() {
            return true;
        }

        @Override
        public int read() {
            int r0 = this.FH;
            byte[] r1 = this.DW;
            if (r0 != r1.length) goto L6;
            return -1;
        L6:
            this.FH = r0 + 1;
            return r1[r0] & 255;
        }

        @Override
        public int read(byte[] r3, int r4, int r5) {
            if (this.FH != this.DW.length) goto L6;
            return -1;
        L6:
            int r6 = java.lang.Math.min(available(), r5);
            java.lang.System.arraycopy(this.DW, this.FH, r3, r4, r6);
            this.FH += r6;
            return r6;
        }

        @Override
        public void reset() {
            this.FH = this.Hw;
        }

        @Override
        public long skip(long r5) {
            int r6 = (int) java.lang.Math.min(available(), java.lang.Math.max(0, r5));
            this.FH += r6;
            return r6;
        }
    }

    public JE() {
    }

    public abstract long j6();
}
