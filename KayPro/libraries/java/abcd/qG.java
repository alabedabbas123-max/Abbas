package abcd;

public class qG implements java.lang.Iterable<abcd.dG> {
    final abcd.IE DW;
    private final java.util.EnumSet<abcd.EnumkG> EQ;
    final abcd.uE FH;
    AE<abcd.AbstractiG> Hw;
    private abcd.AbstractjK J0;
    private boolean J8;
    int VH;
    private int Zo;
    final java.util.ArrayList<abcd.dG> gn;
    final abcd.UE j6;
    abcd.XF tp;
    abcd.LF u7;
    private int v5;
    private abcd.AbstractyG we;

    public qG(abcd.IE r2) {
        this(null, r2);
    }

    public qG(abcd.UE r2) {
        this(r2, r2.j3());
    }

    private qG(abcd.UE r2, abcd.IE r3) {
        this.v5 = -64;
        this.VH = 4;
        this.j6 = r2;
        this.DW = r3;
        this.FH = new abcd.uE();
        this.Hw = new abcd.AE();
        this.gn = new java.util.ArrayList();
        this.u7 = new abcd.QF();
        this.tp = new abcd.C1329tG(this);
        this.EQ = java.util.EnumSet.of(abcd.EnumkG.j6);
        this.we = abcd.AbstractyG.j6;
        this.J0 = abcd.AbstractjK.j6;
        this.J8 = true;
    }

    private void J8() {
        int r0 = this.Zo;
        if (r0 == 0) goto L6;
        this.v5 |= r0;
        this.VH = (r0 ^ (-1)) & this.VH;
        this.Zo = 0;
        return;
    }

    private boolean Ws() {
        return this.tp instanceof abcd.C1329tG;
    }

