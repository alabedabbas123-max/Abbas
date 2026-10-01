package abcd;

public abstract class AbstractVn {
    private final abcd.Xn DW;
    private final abcd.hs FH;
    private final abcd.cs Hw;
    private int j6;

    public AbstractVn(abcd.Xn r2, abcd.hs r3, abcd.cs r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == null) { $pc0 = 13; continue $sw0; }
                    if (r3 == null) { $pc0 = 11; continue $sw0; }
                    if (r4 == null) { $pc0 = 9; continue $sw0; }
                    this.j6 = -1;
                    this.DW = r2;
                    this.FH = r3;
                    this.Hw = r4;
                    return;
                }
                case 9: {
                    throw new java.lang.NullPointerException("registers == null");
                }
                case 11: {
                    throw new java.lang.NullPointerException("position == null");
                }
                case 13: {
                    throw new java.lang.NullPointerException("opcode == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.mo j6(abcd.hs r5, abcd.bs r6, abcd.bs r7) {
        boolean r1 = false;
        boolean r0 = false;
        int r2 = 0;
        abcd.Xn r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r1 = true;
                    if (r6.Hw() == 1) { $pc1 = 6; continue $sw1; }
                    r1 = false;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r0 = r6.getType().vy();
                    r2 = r6.we();
                    if ((r7.we() | r2) >= 16) { $pc1 = 14; continue $sw1; }
                    if (r0 == false) { $pc1 = 10; continue $sw1; }
                    r3 = abcd.C0465Yn.tp;
                    $pc1 = 26; continue $sw1;
                }
                case 26: {
                    return new abcd.mo(r3, r5, abcd.cs.j6(r6, r7));
                }
                case 10: {
                    if (r1 == false) { $pc1 = 12; continue $sw1; }
                    r3 = abcd.C0465Yn.Hw;
                    { $pc1 = 26; continue $sw1; }
                }
                case 12: {
                    r3 = abcd.C0465Yn.VH;
                    { $pc1 = 26; continue $sw1; }
                }
                case 14: {
                    if (r2 >= 256) { $pc1 = 20; continue $sw1; }
                    if (r0 == false) { $pc1 = 17; continue $sw1; }
                    r3 = abcd.C0465Yn.EQ;
                    { $pc1 = 26; continue $sw1; }
                }
                case 17: {
                    if (r1 == false) { $pc1 = 19; continue $sw1; }
                    r3 = abcd.C0465Yn.v5;
                    { $pc1 = 26; continue $sw1; }
                }
                case 19: {
                    r3 = abcd.C0465Yn.gn;
                    { $pc1 = 26; continue $sw1; }
                }
                case 20: {
                    if (r0 == false) { $pc1 = 22; continue $sw1; }
                    r3 = abcd.C0465Yn.we;
                    { $pc1 = 26; continue $sw1; }
                }
                case 22: {
                    if (r1 == false) { $pc1 = 24; continue $sw1; }
                    r3 = abcd.C0465Yn.Zo;
                    { $pc1 = 26; continue $sw1; }
                }
                case 24: {
                    r3 = abcd.C0465Yn.u7;
                    { $pc1 = 26; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract int DW();

    public abstract abcd.AbstractVn DW(int r1);

    public abcd.AbstractVn DW(java.util.BitSet r3) {
        abcd.bs r4 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (tp() == true) { $pc2 = 5; continue $sw2; }
                    return null;
                }
                case 5: {
                    if (r3.get(0) == true) { $pc2 = 10; continue $sw2; }
                    r4 = this.Hw.get(0);
                    return j6(this.FH, r4, r4.FH(0));
                }
                case 10: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final java.lang.String EQ() {
        int r0 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.j6;
                    if (r0 == (-1)) { $pc3 = 7; continue $sw3; }
                    return java.lang.String.format("%04x", new java.lang.Object[]{java.lang.Integer.valueOf(r0)});
                }
                case 7: {
                    return abcd.Yt.gn(java.lang.System.identityHashCode(this));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int FH() {
        int r0 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.j6;
                    if (r0 < 0) { $pc4 = 6; continue $sw4; }
                    return r0;
                }
                case 6: {
                    throw new java.lang.RuntimeException("address not yet known");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.AbstractVn FH(java.util.BitSet r4) {
        return j6(this.Hw.j6(0, tp(), r4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [abcd.cs] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.BitSet] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.$r8$lambda$3Jn-YhBaujEHu2U7RtYHYfrstds(FixTypesVisitor.java:0)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor$$ExternalSyntheticLambda8.apply(D8$$SyntheticClass:0)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int Hw(java.util.BitSet r6) {
        java.lang.Object r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = tp();
                    r1 = this.Hw.size();
                    r2 = 0;
                    if (r0 != 0) { $pc5 = 5; continue $sw5; }
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    r3 = 0;
                    $pc5 = 8; continue $sw5;
                }
                case 8: {
                    if (r0 >= r1) { $pc5 = 14; continue $sw5; }
                    if (r6.get(r0) == true) { $pc5 = 12; continue $sw5; }
                    r2 = r2 + this.Hw.get(r0).Hw();
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    r0 = r0 + 1;
                    { $pc5 = 8; continue $sw5; }
                }
                case 14: {
                    return java.lang.Math.max(r2, r3);
                }
                case 5: {
                    if (r6.get(0) == true) { $pc5 = 7; continue $sw5; }
                    r3 = this.Hw.get(0).Hw();
                    { $pc5 = 8; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.AbstractVn Hw() {
        return j6(this.Hw.j6(0, tp(), null));
    }

    public final abcd.hs VH() {
        return this.FH;
    }

    public final abcd.Xn Zo() {
        return this.DW;
    }

    public final abcd.cs gn() {
        return this.Hw;
    }

    public abstract abcd.AbstractVn j6(abcd.Xn r1);

    public abstract abcd.AbstractVn j6(abcd.cs r1);

    public abcd.AbstractVn j6(java.util.BitSet r5) {
        abcd.cs r0 = null;
        boolean r2 = false;
        abcd.cs r1 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = this.Hw;
                    r2 = r5.get(0);
                    if (tp() == false) { $pc6 = 5; continue $sw6; }
                    r5.set(0);
                    $pc6 = 5; continue $sw6;
                }
                case 5: {
                    r1 = r0.j6(r5);
                    if (tp() == false) { $pc6 = 9; continue $sw6; }
                    r5.set(0, r2);
                    $pc6 = 9; continue $sw6;
                }
                case 9: {
                    if (r1.size() != 0) { $pc6 = 13; continue $sw6; }
                    return null;
                }
                case 13: {
                    return new abcd._n(this.FH, r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract java.lang.String j6();

    public final java.lang.String j6(java.lang.String r3, int r4, boolean r5) {
        java.lang.String r6 = null;
        java.lang.String r7 = null;
        int r0 = 0;
        int r8 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r6 = j6(r5);
                    if (r6 != null) { $pc7 = 6; continue $sw7; }
                    return null;
                }
                case 6: {
                    r7 = r3 + EQ() + ": ";
                    r0 = r7.length();
                    if (r4 != 0) { $pc7 = 9; continue $sw7; }
                    r8 = r6.length();
                    $pc7 = 11; continue $sw7;
                }
                case 11: {
                    return abcd.mu.j6(r7, r0, "", r6, r8);
                }
                case 9: {
                    r8 = r4 - r0;
                    { $pc7 = 11; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract java.lang.String j6(boolean r1);

    public final void j6(int r2) {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (r2 < 0) { $pc8 = 6; continue $sw8; }
                    this.j6 = r2;
                    return;
                }
                case 6: {
                    throw new java.lang.IllegalArgumentException("address < 0");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract void j6(abcd.Lt r1);

    public final java.lang.String toString() {
        java.lang.StringBuffer r0 = null;
        boolean r2 = false;
        java.lang.String r3 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = new java.lang.StringBuffer(100);
                    r0.append(EQ());
                    r0.append(' ');
                    r0.append(this.FH);
                    r0.append(": ");
                    r0.append(this.DW.FH());
                    if (this.Hw.size() == 0) { $pc9 = 5; continue $sw9; }
                    r0.append(this.Hw.j6(" ", ", ", null));
                    r2 = true;
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    r3 = j6();
                    if (r3 == null) { $pc9 = 12; continue $sw9; }
                    if (r2 == false) { $pc9 = 10; continue $sw9; }
                    r0.append(',');
                    $pc9 = 10; continue $sw9;
                }
                case 10: {
                    r0.append(' ');
                    r0.append(r3);
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    return r0.toString();
                }
                case 5: {
                    r2 = false;
                    { $pc9 = 6; continue $sw9; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final boolean tp() {
        return this.DW.VH();
    }

    public final boolean u7() {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (this.j6 < 0) { $pc10 = 5; continue $sw10; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int v5() {
        return FH() + DW();
    }
}
