package abcd;

public final class tt {
    public static final java.util.Comparator<abcd.tt> j6 = null;
    private java.util.ArrayList<abcd.Abstractvt> DW;
    private int EQ;
    private java.util.BitSet FH;
    private java.util.BitSet Hw;
    private int J0;
    private abcd.Interfacebu J8;
    private int VH;
    private abcd.Interfacebu Ws;
    private int Zo;
    private abcd.yt gn;
    private final java.util.ArrayList<abcd.tt> tp;
    private int u7;
    private abcd.au v5;
    private int we;

    public static final class a implements java.util.Comparator<abcd.tt> {
        public a() {
        }

        @Override
        public int compare(abcd.tt r1, abcd.tt r2) {
            return j6(r1, r2);
        }

        public int j6(abcd.tt r1, abcd.tt r2) {
            int r3 = abcd.tt.j6(r1);
            int r4 = abcd.tt.j6(r2);
            if (r3 >= r4) goto L6;
            return -1;
        L6:
            if (r3 <= r4) goto L9;
            return 1;
        L9:
            return 0;
        }
    }

    public interface b {
        void j6(abcd.tt r1, abcd.tt r2);
    }

    static {
        j6 = new abcd.tt.a();
    }

    public tt(int r3, int r4, abcd.yt r5) {
        this.Zo = -1;
        this.EQ = 0;
        this.we = 0;
        this.J0 = -1;
        this.gn = r5;
        this.u7 = r3;
        this.DW = new java.util.ArrayList();
        this.VH = r4;
        this.FH = new java.util.BitSet(r5.DW().size());
        this.Hw = new java.util.BitSet(r5.DW().size());
        this.v5 = new abcd.au();
        this.tp = new java.util.ArrayList();
    }

    private static void DW(java.util.BitSet r2, abcd.bs r3) {
        r2.set(r3.we());
        if (r3.Hw() <= 1) goto L6;
        r2.set(r3.we() + 1);
        return;
    }

    private int U2() {
        int r0 = this.DW.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        if ((this.DW.get(r1) instanceof abcd.ot) == false) goto L8;
        r1 = r1 + 1;
    L8:
        return r1;
    }

    static int j6(abcd.tt r0) {
        return r0.VH;
    }

    public static abcd.tt j6(abcd.fs r7, int r8, abcd.yt r9) {
        abcd.Or r0 = r7.j6();
        abcd.Nr r1 = r0.get(r8);
        abcd.tt r2 = new abcd.tt(r8, r1.DW(), r9);
        abcd.Ur r10 = r1.Hw();
        r2.DW.ensureCapacity(r10.size());
        int r11 = r10.size();
        int r3 = 0;
    L3:
        if (r3 >= r11) goto L5;
        r2.DW.add(new abcd.mt(r10.get(r3), r2));
        r3 = r3 + 1;
        goto L3
    L5:
        r2.FH = abcd.yt.j6(r0, r7.j6(r1.DW()));
        r2.Hw = abcd.yt.j6(r0, r1.gn());
        r2.v5 = abcd.yt.DW(r0, r1.gn());
        if (r2.v5.size() == 0) goto L12;
        int r12 = r1.Zo();
        if (r12 >= 0) goto L10;
        int r13 = -1;
    L11:
        r2.Zo = r13;
        goto L12
    L10:
        r13 = r0.Hw(r12);
    L12:
        return r2;
    }

    private void j6(java.util.List<abcd.Abstractvt> r12) {
        java.util.BitSet r0 = new java.util.BitSet(this.gn.u7());
        java.util.BitSet r1 = new java.util.BitSet(this.gn.u7());
        int r4 = r12.size();
        int r2 = 0;
    L3:
        if (r2 >= r4) goto L25;
        int r5 = r2;
    L5:
        if (r5 >= r4) goto L7;
        DW(r0, r12.get(r5).tp().get(0));
        DW(r1, r12.get(r5).u7());
        r5 = r5 + 1;
        goto L5
    L7:
        int r6 = r2;
        int r7 = r6;
    L8:
        if (r6 >= r4) goto L13;
        if (j6(r0, r12.get(r6).u7()) == true) goto L12;
        java.util.Collections.swap(r12, r6, r7);
        r7 = r7 + 1;
    L12:
        r6 = r6 + 1;
        goto L8
    L13:
        if (r2 != r7) goto L23;
        abcd.Abstractvt r3 = null;
        int r8 = r7;
    L15:
        if (r8 >= r4) goto L22;
        abcd.Abstractvt r9 = r12.get(r8);
        if (j6(r0, r9.u7()) == false) goto L21;
        if (j6(r1, r9.tp().get(0)) == false) goto L21;
        java.util.Collections.swap(r12, r7, r8);
        r3 = r9;
    L21:
        r8 = r8 + 1;
    L22:
        abcd.bs r10 = r3.u7();
        abcd.bs r11 = r10.FH(this.gn.DW(r10.Hw()));
        abcd.mt r13 = new abcd.mt(new abcd.Zr(abcd.gs.u7(r10.getType()), abcd.hs.j6, r11, r3.tp()), this);
        r2 = r7 + 1;
        r12.add(r7, r13);
        abcd.cs r14 = abcd.cs.j6(r11);
        r12.set(r2, new abcd.mt(new abcd.Zr(abcd.gs.u7(r10.getType()), abcd.hs.j6, r10, r14), this));
        r4 = r12.size();
    L24:
        r0.clear();
        r1.clear();
        goto L3
    L23:
        r2 = r7;
        goto L24
    }

