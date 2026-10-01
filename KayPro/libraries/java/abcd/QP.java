package abcd;

public class QP implements abcd.SP {
    private java.util.Collection j6;

    public QP(java.util.Collection r2) {
        this.j6 = new java.util.ArrayList(r2);
    }

    @Override
    public java.util.Collection j6(abcd.RP r5) {
        if (r5 == null) goto L4;
        java.util.ArrayList r0 = new java.util.ArrayList();
        java.util.Iterator r1 = this.j6.iterator();
    L7:
        if (r1.hasNext() == false) goto L8;
        java.lang.Object r2 = r1.next();
        if (r5.j6(r2) == false) goto L7;
        r0.add(r2);
        goto L7
    L8:
        return r0;
    L4:
        return new java.util.ArrayList(this.j6);
    }
}
