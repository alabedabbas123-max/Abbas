package abcd;

public final class yt {
    private int DW;
    private java.util.ArrayList<abcd.Abstractvt>[] EQ;
    private int FH;
    private int Hw;
    private boolean J0;
    private int VH;
    private int Zo;
    private final int gn;
    private java.util.ArrayList<abcd.tt> j6;
    private abcd.Abstractvt[] tp;
    private final boolean u7;
    private int v5;
    private java.util.List<abcd.Abstractvt>[] we;

    private yt(abcd.fs r1, int r2, boolean r3) {
        this.gn = r2;
        this.u7 = r3;
        this.J0 = false;
        this.VH = r1.j6().rN();
        this.Hw = r1.j6().BT();
        this.v5 = this.Hw;
    }

    public static abcd.au DW(abcd.Or r4, abcd.au r5) {
        abcd.au r0 = new abcd.au(r5.size());
        int r1 = r5.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r0.DW(r4.Hw(r5.get(r2)));
        r2 = r2 + 1;
        goto L3
    L5:
        return r0;
    }

    private void DW(abcd.Abstractvt r5, abcd.cs r6) {
        if (r6 != null) goto L4;
        return;
    L4:
        int r0 = r6.size();
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L11;
        if (this.EQ[r6.get(r1).we()].remove(r5) == false) goto L10;
        r1 = r1 + 1;
        goto L5
    L10:
        throw new java.lang.RuntimeException("use not found");
    }

    static java.util.ArrayList[] DW(abcd.yt r0) {
        return r0.EQ;
    }

    private void XL() {
        if (this.J0 == true) goto L14;
        this.EQ = new java.util.ArrayList[this.Hw];
        int r0 = 0;
        int r1 = 0;
    L6:
        if (r1 >= this.Hw) goto L8;
        this.EQ[r1] = new java.util.ArrayList();
        r1 = r1 + 1;
        goto L6
    L8:
        j6(new abcd.xt(this));
        this.we = new java.util.List[this.Hw];
    L10:
        if (r0 >= this.Hw) goto L12;
        this.we[r0] = java.util.Collections.unmodifiableList(this.EQ[r0]);
        r0 = r0 + 1;
        goto L10
    L12:
        return;
    L14:
        throw new java.lang.RuntimeException("No use list in back mode");
    }

    private static abcd.Abstractvt j6(abcd.tt r6) {
        return new abcd.mt(new abcd.Zr(abcd.gs.j3, abcd.hs.j6, null, abcd.cs.FH), r6);
    }

    public static abcd.yt j6(abcd.fs r1, int r2, boolean r3) {
        abcd.yt r0 = new abcd.yt(r1, r2, r3);
        r0.j6(r1);
        return r0;
    }

    static java.util.BitSet j6(abcd.Or r4, abcd.au r5) {
        java.util.BitSet r0 = new java.util.BitSet(r4.size());
        int r1 = r5.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r0.set(r4.Hw(r5.get(r2)));
        r2 = r2 + 1;
        goto L3
    L5:
        return r0;
    }

    private void j6(abcd.fs r5) {
        int r0 = r5.j6().size();
        this.j6 = new java.util.ArrayList(r0 + 2);
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        abcd.tt r2 = abcd.tt.j6(r5, r1, this);
        this.j6.add(r2);
        r1 = r1 + 1;
        goto L3
    L5:
        int r6 = r5.j6().Hw(r5.DW());
        this.DW = this.j6.get(r6).QX().DW();
        this.FH = -1;
    }

    static abcd.Abstractvt[] j6(abcd.yt r0) {
        return r0.tp;
    }

    public int DW(int r3) {
        int r0 = this.v5;
        int r1 = this.Zo;
        int r2 = r0 + r1;
        this.Zo = r1 + r3;
        this.Hw = java.lang.Math.max(this.Hw, r3 + r2);
        return r2;
    }

    public java.util.ArrayList<abcd.tt> DW() {
        return this.j6;
    }

    void DW(abcd.Abstractvt r3) {
        if (this.EQ == null) goto L5;
        DW(r3, r3.tp());
    L5:
        abcd.bs r4 = r3.u7();
        abcd.Abstractvt[] r0 = this.tp;
        if (r0 == null) goto L10;
        if (r4 == null) goto L11;
        r0[r4.we()] = null;
        return;
    L11:
        return;
    }

    void EQ() {
        if (this.FH >= 0) goto L13;
        this.FH = this.j6.size();
        int r1 = this.FH;
        int r2 = this.VH;
        this.VH = r2 + 1;
        abcd.tt r0 = new abcd.tt(r1, r2, this);
        this.j6.add(r0);
        java.util.Iterator<abcd.tt> r3 = this.j6.iterator();
    L6:
        if (r3.hasNext() == false) goto L9;
        r3.next().FH(r0);
        goto L6
    L9:
        if (r0.VH().cardinality() != 0) goto L16;
        this.j6.remove(this.FH);
        this.FH = -1;
        this.VH--;
        return;
    L16:
        return;
    L13:
        throw new java.lang.RuntimeException("must be called at most once");
    }

