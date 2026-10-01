package abcd;

public final class eu {
    public static int DW(abcd.St r5) {
        int r0 = 0;
        int r1 = 0;
    L3:
        int r2 = r5.readByte() & 255;
        r0 = r0 | ((r2 & 127) << (r1 * 7));
        r1 = r1 + 1;
        int r3 = r2 & 128;
        if (r3 != 128) goto L7;
        if (r1 < 5) goto L3;
    L7:
        if (r3 == 128) goto L10;
        return r0;
    L10:
        throw new abcd.Ut("invalid LEB128 sequence");
    }

    public static void DW(abcd.Tt r2, int r3) {
    L2:
        int r0 = r3;
        r3 = r3 >>> 7;
        if (r3 == 0) goto L5;
        r2.writeByte((byte) ((r0 & 127) | 128));
        goto L2
    L5:
        r2.writeByte((byte) (r0 & 127));
    }

    public static int j6(int r1) {
        int r2 = r1 >> 7;
        int r0 = 0;
    L3:
        if (r2 == 0) goto L6;
        r2 = r2 >> 7;
        r0 = r0 + 1;
        goto L3
    L6:
        return r0 + 1;
    }

    public static int j6(abcd.St r6) {
        int r0 = 0;
        int r1 = 0;
        int r2 = -1;
    L3:
        int r3 = r6.readByte() & 255;
        r0 = r0 | ((r3 & 127) << (r1 * 7));
        r2 = r2 << 7;
        r1 = r1 + 1;
        int r4 = r3 & 128;
        if (r4 != 128) goto L7;
        if (r1 < 5) goto L3;
    L7:
        if (r4 == 128) goto L13;
        if (((r2 >> 1) & r0) != 0) goto L11;
        return r0;
    L11:
        return r0 | r2;
    L13:
        throw new abcd.Ut("invalid LEB128 sequence");
    }

    public static void j6(abcd.Tt r7, int r8) {
        int r0 = r8 >> 7;
        if ((Integer.MIN_VALUE & r8) != 0) goto L5;
        int r1 = 0;
    L6:
        int r4 = r8;
        boolean r9 = true;
    L7:
        if (r9 == false) goto L19;
        if (r0 == r1) goto L10;
    L13:
        r9 = true;
    L14:
        int r5 = r4 & 127;
        if (r9 == false) goto L17;
        int r6 = 128;
    L18:
        r7.writeByte((byte) (r5 | r6));
        r4 = r0;
        r0 = r0 >> 7;
        goto L7
    L17:
        r6 = 0;
        goto L18
    L10:
        if ((r0 & 1) != ((r4 >> 6) & 1)) goto L13;
        r9 = false;
        goto L14
    L19:
        return;
    L5:
        r1 = -1;
        goto L6
    }
}
