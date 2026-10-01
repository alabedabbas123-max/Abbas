package com.crashlytics.android.core;

class Na {
    private static final com.crashlytics.android.core.ClassD DW = null;
    private static final com.crashlytics.android.core.ClassD j6 = null;

    static {
        j6 = com.crashlytics.android.core.ClassD.j6("0");
        DW = com.crashlytics.android.core.ClassD.j6("Unity");
    }

    private static int DW(com.crashlytics.android.core.ClassD r1) {
        return com.crashlytics.android.core.ClassH.j6(1, r1) + 0;
    }

    private static int j6() {
        return ((com.crashlytics.android.core.ClassH.j6(1, j6) + 0) + com.crashlytics.android.core.ClassH.j6(2, j6)) + com.crashlytics.android.core.ClassH.j6(3, 0);
    }

    private static int j6(int r2, com.crashlytics.android.core.ClassD r3, int r4, long r5, long r7, boolean r9, java.util.Map<io.fabric.sdk.android.services.common.v.a, java.lang.String> r10, int r11, com.crashlytics.android.core.ClassD r12, com.crashlytics.android.core.ClassD r13) {
        int r0 = 0;
        int r6 = com.crashlytics.android.core.ClassH.j6(3, r2) + 0;
        if (r3 != null) goto L5;
        int r8 = 0;
    L6:
        int r14 = ((((r6 + r8) + com.crashlytics.android.core.ClassH.FH(5, r4)) + com.crashlytics.android.core.ClassH.j6(6, r5)) + com.crashlytics.android.core.ClassH.j6(7, r7)) + com.crashlytics.android.core.ClassH.j6(10, r9);
        if (r10 == null) goto L12;
        java.util.Iterator<java.util.Map.Entry<io.fabric.sdk.android.services.common.v.a, java.lang.String>> r15 = r10.entrySet().iterator();
    L10:
        if (r15.hasNext() == false) goto L12;
        java.util.Map.Entry<io.fabric.sdk.android.services.common.v.a, java.lang.String> r16 = r15.next();
        int r17 = j6(r16.getKey(), r16.getValue());
        r14 = r14 + ((com.crashlytics.android.core.ClassH.v5(11) + com.crashlytics.android.core.ClassH.FH(r17)) + r17);
    L12:
        int r18 = r14 + com.crashlytics.android.core.ClassH.FH(12, r11);
        if (r12 != null) goto L15;
        int r19 = 0;
    L16:
        int r20 = r18 + r19;
        if (r13 == null) goto L21;
        r0 = com.crashlytics.android.core.ClassH.j6(14, r13);
    L21:
        return r20 + r0;
    L15:
        r19 = com.crashlytics.android.core.ClassH.j6(13, r12);
        goto L16
    L5:
        r8 = com.crashlytics.android.core.ClassH.j6(4, r3);
        goto L6
    }

    private static int j6(long r12, java.lang.String r14, com.crashlytics.android.core.Ra r15, java.lang.Thread r16, java.lang.StackTraceElement[] r17, java.lang.Thread[] r18, java.util.List<java.lang.StackTraceElement[]> r19, int r20, java.util.Map<java.lang.String, java.lang.String> r21, android.app.ActivityManager.RunningAppProcessInfo r22, int r23, com.crashlytics.android.core.ClassD r24, com.crashlytics.android.core.ClassD r25, java.lang.Float r26, int r27, boolean r28, long r29, long r31, com.crashlytics.android.core.ClassD r33) {
        int r0 = (com.crashlytics.android.core.ClassH.j6(1, r12) + 0) + com.crashlytics.android.core.ClassH.j6(2, com.crashlytics.android.core.ClassD.j6(r14));
        int r1 = j6(r15, r16, r17, r18, r19, r20, r24, r25, r21, r22, r23);
        int r2 = r0 + ((com.crashlytics.android.core.ClassH.v5(3) + com.crashlytics.android.core.ClassH.FH(r1)) + r1);
        int r3 = j6(r26, r27, r28, r23, r29, r31);
        int r4 = r2 + ((com.crashlytics.android.core.ClassH.v5(5) + com.crashlytics.android.core.ClassH.FH(r3)) + r3);
        if (r33 == null) goto L6;
        int r5 = j6(r33);
        return r4 + ((com.crashlytics.android.core.ClassH.v5(6) + com.crashlytics.android.core.ClassH.FH(r5)) + r5);
    L6:
        return r4;
    }

