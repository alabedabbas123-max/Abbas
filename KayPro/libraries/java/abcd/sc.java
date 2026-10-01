package abcd;

@abcd.Interfacexu
public class sc {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -1163465277969364720L)
    private final abcd.La FH;

    @abcd.Interfaceru(field = -1567882820142547216L)
    protected char[] Hw;

    @abcd.Interfaceru(field = -5085882770732288448L)
    protected int Zo;

    @abcd.Interfaceru(field = -1564011502060302592L)
    protected int v5;

    static {
        abcd.wu.j6(abcd.sc.class, -852481163335970448L, -852481163335970448L);
    }

    public sc(abcd.La r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1229876428548785625L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1229876428548785625L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = new char[100];     // Catch: java.lang.Throwable -> L8
        this.v5 = 0;     // Catch: java.lang.Throwable -> L8
        this.Zo = 0;     // Catch: java.lang.Throwable -> L8
        this.FH = r6;     // Catch: java.lang.Throwable -> L8
    }

    public void DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1135715074626110139L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1135715074626110139L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.v5 = 0;     // Catch: java.lang.Throwable -> L8
        this.Zo = 0;     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 58544816190744289L)
    protected final void DW(int r7) {
    L14:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -5255461686612134251L, this, new java.lang.Integer(r7));
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-5255461686612134251L, this, r7);     // Catch: java.lang.Throwable -> L14
    L7:
        if ((this.v5 + r7) < this.Hw.length) goto L25;
        int r2 = this.Hw.length;     // Catch: java.lang.Throwable -> L14
    L11:
        r2 = r2 * 2;     // Catch: java.lang.Throwable -> L14
        if ((this.v5 + r7) >= r2) goto L11;
        char[] r3 = new char[r2];     // Catch: java.lang.Throwable -> L14
        java.lang.System.arraycopy(this.Hw, 0, r3, 0, this.v5);     // Catch: java.lang.Throwable -> L14
        this.Hw = r3;     // Catch: java.lang.Throwable -> L14
        return;
    }

    public boolean DW(java.lang.String r7) {
    L18:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, -95016601307592300L, this, r7);
    L23:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-95016601307592300L, this, r7);     // Catch: java.lang.Throwable -> L18
    L7:
        if (r7.length() == this.v5) goto L9;
        return false;
    L9:
        int r2 = 0;
    L10:
        if (r2 >= this.v5) goto L16;
        if (this.Hw[r2] != r7.charAt(r2)) goto L14;
        r2 = r2 + 1;
        goto L10
    L14:
        return false;
    L16:
        return true;
    }

    public int FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4041256069273710253L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4041256069273710253L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH.j3.j6(this.Hw, 0, this.v5);
    }

    public int FH(java.lang.String r8) {
    L19:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, -582745585163359761L, this, r8);
    L24:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-582745585163359761L, this, r8);     // Catch: java.lang.Throwable -> L19
    L6:
        int r3 = 0;
    L7:
        if (r3 > (this.v5 - r8.length())) goto L17;
        int r4 = 0;
    L11:
        if (r4 >= r8.length()) goto L16;
        if (this.Hw[r3 + r4] != r8.charAt(r4)) goto L14;
        r4 = r4 + 1;
        goto L11
    L14:
        r3 = r3 + 1;
        goto L7
    L16:
        return r3;
    L17:
        return -1;
    }

    public java.io.Reader Hw() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -216273785863105581L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-216273785863105581L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return new java.io.CharArrayReader(this.Hw, 0, this.v5);
    }

    public void Zo() {
    L15:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, 4257971017659738489L, this);
    L20:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4257971017659738489L, this);     // Catch: java.lang.Throwable -> L15
    L6:
        int r2 = 0;
    L7:
        if (r2 >= this.v5) goto L14;
        char r3 = this.Hw[r2];     // Catch: java.lang.Throwable -> L15
        if (r3 != 65534) goto L12;
        r2 = r2 + 8;     // Catch: java.lang.Throwable -> L15
    L13:
        r2 = r2 + 1;
        goto L7
    L12:
        this.Hw[r2] = java.lang.Character.toUpperCase(r3);     // Catch: java.lang.Throwable -> L15
        goto L13
    }

    public void j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 25152940034563500L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(25152940034563500L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        j6(0, 0);     // Catch: java.lang.Throwable -> L8
    }

    public void j6(char r7) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4794298806826596921L, this, new java.lang.Character(r7));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4794298806826596921L, this, new java.lang.Character(r7));     // Catch: java.lang.Throwable -> L8
    L6:
        DW(1);     // Catch: java.lang.Throwable -> L8
        char[] r3 = this.Hw;     // Catch: java.lang.Throwable -> L8
        int r4 = this.v5;     // Catch: java.lang.Throwable -> L8
        this.v5 = r4 + 1;     // Catch: java.lang.Throwable -> L8
        r3[r4] = r7;     // Catch: java.lang.Throwable -> L8
        this.Zo++;     // Catch: java.lang.Throwable -> L8
    }

    public void j6(int r7) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 265524541951657952L, this, new java.lang.Integer(r7));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(265524541951657952L, this, r7);     // Catch: java.lang.Throwable -> L8
    L6:
        int r2 = this.FH.j3.DW(r7);     // Catch: java.lang.Throwable -> L8
        DW(r2);     // Catch: java.lang.Throwable -> L8
        this.FH.j3.j6(r7, this.Hw, this.v5);     // Catch: java.lang.Throwable -> L8
        this.v5 += r2;     // Catch: java.lang.Throwable -> L8
        this.Zo += r2;     // Catch: java.lang.Throwable -> L8
    }

    public void j6(int r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 2302798679034330499L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2302798679034330499L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        DW(9);     // Catch: java.lang.Throwable -> L7
        char[] r0 = this.Hw;     // Catch: java.lang.Throwable -> L7
        int r1 = this.v5;     // Catch: java.lang.Throwable -> L7
        this.v5 = r1 + 1;     // Catch: java.lang.Throwable -> L7
        r0[r1] = 65534;     // Catch: java.lang.Throwable -> L7
        char[] r2 = this.Hw;     // Catch: java.lang.Throwable -> L7
        int r3 = this.v5;     // Catch: java.lang.Throwable -> L7
        this.v5 = r3 + 1;     // Catch: java.lang.Throwable -> L7
        r2[r3] = (char) ((r8 >>> 24) & 255);     // Catch: java.lang.Throwable -> L7
        char[] r4 = this.Hw;     // Catch: java.lang.Throwable -> L7
        int r5 = this.v5;     // Catch: java.lang.Throwable -> L7
        this.v5 = r5 + 1;     // Catch: java.lang.Throwable -> L7
        r4[r5] = (char) ((r8 >>> 16) & 255);     // Catch: java.lang.Throwable -> L7
        char[] r6 = this.Hw;     // Catch: java.lang.Throwable -> L7
        int r7 = this.v5;     // Catch: java.lang.Throwable -> L7
        this.v5 = r7 + 1;     // Catch: java.lang.Throwable -> L7
        r6[r7] = (char) ((r8 >>> 8) & 255);     // Catch: java.lang.Throwable -> L7
        char[] r10 = this.Hw;     // Catch: java.lang.Throwable -> L7
        int r11 = this.v5;     // Catch: java.lang.Throwable -> L7
        this.v5 = r11 + 1;     // Catch: java.lang.Throwable -> L7
        r10[r11] = (char) ((r8 >>> 0) & 255);     // Catch: java.lang.Throwable -> L7
        char[] r12 = this.Hw;     // Catch: java.lang.Throwable -> L7
        int r13 = this.v5;     // Catch: java.lang.Throwable -> L7
        this.v5 = r13 + 1;     // Catch: java.lang.Throwable -> L7
        r12[r13] = (char) ((r9 >>> 24) & 255);     // Catch: java.lang.Throwable -> L7
        char[] r14 = this.Hw;     // Catch: java.lang.Throwable -> L7
        int r15 = this.v5;     // Catch: java.lang.Throwable -> L7
        this.v5 = r15 + 1;     // Catch: java.lang.Throwable -> L7
        r14[r15] = (char) ((r9 >>> 16) & 255);     // Catch: java.lang.Throwable -> L7
        char[] r16 = this.Hw;     // Catch: java.lang.Throwable -> L7
        int r17 = this.v5;     // Catch: java.lang.Throwable -> L7
        this.v5 = r17 + 1;     // Catch: java.lang.Throwable -> L7
        r16[r17] = (char) ((r9 >>> 8) & 255);     // Catch: java.lang.Throwable -> L7
        char[] r18 = this.Hw;     // Catch: java.lang.Throwable -> L7
        int r19 = this.v5;     // Catch: java.lang.Throwable -> L7
        this.v5 = r19 + 1;     // Catch: java.lang.Throwable -> L7
        r18[r19] = (char) ((r9 >>> 0) & 255);     // Catch: java.lang.Throwable -> L7
    }

    public void j6(abcd.sc r8) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3944732640918947187L, this, r8);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3944732640918947187L, this, r8);     // Catch: java.lang.Throwable -> L8
    L6:
        DW(r8.v5);     // Catch: java.lang.Throwable -> L8
        java.lang.System.arraycopy(r8.Hw, 0, this.Hw, this.v5, r8.v5);     // Catch: java.lang.Throwable -> L8
        this.v5 += r8.v5;     // Catch: java.lang.Throwable -> L8
        this.Zo += r8.Zo;     // Catch: java.lang.Throwable -> L8
    }

    public void j6(abcd.sc r9, int r10, int r11) {
    L14:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -715750175023512399L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
    L19:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-715750175023512399L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L14
    L5:
        DW(r11);     // Catch: java.lang.Throwable -> L14
        java.lang.System.arraycopy(r9.Hw, r10, this.Hw, this.v5, r11);     // Catch: java.lang.Throwable -> L14
        int r0 = this.v5 + r11;     // Catch: java.lang.Throwable -> L14
        int r1 = this.v5;     // Catch: java.lang.Throwable -> L14
    L6:
        if (r1 >= r0) goto L12;
        if (this.Hw[r1] != 65534) goto L10;
        r1 = r1 + 8;     // Catch: java.lang.Throwable -> L14
    L11:
        r1 = r1 + 1;     // Catch: java.lang.Throwable -> L14
        goto L6
    L10:
        this.Zo++;     // Catch: java.lang.Throwable -> L14
        goto L11
    L12:
        this.v5 = r0;     // Catch: java.lang.Throwable -> L14
    }

    public void j6(java.lang.String r7) {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -103440080495285136L, this, r7);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-103440080495285136L, this, r7);     // Catch: java.lang.Throwable -> L12
    L6:
        DW(r7.length());     // Catch: java.lang.Throwable -> L12
        int r2 = 0;
    L7:
        if (r2 >= r7.length()) goto L11;
        char[] r3 = this.Hw;     // Catch: java.lang.Throwable -> L12
        int r4 = this.v5;     // Catch: java.lang.Throwable -> L12
        this.v5 = r4 + 1;     // Catch: java.lang.Throwable -> L12
        r3[r4] = r7.charAt(r2);     // Catch: java.lang.Throwable -> L12
        this.Zo++;     // Catch: java.lang.Throwable -> L12
        r2 = r2 + 1;
        goto L7
    }

    public void j6(char[] r9, int r10, int r11) {
    L10:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 190738705975047104L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
    L15:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(190738705975047104L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L10
    L5:
        DW(r11);     // Catch: java.lang.Throwable -> L10
        int r0 = r10 + r11;     // Catch: java.lang.Throwable -> L10
        int r1 = r10;
    L6:
        if (r1 >= r0) goto L9;
        char[] r2 = this.Hw;     // Catch: java.lang.Throwable -> L10
        int r3 = this.v5;     // Catch: java.lang.Throwable -> L10
        this.v5 = r3 + 1;     // Catch: java.lang.Throwable -> L10
        r2[r3] = r9[r1];     // Catch: java.lang.Throwable -> L10
        this.Zo++;     // Catch: java.lang.Throwable -> L10
        r1 = r1 + 1;
        goto L6
    }

    public boolean j6(java.lang.String r8, int r9) {
    L17:
        th = move-exception;
        if (DW == false) goto L22;
        abcd.wu.j6(th, 1441655871692487527L, this, r8, new java.lang.Integer(r9));
    L22:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(1441655871692487527L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L17
    L6:
        if ((r8.length() + r9) <= this.v5) goto L8;
        return false;
    L8:
        int r0 = 0;
    L9:
        if (r0 >= r8.length()) goto L15;
        if (this.Hw[r9 + r0] != r8.charAt(r0)) goto L13;
        r0 = r0 + 1;
        goto L9
    L13:
        return false;
    L15:
        return true;
    }

    public java.lang.String toString() {
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -2266833613108730400L, this);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2266833613108730400L, this);     // Catch: java.lang.Throwable -> L16
    L6:
        java.lang.StringBuffer r2 = new java.lang.StringBuffer(this.v5);     // Catch: java.lang.Throwable -> L16
        int r3 = 0;
    L8:
        if (r3 >= this.v5) goto L14;
        char r4 = this.Hw[r3];     // Catch: java.lang.Throwable -> L16
        if (r4 != 65534) goto L12;
        int r5 = r3 + 1;     // Catch: java.lang.Throwable -> L16
        r2.append("#[");     // Catch: java.lang.Throwable -> L16
        int r6 = (((this.Hw[r5] << 24) | (this.Hw[r5 + 1] << 16)) | (this.Hw[r5 + 2] << '\b')) | this.Hw[r5 + 3];     // Catch: java.lang.Throwable -> L16
        int r7 = ((this.Hw[r5 + 4] << 24) | (this.Hw[r5 + 5] << 16)) | (this.Hw[r5 + 6] << '\b');     // Catch: java.lang.Throwable -> L16
        r3 = r5 + 7;     // Catch: java.lang.Throwable -> L16
        int r8 = r7 | this.Hw[r3];     // Catch: java.lang.Throwable -> L16
        r2.append(r6);     // Catch: java.lang.Throwable -> L16
        r2.append(", ");     // Catch: java.lang.Throwable -> L16
        r2.append(r8);     // Catch: java.lang.Throwable -> L16
        r2.append("]");     // Catch: java.lang.Throwable -> L16
    L13:
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L16
        goto L8
    L12:
        r2.append(r4);     // Catch: java.lang.Throwable -> L16
        goto L13
    L14:
        return r2.toString();
    }

    public int v5() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2220572928664209460L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2220572928664209460L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.v5;
    }
}
