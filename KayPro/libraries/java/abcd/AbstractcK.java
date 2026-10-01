package abcd;

public abstract class AbstractcK extends abcd.AbstractjK {

    private static class a extends abcd.AbstractcK {
        private final abcd.AbstractjK FH;
        private final abcd.AbstractjK Hw;

        a(abcd.AbstractjK r1, abcd.AbstractjK r2) {
            this.FH = r1;
            this.Hw = r2;
        }

        @Override
        public abcd.AbstractjK clone() {
            return new abcd.AbstractcK.a(this.FH.clone(), this.Hw.clone());
        }

        @Override
        public boolean j6() {
            if (this.FH.j6() == false) goto L5;
            return true;
        L5:
            if (this.Hw.j6() == true) goto L10;
            return false;
        L10:
            return true;
        }

        @Override
        public boolean j6(abcd.YJ r2) {
            if (this.FH.j6(r2) == true) goto L5;
            return false;
        L5:
            if (this.Hw.j6(r2) == false) goto L10;
            return true;
        L10:
            return false;
        }

        @Override
        public java.lang.String toString() {
            return "(" + this.FH.toString() + " AND " + this.Hw.toString() + ")";
        }
    }

    private static class b extends abcd.AbstractcK {
        private final abcd.AbstractjK[] FH;

        b(abcd.AbstractjK[] r1) {
            this.FH = r1;
        }

        @Override
        public abcd.AbstractjK clone() {
            abcd.AbstractjK[] r0 = new abcd.AbstractjK[this.FH.length];
            int r1 = 0;
        L4:
            if (r1 >= r0.length) goto L6;
            r0[r1] = this.FH[r1].clone();
            r1 = r1 + 1;
            goto L4
        L6:
            return new abcd.AbstractcK.b(r0);
        }

        @Override
        public boolean j6() {
            abcd.AbstractjK[] r0 = this.FH;
            int r1 = r0.length;
            int r3 = 0;
        L3:
            if (r3 >= r1) goto L4;
            if (r0[r3].j6() == true) goto L7;
            r3 = r3 + 1;
            goto L3
        L7:
            return true;
        L4:
            return false;
        }

        @Override
        public boolean j6(abcd.YJ r6) {
            abcd.AbstractjK[] r0 = this.FH;
            int r1 = r0.length;
            int r3 = 0;
        L3:
            if (r3 >= r1) goto L4;
            if (r0[r3].j6(r6) == false) goto L8;
            r3 = r3 + 1;
            goto L3
        L8:
            return false;
        L4:
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder();
            r0.append("(");
            int r1 = 0;
        L4:
            if (r1 >= this.FH.length) goto L5;
            if (r1 <= 0) goto L9;
            r0.append(" AND ");
        L9:
            r0.append(this.FH[r1].toString());
            r1 = r1 + 1;
            goto L4
        L5:
            r0.append(")");
            return r0.toString();
        }
    }

    public AbstractcK() {
    }

    public static abcd.AbstractjK j6(abcd.AbstractjK r1, abcd.AbstractjK r2) {
        abcd.AbstractjK r0 = abcd.AbstractjK.j6;
        if (r1 != r0) goto L5;
        return r2;
    L5:
        if (r2 != r0) goto L8;
        return r1;
    L8:
        return new abcd.AbstractcK.a(r1, r2);
    }

    public static abcd.AbstractjK j6(java.util.Collection<abcd.AbstractjK> r2) {
        if (r2.size() < 2) goto L11;
        abcd.AbstractjK[] r0 = new abcd.AbstractjK[r2.size()];
        r2.toArray(r0);
        if (r0.length != 2) goto L9;
        return j6(r0[0], r0[1]);
    L9:
        return new abcd.AbstractcK.b(r0);
    L11:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().atLeastTwoFiltersNeeded);
    }
}
