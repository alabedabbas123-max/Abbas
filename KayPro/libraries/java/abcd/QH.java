package abcd;

class QH implements java.lang.Iterable<abcd.TH> {
    QH() {
    }

    @Override
    public java.util.Iterator<abcd.TH> iterator() {
        return new abcd.PH(this);
    }
}
