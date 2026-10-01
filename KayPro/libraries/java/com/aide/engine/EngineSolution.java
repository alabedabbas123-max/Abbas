package com.aide.engine;

@abcd.Interfacexu
public class EngineSolution implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.aide.engine.EngineSolution> CREATOR = null;

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public final java.util.List<com.aide.engine.EngineSolutionProject> FH;

    @abcd.Interfaceru(field = 2885473267692104283L)
    private final java.lang.String Hw;
    public java.util.List<java.lang.String> Zo;

    @abcd.Interfaceru(field = 4512509444130051504L)
    private final java.util.TreeMap<java.lang.String, java.util.List<java.lang.String>> v5;

    @abcd.Interfacexu
    public static class File implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.aide.engine.EngineSolution.File> CREATOR = null;

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = -2656692000590085385L)
        private final java.lang.String FH;

        @abcd.Interfaceru(field = 1576331338137298656L)
        private final java.lang.String Hw;

        @abcd.Interfaceru(field = -99333058633746145L)
        private final boolean VH;

        @abcd.Interfaceru(field = -2437558712941134624L)
        private final boolean Zo;

        @abcd.Interfaceru(field = 2275511206990035941L)
        private final java.lang.String v5;

        static {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        try {
                            abcd.wu.j6(com.aide.engine.EngineSolution.File.class, -3579233191020808329L, -3579233191020808329L);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 8; continue $sw0;
                        }
                        if (j6 == false) { $pc0 = 6; continue $sw0; }
                        try {
                            abcd.wu.j6(-154502159828188648L, null);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 8; continue $sw0;
                        }
                        $pc0 = 6; continue $sw0;
                    }
                    case 6: {
                        try {
                            CREATOR = new com.aide.engine.ClassF();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 8; continue $sw0;
                        }
                        return;
                    }
                    case 8: {
                        th = $ex0;
                        if (DW == false) { $pc0 = 12; continue $sw0; }
                        abcd.wu.j6(th, -154502159828188648L, null);
                        $pc0 = 12; continue $sw0;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public File(android.os.Parcel r7) {
            boolean r4 = false;
            boolean r3 = false;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 4;
            $sw1: while (true) {
                switch ($pc1) {
                    case 16: {
                        th = $ex1;
                        if (DW == false) { $pc1 = 20; continue $sw1; }
                        abcd.wu.j6(th, -644478749509622232L, null, r7);
                        $pc1 = 20; continue $sw1;
                    }
                    case 20: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc1 = 6; continue $sw1; }
                        try {
                            abcd.wu.j6(-644478749509622232L, null, r7);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 16; continue $sw1;
                        }
                        $pc1 = 6; continue $sw1;
                    }
                    case 6: {
                        try {
                            this.FH = r7.readString();
                            this.Hw = r7.readString();
                            this.v5 = r7.readString();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 16; continue $sw1;
                        }
                        r4 = true;
                        if (r7.readInt() == 0) { $pc1 = 9; continue $sw1; }
                        r3 = true;
                        $pc1 = 10; continue $sw1;
                    }
                    case 10: {
                        try {
                            this.Zo = r3;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 16; continue $sw1;
                        }
                        if (r7.readInt() != 0) { $pc1 = 14; continue $sw1; }
                        r4 = false;
                        $pc1 = 14; continue $sw1;
                    }
                    case 14: {
                        try {
                            this.VH = r4;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 16; continue $sw1;
                        }
                        return;
                    }
                    case 9: {
                        r3 = false;
                        { $pc1 = 10; continue $sw1; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public File(java.lang.String r11, java.lang.String r12, java.lang.String r13, boolean r14, boolean r15) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = 3;
            $sw2: while (true) {
                switch ($pc2) {
                    case 7: {
                        th = $ex2;
                        if (DW == false) { $pc2 = 11; continue $sw2; }
                        abcd.wu.j6(th, -2728438989639039864L, null, r11, r12, r13, new java.lang.Boolean(r14), new java.lang.Boolean(r15));
                        $pc2 = 11; continue $sw2;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc2 = 5; continue $sw2; }
                        try {
                            abcd.wu.j6(-2728438989639039864L, null, r11, r12, r13, new java.lang.Boolean(r14), new java.lang.Boolean(r15));
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 7; continue $sw2;
                        }
                        $pc2 = 5; continue $sw2;
                    }
                    case 5: {
                        try {
                            this.FH = r11;
                            this.Hw = r12;
                            this.v5 = r13;
                            this.Zo = r14;
                            this.VH = r15;
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 7; continue $sw2;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        static java.lang.String DW(com.aide.engine.EngineSolution.File r0) {
            return r0.Hw;
        }

        static boolean FH(com.aide.engine.EngineSolution.File r0) {
            return r0.VH;
        }

        static boolean Hw(com.aide.engine.EngineSolution.File r0) {
            return r0.Zo;
        }

        static java.lang.String j6(com.aide.engine.EngineSolution.File r0) {
            return r0.FH;
        }

        static java.lang.String v5(com.aide.engine.EngineSolution.File r0) {
            return r0.v5;
        }

        @Override
        public int describeContents() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = 4;
            $sw3: while (true) {
                switch ($pc3) {
                    case 8: {
                        th = $ex3;
                        if (DW == false) { $pc3 = 12; continue $sw3; }
                        abcd.wu.j6(th, -870902371027684725L, this);
                        $pc3 = 12; continue $sw3;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc3 = 15; continue $sw3; }
                        try {
                            abcd.wu.j6(-870902371027684725L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 8; continue $sw3;
                        }
                        return 0;
                    }
                    case 15: {
                        return 0;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void writeToParcel(android.os.Parcel r8, int r9) {
            int r1 = 0;
            int r0 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = 3;
            $sw4: while (true) {
                switch ($pc4) {
                    case 15: {
                        th = $ex4;
                        if (DW == false) { $pc4 = 19; continue $sw4; }
                        abcd.wu.j6(th, 3758667938306483416L, this, r8, new java.lang.Integer(r9));
                        $pc4 = 19; continue $sw4;
                    }
                    case 19: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc4 = 5; continue $sw4; }
                        try {
                            abcd.wu.j6(3758667938306483416L, this, r8, new java.lang.Integer(r9));
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 15; continue $sw4;
                        }
                        $pc4 = 5; continue $sw4;
                    }
                    case 5: {
                        try {
                            r8.writeString(this.FH);
                            r8.writeString(this.Hw);
                            r8.writeString(this.v5);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 15; continue $sw4;
                        }
                        r1 = 1;
                        if (this.Zo == false) { $pc4 = 8; continue $sw4; }
                        r0 = 1;
                        $pc4 = 9; continue $sw4;
                    }
                    case 9: {
                        try {
                            r8.writeInt(r0);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 15; continue $sw4;
                        }
                        if (this.VH == true) { $pc4 = 13; continue $sw4; }
                        r1 = 0;
                        $pc4 = 13; continue $sw4;
                    }
                    case 13: {
                        try {
                            r8.writeInt(r1);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 15; continue $sw4;
                        }
                        return;
                    }
                    case 8: {
                        r0 = 0;
                        { $pc4 = 9; continue $sw4; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    try {
                        abcd.wu.j6(com.aide.engine.EngineSolution.class, -5147424603853593465L, -5147424603853593465L);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    if (j6 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(2403266038710548903L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    try {
                        CREATOR = new com.aide.engine.ClassE();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    return;
                }
                case 8: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, 2403266038710548903L, null);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public EngineSolution(android.os.Parcel r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, -15700115910165984L, null, r6);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(-15700115910165984L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        this.FH = new java.util.ArrayList();
                        this.Hw = r6.readString();
                        this.v5 = new java.util.TreeMap();
                        r6.readMap(this.v5, getClass().getClassLoader());
                        this.Zo = new java.util.ArrayList();
                        r6.readList(this.Zo, getClass().getClassLoader());
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public EngineSolution(java.util.List<com.aide.engine.EngineSolutionProject> r10, java.lang.String r11, java.util.TreeMap<java.lang.String, java.util.List<java.lang.String>> r12, java.util.List<java.lang.String> r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 3;
        $sw7: while (true) {
            switch ($pc7) {
                case 7: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 11; continue $sw7; }
                    abcd.wu.j6(th, 2746260029581372976L, null, r10, r11, r12, r13);
                    $pc7 = 11; continue $sw7;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc7 = 5; continue $sw7; }
                    try {
                        abcd.wu.j6(2746260029581372976L, null, r10, r11, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 7; continue $sw7;
                    }
                    $pc7 = 5; continue $sw7;
                }
                case 5: {
                    try {
                        this.FH = r10;
                        this.Hw = r11;
                        this.v5 = r12;
                        this.Zo = r13;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 7; continue $sw7;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 31939011519163875L)
    private void j6(abcd.La r11, abcd.Da r12, boolean r13, int r14, abcd.Interfacela r15) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 3;
        $sw8: while (true) {
            switch ($pc8) {
                case 18: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 23; continue $sw8; }
                    abcd.wu.j6(th, -668855356256737821L, this, r11, r12, new java.lang.Boolean(r13), new java.lang.Integer(r14), r15);
                    $pc8 = 23; continue $sw8;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(-668855356256737821L, this, r11, r12, new java.lang.Boolean(r13), new java.lang.Integer(r14), r15);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 18; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    if (r12.yS() == false) { $pc8 = 15; continue $sw8; }
                    if (r12.rN() == true) { $pc8 = 15; continue $sw8; }
                    if (r12.tp().startsWith(".") == true) { $pc8 = 27; continue $sw8; }
                    try {
                        r0 = r12.Hw();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 18; continue $sw8;
                    }
                    r1 = 0;
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    if (r1 >= r0) { $pc8 = 29; continue $sw8; }
                    try {
                        j6(r11, r12.j6(r1), r13, r14, r15);
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 18; continue $sw8;
                    }
                    { $pc8 = 12; continue $sw8; }
                }
                case 29: {
                    return;
                }
                case 27: {
                    return;
                }
                case 15: {
                    if (j6(r12, r15) == false) { $pc8 = 28; continue $sw8; }
                    try {
                        r11.j6(r12, r14, r15, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 18; continue $sw8;
                    }
                    return;
                }
                case 28: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 787144627791687249L)
    private boolean j6(abcd.Da r11, abcd.Interfacela r12) {
        java.lang.String r0 = null;
        java.lang.String[] r1 = null;
        java.lang.String[] r2 = null;
        int r4 = 0;
        int r5 = 0;
        java.lang.String r6 = null;
        int r7 = 0;
        int r8 = 0;
        java.lang.String r9 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 3;
        $sw9: while (true) {
            switch ($pc9) {
                case 23: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 28; continue $sw9; }
                    abcd.wu.j6(th, 4110792065544809913L, this, r11, r12);
                    $pc9 = 28; continue $sw9;
                }
                case 28: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc9 = 5; continue $sw9; }
                    try {
                        abcd.wu.j6(4110792065544809913L, this, r11, r12);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 23; continue $sw9;
                    }
                    $pc9 = 5; continue $sw9;
                }
                case 5: {
                    try {
                        r0 = r11.tp();
                        r1 = r12.Hw();
                        r2 = r12.FH();
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 23; continue $sw9;
                    }
                    if (r1 != null) { $pc9 = 8; continue $sw9; }
                    $pc9 = 22; continue $sw9;
                }
                case 22: {
                    return false;
                }
                case 8: {
                    if (abcd.Abstractpc.j6() == null) { $pc9 = 22; continue $sw9; }
                    try {
                        r4 = r1.length;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 23; continue $sw9;
                    }
                    r5 = 0;
                    $pc9 = 10; continue $sw9;
                }
                case 10: {
                    if (r5 >= r4) { $pc9 = 22; continue $sw9; }
                    try {
                        r6 = r1[r5];
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 23; continue $sw9;
                    }
                    if (abcd.Abstractpc.j6().j6(r0, r6) == false) { $pc9 = 21; continue $sw9; }
                    try {
                        r7 = r2.length;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 23; continue $sw9;
                    }
                    r8 = 0;
                    $pc9 = 14; continue $sw9;
                }
                case 14: {
                    if (r8 >= r7) { $pc9 = 19; continue $sw9; }
                    try {
                        r9 = r2[r8];
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 23; continue $sw9;
                    }
                    if (abcd.Abstractpc.j6().j6(r0, r9) == true) { $pc9 = 21; continue $sw9; }
                    r8 = r8 + 1;
                    { $pc9 = 14; continue $sw9; }
                }
                case 19: {
                    return true;
                }
                case 21: {
                    r5 = r5 + 1;
                    { $pc9 = 10; continue $sw9; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int describeContents() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 8: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 12; continue $sw10; }
                    abcd.wu.j6(th, -6059007693965183048L, this);
                    $pc10 = 12; continue $sw10;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc10 = 15; continue $sw10; }
                    try {
                        abcd.wu.j6(-6059007693965183048L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    return 0;
                }
                case 15: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public long j6() {
        java.security.MessageDigest r2 = null;
        java.util.Iterator<java.lang.String> r3 = null;
        java.util.Iterator<com.aide.engine.EngineSolutionProject> r4 = null;
        int r5 = 0;
        com.aide.engine.EngineSolutionProject r6 = null;
        java.util.Iterator<java.lang.String> r7 = null;
        java.util.Iterator<java.lang.String> r8 = null;
        java.util.Iterator<java.lang.String> r9 = null;
        java.util.Iterator<com.aide.engine.EngineSolution.File> r10 = null;
        com.aide.engine.EngineSolution.File r11 = null;
        java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> r13 = null;
        java.util.Iterator<java.lang.String> r14 = null;
        byte[] r15 = null;
        long r16 = 0L;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 68;
        $sw11: while (true) {
            switch ($pc11) {
                case 68: {
                    th = $ex11;
                    if (DW == false) { $pc11 = 73; continue $sw11; }
                    abcd.wu.j6(th, -2704125139962466220L, this);
                    $pc11 = 73; continue $sw11;
                }
                case 73: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc11 = 76; continue $sw11; }
                    try {
                        abcd.wu.j6(-2704125139962466220L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    $pc11 = 76; continue $sw11;
                }
                case 76: {
                    try {
                        r2 = java.security.MessageDigest.getInstance("MD5");
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.security.NoSuchAlgorithmException) { $pc11 = 66; continue $sw11; }
                        $pc11 = 68; continue $sw11;
                    }
                    try {
                        r2.reset();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    if (this.Hw == null) { $pc11 = 10; continue $sw11; }
                    try {
                        r2.update(this.Hw.getBytes());
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    $pc11 = 10; continue $sw11;
                }
                case 10: {
                    try {
                        r3 = this.Zo.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    $pc11 = 12; continue $sw11;
                }
                case 12: {
                    if (r3.hasNext() == false) { $pc11 = 14; continue $sw11; }
                    try {
                        r2.update(r3.next().getBytes());
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    { $pc11 = 12; continue $sw11; }
                }
                case 14: {
                    try {
                        r4 = this.FH.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    $pc11 = 15; continue $sw11;
                }
                case 15: {
                    r5 = 0;
                    if (r4.hasNext() == false) { $pc11 = 54; continue $sw11; }
                    try {
                        r6 = r4.next();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    if (r6.u7 == null) { $pc11 = 20; continue $sw11; }
                    try {
                        r2.update(r6.u7.getBytes());
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    $pc11 = 20; continue $sw11;
                }
                case 20: {
                    try {
                        r2.update(r6.FH.getBytes());
                        r2.update(r6.Hw.getBytes());
                        r2.update(r6.v5.getBytes());
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    if (r6.XL == null) { $pc11 = 24; continue $sw11; }
                    try {
                        r2.update(r6.XL.getBytes());
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    $pc11 = 24; continue $sw11;
                }
                case 24: {
                    if (r6.aM == null) { $pc11 = 30; continue $sw11; }
                    try {
                        r7 = r6.aM.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    $pc11 = 27; continue $sw11;
                }
                case 27: {
                    if (r7.hasNext() == false) { $pc11 = 30; continue $sw11; }
                    try {
                        r2.update(r7.next().getBytes());
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    $pc11 = 30; continue $sw11;
                }
                case 30: {
                    if (r6.gn == true) { $pc11 = 33; continue $sw11; }
                    r5 = 1;
                    $pc11 = 33; continue $sw11;
                }
                case 33: {
                    try {
                        r2.update((byte) r5);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    if (r6.j3 == null) { $pc11 = 40; continue $sw11; }
                    try {
                        r8 = r6.j3.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    $pc11 = 37; continue $sw11;
                }
                case 37: {
                    if (r8.hasNext() == false) { $pc11 = 40; continue $sw11; }
                    try {
                        r2.update(r8.next().getBytes());
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    $pc11 = 40; continue $sw11;
                }
                case 40: {
                    if (r6.we == null) { $pc11 = 42; continue $sw11; }
                    try {
                        r2.update(r6.we.getBytes());
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    $pc11 = 42; continue $sw11;
                }
                case 42: {
                    try {
                        r9 = r6.VH.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    $pc11 = 44; continue $sw11;
                }
                case 44: {
                    if (r9.hasNext() == false) { $pc11 = 46; continue $sw11; }
                    try {
                        r2.update(r9.next().getBytes());
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    { $pc11 = 44; continue $sw11; }
                }
                case 46: {
                    try {
                        r10 = r6.Zo.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    $pc11 = 48; continue $sw11;
                }
                case 48: {
                    if (r10.hasNext() == false) { $pc11 = 15; continue $sw11; }
                    try {
                        r11 = r10.next();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    if (com.aide.engine.EngineSolution.File.DW(r11) == null) { $pc11 = 48; continue $sw11; }
                    if (com.aide.engine.EngineSolution.File.FH(r11) == false) { $pc11 = 48; continue $sw11; }
                    try {
                        r2.update(com.aide.engine.EngineSolution.File.j6(r11).getBytes());
                        r2.update(com.aide.engine.EngineSolution.File.DW(r11).getBytes());
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    { $pc11 = 48; continue $sw11; }
                }
                case 54: {
                    try {
                        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> r12 = this.v5.entrySet().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    $pc11 = 56; continue $sw11;
                }
                case 56: {
                    if (r12.hasNext() == false) { $pc11 = 61; continue $sw11; }
                    try {
                        r13 = r12.next();
                        r2.update(r13.getKey().getBytes());
                        r14 = r13.getValue().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    $pc11 = 59; continue $sw11;
                }
                case 59: {
                    if (r14.hasNext() == false) { $pc11 = 56; continue $sw11; }
                    try {
                        r2.update(r14.next().getBytes());
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    { $pc11 = 59; continue $sw11; }
                }
                case 61: {
                    try {
                        r15 = r2.digest();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    r16 = 0;
                    $pc11 = 63; continue $sw11;
                }
                case 63: {
                    if (r5 >= r15.length) { $pc11 = 65; continue $sw11; }
                    try {
                        r16 = (r16 << 8) ^ ((long) r15[r5]);
                        r5 = r5 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                    { $pc11 = 63; continue $sw11; }
                }
                case 65: {
                    return r16;
                }
                case 67: {
                    try {
                        throw new java.lang.InternalError();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 68; continue $sw11;
                    }
                }
                case 66: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.La r28) {
        abcd.La r6 = null;
        long r4 = 0L;
        long r12 = 0L;
        abcd.La r14 = null;
        java.util.HashMap r0 = null;
        abcd.Interfacela[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        abcd.Interfacela r8 = null;
        java.util.Iterator<com.aide.engine.EngineSolutionProject> r25 = null;
        com.aide.engine.EngineSolutionProject r5 = null;
        int r7 = 0;
        java.lang.String r9 = null;
        java.lang.String r10 = null;
        java.lang.String r11 = null;
        java.lang.String r15 = null;
        java.util.List<java.lang.String> r13 = null;
        java.util.List<java.lang.String> r16 = null;
        java.util.List<java.lang.String> r17 = null;
        java.util.List<java.lang.String> r18 = null;
        java.util.List<java.lang.String> r19 = null;
        java.util.List<java.lang.String> r110 = null;
        java.lang.String r20 = null;
        java.lang.String r21 = null;
        java.lang.String r111 = null;
        java.lang.String r112 = null;
        java.lang.String r113 = null;
        java.lang.String r22 = null;
        java.lang.String r23 = null;
        boolean r24 = false;
        java.util.HashMap r26 = null;
        java.util.Iterator<java.lang.String> r27 = null;
        java.lang.String r29 = null;
        java.util.Iterator<com.aide.engine.EngineSolutionProject> r30 = null;
        int r31 = 0;
        com.aide.engine.EngineSolutionProject r32 = null;
        java.util.Iterator<com.aide.engine.EngineSolution.File> r33 = null;
        com.aide.engine.EngineSolution.File r34 = null;
        abcd.Da r35 = null;
        java.util.HashMap r36 = null;
        abcd.Interfacela r37 = null;
        abcd.Da r38 = null;
        int r114 = 0;
        abcd.Interfacela r39 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r6 = r28;
                    r4 = 3077489901940902155L;
                    $pc12 = 84; continue $sw12;
                }
                case 84: {
                    th = th;
                    r12 = r4;
                    r14 = r6;
                    $pc12 = 87; continue $sw12;
                }
                case 87: {
                    if (DW == false) { $pc12 = 90; continue $sw12; }
                    abcd.wu.j6(th, r12, this, r14);
                    $pc12 = 90; continue $sw12;
                }
                case 90: {
                    throw th;
                }
                case 4: {
                    if (j6 == false) { $pc12 = 6; continue $sw12; }
                    try {
                        abcd.wu.j6(3077489901940902155L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 84; continue $sw12;
                    }
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    try {
                        r28.DW();
                        r0 = new java.util.HashMap();
                        r1 = r28.v5();
                        r2 = r1.length;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 84; continue $sw12;
                    }
                    r3 = 0;
                    $pc12 = 7; continue $sw12;
                }
                case 7: {
                    if (r3 >= r2) { $pc12 = 12; continue $sw12; }
                    try {
                        r8 = r1[r3];
                        r0.put(r8.j6(), r8);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 84; continue $sw12;
                    }
                    if (this.v5.containsKey(r8.j6()) == false) { $pc12 = 11; continue $sw12; }
                    try {
                        r6.j6(r8, this.v5.get(r8.j6()));
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 84; continue $sw12;
                    }
                    $pc12 = 11; continue $sw12;
                }
                case 11: {
                    try {
                        r3 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 84; continue $sw12;
                    }
                    { $pc12 = 7; continue $sw12; }
                }
                case 12: {
                    try {
                        r6.j6(this.Hw);
                        r25 = this.FH.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 84; continue $sw12;
                    }
                    $pc12 = 13; continue $sw12;
                }
                case 13: {
                    if (r25.hasNext() == false) { $pc12 = 83; continue $sw12; }
                    try {
                        r5 = r25.next();
                        r7 = this.FH.indexOf(r5);
                        r9 = r5.u7;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 84; continue $sw12;
                    }
                    if (r9 != null) { $pc12 = 19; continue $sw12; }
                    r10 = "";
                    $pc12 = 20; continue $sw12;
                }
                case 20: {
                    try {
                        r11 = r5.XL;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 84; continue $sw12;
                    }
                    if (r11 != null) { $pc12 = 23; continue $sw12; }
                    r15 = "";
                    $pc12 = 24; continue $sw12;
                }
                case 24: {
                    try {
                        r13 = r5.aM;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 84; continue $sw12;
                    }
                    if (r13 != null) { $pc12 = 27; continue $sw12; }
                    try {
                        r13 = java.util.Collections.EMPTY_LIST;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 84; continue $sw12;
                    }
                    $pc12 = 27; continue $sw12;
                }
                case 27: {
                    r16 = r13;
                    try {
                        r17 = r5.j3;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 84; continue $sw12;
                    }
                    if (r17 != null) { $pc12 = 30; continue $sw12; }
                    try {
                        r17 = java.util.Collections.EMPTY_LIST;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 84; continue $sw12;
                    }
                    $pc12 = 30; continue $sw12;
                }
                case 30: {
                    r18 = r17;
                    try {
                        r19 = r5.Mr;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 84; continue $sw12;
                    }
                    if (r19 != null) { $pc12 = 33; continue $sw12; }
                    try {
                        r19 = java.util.Collections.EMPTY_LIST;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 84; continue $sw12;
                    }
                    $pc12 = 33; continue $sw12;
                }
                case 33: {
                    r110 = r19;
                    try {
                        r20 = r5.we;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 84; continue $sw12;
                    }
                    if (r20 != null) { $pc12 = 36; continue $sw12; }
                    r21 = "";
                    $pc12 = 37; continue $sw12;
                }
                case 37: {
                    try {
                        r111 = r5.FH;
                        r112 = r5.Hw;
                        r113 = r5.v5;
                        r22 = r5.tp;
                        r23 = r5.EQ;
                        r24 = r5.J0;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 84; continue $sw12;
                    }
                    r26 = r0;
                    try {
                        r28.j6(r7, r10, r111, r112, r113, r15, r16, r18, r110, r22, r23, r21, r24, r5.J8, r5.Ws, r5.QX);
                        r27 = r5.VH.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 81; continue $sw12;
                    }
                    $pc12 = 40; continue $sw12;
                }
                case 40: {
                    if (r27.hasNext() == false) { $pc12 = 49; continue $sw12; }
                    try {
                        r29 = r27.next();
                        r30 = this.FH.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 81; continue $sw12;
                    }
                    r31 = -1;
                    $pc12 = 43; continue $sw12;
                }
                case 43: {
                    if (r30.hasNext() == false) { $pc12 = 47; continue $sw12; }
                    try {
                        r32 = r30.next();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 81; continue $sw12;
                    }
                    if (r32.FH.equals(r29) == false) { $pc12 = 43; continue $sw12; }
                    try {
                        r31 = this.FH.indexOf(r32);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 81; continue $sw12;
                    }
                    { $pc12 = 43; continue $sw12; }
                }
                case 47: {
                    if (r31 == (-1)) { $pc12 = 40; continue $sw12; }
                    try {
                        r6.j6(r7, r31);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 81; continue $sw12;
                    }
                    { $pc12 = 40; continue $sw12; }
                }
                case 49: {
                    try {
                        r33 = r5.Zo.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 81; continue $sw12;
                    }
                    $pc12 = 51; continue $sw12;
                }
                case 51: {
                    if (r33.hasNext() == false) { $pc12 = 80; continue $sw12; }
                    try {
                        r34 = r33.next();
                        r35 = r6.Mr.DW(com.aide.engine.EngineSolution.File.j6(r34));
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 81; continue $sw12;
                    }
                    if (com.aide.engine.EngineSolution.File.DW(r34) == null) { $pc12 = 64; continue $sw12; }
                    r36 = r26;
                    if (r36.containsKey(com.aide.engine.EngineSolution.File.DW(r34)) == false) { $pc12 = 66; continue $sw12; }
                    try {
                        r37 = (abcd.Interfacela) r36.get(com.aide.engine.EngineSolution.File.DW(r34));
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 81; continue $sw12;
                    }
                    if (r37.gn() == false) { $pc12 = 66; continue $sw12; }
                    r38 = r35;
                    $pc12 = 60; continue $sw12;
                }
                case 60: {
                    if (r38.vy() == true) { $pc12 = 66; continue $sw12; }
                    if (new java.io.File(r38.XL()).isDirectory() == true) { $pc12 = 66; continue $sw12; }
                    try {
                        r6.j6(r38, r37);
                        r38 = r38.QX();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 81; continue $sw12;
                    }
                    $pc12 = 66; continue $sw12;
                }
                case 66: {
                    if (com.aide.engine.EngineSolution.File.Hw(r34) == false) { $pc12 = 69; continue $sw12; }
                    try {
                        r6.j6(r35, r7, com.aide.engine.EngineSolution.File.v5(r34));
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 81; continue $sw12;
                    }
                    $pc12 = 69; continue $sw12;
                }
                case 69: {
                    if (com.aide.engine.EngineSolution.File.DW(r34) != null) { $pc12 = 71; continue $sw12; }
                    $pc12 = 78; continue $sw12;
                }
                case 78: {
                    r114 = r7;
                    r14 = r6;
                    $pc12 = 79; continue $sw12;
                }
                case 79: {
                    r26 = r36;
                    r7 = r114;
                    r5 = r5;
                    r6 = r14;
                    { $pc12 = 51; continue $sw12; }
                }
                case 71: {
                    if (r36.containsKey(com.aide.engine.EngineSolution.File.DW(r34)) == false) { $pc12 = 78; continue $sw12; }
                    try {
                        r39 = (abcd.Interfacela) r36.get(com.aide.engine.EngineSolution.File.DW(r34));
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 81; continue $sw12;
                    }
                    r114 = r7;
                    r12 = 3077489901940902155L;
                    r14 = r6;
                    try {
                        j6(r28, r35, r5.gn, r114, r39);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 76; continue $sw12;
                    }
                    $pc12 = 76; continue $sw12;
                }
                case 76: {
                    th = th;
                    { $pc12 = 87; continue $sw12; }
                }
                case 64: {
                    r36 = r26;
                    { $pc12 = 66; continue $sw12; }
                }
                case 80: {
                    r0 = r26;
                    r4 = 3077489901940902155L;
                    $pc12 = 81; continue $sw12;
                }
                case 81: {
                    th = th;
                    r14 = r6;
                    r12 = 3077489901940902155L;
                    { $pc12 = 87; continue $sw12; }
                }
                case 36: {
                    r21 = r20;
                    { $pc12 = 37; continue $sw12; }
                }
                case 23: {
                    r15 = r11;
                    { $pc12 = 24; continue $sw12; }
                }
                case 19: {
                    r10 = r9;
                    { $pc12 = 20; continue $sw12; }
                }
                case 83: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(com.aide.engine.EngineSolutionProject r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 8: {
                    th = $ex13;
                    if (DW == false) { $pc13 = 12; continue $sw13; }
                    abcd.wu.j6(th, -1706030434508833875L, this, r5);
                    $pc13 = 12; continue $sw13;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc13 = 6; continue $sw13; }
                    try {
                        abcd.wu.j6(-1706030434508833875L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 8; continue $sw13;
                    }
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    try {
                        this.FH.add(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 8; continue $sw13;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.String r3 = null;
        java.util.Iterator<com.aide.engine.EngineSolutionProject> r4 = null;
        com.aide.engine.EngineSolutionProject r5 = null;
        java.lang.String r6 = null;
        java.util.Iterator<java.lang.String> r7 = null;
        java.util.Iterator<com.aide.engine.EngineSolution.File> r8 = null;
        com.aide.engine.EngineSolution.File r9 = null;
        java.lang.String r10 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 29: {
                    th = $ex14;
                    if (DW == false) { $pc14 = 34; continue $sw14; }
                    abcd.wu.j6(th, -118687420064916427L, this);
                    $pc14 = 34; continue $sw14;
                }
                case 34: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc14 = 6; continue $sw14; }
                    try {
                        abcd.wu.j6(-118687420064916427L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    r3 = "";
                    try {
                        r4 = this.FH.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    $pc14 = 7; continue $sw14;
                }
                case 7: {
                    if (r4.hasNext() == false) { $pc14 = 28; continue $sw14; }
                    try {
                        r5 = r4.next();
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    if (r5.Hw == null) { $pc14 = 13; continue $sw14; }
                    try {
                        r6 = r3 + "Assembly " + r5.FH + " (" + r5.Hw + "), checked " + r5.gn + "\n";
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    $pc14 = 14; continue $sw14;
                }
                case 14: {
                    try {
                        r7 = r5.VH.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    $pc14 = 16; continue $sw14;
                }
                case 16: {
                    if (r7.hasNext() == false) { $pc14 = 18; continue $sw14; }
                    try {
                        r6 = r6 + "References " + r7.next() + "\n";
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    { $pc14 = 16; continue $sw14; }
                }
                case 18: {
                    try {
                        r8 = r5.Zo.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    $pc14 = 20; continue $sw14;
                }
                case 20: {
                    if (r8.hasNext() == false) { $pc14 = 26; continue $sw14; }
                    try {
                        r9 = r8.next();
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    if (com.aide.engine.EngineSolution.File.DW(r9) != null) { $pc14 = 24; continue $sw14; }
                    r10 = "(no plugin)";
                    $pc14 = 25; continue $sw14;
                }
                case 25: {
                    try {
                        r6 = (r6 + com.aide.engine.EngineSolution.File.j6(r9) + " " + r10 + " ") + "\n";
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    { $pc14 = 20; continue $sw14; }
                }
                case 24: {
                    try {
                        r10 = com.aide.engine.EngineSolution.File.DW(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    { $pc14 = 25; continue $sw14; }
                }
                case 26: {
                    try {
                        r3 = r6 + "\n";
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    { $pc14 = 7; continue $sw14; }
                }
                case 13: {
                    try {
                        r6 = r3 + "Assembly " + r5.FH + ", checked " + r5.gn + "\n";
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 29; continue $sw14;
                    }
                    { $pc14 = 14; continue $sw14; }
                }
                case 28: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void writeToParcel(android.os.Parcel r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 3;
        $sw15: while (true) {
            switch ($pc15) {
                case 7: {
                    th = $ex15;
                    if (DW == false) { $pc15 = 11; continue $sw15; }
                    abcd.wu.j6(th, -621781705076080373L, this, r8, new java.lang.Integer(r9));
                    $pc15 = 11; continue $sw15;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc15 = 5; continue $sw15; }
                    try {
                        abcd.wu.j6(-621781705076080373L, this, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 7; continue $sw15;
                    }
                    $pc15 = 5; continue $sw15;
                }
                case 5: {
                    try {
                        r8.writeString(this.Hw);
                        r8.writeMap(this.v5);
                        r8.writeList(this.Zo);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 7; continue $sw15;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
