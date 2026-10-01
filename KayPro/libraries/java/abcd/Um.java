package abcd;

public final class Um {
    public static abcd.Rs DW(abcd.Rs r2, abcd.Rs r3) {
        if (r2 != null) goto L4;
    L40:
        return r2;
    L4:
        if (r2.equals(r3) == true) goto L40;
        if (r3 != null) goto L9;
        return null;
    L9:
        abcd.Qs r4 = r2.getType();
        abcd.Qs r5 = r3.getType();
        if (r4 != r5) goto L13;
        return r4;
    L13:
        if (r4.vy() == false) goto L34;
        if (r5.vy() == false) goto L34;
        abcd.Qs r0 = abcd.Qs.EQ;
        if (r4 != r0) goto L19;
        return r5;
    L19:
        if (r5 != r0) goto L22;
        return r4;
    L22:
        if (r4.lg() == false) goto L32;
        if (r5.lg() == false) goto L32;
        abcd.Rs r6 = DW(r4.we(), r5.we());
        if (r6 != null) goto L30;
        return abcd.Qs.QX;
    L30:
        return ((abcd.Qs) r6).Hw();
    L32:
        return abcd.Qs.QX;
    L34:
        if (r4.gW() == true) goto L36;
    L39:
        return null;
    L36:
        if (r5.gW() == false) goto L39;
        return abcd.Qs.VH;
    }

    public static abcd.Nm j6(abcd.Nm r6, abcd.Nm r7) {
        if (r6 != r7) goto L4;
        return r6;
    L4:
        int r0 = r6.size();
        abcd.Nm r1 = null;
        if (r7.size() != r0) goto L26;
        int r2 = 0;
    L7:
        if (r2 >= r0) goto L21;
        abcd.Rs r3 = r6.DW(r2);
        abcd.Rs r4 = r7.DW(r2);
        abcd.Rs r5 = DW(r3, r4);
        if (r5 == r3) goto L20;
        if (r1 != null) goto L12;
        r1 = r6.rN();
    L12:
        if (r5 == null) goto L17;
        r1.j6(r2, r5);     // Catch: abcd.an -> L14
    L14:
        e = move-exception;
        e.j6("...while merging stack[" + abcd.Yt.v5(r2) + "]");
        throw e;
    L17:
        throw new abcd.an("incompatible: " + r3 + ", " + r4);     // Catch: abcd.an -> L14
    L20:
        r2 = r2 + 1;
        goto L7
    L21:
        if (r1 != null) goto L23;
        return r6;
    L23:
        r1.we();
        return r1;
    L26:
        throw new abcd.an("mismatched stack depths");
    }

    public static abcd.Vm j6(abcd.Vm r5, abcd.Vm r6) {
        if (r5 != r6) goto L4;
        return r5;
    L4:
        int r0 = r5.er();
        abcd.Vm r1 = null;
        if (r6.er() != r0) goto L21;
        int r2 = 0;
    L7:
        if (r2 >= r0) goto L16;
        abcd.Rs r3 = r5.DW(r2);
        abcd.Rs r4 = DW(r3, r6.DW(r2));
        if (r4 == r3) goto L15;
        if (r1 != null) goto L12;
        r1 = r5.lg();
    L12:
        if (r4 != null) goto L14;
        r1.FH(r2);
        goto L15
    L14:
        r1.j6(r2, r4);
    L15:
        r2 = r2 + 1;
        goto L7
    L16:
        if (r1 != null) goto L18;
        return r5;
    L18:
        r1.we();
        return r1;
    L21:
        throw new abcd.an("mismatched maxLocals values");
    }

    public static boolean j6(abcd.Rs r5, abcd.Rs r6) {
        abcd.Qs r7 = r5.getType();
        abcd.Qs r8 = r6.getType();
        if (r7.equals(r8) == false) goto L5;
        return true;
    L5:
        int r0 = r7.j3();
        int r2 = r8.j3();
        if (r0 != 10) goto L8;
        r7 = abcd.Qs.QX;
        r0 = 9;
    L8:
        if (r2 != 10) goto L11;
        r8 = abcd.Qs.QX;
        r2 = 9;
    L11:
        if (r0 != 9) goto L43;
        if (r2 != 9) goto L43;
        abcd.Qs r1 = abcd.Qs.EQ;
        if (r7 != r1) goto L17;
        return false;
    L17:
        if (r8 != r1) goto L20;
        return true;
    L20:
        if (r7 != abcd.Qs.QX) goto L23;
        return true;
    L23:
        if (r7.lg() == false) goto L34;
        if (r8.lg() == true) goto L27;
        return false;
    L27:
        r7 = r7.we();
        r8 = r8.we();
        if (r7.lg() == false) goto L32;
        if (r8.lg() == true) goto L27;
    L32:
        return j6(r7, r8);
    L34:
        if (r8.lg() == true) goto L36;
        return true;
    L36:
        if (r7 != abcd.Qs.XL) goto L38;
        return true;
    L38:
        if (r7 == abcd.Qs.Ws) goto L54;
        return false;
    L54:
        return true;
    L43:
        if (r7.gW() == true) goto L45;
    L47:
        return false;
    L45:
        if (r8.gW() == false) goto L47;
        return true;
    }
}
