package abcd;

class vK extends abcd.AbstractpK {
    vK() {
    }

    static boolean gn() {
        java.lang.String r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = (java.lang.String) java.security.AccessController.doPrivileged(new abcd.uK());
                    if (r0 != null) { $pc0 = 5; continue $sw0; }
                    return false;
                }
                case 5: {
                    if (abcd.NK.Hw(r0).indexOf("windows") == (-1)) { $pc0 = 10; continue $sw0; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected java.io.File DW() {
        java.io.File r0 = null;
        java.lang.String r1 = null;
        java.io.File r2 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = abcd.AbstractpK.DW(abcd.QK.FH().DW("PATH"), new java.lang.String[]{"git.exe", "git.cmd"});
                    if (r0 != null) { $pc1 = 5; continue $sw1; }
                    r1 = abcd.AbstractpK.j6(Zo(), new java.lang.String[]{"bash", "--login", "-c", "which git"}, java.nio.charset.Charset.defaultCharset().name());
                    if (r1 == null) { $pc1 = 12; continue $sw1; }
                    r2 = j6(null, r1);
                    if (r2 == null) { $pc1 = 12; continue $sw1; }
                    return r2.getParentFile().getParentFile();
                }
                case 12: {
                    return null;
                }
                case 5: {
                    return r0.getParentFile().getParentFile();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean Hw() {
        return true;
    }

    @Override
    protected java.io.File VH() {
        java.lang.String r0 = null;
        java.lang.String r1 = null;
        java.lang.String r2 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = abcd.QK.FH().DW("HOME");
                    if (r0 != null) { $pc2 = 5; continue $sw2; }
                    r1 = abcd.QK.FH().DW("HOMEDRIVE");
                    if (r1 != null) { $pc2 = 9; continue $sw2; }
                    r2 = abcd.QK.FH().DW("HOMESHARE");
                    if (r2 == null) { $pc2 = 15; continue $sw2; }
                    return new java.io.File(r2);
                }
                case 15: {
                    return super.VH();
                }
                case 9: {
                    return new java.io.File(r1, abcd.QK.FH().DW("HOMEPATH"));
                }
                case 5: {
                    return j6(null, r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
