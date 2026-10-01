package abcd;

public class oM extends abcd.EL {
    private static abcd.zL[][] j6;
    java.lang.String DW;
    private byte[] FH;

    static {
        j6 = new abcd.zL[255][];
    }

    public oM(java.lang.String r4) {
        if (DW(r4) == false) goto L7;
        this.DW = r4;
        return;
    L7:
        throw new java.lang.IllegalArgumentException("string " + r4 + " not an OID");
    }

    oM(byte[] r18) {
        java.lang.StringBuffer r1 = new java.lang.StringBuffer();
        java.math.BigInteger r10 = null;
        long r8 = 0;
        int r7 = 0;
        boolean r11 = true;
    L4:
        if (r7 == r18.length) goto L5;
        int r13 = r18[r7] & 255;
        if (r8 >= 36028797018963968L) goto L21;
        r8 = (r8 * 128) + ((long) (r13 & 127));
        if ((r13 & 128) != 0) goto L27;
        if (r11 == false) goto L20;
        int r12 = ((int) r8) / 40;
        if (r12 == 0) goto L18;
        if (r12 == 1) goto L17;
        r1.append('2');
        long r14 = 80;
    L16:
        r8 = r8 - r14;
    L19:
        r11 = false;
        goto L20
    L17:
        r1.append('1');
        r14 = 40;
        goto L16
    L18:
        r1.append('0');
    L20:
        r1.append('.');
        r1.append(r8);
    L26:
        r8 = 0;
    L27:
        r7 = r7 + 1;
        goto L4
    L21:
        if (r10 != null) goto L23;
        r10 = java.math.BigInteger.valueOf(r8);
    L23:
        r10 = r10.shiftLeft(7).or(java.math.BigInteger.valueOf(r13 & 127));
        if ((r13 & 128) != 0) goto L27;
        r1.append('.');
        r1.append(r10);
        r10 = null;
        goto L26
    L5:
        this.DW = r1.toString();
    }

    static abcd.zL DW(byte[] r5) {
        if (r5.length < 3) goto L5;
        int r0 = r5[r5.length - 2] & 255;
        abcd.zL[][] r2 = j6;
        abcd.zL[] r3 = r2[r0];
        if (r3 != null) goto L9;
        r3 = new abcd.zL[255];
        r2[r0] = r3;
    L9:
        int r4 = r5[r5.length - 1] & 255;
        abcd.zL r6 = r3[r4];
        if (r6 != null) goto L14;
        abcd.zL r1 = new abcd.zL(r5);
        r3[r4] = r1;
        return r1;
    L14:
        if (abcd.OP.j6(r5, r6.u7()) == false) goto L16;
        return r6;
    L16:
        int r7 = (r0 + 1) % 256;
        abcd.zL[][] r8 = j6;
        abcd.zL[] r9 = r8[r7];
        if (r9 != null) goto L19;
        r9 = new abcd.zL[255];
        r8[r7] = r9;
    L19:
        abcd.zL r10 = r9[r4];
        if (r10 != null) goto L24;
        abcd.zL r11 = new abcd.zL(r5);
        r9[r4] = r11;
        return r11;
    L24:
        if (abcd.OP.j6(r5, r10.u7()) == false) goto L26;
        return r10;
    L26:
        int r12 = (r4 + 1) % 256;
        abcd.zL r13 = r9[r12];
        if (r13 != null) goto L31;
        abcd.zL r14 = new abcd.zL(r5);
        r9[r12] = r14;
        return r14;
    L31:
        if (abcd.OP.j6(r5, r13.u7()) == false) goto L34;
        return r13;
    L34:
        return new abcd.zL(r5);
    L5:
        return new abcd.zL(r5);
    }

