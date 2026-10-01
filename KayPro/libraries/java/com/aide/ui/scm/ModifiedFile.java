package com.aide.ui.scm;

@abcd.Interfacexu
public class ModifiedFile implements android.os.Parcelable, com.aide.ui.scm.Interfacef {
    public static final android.os.Parcelable.Creator<com.aide.ui.scm.ModifiedFile> CREATOR = null;

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public final java.lang.String FH;
    public final int Hw;

    static {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        abcd.wu.j6(com.aide.ui.scm.ModifiedFile.class, -3685332166428264928L, -3685332166428264928L);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-2127181596935992395L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        CREATOR = new com.aide.ui.scm.ya();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -2127181596935992395L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public ModifiedFile(android.os.Parcel r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, -832904971195898640L, null, r6);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-832904971195898640L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        this.Hw = r6.readInt();
                        this.FH = r6.readString();
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

    public ModifiedFile(java.lang.String r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 7: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 11; continue $sw2; }
                    abcd.wu.j6(th, -2713532887566778283L, null, r8, new java.lang.Integer(r9));
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(-2713532887566778283L, null, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        this.FH = r8;
                        this.Hw = r9;
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

    public boolean DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 12: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 16; continue $sw3; }
                    abcd.wu.j6(th, 1699161796823953605L, this);
                    $pc3 = 16; continue $sw3;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(1699161796823953605L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 12; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    if ((this.Hw & 1) != 0) { $pc3 = 19; continue $sw3; }
                    return false;
                }
                case 19: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean FH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 12: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 16; continue $sw4; }
                    abcd.wu.j6(th, 2341259825944939177L, this);
                    $pc4 = 16; continue $sw4;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(2341259825944939177L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 12; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if ((this.Hw & 2) == 0) { $pc4 = 10; continue $sw4; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean Hw() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 12: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 16; continue $sw5; }
                    abcd.wu.j6(th, -2412247080641203701L, this);
                    $pc5 = 16; continue $sw5;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-2412247080641203701L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 12; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    if ((this.Hw & 64) == 0) { $pc5 = 10; continue $sw5; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean VH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 12: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 16; continue $sw6; }
                    abcd.wu.j6(th, -1244044106580671643L, this);
                    $pc6 = 16; continue $sw6;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(-1244044106580671643L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 12; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    if ((this.Hw & 4) == 0) { $pc6 = 10; continue $sw6; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean Zo() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 12: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 16; continue $sw7; }
                    abcd.wu.j6(th, 3494945443422642688L, this);
                    $pc7 = 16; continue $sw7;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(3494945443422642688L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 12; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    if ((this.Hw & 16) == 0) { $pc7 = 10; continue $sw7; }
                    return true;
                }
                case 10: {
                    return false;
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
                    abcd.wu.j6(th, 2766844239460399812L, this);
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc8 = 15; continue $sw8; }
                    try {
                        abcd.wu.j6(2766844239460399812L, this);
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

    public boolean gn() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 12: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 16; continue $sw9; }
                    abcd.wu.j6(th, 526371838696924160L, this);
                    $pc9 = 16; continue $sw9;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(526371838696924160L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 12; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    if ((this.Hw & 32) == 0) { $pc9 = 10; continue $sw9; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String j6() {
        java.lang.StringBuilder r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 32: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 36; continue $sw10; }
                    abcd.wu.j6(th, -3135486143350736176L, this);
                    $pc10 = 36; continue $sw10;
                }
                case 36: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc10 = 6; continue $sw10; }
                    try {
                        abcd.wu.j6(-3135486143350736176L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 32; continue $sw10;
                    }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    try {
                        r2 = new java.lang.StringBuilder();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 32; continue $sw10;
                    }
                    if (DW() == false) { $pc10 = 10; continue $sw10; }
                    try {
                        r2.append("added, ");
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 32; continue $sw10;
                    }
                    $pc10 = 10; continue $sw10;
                }
                case 10: {
                    if (FH() == false) { $pc10 = 13; continue $sw10; }
                    try {
                        r2.append("changed, ");
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 32; continue $sw10;
                    }
                    $pc10 = 13; continue $sw10;
                }
                case 13: {
                    if (VH() == false) { $pc10 = 16; continue $sw10; }
                    try {
                        r2.append("removed, ");
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 32; continue $sw10;
                    }
                    $pc10 = 16; continue $sw10;
                }
                case 16: {
                    if (v5() == false) { $pc10 = 19; continue $sw10; }
                    try {
                        r2.append("missing, ");
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 32; continue $sw10;
                    }
                    $pc10 = 19; continue $sw10;
                }
                case 19: {
                    if (Zo() == false) { $pc10 = 22; continue $sw10; }
                    try {
                        r2.append("modified, ");
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 32; continue $sw10;
                    }
                    $pc10 = 22; continue $sw10;
                }
                case 22: {
                    if (gn() == false) { $pc10 = 25; continue $sw10; }
                    try {
                        r2.append("untracked, ");
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 32; continue $sw10;
                    }
                    $pc10 = 25; continue $sw10;
                }
                case 25: {
                    if (Hw() == false) { $pc10 = 28; continue $sw10; }
                    try {
                        r2.append("conflicting, ");
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 32; continue $sw10;
                    }
                    $pc10 = 28; continue $sw10;
                }
                case 28: {
                    if (r2.length() == 0) { $pc10 = 30; continue $sw10; }
                    try {
                        r2.setLength(r2.length() - 2);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 32; continue $sw10;
                    }
                    $pc10 = 30; continue $sw10;
                }
                case 30: {
                    return r2.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean v5() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 4;
        $sw11: while (true) {
            switch ($pc11) {
                case 12: {
                    th = $ex11;
                    if (DW == false) { $pc11 = 16; continue $sw11; }
                    abcd.wu.j6(th, -2530485829208135817L, this);
                    $pc11 = 16; continue $sw11;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc11 = 6; continue $sw11; }
                    try {
                        abcd.wu.j6(-2530485829208135817L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 12; continue $sw11;
                    }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    if ((this.Hw & 8) == 0) { $pc11 = 10; continue $sw11; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void writeToParcel(android.os.Parcel r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 3;
        $sw12: while (true) {
            switch ($pc12) {
                case 7: {
                    th = $ex12;
                    if (DW == false) { $pc12 = 11; continue $sw12; }
                    abcd.wu.j6(th, -2584402057559894879L, this, r8, new java.lang.Integer(r9));
                    $pc12 = 11; continue $sw12;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc12 = 5; continue $sw12; }
                    try {
                        abcd.wu.j6(-2584402057559894879L, this, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 7; continue $sw12;
                    }
                    $pc12 = 5; continue $sw12;
                }
                case 5: {
                    try {
                        r8.writeInt(this.Hw);
                        r8.writeString(this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 7; continue $sw12;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
