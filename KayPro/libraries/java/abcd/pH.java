package abcd;

public class pH implements java.io.Serializable {
    private abcd.yE DW;
    private abcd.KE FH;
    private java.lang.String Hw;
    private abcd.yE j6;

    pH(byte[] r3, int r4) {
        this.j6 = abcd.yE.v5(r3, r4);
        int r5 = r4 + 40;
        int r0 = r5 + 1;
        if (r3[r5] != 32) goto L17;
        this.DW = abcd.yE.v5(r3, r0);
        int r1 = r0 + 40;
        int r6 = r1 + 1;
        if (r3[r1] != 32) goto L15;
        this.FH = abcd.IK.tp(r3, r6);
        int r7 = abcd.IK.j6(r3, r6, '\t');
        java.lang.String r2 = "";
        if (r7 < r3.length) goto L9;
        this.Hw = "";
        return;
    L9:
        int r8 = abcd.IK.Zo(r3, r7);
        if (r8 <= r7) goto L12;
        r2 = abcd.IK.j6(r3, r7, r8 - 1);
    L12:
        this.Hw = r2;
        return;
    L15:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().rawLogMessageDoesNotParseAsLogEntry);
    L17:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().rawLogMessageDoesNotParseAsLogEntry);
    }

    public abcd.yE DW() {
        return this.DW;
    }

    public abcd.KE FH() {
        return this.FH;
    }

    public java.lang.String j6() {
        return this.Hw;
    }

    public java.lang.String toString() {
        return "Entry[" + this.j6.we() + ", " + this.DW.we() + ", " + FH() + ", " + j6() + "]";
    }
}
