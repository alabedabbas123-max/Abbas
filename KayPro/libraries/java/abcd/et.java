package abcd;

public class et extends abcd.Ts {
    private final java.util.ArrayList<abcd.Nt> FH;
    private final abcd.Ft Hw;

    public et(abcd.Ft r1, int r2) {
        super(r2);
        this.FH = new java.util.ArrayList();
        this.Hw = r1;
    }

    private void j6(int r4, int r5) {
        int r1 = r4 + 1;
        this.FH.ensureCapacity(r1);
    L4:
        if (r4 < this.FH.size()) goto L6;
        this.FH.add(new abcd.Nt(r1));
        goto L4
    L6:
        this.Hw.j6(r5, this.FH.get(r4));
    }

    public boolean DW(int r4, int r5, int r6) {
        if (r5 < this.FH.size()) goto L5;
        return false;
    L5:
        abcd.Nt r0 = this.FH.get(r5);
        if (r0 != null) goto L9;
        return false;
    L9:
        if (r6 != 1) goto L13;
        return r0.j6(r4);
    L13:
        if (r0.j6(r4) == false) goto L15;
    L16:
        return true;
    L15:
        if (DW(r4, r5 + 1, r6 - 1) == true) goto L16;
        return false;
    }

    @Override
    public void j6(int r2, int r3, int r4) {
        super.j6(r2, r3, r4);
        j6(r3, r2);
        if (r4 != 2) goto L6;
        j6(r3 + 1, r2);
        return;
    }

    public boolean j6(abcd.bs r2, int r3) {
        return DW(r2.we(), r3, r2.Hw());
    }

    public boolean j6(abcd.cs r7, int r8, int r9) {
        int r0 = r7.size();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L17;
        abcd.bs r3 = r7.get(r2);
        int r4 = j6(r3.we());
        if (r4 == r8) goto L15;
        if (r3.Hw() == 2) goto L9;
    L10:
        if (r9 != 2) goto L14;
        if (r4 != (r8 + 1)) goto L14;
        return true;
    L14:
        r2 = r2 + 1;
        goto L3
    L9:
        if ((r4 + 1) != r8) goto L10;
        return true;
    L15:
        return true;
    L17:
        return false;
    }
}
