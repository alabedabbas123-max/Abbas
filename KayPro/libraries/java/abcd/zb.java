package abcd;

@abcd.Interfacexu
public class zb {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -2894527492609872896L)
    private int[] FH;

    @abcd.Interfaceru(field = 2234790382728710400L)
    private int[] Hw;

    @abcd.Interfaceru(field = 3729500952291843935L)
    private int[] VH;

    @abcd.Interfaceru(field = 2193562336037001648L)
    private int[] Zo;

    @abcd.Interfaceru(field = 1455662942591099216L)
    private int[] gn;

    @abcd.Interfaceru(field = 1900573222217741391L)
    private int tp;

    @abcd.Interfaceru(field = 302851622689081037L)
    private int[] u7;

    @abcd.Interfaceru(field = -3089744435556921903L)
    private int[] v5;

    static {
        abcd.wu.j6(abcd.zb.class, 139850406627490039L, 139850406627490039L);
    }

    public zb() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4951732032586035688L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4951732032586035688L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = new int[3000];     // Catch: java.lang.Throwable -> L8
        this.Hw = new int[3000];     // Catch: java.lang.Throwable -> L8
        this.v5 = new int[3000];     // Catch: java.lang.Throwable -> L8
        this.Zo = new int[1000];     // Catch: java.lang.Throwable -> L8
        this.VH = new int[1000];     // Catch: java.lang.Throwable -> L8
        this.gn = new int[1000];     // Catch: java.lang.Throwable -> L8
        this.u7 = new int[1000];     // Catch: java.lang.Throwable -> L8
        this.tp = 0;     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 2338744303475269500L)
    private void Zo() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2145511406180766624L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2145511406180766624L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        int[] r2 = new int[(this.Zo.length * 2) + 1];     // Catch: java.lang.Throwable -> L8
        java.lang.System.arraycopy(this.Zo, 0, r2, 0, this.Zo.length);     // Catch: java.lang.Throwable -> L8
        this.Zo = r2;     // Catch: java.lang.Throwable -> L8
        int[] r3 = new int[(this.VH.length * 2) + 1];     // Catch: java.lang.Throwable -> L8
        java.lang.System.arraycopy(this.VH, 0, r3, 0, this.VH.length);     // Catch: java.lang.Throwable -> L8
        this.VH = r3;     // Catch: java.lang.Throwable -> L8
        int[] r4 = new int[(this.gn.length * 2) + 1];     // Catch: java.lang.Throwable -> L8
        java.lang.System.arraycopy(this.gn, 0, r4, 0, this.gn.length);     // Catch: java.lang.Throwable -> L8
        this.gn = r4;     // Catch: java.lang.Throwable -> L8
        int[] r5 = new int[(this.u7.length * 2) + 1];     // Catch: java.lang.Throwable -> L8
        java.lang.System.arraycopy(this.u7, 0, r5, 0, this.u7.length);     // Catch: java.lang.Throwable -> L8
        this.u7 = r5;     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 2314832306418961499L)
    private void v5() {
    L21:
        th = move-exception;
        if (DW == false) goto L26;
        abcd.wu.j6(th, 2123548836139659431L, this);
    L26:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2123548836139659431L, this);     // Catch: java.lang.Throwable -> L21
    L6:
        int[] r2 = new int[(this.FH.length * 2) + 1];     // Catch: java.lang.Throwable -> L21
        int[] r3 = new int[(this.FH.length * 2) + 1];     // Catch: java.lang.Throwable -> L21
        int[] r4 = new int[(this.FH.length * 2) + 1];     // Catch: java.lang.Throwable -> L21
        int r6 = 0;
    L8:
        if (r6 >= this.tp) goto L19;
        int r7 = this.Zo[r6];     // Catch: java.lang.Throwable -> L21
        if (r7 == 0) goto L18;
        int r8 = this.VH[r6];     // Catch: java.lang.Throwable -> L21
        int r9 = this.gn[r6];     // Catch: java.lang.Throwable -> L21
        int r10 = (Integer.MAX_VALUE & r7) % r2.length;     // Catch: java.lang.Throwable -> L21
    L13:
        if (r2[r10] == 0) goto L17;
        r10 = r10 + 1;     // Catch: java.lang.Throwable -> L21
        if (r10 < r2.length) goto L13;
        r10 = 0;
        goto L13
    L17:
        r2[r10] = r7;     // Catch: java.lang.Throwable -> L21
        r3[r10] = r9;     // Catch: java.lang.Throwable -> L21
        r4[r10] = r8;     // Catch: java.lang.Throwable -> L21
    L18:
        r6 = r6 + 1;     // Catch: java.lang.Throwable -> L21
        goto L8
    L19:
        this.FH = r2;     // Catch: java.lang.Throwable -> L21
        this.v5 = r4;     // Catch: java.lang.Throwable -> L21
        this.Hw = r3;     // Catch: java.lang.Throwable -> L21
    }

    public int DW(int r8, int r9) {
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, 4786214699952956160L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L21:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4786214699952956160L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L16
    L5:
        int[] r0 = this.FH;     // Catch: java.lang.Throwable -> L16
        int r1 = r0.length;     // Catch: java.lang.Throwable -> L16
        int r2 = (Integer.MAX_VALUE & r8) % r1;     // Catch: java.lang.Throwable -> L16
        int r3 = -1;
    L6:
        int r4 = r0[r2];     // Catch: java.lang.Throwable -> L16
        if (r4 == r8) goto L9;
    L11:
        r2 = r2 + 1;
        if (r2 < r1) goto L14;
        r2 = 0;
    L14:
        if (r4 != 0) goto L6;
        return r3;
    L9:
        if (this.v5[r2] != r9) goto L11;
        r3 = this.Hw[r2];     // Catch: java.lang.Throwable -> L16
        goto L11
    }

    public void DW() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 772532352875646789L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(772532352875646789L, this);     // Catch: java.lang.Throwable -> L11
    L7:
        if (this.Zo.length > this.tp) goto L9;
        Zo();     // Catch: java.lang.Throwable -> L11
    L9:
        this.Zo[this.tp] = 0;     // Catch: java.lang.Throwable -> L11
        this.tp++;     // Catch: java.lang.Throwable -> L11
    }

    public void FH() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 822998535729344616L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(822998535729344616L, this);     // Catch: java.lang.Throwable -> L11
    L7:
        if (this.Zo.length > this.tp) goto L9;
        Zo();     // Catch: java.lang.Throwable -> L11
    L9:
        this.Zo[this.tp] = 0;     // Catch: java.lang.Throwable -> L11
        this.tp++;     // Catch: java.lang.Throwable -> L11
    }

    public void Hw() {
    L21:
        th = move-exception;
        if (DW == false) goto L26;
        abcd.wu.j6(th, -1590007234940783220L, this);
    L26:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1590007234940783220L, this);     // Catch: java.lang.Throwable -> L21
    L6:
        int[] r2 = this.FH;     // Catch: java.lang.Throwable -> L21
        int r3 = r2.length;     // Catch: java.lang.Throwable -> L21
        this.tp--;     // Catch: java.lang.Throwable -> L21
        int r4 = this.Zo[this.tp];     // Catch: java.lang.Throwable -> L21
    L7:
        if (r4 == 0) goto L20;
        int r5 = (Integer.MAX_VALUE & r4) % r3;     // Catch: java.lang.Throwable -> L21
        int r7 = -1;
    L9:
        int r8 = r2[r5];     // Catch: java.lang.Throwable -> L21
        if (r8 != r4) goto L12;
        r7 = r5;
    L12:
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L21
        if (r5 < r3) goto L15;
        r5 = 0;
    L15:
        if (r8 != 0) goto L9;
        if (r7 == (-1)) goto L18;
        r2[r7] = 0;     // Catch: java.lang.Throwable -> L21
    L18:
        this.tp--;     // Catch: java.lang.Throwable -> L21
        r4 = this.Zo[this.tp];     // Catch: java.lang.Throwable -> L21
        goto L7
    }

    public void j6() {
    L14:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -269503305327401943L, this);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-269503305327401943L, this);     // Catch: java.lang.Throwable -> L14
    L7:
        if (this.tp <= 0) goto L12;
        int r2 = 0;
    L10:
        if (r2 >= this.FH.length) goto L12;
        this.FH[r2] = 0;     // Catch: java.lang.Throwable -> L14
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L14
    L12:
        this.tp = 0;     // Catch: java.lang.Throwable -> L14
    }

    public void j6(int r9, int r10, int r11) {
    L19:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, -826368047139182835L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
    L24:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-826368047139182835L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L19
    L6:
        if (this.FH.length >= (this.tp * 3)) goto L9;
        v5();     // Catch: java.lang.Throwable -> L19
    L9:
        if (this.Zo.length > this.tp) goto L11;
        Zo();     // Catch: java.lang.Throwable -> L19
    L11:
        this.Zo[this.tp] = r9;     // Catch: java.lang.Throwable -> L19
        this.VH[this.tp] = r11;     // Catch: java.lang.Throwable -> L19
        this.gn[this.tp] = r10;     // Catch: java.lang.Throwable -> L19
        this.tp++;     // Catch: java.lang.Throwable -> L19
        int[] r0 = this.FH;     // Catch: java.lang.Throwable -> L19
        int r1 = r0.length;     // Catch: java.lang.Throwable -> L19
        int r2 = (Integer.MAX_VALUE & r9) % r1;     // Catch: java.lang.Throwable -> L19
    L13:
        if (r0[r2] == 0) goto L17;
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L19
        if (r2 < r1) goto L13;
        r2 = 0;
        goto L13
    L17:
        r0[r2] = r9;     // Catch: java.lang.Throwable -> L19
        this.Hw[r2] = r10;     // Catch: java.lang.Throwable -> L19
        this.v5[r2] = r11;     // Catch: java.lang.Throwable -> L19
    }

    public boolean j6(int r8, int r9) {
    L17:
        th = move-exception;
        if (DW == false) goto L22;
        abcd.wu.j6(th, -326601633536781153L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L22:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-326601633536781153L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L17
    L5:
        int[] r0 = this.FH;     // Catch: java.lang.Throwable -> L17
        int r1 = r0.length;     // Catch: java.lang.Throwable -> L17
        int r2 = (Integer.MAX_VALUE & r8) % r1;     // Catch: java.lang.Throwable -> L17
    L6:
        int r3 = r0[r2];     // Catch: java.lang.Throwable -> L17
        if (r3 == r8) goto L9;
    L12:
        r2 = r2 + 1;
        if (r2 < r1) goto L15;
        r2 = 0;
    L15:
        if (r3 != 0) goto L6;
        return false;
    L9:
        if (this.v5[r2] != r9) goto L12;
        return true;
    }
}
