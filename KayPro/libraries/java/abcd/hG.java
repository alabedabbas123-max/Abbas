package abcd;

public class hG extends java.util.AbstractSet<abcd.fG> {
    private final java.util.List<abcd.fG> DW;
    int j6;

    public hG() {
        this.DW = new java.util.ArrayList();
    }

    @Override
    public boolean add(java.lang.Object r1) {
        return j6((abcd.fG) r1);
    }

    @Override
    public boolean contains(java.lang.Object r3) {
        if ((r3 instanceof abcd.fG) == false) goto L8;
        int r0 = this.j6;
        if ((((abcd.fG) r3).Hw & r0) == 0) goto L8;
        return true;
    L8:
        return false;
    }

    @Override
    public boolean containsAll(java.util.Collection<?> r2) {
        if ((r2 instanceof abcd.hG) == false) goto L11;
        int r3 = ((abcd.hG) r2).j6;
        if ((this.j6 & r3) != r3) goto L8;
        return true;
    L8:
        return false;
    L11:
        return super.containsAll(r2);
    }

    @Override
    public java.util.Iterator<abcd.fG> iterator() {
        return new abcd.gG(this, this.DW.iterator());
    }

    public boolean j6(abcd.fG r5) {
        int r0 = this.j6;
        int r1 = r5.Hw;
        int r3 = 0;
        if ((r0 & r1) == 0) goto L5;
        return false;
    L5:
        this.j6 = r0 | r1;
    L7:
        if (r3 >= this.DW.size()) goto L12;
        if (this.DW.get(r3).Hw >= r5.Hw) goto L12;
        r3 = r3 + 1;
    L12:
        this.DW.add(r3, r5);
        return true;
    }

    @Override
    public boolean remove(java.lang.Object r5) {
        abcd.fG r6 = (abcd.fG) r5;
        int r0 = this.j6;
        int r1 = r6.Hw;
        int r3 = 0;
        if ((r0 & r1) != 0) goto L5;
        return false;
    L5:
        this.j6 = r0 & (r1 ^ (-1));
    L7:
        if (r3 >= this.DW.size()) goto L8;
        if (this.DW.get(r3).Hw != r6.Hw) goto L13;
        this.DW.remove(r3);
    L13:
        r3 = r3 + 1;
        goto L7
    L8:
        return true;
    }

    @Override
    public int size() {
        return this.DW.size();
    }
}
