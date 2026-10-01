package abcd;

public class dK extends abcd.AbstractjK {
    private final int FH;
    private final int Hw;
    private final java.util.LinkedList<java.lang.String> VH;
    private final java.util.Set<java.lang.String> Zo;
    private final java.util.LinkedList<java.lang.String> gn;
    private final boolean v5;

    public dK(int r2, int r3) {
        this(r2, r3, true);
    }

    public dK(int r2, int r3, boolean r4) {
        this.Zo = new java.util.HashSet();
        this.VH = new java.util.LinkedList();
        this.gn = new java.util.LinkedList();
        this.FH = r2;
        this.Hw = r3;
        this.v5 = r4;
    }

    private abcd._J DW(abcd.YJ r3) {
        return (abcd._J) r3.j6(this.Hw, abcd._J.class);
    }

    private void j6(java.lang.String r4) {
        java.lang.String r0 = null;
    L4:
        if (this.VH.isEmpty() == true) goto L9;
        if (r4.startsWith(java.lang.String.valueOf(this.VH.getFirst()) + "/") == true) goto L9;
        r0 = this.VH.removeFirst();
    L9:
        if (r0 != null) goto L11;
        return;
    L11:
        if (this.gn.isEmpty() == true) goto L16;
        if (this.gn.getLast().startsWith(r0) == false) goto L16;
        this.gn.removeLast();
    L16:
        this.gn.addLast(r0);
    }

    public java.util.Set<java.lang.String> DW() {
        return this.Zo;
    }

    @Override
    public abcd.AbstractjK clone() {
        return this;
    }

    @Override
    public boolean j6() {
        return true;
    }

    @Override
    public boolean j6(abcd.YJ r7) {
        int r0 = r7.Zo();
        int r1 = r7.FH(this.Hw);
        java.lang.String r2 = r7.Hw();
        int r4 = 0;
        if (r7.VH() == true) goto L18;
        if (abcd.AbstractrE.j6.j6(r1) == false) goto L7;
        j6(r2);
        this.VH.addFirst(r2);
    L7:
        int r3 = 0;
    L8:
        if (r3 >= r0) goto L18;
        int r5 = r7.FH(r3);
        if (r3 == this.Hw) goto L16;
        if (r5 == 0) goto L16;
        if (abcd.AbstractrE.j6.j6(r5) == false) goto L16;
        this.VH.clear();
    L16:
        r3 = r3 + 1;
    L18:
        if (r1 != 0) goto L20;
        return true;
    L20:
        int r6 = r7.FH(this.FH);
        abcd._J r8 = DW(r7);
        if (r6 != 0) goto L42;
        if (this.v5 == true) goto L25;
    L40:
        return true;
    L25:
        if (r8.U2() == false) goto L40;
        this.Zo.add(r8.Zo());
        int r9 = 0;
    L27:
        if (r9 >= r0) goto L36;
        if (r9 == this.FH) goto L39;
        if (r9 == this.Hw) goto L39;
        if (r7.FH(r9) != 0) goto L36;
    L39:
        r9 = r9 + 1;
    L36:
        if (r9 != r0) goto L74;
        return false;
    L74:
        return true;
    L42:
        if (r7.u7() == false) goto L44;
        return true;
    L44:
        if (r4 >= r0) goto L46;
        if (r4 == this.FH) goto L57;
        if (r4 == this.Hw) goto L57;
        if (r7.FH(r4) != r6) goto L56;
        if (r7.j6(r4, this.FH) == true) goto L57;
    L56:
        return true;
    L57:
        r4 = r4 + 1;
        goto L44
    L46:
        return r8.j6(((abcd.RC) r7.j6(this.FH, abcd.RC.class)).J8(), true);
    }

    @Override
    public java.lang.String toString() {
        return "INDEX_DIFF_FILTER";
    }
}
