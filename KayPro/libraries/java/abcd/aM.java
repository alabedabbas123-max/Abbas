package abcd;

public class aM extends abcd.EL {
    private final int DW;
    private final byte[] FH;
    private final boolean j6;

    public aM(int r4, abcd.rL r5) {
        this.DW = r4;
        this.j6 = true;
        java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream();
        int r0 = 0;
    L4:
        if (r0 == r5.j6()) goto L5;
        r6.write(((abcd.AbstractyL) r5.j6(r0)).j6("DER"));     // Catch: java.io.IOException -> L9
        r0 = r0 + 1;
    L9:
        e = move-exception;
        throw new abcd.DL("malformed object: " + e, e);
    L5:
        this.FH = r6.toByteArray();
    }

    aM(boolean r1, int r2, byte[] r3) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
    }

    private byte[] j6(int r7, byte[] r8) {
        if ((r8[0] & 31) != 31) goto L13;
        int r1 = 2;
        int r2 = r8[1] & 255;
        if ((r2 & 127) == 0) goto L12;
    L6:
        if (r2 < 0) goto L14;
        if ((r2 & 128) == 0) goto L14;
        int r3 = r1 + 1;
        r2 = r8[r1] & 255;
        r1 = r3;
    L14:
        byte[] r4 = new byte[(r8.length - r1) + 1];
        java.lang.System.arraycopy(r8, r1, r4, 1, r4.length - 1);
        r4[0] = (byte) r7;
        return r4;
    L12:
        throw new abcd.DL("corrupted stream - invalid high tag number found");
    L13:
        r1 = 1;
        goto L14
    }

    @Override
    public boolean Zo() {
        return this.j6;
    }

    @Override
    public int hashCode() {
        boolean r0 = this.j6;
        int r1 = this.DW;
        return ((r0 ? 1 : 0) ^ r1) ^ abcd.OP.DW(this.FH);
    }

    public abcd.EL j6(int r3) {
        if (r3 >= 31) goto L10;
        byte[] r0 = Hw();
        byte[] r4 = j6(r3, r0);
        if ((r0[0] & 32) == 0) goto L8;
        r4[0] = (byte) (r4[0] | 32);
    L8:
        return new abcd.C1419vL(r4).Hw();
    L10:
        throw new java.io.IOException("unsupported tag number");
    }

    @Override
    void j6(abcd.CL r4) {
        if (this.j6 == false) goto L5;
        int r0 = 96;
    L6:
        r4.j6(r0, this.DW, this.FH);
        return;
    L5:
        r0 = 64;
        goto L6
    }

    @Override
    boolean j6(abcd.EL r4) {
        if ((r4 instanceof abcd.aM) == true) goto L5;
        return false;
    L5:
        abcd.aM r5 = (abcd.aM) r4;
        if (this.j6 == r5.j6) goto L8;
    L13:
        return false;
    L8:
        if (this.DW != r5.DW) goto L13;
        if (abcd.OP.j6(this.FH, r5.FH) == false) goto L13;
        return true;
    }

    public byte[] tp() {
        return this.FH;
    }

    public int u7() {
        return this.DW;
    }

    @Override
    int v5() {
        return (abcd.OM.DW(this.DW) + abcd.OM.j6(this.FH.length)) + this.FH.length;
    }
}
