package abcd;

@abcd.Interfacexu
public class Db {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 3312765268069062568L)
    private long[] FH;

    @abcd.Interfaceru(field = -1600048704983574111L)
    private int Hw;

    static {
        abcd.wu.j6(abcd.Db.class, -3326378980488377480L, -3326378980488377480L);
    }

    public Db() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1520604431317412488L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1520604431317412488L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = null;     // Catch: java.lang.Throwable -> L8
        this.Hw = 0;     // Catch: java.lang.Throwable -> L8
    }

    public long j6(int r6) {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, 2221685026128992244L, this, new java.lang.Integer(r6));
    L21:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(2221685026128992244L, this, r6);     // Catch: java.lang.Throwable -> L17
    L7:
        if (this.FH != null) goto L10;
        return -1;
    L10:
        if (r6 < this.FH.length) goto L13;
        return -1;
    L13:
        if (r6 < this.Hw) goto L15;
        return -1;
    L15:
        return this.FH[r6];
    }

    public void j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2258090898471885312L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2258090898471885312L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = 0;     // Catch: java.lang.Throwable -> L8
    }

    public void j6(int r8, long r9) {
    L16:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, -374471799622429867L, this, new java.lang.Integer(r8), new java.lang.Long(r9));
    L20:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-374471799622429867L, this, new java.lang.Integer(r8), new java.lang.Long(r9));     // Catch: java.lang.Throwable -> L16
    L6:
        if (this.FH != null) goto L9;
        this.FH = new long[java.lang.Math.max(10, r8 + 1)];     // Catch: java.lang.Throwable -> L16
    L12:
        if (r8 < this.Hw) goto L14;
        this.Hw = r8 + 1;     // Catch: java.lang.Throwable -> L16
    L14:
        this.FH[r8] = r9;     // Catch: java.lang.Throwable -> L16
        return;
    L9:
        if (r8 < this.FH.length) goto L12;
        long[] r0 = new long[java.lang.Math.max(r8 + 1, (this.FH.length * 2) + 1)];     // Catch: java.lang.Throwable -> L16
        java.lang.System.arraycopy(this.FH, 0, r0, 0, this.FH.length);     // Catch: java.lang.Throwable -> L16
        this.FH = r0;     // Catch: java.lang.Throwable -> L16
        goto L12
    }

    public void j6(long r7) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -1250435731425065133L, this, new java.lang.Long(r7));
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1250435731425065133L, this, new java.lang.Long(r7));     // Catch: java.lang.Throwable -> L14
    L7:
        if (this.FH != null) goto L10;
        this.FH = new long[10];     // Catch: java.lang.Throwable -> L14
    L12:
        long[] r2 = this.FH;     // Catch: java.lang.Throwable -> L14
        int r3 = this.Hw;     // Catch: java.lang.Throwable -> L14
        this.Hw = r3 + 1;     // Catch: java.lang.Throwable -> L14
        r2[r3] = r7;     // Catch: java.lang.Throwable -> L14
        return;
    L10:
        if (this.Hw < this.FH.length) goto L12;
        long[] r4 = new long[(this.FH.length * 2) + 1];     // Catch: java.lang.Throwable -> L14
        java.lang.System.arraycopy(this.FH, 0, r4, 0, this.FH.length);     // Catch: java.lang.Throwable -> L14
        this.FH = r4;     // Catch: java.lang.Throwable -> L14
        goto L12
    }

    public java.lang.String toString() {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 3679935882327221183L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3679935882327221183L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        java.lang.String r2 = "{";
        int r3 = 0;
    L8:
        if (r3 >= this.Hw) goto L10;
        r2 = r2 + this.FH[r3] + ", ";     // Catch: java.lang.Throwable -> L12
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L12
        goto L8
    L10:
        return r2 + "}";
    }
}