    private static boolean j6(java.util.BitSet r3, abcd.bs r4) {
        int r0 = r4.we();
        int r5 = r4.Hw();
        if (r3.get(r0) == false) goto L5;
        return true;
    L5:
        if (r5 == 2) goto L7;
    L9:
        return false;
    L7:
        if (r3.get(r0 + 1) == false) goto L9;
        return true;
    }

    public int DW() {
        return this.u7;
    }

    public void DW(int r2) {
        if (this.Ws != null) goto L5;
        this.Ws = abcd.st.FH(this.gn.u7());
    L5:
        this.Ws.add(r2);
    }

    public void DW(abcd.Tr r5) {
        if (r5.v5().DW() == 1) goto L7;
        java.util.ArrayList<abcd.Abstractvt> r0 = this.DW;
        abcd.Abstractvt r1 = r0.get(r0.size() - 1);
        abcd.Abstractvt r6 = abcd.Abstractvt.j6(r5, this);
        java.util.ArrayList<abcd.Abstractvt> r2 = this.DW;
        r2.set(r2.size() - 1, r6);
        this.gn.DW(r1);
        this.gn.j6(r6);
        return;
    L7:
        throw new java.lang.IllegalArgumentException("last insn must branch");
    }

    public void DW(abcd.bs r5, abcd.bs r6) {
        if (r5.we() != r6.we()) goto L5;
        return;
    L5:
        java.util.ArrayList<abcd.Abstractvt> r0 = this.DW;
        abcd.mt r1 = (abcd.mt) r0.get(r0.size() - 1);
        if (r1.u7() == null) goto L8;
    L11:
        int r2 = this.Hw.nextSetBit(0);
    L12:
        if (r2 < 0) goto L16;
        this.gn.DW().get(r2).j6(r5, r6);
        r2 = this.Hw.nextSetBit(r2 + 1);
        goto L12
    L16:
        return;
    L8:
        if (r1.tp().size() > 0) goto L11;
        abcd.mt r3 = new abcd.mt(new abcd.Zr(abcd.gs.u7(r5.getType()), abcd.hs.j6, r5, abcd.cs.j6(r6)), this);
        java.util.ArrayList<abcd.Abstractvt> r7 = this.DW;
        r7.add(r7.size() - 1, r3);
        this.EQ++;
    }

    public void DW(abcd.tt r2) {
        this.tp.add(r2);
    }

    public int EQ() {
        return this.VH;
    }

    public java.util.ArrayList<abcd.Abstractvt> FH() {
        return this.DW;
    }

    public void FH(int r3) {
        this.DW.add(0, new abcd.ot(r3, this));
    }

    public void FH(abcd.tt r3) {
        if (this != r3) goto L5;
        return;
    L5:
        if (this.v5.size() != 0) goto L8;
        this.Hw.set(r3.u7);
        this.v5.DW(r3.u7);
        this.Zo = r3.u7;
        r3.FH.set(this.u7);
        return;
    }

    public abcd.Interfacebu Hw() {
        if (this.Ws != null) goto L6;
        this.Ws = abcd.st.FH(this.gn.u7());
    L6:
        return this.Ws;
    }

    public abcd.tt Hw(abcd.tt r5) {
        abcd.tt r0 = this.gn.we();
        if (this.Hw.get(r5.u7) == false) goto L16;
        r0.FH.set(this.u7);
        r0.Hw.set(r5.u7);
        r0.v5.DW(r5.u7);
        r0.Zo = r5.u7;
        int r1 = this.v5.size() - 1;
    L5:
        if (r1 < 0) goto L11;
        if (this.v5.get(r1) != r5.u7) goto L9;
        this.v5.FH(r1, r0.u7);
    L9:
        r1 = r1 - 1;
        goto L5
    L11:
        if (this.Zo != r5.u7) goto L13;
        this.Zo = r0.u7;
    L13:
        this.Hw.clear(r5.u7);
        this.Hw.set(r0.u7);
        r5.FH.set(r0.u7);
        r5.FH.set(this.u7, this.Hw.get(r5.u7));
        return r0;
    L16:
        throw new java.lang.RuntimeException("Block " + r5.we() + " not successor of " + we());
    }

    public void Hw(int r4) {
        int r0 = this.v5.size() - 1;
        int r1 = 0;
    L3:
        if (r0 < 0) goto L9;
        if (this.v5.get(r0) != r4) goto L7;
        r1 = r0;
    L8:
        r0 = r0 - 1;
        goto L3
    L7:
        this.Zo = this.v5.get(r0);
        goto L8
    L9:
        this.v5.VH(r1);
        this.Hw.clear(r4);
        this.gn.DW().get(r4).FH.clear(this.u7);
    }

