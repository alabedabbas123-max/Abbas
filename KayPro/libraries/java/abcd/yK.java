package abcd;

class yK extends abcd.vK {
    private static java.lang.String Hw;

    yK() {
    }

    static boolean u7() {
        java.lang.String r0 = (java.lang.String) java.security.AccessController.doPrivileged(new abcd.wK());
        if (r0 != null) goto L5;
        return false;
    L5:
        java.io.File r1 = abcd.AbstractpK.DW(r0, new java.lang.String[]{"cygpath.exe"});
        if (r1 == null) goto L9;
        Hw = r1.getPath();
    L9:
        if (Hw == null) goto L11;
        return true;
    L11:
        return false;
    }

    @Override
    protected java.io.File VH() {
        java.lang.String r0 = (java.lang.String) java.security.AccessController.doPrivileged(new abcd.xK(this));
        if (r0 == null) goto L10;
        if (r0.length() == 0) goto L10;
        return j6(new java.io.File("."), r0);
    L10:
        return super.VH();
    }

    @Override
    public java.io.File j6(java.io.File r4, java.lang.String r5) {
        java.lang.String r0 = java.lang.System.getProperty("jgit.usecygpath");
        if (r0 == null) goto L11;
        if (r0.equals("true") == false) goto L11;
        java.lang.String r1 = abcd.AbstractpK.j6(r4, new java.lang.String[]{Hw, "--windows", "--absolute", r5}, "UTF-8");
        if (r1 == null) goto L11;
        return new java.io.File(r1);
    L11:
        return super.j6(r4, r5);
    }

    @Override
    public java.lang.ProcessBuilder j6(java.lang.String r4, java.lang.String[] r5) {
        java.util.ArrayList r0 = new java.util.ArrayList(r5.length + 4);
        r0.add("sh.exe");
        r0.add("-c");
        r0.add(java.lang.String.valueOf(r4) + " \"$@\"");
        r0.add(r4);
        r0.addAll(java.util.Arrays.asList(r5));
        java.lang.ProcessBuilder r6 = new java.lang.ProcessBuilder(new java.lang.String[0]);
        r6.command(r0);
        return r6;
    }
}
