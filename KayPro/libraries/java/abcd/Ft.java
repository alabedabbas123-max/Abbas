package abcd;

public class Ft {
    private final java.util.ArrayList<abcd.Interfacebu> j6;

    public Ft(int r4) {
        this.j6 = new java.util.ArrayList(r4);
        int r0 = 0;
    L3:
        if (r0 >= r4) goto L5;
        this.j6.add(abcd.st.DW(r4));
        r0 = r0 + 1;
        goto L3
    }

    private void j6(int r4) {
        int r0 = this.j6.size();
        this.j6.ensureCapacity(r4);
    L3:
        if (r0 >= r4) goto L5;
        this.j6.add(abcd.st.DW(r4));
        r0 = r0 + 1;
        goto L3
    }

    public void j6(int r2, int r3) {
        j6(java.lang.Math.max(r2, r3) + 1);
        this.j6.get(r2).add(r3);
        this.j6.get(r3).add(r2);
    }

    public void j6(int r2, abcd.Interfacebu r3) {
        if (r2 >= this.j6.size()) goto L6;
        r3.j6(this.j6.get(r2));
        return;
    }
}
