package abcd;

public class GJ extends abcd.AbstractC0642dJ implements abcd.SJ {
    static final abcd.DJ a8 = null;

    class a extends abcd.RJ {
        private com.jcraft.jsch.ChannelSftp DW;
        final abcd.GJ FH;
        private final java.lang.String j6;

        a(abcd.GJ r4, abcd.GJ.a r5, java.lang.String r6) {
            this.FH = r4;
            this.DW = r4.j3();     // Catch: com.jcraft.jsch.SftpException -> L5 abcd.yD -> L8
            this.DW.DW(r5.j6);     // Catch: com.jcraft.jsch.SftpException -> L5 abcd.yD -> L8
            this.DW.DW(r6);     // Catch: com.jcraft.jsch.SftpException -> L5 abcd.yD -> L8
            this.j6 = this.DW.j3();     // Catch: com.jcraft.jsch.SftpException -> L5 abcd.yD -> L8
            return;
        L8:
            e = move-exception;
            j6();
            throw e;
        L5:
            e = move-exception;
            throw new abcd.yD("Can't enter " + r6 + " from " + r5.j6 + ": " + e.getMessage(), e);
        }

        a(abcd.GJ r4, java.lang.String r5) {
            this.FH = r4;
            if (r5.startsWith("/~") == false) goto L6;
            r5 = r5.substring(1);
        L6:
            if (r5.startsWith("~/") == false) goto L16;
            r5 = r5.substring(2);
        L16:
            this.DW = r4.j3();     // Catch: com.jcraft.jsch.SftpException -> L10 abcd.yD -> L13
            this.DW.DW(r5);     // Catch: com.jcraft.jsch.SftpException -> L10 abcd.yD -> L13
            this.DW.DW("objects");     // Catch: com.jcraft.jsch.SftpException -> L10 abcd.yD -> L13
            this.j6 = this.DW.j3();     // Catch: com.jcraft.jsch.SftpException -> L10 abcd.yD -> L13
            return;
        L13:
            e = move-exception;
            j6();
            throw e;
        L10:
            e = move-exception;
            throw new abcd.yD("Can't enter " + r5 + "/objects: " + e.getMessage(), e);
        }

        private abcd.ME DW(java.util.TreeMap<java.lang.String, abcd.ME> r5, java.lang.String r6, java.lang.String r7) {
            java.io.BufferedReader r2 = Zo(r6);     // Catch: java.io.IOException -> L27 java.io.FileNotFoundException -> L30
            java.lang.String r3 = r2.readLine();     // Catch: java.lang.Throwable -> L24
            r2.close();     // Catch: java.io.IOException -> L27 java.io.FileNotFoundException -> L30
            if (r3 == null) goto L23;
            if (r3.startsWith("ref: ") == false) goto L17;
            java.lang.String r8 = r3.substring(5);
            abcd.ME r0 = r5.get(r8);
            if (r0 != null) goto L12;
            r0 = DW(r5, "../" + r8, r8);
        L12:
            if (r0 != null) goto L14;
            r0 = new abcd.BE.c(abcd.ME.a.j6, r8, null);
        L14:
            abcd.kF r9 = new abcd.kF(r7, r0);
            r5.put(r9.getName(), r9);
            return r9;
        L17:
            if (abcd.yE.DW(r3) == false) goto L21;
            abcd.BE.c r10 = new abcd.BE.c(j6(r5.get(r7)), r7, abcd.yE.j6(r3));
            r5.put(r10.getName(), r10);
            return r10;
        L21:
            throw new abcd.yD("Bad ref: " + r7 + ": " + r3);
        L23:
            throw new abcd.yD("Empty ref: " + r7);
        L24:
            th = move-exception;
            r2.close();     // Catch: java.io.IOException -> L27 java.io.FileNotFoundException -> L30
            throw th;     // Catch: java.io.IOException -> L27 java.io.FileNotFoundException -> L30
        L30:
            return null;
        L27:
            e = move-exception;
            throw new abcd.yD("Cannot read " + this.j6 + "/" + r6 + ": " + e.getMessage(), e);
        }

        private void gn(java.lang.String r5) {
            int r0 = r5.lastIndexOf(47);
            if (r0 > 0) goto L5;
            return;
        L5:
            java.lang.String r6 = r5.substring(0, r0);
            this.DW.Zo(r6);     // Catch: com.jcraft.jsch.SftpException -> L8
            return;
        L8:
            e = e;
            if (e.j6 != 2) goto L16;
            gn(r6);
            this.DW.Zo(r6);     // Catch: com.jcraft.jsch.SftpException -> L14
            return;
        L14:
            e = e;
        L16:
            throw new abcd.yD("Can't mkdir " + this.j6 + "/" + r6 + ": " + e.getMessage(), e);
        }

