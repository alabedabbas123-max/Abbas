package abcd;

class yC extends abcd.AbstractzC {
    yC() {
    }

    @Override
    protected int j6(byte[] r4, int r5, int r6) {
        int r7 = abcd.HK.DW(r4, r5, r6);
        int r0 = 5381;
    L3:
        if (r5 >= r7) goto L4;
        byte r1 = r4[r5];
        int r2 = (r0 << 5) + r0;
        r0 = (r1 & 255) + r2;
        if (abcd.HK.j6(r1) == true) goto L7;
        r5 = r5 + 1;
        goto L3
    L7:
        r5 = abcd.HK.j6(r4, r5, r7);
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
        int r15 = abcd.HK.DW(r7.DW, r1, r13);
        int r16 = abcd.HK.DW(r9.DW, r2, r14);
    L4:
        if (r1 >= r15) goto L18;
        if (r2 >= r16) goto L18;
        byte r4 = r7.DW[r1];
        byte r5 = r9.DW[r2];
        if (r4 != r5) goto L9;
        if (abcd.HK.j6(r4) == false) goto L13;
        r1 = abcd.HK.j6(r7.DW, r1, r15);
    L15:
        if (abcd.HK.j6(r5) == true) goto L16;
        r2 = r2 + 1;
        goto L4
    L16:
        r2 = abcd.HK.j6(r9.DW, r2, r16);
        goto L4
    L13:
        r1 = r1 + 1;
        goto L15
    L9:
        return false;
    L18:
        if (r1 != r15) goto L21;
        if (r2 != r16) goto L21;
        return true;
    L21:
        return false;
    }
}
