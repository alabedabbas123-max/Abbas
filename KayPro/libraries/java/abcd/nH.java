package abcd;

public class nH extends abcd.OE {
    private static final java.lang.String[] DW = null;
    private final java.util.concurrent.atomic.AtomicInteger EQ;
    private final abcd.IG FH;
    private final java.io.File Hw;
    private final java.io.File VH;
    private final java.io.File Zo;
    private final java.io.File gn;
    private final java.util.concurrent.atomic.AtomicReference<abcd.nH.g> tp;
    private final java.util.concurrent.atomic.AtomicReference<KK<abcd.nH.c>> u7;
    private final java.io.File v5;
    private final java.util.concurrent.atomic.AtomicInteger we;

    private static final class a extends abcd.BE.a implements abcd.nH.c {
        private final abcd.LG Hw;

        a(abcd.LG r2, java.lang.String r3, abcd.yE r4) {
            super(abcd.ME.a.DW, r3, r4);
            this.Hw = r2;
        }

        @Override
        public abcd.LG VH() {
            return this.Hw;
        }

        @Override
        public abcd.nH.c j6(abcd.BE r1) {
            return this;
        }
    }

    private static final class b extends abcd.BE.b implements abcd.nH.c {
        private final abcd.LG v5;

        b(abcd.LG r2, java.lang.String r3, abcd.yE r4, abcd.yE r5) {
            super(abcd.ME.a.DW, r3, r4, r5);
            this.v5 = r2;
        }

        @Override
        public abcd.LG VH() {
            return this.v5;
        }

        @Override
        public abcd.nH.c j6(abcd.BE r1) {
            return this;
        }
    }

    private interface c extends abcd.ME {
        abcd.LG VH();

        abcd.nH.c j6(abcd.BE r1);
    }

    private class d {
        private int DW;
        final KK.a<abcd.ME> FH;
        KK.a<abcd.nH.c> Hw;
        private final KK<abcd.nH.c> j6;
        final abcd.nH v5;

        d(abcd.nH r2, KK<abcd.nH.c> r3) {
            this.v5 = r2;
            this.FH = new abcd.KK.a(4);
            this.j6 = r3;
        }

        private void DW(java.lang.String r4) {
            abcd.nH.c r2 = null;
            if (this.DW >= this.j6.size()) goto L13;
        L4:
            abcd.nH.c r0 = (abcd.nH.c) this.j6.get(this.DW);
            int r1 = abcd.NE.j6(r0, r4);
            if (r1 >= 0) goto L12;
            if (this.Hw != null) goto L9;
            this.Hw = this.j6.v5(this.DW);
        L9:
            this.DW++;
            if (this.DW < this.j6.size()) goto L4;
        L12:
            if (r1 > 0) goto L13;
        L34:
            r2 = abcd.nH.j6(this.v5, r0, r4);     // Catch: java.io.IOException -> L33
        L15:
            if (r2 == null) goto L26;
            if (r0 != r2) goto L18;
        L20:
            KK.a<abcd.nH.c> r5 = this.Hw;
            if (r5 == null) goto L24;
            r5.j6(r2);
        L24:
            if (r2.Zo() == false) goto L30;
            this.FH.j6(r2);
        L30:
            if (r0 == null) goto L39;
            this.DW++;
            return;
        L39:
            return;
        L18:
            if (this.Hw != null) goto L20;
            this.Hw = this.j6.v5(this.DW);
            goto L20
        L26:
            if (r0 == null) goto L30;
            if (this.Hw != null) goto L30;
            this.Hw = this.j6.v5(this.DW);
        L13:
            r0 = null;
            goto L34
        }

