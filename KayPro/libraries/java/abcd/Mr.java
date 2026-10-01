package abcd;

public final class Mr {
    public static java.lang.String DW(int r2) {
        return j6(r2, 20703, 2);
    }

    public static java.lang.String FH(int r2) {
        return j6(r2, 30239, 1);
    }

    public static boolean Hw(int r0) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r0 & 1024) == 0) { $pc0 = 5; continue $sw0; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean VH(int r0) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r0 & 2) == 0) { $pc1 = 5; continue $sw1; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean Zo(int r0) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if ((r0 & 256) == 0) { $pc2 = 5; continue $sw2; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean gn(int r0) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if ((r0 & 8) == 0) { $pc3 = 5; continue $sw3; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(int r2) {
        return j6(r2, 30257, 1);
    }

    private static java.lang.String j6(int r4, int r5, int r6) {
        java.lang.StringBuffer r0 = null;
        int r1 = 0;
        int r7 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new java.lang.StringBuffer(80);
                    r1 = (r5 ^ (-1)) & r4;
                    r7 = r4 & r5;
                    if ((r7 & 1) == 0) { $pc4 = 6; continue $sw4; }
                    r0.append("|public");
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if ((r7 & 2) == 0) { $pc4 = 9; continue $sw4; }
                    r0.append("|private");
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    if ((r7 & 4) == 0) { $pc4 = 12; continue $sw4; }
                    r0.append("|protected");
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    if ((r7 & 8) == 0) { $pc4 = 15; continue $sw4; }
                    r0.append("|static");
                    $pc4 = 15; continue $sw4;
                }
                case 15: {
                    if ((r7 & 16) == 0) { $pc4 = 18; continue $sw4; }
                    r0.append("|final");
                    $pc4 = 18; continue $sw4;
                }
                case 18: {
                    if ((r7 & 32) == 0) { $pc4 = 23; continue $sw4; }
                    if (r6 != 1) { $pc4 = 21; continue $sw4; }
                    r0.append("|super");
                    { $pc4 = 23; continue $sw4; }
                }
                case 21: {
                    r0.append("|synchronized");
                    $pc4 = 23; continue $sw4;
                }
                case 23: {
                    if ((r7 & 64) == 0) { $pc4 = 28; continue $sw4; }
                    if (r6 != 3) { $pc4 = 26; continue $sw4; }
                    r0.append("|bridge");
                    { $pc4 = 28; continue $sw4; }
                }
                case 26: {
                    r0.append("|volatile");
                    $pc4 = 28; continue $sw4;
                }
                case 28: {
                    if ((r7 & 128) == 0) { $pc4 = 33; continue $sw4; }
                    if (r6 != 3) { $pc4 = 31; continue $sw4; }
                    r0.append("|varargs");
                    { $pc4 = 33; continue $sw4; }
                }
                case 31: {
                    r0.append("|transient");
                    $pc4 = 33; continue $sw4;
                }
                case 33: {
                    if ((r7 & 256) == 0) { $pc4 = 36; continue $sw4; }
                    r0.append("|native");
                    $pc4 = 36; continue $sw4;
                }
                case 36: {
                    if ((r7 & 512) == 0) { $pc4 = 39; continue $sw4; }
                    r0.append("|interface");
                    $pc4 = 39; continue $sw4;
                }
                case 39: {
                    if ((r7 & 1024) == 0) { $pc4 = 42; continue $sw4; }
                    r0.append("|abstract");
                    $pc4 = 42; continue $sw4;
                }
                case 42: {
                    if ((r7 & 2048) == 0) { $pc4 = 45; continue $sw4; }
                    r0.append("|strictfp");
                    $pc4 = 45; continue $sw4;
                }
                case 45: {
                    if ((r7 & 4096) == 0) { $pc4 = 48; continue $sw4; }
                    r0.append("|synthetic");
                    $pc4 = 48; continue $sw4;
                }
                case 48: {
                    if ((r7 & 8192) == 0) { $pc4 = 51; continue $sw4; }
                    r0.append("|annotation");
                    $pc4 = 51; continue $sw4;
                }
                case 51: {
                    if ((r7 & 16384) == 0) { $pc4 = 54; continue $sw4; }
                    r0.append("|enum");
                    $pc4 = 54; continue $sw4;
                }
                case 54: {
                    if ((65536 & r7) == 0) { $pc4 = 57; continue $sw4; }
                    r0.append("|constructor");
                    $pc4 = 57; continue $sw4;
                }
                case 57: {
                    if ((r7 & 131072) == 0) { $pc4 = 59; continue $sw4; }
                    r0.append("|declared_synchronized");
                    $pc4 = 59; continue $sw4;
                }
                case 59: {
                    if (r1 == 0) { $pc4 = 61; continue $sw4; }
                    $pc4 = 62; continue $sw4;
                }
                case 62: {
                    r0.append('|');
                    r0.append(abcd.Yt.v5(r1));
                    $pc4 = 64; continue $sw4;
                }
                case 64: {
                    return r0.substring(1);
                }
                case 61: {
                    if (r0.length() != 0) { $pc4 = 64; continue $sw4; }
                    { $pc4 = 62; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String tp(int r2) {
        return j6(r2, 204287, 3);
    }

    public static boolean u7(int r0) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if ((r0 & 32) == 0) { $pc5 = 5; continue $sw5; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean v5(int r0) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if ((r0 & 8192) == 0) { $pc6 = 5; continue $sw6; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
