package com.aide.common;

@abcd.Interfacexu
public class UndoManager {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -3741163752241171333L)
    private java.util.Stack<com.aide.common.UndoManager.Change> FH;

    @abcd.Interfaceru(field = 848776193189042559L)
    private java.util.Stack<com.aide.common.UndoManager.Change> Hw;

    @abcd.Interfaceru(field = 2159268741301985208L)
    private java.util.List<com.aide.common.UndoManager.a> v5;

    @abcd.Interfacexu
    private static class Change implements android.os.Parcelable {

        @abcd.Interfaceru(field = -1852108972899249685L)
        public static final android.os.Parcelable.Creator<com.aide.common.UndoManager.Change> CREATOR = null;

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = -2900198444050481952L)
        public java.lang.String FH;

        @abcd.Interfaceru(field = -38503772974051616L)
        public java.lang.String Hw;

        @abcd.Interfaceru(field = 2658837491522325253L)
        public int v5;

        static {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        try {
                            abcd.wu.j6(com.aide.common.UndoManager.Change.class, -3939864719947814112L, -3939864719947814112L);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 8; continue $sw0;
                        }
                        if (j6 == false) { $pc0 = 6; continue $sw0; }
                        try {
                            abcd.wu.j6(1306105219292752593L, null);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 8; continue $sw0;
                        }
                        $pc0 = 6; continue $sw0;
                    }
                    case 6: {
                        try {
                            CREATOR = new com.aide.common._a();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 8; continue $sw0;
                        }
                        return;
                    }
                    case 8: {
                        th = $ex0;
                        if (DW == false) { $pc0 = 12; continue $sw0; }
                        abcd.wu.j6(th, 1306105219292752593L, null);
                        $pc0 = 12; continue $sw0;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = -206820081837883096L)
        public Change(android.os.Parcel r7) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 4;
            $sw1: while (true) {
                switch ($pc1) {
                    case 8: {
                        th = $ex1;
                        if (DW == false) { $pc1 = 12; continue $sw1; }
                        abcd.wu.j6(th, -1587993151461272849L, null, r7);
                        $pc1 = 12; continue $sw1;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc1 = 6; continue $sw1; }
                        try {
                            abcd.wu.j6(-1587993151461272849L, null, r7);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 8; continue $sw1;
                        }
                        $pc1 = 6; continue $sw1;
                    }
                    case 6: {
                        try {
                            this(r7.readString(), r7.readString(), r7.readInt());
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

        @abcd.Interfacesu(method = 470051140639841199L)
        public Change(java.lang.String r9, java.lang.String r10, int r11) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = 3;
            $sw2: while (true) {
                switch ($pc2) {
                    case 7: {
                        th = $ex2;
                        if (DW == false) { $pc2 = 11; continue $sw2; }
                        abcd.wu.j6(th, 322067234983942444L, null, r9, r10, new java.lang.Integer(r11));
                        $pc2 = 11; continue $sw2;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc2 = 5; continue $sw2; }
                        try {
                            abcd.wu.j6(322067234983942444L, null, r9, r10, new java.lang.Integer(r11));
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 7; continue $sw2;
                        }
                        $pc2 = 5; continue $sw2;
                    }
                    case 5: {
                        try {
                            this.FH = r9;
                            this.Hw = r10;
                            this.v5 = r11;
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
        @abcd.Interfacesu(method = 2272687715882419935L)
        public int describeContents() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = 4;
            $sw3: while (true) {
                switch ($pc3) {
                    case 8: {
                        th = $ex3;
                        if (DW == false) { $pc3 = 12; continue $sw3; }
                        abcd.wu.j6(th, -5364907973463609908L, this);
                        $pc3 = 12; continue $sw3;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc3 = 15; continue $sw3; }
                        try {
                            abcd.wu.j6(-5364907973463609908L, this);
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
        @abcd.Interfacesu(method = 1404192200456920112L)
        public void writeToParcel(android.os.Parcel r8, int r9) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = 3;
            $sw4: while (true) {
                switch ($pc4) {
                    case 7: {
                        th = $ex4;
                        if (DW == false) { $pc4 = 11; continue $sw4; }
                        abcd.wu.j6(th, 411343048803299725L, this, r8, new java.lang.Integer(r9));
                        $pc4 = 11; continue $sw4;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc4 = 5; continue $sw4; }
                        try {
                            abcd.wu.j6(411343048803299725L, this, r8, new java.lang.Integer(r9));
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 7; continue $sw4;
                        }
                        $pc4 = 5; continue $sw4;
                    }
                    case 5: {
                        try {
                            r8.writeString(this.FH);
                            r8.writeString(this.Hw);
                            r8.writeInt(this.v5);
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

    public interface a {
        void DW();

        void j6(java.lang.String r1, java.lang.String r2, int r3);
    }

    static {
        abcd.wu.j6(com.aide.common.UndoManager.class, -1448330021796408100L, -1448330021796408100L);
    }

    public UndoManager() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, 3687910594584982755L, null);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(3687910594584982755L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    try {
                        this.FH = new java.util.Stack();
                        this.Hw = new java.util.Stack();
                        this.v5 = new java.util.ArrayList();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1916791605002349257L)
    private java.lang.String j6(java.lang.String r5) {
        int r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 15: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 20; continue $sw6; }
                    abcd.wu.j6(th, 845527716254720367L, this, r5);
                    $pc6 = 20; continue $sw6;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(845527716254720367L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 15; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        r2 = this.FH.size() - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 15; continue $sw6;
                    }
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    if (r2 < 0) { $pc6 = 13; continue $sw6; }
                    if (this.FH.get(r2).FH.equals(r5) == true) { $pc6 = 10; continue $sw6; }
                    try {
                        r2 = r2 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 15; continue $sw6;
                    }
                    { $pc6 = 7; continue $sw6; }
                }
                case 10: {
                    try {
                        r5 = this.FH.get(r2).Hw;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 15; continue $sw6;
                    }
                    return r5;
                }
                case 13: {
                    return "";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -968731425726789392L)
    private void j6(com.aide.common.UndoManager.Change r8) {
        java.util.Iterator<com.aide.common.UndoManager.a> r2 = null;
        com.aide.common.UndoManager.a r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 12: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 17; continue $sw7; }
                    abcd.wu.j6(th, -3429191467663332592L, this, r8);
                    $pc7 = 17; continue $sw7;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(-3429191467663332592L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 12; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    try {
                        r2 = this.v5.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 12; continue $sw7;
                    }
                    $pc7 = 7; continue $sw7;
                }
                case 7: {
                    if (r2.hasNext() == false) { $pc7 = 11; continue $sw7; }
                    try {
                        r3 = r2.next();
                        r3.DW();
                        r3.j6(r8.FH, j6(r8.FH), r8.v5);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 12; continue $sw7;
                    }
                    { $pc7 = 7; continue $sw7; }
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 113770261290318255L)
    private void v5() {
        java.util.Iterator<com.aide.common.UndoManager.a> r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 12: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 17; continue $sw8; }
                    abcd.wu.j6(th, -151464885855749865L, this);
                    $pc8 = 17; continue $sw8;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(-151464885855749865L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 12; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    try {
                        r2 = this.v5.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 12; continue $sw8;
                    }
                    $pc8 = 7; continue $sw8;
                }
                case 7: {
                    if (r2.hasNext() == false) { $pc8 = 11; continue $sw8; }
                    try {
                        r2.next().DW();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 12; continue $sw8;
                    }
                    { $pc8 = 7; continue $sw8; }
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(android.os.Bundle r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 8: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 12; continue $sw9; }
                    abcd.wu.j6(th, 4490399858109587205L, this, r6);
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(4490399858109587205L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    try {
                        r6.putParcelableArrayList("undo", new java.util.ArrayList(this.FH));
                        r6.putParcelableArrayList("redo", new java.util.ArrayList(this.Hw));
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(com.aide.common.UndoManager.a r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 8: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 12; continue $sw10; }
                    abcd.wu.j6(th, -1185633639697176747L, this, r5);
                    $pc10 = 12; continue $sw10;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc10 = 6; continue $sw10; }
                    try {
                        abcd.wu.j6(-1185633639697176747L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    try {
                        this.v5.remove(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(java.lang.String r9, java.lang.String r10, int r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 3;
        $sw11: while (true) {
            switch ($pc11) {
                case 8: {
                    th = $ex11;
                    if (DW == false) { $pc11 = 12; continue $sw11; }
                    abcd.wu.j6(th, -1274582641144818576L, this, r9, r10, new java.lang.Integer(r11));
                    $pc11 = 12; continue $sw11;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc11 = 5; continue $sw11; }
                    try {
                        abcd.wu.j6(-1274582641144818576L, this, r9, r10, new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    $pc11 = 5; continue $sw11;
                }
                case 5: {
                    if (r9 == null) { $pc11 = 15; continue $sw11; }
                    try {
                        this.Hw.clear();
                        this.FH.push(new com.aide.common.UndoManager.Change(r9, r10, r11));
                        v5();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    return;
                }
                case 15: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean DW() {
        java.util.HashSet r2 = null;
        int r3 = 0;
        java.lang.String r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 4;
        $sw12: while (true) {
            switch ($pc12) {
                case 15: {
                    th = $ex12;
                    if (DW == false) { $pc12 = 20; continue $sw12; }
                    abcd.wu.j6(th, 1830752858474875648L, this);
                    $pc12 = 20; continue $sw12;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc12 = 6; continue $sw12; }
                    try {
                        abcd.wu.j6(1830752858474875648L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 15; continue $sw12;
                    }
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    try {
                        r2 = new java.util.HashSet();
                        r3 = this.FH.size() - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 15; continue $sw12;
                    }
                    $pc12 = 7; continue $sw12;
                }
                case 7: {
                    if (r3 < 0) { $pc12 = 13; continue $sw12; }
                    try {
                        r5 = this.FH.get(r3).FH;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 15; continue $sw12;
                    }
                    if (r2.contains(r5) == true) { $pc12 = 10; continue $sw12; }
                    try {
                        r2.add(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 15; continue $sw12;
                    }
                    r3 = r3 - 1;
                    { $pc12 = 7; continue $sw12; }
                }
                case 10: {
                    return true;
                }
                case 13: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH() {
        com.aide.common.UndoManager.Change r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 8: {
                    th = $ex13;
                    if (DW == false) { $pc13 = 12; continue $sw13; }
                    abcd.wu.j6(th, -1835590263964797056L, this);
                    $pc13 = 12; continue $sw13;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc13 = 6; continue $sw13; }
                    try {
                        abcd.wu.j6(-1835590263964797056L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 8; continue $sw13;
                    }
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    try {
                        r2 = this.Hw.pop();
                        this.FH.push(r2);
                        j6(r2);
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

    public void Hw() {
        com.aide.common.UndoManager.Change r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 8: {
                    th = $ex14;
                    if (DW == false) { $pc14 = 12; continue $sw14; }
                    abcd.wu.j6(th, -1835745965886851060L, this);
                    $pc14 = 12; continue $sw14;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc14 = 6; continue $sw14; }
                    try {
                        abcd.wu.j6(-1835745965886851060L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 8; continue $sw14;
                    }
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    try {
                        r2 = this.FH.pop();
                        this.Hw.push(r2);
                        j6(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 8; continue $sw14;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(android.os.Bundle r5) {
        java.util.ArrayList r2 = null;
        java.util.ArrayList r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 4;
        $sw15: while (true) {
            switch ($pc15) {
                case 13: {
                    th = $ex15;
                    if (DW == false) { $pc15 = 17; continue $sw15; }
                    abcd.wu.j6(th, 5809451549120746528L, this, r5);
                    $pc15 = 17; continue $sw15;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc15 = 6; continue $sw15; }
                    try {
                        abcd.wu.j6(5809451549120746528L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 13; continue $sw15;
                    }
                    $pc15 = 6; continue $sw15;
                }
                case 6: {
                    try {
                        this.FH.clear();
                        r2 = r5.getParcelableArrayList("undo");
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 13; continue $sw15;
                    }
                    if (r2 == null) { $pc15 = 9; continue $sw15; }
                    try {
                        this.FH.addAll(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 13; continue $sw15;
                    }
                    $pc15 = 9; continue $sw15;
                }
                case 9: {
                    try {
                        this.Hw.clear();
                        r3 = r5.getParcelableArrayList("redo");
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 13; continue $sw15;
                    }
                    if (r3 == null) { $pc15 = 20; continue $sw15; }
                    try {
                        this.Hw.addAll(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 13; continue $sw15;
                    }
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(com.aide.common.UndoManager.a r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 4;
        $sw16: while (true) {
            switch ($pc16) {
                case 8: {
                    th = $ex16;
                    if (DW == false) { $pc16 = 12; continue $sw16; }
                    abcd.wu.j6(th, 1266516184012427776L, this, r5);
                    $pc16 = 12; continue $sw16;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc16 = 6; continue $sw16; }
                    try {
                        abcd.wu.j6(1266516184012427776L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 8; continue $sw16;
                    }
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    try {
                        this.v5.add(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 8; continue $sw16;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r9, java.lang.String r10, int r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = 3;
        $sw17: while (true) {
            switch ($pc17) {
                case 10: {
                    th = $ex17;
                    if (DW == false) { $pc17 = 14; continue $sw17; }
                    abcd.wu.j6(th, -173016216841515021L, this, r9, r10, new java.lang.Integer(r11));
                    $pc17 = 14; continue $sw17;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc17 = 5; continue $sw17; }
                    try {
                        abcd.wu.j6(-173016216841515021L, this, r9, r10, new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 10; continue $sw17;
                    }
                    $pc17 = 5; continue $sw17;
                }
                case 5: {
                    if (r9 != null) { $pc17 = 7; continue $sw17; }
                    return;
                }
                case 7: {
                    if (r10.equals(j6(r9)) == true) { $pc17 = 18; continue $sw17; }
                    try {
                        this.Hw.clear();
                        this.FH.push(new com.aide.common.UndoManager.Change(r9, r10, r11));
                        v5();
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 10; continue $sw17;
                    }
                    return;
                }
                case 18: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = 4;
        $sw18: while (true) {
            switch ($pc18) {
                case 11: {
                    th = $ex18;
                    if (DW == false) { $pc18 = 15; continue $sw18; }
                    abcd.wu.j6(th, 1823030156117842840L, this);
                    $pc18 = 15; continue $sw18;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc18 = 6; continue $sw18; }
                    try {
                        abcd.wu.j6(1823030156117842840L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 11; continue $sw18;
                    }
                    $pc18 = 6; continue $sw18;
                }
                case 6: {
                    if (this.Hw.size() <= 0) { $pc18 = 9; continue $sw18; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
