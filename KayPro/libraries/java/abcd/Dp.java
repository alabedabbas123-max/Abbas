package abcd;

class Dp implements java.util.Comparator<abcd.AbstractGp> {
    Dp() {
    }

    @Override
    public int compare(abcd.AbstractGp r1, abcd.AbstractGp r2) {
        return j6(r1, r2);
    }

    public int j6(abcd.AbstractGp r1, abcd.AbstractGp r2) {
        return r1.Hw().compareTo(r2.Hw());
    }
}
