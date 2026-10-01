package abcd;

public final class Yt {
    public static java.lang.String DW(int r6) {
        char[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new char[5];
                    r1 = 0;
                    if (r6 >= 0) { $pc0 = 5; continue $sw0; }
                    r0[0] = '-';
                    r6 = -r6;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r1 >= 4) { $pc0 = 10; continue $sw0; }
                    r0[4 - r1] = java.lang.Character.forDigit(r6 & 15, 16);
                    r6 = r6 >> 4;
                    r1 = r1 + 1;
                    { $pc0 = 7; continue $sw0; }
                }
                case 10: {
                    return new java.lang.String(r0);
                }
                case 5: {
                    r0[0] = '+';
                    { $pc0 = 7; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String DW(long r5) {
        char[] r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r1 = new char[16];
                    r2 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r2 >= 16) { $pc1 = 6; continue $sw1; }
                    r1[15 - r2] = java.lang.Character.forDigit(((int) r5) & 15, 16);
                    r5 = r5 >> 4;
                    r2 = r2 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 6: {
                    return new java.lang.String(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String FH(int r5) {
        char[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new char[9];
                    r1 = 0;
                    if (r5 >= 0) { $pc2 = 5; continue $sw2; }
                    r0[0] = '-';
                    r5 = -r5;
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r1 >= 8) { $pc2 = 10; continue $sw2; }
                    r0[8 - r1] = java.lang.Character.forDigit(r5 & 15, 16);
                    r5 = r5 >> 4;
                    r1 = r1 + 1;
                    { $pc2 = 7; continue $sw2; }
                }
                case 10: {
                    return new java.lang.String(r0);
                }
                case 5: {
                    r0[0] = '+';
                    { $pc2 = 7; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String Hw(int r6) {
        char[] r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r1 = new char[2];
                    r2 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r2 >= 2) { $pc3 = 6; continue $sw3; }
                    r1[1 - r2] = java.lang.Character.forDigit(r6 & 15, 16);
                    r6 = r6 >> 4;
                    r2 = r2 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 6: {
                    return new java.lang.String(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String VH(int r6) {
        char[] r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r1 = new char[6];
                    r2 = 0;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r2 >= 6) { $pc4 = 6; continue $sw4; }
                    r1[5 - r2] = java.lang.Character.forDigit(r6 & 15, 16);
                    r6 = r6 >> 4;
                    r2 = r2 + 1;
                    { $pc4 = 3; continue $sw4; }
                }
                case 6: {
                    return new java.lang.String(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String Zo(int r1) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r1 != ((char) r1)) { $pc5 = 7; continue $sw5; }
                    return v5(r1);
                }
                case 7: {
                    return gn(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String gn(int r6) {
        char[] r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r1 = new char[8];
                    r2 = 0;
                    $pc6 = 3; continue $sw6;
                }
                case 3: {
                    if (r2 >= 8) { $pc6 = 6; continue $sw6; }
                    r1[7 - r2] = java.lang.Character.forDigit(r6 & 15, 16);
                    r6 = r6 >> 4;
                    r2 = r2 + 1;
                    { $pc6 = 3; continue $sw6; }
                }
                case 6: {
                    return new java.lang.String(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(int r5) {
        char[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = new char[3];
                    r1 = 0;
                    if (r5 >= 0) { $pc7 = 5; continue $sw7; }
                    r0[0] = '-';
                    r5 = -r5;
                    $pc7 = 7; continue $sw7;
                }
                case 7: {
                    if (r1 >= 2) { $pc7 = 10; continue $sw7; }
                    r0[2 - r1] = java.lang.Character.forDigit(r5 & 15, 16);
                    r5 = r5 >> 4;
                    r1 = r1 + 1;
                    { $pc7 = 7; continue $sw7; }
                }
                case 10: {
                    return new java.lang.String(r0);
                }
                case 5: {
                    r0[0] = '+';
                    { $pc7 = 7; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(long r5) {
        char[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = new char[17];
                    r1 = 0;
                    if (r5 >= 0) { $pc8 = 5; continue $sw8; }
                    r0[0] = '-';
                    r5 = -r5;
                    $pc8 = 7; continue $sw8;
                }
                case 7: {
                    if (r1 >= 16) { $pc8 = 10; continue $sw8; }
                    r0[16 - r1] = java.lang.Character.forDigit(((int) r5) & 15, 16);
                    r5 = r5 >> 4;
                    r1 = r1 + 1;
                    { $pc8 = 7; continue $sw8; }
                }
                case 10: {
                    return new java.lang.String(r0);
                }
                case 5: {
                    r0[0] = '+';
                    { $pc8 = 7; continue $sw8; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(byte[] r6, int r7, int r8, int r9, int r10, int r11) {
        int r0 = 0;
        java.lang.StringBuffer r1 = null;
        int r3 = 0;
        int r12 = 0;
        java.lang.String r5 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = r7 + r8;
                    if (((r7 | r8) | r0) < 0) { $pc9 = 38; continue $sw9; }
                    if (r0 > r6.length) { $pc9 = 38; continue $sw9; }
                    if (r9 < 0) { $pc9 = 36; continue $sw9; }
                    if (r8 != 0) { $pc9 = 10; continue $sw9; }
                    return "";
                }
                case 10: {
                    r1 = new java.lang.StringBuffer((r8 * 4) + 6);
                    r3 = r7;
                    r12 = 0;
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    if (r8 <= 0) { $pc9 = 31; continue $sw9; }
                    if (r12 != 0) { $pc9 = 25; continue $sw9; }
                    if (r11 != 2) { $pc9 = 17; continue $sw9; }
                    r5 = Hw(r9);
                    $pc9 = 23; continue $sw9;
                }
                case 23: {
                    r1.append(r5);
                    r1.append(": ");
                    $pc9 = 27; continue $sw9;
                }
                case 27: {
                    r1.append(Hw(r6[r3]));
                    r9 = r9 + 1;
                    r3 = r3 + 1;
                    r12 = r12 + 1;
                    if (r12 != r10) { $pc9 = 30; continue $sw9; }
                    r1.append('\n');
                    r12 = 0;
                    $pc9 = 30; continue $sw9;
                }
                case 30: {
                    r8 = r8 - 1;
                    { $pc9 = 12; continue $sw9; }
                }
                case 17: {
                    if (r11 == 4) { $pc9 = 21; continue $sw9; }
                    if (r11 == 6) { $pc9 = 20; continue $sw9; }
                    r5 = gn(r9);
                    { $pc9 = 23; continue $sw9; }
                }
                case 20: {
                    r5 = VH(r9);
                    { $pc9 = 23; continue $sw9; }
                }
                case 21: {
                    r5 = v5(r9);
                    { $pc9 = 23; continue $sw9; }
                }
                case 25: {
                    if ((r12 & 1) != 0) { $pc9 = 27; continue $sw9; }
                    r1.append(' ');
                    { $pc9 = 27; continue $sw9; }
                }
                case 31: {
                    if (r12 == 0) { $pc9 = 34; continue $sw9; }
                    r1.append('\n');
                    $pc9 = 34; continue $sw9;
                }
                case 34: {
                    return r1.toString();
                }
                case 36: {
                    throw new java.lang.IllegalArgumentException("outOffset < 0");
                }
                case 38: {
                    throw new java.lang.IndexOutOfBoundsException("arr.length " + r6.length + "; " + r7 + "..!" + r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String u7(int r2) {
        return new java.lang.String(new char[]{java.lang.Character.forDigit(r2 & 15, 16)});
    }

    public static java.lang.String v5(int r6) {
        char[] r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r1 = new char[4];
                    r2 = 0;
                    $pc10 = 3; continue $sw10;
                }
                case 3: {
                    if (r2 >= 4) { $pc10 = 6; continue $sw10; }
                    r1[3 - r2] = java.lang.Character.forDigit(r6 & 15, 16);
                    r6 = r6 >> 4;
                    r2 = r2 + 1;
                    { $pc10 = 3; continue $sw10; }
                }
                case 6: {
                    return new java.lang.String(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