        private boolean j6(java.lang.String r9, java.io.File r10) {
            java.lang.String[] r0 = r10.list(abcd.WG.j6);
            int r1 = 0;
            if (r0 != null) goto L6;
            return false;
        L6:
            if (r0.length <= 0) goto L22;
            int r2 = 0;
        L9:
            if (r2 >= r0.length) goto L10;
            if (new java.io.File(r10, r0[r2]).isDirectory() == false) goto L21;
            r0[r2] = java.lang.String.valueOf(r0[r2]) + '/';
        L21:
            r2 = r2 + 1;
            goto L9
        L10:
            java.util.Arrays.sort(r0);
            int r4 = r0.length;
        L11:
            if (r1 >= r4) goto L22;
            java.lang.String r3 = r0[r1];
            if (r3.charAt(r3.length() - 1) != '/') goto L16;
            j6(java.lang.String.valueOf(r9) + r3, new java.io.File(r10, r3));
        L17:
            r1 = r1 + 1;
            goto L11
        L16:
            DW(java.lang.String.valueOf(r9) + r3);
        L22:
            return true;
        }

        void j6(java.lang.String r4) {
            if ("".equals(r4) == false) goto L10;
            DW("HEAD");
            j6("refs/", abcd.nH.j6(this.v5));
            if (this.Hw == null) goto L7;
            return;
        L7:
            if (this.DW >= this.j6.size()) goto L35;
            this.Hw = this.j6.v5(this.DW);
            return;
        L35:
            return;
        L10:
            if (r4.startsWith("refs/") == true) goto L12;
            return;
        L12:
            if (r4.endsWith("/") == false) goto L38;
            this.DW = -(this.j6.DW(r4) + 1);
            j6(r4, new java.io.File(abcd.nH.j6(this.v5), r4.substring(5)));
        L15:
            if (this.DW >= this.j6.size()) goto L20;
            if (((abcd.nH.c) this.j6.get(this.DW)).getName().startsWith(r4) == false) goto L20;
            if (this.Hw != null) goto L28;
            this.Hw = this.j6.v5(this.DW);
        L28:
            this.DW++;
        L20:
            if (this.Hw != null) goto L22;
            return;
        L22:
            if (this.DW >= this.j6.size()) goto L40;
            KK.a<abcd.nH.c> r5 = this.Hw;
            KK<abcd.nH.c> r0 = this.j6;
            int r1 = this.DW;
            this.DW = r1 + 1;
            r5.j6((abcd.nH.c) r0.get(r1));
            goto L22
        L40:
            return;
        }
    }

    private static final class e extends abcd.kF implements abcd.nH.c {
        private final abcd.LG FH;

        e(abcd.LG r1, java.lang.String r2, abcd.ME r3) {
            super(r2, r3);
            this.FH = r1;
        }

        @Override
        public abcd.LG VH() {
            return this.FH;
        }

        @Override
        public abcd.nH.c j6(abcd.BE r1) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private static final class f extends abcd.BE.c implements abcd.nH.c {
        private abcd.LG Hw;

        f(abcd.LG r2, java.lang.String r3, abcd.yE r4) {
            super(abcd.ME.a.DW, r3, r4);
            this.Hw = r2;
        }

        @Override
        public abcd.LG VH() {
            return this.Hw;
        }

        @Override
        public abcd.nH.c j6(abcd.BE r5) {
            if (r5.FH() == null) goto L7;
            return new abcd.nH.b(this.Hw, getName(), DW(), r5.FH());
        L7:
            return new abcd.nH.a(this.Hw, getName(), DW());
        }
    }

    private static class g extends KK<abcd.ME> {
        static final abcd.nH.g Hw = null;
        final abcd.LG v5;

        static {
            Hw = new abcd.nH.g(abcd.KK.DW(), abcd.LG.DW);
        }

        g(KK<abcd.ME> r1, abcd.LG r2) {
            super(r1);
            this.v5 = r2;
        }
    }

    static {
        DW = new java.lang.String[]{"MERGE_HEAD", "FETCH_HEAD", "ORIG_HEAD", "CHERRY_PICK_HEAD"};
    }

