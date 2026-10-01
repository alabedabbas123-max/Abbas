package abcd;

public final class Nn extends abcd.Abstractqo {
    private final abcd.Abstractms VH;
    private final java.util.ArrayList<abcd.Abstractms> Zo;
    private final int gn;
    private final int u7;
    private final abcd.Sn v5;

    public Nn(abcd.hs r2, abcd.Sn r3, java.util.ArrayList<abcd.Abstractms> r4, abcd.Abstractms r5) {
        super(r2, abcd.cs.FH);
        if (r3 == null) goto L40;
        if (r4 == null) goto L38;
        if (r4.size() <= 0) goto L36;
        this.VH = r5;
        if (r5 != abcd.Ks.J0) goto L10;
    L32:
        this.gn = 1;
    L33:
        this.v5 = r3;
        this.Zo = r4;
        this.u7 = r4.size();
        return;
    L10:
        if (r5 == abcd.Ks.we) goto L32;
        if (r5 != abcd.Ks.j3) goto L15;
    L31:
        this.gn = 2;
        goto L33
    L15:
        if (r5 == abcd.Ks.J8) goto L31;
        if (r5 != abcd.Ks.aM) goto L20;
    L30:
        this.gn = 4;
        goto L33
    L20:
        if (r5 == abcd.Ks.QX) goto L30;
        if (r5 != abcd.Ks.XL) goto L25;
    L29:
        this.gn = 8;
        goto L33
    L25:
        if (r5 == abcd.Ks.Ws) goto L29;
        throw new java.lang.IllegalArgumentException("Unexpected constant type");
    L36:
        throw new java.lang.IllegalArgumentException("Illegal number of init values");
    L38:
        throw new java.lang.NullPointerException("values == null");
    L40:
        throw new java.lang.NullPointerException("user == null");
    }

    @Override
    public int DW() {
        return (((this.u7 * this.gn) + 1) / 2) + 4;
    }

    @Override
    public abcd.AbstractVn j6(abcd.cs r5) {
        return new abcd.Nn(VH(), this.v5, this.Zo, this.VH);
    }

    @Override
    protected java.lang.String j6() {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(100);
        int r1 = this.Zo.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        r0.append("\n    ");
        r0.append(r2);
        r0.append(": ");
        r0.append(this.Zo.get(r2).aM());
        r2 = r2 + 1;
        goto L3
    L6:
        return r0.toString();
    }

    @Override
    protected java.lang.String j6(boolean r4) {
        int r5 = this.v5.FH();
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(100);
        int r1 = this.Zo.size();
        r0.append("fill-array-data-payload // for fill-array-data @ ");
        r0.append(abcd.Yt.v5(r5));
        int r6 = 0;
    L3:
        if (r6 >= r1) goto L6;
        r0.append("\n  ");
        r0.append(r6);
        r0.append(": ");
        r0.append(this.Zo.get(r6).aM());
        r6 = r6 + 1;
        goto L3
    L6:
        return r0.toString();
    }

    @Override
    public void j6(abcd.Lt r8) {
        int r0 = this.Zo.size();
        r8.writeShort(768);
        r8.writeShort(this.gn);
        r8.writeInt(this.u7);
        int r1 = this.gn;
        if (r1 == 1) goto L19;
        if (r1 != 2) goto L6;
        int r2 = 0;
    L17:
        if (r2 >= r0) goto L23;
        r8.writeShort((short) ((abcd.Bs) this.Zo.get(r2)).Ws());
        r2 = r2 + 1;
    L23:
        if (this.gn == 1) goto L25;
        return;
    L25:
        if ((r0 % 2) == 0) goto L33;
        r8.writeByte(0);
        return;
    L33:
        return;
    L6:
        if (r1 != 4) goto L8;
        int r3 = 0;
    L14:
        if (r3 >= r0) goto L23;
        r8.writeInt(((abcd.Bs) this.Zo.get(r3)).Ws());
        r3 = r3 + 1;
        goto L14
    L8:
        if (r1 != 8) goto L23;
        int r4 = 0;
    L11:
        if (r4 >= r0) goto L23;
        r8.writeLong(((abcd.Cs) this.Zo.get(r4)).lg());
        r4 = r4 + 1;
        goto L11
    L19:
        int r5 = 0;
    L20:
        if (r5 >= r0) goto L23;
        r8.writeByte((byte) ((abcd.Bs) this.Zo.get(r5)).Ws());
        r5 = r5 + 1;
        goto L20
    }
}
