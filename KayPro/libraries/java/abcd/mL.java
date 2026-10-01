package abcd;

public class mL {
    public java.lang.Object DW;
    public int j6;

    public mL(int r2, java.lang.Object r3) {
        this.j6 = 0;
        this.DW = null;
        this.j6 = r2;
        this.DW = r3;
    }

    public java.lang.String toString() {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer();
        switch(this.j6) {
            case -1: goto L12;
            case 0: goto L11;
            case 1: goto L10;
            case 2: goto L9;
            case 3: goto L8;
            case 4: goto L7;
            case 5: goto L6;
            case 6: goto L5;
            default: goto L15;
        };
    L5:
        java.lang.String r1 = "COLON(:)";
    L13:
        r0.append(r1);
        goto L15
    L6:
        r1 = "COMMA(,)";
        goto L13
    L7:
        r1 = "RIGHT SQUARE(])";
        goto L13
    L8:
        r1 = "LEFT SQUARE([)";
        goto L13
    L9:
        r1 = "RIGHT BRACE(})";
        goto L13
    L10:
        r1 = "LEFT BRACE({)";
        goto L13
    L11:
        r0.append("VALUE(");
        r0.append(this.DW);
        r1 = ")";
        goto L13
    L12:
        r1 = "END OF FILE";
    L15:
        return r0.toString();
    }
}