    nH(abcd.IG r3) {
        this.u7 = new java.util.concurrent.atomic.AtomicReference();
        this.tp = new java.util.concurrent.atomic.AtomicReference();
        this.EQ = new java.util.concurrent.atomic.AtomicInteger();
        this.we = new java.util.concurrent.atomic.AtomicInteger();
        abcd.AbstractpK r0 = r3.gn();
        this.FH = r3;
        this.Hw = r3.VH();
        this.v5 = r0.j6(this.Hw, "refs/");
        this.Zo = r0.j6(this.Hw, "logs");
        this.VH = r0.j6(this.Hw, "logs/refs/");
        this.gn = r0.j6(this.Hw, "packed-refs");
        this.u7.set(abcd.KK.DW());
        this.tp.set(abcd.nH.g.Hw);
    }

    private abcd.BE DW(abcd.ME r6) {
        abcd.qG r0 = new abcd.qG(FH());
        abcd.AbstractiG r1 = r0.Zo(r6.DW());     // Catch: java.lang.Throwable -> L11
        if ((r1 instanceof abcd.lG) == false) goto L8;
        abcd.BE.b r2 = new abcd.BE.b(r6.j6(), r6.getName(), r6.DW(), r0.FH(r1).Hw());     // Catch: java.lang.Throwable -> L11
        r0.EQ();
        return r2;
    L8:
        abcd.BE.a r3 = new abcd.BE.a(r6.j6(), r6.getName(), r6.DW());     // Catch: java.lang.Throwable -> L11
        r0.EQ();
        return r3;
    L11:
        th = move-exception;
        r0.EQ();
        throw th;
    }

    static java.util.concurrent.atomic.AtomicReference DW(abcd.nH r0) {
        return r0.tp;
    }

    private void Hw() {
        int r0 = this.we.get();
        int r1 = this.EQ.get();
        if (r0 != r1) goto L5;
        return;
    L5:
        if (this.we.compareAndSet(r0, r1) == false) goto L10;
        if (r0 == 0) goto L11;
        this.FH.j6(new abcd.ID());
        return;
    L11:
        return;
    }

    private boolean VH() {
        return ((abcd.jE) this.FH.Zo().j6(abcd.jE.j6)).Hw();
    }

    private boolean VH(java.lang.String r2) {
        if (r2.equals("HEAD") == false) goto L5;
        return true;
    L5:
        if (r2.startsWith("refs/heads/") == false) goto L7;
        return true;
    L7:
        if (r2.startsWith("refs/remotes/") == false) goto L9;
        return true;
    L9:
        if (r2.equals("refs/stash") == true) goto L16;
        return false;
    L16:
        return true;
    }

    private abcd.nH.g Zo() {
        abcd.nH.g r0 = this.tp.get();
        if (r0.v5.j6(this.gn) == true) goto L5;
        return r0;
    L5:
        abcd.nH.g r1 = gn();
        if (this.tp.compareAndSet(r0, r1) == false) goto L8;
        this.EQ.incrementAndGet();
    L8:
        return r1;
    }

    private abcd.nH.g gn() {
        abcd.LG r0 = abcd.LG.DW(this.gn);
        java.io.BufferedReader r1 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(this.gn), abcd.hE.Zo));     // Catch: java.io.FileNotFoundException -> L10
        abcd.nH.g r2 = new abcd.nH.g(j6(r1), r0);     // Catch: java.lang.Throwable -> L7
        r1.close();
        return r2;
    L7:
        th = move-exception;
        r1.close();
        throw th;
    L11:
        return abcd.nH.g.Hw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private KK<abcd.ME> j6(KK<? extends abcd.ME> r1) {
        return r1;
    }

