package tv.ouya.console.api;

public class f {
    private static final android.net.Uri DW = null;
    private static android.content.Context FH;
    private static android.os.Bundle Hw;
    static final tv.ouya.console.api.f[] Zo = null;
    private static int[] j6;
    private static android.util.SparseArray<java.lang.Object> v5;
    private android.util.SparseBooleanArray EQ;
    private int VH;
    private android.view.InputDevice gn;
    private android.util.SparseArray<java.lang.Float> tp;
    private java.lang.String u7;
    private android.util.SparseIntArray we;

    static {
        j6 = new int[]{0, 1, 11, 14, 17, 18};
        DW = android.net.Uri.parse("content://tv.ouya.controllerdata/");
        Hw = null;
        v5 = null;
        Zo = new tv.ouya.console.api.f[4];
    }

    f(int r2) {
        java.lang.String r3 = null;
        android.view.InputDevice r4 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.VH = r2;
                    this.gn = android.view.InputDevice.getDevice(r2);
                    this.tp = new android.util.SparseArray();
                    this.EQ = new android.util.SparseBooleanArray();
                    this.we = new android.util.SparseIntArray();
                    this.u7 = Hw(r2);
                    r3 = this.u7;
                    if (r3 != null) { $pc0 = 5; continue $sw0; }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r4 = this.gn;
                    if (r4 == null) { $pc0 = 11; continue $sw0; }
                    this.u7 = r4.getName();
                    return;
                }
                case 11: {
                    return;
                }
                case 5: {
                    if (r3.isEmpty() == true) { $pc0 = 6; continue $sw0; }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static tv.ouya.console.api.f DW(int r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r1 >= 0) { $pc1 = 4; continue $sw1; }
                    return null;
                }
                case 4: {
                    if (r1 < 4) { $pc1 = 6; continue $sw1; }
                    return null;
                }
                case 6: {
                    return Zo[r1];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean DW(int r0, android.view.KeyEvent r1) {
        return FH(r0, r1);
    }

    public static int FH(int r0) {
        tv.ouya.console.api.f r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r1 = Zo(r0);
                    if (r1 != null) { $pc2 = 7; continue $sw2; }
                    return -1;
                }
                case 7: {
                    return r1.Hw();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean FH(int r5, android.view.KeyEvent r6) {
        tv.ouya.console.api.f r7 = null;
        int r1 = 0;
        int r2 = 0;
        boolean r3 = false;
        int r8 = 0;
        int r0 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r7 = Zo(r6.getDeviceId());
                    if (r7 != null) { $pc3 = 5; continue $sw3; }
                    return false;
                }
                case 5: {
                    r1 = r6.getAction();
                    r2 = 2;
                    if (r1 == 0) { $pc3 = 10; continue $sw3; }
                    if (r1 == 1) { $pc3 = 9; continue $sw3; }
                    if (r1 == 2) { $pc3 = 10; continue $sw3; }
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    r3 = false;
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    r8 = r6.getKeyCode();
                    if (r7.EQ.indexOfKey(r8) >= 0) { $pc3 = 14; continue $sw3; }
                    $pc3 = 15; continue $sw3;
                }
                case 15: {
                    if (r3 == false) { $pc3 = 17; continue $sw3; }
                    r2 = 1;
                    $pc3 = 17; continue $sw3;
                }
                case 17: {
                    r0 = r7.we.get(r8, 0) | r2;
                    r7.we.put(r8, r0);
                    $pc3 = 18; continue $sw3;
                }
                case 18: {
                    r7.EQ.put(r8, r3);
                    return true;
                }
                case 14: {
                    if (r7.EQ.get(r8) == r3) { $pc3 = 18; continue $sw3; }
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    r3 = true;
                    { $pc3 = 11; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String Hw(int r9) {
        android.content.Context r0 = null;
        java.lang.String r1 = null;
        android.database.Cursor r10 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = FH;
                    r1 = null;
                    if (r0 != null) { $pc4 = 24; continue $sw4; }
                    return null;
                }
                case 24: {
                    try {
                        r10 = r0.getContentResolver().query(DW, new java.lang.String[]{"bt_name"}, "input_device_id = ?", new java.lang.String[]{java.lang.String.valueOf(r9)}, null);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.lang.Exception) { $pc4 = 18; continue $sw4; }
                        if ($t instanceof android.database.sqlite.SQLiteException) { $pc4 = 21; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r10 != null) { $pc4 = 22; continue $sw4; }
                    $pc4 = 15; continue $sw4;
                }
                case 15: {
                    if (r10 == null) { $pc4 = 20; continue $sw4; }
                    try {
                        r10.close();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.lang.Exception) { $pc4 = 18; continue $sw4; }
                        if ($t instanceof android.database.sqlite.SQLiteException) { $pc4 = 21; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc4 = 20; continue $sw4; }
                }
                case 22: {
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    th = $ex4;
                    if (r10 == null) { $pc4 = 14; continue $sw4; }
                    try {
                        r10.close();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.lang.Exception) { $pc4 = 18; continue $sw4; }
                        if ($t instanceof android.database.sqlite.SQLiteException) { $pc4 = 21; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc4 = 14; continue $sw4;
                }
                case 14: {
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.lang.Exception) { $pc4 = 18; continue $sw4; }
                        if ($t instanceof android.database.sqlite.SQLiteException) { $pc4 = 21; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 8: {
                    if (r10.moveToNext() == false) { $pc4 = 15; continue $sw4; }
                    try {
                        r1 = r10.getString(0);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    $pc4 = 18; continue $sw4;
                }
                case 18: {
                    e = $ex4;
                    android.util.Log.d("OuyaController", "Exception: " + e.getMessage());
                    $pc4 = 20; continue $sw4;
                }
                case 20: {
                    return r1;
                }
                case 21: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int VH(int r9) {
        android.content.Context r0 = null;
        android.database.Cursor r10 = null;
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = FH;
                    if (r0 != null) { $pc5 = 5; continue $sw5; }
                    return -1;
                }
                case 5: {
                    r10 = r0.getContentResolver().query(DW, new java.lang.String[]{"player_num"}, "input_device_id = ?", new java.lang.String[]{java.lang.String.valueOf(r9)}, null);
                    if (r10 != null) { $pc5 = 20; continue $sw5; }
                    $pc5 = 17; continue $sw5;
                }
                case 17: {
                    if (r10 == null) { $pc5 = 19; continue $sw5; }
                    r10.close();
                    $pc5 = 19; continue $sw5;
                }
                case 19: {
                    return -1;
                }
                case 20: {
                    $pc5 = 13; continue $sw5;
                }
                case 13: {
                    th = $ex5;
                    if (r10 == null) { $pc5 = 16; continue $sw5; }
                    r10.close();
                    $pc5 = 16; continue $sw5;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 8: {
                    if (r10.moveToNext() == false) { $pc5 = 17; continue $sw5; }
                    try {
                        r1 = r10.getInt(0);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 13; continue $sw5;
                    }
                    if (r10 == null) { $pc5 = 12; continue $sw5; }
                    r10.close();
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static tv.ouya.console.api.f Zo(int r3) {
        tv.ouya.console.api.f r0 = null;
        int r1 = 0;
        tv.ouya.console.api.f[] r2 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = j6(r3);
                    if (r0 == null) { $pc6 = 5; continue $sw6; }
                    return r0;
                }
                case 5: {
                    r1 = VH(r3);
                    if (r1 >= 0) { $pc6 = 8; continue $sw6; }
                    return null;
                }
                case 8: {
                    if (r1 >= 4) { $pc6 = 18; continue $sw6; }
                    r2 = Zo;
                    if (r2[r1] == null) { $pc6 = 14; continue $sw6; }
                    android.util.Log.e("OuyaController", "Controller for player " + r1 + " already found, but doesn't match device id (expected " + r3 + " got " + Zo[r1].DW() + ")");
                    return Zo[r1];
                }
                case 14: {
                    r2[r1] = new tv.ouya.console.api.f(r3);
                    return Zo[r1];
                }
                case 18: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static tv.ouya.console.api.f j6(int r5) {
        tv.ouya.console.api.f[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        tv.ouya.console.api.f r3 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = Zo;
                    r1 = r0.length;
                    r2 = 0;
                    $pc7 = 3; continue $sw7;
                }
                case 3: {
                    if (r2 >= r1) { $pc7 = 10; continue $sw7; }
                    r3 = r0[r2];
                    if (r3 == null) { $pc7 = 9; continue $sw7; }
                    if (r3.DW() != r5) { $pc7 = 9; continue $sw7; }
                    return r3;
                }
                case 9: {
                    r2 = r2 + 1;
                    { $pc7 = 3; continue $sw7; }
                }
                case 10: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.content.Context r2) {
        int r3 = 0;
        int r0 = 0;
        tv.ouya.console.api.e r4 = null;
        android.content.IntentFilter r1 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (FH == null) { $pc8 = 5; continue $sw8; }
                    return;
                }
                case 5: {
                    FH = r2.getApplicationContext();
                    r3 = 0;
                    $pc8 = 7; continue $sw8;
                }
                case 7: {
                    if (r3 >= 4) { $pc8 = 12; continue $sw8; }
                    r0 = v5(r3);
                    if (r0 == (-1)) { $pc8 = 11; continue $sw8; }
                    Zo(r0);
                    $pc8 = 11; continue $sw8;
                }
                case 11: {
                    r3 = r3 + 1;
                    { $pc8 = 7; continue $sw8; }
                }
                case 12: {
                    r4 = new tv.ouya.console.api.e();
                    r1 = new android.content.IntentFilter();
                    r1.addAction("tv.ouya.controller.added");
                    r1.addAction("tv.ouya.controller.removed");
                    FH.registerReceiver(r4, r1);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(int r0, android.view.KeyEvent r1) {
        return FH(r0, r1);
    }

    public static boolean j6(android.view.MotionEvent r7) {
        int r1 = 0;
        tv.ouya.console.api.f r0 = null;
        int[] r2 = null;
        int r3 = 0;
        int r4 = 0;
        java.lang.Float r5 = null;
        float r6 = 0.0f;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r1 = 0;
                    if ((r7.getSource() & 16) != 0) { $pc9 = 6; continue $sw9; }
                    return false;
                }
                case 6: {
                    if (r7.getAction() == 2) { $pc9 = 8; continue $sw9; }
                    return false;
                }
                case 8: {
                    r0 = Zo(r7.getDeviceId());
                    if (r0 != null) { $pc9 = 11; continue $sw9; }
                    return false;
                }
                case 11: {
                    r2 = j6;
                    r3 = r2.length;
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    if (r1 >= r3) { $pc9 = 19; continue $sw9; }
                    r4 = r2[r1];
                    r5 = r0.tp.get(r4);
                    r6 = r7.getAxisValue(r4);
                    if (r5 != null) { $pc9 = 16; continue $sw9; }
                    $pc9 = 17; continue $sw9;
                }
                case 17: {
                    r0.tp.put(r4, java.lang.Float.valueOf(r6));
                    $pc9 = 18; continue $sw9;
                }
                case 18: {
                    r1 = r1 + 1;
                    { $pc9 = 12; continue $sw9; }
                }
                case 16: {
                    if (r5.floatValue() == r6) { $pc9 = 18; continue $sw9; }
                    $pc9 = 19; continue $sw9;
                }
                case 19: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int v5(int r8) {
        android.database.Cursor r9 = null;
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r9 = FH.getContentResolver().query(DW, new java.lang.String[]{"input_device_id"}, "player_num = ?", new java.lang.String[]{java.lang.String.valueOf(r8)}, null);
                    if (r9 != null) { $pc10 = 18; continue $sw10; }
                    $pc10 = 14; continue $sw10;
                }
                case 14: {
                    if (r9 == null) { $pc10 = 20; continue $sw10; }
                    r9.close();
                    return -1;
                }
                case 20: {
                    return -1;
                }
                case 18: {
                    $pc10 = 10; continue $sw10;
                }
                case 10: {
                    th = $ex10;
                    if (r9 == null) { $pc10 = 13; continue $sw10; }
                    r9.close();
                    $pc10 = 13; continue $sw10;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 5: {
                    if (r9.moveToNext() == false) { $pc10 = 14; continue $sw10; }
                    try {
                        r0 = r9.getInt(0);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 10; continue $sw10;
                    }
                    if (r9 == null) { $pc10 = 9; continue $sw10; }
                    r9.close();
                    $pc10 = 9; continue $sw10;
                }
                case 9: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int DW() {
        return this.VH;
    }

    public java.lang.String FH() {
        return this.u7;
    }

    public int Hw() {
        int r0 = 0;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = 0;
                    $pc11 = 4; continue $sw11;
                }
                case 4: {
                    if (r0 >= 4) { $pc11 = 9; continue $sw11; }
                    if (Zo[r0] == this) { $pc11 = 7; continue $sw11; }
                    r0 = r0 + 1;
                    { $pc11 = 4; continue $sw11; }
                }
                case 7: {
                    return r0;
                }
                case 9: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public android.view.InputDevice j6() {
        return this.gn;
    }
}
