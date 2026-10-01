package abcd;

@abcd.Interfacexu
public class Nk {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 3341818493184479973L)
    private java.util.Map<java.lang.String, abcd.Nk.a> FH;

    @abcd.Interfaceru(field = -1878127403064568543L)
    private java.util.Map<java.lang.String, java.lang.Long> Hw;

    @abcd.Interfaceru(field = 4284879620496039600L)
    private java.util.List<abcd.Nk.c> VH;

    @abcd.Interfaceru(field = -4058998535535812919L)
    private java.lang.String Zo;

    @abcd.Interfaceru(field = -1689585117634895104L)
    private abcd.Nk.b v5;

    public interface a {
        void DW(int r1, int r2, int r3, int r4, int r5, int r6);

        void DW(com.aide.engine.FileHighlightings r1);

        boolean Hw();

        boolean J0();

        java.util.List<java.lang.String> VH();

        java.lang.String Ws();

        void close();

        long getVersion();

        void gn();

        void j6();

        void j6(int r1, int r2);

        void j6(int r1, int r2, int r3, int r4, int r5, int r6);

        void j6(int r1, int r2, int r3, int r4, java.lang.String r5, boolean r6, boolean r7);

        void j6(com.aide.engine.FileHighlightings r1);

        void j6(com.aide.engine.I r1);

        void j6(java.lang.String r1);

        boolean we();
    }

    public interface b {
        void DW(java.lang.String r1);

        abcd.Nk.a FH(java.lang.String r1);

        java.lang.String getVisibleFile();

        void j6(java.lang.String r1);
    }

    public interface c {
        void j6(com.aide.engine.FileHighlightings r1);
    }

    static {
        abcd.wu.j6(abcd.Nk.class, -87904726456966265L, -87904726456966265L);
    }

    public Nk() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -1338968642929473196L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-1338968642929473196L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.FH = new java.util.LinkedHashMap();
                        this.Hw = new java.util.HashMap();
                        this.VH = new java.util.ArrayList();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1778526216650971260L)
    private void DW(java.lang.String r8, abcd.Nk.a r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, 1352180520473043677L, this, r8, r9);
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(1352180520473043677L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        com.aide.ui.U.EQ().j6(r8, new abcd.BinderMk(this, r9));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -7147144284661230064L)
    private void EQ(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 10: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 14; continue $sw2; }
                    abcd.wu.j6(th, -197953105390214241L, this, r5);
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 7; continue $sw2; }
                    try {
                        abcd.wu.j6(-197953105390214241L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 10; continue $sw2;
                    }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (FH(r5) == true) { $pc2 = 17; continue $sw2; }
                    try {
                        j6(r5, this.v5.FH(r5));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 10; continue $sw2;
                    }
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 922088855067616243L)
    private abcd.Nk.a J8() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, -2756931129524890112L, this);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-2756931129524890112L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return this.FH.get(this.v5.getVisibleFile());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1494067517719136712L)
    private void Ws() {
        java.lang.String r2 = null;
        java.util.Iterator<java.lang.String> r3 = null;
        java.lang.String r4 = null;
        android.content.SharedPreferences.Editor r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 15: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 20; continue $sw4; }
                    abcd.wu.j6(th, 4002116798050869483L, this);
                    $pc4 = 20; continue $sw4;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(4002116798050869483L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    r2 = "";
                    try {
                        r3 = this.FH.keySet().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    if (r3.hasNext() == false) { $pc4 = 13; continue $sw4; }
                    try {
                        r4 = r3.next();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    if (r2.length() <= 0) { $pc4 = 12; continue $sw4; }
                    try {
                        r2 = r2 + ";";
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    try {
                        r2 = r2 + r4;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    { $pc4 = 8; continue $sw4; }
                }
                case 13: {
                    try {
                        r5 = com.aide.ui.U.Zo().getSharedPreferences("OpenFileService", 0).edit();
                        r5.putString("CurrentFiles", r2);
                        r5.commit();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 82251575639683184L)
    private boolean gn(java.lang.String r11) {
        java.lang.String r2 = null;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.Nk.a>> r3 = null;
        java.util.Map.Entry<java.lang.String, abcd.Nk.a> r4 = null;
        java.lang.String r5 = null;
        abcd.Nk.a r6 = null;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.Nk.a>> r7 = null;
        java.util.Map.Entry<java.lang.String, abcd.Nk.a> r8 = null;
        java.lang.String r9 = null;
        abcd.Nk.a r10 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 37: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 42; continue $sw5; }
                    abcd.wu.j6(th, 6381402056394372825L, this, r11);
                    $pc5 = 42; continue $sw5;
                }
                case 42: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(6381402056394372825L, this, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 37; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    r2 = null;
                    try {
                        r3 = this.FH.entrySet().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 37; continue $sw5;
                    }
                    $pc5 = 8; continue $sw5;
                }
                case 8: {
                    if (r3.hasNext() == false) { $pc5 = 19; continue $sw5; }
                    try {
                        r4 = r3.next();
                        r5 = r4.getKey();
                        r6 = r4.getValue();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 37; continue $sw5;
                    }
                    if (r5.equals(r11) == true) { $pc5 = 8; continue $sw5; }
                    if (r6.J0() == true) { $pc5 = 8; continue $sw5; }
                    if (r6.Hw() == true) { $pc5 = 8; continue $sw5; }
                    if (r2 == null) { $pc5 = 18; continue $sw5; }
                    if (u7(r2) <= u7(r5)) { $pc5 = 8; continue $sw5; }
                    $pc5 = 18; continue $sw5;
                }
                case 18: {
                    r2 = r5;
                    { $pc5 = 8; continue $sw5; }
                }
                case 19: {
                    if (r2 != null) { $pc5 = 31; continue $sw5; }
                    try {
                        r7 = this.FH.entrySet().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 37; continue $sw5;
                    }
                    $pc5 = 22; continue $sw5;
                }
                case 22: {
                    if (r7.hasNext() == false) { $pc5 = 31; continue $sw5; }
                    try {
                        r8 = r7.next();
                        r9 = r8.getKey();
                        r10 = r8.getValue();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 37; continue $sw5;
                    }
                    if (r9.equals(r11) == true) { $pc5 = 22; continue $sw5; }
                    if (r10.J0() == true) { $pc5 = 22; continue $sw5; }
                    if (r2 == null) { $pc5 = 30; continue $sw5; }
                    if (u7(r2) <= u7(r9)) { $pc5 = 22; continue $sw5; }
                    $pc5 = 30; continue $sw5;
                }
                case 30: {
                    r2 = r9;
                    $pc5 = 31; continue $sw5;
                }
                case 31: {
                    if (r2 == null) { $pc5 = 35; continue $sw5; }
                    try {
                        j6(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 37; continue $sw5;
                    }
                    return true;
                }
                case 35: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.util.List j6(abcd.Nk r0) {
        return r0.VH;
    }

    @abcd.Interfacesu(method = -21142779532829293L)
    private void j6(java.lang.String r8, abcd.Nk.a r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 3;
        $sw6: while (true) {
            switch ($pc6) {
                case 12: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 17; continue $sw6; }
                    abcd.wu.j6(th, 5124669159317979600L, this, r8, r9);
                    $pc6 = 17; continue $sw6;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc6 = 5; continue $sw6; }
                    try {
                        abcd.wu.j6(5124669159317979600L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 12; continue $sw6;
                    }
                    $pc6 = 5; continue $sw6;
                }
                case 5: {
                    try {
                        this.FH.put(r8, r9);
                        DW(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 12; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    if (this.FH.size() <= 10) { $pc6 = 11; continue $sw6; }
                    if (gn(r8) == true) { $pc6 = 6; continue $sw6; }
                    return;
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1203837560873770563L)
    private boolean tp(java.lang.String r5) {
        java.lang.String r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 36: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 40; continue $sw7; }
                    abcd.wu.j6(th, 5085031610605026512L, this, r5);
                    $pc7 = 40; continue $sw7;
                }
                case 40: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(5085031610605026512L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 36; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    try {
                        r6 = r5.toLowerCase();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 36; continue $sw7;
                    }
                    if (r6.endsWith(".java") == false) { $pc7 = 9; continue $sw7; }
                    $pc7 = 34; continue $sw7;
                }
                case 34: {
                    return true;
                }
                case 9: {
                    if (r6.endsWith(".class") == true) { $pc7 = 34; continue $sw7; }
                    if (r6.endsWith(".xml") == true) { $pc7 = 34; continue $sw7; }
                    if (r6.endsWith(".c") == true) { $pc7 = 34; continue $sw7; }
                    if (r6.endsWith(".cpp") == true) { $pc7 = 34; continue $sw7; }
                    if (r6.endsWith(".cc") == true) { $pc7 = 34; continue $sw7; }
                    if (r6.endsWith(".h") == true) { $pc7 = 34; continue $sw7; }
                    if (r6.endsWith(".hh") == true) { $pc7 = 34; continue $sw7; }
                    if (r6.endsWith(".hpp") == true) { $pc7 = 34; continue $sw7; }
                    if (r6.endsWith(".html") == true) { $pc7 = 34; continue $sw7; }
                    if (r6.endsWith(".htm") == true) { $pc7 = 34; continue $sw7; }
                    if (r6.endsWith(".css") == true) { $pc7 = 34; continue $sw7; }
                    if (r6.endsWith(".js") == true) { $pc7 = 34; continue $sw7; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1576652306346077805L)
    private long u7(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 12: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 16; continue $sw8; }
                    abcd.wu.j6(th, -382766286572144000L, this, r5);
                    $pc8 = 16; continue $sw8;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc8 = 7; continue $sw8; }
                    try {
                        abcd.wu.j6(-382766286572144000L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 12; continue $sw8;
                    }
                    $pc8 = 7; continue $sw8;
                }
                case 7: {
                    if (this.Hw.containsKey(r5) == false) { $pc8 = 10; continue $sw8; }
                    return this.Hw.get(r5).longValue();
                }
                case 10: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Nk.a DW(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 8: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 12; continue $sw9; }
                    abcd.wu.j6(th, 2839078665596249356L, this, r5);
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(2839078665596249356L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    return this.FH.get(r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 8: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 12; continue $sw10; }
                    abcd.wu.j6(th, 2053160169550986925L, this);
                    $pc10 = 12; continue $sw10;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc10 = 6; continue $sw10; }
                    try {
                        abcd.wu.j6(2053160169550986925L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    return this.v5.getVisibleFile();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(abcd.Nk.c r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 4;
        $sw11: while (true) {
            switch ($pc11) {
                case 8: {
                    th = $ex11;
                    if (DW == false) { $pc11 = 12; continue $sw11; }
                    abcd.wu.j6(th, 125863297883366576L, this, r5);
                    $pc11 = 12; continue $sw11;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc11 = 6; continue $sw11; }
                    try {
                        abcd.wu.j6(125863297883366576L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    try {
                        this.VH.remove(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean DW(boolean r8, boolean r9) {
        boolean r0 = false;
        boolean r1 = false;
        java.util.ArrayList r2 = null;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.Nk.a>> r3 = null;
        java.util.Map.Entry<java.lang.String, abcd.Nk.a> r4 = null;
        java.lang.String r5 = null;
        abcd.Nk.a r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 3;
        $sw12: while (true) {
            switch ($pc12) {
                case 19: {
                    th = $ex12;
                    if (DW == false) { $pc12 = 24; continue $sw12; }
                    abcd.wu.j6(th, 5473762685545180000L, this, new java.lang.Boolean(r8), new java.lang.Boolean(r9));
                    $pc12 = 24; continue $sw12;
                }
                case 24: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc12 = 5; continue $sw12; }
                    try {
                        abcd.wu.j6(5473762685545180000L, this, new java.lang.Boolean(r8), new java.lang.Boolean(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 19; continue $sw12;
                    }
                    $pc12 = 5; continue $sw12;
                }
                case 5: {
                    try {
                        r0 = com.aide.ui.U.vy().Mr();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 19; continue $sw12;
                    }
                    r1 = true;
                    try {
                        r2 = new java.util.ArrayList();
                        r3 = this.FH.entrySet().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 19; continue $sw12;
                    }
                    $pc12 = 7; continue $sw12;
                }
                case 7: {
                    if (r3.hasNext() == false) { $pc12 = 16; continue $sw12; }
                    try {
                        r4 = r3.next();
                        r5 = r4.getKey();
                        r6 = r4.getValue();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 19; continue $sw12;
                    }
                    if (r6.J0() == false) { $pc12 = 7; continue $sw12; }
                    if (r0 == false) { $pc12 = 11; continue $sw12; }
                    r1 = false;
                    { $pc12 = 7; continue $sw12; }
                }
                case 11: {
                    if (r8 == false) { $pc12 = 13; continue $sw12; }
                    try {
                        r2.add(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 19; continue $sw12;
                    }
                    $pc12 = 13; continue $sw12;
                }
                case 13: {
                    try {
                        r6.gn();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 19; continue $sw12;
                    }
                    { $pc12 = 7; continue $sw12; }
                }
                case 16: {
                    if (r2.isEmpty() == true) { $pc12 = 18; continue $sw12; }
                    try {
                        com.aide.ui.U.vy().j6(r2, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 19; continue $sw12;
                    }
                    $pc12 = 18; continue $sw12;
                }
                case 18: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean EQ() {
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.Nk.a>> r2 = null;
        java.util.Map.Entry<java.lang.String, abcd.Nk.a> r4 = null;
        java.lang.String r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 17: {
                    th = $ex13;
                    if (DW == false) { $pc13 = 22; continue $sw13; }
                    abcd.wu.j6(th, 5859948262588820232L, this);
                    $pc13 = 22; continue $sw13;
                }
                case 22: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc13 = 7; continue $sw13; }
                    try {
                        abcd.wu.j6(5859948262588820232L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 17; continue $sw13;
                    }
                    $pc13 = 7; continue $sw13;
                }
                case 7: {
                    if (com.aide.ui.U.vy().Mr() == true) { $pc13 = 9; continue $sw13; }
                    return false;
                }
                case 9: {
                    try {
                        r2 = this.FH.entrySet().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 17; continue $sw13;
                    }
                    $pc13 = 10; continue $sw13;
                }
                case 10: {
                    if (r2.hasNext() == false) { $pc13 = 16; continue $sw13; }
                    try {
                        r4 = r2.next();
                        r5 = r4.getKey();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 17; continue $sw13;
                    }
                    if (r4.getValue().J0() == false) { $pc13 = 10; continue $sw13; }
                    return true;
                }
                case 16: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public long FH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 8: {
                    th = $ex14;
                    if (DW == false) { $pc14 = 12; continue $sw14; }
                    abcd.wu.j6(th, -4887642519519075669L, this);
                    $pc14 = 12; continue $sw14;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc14 = 6; continue $sw14; }
                    try {
                        abcd.wu.j6(-4887642519519075669L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 8; continue $sw14;
                    }
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    return J8().getVersion();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean FH(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 4;
        $sw15: while (true) {
            switch ($pc15) {
                case 8: {
                    th = $ex15;
                    if (DW == false) { $pc15 = 12; continue $sw15; }
                    abcd.wu.j6(th, 1947299949793172135L, this, r5);
                    $pc15 = 12; continue $sw15;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc15 = 6; continue $sw15; }
                    try {
                        abcd.wu.j6(1947299949793172135L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 8; continue $sw15;
                    }
                    $pc15 = 6; continue $sw15;
                }
                case 6: {
                    return this.FH.containsKey(r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Hw() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 4;
        $sw16: while (true) {
            switch ($pc16) {
                case 7: {
                    th = $ex16;
                    if (DW == false) { $pc16 = 11; continue $sw16; }
                    abcd.wu.j6(th, -2115440843655470981L, this);
                    $pc16 = 11; continue $sw16;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc16 = 14; continue $sw16; }
                    try {
                        abcd.wu.j6(-2115440843655470981L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 7; continue $sw16;
                    }
                    return;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Hw(java.lang.String r12) {
        int r6 = 0;
        java.lang.String r4 = null;
        java.lang.String[] r5 = null;
        java.util.HashSet r7 = null;
        int r8 = 0;
        java.lang.String r9 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = 4;
        $sw17: while (true) {
            switch ($pc17) {
                case 31: {
                    th = $ex17;
                    if (DW == false) { $pc17 = 36; continue $sw17; }
                    abcd.wu.j6(th, -5779111451015901571L, this, r12);
                    $pc17 = 36; continue $sw17;
                }
                case 36: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc17 = 7; continue $sw17; }
                    try {
                        abcd.wu.j6(-5779111451015901571L, this, r12);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 31; continue $sw17;
                    }
                    $pc17 = 7; continue $sw17;
                }
                case 7: {
                    if (com.aide.ui.U.dx() == false) { $pc17 = 10; continue $sw17; }
                    return;
                }
                case 10: {
                    if (com.aide.ui.U.lg().FH("android.permission.WRITE_EXTERNAL_STORAGE") == true) { $pc17 = 13; continue $sw17; }
                    return;
                }
                case 13: {
                    if (r12 != null) { $pc17 = 38; continue $sw17; }
                    r6 = 0;
                    try {
                        r4 = com.aide.ui.U.Zo().getSharedPreferences("OpenFileService", 0).getString("CurrentFiles", null);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 31; continue $sw17;
                    }
                    if (r4 == null) { $pc17 = 49; continue $sw17; }
                    try {
                        r5 = r4.split(";");
                        r7 = new java.util.HashSet();
                        r8 = r5.length;
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 31; continue $sw17;
                    }
                    $pc17 = 20; continue $sw17;
                }
                case 20: {
                    if (r6 >= r8) { $pc17 = 51; continue $sw17; }
                    try {
                        r9 = r5[r6];
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 31; continue $sw17;
                    }
                    if (abcd.Vl.Hw(r9) == false) { $pc17 = 29; continue $sw17; }
                    if (r7.contains(r9) == true) { $pc17 = 29; continue $sw17; }
                    try {
                        r7.add(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 31; continue $sw17;
                    }
                    try {
                        EQ(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        if ($t instanceof java.io.IOException) { $pc17 = 28; continue $sw17; }
                        $pc17 = 31; continue $sw17;
                    }
                    $pc17 = 29; continue $sw17;
                }
                case 28: {
                    try {
                        com.almlkaide.kaypro.util.Toasty.toast(com.aide.ui.U.Zo(), r9 + " could not be loaded!", 1).show();
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 31; continue $sw17;
                    }
                    $pc17 = 29; continue $sw17;
                }
                case 29: {
                    r6 = r6 + 1;
                    { $pc17 = 20; continue $sw17; }
                }
                case 51: {
                    return;
                }
                case 49: {
                    return;
                }
                case 38: {
                    try {
                        EQ(r12);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        if ($t instanceof java.io.IOException) { $pc17 = 16; continue $sw17; }
                        $pc17 = 31; continue $sw17;
                    }
                    $pc17 = 50; continue $sw17;
                }
                case 50: {
                    return;
                }
                case 16: {
                    try {
                        com.almlkaide.kaypro.util.Toasty.toast(com.aide.ui.U.Zo(), r12 + " could not be loaded!", 1).show();
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 31; continue $sw17;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void J0() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = 4;
        $sw18: while (true) {
            switch ($pc18) {
                case 10: {
                    th = $ex18;
                    if (DW == false) { $pc18 = 14; continue $sw18; }
                    abcd.wu.j6(th, -2613001169087778920L, this);
                    $pc18 = 14; continue $sw18;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc18 = 7; continue $sw18; }
                    try {
                        abcd.wu.j6(-2613001169087778920L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 10; continue $sw18;
                    }
                    $pc18 = 7; continue $sw18;
                }
                case 7: {
                    if (this.Zo == null) { $pc18 = 17; continue $sw18; }
                    try {
                        this.FH.get(this.Zo).gn();
                        this.Zo = null;
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 10; continue $sw18;
                    }
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void VH(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = 4;
        $sw19: while (true) {
            switch ($pc19) {
                case 10: {
                    th = $ex19;
                    if (DW == false) { $pc19 = 14; continue $sw19; }
                    abcd.wu.j6(th, -2253935147280698560L, this, r5);
                    $pc19 = 14; continue $sw19;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc19 = 7; continue $sw19; }
                    try {
                        abcd.wu.j6(-2253935147280698560L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 10; continue $sw19;
                    }
                    $pc19 = 7; continue $sw19;
                }
                case 7: {
                    if (FH(r5) == false) { $pc19 = 17; continue $sw19; }
                    try {
                        this.v5.j6(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 10; continue $sw19;
                    }
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean VH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = 4;
        $sw20: while (true) {
            switch ($pc20) {
                case 15: {
                    th = $ex20;
                    if (DW == false) { $pc20 = 19; continue $sw20; }
                    abcd.wu.j6(th, -31092515674709195L, this);
                    $pc20 = 19; continue $sw20;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc20 = 7; continue $sw20; }
                    try {
                        abcd.wu.j6(-31092515674709195L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 15; continue $sw20;
                    }
                    $pc20 = 7; continue $sw20;
                }
                case 7: {
                    if (tp() == true) { $pc20 = 9; continue $sw20; }
                    $pc20 = 13; continue $sw20;
                }
                case 13: {
                    return false;
                }
                case 9: {
                    if (DW().toLowerCase().endsWith(".java") == false) { $pc20 = 13; continue $sw20; }
                    if (com.aide.ui.U.vy().j3() == false) { $pc20 = 13; continue $sw20; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Zo(java.lang.String r7) {
        java.util.HashSet r2 = null;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.Nk.a>> r3 = null;
        java.lang.String r4 = null;
        java.util.Iterator r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = 4;
        $sw21: while (true) {
            switch ($pc21) {
                case 18: {
                    th = $ex21;
                    if (DW == false) { $pc21 = 23; continue $sw21; }
                    abcd.wu.j6(th, -5343616341563854331L, this, r7);
                    $pc21 = 23; continue $sw21;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc21 = 6; continue $sw21; }
                    try {
                        abcd.wu.j6(-5343616341563854331L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 18; continue $sw21;
                    }
                    $pc21 = 6; continue $sw21;
                }
                case 6: {
                    try {
                        r2 = new java.util.HashSet();
                        r3 = this.FH.entrySet().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 18; continue $sw21;
                    }
                    $pc21 = 8; continue $sw21;
                }
                case 8: {
                    if (r3.hasNext() == false) { $pc21 = 12; continue $sw21; }
                    try {
                        r4 = r3.next().getKey();
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 18; continue $sw21;
                    }
                    if (abcd.Vl.Hw(r7, r4) == false) { $pc21 = 8; continue $sw21; }
                    try {
                        r2.add(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 18; continue $sw21;
                    }
                    { $pc21 = 8; continue $sw21; }
                }
                case 12: {
                    try {
                        r5 = r2.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 18; continue $sw21;
                    }
                    $pc21 = 13; continue $sw21;
                }
                case 13: {
                    if (r5.hasNext() == false) { $pc21 = 17; continue $sw21; }
                    try {
                        j6((java.lang.String) r5.next());
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 18; continue $sw21;
                    }
                    { $pc21 = 13; continue $sw21; }
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean Zo() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = 4;
        $sw22: while (true) {
            switch ($pc22) {
                case 15: {
                    th = $ex22;
                    if (DW == false) { $pc22 = 19; continue $sw22; }
                    abcd.wu.j6(th, -601302454056802264L, this);
                    $pc22 = 19; continue $sw22;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc22 = 7; continue $sw22; }
                    try {
                        abcd.wu.j6(-601302454056802264L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 15; continue $sw22;
                    }
                    $pc22 = 7; continue $sw22;
                }
                case 7: {
                    if (tp() == true) { $pc22 = 9; continue $sw22; }
                    $pc22 = 13; continue $sw22;
                }
                case 13: {
                    return false;
                }
                case 9: {
                    if (tp(DW()) == false) { $pc22 = 13; continue $sw22; }
                    if (com.aide.ui.U.vy().j3() == false) { $pc22 = 13; continue $sw22; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean gn() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = 4;
        $sw23: while (true) {
            switch ($pc23) {
                case 13: {
                    th = $ex23;
                    if (DW == false) { $pc23 = 17; continue $sw23; }
                    abcd.wu.j6(th, 4036160922200731011L, this);
                    $pc23 = 17; continue $sw23;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc23 = 7; continue $sw23; }
                    try {
                        abcd.wu.j6(4036160922200731011L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 13; continue $sw23;
                    }
                    $pc23 = 7; continue $sw23;
                }
                case 7: {
                    if (DW() == null) { $pc23 = 11; continue $sw23; }
                    if (abcd.Vl.QX(DW()) == true) { $pc23 = 11; continue $sw23; }
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        java.util.HashSet r2 = null;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.Nk.a>> r3 = null;
        java.util.Map.Entry<java.lang.String, abcd.Nk.a> r4 = null;
        java.util.Iterator r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = 4;
        $sw24: while (true) {
            switch ($pc24) {
                case 18: {
                    th = $ex24;
                    if (DW == false) { $pc24 = 23; continue $sw24; }
                    abcd.wu.j6(th, 2373430768077397904L, this);
                    $pc24 = 23; continue $sw24;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc24 = 6; continue $sw24; }
                    try {
                        abcd.wu.j6(2373430768077397904L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 18; continue $sw24;
                    }
                    $pc24 = 6; continue $sw24;
                }
                case 6: {
                    try {
                        r2 = new java.util.HashSet();
                        r3 = this.FH.entrySet().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 18; continue $sw24;
                    }
                    $pc24 = 8; continue $sw24;
                }
                case 8: {
                    if (r3.hasNext() == false) { $pc24 = 12; continue $sw24; }
                    try {
                        r4 = r3.next();
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 18; continue $sw24;
                    }
                    if (r4.getValue().J0() == true) { $pc24 = 8; continue $sw24; }
                    try {
                        r2.add(r4.getKey());
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 18; continue $sw24;
                    }
                    { $pc24 = 8; continue $sw24; }
                }
                case 12: {
                    try {
                        r5 = r2.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 18; continue $sw24;
                    }
                    $pc24 = 13; continue $sw24;
                }
                case 13: {
                    if (r5.hasNext() == false) { $pc24 = 17; continue $sw24; }
                    try {
                        j6((java.lang.String) r5.next());
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 18; continue $sw24;
                    }
                    { $pc24 = 13; continue $sw24; }
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.Nk.b r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = 4;
        $sw25: while (true) {
            switch ($pc25) {
                case 8: {
                    th = $ex25;
                    if (DW == false) { $pc25 = 12; continue $sw25; }
                    abcd.wu.j6(th, -392602682715779349L, this, r5);
                    $pc25 = 12; continue $sw25;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc25 = 6; continue $sw25; }
                    try {
                        abcd.wu.j6(-392602682715779349L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 8; continue $sw25;
                    }
                    $pc25 = 6; continue $sw25;
                }
                case 6: {
                    try {
                        this.v5 = r5;
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 8; continue $sw25;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.Nk.c r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = 4;
        $sw26: while (true) {
            switch ($pc26) {
                case 8: {
                    th = $ex26;
                    if (DW == false) { $pc26 = 12; continue $sw26; }
                    abcd.wu.j6(th, -6231401113002562809L, this, r5);
                    $pc26 = 12; continue $sw26;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc26 = 6; continue $sw26; }
                    try {
                        abcd.wu.j6(-6231401113002562809L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 8; continue $sw26;
                    }
                    $pc26 = 6; continue $sw26;
                }
                case 6: {
                    try {
                        this.VH.add(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 8; continue $sw26;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex27 = null;
        int $pc27 = 4;
        $sw27: while (true) {
            switch ($pc27) {
                case 8: {
                    th = $ex27;
                    if (DW == false) { $pc27 = 12; continue $sw27; }
                    abcd.wu.j6(th, -6692914938708381609L, this, r5);
                    $pc27 = 12; continue $sw27;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc27 = 6; continue $sw27; }
                    try {
                        abcd.wu.j6(-6692914938708381609L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 8; continue $sw27;
                    }
                    $pc27 = 6; continue $sw27;
                }
                case 6: {
                    try {
                        this.FH.get(r5).close();
                        this.FH.remove(r5);
                        com.aide.ui.U.EQ().FH(r5);
                        this.v5.DW(r5);
                        com.aide.ui.U.EQ().VH();
                        Ws();
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 8; continue $sw27;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r8, java.lang.String r9) {
        java.util.HashMap r0 = null;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.Nk.a>> r1 = null;
        java.lang.String r2 = null;
        java.util.Iterator r3 = null;
        java.util.Map.Entry r4 = null;
        java.lang.String r5 = null;
        java.lang.String r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex28 = null;
        int $pc28 = 3;
        $sw28: while (true) {
            switch ($pc28) {
                case 17: {
                    th = $ex28;
                    if (DW == false) { $pc28 = 22; continue $sw28; }
                    abcd.wu.j6(th, -1216992331299820640L, this, r8, r9);
                    $pc28 = 22; continue $sw28;
                }
                case 22: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc28 = 5; continue $sw28; }
                    try {
                        abcd.wu.j6(-1216992331299820640L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 17; continue $sw28;
                    }
                    $pc28 = 5; continue $sw28;
                }
                case 5: {
                    try {
                        r0 = new java.util.HashMap();
                        r1 = this.FH.entrySet().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 17; continue $sw28;
                    }
                    $pc28 = 7; continue $sw28;
                }
                case 7: {
                    if (r1.hasNext() == false) { $pc28 = 11; continue $sw28; }
                    try {
                        r2 = r1.next().getKey();
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 17; continue $sw28;
                    }
                    if (abcd.Vl.Hw(r8, r2) == false) { $pc28 = 7; continue $sw28; }
                    try {
                        r0.put(r2, abcd.Vl.j6(r2, r8, r9));
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 17; continue $sw28;
                    }
                    { $pc28 = 7; continue $sw28; }
                }
                case 11: {
                    try {
                        r3 = r0.entrySet().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 17; continue $sw28;
                    }
                    $pc28 = 12; continue $sw28;
                }
                case 12: {
                    if (r3.hasNext() == false) { $pc28 = 16; continue $sw28; }
                    try {
                        r4 = (java.util.Map.Entry) r3.next();
                        r5 = (java.lang.String) r4.getKey();
                        r6 = (java.lang.String) r4.getValue();
                        com.aide.ui.U.EQ().FH(r5, r6);
                        this.FH.get(r5).j6(r6);
                        this.FH.put(r6, this.FH.get(r5));
                        this.FH.remove(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 17; continue $sw28;
                    }
                    { $pc28 = 12; continue $sw28; }
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r8, boolean r9) {
        boolean r0 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex29 = null;
        int $pc29 = 3;
        $sw29: while (true) {
            switch ($pc29) {
                case 16: {
                    th = $ex29;
                    if (DW == false) { $pc29 = 20; continue $sw29; }
                    abcd.wu.j6(th, -106975686406521920L, this, r8, new java.lang.Boolean(r9));
                    $pc29 = 20; continue $sw29;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc29 = 6; continue $sw29; }
                    try {
                        abcd.wu.j6(-106975686406521920L, this, r8, new java.lang.Boolean(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 16; continue $sw29;
                    }
                    $pc29 = 6; continue $sw29;
                }
                case 6: {
                    if (r8.equals(DW()) == true) { $pc29 = 23; continue $sw29; }
                    try {
                        r0 = FH(r8);
                        EQ(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 16; continue $sw29;
                    }
                    if (FH(r8) == true) { $pc29 = 10; continue $sw29; }
                    return;
                }
                case 10: {
                    if (r0 == true) { $pc29 = 12; continue $sw29; }
                    try {
                        com.aide.ui.U.tp().Hw(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 16; continue $sw29;
                    }
                    $pc29 = 12; continue $sw29;
                }
                case 12: {
                    if (r9 == false) { $pc29 = 14; continue $sw29; }
                    try {
                        this.v5.j6(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 16; continue $sw29;
                    }
                    $pc29 = 14; continue $sw29;
                }
                case 14: {
                    try {
                        this.Hw.put(r8, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                        Ws();
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 16; continue $sw29;
                    }
                    return;
                }
                case 23: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.util.List<java.lang.String> r9) {
        int r3 = 0;
        java.lang.String r5 = null;
        boolean r6 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex30 = null;
        int $pc30 = 4;
        $sw30: while (true) {
            switch ($pc30) {
                case 19: {
                    th = $ex30;
                    if (DW == false) { $pc30 = 24; continue $sw30; }
                    abcd.wu.j6(th, -581308408511950144L, this, r9);
                    $pc30 = 24; continue $sw30;
                }
                case 24: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc30 = 6; continue $sw30; }
                    try {
                        abcd.wu.j6(-581308408511950144L, this, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 19; continue $sw30;
                    }
                    $pc30 = 6; continue $sw30;
                }
                case 6: {
                    r3 = 0;
                    $pc30 = 7; continue $sw30;
                }
                case 7: {
                    if (r3 >= r9.size()) { $pc30 = 18; continue $sw30; }
                    try {
                        r5 = r9.get(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.io.IOException) { $pc30 = 16; continue $sw30; }
                        $pc30 = 19; continue $sw30;
                    }
                    if (r3 != 0) { $pc30 = 13; continue $sw30; }
                    r6 = true;
                    $pc30 = 14; continue $sw30;
                }
                case 14: {
                    try {
                        j6(r5, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.io.IOException) { $pc30 = 16; continue $sw30; }
                        $pc30 = 19; continue $sw30;
                    }
                    $pc30 = 17; continue $sw30;
                }
                case 17: {
                    r3 = r3 + 1;
                    { $pc30 = 7; continue $sw30; }
                }
                case 13: {
                    r6 = false;
                    $pc30 = 18; continue $sw30;
                }
                case 16: {
                    try {
                        com.almlkaide.kaypro.util.Toasty.toast(com.aide.ui.U.Zo(), r9.get(r3) + " could not be loaded!", 1).show();
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 19; continue $sw30;
                    }
                    { $pc30 = 17; continue $sw30; }
                }
                case 18: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(boolean r8) {
        java.util.ArrayList r2 = null;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.Nk.a>> r3 = null;
        java.util.Map.Entry<java.lang.String, abcd.Nk.a> r4 = null;
        java.lang.String r5 = null;
        abcd.Nk.a r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex31 = null;
        int $pc31 = 4;
        $sw31: while (true) {
            switch ($pc31) {
                case 17: {
                    th = $ex31;
                    if (DW == false) { $pc31 = 22; continue $sw31; }
                    abcd.wu.j6(th, -510165287874117215L, this, new java.lang.Boolean(r8));
                    $pc31 = 22; continue $sw31;
                }
                case 22: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc31 = 6; continue $sw31; }
                    try {
                        abcd.wu.j6(-510165287874117215L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 17; continue $sw31;
                    }
                    $pc31 = 6; continue $sw31;
                }
                case 6: {
                    try {
                        r2 = new java.util.ArrayList();
                        r3 = this.FH.entrySet().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 17; continue $sw31;
                    }
                    $pc31 = 8; continue $sw31;
                }
                case 8: {
                    if (r3.hasNext() == false) { $pc31 = 13; continue $sw31; }
                    try {
                        r4 = r3.next();
                        r5 = r4.getKey();
                        r6 = r4.getValue();
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 17; continue $sw31;
                    }
                    if (r6.we() == false) { $pc31 = 8; continue $sw31; }
                    try {
                        r6.j6();
                        r2.add(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 17; continue $sw31;
                    }
                    { $pc31 = 8; continue $sw31; }
                }
                case 13: {
                    if (r2.isEmpty() == true) { $pc31 = 31; continue $sw31; }
                    if (r8 == false) { $pc31 = 32; continue $sw31; }
                    try {
                        com.aide.ui.U.vy().j6(r2, false);
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 17; continue $sw31;
                    }
                    return;
                }
                case 32: {
                    return;
                }
                case 31: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(boolean r8, boolean r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex32 = null;
        int $pc32 = 3;
        $sw32: while (true) {
            switch ($pc32) {
                case 7: {
                    th = $ex32;
                    if (DW == false) { $pc32 = 11; continue $sw32; }
                    abcd.wu.j6(th, -1984351752503026935L, this, new java.lang.Boolean(r8), new java.lang.Boolean(r9));
                    $pc32 = 11; continue $sw32;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc32 = 5; continue $sw32; }
                    try {
                        abcd.wu.j6(-1984351752503026935L, this, new java.lang.Boolean(r8), new java.lang.Boolean(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 7; continue $sw32;
                    }
                    $pc32 = 5; continue $sw32;
                }
                case 5: {
                    try {
                        DW(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 7; continue $sw32;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean tp() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex33 = null;
        int $pc33 = 4;
        $sw33: while (true) {
            switch ($pc33) {
                case 11: {
                    th = $ex33;
                    if (DW == false) { $pc33 = 15; continue $sw33; }
                    abcd.wu.j6(th, 4231070054278013269L, this);
                    $pc33 = 15; continue $sw33;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc33 = 6; continue $sw33; }
                    try {
                        abcd.wu.j6(4231070054278013269L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex33 = $t;
                        $pc33 = 11; continue $sw33;
                    }
                    $pc33 = 6; continue $sw33;
                }
                case 6: {
                    if (DW() == null) { $pc33 = 9; continue $sw33; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean u7() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex34 = null;
        int $pc34 = 4;
        $sw34: while (true) {
            switch ($pc34) {
                case 9: {
                    th = $ex34;
                    if (DW == false) { $pc34 = 13; continue $sw34; }
                    abcd.wu.j6(th, 2841200173454170325L, this);
                    $pc34 = 13; continue $sw34;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc34 = 6; continue $sw34; }
                    try {
                        abcd.wu.j6(2841200173454170325L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 9; continue $sw34;
                    }
                    $pc34 = 6; continue $sw34;
                }
                case 6: {
                    return !this.FH.isEmpty();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Nk.a v5(java.lang.String r5) {
        abcd.Nk.a r2 = null;
        abcd.Nk.a r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex35 = null;
        int $pc35 = 4;
        $sw35: while (true) {
            switch ($pc35) {
                case 11: {
                    th = $ex35;
                    if (DW == false) { $pc35 = 15; continue $sw35; }
                    abcd.wu.j6(th, 5049133857911600640L, this, r5);
                    $pc35 = 15; continue $sw35;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc35 = 6; continue $sw35; }
                    try {
                        abcd.wu.j6(5049133857911600640L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex35 = $t;
                        $pc35 = 11; continue $sw35;
                    }
                    $pc35 = 6; continue $sw35;
                }
                case 6: {
                    try {
                        r2 = DW(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex35 = $t;
                        $pc35 = 11; continue $sw35;
                    }
                    if (r2 == null) { $pc35 = 9; continue $sw35; }
                    return r2;
                }
                case 9: {
                    try {
                        J0();
                        this.Zo = r5;
                        r3 = this.v5.FH(r5);
                        j6(r5, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex35 = $t;
                        $pc35 = 11; continue $sw35;
                    }
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void v5() {
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.Nk.a>> r2 = null;
        java.util.Map.Entry<java.lang.String, abcd.Nk.a> r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex36 = null;
        int $pc36 = 4;
        $sw36: while (true) {
            switch ($pc36) {
                case 12: {
                    th = $ex36;
                    if (DW == false) { $pc36 = 17; continue $sw36; }
                    abcd.wu.j6(th, 2627275423547542415L, this);
                    $pc36 = 17; continue $sw36;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc36 = 6; continue $sw36; }
                    try {
                        abcd.wu.j6(2627275423547542415L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex36 = $t;
                        $pc36 = 12; continue $sw36;
                    }
                    $pc36 = 6; continue $sw36;
                }
                case 6: {
                    try {
                        r2 = this.FH.entrySet().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex36 = $t;
                        $pc36 = 12; continue $sw36;
                    }
                    $pc36 = 8; continue $sw36;
                }
                case 8: {
                    if (r2.hasNext() == false) { $pc36 = 10; continue $sw36; }
                    try {
                        r3 = r2.next();
                        DW(r3.getKey(), r3.getValue());
                    } catch (java.lang.Throwable $t) {
                        $ex36 = $t;
                        $pc36 = 12; continue $sw36;
                    }
                    { $pc36 = 8; continue $sw36; }
                }
                case 10: {
                    try {
                        com.aide.ui.U.EQ().j6(new abcd.BinderLk(this));
                    } catch (java.lang.Throwable $t) {
                        $ex36 = $t;
                        $pc36 = 12; continue $sw36;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean we() {
        java.util.Iterator<abcd.Nk.a> r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex37 = null;
        int $pc37 = 4;
        $sw37: while (true) {
            switch ($pc37) {
                case 15: {
                    th = $ex37;
                    if (DW == false) { $pc37 = 20; continue $sw37; }
                    abcd.wu.j6(th, -1302760480657514416L, this);
                    $pc37 = 20; continue $sw37;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc37 = 6; continue $sw37; }
                    try {
                        abcd.wu.j6(-1302760480657514416L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex37 = $t;
                        $pc37 = 15; continue $sw37;
                    }
                    $pc37 = 6; continue $sw37;
                }
                case 6: {
                    try {
                        r2 = this.FH.values().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex37 = $t;
                        $pc37 = 15; continue $sw37;
                    }
                    $pc37 = 7; continue $sw37;
                }
                case 7: {
                    if (r2.hasNext() == false) { $pc37 = 13; continue $sw37; }
                    if (r2.next().J0() == false) { $pc37 = 7; continue $sw37; }
                    return true;
                }
                case 13: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
