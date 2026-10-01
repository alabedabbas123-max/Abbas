package abcd;

public final class Ur extends abcd.Xt {
    public Ur(int r1) {
        super(r1);
    }

    public abcd.Tr get(int r1) {
        return (abcd.Tr) DW(r1);
    }

    public void j6(int r1, abcd.Tr r2) {
        j6(r1, r2);
    }

    public void j6(abcd.Tr.b r4) {
        int r0 = size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        get(r1).j6(r4);
        r1 = r1 + 1;
        goto L3
    }

    public boolean j6(abcd.Ur r6) {
        if (r6 != null) goto L5;
        return false;
    L5:
        int r1 = size();
        if (r1 == r6.size()) goto L8;
        return false;
    L8:
        int r2 = 0;
    L9:
        if (r2 >= r1) goto L14;
        if (get(r2).j6(r6.get(r2)) == false) goto L12;
        r2 = r2 + 1;
        goto L9
    L12:
        return false;
    L14:
        return true;
    }

    public abcd.Tr rN() {
        return get(size() - 1);
    }
}
