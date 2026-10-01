package abcd;

public class PC extends abcd.IC {
    private static final java.util.Comparator<abcd.PC.b> Hw = null;
    private final java.util.List<abcd.PC.b> v5;

    public static final class a extends abcd.PC.b {
        public a(java.lang.String r1) {
            super(r1);
        }

        @Override
        public void j6(abcd.QC r2) {
            throw new java.lang.UnsupportedOperationException(org.eclipse.jgit.JGitText.j6().noApplyInDelete);
        }
    }

    public static abstract class b {
        final byte[] j6;

        public b(java.lang.String r1) {
            this.j6 = abcd.hE.j6(r1);
        }

        public abstract void j6(abcd.QC r1);
    }

    static {
        Hw = new abcd.OC();
    }

    protected PC(abcd.KC r1, int r2) {
        super(r1, r2);
        this.v5 = new java.util.ArrayList();
    }

    private void v5() {
        java.util.Collections.sort(this.v5, Hw);
        int r0 = this.j6.v5();
        java.util.Iterator<abcd.PC.b> r1 = this.v5.iterator();
        int r3 = 0;
    L4:
        if (r1.hasNext() == false) goto L5;
        abcd.PC.b r4 = r1.next();
        abcd.KC r5 = this.j6;
        byte[] r6 = r4.j6;
        int r7 = r5.j6(r6, r6.length);
        if (r7 >= 0) goto L12;
        boolean r8 = true;
    L13:
        if (r7 >= 0) goto L15;
        r7 = -(r7 + 1);
    L15:
        int r9 = java.lang.Math.min(r7, r0) - r3;
        if (r9 <= 0) goto L18;
        j6(r3, r9);
    L18:
        if (r8 == false) goto L20;
        r3 = r7;
    L22:
        if ((r4 instanceof abcd.PC.a) == true) goto L4;
        if (r8 == false) goto L30;
        abcd.QC r10 = new abcd.QC(r4.j6);
        r4.j6(r10);
        if (r10.Zo() == 0) goto L29;
    L31:
        j6(r10);
        goto L4
    L29:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().fileModeNotSetForPath, new java.lang.Object[]{r10.v5()}));
    L30:
        r10 = this.j6.j6(r7);
        r4.j6(r10);
        goto L31
    L20:
        r3 = this.j6.DW(r7);
        goto L22
    L12:
        r8 = false;
        goto L13
    L5:
        int r2 = r0 - r3;
        if (r2 <= 0) goto L38;
        j6(r3, r2);
        return;
    }

    @Override
    public void DW() {
        if (this.v5.isEmpty() == true) goto L6;
        v5();
        Hw();
        return;
    }

    public void j6(abcd.PC.b r2) {
        this.v5.add(r2);
    }

    @Override
    public boolean j6() {
        if (this.v5.isEmpty() == false) goto L7;
        this.j6.tp();
        return true;
    L7:
        return super.j6();
    }
}
