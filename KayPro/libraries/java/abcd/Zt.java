package abcd;

public final class Zt extends java.io.FilterWriter {
    private final int DW;
    private final int FH;
    private int Hw;
    private int Zo;
    private final java.lang.String j6;
    private boolean v5;

    public Zt(java.io.Writer r2, int r3) {
        this(r2, r3, "");
    }

    public Zt(java.io.Writer r1, int r2, java.lang.String r3) {
        super(r1);
        if (r1 == null) goto L19;
        if (r2 < 0) goto L17;
        if (r3 == null) goto L15;
        if (r2 == 0) goto L8;
        int r4 = r2;
    L9:
        this.DW = r4;
        this.FH = r2 >> 1;
        if (r3.length() != 0) goto L12;
        r3 = null;
    L12:
        this.j6 = r3;
        j6();
        return;
    L8:
        r4 = Integer.MAX_VALUE;
        goto L9
    L15:
        throw new java.lang.NullPointerException("prefix == null");
    L17:
        throw new java.lang.IllegalArgumentException("width < 0");
    L19:
        throw new java.lang.NullPointerException("out == null");
    }

    private void j6() {
        this.Hw = 0;
        if (this.FH == 0) goto L5;
        boolean r1 = true;
    L6:
        this.v5 = r1;
        this.Zo = 0;
        return;
    L5:
        r1 = false;
        goto L6
    }

    @Override
    public void write(int r7) {
        java.lang.Object r0 = ((java.io.FilterWriter) this).lock;
        monitor-enter(r0);
        int r3 = 0;
        if (this.v5 == false) goto L12;
        if (r7 != 32) goto L10;
        this.Zo++;     // Catch: java.lang.Throwable -> L32
        if (this.Zo < this.FH) goto L12;
        this.Zo = this.FH;     // Catch: java.lang.Throwable -> L32
        this.v5 = false;     // Catch: java.lang.Throwable -> L32
        goto L12
    L10:
        this.v5 = false;     // Catch: java.lang.Throwable -> L32
    L12:
        if (this.Hw != this.DW) goto L16;
        if (r7 == 10) goto L16;
        ((java.io.FilterWriter) this).out.write(10);     // Catch: java.lang.Throwable -> L32
        this.Hw = 0;     // Catch: java.lang.Throwable -> L32
    L16:
        if (this.Hw == 0) goto L18;
    L26:
        ((java.io.FilterWriter) this).out.write(r7);     // Catch: java.lang.Throwable -> L32
        if (r7 != 10) goto L29;
        j6();     // Catch: java.lang.Throwable -> L32
    L30:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L32
        return;
    L29:
        this.Hw++;     // Catch: java.lang.Throwable -> L32
        goto L30
    L18:
        if (this.j6 == null) goto L21;
        ((java.io.FilterWriter) this).out.write(this.j6);     // Catch: java.lang.Throwable -> L32
    L21:
        if (this.v5 == true) goto L26;
    L23:
        if (r3 >= this.Zo) goto L25;
        ((java.io.FilterWriter) this).out.write(32);     // Catch: java.lang.Throwable -> L32
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L32
        goto L23
    L25:
        this.Hw = this.Zo;     // Catch: java.lang.Throwable -> L32
    L32:
        th = move-exception;
        throw th;
    }

    @Override
    public void write(java.lang.String r3, int r4, int r5) {
        java.lang.Object r0 = ((java.io.FilterWriter) this).lock;
        monitor-enter(r0);
    L4:
        if (r5 <= 0) goto L6;
        write(r3.charAt(r4));     // Catch: java.lang.Throwable -> L8
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L8
        r5 = r5 - 1;     // Catch: java.lang.Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    L6:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public void write(char[] r3, int r4, int r5) {
        java.lang.Object r0 = ((java.io.FilterWriter) this).lock;
        monitor-enter(r0);
    L4:
        if (r5 <= 0) goto L6;
        write(r3[r4]);     // Catch: java.lang.Throwable -> L8
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L8
        r5 = r5 - 1;     // Catch: java.lang.Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    L6:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L8
    }
}
