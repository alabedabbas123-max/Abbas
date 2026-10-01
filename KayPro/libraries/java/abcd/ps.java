package abcd;

public final class ps extends abcd.Abstractms {
    private final abcd.ps.a j6;

    public static final class a extends abcd.Xt implements java.lang.Comparable<abcd.ps.a> {
        public a(int r1) {
            super(r1);
        }

        @Override
        public int compareTo(abcd.ps.a r1) {
            return j6(r1);
        }

        public abcd.Abstractms get(int r1) {
            return (abcd.Abstractms) DW(r1);
        }

        public int j6(abcd.ps.a r8) {
            int r0 = size();
            int r1 = r8.size();
            if (r0 >= r1) goto L5;
            int r2 = r0;
        L6:
            int r4 = 0;
        L7:
            if (r4 >= r2) goto L12;
            int r5 = ((abcd.Abstractms) DW(r4)).j6((abcd.Abstractms) r8.DW(r4));
            if (r5 != 0) goto L10;
            r4 = r4 + 1;
            goto L7
        L10:
            return r5;
        L12:
            if (r0 >= r1) goto L15;
            return -1;
        L15:
            if (r0 <= r1) goto L18;
            return 1;
        L18:
            return 0;
        L5:
            r2 = r1;
            goto L6
        }

        public void j6(int r1, abcd.Abstractms r2) {
            j6(r1, r2);
        }
    }

    public ps(abcd.ps.a r2) {
        if (r2 == null) goto L7;
        r2.Ws();
        this.j6 = r2;
        return;
    L7:
        throw new java.lang.NullPointerException("list == null");
    }

    @Override
    protected int DW(abcd.Abstractms r2) {
        return this.j6.j6(((abcd.ps) r2).j6);
    }

    @Override
    public boolean Hw() {
        return false;
    }

    public abcd.ps.a VH() {
        return this.j6;
    }

    @Override
    public java.lang.String Zo() {
        return "array";
    }

    @Override
    public java.lang.String aM() {
        return this.j6.j6("{", ", ", "}");
    }

    public boolean equals(java.lang.Object r2) {
        if ((r2 instanceof abcd.ps) == true) goto L7;
        return false;
    L7:
        return this.j6.equals(((abcd.ps) r2).j6);
    }

    public int hashCode() {
        return this.j6.hashCode();
    }

    public java.lang.String toString() {
        return this.j6.DW("array{", ", ", "}");
    }
}
