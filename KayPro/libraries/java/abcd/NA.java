package abcd;

public class NA {
    static abcd.InterfacetA j6;
    java.io.OutputStream DW;
    int FH;
    java.util.List<abcd.IA> Hw;
    java.util.Set<java.lang.String> v5;

    public NA(java.io.OutputStream r2) {
        this.DW = null;
        this.FH = 0;
        this.Hw = new java.util.LinkedList();
        this.v5 = new java.util.HashSet();
        this.DW = r2;
    }

    private static abcd.InterfacetA FH() {
        if (j6 != null) goto L6;
        j6 = abcd.uA.j6(abcd.NA.class.getName());
    L6:
        return j6;
    }

    public int DW() {
        return this.FH;
    }

    public void j6() {
        abcd.HA r0 = new abcd.HA();
        r0.gn = DW();
        short r1 = (short) this.Hw.size();
        r0.Zo = r1;
        r0.v5 = r1;
        java.util.Iterator<abcd.IA> r2 = this.Hw.iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        r2.next().j6(this);
        goto L4
    L6:
        r0.VH = DW() - r0.gn;
        r0.u7 = "";
        r0.j6(this);
        java.io.OutputStream r3 = this.DW;
        if (r3 == null) goto L14;
        r3.close();     // Catch: java.lang.Throwable -> L10
        return;
    L15:
        return;
    }

    public void j6(int r5) {
        byte[] r1 = new byte[4];
        int r2 = 0;
    L3:
        if (r2 >= 4) goto L5;
        r1[r2] = (byte) (r5 & 255);
        r5 = r5 >> 8;
        r2 = r2 + 1;
        goto L3
    L5:
        this.DW.write(r1);
        this.FH += 4;
    }

    public void j6(abcd.IA r4) {
        java.lang.String r0 = r4.EQ();
        if (this.v5.contains(r0) == false) goto L6;
        FH().DW("Skipping duplicate file in output: " + r0);
        return;
    L6:
        r4.DW(this);
        this.Hw.add(r4);
        this.v5.add(r0);
        if (FH().isDebugEnabled() == false) goto L10;
        abcd.MA.j6(FH(), r4);
        return;
    }

    public void j6(java.lang.String r2) {
        byte[] r3 = r2.getBytes();
        this.DW.write(r3);
        this.FH += r3.length;
    }

    public void j6(short r5) {
        byte[] r1 = new byte[2];
        int r2 = 0;
    L3:
        if (r2 >= 2) goto L5;
        r1[r2] = (byte) (r5 & 255);
        r5 = (short) (r5 >> 8);
        r2 = r2 + 1;
        goto L3
    L5:
        this.DW.write(r1);
        this.FH += 2;
    }

    public void j6(byte[] r2) {
        this.DW.write(r2);
        this.FH += r2.length;
    }

    public void j6(byte[] r2, int r3, int r4) {
        this.DW.write(r2, r3, r4);
        this.FH += r4;
    }
}
