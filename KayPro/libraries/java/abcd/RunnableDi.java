package abcd;

@abcd.Interfacexu
class RunnableDi implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Ji FH;

    static {
        abcd.wu.j6(abcd.RunnableDi.class, 4379885248179836745L, -159569957877605768L);
    }

    RunnableDi(abcd.Ji r1) {
        this.FH = r1;
    }

    @abcd.Interfacesu(method = -810438471020312864L)
    private boolean j6() {
    L16:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, 1957726046461692465L, this);
    L20:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1957726046461692465L, this);     // Catch: java.lang.Throwable -> L16
    L7:
        if (abcd.Ji.v5(this.FH).size() <= 0) goto L9;
    L14:
        return true;
    L9:
        if (abcd.Ji.Zo(this.FH) != null) goto L14;
        if (abcd.Ji.gn(this.FH) != null) goto L14;
        return false;
    }

    @Override
    @abcd.Interfacesu(method = 143580761192065080L)
    public void run() {
    L99:
        th = move-exception;
        if (DW == false) goto L104;
        abcd.wu.j6(th, -3643927213099545845L, this);
    L104:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3643927213099545845L, this);     // Catch: java.lang.Throwable -> L99
    L6:
        java.lang.Object r2 = abcd.Ji.j6(this.FH);     // Catch: java.lang.Throwable -> L99
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L99
    L110:
        if (j6() == true) goto L11;
    L108:
        abcd.Ji.j6(this.FH).wait();     // Catch: java.lang.InterruptedException -> L106 java.lang.Throwable -> L96
        goto L110
    L11:
        if (abcd.Ji.DW(this.FH) == true) goto L108;
        abcd.Ji.Hw(this.FH).clear();     // Catch: java.lang.Throwable -> L96
    L15:
        if (abcd.Ji.v5(this.FH).size() <= 0) goto L19;
        abcd.Ji.Hw(this.FH).addAll(abcd.Ji.v5(this.FH));     // Catch: java.lang.Throwable -> L96
        abcd.Ji.v5(this.FH).clear();     // Catch: java.lang.Throwable -> L96
        abcd.Ji.j6(this.FH).wait(100);     // Catch: java.lang.InterruptedException -> L107 java.lang.Throwable -> L96
        goto L15
    L19:
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L96
        if (abcd.Ji.Zo(this.FH) != null) goto L23;
        if (abcd.Ji.gn(this.FH) != null) goto L29;
    L84:
        th = move-exception;
        monitor-enter(abcd.Ji.j6(this.FH));     // Catch: java.lang.Throwable -> L99
        abcd.Ji.Hw(this.FH).clear();     // Catch: java.lang.Throwable -> L91
        abcd.Ji.j6(this.FH, false, "Done", 100.0f);     // Catch: java.lang.Throwable -> L99
        throw th;     // Catch: java.lang.Throwable -> L99
    L91:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L99
    L46:
        if (abcd.Ji.VH(this.FH) == true) goto L65;
        java.lang.Object r4 = abcd.Ji.j6(this.FH);     // Catch: java.lang.Throwable -> L84
        monitor-enter(r4);     // Catch: java.lang.Throwable -> L84
        abcd.Ji.v5(this.FH).addAll(abcd.Ji.Hw(this.FH));     // Catch: java.lang.Throwable -> L61
        monitor-exit(r4);     // Catch: java.lang.Throwable -> L61
        java.lang.Object r5 = abcd.Ji.j6(this.FH);     // Catch: java.lang.Throwable -> L99
        monitor-enter(r5);     // Catch: java.lang.Throwable -> L99
        abcd.Ji.Hw(this.FH).clear();     // Catch: java.lang.Throwable -> L58
        monitor-exit(r5);     // Catch: java.lang.Throwable -> L58
        abcd.Ji r6 = this.FH;     // Catch: java.lang.Throwable -> L99
    L56:
        abcd.Ji.j6(r6, false, "Done", 100.0f);     // Catch: java.lang.Throwable -> L99
        goto L6
    L58:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L99
    L61:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L84
    L65:
        if (abcd.Ji.EQ(this.FH) == false) goto L127;
        com.aide.ui.U.j6(new abcd.RunnableC1560yi(this));     // Catch: java.lang.Throwable -> L84
    L127:
        java.util.Iterator r7 = abcd.Ji.Hw(this.FH).iterator();     // Catch: java.lang.Exception -> L72 abcd.Ji.a -> L74 java.lang.Throwable -> L84
    L69:
        if (r7.hasNext() == false) goto L75;
        abcd.Ji.e r8 = (abcd.Ji.e) r7.next();     // Catch: java.lang.Exception -> L72 abcd.Ji.a -> L74 java.lang.Throwable -> L84
        abcd.Ji.j6(this.FH, true, "Connecting...", 0.0f);     // Catch: java.lang.Exception -> L72 abcd.Ji.a -> L74 java.lang.Throwable -> L84
        abcd.Ji.j6(this.FH, r8);     // Catch: java.lang.Exception -> L72 abcd.Ji.a -> L74 java.lang.Throwable -> L84
        com.aide.ui.U.j6(new abcd.RunnableC1603zi(this));     // Catch: java.lang.Exception -> L72 abcd.Ji.a -> L74 java.lang.Throwable -> L84
    L75:
        java.lang.Object r9 = abcd.Ji.j6(this.FH);     // Catch: java.lang.Throwable -> L99
        monitor-enter(r9);     // Catch: java.lang.Throwable -> L99
        abcd.Ji.Hw(this.FH).clear();     // Catch: java.lang.Throwable -> L81
        monitor-exit(r9);     // Catch: java.lang.Throwable -> L81
        r6 = this.FH;     // Catch: java.lang.Throwable -> L99
        goto L56
    L81:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L99
    L74:
        com.aide.common.ClassH.j6("Canceled");     // Catch: java.lang.Throwable -> L84
        abcd.Ji.j6(this.FH, false, "Done", 100.0f);     // Catch: java.lang.Throwable -> L84
        com.aide.ui.U.j6(new abcd.RunnableC0077Ai(this));     // Catch: java.lang.Throwable -> L84
    L72:
        e = move-exception;
        com.aide.common.ClassH.DW(e);     // Catch: java.lang.Throwable -> L84
        abcd.Ji.j6(this.FH, false, "Done", 100.0f);     // Catch: java.lang.Throwable -> L84
        com.aide.ui.U.j6(new abcd.RunnableC0109Ci(this, e));     // Catch: java.lang.Throwable -> L84
        goto L75
    L29:
        if (abcd.Ji.VH(this.FH) == false) goto L6;
        java.lang.String r10 = abcd.Ji.gn(this.FH);     // Catch: abcd.Jw -> L41 java.lang.Throwable -> L99
        abcd.Ji.DW(this.FH, null);     // Catch: abcd.Jw -> L41 java.lang.Throwable -> L99
        java.util.ArrayList r3 = new java.util.ArrayList();     // Catch: abcd.Jw -> L41 java.lang.Throwable -> L99
        abcd.Dw.e r11 = abcd.Ji.u7(this.FH).j6(r10, 0, null, true, null);     // Catch: abcd.Jw -> L41 java.lang.Throwable -> L99
    L32:
        if (r11.Ws == null) goto L39;
        java.util.Iterator<abcd.Dw.e> r12 = r11.Ws.iterator();     // Catch: abcd.Jw -> L41 java.lang.Throwable -> L99
    L35:
        if (r12.hasNext() == false) goto L39;
        abcd.Dw.e r13 = r12.next();     // Catch: abcd.Jw -> L41 java.lang.Throwable -> L99
        if (r13.v5 == false) goto L35;
        r3.add(r13.gn);     // Catch: abcd.Jw -> L41 java.lang.Throwable -> L99
    L39:
        com.aide.ui.U.j6(new abcd.Runnablewi(this, r3));     // Catch: abcd.Jw -> L41 java.lang.Throwable -> L99
    L41:
        e = move-exception;
        com.aide.common.ClassH.DW(e);     // Catch: java.lang.Throwable -> L99
        com.aide.ui.U.j6(new abcd.Runnablexi(this, e));     // Catch: java.lang.Throwable -> L99
        goto L6
    L23:
        if (abcd.Ji.VH(this.FH) == false) goto L6;
        java.lang.String r14 = abcd.Ji.Zo(this.FH);     // Catch: java.lang.Throwable -> L99
        abcd.Ji.j6(this.FH, null);     // Catch: java.lang.Throwable -> L99
        com.aide.ui.U.j6(new abcd.RunnableC1432vi(this, r14));     // Catch: java.lang.Throwable -> L99
        goto L6
    L96:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L99
    }
}