        private abcd.ME.a j6(abcd.ME r2) {
            if (r2 == null) goto L8;
            if (r2.j6() != abcd.ME.a.FH) goto L8;
            return abcd.ME.a.Hw;
        L8:
            return abcd.ME.a.DW;
        }

        private void j6(java.util.TreeMap<java.lang.String, abcd.ME> r7, java.lang.String r8, java.lang.String r9) {
            java.util.Iterator r1 = this.DW.Hw(r8).iterator();
        L6:
            if (r1.hasNext() == false) goto L7;
            com.jcraft.jsch.ChannelSftp.LsEntry r2 = (com.jcraft.jsch.ChannelSftp.LsEntry) r1.next();
            java.lang.String r3 = r2.Zo();
            if (".".equals(r3) == true) goto L6;
            if ("..".equals(r3) == true) goto L6;
            java.lang.String r4 = java.lang.String.valueOf(r8) + "/" + r3;
            if (r2.Hw().gn() == true) goto L15;
            DW(r7, r4, java.lang.String.valueOf(r9) + r3);
            goto L6
        L15:
            j6(r7, r4, java.lang.String.valueOf(r9) + r3 + "/");
            goto L6
        L7:
            return;
        L17:
            e = move-exception;
            throw new abcd.yD("Can't ls " + this.j6 + "/" + r8 + ": " + e.getMessage(), e);
        }

        @Override
        java.util.Collection<abcd.RJ> DW() {
            return VH("info/alternates");
        L4:
            return null;
        }

        @Override
        java.util.Collection<java.lang.String> FH() {
            java.util.ArrayList r0 = new java.util.ArrayList();
            java.util.Vector r1 = this.DW.Hw("pack");     // Catch: com.jcraft.jsch.SftpException -> L22
            java.util.HashMap r2 = new java.util.HashMap();     // Catch: com.jcraft.jsch.SftpException -> L22
            java.util.HashMap r3 = new java.util.HashMap();     // Catch: com.jcraft.jsch.SftpException -> L22
            java.util.Iterator r4 = r1.iterator();     // Catch: com.jcraft.jsch.SftpException -> L22
        L5:
            if (r4.hasNext() == false) goto L6;
            com.jcraft.jsch.ChannelSftp.LsEntry r5 = (com.jcraft.jsch.ChannelSftp.LsEntry) r4.next();     // Catch: com.jcraft.jsch.SftpException -> L22
            r2.put(r5.Zo(), r5);     // Catch: com.jcraft.jsch.SftpException -> L22
            goto L5
        L6:
            java.util.Iterator r6 = r1.iterator();     // Catch: com.jcraft.jsch.SftpException -> L22
        L8:
            if (r6.hasNext() == false) goto L9;
            com.jcraft.jsch.ChannelSftp.LsEntry r7 = (com.jcraft.jsch.ChannelSftp.LsEntry) r6.next();     // Catch: com.jcraft.jsch.SftpException -> L22
            java.lang.String r8 = r7.Zo();     // Catch: com.jcraft.jsch.SftpException -> L22
            if (r8.startsWith("pack-") == false) goto L8;
            if (r8.endsWith(".pack") == false) goto L8;
            if (r2.containsKey(java.lang.String.valueOf(r8.substring(0, r8.length() - 5)) + ".idx") == false) goto L8;
            r3.put(r8, java.lang.Integer.valueOf(r7.Hw().FH()));     // Catch: com.jcraft.jsch.SftpException -> L22
            r0.add(r8);     // Catch: com.jcraft.jsch.SftpException -> L22
            goto L8
        L9:
            java.util.Collections.sort(r0, new abcd.FJ(this, r3));     // Catch: com.jcraft.jsch.SftpException -> L22
            return r0;
        L22:
            e = move-exception;
            throw new abcd.yD("Can't ls " + this.j6 + "/pack: " + e.getMessage(), e);
        }

        @Override
        abcd.HJ Hw() {
            return this.FH.Zo.FH(this.j6);
        }

