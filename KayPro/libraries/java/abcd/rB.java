package abcd;

public class rB {
    private final abcd.pB DW;
    private final abcd.AB FH;
    private final java.lang.String Hw;
    private final abcd.qI j6;

    rB(abcd.qI r1, java.lang.String r2, abcd.AB r3) {
        this.j6 = r1;
        this.Hw = r2;
        this.DW = null;
        this.FH = r3;
    }

    rB(abcd.qI r1, java.lang.String r2, abcd.pB r3) {
        this.j6 = r1;
        this.Hw = r2;
        this.DW = r3;
        this.FH = null;
    }

    public boolean DW() {
        abcd.pB r0 = this.DW;
        if (r0 != null) goto L5;
        abcd.AB r1 = this.FH;
        if (r1 != null) goto L9;
        return true;
    L9:
        return r1.j6().Hw();
    L5:
        return r0.j6().Hw();
    }

    public abcd.pB j6() {
        return this.DW;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        abcd.qI r1 = this.j6;
        if (r1 == null) goto L5;
        r0.append(r1.toString());
    L6:
        r0.append("\n");
        abcd.pB r2 = this.DW;
        if (r2 == null) goto L9;
        r0.append(r2.toString());
    L14:
        return r0.toString();
    L9:
        abcd.AB r3 = this.FH;
        if (r3 == null) goto L12;
        r0.append(r3.toString());
        goto L14
    L12:
        r0.append("No update result");
        goto L14
    L5:
        r0.append("No fetch result");
        goto L6
    }
}
