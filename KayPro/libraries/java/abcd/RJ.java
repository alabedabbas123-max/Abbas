package abcd;

abstract class RJ {

    static final class a {
        final long DW;
        final java.io.InputStream j6;

        a(java.io.InputStream r1, long r2) {
            this.j6 = r1;
            this.DW = r2;
        }

        byte[] j6() {
        L13:
            th = move-exception;
            this.j6.close();
            throw th;
        L3:
            if (this.DW < 0) goto L7;
            byte[] r0 = new byte[(int) this.DW];     // Catch: java.lang.Throwable -> L13
            abcd.BK.j6(this.j6, r0, 0, r0.length);     // Catch: java.lang.Throwable -> L13
        L5:
            this.j6.close();
            return r0;
        L7:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream();     // Catch: java.lang.Throwable -> L13
            byte[] r2 = new byte[2048];     // Catch: java.lang.Throwable -> L13
        L8:
            int r3 = this.j6.read(r2);     // Catch: java.lang.Throwable -> L13
            if (r3 < 0) goto L10;
            r1.write(r2, 0, r3);     // Catch: java.lang.Throwable -> L13
            goto L8
        L10:
            r0 = r1.toByteArray();     // Catch: java.lang.Throwable -> L13
            goto L5
        }
    }

    RJ() {
    }

    private void j6(java.util.Map<java.lang.String, abcd.ME> r8, java.io.BufferedReader r9) {
        abcd.ME r1 = null;
        boolean r2 = false;
    L3:
        java.lang.String r3 = r9.readLine();
        if (r3 == null) goto L5;
        if (r3.charAt(0) == '#') goto L9;
        if (r3.charAt(0) == '^') goto L13;
        int r4 = r3.indexOf(32);
        if (r4 < 0) goto L25;
        abcd.yE r5 = abcd.yE.j6(r3.substring(0, r4));
        java.lang.String r6 = r3.substring(r4 + 1);
        if (r2 == false) goto L22;
        abcd.ME r7 = new abcd.BE.a(abcd.ME.a.FH, r6, r5);
    L23:
        r1 = r7;
        r8.put(r1.getName(), r1);
        goto L3
    L22:
        r7 = new abcd.BE.c(abcd.ME.a.FH, r6, r5);
        goto L23
    L25:
        throw new abcd.yD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unrecognizedRef, new java.lang.Object[]{r3}));
    L13:
        if (r1 == null) goto L16;
        abcd.BE.b r10 = new abcd.BE.b(abcd.ME.a.FH, r1.getName(), r1.DW(), abcd.yE.j6(r3.substring(1)));
        r8.put(r10.getName(), r10);
        r1 = r10;
        goto L3
    L16:
        throw new abcd.yD(org.eclipse.jgit.JGitText.j6().peeledLineBeforeRef);
    L9:
        if (r3.startsWith("# pack-refs with:") == false) goto L3;
        r2 = r3.substring(17).contains(" peeled");
        goto L3
    }

    abstract java.util.Collection<abcd.RJ> DW();

    void DW(java.lang.String r3) {
        j6("../" + r3);
    }

    abstract java.util.Collection<java.lang.String> FH();

    void FH(java.lang.String r3) {
        j6("../logs/" + r3);
    }

    abstract abcd.HJ Hw();

    abstract abcd.RJ.a Hw(java.lang.String r1);

    java.util.Collection<abcd.RJ> VH(java.lang.String r5) {
        java.io.BufferedReader r6 = Zo(r5);
        java.util.ArrayList r1 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L13
    L4:
        java.lang.String r2 = r6.readLine();     // Catch: java.lang.Throwable -> L13
        if (r2 == null) goto L6;
        if (r2.endsWith("/") == true) goto L11;
        r2 = java.lang.String.valueOf(r2) + "/";     // Catch: java.lang.Throwable -> L13
    L11:
        r1.add(v5(r2));     // Catch: java.lang.Throwable -> L13
        goto L4
    L6:
        r6.close();
        return r1;
    L13:
        th = move-exception;
        r6.close();
        throw th;
    }

    java.io.BufferedReader Zo(java.lang.String r4) {
        return new java.io.BufferedReader(new java.io.InputStreamReader(Hw(r4).j6, abcd.hE.Zo));
    }

    java.io.OutputStream j6(java.lang.String r3, abcd.LE r4, java.lang.String r5) {
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().writingNotSupported, new java.lang.Object[]{r3}));
    }

    abstract void j6();

    void j6(java.lang.String r5) {
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().deletingNotSupported, new java.lang.Object[]{r5}));
    }

    void j6(java.lang.String r3, abcd.yE r4) {
        java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream(41);
        r4.DW(r0);
        r0.write(10);
        j6("../" + r3, r0.toByteArray());
    }

    void j6(java.lang.String r2, byte[] r3) {
        java.io.OutputStream r4 = j6(r2, null, null);
        r4.write(r3);     // Catch: java.lang.Throwable -> L6
        r4.close();
        return;
    L6:
        th = move-exception;
        r4.close();
        throw th;
    }

    void j6(java.util.Collection<java.lang.String> r4) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        java.util.Iterator<java.lang.String> r5 = r4.iterator();
    L4:
        if (r5.hasNext() == false) goto L5;
        java.lang.String r1 = r5.next();
        r0.append("P ");
        r0.append(r1);
        r0.append('\n');
        goto L4
    L5:
        j6("info/packs", abcd.hE.DW(r0.toString()));
    }

    protected void j6(java.util.Map<java.lang.String, abcd.ME> r4) {
        java.io.BufferedReader r0 = Zo("../packed-refs");     // Catch: java.io.IOException -> L8 java.io.FileNotFoundException -> L12
        j6(r4, r0);     // Catch: java.lang.Throwable -> L5
        r0.close();     // Catch: java.io.IOException -> L8 java.io.FileNotFoundException -> L12
        return;
    L5:
        th = move-exception;
        r0.close();     // Catch: java.io.IOException -> L8 java.io.FileNotFoundException -> L12
        throw th;     // Catch: java.io.IOException -> L8 java.io.FileNotFoundException -> L12
    L8:
        e = move-exception;
        throw new abcd.yD(Hw(), org.eclipse.jgit.JGitText.j6().errorInPackedRefs, e);
    }

    abstract abcd.RJ v5(java.lang.String r1);
}
