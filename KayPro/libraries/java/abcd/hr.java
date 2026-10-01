package abcd;

public final class hr {
    private int DW;
    private final java.util.List<abcd.hr.a> FH;
    private final abcd.ir j6;

    public final class a implements abcd.Tt {
        private int DW;
        private int FH;
        private int Hw;
        final abcd.hr Zo;
        private abcd.ir.a j6;
        private byte[] v5;

        private a(abcd.hr r1, abcd.ir.a r2) {
            this.Zo = r1;
            this.j6 = r2;
            this.DW = -1;
            this.FH = 0;
            this.Hw = Integer.MAX_VALUE;
        }

        private a(abcd.hr r1, abcd.ir.a r2, int r3) {
            this.Zo = r1;
            this.j6 = r2;
            this.DW = r3;
            this.FH = 0;
            this.Hw = Integer.MAX_VALUE;
        }

        private a(abcd.hr r1, abcd.ir.a r2, int r3, int r4) {
            this.Zo = r1;
            this.j6 = r2;
            this.DW = r3;
            this.FH = 0;
            this.Hw = r4;
        }

        a(abcd.hr r1, abcd.ir.a r2, int r3, int r4, abcd.gr r5) {
            this(r1, r2, r3, r4);
        }

        private a(abcd.hr r1, abcd.ir.a r2, int r3, int r4, byte[] r5) {
            this.Zo = r1;
            this.j6 = r2;
            this.v5 = r5;
            this.DW = r3;
            this.FH = r4;
            this.Hw = r4;
        }

        a(abcd.hr r1, abcd.ir.a r2, int r3, int r4, byte[] r5, abcd.gr r6) {
            this(r1, r2, r3, r4, r5);
        }

        a(abcd.hr r1, abcd.ir.a r2, int r3, abcd.gr r4) {
            this(r1, r2, r3);
        }

        a(abcd.hr r1, abcd.ir.a r2, abcd.gr r3) {
            this(r1, r2);
        }

        static int DW(abcd.hr.a r0) {
            return r0.Hw;
        }

        static int DW(abcd.hr.a r0, int r1) {
            r0.DW = r1;
            return r1;
        }

        static byte[] FH(abcd.hr.a r0) {
            return r0.v5;
        }

        static int Hw(abcd.hr.a r0) {
            return r0.DW;
        }

        static int j6(abcd.hr.a r0, int r1) {
            r0.FH = r1;
            return r1;
        }

        static abcd.ir.a j6(abcd.hr.a r0) {
            return r0.j6;
        }