    public int FH() {
        java.util.Iterator<abcd.tt> r0 = this.j6.iterator();
        int r1 = 0;
    L4:
        if (r0.hasNext() == false) goto L8;
        if (r0.next().aM() == false) goto L4;
        r1 = r1 + 1;
        goto L4
    L8:
        return r1;
    }

    public abcd.Abstractvt FH(int r2) {
        if (this.J0 == true) goto L11;
        abcd.Abstractvt[] r0 = this.tp;
        if (r0 != null) goto L7;
        this.tp = new abcd.Abstractvt[u7()];
        j6(new abcd.wt(this));
        return this.tp[r2];
    L7:
        return r0[r2];
    L11:
        throw new java.lang.RuntimeException("No def list in back mode");
    }

    public abcd.tt Hw() {
        return this.j6.get(this.DW);
    }

    public java.util.List<abcd.Abstractvt> Hw(int r2) {
        if (this.we != null) goto L6;
        XL();
    L6:
        return this.we[r2];
    }

    public int J0() {
        int r0 = this.Hw;
        this.Hw = r0 + 1;
        this.v5 = this.Hw;
        J8();
        return r0;
    }

    public void J8() {
        this.tp = null;
        this.EQ = null;
        this.we = null;
    }

    public void QX() {
        this.J0 = true;
        this.EQ = null;
        this.tp = null;
    }

    public int VH() {
        return this.FH;
    }

    public void Ws() {
        this.Zo = 0;
    }

    public abcd.tt Zo() {
        int r0 = this.FH;
        if (r0 >= 0) goto L6;
        return null;
    L6:
        return this.j6.get(r0);
    }

    public int gn() {
        return this.gn;
    }

    public int j6(int r2) {
        if (r2 >= 0) goto L6;
        return -1;
    L6:
        return this.j6.get(r2).EQ();
    }

    public void j6() {
        java.util.Iterator<abcd.tt> r0 = this.j6.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        r0.next().v5(0);
        goto L4
    L6:
        java.util.ArrayList r1 = new java.util.ArrayList();
        r1.add(Hw());
    L8:
        if (r1.isEmpty() == true) goto L15;
        abcd.tt r2 = (abcd.tt) r1.remove(0);
        if (r2.aM() == true) goto L8;
        r2.v5(1);
        java.util.BitSet r3 = r2.Ws();
        int r4 = r3.nextSetBit(0);
    L13:
        if (r4 < 0) goto L8;
        r1.add(this.j6.get(r4));
        r4 = r3.nextSetBit(r4 + 1);
        goto L13
    }

    public void j6(abcd.Abstractqt r4) {
        java.util.Iterator<abcd.tt> r0 = DW().iterator();
    L4:
        if (r0.hasNext() == false) goto L9;
        java.util.Iterator<abcd.Abstractvt> r1 = r0.next().FH().iterator();
    L7:
        if (r1.hasNext() == false) goto L4;
        r1.next().j6(r4);
        goto L7
    L9:
        this.Hw = r4.j6();
        this.v5 = this.Hw;
    }

    public void j6(abcd.tt.b r7) {
        java.util.BitSet r0 = new java.util.BitSet(DW().size());
        java.util.Stack r1 = new java.util.Stack();
        r1.add(Hw());
    L4:
        if (r1.size() <= 0) goto L11;
        abcd.tt r2 = (abcd.tt) r1.pop();
        java.util.ArrayList<abcd.tt> r3 = r2.j6();
        if (r0.get(r2.DW()) == true) goto L4;
        int r4 = r3.size() - 1;
    L8:
        if (r4 < 0) goto L10;
        r1.add(r3.get(r4));
        r4 = r4 - 1;
        goto L8
    L10:
        r0.set(r2.DW());
        r7.j6(r2, null);
        goto L4
    }

    public void j6(abcd.Abstractvt.a r3) {
        java.util.Iterator<abcd.tt> r0 = this.j6.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        r0.next().j6(r3);
        goto L4
    }

    void j6(abcd.Abstractvt r2) {
        j6(r2, null);
        j6(r2, null);
    }

    void j6(abcd.Abstractvt r3, abcd.bs r4) {
        if (this.tp != null) goto L5;
        return;
    L5:
        if (r4 == null) goto L7;
        int r5 = r4.we();
        this.tp[r5] = null;
    L7:
        abcd.bs r6 = r3.u7();
        if (r6 == null) goto L14;
        int r0 = r6.we();
        abcd.Abstractvt[] r1 = this.tp;
        if (r1[r0] != null) goto L13;
        r1[r6.we()] = r3;
        return;
    L13:
        throw new java.lang.RuntimeException("Duplicate add of insn");
    }

    void j6(abcd.Abstractvt r2, abcd.bs r3, abcd.bs r4) {
        if (this.EQ != null) goto L5;
        return;
    L5:
        if (r3 == null) goto L7;
        int r5 = r3.we();
        this.EQ[r5].remove(r2);
    L7:
        int r6 = r4.we();
        java.util.ArrayList<abcd.Abstractvt>[] r7 = this.EQ;
        if (r7.length > r6) goto L11;
        this.EQ = null;
        return;
    L11:
        r7[r6].add(r2);
    }

