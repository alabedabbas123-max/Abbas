package abcd;

public class AA {
    protected final byte[] DW;
    protected final byte[] j6;

    public AA() {
        this.j6 = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        this.DW = new byte[128];
        j6();
    }

    public int j6(byte[] r5, int r6, int r7, java.io.OutputStream r8) {
        int r0 = r6;
    L4:
        if (r0 >= (r6 + r7)) goto L7;
        int r1 = r5[r0] & 255;
        r8.write(this.j6[r1 >>> 4]);
        r8.write(this.j6[r1 & 15]);
        r0 = r0 + 1;
        goto L4
    L7:
        return r7 * 2;
    }

    protected void j6() {
        int r0 = 0;
    L3:
        byte[] r1 = this.j6;
        if (r0 >= r1.length) goto L6;
        this.DW[r1[r0]] = (byte) r0;
        r0 = r0 + 1;
        goto L3
    L6:
        byte[] r2 = this.DW;
        r2[65] = r2[97];
        r2[66] = r2[98];
        r2[67] = r2[99];
        r2[68] = r2[100];
        r2[69] = r2[101(0x65, float:1.42E-43)];
        r2[70] = r2[102(0x66, float:1.43E-43)];
    }
}
