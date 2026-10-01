package abcd;

@abcd.Interfacexu
class Ul extends java.io.Reader {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.io.Reader FH;

    static {
        abcd.wu.j6(abcd.Ul.class, 1736030230469303457L, -1911016727548804344L);
    }

    Ul(java.io.Reader r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 2867503885742482952L)
    public void close() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1215302715870174967L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1215302715870174967L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.Vl.j6().j6();     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = -96422478427136920L)
    public int read(char[] r9, int r10, int r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 1255739182504994635L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1255739182504994635L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
    L5:
        return this.FH.read(r9, r10, r11);
    }
}
