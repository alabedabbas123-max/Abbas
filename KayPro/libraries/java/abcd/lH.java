package abcd;

public class lH {
    private final int[] DW;
    private final long[] FH;
    private final int[] Hw;
    private final abcd.AbstractbH j6;
    private final int[] v5;

    public lH(abcd.AbstractbH r11) {
        this.j6 = r11;
        long r0 = this.j6.j6();
        long r2 = this.j6.DW();
        long r4 = r0 - r2;
        if (r4 > 2147483647L) goto L25;
        if (r2 > 2147483647L) goto L25;
        if (r0 > 4294967295L) goto L25;
        this.DW = new int[(int) r4];
        this.FH = new long[(int) r2];
        this.Hw = new int[this.DW.length];
        this.v5 = new int[this.FH.length];
        java.util.Iterator<abcd.AbstractbH.b> r12 = this.j6.iterator();
        int r1 = 0;
        int r3 = 0;
        int r5 = 0;
    L10:
        if (r12.hasNext() == false) goto L11;
        long r6 = r12.next().j6();
        if (r6 < 2147483647L) goto L22;
        this.FH[r3] = r6;
        r3 = r3 + 1;
        goto L10
    L22:
        this.DW[r5] = (int) r6;
        r5 = r5 + 1;
        goto L10
    L11:
        java.util.Arrays.sort(this.DW);
        java.util.Arrays.sort(this.FH);
        java.util.Iterator<abcd.AbstractbH.b> r7 = this.j6.iterator();
    L13:
        if (r7.hasNext() == false) goto L14;
        long r8 = r7.next().j6();
        if (r8 >= 2147483647L) goto L18;
        int[] r13 = this.Hw;
        int r9 = java.util.Arrays.binarySearch(this.DW, (int) r8);
        int r10 = r1 + 1;
        r13[r9] = r1;
    L19:
        r1 = r10;
        goto L13
    L18:
        r10 = r1 + 1;
        this.v5[java.util.Arrays.binarySearch(this.FH, r8)] = r1;
        goto L19
    L14:
        return;
    L25:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().hugeIndexesAreNotSupportedByJgitYet);
    }

    public long j6(long r6, long r8) {
        if (r6 > 2147483647L) goto L17;
        int r2 = java.util.Arrays.binarySearch(this.DW, (int) r6);
        if (r2 < 0) goto L16;
        int r3 = r2 + 1;
        int[] r7 = this.DW;
        if (r3 != r7.length) goto L14;
        long[] r9 = this.FH;
        if (r9.length > 0) goto L11;
        return r8;
    L11:
        return r9[0];
    L14:
        return r7[r3];
    L16:
        throw new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().cantFindObjectInReversePackIndexForTheSpecifiedOffset, new java.lang.Object[]{java.lang.Long.valueOf(r6)}));
    L17:
        int r4 = java.util.Arrays.binarySearch(this.FH, r6);
        if (r4 < 0) goto L25;
        int r5 = r4 + 1;
        long[] r10 = this.FH;
        if (r5 != r10.length) goto L23;
        return r8;
    L23:
        return r10[r5];
    L25:
        throw new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().cantFindObjectInReversePackIndexForTheSpecifiedOffset, new java.lang.Object[]{java.lang.Long.valueOf(r6)}));
    }

    public abcd.yE j6(long r5) {
        if (r5 > 2147483647L) goto L9;
        int r6 = java.util.Arrays.binarySearch(this.DW, (int) r5);
        if (r6 >= 0) goto L8;
        return null;
    L8:
        return this.j6.v5(this.Hw[r6]);
    L9:
        int r7 = java.util.Arrays.binarySearch(this.FH, r5);
        if (r7 >= 0) goto L13;
        return null;
    L13:
        return this.j6.v5(this.v5[r7]);
    }
}