    private abcd.AbstractiG j6(abcd.YD r4, abcd.FE r5) {
        int r0 = r5.FH();
        if (r0 != 1) goto L5;
        abcd.dG r1 = j6(r4);
        r1.j6(this, j6(r1, r5));
        abcd.AbstractiG r2 = r1;
    L16:
        this.Hw.j6(r2);
        return r2;
    L5:
        if (r0 != 2) goto L7;
        abcd.mG r3 = new abcd.mG(r4);
        r3.EQ |= 1;
        r2 = r3;
        goto L16
    L7:
        if (r0 != 3) goto L9;
        abcd.cG r6 = new abcd.cG(r4);
        r6.EQ |= 1;
        r2 = r6;
        goto L16
    L9:
        if (r0 != 4) goto L12;
        abcd.lG r7 = new abcd.lG(r4);
        r7.j6(this, j6(r7, r5));
        r2 = r7;
        goto L16
    L12:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().badObjectType, new java.lang.Object[]{java.lang.Integer.valueOf(r0)}));
    }

    static abcd.AbstractiG j6(abcd.qG r0, abcd.YD r1, abcd.FE r2) {
        return r0.j6(r1, r2);
    }

    public abcd.cG DW(abcd.YD r2) {
        abcd.cG r0 = (abcd.cG) this.Hw.DW(r2);
        if (r0 != null) goto L6;
        abcd.cG r1 = new abcd.cG(r2);
        this.Hw.j6(r1);
        return r1;
    L6:
        return r0;
    }

    public void DW(abcd.dG r3) {
        int r0 = r3.EQ;
        if ((r0 & 2) == 0) goto L6;
        return;
    L6:
        if ((r0 & 1) != 0) goto L8;
        r3.j6(this);
    L8:
        r3.EQ |= 2;
        this.gn.add(r3);
        this.u7.j6(r3);
    }

    public void DW(abcd.AbstractiG r2) {
        if ((r2.EQ & 1) != 0) goto L6;
        r2.j6(this);
        return;
    }

    public void DW(abcd.EnumkG r2) {
        Hw();
        this.EQ.clear();
        this.EQ.add(r2);
    }

    public void EQ() {
        this.DW.FH();
    }

    int FH() {
        int r0 = this.v5;
        if (r0 == 0) goto L7;
        int r1 = java.lang.Integer.lowestOneBit(r0);
        this.v5 &= r1 ^ (-1);
        return r1;
    L7:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().flagsAlreadyCreated, new java.lang.Object[]{26}));
    }

    public abcd.dG FH(abcd.YD r2) {
        abcd.dG r0 = (abcd.dG) this.Hw.DW(r2);
        if (r0 != null) goto L6;
        abcd.dG r1 = j6(r2);
        this.Hw.j6(r1);
        return r1;
    L6:
        return r0;
    }

    public abcd.AbstractiG FH(abcd.AbstractiG r2) {
    L3:
        if ((r2 instanceof abcd.lG) == false) goto L4;
        DW(r2);
        r2 = ((abcd.lG) r2).j3();
        goto L3
    L4:
        DW(r2);
        return r2;
    }

    public void FH(abcd.dG r2) {
        r2.EQ |= 4;
        j6(r2);
        DW(r2);
    }

    public abcd.AbstractiG Hw(abcd.YD r2) {
        return (abcd.AbstractiG) this.Hw.DW(r2);
    }

    protected void Hw() {
        if (Ws() == false) goto L6;
        return;
    L6:
        throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().outputHasAlreadyBeenStarted);
    }

    public abcd._F J0() {
        abcd._F r0 = new abcd._F(this.DW);
        r0.Hw = this.Hw;
        r0.v5 = this.v5;
        return r0;
    }

    public abcd.dG VH(abcd.YD r3) {
        abcd.AbstractiG r0 = FH(Zo(r3));
        if ((r0 instanceof abcd.dG) == false) goto L7;
        return (abcd.dG) r0;
    L7:
        throw new abcd.ZC(r3.J8(), "commit");
    }

    public abcd.AbstractyG VH() {
        return this.we;
    }

    public abcd.IE Zo() {
        return this.DW;
    }

    public abcd.AbstractiG Zo(abcd.YD r2) {
        abcd.AbstractiG r0 = (abcd.AbstractiG) this.Hw.DW(r2);
        if (r0 == null) goto L7;
        DW(r0);
        return r0;
    L7:
        return j6(r2, this.DW.FH(r2));
    }

    protected void Zo(int r9) {
        J8();
        int r10 = r9 | 1;
        int r0 = r10 ^ (-1);
        abcd.UF r1 = new abcd.UF();
        java.util.Iterator<abcd.dG> r2 = this.gn.iterator();
    L4:
        if (r2.hasNext() == false) goto L5;
        abcd.dG r3 = r2.next();
        int r4 = r3.EQ;
        if ((r4 & r0) == 0) goto L4;
        r3.EQ = r4 & r10;
        r3.gW();
        r1.j6(r3);
    L5:
        abcd.dG r5 = r1.j6();
        if (r5 == null) goto L7;
        abcd.dG[] r6 = r5.J8;
        if (r6 == null) goto L5;
        int r7 = r6.length;
        int r8 = 0;
    L13:
        if (r8 >= r7) goto L5;
        abcd.dG r11 = r6[r8];
        int r12 = r11.EQ;
        if ((r12 & r0) == 0) goto L19;
        r11.EQ = r12 & r10;
        r11.gW();
        r1.j6(r11);
    L19:
        r8 = r8 + 1;
        goto L13
    L7:
        this.gn.clear();
        this.u7 = new abcd.QF();
        this.tp = new abcd.C1329tG(this);
    }

    public abcd.AbstractjK gn() {
        return this.J0;
    }

    public abcd.mG gn(abcd.YD r3) {
        abcd.AbstractiG r0 = FH(Zo(r3));
        if ((r0 instanceof abcd.dG) == false) goto L6;
        abcd.mG r4 = ((abcd.dG) r0).yS();
    L8:
        DW(r4);
        return r4;
    L6:
        if ((r0 instanceof abcd.mG) == false) goto L11;
        r4 = (abcd.mG) r0;
        goto L8
    L11:
        throw new abcd.ZC(r3.J8(), "tree");
    }

    @Override
    public java.util.Iterator<abcd.dG> iterator() {
    L4:
        return new abcd.pG(this, tp());
    L8:
        e = move-exception;
        throw new abcd.qD(e);
    L11:
        e = move-exception;
        throw new abcd.qD(e);
    L5:
        e = move-exception;
        throw new abcd.qD(e);
    }

    public <T extends abcd.yE> abcd.MF j6(java.lang.Iterable<T> r6, boolean r7) {
        java.util.ArrayList r0 = new java.util.ArrayList();
        java.util.ArrayList r1 = new java.util.ArrayList();
        java.util.Iterator<T> r8 = r6.iterator();
    L4:
        if (r8.hasNext() == false) goto L5;
        T r2 = r8.next();
        abcd.AbstractiG r3 = (abcd.AbstractiG) this.Hw.DW(r2);
        if (r3 == null) goto L16;
        if ((r3.EQ & 1) == 0) goto L16;
        r1.add(r3);
    L16:
        r0.add(r2);
        goto L4
    L5:
        java.util.Iterator r9 = r1.iterator();
        if (r0.isEmpty() == false) goto L10;
        return new abcd.nG(this, r9);
    L10:
        return new abcd.C1116oG(this, r9, this.DW.DW(r0, r7));
    }

    protected abcd.dG j6(abcd.YD r2) {
        return new abcd.dG(r2);
    }

    public abcd.fG j6(java.lang.String r3) {
        return new abcd.fG(this, r3, FH());
    }

    public abcd.AbstractiG j6(abcd.YD r4, int r5) {
        abcd.AbstractiG r0 = (abcd.AbstractiG) this.Hw.DW(r4);
        if (r0 == null) goto L5;
    L20:
        return r0;
    L5:
        if (r5 != 1) goto L7;
        r0 = j6(r4);
    L19:
        this.Hw.j6(r0);
        goto L20
    L7:
        if (r5 != 2) goto L9;
        abcd.AbstractiG r6 = new abcd.mG(r4);
    L17:
        r0 = r6;
        goto L19
    L9:
        if (r5 != 3) goto L11;
        r6 = new abcd.cG(r4);
        goto L17
    L11:
        if (r5 != 4) goto L14;
        r6 = new abcd.lG(r4);
        goto L17
    L14:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidGitType, new java.lang.Object[]{java.lang.Integer.valueOf(r5)}));
    }

    void j6(abcd.dG r3) {
        int r0 = r3.EQ & this.VH;
        if (r0 == 0) goto L6;
        abcd.dG.j6(r3, r0);
        return;
    }

    public void j6(abcd.fG r5) {
        int r0 = this.v5;
        int r1 = r5.Hw;
        if ((r0 & r1) != 0) goto L11;
        if (r5.DW != this) goto L9;
        this.VH |= r1;
        return;
    L9:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().flagNotFromThis, new java.lang.Object[]{r5.FH}));
    L11:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().flagIsDisposed, new java.lang.Object[]{r5.FH}));
    }

    public final void j6(abcd.hG r1) {
        Zo(r1.j6);
    }

    public void j6(abcd.AbstractjK r1) {
        Hw();
        if (r1 != null) goto L6;
        r1 = abcd.AbstractjK.j6;
    L6:
        this.J0 = r1;
    }

    public void j6(abcd.EnumkG r1, boolean r2) {
        Hw();
        if (r2 == false) goto L5;
        this.EQ.add(r1);
    L7:
        if (this.EQ.size() <= 1) goto L10;
        this.EQ.remove(abcd.EnumkG.j6);
        return;
    L10:
        if (this.EQ.size() != 0) goto L14;
        this.EQ.add(abcd.EnumkG.j6);
        return;
    L14:
        return;
    L5:
        this.EQ.remove(r1);
        goto L7
    }

    public void j6(abcd.AbstractyG r1) {
        Hw();
        if (r1 != null) goto L6;
        r1 = abcd.AbstractyG.j6;
    L6:
        this.we = r1;
    }

    public void j6(java.util.Collection<abcd.dG> r2) {
        java.util.Iterator<abcd.dG> r3 = r2.iterator();
    L4:
        if (r3.hasNext() == false) goto L5;
        DW(r3.next());
        goto L4
    }

    public void j6(boolean r1) {
        this.J8 = r1;
    }

    public final void j6(abcd.fG... r5) {
        int r0 = r5.length;
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r0) goto L4;
        r2 = r2 | r5[r1].Hw;
        r1 = r1 + 1;
        goto L3
    L4:
        Zo(r2);
    }

    public boolean j6(abcd.dG r4, abcd.dG r5) {
        abcd.AbstractyG r0 = this.we;
        abcd.AbstractjK r1 = this.J0;
        J8();     // Catch: java.lang.Throwable -> L9
        Zo((this.v5 ^ (-1)) & (-64));     // Catch: java.lang.Throwable -> L9
        this.we = abcd.AbstractyG.Hw;     // Catch: java.lang.Throwable -> L9
        this.J0 = abcd.AbstractjK.j6;     // Catch: java.lang.Throwable -> L9
        DW(r5);     // Catch: java.lang.Throwable -> L9
        DW(r4);     // Catch: java.lang.Throwable -> L9
        if (tp() != r4) goto L6;
        boolean r6 = true;
    L7:
        this.we = r0;
        this.J0 = r1;
        return r6;
    L6:
        r6 = false;
    L9:
        th = move-exception;
        this.we = r0;
        this.J0 = r1;
        throw th;
    }

    public boolean j6(abcd.EnumkG r2) {
        return this.EQ.contains(r2);
    }

    byte[] j6(abcd.AbstractiG r3) {
        return j6(r3, this.DW.Hw(r3, r3.aM()));
    }

    byte[] j6(abcd.AbstractiG r2, abcd.FE r3) {
        return r3.DW(5242880);
    L5:
        e = move-exception;
        e.j6(r2);
        throw e;
    }

    public abcd.dG tp() {
        return this.tp.j6();
    }

    public boolean u7() {
        return this.J8;
    }

    public abcd.mG v5(abcd.YD r2) {
        abcd.mG r0 = (abcd.mG) this.Hw.DW(r2);
        if (r0 != null) goto L6;
        abcd.mG r1 = new abcd.mG(r2);
        this.Hw.j6(r1);
        return r1;
    L6:
        return r0;
    }

    public void v5() {
        this.DW.FH();
        this.v5 = -64;
        this.Zo = 0;
        this.VH = 4;
        this.Hw.clear();
        this.DW.FH();
        this.gn.clear();
        this.u7 = new abcd.QF();
        this.tp = new abcd.C1329tG(this);
    }

    void v5(int r2) {
        if (Ws() == false) goto L5;
        this.v5 |= r2;
        this.VH = (r2 ^ (-1)) & this.VH;
        return;
    L5:
        this.Zo = r2 | this.Zo;
    }

    public final void we() {
        Zo(0);
    }
}
