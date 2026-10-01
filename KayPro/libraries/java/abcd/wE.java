package abcd;

public class wE {
    public static final byte[] DW = null;
    public static final byte[] FH = null;
    public static final byte[] Hw = null;
    public static final byte[] VH = null;
    public static final byte[] Zo = null;
    public static final byte[] gn = null;
    public static final byte[] j6 = null;
    public static final byte[] u7 = null;
    public static final byte[] v5 = null;
    private final abcd.EK EQ;
    private final abcd.uE tp;

    static {
        j6 = abcd.hE.DW("tree ");
        DW = abcd.hE.DW("parent ");
        FH = abcd.hE.DW("author ");
        Hw = abcd.hE.DW("committer ");
        v5 = abcd.hE.DW("encoding ");
        Zo = abcd.hE.DW("object ");
        VH = abcd.hE.DW("type ");
        gn = abcd.hE.DW("tag ");
        u7 = abcd.hE.DW("tagger ");
    }

    public wE() {
        this.tp = new abcd.uE();
        this.EQ = new abcd.EK();
    }

    private int DW(byte[] r5, int r6) {
        int r1 = abcd.IK.DW(r5, r6, '<');
        if (r1 != r6) goto L5;
    L29:
        return -1;
    L5:
        if (r5[r1 - 1] != 60) goto L29;
        int r0 = abcd.IK.DW(r5, r1, '>');
        if (r0 == r1) goto L29;
        if (r5[r0 - 1] != 62) goto L29;
        if (r0 == r5.length) goto L29;
        if (r5[r0] != 32) goto L29;
        int r2 = r0 + 1;
        abcd.IK.j6(r5, r2, this.EQ);
        abcd.EK r7 = this.EQ;
        int r3 = r7.j6;
        if (r2 != r3) goto L21;
        return -1;
    L21:
        if (r3 == r5.length) goto L29;
        if (r5[r3] != 32) goto L29;
        int r4 = r3 + 1;
        abcd.IK.j6(r5, r4, r7);
        int r8 = this.EQ.j6;
        if (r4 != r8) goto L28;
        return -1;
    L28:
        return r8;
    }

    private static int j6(int r1) {
        if (abcd.AbstractrE.j6.j6(r1) == false) goto L5;
        return 47;
    L5:
        return 0;
    }

    private int j6(byte[] r2, int r3) {
        this.tp.v5(r2, r3);     // Catch: java.lang.IllegalArgumentException -> L5
        return r3 + 40;
    L5:
        return -1;
    }

    private static int j6(byte[] r2, int r3, int r4, int r5, int r6, int r7, int r8) {
    L2:
        if (r3 >= r4) goto L9;
        if (r6 >= r7) goto L9;
        int r0 = r3 + 1;
        int r1 = r6 + 1;
        int r9 = (r2[r3] & 255) - (r2[r6] & 255);
        if (r9 != 0) goto L7;
        r3 = r0;
        r6 = r1;
        goto L2
    L7:
        return r9;
    L9:
        if (r3 < r4) goto L11;
        if (r6 < r7) goto L14;
        return 0;
    L14:
        return j6(r5) - (r2[r6] & 255);
    L11:
        return (r2[r3] & 255) - j6(r8);
    }

    private static boolean j6(byte[] r11, int r12, int r13) {
        int r0 = r11.length;
        int r1 = (r13 + 1) + 20;
    L3:
        int r9 = 0;
    L4:
        if (r1 >= r0) goto L5;
        int r7 = r1 + 1;
        byte r2 = r11[r1];
        if (32 == r2) goto L8;
        r9 = (r9 << 3) + (r2 - 48);
        r1 = r7;
        goto L4
    L8:
        int r3 = r7;
    L9:
        if (r3 == r0) goto L10;
        int r10 = r3 + 1;
        if (r11[r3] == 0) goto L14;
        r3 = r10;
        goto L9
    L14:
        if ((r7 + 1) == r10) goto L15;
        int r4 = j6(r11, r12, r13, abcd.AbstractrE.j6.DW(), r7, r10 - 1, r9);
        if (r4 < 0) goto L18;
        if (r4 == 0) goto L20;
        r1 = r10 + 20;
        goto L3
    L20:
        return true;
    L18:
        return false;
    L15:
        return false;
    L10:
        return false;
    L5:
        return false;
    }

