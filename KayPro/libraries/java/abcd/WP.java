package abcd;

public class WP implements abcd.UP {
    protected final byte[] DW;
    protected final byte[] j6;

    public WP() {
        this.j6 = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        this.DW = new byte[128];
        j6();
    }

    private boolean j6(char r2) {
        if (r2 != '\n') goto L5;
        return true;
    L5:
        if (r2 != '\r') goto L7;
        return true;
    L7:
        if (r2 != '\t') goto L9;
        return true;
    L9:
        if (r2 == ' ') goto L16;
        return false;
    L16:
        return true;
    }

    @Override
    public int j6(java.lang.String r7, java.io.OutputStream r8) {
        int r0 = r7.length();
    L3:
        if (r0 <= 0) goto L7;
        if (j6(r7.charAt(r0 - 1)) == false) goto L7;
        r0 = r0 - 1;
    L7:
        int r1 = 0;
        int r2 = 0;
    L8:
        if (r1 >= r0) goto L9;
    L10:
        if (r1 >= r0) goto L15;
        if (j6(r7.charAt(r1)) == false) goto L15;
        r1 = r1 + 1;
    L15:
        int r4 = r1 + 1;
        byte r3 = this.DW[r7.charAt(r1)];
    L16:
        if (r4 >= r0) goto L21;
        if (j6(r7.charAt(r4)) == false) goto L21;
        r4 = r4 + 1;
    L21:
        r8.write((r3 << 4) | this.DW[r7.charAt(r4)]);
        r2 = r2 + 1;
        r1 = r4 + 1;
        goto L8
    L9:
        return r2;
    }

    @Override
    public int j6(byte[] r5, int r6, int r7, java.io.OutputStream r8) {
        int r0 = r6;
    L4:
        if (r0 >= (r6 + r7)) goto L6;
        int r1 = r5[r0] & 255;
        r8.write(this.j6[r1 >>> 4]);
        r8.write(this.j6[r1 & 15]);
        r0 = r0 + 1;
        goto L4
    L6:
        return r7 * 2;
    }

    protected void j6() {
        int r0 = 0;
    L3:
        byte[] r1 = this.j6;
        if (r0 >= r1.length) goto L5;
        this.DW[r1[r0]] = (byte) r0;
        r0 = r0 + 1;
        goto L3
    L5:
        byte[] r2 = this.DW;
        r2[65] = r2[97];
        r2[66] = r2[98];
        r2[67] = r2[99];
        r2[68] = r2[100];
        r2[69] = r2[101(0x65, float:1.42E-43)];
        r2[70] = r2[102(0x66, float:1.43E-43)];
    }
}
