package abcd;

@abcd.Interfacexu
public class Sl<T> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -2786468747608221060L)
    private java.util.List<T> FH;

    @abcd.Interfaceru(field = 2084495436120020703L)
    private int Hw;

    @abcd.Interfaceru(field = -3295930052936194128L)
    private int v5;

    static {
        abcd.wu.j6(abcd.Sl.class, -182018132816069600L, -182018132816069600L);
    }

    public Sl(int r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 152838124851286356L, null, new java.lang.Integer(r6));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(152838124851286356L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L8
        this.v5 = r6;     // Catch: java.lang.Throwable -> L8
    }

    public int DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2950623810580464560L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2950623810580464560L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.v5;
    }

    public T FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1394440179620893716L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1394440179620893716L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return j6(Hw() - 1);
    }

    public int Hw() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1396002777033900592L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1396002777033900592L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH.size();
    }

    public T j6(int r5) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -7066572204385556580L, this, new java.lang.Integer(r5));
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-7066572204385556580L, this, r5);     // Catch: java.lang.Throwable -> L11
    L6:
        int r2 = this.Hw + r5;     // Catch: java.lang.Throwable -> L11
        if (r2 < this.FH.size()) goto L9;
        r2 = r2 - this.FH.size();     // Catch: java.lang.Throwable -> L11
    L9:
        return this.FH.get(r2);
    }

    public T j6(T r6) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 6852282958301929437L, this, r6);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(6852282958301929437L, this, r6);     // Catch: java.lang.Throwable -> L14
    L7:
        if (this.FH.size() >= this.v5) goto L10;
        this.FH.add(r6);     // Catch: java.lang.Throwable -> L14
        return null;
    L10:
        T r2 = this.FH.get(this.Hw);     // Catch: java.lang.Throwable -> L14
        this.FH.set(this.Hw, r6);     // Catch: java.lang.Throwable -> L14
        this.Hw++;     // Catch: java.lang.Throwable -> L14
        if (this.Hw < this.FH.size()) goto L13;
        this.Hw = 0;     // Catch: java.lang.Throwable -> L14
    L13:
        return r2;
    }

    public void j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -13417795374236672L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-13417795374236672L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.clear();     // Catch: java.lang.Throwable -> L8
        this.Hw = 0;     // Catch: java.lang.Throwable -> L8
    }
}
