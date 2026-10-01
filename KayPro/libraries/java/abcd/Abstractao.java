package abcd;

public abstract class Abstractao {
    public static boolean j6 = true;

    public Abstractao() {
    }

    protected static int DW(int r1, int r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r1 & 15) != r1) { $pc0 = 11; continue $sw0; }
                    if ((r2 & 15) != r2) { $pc0 = 9; continue $sw0; }
                    return r1 | (r2 << 4);
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException("high out of range 0..15");
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException("low out of range 0..15");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static java.lang.String DW(abcd.AbstractVn r1) {
        int r2 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r2 = ((abcd.po) r1).J0();
                    if (r2 != ((char) r2)) { $pc1 = 6; continue $sw1; }
                    return abcd.Yt.v5(r2);
                }
                case 6: {
                    return abcd.Yt.gn(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static java.lang.String DW(abcd.cs r4) {
        int r0 = 0;
        java.lang.StringBuffer r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = r4.size();
                    r1 = new java.lang.StringBuffer((r0 * 5) + 2);
                    r1.append('{');
                    r2 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r2 >= r0) { $pc2 = 7; continue $sw2; }
                    if (r2 == 0) { $pc2 = 6; continue $sw2; }
                    r1.append(", ");
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    r1.append(r4.get(r2).lg());
                    r2 = r2 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 7: {
                    r1.append('}');
                    return r1.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static boolean DW(int r1) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r1 >= (-8)) { $pc3 = 5; continue $sw3; }
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (r1 > 7) { $pc3 = 7; continue $sw3; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static java.lang.String FH(abcd.cs r6) {
        int r0 = 0;
        java.lang.StringBuilder r1 = null;
        abcd.bs r2 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = r6.size();
                    r1 = new java.lang.StringBuilder(30);
                    r1.append("{");
                    if (r0 != 0) { $pc4 = 5; continue $sw4; }
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    r1.append("}");
                    return r1.toString();
                }
                case 5: {
                    if (r0 == 1) { $pc4 = 10; continue $sw4; }
                    r2 = r6.get(r0 - 1);
                    if (r2.Hw() != 2) { $pc4 = 9; continue $sw4; }
                    r2 = r2.DW(1);
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    r1.append(r6.get(0).lg());
                    r1.append("..");
                    r1.append(r2.lg());
                    { $pc4 = 11; continue $sw4; }
                }
                case 10: {
                    r1.append(r6.get(0).lg());
                    { $pc4 = 11; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static boolean FH(int r1) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (((short) r1) != r1) { $pc5 = 5; continue $sw5; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static java.lang.String Hw(abcd.AbstractVn r2) {
        abcd.Tn r3 = null;
        java.lang.StringBuilder r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r3 = (abcd.Tn) r2;
                    if (r3.J8() == true) { $pc6 = 6; continue $sw6; }
                    return "";
                }
                case 6: {
                    r0 = new java.lang.StringBuilder(20);
                    r1 = r3.J0();
                    r0.append(r3.we().Zo());
                    r0.append('@');
                    if (r1 >= 65536) { $pc6 = 9; continue $sw6; }
                    r0.append(abcd.Yt.v5(r1));
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    return r0.toString();
                }
                case 9: {
                    r0.append(abcd.Yt.gn(r1));
                    { $pc6 = 11; continue $sw6; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static boolean Hw(int r1) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r1 != (r1 & 255)) { $pc7 = 5; continue $sw7; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static boolean Zo(int r1) {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (r1 != (65535 & r1)) { $pc8 = 5; continue $sw8; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static short gn(abcd.AbstractVn r1) {
        int r2 = 0;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r2 = r1.Zo().v5();
                    if (r2 < 255) { $pc9 = 9; continue $sw9; }
                    if (r2 > 65535) { $pc9 = 9; continue $sw9; }
                    return (short) r2;
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException("extended opcode out of range 255..65535");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static java.lang.String j6(abcd.Ds r2) {
        java.lang.StringBuffer r0 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = new java.lang.StringBuffer(100);
                    r0.append('#');
                    if ((r2 instanceof abcd.As) == false) { $pc10 = 5; continue $sw10; }
                    r0.append("null");
                    $pc10 = 7; continue $sw10;
                }
                case 7: {
                    return r0.toString();
                }
                case 5: {
                    r0.append(r2.Zo());
                    r0.append(' ');
                    r0.append(r2.aM());
                    { $pc10 = 7; continue $sw10; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static java.lang.String j6(abcd.Ds r3, int r4) {
        java.lang.StringBuffer r0 = null;
        long r1 = 0L;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = new java.lang.StringBuffer(20);
                    r0.append("#");
                    if ((r3 instanceof abcd.Cs) == false) { $pc11 = 5; continue $sw11; }
                    r1 = ((abcd.Cs) r3).lg();
                    $pc11 = 7; continue $sw11;
                }
                case 7: {
                    if (r4 != 4) { $pc11 = 9; continue $sw11; }
                    r0.append(abcd.Yt.u7((int) r1));
                    $pc11 = 24; continue $sw11;
                }
                case 24: {
                    return r0.toString();
                }
                case 9: {
                    if (r4 != 8) { $pc11 = 11; continue $sw11; }
                    r0.append(abcd.Yt.Hw((int) r1));
                    { $pc11 = 24; continue $sw11; }
                }
                case 11: {
                    if (r4 != 16) { $pc11 = 13; continue $sw11; }
                    r0.append(abcd.Yt.v5((int) r1));
                    { $pc11 = 24; continue $sw11; }
                }
                case 13: {
                    if (r4 != 32) { $pc11 = 15; continue $sw11; }
                    r0.append(abcd.Yt.gn((int) r1));
                    { $pc11 = 24; continue $sw11; }
                }
                case 15: {
                    if (r4 != 64) { $pc11 = 18; continue $sw11; }
                    r0.append(abcd.Yt.DW(r1));
                    { $pc11 = 24; continue $sw11; }
                }
                case 18: {
                    throw new java.lang.RuntimeException("shouldn't happen");
                }
                case 5: {
                    r1 = r3.Ws();
                    { $pc11 = 7; continue $sw11; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static java.lang.String j6(abcd.AbstractVn r1) {
        int r2 = 0;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r2 = ((abcd.po) r1).J8();
                    if (r2 != ((short) r2)) { $pc12 = 6; continue $sw12; }
                    return abcd.Yt.DW(r2);
                }
                case 6: {
                    return abcd.Yt.FH(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static short j6(int r1, int r2) {
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    if ((r1 & 255) != r1) { $pc13 = 11; continue $sw13; }
                    if ((r2 & 255) != r2) { $pc13 = 9; continue $sw13; }
                    return (short) (r1 | (r2 << 8));
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException("high out of range 0..255");
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException("low out of range 0..255");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static short j6(int r1, int r2, int r3, int r4) {
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    if ((r1 & 15) != r1) { $pc14 = 19; continue $sw14; }
                    if ((r2 & 15) != r2) { $pc14 = 17; continue $sw14; }
                    if ((r3 & 15) != r3) { $pc14 = 15; continue $sw14; }
                    if ((r4 & 15) != r4) { $pc14 = 13; continue $sw14; }
                    return (short) (((r1 | (r2 << 4)) | (r3 << 8)) | (r4 << 12));
                }
                case 13: {
                    throw new java.lang.IllegalArgumentException("n3 out of range 0..15");
                }
                case 15: {
                    throw new java.lang.IllegalArgumentException("n2 out of range 0..15");
                }
                case 17: {
                    throw new java.lang.IllegalArgumentException("n1 out of range 0..15");
                }
                case 19: {
                    throw new java.lang.IllegalArgumentException("n0 out of range 0..15");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static short j6(abcd.AbstractVn r1, int r2) {
        int r3 = 0;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    if ((r2 & 255) != r2) { $pc15 = 11; continue $sw15; }
                    r3 = r1.Zo().v5();
                    if ((r3 & 255) != r3) { $pc15 = 9; continue $sw15; }
                    return (short) (r3 | (r2 << 8));
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException("opcode out of range 0..255");
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException("arg out of range 0..255");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static void j6(abcd.Lt r0, short r1) {
        r0.writeShort(r1);
    }

    protected static void j6(abcd.Lt r1, short r2, int r3) {
        j6(r1, r2, (short) r3, (short) (r3 >> 16));
    }

    protected static void j6(abcd.Lt r1, short r2, int r3, short r4) {
        j6(r1, r2, (short) r3, (short) (r3 >> 16), r4);
    }

    protected static void j6(abcd.Lt r6, short r7, int r8, short r9, short r10) {
        j6(r6, r7, (short) r8, (short) (r8 >> 16), r9, r10);
    }

    protected static void j6(abcd.Lt r7, short r8, long r9) {
        j6(r7, r8, (short) r9, (short) (r9 >> 16), (short) (r9 >> 32), (short) (r9 >> 48));
    }

    protected static void j6(abcd.Lt r0, short r1, short r2) {
        r0.writeShort(r1);
        r0.writeShort(r2);
    }

    protected static void j6(abcd.Lt r0, short r1, short r2, short r3) {
        r0.writeShort(r1);
        r0.writeShort(r2);
        r0.writeShort(r3);
    }

    protected static void j6(abcd.Lt r0, short r1, short r2, short r3, short r4) {
        r0.writeShort(r1);
        r0.writeShort(r2);
        r0.writeShort(r3);
        r0.writeShort(r4);
    }

    protected static void j6(abcd.Lt r0, short r1, short r2, short r3, short r4, short r5) {
        r0.writeShort(r1);
        r0.writeShort(r2);
        r0.writeShort(r3);
        r0.writeShort(r4);
        r0.writeShort(r5);
    }

    protected static boolean j6(int r1) {
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    if (((byte) r1) != r1) { $pc16 = 5; continue $sw16; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static boolean j6(abcd.cs r7) {
        int r0 = 0;
        int r4 = 0;
        int r3 = 0;
        abcd.bs r5 = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    r0 = r7.size();
                    if (r0 >= 2) { $pc17 = 5; continue $sw17; }
                    return true;
                }
                case 5: {
                    r4 = r7.get(0).we();
                    r3 = 0;
                    $pc17 = 6; continue $sw17;
                }
                case 6: {
                    if (r3 >= r0) { $pc17 = 11; continue $sw17; }
                    r5 = r7.get(r3);
                    if (r5.we() != r4) { $pc17 = 9; continue $sw17; }
                    r4 = r4 + r5.Hw();
                    r3 = r3 + 1;
                    { $pc17 = 6; continue $sw17; }
                }
                case 9: {
                    return false;
                }
                case 11: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static java.lang.String v5(abcd.AbstractVn r1) {
        abcd.Abstractms r2 = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    r2 = ((abcd.Tn) r1).we();
                    if ((r2 instanceof abcd.Js) == false) { $pc18 = 6; continue $sw18; }
                    return ((abcd.Js) r2).lg();
                }
                case 6: {
                    return r2.aM();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static boolean v5(int r1) {
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    if (r1 != (r1 & 15)) { $pc19 = 5; continue $sw19; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final java.lang.String DW(abcd.AbstractVn r4, boolean r5) {
        java.lang.String r0 = null;
        java.lang.String r1 = null;
        java.lang.String r6 = null;
        java.lang.StringBuilder r7 = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    r0 = r4.Zo().FH();
                    r1 = Zo(r4);
                    r6 = j6(r4, r5);
                    r7 = new java.lang.StringBuilder(100);
                    r7.append(r0);
                    if (r1.length() == 0) { $pc20 = 6; continue $sw20; }
                    r7.append(' ');
                    r7.append(r1);
                    $pc20 = 6; continue $sw20;
                }
                case 6: {
                    if (r6.length() == 0) { $pc20 = 9; continue $sw20; }
                    r7.append(" // ");
                    r7.append(r6);
                    $pc20 = 9; continue $sw20;
                }
                case 9: {
                    return r7.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.BitSet FH(abcd.AbstractVn r1) {
        return new java.util.BitSet();
    }

    public abstract boolean VH(abcd.AbstractVn r1);

    public abstract java.lang.String Zo(abcd.AbstractVn r1);

    public abstract int j6();

    public abstract java.lang.String j6(abcd.AbstractVn r1, boolean r2);

    public abstract void j6(abcd.Lt r1, abcd.AbstractVn r2);

    public boolean j6(abcd.po r1) {
        return false;
    }
}
