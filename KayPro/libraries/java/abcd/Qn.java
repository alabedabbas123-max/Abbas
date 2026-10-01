package abcd;

public final class Qn extends abcd.Xt implements java.lang.Comparable<abcd.Qn> {
    public static final abcd.Qn FH = null;

    public static class a implements java.lang.Comparable<abcd.Qn.a> {
        private final int DW;
        private final abcd.Ks j6;

        public a(abcd.Ks r1, int r2) {
            if (r2 < 0) goto L10;
            if (r1 == null) goto L8;
            this.DW = r2;
            this.j6 = r1;
            return;
        L8:
            throw new java.lang.NullPointerException("exceptionType == null");
        L10:
            throw new java.lang.IllegalArgumentException("handler < 0");
        }

        public abcd.Ks Hw() {
            return this.j6;
        }

        public int Zo() {
            return this.DW;
        }

        @Override
        public int compareTo(abcd.Qn.a r1) {
            return j6(r1);
        }

        public boolean equals(java.lang.Object r3) {
            if ((r3 instanceof abcd.Qn.a) == true) goto L5;
            return false;
        L5:
            if (j6((abcd.Qn.a) r3) != 0) goto L9;
            return true;
        L9:
            return false;
        }

        public int hashCode() {
            return (this.DW * 31) + this.j6.hashCode();
        }

        public int j6(abcd.Qn.a r3) {
            int r0 = this.DW;
            int r1 = r3.DW;
            if (r0 >= r1) goto L6;
            return -1;
        L6:
            if (r0 <= r1) goto L10;
            return 1;
        L10:
            return this.j6.j6(r3.j6);
        }
    }

    static {
        FH = new abcd.Qn(0);
    }

    public Qn(int r1) {
        super(r1);
    }

    @Override
    public java.lang.String aM() {
        return j6("", "");
    }

    @Override
    public int compareTo(abcd.Qn r1) {
        return j6(r1);
    }

    public abcd.Qn.a get(int r1) {
        return (abcd.Qn.a) DW(r1);
    }

    public int j6(abcd.Qn r8) {
        if (this != r8) goto L5;
        return 0;
    L5:
        int r1 = size();
        int r2 = r8.size();
        int r3 = java.lang.Math.min(r1, r2);
        int r4 = 0;
    L6:
        if (r4 >= r3) goto L11;
        int r5 = get(r4).j6(r8.get(r4));
        if (r5 != 0) goto L9;
        r4 = r4 + 1;
        goto L6
    L9:
        return r5;
    L11:
        if (r1 >= r2) goto L14;
        return -1;
    L14:
        if (r1 <= r2) goto L17;
        return 1;
    L17:
        return 0;
    }

    public java.lang.String j6(java.lang.String r5, java.lang.String r6) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder(100);
        int r1 = size();
        r0.append(r5);
        r0.append(r6);
        r0.append("catch ");
        int r7 = 0;
    L3:
        if (r7 >= r1) goto L15;
        abcd.Qn.a r2 = get(r7);
        if (r7 == 0) goto L8;
        r0.append(",\n");
        r0.append(r5);
        r0.append("  ");
    L8:
        if (r7 == (r1 - 1)) goto L10;
    L12:
        r0.append(r2.Hw().aM());
    L13:
        r0.append(" -> ");
        r0.append(abcd.Yt.Zo(r2.Zo()));
        r7 = r7 + 1;
        goto L3
    L10:
        if (rN() == false) goto L12;
        r0.append("<any>");
        goto L13
    L15:
        return r0.toString();
    }

    public void j6(int r2, abcd.Ks r3, int r4) {
        j6(r2, new abcd.Qn.a(r3, r4));
    }

    public boolean rN() {
        int r0 = size();
        if (r0 != 0) goto L7;
        return false;
    L7:
        return get(r0 - 1).Hw().equals(abcd.Ks.DW);
    }
}
