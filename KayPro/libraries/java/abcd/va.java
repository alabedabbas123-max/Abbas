package abcd;

@abcd.Interfacexu
public class va {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public java.util.Map<java.lang.String, java.util.Set<? extends abcd.Interfaceha>> EQ;
    public java.lang.String FH;
    public boolean Hw;
    public int VH;
    public boolean Zo;
    public boolean gn;
    public java.util.Map<java.lang.String, java.lang.Integer> tp;
    public int u7;
    public boolean v5;

    static {
        abcd.wu.j6(abcd.va.class, 764732373277793165L, 764732373277793165L);
    }

    public va() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1605090818776752120L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1605090818776752120L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.tp = new java.util.HashMap();     // Catch: java.lang.Throwable -> L8
        this.EQ = new java.util.HashMap();     // Catch: java.lang.Throwable -> L8
    }

    public int DW(abcd.Interfacena r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -6722079086152351488L, this, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-6722079086152351488L, this, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (this.tp.containsKey(r5.j6()) == false) goto L10;
        return this.tp.get(r5.j6()).intValue();
    L10:
        return 4;
    }

    public java.util.Set<? extends abcd.Interfaceha> j6(abcd.Interfacena r5) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 414314539544980107L, this, r5);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(414314539544980107L, this, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if (this.EQ.containsKey(r5.j6()) == true) goto L19;
        java.util.Set<? extends abcd.Interfaceha> r2 = r5.Zo();     // Catch: java.lang.Throwable -> L13
        if (r2 == null) goto L12;
        return r2;
    L12:
        return java.util.Collections.EMPTY_SET;
    L19:
        return this.EQ.get(r5.j6());
    }
}
