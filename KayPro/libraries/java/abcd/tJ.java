package abcd;

public class tJ extends abcd.AbstractC0642dJ implements abcd.BI {
    static final abcd.DJ a8 = null;

    private class a implements abcd.ZI {
        final abcd.tJ j6;

        private a(abcd.tJ r1) {
            this.j6 = r1;
        }

        a(abcd.tJ r1, abcd.tJ.a r2) {
            this(r1);
        }

        @Override
        public void disconnect() {
        }

        @Override
        public java.lang.Process j6(java.lang.String r4, int r5) {
            java.lang.String r6 = abcd.QK.FH().DW("GIT_SSH");
            boolean r0 = r6.toLowerCase().contains("plink");
            java.util.ArrayList r1 = new java.util.ArrayList();
            r1.add(r6);
            if (r0 == false) goto L8;
            if (r6.toLowerCase().contains("tortoiseplink") == true) goto L8;
            r1.add("-batch");
        L8:
            if (this.j6.tp().v5() <= 0) goto L14;
            if (r0 == false) goto L11;
            java.lang.String r7 = "-P";
        L12:
            r1.add(r7);
            r1.add(java.lang.String.valueOf(this.j6.tp().v5()));
            goto L14
        L11:
            r7 = "-p";
        L14:
            if (this.j6.tp().gn() == null) goto L16;
            r1.add(java.lang.String.valueOf(this.j6.tp().gn()) + "@" + this.j6.tp().j6());
        L17:
            r1.add(r4);
            java.lang.ProcessBuilder r8 = new java.lang.ProcessBuilder(new java.lang.String[0]);
            r8.command(r1);
            if (this.j6.v5.VH() == null) goto L25;
            r8.environment().put("GIT_DIR", this.j6.v5.VH().getPath());
        L25:
            return r8.start();
        L22:
            e = move-exception;
            throw new abcd.yD(e.getMessage(), e);
        L16:
            r1.add(this.j6.tp().j6());
            goto L17
        }
    }

    class b extends abcd.AbstracteI {
        private abcd.YK cn;
        private final java.lang.Process ro;
        final abcd.tJ sh;

        b(abcd.tJ r5) {
            this.sh = r5;
            super(r5);
            this.ro = r5.aM().j6(r5.FH(r5.v5()), r5.gn());     // Catch: java.io.IOException -> L9 abcd.yD -> L12
            abcd.WK r0 = new abcd.WK();     // Catch: java.io.IOException -> L9 abcd.yD -> L12
            j6(r0);     // Catch: java.io.IOException -> L9 abcd.yD -> L12
            this.cn = new abcd.YK(this.ro.getErrorStream(), r0.j6());     // Catch: java.io.IOException -> L9 abcd.yD -> L12
            this.cn.start();     // Catch: java.io.IOException -> L9 abcd.yD -> L12
            j6(this.ro.getInputStream(), this.ro.getOutputStream());     // Catch: java.io.IOException -> L9 abcd.yD -> L12
            EQ();     // Catch: abcd.hD -> L6
            return;
        L6:
            e = move-exception;
            java.lang.String r1 = j6();
            r5.j6(this.ro.exitValue(), r5.v5(), r1);
            throw r5.j6(e, r1);
        L12:
            e = move-exception;
            close();
            throw e;
        L9:
            e = move-exception;
            close();
            throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().remoteHungUpUnexpectedly, e);
        }