    private static int j6(com.crashlytics.android.core.Ra r9, int r10, int r11) {
        int r2 = 0;
        int r0 = com.crashlytics.android.core.ClassH.j6(1, com.crashlytics.android.core.ClassD.j6(r9.DW)) + 0;
        java.lang.String r3 = r9.j6;
        if (r3 == null) goto L5;
        r0 = r0 + com.crashlytics.android.core.ClassH.j6(3, com.crashlytics.android.core.ClassD.j6(r3));
    L5:
        java.lang.StackTraceElement[] r4 = r9.FH;
        int r5 = r4.length;
        int r6 = r0;
        int r1 = 0;
    L6:
        if (r1 >= r5) goto L8;
        int r7 = j6(r4[r1], true);
        r6 = r6 + ((com.crashlytics.android.core.ClassH.v5(4) + com.crashlytics.android.core.ClassH.FH(r7)) + r7);
        r1 = r1 + 1;
        goto L6
    L8:
        com.crashlytics.android.core.Ra r12 = r9.Hw;
        if (r12 == null) goto L18;
        if (r10 >= r11) goto L12;
        int r13 = j6(r12, r10 + 1, r11);
        return r6 + ((com.crashlytics.android.core.ClassH.v5(6) + com.crashlytics.android.core.ClassH.FH(r13)) + r13);
    L12:
        if (r12 == null) goto L15;
        r12 = r12.Hw;
        r2 = r2 + 1;
        goto L12
    L15:
        return r6 + com.crashlytics.android.core.ClassH.FH(7, r2);
    L18:
        return r6;
    }

    private static int j6(com.crashlytics.android.core.Ra r6, java.lang.Thread r7, java.lang.StackTraceElement[] r8, java.lang.Thread[] r9, java.util.List<java.lang.StackTraceElement[]> r10, int r11, com.crashlytics.android.core.ClassD r12, com.crashlytics.android.core.ClassD r13) {
        int r14 = j6(r7, r8, 4, true);
        int r15 = ((com.crashlytics.android.core.ClassH.v5(1) + com.crashlytics.android.core.ClassH.FH(r14)) + r14) + 0;
        int r1 = r9.length;
        int r2 = r15;
        int r16 = 0;
    L3:
        if (r16 >= r1) goto L5;
        int r3 = j6(r9[r16], r10.get(r16), 0, false);
        r2 = r2 + ((com.crashlytics.android.core.ClassH.v5(1) + com.crashlytics.android.core.ClassH.FH(r3)) + r3);
        r16 = r16 + 1;
        goto L3
    L5:
        int r17 = j6(r6, 1, r11);
        int r4 = r2 + ((com.crashlytics.android.core.ClassH.v5(2) + com.crashlytics.android.core.ClassH.FH(r17)) + r17);
        int r18 = j6();
        int r5 = r4 + ((com.crashlytics.android.core.ClassH.v5(3) + com.crashlytics.android.core.ClassH.FH(r18)) + r18);
        int r19 = j6(r12, r13);
        return r5 + ((com.crashlytics.android.core.ClassH.v5(3) + com.crashlytics.android.core.ClassH.FH(r19)) + r19);
    }

