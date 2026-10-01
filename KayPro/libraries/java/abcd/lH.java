package abcd;

public class lH {
    private final int[] DW;
    private final long[] FH;
    private final int[] Hw;
    private final abcd.AbstractbH j6;
    private final int[] v5;

    public lH(abcd.AbstractbH r11) {
        long r0 = 0L;
        long r2 = 0L;
        long r4 = 0L;
        java.util.Iterator<abcd.AbstractbH.b> r12 = null;
        int r1 = 0;
        int r3 = 0;
        int r5 = 0;
        long r6 = 0L;
        java.util.Iterator<abcd.AbstractbH.b> r7 = null;
        long r8 = 0L;
        int[] r13 = null;
        int r9 = 0;
        int r10 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.j6 = r11;
                    r0 = this.j6.j6();
                    r2 = this.j6.DW();
                    r4 = r0 - r2;
                    if (r4 > 2147483647L) { $pc0 = 25; continue $sw0; }
                    if (r2 > 2147483647L) { $pc0 = 25; continue $sw0; }
                    if (r0 > 4294967295L) { $pc0 = 25; continue $sw0; }
                    this.DW = new int[(int) r4];
                    this.FH = new long[(int) r2];
                    this.Hw = new int[this.DW.length];
                    this.v5 = new int[this.FH.length];
                    r12 = this.j6.iterator();
                    r1 = 0;
                    r3 = 0;
                    r5 = 0;
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    if (r12.hasNext() == false) { $pc0 = 11; continue $sw0; }
                    r6 = r12.next().j6();
                    if (r6 < 2147483647L) { $pc0 = 22; continue $sw0; }
                    this.FH[r3] = r6;
                    r3 = r3 + 1;
                    { $pc0 = 10; continue $sw0; }
                }
                case 22: {
                    this.DW[r5] = (int) r6;
                    r5 = r5 + 1;
                    { $pc0 = 10; continue $sw0; }
                }
                case 11: {
                    java.util.Arrays.sort(this.DW);
                    java.util.Arrays.sort(this.FH);
                    r7 = this.j6.iterator();
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    if (r7.hasNext() == false) { $pc0 = 14; continue $sw0; }
                    r8 = r7.next().j6();
                    if (r8 >= 2147483647L) { $pc0 = 18; continue $sw0; }
                    r13 = this.Hw;
                    r9 = java.util.Arrays.binarySearch(this.DW, (int) r8);
                    r10 = r1 + 1;
                    r13[r9] = r1;
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    r1 = r10;
                    { $pc0 = 13; continue $sw0; }
                }
                case 18: {
                    r10 = r1 + 1;
                    this.v5[java.util.Arrays.binarySearch(this.FH, r8)] = r1;
                    { $pc0 = 19; continue $sw0; }
                }
                case 14: {
                    return;
                }
                case 25: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().hugeIndexesAreNotSupportedByJgitYet);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public long j6(long r6, long r8) {
        int r2 = 0;
        int r3 = 0;
        int[] r7 = null;
        long[] r9 = null;
        int r4 = 0;
        int r5 = 0;
        long[] r10 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r6 > 2147483647L) { $pc1 = 17; continue $sw1; }
                    r2 = java.util.Arrays.binarySearch(this.DW, (int) r6);
                    if (r2 < 0) { $pc1 = 16; continue $sw1; }
                    r3 = r2 + 1;
                    r7 = this.DW;
                    if (r3 != r7.length) { $pc1 = 14; continue $sw1; }
                    r9 = this.FH;
                    if (r9.length > 0) { $pc1 = 11; continue $sw1; }
                    return r8;
                }
                case 11: {
                    return r9[0];
                }
                case 14: {
                    return r7[r3];
                }
                case 16: {
                    throw new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().cantFindObjectInReversePackIndexForTheSpecifiedOffset, new java.lang.Object[]{java.lang.Long.valueOf(r6)}));
                }
                case 17: {
                    r4 = java.util.Arrays.binarySearch(this.FH, r6);
                    if (r4 < 0) { $pc1 = 25; continue $sw1; }
                    r5 = r4 + 1;
                    r10 = this.FH;
                    if (r5 != r10.length) { $pc1 = 23; continue $sw1; }
                    return r8;
                }
                case 23: {
                    return r10[r5];
                }
                case 25: {
                    throw new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().cantFindObjectInReversePackIndexForTheSpecifiedOffset, new java.lang.Object[]{java.lang.Long.valueOf(r6)}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.yE j6(long r5) {
        int r6 = 0;
        int r7 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r5 > 2147483647L) { $pc2 = 9; continue $sw2; }
                    r6 = java.util.Arrays.binarySearch(this.DW, (int) r5);
                    if (r6 >= 0) { $pc2 = 8; continue $sw2; }
                    return null;
                }
                case 8: {
                    return this.j6.v5(this.Hw[r6]);
                }
                case 9: {
                    r7 = java.util.Arrays.binarySearch(this.FH, r5);
                    if (r7 >= 0) { $pc2 = 13; continue $sw2; }
                    return null;
                }
                case 13: {
                    return this.j6.v5(this.v5[r7]);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
