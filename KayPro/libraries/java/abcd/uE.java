package abcd;

public class uE extends abcd.YD {
    public uE() {
    }

    private void Zo(byte[] r3, int r4) {
        this.FH = abcd.IK.gn(r3, r4);     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4
        this.Hw = abcd.IK.gn(r3, r4 + 8);     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4
        this.v5 = abcd.IK.gn(r3, r4 + 16);     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4
        this.Zo = abcd.IK.gn(r3, r4 + 24);     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4
        this.VH = abcd.IK.gn(r3, r4 + 32);     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4
        return;
    L5:
        throw new abcd.aD(r3, r4, 40);
    }

    public void Hw(byte[] r2, int r3) {
        this.FH = abcd.FK.j6(r2, r3);
        this.Hw = abcd.FK.j6(r2, r3 + 4);
        this.v5 = abcd.FK.j6(r2, r3 + 8);
        this.Zo = abcd.FK.j6(r2, r3 + 12);
        this.VH = abcd.FK.j6(r2, r3 + 16);
    }

    @Override
    public abcd.yE J8() {
        return new abcd.yE(this);
    }

    public void Ws() {
        this.FH = 0;
        this.Hw = 0;
        this.v5 = 0;
        this.Zo = 0;
        this.VH = 0;
    }

    public void j6(java.lang.String r5) {
        if (r5.length() != 40) goto L7;
        Zo(abcd.hE.DW(r5), 0);
        return;
    L7:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidId, new java.lang.Object[]{r5}));
    }

    public void v5(byte[] r1, int r2) {
        Zo(r1, r2);
    }
}
