package abcd;

public class zK {
    public static void DW(java.io.File r1) {
        j6(r1, false);
    }

    public static void DW(java.io.File r3, boolean r4) {
        if (r3.mkdirs() == true) goto L10;
        if (r4 == false) goto L9;
        if (r3.isDirectory() == false) goto L9;
        return;
    L9:
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().mkDirsFailed, new java.lang.Object[]{r3.getAbsolutePath()}));
    }

    public static void FH(java.io.File r1) {
        DW(r1, false);
    }

    public static void j6(java.io.File r1) {
        j6(r1, 0);
    }

    public static void j6(java.io.File r5, int r6) {
        if ((r6 & 4) == 0) goto L8;
        if (r5.exists() == true) goto L8;
        return;
    L8:
        if ((r6 & 1) == 0) goto L18;
        if (r5.isDirectory() == false) goto L18;
        java.io.File[] r0 = r5.listFiles();
        if (r0 == null) goto L18;
        int r2 = r0.length;
        int r3 = 0;
    L14:
        if (r3 >= r2) goto L18;
        j6(r0[r3], r6);
        r3 = r3 + 1;
    L18:
        if (r5.delete() == false) goto L20;
        return;
    L20:
        if ((r6 & 2) == 0) goto L33;
        if (r5.exists() == false) goto L33;
        int r7 = 1;
    L25:
        if (r7 >= 10) goto L33;
        java.lang.Thread.sleep(100);     // Catch: java.lang.InterruptedException -> L35
    L29:
        if (r5.delete() == true) goto L30;
        r7 = r7 + 1;
        goto L25
    L30:
        return;
    L33:
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().deleteFileFailed, new java.lang.Object[]{r5.getAbsolutePath()}));
    }

    public static void j6(java.io.File r3, boolean r4) {
        if (r3.mkdir() == true) goto L10;
        if (r4 == false) goto L9;
        if (r3.isDirectory() == false) goto L9;
        return;
    L9:
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().mkDirFailed, new java.lang.Object[]{r3.getAbsolutePath()}));
    }
}
