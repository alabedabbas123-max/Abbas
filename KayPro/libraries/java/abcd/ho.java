package abcd;

public final class ho {
    private final int DW;
    private java.util.ArrayList<abcd.AbstractVn> FH;
    private boolean Hw;
    private int Zo;
    private final abcd.Fn j6;
    private boolean v5;

    public ho(abcd.Fn r1, int r2, int r3) {
        this.j6 = r1;
        this.DW = r3;
        this.FH = new java.util.ArrayList(r2);
        this.Zo = -1;
        this.Hw = false;
        this.v5 = false;
    }

    private abcd.Xn DW(abcd.AbstractVn r4) {
        abcd.Xn r0 = j6(r4.Hw(), r4.Zo());
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new abcd.Ut("No expanded opcode for " + r4);
    }

    private void DW(abcd.Xn[] r6) {
        if (this.Zo != 0) goto L10;
        int r0 = this.FH.size();
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L15;
        abcd.AbstractVn r2 = this.FH.get(r1);
        abcd.Xn r3 = r2.Zo();
        abcd.Xn r4 = r6[r1];
        if (r3 == r4) goto L9;
        this.FH.set(r1, r2.j6(r4));
    L9:
        r1 = r1 + 1;
        goto L5
    L15:
        return;
    L10:
        this.FH = FH(r6);
    }

    private java.util.ArrayList<abcd.AbstractVn> FH(abcd.Xn[] r10) {
        int r0 = this.FH.size();
        java.util.ArrayList<abcd.AbstractVn> r1 = new java.util.ArrayList(r0 * 2);
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L16;
        abcd.AbstractVn r3 = this.FH.get(r2);
        abcd.Xn r4 = r3.Zo();
        abcd.Xn r5 = r10[r2];
        abcd.AbstractVn r6 = null;
        if (r5 == null) goto L7;
        abcd.AbstractVn r8 = null;
    L8:
        if (r6 == null) goto L10;
        r1.add(r6);
    L10:
        if (r5 == r4) goto L12;
        r3 = r3.j6(r5);
    L12:
        r1.add(r3);
        if (r8 == null) goto L15;
        r1.add(r8);
    L15:
        r2 = r2 + 1;
        goto L3
    L7:
        r5 = DW(r3);
        java.util.BitSet r7 = r5.DW().FH(r3);
        abcd.AbstractVn r9 = r3.j6(r7);
        r8 = r3.DW(r7);
        r3 = r3.FH(r7);
        r6 = r9;
        goto L8
    L16:
        return r1;
    }

    private static boolean FH(abcd.AbstractVn r5) {
        if ((r5 instanceof abcd.Cdo) == false) goto L11;
        abcd.ds r6 = ((abcd.Cdo) r5).we();
        int r0 = r6.size();
        int r3 = 0;
    L5:
        if (r3 >= r0) goto L15;
        if (j6(r6.get(r3)) == true) goto L8;
        r3 = r3 + 1;
        goto L5
    L8:
        return true;
    L15:
        return false;
    L11:
        if ((r5 instanceof abcd.eo) == false) goto L15;
        if (j6(((abcd.eo) r5).we()) == false) goto L15;
        return true;
    }

    private void Hw(abcd.AbstractVn r3) {
        if (this.Hw == true) goto L8;
        if (r3.VH().j6() < 0) goto L8;
        this.Hw = true;
    L8:
        if (this.v5 == false) goto L10;
        return;
    L10:
        if (FH(r3) == false) goto L14;
        this.v5 = true;
        return;
    }

    private void Hw(abcd.Xn[] r8) {
        int r0 = this.Zo;
        if (r0 >= 0) goto L5;
        r0 = 0;
    L5:
        int r2 = j6(r8);
        if (r0 >= r2) goto L7;
        int r1 = r2 - r0;
        int r3 = this.FH.size();
        int r4 = 0;
    L10:
        if (r4 >= r3) goto L15;
        abcd.AbstractVn r5 = this.FH.get(r4);
        if ((r5 instanceof abcd.Sn) == true) goto L14;
        this.FH.set(r4, r5.DW(r1));
    L14:
        r4 = r4 + 1;
        goto L10
    L15:
        r0 = r2;
        goto L5
    L7:
        this.Zo = r0;
    }

    private boolean VH() {
        int r0 = this.FH.size();
        int r1 = 0;
        boolean r2 = false;
    L3:
        if (r1 >= r0) goto L25;
        abcd.AbstractVn r3 = this.FH.get(r1);
        if ((r3 instanceof abcd.po) == false) goto L20;
        abcd.Xn r4 = r3.Zo();
        abcd.po r6 = (abcd.po) r3;
        if (r4.DW().j6(r6) == true) goto L20;
        if (r4.j6() != 40) goto L26;
        abcd.Xn r5 = j6(r3, r4);
        if (r5 == null) goto L16;
        this.FH.set(r1, r3.j6(r5));
    L19:
        r2 = true;
        goto L20
    L16:
        throw new java.lang.UnsupportedOperationException("method too long");
    L26:
        int r7 = r1 + 1;     // Catch: java.lang.ClassCastException -> L21 java.lang.IndexOutOfBoundsException -> L23
        abcd.Sn r8 = (abcd.Sn) this.FH.get(r7);     // Catch: java.lang.ClassCastException -> L21 java.lang.IndexOutOfBoundsException -> L23
        abcd.po r9 = new abcd.po(abcd.C0465Yn.vJ, r6.VH(), abcd.cs.FH, r6.we());
        this.FH.set(r1, r9);
        this.FH.add(r1, r6.j6(r8));
        r0 = r0 + 1;
        r1 = r7;
        goto L19
    L22:
        throw new java.lang.IllegalStateException("unpaired TargetInsn");
    L24:
        throw new java.lang.IllegalStateException("unpaired TargetInsn (dangling)");
    L20:
        r1 = r1 + 1;
        goto L3
    L25:
        return r2;
    }

