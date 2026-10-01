package abcd;

public abstract class Fw {

    public static class a extends org.apache.http.entity.HttpEntityWrapper {
        private final long DW;
        private final abcd.Fw j6;

        private class C0002a extends java.io.FilterOutputStream {
            private long DW;
            private long FH;
            final abcd.Fw.a Hw;
            private long j6;

            public C0002a(abcd.Fw.a r3, java.io.OutputStream r4) {
                this.Hw = r3;
                super(r4);
                this.j6 = 0;
                this.DW = 0;
                this.FH = 0;
                this.DW = abcd.Fw.a.j6(r3).j6();
            }

            @Override
            public void write(int r7) {
                long r0 = 0L;
                java.lang.Throwable $ex0 = null;
                int $pc0 = -1;
                $sw0: while (true) {
                    switch ($pc0) {
                        case -1: {
                            super.write(r7);
                            this.FH++;
                            r0 = java.lang.System.currentTimeMillis();
                            if ((r0 - this.j6) <= this.DW) { $pc0 = 6; continue $sw0; }
                            this.j6 = r0;
                            abcd.Fw.a.j6(this.Hw).j6(this.FH, abcd.Fw.a.DW(this.Hw));
                            return;
                        }
                        case 6: {
                            return;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            public void write(byte[] r5, int r6, int r7) {
                long r8 = 0L;
                java.lang.Throwable $ex1 = null;
                int $pc1 = -1;
                $sw1: while (true) {
                    switch ($pc1) {
                        case -1: {
                            ((java.io.FilterOutputStream) this).out.write(r5, r6, r7);
                            this.FH += (long) r7;
                            r8 = java.lang.System.currentTimeMillis();
                            if ((r8 - this.j6) <= this.DW) { $pc1 = 6; continue $sw1; }
                            this.j6 = r8;
                            abcd.Fw.a.j6(this.Hw).j6(this.FH, abcd.Fw.a.DW(this.Hw));
                            return;
                        }
                        case 6: {
                            return;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }
        }

        public a(org.apache.http.HttpEntity r1, abcd.Fw r2) {
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        super(r1);
                        if (r2 == null) { $pc2 = 7; continue $sw2; }
                        this.j6 = r2;
                        this.DW = r1.getContentLength();
                        return;
                    }
                    case 7: {
                        throw new java.lang.IllegalArgumentException("'listener' is null");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        static long DW(abcd.Fw.a r2) {
            return r2.DW;
        }

        static abcd.Fw j6(abcd.Fw.a r0) {
            return r0.j6;
        }

        @Override
        public void writeTo(java.io.OutputStream r3) {
            ((org.apache.http.entity.HttpEntityWrapper) this).wrappedEntity.writeTo(new abcd.Fw.a.C0002a(this, r3));
        }
    }

    public abstract long j6();

    public abstract void j6(long r1, long r3);
}
