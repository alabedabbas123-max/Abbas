package abcd;

class QJ extends abcd.AbstractaI implements abcd.LI {
    private final abcd.UE Hw;
    private final abcd.AbstractjJ VH;
    private final abcd.RJ Zo;
    private java.util.LinkedHashMap<java.lang.String, java.lang.String> gn;
    private java.util.Collection<abcd.YI> tp;
    private java.util.Map<java.lang.String, abcd.ME> u7;
    private final abcd.HJ v5;

    /* JADX WARN: Multi-variable type inference failed */
    QJ(abcd.SJ r2, abcd.RJ r3) {
        this.VH = (abcd.AbstractjJ) r2;
        abcd.AbstractjJ r4 = this.VH;
        this.Hw = r4.v5;
        this.v5 = r4.tp();
        this.Zo = r3;
    }

    private static java.lang.String DW(java.util.List<abcd.YI> r3) {
        java.util.Iterator<abcd.YI> r0 = r3.iterator();
    L4:
        if (r0.hasNext() == false) goto L5;
        java.lang.String r1 = r0.next().FH();
        if (r1.equals("refs/heads/master") == false) goto L4;
        return r1;
    L5:
        java.util.Iterator<abcd.YI> r2 = r3.iterator();
    L7:
        if (r2.hasNext() == false) goto L9;
        java.lang.String r4 = r2.next().FH();
        if (r4.startsWith("refs/heads/") == false) goto L7;
        return r4;
    L9:
        return r3.get(0).FH();
    }

    private void DW(abcd.YI r7) {
        this.Zo.j6(r7.FH(), r7.DW());     // Catch: java.io.IOException -> L4
        this.u7.put(r7.FH(), new abcd.BE.c(abcd.ME.a.DW, r7.FH(), r7.DW()));     // Catch: java.io.IOException -> L4
        r7.j6(abcd.YI.a.u7);     // Catch: java.io.IOException -> L4
        return;
    L4:
        e = move-exception;
        r7.j6(abcd.YI.a.Zo);
        r7.j6(e.getMessage());
    }

    private void DW(java.lang.String r2) {
        if (r2 == null) goto L8;
        this.Zo.j6(r2);     // Catch: java.io.IOException -> L5
        return;
    L9:
        return;
    }

    static abcd.RJ j6(abcd.QJ r0) {
        return r0.Zo;
    }

    private void j6(abcd.YI r3) {
        abcd.ME r0 = this.u7.remove(r3.FH());
        if (r0 != null) goto L7;
        r3.j6(abcd.YI.a.u7);
        return;
    L7:
        if (r0.j6().Zo() == false) goto L10;
        this.tp.add(r3);
    L10:
        if (r0.j6().Hw() == true) goto L22;
    L20:
        this.Zo.FH(r3.FH());     // Catch: java.io.IOException -> L17
        return;
    L17:
        e = move-exception;
        r3.j6(abcd.YI.a.Zo);
        r3.j6(e.getMessage());
        return;
    L22:
        this.Zo.DW(r3.FH());     // Catch: java.io.IOException -> L13
        r3.j6(abcd.YI.a.u7);     // Catch: java.io.IOException -> L13
    L13:
        e = move-exception;
        r3.j6(abcd.YI.a.Zo);
        r3.j6(e.getMessage());
        goto L20
    }

