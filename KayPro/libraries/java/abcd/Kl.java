package abcd;

@abcd.Interfacexu
public class Kl extends java.io.OutputStream {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -511362552826188901L)
    private final java.io.OutputStream FH;

    @abcd.Interfaceru(field = -511382988863066188L)
    private final java.io.OutputStream Hw;

    static {
        abcd.wu.j6(abcd.Kl.class, 350630418671245344L, 350630418671245344L);
    }

    public Kl(java.io.OutputStream r8, java.io.OutputStream r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 425321149652825512L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(425321149652825512L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH = r8;     // Catch: java.lang.Throwable -> L7
        this.Hw = r9;     // Catch: java.lang.Throwable -> L7
    }

    @Override
    public void close() {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -1647043526303603424L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1647043526303603424L, this);     // Catch: java.lang.Throwable -> L13
    L7:
        if (this.FH == null) goto L10;
        this.FH.close();     // Catch: java.lang.Throwable -> L13
    L10:
        if (this.Hw == null) goto L20;
        this.Hw.close();     // Catch: java.lang.Throwable -> L13
        return;
    }

    @Override
    public void flush() {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -1550418596417897976L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1550418596417897976L, this);     // Catch: java.lang.Throwable -> L13
    L7:
        if (this.FH == null) goto L10;
        this.FH.flush();     // Catch: java.lang.Throwable -> L13
    L10:
        if (this.Hw == null) goto L20;
        this.Hw.flush();     // Catch: java.lang.Throwable -> L13
        return;
    }

    @Override
    public void write(int r5) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -670904570860601360L, this, new java.lang.Integer(r5));
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-670904570860601360L, this, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if (this.FH == null) goto L10;
        this.FH.write(r5);     // Catch: java.lang.Throwable -> L13
    L10:
        if (this.Hw == null) goto L20;
        this.Hw.write(r5);     // Catch: java.lang.Throwable -> L13
        return;
    }

    @Override
    public void write(byte[] r5) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 875292999722787212L, this, r5);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(875292999722787212L, this, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if (this.FH == null) goto L10;
        this.FH.write(r5);     // Catch: java.lang.Throwable -> L13
    L10:
        if (this.Hw == null) goto L20;
        this.Hw.write(r5);     // Catch: java.lang.Throwable -> L13
        return;
    }

    @Override
    public void write(byte[] r9, int r10, int r11) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -414479510827417000L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
    L16:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-414479510827417000L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L12
    L6:
        if (this.FH == null) goto L9;
        this.FH.write(r9, r10, r11);     // Catch: java.lang.Throwable -> L12
    L9:
        if (this.Hw == null) goto L19;
        this.Hw.write(r9, r10, r11);     // Catch: java.lang.Throwable -> L12
        return;
    }
}
