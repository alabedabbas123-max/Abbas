package abcd;

public class hK {

    static class a extends abcd.AbstractjK {
        private static final java.util.Comparator<abcd.fK> FH = null;
        private final abcd.fK[] Hw;

        static {
            FH = new abcd.gK();
        }

        private a(abcd.fK[] r2) {
            this.Hw = r2;
            java.util.Arrays.sort(this.Hw, FH);
        }

        a(abcd.fK[] r1, abcd.hK.a r2) {
            this(r1);
        }

        @Override
        public abcd.AbstractjK clone() {
            return this;
        }

        @Override
        public boolean j6() {
            abcd.fK[] r0 = this.Hw;
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
            int r0 = this.Hw.length;
            int r2 = 0;
        L3:
            byte[] r3 = this.Hw[r2].Hw;
            int r4 = r6.j6(r3, r3.length);
            if (r4 == 0) goto L5;
            r2 = r2 + 1;
            if (r2 < r0) goto L3;
            if (r4 > 0) goto L13;
            return false;
        L13:
            throw abcd.sD.j6;
        L5:
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder();
            r0.append("FAST(");
            int r1 = 0;
        L4:
            if (r1 >= this.Hw.length) goto L5;
            if (r1 <= 0) goto L9;
            r0.append(" OR ");
        L9:
            r0.append(this.Hw[r1].toString());
            r1 = r1 + 1;
            goto L4
        L5:
            r0.append(")");
            return r0.toString();
        }
    }

    static class b extends abcd.AbstractjK {
        private final abcd.fK FH;
        private final byte[] Hw;

        private b(abcd.fK r1) {
            this.FH = r1;
            this.Hw = this.FH.Hw;
        }

        b(abcd.fK r1, abcd.hK.b r2) {
            this(r1);
        }

        @Override
        public abcd.AbstractjK clone() {
            return this;
        }

        @Override
        public boolean j6() {
            return this.FH.j6();
        }

        @Override
        public boolean j6(abcd.YJ r3) {
            byte[] r0 = this.Hw;
            int r4 = r3.j6(r0, r0.length);
            if (r4 > 0) goto L10;
            if (r4 != 0) goto L7;
            return true;
        L7:
            return false;
        L10:
            throw abcd.sD.j6;
        }

        @Override
        public java.lang.String toString() {
            return "FAST_" + this.FH.toString();
        }
    }

    public static abcd.AbstractjK DW(java.util.Collection<java.lang.String> r4) {
        if (r4.isEmpty() == true) goto L11;
        abcd.fK[] r0 = new abcd.fK[r4.size()];
        int r1 = 0;
        java.util.Iterator<java.lang.String> r5 = r4.iterator();
    L6:
        if (r5.hasNext() == false) goto L8;
        r0[r1] = abcd.fK.j6(r5.next());
        r1 = r1 + 1;
        goto L6
    L8:
        return j6(r0);
    L11:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().atLeastOnePathIsRequired);
    }

    public static abcd.AbstractjK j6(java.util.Collection<abcd.fK> r1) {
        if (r1.isEmpty() == true) goto L7;
        abcd.fK[] r0 = new abcd.fK[r1.size()];
        r1.toArray(r0);
        return j6(r0);
    L7:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().atLeastOnePathIsRequired);
    }

    private static abcd.AbstractjK j6(abcd.fK[] r3) {
        if (r3.length != 1) goto L7;
        return new abcd.hK.b(r3[0], null);
    L7:
        return new abcd.hK.a(r3, null);
    }
}
