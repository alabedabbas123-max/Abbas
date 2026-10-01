package abcd;

public final class ot extends abcd.Abstractvt {
    private final int FH;
    private final java.util.ArrayList<abcd.ot.a> Hw;
    private abcd.cs v5;

    private static class a {
        public final int DW;
        public final int FH;
        public abcd.bs j6;

        public a(abcd.bs r1, int r2, int r3) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = r3;
        }
    }

    public interface b {
        void j6(abcd.ot r1);
    }

    public ot(int r2, abcd.tt r3) {
        super(abcd.bs.j6(r2, abcd.Qs.tp), r3);
        this.Hw = new java.util.ArrayList();
        this.FH = r2;
    }

    public ot(abcd.bs r1, abcd.tt r2) {
        super(r1, r2);
        this.Hw = new java.util.ArrayList();
        this.FH = r1.we();
    }

    public void DW(abcd.bs r6) {
        java.util.ArrayList r0 = new java.util.ArrayList();
        java.util.Iterator<abcd.ot.a> r1 = this.Hw.iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        abcd.ot.a r2 = r1.next();
        if (r2.j6.we() != r6.we()) goto L4;
        r0.add(r2);
        goto L4
    L8:
        this.Hw.removeAll(r0);
        this.v5 = null;
    }

    @Override
    public final void DW(abcd.Abstractqt r5) {
        java.util.Iterator<abcd.ot.a> r0 = this.Hw.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        abcd.ot.a r1 = r0.next();
        abcd.bs r2 = r1.j6;
        r1.j6 = r5.j6(r2);
        if (r2 == r1.j6) goto L4;
        DW().v5().j6(this, r2, r1.j6);
        goto L4
    L8:
        this.v5 = null;
    }

    @Override
    public boolean EQ() {
        if (abcd.C1102nt.DW() == true) goto L5;
    L7:
        return false;
    L5:
        if (FH() == null) goto L7;
        return true;
    }

    public int FH(int r2) {
        return this.Hw.get(r2).DW;
    }

    @Override
    public boolean XL() {
        return true;
    }

    @Override
    public java.lang.String aM() {
        return j6(null);
    }

    @Override
    public abcd.ot clone() {
        throw new java.lang.UnsupportedOperationException("can't clone phi");
    }

    @Override
    public abcd.Abstractvt clone() {
        clone();
        throw null;
    }

    @Override
    public java.lang.Object mo30clone() {
        clone();
        throw null;
    }

    @Override
    public abcd.Tr gn() {
        return null;
    }

    protected final java.lang.String j6(java.lang.String r6) {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(80);
        r0.append(abcd.hs.j6);
        r0.append(": phi");
        if (r6 == null) goto L5;
        r0.append("(");
        r0.append(r6);
        r0.append(")");
    L5:
        abcd.bs r7 = u7();
        if (r7 != null) goto L8;
        r0.append(" .");
    L9:
        r0.append(" <-");
        int r8 = tp().size();
        if (r8 != 0) goto L12;
        r0.append(" .");
    L16:
        return r0.toString();
    L12:
        int r1 = 0;
    L13:
        if (r1 >= r8) goto L16;
        r0.append(" ");
        r0.append(this.v5.get(r1).aM() + "[b=" + abcd.Yt.v5(this.Hw.get(r1).FH) + "]");
        r1 = r1 + 1;
        goto L13
    L8:
        r0.append(" ");
        r0.append(r7.aM());
        goto L9
    }

    public java.util.List<abcd.tt> j6(int r5, abcd.yt r6) {
        java.util.ArrayList r0 = new java.util.ArrayList();
        java.util.Iterator<abcd.ot.a> r1 = this.Hw.iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        abcd.ot.a r2 = r1.next();
        if (r2.j6.we() != r5) goto L4;
        r0.add(r6.DW().get(r2.DW));
        goto L4
    L8:
        return r0;
    }

    public void j6(abcd.Rs r2, abcd.Vr r3) {
        j6(abcd.bs.FH(u7().we(), r2, r3));
    }

    public void j6(abcd.bs r4, abcd.tt r5) {
        this.Hw.add(new abcd.ot.a(r4, r5.DW(), r5.EQ()));
        this.v5 = null;
    }

    @Override
    public void j6(abcd.Abstractvt.a r1) {
        r1.j6(this);
    }

    public void j6(abcd.yt r5) {
        java.util.Iterator<abcd.ot.a> r0 = this.Hw.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        abcd.ot.a r1 = r0.next();
        abcd.bs r2 = r5.FH(r1.j6.we()).u7();
        r1.j6 = r1.j6.j6(r2.getType());
        goto L4
    L6:
        this.v5 = null;
    }

    @Override
    public boolean j6() {
        return false;
    }

    @Override
    public abcd.Tr lg() {
        throw new java.lang.IllegalArgumentException("Cannot convert phi insns to rop form");
    }

    public int rN() {
        return this.FH;
    }

    @Override
    public abcd.cs tp() {
        abcd.cs r0 = this.v5;
        if (r0 == null) goto L6;
        return r0;
    L6:
        if (this.Hw.size() == 0) goto L8;
        int r1 = this.Hw.size();
        this.v5 = new abcd.cs(r1);
        int r2 = 0;
    L10:
        if (r2 >= r1) goto L12;
        abcd.ot.a r3 = this.Hw.get(r2);
        this.v5.j6(r2, r3.j6);
        r2 = r2 + 1;
        goto L10
    L12:
        this.v5.we();
        return this.v5;
    L8:
        return abcd.cs.FH;
    }

    @Override
    public abcd.es v5() {
        return null;
    }
}
