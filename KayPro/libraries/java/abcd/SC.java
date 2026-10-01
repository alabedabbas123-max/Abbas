package abcd;

class SC implements java.util.Comparator<abcd.TC> {
    SC() {
    }

    @Override
    public int compare(abcd.TC r1, abcd.TC r2) {
        return j6(r1, r2);
    }

    public int j6(abcd.TC r7, abcd.TC r8) {
        byte[] r9 = abcd.TC.j6(r7);
        byte[] r10 = abcd.TC.j6(r8);
        int r0 = r9.length;
        int r1 = r10.length;
        int r3 = 0;
    L3:
        if (r3 >= r0) goto L10;
        if (r3 >= r1) goto L10;
        int r4 = (r9[r3] & 255) - (r10[r3] & 255);
        if (r4 != 0) goto L8;
        r3 = r3 + 1;
        goto L3
    L8:
        return r4;
    L10:
        if (r0 != r1) goto L12;
        return 0;
    L12:
        if (r0 >= r1) goto L16;
        return 47 - (r10[r3] & 255);
    L16:
        return (r9[r3] & 255) - 47;
    }
}
