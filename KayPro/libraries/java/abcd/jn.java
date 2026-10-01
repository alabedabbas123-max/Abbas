package abcd;

public class jn implements abcd.Interfaceqn {
    private final abcd.Pt DW;
    private abcd.yn EQ;
    private final boolean FH;
    private abcd.Ls Hw;
    private abcd.Interfacexn J0;
    private abcd.Ks VH;
    private abcd.Ks Zo;
    private abcd.Ss gn;
    private final java.lang.String j6;
    private abcd.Interfacevn tp;
    private abcd.Interfacesn u7;
    private int v5;
    private abcd.gn we;

    private static class a implements abcd.Ss {
        private final int DW;
        private final abcd.Ls FH;
        private final abcd.Pt j6;

        public a(abcd.Pt r5, int r6, int r7, abcd.Ls r8, abcd.Interfacexn r9) {
            if (r7 < 0) goto L16;
            abcd.Pt r10 = r5.j6(r6, (r7 * 2) + r6);
            this.j6 = r10;
            this.DW = r7;
            this.FH = r8;
            int r11 = 0;
        L5:
            if (r11 >= r7) goto L14;
            int r0 = r11 * 2;
            abcd.Ks r1 = (abcd.Ks) r8.get(r10.Zo(r0));     // Catch: java.lang.ClassCastException -> L11
            if (r9 == null) goto L10;
            r9.j6(r10, r0, 2, "  " + r1);
        L10:
            r11 = r11 + 1;
        L11:
            e = move-exception;
            throw new java.lang.RuntimeException("bogus class cpi", e);
        L14:
            return;
        L16:
            throw new java.lang.IllegalArgumentException("size < 0");
        }

        @Override
        public boolean Zo() {
            return false;
        }

        @Override
        public abcd.Qs getType(int r2) {
            int r3 = this.j6.Zo(r2 * 2);
            return ((abcd.Ks) this.FH.get(r3)).VH();
        }

        @Override
        public abcd.Ss j6(abcd.Qs r2) {
            throw new java.lang.UnsupportedOperationException("unsupported");
        }

        @Override
        public int size() {
            return this.DW;
        }
    }

    public jn(abcd.Pt r1, java.lang.String r2, boolean r3) {
        if (r1 == null) goto L10;
        if (r2 == null) goto L8;
        this.j6 = r2;
        this.DW = r1;
        this.FH = r3;
        this.v5 = -1;
        return;
    L8:
        throw new java.lang.NullPointerException("filePath == null");
    L10:
        throw new java.lang.NullPointerException("bytes == null");
    }

    public jn(byte[] r2, java.lang.String r3, boolean r4) {
        this(new abcd.Pt(r2), r3, r4);
    }

    private void QX() {
        if (this.DW.FH() < 10) goto L39;
        abcd.Interfacexn r0 = this.J0;
        if (r0 == null) goto L8;
        r0.j6(this.DW, 0, 0, "begin classfile");
        this.J0.j6(this.DW, 0, 4, "magic: " + abcd.Yt.gn(u7()));
        this.J0.j6(this.DW, 4, 2, "minor_version: " + abcd.Yt.v5(we()));
        this.J0.j6(this.DW, 6, 2, "major_version: " + abcd.Yt.v5(tp()));
    L8:
        if (this.FH == true) goto L10;
    L14:
        abcd.en r1 = new abcd.en(this.DW);
        r1.j6(this.J0);
        this.Hw = r1.DW();
        this.Hw.we();
        int r2 = r1.j6();
        int r5 = this.DW.Zo(r2);
        int r7 = r2 + 2;
        this.Zo = (abcd.Ks) this.Hw.get(this.DW.Zo(r7));
        int r8 = r2 + 4;
        this.VH = (abcd.Ks) this.Hw.j6(this.DW.Zo(r8));
        int r9 = r2 + 6;
        int r6 = this.DW.Zo(r9);
        abcd.Interfacexn r10 = this.J0;
        if (r10 == null) goto L19;
        r10.j6(this.DW, r2, 2, "access_flags: " + abcd.Mr.j6(r5));
        this.J0.j6(this.DW, r7, 2, "this_class: " + this.Zo);
        this.J0.j6(this.DW, r8, 2, "super_class: " + j6(this.VH));
        this.J0.j6(this.DW, r9, 2, "interfaces_count: " + abcd.Yt.v5(r6));
        if (r6 == 0) goto L19;
        this.J0.j6(this.DW, r2 + 8, 0, "interfaces:");
    L19:
        int r3 = r2 + 8;
        this.gn = j6(r3, r6);
        int r4 = r3 + (r6 * 2);
        if (this.FH == false) goto L30;
        java.lang.String r11 = this.Zo.VH().VH();
        if (this.j6.endsWith(".class") == false) goto L29;
        if (this.j6.startsWith(r11) == false) goto L29;
        if (this.j6.length() == (r11.length() + 6)) goto L30;
    L29:
        throw new abcd.wn("class name (" + r11 + ") does not match path (" + this.j6 + ")");
    L30:
        this.v5 = r5;
        abcd.C0968kn r12 = new abcd.C0968kn(this, this.Zo, r4, this.we);
        r12.j6(this.J0);
        this.u7 = r12.VH();
        abcd.C1053mn r13 = new abcd.C1053mn(this, this.Zo, r12.Hw(), this.we);
        r13.j6(this.J0);
        this.tp = r13.VH();
        abcd.hn r14 = new abcd.hn(this, 0, r13.Hw(), this.we);
        r14.j6(this.J0);
        this.EQ = r14.DW();
        this.EQ.we();
        int r15 = r14.j6();
        if (r15 != this.DW.FH()) goto L37;
        abcd.Interfacexn r16 = this.J0;
        if (r16 == null) goto L40;
        r16.j6(this.DW, r15, 0, "end classfile");
        return;
    L40:
        return;
    L37:
        throw new abcd.wn("extra bytes at end of class file, at offset " + abcd.Yt.gn(r15));
    L10:
        if (j6(u7(), we(), tp()) == true) goto L14;
        throw new abcd.wn("bad class file magic (" + abcd.Yt.gn(u7()) + ") or version (" + abcd.Yt.v5(tp()) + "." + abcd.Yt.v5(we()) + ")");
    L39:
        throw new abcd.wn("severely truncated class file");
    }

