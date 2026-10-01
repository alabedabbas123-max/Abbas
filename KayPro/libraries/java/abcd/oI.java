package abcd;

class oI {
    boolean DW;
    java.lang.String FH;
    abcd.HJ Hw;
    abcd.yE j6;

    oI() {
    }

    void j6(java.io.Writer r5) {
        if (this.FH.startsWith("refs/heads/") == false) goto L6;
        java.lang.String r0 = this.FH.substring(11);
        java.lang.String r1 = "branch";
    L12:
        r5.write(this.j6.we());
        r5.write(9);
        if (this.DW == false) goto L15;
        r5.write("not-for-merge");
    L15:
        r5.write(9);
        r5.write(r1);
        r5.write(" '");
        r5.write(r0);
        r5.write("' of ");
        r5.write(this.Hw.toString());
        r5.write("\n");
        return;
    L6:
        if (this.FH.startsWith("refs/tags/") == false) goto L9;
        r0 = this.FH.substring(10);
        r1 = "tag";
        goto L12
    L9:
        if (this.FH.startsWith("refs/remotes/") == false) goto L11;
        r0 = this.FH.substring(13);
        r1 = "remote branch";
        goto L12
    L11:
        r0 = this.FH;
        r1 = "";
        goto L12
    }
}
