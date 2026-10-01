package abcd;

class vC extends abcd.AbstractzC {
    vC() {
    }

    @Override
    protected int j6(byte[] r4, int r5, int r6) {
        int r0 = 5381;
    L3:
        if (r5 >= r6) goto L4;
        byte r1 = r4[r5];
        if (abcd.HK.j6(r1) == true) goto L8;
        r0 = ((r0 << 5) + r0) + (r1 & 255);
    L8:
        r5 = r5 + 1;
        goto L3
    L4:
        return r0;
    }

    public boolean j6(abcd.CC r1, int r2, abcd.CC r3, int r4) {
        return j6((abcd.tC) r1, r2, (abcd.tC) r3, r4);
    }

    public boolean j6(abcd.tC r8, int r9, abcd.tC r10, int r11) {
        int r12 = r9 + 1;
        int r13 = r11 + 1;
        int r1 = r8.FH.DW(r12);
        int r2 = r10.FH.DW(r13);
        int r14 = r8.FH.DW(r12 + 1);
        int r15 = r10.FH.DW(r13 + 1);
        int r16 = abcd.HK.DW(r8.DW, r1, r14);
        int r17 = abcd.HK.DW(r10.DW, r2, r15);
    L4:
        if (r1 >= r16) goto L23;
        if (r2 >= r17) goto L23;
        byte r4 = r8.DW[r1];
        byte r5 = r10.DW[r2];
    L9:
        if (r1 >= (r16 - 1)) goto L15;
        if (abcd.HK.j6(r4) == false) goto L15;
        r1 = r1 + 1;
        r4 = r8.DW[r1];
    L15:
        if (r2 >= (r17 - 1)) goto L20;
        if (abcd.HK.j6(r5) == false) goto L20;
        r2 = r2 + 1;
        r5 = r10.DW[r2];
    L20:
        if (r4 != r5) goto L21;
        r1 = r1 + 1;
        r2 = r2 + 1;
        goto L4
    L21:
        return false;
    L23:
        if (r1 != r16) goto L26;
        if (r2 != r17) goto L26;
        return true;
    L26:
        return false;
    }
}
