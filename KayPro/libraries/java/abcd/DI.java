package abcd;

public class DI {
    public static final java.lang.String j6 = null;
    private final java.io.InputStream DW;
    private final byte[] FH;

    static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.DI.a DW = null;
        public static final abcd.DI.a FH = null;
        public static final abcd.DI.a Hw = null;
        private static final abcd.DI.a[] Zo = null;
        public static final abcd.DI.a j6 = null;
        public static final abcd.DI.a v5 = null;

        static {
            j6 = new abcd.DI.a("NAK", 0);
            DW = new abcd.DI.a("ACK", 1);
            FH = new abcd.DI.a("ACK_CONTINUE", 2);
            Hw = new abcd.DI.a("ACK_COMMON", 3);
            v5 = new abcd.DI.a("ACK_READY", 4);
            Zo = new abcd.DI.a[]{j6, DW, FH, Hw, v5};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.DI.a valueOf(java.lang.String r1) {
            return (abcd.DI.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.DI.a.values(), r1);
        }

        public static abcd.DI.a[] values() {
            abcd.DI.a[] r0 = Zo;
            int r1 = r0.length;
            abcd.DI.a[] r2 = new abcd.DI.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    static {
        j6 = new java.lang.StringBuilder(0).toString();
    }

    public DI(java.io.InputStream r1) {
        this.DW = r1;
        this.FH = new byte[1000];
    }

    public java.lang.String DW() {
        int r0 = 0;
        int r1 = 0;
        byte[] r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = j6();
                    if (r0 == 0) { $pc0 = 5; continue $sw0; }
                    r1 = r0 - 4;
                    if (r1 != 0) { $pc0 = 10; continue $sw0; }
                    return "";
                }
                case 10: {
                    r2 = this.FH;
                    if (r1 <= r2.length) { $pc0 = 14; continue $sw0; }
                    r2 = new byte[r1];
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    abcd.BK.j6(this.DW, r2, 0, r1);
                    if (r2[r1 - 1] != 10) { $pc0 = 18; continue $sw0; }
                    r1 = r1 - 1;
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    return abcd.IK.j6(abcd.hE.Zo, r2, 0, r1);
                }
                case 5: {
                    return j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String FH() {
        int r0 = 0;
        int r1 = 0;
        byte[] r2 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = j6();
                    if (r0 == 0) { $pc1 = 5; continue $sw1; }
                    r1 = r0 - 4;
                    r2 = this.FH;
                    if (r1 <= r2.length) { $pc1 = 10; continue $sw1; }
                    r2 = new byte[r1];
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    abcd.BK.j6(this.DW, r2, 0, r1);
                    return abcd.IK.j6(abcd.hE.Zo, r2, 0, r1);
                }
                case 5: {
                    return j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int j6() {
        int r0 = 0;
        java.lang.String r1 = null;
        java.lang.StringBuilder r5 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    abcd.BK.j6(this.DW, this.FH, 0, 4);
                    try {
                        r0 = abcd.IK.VH(this.FH, 0);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc2 = 10; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r0 == 0) { $pc2 = 9; continue $sw2; }
                    if (r0 >= 4) { $pc2 = 9; continue $sw2; }
                    try {
                        throw new java.lang.ArrayIndexOutOfBoundsException();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc2 = 10; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 9: {
                    return r0;
                }
                case 10: {
                    r1 = org.eclipse.jgit.JGitText.j6().invalidPacketLineHeader;
                    r5 = new java.lang.StringBuilder();
                    r5.append((char) this.FH[0]);
                    r5.append((char) this.FH[1]);
                    r5.append((char) this.FH[2]);
                    r5.append((char) this.FH[3]);
                    throw new java.io.IOException(java.text.MessageFormat.format(r1, new java.lang.Object[]{r5.toString()}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abcd.DI.a j6(abcd.uE r5) {
        java.lang.String r0 = null;
        java.lang.String r6 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = DW();
                    if (r0.length() == 0) { $pc3 = 33; continue $sw3; }
                    if ("NAK".equals(r0) == false) { $pc3 = 9; continue $sw3; }
                    return abcd.DI.a.j6;
                }
                case 9: {
                    if (r0.startsWith("ACK ") == false) { $pc3 = 27; continue $sw3; }
                    r5.j6(r0.substring(4, 44));
                    if (r0.length() == 44) { $pc3 = 13; continue $sw3; }
                    r6 = r0.substring(44);
                    if (r6.equals(" continue") == false) { $pc3 = 19; continue $sw3; }
                    return abcd.DI.a.FH;
                }
                case 19: {
                    if (r6.equals(" common") == false) { $pc3 = 23; continue $sw3; }
                    return abcd.DI.a.Hw;
                }
                case 23: {
                    if (r6.equals(" ready") == false) { $pc3 = 27; continue $sw3; }
                    return abcd.DI.a.v5;
                }
                case 13: {
                    return abcd.DI.a.DW;
                }
                case 27: {
                    if (r0.startsWith("ERR ") == false) { $pc3 = 31; continue $sw3; }
                    throw new abcd.nD(r0.substring(4));
                }
                case 31: {
                    throw new abcd.nD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().expectedACKNAKGot, new java.lang.Object[]{r0}));
                }
                case 33: {
                    throw new abcd.nD(org.eclipse.jgit.JGitText.j6().expectedACKNAKFoundEOF);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
