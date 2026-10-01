package abcd;

public abstract class Abstractao {
    public static boolean j6 = true;

    public Abstractao() {
    }

    protected static int DW(int r1, int r2) {
        if ((r1 & 15) != r1) goto L11;
        if ((r2 & 15) != r2) goto L9;
        return r1 | (r2 << 4);
    L9:
        throw new java.lang.IllegalArgumentException("high out of range 0..15");
    L11:
        throw new java.lang.IllegalArgumentException("low out of range 0..15");
    }

    protected static java.lang.String DW(abcd.AbstractVn r1) {
        int r2 = ((abcd.po) r1).J0();
        if (r2 != ((char) r2)) goto L6;
        return abcd.Yt.v5(r2);
    L6:
        return abcd.Yt.gn(r2);
    }

    protected static java.lang.String DW(abcd.cs r4) {
        int r0 = r4.size();
        java.lang.StringBuffer r1 = new java.lang.StringBuffer((r0 * 5) + 2);
        r1.append('{');
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L7;
        if (r2 == 0) goto L6;
        r1.append(", ");
    L6:
        r1.append(r4.get(r2).lg());
        r2 = r2 + 1;
        goto L3
    L7:
        r1.append('}');
        return r1.toString();
    }

    protected static boolean DW(int r1) {
        if (r1 >= (-8)) goto L5;
    L7:
        return false;
    L5:
        if (r1 > 7) goto L7;
        return true;
    }

    protected static java.lang.String FH(abcd.cs r6) {
        int r0 = r6.size();
        java.lang.StringBuilder r1 = new java.lang.StringBuilder(30);
        r1.append("{");
        if (r0 != 0) goto L5;
    L11:
        r1.append("}");
        return r1.toString();
    L5:
        if (r0 == 1) goto L10;
        abcd.bs r2 = r6.get(r0 - 1);
        if (r2.Hw() != 2) goto L9;
        r2 = r2.DW(1);
    L9:
        r1.append(r6.get(0).lg());
        r1.append("..");
        r1.append(r2.lg());
        goto L11
    L10:
        r1.append(r6.get(0).lg());
        goto L11
    }

    protected static boolean FH(int r1) {
        if (((short) r1) != r1) goto L5;
        return true;
    L5:
        return false;
    }

    protected static java.lang.String Hw(abcd.AbstractVn r2) {
        abcd.Tn r3 = (abcd.Tn) r2;
        if (r3.J8() == true) goto L6;
        return "";
    L6:
        java.lang.StringBuilder r0 = new java.lang.StringBuilder(20);
        int r1 = r3.J0();
        r0.append(r3.we().Zo());
        r0.append('@');
        if (r1 >= 65536) goto L9;
        r0.append(abcd.Yt.v5(r1));
    L11:
        return r0.toString();
    L9:
        r0.append(abcd.Yt.gn(r1));
        goto L11
    }

    protected static boolean Hw(int r1) {
        if (r1 != (r1 & 255)) goto L5;
        return true;
    L5:
        return false;
    }

    protected static boolean Zo(int r1) {
        if (r1 != (65535 & r1)) goto L5;
        return true;
    L5:
        return false;
    }

    protected static short gn(abcd.AbstractVn r1) {
        int r2 = r1.Zo().v5();
        if (r2 < 255) goto L9;
        if (r2 > 65535) goto L9;
        return (short) r2;
    L9:
        throw new java.lang.IllegalArgumentException("extended opcode out of range 255..65535");
    }

    protected static java.lang.String j6(abcd.Ds r2) {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(100);
        r0.append('#');
        if ((r2 instanceof abcd.As) == false) goto L5;
        r0.append("null");
    L7:
        return r0.toString();
    L5:
        r0.append(r2.Zo());
        r0.append(' ');
        r0.append(r2.aM());
        goto L7
    }

    protected static java.lang.String j6(abcd.Ds r3, int r4) {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(20);
        r0.append("#");
        if ((r3 instanceof abcd.Cs) == false) goto L5;
        long r1 = ((abcd.Cs) r3).lg();
    L7:
        if (r4 != 4) goto L9;
        r0.append(abcd.Yt.u7((int) r1));
    L24:
        return r0.toString();
    L9:
        if (r4 != 8) goto L11;
        r0.append(abcd.Yt.Hw((int) r1));
        goto L24
    L11:
        if (r4 != 16) goto L13;
        r0.append(abcd.Yt.v5((int) r1));
        goto L24
    L13:
        if (r4 != 32) goto L15;
        r0.append(abcd.Yt.gn((int) r1));
        goto L24
    L15:
        if (r4 != 64) goto L18;
        r0.append(abcd.Yt.DW(r1));
        goto L24
    L18:
        throw new java.lang.RuntimeException("shouldn't happen");
    L5:
        r1 = r3.Ws();
        goto L7
    }

    protected static java.lang.String j6(abcd.AbstractVn r1) {
        int r2 = ((abcd.po) r1).J8();
        if (r2 != ((short) r2)) goto L6;
        return abcd.Yt.DW(r2);
    L6:
        return abcd.Yt.FH(r2);
    }

