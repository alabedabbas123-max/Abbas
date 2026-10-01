package abcd;

public abstract class AbstractVn {
    private final abcd.Xn DW;
    private final abcd.hs FH;
    private final abcd.cs Hw;
    private int j6;

    public AbstractVn(abcd.Xn r2, abcd.hs r3, abcd.cs r4) {
        if (r2 == null) goto L13;
        if (r3 == null) goto L11;
        if (r4 == null) goto L9;
        this.j6 = -1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
        return;
    L9:
        throw new java.lang.NullPointerException("registers == null");
    L11:
        throw new java.lang.NullPointerException("position == null");
    L13:
        throw new java.lang.NullPointerException("opcode == null");
    }

    public static abcd.mo j6(abcd.hs r5, abcd.bs r6, abcd.bs r7) {
        boolean r1 = true;
        if (r6.Hw() == 1) goto L6;
        r1 = false;
    L6:
        boolean r0 = r6.getType().vy();
        int r2 = r6.we();
        if ((r7.we() | r2) >= 16) goto L14;
        if (r0 == false) goto L10;
        abcd.Xn r3 = abcd.C0465Yn.tp;
    L26:
        return new abcd.mo(r3, r5, abcd.cs.j6(r6, r7));
    L10:
        if (r1 == false) goto L12;
        r3 = abcd.C0465Yn.Hw;
        goto L26
    L12:
        r3 = abcd.C0465Yn.VH;
        goto L26
    L14:
        if (r2 >= 256) goto L20;
        if (r0 == false) goto L17;
        r3 = abcd.C0465Yn.EQ;
        goto L26
    L17:
        if (r1 == false) goto L19;
        r3 = abcd.C0465Yn.v5;
        goto L26
    L19:
        r3 = abcd.C0465Yn.gn;
        goto L26
    L20:
        if (r0 == false) goto L22;
        r3 = abcd.C0465Yn.we;
        goto L26
    L22:
        if (r1 == false) goto L24;
        r3 = abcd.C0465Yn.Zo;
        goto L26
    L24:
        r3 = abcd.C0465Yn.u7;
        goto L26
    }

    public abstract int DW();

    public abstract abcd.AbstractVn DW(int r1);

    public abcd.AbstractVn DW(java.util.BitSet r3) {
        if (tp() == true) goto L5;
        return null;
    L5:
        if (r3.get(0) == true) goto L10;
        abcd.bs r4 = this.Hw.get(0);
        return j6(this.FH, r4, r4.FH(0));
    L10:
        return null;
    }

    public final java.lang.String EQ() {
        int r0 = this.j6;
        if (r0 == (-1)) goto L7;
        return java.lang.String.format("%04x", new java.lang.Object[]{java.lang.Integer.valueOf(r0)});
    L7:
        return abcd.Yt.gn(java.lang.System.identityHashCode(this));
    }

    public final int FH() {
        int r0 = this.j6;
        if (r0 < 0) goto L6;
        return r0;
    L6:
        throw new java.lang.RuntimeException("address not yet known");
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
        ?? r0 = tp();
        int r1 = this.Hw.size();
        int r2 = 0;
        if (r0 != 0) goto L5;
    L7:
        int r3 = 0;
    L8:
        if (r0 >= r1) goto L14;
        if (r6.get(r0) == true) goto L12;
        r2 = r2 + this.Hw.get(r0).Hw();
    L12:
        r0 = r0 + 1;
        goto L8
    L14:
        return java.lang.Math.max(r2, r3);
    L5:
        if (r6.get(0) == true) goto L7;
        r3 = this.Hw.get(0).Hw();
        goto L8
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
        abcd.cs r0 = this.Hw;
        boolean r2 = r5.get(0);
        if (tp() == false) goto L5;
        r5.set(0);
    L5:
        abcd.cs r1 = r0.j6(r5);
        if (tp() == false) goto L9;
        r5.set(0, r2);
    L9:
        if (r1.size() != 0) goto L13;
        return null;
    L13:
        return new abcd._n(this.FH, r1);
    }

    protected abstract java.lang.String j6();

    public final java.lang.String j6(java.lang.String r3, int r4, boolean r5) {
        java.lang.String r6 = j6(r5);
        if (r6 != null) goto L6;
        return null;
    L6:
        java.lang.String r7 = r3 + EQ() + ": ";
        int r0 = r7.length();
        if (r4 != 0) goto L9;
        int r8 = r6.length();
    L11:
        return abcd.mu.j6(r7, r0, "", r6, r8);
    L9:
        r8 = r4 - r0;
        goto L11
    }

    protected abstract java.lang.String j6(boolean r1);

    public final void j6(int r2) {
        if (r2 < 0) goto L6;
        this.j6 = r2;
        return;
    L6:
        throw new java.lang.IllegalArgumentException("address < 0");
    }

    public abstract void j6(abcd.Lt r1);

    public final java.lang.String toString() {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(100);
        r0.append(EQ());
        r0.append(' ');
        r0.append(this.FH);
        r0.append(": ");
        r0.append(this.DW.FH());
        if (this.Hw.size() == 0) goto L5;
        r0.append(this.Hw.j6(" ", ", ", null));
        boolean r2 = true;
    L6:
        java.lang.String r3 = j6();
        if (r3 == null) goto L12;
        if (r2 == false) goto L10;
        r0.append(',');
    L10:
        r0.append(' ');
        r0.append(r3);
    L12:
        return r0.toString();
    L5:
        r2 = false;
        goto L6
    }

    public final boolean tp() {
        return this.DW.VH();
    }

    public final boolean u7() {
        if (this.j6 < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final int v5() {
        return FH() + DW();
    }
}
