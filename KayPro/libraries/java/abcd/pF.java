package abcd;

public final class pF {
    private static final abcd.jC j6 = null;
    private final abcd.AbstracteC DW;

    static {
        j6 = new abcd.jC(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public pF(abcd.AbstracteC r1) {
        this.DW = r1;
    }

    private static abcd.jC j6(java.util.Iterator<abcd.jC> r1) {
        if (r1.hasNext() == false) goto L6;
        return r1.next();
    L6:
        return j6;
    }

    public <S extends abcd.CC> uF<S> j6(DC<S> r24, S r25, S r26, S r27) {
        DC<S> r1 = r24;
        java.util.ArrayList r5 = new java.util.ArrayList(3);
        r5.add(r25);
        r5.add(r26);
        r5.add(r27);
        abcd.uF r6 = new abcd.uF(r5);
        int r7 = 2;
        int r8 = 1;
        int r9 = 0;
        if (r26.j6() != 0) goto L13;
        if (r27.j6() != 0) goto L7;
        r6.j6(1, 0, 0, abcd.qF.a.j6);
    L11:
        return r6;
    L7:
        if (this.DW.j6(r1, r25, r27).isEmpty() == true) goto L9;
        r6.j6(1, 0, 0, abcd.qF.a.DW);
        r6.j6(2, 0, r27.j6(), abcd.qF.a.FH);
        goto L11
    L9:
        r6.j6(1, 0, 0, abcd.qF.a.j6);
        goto L11
    L13:
        if (r27.j6() == 0) goto L15;
        java.util.Iterator<abcd.jC> r10 = this.DW.j6(r1, r25, r26).iterator();
        java.util.Iterator<abcd.jC> r11 = this.DW.j6(r1, r25, r27).iterator();
        abcd.jC r12 = j6(r10);
        abcd.jC r13 = j6(r11);
        int r14 = 0;
    L20:
        abcd.jC r15 = j6;
        if (r13 != r15) goto L28;
        if (r12 != r15) goto L28;
        if (r14 >= r25.j6()) goto L26;
        r6.j6(r9, r14, r25.j6(), abcd.qF.a.j6);
    L26:
        return r6;
    L28:
        if (r12.v5() < r13.FH()) goto L30;
        if (r13.v5() < r12.FH()) goto L36;
        if (r12.FH() != r14) goto L42;
    L44:
        int r16 = r12.Hw();
        int r17 = r13.Hw();
        if (r12.FH() >= r13.FH()) goto L47;
        r17 = r17 - (r13.FH() - r12.FH());
    L48:
        abcd.jC r18 = j6(r10);
        abcd.jC r19 = r13;
        abcd.jC r110 = j6(r11);
    L50:
        if (r12.v5() >= r110.FH()) goto L51;
        if (r19.v5() < r18.FH()) goto L55;
        r12 = r18;
        r18 = j6(r10);
        goto L50
    L55:
        int r20 = r12.Zo();
        int r21 = r19.Zo();
        if (r12.v5() >= r19.v5()) goto L58;
        r20 = r20 + (r19.v5() - r12.v5());
    L59:
        int r0 = r20 - r16;
        int r2 = r0 - (r21 - r17);
        if (r2 <= 0) goto L62;
        r0 = r0 - r2;
    L62:
        java.util.Iterator<abcd.jC> r111 = r10;
        int r22 = 0;
    L63:
        if (r22 >= r0) goto L68;
        java.util.Iterator<abcd.jC> r112 = r11;
        abcd.jC r113 = r110;
        if (r1.j6(r26, r16 + r22, r27, r17 + r22) == false) goto L69;
        r22 = r22 + 1;
        r11 = r112;
        r110 = r113;
    L69:
        int r3 = r0 - r22;
        int r114 = 0;
    L70:
        if (r114 >= r3) goto L75;
        abcd.jC r23 = r18;
        if (r1.j6(r26, (r20 - r114) - 1, r27, (r21 - r114) - 1) == false) goto L76;
        r114 = r114 + 1;
        r18 = r23;
    L76:
        int r4 = r3 - r114;
        if (r22 <= 0) goto L79;
        int r28 = 1;
        r6.j6(1, r16, r16 + r22, abcd.qF.a.j6);
    L80:
        if (r4 > 0) goto L84;
        if (r2 != 0) goto L84;
    L85:
        if (r114 <= 0) goto L87;
        r6.j6(r28, r20 - r114, r20, abcd.qF.a.j6);
    L87:
        r14 = java.lang.Math.max(r12.v5(), r19.v5());
        r1 = r24;
        r10 = r111;
        r11 = r112;
        r13 = r113;
        r12 = r23;
        r7 = 2;
        r8 = 1;
        r9 = 0;
    L84:
        r6.j6(r28, r16 + r22, r20 - r114, abcd.qF.a.DW);
        r6.j6(2, r17 + r22, r21 - r114, abcd.qF.a.FH);
        goto L85
    L79:
        r28 = 1;
        goto L80
    L75:
        r23 = r18;
        goto L76
    L68:
        r112 = r11;
        r113 = r110;
        goto L69
    L58:
        r21 = r21 + (r12.v5() - r19.v5());
        goto L59
    L51:
        r19 = r110;
        r110 = j6(r11);
        goto L50
    L47:
        r16 = r16 - (r12.FH() - r13.FH());
        goto L48
    L42:
        if (r13.FH() == r14) goto L44;
        r6.j6(r9, r14, java.lang.Math.min(r12.FH(), r13.FH()), abcd.qF.a.j6);
        goto L44
    L36:
        if (r14 == r13.FH()) goto L38;
        r6.j6(r9, r14, r13.FH(), abcd.qF.a.j6);
    L38:
        r6.j6(r7, r13.Hw(), r13.Zo(), abcd.qF.a.j6);
        r14 = r13.v5();
        r13 = j6(r11);
        goto L20
    L30:
        if (r14 == r12.FH()) goto L32;
        r6.j6(r9, r14, r12.FH(), abcd.qF.a.j6);
    L32:
        r6.j6(r8, r12.Hw(), r12.Zo(), abcd.qF.a.j6);
        r14 = r12.v5();
        r12 = j6(r10);
        goto L20
    L15:
        if (this.DW.j6(r1, r25, r26).isEmpty() == true) goto L17;
        r6.j6(1, 0, r26.j6(), abcd.qF.a.DW);
        r6.j6(2, 0, 0, abcd.qF.a.FH);
    L18:
        return r6;
    L17:
        r6.j6(2, 0, 0, abcd.qF.a.j6);
        goto L18
    }
}
