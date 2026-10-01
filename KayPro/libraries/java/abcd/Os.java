package abcd;

public final class Os implements java.lang.Comparable<abcd.Os> {
    private static final java.util.HashMap<java.lang.String, abcd.Os> j6 = null;
    private final java.lang.String DW;
    private final abcd.Qs FH;
    private final abcd.Ps Hw;
    private abcd.Ps v5;

    static {
        j6 = new java.util.HashMap(500);
    }

    private Os(java.lang.String r1, abcd.Qs r2, abcd.Ps r3) {
        if (r1 == null) goto L13;
        if (r2 == null) goto L11;
        if (r3 == null) goto L9;
        this.DW = r1;
        this.FH = r2;
        this.Hw = r3;
        this.v5 = null;
        return;
    L9:
        throw new java.lang.NullPointerException("parameterTypes == null");
    L11:
        throw new java.lang.NullPointerException("returnType == null");
    L13:
        throw new java.lang.NullPointerException("descriptor == null");
    }

    private static abcd.Os DW(abcd.Os r3) {
        java.util.HashMap<java.lang.String, abcd.Os> r0 = j6;
        monitor-enter(r0);
        java.lang.String r1 = r3.Hw();     // Catch: java.lang.Throwable -> L11
        abcd.Os r2 = j6.get(r1);     // Catch: java.lang.Throwable -> L11
        if (r2 == null) goto L8;
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L11
        return r2;
    L8:
        j6.put(r1, r3);     // Catch: java.lang.Throwable -> L11
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L11
        return r3;
    L11:
        th = move-exception;
        throw th;
    }

    private static abcd.Qs[] DW(java.lang.String r8) {
        int r0 = r8.length();
        int r1 = 0;
        if (r8.charAt(0) != '(') goto L28;
        int r4 = 1;
        int r5 = 0;
    L6:
        if (r4 >= r0) goto L16;
        char r7 = r8.charAt(r4);
        if (r7 == ')') goto L9;
        if (r7 < 'A') goto L15;
        if (r7 > 'Z') goto L15;
        r5 = r5 + 1;
    L15:
        r4 = r4 + 1;
        goto L6
    L9:
        r1 = r4;
    L16:
        if (r1 == 0) goto L26;
        if (r1 == (r0 - 1)) goto L26;
        if (r8.indexOf(41, r1 + 1) != (-1)) goto L24;
        return new abcd.Qs[r5];
    L24:
        throw new java.lang.IllegalArgumentException("bad descriptor");
    L26:
        throw new java.lang.IllegalArgumentException("bad descriptor");
    L28:
        throw new java.lang.IllegalArgumentException("bad descriptor");
    }

    public static abcd.Os j6(abcd.Qs r3, int r4) {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(100);
        r0.append('(');
        int r1 = 0;
    L3:
        if (r1 >= r4) goto L5;
        r0.append('I');
        r1 = r1 + 1;
        goto L3
    L5:
        r0.append(')');
        r0.append(r3.J8());
        return j6(r0.toString());
    }

    public static abcd.Os j6(java.lang.String r8) {
        if (r8 == null) goto L34;
        java.util.HashMap<java.lang.String, abcd.Os> r0 = j6;
        monitor-enter(r0);
        abcd.Os r1 = j6.get(r8);     // Catch: java.lang.Throwable -> L30
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L30
        if (r1 == null) goto L9;
        return r1;
    L9:
        abcd.Qs[] r2 = DW(r8);
        int r3 = 0;
        int r4 = 1;
        int r5 = 0;
    L10:
        char r6 = r8.charAt(r4);
        if (r6 == ')') goto L12;
        int r7 = r4;
    L19:
        if (r6 != '[') goto L22;
        r7 = r7 + 1;
        r6 = r8.charAt(r7);
        goto L19
    L22:
        if (r6 != 'L') goto L28;
        int r9 = r8.indexOf(59, r7);
        if (r9 == (-1)) goto L27;
        int r10 = r9 + 1;
    L29:
        r2[r5] = abcd.Qs.j6(r8.substring(r4, r10));
        r5 = r5 + 1;
        r4 = r10;
        goto L10
    L27:
        throw new java.lang.IllegalArgumentException("bad descriptor");
    L28:
        r10 = r7 + 1;
        goto L29
    L12:
        abcd.Qs r11 = abcd.Qs.FH(r8.substring(r4 + 1));
        abcd.Ps r12 = new abcd.Ps(r5);
    L13:
        if (r3 >= r5) goto L16;
        r12.j6(r3, r2[r3]);
        r3 = r3 + 1;
        goto L13
    L16:
        return DW(new abcd.Os(r8, r11, r12));
    L30:
        th = move-exception;
        throw th;
    L34:
        throw new java.lang.NullPointerException("descriptor == null");
    }

    public static abcd.Os j6(java.lang.String r0, abcd.Qs r1, boolean r2, boolean r3) {
        abcd.Os r4 = j6(r0);
        if (r2 == false) goto L5;
        return r4;
    L5:
        if (r3 == false) goto L8;
        r1 = r1.j6(Integer.MAX_VALUE);
    L8:
        return r4.j6(r1);
    }

    public java.lang.String Hw() {
        return this.DW;
    }

    public abcd.Ps VH() {
        return this.Hw;
    }

    public abcd.Ps Zo() {
        if (this.v5 != null) goto L15;
        int r0 = this.Hw.size();
        abcd.Ps r1 = new abcd.Ps(r0);
        int r2 = 0;
        boolean r3 = false;
    L5:
        if (r2 >= r0) goto L10;
        abcd.Qs r4 = this.Hw.get(r2);
        if (r4.gW() == false) goto L9;
        r4 = abcd.Qs.VH;
        r3 = true;
    L9:
        r1.j6(r2, r4);
        r2 = r2 + 1;
        goto L5
    L10:
        if (r3 == true) goto L13;
        r1 = this.Hw;
    L13:
        this.v5 = r1;
    L15:
        return this.v5;
    }

    @Override
    public int compareTo(abcd.Os r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof abcd.Os) == true) goto L10;
        return false;
    L10:
        return this.DW.equals(((abcd.Os) r2).DW);
    }

    public int hashCode() {
        return this.DW.hashCode();
    }

    public int j6(abcd.Os r8) {
        if (this != r8) goto L5;
        return 0;
    L5:
        int r1 = this.FH.j6(r8.FH);
        if (r1 == 0) goto L8;
        return r1;
    L8:
        int r2 = this.Hw.size();
        int r3 = r8.Hw.size();
        int r4 = java.lang.Math.min(r2, r3);
        int r5 = 0;
    L9:
        if (r5 >= r4) goto L14;
        int r6 = this.Hw.get(r5).j6(r8.Hw.get(r5));
        if (r6 != 0) goto L12;
        r5 = r5 + 1;
        goto L9
    L12:
        return r6;
    L14:
        if (r2 >= r3) goto L17;
        return -1;
    L17:
        if (r2 <= r3) goto L20;
        return 1;
    L20:
        return 0;
    }

    public abcd.Os j6(abcd.Qs r4) {
        java.lang.String r0 = "(" + r4.J8() + this.DW.substring(1);
        abcd.Ps r5 = this.Hw.FH(r4);
        r5.we();
        return DW(new abcd.Os(r0, this.FH, r5));
    }

    public java.lang.String toString() {
        return this.DW;
    }

    public abcd.Qs we() {
        return this.FH;
    }
}
