package com.aide.engine;

@abcd.Interfacexu
public class ClassO {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -3125440392403647185L)
    private byte[][] FH;

    static {
        abcd.wu.j6(com.aide.engine.ClassO.class, 86643161135662827L, 86643161135662827L);
    }

    public ClassO() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 6569109565997957992L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(6569109565997957992L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = (byte[][]) java.lang.reflect.Array.newInstance(byte.class, new int[]{100, 5});     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -46299104196005680L)
    private int DW(int r8) {
    L20:
        th = move-exception;
        if (DW == false) goto L25;
        abcd.wu.j6(th, 8247287251512644319L, this, new java.lang.Integer(r8));
    L25:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(8247287251512644319L, this, r8);     // Catch: java.lang.Throwable -> L20
    L7:
        if (r8 < this.FH.length) goto L9;
        return 0;
    L9:
        byte[] r2 = this.FH[r8];     // Catch: java.lang.Throwable -> L20
        if (r2.length != 0) goto L12;
        return 0;
    L12:
        byte r4 = r2[r2.length - 1];     // Catch: java.lang.Throwable -> L20
        int r5 = r2.length - 2;     // Catch: java.lang.Throwable -> L20
    L13:
        if (r5 < 0) goto L19;
        if (r2[r5] != r4) goto L17;
        r5 = r5 - 1;
        goto L13
    L17:
        return r5 + 2;
    L19:
        return 0;
    }

    @abcd.Interfacesu(method = 2012375522450652096L)
    private void FH(int r8, int r9) {
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -4076305448697781553L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L21:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-4076305448697781553L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L16
    L5:
        int r1 = r8 + 2;     // Catch: java.lang.Throwable -> L16
        if (this.FH.length > r1) goto L8;
        return;
    L8:
        int r2 = r8 + 1;     // Catch: java.lang.Throwable -> L16
        java.lang.System.arraycopy(this.FH, r2, this.FH, r1, (this.FH.length - r8) - 2);     // Catch: java.lang.Throwable -> L16
        byte[] r0 = this.FH[r8];     // Catch: java.lang.Throwable -> L16
        byte[] r3 = new byte[r0.length];     // Catch: java.lang.Throwable -> L16
        this.FH[r2] = r3;     // Catch: java.lang.Throwable -> L16
        if (r0.length <= r9) goto L15;
        byte r4 = r0[r9];     // Catch: java.lang.Throwable -> L16
        int r5 = r9;
        int r6 = 0;
    L11:
        if (r5 >= r0.length) goto L26;
        r3[r6] = r0[r5];     // Catch: java.lang.Throwable -> L16
        r0[r5] = r4;     // Catch: java.lang.Throwable -> L16
        r5 = r5 + 1;
        r6 = r6 + 1;
        goto L11
    L26:
        return;
    }

    @abcd.Interfacesu(method = 1621775776487089755L)
    private void j6(int r9, int r10, int r11) {
    L38:
        th = move-exception;
        if (DW == false) goto L43;
        abcd.wu.j6(th, -2449270981601921400L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
    L43:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2449270981601921400L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L38
    L5:
        if (r11 != 0) goto L8;
        return;
    L8:
        if (this.FH.length > r9) goto L10;
        return;
    L10:
        int r0 = DW(r9);     // Catch: java.lang.Throwable -> L38
        if (r0 > r10) goto L14;
        return;
    L14:
        if ((r0 - 1) != r10) goto L20;
        if (r10 <= 0) goto L20;
        j6(r9, r0 + 1);     // Catch: java.lang.Throwable -> L38
        byte[] r1 = this.FH[r9];     // Catch: java.lang.Throwable -> L38
        byte r2 = r1[r10 - 1];     // Catch: java.lang.Throwable -> L38
        if (r2 != (com.aide.engine.Enumm.EQ.ordinal() + 1)) goto L20;
        r1[r10] = r2;     // Catch: java.lang.Throwable -> L38
        return;
    L20:
        j6(r9, r0 + r11);     // Catch: java.lang.Throwable -> L38
        byte[] r3 = this.FH[r9];     // Catch: java.lang.Throwable -> L38
        int r4 = r10 + r11;     // Catch: java.lang.Throwable -> L38
        java.lang.System.arraycopy(r3, r10, r3, r4, (r3.length - r10) - r11);     // Catch: java.lang.Throwable -> L38
        byte r5 = 0;
        if (r10 <= 0) goto L23;
        byte r6 = r3[r10 - 1];     // Catch: java.lang.Throwable -> L38
    L24:
        byte r7 = r3[r10];     // Catch: java.lang.Throwable -> L38
        if (r7 < (com.aide.engine.Enumm.J8.ordinal() + 1)) goto L27;
        r5 = (byte) (com.aide.engine.Enumm.J8.ordinal() + 1);     // Catch: java.lang.Throwable -> L38
    L27:
        if (r6 == r7) goto L29;
    L33:
        int r8 = r10;
    L34:
        if (r8 >= r4) goto L37;
        r3[r8] = r5;     // Catch: java.lang.Throwable -> L38
        r8 = r8 + 1;
        goto L34
    L37:
        return;
    L29:
        if (r6 == (com.aide.engine.Enumm.VH.ordinal() + 1)) goto L33;
        if (r6 == (com.aide.engine.Enumm.gn.ordinal() + 1)) goto L33;
        r5 = r6;
        goto L33
    L23:
        r6 = 0;
        goto L24
    }

    public byte DW(int r8, int r9) {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 1088747195166121255L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L19:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(1088747195166121255L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L15
    L6:
        if (r8 < this.FH.length) goto L9;
        return 0;
    L9:
        byte[] r0 = this.FH[r8];     // Catch: java.lang.Throwable -> L15
        if (r9 < r0.length) goto L14;
        return r0[r0.length - 1];
    L14:
        return r0[r9];
    }

    public void DW(int r10, int r11, int r12, int r13) {
    L26:
        th = move-exception;
        if (DW == false) goto L31;
        abcd.wu.j6(th, 1096984178575092096L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L31:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1096984178575092096L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L26
    L5:
        if (r10 != r12) goto L12;
        if (r10 >= this.FH.length) goto L25;
        byte[] r0 = this.FH[r10];     // Catch: java.lang.Throwable -> L26
        int r1 = r13 + 1;     // Catch: java.lang.Throwable -> L26
        if (r1 >= r0.length) goto L37;
        java.lang.System.arraycopy(r0, r1, r0, r11, (r0.length - r13) - 1);     // Catch: java.lang.Throwable -> L26
        return;
    L37:
        return;
    L25:
        return;
    L12:
        if (r12 >= this.FH.length) goto L19;
        j6(r10, DW(r10) + DW(r12));     // Catch: java.lang.Throwable -> L26
        byte[] r2 = this.FH[r10];     // Catch: java.lang.Throwable -> L26
        byte[] r3 = this.FH[r12];     // Catch: java.lang.Throwable -> L26
        int r4 = r13 + 1;     // Catch: java.lang.Throwable -> L26
        int r5 = r11;
    L15:
        if (r4 >= r3.length) goto L19;
        if (r5 >= r2.length) goto L19;
        r2[r5] = r3[r4];     // Catch: java.lang.Throwable -> L26
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L26
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L26
    L19:
        int r6 = r12 + 1;     // Catch: java.lang.Throwable -> L26
        if (r6 >= this.FH.length) goto L39;
        java.lang.System.arraycopy(this.FH, r6, this.FH, r10 + 1, (this.FH.length - r12) - 2);     // Catch: java.lang.Throwable -> L26
        int r7 = r12 - r10;     // Catch: java.lang.Throwable -> L26
        int r8 = 0;
    L22:
        if (r8 >= r7) goto L40;
        this.FH[(this.FH.length - r8) - 1] = new byte[5];     // Catch: java.lang.Throwable -> L26
        r8 = r8 + 1;
        goto L22
    L40:
        return;
    }

    public void j6() {
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, 2280343542653472000L, this);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2280343542653472000L, this);     // Catch: java.lang.Throwable -> L16
    L6:
        int r3 = 0;
    L7:
        if (r3 >= this.FH.length) goto L15;
        byte[] r4 = this.FH[r3];     // Catch: java.lang.Throwable -> L16
        int r5 = 0;
    L11:
        if (r5 >= r4.length) goto L14;
        r4[r5] = 0;     // Catch: java.lang.Throwable -> L16
        r5 = r5 + 1;
        goto L11
    L14:
        r3 = r3 + 1;
        goto L7
    }

    public void j6(byte r11, int r12, int r13, int r14, int r15) {
    L41:
        th = move-exception;
        if (DW == false) goto L46;
        abcd.wu.j6(th, 5570115083346327700L, this, new java.lang.Byte(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
    L46:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(5570115083346327700L, this, new java.lang.Byte(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));     // Catch: java.lang.Throwable -> L41
    L5:
        if (r12 != r14) goto L13;
        j6(r14, r15 + 1);     // Catch: java.lang.Throwable -> L41
        byte[] r0 = this.FH[r14];     // Catch: java.lang.Throwable -> L41
        int r1 = r13;
    L7:
        if (r1 > r15) goto L40;
        if (r0[r1] < (com.aide.engine.Enumm.J8.ordinal() + 1)) goto L11;
        r0[r1] = (byte) (com.aide.engine.Enumm.values().length + r11);     // Catch: java.lang.Throwable -> L41
    L12:
        r1 = r1 + 1;     // Catch: java.lang.Throwable -> L41
        goto L7
    L11:
        r0[r1] = r11;     // Catch: java.lang.Throwable -> L41
        goto L12
    L40:
        return;
    L13:
        j6(r12, r13 + 1);     // Catch: java.lang.Throwable -> L41
        j6(r14, r15 + 1);     // Catch: java.lang.Throwable -> L41
        byte[] r2 = this.FH[r12];     // Catch: java.lang.Throwable -> L41
        int r3 = r13;
    L15:
        if (r3 >= r2.length) goto L21;
        if (r2[r3] < (com.aide.engine.Enumm.J8.ordinal() + 1)) goto L19;
        r2[r3] = (byte) (com.aide.engine.Enumm.values().length + r11);     // Catch: java.lang.Throwable -> L41
    L20:
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L41
        goto L15
    L19:
        r2[r3] = r11;     // Catch: java.lang.Throwable -> L41
        goto L20
    L21:
        int r4 = r12 + 1;     // Catch: java.lang.Throwable -> L41
    L22:
        int r5 = 0;
        if (r4 >= r14) goto L33;
        byte[] r6 = this.FH[r4];     // Catch: java.lang.Throwable -> L41
    L26:
        if (r5 >= r6.length) goto L32;
        if (r6[r5] < (com.aide.engine.Enumm.J8.ordinal() + 1)) goto L30;
        r6[r5] = (byte) (com.aide.engine.Enumm.values().length + r11);     // Catch: java.lang.Throwable -> L41
    L31:
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L41
        goto L26
    L30:
        r6[r5] = r11;     // Catch: java.lang.Throwable -> L41
        goto L31
    L32:
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L41
        goto L22
    L33:
        byte[] r7 = this.FH[r14];     // Catch: java.lang.Throwable -> L41
    L34:
        if (r5 > r15) goto L62;
        if (r7[r5] < (com.aide.engine.Enumm.J8.ordinal() + 1)) goto L38;
        r7[r5] = (byte) (com.aide.engine.Enumm.values().length + r11);     // Catch: java.lang.Throwable -> L41
    L39:
        r5 = r5 + 1;
        goto L34
    L38:
        r7[r5] = r11;     // Catch: java.lang.Throwable -> L41
        goto L39
    }

    public void j6(int r7) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -1263917484823256991L, this, new java.lang.Integer(r7));
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1263917484823256991L, this, r7);     // Catch: java.lang.Throwable -> L10
    L7:
        if (this.FH.length > r7) goto L17;
        byte[][] r2 = (byte[][]) java.lang.reflect.Array.newInstance(byte.class, new int[]{(r7 * 5) / 4, 5});     // Catch: java.lang.Throwable -> L10
        java.lang.System.arraycopy(this.FH, 0, r2, 0, this.FH.length);     // Catch: java.lang.Throwable -> L10
        this.FH = r2;     // Catch: java.lang.Throwable -> L10
        return;
    }

    public void j6(int r8, int r9) {
    L13:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -1700323982822110464L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L18:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1700323982822110464L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L13
    L5:
        j6(r8);     // Catch: java.lang.Throwable -> L13
        byte[] r0 = this.FH[r8];     // Catch: java.lang.Throwable -> L13
        if (r0.length > r9) goto L12;
        byte r1 = r0[r0.length - 1];     // Catch: java.lang.Throwable -> L13
        byte[] r2 = new byte[((r9 * 5) / 4) + 1];     // Catch: java.lang.Throwable -> L13
        java.lang.System.arraycopy(r0, 0, r2, 0, r0.length);     // Catch: java.lang.Throwable -> L13
        this.FH[r8] = r2;     // Catch: java.lang.Throwable -> L13
        int r3 = r0.length;     // Catch: java.lang.Throwable -> L13
    L8:
        if (r3 >= r2.length) goto L23;
        r2[r3] = r1;     // Catch: java.lang.Throwable -> L13
        r3 = r3 + 1;
        goto L8
    L23:
        return;
    }

    public void j6(int r10, int r11, int r12, int r13) {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -1675067388582708999L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L17:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1675067388582708999L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L12
    L5:
        if (r10 != r12) goto L7;
        j6(r10, r11, (r13 - r11) + 1);     // Catch: java.lang.Throwable -> L12
        return;
    L7:
        int r0 = r10;
    L8:
        if (r0 >= r12) goto L10;
        FH(r10, r11);     // Catch: java.lang.Throwable -> L12
        r0 = r0 + 1;     // Catch: java.lang.Throwable -> L12
        goto L8
    L10:
        j6(r12, 0, r13 + 1);     // Catch: java.lang.Throwable -> L12
    }

    public void j6(int r9, com.aide.engine.ClassO r10, int r11) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 2959760420785071920L, this, new java.lang.Integer(r9), r10, new java.lang.Integer(r11));
    L14:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(2959760420785071920L, this, new java.lang.Integer(r9), r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L10
    L6:
        if (r10.FH.length > r11) goto L8;
        return;
    L8:
        j6(r9);     // Catch: java.lang.Throwable -> L10
        byte[] r0 = new byte[r10.FH[r11].length];     // Catch: java.lang.Throwable -> L10
        java.lang.System.arraycopy(r10.FH[r11], 0, r0, 0, r0.length);     // Catch: java.lang.Throwable -> L10
        this.FH[r9] = r0;     // Catch: java.lang.Throwable -> L10
    }

    public void j6(com.aide.engine.Enumm[] r10, int[] r11, int[] r12, int[] r13, int[] r14, int r15) {
        if (j6 == false) goto L5;
        abcd.wu.j6(-644325777124863017L, this, new java.lang.Object[]{r10, r11, r12, r13, r14, new java.lang.Integer(r15)});
    L5:
        j6();
        int r16 = r15 - 1;
    L6:
        if (r16 < 0) goto L11;
        if (r10[r16] == null) goto L10;
        j6((byte) r10[r16].ordinal(), r11[r16] - 1, r12[r16] - 1, r13[r16] - 1, r14[r16] - 2);
    L10:
        r16 = r16 - 1;
        goto L6
    }
}
