package abcd;

class OM {
    private static final long j6 = 0;

    static {
        j6 = java.lang.Runtime.getRuntime().maxMemory();
    }

    static int DW(int r5) {
        if (r5 >= 31) goto L5;
        return 1;
    L5:
        if (r5 >= 128) goto L7;
        return 2;
    L7:
        byte[] r2 = new byte[5];
        int r3 = r2.length - 1;
        r2[r3] = (byte) (r5 & 127);
    L8:
        r5 = r5 >> 7;
        r3 = r3 - 1;
        r2[r3] = (byte) ((r5 & 127) | 128);
        if (r5 > 127) goto L8;
        return 1 + (r2.length - r3);
    }

    static int j6(int r2) {
        int r0 = 1;
        if (r2 <= 127) goto L12;
        int r1 = 1;
    L5:
        r2 = r2 >>> 8;
        if (r2 == 0) goto L7;
        r1 = r1 + 1;
        goto L5
    L7:
        int r3 = (r1 - 1) * 8;
    L8:
        if (r3 < 0) goto L12;
        r0 = r0 + 1;
        r3 = r3 - 8;
    L12:
        return r0;
    }

    static int j6(java.io.InputStream r5) {
        if ((r5 instanceof abcd.MM) == false) goto L7;
        return ((abcd.MM) r5).j6();
    L7:
        if ((r5 instanceof abcd.C1419vL) == false) goto L11;
        return ((abcd.C1419vL) r5).DW();
    L11:
        if ((r5 instanceof java.io.ByteArrayInputStream) == false) goto L15;
        return ((java.io.ByteArrayInputStream) r5).available();
    L15:
        if ((r5 instanceof java.io.FileInputStream) == true) goto L28;
    L22:
        long r3 = j6;
        if (r3 <= 2147483647L) goto L27;
        return Integer.MAX_VALUE;
    L27:
        return (int) r3;
    L28:
        long r4 = ((java.io.FileInputStream) r5).getChannel().size();     // Catch: java.io.IOException -> L21
        if (r4 >= 2147483647L) goto L22;
        return (int) r4;
    }
}
