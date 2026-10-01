package abcd;

@abcd.Interfacexu
public class Tl {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public java.lang.String FH;
    public int Hw;
    public int VH;
    public int Zo;
    public int v5;

    static {
        abcd.wu.j6(abcd.Tl.class, -2158333802730359760L, -2158333802730359760L);
    }

    public Tl(java.lang.String r11, int r12, int r13, int r14, int r15) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -415774639461878880L, null, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-415774639461878880L, null, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH = r11;     // Catch: java.lang.Throwable -> L7
        this.Hw = r12;     // Catch: java.lang.Throwable -> L7
        this.v5 = r13;     // Catch: java.lang.Throwable -> L7
        this.Zo = r14;     // Catch: java.lang.Throwable -> L7
        this.VH = r15;     // Catch: java.lang.Throwable -> L7
    }

    public boolean DW() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -1501909828150693592L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1501909828150693592L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        if (this.Hw != this.Zo) goto L9;
        return true;
    L9:
        return false;
    }

    public boolean equals(java.lang.Object r8) {
    L36:
        th = move-exception;
        if (DW == false) goto L40;
        abcd.wu.j6(th, 342990384739897176L, this, r8);
    L40:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(342990384739897176L, this, r8);     // Catch: java.lang.Throwable -> L36
    L7:
        if (this != r8) goto L10;
        return true;
    L10:
        if (r8 != null) goto L13;
        return false;
    L13:
        if (getClass() == r8.getClass()) goto L15;
        return false;
    L15:
        abcd.Tl r4 = (abcd.Tl) r8;     // Catch: java.lang.Throwable -> L36
        if (this.VH == r4.VH) goto L19;
        return false;
    L19:
        if (this.Zo == r4.Zo) goto L22;
        return false;
    L22:
        if (this.FH != null) goto L27;
        if (r4.FH == null) goto L30;
        return false;
    L30:
        if (this.v5 == r4.v5) goto L32;
        return false;
    L32:
        if (this.Hw == r4.Hw) goto L35;
        return false;
    L35:
        return true;
    L27:
        if (this.FH.equals(r4.FH) == true) goto L30;
        return false;
    }

    public int hashCode() {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 2093363941184924245L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2093363941184924245L, this);     // Catch: java.lang.Throwable -> L13
    L6:
        int r2 = (((this.VH + 31) * 31) + this.Zo) * 31;     // Catch: java.lang.Throwable -> L13
        if (this.FH != null) goto L9;
        int r4 = 0;
    L10:
        return ((((r2 + r4) * 31) + this.v5) * 31) + this.Hw;
    L9:
        r4 = this.FH.hashCode();     // Catch: java.lang.Throwable -> L13
        goto L10
    }

    public boolean j6() {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 371353706849630307L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(371353706849630307L, this);     // Catch: java.lang.Throwable -> L13
    L7:
        if (this.Hw != this.Zo) goto L11;
        if (this.v5 != this.VH) goto L11;
        return true;
    L11:
        return false;
    }

    public boolean j6(abcd.Tl r6) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 233253864155778200L, this, r6);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(233253864155778200L, this, r6);     // Catch: java.lang.Throwable -> L14
    L7:
        if (r6.FH.equals(this.FH) == true) goto L9;
        return false;
    L9:
        if (java.lang.Math.abs(r6.Hw - this.Hw) >= 20) goto L21;
        return true;
    L21:
        return false;
    }

    public java.lang.String toString() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2910247968380441856L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2910247968380441856L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH + " (" + this.Hw + "," + this.v5 + "-" + this.Zo + "," + this.VH + ")";
    }
}
