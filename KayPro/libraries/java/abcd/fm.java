package abcd;

@abcd.Interfacexu
public class fm {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -79062537764929040L)
    private int FH;

    @abcd.Interfaceru(field = -2583418934560196880L)
    private int Hw;

    static {
        abcd.wu.j6(abcd.fm.class, -4197706724417731056L, -4197706724417731056L);
    }

    public fm(int r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 1373550584852295968L, null, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1373550584852295968L, null, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH = r8;     // Catch: java.lang.Throwable -> L7
        this.Hw = r9;     // Catch: java.lang.Throwable -> L7
    }

    public int DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1503777317860867368L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1503777317860867368L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH;
    }

    public int j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -879183588170532600L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-879183588170532600L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Hw;
    }

    public java.lang.String toString() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1153480553499251620L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1153480553499251620L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH + ", " + this.Hw;
    }
}