    private static int j6(com.crashlytics.android.core.Ra r0, java.lang.Thread r1, java.lang.StackTraceElement[] r2, java.lang.Thread[] r3, java.util.List<java.lang.StackTraceElement[]> r4, int r5, com.crashlytics.android.core.ClassD r6, com.crashlytics.android.core.ClassD r7, java.util.Map<java.lang.String, java.lang.String> r8, android.app.ActivityManager.RunningAppProcessInfo r9, int r10) {
        int r11 = j6(r0, r1, r2, r3, r4, r5, r6, r7);
        int r12 = (com.crashlytics.android.core.ClassH.v5(1) + com.crashlytics.android.core.ClassH.FH(r11)) + r11;
        boolean r13 = false;
        int r14 = r12 + 0;
        if (r8 == null) goto L8;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> r15 = r8.entrySet().iterator();
    L6:
        if (r15.hasNext() == false) goto L8;
        java.util.Map.Entry<java.lang.String, java.lang.String> r16 = r15.next();
        int r17 = j6(r16.getKey(), r16.getValue());
        r14 = r14 + ((com.crashlytics.android.core.ClassH.v5(2) + com.crashlytics.android.core.ClassH.FH(r17)) + r17);
    L8:
        if (r9 == null) goto L14;
        if (r9.importance == 100) goto L12;
        r13 = true;
    L12:
        r14 = r14 + com.crashlytics.android.core.ClassH.j6(3, r13);
    L14:
        return r14 + com.crashlytics.android.core.ClassH.FH(4, r10);
    }

    private static int j6(com.crashlytics.android.core.ClassD r1) {
        return com.crashlytics.android.core.ClassH.j6(1, r1);
    }

    private static int j6(com.crashlytics.android.core.ClassD r4, com.crashlytics.android.core.ClassD r5) {
        int r2 = ((com.crashlytics.android.core.ClassH.j6(1, 0) + 0) + com.crashlytics.android.core.ClassH.j6(2, 0)) + com.crashlytics.android.core.ClassH.j6(3, r4);
        if (r5 != null) goto L5;
        return r2;
    L5:
        return r2 + com.crashlytics.android.core.ClassH.j6(4, r5);
    }

    private static int j6(com.crashlytics.android.core.ClassD r1, com.crashlytics.android.core.ClassD r2, com.crashlytics.android.core.ClassD r3, com.crashlytics.android.core.ClassD r4, com.crashlytics.android.core.ClassD r5, int r6, com.crashlytics.android.core.ClassD r7) {
        int r8 = ((com.crashlytics.android.core.ClassH.j6(1, r1) + 0) + com.crashlytics.android.core.ClassH.j6(2, r3)) + com.crashlytics.android.core.ClassH.j6(3, r4);
        int r9 = DW(r2);
        int r10 = (r8 + ((com.crashlytics.android.core.ClassH.v5(5) + com.crashlytics.android.core.ClassH.FH(r9)) + r9)) + com.crashlytics.android.core.ClassH.j6(6, r5);
        if (r7 == null) goto L6;
        r10 = (r10 + com.crashlytics.android.core.ClassH.j6(8, DW)) + com.crashlytics.android.core.ClassH.j6(9, r7);
    L6:
        return r10 + com.crashlytics.android.core.ClassH.j6(10, r6);
    }

    private static int j6(com.crashlytics.android.core.ClassD r3, com.crashlytics.android.core.ClassD r4, boolean r5) {
        return (((com.crashlytics.android.core.ClassH.j6(1, 3) + 0) + com.crashlytics.android.core.ClassH.j6(2, r3)) + com.crashlytics.android.core.ClassH.j6(3, r4)) + com.crashlytics.android.core.ClassH.j6(4, r5);
    }

    private static int j6(io.fabric.sdk.android.services.common.v.a r1, java.lang.String r2) {
        return com.crashlytics.android.core.ClassH.j6(1, r1.u7) + com.crashlytics.android.core.ClassH.j6(2, com.crashlytics.android.core.ClassD.j6(r2));
    }

    private static int j6(java.lang.Float r2, int r3, boolean r4, int r5, long r6, long r8) {
        int r0 = 0;
        if (r2 == null) goto L6;
        r0 = 0 + com.crashlytics.android.core.ClassH.j6(1, r2.floatValue());
    L6:
        return ((((r0 + com.crashlytics.android.core.ClassH.DW(2, r3)) + com.crashlytics.android.core.ClassH.j6(3, r4)) + com.crashlytics.android.core.ClassH.FH(4, r5)) + com.crashlytics.android.core.ClassH.j6(5, r6)) + com.crashlytics.android.core.ClassH.j6(6, r8);
    }

