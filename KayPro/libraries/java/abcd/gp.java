package abcd;

class gp implements java.util.Comparator<abcd.co.b> {
    final abcd.hp j6;

    gp(abcd.hp r1) {
        this.j6 = r1;
    }

    @Override
    public int compare(abcd.co.b r1, abcd.co.b r2) {
        return j6(r1, r2);
    }

    @Override
    public boolean equals(java.lang.Object r1) {
        if (r1 != this) goto L4;
        return true;
    L4:
        return false;
    }

    public int j6(abcd.co.b r1, abcd.co.b r2) {
        return r1.we() - r2.we();
    }
}
