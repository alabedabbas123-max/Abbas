package abcd;

public class zK {
    public static void DW(java.io.File r1) {
        j6(r1, false);
    }

    public static void DW(java.io.File r3, boolean r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3.mkdirs() == true) { $pc0 = 10; continue $sw0; }
                    if (r4 == false) { $pc0 = 9; continue $sw0; }
                    if (r3.isDirectory() == false) { $pc0 = 9; continue $sw0; }
                    return;
                }
                case 9: {
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().mkDirsFailed, new java.lang.Object[]{r3.getAbsolutePath()}));
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void FH(java.io.File r1) {
        DW(r1, false);
    }

    public static void j6(java.io.File r1) {
        j6(r1, 0);
    }

    public static void j6(java.io.File r5, int r6) {
        java.io.File[] r0 = null;
        int r2 = 0;
        int r3 = 0;
        int r7 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r6 & 4) == 0) { $pc1 = 8; continue $sw1; }
                    if (r5.exists() == true) { $pc1 = 8; continue $sw1; }
                    return;
                }
                case 8: {
                    if ((r6 & 1) == 0) { $pc1 = 18; continue $sw1; }
                    if (r5.isDirectory() == false) { $pc1 = 18; continue $sw1; }
                    r0 = r5.listFiles();
                    if (r0 == null) { $pc1 = 18; continue $sw1; }
                    r2 = r0.length;
                    r3 = 0;
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    if (r3 >= r2) { $pc1 = 18; continue $sw1; }
                    j6(r0[r3], r6);
                    r3 = r3 + 1;
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    if (r5.delete() == false) { $pc1 = 20; continue $sw1; }
                    return;
                }
                case 20: {
                    if ((r6 & 2) == 0) { $pc1 = 33; continue $sw1; }
                    if (r5.exists() == false) { $pc1 = 33; continue $sw1; }
                    r7 = 1;
                    $pc1 = 25; continue $sw1;
                }
                case 25: {
                    if (r7 >= 10) { $pc1 = 33; continue $sw1; }
                    try {
                        java.lang.Thread.sleep(100);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc1 = 35; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 29; continue $sw1;
                }
                case 29: {
                    if (r5.delete() == true) { $pc1 = 30; continue $sw1; }
                    r7 = r7 + 1;
                    { $pc1 = 25; continue $sw1; }
                }
                case 30: {
                    return;
                }
                case 33: {
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().deleteFileFailed, new java.lang.Object[]{r5.getAbsolutePath()}));
                }
                case 35: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.io.File r3, boolean r4) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r3.mkdir() == true) { $pc2 = 10; continue $sw2; }
                    if (r4 == false) { $pc2 = 9; continue $sw2; }
                    if (r3.isDirectory() == false) { $pc2 = 9; continue $sw2; }
                    return;
                }
                case 9: {
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().mkDirFailed, new java.lang.Object[]{r3.getAbsolutePath()}));
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