    public abcd.au J0() {
        abcd.au r0 = new abcd.au(this.v5.size());
        int r1 = this.v5.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r0.DW(this.gn.j6(this.v5.get(r2)));
        r2 = r2 + 1;
        goto L3
    L5:
        return r0;
    }

    public abcd.au J8() {
        return this.v5;
    }

    public void Mr() {
        int r0 = this.we;
        if (r0 <= 1) goto L10;
        j6(this.DW.subList(0, r0));
        if (this.DW.get(this.we).J0() == false) goto L10;
        throw new java.lang.RuntimeException("Unexpected: moves from phis before move-exception");
    L10:
        if (this.EQ <= 1) goto L12;
        java.util.ArrayList<abcd.Abstractvt> r1 = this.DW;
        j6(r1.subList((r1.size() - this.EQ) - 1, this.DW.size() - 1));
    L12:
        this.gn.Ws();
    }

    public abcd.tt QX() {
        abcd.tt r0 = this.gn.we();
        r0.FH = this.FH;
        r0.Hw.set(this.u7);
        r0.v5.DW(this.u7);
        r0.Zo = this.u7;
        this.FH = new java.util.BitSet(this.gn.DW().size());
        this.FH.set(r0.u7);
        int r1 = r0.FH.nextSetBit(0);
    L3:
        if (r1 < 0) goto L5;
        this.gn.DW().get(r1).j6(this.u7, r0.u7);
        r1 = r0.FH.nextSetBit(r1 + 1);
        goto L3
    L5:
        return r0;
    }

    public java.util.BitSet VH() {
        return this.FH;
    }

    public java.util.BitSet Ws() {
        return this.Hw;
    }

    public boolean XL() {
        if (this.u7 != this.gn.VH()) goto L5;
        return true;
    L5:
        return false;
    }

    public java.util.List<abcd.Abstractvt> Zo() {
        return this.DW.subList(0, U2());
    }

    public boolean aM() {
        if (this.J0 != (-1)) goto L6;
        this.gn.j6();
    L6:
        if (this.J0 == 1) goto L10;
        return false;
    L10:
        return true;
    }

    public abcd.tt gn() {
        if (this.Zo >= 0) goto L7;
        return null;
    L7:
        return this.gn.DW().get(this.Zo);
    }

    public void j3() {
        this.DW.subList(0, U2()).clear();
    }

    public java.util.ArrayList<abcd.tt> j6() {
        return this.tp;
    }

    public void j6(int r2) {
        if (this.J8 != null) goto L5;
        this.J8 = abcd.st.FH(this.gn.u7());
    L5:
        this.J8.add(r2);
    }

    public void j6(int r3, int r4) {
        if (r3 != r4) goto L4;
        return;
    L4:
        this.Hw.set(r4);
        if (this.Zo != r3) goto L7;
        this.Zo = r4;
    L7:
        int r0 = this.v5.size() - 1;
    L8:
        if (r0 < 0) goto L13;
        if (this.v5.get(r0) != r3) goto L12;
        this.v5.FH(r0, r4);
    L12:
        r0 = r0 - 1;
        goto L8
    L13:
        this.Hw.clear(r3);
        this.gn.DW().get(r4).FH.set(this.u7);
        this.gn.DW().get(r3).FH.clear(this.u7);
    }

    public void j6(abcd.Tr r3) {
        abcd.Abstractvt r4 = abcd.Abstractvt.j6(r3, this);
        this.DW.add(U2(), r4);
        this.gn.j6(r4);
    }

    public void j6(abcd.bs r3) {
        this.DW.add(0, new abcd.ot(r3, this));
    }

    public void j6(abcd.bs r5, abcd.bs r6) {
        if (r5.we() != r6.we()) goto L5;
        return;
    L5:
        this.DW.add(U2(), new abcd.mt(new abcd.Zr(abcd.gs.u7(r5.getType()), abcd.hs.j6, r5, abcd.cs.j6(r6)), this));
        this.we++;
    }

    public void j6(abcd.ot.b r5) {
        int r0 = this.DW.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L7;
        abcd.Abstractvt r2 = this.DW.get(r1);
        if ((r2 instanceof abcd.ot) == false) goto L10;
        r5.j6((abcd.ot) r2);
        r1 = r1 + 1;
        goto L3
    L10:
        return;
    }

    public void j6(abcd.Abstractvt.a r4) {
        int r0 = this.DW.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        this.DW.get(r1).j6(r4);
        r1 = r1 + 1;
        goto L3
    }

    public java.lang.String toString() {
        return "{" + this.u7 + ":" + abcd.Yt.v5(this.VH) + '}';
    }

    public int tp() {
        return this.gn.j6(this.Zo);
    }

    public int u7() {
        return this.Zo;
    }

    public abcd.yt v5() {
        return this.gn;
    }

    public void v5(int r1) {
        this.J0 = r1;
    }

    public java.lang.String we() {
        return abcd.Yt.v5(this.VH);
    }
}
