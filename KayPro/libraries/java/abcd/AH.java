package abcd;

public class AH {
    public static long j6(byte[] r7) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        long r3 = 0L;
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 0;
                    r1 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    r2 = r1 + 1;
                    if (((r7[r1] & 255) & 128) == 0) { $pc0 = 5; continue $sw0; }
                    r1 = r2;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    r3 = 0;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r4 = r2 + 1;
                    r5 = r7[r2] & 255;
                    r3 = r3 | ((long) ((r5 & 127) << r0));
                    r0 = r0 + 7;
                    if ((r5 & 128) == 0) { $pc0 = 8; continue $sw0; }
                    r2 = r4;
                    { $pc0 = 6; continue $sw0; }
                }
                case 8: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final byte[] j6(byte[] r1, byte[] r2) {
        return j6(r1, r2, null);
    }

    public static final byte[] j6(byte[] r7, byte[] r8, byte[] r9) {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        int r18 = 0;
        int r19 = 0;
        int r20 = 0;
        int r21 = 0;
        int r22 = 0;
        int r23 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r1 = 0;
                    r2 = 0;
                    r3 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    r4 = r1 + 1;
                    r5 = r8[r1] & 255;
                    r2 = r2 | ((r5 & 127) << r3);
                    r3 = r3 + 7;
                    if ((r5 & 128) == 0) { $pc1 = 6; continue $sw1; }
                    r1 = r4;
                    { $pc1 = 3; continue $sw1; }
                }
                case 6: {
                    if (r7.length != r2) { $pc1 = 55; continue $sw1; }
                    r6 = 0;
                    r10 = 0;
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    r11 = r4 + 1;
                    r12 = r8[r4] & 255;
                    r6 = r6 | ((r12 & 127) << r10);
                    r10 = r10 + 7;
                    if ((r12 & 128) == 0) { $pc1 = 10; continue $sw1; }
                    r4 = r11;
                    { $pc1 = 8; continue $sw1; }
                }
                case 10: {
                    if (r9 != null) { $pc1 = 13; continue $sw1; }
                    r9 = new byte[r6];
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    r13 = 0;
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    if (r11 >= r8.length) { $pc1 = 17; continue $sw1; }
                    r14 = r11 + 1;
                    r15 = r8[r11] & 255;
                    if ((r15 & 128) != 0) { $pc1 = 21; continue $sw1; }
                    if (r15 == 0) { $pc1 = 50; continue $sw1; }
                    java.lang.System.arraycopy(r8, r14, r9, r13, r15);
                    r13 = r13 + r15;
                    r11 = r14 + r15;
                    { $pc1 = 16; continue $sw1; }
                }
                case 50: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().unsupportedCommand0);
                }
                case 21: {
                    if ((r15 & 1) == 0) { $pc1 = 23; continue $sw1; }
                    r16 = r14 + 1;
                    r17 = r8[r14] & 255;
                    $pc1 = 25; continue $sw1;
                }
                case 25: {
                    if ((r15 & 2) == 0) { $pc1 = 28; continue $sw1; }
                    r18 = r16 + 1;
                    r17 = r17 | ((r8[r16] & 255) << 8);
                    r16 = r18;
                    $pc1 = 28; continue $sw1;
                }
                case 28: {
                    if ((r15 & 4) == 0) { $pc1 = 31; continue $sw1; }
                    r19 = r16 + 1;
                    r17 = r17 | ((r8[r16] & 255) << 16);
                    r16 = r19;
                    $pc1 = 31; continue $sw1;
                }
                case 31: {
                    if ((r15 & 8) == 0) { $pc1 = 34; continue $sw1; }
                    r20 = r16 + 1;
                    r17 = r17 | ((r8[r16] & 255) << 24);
                    r16 = r20;
                    $pc1 = 34; continue $sw1;
                }
                case 34: {
                    if ((r15 & 16) == 0) { $pc1 = 36; continue $sw1; }
                    r21 = r16 + 1;
                    r22 = r8[r16] & 255;
                    $pc1 = 38; continue $sw1;
                }
                case 38: {
                    if ((r15 & 32) == 0) { $pc1 = 41; continue $sw1; }
                    r23 = r21 + 1;
                    r22 = r22 | ((r8[r21] & 255) << 8);
                    r21 = r23;
                    $pc1 = 41; continue $sw1;
                }
                case 41: {
                    if ((r15 & 64) == 0) { $pc1 = 43; continue $sw1; }
                    r11 = r21 + 1;
                    r22 = r22 | ((r8[r21] & 255) << 16);
                    $pc1 = 44; continue $sw1;
                }
                case 44: {
                    if (r22 != 0) { $pc1 = 46; continue $sw1; }
                    r22 = 65536;
                    $pc1 = 46; continue $sw1;
                }
                case 46: {
                    java.lang.System.arraycopy(r7, r17, r9, r13, r22);
                    r13 = r13 + r22;
                    { $pc1 = 16; continue $sw1; }
                }
                case 43: {
                    r11 = r21;
                    { $pc1 = 44; continue $sw1; }
                }
                case 36: {
                    r21 = r16;
                    r22 = 0;
                    { $pc1 = 38; continue $sw1; }
                }
                case 23: {
                    r16 = r14;
                    r17 = 0;
                    { $pc1 = 25; continue $sw1; }
                }
                case 17: {
                    return r9;
                }
                case 13: {
                    if (r9.length == r6) { $pc1 = 14; continue $sw1; }
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().resultLengthIncorrect);
                }
                case 55: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().baseLengthIncorrect);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
