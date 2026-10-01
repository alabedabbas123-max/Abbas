package abcd;

public abstract class Abstractzp extends abcd.AbstractSp {
    public Abstractzp(java.lang.String r2, abcd.jp r3) {
        super(r2, r3, 4);
    }

    @Override
    protected void tp() {
        java.util.Iterator<? extends abcd.Abstractvp> r0 = Hw().iterator();
        int r1 = 0;
    L4:
        if (r0.hasNext() == false) goto L6;
        ((abcd.Abstractyp) r0.next()).j6(r1);
        r1 = r1 + 1;
        goto L4
    }
}
