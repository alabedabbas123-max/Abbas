package abcd;

public class kL extends java.lang.Exception {
    private java.lang.Object DW;
    private int FH;
    private int j6;

    public kL(int r1, int r2, java.lang.Object r3) {
        this.FH = r1;
        this.j6 = r2;
        this.DW = r3;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer();
        int r1 = this.j6;
        if (r1 != 0) goto L5;
        r0.append("Unexpected character (");
        r0.append(this.DW);
        java.lang.String r2 = ") at position ";
    L9:
        r0.append(r2);
        r0.append(this.FH);
        r0.append(".");
    L14:
        return r0.toString();
    L5:
        if (r1 != 1) goto L7;
        r0.append("Unexpected token ");
        r0.append(this.DW);
        r2 = " at position ";
        goto L9
    L7:
        if (r1 == 2) goto L10;
        r2 = "Unkown error at position ";
        goto L9
    L10:
        r0.append("Unexpected exception at position ");
        r0.append(this.FH);
        r0.append(": ");
        r0.append(this.DW);
        goto L14
    }
}
