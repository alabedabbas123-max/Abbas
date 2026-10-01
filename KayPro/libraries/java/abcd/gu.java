package abcd;

public class gu implements abcd.Interfacebu {
    final abcd.au j6;

    public gu() {
        this.j6 = new abcd.au();
        this.j6.er();
    }

    @Override
    public void add(int r3) {
        int r0 = this.j6.FH(r3);
        if (r0 >= 0) goto L6;
        this.j6.j6(-(r0 + 1), r3);
        return;
    }

    @Override
    public abcd._t iterator() {
        return new abcd.fu(this);
    }

    @Override
    public int j6() {
        return this.j6.size();
    }

    @Override
    public void j6(abcd.Interfacebu r7) {
        int r1 = 0;
        if ((r7 instanceof abcd.gu) == false) goto L21;
        abcd.gu r8 = (abcd.gu) r7;
        int r0 = this.j6.size();
        int r2 = r8.j6.size();
        int r3 = 0;
    L5:
        if (r1 >= r2) goto L17;
        if (r3 >= r0) goto L17;
    L7:
        if (r1 >= r2) goto L11;
        if (r8.j6.get(r1) >= this.j6.get(r3)) goto L11;
        int r5 = r1 + 1;
        add(r8.j6.get(r1));
        r1 = r5;
    L11:
        if (r1 == r2) goto L17;
    L13:
        if (r3 >= r0) goto L5;
        if (r8.j6.get(r1) < this.j6.get(r3)) goto L5;
        r3 = r3 + 1;
    L17:
        if (r1 >= r2) goto L19;
        add(r8.j6.get(r1));
        r1 = r1 + 1;
        goto L17
    L19:
        this.j6.er();
        return;
    L21:
        if ((r7 instanceof abcd.Nt) == false) goto L26;
        abcd.Nt r9 = (abcd.Nt) r7;
    L23:
        if (r1 < 0) goto L25;
        this.j6.DW(r1);
        r1 = abcd.Ot.DW(r9.j6, r1 + 1);
        goto L23
    L25:
        this.j6.er();
        return;
    L26:
        abcd._t r10 = r7.iterator();
    L28:
        if (r10.hasNext() == false) goto L44;
        add(r10.next());
        goto L28
    }

    @Override
    public boolean j6(int r2) {
        if (this.j6.v5(r2) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public java.lang.String toString() {
        return this.j6.toString();
    }
}
