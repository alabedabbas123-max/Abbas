package abcd;

@abcd.Interfacexu
public class Wb {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public final abcd.Wb.a FH;

    @abcd.Interfaceru(field = 3483375617516397680L)
    private int[] Hw;

    @abcd.Interfaceru(field = 4057012066355179740L)
    private int[] VH;

    @abcd.Interfaceru(field = -1626608185379538636L)
    private int[] Zo;

    @abcd.Interfaceru(field = -1121017539610588755L)
    private int gn;

    @abcd.Interfaceru(field = -3652883959629807840L)
    private int[] v5;

    @abcd.Interfacexu
    public class a {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = -962441418253173861L)
        private int FH;

        @abcd.Interfacevu
        final abcd.Wb Hw;

        static {
            abcd.wu.j6(abcd.Wb.a.class, 1212717644094915135L, 1212717644094915135L);
        }

        @abcd.Interfacesu(method = 8050847440270419243L)
        private a(abcd.Wb r6) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 84587066694673035L, null, r6);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(84587066694673035L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.Hw = r6;     // Catch: java.lang.Throwable -> L8
            this.FH = 0;     // Catch: java.lang.Throwable -> L8
        }

        a(abcd.Wb r8, abcd.Vb r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 144803306762288796L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(144803306762288796L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this(r8);     // Catch: java.lang.Throwable -> L7
        }
    }

    static {
        abcd.wu.j6(abcd.Wb.class, 5443718632469516595L, 5443718632469516595L);
    }

    public Wb() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -864148279812655675L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-864148279812655675L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = new abcd.Wb.a(this, null);     // Catch: java.lang.Throwable -> L8
        this.Hw = new int[3000];     // Catch: java.lang.Throwable -> L8
        this.v5 = new int[3000];     // Catch: java.lang.Throwable -> L8
        this.Zo = new int[1000];     // Catch: java.lang.Throwable -> L8
        this.VH = new int[1000];     // Catch: java.lang.Throwable -> L8
        this.gn = 0;     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -2386525600946508219L)
    private void Hw() {
    L21:
        th = move-exception;
        if (DW == false) goto L26;
        abcd.wu.j6(th, -2632476617934229000L, this);
    L26:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2632476617934229000L, this);     // Catch: java.lang.Throwable -> L21
    L6:
        int[] r2 = new int[(this.Hw.length * 2) + 1];     // Catch: java.lang.Throwable -> L21
        int[] r3 = new int[(this.Hw.length * 2) + 1];     // Catch: java.lang.Throwable -> L21
        int[] r4 = new int[(this.Hw.length * 2) + 1];     // Catch: java.lang.Throwable -> L21
        int r5 = 0;
    L8:
        if (r5 >= this.gn) goto L19;
        int r6 = this.Zo[r5];     // Catch: java.lang.Throwable -> L21
        if (r6 == 0) goto L18;
        int r7 = this.VH[r5];     // Catch: java.lang.Throwable -> L21
        int r8 = (Integer.MAX_VALUE & r6) % r2.length;     // Catch: java.lang.Throwable -> L21
    L13:
        if (r2[r8] == 0) goto L17;
        r8 = r8 + 1;     // Catch: java.lang.Throwable -> L21
        if (r8 < r2.length) goto L13;
        r8 = 0;
        goto L13
    L17:
        r2[r8] = r6;     // Catch: java.lang.Throwable -> L21
        r3[r8] = r7;     // Catch: java.lang.Throwable -> L21
    L18:
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L21
        goto L8
    L19:
        this.Hw = r2;     // Catch: java.lang.Throwable -> L21
        this.v5 = r3;     // Catch: java.lang.Throwable -> L21
    }

    @abcd.Interfacesu(method = -2378299335482449288L)
    private void v5() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2627875403769954099L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2627875403769954099L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        int[] r2 = new int[(this.Zo.length * 2) + 1];     // Catch: java.lang.Throwable -> L8
        java.lang.System.arraycopy(this.Zo, 0, r2, 0, this.Zo.length);     // Catch: java.lang.Throwable -> L8
        this.Zo = r2;     // Catch: java.lang.Throwable -> L8
        int[] r3 = new int[(this.VH.length * 2) + 1];     // Catch: java.lang.Throwable -> L8
        java.lang.System.arraycopy(this.VH, 0, r3, 0, this.VH.length);     // Catch: java.lang.Throwable -> L8
        this.VH = r3;     // Catch: java.lang.Throwable -> L8
    }

    public int DW(int r8) {
    L15:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, -3369606849428259000L, this, new java.lang.Integer(r8));
    L20:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3369606849428259000L, this, r8);     // Catch: java.lang.Throwable -> L15
    L6:
        int[] r2 = this.Hw;     // Catch: java.lang.Throwable -> L15
        int r3 = r2.length;     // Catch: java.lang.Throwable -> L15
        int r4 = (Integer.MAX_VALUE & r8) % r3;     // Catch: java.lang.Throwable -> L15
        int r5 = -1;
    L7:
        int r6 = r2[r4];     // Catch: java.lang.Throwable -> L15
        if (r6 != r8) goto L10;
        r5 = this.v5[r4];     // Catch: java.lang.Throwable -> L15
    L10:
        r4 = r4 + 1;
        if (r4 < r3) goto L13;
        r4 = 0;
    L13:
        if (r6 != 0) goto L7;
        return r5;
    }

    public void DW() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -881371437075637632L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-881371437075637632L, this);     // Catch: java.lang.Throwable -> L11
    L7:
        if (this.Zo.length > this.gn) goto L9;
        v5();     // Catch: java.lang.Throwable -> L11
    L9:
        this.Zo[this.gn] = 0;     // Catch: java.lang.Throwable -> L11
        this.gn++;     // Catch: java.lang.Throwable -> L11
    }

    public void FH() {
    L21:
        th = move-exception;
        if (DW == false) goto L26;
        abcd.wu.j6(th, -3396261419735885715L, this);
    L26:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3396261419735885715L, this);     // Catch: java.lang.Throwable -> L21
    L6:
        int[] r2 = this.Hw;     // Catch: java.lang.Throwable -> L21
        int r3 = r2.length;     // Catch: java.lang.Throwable -> L21
        this.gn--;     // Catch: java.lang.Throwable -> L21
        int r4 = this.Zo[this.gn];     // Catch: java.lang.Throwable -> L21
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
        this.gn--;     // Catch: java.lang.Throwable -> L21
        r4 = this.Zo[this.gn];     // Catch: java.lang.Throwable -> L21
        goto L7
    }

    public void j6() {
    L14:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -437668044999884160L, this);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-437668044999884160L, this);     // Catch: java.lang.Throwable -> L14
    L7:
        if (this.gn <= 0) goto L12;
        int r2 = 0;
    L10:
        if (r2 >= this.Hw.length) goto L12;
        this.Hw[r2] = 0;     // Catch: java.lang.Throwable -> L14
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L14
    L12:
        this.gn = 0;     // Catch: java.lang.Throwable -> L14
    }

    public void j6(int r8, int r9) {
    L19:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, 43492109073413895L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L24:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(43492109073413895L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L19
    L6:
        if (this.Hw.length >= (this.gn * 3)) goto L9;
        Hw();     // Catch: java.lang.Throwable -> L19
    L9:
        if (this.Zo.length > this.gn) goto L11;
        v5();     // Catch: java.lang.Throwable -> L19
    L11:
        this.Zo[this.gn] = r8;     // Catch: java.lang.Throwable -> L19
        this.VH[this.gn] = r9;     // Catch: java.lang.Throwable -> L19
        this.gn++;     // Catch: java.lang.Throwable -> L19
        int[] r0 = this.Hw;     // Catch: java.lang.Throwable -> L19
        int r1 = r0.length;     // Catch: java.lang.Throwable -> L19
        int r2 = (Integer.MAX_VALUE & r8) % r1;     // Catch: java.lang.Throwable -> L19
    L13:
        if (r0[r2] == 0) goto L17;
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L19
        if (r2 < r1) goto L13;
        r2 = 0;
        goto L13
    L17:
        r0[r2] = r8;     // Catch: java.lang.Throwable -> L19
        this.v5[r2] = r9;     // Catch: java.lang.Throwable -> L19
    }

    public boolean j6(int r8) {
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -274232321902677747L, this, new java.lang.Integer(r8));
    L21:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-274232321902677747L, this, r8);     // Catch: java.lang.Throwable -> L16
    L6:
        int[] r2 = this.Hw;     // Catch: java.lang.Throwable -> L16
        int r3 = r2.length;     // Catch: java.lang.Throwable -> L16
        int r4 = (Integer.MAX_VALUE & r8) % r3;     // Catch: java.lang.Throwable -> L16
    L7:
        int r5 = r2[r4];     // Catch: java.lang.Throwable -> L16
        if (r5 == r8) goto L9;
        r4 = r4 + 1;
        if (r4 < r3) goto L14;
        r4 = 0;
    L14:
        if (r5 != 0) goto L7;
        return false;
    L9:
        return true;
    }
}
