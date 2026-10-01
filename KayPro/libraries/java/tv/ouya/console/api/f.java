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
        this.VH = r2;
        this.gn = android.view.InputDevice.getDevice(r2);
        this.tp = new android.util.SparseArray();
        this.EQ = new android.util.SparseBooleanArray();
        this.we = new android.util.SparseIntArray();
        this.u7 = Hw(r2);
        java.lang.String r3 = this.u7;
        if (r3 != null) goto L5;
    L6:
        android.view.InputDevice r4 = this.gn;
        if (r4 == null) goto L11;
        this.u7 = r4.getName();
        return;
    L11:
        return;
    L5:
        if (r3.isEmpty() == true) goto L6;
    }

    public static tv.ouya.console.api.f DW(int r1) {
        if (r1 >= 0) goto L4;
        return null;
    L4:
        if (r1 < 4) goto L6;
        return null;
    L6:
        return Zo[r1];
    }

    public static boolean DW(int r0, android.view.KeyEvent r1) {
        return FH(r0, r1);
    }

    public static int FH(int r0) {
        tv.ouya.console.api.f r1 = Zo(r0);
        if (r1 != null) goto L7;
        return -1;
    L7:
        return r1.Hw();
    }

    private static boolean FH(int r5, android.view.KeyEvent r6) {
        tv.ouya.console.api.f r7 = Zo(r6.getDeviceId());
        if (r7 != null) goto L5;
        return false;
    L5:
        int r1 = r6.getAction();
        int r2 = 2;
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L9;
        if (r1 == 2) goto L10;
    L9:
        boolean r3 = false;
    L11:
        int r8 = r6.getKeyCode();
        if (r7.EQ.indexOfKey(r8) >= 0) goto L14;
    L15:
        if (r3 == false) goto L17;
        r2 = 1;
    L17:
        int r0 = r7.we.get(r8, 0) | r2;
        r7.we.put(r8, r0);
    L18:
        r7.EQ.put(r8, r3);
        return true;
    L14:
        if (r7.EQ.get(r8) == r3) goto L18;
    L10:
        r3 = true;
        goto L11
    }

    private static java.lang.String Hw(int r9) {
        android.content.Context r0 = FH;
        java.lang.String r1 = null;
        if (r0 != null) goto L24;
        return null;
    L24:
        android.database.Cursor r10 = r0.getContentResolver().query(DW, new java.lang.String[]{"bt_name"}, "input_device_id = ?", new java.lang.String[]{java.lang.String.valueOf(r9)}, null);     // Catch: java.lang.Exception -> L18 android.database.sqlite.SQLiteException -> L21
        if (r10 != null) goto L22;
    L15:
        if (r10 == null) goto L20;
        r10.close();     // Catch: java.lang.Exception -> L18 android.database.sqlite.SQLiteException -> L21
        goto L20
    L22:
    L11:
        th = move-exception;
        if (r10 == null) goto L14;
        r10.close();     // Catch: java.lang.Exception -> L18 android.database.sqlite.SQLiteException -> L21
    L14:
        throw th;     // Catch: java.lang.Exception -> L18 android.database.sqlite.SQLiteException -> L21
    L8:
        if (r10.moveToNext() == false) goto L15;
        r1 = r10.getString(0);     // Catch: java.lang.Throwable -> L11
    L18:
        e = move-exception;
        android.util.Log.d("OuyaController", "Exception: " + e.getMessage());
    L20:
        return r1;
    }

    private static int VH(int r9) {
        android.content.Context r0 = FH;
        if (r0 != null) goto L5;
        return -1;
    L5:
        android.database.Cursor r10 = r0.getContentResolver().query(DW, new java.lang.String[]{"player_num"}, "input_device_id = ?", new java.lang.String[]{java.lang.String.valueOf(r9)}, null);
        if (r10 != null) goto L20;
    L17:
        if (r10 == null) goto L19;
        r10.close();
    L19:
        return -1;
    L20:
    L13:
        th = move-exception;
        if (r10 == null) goto L16;
        r10.close();
    L16:
        throw th;
    L8:
        if (r10.moveToNext() == false) goto L17;
        int r1 = r10.getInt(0);     // Catch: java.lang.Throwable -> L13
        if (r10 == null) goto L12;
        r10.close();
    L12:
        return r1;
    }

    private static tv.ouya.console.api.f Zo(int r3) {
        tv.ouya.console.api.f r0 = j6(r3);
        if (r0 == null) goto L5;
        return r0;
    L5:
        int r1 = VH(r3);
        if (r1 >= 0) goto L8;
        return null;
    L8:
        if (r1 >= 4) goto L18;
        tv.ouya.console.api.f[] r2 = Zo;
        if (r2[r1] == null) goto L14;
        android.util.Log.e("OuyaController", "Controller for player " + r1 + " already found, but doesn't match device id (expected " + r3 + " got " + Zo[r1].DW() + ")");
        return Zo[r1];
    L14:
        r2[r1] = new tv.ouya.console.api.f(r3);
        return Zo[r1];
    L18:
        return null;
    }

    public static tv.ouya.console.api.f j6(int r5) {
        tv.ouya.console.api.f[] r0 = Zo;
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L10;
        tv.ouya.console.api.f r3 = r0[r2];
        if (r3 == null) goto L9;
        if (r3.DW() != r5) goto L9;
        return r3;
    L9:
        r2 = r2 + 1;
        goto L3
    L10:
        return null;
    }

    public static void j6(android.content.Context r2) {
        if (FH == null) goto L5;
        return;
    L5:
        FH = r2.getApplicationContext();
        int r3 = 0;
    L7:
        if (r3 >= 4) goto L12;
        int r0 = v5(r3);
        if (r0 == (-1)) goto L11;
        Zo(r0);
    L11:
        r3 = r3 + 1;
        goto L7
    L12:
        tv.ouya.console.api.e r4 = new tv.ouya.console.api.e();
        android.content.IntentFilter r1 = new android.content.IntentFilter();
        r1.addAction("tv.ouya.controller.added");
        r1.addAction("tv.ouya.controller.removed");
        FH.registerReceiver(r4, r1);
    }

    public static boolean j6(int r0, android.view.KeyEvent r1) {
        return FH(r0, r1);
    }

    public static boolean j6(android.view.MotionEvent r7) {
        int r1 = 0;
        if ((r7.getSource() & 16) != 0) goto L6;
        return false;
    L6:
        if (r7.getAction() == 2) goto L8;
        return false;
    L8:
        tv.ouya.console.api.f r0 = Zo(r7.getDeviceId());
        if (r0 != null) goto L11;
        return false;
    L11:
        int[] r2 = j6;
        int r3 = r2.length;
    L12:
        if (r1 >= r3) goto L19;
        int r4 = r2[r1];
        java.lang.Float r5 = r0.tp.get(r4);
        float r6 = r7.getAxisValue(r4);
        if (r5 != null) goto L16;
    L17:
        r0.tp.put(r4, java.lang.Float.valueOf(r6));
    L18:
        r1 = r1 + 1;
        goto L12
    L16:
        if (r5.floatValue() == r6) goto L18;
    L19:
        return true;
    }

    private static int v5(int r8) {
        android.database.Cursor r9 = FH.getContentResolver().query(DW, new java.lang.String[]{"input_device_id"}, "player_num = ?", new java.lang.String[]{java.lang.String.valueOf(r8)}, null);
        if (r9 != null) goto L18;
    L14:
        if (r9 == null) goto L20;
        r9.close();
        return -1;
    L20:
        return -1;
    L18:
    L10:
        th = move-exception;
        if (r9 == null) goto L13;
        r9.close();
    L13:
        throw th;
    L5:
        if (r9.moveToNext() == false) goto L14;
        int r0 = r9.getInt(0);     // Catch: java.lang.Throwable -> L10
        if (r9 == null) goto L9;
        r9.close();
    L9:
        return r0;
    }

    public int DW() {
        return this.VH;
    }

    public java.lang.String FH() {
        return this.u7;
    }

    public int Hw() {
        int r0 = 0;
    L4:
        if (r0 >= 4) goto L9;
        if (Zo[r0] == this) goto L7;
        r0 = r0 + 1;
        goto L4
    L7:
        return r0;
    L9:
        return -1;
    }

    public android.view.InputDevice j6() {
        return this.gn;
    }
}
