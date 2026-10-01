package abcd;

@abcd.Interfacexu
public class Xa {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -2696649783064052893L)
    private java.util.List<abcd.Wa> FH;

    @abcd.Interfaceru(field = 1693061698741961180L)
    private int Hw;

    static {
        abcd.wu.j6(abcd.Xa.class, 194263197534240451L, 194263197534240451L);
    }

    public Xa() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1562215453158520237L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1562215453158520237L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L8
    }

    public void DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1350132719847053308L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1350132719847053308L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = 0;     // Catch: java.lang.Throwable -> L8
    }

    public void FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 204149820666787325L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(204149820666787325L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L8
    }

    public abcd.Wa j6() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -1159943479191456264L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1159943479191456264L, this);     // Catch: java.lang.Throwable -> L11
    L7:
        if (this.Hw != this.FH.size()) goto L9;
        this.FH.add(new abcd.Wa());     // Catch: java.lang.Throwable -> L11
    L9:
        java.util.List<abcd.Wa> r2 = this.FH;     // Catch: java.lang.Throwable -> L11
        int r3 = this.Hw;     // Catch: java.lang.Throwable -> L11
        this.Hw = r3 + 1;     // Catch: java.lang.Throwable -> L11
        abcd.Wa r4 = r2.get(r3);     // Catch: java.lang.Throwable -> L11
        r4.j6();     // Catch: java.lang.Throwable -> L11
        return r4;
    }

    public void j6(abcd.Wa r7) {
    L16:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, -650273815977840081L, this, r7);
    L20:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-650273815977840081L, this, r7);     // Catch: java.lang.Throwable -> L16
    L7:
        if (this.Hw != 0) goto L10;
        return;
    L10:
        if (this.FH.get(this.Hw - 1) == r7) goto L14;
        int r2 = this.FH.indexOf(r7);     // Catch: java.lang.Throwable -> L16
        if (r2 >= this.Hw) goto L14;
        this.FH.set(r2, this.FH.get(this.Hw - 1));     // Catch: java.lang.Throwable -> L16
        this.FH.set(this.Hw - 1, r7);     // Catch: java.lang.Throwable -> L16
    L14:
        this.Hw--;     // Catch: java.lang.Throwable -> L16
    }
}
