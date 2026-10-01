package com.aide.engine;

@abcd.Interfacexu
public class FindResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.aide.engine.FindResult> CREATOR = null;

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public java.lang.String FH;
    public int Hw;
    public java.lang.String VH;
    public int Zo;
    public java.util.List<com.aide.engine.FindResult.Highlighting> gn;
    public int v5;

    @abcd.Interfacexu
    public static class Highlighting implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.aide.engine.FindResult.Highlighting> CREATOR = null;

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;
        public int FH;
        public int Hw;
        public com.aide.engine.Enumm VH;
        public int Zo;
        public int v5;

        static {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        try {
                            abcd.wu.j6(com.aide.engine.FindResult.Highlighting.class, 778079600968353600L, 778079600968353600L);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 8; continue $sw0;
                        }
                        if (j6 == false) { $pc0 = 6; continue $sw0; }
                        try {
                            abcd.wu.j6(805180888632971456L, null);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 8; continue $sw0;
                        }
                        $pc0 = 6; continue $sw0;
                    }
                    case 6: {
                        try {
                            CREATOR = new com.aide.engine.ClassL();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 8; continue $sw0;
                        }
                        return;
                    }
                    case 8: {
                        th = $ex0;
                        if (DW == false) { $pc0 = 12; continue $sw0; }
                        abcd.wu.j6(th, 805180888632971456L, null);
                        $pc0 = 12; continue $sw0;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public Highlighting(android.os.Parcel r6) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 4;
            $sw1: while (true) {
                switch ($pc1) {
                    case 8: {
                        th = $ex1;
                        if (DW == false) { $pc1 = 12; continue $sw1; }
                        abcd.wu.j6(th, -1293378443263631312L, null, r6);
                        $pc1 = 12; continue $sw1;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc1 = 6; continue $sw1; }
                        try {
                            abcd.wu.j6(-1293378443263631312L, null, r6);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 8; continue $sw1;
                        }
                        $pc1 = 6; continue $sw1;
                    }
                    case 6: {
                        try {
                            this.FH = r6.readInt();
                            this.Hw = r6.readInt();
                            this.v5 = r6.readInt();
                            this.Zo = r6.readInt();
                            this.VH = com.aide.engine.Enumm.values()[r6.readInt()];
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 8; continue $sw1;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public Highlighting(com.aide.engine.Enumm r11, int r12, int r13, int r14, int r15) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = 3;
            $sw2: while (true) {
                switch ($pc2) {
                    case 7: {
                        th = $ex2;
                        if (DW == false) { $pc2 = 11; continue $sw2; }
                        abcd.wu.j6(th, -821666881222878387L, null, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                        $pc2 = 11; continue $sw2;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc2 = 5; continue $sw2; }
                        try {
                            abcd.wu.j6(-821666881222878387L, null, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 7; continue $sw2;
                        }
                        $pc2 = 5; continue $sw2;
                    }
                    case 5: {
                        try {
                            this.VH = r11;
                            this.FH = r12;
                            this.Hw = r13;
                            this.v5 = r14;
                            this.Zo = r15;
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
                        abcd.wu.j6(th, 2589123821387588315L, this);
                        $pc3 = 12; continue $sw3;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc3 = 15; continue $sw3; }
                        try {
                            abcd.wu.j6(2589123821387588315L, this);
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
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = 3;
            $sw4: while (true) {
                switch ($pc4) {
                    case 7: {
                        th = $ex4;
                        if (DW == false) { $pc4 = 11; continue $sw4; }
                        abcd.wu.j6(th, -82214321625205200L, this, r8, new java.lang.Integer(r9));
                        $pc4 = 11; continue $sw4;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc4 = 5; continue $sw4; }
                        try {
                            abcd.wu.j6(-82214321625205200L, this, r8, new java.lang.Integer(r9));
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 7; continue $sw4;
                        }
                        $pc4 = 5; continue $sw4;
                    }
                    case 5: {
                        try {
                            r8.writeInt(this.FH);
                            r8.writeInt(this.Hw);
                            r8.writeInt(this.v5);
                            r8.writeInt(this.Zo);
                            r8.writeInt(this.VH.ordinal());
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 7; continue $sw4;
                        }
                        return;
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
                        abcd.wu.j6(com.aide.engine.FindResult.class, 4131636004103659128L, 4131636004103659128L);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    if (j6 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(308728099723557815L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    try {
                        CREATOR = new com.aide.engine.ClassK();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    return;
                }
                case 8: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, 308728099723557815L, null);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public FindResult(android.os.Parcel r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, 181932431539894617L, null, r6);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(181932431539894617L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        this.FH = r6.readString();
                        this.Hw = r6.readInt();
                        this.v5 = r6.readInt();
                        this.Zo = r6.readInt();
                        this.VH = r6.readString();
                        this.gn = new java.util.ArrayList();
                        r6.readList(this.gn, getClass().getClassLoader());
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

    public FindResult(java.lang.String r7, java.lang.String r8, java.util.List<com.aide.engine.FindResult.Highlighting> r9, int r10, int r11, int r12) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (j6 == false) { $pc7 = 5; continue $sw7; }
                    abcd.wu.j6(4681215780995063664L, null, new java.lang.Object[]{r7, r8, r9, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12)});
                    $pc7 = 5; continue $sw7;
                }
                case 5: {
                    this.gn = r9;
                    this.FH = r7;
                    this.VH = r8;
                    this.Hw = r10;
                    this.v5 = r11;
                    this.Zo = r12;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int describeContents() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 8: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 12; continue $sw8; }
                    abcd.wu.j6(th, -70955149361103960L, this);
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc8 = 15; continue $sw8; }
                    try {
                        abcd.wu.j6(-70955149361103960L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 3;
        $sw9: while (true) {
            switch ($pc9) {
                case 7: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 11; continue $sw9; }
                    abcd.wu.j6(th, 388349969111946051L, this, r8, new java.lang.Integer(r9));
                    $pc9 = 11; continue $sw9;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc9 = 5; continue $sw9; }
                    try {
                        abcd.wu.j6(388349969111946051L, this, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 7; continue $sw9;
                    }
                    $pc9 = 5; continue $sw9;
                }
                case 5: {
                    try {
                        r8.writeString(this.FH);
                        r8.writeInt(this.Hw);
                        r8.writeInt(this.v5);
                        r8.writeInt(this.Zo);
                        r8.writeString(this.VH);
                        r8.writeList(this.gn);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 7; continue $sw9;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
