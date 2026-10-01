package abcd;

public final class Qt implements abcd.Lt, abcd.Tt {
    private byte[] DW;
    private int FH;
    private boolean Hw;
    private int VH;
    private int Zo;
    private final boolean j6;
    private java.util.ArrayList<abcd.Qt.a> v5;

    private static class a {
        private int DW;
        private final java.lang.String FH;
        private final int j6;

        public a(int r1, int r2, java.lang.String r3) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = r3;
        }

        public a(int r2, java.lang.String r3) {
            this(r2, Integer.MAX_VALUE, r3);
        }

        public int DW() {
            return this.j6;
        }

        public void DW(int r3) {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (this.DW != Integer.MAX_VALUE) { $pc0 = 6; continue $sw0; }
                        this.DW = r3;
                        return;
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public java.lang.String FH() {
            return this.FH;
        }

        public int j6() {
            return this.DW;
        }

        public void j6(int r1) {
            this.DW = r1;
        }
    }

    public Qt() {
        this(1000);
    }

    public Qt(int r2) {
        this(new byte[r2], true);
    }

    public Qt(byte[] r2) {
        this(r2, false);
    }

    private Qt(byte[] r1, boolean r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r1 == null) { $pc1 = 7; continue $sw1; }
                    this.j6 = r2;
                    this.DW = r1;
                    this.FH = 0;
                    this.Hw = false;
                    this.v5 = null;
                    this.Zo = 0;
                    this.VH = 0;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("data == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Zo(int r4) {
        byte[] r0 = null;
        byte[] r5 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.DW;
                    if (r0.length >= r4) { $pc2 = 6; continue $sw2; }
                    r5 = new byte[(r4 * 2) + 1000];
                    java.lang.System.arraycopy(r0, 0, r5, 0, this.FH);
                    this.DW = r5;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void u7() {
        throw new java.lang.IndexOutOfBoundsException("attempt to write past the end");
    }

    @Override
    public int DW(int r2) {
        int r0 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.j6 == false) { $pc3 = 5; continue $sw3; }
                    Zo(this.FH + 5);
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    r0 = this.FH;
                    abcd.eu.DW(this, r2);
                    return this.FH - r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean DW() {
        return this.Hw;
    }

    @Override
    public void FH() {
        java.util.ArrayList<abcd.Qt.a> r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.v5;
                    if (r0 != null) { $pc4 = 5; continue $sw4; }
                    return;
                }
                case 5: {
                    r1 = r0.size();
                    if (r1 == 0) { $pc4 = 9; continue $sw4; }
                    this.v5.get(r1 - 1).DW(this.FH);
                    return;
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void FH(int r4) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (this.FH != r4) { $pc5 = 6; continue $sw5; }
                    return;
                }
                case 6: {
                    throw new abcd.Vt("expected cursor " + r4 + "; actual value: " + this.FH);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void Hw(int r2) {
        int r0 = 0;
        int r3 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = r2 - 1;
                    if (r2 < 0) { $pc6 = 16; continue $sw6; }
                    if ((r2 & r0) != 0) { $pc6 = 16; continue $sw6; }
                    r3 = (this.FH + r0) & (r0 ^ (-1));
                    if (this.j6 == false) { $pc6 = 10; continue $sw6; }
                    Zo(r3);
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    this.FH = r3;
                    return;
                }
                case 10: {
                    if (r3 <= this.DW.length) { $pc6 = 11; continue $sw6; }
                    u7();
                    throw null;
                }
                case 16: {
                    throw new java.lang.IllegalArgumentException("bogus alignment");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean Hw() {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (this.v5 == null) { $pc7 = 5; continue $sw7; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public byte[] VH() {
        return this.DW;
    }

    public void Zo() {
        java.util.ArrayList<abcd.Qt.a> r0 = null;
        int r1 = 0;
        int r2 = 0;
        abcd.Qt.a r3 = null;
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    FH();
                    r0 = this.v5;
                    if (r0 == null) { $pc8 = 15; continue $sw8; }
                    r1 = r0.size();
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    if (r1 <= 0) { $pc8 = 17; continue $sw8; }
                    r2 = r1 - 1;
                    r3 = this.v5.get(r2);
                    if (r3.DW() <= this.FH) { $pc8 = 9; continue $sw8; }
                    this.v5.remove(r2);
                    r1 = r1 - 1;
                    { $pc8 = 5; continue $sw8; }
                }
                case 9: {
                    r4 = r3.j6();
                    r5 = this.FH;
                    if (r4 <= r5) { $pc8 = 16; continue $sw8; }
                    r3.j6(r5);
                    return;
                }
                case 16: {
                    return;
                }
                case 17: {
                    return;
                }
                case 15: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public byte[] gn() {
        int r0 = this.FH;
        byte[] r1 = new byte[r0];
        java.lang.System.arraycopy(this.DW, 0, r1, 0, r0);
        return r1;
    }

    @Override
    public int j6() {
        int r0 = this.VH;
        int r1 = ((r0 * 2) + 8) + (r0 / 2);
        return this.Zo - r1;
    }

    @Override
    public void j6(int r2) {
        int r0 = 0;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (r2 < 0) { $pc9 = 13; continue $sw9; }
                    r0 = this.FH + r2;
                    if (this.j6 == false) { $pc9 = 7; continue $sw9; }
                    Zo(r0);
                    $pc9 = 8; continue $sw9;
                }
                case 8: {
                    this.FH = r0;
                    return;
                }
                case 7: {
                    if (r0 <= this.DW.length) { $pc9 = 8; continue $sw9; }
                    u7();
                    throw null;
                }
                case 13: {
                    throw new java.lang.IllegalArgumentException("count < 0");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(int r4, java.lang.String r5) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (this.v5 != null) { $pc10 = 5; continue $sw10; }
                    return;
                }
                case 5: {
                    FH();
                    r0 = this.v5.size();
                    if (r0 != 0) { $pc10 = 8; continue $sw10; }
                    r1 = 0;
                    $pc10 = 9; continue $sw10;
                }
                case 9: {
                    r2 = this.FH;
                    if (r1 > r2) { $pc10 = 12; continue $sw10; }
                    r1 = r2;
                    $pc10 = 12; continue $sw10;
                }
                case 12: {
                    this.v5.add(new abcd.Qt.a(r1, r4 + r1, r5));
                    return;
                }
                case 8: {
                    r1 = this.v5.get(r0 - 1).j6();
                    { $pc10 = 9; continue $sw10; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r4, boolean r5) {
        int r0 = 0;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    if (this.v5 != null) { $pc11 = 18; continue $sw11; }
                    if (this.FH != 0) { $pc11 = 18; continue $sw11; }
                    if (r4 < 40) { $pc11 = 16; continue $sw11; }
                    r0 = (((r4 - 7) / 15) + 1) & (-2);
                    if (r0 >= 6) { $pc11 = 11; continue $sw11; }
                    r0 = 6;
                    $pc11 = 13; continue $sw11;
                }
                case 13: {
                    this.v5 = new java.util.ArrayList(1000);
                    this.Zo = r4;
                    this.VH = r0;
                    this.Hw = r5;
                    return;
                }
                case 11: {
                    if (r0 <= 10) { $pc11 = 13; continue $sw11; }
                    r0 = 10;
                    { $pc11 = 13; continue $sw11; }
                }
                case 16: {
                    throw new java.lang.IllegalArgumentException("annotationWidth < 40");
                }
                case 18: {
                    throw new java.lang.RuntimeException("cannot enable annotations");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.Pt r4) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r0 = r4.FH();
                    r1 = this.FH;
                    r2 = r0 + r1;
                    if (this.j6 == false) { $pc12 = 6; continue $sw12; }
                    Zo(r2);
                    $pc12 = 7; continue $sw12;
                }
                case 7: {
                    r4.j6(this.DW, r1);
                    this.FH = r2;
                    return;
                }
                case 6: {
                    if (r2 <= this.DW.length) { $pc12 = 7; continue $sw12; }
                    u7();
                    throw null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.io.Writer r14) {
        int r0 = 0;
        abcd.mu r2 = null;
        java.io.Writer r15 = null;
        java.io.Writer r1 = null;
        int r3 = 0;
        int r4 = 0;
        int r7 = 0;
        abcd.Qt.a r5 = null;
        int r6 = 0;
        java.lang.String r8 = null;
        int r10 = 0;
        int r9 = 0;
        int r11 = 0;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = j6();
                    r2 = new abcd.mu(r14, (this.Zo - r0) - 1, r0, "|");
                    r15 = r2.DW();
                    r1 = r2.FH();
                    r3 = this.v5.size();
                    r4 = 0;
                    r7 = 0;
                    $pc13 = 4; continue $sw13;
                }
                case 4: {
                    if (r7 >= this.FH) { $pc13 = 11; continue $sw13; }
                    if (r4 >= r3) { $pc13 = 11; continue $sw13; }
                    r5 = this.v5.get(r4);
                    r6 = r5.DW();
                    if (r7 >= r6) { $pc13 = 9; continue $sw13; }
                    r8 = "";
                    r10 = r7;
                    $pc13 = 10; continue $sw13;
                }
                case 10: {
                    r15.write(abcd.Yt.j6(this.DW, r10, r6 - r10, r10, this.VH, 6));
                    r1.write(r8);
                    r2.j6();
                    r7 = r6;
                    { $pc13 = 4; continue $sw13; }
                }
                case 9: {
                    r9 = r5.j6();
                    r8 = r5.FH();
                    r4 = r4 + 1;
                    r10 = r6;
                    r6 = r9;
                    $pc13 = 11; continue $sw13;
                }
                case 11: {
                    r11 = this.FH;
                    if (r7 >= r11) { $pc13 = 14; continue $sw13; }
                    r15.write(abcd.Yt.j6(this.DW, r7, r11 - r7, r7, this.VH, 6));
                    $pc13 = 14; continue $sw13;
                }
                case 14: {
                    if (r4 >= r3) { $pc13 = 16; continue $sw13; }
                    r1.write(this.v5.get(r4).FH());
                    r4 = r4 + 1;
                    { $pc13 = 14; continue $sw13; }
                }
                case 16: {
                    r2.j6();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(java.lang.String r4) {
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    if (this.v5 != null) { $pc14 = 5; continue $sw14; }
                    return;
                }
                case 5: {
                    FH();
                    this.v5.add(new abcd.Qt.a(this.FH, r4));
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(byte[] r5, int r6, int r7) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r0 = this.FH;
                    r1 = r0 + r7;
                    r2 = r6 + r7;
                    if (((r6 | r7) | r1) < 0) { $pc15 = 16; continue $sw15; }
                    if (r2 > r5.length) { $pc15 = 16; continue $sw15; }
                    if (this.j6 == false) { $pc15 = 10; continue $sw15; }
                    Zo(r1);
                    $pc15 = 11; continue $sw15;
                }
                case 11: {
                    java.lang.System.arraycopy(r5, r6, this.DW, r0, r7);
                    this.FH = r1;
                    return;
                }
                case 10: {
                    if (r1 <= this.DW.length) { $pc15 = 11; continue $sw15; }
                    u7();
                    throw null;
                }
                case 16: {
                    throw new java.lang.IndexOutOfBoundsException("bytes.length " + r5.length + "; " + r6 + "..!" + r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int v5() {
        return this.FH;
    }

    public int v5(int r2) {
        int r0 = 0;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    if (this.j6 == false) { $pc16 = 5; continue $sw16; }
                    Zo(this.FH + 5);
                    $pc16 = 5; continue $sw16;
                }
                case 5: {
                    r0 = this.FH;
                    abcd.eu.j6(this, r2);
                    return this.FH - r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void write(byte[] r3) {
        j6(r3, 0, r3.length);
    }

    @Override
    public void writeByte(int r4) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    r0 = this.FH;
                    r1 = r0 + 1;
                    if (this.j6 == false) { $pc17 = 6; continue $sw17; }
                    Zo(r1);
                    $pc17 = 7; continue $sw17;
                }
                case 7: {
                    this.DW[r0] = (byte) r4;
                    this.FH = r1;
                    return;
                }
                case 6: {
                    if (r1 <= this.DW.length) { $pc17 = 7; continue $sw17; }
                    u7();
                    throw null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void writeInt(int r6) {
        int r0 = 0;
        int r1 = 0;
        byte[] r2 = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    r0 = this.FH;
                    r1 = r0 + 4;
                    if (this.j6 == false) { $pc18 = 6; continue $sw18; }
                    Zo(r1);
                    $pc18 = 7; continue $sw18;
                }
                case 7: {
                    r2 = this.DW;
                    r2[r0] = (byte) r6;
                    r2[r0 + 1] = (byte) (r6 >> 8);
                    r2[r0 + 2] = (byte) (r6 >> 16);
                    r2[r0 + 3] = (byte) (r6 >> 24);
                    this.FH = r1;
                    return;
                }
                case 6: {
                    if (r1 <= this.DW.length) { $pc18 = 7; continue $sw18; }
                    u7();
                    throw null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void writeLong(long r7) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        byte[] r3 = null;
        int r8 = 0;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    r0 = this.FH;
                    r1 = r0 + 8;
                    if (this.j6 == false) { $pc19 = 6; continue $sw19; }
                    Zo(r1);
                    $pc19 = 7; continue $sw19;
                }
                case 7: {
                    r2 = (int) r7;
                    r3 = this.DW;
                    r3[r0] = (byte) r2;
                    r3[r0 + 1] = (byte) (r2 >> 8);
                    r3[r0 + 2] = (byte) (r2 >> 16);
                    r3[r0 + 3] = (byte) (r2 >> 24);
                    r8 = (int) (r7 >> 32);
                    r3[r0 + 4] = (byte) r8;
                    r3[r0 + 5] = (byte) (r8 >> 8);
                    r3[r0 + 6] = (byte) (r8 >> 16);
                    r3[r0 + 7] = (byte) (r8 >> 24);
                    this.FH = r1;
                    return;
                }
                case 6: {
                    if (r1 <= this.DW.length) { $pc19 = 7; continue $sw19; }
                    u7();
                    throw null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void writeShort(int r5) {
        int r0 = 0;
        int r1 = 0;
        byte[] r2 = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    r0 = this.FH;
                    r1 = r0 + 2;
                    if (this.j6 == false) { $pc20 = 6; continue $sw20; }
                    Zo(r1);
                    $pc20 = 7; continue $sw20;
                }
                case 7: {
                    r2 = this.DW;
                    r2[r0] = (byte) r5;
                    r2[r0 + 1] = (byte) (r5 >> 8);
                    this.FH = r1;
                    return;
                }
                case 6: {
                    if (r1 <= this.DW.length) { $pc20 = 7; continue $sw20; }
                    u7();
                    throw null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
