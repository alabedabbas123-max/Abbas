package abcd;

public class WI implements java.io.Serializable {
    private boolean DW;
    private java.lang.String FH;
    private java.lang.String Hw;
    private boolean j6;

    public WI() {
        this.j6 = false;
        this.DW = false;
        this.FH = "HEAD";
        this.Hw = null;
    }

    private WI(abcd.WI r2) {
        this.j6 = r2.FH();
        this.DW = r2.Hw();
        this.FH = r2.DW();
        this.Hw = r2.j6();
    }

    public WI(java.lang.String r6) {
        if (r6.startsWith("+") == false) goto L5;
        this.j6 = true;
        java.lang.String r0 = r6.substring(1);
    L6:
        int r2 = r0.lastIndexOf(58);
        if (r2 != 0) goto L13;
        java.lang.String r1 = r0.substring(1);
        if (FH(r1) == true) goto L12;
        this.Hw = r1;
        return;
    L12:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidWildcards, new java.lang.Object[]{r6}));
    L13:
        if (r2 <= 0) goto L27;
        this.FH = r0.substring(0, r2);
        this.Hw = r0.substring(r2 + 1);
        if (FH(this.FH) == false) goto L20;
        if (FH(this.Hw) == false) goto L20;
        this.DW = true;
        return;
    L20:
        if (FH(this.FH) == true) goto L25;
        if (FH(this.Hw) == true) goto L25;
        return;
    L25:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidWildcards, new java.lang.Object[]{r6}));
    L27:
        if (FH(r0) == true) goto L31;
        this.FH = r0;
        return;
    L31:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidWildcards, new java.lang.Object[]{r6}));
    L5:
        r0 = r6;
        goto L6
    }

    private static boolean DW(java.lang.String r0, java.lang.String r1) {
        if (r0 != r1) goto L5;
        return true;
    L5:
        if (r0 == null) goto L10;
        if (r1 != null) goto L9;
        return false;
    L9:
        return r0.equals(r1);
    L10:
        return false;
    }

    public static boolean FH(java.lang.String r1) {
        if (r1 != null) goto L4;
        return false;
    L4:
        if (r1.endsWith("/*") == false) goto L9;
        return true;
    L9:
        return false;
    }

    private boolean FH(java.lang.String r3, java.lang.String r4) {
        if (r4 != null) goto L6;
        return false;
    L6:
        if (Hw() == false) goto L10;
        return r3.startsWith(r4.substring(0, r4.length() - 1));
    L10:
        return r3.equals(r4);
    }

    private abcd.WI gn(java.lang.String r6) {
        java.lang.String r0 = this.FH;
        java.lang.String r1 = this.Hw;
        this.DW = false;
        this.FH = java.lang.String.valueOf(r0.substring(0, r0.length() - 1)) + r6.substring(r1.length() - 1);
        this.Hw = r6;
        return this;
    }

    private abcd.WI u7(java.lang.String r6) {
        java.lang.String r0 = this.FH;
        java.lang.String r1 = this.Hw;
        this.DW = false;
        this.FH = r6;
        this.Hw = java.lang.String.valueOf(r1.substring(0, r1.length() - 1)) + r6.substring(r0.length() - 1);
        return this;
    }

    public abcd.WI DW(java.lang.String r2) {
        if (Hw() == false) goto L6;
        abcd.WI r0 = new abcd.WI(this);
        r0.u7(r2);
        return r0;
    L6:
        return this;
    }

    public java.lang.String DW() {
        return this.FH;
    }

    public boolean DW(abcd.ME r2) {
        return FH(r2.getName(), DW());
    }

    public boolean FH() {
        return this.j6;
    }

    public boolean Hw() {
        return this.DW;
    }

    public boolean Hw(java.lang.String r2) {
        return FH(r2, j6());
    }

    public abcd.WI VH(java.lang.String r3) {
        abcd.WI r0 = new abcd.WI(this);
        r0.FH = r3;
        if (FH(r0.FH) == false) goto L10;
        if (r0.Hw != null) goto L10;
        throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().destinationIsNotAWildcard);
    L10:
        if (FH(r0.FH) != FH(r0.Hw)) goto L13;
        return r0;
    L13:
        throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().sourceDestinationMustMatch);
    }

    public abcd.WI Zo(java.lang.String r3) {
        abcd.WI r0 = new abcd.WI(this);
        r0.Hw = r3;
        if (FH(r0.Hw) == false) goto L10;
        if (r0.FH != null) goto L10;
        throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().sourceIsNotAWildcard);
    L10:
        if (FH(r0.FH) != FH(r0.Hw)) goto L13;
        return r0;
    L13:
        throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().sourceDestinationMustMatch);
    }

    public boolean equals(java.lang.Object r4) {
        if ((r4 instanceof abcd.WI) == true) goto L5;
        return false;
    L5:
        abcd.WI r5 = (abcd.WI) r4;
        if (FH() == r5.FH()) goto L9;
        return false;
    L9:
        if (Hw() == r5.Hw()) goto L12;
        return false;
    L12:
        if (DW(DW(), r5.DW()) == true) goto L15;
        return false;
    L15:
        if (DW(j6(), r5.j6()) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r1 = 0;
        if (DW() == null) goto L6;
        r1 = 0 + DW().hashCode();
    L6:
        if (j6() != null) goto L8;
        return r1;
    L8:
        return (r1 * 31) + j6().hashCode();
    }

    public abcd.WI j6(abcd.ME r1) {
        return DW(r1.getName());
    }

    public abcd.WI j6(java.lang.String r2) {
        if (Hw() == false) goto L6;
        abcd.WI r0 = new abcd.WI(this);
        r0.gn(r2);
        return r0;
    L6:
        return this;
    }

    public abcd.WI j6(java.lang.String r3, java.lang.String r4) {
        if (FH(r3) != FH(r4)) goto L7;
        abcd.WI r0 = new abcd.WI(this);
        r0.DW = FH(r3);
        r0.FH = r3;
        r0.Hw = r4;
        return r0;
    L7:
        throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().sourceDestinationMustMatch);
    }

    public abcd.WI j6(boolean r2) {
        abcd.WI r0 = new abcd.WI(this);
        r0.j6 = r2;
        return r0;
    }

    public java.lang.String j6() {
        return this.Hw;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        if (FH() == false) goto L6;
        r0.append('+');
    L6:
        if (DW() == null) goto L9;
        r0.append(DW());
    L9:
        if (j6() == null) goto L12;
        r0.append(':');
        r0.append(j6());
    L12:
        return r0.toString();
    }

    public boolean v5(java.lang.String r2) {
        return FH(r2, DW());
    }
}