        private void tp(int r4) {
            int r0 = 0;
            int r1 = 0;
            byte[] r2 = null;
            int r3 = 0;
            byte[] r5 = null;
            byte[] r6 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = this.Hw;
                        if (r0 != Integer.MAX_VALUE) { $pc0 = 15; continue $sw0; }
                        if (this.v5 != null) { $pc0 = 7; continue $sw0; }
                        this.v5 = new byte[1024];
                        $pc0 = 7; continue $sw0;
                    }
                    case 7: {
                        r1 = this.FH + r4;
                        r2 = this.v5;
                        if (r1 <= r2.length) { $pc0 = 19; continue $sw0; }
                        r3 = r2.length;
                        $pc0 = 10; continue $sw0;
                    }
                    case 10: {
                        r3 = r3 * 2;
                        if ((this.FH + r4) > r3) { $pc0 = 10; continue $sw0; }
                        r5 = new byte[r3];
                        r6 = this.v5;
                        java.lang.System.arraycopy(r6, 0, r5, 0, r6.length);
                        this.v5 = r5;
                        return;
                    }
                    case 19: {
                        return;
                    }
                    case 15: {
                        if (this.v5 != null) { $pc0 = 18; continue $sw0; }
                        this.v5 = new byte[r0];
                        $pc0 = 18; continue $sw0;
                    }
                    case 18: {
                        if ((this.FH + r4) > this.Hw) { $pc0 = 21; continue $sw0; }
                        return;
                    }
                    case 21: {
                        throw new abcd.Ut("Section limit " + this.Hw + " exceeded");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public void DW(int r1) {
            abcd.eu.DW(this, r1);
        }

        public int EQ() {
            return this.FH;
        }

        public boolean J0() {
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (this.DW < 0) { $pc1 = 5; continue $sw1; }
                        return true;
                    }
                    case 5: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public boolean J8() {
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        if (this.Hw == Integer.MAX_VALUE) { $pc2 = 5; continue $sw2; }
                        return true;
                    }
                    case 5: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public void VH() {
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        if ((this.FH & 3) != 0) { $pc3 = 6; continue $sw3; }
                        return;
                    }
                    case 6: {
                        throw new java.lang.IllegalStateException("Not four byte aligned!");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public void VH(int r1) {
            abcd.eu.j6(this, r1);
        }

        public void Zo() {
            int r0 = 0;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        r0 = this.FH;
                        this.FH = abcd.hr.j6(r0);
                        $pc4 = 4; continue $sw4;
                    }
                    case 4: {
                        if (r0 >= this.FH) { $pc4 = 6; continue $sw4; }
                        this.v5[r0] = 0;
                        r0 = r0 + 1;
                        { $pc4 = 4; continue $sw4; }
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public void Zo(int r2) {
            this.FH += r2;
        }

        public int gn() {
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        Zo();
                        this.Hw = this.FH;
                        if (this.v5 != null) { $pc5 = 6; continue $sw5; }
                        this.v5 = new byte[0];
                        $pc5 = 6; continue $sw5;
                    }
                    case 6: {
                        return this.FH;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public void gn(int r1) {
            DW(r1 + 1);
        }

        public void j6(abcd.fr r4) {
            short[] r5 = null;
            int r0 = 0;
            int r1 = 0;
            java.lang.Throwable $ex6 = null;
            int $pc6 = -1;
            $sw6: while (true) {
                switch ($pc6) {
                    case -1: {
                        r5 = r4.Hw();
                        writeInt(r5.length);
                        r0 = r5.length;
                        r1 = 0;
                        $pc6 = 3; continue $sw6;
                    }
                    case 3: {
                        if (r1 >= r0) { $pc6 = 5; continue $sw6; }
                        j6(r5[r1]);
                        r1 = r1 + 1;
                        { $pc6 = 3; continue $sw6; }
                    }
                    case 5: {
                        Zo();
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public void j6(short r5) {
            tp(2);
            byte[] r1 = this.v5;
            int r2 = this.FH;
            r1[r2] = (byte) r5;
            r1[r2 + 1] = (byte) (r5 >>> 8);
            this.FH = r2 + 2;
        }

        public void j6(short[] r4) {
            int r0 = 0;
            int r1 = 0;
            java.lang.Throwable $ex7 = null;
            int $pc7 = -1;
            $sw7: while (true) {
                switch ($pc7) {
                    case -1: {
                        r0 = r4.length;
                        r1 = 0;
                        $pc7 = 3; continue $sw7;
                    }
                    case 3: {
                        if (r1 >= r0) { $pc7 = 5; continue $sw7; }
                        j6(r4[r1]);
                        r1 = r1 + 1;
                        { $pc7 = 3; continue $sw7; }
                    }
                    case 5: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public int tp() {
            int r0 = 0;
            java.lang.Throwable $ex8 = null;
            int $pc8 = -1;
            $sw8: while (true) {
                switch ($pc8) {
                    case -1: {
                        r0 = this.DW;
                        if (r0 == (-1)) { $pc8 = 6; continue $sw8; }
                        return r0;
                    }
                    case 6: {
                        throw new abcd.Ut("Can not get offset in not yet placed section");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public int u7() {
            int r0 = 0;
            java.lang.Throwable $ex9 = null;
            int $pc9 = -1;
            $sw9: while (true) {
                switch ($pc9) {
                    case -1: {
                        r0 = this.DW;
                        if (r0 == (-1)) { $pc9 = 7; continue $sw9; }
                        return r0 + this.FH;
                    }
                    case 7: {
                        throw new abcd.Ut("Can not get offset in not yet placed section");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public void u7(int r4) {
            short r0 = 0;
            java.lang.Throwable $ex10 = null;
            int $pc10 = -1;
            $sw10: while (true) {
                switch ($pc10) {
                    case -1: {
                        r0 = (short) r4;
                        if (r4 != (65535 & r0)) { $pc10 = 7; continue $sw10; }
                        j6(r0);
                        return;
                    }
                    case 7: {
                        throw new java.lang.IllegalArgumentException("Expected an unsigned short: " + r4);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public void v5(int r1) {
            this.FH = r1;
        }

        public int we() {
            return this.FH;
        }

        public void write(byte[] r5) {
            tp(r5.length);
            java.lang.System.arraycopy(r5, 0, this.v5, this.FH, r5.length);
            this.FH += r5.length;
        }

        @Override
        public void writeByte(int r4) {
            tp(1);
            byte[] r0 = this.v5;
            int r1 = this.FH;
            this.FH = r1 + 1;
            r0[r1] = (byte) r4;
        }

        public void writeInt(int r6) {
            tp(4);
            byte[] r1 = this.v5;
            int r2 = this.FH;
            r1[r2] = (byte) r6;
            r1[r2 + 1] = (byte) (r6 >>> 8);
            r1[r2 + 2] = (byte) (r6 >>> 16);
            r1[r2 + 3] = (byte) (r6 >>> 24);
            this.FH = r2 + 4;
        }
    }

    public hr() {
        this.j6 = new abcd.ir();
        this.FH = new java.util.ArrayList();
    }

    private void Hw(abcd.ir.a r3) {
        int r0 = 0;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = 0;
                    $pc11 = 4; continue $sw11;
                }
                case 4: {
                    if (r0 >= this.FH.size()) { $pc11 = 10; continue $sw11; }
                    if (abcd.hr.a.j6(this.FH.get(r0)) == r3) { $pc11 = 9; continue $sw11; }
                    r0 = r0 + 1;
                    { $pc11 = 4; continue $sw11; }
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException("TOC section already added");
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void VH() {
        java.util.List<abcd.hr.a> r0 = null;
        java.util.List<abcd.hr.a> r1 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (this.FH.isEmpty() == true) { $pc12 = 11; continue $sw12; }
                    r0 = this.FH;
                    if (r0.get(r0.size() - 1).J8() == false) { $pc12 = 10; continue $sw12; }
                    r1 = this.FH;
                    if (r1.get(r1.size() - 1).J0() == false) { $pc12 = 10; continue $sw12; }
                    return;
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("Can not append section when size of last section is still unknown or not placed");
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Zo() {
        byte[] r0 = DW();
        abcd.hr.a r1 = this.FH.get(0);
        abcd.hr.a.j6(r1, 12);
        r1.write(r0);
        int r2 = j6();
        abcd.hr.a.j6(r1, 8);
        r1.writeInt(r2);
    }

    private void gn() {
        abcd.ir r0 = this.j6;
        int r1 = this.DW;
        r0.er = r1 - r0.yS;
        r0.a8 = r1;
        r0.j6(FH(r0.j6));
    }

    static int j6(int r0) {
        return v5(r0);
    }

    private void u7() {
        abcd.hr.a r0 = null;
        java.util.ArrayList r1 = null;
        java.util.Iterator<abcd.hr.a> r2 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = j6(this.j6.gn, ((this.FH.size() + 1) * 12) + 4, 1);
                    r1 = new java.util.ArrayList();
                    r2 = this.FH.iterator();
                    $pc13 = 4; continue $sw13;
                }
                case 4: {
                    if (r2.hasNext() == false) { $pc13 = 6; continue $sw13; }
                    r1.add(abcd.hr.a.j6(r2.next()));
                    { $pc13 = 4; continue $sw13; }
                }
                case 6: {
                    this.j6.j6(r0, r1);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int v5(int r0) {
        return (r0 + 3) & (-4);
    }

    public abcd.hr.a DW(abcd.ir.a r3) {
        Hw(r3);
        abcd.hr.a r0 = new abcd.hr.a(this, r3, null);
        this.FH.add(r0);
        return r0;
    }

    public void DW(int r5) {
        int r0 = 0;
        abcd.hr.a r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    if (this.FH.size() == 0) { $pc14 = 15; continue $sw14; }
                    r0 = this.FH.size() - 1;
                    r1 = this.FH.get(r0);
                    if (r1.J8() == true) { $pc14 = 13; continue $sw14; }
                    r2 = r1.gn();
                    if (r2 != 0) { $pc14 = 10; continue $sw14; }
                    if (r5 != 0) { $pc14 = 10; continue $sw14; }
                    this.FH.remove(r0);
                    return;
                }
                case 10: {
                    abcd.hr.a.j6(r1).FH = this.DW;
                    abcd.hr.a.j6(r1).DW = r5;
                    this.DW += r2;
                    return;
                }
                case 13: {
                    throw new java.lang.IllegalStateException("Last section already finished");
                }
                case 15: {
                    throw new java.lang.IllegalStateException("No sections present");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public byte[] DW() {
        java.security.MessageDigest r0 = null;
        abcd.hr.a r2 = null;
        int r1 = 0;
        abcd.hr.a r3 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    try {
                        r0 = java.security.MessageDigest.getInstance("SHA-1");
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.security.NoSuchAlgorithmException) { $pc15 = 12; continue $sw15; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r2 = this.FH.get(0);
                    r0.update(abcd.hr.a.FH(r2), 32, abcd.hr.a.DW(r2) - 32);
                    r1 = 1;
                    $pc15 = 5; continue $sw15;
                }
                case 5: {
                    if (r1 >= this.FH.size()) { $pc15 = 11; continue $sw15; }
                    r3 = this.FH.get(r1);
                    if (abcd.hr.a.DW(r3) <= 0) { $pc15 = 9; continue $sw15; }
                    r0.update(abcd.hr.a.FH(r3), 0, abcd.hr.a.DW(r3));
                    $pc15 = 9; continue $sw15;
                }
                case 9: {
                    r1 = r1 + 1;
                    { $pc15 = 5; continue $sw15; }
                }
                case 11: {
                    return r0.digest();
                }
                case 12: {
                    e = $ex15;
                    throw new java.lang.RuntimeException(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.hr.a FH(abcd.ir.a r4) {
        int r0 = 0;
        abcd.hr.a r1 = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    r0 = 0;
                    $pc16 = 4; continue $sw16;
                }
                case 4: {
                    if (r0 >= this.FH.size()) { $pc16 = 10; continue $sw16; }
                    r1 = this.FH.get(r0);
                    if (abcd.hr.a.j6(r1) == r4) { $pc16 = 7; continue $sw16; }
                    r0 = r0 + 1;
                    { $pc16 = 4; continue $sw16; }
                }
                case 7: {
                    return r1;
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("TOC section not present");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH() {
        u7();
        gn();
        Zo();
    }

    public void FH(int r5) {
        int r0 = 0;
        abcd.hr.a r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    if (this.FH.size() < 2) { $pc17 = 15; continue $sw17; }
                    r0 = this.FH.size() - 2;
                    r1 = this.FH.get(r0);
                    if (r1.J8() == true) { $pc17 = 13; continue $sw17; }
                    r2 = r1.gn();
                    if (r2 != 0) { $pc17 = 10; continue $sw17; }
                    if (r5 != 0) { $pc17 = 10; continue $sw17; }
                    this.FH.remove(r0);
                    return;
                }
                case 10: {
                    abcd.hr.a.j6(r1).FH = this.DW;
                    abcd.hr.a.j6(r1).DW = r5;
                    this.DW += r2;
                    return;
                }
                case 13: {
                    throw new java.lang.IllegalStateException("Second-to-last section already finished");
                }
                case 15: {
                    throw new java.lang.IllegalStateException("Less than two sections present");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int Hw() {
        return this.DW;
    }

    public int Hw(int r5) {
        int r0 = 0;
        abcd.hr.a r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    if (this.FH.size() == 0) { $pc18 = 20; continue $sw18; }
                    r0 = this.FH.size() - 1;
                    r1 = this.FH.get(r0);
                    if (r1.J8() == true) { $pc18 = 18; continue $sw18; }
                    if (r1.J0() == true) { $pc18 = 16; continue $sw18; }
                    r2 = r1.gn();
                    if (r2 != 0) { $pc18 = 13; continue $sw18; }
                    if (r5 != 0) { $pc18 = 13; continue $sw18; }
                    this.FH.remove(r0);
                    return 0;
                }
                case 13: {
                    abcd.hr.a.DW(r1, this.DW);
                    abcd.hr.a.j6(r1).FH = this.DW;
                    abcd.hr.a.j6(r1).DW = r5;
                    this.DW += r2;
                    return abcd.hr.a.Hw(r1);
                }
                case 16: {
                    throw new java.lang.IllegalStateException("Last section already placed");
                }
                case 18: {
                    throw new java.lang.IllegalStateException("Last section already finished");
                }
                case 20: {
                    throw new java.lang.IllegalStateException("No sections present");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6() {
        java.util.zip.Adler32 r0 = null;
        abcd.hr.a r1 = null;
        int r2 = 0;
        abcd.hr.a r3 = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    r0 = new java.util.zip.Adler32();
                    r1 = this.FH.get(0);
                    r0.update(abcd.hr.a.FH(r1), 12, abcd.hr.a.DW(r1) - 12);
                    r2 = 1;
                    $pc19 = 4; continue $sw19;
                }
                case 4: {
                    if (r2 >= this.FH.size()) { $pc19 = 10; continue $sw19; }
                    r3 = this.FH.get(r2);
                    if (abcd.hr.a.DW(r3) <= 0) { $pc19 = 8; continue $sw19; }
                    r0.update(abcd.hr.a.FH(r3), 0, abcd.hr.a.DW(r3));
                    $pc19 = 8; continue $sw19;
                }
                case 8: {
                    r2 = r2 + 1;
                    { $pc19 = 4; continue $sw19; }
                }
                case 10: {
                    return (int) r0.getValue();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.hr.a j6(abcd.ir.a r4) {
        VH();
        Hw(r4);
        abcd.hr.a r0 = new abcd.hr.a(this, r4, this.DW, null);
        this.FH.add(r0);
        return r0;
    }

    public abcd.hr.a j6(abcd.ir.a r7, int r8, int r9) {
        VH();
        Hw(r7);
        int r10 = v5(r8);
        int r3 = this.DW;
        r7.FH = r3;
        r7.DW = r9;
        abcd.hr.a r11 = new abcd.hr.a(this, r7, r3, r10, null);
        this.DW += r10;
        this.FH.add(r11);
        return r11;
    }

    public abcd.hr.a j6(abcd.ir.a r8, byte[] r9, int r10, int r11) {
        VH();
        Hw(r8);
        int r12 = v5(r10);
        int r3 = this.DW;
        r8.FH = r3;
        r8.DW = r11;
        abcd.hr.a r13 = new abcd.hr.a(this, r8, r3, r12, r9, null);
        this.DW += r12;
        this.FH.add(r13);
        return r13;
    }

    public void j6(java.io.OutputStream r5) {
        java.util.Iterator<abcd.hr.a> r0 = null;
        abcd.hr.a r1 = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    r0 = this.FH.iterator();
                    $pc20 = 4; continue $sw20;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc20 = 8; continue $sw20; }
                    r1 = r0.next();
                    if (abcd.hr.a.DW(r1) <= 0) { $pc20 = 4; continue $sw20; }
                    r5.write(abcd.hr.a.FH(r1), 0, abcd.hr.a.DW(r1));
                    { $pc20 = 4; continue $sw20; }
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.ir v5() {
        return this.j6;
    }
}
