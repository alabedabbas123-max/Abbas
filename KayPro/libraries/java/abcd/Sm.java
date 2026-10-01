package abcd;

public class Sm extends abcd.AbstractRm {
    private final abcd.Vm DW;
    private final java.util.ArrayList<abcd.AbstractRm> FH;

    public Sm(int r2) {
        if (r2 == 0) goto L4;
        boolean r0 = true;
    L5:
        super(r0);
        this.DW = new abcd.Vm(r2);
        this.FH = new java.util.ArrayList();
        return;
    L4:
        r0 = false;
        goto L5
    }

    private Sm(abcd.Sm r5) {
        int r1 = 0;
        if (r5.er() <= 0) goto L5;
        boolean r0 = true;
    L6:
        super(r0);
        this.DW = r5.DW.lg();
        this.FH = new java.util.ArrayList(r5.FH.size());
        int r2 = r5.FH.size();
    L7:
        if (r1 >= r2) goto L13;
        abcd.AbstractRm r3 = r5.FH.get(r1);
        if (r3 != null) goto L11;
        this.FH.add(null);
    L12:
        r1 = r1 + 1;
        goto L7
    L11:
        this.FH.add(r3.lg());
        goto L12
    L13:
        return;
    L5:
        r0 = false;
        goto L6
    }

    public Sm(abcd.Vm r2, java.util.ArrayList<abcd.AbstractRm> r3) {
        if (r2.er() <= 0) goto L5;
        boolean r0 = true;
    L6:
        super(r0);
        this.DW = r2;
        this.FH = r3;
        return;
    L5:
        r0 = false;
        goto L6
    }

    private abcd.AbstractRm FH(int r2) {
        if (r2 < this.FH.size()) goto L7;
        return null;
    L7:
        return this.FH.get(r2);
    }

    private abcd.Sm j6(abcd.Sm r14) {
        abcd.Vm r0 = this.DW.j6(r14.rN());
        int r1 = this.FH.size();
        int r2 = r14.FH.size();
        int r3 = java.lang.Math.max(r1, r2);
        java.util.ArrayList r4 = new java.util.ArrayList(r3);
        int r6 = 0;
        boolean r7 = false;
    L3:
        if (r6 >= r3) goto L28;
        abcd.AbstractRm r8 = null;
        if (r6 >= r1) goto L7;
        abcd.AbstractRm r9 = this.FH.get(r6);
    L8:
        if (r6 >= r2) goto L10;
        abcd.AbstractRm r10 = r14.FH.get(r6);
    L11:
        if (r9 == r10) goto L16;
        if (r9 != null) goto L15;
        r8 = r10;
    L21:
        if (r7 == true) goto L25;
        if (r9 != r8) goto L25;
        r7 = false;
    L26:
        r4.add(r8);
        r6 = r6 + 1;
    L25:
        r7 = true;
        goto L26
    L15:
        if (r10 == null) goto L16;
        r8 = r9.j6(r10);     // Catch: abcd.an -> L19
    L19:
        e = move-exception;
        e.j6("Merging locals set for caller block " + abcd.Yt.v5(r6));
    L16:
        r8 = r9;
        goto L21
    L10:
        r10 = null;
        goto L11
    L7:
        r9 = null;
        goto L8
    L28:
        if (this.DW != r0) goto L32;
        if (r7 == true) goto L32;
        return this;
    L32:
        return new abcd.Sm(r0, r4);
    }

    private abcd.Sm j6(abcd.Vm r12) {
        abcd.Vm r0 = this.DW;
        r12.rN();
        abcd.Vm r1 = r0.j6(r12);
        java.util.ArrayList r2 = new java.util.ArrayList(this.FH.size());
        int r3 = this.FH.size();
        int r4 = 0;
        boolean r5 = false;
    L3:
        if (r4 >= r3) goto L17;
        abcd.AbstractRm r6 = this.FH.get(r4);
        abcd.AbstractRm r7 = null;
        if (r6 != null) goto L22;
    L10:
        if (r5 == true) goto L14;
        if (r6 != r7) goto L14;
        r5 = false;
    L15:
        r2.add(r7);
        r4 = r4 + 1;
    L14:
        r5 = true;
        goto L15
    L22:
        r7 = r6.j6(r12);     // Catch: abcd.an -> L8
    L8:
        e = move-exception;
        e.j6("Merging one locals against caller block " + abcd.Yt.v5(r4));
        goto L10
    L17:
        if (this.DW != r1) goto L21;
        if (r5 == true) goto L21;
        return this;
    L21:
        return new abcd.Sm(r1, r2);
    }

    public abcd.AbstractRm DW(int r1) {
        return FH(r1);
    }

