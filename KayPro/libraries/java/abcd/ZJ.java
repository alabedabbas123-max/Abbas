package abcd;

class ZJ implements java.util.Comparator<abcd._J.a> {
    ZJ() {
    }

    @Override
    public int compare(abcd._J.a r1, abcd._J.a r2) {
        return j6(r1, r2);
    }

    public int j6(abcd._J.a r8, abcd._J.a r9) {
        byte[] r0 = r8.j6;
        byte[] r1 = r9.j6;
        int r2 = r8.DW;
        int r3 = r9.DW;
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L10;
        if (r4 >= r3) goto L10;
        int r5 = (r0[r4] & 255) - (r1[r4] & 255);
        if (r5 != 0) goto L8;
        r4 = r4 + 1;
        goto L3
    L8:
        return r5;
    L10:
        if (r4 >= r2) goto L14;
        int r10 = r0[r4] & 255;
        int r11 = abcd._J.DW(r9);
    L13:
        return r10 - r11;
    L14:
        if (r4 >= r3) goto L16;
        r10 = abcd._J.DW(r8);
        r11 = r1[r4] & 255;
        goto L13
    L16:
        r10 = abcd._J.DW(r8);
        r11 = abcd._J.DW(r9);
        goto L13
    }
}