    private static int j6(java.lang.StackTraceElement r6, boolean r7) {
        int r2 = 0;
        if (r6.isNativeMethod() == false) goto L5;
        int r0 = com.crashlytics.android.core.ClassH.j6(1, java.lang.Math.max(r6.getLineNumber(), 0));
    L6:
        int r1 = (r0 + 0) + com.crashlytics.android.core.ClassH.j6(2, com.crashlytics.android.core.ClassD.j6(r6.getClassName() + "." + r6.getMethodName()));
        if (r6.getFileName() == null) goto L10;
        r1 = r1 + com.crashlytics.android.core.ClassH.j6(3, com.crashlytics.android.core.ClassD.j6(r6.getFileName()));
    L10:
        if (r6.isNativeMethod() == true) goto L15;
        if (r6.getLineNumber() <= 0) goto L15;
        r1 = r1 + com.crashlytics.android.core.ClassH.j6(4, r6.getLineNumber());
    L15:
        if (r7 == false) goto L18;
        r2 = 2;
    L18:
        return r1 + com.crashlytics.android.core.ClassH.FH(5, r2);
    L5:
        r0 = com.crashlytics.android.core.ClassH.j6(1, 0);
        goto L6
    }

    private static int j6(java.lang.String r1, java.lang.String r2) {
        int r3 = com.crashlytics.android.core.ClassH.j6(1, com.crashlytics.android.core.ClassD.j6(r1));
        if (r2 != null) goto L6;
        r2 = "";
    L6:
        return r3 + com.crashlytics.android.core.ClassH.j6(2, com.crashlytics.android.core.ClassD.j6(r2));
    }

    private static int j6(java.lang.Thread r4, java.lang.StackTraceElement[] r5, int r6, boolean r7) {
        int r8 = com.crashlytics.android.core.ClassH.j6(1, com.crashlytics.android.core.ClassD.j6(r4.getName())) + com.crashlytics.android.core.ClassH.FH(2, r6);
        int r9 = r5.length;
        int r0 = 0;
    L3:
        if (r0 >= r9) goto L5;
        int r1 = j6(r5[r0], r7);
        r8 = r8 + ((com.crashlytics.android.core.ClassH.v5(3) + com.crashlytics.android.core.ClassH.FH(r1)) + r1);
        r0 = r0 + 1;
        goto L3
    L5:
        return r8;
    }

    private static com.crashlytics.android.core.ClassD j6(java.lang.String r0) {
        if (r0 != null) goto L5;
        return null;
    L5:
        return com.crashlytics.android.core.ClassD.j6(r0);
    }

    private static void j6(com.crashlytics.android.core.ClassH r5, int r6, java.lang.StackTraceElement r7, boolean r8) {
        r5.Zo(r6, 2);
        r5.we(j6(r7, r8));
        if (r7.isNativeMethod() == false) goto L5;
        r5.DW(1, java.lang.Math.max(r7.getLineNumber(), 0));
    L6:
        r5.DW(2, com.crashlytics.android.core.ClassD.j6(r7.getClassName() + "." + r7.getMethodName()));
        if (r7.getFileName() == null) goto L9;
        r5.DW(3, com.crashlytics.android.core.ClassD.j6(r7.getFileName()));
    L9:
        int r0 = 4;
        if (r7.isNativeMethod() == true) goto L15;
        if (r7.getLineNumber() <= 0) goto L15;
        r5.DW(4, r7.getLineNumber());
    L15:
        if (r8 == true) goto L18;
        r0 = 0;
    L18:
        r5.VH(5, r0);
        return;
    L5:
        r5.DW(1, 0);
        goto L6
    }