    private void Zo() {
    L2:
        v5();
        if (VH() == true) goto L2;
    }

    private abcd.Xn[] gn() {
        int r0 = this.FH.size();
        abcd.Xn[] r1 = new abcd.Xn[r0];
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1[r2] = this.FH.get(r2).Zo();
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    private int j6(abcd.Xn[] r7) {
        int r0 = this.FH.size();
        int r1 = this.Zo;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L13;
        abcd.AbstractVn r3 = this.FH.get(r2);
        abcd.Xn r4 = r7[r2];
        abcd.Xn r5 = j6(r3, r4);
        if (r5 != null) goto L9;
        int r6 = r3.Hw(DW(r3).DW().FH(r3));
        if (r6 <= r1) goto L11;
        r1 = r6;
    L11:
        r7[r2] = r5;
    L12:
        r2 = r2 + 1;
        goto L3
    L9:
        if (r4 != r5) goto L11;
    L13:
        return r1;
    }

    private abcd.Xn j6(abcd.AbstractVn r2, abcd.Xn r3) {
    L2:
        if (r3 == null) goto L7;
        if (r3.DW().VH(r2) == true) goto L7;
        r3 = abcd.C0465Yn.j6(r3, this.j6);
    L7:
        return r3;
    }

    private static void j6(abcd.Tn r2, abcd.Un.a r3) {
        abcd.Abstractms r0 = r2.we();
        int r1 = r3.j6(r0);
        if (r1 < 0) goto L6;
        r2.Hw(r1);
    L6:
        if ((r0 instanceof abcd.Fs) == false) goto L11;
        int r4 = r3.j6(((abcd.Fs) r0).VH());
        if (r4 < 0) goto L12;
        r2.FH(r4);
        return;
    L12:
        return;
    }

    private static void j6(java.util.HashSet<abcd.Abstractms> r3, abcd.AbstractVn r4) {
        if ((r4 instanceof abcd.Tn) == false) goto L6;
        r3.add(((abcd.Tn) r4).we());
        return;
    L6:
        if ((r4 instanceof abcd.Cdo) == false) goto L11;
        abcd.ds r5 = ((abcd.Cdo) r4).we();
        int r0 = r5.size();
        int r1 = 0;
    L8:
        if (r1 >= r0) goto L17;
        j6(r3, r5.get(r1));
        r1 = r1 + 1;
        goto L8
    L17:
        return;
    L11:
        if ((r4 instanceof abcd.eo) == false) goto L16;
        j6(r3, ((abcd.eo) r4).we());
        return;
    }

    private static void j6(java.util.HashSet<abcd.Abstractms> r3, abcd.bs r4) {
        if (r4 != null) goto L4;
        return;
    L4:
        abcd.Vr r0 = r4.Zo();
        abcd.Js r1 = r0.Hw();
        abcd.Js r2 = r0.Zo();
        abcd.Qs r5 = r4.getType();
        if (r5 == abcd.Qs.EQ) goto L7;
        r3.add(abcd.Ks.DW(r5));
    L7:
        if (r1 == null) goto L9;
        r3.add(r1);
    L9:
        if (r2 == null) goto L12;
        r3.add(r2);
        return;
    }

    private static boolean j6(abcd.bs r0) {
        if (r0 != null) goto L4;
    L6:
        return false;
    L4:
        if (r0.Zo().Hw() == null) goto L6;
        return true;
    }

    private void v5() {
        int r0 = this.FH.size();
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r0) goto L5;
        abcd.AbstractVn r3 = this.FH.get(r1);
        r3.j6(r2);
        r2 = r2 + r3.DW();
        r1 = r1 + 1;
        goto L3
    }

    public java.util.HashSet<abcd.Abstractms> DW() {
        java.util.HashSet<abcd.Abstractms> r0 = new java.util.HashSet(20);
        java.util.Iterator<abcd.AbstractVn> r1 = this.FH.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        j6(r0, r1.next());
        goto L4
    L6:
        return r0;
    }

    public boolean FH() {
        return this.v5;
    }

    public boolean Hw() {
        return this.Hw;
    }

    public abcd.Wn j6() {
        if (this.Zo >= 0) goto L7;
        abcd.Xn[] r0 = gn();
        Hw(r0);
        DW(r0);
        Zo();
        return abcd.Wn.j6(this.FH, this.Zo + this.DW);
    L7:
        throw new java.lang.UnsupportedOperationException("already processed");
    }

    public void j6(int r3, abcd.Sn r4) {
        int r0 = (this.FH.size() - r3) - 1;
        this.FH.set(r0, ((abcd.po) this.FH.get(r0)).j6(r4));
        return;
    L7:
        throw new java.lang.IllegalArgumentException("non-reversible instruction");
    L9:
        throw new java.lang.IllegalArgumentException("too few instructions");
    }

    public void j6(abcd.Un.a r4) {
        java.util.Iterator<abcd.AbstractVn> r0 = this.FH.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        abcd.AbstractVn r1 = r0.next();
        if ((r1 instanceof abcd.Tn) == false) goto L4;
        j6((abcd.Tn) r1, r4);
        goto L4
    }

    public void j6(abcd.AbstractVn r2) {
        this.FH.add(r2);
        Hw(r2);
    }
}
