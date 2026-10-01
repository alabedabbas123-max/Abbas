package abcd;

public class DI {
    public static final java.lang.String j6 = null;
    private final java.io.InputStream DW;
    private final byte[] FH;

    static final enum a extends java.lang.Enum<abcd.DI.a> {
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
            return (abcd.DI.a) java.lang.Enum.valueOf(abcd.DI.a.class, r1);
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
        int r0 = j6();
        if (r0 == 0) goto L5;
        int r1 = r0 - 4;
        if (r1 != 0) goto L10;
        return "";
    L10:
        byte[] r2 = this.FH;
        if (r1 <= r2.length) goto L14;
        r2 = new byte[r1];
    L14:
        abcd.BK.j6(this.DW, r2, 0, r1);
        if (r2[r1 - 1] != 10) goto L18;
        r1 = r1 - 1;
    L18:
        return abcd.IK.j6(abcd.hE.Zo, r2, 0, r1);
    L5:
        return j6;
    }

    public java.lang.String FH() {
        int r0 = j6();
        if (r0 == 0) goto L5;
        int r1 = r0 - 4;
        byte[] r2 = this.FH;
        if (r1 <= r2.length) goto L10;
        r2 = new byte[r1];
    L10:
        abcd.BK.j6(this.DW, r2, 0, r1);
        return abcd.IK.j6(abcd.hE.Zo, r2, 0, r1);
    L5:
        return j6;
    }

    int j6() {
        abcd.BK.j6(this.DW, this.FH, 0, 4);
        int r0 = abcd.IK.VH(this.FH, 0);     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10
        if (r0 == 0) goto L9;
        if (r0 >= 4) goto L9;
        throw new java.lang.ArrayIndexOutOfBoundsException();     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10
    L9:
        return r0;
    L10:
        java.lang.String r1 = org.eclipse.jgit.JGitText.j6().invalidPacketLineHeader;
        java.lang.StringBuilder r5 = new java.lang.StringBuilder();
        r5.append((char) this.FH[0]);
        r5.append((char) this.FH[1]);
        r5.append((char) this.FH[2]);
        r5.append((char) this.FH[3]);
        throw new java.io.IOException(java.text.MessageFormat.format(r1, new java.lang.Object[]{r5.toString()}));
    }

    abcd.DI.a j6(abcd.uE r5) {
        java.lang.String r0 = DW();
        if (r0.length() == 0) goto L33;
        if ("NAK".equals(r0) == false) goto L9;
        return abcd.DI.a.j6;
    L9:
        if (r0.startsWith("ACK ") == false) goto L27;
        r5.j6(r0.substring(4, 44));
        if (r0.length() == 44) goto L13;
        java.lang.String r6 = r0.substring(44);
        if (r6.equals(" continue") == false) goto L19;
        return abcd.DI.a.FH;
    L19:
        if (r6.equals(" common") == false) goto L23;
        return abcd.DI.a.Hw;
    L23:
        if (r6.equals(" ready") == false) goto L27;
        return abcd.DI.a.v5;
    L13:
        return abcd.DI.a.DW;
    L27:
        if (r0.startsWith("ERR ") == false) goto L31;
        throw new abcd.nD(r0.substring(4));
    L31:
        throw new abcd.nD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().expectedACKNAKGot, new java.lang.Object[]{r0}));
    L33:
        throw new abcd.nD(org.eclipse.jgit.JGitText.j6().expectedACKNAKFoundEOF);
    }
}