    @Override
    public void DW(abcd.Qs r3) {
        if (this.DW.er() != 0) goto L5;
        return;
    L5:
        J8();
        this.DW.DW(r3);
        java.util.Iterator<abcd.AbstractRm> r0 = this.FH.iterator();
    L7:
        if (r0.hasNext() == false) goto L11;
        abcd.AbstractRm r1 = r0.next();
        if (r1 == null) goto L7;
        r1.DW(r3);
        goto L7
    }

    @Override
    public java.lang.String aM() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append("(locals array set; primary)\n");
        r0.append(rN().aM());
        r0.append('\n');
        int r2 = this.FH.size();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L9;
        abcd.AbstractRm r4 = this.FH.get(r3);
        if (r4 == null) goto L7;
        r0.append("(locals array set: primary for caller " + abcd.Yt.v5(r3) + ")\n");
        r0.append(r4.rN().aM());
        r0.append('\n');
    L7:
        r3 = r3 + 1;
        goto L3
    L9:
        return r0.toString();
    }

    public int er() {
        return this.DW.er();
    }

    @Override
    public abcd.Rs get(int r2) {
        return this.DW.get(r2);
    }

    @Override
    public abcd.AbstractRm j6(abcd.AbstractRm r1) {
        return j6(r1);
    }

    @Override
    public abcd.Sm j6(abcd.AbstractRm r3) {
    L8:
        e = move-exception;
        e.j6("underlay locals:");
        j6(e);
        e.j6("overlay locals:");
        r3.j6(e);
        throw e;
    L3:
        if ((r3 instanceof abcd.Sm) == false) goto L5;
        abcd.Sm r4 = j6((abcd.Sm) r3);     // Catch: abcd.an -> L8
    L6:
        r4.we();
        return r4;
    L5:
        r4 = j6((abcd.Vm) r3);     // Catch: abcd.an -> L8
        goto L6
    }

    @Override
    public abcd.Sm j6(abcd.AbstractRm r9, int r10) {
        abcd.AbstractRm r0 = FH(r10);
        abcd.Vm r1 = this.DW.j6(r9.rN());
        if (r0 != r9) goto L5;
        r9 = r0;
    L8:
        if (r9 == r0) goto L10;
    L12:
        int r2 = this.FH.size();
        int r3 = java.lang.Math.max(r10 + 1, r2);
        java.util.ArrayList r4 = new java.util.ArrayList(r3);
        int r5 = 0;
        abcd.Vm r6 = null;
    L13:
        if (r5 >= r3) goto L24;
        if (r5 != r10) goto L16;
        abcd.AbstractRm r7 = r9;
    L19:
        if (r7 == null) goto L23;
        if (r6 != null) goto L22;
        r6 = r7.rN();
        goto L23
    L22:
        r6 = r6.j6(r7.rN());
    L23:
        r4.add(r7);
        r5 = r5 + 1;
        goto L13
    L16:
        if (r5 >= r2) goto L18;
        r7 = this.FH.get(r5);
        goto L19
    L18:
        r7 = null;
        goto L19
    L24:
        abcd.Sm r11 = new abcd.Sm(r6, r4);
        r11.we();
        return r11;
    L10:
        if (r1 != this.DW) goto L12;
        return this;
    L5:
        if (r0 == null) goto L8;
        r9 = r0.j6(r9);
        goto L8
    }

    @Override
    public void j6(int r3, abcd.Rs r4) {
        J8();
        this.DW.j6(r3, r4);
        java.util.Iterator<abcd.AbstractRm> r0 = this.FH.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        abcd.AbstractRm r1 = r0.next();
        if (r1 == null) goto L4;
        r1.j6(r3, r4);
        goto L4
    }

    @Override
    public void j6(abcd.Vt r6) {
        r6.j6("(locals array set; primary)");
        this.DW.j6(r6);
        int r0 = this.FH.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        abcd.AbstractRm r2 = this.FH.get(r1);
        if (r2 == null) goto L7;
        r6.j6("(locals array set: primary for caller " + abcd.Yt.v5(r1) + ')');
        r2.rN().j6(r6);
    L7:
        r1 = r1 + 1;
        goto L3
    }

    @Override
    public void j6(abcd.bs r2) {
        j6(r2.we(), r2);
    }

    @Override
    public abcd.AbstractRm lg() {
        return new abcd.Sm(this);
    }

    @Override
    protected abcd.Vm rN() {
        return this.DW;
    }

    @Override
    public void we() {
        this.DW.we();
        java.util.Iterator<abcd.AbstractRm> r0 = this.FH.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        abcd.AbstractRm r1 = r0.next();
        if (r1 == null) goto L4;
        r1.we();
        goto L4
    L8:
        super.we();
    }
}
