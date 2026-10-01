package abcd;

class gK implements java.util.Comparator<abcd.fK> {
    gK() {
    }

    @Override
    public int compare(abcd.fK r1, abcd.fK r2) {
        return j6(r1, r2);
    }

    public int j6(abcd.fK r1, abcd.fK r2) {
        return r1.FH.compareTo(r2.FH);
    }
}
