package abcd;

class vK extends abcd.AbstractpK {
    vK() {
    }

    static boolean gn() {
        java.lang.String r0 = (java.lang.String) java.security.AccessController.doPrivileged(new abcd.uK());
        if (r0 != null) goto L5;
        return false;
    L5:
        if (abcd.NK.Hw(r0).indexOf("windows") == (-1)) goto L10;
        return true;
    L10:
        return false;
    }

    @Override
    protected java.io.File DW() {
        java.io.File r0 = abcd.AbstractpK.DW(abcd.QK.FH().DW("PATH"), new java.lang.String[]{"git.exe", "git.cmd"});
        if (r0 != null) goto L5;
        java.lang.String r1 = abcd.AbstractpK.j6(Zo(), new java.lang.String[]{"bash", "--login", "-c", "which git"}, java.nio.charset.Charset.defaultCharset().name());
        if (r1 == null) goto L12;
        java.io.File r2 = j6(null, r1);
        if (r2 == null) goto L12;
        return r2.getParentFile().getParentFile();
    L12:
        return null;
    L5:
        return r0.getParentFile().getParentFile();
    }

    @Override
    public boolean Hw() {
        return true;
    }

    @Override
    protected java.io.File VH() {
        java.lang.String r0 = abcd.QK.FH().DW("HOME");
        if (r0 != null) goto L5;
        java.lang.String r1 = abcd.QK.FH().DW("HOMEDRIVE");
        if (r1 != null) goto L9;
        java.lang.String r2 = abcd.QK.FH().DW("HOMESHARE");
        if (r2 == null) goto L15;
        return new java.io.File(r2);
    L15:
        return super.VH();
    L9:
        return new java.io.File(r1, abcd.QK.FH().DW("HOMEPATH"));
    L5:
        return j6(null, r0);
    }

    @Override
    public java.lang.ProcessBuilder j6(java.lang.String r3, java.lang.String[] r4) {
        java.util.ArrayList r0 = new java.util.ArrayList(r4.length + 3);
        r0.add("cmd.exe");
        r0.add("/c");
        r0.add(r3);
        r0.addAll(java.util.Arrays.asList(r4));
        java.lang.ProcessBuilder r5 = new java.lang.ProcessBuilder(new java.lang.String[0]);
        r5.command(r0);
        return r5;
    }

    @Override
    public boolean j6(java.io.File r1) {
        return false;
    }

    @Override
    public boolean j6(java.io.File r1, boolean r2) {
        return false;
    }

    @Override
    public boolean v5() {
        return false;
    }
}