    private void j6(java.util.List<abcd.YI> r4) {
        this.Zo.j6("../HEAD", abcd.hE.j6("ref: " + DW(r4) + "\n"));     // Catch: java.io.IOException -> L8
        this.Zo.j6("../config", abcd.hE.j6("[core]\n\trepositoryformatversion = 0\n"));     // Catch: java.io.IOException -> L5
        return;
    L5:
        e = move-exception;
        throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().cannotCreateConfig, e);
    L8:
        e = move-exception;
        throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().cannotCreateHEAD, e);
    }

    private void j6(java.util.List<abcd.YI> r9, abcd.LE r10) {
        abcd.TH r1 = new abcd.TH(this.VH.Zo(), this.Hw.j3());
        java.util.HashSet r3 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L50
        java.util.HashSet r4 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L50
        java.util.Iterator<abcd.YI> r11 = r9.iterator();     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L50
    L5:
        if (r11.hasNext() == false) goto L6;
        r3.add(r11.next().DW());     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L50
        goto L5
    L6:
        java.util.Iterator<abcd.ME> r12 = DW().iterator();     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L50
    L8:
        if (r12.hasNext() == false) goto L9;
        abcd.ME r5 = r12.next();     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L50
        r4.add(r5.DW());     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L50
        if (r5.FH() == null) goto L8;
        r4.add(r5.FH());     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L50
        goto L8
    L9:
        r1.j6(r10, r3, r4);     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L50
        if (r1.Hw() != 0) goto L14;
        r1.VH();
        return;
    L14:
        this.gn = new java.util.LinkedHashMap();     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L50
        java.util.Iterator<java.lang.String> r13 = this.Zo.FH().iterator();     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L50
    L16:
        if (r13.hasNext() == false) goto L17;
        java.lang.String r6 = r13.next();     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L50
        this.gn.put(r6, r6);     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L50
        goto L16
    L17:
        java.lang.String r14 = "pack-" + r1.FH().we();     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L50
        java.lang.String r7 = java.lang.String.valueOf(r14) + ".pack";     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L50
        java.lang.String r8 = "pack/" + r7;     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L50
        java.lang.String r2 = "pack/" + r14 + ".idx";     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L48
        if (this.gn.remove(r7) == null) goto L21;
        this.Zo.j6(this.gn.keySet());     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L48
        this.Zo.j6(r2);     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L48
    L21:
        java.lang.String r15 = "Put " + r14.substring(0, 12);     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L48
        java.io.OutputStream r0 = this.Zo.j6(r8, r10, java.lang.String.valueOf(r15) + "..pack");     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L48
        abcd.XK r16 = new abcd.XK(r0);     // Catch: java.lang.Throwable -> L37
        r1.j6(r10, r10, r16);     // Catch: java.lang.Throwable -> L35
        r16.close();     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L48
        java.io.OutputStream r17 = this.Zo.j6(r2, r10, java.lang.String.valueOf(r15) + "..idx");     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L48
        abcd.XK r18 = new abcd.XK(r17);     // Catch: java.lang.Throwable -> L32
        r1.j6(r18);     // Catch: java.lang.Throwable -> L30
        r18.close();     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L48
        java.util.ArrayList r19 = new java.util.ArrayList();     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L48
        r19.add(r7);     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L48
        r19.addAll(this.gn.keySet());     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L48
        this.Zo.j6(r19);     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L48
        r1.VH();
        return;
    L30:
        th = move-exception;
        th = th;
        r17 = r18;
    L33:
        r17.close();     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L48
        throw th;     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L48
    L32:
        th = th;
    L35:
        th = th;
        r0 = r16;
    L38:
        r0.close();     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L48
        throw th;     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L48
    L37:
        th = th;
    L40:
        e = e;
    L52:
        DW(null);     // Catch: java.lang.Throwable -> L48
        DW(r8);     // Catch: java.lang.Throwable -> L48
        throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().cannotStoreObjects, e);     // Catch: java.lang.Throwable -> L48
    L48:
        th = move-exception;
        r1.VH();
        throw th;
    L50:
        e = e;
        r8 = null;
        goto L52
    }

    private boolean u7() {
        if (FH().isEmpty() == false) goto L10;
        java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = this.gn;
        if (r0 != null) goto L7;
        return false;
    L7:
        if (r0.isEmpty() == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    @Override
    public void close() {
        this.Zo.j6();
    }

    @Override
    public void j6(abcd.LE r5, java.util.Map<java.lang.String, abcd.YI> r6) {
        gn();
        this.gn = null;
        this.u7 = new java.util.TreeMap(FH());
        this.tp = new java.util.ArrayList(r6.size());
        java.util.ArrayList r0 = new java.util.ArrayList();
        java.util.Iterator<abcd.YI> r7 = r6.values().iterator();
    L4:
        if (r7.hasNext() == false) goto L6;
        abcd.YI r1 = r7.next();
        java.lang.String r2 = r1.FH();
        if (r2.startsWith("refs/") == false) goto L46;
        if (abcd.UE.DW(r2) == false) goto L46;
        if (abcd.YD.j6(abcd.yE.Ws(), r1.DW()) == true) goto L44;
        r0.add(r1);
        goto L4
    L44:
        j6(r1);
    L46:
        r1.j6(abcd.YI.a.Zo);
        r1.j6(org.eclipse.jgit.JGitText.j6().funnyRefname);
        goto L4
    L6:
        if (r0.isEmpty() == true) goto L8;
        j6(r0, r5);
    L8:
        java.util.Iterator<abcd.YI> r3 = r0.iterator();
    L10:
        if (r3.hasNext() == false) goto L12;
        DW(r3.next());
        goto L10
    L12:
        if (r0.isEmpty() == false) goto L14;
    L16:
        abcd.PJ r8 = new abcd.PJ(this, this.u7.values());
        if (this.tp.isEmpty() == false) goto L49;
    L47:
        r8.j6();     // Catch: java.io.IOException -> L33
        return;
    L33:
        e = move-exception;
        throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().failedUpdatingRefs, e);
    L49:
        r8.DW();     // Catch: java.io.IOException -> L24
        java.util.Iterator<abcd.YI> r9 = this.tp.iterator();     // Catch: java.io.IOException -> L24
    L20:
        if (r9.hasNext() == false) goto L47;
        r9.next().j6(abcd.YI.a.u7);     // Catch: java.io.IOException -> L24
    L24:
        e = move-exception;
        java.util.Iterator<abcd.YI> r10 = this.tp.iterator();
    L27:
        if (r10.hasNext() == false) goto L30;
        abcd.YI r4 = r10.next();
        r4.j6(abcd.YI.a.Zo);
        r4.j6(e.getMessage());
        goto L27
    L30:
        throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().failedUpdatingRefs, e);
    L14:
        if (u7() == false) goto L16;
        j6(r0);
        goto L16
    }
}
