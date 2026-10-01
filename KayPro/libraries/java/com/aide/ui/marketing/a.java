package com.aide.ui.marketing;

@abcd.Interfacexu
public class a {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;

    @abcd.Interfaceru(field = -600600414488716911L)
    static com.aide.ui.marketing.a.C0047a[] j6;

    @abcd.Interfacexu
    public static class C0047a {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;
        public int FH;
        public java.lang.String Hw;
        public java.lang.String VH;
        public java.lang.String Zo;
        public java.lang.String v5;

        static {
            abcd.wu.j6(com.aide.ui.marketing.a.C0047a.class, -571235218108168992L, -571235218108168992L);
        }

        public C0047a(int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 3;
            $sw0: while (true) {
                switch ($pc0) {
                    case 7: {
                        th = $ex0;
                        if (DW == false) { $pc0 = 11; continue $sw0; }
                        abcd.wu.j6(th, -1710473834646418725L, null, new java.lang.Integer(r11), r12, r13, r14, r15);
                        $pc0 = 11; continue $sw0;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc0 = 5; continue $sw0; }
                        try {
                            abcd.wu.j6(-1710473834646418725L, null, new java.lang.Integer(r11), r12, r13, r14, r15);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 7; continue $sw0;
                        }
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
                        try {
                            this.FH = r11;
                            this.Hw = r12;
                            this.v5 = r13;
                            this.Zo = r14;
                            this.VH = r15;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 7; continue $sw0;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = 519395161803543376L)
        private java.util.List<java.lang.String> j6(android.content.Context r8, java.lang.String r9) {
            java.util.ArrayList r0 = null;
            java.io.BufferedReader r1 = null;
            java.lang.String r2 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 3;
            $sw1: while (true) {
                switch ($pc1) {
                    case 12: {
                        th = $ex1;
                        if (DW == false) { $pc1 = 17; continue $sw1; }
                        abcd.wu.j6(th, 283828885939543860L, this, r8, r9);
                        $pc1 = 17; continue $sw1;
                    }
                    case 17: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc1 = 5; continue $sw1; }
                        try {
                            abcd.wu.j6(283828885939543860L, this, r8, r9);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 12; continue $sw1;
                        }
                        $pc1 = 5; continue $sw1;
                    }
                    case 5: {
                        try {
                            r0 = new java.util.ArrayList();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 12; continue $sw1;
                        }
                        try {
                            r1 = new java.io.BufferedReader(new java.io.InputStreamReader(r8.getAssets().open(r9)));
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.IOException) { $pc1 = 19; continue $sw1; }
                            $pc1 = 12; continue $sw1;
                        }
                        $pc1 = 7; continue $sw1;
                    }
                    case 7: {
                        try {
                            r2 = r1.readLine();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.IOException) { $pc1 = 19; continue $sw1; }
                            $pc1 = 12; continue $sw1;
                        }
                        if (r2 == null) { $pc1 = 10; continue $sw1; }
                        try {
                            r0.add(r2);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.IOException) { $pc1 = 19; continue $sw1; }
                            $pc1 = 12; continue $sw1;
                        }
                        { $pc1 = 7; continue $sw1; }
                    }
                    case 10: {
                        try {
                            r1.close();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.IOException) { $pc1 = 19; continue $sw1; }
                            $pc1 = 12; continue $sw1;
                        }
                        $pc1 = 11; continue $sw1;
                    }
                    case 11: {
                        return r0;
                    }
                    case 19: {
                        throw new java.lang.IllegalStateException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public java.lang.String DW(android.content.Context r5) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = 4;
            $sw2: while (true) {
                switch ($pc2) {
                    case 8: {
                        th = $ex2;
                        if (DW == false) { $pc2 = 12; continue $sw2; }
                        abcd.wu.j6(th, -4614159413425814080L, this, r5);
                        $pc2 = 12; continue $sw2;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc2 = 6; continue $sw2; }
                        try {
                            abcd.wu.j6(-4614159413425814080L, this, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 8; continue $sw2;
                        }
                        $pc2 = 6; continue $sw2;
                    }
                    case 6: {
                        return android.text.TextUtils.join("\n", j6(r5));
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public java.util.List<java.lang.String> j6(android.content.Context r5) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = 4;
            $sw3: while (true) {
                switch ($pc3) {
                    case 8: {
                        th = $ex3;
                        if (DW == false) { $pc3 = 12; continue $sw3; }
                        abcd.wu.j6(th, -2020798977753780744L, this, r5);
                        $pc3 = 12; continue $sw3;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc3 = 6; continue $sw3; }
                        try {
                            abcd.wu.j6(-2020798977753780744L, this, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 8; continue $sw3;
                        }
                        $pc3 = 6; continue $sw3;
                    }
                    case 6: {
                        return j6(r5, this.VH);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    try {
                        abcd.wu.j6(com.aide.ui.marketing.a.class, 3311268933990658443L, 3311268933990658443L);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    if (DW == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(-1688411636032686611L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        j6 = new com.aide.ui.marketing.a.C0047a[]{new com.aide.ui.marketing.a.C0047a(com.almlkaide.kaypro.R.drawable.ic_launcher, "com.aide.ui", "AIDE - Android IDE for Java/C++", "Develop programs and apps directly on your Android devices", "whatsnew/aide-whatsnew.txt"), new com.aide.ui.marketing.a.C0047a(com.almlkaide.kaypro.R.drawable.ic_launcher_web, "com.aide.web", "AIDE Web - Html, Css, JavaScript", "Develop websites directly on your Android devices", "whatsnew/aide-web-whatsnew.txt"), new com.aide.ui.marketing.a.C0047a(com.almlkaide.kaypro.R.drawable.ic_launcher_phonegap, "com.aide.phonegap", "AIDE for Phonegap", "Develop Phonegap apps with Html & JavaScript directly on your Android devices", "whatsnew/aide-phonegap-whatsnew.txt")};
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    return;
                }
                case 8: {
                    th = $ex4;
                    if (FH == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, -1688411636032686611L, null);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public a() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (FH == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, -3368114069205758400L, null);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-3368114069205758400L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
    public static java.lang.String j6(java.lang.Object r9) {
        com.aide.ui.marketing.a.C0047a[] r3 = null;
        int r4 = 0;
        int r5 = 0;
        com.aide.ui.marketing.a.C0047a r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 15: {
                    th = $ex6;
                    if (FH == false) { $pc6 = 20; continue $sw6; }
                    abcd.wu.j6(th, -2240285139720945328L, null, r9);
                    $pc6 = 20; continue $sw6;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(-2240285139720945328L, null, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 15; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        r3 = j6;
                        r4 = r3.length;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 15; continue $sw6;
                    }
                    r5 = 0;
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    if (r5 >= r4) { $pc6 = 13; continue $sw6; }
                    try {
                        r6 = r3[r5];
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 15; continue $sw6;
                    }
                    if (r6.Hw.equals(r9.getPackageName()) == true) { $pc6 = 10; continue $sw6; }
                    try {
                        r5 = r5 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 15; continue $sw6;
                    }
                    { $pc6 = 7; continue $sw6; }
                }
                case 10: {
                    try {
                        r9 = r6.DW(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 15; continue $sw6;
                    }
                    return r9;
                }
                case 13: {
                    return "";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