        @Override
        abcd.RJ.a Hw(java.lang.String r6) {
            return new abcd.RJ.a(this.DW.FH(r6), this.DW.v5(r6).Zo());
        L4:
            e = move-exception;
            if (e.j6 != 2) goto L10;
            throw new java.io.FileNotFoundException(r6);
        L10:
            throw new abcd.yD("Can't get " + this.j6 + "/" + r6 + ": " + e.getMessage(), e);
        }

        @Override
        java.io.OutputStream j6(java.lang.String r3, abcd.LE r4, java.lang.String r5) {
            return this.DW.VH(r3);
        L4:
            e = e;
            if (e.j6 != 2) goto L12;
            gn(r3);
            return this.DW.VH(r3);
        L10:
            e = e;
        L12:
            throw new abcd.yD("Can't write " + this.j6 + "/" + r3 + ": " + e.getMessage(), e);
        }

        @Override
        void j6() {
            com.jcraft.jsch.ChannelSftp r0 = this.DW;
            if (r0 != null) goto L13;
            return;
        L13:
        L9:
            th = move-exception;
            this.DW = null;
            throw th;
        L6:
            if (r0.J0() == false) goto L8;
            this.DW.DW();     // Catch: java.lang.Throwable -> L9
        L8:
            this.DW = null;
        }

        @Override
        void j6(java.lang.String r5) {
            this.DW.gn(r5);     // Catch: com.jcraft.jsch.SftpException -> L10
            int r1 = r5.lastIndexOf(47);
        L4:
            if (r1 <= 0) goto L24;
            r5 = r5.substring(0, r1);     // Catch: com.jcraft.jsch.SftpException -> L17
            this.DW.u7(r5);     // Catch: com.jcraft.jsch.SftpException -> L17
            r1 = r5.lastIndexOf(47);     // Catch: com.jcraft.jsch.SftpException -> L17
        L9:
            return;
        L24:
            return;
        L10:
            e = move-exception;
            if (e.j6 != 2) goto L15;
            return;
        L15:
            throw new abcd.yD("Can't delete " + this.j6 + "/" + r5 + ": " + e.getMessage(), e);
        }

        @Override
        void j6(java.lang.String r5, byte[] r6) {
            java.lang.String r0 = java.lang.String.valueOf(r5) + ".lock";
            super.j6(r0, r6);     // Catch: java.io.IOException -> L9
            this.DW.j6(r0, r5);     // Catch: com.jcraft.jsch.SftpException -> L6 java.io.IOException -> L9
            return;
        L6:
            e = move-exception;
            throw new abcd.yD("Can't write " + this.j6 + "/" + r5 + ": " + e.getMessage(), e);     // Catch: java.io.IOException -> L9
        L9:
            e = move-exception;
            this.DW.gn(r0);     // Catch: com.jcraft.jsch.SftpException -> L12
        L11:
            throw e;
        }

        @Override
        abcd.RJ v5(java.lang.String r3) {
            return new abcd.GJ.a(this.FH, this, r3);
        }

        java.util.Map<java.lang.String, abcd.ME> v5() {
            java.util.TreeMap<java.lang.String, abcd.ME> r0 = new java.util.TreeMap();
            j6(r0);
            DW(r0, "../HEAD", "HEAD");
            j6(r0, "../refs", "refs/");
            return r0;
        }
    }

    static {
        a8 = new abcd.EJ();
    }

    GJ(abcd.UE r1, abcd.HJ r2) {
        super(r1, r2);
    }

    @Override
    public abcd.InterfacenI QX() {
        abcd.GJ.a r0 = new abcd.GJ.a(this, this.Zo.Hw());
        abcd.OJ r1 = new abcd.OJ(this, r0);
        r1.j6(r0.v5());
        return r1;
    }

    @Override
    public abcd.LI XL() {
        abcd.GJ.a r0 = new abcd.GJ.a(this, this.Zo.Hw());
        abcd.QJ r1 = new abcd.QJ(this, r0);
        r1.j6(r0.v5());
        return r1;
    }

    com.jcraft.jsch.ChannelSftp j3() {
        if (gn() <= 0) goto L5;
        int r0 = gn() * 1000;
    L11:
        com.jcraft.jsch.Channel r1 = ((abcd.vI) aM()).j6();     // Catch: com.jcraft.jsch.JSchException -> L8
        r1.j6(r0);     // Catch: com.jcraft.jsch.JSchException -> L8
        return (com.jcraft.jsch.ChannelSftp) r1;
    L8:
        e = move-exception;
        throw new abcd.yD(this.Zo, e.getMessage(), e);
    L5:
        r0 = 0;
        goto L11
    }
}