    private static boolean DW(java.lang.String r8) {
        if (r8.length() >= 3) goto L5;
    L26:
        return false;
    L5:
        if (r8.charAt(1) != '.') goto L26;
        char r2 = r8.charAt(0);
        if (r2 < '0') goto L26;
        if (r2 > '2') goto L26;
        int r3 = r8.length() - 1;
        boolean r5 = false;
    L14:
        if (r3 < 2) goto L15;
        char r6 = r8.charAt(r3);
        if ('0' <= r6) goto L19;
    L21:
        if (r6 != '.') goto L26;
        if (r5 == false) goto L23;
        r5 = false;
    L25:
        r3 = r3 - 1;
        goto L14
    L23:
        return false;
    L19:
        if (r6 > '9') goto L21;
        r5 = true;
        goto L25
    L15:
        return r5;
    }

    public static abcd.zL j6(java.lang.Object r3) {
        if (r3 == null) goto L13;
        if ((r3 instanceof abcd.zL) == true) goto L13;
        if ((r3 instanceof abcd.oM) == false) goto L11;
        return new abcd.zL(((abcd.oM) r3).tp());
    L11:
        throw new java.lang.IllegalArgumentException("illegal object in getInstance: " + r3.getClass().getName());
    L13:
        return (abcd.zL) r3;
    }

    private void j6(java.io.ByteArrayOutputStream r5) {
        abcd.NM r0 = new abcd.NM(this.DW);
        j6(r5, (java.lang.Integer.parseInt(r0.DW()) * 40) + java.lang.Integer.parseInt(r0.DW()));
    L4:
        if (r0.j6() == false) goto L5;
        java.lang.String r1 = r0.DW();
        if (r1.length() < 18) goto L8;
        j6(r5, new java.math.BigInteger(r1));
        goto L4
    L8:
        j6(r5, java.lang.Long.parseLong(r1));
        goto L4
    }

    private void j6(java.io.ByteArrayOutputStream r7, long r8) {
        byte[] r1 = new byte[9];
        int r3 = 8;
        r1[8] = (byte) (((int) r8) & 127);
    L4:
        if (r8 < 128) goto L5;
        r8 = r8 >> 7;
        r3 = r3 - 1;
        r1[r3] = (byte) ((((int) r8) & 127) | 128);
        goto L4
    L5:
        r7.write(r1, r3, 9 - r3);
    }

    private void j6(java.io.ByteArrayOutputStream r7, java.math.BigInteger r8) {
        int r0 = (r8.bitLength() + 6) / 7;
        if (r0 != 0) goto L5;
        r7.write(0);
        return;
    L5:
        byte[] r3 = new byte[r0];
        int r1 = r0 - 1;
        java.math.BigInteger r4 = r8;
        int r9 = r1;
    L6:
        if (r9 < 0) goto L7;
        r3[r9] = (byte) ((r4.intValue() & 127) | 128);
        r4 = r4.shiftRight(7);
        r9 = r9 - 1;
        goto L6
    L7:
        r3[r1] = (byte) (r3[r1] & 127);
        r7.write(r3, 0, r3.length);
    }

    @Override
    boolean Zo() {
        return false;
    }

    @Override
    public int hashCode() {
        return this.DW.hashCode();
    }

    @Override
    void j6(abcd.CL r3) {
        byte[] r0 = u7();
        r3.j6(6);
        r3.DW(r0.length);
        r3.j6(r0);
    }

    @Override
    boolean j6(abcd.EL r2) {
        if ((r2 instanceof abcd.oM) == true) goto L7;
        return false;
    L7:
        return this.DW.equals(((abcd.oM) r2).DW);
    }

    public java.lang.String toString() {
        return tp();
    }

    public java.lang.String tp() {
        return this.DW;
    }

    protected byte[] u7() {
        if (this.FH != null) goto L6;
        java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream();
        j6(r0);
        this.FH = r0.toByteArray();
    L6:
        return this.FH;
    }

    @Override
    int v5() {
        int r0 = u7().length;
        return (abcd.OM.j6(r0) + 1) + r0;
    }
}
