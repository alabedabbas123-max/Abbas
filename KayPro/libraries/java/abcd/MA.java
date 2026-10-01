package abcd;

public class MA {
    static java.text.DateFormat j6;

    static {
        j6 = new java.text.SimpleDateFormat("MM-dd-yy HH:mm");
    }

    public static void j6(abcd.InterfacetA r1) {
        r1.FH(" Length   Method    Size  Ratio   Date   Time   CRC-32    Name");
        r1.FH("--------  ------  ------- -----   ----   ----   ------    ----");
    }

    public static void j6(abcd.InterfacetA r6, abcd.IA r7) {
        if (r7.QX() <= 0) goto L5;
        int r0 = ((r7.QX() - r7.j6()) * 100) / r7.QX();
    L6:
        java.lang.Object[] r2 = new java.lang.Object[7];
        r2[0] = java.lang.Integer.valueOf(r7.QX());
        if (r7.DW() != 0) goto L9;
        java.lang.String r3 = "Stored";
    L10:
        r2[1] = r3;
        r2[2] = java.lang.Integer.valueOf(r7.j6());
        r2[3] = java.lang.Integer.valueOf(r0);
        r2[4] = j6.format(new java.util.Date(r7.XL()));
        r2[5] = java.lang.Integer.valueOf(r7.FH());
        r2[6] = r7.EQ();
        r6.FH(java.lang.String.format("%8d  %6s %8d %4d%% %s  %08x  %s", r2));
        return;
    L9:
        r3 = "Defl:N";
        goto L10
    L5:
        r0 = 0;
        goto L6
    }
}
