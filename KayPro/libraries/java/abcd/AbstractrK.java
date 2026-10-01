package abcd;

abstract class AbstractrK extends abcd.AbstractpK {
    AbstractrK() {
    }

    private static boolean gn() {
        return "Mac OS X".equals((java.lang.String) java.security.AccessController.doPrivileged(new abcd.qK()));
    }

    @Override
    protected java.io.File DW() {
        java.io.File r0 = null;
        java.lang.String r1 = null;
        java.io.File r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = abcd.AbstractpK.DW(abcd.QK.FH().DW("PATH"), new java.lang.String[]{"git"});
                    if (r0 == null) { $pc0 = 7; continue $sw0; }
                    return r0.getParentFile().getParentFile();
                }
                case 7: {
                    if (gn() == false) { $pc0 = 18; continue $sw0; }
                    r1 = abcd.AbstractpK.j6(Zo(), new java.lang.String[]{"bash", "--login", "-c", "which git"}, java.nio.charset.Charset.defaultCharset().name());
                    if (r1 == null) { $pc0 = 18; continue $sw0; }
                    if (r1.length() == 0) { $pc0 = 18; continue $sw0; }
                    r2 = new java.io.File(r1).getParentFile();
                    if (r2 != null) { $pc0 = 17; continue $sw0; }
                    return null;
                }
                case 17: {
                    return r2.getParentFile();
                }
                case 18: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.ProcessBuilder j6(java.lang.String r4, java.lang.String[] r5) {
        java.util.ArrayList r0 = new java.util.ArrayList(r5.length + 4);
        r0.add("sh");
        r0.add("-c");
        r0.add(java.lang.String.valueOf(r4) + " \"$@\"");
        r0.add(r4);
        r0.addAll(java.util.Arrays.asList(r5));
        java.lang.ProcessBuilder r6 = new java.lang.ProcessBuilder(new java.lang.String[0]);
        r6.command(r0);
        return r6;
    }
}
