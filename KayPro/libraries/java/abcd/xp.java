package abcd;

public final class xp extends abcd.AbstractGp {
    private final abcd.Abstractvp VH;
    private final abcd.AbstractKp Zo;
    private final abcd.Abstractvp gn;
    private final int u7;
    private final abcd.Enumwp v5;

    private xp(abcd.AbstractKp r3) {
        super(4, 12);
        if (r3 == null) goto L7;
        this.v5 = abcd.Enumwp.gn;
        this.Zo = r3;
        this.VH = null;
        this.gn = null;
        this.u7 = 1;
        return;
    L7:
        throw new java.lang.NullPointerException("section == null");
    }

    private xp(abcd.Enumwp r3, abcd.AbstractKp r4, abcd.Abstractvp r5, abcd.Abstractvp r6, int r7) {
        super(4, 12);
        if (r3 == null) goto L19;
        if (r4 == null) goto L17;
        if (r5 == null) goto L15;
        if (r6 == null) goto L13;
        if (r7 <= 0) goto L11;
        this.v5 = r3;
        this.Zo = r4;
        this.VH = r5;
        this.gn = r6;
        this.u7 = r7;
        return;
    L11:
        throw new java.lang.IllegalArgumentException("itemCount <= 0");
    L13:
        throw new java.lang.NullPointerException("lastItem == null");
    L15:
        throw new java.lang.NullPointerException("firstItem == null");
    L17:
        throw new java.lang.NullPointerException("section == null");
    L19:
        throw new java.lang.NullPointerException("type == null");
    }

    public static void j6(abcd.AbstractKp[] r16, abcd.Fp r17) {
        if (r16 == null) goto L27;
        if (r17.Hw().size() != 0) goto L25;
        java.util.ArrayList r2 = new java.util.ArrayList(50);
        int r3 = r16.length;
        int r5 = 0;
    L7:
        if (r5 >= r3) goto L22;
        abcd.AbstractKp r12 = r16[r5];
        java.util.Iterator<? extends abcd.Abstractvp> r13 = r12.Hw().iterator();
        abcd.Enumwp r7 = null;
        abcd.Abstractvp r9 = null;
        abcd.Abstractvp r10 = null;
        int r11 = 0;
    L10:
        if (r13.hasNext() == false) goto L17;
        abcd.Abstractvp r14 = r13.next();
        abcd.Enumwp r15 = r14.Hw();
        if (r15 == r7) goto L16;
        if (r11 == 0) goto L15;
        r2.add(new abcd.xp(r7, r12, r9, r10, r11));
    L15:
        r9 = r14;
        r7 = r15;
        r11 = 0;
    L16:
        r11 = r11 + 1;
        r10 = r14;
        goto L10
    L17:
        if (r11 == 0) goto L19;
        r2.add(new abcd.xp(r7, r12, r9, r10, r11));
    L21:
        r5 = r5 + 1;
        goto L7
    L19:
        if (r12 != r17) goto L21;
        r2.add(new abcd.xp(r17));
        goto L21
    L22:
        r17.j6(new abcd.Tp(abcd.Enumwp.gn, r2));
        return;
    L25:
        throw new java.lang.IllegalArgumentException("mapSection.items().size() != 0");
    L27:
        throw new java.lang.NullPointerException("sections == null");
    }

    @Override
    protected void DW(abcd.jp r6, abcd.Lt r7) {
        int r8 = this.v5.Hw();
        abcd.Abstractvp r0 = this.VH;
        if (r0 != null) goto L5;
        int r1 = this.Zo.FH();
    L7:
        if (r7.Hw() == false) goto L9;
        r7.j6(0, Ws() + ' ' + this.v5.Zo() + " map");
        r7.j6(2, "  type:   " + abcd.Yt.v5(r8) + " // " + this.v5.toString());
        r7.j6(2, "  unused: 0");
        java.lang.StringBuilder r2 = new java.lang.StringBuilder();
        r2.append("  size:   ");
        r2.append(abcd.Yt.gn(this.u7));
        r7.j6(4, r2.toString());
        r7.j6(4, "  offset: " + abcd.Yt.gn(r1));
    L9:
        r7.writeShort(r8);
        r7.writeShort(0);
        r7.writeInt(this.u7);
        r7.writeInt(r1);
        return;
    L5:
        r1 = this.Zo.j6(r0);
        goto L7
    }

    @Override
    public abcd.Enumwp Hw() {
        return abcd.Enumwp.j3;
    }

    @Override
    public final java.lang.String aM() {
        return toString();
    }

    @Override
    public void j6(abcd.jp r1) {
    }

    public java.lang.String toString() {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(100);
        r0.append(abcd.xp.class.getName());
        r0.append('{');
        r0.append(this.Zo.toString());
        r0.append(' ');
        r0.append(this.v5.aM());
        r0.append('}');
        return r0.toString();
    }
}