    protected static short j6(int r1, int r2) {
        if ((r1 & 255) != r1) goto L11;
        if ((r2 & 255) != r2) goto L9;
        return (short) (r1 | (r2 << 8));
    L9:
        throw new java.lang.IllegalArgumentException("high out of range 0..255");
    L11:
        throw new java.lang.IllegalArgumentException("low out of range 0..255");
    }

    protected static short j6(int r1, int r2, int r3, int r4) {
        if ((r1 & 15) != r1) goto L19;
        if ((r2 & 15) != r2) goto L17;
        if ((r3 & 15) != r3) goto L15;
        if ((r4 & 15) != r4) goto L13;
        return (short) (((r1 | (r2 << 4)) | (r3 << 8)) | (r4 << 12));
    L13:
        throw new java.lang.IllegalArgumentException("n3 out of range 0..15");
    L15:
        throw new java.lang.IllegalArgumentException("n2 out of range 0..15");
    L17:
        throw new java.lang.IllegalArgumentException("n1 out of range 0..15");
    L19:
        throw new java.lang.IllegalArgumentException("n0 out of range 0..15");
    }

    protected static short j6(abcd.AbstractVn r1, int r2) {
        if ((r2 & 255) != r2) goto L11;
        int r3 = r1.Zo().v5();
        if ((r3 & 255) != r3) goto L9;
        return (short) (r3 | (r2 << 8));
    L9:
        throw new java.lang.IllegalArgumentException("opcode out of range 0..255");
    L11:
        throw new java.lang.IllegalArgumentException("arg out of range 0..255");
    }

    protected static void j6(abcd.Lt r0, short r1) {
        r0.writeShort(r1);
    }

    protected static void j6(abcd.Lt r1, short r2, int r3) {
        j6(r1, r2, (short) r3, (short) (r3 >> 16));
    }

    protected static void j6(abcd.Lt r1, short r2, int r3, short r4) {
        j6(r1, r2, (short) r3, (short) (r3 >> 16), r4);
    }

    protected static void j6(abcd.Lt r6, short r7, int r8, short r9, short r10) {
        j6(r6, r7, (short) r8, (short) (r8 >> 16), r9, r10);
    }

    protected static void j6(abcd.Lt r7, short r8, long r9) {
        j6(r7, r8, (short) r9, (short) (r9 >> 16), (short) (r9 >> 32), (short) (r9 >> 48));
    }

    protected static void j6(abcd.Lt r0, short r1, short r2) {
        r0.writeShort(r1);
        r0.writeShort(r2);
    }

    protected static void j6(abcd.Lt r0, short r1, short r2, short r3) {
        r0.writeShort(r1);
        r0.writeShort(r2);
        r0.writeShort(r3);
    }

    protected static void j6(abcd.Lt r0, short r1, short r2, short r3, short r4) {
        r0.writeShort(r1);
        r0.writeShort(r2);
        r0.writeShort(r3);
        r0.writeShort(r4);
    }

    protected static void j6(abcd.Lt r0, short r1, short r2, short r3, short r4, short r5) {
        r0.writeShort(r1);
        r0.writeShort(r2);
        r0.writeShort(r3);
        r0.writeShort(r4);
        r0.writeShort(r5);
    }

    protected static boolean j6(int r1) {
        if (((byte) r1) != r1) goto L5;
        return true;
    L5:
        return false;
    }

    protected static boolean j6(abcd.cs r7) {
        int r0 = r7.size();
        if (r0 >= 2) goto L5;
        return true;
    L5:
        int r4 = r7.get(0).we();
        int r3 = 0;
    L6:
        if (r3 >= r0) goto L11;
        abcd.bs r5 = r7.get(r3);
        if (r5.we() != r4) goto L9;
        r4 = r4 + r5.Hw();
        r3 = r3 + 1;
        goto L6
    L9:
        return false;
    L11:
        return true;
    }

    protected static java.lang.String v5(abcd.AbstractVn r1) {
        abcd.Abstractms r2 = ((abcd.Tn) r1).we();
        if ((r2 instanceof abcd.Js) == false) goto L6;
        return ((abcd.Js) r2).lg();
    L6:
        return r2.aM();
    }

    protected static boolean v5(int r1) {
        if (r1 != (r1 & 15)) goto L5;
        return true;
    L5:
        return false;
    }

    public final java.lang.String DW(abcd.AbstractVn r4, boolean r5) {
        java.lang.String r0 = r4.Zo().FH();
        java.lang.String r1 = Zo(r4);
        java.lang.String r6 = j6(r4, r5);
        java.lang.StringBuilder r7 = new java.lang.StringBuilder(100);
        r7.append(r0);
        if (r1.length() == 0) goto L6;
        r7.append(' ');
        r7.append(r1);
    L6:
        if (r6.length() == 0) goto L9;
        r7.append(" // ");
        r7.append(r6);
    L9:
        return r7.toString();
    }

    public java.util.BitSet FH(abcd.AbstractVn r1) {
        return new java.util.BitSet();
    }

    public abstract boolean VH(abcd.AbstractVn r1);

    public abstract java.lang.String Zo(abcd.AbstractVn r1);

    public abstract int j6();

    public abstract java.lang.String j6(abcd.AbstractVn r1, boolean r2);

    public abstract void j6(abcd.Lt r1, abcd.AbstractVn r2);

    public boolean j6(abcd.po r1) {
        return false;
    }
}