    private KK<abcd.ME> j6(java.io.BufferedReader r11) {
        abcd.KK.a r0 = new abcd.KK.a();
        abcd.ME r4 = null;
        boolean r2 = false;
        boolean r3 = false;
    L3:
        java.lang.String r5 = r11.readLine();
        if (r5 == null) goto L5;
        if (r5.charAt(0) == '#') goto L12;
        if (r5.charAt(0) != '^') goto L21;
        if (r4 == null) goto L20;
        abcd.ME r6 = new abcd.BE.b(abcd.ME.a.FH, r4.getName(), r4.DW(), abcd.yE.j6(r5.substring(1)));
        r0.j6(r0.j6() - 1, r6);
    L18:
        r4 = r6;
        goto L3
    L20:
        throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().peeledLineBeforeRef);
    L21:
        int r7 = r5.indexOf(32);
        abcd.yE r8 = abcd.yE.j6(r5.substring(0, r7));
        java.lang.String r9 = j6(r5, r7 + 1, r5.length());
        if (r3 == false) goto L24;
        r6 = new abcd.BE.a(abcd.ME.a.FH, r9, r8);
    L25:
        if (r4 != null) goto L27;
    L29:
        r0.j6(r6);
        goto L18
    L27:
        if (abcd.NE.DW(r4, r6) <= 0) goto L29;
        r2 = true;
        goto L29
    L24:
        r6 = new abcd.BE.c(abcd.ME.a.FH, r9, r8);
        goto L25
    L12:
        if (r5.startsWith("# pack-refs with:") == false) goto L3;
        r3 = r5.substring(17).contains(" peeled");
        goto L3
    L5:
        if (r2 == false) goto L8;
        r0.DW();
    L8:
        return r0.FH();
    }

    private abcd.ME j6(abcd.ME r10, int r11, java.lang.String r12, KK<abcd.nH.c> r13, KK<abcd.ME> r14) {
        if (r10.Zo() == false) goto L25;
        abcd.ME r0 = r10.getTarget();
        if (5 > r11) goto L7;
        return null;
    L7:
        if (r13 != null) goto L9;
    L17:
        abcd.ME r1 = j6(r0.getName(), r14);
        if (r1 != null) goto L20;
        return r10;
    L20:
        abcd.ME r15 = j6(r1, r11 + 1, r12, r13, r14);
        if (r15 != null) goto L24;
        return null;
    L24:
        return new abcd.kF(r10.getName(), r15);
    L9:
        if (r0.getName().startsWith(r12) == false) goto L17;
        int r2 = r13.DW(r0.getName());
        if (r2 < 0) goto L13;
        r1 = r13.get(r2);
        goto L20
    L13:
        int r3 = r14.DW(r0.getName());
        if (r3 < 0) goto L16;
        r1 = r14.get(r3);
        goto L20
    L16:
        return r10;
    L25:
        return r10;
    }

    private static abcd.ME j6(abcd.ME r1, abcd.BE r2) {
        if (r1.Zo() == false) goto L6;
        abcd.ME r3 = j6(r1.getTarget(), r2);
        return new abcd.kF(r1.getName(), r3);
    L6:
        return r2;
    }

    private abcd.ME j6(java.lang.String r6, KK<abcd.ME> r7) {
        KK<abcd.nH.c> r0 = (abcd.KK) this.u7.get();
        int r1 = r0.DW(r6);
        if (r1 < 0) goto L17;
        abcd.nH.c r2 = (abcd.nH.c) r0.get(r1);
        abcd.nH.c r3 = j6(r2, r6);
        if (r3 == null) goto L7;
        if (r2 != r3) goto L14;
        return r3;
    L14:
        if (this.u7.compareAndSet(r0, r0.DW(r1, r3)) == false) goto L16;
        this.EQ.incrementAndGet();
    L16:
        return r3;
    L7:
        if (this.u7.compareAndSet(r0, r0.remove(r1)) == false) goto L10;
        this.EQ.incrementAndGet();
    L10:
        return r7.FH(r6);
    L17:
        abcd.nH.c r4 = j6(null, r6);
        if (r4 == null) goto L20;
        int r8 = 0;
    L22:
        java.lang.String[] r5 = DW;
        if (r8 >= r5.length) goto L25;
        if (r6.equals(r5[r8]) == true) goto L30;
        r8 = r8 + 1;
        goto L22
    L30:
        return r4;
    L25:
        if (this.u7.compareAndSet(r0, r0.j6(r1, r4)) == false) goto L27;
        this.EQ.incrementAndGet();
    L27:
        return r4;
    L20:
        return r7.FH(r6);
    }

    private abcd.nH.c j6(abcd.nH.c r12, java.lang.String r13) {
        java.io.File r0 = Hw(r13);
        if (r12 == null) goto L8;
        abcd.LG r14 = r12.VH();
        if (r14.j6(r0) == true) goto L7;
        return r12;
    L7:
        abcd.LG r2 = r14;
        r13 = r12.getName();
    L9:
        abcd.LG r3 = abcd.LG.DW(r0);
        byte[] r1 = abcd.BK.DW(r0, 4096);     // Catch: java.io.FileNotFoundException -> L56
        int r5 = r1.length;
        if (r5 != 0) goto L15;
        return null;
    L15:
        if (j6(r1, r5) == false) goto L38;
        if (r5 != 4096) goto L18;
        return null;
    L18:
        if (r5 <= 0) goto L24;
        if (java.lang.Character.isWhitespace(r1[r5 - 1]) == false) goto L24;
        r5 = r5 - 1;
    L24:
        if (r5 < 6) goto L36;
        java.lang.String r4 = abcd.IK.j6(r1, 5, r5);
        if (r12 == null) goto L34;
        if (r12.Zo() == false) goto L34;
        if (r12.getTarget().getName().equals(r4) == false) goto L34;
        r2.DW(r3);
        return r12;
    L34:
        return j6(r3, r13, r4);
    L36:
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().notARef, new java.lang.Object[]{r13, abcd.IK.j6(r1, 0, r5)}));
    L38:
        if (r5 >= 40) goto L58;
        return null;
    L58:
        abcd.yE r6 = abcd.yE.v5(r1, 0);     // Catch: java.lang.IllegalArgumentException -> L57
        if (r12 == null) goto L49;
        if (r12.Zo() == true) goto L49;
        if (r12.getTarget().DW().DW(r6) == false) goto L49;
        r2.DW(r3);     // Catch: java.lang.IllegalArgumentException -> L57
        return r12;
    L49:
        return new abcd.nH.f(r3, r13, r6);
    L50:
        if (r5 <= 0) goto L55;
        if (java.lang.Character.isWhitespace(r1[r5 - 1]) == false) goto L55;
        r5 = r5 - 1;
    L55:
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().notARef, new java.lang.Object[]{r13, abcd.IK.j6(r1, 0, r5)}));
    L56:
        return null;
    L8:
        r2 = null;
        goto L9
    }

    static abcd.nH.c j6(abcd.nH r0, abcd.nH.c r1, java.lang.String r2) {
        return r0.j6(r1, r2);
    }

    private static abcd.nH.e j6(abcd.LG r3, java.lang.String r4, java.lang.String r5) {
        return new abcd.nH.e(r3, r4, new abcd.BE.c(abcd.ME.a.j6, r5, null));
    }

    static java.io.File j6(abcd.nH r0) {
        return r0.v5;
    }

    private static java.lang.String j6(java.lang.String r2, int r3, int r4) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder(r4 - r3);
        r0.append(r2, r3, r4);
        return r0.toString();
    }

    private void j6(abcd.WG r8, KK<abcd.ME> r9, abcd.nH.g r10) {
        new abcd.mH(this, r9, r8, r10, r9).DW();
    }

    private void j6(abcd.nH.c r4) {
    L2:
        KK<abcd.nH.c> r0 = (abcd.KK) this.u7.get();
        KK<abcd.nH.c> r1 = r0.j6(r4);
        if (this.u7.compareAndSet(r0, r1) == false) goto L2;
        this.EQ.incrementAndGet();
        Hw();
    }

    static void j6(java.io.File r3, int r4) {
        int r1 = 0;
        if (r3.delete() == false) goto L5;
    L9:
        java.io.File r5 = r3.getParentFile();
    L10:
        if (r1 >= r4) goto L14;
        if (r5.delete() == false) goto L18;
        r5 = r5.getParentFile();
        r1 = r1 + 1;
        goto L10
    L18:
        return;
    L14:
        return;
    L5:
        if (r3.isFile() == false) goto L9;
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().fileCannotBeDeleted, new java.lang.Object[]{r3}));
    }

    private void j6(java.lang.String r7, byte[] r8) {
        java.io.File r0 = Zo(r7);
        if (VH() == false) goto L8;
        if (VH(r7) == false) goto L8;
    L9:
        boolean r9 = true;
    L11:
        if (r9 == false) goto L39;
        abcd.yH r10 = (abcd.yH) FH().Zo().j6(abcd.yH.j6);
        java.io.FileOutputStream r1 = new java.io.FileOutputStream(r0, true);     // Catch: java.io.FileNotFoundException -> L15
    L42:
    L35:
        th = move-exception;
        r1.close();
        throw th;
    L27:
        if (r10.FH() == false) goto L33;
        java.nio.channels.FileChannel r11 = r1.getChannel();     // Catch: java.lang.Throwable -> L35
        java.nio.ByteBuffer r12 = java.nio.ByteBuffer.wrap(r8);     // Catch: java.lang.Throwable -> L35
    L30:
        if (r12.remaining() <= 0) goto L31;
        r11.write(r12);     // Catch: java.lang.Throwable -> L35
        goto L30
    L31:
        r11.force(true);     // Catch: java.lang.Throwable -> L35
    L34:
        r1.close();
        return;
    L33:
        r1.write(r8);     // Catch: java.lang.Throwable -> L35
    L15:
        e = move-exception;
        java.io.File r4 = r0.getParentFile();
        if (r4.exists() == false) goto L19;
        throw e;
    L19:
        if (r4.mkdirs() == false) goto L21;
    L25:
        r1 = new java.io.FileOutputStream(r0, true);
        goto L42
    L21:
        if (r4.isDirectory() == true) goto L25;
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().cannotCreateDirectory, new java.lang.Object[]{r4}));
    L39:
        return;
    L8:
        if (r0.isFile() == true) goto L9;
        r9 = false;
        goto L11
    }

    private static boolean j6(byte[] r3, int r4) {
        if (r4 >= 6) goto L6;
        return false;
    L6:
        if (r3[0] == 114) goto L8;
    L16:
        return false;
    L8:
        if (r3[1] != 101) goto L16;
        if (r3[2] != 102) goto L16;
        if (r3[3] != 58) goto L16;
        if (r3[4] != 32) goto L16;
        return true;
    }

    static int v5(java.lang.String r3) {
        int r1 = r3.indexOf(47);
        int r2 = 0;
    L3:
        if (r1 < 0) goto L4;
        r2 = r2 + 1;
        r1 = r3.indexOf(47, r1 + 1);
        goto L3
    L4:
        return r2;
    }

    private KK<abcd.nH.c> v5() {
        KK<abcd.nH.c> r0 = (abcd.KK) this.u7.get();
        abcd.nH.d r1 = new abcd.nH.d(this, r0);
        r1.j6("");
        KK.a<abcd.nH.c> r2 = r1.Hw;
        if (r2 == null) goto L9;
        KK<abcd.nH.c> r3 = r2.FH();
        if (this.u7.compareAndSet(r0, r3) == false) goto L8;
        this.EQ.incrementAndGet();
    L8:
        return r3;
    L9:
        return r0;
    }

    @Override
    public java.util.Map<java.lang.String, abcd.ME> DW(java.lang.String r12) {
        abcd.nH.g r6 = Zo();
        abcd.KK r0 = this.u7.get();
        abcd.nH.d r1 = new abcd.nH.d(this, r0);
        r1.j6(r12);
        KK.a<abcd.nH.c> r2 = r1.Hw;
        if (r2 == null) goto L8;
        r2.DW();
        abcd.KK r3 = r1.Hw.FH();
        if (this.u7.compareAndSet(r0, r3) == false) goto L7;
        this.EQ.incrementAndGet();
    L7:
        r0 = r3;
    L8:
        Hw();
        KK.a<abcd.ME> r7 = r1.FH;
        abcd.KK r9 = r0;
        int r8 = 0;
    L10:
        if (r8 >= r7.j6()) goto L11;
        abcd.ME r10 = r7.j6(r8);
        abcd.ME r4 = j6(r10, 0, r12, r9, r6);
        if (r4 == null) goto L18;
        if (r4.DW() == null) goto L18;
        r7.j6(r8, r4);
        r8 = r8 + 1;
    L18:
        r7.DW(r8);
        int r5 = r9.DW(r10.getName());
        if (r5 < 0) goto L10;
        r9 = r9.remove(r5);
        goto L10
    L11:
        r7.DW();
        j6(r9);
        return new abcd.MK(r12, r6, r9, r7.FH());
    }

    @Override
    public void DW() {
        abcd.zK.DW(this.v5);
        abcd.zK.DW(this.Zo);
        abcd.zK.DW(this.VH);
        abcd.zK.DW(new java.io.File(this.v5, "refs/heads/".substring(5)));
        abcd.zK.DW(new java.io.File(this.v5, "refs/tags/".substring(5)));
        abcd.zK.DW(new java.io.File(this.VH, "refs/heads/".substring(5)));
    }

    abcd.UE FH() {
        return this.FH;
    }

    @Override
    public boolean FH(java.lang.String r8) {
        abcd.nH.g r0 = Zo();
        KK<abcd.nH.c> r1 = v5();
        int r3 = r8.lastIndexOf(47);
    L4:
        if (r3 <= 0) goto L5;
        java.lang.String r4 = r8.substring(0, r3);
        if (r1.j6(r4) == true) goto L22;
        if (r0.j6(r4) == true) goto L22;
        r3 = r8.lastIndexOf(47, r3 - 1);
    L22:
        return true;
    L5:
        java.lang.String r9 = java.lang.String.valueOf(r8) + '/';
        int r2 = -(r0.DW(r9) + 1);
        if (r2 < r0.size()) goto L8;
    L10:
        int r5 = -(r1.DW(r9) + 1);
        if (r5 < r1.size()) goto L13;
    L15:
        return false;
    L13:
        if (((abcd.nH.c) r1.get(r5)).getName().startsWith(r9) == false) goto L15;
        return true;
    L8:
        if (r0.get(r2).getName().startsWith(r9) == false) goto L10;
        return true;
    }

    java.io.File Hw(java.lang.String r3) {
        if (r3.startsWith("refs/") == false) goto L7;
        java.lang.String r4 = r3.substring(5);
        return new java.io.File(this.v5, r4);
    L7:
        return new java.io.File(this.Hw, r3);
    }

    java.io.File Zo(java.lang.String r3) {
        if (r3.startsWith("refs/") == false) goto L7;
        java.lang.String r4 = r3.substring(5);
        return new java.io.File(this.VH, r4);
    L7:
        return new java.io.File(this.Zo, r3);
    }

    @Override
    public abcd.ME j6(abcd.ME r6) {
        abcd.ME r0 = r6.v5();
        if (r0.Hw() == false) goto L5;
        return r6;
    L5:
        if (r0.DW() == null) goto L17;
        abcd.BE r1 = DW(r0);
        if (r0.j6().Hw() == false) goto L15;
        KK<abcd.nH.c> r2 = (abcd.KK) this.u7.get();
        int r3 = r2.DW(r0.getName());
        if (r3 < 0) goto L15;
        if (r2.get(r3) != r0) goto L15;
        KK<abcd.nH.c> r4 = r2.DW(r3, ((abcd.nH.c) r0).j6(r1));
        this.u7.compareAndSet(r2, r4);
    L15:
        return j6(r6, r1);
    L17:
        return r6;
    }

    @Override
    public abcd.ME j6(java.lang.String r7) {
        abcd.nH.g r5 = Zo();
        java.lang.String[] r0 = abcd.OE.j6;
        int r1 = r0.length;
        abcd.ME r2 = null;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        r2 = j6(java.lang.String.valueOf(r0[r3]) + r7, r5);
        if (r2 != null) goto L7;
        r3 = r3 + 1;
        goto L3
    L7:
        r2 = j6(r2, 0, null, null, r5);
    L8:
        Hw();
        return r2;
    }

    @Override
    public abcd.RE j6(java.lang.String r1, boolean r2) {
        return j6(r1, r2);
    }

    @Override
    public abcd.C1117oH j6(java.lang.String r7, boolean r8) {
        abcd.nH.g r5 = Zo();
        abcd.ME r1 = j6(r7, r5);
        if (r1 == null) goto L5;
        r1 = j6(r1, 0, null, null, r5);
    L5:
        boolean r0 = false;
        if (r1 != null) goto L8;
        r1 = new abcd.BE.c(abcd.ME.a.j6, r7, null);
    L14:
        abcd.C1117oH r9 = new abcd.C1117oH(this, r1);
        if (r0 == false) goto L17;
        r9.Ws();
    L17:
        return r9;
    L8:
        if (r8 == true) goto L10;
    L12:
        if (r0 == false) goto L14;
        r1 = new abcd.BE.c(abcd.ME.a.DW, r7, r1.DW());
        goto L14
    L10:
        if (r1.Zo() == false) goto L12;
        r0 = true;
        goto L12
    }

    @Override
    public void j6() {
    }

    void j6(abcd.RE r5, java.lang.String r6, boolean r7) {
        abcd.yE r0 = r5.Zo();
        abcd.yE r1 = r5.v5();
        abcd.ME r2 = r5.VH();
        abcd.KE r8 = r5.u7();
        if (r8 != null) goto L5;
        abcd.KE r9 = new abcd.KE(this.FH);
    L6:
        byte[] r10 = abcd.hE.j6(abcd.yE.j6(r0) + ' ' + abcd.yE.j6(r1) + ' ' + r9.Hw() + '\t' + r6 + '\n');
        if (r7 == true) goto L9;
    L11:
        j6(r2.getName(), r10);
        return;
    L9:
        if (r2.Zo() == false) goto L11;
        j6(r2.getName(), r10);
        j6(r2.v5().getName(), r10);
        return;
    L5:
        r9 = new abcd.KE(r8);
        goto L6
    }

    void j6(abcd.C1117oH r7) {
        abcd.ME r0 = r7.VH().v5();
        java.lang.String r1 = r0.getName();
        abcd.nH.g r2 = Zo();
        if (r2.j6(r1) == false) goto L15;
        abcd.WG r3 = new abcd.WG(this.gn, r7.EQ().gn());
        if (r3.Hw() == false) goto L14;
        abcd.nH.g r4 = gn();     // Catch: java.lang.Throwable -> L10
        int r5 = r4.DW(r1);     // Catch: java.lang.Throwable -> L10
        if (r5 < 0) goto L9;
        j6(r3, r4.remove(r5), r2);     // Catch: java.lang.Throwable -> L10
    L9:
        r3.v5();
    L10:
        th = move-exception;
        r3.v5();
        throw th;
    L14:
        throw new abcd.dD(this.gn);
    L15:
        KK<abcd.nH.c> r6 = (abcd.KK) this.u7.get();
        int r8 = r6.DW(r1);
        if (r8 < 0) goto L20;
        if (this.u7.compareAndSet(r6, r6.remove(r8)) == false) goto L15;
    L20:
        int r9 = v5(r1) - 2;
        j6(Zo(r1), r9);
        if (r0.j6().Hw() == false) goto L23;
        r7.QX();
        j6(Hw(r1), r9);
    L23:
        this.EQ.incrementAndGet();
        Hw();
    }

    void j6(abcd.C1117oH r3, abcd.LG r4) {
        abcd.yE r0 = r3.v5().Hw();
        j6(new abcd.nH.f(r4, r3.VH().v5().getName(), r0));
    }

    void j6(abcd.C1117oH r1, abcd.LG r2, java.lang.String r3) {
        j6(j6(r2, r1.VH().getName(), r3));
        Hw();
    }
}
