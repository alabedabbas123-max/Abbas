package abcd;

public class qH {
    private java.io.File j6;

    public qH(abcd.UE r4, java.lang.String r5) {
        this.j6 = new java.io.File(r4.VH(), "logs/" + r5);
    }

    public abcd.pH j6(int r6) {
        if (r6 < 0) goto L19;
        byte[] r1 = abcd.BK.j6(this.j6);     // Catch: java.io.FileNotFoundException -> L17
        int r2 = abcd.IK.we(r1, r1.length);
        int r3 = 0;
        int r4 = 0;
    L6:
        if (r2 < 0) goto L7;
        r2 = abcd.IK.we(r1, r2);
        if (r6 == r4) goto L11;
        r4 = r4 + 1;
        goto L6
    L11:
        if (r2 < 0) goto L15;
        r3 = r2 + 2;
    L15:
        return new abcd.pH(r1, r3);
    L7:
        return null;
    L17:
        return null;
    L19:
        throw new java.lang.IllegalArgumentException();
    }
}
