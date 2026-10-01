package abcd;

class uC extends abcd.AbstractzC {
    uC() {
    }

    @Override
    protected int j6(byte[] r3, int r4, int r5) {
        int r0 = 5381;
    L3:
        if (r4 >= r5) goto L4;
        int r1 = (r0 << 5) + r0;
        r0 = (r3[r4] & 255) + r1;
        r4 = r4 + 1;
        goto L3
    L4:
        return r0;
    }

    public boolean j6(abcd.CC r1, int r2, abcd.CC r3, int r4) {
        return j6((abcd.tC) r1, r2, (abcd.tC) r3, r4);
    }

    public boolean j6(abcd.tC r7, int r8, abcd.tC r9, int r10) {
        int r11 = r8 + 1;
        int r12 = r10 + 1;
        int r1 = r7.FH.DW(r11);
        int r2 = r9.FH.DW(r12);
        int r13 = r7.FH.DW(r11 + 1);
        int r14 = r9.FH.DW(r12 + 1);
        if ((r13 - r1) == (r14 - r2)) goto L5;
        return false;
    L5:
        if (r1 >= r13) goto L6;
        int r3 = r1 + 1;
        int r5 = r2 + 1;
        if (r7.DW[r1] != r9.DW[r2]) goto L9;
        r1 = r3;
        r2 = r5;
        goto L5
    L9:
        return false;
    L6:
        return true;
    }
}
