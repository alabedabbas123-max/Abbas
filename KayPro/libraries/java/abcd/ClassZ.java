package abcd;

public final class ClassZ {
    private static char[] DW;
    private static final java.lang.Object j6 = null;

    static {
        j6 = new java.lang.Object();
        DW = new char[24];
    }

    private static int j6(int r2, int r3, boolean r4, int r5) {
        if (r2 > 99) goto L22;
        if (r4 == false) goto L8;
        if (r5 >= 3) goto L22;
    L8:
        if (r2 > 9) goto L20;
        if (r4 == false) goto L12;
        if (r5 >= 2) goto L20;
    L12:
        if (r4 == true) goto L18;
        if (r2 > 0) goto L18;
        return 0;
    L18:
        return r3 + 1;
    L20:
        return r3 + 2;
    L22:
        return r3 + 3;
    }

    private static int j6(long r17, int r19) {
        long r0 = r17;
        if (DW.length >= r19) goto L5;
        DW = new char[r19];
    L5:
        char[] r3 = DW;
        if (r0 != 0) goto L13;
        int r1 = r19 - 1;
    L8:
        if (r1 <= 0) goto L10;
        r3[0] = ' ';
        goto L8
    L10:
        r3[0] = '0';
        return 1;
    L13:
        if (r0 <= 0) goto L15;
        char r5 = '+';
    L16:
        int r12 = (int) (r0 % 1000);
        int r2 = (int) java.lang.Math.floor(r0 / 1000);
        if (r2 <= 86400) goto L19;
        int r6 = r2 / 86400;
        r2 = r2 - (86400 * r6);
    L21:
        if (r2 <= 3600) goto L23;
        int r4 = r2 / 3600;
        r2 = r2 - (r4 * 3600);
    L25:
        if (r2 <= 60) goto L27;
        int r7 = r2 / 60;
        int r13 = r2 - (r7 * 60);
        int r8 = r7;
    L29:
        if (r19 == 0) goto L49;
        int r9 = j6(r6, 1, false, 0);
        if (r9 <= 0) goto L33;
        boolean r10 = true;
    L34:
        int r11 = r9 + j6(r4, 1, r10, 2);
        if (r11 <= 0) goto L37;
        boolean r14 = true;
    L38:
        int r15 = r11 + j6(r8, 1, r14, 2);
        if (r15 <= 0) goto L41;
        boolean r16 = true;
    L42:
        int r18 = r15 + j6(r13, 1, r16, 2);
        if (r18 <= 0) goto L45;
        int r20 = 3;
    L46:
        int r21 = r18 + (j6(r12, 2, true, r20) + 1);
        int r22 = 0;
    L47:
        if (r21 >= r19) goto L50;
        r3[r22] = ' ';
        r22 = r22 + 1;
        r21 = r21 + 1;
    L50:
        r3[r22] = r5;
        int r23 = r22 + 1;
        if (r19 == 0) goto L53;
        boolean r24 = true;
    L54:
        int r25 = j6(r3, r6, 'd', r23, false, 0);
        if (r25 == r23) goto L57;
        boolean r26 = true;
    L58:
        if (r24 == false) goto L60;
        int r27 = 2;
    L61:
        int r28 = j6(r3, r4, 'h', r25, r26, r27);
        if (r28 == r23) goto L64;
        boolean r29 = true;
    L65:
        if (r24 == false) goto L67;
        int r30 = 2;
    L68:
        int r31 = j6(r3, r8, 'm', r28, r29, r30);
        if (r31 == r23) goto L71;
        boolean r32 = true;
    L72:
        if (r24 == false) goto L74;
        int r33 = 2;
    L75:
        int r34 = j6(r3, r13, 's', r31, r32, r33);
        if (r24 == false) goto L79;
        if (r34 == r23) goto L79;
        int r35 = 3;
    L80:
        int r36 = j6(r3, r12, 'm', r34, true, r35);
        r3[r36] = 's';
        return r36 + 1;
    L79:
        r35 = 0;
        goto L80
    L74:
        r33 = 0;
        goto L75
    L71:
        r32 = false;
        goto L72
    L67:
        r30 = 0;
        goto L68
    L64:
        r29 = false;
        goto L65
    L60:
        r27 = 0;
        goto L61
    L57:
        r26 = false;
        goto L58
    L53:
        r24 = false;
        goto L54
    L45:
        r20 = 0;
        goto L46
    L41:
        r16 = false;
        goto L42
    L37:
        r14 = false;
        goto L38
    L33:
        r10 = false;
        goto L34
    L49:
        r22 = 0;
        goto L50
    L27:
        r13 = r2;
        r8 = 0;
        goto L29
    L23:
        r4 = 0;
        goto L25
    L19:
        r6 = 0;
        goto L21
    L15:
        r5 = '-';
        r0 = -r0;
        goto L16
    }

    private static int j6(char[] r2, int r3, char r4, int r5, boolean r6, int r7) {
        if (r6 == true) goto L4;
        if (r3 > 0) goto L4;
        return r5;
    L4:
        if (r6 == false) goto L8;
        if (r7 < 3) goto L8;
    L9:
        int r0 = r3 / 100;
        r2[r5] = (char) (r0 + 48);
        int r1 = r5 + 1;
        r3 = r3 - (r0 * 100);
    L11:
        if (r6 == false) goto L15;
        if (r7 < 2) goto L15;
    L17:
        int r8 = r3 / 10;
        r2[r1] = (char) (r8 + 48);
        r1 = r1 + 1;
        r3 = r3 - (r8 * 10);
    L18:
        r2[r1] = (char) (r3 + 48);
        int r9 = r1 + 1;
        r2[r9] = r4;
        return r9 + 1;
    L15:
        if (r3 > 9) goto L17;
        if (r5 == r1) goto L18;
    L8:
        if (r3 > 99) goto L9;
        r1 = r5;
        goto L11
    }

    public static void j6(long r3, long r5, java.io.PrintWriter r7) {
        if (r3 != 0) goto L6;
        r7.print("--");
        return;
    L6:
        j6(r3 - r5, r7, 0);
    }

    public static void j6(long r1, java.io.PrintWriter r3) {
        j6(r1, r3, 0);
    }

    public static void j6(long r2, java.io.PrintWriter r4, int r5) {
        java.lang.Object r0 = j6;
        monitor-enter(r0);
        int r3 = j6(r2, r5);     // Catch: java.lang.Throwable -> L7
        r4.print(new java.lang.String(DW, 0, r3));     // Catch: java.lang.Throwable -> L7
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
