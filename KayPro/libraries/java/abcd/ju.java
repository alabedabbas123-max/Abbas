package abcd;

public final class ju {
    public static java.lang.String j6(abcd.St r7, char[] r8) {
        int r1 = 0;
    L3:
        char r2 = (char) (r7.readByte() & 255);
        if (r2 == 0) goto L6;
        r8[r1] = r2;
        if (r2 < 128) goto L9;
        if ((r2 & 224) != 192) goto L19;
        int r4 = r7.readByte() & 255;
        if ((r4 & 192) != 128) goto L17;
        int r3 = r1 + 1;
        r8[r1] = (char) (((r2 & 31) << 6) | (r4 & 63));
    L15:
        r1 = r3;
        goto L3
    L17:
        throw new java.io.UTFDataFormatException("bad second byte");
    L19:
        if ((r2 & 240) != 224) goto L28;
        int r5 = r7.readByte() & 255;
        int r6 = r7.readByte() & 255;
        if ((r5 & 192) != 128) goto L26;
        if ((r6 & 192) != 128) goto L26;
        r3 = r1 + 1;
        r8[r1] = (char) ((((r2 & 15) << 12) | ((r5 & 63) << 6)) | (r6 & 63));
    L26:
        throw new java.io.UTFDataFormatException("bad second or third byte");
    L28:
        throw new java.io.UTFDataFormatException("bad byte");
    L9:
        r1 = r1 + 1;
        goto L3
    L6:
        return new java.lang.String(r8, 0, r1);
    }
}
