package com.aide.uidesigner;

@abcd.Interfacexu
public class ClassC {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public java.lang.Object FH;

    @abcd.Interfaceru(field = 5111116989851028860L)
    private java.util.Map<java.lang.Class<?>, java.lang.Object> Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.ClassC.class, 2256145217945788433L, 2256145217945788433L);
    }

    public ClassC(java.lang.Object r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1580482911114830853L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1580482911114830853L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = new java.util.HashMap();     // Catch: java.lang.Throwable -> L8
        this.FH = r6;     // Catch: java.lang.Throwable -> L8
    }

    public void j6(com.aide.uidesigner.N.a r8, java.lang.Object r9) {
    L20:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, 464675855987012964L, this, r8, r9);
    L24:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(464675855987012964L, this, r8, r9);     // Catch: java.lang.Throwable -> L20
    L5:
        if (r9 != null) goto L26;
        return;
    L26:
        java.lang.Object r0 = this.FH;     // Catch: java.lang.Throwable -> L25
        if (r8.v5 == null) goto L13;
        r0 = this.Hw.get(r8.v5);     // Catch: java.lang.Throwable -> L25
        if (r0 != null) goto L13;
        r0 = r8.v5.getConstructor(new java.lang.Class[]{java.lang.Object.class}).newInstance(new java.lang.Object[]{this.FH});     // Catch: java.lang.Throwable -> L25
        this.Hw.put(r8.v5, r0);     // Catch: java.lang.Throwable -> L25
    L13:
        if (r8.Hw.endsWith("()") == false) goto L18;
        java.lang.Class<?> r1 = r8.VH.Mr;     // Catch: java.lang.Throwable -> L25
        if (r1 != java.lang.Enum.class) goto L17;
        r1 = r8.gn;     // Catch: java.lang.Throwable -> L25
    L17:
        r0.getClass().getMethod(r8.Hw.substring(0, r8.Hw.length() - 2), new java.lang.Class[]{r1}).invoke(r0, new java.lang.Object[]{r9});     // Catch: java.lang.Throwable -> L25
        return;
    L18:
        r0.getClass().getField(r8.Hw).set(r0, r9);     // Catch: java.lang.Throwable -> L25
        return;
    }

    public boolean j6(com.aide.uidesigner.N.a r5) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -455720109614450317L, this, r5);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-455720109614450317L, this, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if (r5.FH == null) goto L11;
        if (r5.FH.isInstance(this.FH) == false) goto L11;
        return true;
    L11:
        return false;
    }
}