    public static void j6(com.crashlytics.android.core.ClassH r16, int r17, java.lang.String r18, int r19, long r20, long r22, boolean r24, java.util.Map<io.fabric.sdk.android.services.common.v.a, java.lang.String> r25, int r26, java.lang.String r27, java.lang.String r28) {
        com.crashlytics.android.core.ClassD r13 = j6(r18);
        com.crashlytics.android.core.ClassD r14 = j6(r28);
        com.crashlytics.android.core.ClassD r15 = j6(r27);
        r16.Zo(9, 2);
        r16.we(j6(r17, r13, r19, r20, r22, r24, r25, r26, r15, r14));
        r16.Hw(3, r17);
        r16.DW(4, r13);
        r16.VH(5, r19);
        r16.DW(6, r20);
        r16.DW(7, r22);
        r16.DW(10, r24);
        java.util.Iterator<java.util.Map.Entry<io.fabric.sdk.android.services.common.v.a, java.lang.String>> r1 = r25.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        java.util.Map.Entry<io.fabric.sdk.android.services.common.v.a, java.lang.String> r2 = r1.next();
        r16.Zo(11, 2);
        r16.we(j6(r2.getKey(), r2.getValue()));
        r16.Hw(1, r2.getKey().u7);
        r16.DW(2, com.crashlytics.android.core.ClassD.j6(r2.getValue()));
        goto L4
    L6:
        r16.VH(12, r26);
        if (r15 == null) goto L9;
        r16.DW(13, r15);
    L9:
        if (r14 == null) goto L13;
        r16.DW(14, r14);
        return;
    }

