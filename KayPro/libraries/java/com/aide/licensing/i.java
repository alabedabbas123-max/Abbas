package com.aide.licensing;

@abcd.Interfacexu
public class i {

    @abcd.Interfaceru(field = 2956333421720757728L)
    private static final java.security.SecureRandom DW = null;

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfaceru(field = 1804855225910640183L)
    private static boolean j6;

    static {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        abcd.wu.j6(com.aide.licensing.i.class, 5040490317030669360L, 5040490317030669360L);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    if (FH == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-3457085867215190144L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        j6 = false;
                        DW = new java.security.SecureRandom();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                case 8: {
                    th = $ex0;
                    if (Hw == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -3457085867215190144L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public i() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (Hw == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 2072890154687443120L, null);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(2072890154687443120L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static long DW(android.content.Context r11) {
        byte[] r3 = null;
        long r4 = 0L;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 9: {
                    th = $ex2;
                    if (Hw == false) { $pc2 = 13; continue $sw2; }
                    abcd.wu.j6(th, 788683071768376512L, null, r11);
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(788683071768376512L, null, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 9; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        r3 = FH(r11);
                        r4 = (((((long) r3[0]) & 255) | ((((long) r3[1]) & 255) << 8)) | ((((long) r3[2]) & 255) << 16)) | ((255 & ((long) r3[3])) << 24);
                        abcd.ue.j6("Device ID long: " + java.lang.Long.toHexString(r4));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 9; continue $sw2;
                    }
                    return 268435455 & r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -281371228977056293L)
    private static java.lang.String DW(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 11: {
                    th = $ex3;
                    if (Hw == false) { $pc3 = 15; continue $sw3; }
                    abcd.wu.j6(th, 6482084520535680403L, null, r5);
                    $pc3 = 15; continue $sw3;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(6482084520535680403L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 11; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    if (r5 != null) { $pc3 = 9; continue $sw3; }
                    return "";
                }
                case 9: {
                    return r5.trim().toLowerCase(java.util.Locale.US);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2408192990342247365L)
    private static byte[] FH(android.content.Context r6) {
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 11;
        $sw4: while (true) {
            switch ($pc4) {
                case 11: {
                    th = $ex4;
                    if (Hw == false) { $pc4 = 15; continue $sw4; }
                    abcd.wu.j6(th, -1393602165026291935L, null, r6);
                    $pc4 = 15; continue $sw4;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc4 = 16; continue $sw4; }
                    try {
                        abcd.wu.j6(-1393602165026291935L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    $pc4 = 16; continue $sw4;
                }
                case 16: {
                    return java.security.MessageDigest.getInstance("SHA-256").digest(Hw(r6).getBytes("UTF-8"));
                }
                case 8: {
                    e = $ex4;
                    try {
                        throw new java.lang.RuntimeException(e);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 3454045335017905469L)
    private static java.lang.String Hw(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 11: {
                    th = $ex5;
                    if (Hw == false) { $pc5 = 15; continue $sw5; }
                    abcd.wu.j6(th, -5892646746367961779L, null, r5);
                    $pc5 = 15; continue $sw5;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc5 = 7; continue $sw5; }
                    try {
                        abcd.wu.j6(-5892646746367961779L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 11; continue $sw5;
                    }
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    if (j6 == false) { $pc5 = 10; continue $sw5; }
                    return v5(r5);
                }
                case 10: {
                    return Zo(r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -7546387813303295L)
    private static java.lang.String Zo(android.content.Context r6) {
        java.lang.String r3 = null;
        java.lang.String r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 10: {
                    th = $ex6;
                    if (Hw == false) { $pc6 = 14; continue $sw6; }
                    abcd.wu.j6(th, 6568867120161252949L, null, r6);
                    $pc6 = 14; continue $sw6;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(6568867120161252949L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 10; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    r3 = "(default)";
                    try {
                        r3 = android.provider.Settings.Secure.getString(r6.getContentResolver(), "android_id");
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 15; continue $sw6; }
                        $pc6 = 10; continue $sw6;
                    }
                    $pc6 = 8; continue $sw6;
                }
                case 8: {
                    try {
                        r4 = "android id: " + r3 + ";";
                        abcd.ue.j6("Device ID string: " + r4);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 10; continue $sw6;
                    }
                    return r4;
                }
                case 15: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static long j6(android.content.Context r6) {
        long r3 = 0L;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 9: {
                    th = $ex7;
                    if (Hw == false) { $pc7 = 13; continue $sw7; }
                    abcd.wu.j6(th, 2241911797433139205L, null, r6);
                    $pc7 = 13; continue $sw7;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(2241911797433139205L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 9; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    try {
                        r3 = DW.nextLong() << 32;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 9; continue $sw7;
                    }
                    return DW(r6) | r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String j6(java.lang.String r0) {
        return DW(r0);
    }

    public static boolean j6(android.content.Context r7, long r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 3;
        $sw8: while (true) {
            switch ($pc8) {
                case 11: {
                    th = $ex8;
                    if (Hw == false) { $pc8 = 15; continue $sw8; }
                    abcd.wu.j6(th, 888274387979980029L, null, r7, new java.lang.Long(r8));
                    $pc8 = 15; continue $sw8;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (FH == false) { $pc8 = 5; continue $sw8; }
                    try {
                        abcd.wu.j6(888274387979980029L, null, r7, new java.lang.Long(r8));
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 11; continue $sw8;
                    }
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    if ((4294967295L & r8) != DW(r7)) { $pc8 = 9; continue $sw8; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 627317200230993920L)
    private static java.lang.String v5(android.content.Context r9) {
        java.lang.String r1 = null;
        android.telephony.TelephonyManager r5 = null;
        java.lang.String r6 = null;
        java.lang.String r7 = null;
        java.lang.StringBuilder r8 = null;
        android.accounts.Account[] r0 = null;
        int r2 = 0;
        int r10 = 0;
        java.lang.String r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r1 = "(default)";
                    $pc9 = 23; continue $sw9;
                }
                case 23: {
                    th = $ex9;
                    if (Hw == false) { $pc9 = 28; continue $sw9; }
                    abcd.wu.j6(th, -940928107995117036L, null, r9);
                    $pc9 = 28; continue $sw9;
                }
                case 28: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc9 = 39; continue $sw9; }
                    try {
                        abcd.wu.j6(-940928107995117036L, null, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 23; continue $sw9;
                    }
                    $pc9 = 39; continue $sw9;
                }
                case 39: {
                    try {
                        r5 = (android.telephony.TelephonyManager) r9.getSystemService("phone");
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.lang.Exception) { $pc9 = 13; continue $sw9; }
                        $pc9 = 23; continue $sw9;
                    }
                    try {
                        r6 = r5.getDeviceId();
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.lang.Exception) { $pc9 = 9; continue $sw9; }
                        $pc9 = 23; continue $sw9;
                    }
                    $pc9 = 41; continue $sw9;
                }
                case 41: {
                    try {
                        r7 = r5.getSimSerialNumber();
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.lang.Exception) { $pc9 = 12; continue $sw9; }
                        $pc9 = 23; continue $sw9;
                    }
                    $pc9 = 45; continue $sw9;
                }
                case 45: {
                    try {
                        r1 = android.provider.Settings.Secure.getString(r9.getContentResolver(), "android_id");
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.lang.Exception) { $pc9 = 30; continue $sw9; }
                        $pc9 = 23; continue $sw9;
                    }
                    $pc9 = 15; continue $sw9;
                }
                case 15: {
                    try {
                        r8 = new java.lang.StringBuilder();
                        r8.append("android id: ");
                        r8.append(r1);
                        r8.append(";");
                        r8.append("tel device id: ");
                        r8.append(r6);
                        r8.append(";");
                        r8.append("tel sim serial no: ");
                        r8.append(r7);
                        r8.append(";");
                        r8.append("accounts: ");
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 23; continue $sw9;
                    }
                    try {
                        r0 = android.accounts.AccountManager.get(r9).getAccountsByType("com.google");
                        java.util.Arrays.sort(r0, new com.aide.licensing.h());
                        r2 = r0.length;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.lang.Exception) { $pc9 = 32; continue $sw9; }
                        $pc9 = 23; continue $sw9;
                    }
                    r10 = 0;
                    $pc9 = 17; continue $sw9;
                }
                case 17: {
                    if (r10 >= r2) { $pc9 = 21; continue $sw9; }
                    try {
                        r8.append(DW(r0[r10].name));
                        r8.append(",");
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.lang.Exception) { $pc9 = 31; continue $sw9; }
                        $pc9 = 23; continue $sw9;
                    }
                    $pc9 = 20; continue $sw9;
                }
                case 20: {
                    r10 = r10 + 1;
                    $pc9 = 21; continue $sw9;
                }
                case 21: {
                    try {
                        r3 = r8.toString();
                        abcd.ue.j6("Device ID string: " + r3);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 23; continue $sw9;
                    }
                    return r3;
                }
                case 12: {
                    r7 = "(default)";
                    $pc9 = 9; continue $sw9;
                }
                case 9: {
                    r6 = "(default)";
                    $pc9 = 13; continue $sw9;
                }
                case 13: {
                    r7 = "(default)";
                    r6 = r7;
                    { $pc9 = 45; continue $sw9; }
                }
                case 30: {
                    $pc9 = 31; continue $sw9;
                }
                case 31: {
                    $pc9 = 32; continue $sw9;
                }
                case 32: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