    public void DW(byte[] r4) {
        int r0 = abcd.IK.j6(r4, 0, j6);
        if (r0 < 0) goto L41;
        int r1 = j6(r4, r0);
        if (r1 < 0) goto L39;
        int r2 = r1 + 1;
        if (r4[r1] != 10) goto L39;
    L9:
        if (abcd.IK.j6(r4, r2, DW) < 0) goto L10;
        int r3 = j6(r4, r2 + DW.length);
        if (r3 < 0) goto L37;
        r2 = r3 + 1;
        if (r4[r3] == 10) goto L9;
    L37:
        throw new abcd.YC("invalid parent");
    L10:
        int r5 = abcd.IK.j6(r4, r2, FH);
        if (r5 < 0) goto L30;
        int r6 = DW(r4, r5);
        if (r6 < 0) goto L28;
        int r7 = r6 + 1;
        if (r4[r6] != 10) goto L28;
        int r8 = abcd.IK.j6(r4, r7, Hw);
        if (r8 < 0) goto L26;
        int r9 = DW(r4, r8);
        if (r9 < 0) goto L24;
        if (r4[r9] != 10) goto L24;
        return;
    L24:
        throw new abcd.YC("invalid committer");
    L26:
        throw new abcd.YC("no committer");
    L28:
        throw new abcd.YC("invalid author");
    L30:
        throw new abcd.YC("no author");
    L39:
        throw new abcd.YC("invalid tree");
    L41:
        throw new abcd.YC("no tree header");
    }

    public void FH(byte[] r4) {
        int r0 = abcd.IK.j6(r4, 0, Zo);
        if (r0 < 0) goto L29;
        int r1 = j6(r4, r0);
        if (r1 < 0) goto L27;
        int r2 = r1 + 1;
        if (r4[r1] != 10) goto L27;
        int r3 = abcd.IK.j6(r4, r2, VH);
        if (r3 < 0) goto L25;
        int r5 = abcd.IK.j6(r4, abcd.IK.Zo(r4, r3), gn);
        if (r5 < 0) goto L23;
        int r6 = abcd.IK.j6(r4, abcd.IK.Zo(r4, r5), u7);
        if (r6 <= 0) goto L21;
        int r7 = DW(r4, r6);
        if (r7 < 0) goto L20;
        if (r4[r7] != 10) goto L20;
        return;
    L20:
        throw new abcd.YC("invalid tagger");
    L21:
        return;
    L23:
        throw new abcd.YC("no tag header");
    L25:
        throw new abcd.YC("no type header");
    L27:
        throw new abcd.YC("invalid object");
    L29:
        throw new abcd.YC("no object header");
    }

    public void Hw(byte[] r14) {
        int r0 = r14.length;
        int r2 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
    L3:
        if (r2 >= r0) goto L4;
        int r10 = 0;
    L6:
        if (r2 == r0) goto L69;
        int r11 = r2 + 1;
        byte r3 = r14[r2];
        if (32 == r3) goto L10;
        if (r3 < 48) goto L67;
        if (r3 > 55) goto L67;
        if (r10 != 0) goto L65;
        if (r3 != 48) goto L65;
        throw new abcd.YC("mode starts with '0'");
    L65:
        r10 = (r10 << 3) + (r3 - 48);
        r2 = r11;
    L67:
        throw new abcd.YC("invalid mode character");
    L10:
        if (abcd.AbstractrE.DW(r10).FH() == (-1)) goto L55;
        int r7 = r11;
    L12:
        if (r7 == r0) goto L53;
        int r12 = r7 + 1;
        byte r8 = r14[r7];
        if (r8 == 0) goto L15;
        if (r8 == 47) goto L51;
        r7 = r12;
        goto L12
    L51:
        throw new abcd.YC("name contains '/'");
    L15:
        int r9 = r11 + 1;
        if (r9 == r12) goto L46;
        if (r14[r11] != 46) goto L30;
        int r13 = (r12 - 1) - r11;
        if (r13 == 1) goto L29;
        if (r13 != 2) goto L30;
        if (r14[r9] != 46) goto L30;
        throw new abcd.YC("invalid name '..'");
    L29:
        throw new abcd.YC("invalid name '.'");
    L30:
        int r15 = r12 - 1;
        if (j6(r14, r11, r15) == true) goto L44;
        if (r4 != 0) goto L34;
    L38:
        int r16 = r12 + 20;
        if (r16 > r0) goto L42;
        r5 = r15;
        r2 = r16;
        r6 = r10;
        r4 = r11;
        goto L3
    L42:
        throw new abcd.YC("truncated in object id");
    L34:
        if (j6(r14, r4, r5, r6, r11, r15, r10) <= 0) goto L38;
        throw new abcd.YC("incorrectly sorted");
    L44:
        throw new abcd.YC("duplicate entry names");
    L46:
        throw new abcd.YC("zero length name");
    L53:
        throw new abcd.YC("truncated in name");
    L55:
        throw new abcd.YC("invalid mode " + r10);
    L69:
        throw new abcd.YC("truncated in mode");
    }

    public void j6(int r4, byte[] r5) {
        if (r4 != 1) goto L5;
        DW(r5);
        return;
    L5:
        if (r4 != 2) goto L7;
        Hw(r5);
        return;
    L7:
        if (r4 != 3) goto L9;
        j6(r5);
        return;
    L9:
        if (r4 != 4) goto L12;
        FH(r5);
        return;
    L12:
        throw new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().corruptObjectInvalidType2, new java.lang.Object[]{java.lang.Integer.valueOf(r4)}));
    }

    public void j6(byte[] r1) {
    }
}
