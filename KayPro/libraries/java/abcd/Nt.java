package abcd;

public class Nt implements abcd.Interfacebu {
    int[] j6;

    public Nt(int r1) {
        this.j6 = abcd.Ot.j6(r1);
    }

    private void DW(int r4) {
        if (r4 < abcd.Ot.DW(this.j6)) goto L6;
        int[] r5 = abcd.Ot.j6(java.lang.Math.max(r4 + 1, abcd.Ot.DW(this.j6) * 2));
        int[] r0 = this.j6;
        java.lang.System.arraycopy(r0, 0, r5, 0, r0.length);
        this.j6 = r5;
        return;
    }

    @Override
    public void add(int r3) {
        DW(r3);
        abcd.Ot.j6(this.j6, r3, true);
    }

    @Override
    public abcd._t iterator() {
        return new abcd.Mt(this);
    }

    @Override
    public int j6() {
        return abcd.Ot.j6(this.j6);
    }

    @Override
    public void j6(abcd.Interfacebu r5) {
        if ((r5 instanceof abcd.Nt) == false) goto L6;
        abcd.Nt r6 = (abcd.Nt) r5;
        DW(abcd.Ot.DW(r6.j6) + 1);
        abcd.Ot.j6(this.j6, r6.j6);
        return;
    L6:
        if ((r5 instanceof abcd.gu) == false) goto L14;
        abcd.gu r7 = (abcd.gu) r5;
        int r0 = r7.j6.size();
        if (r0 <= 0) goto L10;
        DW(r7.j6.get(r0 - 1));
    L10:
        int r1 = 0;
    L12:
        if (r1 >= r7.j6.size()) goto L21;
        abcd.Ot.j6(this.j6, r7.j6.get(r1), true);
        r1 = r1 + 1;
        goto L12
    L21:
        return;
    L14:
        abcd._t r8 = r5.iterator();
    L16:
        if (r8.hasNext() == false) goto L22;
        add(r8.next());
        goto L16
    }

    @Override
    public boolean j6(int r2) {
        if (r2 < abcd.Ot.DW(this.j6)) goto L5;
    L7:
        return false;
    L5:
        if (abcd.Ot.FH(this.j6, r2) == false) goto L7;
        return true;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append('{');
        int r1 = abcd.Ot.DW(this.j6, 0);
        boolean r3 = true;
    L3:
        if (r1 < 0) goto L7;
        if (r3 == true) goto L6;
        r0.append(", ");
    L6:
        r0.append(r1);
        r1 = abcd.Ot.DW(this.j6, r1 + 1);
        r3 = false;
        goto L3
    L7:
        r0.append('}');
        return r0.toString();
    }
}
