package abcd;

@abcd.Interfacexu
public class ol {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.ol.class, -1401858080030435915L, -1401858080030435915L);
    }

    public ol() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3074699047031413017L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3074699047031413017L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @abcd.Interfacesu(method = 52244996607952165L)
    private void DW(java.util.List<com.aide.engine.Modification> r20) {
    L82:
        th = move-exception;
        if (DW == false) goto L87;
        abcd.wu.j6(th, 8759941853249604240L, this, r20);
    L87:
        throw th;
    L4:
        if (j6 == false) goto L95;
        abcd.wu.j6(8759941853249604240L, this, r20);     // Catch: java.lang.Throwable -> L82
    L95:
        com.aide.ui.U.EQ().we();     // Catch: java.lang.Throwable -> L74 java.lang.Throwable -> L76
        int r6 = 0;
        boolean r7 = false;
    L9:
        if (r6 >= r20.size()) goto L104;
        com.aide.engine.Modification r0 = r20.get(r6);     // Catch: java.lang.Throwable -> L74 java.lang.Throwable -> L76
        int r9 = r0.tp();     // Catch: java.lang.Throwable -> L74 java.lang.Throwable -> L76
        if (r9 == 0) goto L93;
        if (r9 != 1) goto L15;
        java.lang.String r10 = r0.v5();     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L74 java.lang.Throwable -> L76
        java.lang.String r1 = abcd.Vl.EQ(r10) + java.io.File.separator + r0.VH();     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L74 java.lang.Throwable -> L76
        abcd.Vl.Zo(r10, r1);     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L74 java.lang.Throwable -> L76
        com.aide.ui.U.er().j6(r10, r1);     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L74 java.lang.Throwable -> L76
        com.aide.ui.U.tp().DW(abcd.Vl.EQ(r10));     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L74 java.lang.Throwable -> L76
        r7 = true;
    L63:
        r6 = r6 + 1;
    L56:
        e = move-exception;
        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), "Modify Files", e);     // Catch: java.lang.Throwable -> L74 java.lang.Throwable -> L76
        goto L63
    L15:
        if (r9 != 2) goto L17;
        com.aide.ui.U.EQ().gn();     // Catch: java.lang.Throwable -> L74 java.lang.Throwable -> L76
        java.util.List<com.aide.engine.Modification> r2 = com.aide.ui.U.EQ().DW(r0.v5(), r0.u7(), r0.Hw(), com.aide.ui.aa.cn());     // Catch: java.lang.Throwable -> L74 java.lang.Throwable -> L76
        if (r2 == null) goto L52;
        int r8 = r2.size() - 1;     // Catch: java.lang.Throwable -> L74 java.lang.Throwable -> L76
    L50:
        if (r8 < 0) goto L52;
        r20.add(r6 + 1, r2.get(r8));     // Catch: java.lang.Throwable -> L74 java.lang.Throwable -> L76
        r8 = r8 - 1;     // Catch: java.lang.Throwable -> L74 java.lang.Throwable -> L76
    L52:
        com.aide.ui.U.EQ().we();     // Catch: java.lang.Throwable -> L74 java.lang.Throwable -> L76
        goto L63
    L17:
        if (r9 != 3) goto L19;
        com.aide.ui.U.er().v5(r0.v5()).j6(r0.u7(), r0.gn(), r0.Hw(), r0.FH(), r0.DW(), r0.j6());     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L74 java.lang.Throwable -> L76
    L45:
        e = move-exception;
        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), "Modify Files", e);     // Catch: java.lang.Throwable -> L74 java.lang.Throwable -> L76
        goto L63
    L19:
        if (r9 != 7) goto L21;
        com.aide.ui.U.er().v5(r0.v5()).DW(r0.u7(), r0.gn(), r0.Hw(), r0.FH(), r0.DW(), r0.j6());     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L74 java.lang.Throwable -> L76
    L40:
        e = move-exception;
        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), "Modify Files", e);     // Catch: java.lang.Throwable -> L74 java.lang.Throwable -> L76
        goto L63
    L21:
        if (r9 != 8) goto L23;
        com.aide.ui.U.lg().j6(new abcd.Tl(r0.v5(), r0.u7(), r0.gn(), r0.Hw(), r0.FH()), false);     // Catch: java.lang.Throwable -> L74 java.lang.Throwable -> L76
        goto L63
    L23:
        if (r9 != 11) goto L25;
        com.aide.ui.U.er().v5(r0.v5()).j6(r0.u7(), r0.Zo());     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L74 java.lang.Throwable -> L76
    L34:
        e = move-exception;
        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), "Modify Files", e);     // Catch: java.lang.Throwable -> L74 java.lang.Throwable -> L76
        goto L63
    L25:
        if (r9 != 12) goto L63;
        abcd.Vl.a8(abcd.Vl.EQ(r0.v5()));     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L74 java.lang.Throwable -> L76
        abcd.Vl.j6(r0.v5(), r0.VH());     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L74 java.lang.Throwable -> L76
        com.aide.ui.U.er().v5(r0.v5());     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L74 java.lang.Throwable -> L76
    L29:
        e = move-exception;
        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), "Modify Files", e);     // Catch: java.lang.Throwable -> L74 java.lang.Throwable -> L76
        goto L63
    L93:
        com.aide.ui.U.er().v5(r0.v5()).j6(r0.u7(), r0.gn(), r0.Hw(), r0.FH(), r0.VH(), r0.EQ(), r0.v5().equals(com.aide.ui.U.er().DW()));     // Catch: java.io.IOException -> L61 java.lang.Throwable -> L74 java.lang.Throwable -> L76
    L61:
        e = move-exception;
        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), "Modify Files", e);     // Catch: java.lang.Throwable -> L74 java.lang.Throwable -> L76
        goto L63
    L104:
        com.aide.ui.U.er().J0();     // Catch: java.io.IOException -> L66 java.lang.Throwable -> L74 java.lang.Throwable -> L76
    L68:
        if (r7 == false) goto L70;
        com.aide.ui.U.vy().er();     // Catch: java.lang.Throwable -> L74 java.lang.Throwable -> L76
        com.aide.ui.U.J8().Hw();     // Catch: java.lang.Throwable -> L74 java.lang.Throwable -> L76
    L70:
        com.aide.ui.U.EQ().VH();     // Catch: java.lang.Throwable -> L74 java.lang.Throwable -> L76
        abcd.C0445Xj r3 = com.aide.ui.U.EQ();     // Catch: java.lang.Throwable -> L82
    L72:
        r3.gn();     // Catch: java.lang.Throwable -> L82
        return;
    L66:
        e = move-exception;
        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), "Modify Files", e);     // Catch: java.lang.Throwable -> L74 java.lang.Throwable -> L76
    L74:
        th = move-exception;
        com.aide.ui.U.EQ().gn();     // Catch: java.lang.Throwable -> L82
        throw th;     // Catch: java.lang.Throwable -> L82
    L76:
        th = move-exception;
        com.aide.common.ClassH.j6(th);     // Catch: java.lang.Throwable -> L74
        r3 = com.aide.ui.U.EQ();     // Catch: java.lang.Throwable -> L82
        goto L72
    }

    static void j6(abcd.ol r0, java.util.List r1) {
        r0.DW(r1);
    }

    public void j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3705311679461573176L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3705311679461573176L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.U.EQ().j6(new abcd.Binderml(this));     // Catch: java.lang.Throwable -> L8
    }

    public void j6(java.util.List<com.aide.engine.Modification> r10) {
    L34:
        th = move-exception;
        if (DW == false) goto L39;
        abcd.wu.j6(th, -4627938854537139501L, this, r10);
    L39:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4627938854537139501L, this, r10);     // Catch: java.lang.Throwable -> L34
    L6:
        com.aide.ui.U.lg().Hw();     // Catch: java.lang.Throwable -> L34
        if (r10 != null) goto L9;
        return;
    L9:
        java.util.HashSet r2 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L34
        boolean r3 = false;
        java.util.Iterator<com.aide.engine.Modification> r4 = r10.iterator();     // Catch: java.lang.Throwable -> L34
    L11:
        if (r4.hasNext() == false) goto L26;
        com.aide.engine.Modification r5 = r4.next();     // Catch: java.lang.Throwable -> L34
        int r6 = r5.tp();     // Catch: java.lang.Throwable -> L34
        if (r6 == 0) goto L23;
        if (r6 == 3) goto L23;
        if (r6 == 7) goto L23;
        if (r6 == 11) goto L23;
        if (r6 != 12) goto L11;
    L23:
        r2.add(r5.v5());     // Catch: java.lang.Throwable -> L34
        if (r5.v5().equals(com.aide.ui.U.er().DW()) == true) goto L11;
        r3 = true;
        goto L11
    L26:
        if (r3 == true) goto L28;
        DW(r10);     // Catch: java.lang.Throwable -> L34
        return;
    L28:
        java.util.ArrayList r7 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L34
        java.util.Iterator r8 = r2.iterator();     // Catch: java.lang.Throwable -> L34
    L30:
        if (r8.hasNext() == false) goto L32;
        r7.add(abcd.Vl.tp((java.lang.String) r8.next()));     // Catch: java.lang.Throwable -> L34
        goto L30
    L32:
        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), com.almlkaide.kaypro.R.string.dialog_modify_title, com.almlkaide.kaypro.R.string.dialog_modify_message, r7, new abcd.Runnablenl(this, r10), null);     // Catch: java.lang.Throwable -> L34
    }
}