    private void Ws() {
        QX();     // Catch: java.lang.RuntimeException -> L5 abcd.wn -> L8
        return;
    L8:
        e = move-exception;
        e.j6("...while parsing " + this.j6);
        throw e;
    L5:
        e = move-exception;
        abcd.wn r2 = new abcd.wn(e);
        r2.j6("...while parsing " + this.j6);
        throw r2;
    }

    private void XL() {
        if (this.EQ != null) goto L6;
        Ws();
        return;
    }

    private void aM() {
        if (this.v5 != (-1)) goto L6;
        Ws();
        return;
    }

    public static java.lang.String j6(java.lang.Object r0) {
        if (r0 != null) goto L6;
        return "(none)";
    L6:
        return r0.toString();
    }

    private boolean j6(int r2, int r3, int r4) {
        if (r2 != (-889275714)) goto L13;
        if (r3 >= 0) goto L6;
        return false;
    L6:
        if (r4 != 50) goto L9;
        if (r3 > 0) goto L16;
        return true;
    L16:
        return false;
    L9:
        if (r4 < 50) goto L11;
        return false;
    L11:
        if (r4 < 45) goto L18;
        return true;
    L18:
        return false;
    L13:
        return false;
    }

    @Override
    public abcd.Js DW() {
        abcd.Interfaceon r0 = FH().j6("SourceFile");
        if ((r0 instanceof abcd.xm) == true) goto L5;
        return null;
    L5:
        return ((abcd.xm) r0).j6();
    }

    public abcd.Interfacevn EQ() {
        XL();
        return this.tp;
    }

    public abcd.Interfacepn FH() {
        XL();
        return this.EQ;
    }

    public abcd.Pt Hw() {
        return this.DW;
    }

    public abcd.Ks J0() {
        aM();
        return this.VH;
    }

    public abcd.Ks J8() {
        aM();
        return this.Zo;
    }

    public abcd.Ss VH() {
        aM();
        return this.gn;
    }

    public abcd.Interfacesn Zo() {
        XL();
        return this.u7;
    }

    public int gn() {
        aM();
        return u7();
    }

    @Override
    public int j6() {
        aM();
        return this.v5;
    }

    public abcd.Ss j6(int r8, int r9) {
        if (r9 == 0) goto L4;
        abcd.Ls r4 = this.Hw;
        if (r4 == null) goto L10;
        return new abcd.jn.a(this.DW, r8, r9, r4, this.J0);
    L10:
        throw new java.lang.IllegalStateException("pool not yet initialized");
    L4:
        return abcd.Ps.FH;
    }

    public void j6(abcd.gn r2) {
        if (r2 == null) goto L6;
        this.we = r2;
        return;
    L6:
        throw new java.lang.NullPointerException("attributeFactory == null");
    }

    public int tp() {
        return this.DW.Zo(6);
    }

    public int u7() {
        return this.DW.DW(0);
    }

    public abcd.Interfacens v5() {
        aM();
        return this.Hw;
    }

    public int we() {
        return this.DW.Zo(4);
    }
}
