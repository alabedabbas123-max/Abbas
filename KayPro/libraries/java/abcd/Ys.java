package abcd;

public class Ys {
    private static boolean j6;
    private final abcd.yt DW;
    private final java.util.ArrayList<abcd.tt> FH;
    private final abcd.Ys.a[] Hw;

    public static class a {
        public int DW;
        public abcd.Interfacebu j6;

        public a() {
            this.DW = -1;
        }
    }

    public Ys(abcd.yt r4) {
        this.DW = r4;
        this.FH = r4.DW();
        int r5 = this.FH.size();
        this.Hw = new abcd.Ys.a[r5];
        int r0 = 0;
    L3:
        if (r0 >= r5) goto L5;
        this.Hw[r0] = new abcd.Ys.a();
        r0 = r0 + 1;
        goto L3
    }

    private void DW() {
        int r0 = this.FH.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L9;
        int r2 = this.Hw[r1].DW;
        if (r2 == (-1)) goto L8;
        this.FH.get(r2).DW(this.FH.get(r1));
    L8:
        r1 = r1 + 1;
        goto L3
    }

    private void FH() {
        int r0 = this.FH.size();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L20;
        abcd.tt r3 = this.FH.get(r2);
        abcd.Ys.a r4 = this.Hw[r2];
        java.util.BitSet r5 = r3.VH();
        if (r5.cardinality() <= 1) goto L19;
        int r6 = r5.nextSetBit(0);
    L7:
        if (r6 < 0) goto L19;
        int r7 = r6;
    L10:
        if (r7 == r4.DW) goto L18;
        if (r7 == (-1)) goto L18;
        abcd.Ys.a r8 = this.Hw[r7];
        if (r8.j6.j6(r2) == true) goto L18;
        r8.j6.add(r2);
        r7 = r8.DW;
    L18:
        r6 = r5.nextSetBit(r6 + 1);
    L19:
        r2 = r2 + 1;
        goto L3
    }

    private void Hw() {
        int r0 = this.FH.size();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L12;
        abcd.tt r3 = this.FH.get(r2);
        java.lang.StringBuffer r4 = new java.lang.StringBuffer();
        r4.append('{');
        java.util.Iterator<abcd.tt> r5 = r3.j6().iterator();
        boolean r6 = false;
    L6:
        if (r5.hasNext() == false) goto L11;
        abcd.tt r7 = r5.next();
        if (r6 == false) goto L10;
        r4.append(',');
    L10:
        r4.append(r7);
        r6 = true;
        goto L6
    L11:
        r4.append('}');
        java.lang.System.out.println("domChildren[" + r3 + "]: " + r4);
        r2 = r2 + 1;
        goto L3
    }

    public abcd.Ys.a[] j6() {
        int r0 = this.FH.size();
        int r3 = 0;
        if (j6 == false) goto L7;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L7;
        abcd.tt r4 = this.FH.get(r1);
        java.lang.System.out.println("pred[" + r1 + "]: " + r4.VH());
        r1 = r1 + 1;
    L7:
        abcd._s.j6(this.DW, this.Hw, false);
        if (j6 == false) goto L12;
        int r2 = 0;
    L10:
        if (r2 >= r0) goto L12;
        abcd.Ys.a r5 = this.Hw[r2];
        java.lang.System.out.println("idom[" + r2 + "]: " + r5.DW);
        r2 = r2 + 1;
    L12:
        DW();
        if (j6 == false) goto L15;
        Hw();
    L15:
        int r6 = 0;
    L16:
        if (r6 >= r0) goto L18;
        this.Hw[r6].j6 = abcd.st.j6(r0);
        r6 = r6 + 1;
        goto L16
    L18:
        FH();
        if (j6 == false) goto L23;
    L20:
        if (r3 >= r0) goto L23;
        java.lang.System.out.println("df[" + r3 + "]: " + this.Hw[r3].j6);
        r3 = r3 + 1;
    L23:
        return this.Hw;
    }
}
