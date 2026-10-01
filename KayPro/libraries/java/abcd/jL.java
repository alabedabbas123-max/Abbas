package abcd;

public class jL {
    private abcd.lL DW;
    private abcd.mL FH;
    private int Hw;
    private java.util.LinkedList j6;

    public jL() {
        this.DW = new abcd.lL(null);
        this.FH = null;
        this.Hw = 0;
    }

    private java.util.Map DW(abcd.InterfaceiL r1) {
        if (r1 == null) goto L4;
        java.util.Map r2 = r1.j6();
        if (r2 == null) goto L8;
        return r2;
    L8:
        return new abcd.fL();
    L4:
        return new abcd.fL();
    }

    private void FH() {
        this.FH = this.DW.DW();
        if (this.FH != null) goto L6;
        this.FH = new abcd.mL(-1, null);
        return;
    }

    private int j6(java.util.LinkedList r2) {
        if (r2.size() != 0) goto L7;
        return -1;
    L7:
        return ((java.lang.Integer) r2.getFirst()).intValue();
    }

    private java.util.List j6(abcd.InterfaceiL r1) {
        if (r1 == null) goto L4;
        java.util.List r2 = r1.DW();
        if (r2 == null) goto L8;
        return r2;
    L8:
        return new abcd.dL();
    L4:
        return new abcd.dL();
    }

    public void DW() {
        this.FH = null;
        this.Hw = 0;
        this.j6 = null;
    }

    public void DW(java.io.Reader r2) {
        this.DW.j6(r2);
        DW();
    }

    public int j6() {
        return this.DW.j6();
    }

    public java.lang.Object j6(java.io.Reader r2) {
        return j6(r2, null);
    }