    void j6(abcd.Abstractvt r5, abcd.cs r6) {
        if (this.EQ != null) goto L5;
        return;
    L5:
        if (r6 == null) goto L7;
        DW(r5, r6);
    L7:
        abcd.cs r7 = r5.tp();
        int r0 = r7.size();
        int r1 = 0;
    L8:
        if (r1 >= r0) goto L10;
        int r2 = r7.get(r1).we();
        this.EQ[r2].add(r5);
        r1 = r1 + 1;
        goto L8
    }

    public void j6(java.util.Set<abcd.Abstractvt> r9) {
        java.util.Iterator<abcd.tt> r0 = DW().iterator();
    L4:
        if (r0.hasNext() == false) goto L28;
        abcd.tt r1 = r0.next();
        java.util.ArrayList<abcd.Abstractvt> r2 = r1.FH();
        int r3 = r2.size() - 1;
    L6:
        if (r3 < 0) goto L11;
        abcd.Abstractvt r5 = r2.get(r3);
        if (r9.contains(r5) == false) goto L10;
        DW(r5);
        r2.remove(r3);
    L10:
        r3 = r3 - 1;
        goto L6
    L11:
        int r4 = r2.size();
        if (r4 != 0) goto L14;
        abcd.Abstractvt r6 = null;
    L16:
        if (r1 == Zo()) goto L4;
        if (r4 == 0) goto L22;
        if (r6.gn() == null) goto L22;
        if (r6.gn().v5().DW() != 1) goto L4;
    L22:
        r2.add(abcd.Abstractvt.j6(new abcd.Zr(abcd.gs.j3, abcd.hs.j6, null, abcd.cs.FH), r1));
        java.util.BitSet r7 = r1.Ws();
        int r8 = r7.nextSetBit(0);
    L23:
        if (r8 < 0) goto L4;
        if (r8 == r1.u7()) goto L27;
        r1.Hw(r8);
    L27:
        r8 = r7.nextSetBit(r8 + 1);
        goto L23
    L14:
        r6 = r2.get(r4 - 1);
        goto L16
    }

    public void j6(boolean r8, abcd.tt.b r9) {
        java.util.BitSet r0 = new java.util.BitSet(this.j6.size());
        java.util.Stack r1 = new java.util.Stack();
        if (r8 == false) goto L5;
        abcd.tt r2 = Zo();
    L6:
        if (r2 != null) goto L8;
        return;
    L8:
        r1.add(null);
        r1.add(r2);
    L10:
        if (r1.size() <= 0) goto L20;
        abcd.tt r3 = (abcd.tt) r1.pop();
        abcd.tt r4 = (abcd.tt) r1.pop();
        if (r0.get(r3.DW()) == true) goto L10;
        if (r8 == false) goto L15;
        java.util.BitSet r5 = r3.VH();
    L16:
        int r6 = r5.nextSetBit(0);
    L17:
        if (r6 < 0) goto L19;
        r1.add(r3);
        r1.add(this.j6.get(r6));
        r6 = r5.nextSetBit(r6 + 1);
        goto L17
    L19:
        r0.set(r3.DW());
        r9.j6(r3, r4);
        goto L10
    L15:
        r5 = r3.Ws();
        goto L16
    L20:
        return;
    L5:
        r2 = Hw();
        goto L6
    }

    public boolean j6(abcd.bs r5) {
        abcd.Abstractvt r0 = FH(r5.we());
        if (r0 != null) goto L6;
        return false;
    L6:
        if (r0.FH() == null) goto L8;
        return true;
    L8:
        java.util.Iterator<abcd.Abstractvt> r6 = Hw(r5.we()).iterator();
    L10:
        if (r6.hasNext() == false) goto L16;
        abcd.Tr r1 = r6.next().gn();
        if (r1 == null) goto L10;
        if (r1.v5().Hw() != 54) goto L10;
        return true;
    L16:
        return false;
    }

    public java.util.ArrayList<abcd.Abstractvt>[] tp() {
        if (this.EQ != null) goto L5;
        XL();
    L5:
        java.util.ArrayList<abcd.Abstractvt>[] r0 = new java.util.ArrayList[this.Hw];
        int r1 = 0;
    L7:
        if (r1 >= this.Hw) goto L9;
        r0[r1] = new java.util.ArrayList(this.EQ[r1]);
        r1 = r1 + 1;
        goto L7
    L9:
        return r0;
    }

    public int u7() {
        return this.Hw;
    }

    public int v5() {
        return this.DW;
    }

    void v5(int r1) {
        this.Hw = r1;
        this.v5 = this.Hw;
        J8();
    }

    public abcd.tt we() {
        int r0 = this.j6.size();
        int r2 = this.VH;
        this.VH = r2 + 1;
        abcd.tt r1 = new abcd.tt(r0, r2, this);
        r1.FH().add(j6(r1));
        this.j6.add(r1);
        return r1;
    }
}
