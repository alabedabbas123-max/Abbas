package com.crashlytics.android.core;

class Na {
    private static final com.crashlytics.android.core.ClassD DW = null;
    private static final com.crashlytics.android.core.ClassD j6 = null;

    static {
        j6 = com.crashlytics.android.core.ClassD.j6("0");
        DW = com.crashlytics.android.core.ClassD.j6("Unity");
    }

    private static int DW(com.crashlytics.android.core.ClassD r1) {
        return com.crashlytics.android.core.ClassH.j6(1, r1) + 0;
    }

    private static int j6() {
        return ((com.crashlytics.android.core.ClassH.j6(1, j6) + 0) + com.crashlytics.android.core.ClassH.j6(2, j6)) + com.crashlytics.android.core.ClassH.j6(3, 0);
    }

    private static int j6(int r2, com.crashlytics.android.core.ClassD r3, int r4, long r5, long r7, boolean r9, java.util.Map<io.fabric.sdk.android.services.common.v.a, java.lang.String> r10, int r11, com.crashlytics.android.core.ClassD r12, com.crashlytics.android.core.ClassD r13) {
        int r0 = 0;
        int r6 = 0;
        int r8 = 0;
        int r14 = 0;
        java.util.Iterator<java.util.Map.Entry<io.fabric.sdk.android.services.common.v.a, java.lang.String>> r15 = null;
        java.util.Map.Entry<io.fabric.sdk.android.services.common.v.a, java.lang.String> r16 = null;
        int r17 = 0;
        int r18 = 0;
        int r19 = 0;
        int r20 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 0;
                    r6 = com.crashlytics.android.core.ClassH.j6(3, r2) + 0;
                    if (r3 != null) { $pc0 = 5; continue $sw0; }
                    r8 = 0;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r14 = ((((r6 + r8) + com.crashlytics.android.core.ClassH.FH(5, r4)) + com.crashlytics.android.core.ClassH.j6(6, r5)) + com.crashlytics.android.core.ClassH.j6(7, r7)) + com.crashlytics.android.core.ClassH.j6(10, r9);
                    if (r10 == null) { $pc0 = 12; continue $sw0; }
                    r15 = r10.entrySet().iterator();
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    if (r15.hasNext() == false) { $pc0 = 12; continue $sw0; }
                    r16 = r15.next();
                    r17 = j6(r16.getKey(), r16.getValue());
                    r14 = r14 + ((com.crashlytics.android.core.ClassH.v5(11) + com.crashlytics.android.core.ClassH.FH(r17)) + r17);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    r18 = r14 + com.crashlytics.android.core.ClassH.FH(12, r11);
                    if (r12 != null) { $pc0 = 15; continue $sw0; }
                    r19 = 0;
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    r20 = r18 + r19;
                    if (r13 == null) { $pc0 = 21; continue $sw0; }
                    r0 = com.crashlytics.android.core.ClassH.j6(14, r13);
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    return r20 + r0;
                }
                case 15: {
                    r19 = com.crashlytics.android.core.ClassH.j6(13, r12);
                    { $pc0 = 16; continue $sw0; }
                }
                case 5: {
                    r8 = com.crashlytics.android.core.ClassH.j6(4, r3);
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(long r12, java.lang.String r14, com.crashlytics.android.core.Ra r15, java.lang.Thread r16, java.lang.StackTraceElement[] r17, java.lang.Thread[] r18, java.util.List<java.lang.StackTraceElement[]> r19, int r20, java.util.Map<java.lang.String, java.lang.String> r21, android.app.ActivityManager.RunningAppProcessInfo r22, int r23, com.crashlytics.android.core.ClassD r24, com.crashlytics.android.core.ClassD r25, java.lang.Float r26, int r27, boolean r28, long r29, long r31, com.crashlytics.android.core.ClassD r33) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = (com.crashlytics.android.core.ClassH.j6(1, r12) + 0) + com.crashlytics.android.core.ClassH.j6(2, com.crashlytics.android.core.ClassD.j6(r14));
                    r1 = j6(r15, r16, r17, r18, r19, r20, r24, r25, r21, r22, r23);
                    r2 = r0 + ((com.crashlytics.android.core.ClassH.v5(3) + com.crashlytics.android.core.ClassH.FH(r1)) + r1);
                    r3 = j6(r26, r27, r28, r23, r29, r31);
                    r4 = r2 + ((com.crashlytics.android.core.ClassH.v5(5) + com.crashlytics.android.core.ClassH.FH(r3)) + r3);
                    if (r33 == null) { $pc1 = 6; continue $sw1; }
                    r5 = j6(r33);
                    return r4 + ((com.crashlytics.android.core.ClassH.v5(6) + com.crashlytics.android.core.ClassH.FH(r5)) + r5);
                }
                case 6: {
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(com.crashlytics.android.core.Ra r9, int r10, int r11) {
        int r2 = 0;
        int r0 = 0;
        java.lang.String r3 = null;
        java.lang.StackTraceElement[] r4 = null;
        int r5 = 0;
        int r6 = 0;
        int r1 = 0;
        int r7 = 0;
        com.crashlytics.android.core.Ra r12 = null;
        int r13 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r2 = 0;
                    r0 = com.crashlytics.android.core.ClassH.j6(1, com.crashlytics.android.core.ClassD.j6(r9.DW)) + 0;
                    r3 = r9.j6;
                    if (r3 == null) { $pc2 = 5; continue $sw2; }
                    r0 = r0 + com.crashlytics.android.core.ClassH.j6(3, com.crashlytics.android.core.ClassD.j6(r3));
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    r4 = r9.FH;
                    r5 = r4.length;
                    r6 = r0;
                    r1 = 0;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (r1 >= r5) { $pc2 = 8; continue $sw2; }
                    r7 = j6(r4[r1], true);
                    r6 = r6 + ((com.crashlytics.android.core.ClassH.v5(4) + com.crashlytics.android.core.ClassH.FH(r7)) + r7);
                    r1 = r1 + 1;
                    { $pc2 = 6; continue $sw2; }
                }
                case 8: {
                    r12 = r9.Hw;
                    if (r12 == null) { $pc2 = 18; continue $sw2; }
                    if (r10 >= r11) { $pc2 = 12; continue $sw2; }
                    r13 = j6(r12, r10 + 1, r11);
                    return r6 + ((com.crashlytics.android.core.ClassH.v5(6) + com.crashlytics.android.core.ClassH.FH(r13)) + r13);
                }
                case 12: {
                    if (r12 == null) { $pc2 = 15; continue $sw2; }
                    r12 = r12.Hw;
                    r2 = r2 + 1;
                    { $pc2 = 12; continue $sw2; }
                }
                case 15: {
                    return r6 + com.crashlytics.android.core.ClassH.FH(7, r2);
                }
                case 18: {
                    return r6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(com.crashlytics.android.core.Ra r6, java.lang.Thread r7, java.lang.StackTraceElement[] r8, java.lang.Thread[] r9, java.util.List<java.lang.StackTraceElement[]> r10, int r11, com.crashlytics.android.core.ClassD r12, com.crashlytics.android.core.ClassD r13) {
        int r14 = 0;
        int r15 = 0;
        int r1 = 0;
        int r2 = 0;
        int r16 = 0;
        int r3 = 0;
        int r17 = 0;
        int r4 = 0;
        int r18 = 0;
        int r5 = 0;
        int r19 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r14 = j6(r7, r8, 4, true);
                    r15 = ((com.crashlytics.android.core.ClassH.v5(1) + com.crashlytics.android.core.ClassH.FH(r14)) + r14) + 0;
                    r1 = r9.length;
                    r2 = r15;
                    r16 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r16 >= r1) { $pc3 = 5; continue $sw3; }
                    r3 = j6(r9[r16], r10.get(r16), 0, false);
                    r2 = r2 + ((com.crashlytics.android.core.ClassH.v5(1) + com.crashlytics.android.core.ClassH.FH(r3)) + r3);
                    r16 = r16 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 5: {
                    r17 = j6(r6, 1, r11);
                    r4 = r2 + ((com.crashlytics.android.core.ClassH.v5(2) + com.crashlytics.android.core.ClassH.FH(r17)) + r17);
                    r18 = j6();
                    r5 = r4 + ((com.crashlytics.android.core.ClassH.v5(3) + com.crashlytics.android.core.ClassH.FH(r18)) + r18);
                    r19 = j6(r12, r13);
                    return r5 + ((com.crashlytics.android.core.ClassH.v5(3) + com.crashlytics.android.core.ClassH.FH(r19)) + r19);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(com.crashlytics.android.core.Ra r0, java.lang.Thread r1, java.lang.StackTraceElement[] r2, java.lang.Thread[] r3, java.util.List<java.lang.StackTraceElement[]> r4, int r5, com.crashlytics.android.core.ClassD r6, com.crashlytics.android.core.ClassD r7, java.util.Map<java.lang.String, java.lang.String> r8, android.app.ActivityManager.RunningAppProcessInfo r9, int r10) {
        int r11 = 0;
        int r12 = 0;
        boolean r13 = false;
        int r14 = 0;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> r15 = null;
        java.util.Map.Entry<java.lang.String, java.lang.String> r16 = null;
        int r17 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r11 = j6(r0, r1, r2, r3, r4, r5, r6, r7);
                    r12 = (com.crashlytics.android.core.ClassH.v5(1) + com.crashlytics.android.core.ClassH.FH(r11)) + r11;
                    r13 = false;
                    r14 = r12 + 0;
                    if (r8 == null) { $pc4 = 8; continue $sw4; }
                    r15 = r8.entrySet().iterator();
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (r15.hasNext() == false) { $pc4 = 8; continue $sw4; }
                    r16 = r15.next();
                    r17 = j6(r16.getKey(), r16.getValue());
                    r14 = r14 + ((com.crashlytics.android.core.ClassH.v5(2) + com.crashlytics.android.core.ClassH.FH(r17)) + r17);
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    if (r9 == null) { $pc4 = 14; continue $sw4; }
                    if (r9.importance == 100) { $pc4 = 12; continue $sw4; }
                    r13 = true;
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    r14 = r14 + com.crashlytics.android.core.ClassH.j6(3, r13);
                    $pc4 = 14; continue $sw4;
                }
                case 14: {
                    return r14 + com.crashlytics.android.core.ClassH.FH(4, r10);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(com.crashlytics.android.core.ClassD r1) {
        return com.crashlytics.android.core.ClassH.j6(1, r1);
    }

    private static int j6(com.crashlytics.android.core.ClassD r4, com.crashlytics.android.core.ClassD r5) {
        int r2 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r2 = ((com.crashlytics.android.core.ClassH.j6(1, 0) + 0) + com.crashlytics.android.core.ClassH.j6(2, 0)) + com.crashlytics.android.core.ClassH.j6(3, r4);
                    if (r5 != null) { $pc5 = 5; continue $sw5; }
                    return r2;
                }
                case 5: {
                    return r2 + com.crashlytics.android.core.ClassH.j6(4, r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(com.crashlytics.android.core.ClassD r1, com.crashlytics.android.core.ClassD r2, com.crashlytics.android.core.ClassD r3, com.crashlytics.android.core.ClassD r4, com.crashlytics.android.core.ClassD r5, int r6, com.crashlytics.android.core.ClassD r7) {
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r8 = ((com.crashlytics.android.core.ClassH.j6(1, r1) + 0) + com.crashlytics.android.core.ClassH.j6(2, r3)) + com.crashlytics.android.core.ClassH.j6(3, r4);
                    r9 = DW(r2);
                    r10 = (r8 + ((com.crashlytics.android.core.ClassH.v5(5) + com.crashlytics.android.core.ClassH.FH(r9)) + r9)) + com.crashlytics.android.core.ClassH.j6(6, r5);
                    if (r7 == null) { $pc6 = 6; continue $sw6; }
                    r10 = (r10 + com.crashlytics.android.core.ClassH.j6(8, DW)) + com.crashlytics.android.core.ClassH.j6(9, r7);
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    return r10 + com.crashlytics.android.core.ClassH.j6(10, r6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(com.crashlytics.android.core.ClassD r3, com.crashlytics.android.core.ClassD r4, boolean r5) {
        return (((com.crashlytics.android.core.ClassH.j6(1, 3) + 0) + com.crashlytics.android.core.ClassH.j6(2, r3)) + com.crashlytics.android.core.ClassH.j6(3, r4)) + com.crashlytics.android.core.ClassH.j6(4, r5);
    }

    private static int j6(io.fabric.sdk.android.services.common.v.a r1, java.lang.String r2) {
        return com.crashlytics.android.core.ClassH.j6(1, r1.u7) + com.crashlytics.android.core.ClassH.j6(2, com.crashlytics.android.core.ClassD.j6(r2));
    }

    private static int j6(java.lang.Float r2, int r3, boolean r4, int r5, long r6, long r8) {
        int r0 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = 0;
                    if (r2 == null) { $pc7 = 6; continue $sw7; }
                    r0 = 0 + com.crashlytics.android.core.ClassH.j6(1, r2.floatValue());
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    return ((((r0 + com.crashlytics.android.core.ClassH.DW(2, r3)) + com.crashlytics.android.core.ClassH.j6(3, r4)) + com.crashlytics.android.core.ClassH.FH(4, r5)) + com.crashlytics.android.core.ClassH.j6(5, r6)) + com.crashlytics.android.core.ClassH.j6(6, r8);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(java.lang.StackTraceElement r6, boolean r7) {
        int r2 = 0;
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r2 = 0;
                    if (r6.isNativeMethod() == false) { $pc8 = 5; continue $sw8; }
                    r0 = com.crashlytics.android.core.ClassH.j6(1, java.lang.Math.max(r6.getLineNumber(), 0));
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    r1 = (r0 + 0) + com.crashlytics.android.core.ClassH.j6(2, com.crashlytics.android.core.ClassD.j6(r6.getClassName() + "." + r6.getMethodName()));
                    if (r6.getFileName() == null) { $pc8 = 10; continue $sw8; }
                    r1 = r1 + com.crashlytics.android.core.ClassH.j6(3, com.crashlytics.android.core.ClassD.j6(r6.getFileName()));
                    $pc8 = 10; continue $sw8;
                }
                case 10: {
                    if (r6.isNativeMethod() == true) { $pc8 = 15; continue $sw8; }
                    if (r6.getLineNumber() <= 0) { $pc8 = 15; continue $sw8; }
                    r1 = r1 + com.crashlytics.android.core.ClassH.j6(4, r6.getLineNumber());
                    $pc8 = 15; continue $sw8;
                }
                case 15: {
                    if (r7 == false) { $pc8 = 18; continue $sw8; }
                    r2 = 2;
                    $pc8 = 18; continue $sw8;
                }
                case 18: {
                    return r1 + com.crashlytics.android.core.ClassH.FH(5, r2);
                }
                case 5: {
                    r0 = com.crashlytics.android.core.ClassH.j6(1, 0);
                    { $pc8 = 6; continue $sw8; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(java.lang.String r1, java.lang.String r2) {
        int r3 = 0;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r3 = com.crashlytics.android.core.ClassH.j6(1, com.crashlytics.android.core.ClassD.j6(r1));
                    if (r2 != null) { $pc9 = 6; continue $sw9; }
                    r2 = "";
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    return r3 + com.crashlytics.android.core.ClassH.j6(2, com.crashlytics.android.core.ClassD.j6(r2));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(java.lang.Thread r4, java.lang.StackTraceElement[] r5, int r6, boolean r7) {
        int r8 = 0;
        int r9 = 0;
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r8 = com.crashlytics.android.core.ClassH.j6(1, com.crashlytics.android.core.ClassD.j6(r4.getName())) + com.crashlytics.android.core.ClassH.FH(2, r6);
                    r9 = r5.length;
                    r0 = 0;
                    $pc10 = 3; continue $sw10;
                }
                case 3: {
                    if (r0 >= r9) { $pc10 = 5; continue $sw10; }
                    r1 = j6(r5[r0], r7);
                    r8 = r8 + ((com.crashlytics.android.core.ClassH.v5(3) + com.crashlytics.android.core.ClassH.FH(r1)) + r1);
                    r0 = r0 + 1;
                    { $pc10 = 3; continue $sw10; }
                }
                case 5: {
                    return r8;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static com.crashlytics.android.core.ClassD j6(java.lang.String r0) {
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    if (r0 != null) { $pc11 = 5; continue $sw11; }
                    return null;
                }
                case 5: {
                    return com.crashlytics.android.core.ClassD.j6(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(com.crashlytics.android.core.ClassH r5, int r6, java.lang.StackTraceElement r7, boolean r8) {
        int r0 = 0;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r5.Zo(r6, 2);
                    r5.we(j6(r7, r8));
                    if (r7.isNativeMethod() == false) { $pc12 = 5; continue $sw12; }
                    r5.DW(1, java.lang.Math.max(r7.getLineNumber(), 0));
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    r5.DW(2, com.crashlytics.android.core.ClassD.j6(r7.getClassName() + "." + r7.getMethodName()));
                    if (r7.getFileName() == null) { $pc12 = 9; continue $sw12; }
                    r5.DW(3, com.crashlytics.android.core.ClassD.j6(r7.getFileName()));
                    $pc12 = 9; continue $sw12;
                }
                case 9: {
                    r0 = 4;
                    if (r7.isNativeMethod() == true) { $pc12 = 15; continue $sw12; }
                    if (r7.getLineNumber() <= 0) { $pc12 = 15; continue $sw12; }
                    r5.DW(4, r7.getLineNumber());
                    $pc12 = 15; continue $sw12;
                }
                case 15: {
                    if (r8 == true) { $pc12 = 18; continue $sw12; }
                    r0 = 0;
                    $pc12 = 18; continue $sw12;
                }
                case 18: {
                    r5.VH(5, r0);
                    return;
                }
                case 5: {
                    r5.DW(1, 0);
                    { $pc12 = 6; continue $sw12; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(com.crashlytics.android.core.ClassH r16, int r17, java.lang.String r18, int r19, long r20, long r22, boolean r24, java.util.Map<io.fabric.sdk.android.services.common.v.a, java.lang.String> r25, int r26, java.lang.String r27, java.lang.String r28) {
        com.crashlytics.android.core.ClassD r13 = null;
        com.crashlytics.android.core.ClassD r14 = null;
        com.crashlytics.android.core.ClassD r15 = null;
        java.util.Iterator<java.util.Map.Entry<io.fabric.sdk.android.services.common.v.a, java.lang.String>> r1 = null;
        java.util.Map.Entry<io.fabric.sdk.android.services.common.v.a, java.lang.String> r2 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r13 = j6(r18);
                    r14 = j6(r28);
                    r15 = j6(r27);
                    r16.Zo(9, 2);
                    r16.we(j6(r17, r13, r19, r20, r22, r24, r25, r26, r15, r14));
                    r16.Hw(3, r17);
                    r16.DW(4, r13);
                    r16.VH(5, r19);
                    r16.DW(6, r20);
                    r16.DW(7, r22);
                    r16.DW(10, r24);
                    r1 = r25.entrySet().iterator();
                    $pc13 = 4; continue $sw13;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc13 = 6; continue $sw13; }
                    r2 = r1.next();
                    r16.Zo(11, 2);
                    r16.we(j6(r2.getKey(), r2.getValue()));
                    r16.Hw(1, r2.getKey().u7);
                    r16.DW(2, com.crashlytics.android.core.ClassD.j6(r2.getValue()));
                    { $pc13 = 4; continue $sw13; }
                }
                case 6: {
                    r16.VH(12, r26);
                    if (r15 == null) { $pc13 = 9; continue $sw13; }
                    r16.DW(13, r15);
                    $pc13 = 9; continue $sw13;
                }
                case 9: {
                    if (r14 == null) { $pc13 = 13; continue $sw13; }
                    r16.DW(14, r14);
                    return;
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(com.crashlytics.android.core.ClassH r35, long r36, java.lang.String r38, com.crashlytics.android.core.Ra r39, java.lang.Thread r40, java.lang.StackTraceElement[] r41, java.lang.Thread[] r42, java.util.List<java.lang.StackTraceElement[]> r43, java.util.Map<java.lang.String, java.lang.String> r44, com.crashlytics.android.core.ua r45, android.app.ActivityManager.RunningAppProcessInfo r46, int r47, java.lang.String r48, java.lang.String r49, java.lang.Float r50, int r51, boolean r52, long r53, long r55) {
        com.crashlytics.android.core.ClassD r7 = null;
        com.crashlytics.android.core.ClassD r0 = null;
        com.crashlytics.android.core.ClassD r8 = null;
        com.crashlytics.android.core.ClassD r11 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r7 = com.crashlytics.android.core.ClassD.j6(r48);
                    if (r49 != null) { $pc14 = 5; continue $sw14; }
                    r0 = null;
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    r8 = r0;
                    r11 = r45.DW();
                    if (r11 != null) { $pc14 = 9; continue $sw14; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "No log data to include with this event.");
                    $pc14 = 9; continue $sw14;
                }
                case 9: {
                    r45.j6();
                    r35.Zo(10, 2);
                    r35.we(j6(r36, r38, r39, r40, r41, r42, r43, 8, r44, r46, r47, r7, r8, r50, r51, r52, r53, r55, r11));
                    r35.DW(1, r36);
                    r35.DW(2, com.crashlytics.android.core.ClassD.j6(r38));
                    j6(r35, r39, r40, r41, r42, r43, 8, r7, r8, r44, r46, r47);
                    j6(r35, r50, r51, r52, r47, r53, r55);
                    j6(r35, r11);
                    return;
                }
                case 5: {
                    r0 = com.crashlytics.android.core.ClassD.j6(r49.replace("-", ""));
                    { $pc14 = 6; continue $sw14; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(com.crashlytics.android.core.ClassH r6, com.crashlytics.android.core.Ra r7, int r8, int r9, int r10) {
        java.lang.String r0 = null;
        java.lang.StackTraceElement[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        com.crashlytics.android.core.Ra r11 = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r6.Zo(r10, 2);
                    r6.we(j6(r7, 1, r9));
                    r6.DW(1, com.crashlytics.android.core.ClassD.j6(r7.DW));
                    r0 = r7.j6;
                    if (r0 == null) { $pc15 = 5; continue $sw15; }
                    r6.DW(3, com.crashlytics.android.core.ClassD.j6(r0));
                    $pc15 = 5; continue $sw15;
                }
                case 5: {
                    r1 = r7.FH;
                    r2 = r1.length;
                    r3 = 0;
                    r4 = 0;
                    $pc15 = 6; continue $sw15;
                }
                case 6: {
                    if (r4 >= r2) { $pc15 = 8; continue $sw15; }
                    j6(r6, 4, r1[r4], true);
                    r4 = r4 + 1;
                    { $pc15 = 6; continue $sw15; }
                }
                case 8: {
                    r11 = r7.Hw;
                    if (r11 == null) { $pc15 = 18; continue $sw15; }
                    if (r8 >= r9) { $pc15 = 12; continue $sw15; }
                    j6(r6, r11, r8 + 1, r9, 6);
                    return;
                }
                case 12: {
                    if (r11 == null) { $pc15 = 14; continue $sw15; }
                    r11 = r11.Hw;
                    r3 = r3 + 1;
                    { $pc15 = 12; continue $sw15; }
                }
                case 14: {
                    r6.VH(7, r3);
                    return;
                }
                case 18: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(com.crashlytics.android.core.ClassH r6, com.crashlytics.android.core.Ra r7, java.lang.Thread r8, java.lang.StackTraceElement[] r9, java.lang.Thread[] r10, java.util.List<java.lang.StackTraceElement[]> r11, int r12, com.crashlytics.android.core.ClassD r13, com.crashlytics.android.core.ClassD r14) {
        int r15 = 0;
        int r3 = 0;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    r6.Zo(1, 2);
                    r6.we(j6(r7, r8, r9, r10, r11, r12, r13, r14));
                    j6(r6, r8, r9, 4, true);
                    r15 = r10.length;
                    r3 = 0;
                    $pc16 = 3; continue $sw16;
                }
                case 3: {
                    if (r3 >= r15) { $pc16 = 5; continue $sw16; }
                    j6(r6, r10[r3], r11.get(r3), 0, false);
                    r3 = r3 + 1;
                    { $pc16 = 3; continue $sw16; }
                }
                case 5: {
                    j6(r6, r7, 1, r12, 2);
                    r6.Zo(3, 2);
                    r6.we(j6());
                    r6.DW(1, j6);
                    r6.DW(2, j6);
                    r6.DW(3, 0);
                    r6.Zo(4, 2);
                    r6.we(j6(r13, r14));
                    r6.DW(1, 0);
                    r6.DW(2, 0);
                    r6.DW(3, r13);
                    if (r14 == null) { $pc16 = 10; continue $sw16; }
                    r6.DW(4, r14);
                    return;
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(com.crashlytics.android.core.ClassH r2, com.crashlytics.android.core.Ra r3, java.lang.Thread r4, java.lang.StackTraceElement[] r5, java.lang.Thread[] r6, java.util.List<java.lang.StackTraceElement[]> r7, int r8, com.crashlytics.android.core.ClassD r9, com.crashlytics.android.core.ClassD r10, java.util.Map<java.lang.String, java.lang.String> r11, android.app.ActivityManager.RunningAppProcessInfo r12, int r13) {
        boolean r14 = false;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    r2.Zo(3, 2);
                    r2.we(j6(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13));
                    j6(r2, r3, r4, r5, r6, r7, r8, r9, r10);
                    if (r11 != null) { $pc17 = 5; continue $sw17; }
                    $pc17 = 7; continue $sw17;
                }
                case 7: {
                    if (r12 != null) { $pc17 = 9; continue $sw17; }
                    $pc17 = 13; continue $sw17;
                }
                case 13: {
                    r2.VH(4, r13);
                    return;
                }
                case 9: {
                    if (r12.importance == 100) { $pc17 = 11; continue $sw17; }
                    r14 = true;
                    $pc17 = 12; continue $sw17;
                }
                case 12: {
                    r2.DW(3, r14);
                    { $pc17 = 13; continue $sw17; }
                }
                case 11: {
                    r14 = false;
                    { $pc17 = 12; continue $sw17; }
                }
                case 5: {
                    if (r11.isEmpty() == true) { $pc17 = 7; continue $sw17; }
                    j6(r2, r11);
                    { $pc17 = 7; continue $sw17; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(com.crashlytics.android.core.ClassH r2, com.crashlytics.android.core.ClassD r3) {
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    if (r3 == null) { $pc18 = 5; continue $sw18; }
                    r2.Zo(6, 2);
                    r2.we(j6(r3));
                    r2.DW(1, r3);
                    return;
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(com.crashlytics.android.core.ClassH r3, java.lang.Float r4, int r5, boolean r6, int r7, long r8, long r10) {
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    r3.Zo(5, 2);
                    r3.we(j6(r4, r5, r6, r7, r8, r10));
                    if (r4 == null) { $pc19 = 5; continue $sw19; }
                    r3.DW(1, r4.floatValue());
                    $pc19 = 5; continue $sw19;
                }
                case 5: {
                    r3.v5(2, r5);
                    r3.DW(3, r6);
                    r3.VH(4, r7);
                    r3.DW(5, r8);
                    r3.DW(6, r10);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(com.crashlytics.android.core.ClassH r1, java.lang.String r2, java.lang.String r3, long r4) {
        r1.DW(1, com.crashlytics.android.core.ClassD.j6(r3));
        r1.DW(2, com.crashlytics.android.core.ClassD.j6(r2));
        r1.DW(3, r4);
    }

    public static void j6(com.crashlytics.android.core.ClassH r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        com.crashlytics.android.core.ClassD r11 = null;
        com.crashlytics.android.core.ClassD r0 = null;
        com.crashlytics.android.core.ClassD r1 = null;
        int r3 = 0;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    if (r8 != null) { $pc20 = 4; continue $sw20; }
                    r8 = "";
                    $pc20 = 4; continue $sw20;
                }
                case 4: {
                    r11 = com.crashlytics.android.core.ClassD.j6(r8);
                    r0 = j6(r9);
                    r1 = j6(r10);
                    r3 = com.crashlytics.android.core.ClassH.j6(1, r11) + 0;
                    if (r9 == null) { $pc20 = 8; continue $sw20; }
                    r3 = r3 + com.crashlytics.android.core.ClassH.j6(2, r0);
                    $pc20 = 8; continue $sw20;
                }
                case 8: {
                    if (r10 == null) { $pc20 = 10; continue $sw20; }
                    r3 = r3 + com.crashlytics.android.core.ClassH.j6(3, r1);
                    $pc20 = 10; continue $sw20;
                }
                case 10: {
                    r7.Zo(6, 2);
                    r7.we(r3);
                    r7.DW(1, r11);
                    if (r9 == null) { $pc20 = 13; continue $sw20; }
                    r7.DW(2, r0);
                    $pc20 = 13; continue $sw20;
                }
                case 13: {
                    if (r10 == null) { $pc20 = 16; continue $sw20; }
                    r7.DW(3, r1);
                    return;
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(com.crashlytics.android.core.ClassH r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, java.lang.String r15) {
        com.crashlytics.android.core.ClassD r16 = null;
        com.crashlytics.android.core.ClassD r17 = null;
        com.crashlytics.android.core.ClassD r18 = null;
        com.crashlytics.android.core.ClassD r19 = null;
        com.crashlytics.android.core.ClassD r110 = null;
        com.crashlytics.android.core.ClassD r111 = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    r16 = com.crashlytics.android.core.ClassD.j6(r9);
                    r17 = com.crashlytics.android.core.ClassD.j6(r10);
                    r18 = com.crashlytics.android.core.ClassD.j6(r11);
                    r19 = com.crashlytics.android.core.ClassD.j6(r12);
                    r110 = com.crashlytics.android.core.ClassD.j6(r13);
                    if (r15 == null) { $pc21 = 5; continue $sw21; }
                    r111 = com.crashlytics.android.core.ClassD.j6(r15);
                    $pc21 = 6; continue $sw21;
                }
                case 6: {
                    r8.Zo(7, 2);
                    r8.we(j6(r16, r17, r18, r19, r110, r14, r111));
                    r8.DW(1, r16);
                    r8.DW(2, r18);
                    r8.DW(3, r19);
                    r8.Zo(5, 2);
                    r8.we(DW(r17));
                    r8.DW(1, r17);
                    r8.DW(6, r110);
                    if (r111 == null) { $pc21 = 9; continue $sw21; }
                    r8.DW(8, DW);
                    r8.DW(9, r111);
                    $pc21 = 9; continue $sw21;
                }
                case 9: {
                    r8.Hw(10, r14);
                    return;
                }
                case 5: {
                    r111 = null;
                    { $pc21 = 6; continue $sw21; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(com.crashlytics.android.core.ClassH r3, java.lang.String r4, java.lang.String r5, boolean r6) {
        com.crashlytics.android.core.ClassD r7 = com.crashlytics.android.core.ClassD.j6(r4);
        com.crashlytics.android.core.ClassD r8 = com.crashlytics.android.core.ClassD.j6(r5);
        r3.Zo(8, 2);
        r3.we(j6(r7, r8, r6));
        r3.Hw(1, 3);
        r3.DW(2, r7);
        r3.DW(3, r8);
        r3.DW(4, r6);
    }

    private static void j6(com.crashlytics.android.core.ClassH r3, java.lang.Thread r4, java.lang.StackTraceElement[] r5, int r6, boolean r7) {
        int r8 = 0;
        int r9 = 0;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    r3.Zo(1, 2);
                    r3.we(j6(r4, r5, r6, r7));
                    r3.DW(1, com.crashlytics.android.core.ClassD.j6(r4.getName()));
                    r3.VH(2, r6);
                    r8 = r5.length;
                    r9 = 0;
                    $pc22 = 3; continue $sw22;
                }
                case 3: {
                    if (r9 >= r8) { $pc22 = 5; continue $sw22; }
                    j6(r3, 3, r5[r9], r7);
                    r9 = r9 + 1;
                    { $pc22 = 3; continue $sw22; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(com.crashlytics.android.core.ClassH r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> r6 = null;
        java.util.Map.Entry<java.lang.String, java.lang.String> r0 = null;
        java.lang.String r1 = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = -1;
        $sw23: while (true) {
            switch ($pc23) {
                case -1: {
                    r6 = r5.entrySet().iterator();
                    $pc23 = 4; continue $sw23;
                }
                case 4: {
                    if (r6.hasNext() == false) { $pc23 = 9; continue $sw23; }
                    r0 = r6.next();
                    r4.Zo(2, 2);
                    r4.we(j6(r0.getKey(), r0.getValue()));
                    r4.DW(1, com.crashlytics.android.core.ClassD.j6(r0.getKey()));
                    r1 = r0.getValue();
                    if (r1 != null) { $pc23 = 8; continue $sw23; }
                    r1 = "";
                    $pc23 = 8; continue $sw23;
                }
                case 8: {
                    r4.DW(2, com.crashlytics.android.core.ClassD.j6(r1));
                    { $pc23 = 4; continue $sw23; }
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