    public static void j6(com.crashlytics.android.core.ClassH r35, long r36, java.lang.String r38, com.crashlytics.android.core.Ra r39, java.lang.Thread r40, java.lang.StackTraceElement[] r41, java.lang.Thread[] r42, java.util.List<java.lang.StackTraceElement[]> r43, java.util.Map<java.lang.String, java.lang.String> r44, com.crashlytics.android.core.ua r45, android.app.ActivityManager.RunningAppProcessInfo r46, int r47, java.lang.String r48, java.lang.String r49, java.lang.Float r50, int r51, boolean r52, long r53, long r55) {
        com.crashlytics.android.core.ClassD r7 = com.crashlytics.android.core.ClassD.j6(r48);
        if (r49 != null) goto L5;
        com.crashlytics.android.core.ClassD r0 = null;
    L6:
        com.crashlytics.android.core.ClassD r8 = r0;
        com.crashlytics.android.core.ClassD r11 = r45.DW();
        if (r11 != null) goto L9;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "No log data to include with this event.");
    L9:
        r45.j6();
        r35.Zo(10, 2);
        r35.we(j6(r36, r38, r39, r40, r41, r42, r43, 8, r44, r46, r47, r7, r8, r50, r51, r52, r53, r55, r11));
        r35.DW(1, r36);
        r35.DW(2, com.crashlytics.android.core.ClassD.j6(r38));
        j6(r35, r39, r40, r41, r42, r43, 8, r7, r8, r44, r46, r47);
        j6(r35, r50, r51, r52, r47, r53, r55);
        j6(r35, r11);
        return;
    L5:
        r0 = com.crashlytics.android.core.ClassD.j6(r49.replace("-", ""));
        goto L6
    }

    private static void j6(com.crashlytics.android.core.ClassH r6, com.crashlytics.android.core.Ra r7, int r8, int r9, int r10) {
        r6.Zo(r10, 2);
        r6.we(j6(r7, 1, r9));
        r6.DW(1, com.crashlytics.android.core.ClassD.j6(r7.DW));
        java.lang.String r0 = r7.j6;
        if (r0 == null) goto L5;
        r6.DW(3, com.crashlytics.android.core.ClassD.j6(r0));
    L5:
        java.lang.StackTraceElement[] r1 = r7.FH;
        int r2 = r1.length;
        int r3 = 0;
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L8;
        j6(r6, 4, r1[r4], true);
        r4 = r4 + 1;
        goto L6
    L8:
        com.crashlytics.android.core.Ra r11 = r7.Hw;
        if (r11 == null) goto L18;
        if (r8 >= r9) goto L12;
        j6(r6, r11, r8 + 1, r9, 6);
        return;
    L12:
        if (r11 == null) goto L14;
        r11 = r11.Hw;
        r3 = r3 + 1;
        goto L12
    L14:
        r6.VH(7, r3);
        return;
    }

    private static void j6(com.crashlytics.android.core.ClassH r6, com.crashlytics.android.core.Ra r7, java.lang.Thread r8, java.lang.StackTraceElement[] r9, java.lang.Thread[] r10, java.util.List<java.lang.StackTraceElement[]> r11, int r12, com.crashlytics.android.core.ClassD r13, com.crashlytics.android.core.ClassD r14) {
        r6.Zo(1, 2);
        r6.we(j6(r7, r8, r9, r10, r11, r12, r13, r14));
        j6(r6, r8, r9, 4, true);
        int r15 = r10.length;
        int r3 = 0;
    L3:
        if (r3 >= r15) goto L5;
        j6(r6, r10[r3], r11.get(r3), 0, false);
        r3 = r3 + 1;
        goto L3
    L5:
        j6(r6, r7, 1, r12, 2);
        r6.Zo(3, 2);
        r6.we(j6());
        r6.DW(1, j6);
        r6.DW(2, j6);
        r6.DW(3, 0);
        r6.Zo(4, 2);
        r6.we(j6(r13, r14));
        r6.DW(1, 0);
        r6.DW(2, 0);
        r6.DW(3, r13);
        if (r14 == null) goto L10;
        r6.DW(4, r14);
        return;
    }

    private static void j6(com.crashlytics.android.core.ClassH r2, com.crashlytics.android.core.Ra r3, java.lang.Thread r4, java.lang.StackTraceElement[] r5, java.lang.Thread[] r6, java.util.List<java.lang.StackTraceElement[]> r7, int r8, com.crashlytics.android.core.ClassD r9, com.crashlytics.android.core.ClassD r10, java.util.Map<java.lang.String, java.lang.String> r11, android.app.ActivityManager.RunningAppProcessInfo r12, int r13) {
        r2.Zo(3, 2);
        r2.we(j6(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13));
        j6(r2, r3, r4, r5, r6, r7, r8, r9, r10);
        if (r11 != null) goto L5;
    L7:
        if (r12 != null) goto L9;
    L13:
        r2.VH(4, r13);
        return;
    L9:
        if (r12.importance == 100) goto L11;
        boolean r14 = true;
    L12:
        r2.DW(3, r14);
        goto L13
    L11:
        r14 = false;
        goto L12
    L5:
        if (r11.isEmpty() == true) goto L7;
        j6(r2, r11);
        goto L7
    }

    private static void j6(com.crashlytics.android.core.ClassH r2, com.crashlytics.android.core.ClassD r3) {
        if (r3 == null) goto L5;
        r2.Zo(6, 2);
        r2.we(j6(r3));
        r2.DW(1, r3);
        return;
    }

    private static void j6(com.crashlytics.android.core.ClassH r3, java.lang.Float r4, int r5, boolean r6, int r7, long r8, long r10) {
        r3.Zo(5, 2);
        r3.we(j6(r4, r5, r6, r7, r8, r10));
        if (r4 == null) goto L5;
        r3.DW(1, r4.floatValue());
    L5:
        r3.v5(2, r5);
        r3.DW(3, r6);
        r3.VH(4, r7);
        r3.DW(5, r8);
        r3.DW(6, r10);
    }

    public static void j6(com.crashlytics.android.core.ClassH r1, java.lang.String r2, java.lang.String r3, long r4) {
        r1.DW(1, com.crashlytics.android.core.ClassD.j6(r3));
        r1.DW(2, com.crashlytics.android.core.ClassD.j6(r2));
        r1.DW(3, r4);
    }

    public static void j6(com.crashlytics.android.core.ClassH r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        if (r8 != null) goto L4;
        r8 = "";
    L4:
        com.crashlytics.android.core.ClassD r11 = com.crashlytics.android.core.ClassD.j6(r8);
        com.crashlytics.android.core.ClassD r0 = j6(r9);
        com.crashlytics.android.core.ClassD r1 = j6(r10);
        int r3 = com.crashlytics.android.core.ClassH.j6(1, r11) + 0;
        if (r9 == null) goto L8;
        r3 = r3 + com.crashlytics.android.core.ClassH.j6(2, r0);
    L8:
        if (r10 == null) goto L10;
        r3 = r3 + com.crashlytics.android.core.ClassH.j6(3, r1);
    L10:
        r7.Zo(6, 2);
        r7.we(r3);
        r7.DW(1, r11);
        if (r9 == null) goto L13;
        r7.DW(2, r0);
    L13:
        if (r10 == null) goto L16;
        r7.DW(3, r1);
        return;
    }

    public static void j6(com.crashlytics.android.core.ClassH r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, java.lang.String r15) {
        com.crashlytics.android.core.ClassD r16 = com.crashlytics.android.core.ClassD.j6(r9);
        com.crashlytics.android.core.ClassD r17 = com.crashlytics.android.core.ClassD.j6(r10);
        com.crashlytics.android.core.ClassD r18 = com.crashlytics.android.core.ClassD.j6(r11);
        com.crashlytics.android.core.ClassD r19 = com.crashlytics.android.core.ClassD.j6(r12);
        com.crashlytics.android.core.ClassD r110 = com.crashlytics.android.core.ClassD.j6(r13);
        if (r15 == null) goto L5;
        com.crashlytics.android.core.ClassD r111 = com.crashlytics.android.core.ClassD.j6(r15);
    L6:
        r8.Zo(7, 2);
        r8.we(j6(r16, r17, r18, r19, r110, r14, r111));
        r8.DW(1, r16);
        r8.DW(2, r18);
        r8.DW(3, r19);
        r8.Zo(5, 2);
        r8.we(DW(r17));
        r8.DW(1, r17);
        r8.DW(6, r110);
        if (r111 == null) goto L9;
        r8.DW(8, DW);
        r8.DW(9, r111);
    L9:
        r8.Hw(10, r14);
        return;
    L5:
        r111 = null;
        goto L6
    }

    public static void j6(com.crashlytics.android.core.ClassH r3, java.lang.String r4, java.lang.String r5, boolean r6) {
        com.crashlytics.android.core.ClassD r7 = com.crashlytics.android.core.ClassD.j6(r4);
        com.crashlytics.android.core.ClassD r8 = com.crashlytics.android.core.ClassD.j6(r5);
        r3.Zo(8, 2);
        r3.we(j6(r7, r8, r6));
        r3.Hw(1, 3);
        r3.DW(2, r7);
        r3.DW(3, r8);
        r3.DW(4, r6);
    }

    private static void j6(com.crashlytics.android.core.ClassH r3, java.lang.Thread r4, java.lang.StackTraceElement[] r5, int r6, boolean r7) {
        r3.Zo(1, 2);
        r3.we(j6(r4, r5, r6, r7));
        r3.DW(1, com.crashlytics.android.core.ClassD.j6(r4.getName()));
        r3.VH(2, r6);
        int r8 = r5.length;
        int r9 = 0;
    L3:
        if (r9 >= r8) goto L5;
        j6(r3, 3, r5[r9], r7);
        r9 = r9 + 1;
        goto L3
    }

    private static void j6(com.crashlytics.android.core.ClassH r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> r6 = r5.entrySet().iterator();
    L4:
        if (r6.hasNext() == false) goto L9;
        java.util.Map.Entry<java.lang.String, java.lang.String> r0 = r6.next();
        r4.Zo(2, 2);
        r4.we(j6(r0.getKey(), r0.getValue()));
        r4.DW(1, com.crashlytics.android.core.ClassD.j6(r0.getKey()));
        java.lang.String r1 = r0.getValue();
        if (r1 != null) goto L8;
        r1 = "";
    L8:
        r4.DW(2, com.crashlytics.android.core.ClassD.j6(r1));
        goto L4
    }
}