    public java.lang.Object j6(java.io.Reader r9, abcd.InterfaceiL r10) {
        DW(r9);
        java.util.LinkedList r11 = new java.util.LinkedList();
        java.util.LinkedList r0 = new java.util.LinkedList();
    L80:
        FH();     // Catch: java.io.IOException -> L76
        int r1 = this.Hw;     // Catch: java.io.IOException -> L76
        if (r1 == (-1)) goto L75;
        if (r1 == 0) goto L56;
        if (r1 == 1) goto L51;
        if (r1 == 2) goto L39;
        if (r1 == 3) goto L25;
        if (r1 != 4) goto L66;
        int r2 = this.FH.j6;     // Catch: java.io.IOException -> L76
        if (r2 == 0) goto L23;
        if (r2 == 1) goto L22;
        if (r2 != 3) goto L18;
        r11.removeFirst();     // Catch: java.io.IOException -> L76
        java.lang.String r3 = (java.lang.String) r0.removeFirst();     // Catch: java.io.IOException -> L76
        java.util.Map r4 = (java.util.Map) r0.getFirst();     // Catch: java.io.IOException -> L76
        java.lang.Object r6 = j6(r10);     // Catch: java.io.IOException -> L76
        r4.put(r3, r6);     // Catch: java.io.IOException -> L76
        this.Hw = 3;     // Catch: java.io.IOException -> L76
        r11.addFirst(new java.lang.Integer(this.Hw));     // Catch: java.io.IOException -> L76
    L21:
        r0.addFirst(r6);     // Catch: java.io.IOException -> L76
        goto L66
    L18:
        if (r2 == 6) goto L66;
    L19:
        this.Hw = -1;     // Catch: java.io.IOException -> L76
        goto L66
    L22:
        r11.removeFirst();     // Catch: java.io.IOException -> L76
        java.lang.String r5 = (java.lang.String) r0.removeFirst();     // Catch: java.io.IOException -> L76
        java.util.Map r7 = (java.util.Map) r0.getFirst();     // Catch: java.io.IOException -> L76
        r6 = DW(r10);     // Catch: java.io.IOException -> L76
        r7.put(r5, r6);     // Catch: java.io.IOException -> L76
        this.Hw = 2;     // Catch: java.io.IOException -> L76
        r11.addFirst(new java.lang.Integer(this.Hw));     // Catch: java.io.IOException -> L76
        goto L21
    L23:
        r11.removeFirst();     // Catch: java.io.IOException -> L76
        java.lang.String r8 = (java.lang.String) r0.removeFirst();     // Catch: java.io.IOException -> L76
        ((java.util.Map) r0.getFirst()).put(r8, this.FH.DW);     // Catch: java.io.IOException -> L76
        int r12 = j6(r11);     // Catch: java.io.IOException -> L76
    L24:
        this.Hw = r12;     // Catch: java.io.IOException -> L76
    L66:
        if (this.Hw == (-1)) goto L73;
        if (this.FH.j6 != (-1)) goto L80;
        throw new abcd.kL(j6(), 1, this.FH);
    L73:
        throw new abcd.kL(j6(), 1, this.FH);     // Catch: java.io.IOException -> L76
    L25:
        int r13 = this.FH.j6;     // Catch: java.io.IOException -> L76
        if (r13 == 0) goto L38;
        if (r13 == 1) goto L37;
        if (r13 == 3) goto L36;
        if (r13 == 4) goto L33;
        if (r13 == 5) goto L66;
    L33:
        if (r0.size() <= 1) goto L35;
        r11.removeFirst();     // Catch: java.io.IOException -> L76
        r0.removeFirst();     // Catch: java.io.IOException -> L76
        r12 = j6(r11);     // Catch: java.io.IOException -> L76
    L35:
        this.Hw = 1;     // Catch: java.io.IOException -> L76
        goto L66
    L36:
        java.util.List r14 = (java.util.List) r0.getFirst();     // Catch: java.io.IOException -> L76
        java.util.List r15 = j6(r10);     // Catch: java.io.IOException -> L76
        r14.add(r15);     // Catch: java.io.IOException -> L76
        this.Hw = 3;     // Catch: java.io.IOException -> L76
        r11.addFirst(new java.lang.Integer(this.Hw));     // Catch: java.io.IOException -> L76
        r0.addFirst(r15);     // Catch: java.io.IOException -> L76
        goto L66
    L37:
        java.util.List r16 = (java.util.List) r0.getFirst();     // Catch: java.io.IOException -> L76
        java.util.Map r17 = DW(r10);     // Catch: java.io.IOException -> L76
        r16.add(r17);     // Catch: java.io.IOException -> L76
        this.Hw = 2;     // Catch: java.io.IOException -> L76
        r11.addFirst(new java.lang.Integer(this.Hw));     // Catch: java.io.IOException -> L76
        r0.addFirst(r17);     // Catch: java.io.IOException -> L76
        goto L66
    L38:
        ((java.util.List) r0.getFirst()).add(this.FH.DW);     // Catch: java.io.IOException -> L76
        goto L66
    L39:
        int r18 = this.FH.j6;     // Catch: java.io.IOException -> L76
        if (r18 == 0) goto L48;
        if (r18 == 2) goto L45;
        if (r18 == 5) goto L66;
    L45:
        if (r0.size() <= 1) goto L35;
        r11.removeFirst();     // Catch: java.io.IOException -> L76
        r0.removeFirst();     // Catch: java.io.IOException -> L76
        r12 = j6(r11);     // Catch: java.io.IOException -> L76
        goto L24
    L48:
        if ((this.FH.DW instanceof java.lang.String) == false) goto L19;
        r0.addFirst((java.lang.String) this.FH.DW);     // Catch: java.io.IOException -> L76
        this.Hw = 4;     // Catch: java.io.IOException -> L76
        r11.addFirst(new java.lang.Integer(this.Hw));     // Catch: java.io.IOException -> L76
        goto L66
    L51:
        if (this.FH.j6 != (-1)) goto L55;
        return r0.removeFirst();
    L55:
        throw new abcd.kL(j6(), 1, this.FH);     // Catch: java.io.IOException -> L76
    L56:
        int r19 = this.FH.j6;     // Catch: java.io.IOException -> L76
        if (r19 == 0) goto L64;
        if (r19 == 1) goto L63;
        if (r19 != 3) goto L19;
        this.Hw = 3;     // Catch: java.io.IOException -> L76
        r11.addFirst(new java.lang.Integer(this.Hw));     // Catch: java.io.IOException -> L76
        java.lang.Object r20 = j6(r10);     // Catch: java.io.IOException -> L76
    L62:
        r0.addFirst(r20);     // Catch: java.io.IOException -> L76
        goto L66
    L63:
        this.Hw = 2;     // Catch: java.io.IOException -> L76
        r11.addFirst(new java.lang.Integer(this.Hw));     // Catch: java.io.IOException -> L76
        r20 = DW(r10);     // Catch: java.io.IOException -> L76
        goto L62
    L64:
        this.Hw = 1;     // Catch: java.io.IOException -> L76
        r11.addFirst(new java.lang.Integer(this.Hw));     // Catch: java.io.IOException -> L76
        r20 = this.FH.DW;     // Catch: java.io.IOException -> L76
        goto L62
    L75:
        throw new abcd.kL(j6(), 1, this.FH);     // Catch: java.io.IOException -> L76
    L76:
        e = move-exception;
        throw e;
    }

    public java.lang.Object j6(java.lang.String r2) {
        return j6(r2, null);
    }

    public java.lang.Object j6(java.lang.String r3, abcd.InterfaceiL r4) {
        return j6(new java.io.StringReader(r3), r4);
    L5:
        e = move-exception;
        throw new abcd.kL(-1, 2, e);
    }
}
