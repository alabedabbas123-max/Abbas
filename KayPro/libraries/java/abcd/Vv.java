package abcd;

class Vv implements java.util.Comparator<abcd.Wv.a> {
    Vv() {
    }

    @Override
    public int compare(abcd.Wv.a r1, abcd.Wv.a r2) {
        return j6(r1, r2);
    }

    public int j6(abcd.Wv.a r3, abcd.Wv.a r4) {
        return (int) java.lang.Math.signum(r3.Hw - r4.Hw);
    }
}
