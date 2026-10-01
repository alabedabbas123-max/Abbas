package abcd;

@abcd.Interfacexu
public class Bb {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -2651427494889758640L)
    private byte[] FH;

    @abcd.Interfaceru(field = -2467269698413904613L)
    private int Hw;

    static {
        abcd.wu.j6(abcd.Bb.class, -3349069187241974240L, -3349069187241974240L);
    }

    public Bb() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1751609472981479907L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1751609472981479907L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = null;     // Catch: java.lang.Throwable -> L8
        this.Hw = 0;     // Catch: java.lang.Throwable -> L8
    }

    public int DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -135701201584273917L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-135701201584273917L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Hw;
    }

    public byte j6(int r5) {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, 6996295454910378435L, this, new java.lang.Integer(r5));
    L21:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(6996295454910378435L, this, r5);     // Catch: java.lang.Throwable -> L17
    L7:
        if (this.FH != null) goto L10;
        return -1;
    L10:
        if (r5 < this.FH.length) goto L13;
        return -1;
    L13:
        if (r5 < this.Hw) goto L15;
        return -1;
    L15:
        return this.FH[r5];
    }

    public void j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 599327288808253981L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(599327288808253981L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = 0;     // Catch: java.lang.Throwable -> L8
    }

    public void j6(byte r7) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 4703055853686906183L, this, new java.lang.Byte(r7));
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(4703055853686906183L, this, new java.lang.Byte(r7));     // Catch: java.lang.Throwable -> L14
    L7:
        if (this.FH != null) goto L10;
        this.FH = new byte[10];     // Catch: java.lang.Throwable -> L14
    L12:
        byte[] r2 = this.FH;     // Catch: java.lang.Throwable -> L14
        int r3 = this.Hw;     // Catch: java.lang.Throwable -> L14
        this.Hw = r3 + 1;     // Catch: java.lang.Throwable -> L14
        r2[r3] = r7;     // Catch: java.lang.Throwable -> L14
        return;
    L10:
        if (this.Hw < this.FH.length) goto L12;
        byte[] r4 = new byte[(this.FH.length * 2) + 1];     // Catch: java.lang.Throwable -> L14
        java.lang.System.arraycopy(this.FH, 0, r4, 0, this.FH.length);     // Catch: java.lang.Throwable -> L14
        this.FH = r4;     // Catch: java.lang.Throwable -> L14
        goto L12
    }

    public java.lang.String toString() {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -3474877270558346880L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3474877270558346880L, this);     // Catch: java.lang.Throwable -> L12
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
