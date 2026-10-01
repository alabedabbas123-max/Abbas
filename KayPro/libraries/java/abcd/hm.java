package abcd;

@abcd.Interfacexu
public class hm implements java.io.Serializable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -3642922607416458569L)
    private int FH;

    @abcd.Interfaceru(field = -155006596900015773L)
    private int Hw;

    @abcd.Interfaceru(field = 1697441672101180292L)
    private int Zo;

    @abcd.Interfaceru(field = 764896927978719360L)
    private int v5;

    static {
        abcd.wu.j6(abcd.hm.class, -4684574236020412965L, -4684574236020412965L);
    }

    public hm(int r10, int r11, int r12, int r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -3113598689316205856L, null, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-3113598689316205856L, null, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH = r10;     // Catch: java.lang.Throwable -> L7
        this.Hw = r11;     // Catch: java.lang.Throwable -> L7
        this.v5 = r12;     // Catch: java.lang.Throwable -> L7
        this.Zo = r13;     // Catch: java.lang.Throwable -> L7
    }

    public hm(abcd.hm r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 643429776865462080L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(643429776865462080L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = r6.Hw();     // Catch: java.lang.Throwable -> L8
        this.Hw = r6.FH();     // Catch: java.lang.Throwable -> L8
        this.v5 = r6.DW();     // Catch: java.lang.Throwable -> L8
        this.Zo = r6.j6();     // Catch: java.lang.Throwable -> L8
    }

    public int DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3355613635041208640L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3355613635041208640L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.v5;
    }

    public abcd.hm DW(int r10, int r11, int r12, int r13) {
    L33:
        th = move-exception;
        if (DW == false) goto L37;
        abcd.wu.j6(th, 181819741638828405L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L37:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(181819741638828405L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L33
    L5:
        abcd.hm r0 = null;
        if (r11 >= this.FH) goto L10;
        if (r11 == r13) goto L10;
        r0 = new abcd.hm(this);     // Catch: java.lang.Throwable -> L33
        this.FH = (this.FH + r13) - r11;     // Catch: java.lang.Throwable -> L33
    L18:
        if (r11 >= this.v5) goto L24;
        if (r11 == r13) goto L24;
        if (r0 != null) goto L22;
        r0 = new abcd.hm(this);     // Catch: java.lang.Throwable -> L33
    L22:
        this.v5 = (this.v5 + r13) - r11;     // Catch: java.lang.Throwable -> L33
    L32:
        return r0;
    L24:
        if (r11 != this.v5) goto L32;
        if (r10 >= this.Zo) goto L32;
        if (r0 != null) goto L29;
        r0 = new abcd.hm(this);     // Catch: java.lang.Throwable -> L33
    L29:
        if (r11 != r13) goto L31;
        this.Zo = ((this.Zo + r12) - r10) + 1;     // Catch: java.lang.Throwable -> L33
        goto L32
    L31:
        this.Zo = ((this.Zo + r12) - r10) + 1;     // Catch: java.lang.Throwable -> L33
        this.v5 = (this.v5 + r13) - r11;     // Catch: java.lang.Throwable -> L33
    L10:
        if (r11 != this.FH) goto L18;
        if (r10 > this.Hw) goto L18;
        r0 = new abcd.hm(this);     // Catch: java.lang.Throwable -> L33
        if (r11 != r13) goto L16;
        this.Hw = ((this.Hw + r12) - r10) + 1;     // Catch: java.lang.Throwable -> L33
        goto L18
    L16:
        this.Hw = ((this.Hw + r12) - r10) + 1;     // Catch: java.lang.Throwable -> L33
        this.FH = (this.FH + r13) - r11;     // Catch: java.lang.Throwable -> L33
        goto L18
    }

    public void DW(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2152391551274068755L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2152391551274068755L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.v5 = r5;     // Catch: java.lang.Throwable -> L8
    }

    public int FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 349607870873988411L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(349607870873988411L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Hw;
    }

    public abcd.hm FH(int r10, int r11, int r12, int r13) {
    L65:
        th = move-exception;
        if (DW == false) goto L69;
        abcd.wu.j6(th, -2475363636159409960L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L69:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2475363636159409960L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L65
    L5:
        abcd.hm r0 = null;
        if (r11 != r13) goto L13;
        if (r13 == this.FH) goto L10;
    L31:
        if (r11 != r13) goto L40;
        if (r13 == this.v5) goto L35;
    L64:
        return r0;
    L35:
        if (r10 >= this.Zo) goto L64;
        if (r0 != null) goto L38;
        r0 = new abcd.hm(this);     // Catch: java.lang.Throwable -> L65
    L38:
        this.Zo = java.lang.Math.max(r10, this.Zo - ((r12 - r10) + 1));     // Catch: java.lang.Throwable -> L65
        goto L64
    L40:
        if (this.v5 != r11) goto L44;
        if (r10 >= this.Zo) goto L44;
    L51:
        if (r0 != null) goto L53;
        r0 = new abcd.hm(this);     // Catch: java.lang.Throwable -> L65
    L53:
        this.Zo = r10;     // Catch: java.lang.Throwable -> L65
        this.v5 = r11;     // Catch: java.lang.Throwable -> L65
    L44:
        if (this.v5 <= r11) goto L48;
        if (this.v5 < r13) goto L51;
    L48:
        if (this.v5 != r13) goto L55;
        if (this.Zo < r12) goto L51;
    L55:
        if (this.v5 != r13) goto L60;
        if (r0 != null) goto L58;
        r0 = new abcd.hm(this);     // Catch: java.lang.Throwable -> L65
    L58:
        this.Zo = ((this.Zo + r10) - r12) - 1;     // Catch: java.lang.Throwable -> L65
        goto L64
    L60:
        if (this.v5 <= r13) goto L64;
        if (r0 != null) goto L63;
        r0 = new abcd.hm(this);     // Catch: java.lang.Throwable -> L65
    L63:
        this.v5 -= r13 - r11;     // Catch: java.lang.Throwable -> L65
        goto L64
    L10:
        if (r10 >= this.Hw) goto L31;
        r0 = new abcd.hm(this);     // Catch: java.lang.Throwable -> L65
        this.Hw = java.lang.Math.max(r10, this.Hw - ((r12 - r10) + 1));     // Catch: java.lang.Throwable -> L65
        goto L31
    L13:
        if (this.FH != r11) goto L17;
        if (r10 >= this.Hw) goto L17;
    L24:
        r0 = new abcd.hm(this);     // Catch: java.lang.Throwable -> L65
        this.Hw = r10;     // Catch: java.lang.Throwable -> L65
        this.FH = r11;     // Catch: java.lang.Throwable -> L65
    L17:
        if (this.FH <= r11) goto L21;
        if (this.FH < r13) goto L24;
    L21:
        if (this.FH != r13) goto L26;
        if (this.Hw < r12) goto L24;
    L26:
        if (this.FH != r13) goto L29;
        r0 = new abcd.hm(this);     // Catch: java.lang.Throwable -> L65
        this.Hw = ((this.Hw + r10) - r12) - 1;     // Catch: java.lang.Throwable -> L65
        goto L31
    L29:
        if (this.FH <= r13) goto L31;
        r0 = new abcd.hm(this);     // Catch: java.lang.Throwable -> L65
        this.FH -= r13 - r11;     // Catch: java.lang.Throwable -> L65
        goto L31
    }

    public void FH(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4146193455515782748L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4146193455515782748L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = r5;     // Catch: java.lang.Throwable -> L8
    }

    public int Hw() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2479396824533316993L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2479396824533316993L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH;
    }

    public void Hw(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3246472423522508544L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3246472423522508544L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = r5;     // Catch: java.lang.Throwable -> L8
    }

    public int j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3830738486530991700L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3830738486530991700L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Zo;
    }

    public abcd.hm j6(int r10, int r11, int r12, int r13) {
    L33:
        th = move-exception;
        if (DW == false) goto L37;
        abcd.wu.j6(th, 1757170764983013120L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L37:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1757170764983013120L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L33
    L5:
        abcd.hm r0 = null;
        if (r11 >= this.FH) goto L10;
        if (r11 == r13) goto L10;
        r0 = new abcd.hm(this);     // Catch: java.lang.Throwable -> L33
        this.FH = (this.FH + r13) - r11;     // Catch: java.lang.Throwable -> L33
    L18:
        if (r11 >= this.v5) goto L24;
        if (r11 == r13) goto L24;
        if (r0 != null) goto L22;
        r0 = new abcd.hm(this);     // Catch: java.lang.Throwable -> L33
    L22:
        this.v5 = (this.v5 + r13) - r11;     // Catch: java.lang.Throwable -> L33
    L32:
        return r0;
    L24:
        if (r11 != this.v5) goto L32;
        if (r10 > this.Zo) goto L32;
        if (r0 != null) goto L29;
        r0 = new abcd.hm(this);     // Catch: java.lang.Throwable -> L33
    L29:
        if (r11 != r13) goto L31;
        this.Zo = ((this.Zo + r12) - r10) + 1;     // Catch: java.lang.Throwable -> L33
        goto L32
    L31:
        this.Zo = ((this.Zo + r12) - r10) + 1;     // Catch: java.lang.Throwable -> L33
        this.v5 = (this.v5 + r13) - r11;     // Catch: java.lang.Throwable -> L33
    L10:
        if (r11 != this.FH) goto L18;
        if (r10 >= this.Hw) goto L18;
        r0 = new abcd.hm(this);     // Catch: java.lang.Throwable -> L33
        if (r11 != r13) goto L16;
        this.Hw = ((this.Hw + r12) - r10) + 1;     // Catch: java.lang.Throwable -> L33
        goto L18
    L16:
        this.Hw = ((this.Hw + r12) - r10) + 1;     // Catch: java.lang.Throwable -> L33
        this.FH = (this.FH + r13) - r11;     // Catch: java.lang.Throwable -> L33
        goto L18
    }

    public void j6(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1387376827034158585L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1387376827034158585L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Zo = r5;     // Catch: java.lang.Throwable -> L8
    }

    public boolean j6(int r8, int r9) {
    L38:
        th = move-exception;
        if (DW == false) goto L42;
        abcd.wu.j6(th, -522710359647944364L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L42:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-522710359647944364L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L38
    L6:
        if (this.FH != this.v5) goto L18;
        if (r8 == this.FH) goto L11;
        return false;
    L11:
        if (r9 >= this.Hw) goto L13;
    L15:
        return false;
    L13:
        if (r9 > this.Zo) goto L15;
        return true;
    L18:
        if (r8 != this.FH) goto L25;
        if (r9 >= this.Hw) goto L45;
        return false;
    L45:
        return true;
    L25:
        if (r8 != this.v5) goto L32;
        if (r9 <= this.Zo) goto L46;
        return false;
    L46:
        return true;
    L32:
        if (this.FH < r8) goto L34;
    L36:
        return false;
    L34:
        if (r8 >= this.v5) goto L36;
        return true;
    }

    public java.lang.String toString() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 600841963548378111L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(600841963548378111L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return (((this.FH + ",") + this.Hw + ",") + this.v5 + ",") + this.Zo;
    }
}