        @Override
        public void close() {
            u7();
            abcd.YK r0 = this.cn;
            if (r0 != null) goto L16;
        L11:
            super.close();
            java.lang.Process r1 = this.ro;
            if (r1 == null) goto L18;
            r1.destroy();
            return;
        L18:
            return;
        L16:
            r0.DW();     // Catch: java.lang.Throwable -> L7 java.lang.InterruptedException -> L15
        L7:
            th = move-exception;
            this.cn = null;
            throw th;
        L10:
            this.cn = null;
            goto L11
        }
    }

    class c extends abcd.AbstractC0772gI {
        final abcd.tJ BT;
        private abcd.YK gW;
        private final java.lang.Process yS;

        c(abcd.tJ r5) {
            this.BT = r5;
            super(r5);
            this.yS = r5.aM().j6(r5.FH(r5.Hw()), r5.gn());     // Catch: java.io.IOException -> L9 abcd.yD -> L12
            abcd.WK r0 = new abcd.WK();     // Catch: java.io.IOException -> L9 abcd.yD -> L12
            j6(r0);     // Catch: java.io.IOException -> L9 abcd.yD -> L12
            this.gW = new abcd.YK(this.yS.getErrorStream(), r0.j6());     // Catch: java.io.IOException -> L9 abcd.yD -> L12
            this.gW.start();     // Catch: java.io.IOException -> L9 abcd.yD -> L12
            j6(this.yS.getInputStream(), this.yS.getOutputStream());     // Catch: java.io.IOException -> L9 abcd.yD -> L12
            EQ();     // Catch: abcd.hD -> L6
            return;
        L6:
            e = move-exception;
            java.lang.String r1 = j6();
            r5.j6(this.yS.exitValue(), r5.Hw(), r1);
            throw r5.j6(e, r1);
        L12:
            e = move-exception;
            close();
            throw e;
        L9:
            e = move-exception;
            close();
            throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().remoteHungUpUnexpectedly, e);
        }

        @Override
        public void close() {
            u7();
            abcd.YK r0 = this.gW;
            if (r0 != null) goto L16;
        L11:
            super.close();
            java.lang.Process r1 = this.yS;
            if (r1 == null) goto L18;
            r1.destroy();
            return;
        L18:
            return;
        L16:
            r0.DW();     // Catch: java.lang.Throwable -> L7 java.lang.InterruptedException -> L15
        L7:
            th = move-exception;
            this.gW = null;
            throw th;
        L10:
            this.gW = null;
            goto L11
        }
    }

    static {
        a8 = new abcd.C1246rJ();
    }

    tJ(abcd.UE r1, abcd.HJ r2) {
        super(r1, r2);
        if (j3() == false) goto L6;
        j6(new abcd.sJ(this));
        return;
    }

    private static boolean j3() {
        if (abcd.QK.FH().DW("GIT_SSH") == null) goto L6;
        return true;
    L6:
        return false;
    }

    java.lang.String FH(java.lang.String r4) {
        java.lang.String r0 = this.Zo.Hw();
        if (this.Zo.VH() == null) goto L8;
        if (this.Zo.Hw().startsWith("/~") == false) goto L8;
        r0 = this.Zo.Hw().substring(1);
    L8:
        return r4 + ' ' + abcd.GK.DW.j6(r0);
    }

    @Override
    public abcd.InterfacenI QX() {
        return new abcd.tJ.b(this);
    }

    @Override
    public abcd.LI XL() {
        return new abcd.tJ.c(this);
    }

    abcd.hD j6(abcd.hD r3, java.lang.String r4) {
        if (r4 != null) goto L4;
        return r3;
    L4:
        if (r4.length() == 0) goto L17;
        java.lang.String r5 = this.Zo.Hw();
        if (this.Zo.VH() != null) goto L9;
    L11:
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append("fatal: ");
        r0.append(abcd.GK.DW.j6(r5));
        r0.append(": ");
        if (r4.startsWith(r0.toString()) == false) goto L15;
        r4 = r4.substring(r0.length());
    L15:
        return new abcd.hD(this.Zo, r4);
    L9:
        if (this.Zo.Hw().startsWith("/~") == false) goto L11;
        r5 = this.Zo.Hw().substring(1);
        goto L11
    L17:
        return r3;
    }

    void j6(int r5, java.lang.String r6, java.lang.String r7) {
        if (r5 != 127) goto L11;
        java.io.IOException r8 = null;
        if (r7 == null) goto L10;
        if (r7.length() <= 0) goto L10;
        r8 = new java.io.IOException(r7);
    L10:
        throw new abcd.yD(this.Zo, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().cannotExecute, new java.lang.Object[]{FH(r6)}), r8);
    }
}
