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
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (this.DW != this.j6.length) { $pc0 = 6; continue $sw0; }
                        return true;
                    }
                    case 6: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            int r0 = 0;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = this.DW + 1;
                        this.DW = r0;
                        if (r0 >= abcd.RK.j6(this.v5).size()) { $pc1 = 6; continue $sw1; }
                        this.FH = (abcd.RK.a) abcd.RK.j6(this.v5).get(this.DW);
                        this.Hw = 0;
                        return true;
                    }
                    case 6: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public int read() {
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        if (this.j6 != null) { $pc2 = 6; continue $sw2; }
                        this.j6 = new byte[1];
                        $pc2 = 6; continue $sw2;
                    }
                    case 6: {
                        if (read(this.j6) == 1) { $pc2 = 10; continue $sw2; }
                        return -1;
                    }
                    case 10: {
                        return this.j6[0] & 255;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public int read(byte[] r5, int r6, int r7) {
            int r0 = 0;
            int r1 = 0;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        r0 = 0;
                        if (r7 != 0) { $pc3 = 5; continue $sw3; }
                        return 0;
                    }
                    case 5: {
                        if (r7 <= 0) { $pc3 = 13; continue $sw3; }
                        r1 = java.lang.Math.min(this.FH.DW - this.Hw, r7);
                        if (r1 > 0) { $pc3 = 9; continue $sw3; }
                        if (j6() == false) { $pc3 = 13; continue $sw3; }
                        $pc3 = 9; continue $sw3;
                    }
                    case 9: {
                        java.lang.System.arraycopy(this.FH.j6, this.Hw, r5, r6, r1);
                        this.Hw += r1;
                        r6 = r6 + r1;
                        r7 = r7 - r1;
                        r0 = r0 + r1;
                        $pc3 = 13; continue $sw3;
                    }
                    case 13: {
                        if (r0 > 0) { $pc3 = 24; continue $sw3; }
                        return -1;
                    }
                    case 24: {
                        return r0;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public long skip(long r7) {
            long r2 = 0L;
            int r5 = 0;
            long r4 = 0L;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        r2 = 0;
                        $pc4 = 4; continue $sw4;
                    }
                    case 4: {
                        if (0 >= r7) { $pc4 = 12; continue $sw4; }
                        r5 = (int) java.lang.Math.min(this.FH.DW - this.Hw, r7);
                        if (r5 > 0) { $pc4 = 8; continue $sw4; }
                        if (j6() == false) { $pc4 = 12; continue $sw4; }
                        $pc4 = 8; continue $sw4;
                    }
                    case 8: {
                        this.Hw += r5;
                        r4 = r5;
                        r2 = r2 + r4;
                        r7 = r7 - r4;
                        $pc4 = 12; continue $sw4;
                    }
                    case 12: {
                        return r2;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            java.io.File r0 = null;
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        r0 = this.v5;
                        if (r0 != null) { $pc5 = 7; continue $sw5; }
                        return super.DW();
                    }
                    case 7: {
                        return r0.length();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        protected java.io.OutputStream Hw() {
            this.v5 = java.io.File.createTempFile("jgit_", ".buf", this.Hw);
            return new java.io.FileOutputStream(this.v5);
        }

        @Override
        public void j6() {
            java.io.File r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex6 = null;
            int $pc6 = -1;
            $sw6: while (true) {
                switch ($pc6) {
                    case -1: {
                        super.j6();
                        r0 = this.v5;
                        if (r0 != null) { $pc6 = 13; continue $sw6; }
                        return;
                    }
                    case 13: {
                        $pc6 = 9; continue $sw6;
                    }
                    case 9: {
                        th = $ex6;
                        this.v5 = null;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 6: {
                        if (r0.delete() == true) { $pc6 = 8; continue $sw6; }
                        try {
                            this.v5.deleteOnExit();
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 9; continue $sw6;
                        }
                        $pc6 = 8; continue $sw6;
                    }
                    case 8: {
                        this.v5 = null;
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void j6(java.io.OutputStream r5, abcd.LE r6) {
            java.io.FileInputStream r0 = null;
            byte[] r1 = null;
            int r2 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex7 = null;
            int $pc7 = -1;
            $sw7: while (true) {
                switch ($pc7) {
                    case -1: {
                        if (this.v5 != null) { $pc7 = 6; continue $sw7; }
                        super.j6(r5, r6);
                        return;
                    }
                    case 6: {
                        if (r6 != null) { $pc7 = 8; continue $sw7; }
                        r6 = abcd.vE.j6;
                        $pc7 = 8; continue $sw7;
                    }
                    case 8: {
                        r0 = new java.io.FileInputStream(this.v5);
                        try {
                            r1 = new byte[8192];
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 17; continue $sw7;
                        }
                        $pc7 = 10; continue $sw7;
                    }
                    case 10: {
                        try {
                            r2 = r0.read(r1);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 17; continue $sw7;
                        }
                        if (r2 < 0) { $pc7 = 12; continue $sw7; }
                        try {
                            r5.write(r1, 0, r2);
                            r6.update(r2 / 1024);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 17; continue $sw7;
                        }
                        { $pc7 = 10; continue $sw7; }
                    }
                    case 12: {
                        r0.close();
                        return;
                    }
                    case 17: {
                        th = $ex7;
                        r0.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
        java.util.ArrayList<abcd.RK.a> r0 = null;
        abcd.RK.a r1 = null;
        java.util.Iterator<abcd.RK.a> r2 = null;
        abcd.RK.a r3 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    this.FH = Hw();
                    r0 = this.j6;
                    r1 = r0.remove(r0.size() - 1);
                    r2 = this.j6.iterator();
                    $pc8 = 4; continue $sw8;
                }
                case 4: {
                    if (r2.hasNext() == false) { $pc8 = 5; continue $sw8; }
                    r3 = r2.next();
                    this.FH.write(r3.j6, 0, r3.DW);
                    { $pc8 = 4; continue $sw8; }
                }
                case 5: {
                    this.j6 = null;
                    this.FH = new abcd.XK(this.FH, 8192);
                    this.FH.write(r1.j6, 0, r1.DW);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean u7() {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (VH() >= this.DW) { $pc9 = 6; continue $sw9; }
                    return false;
                }
                case 6: {
                    tp();
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public long DW() {
        return VH();
    }

    public java.io.InputStream FH() {
        return new abcd.RK.b(this);
    }

    protected abstract java.io.OutputStream Hw();

    public byte[] Zo() {
        long r0 = 0L;
        byte[] r1 = null;
        java.util.Iterator<abcd.RK.a> r2 = null;
        int r3 = 0;
        abcd.RK.a r4 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = DW();
                    if (2147483647L < r0) { $pc10 = 10; continue $sw10; }
                    r1 = new byte[(int) r0];
                    r2 = this.j6.iterator();
                    r3 = 0;
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    if (r2.hasNext() == false) { $pc10 = 7; continue $sw10; }
                    r4 = r2.next();
                    java.lang.System.arraycopy(r4.j6, 0, r1, r3, r4.DW);
                    r3 = r3 + r4.DW;
                    { $pc10 = 6; continue $sw10; }
                }
                case 7: {
                    return r1;
                }
                case 10: {
                    throw new java.lang.OutOfMemoryError(org.eclipse.jgit.JGitText.j6().lengthExceedsMaximumArraySize);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void close() {
        java.io.OutputStream r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = this.FH;
                    if (r0 != null) { $pc11 = 11; continue $sw11; }
                    return;
                }
                case 11: {
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 7; continue $sw11;
                    }
                    this.FH = null;
                    return;
                }
                case 7: {
                    th = $ex11;
                    this.FH = null;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        java.io.OutputStream r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    this.j6 = null;
                    r1 = this.FH;
                    if (r1 == null) { $pc12 = 14; continue $sw12; }
                    try {
                        r1.close();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        if ($t instanceof java.io.IOException) { $pc12 = 11; continue $sw12; }
                        $pc12 = 6; continue $sw12;
                    }
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    th = $ex12;
                    this.FH = null;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 9: {
                    this.FH = null;
                    return;
                }
                case 11: {
                    $pc12 = 14; continue $sw12;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.io.InputStream r5) {
        abcd.RK.a r0 = null;
        byte[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        byte[] r4 = null;
        int r6 = 0;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    if (this.j6 == null) { $pc13 = 14; continue $sw13; }
                    $pc13 = 4; continue $sw13;
                }
                case 4: {
                    r0 = gn();
                    if (r0.j6() == true) { $pc13 = 7; continue $sw13; }
                    $pc13 = 10; continue $sw13;
                }
                case 10: {
                    r1 = r0.j6;
                    r2 = r0.DW;
                    r3 = r5.read(r1, r2, r1.length - r2);
                    if (r3 < 1) { $pc13 = 12; continue $sw13; }
                    r0.DW += r3;
                    { $pc13 = 4; continue $sw13; }
                }
                case 12: {
                    return;
                }
                case 7: {
                    if (u7() == true) { $pc13 = 14; continue $sw13; }
                    r0 = new abcd.RK.a();
                    this.j6.add(r0);
                    $pc13 = 14; continue $sw13;
                }
                case 14: {
                    r4 = new byte[8192];
                    $pc13 = 15; continue $sw13;
                }
                case 15: {
                    r6 = r5.read(r4);
                    if (r6 <= 0) { $pc13 = 17; continue $sw13; }
                    this.FH.write(r4, 0, r6);
                    { $pc13 = 15; continue $sw13; }
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.io.OutputStream r6, abcd.LE r7) {
        java.util.Iterator<abcd.RK.a> r0 = null;
        abcd.RK.a r1 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    if (r7 != null) { $pc14 = 4; continue $sw14; }
                    r7 = abcd.vE.j6;
                    $pc14 = 4; continue $sw14;
                }
                case 4: {
                    r0 = this.j6.iterator();
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    if (r0.hasNext() == false) { $pc14 = 7; continue $sw14; }
                    r1 = r0.next();
                    r6.write(r1.j6, 0, r1.DW);
                    r7.update(r1.DW / 1024);
                    { $pc14 = 6; continue $sw14; }
                }
                case 7: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void v5() {
        int r0 = 0;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    if (this.FH == null) { $pc15 = 5; continue $sw15; }
                    j6();
                    $pc15 = 5; continue $sw15;
                }
                case 5: {
                    r0 = this.DW;
                    if (r0 >= 8192) { $pc15 = 8; continue $sw15; }
                    this.j6 = new java.util.ArrayList(1);
                    this.j6.add(new abcd.RK.a(this.DW));
                    return;
                }
                case 8: {
                    this.j6 = new java.util.ArrayList(r0 / 8192);
                    this.j6.add(new abcd.RK.a());
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void write(int r5) {
        java.io.OutputStream r0 = null;
        abcd.RK.a r1 = null;
        byte[] r2 = null;
        int r3 = 0;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    r0 = this.FH;
                    if (r0 == null) { $pc16 = 6; continue $sw16; }
                    r0.write(r5);
                    return;
                }
                case 6: {
                    r1 = gn();
                    if (r1.j6() == true) { $pc16 = 9; continue $sw16; }
                    $pc16 = 13; continue $sw16;
                }
                case 13: {
                    r2 = r1.j6;
                    r3 = r1.DW;
                    r1.DW = r3 + 1;
                    r2[r3] = (byte) r5;
                    return;
                }
                case 9: {
                    if (u7() == false) { $pc16 = 12; continue $sw16; }
                    this.FH.write(r5);
                    return;
                }
                case 12: {
                    r1 = new abcd.RK.a();
                    this.j6.add(r1);
                    { $pc16 = 13; continue $sw16; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void write(byte[] r5, int r6, int r7) {
        abcd.RK.a r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    if (this.FH != null) { $pc17 = 13; continue $sw17; }
                    $pc17 = 4; continue $sw17;
                }
                case 4: {
                    if (r7 <= 0) { $pc17 = 13; continue $sw17; }
                    r0 = gn();
                    if (r0.j6() == false) { $pc17 = 12; continue $sw17; }
                    if (u7() == true) { $pc17 = 13; continue $sw17; }
                    r0 = new abcd.RK.a();
                    this.j6.add(r0);
                    $pc17 = 12; continue $sw17;
                }
                case 12: {
                    r1 = java.lang.Math.min(r0.j6.length - r0.DW, r7);
                    java.lang.System.arraycopy(r5, r6, r0.j6, r0.DW, r1);
                    r0.DW += r1;
                    r7 = r7 - r1;
                    r6 = r6 + r1;
                    $pc17 = 13; continue $sw17;
                }
                case 13: {
                    if (r7 <= 0) { $pc17 = 20; continue $sw17; }
                    this.FH.write(r5, r6, r7);
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
