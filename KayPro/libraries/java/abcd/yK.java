package abcd;

class yK extends abcd.vK {
    private static java.lang.String Hw;

    yK() {
    }

    static boolean u7() {
        java.lang.String r0 = null;
        java.io.File r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = (java.lang.String) java.security.AccessController.doPrivileged(new abcd.wK());
                    if (r0 != null) { $pc0 = 5; continue $sw0; }
                    return false;
                }
                case 5: {
                    r1 = abcd.AbstractpK.DW(r0, new java.lang.String[]{"cygpath.exe"});
                    if (r1 == null) { $pc0 = 9; continue $sw0; }
                    Hw = r1.getPath();
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (Hw == null) { $pc0 = 11; continue $sw0; }
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected java.io.File VH() {
        java.lang.String r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = (java.lang.String) java.security.AccessController.doPrivileged(new abcd.xK(this));
                    if (r0 == null) { $pc1 = 10; continue $sw1; }
                    if (r0.length() == 0) { $pc1 = 10; continue $sw1; }
                    return j6(new java.io.File("."), r0);
                }
                case 10: {
                    return super.VH();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.io.File j6(java.io.File r4, java.lang.String r5) {
        java.lang.String r0 = null;
        java.lang.String r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = java.lang.System.getProperty("jgit.usecygpath");
                    if (r0 == null) { $pc2 = 11; continue $sw2; }
                    if (r0.equals("true") == false) { $pc2 = 11; continue $sw2; }
                    r1 = abcd.AbstractpK.j6(r4, new java.lang.String[]{Hw, "--windows", "--absolute", r5}, "UTF-8");
                    if (r1 == null) { $pc2 = 11; continue $sw2; }
                    return new java.io.File(r1);
                }
                case 11: {
                    return super.j6(r4, r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
