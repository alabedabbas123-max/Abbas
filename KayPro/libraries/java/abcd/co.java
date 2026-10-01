package abcd;

public final class co extends abcd.Xt {
    public static final abcd.co FH = null;

    public static final enum a extends java.lang.Enum<abcd.co.a> {
        public static final abcd.co.a DW = null;
        public static final abcd.co.a FH = null;
        public static final abcd.co.a Hw = null;
        private static final abcd.co.a[] VH = null;
        public static final abcd.co.a Zo = null;
        public static final abcd.co.a j6 = null;
        public static final abcd.co.a v5 = null;

        static {
            j6 = new abcd.co.a("START", 0);
            DW = new abcd.co.a("END_SIMPLY", 1);
            FH = new abcd.co.a("END_REPLACED", 2);
            Hw = new abcd.co.a("END_MOVED", 3);
            v5 = new abcd.co.a("END_CLOBBERED_BY_PREV", 4);
            Zo = new abcd.co.a("END_CLOBBERED_BY_NEXT", 5);
            VH = new abcd.co.a[]{j6, DW, FH, Hw, v5, Zo};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.co.a valueOf(java.lang.String r1) {
            return (abcd.co.a) java.lang.Enum.valueOf(abcd.co.a.class, r1);
        }

        public static abcd.co.a[] values() {
            return (abcd.co.a[]) VH.clone();
        }
    }

    public static class b implements java.lang.Comparable<abcd.co.b> {
        private final abcd.co.a DW;
        private final abcd.bs FH;
        private final abcd.Ks Hw;
        private final int j6;

        public b(int r2, abcd.co.a r3, abcd.bs r4) {
            if (r2 < 0) goto L16;
            if (r3 == null) goto L14;
            if (r4.Zo() == null) goto L10;
            this.j6 = r2;
            this.DW = r3;
            this.FH = r4;
            this.Hw = abcd.Ks.DW(r4.getType());
            return;
        L10:
            throw new java.lang.NullPointerException("spec.getLocalItem() == null");     // Catch: java.lang.NullPointerException -> L11
        L12:
            throw new java.lang.NullPointerException("spec == null");
        L14:
            throw new java.lang.NullPointerException("disposition == null");
        L16:
            throw new java.lang.IllegalArgumentException("address < 0");
        }

        public boolean DW(abcd.co.b r1) {
            return j6(r1.FH);
        }

        public int Hw() {
            return this.j6;
        }

        public abcd.bs J8() {
            return this.FH;
        }

        public abcd.Js VH() {
            return this.FH.Zo().Hw();
        }

        public abcd.Js Ws() {
            return this.FH.Zo().Zo();
        }

        public abcd.co.a Zo() {
            return this.DW;
        }

        public abcd.Ks aM() {
            return this.Hw;
        }

        @Override
        public int compareTo(abcd.co.b r1) {
            return j6(r1);
        }

        public boolean equals(java.lang.Object r3) {
            if ((r3 instanceof abcd.co.b) == true) goto L6;
            return false;
        L6:
            if (j6((abcd.co.b) r3) != 0) goto L9;
            return true;
        L9:
            return false;
        }

        public boolean j3() {
            if (this.DW != abcd.co.a.j6) goto L5;
            return true;
        L5:
            return false;
        }

        public int j6(abcd.co.b r5) {
            int r0 = this.j6;
            int r1 = r5.j6;
            if (r0 >= r1) goto L6;
            return -1;
        L6:
            if (r0 <= r1) goto L8;
            return 1;
        L8:
            boolean r2 = j3();
            if (r2 == r5.j3()) goto L14;
            if (r2 == false) goto L15;
            return 1;
        L15:
            return -1;
        L14:
            return this.FH.j6(r5.FH);
        }

        public abcd.co.b j6(abcd.co.a r4) {
            if (r4 != this.DW) goto L6;
            return this;
        L6:
            return new abcd.co.b(this.j6, r4, this.FH);
        }

        public boolean j6(abcd.bs r2) {
            return this.FH.DW(r2);
        }

        public java.lang.String toString() {
            return java.lang.Integer.toHexString(this.j6) + " " + this.DW + " " + this.FH;
        }

        public int we() {
            return this.FH.we();
        }
    }

    public static class c {
        private int DW;
        private abcd.ds FH;
        private int[] Hw;
        private final java.util.ArrayList<abcd.co.b> j6;
        private int v5;

        public c(int r2) {
            this.j6 = new java.util.ArrayList(r2);
            this.DW = 0;
            this.FH = null;
            this.Hw = null;
            this.v5 = 0;
        }

        private void DW(int r4, abcd.co.a r5, abcd.bs r6) {
            if (r5 == abcd.co.a.j6) goto L15;
            int r0 = r6.we();
            int r1 = this.Hw[r0];
            if (r1 < 0) goto L12;
            abcd.co.b r2 = this.j6.get(r1);
            if (r2.Hw() != r4) goto L12;
            if (r2.J8().equals(r6) == false) goto L12;
            this.j6.set(r1, r2.j6(r5));
            this.FH.Hw(r6);
            return;
        L12:
            j6(r4, r6, r5);
            return;
        L15:
            throw new java.lang.RuntimeException("shouldn't happen");
        }

        private boolean FH(int r6, abcd.bs r7) {
            int r0 = this.j6.size() - 1;
        L3:
            boolean r2 = false;
            if (r0 < 0) goto L15;
            abcd.co.b r3 = this.j6.get(r0);
            if (r3 == null) goto L14;
            if (r3.Hw() != r6) goto L10;
            if (r3.j6(r7) == false) goto L14;
        L10:
            return false;
        L14:
            r0 = r0 - 1;
        L15:
            this.FH.Hw(r7);
            abcd.co.b r4 = null;
            this.j6.set(r0, null);
            this.DW++;
            int r8 = r7.we();
        L16:
            r0 = r0 - 1;
            if (r0 < 0) goto L24;
            r4 = this.j6.get(r0);
            if (r4 == null) goto L16;
            if (r4.J8().we() != r8) goto L16;
            r2 = true;
        L24:
            if (r2 == false) goto L28;
            this.Hw[r8] = r0;
            if (r4.Hw() != r6) goto L28;
            this.j6.set(r0, r4.j6(abcd.co.a.DW));
        L28:
            return true;
        }

        private static abcd.bs j6(abcd.bs r2) {
            if (r2 != null) goto L4;
            return r2;
        L4:
            if (r2.getType() == abcd.Qs.EQ) goto L6;
            return r2;
        L6:
            return r2.j6(abcd.Qs.QX);
        }

        private void j6(int r5, int r6) {
            if (this.Hw != null) goto L5;
            boolean r0 = true;
        L7:
            if (r5 != this.v5) goto L11;
            if (r0 == true) goto L11;
            return;
        L11:
            if (r5 < this.v5) goto L21;
            if (r0 == false) goto L14;
        L15:
            int r7 = r6 + 1;
            abcd.ds r8 = new abcd.ds(r7);
            int[] r9 = new int[r7];
            java.util.Arrays.fill(r9, -1);
            if (r0 == true) goto L18;
            r8.j6(this.FH);
            int[] r1 = this.Hw;
            java.lang.System.arraycopy(r1, 0, r9, 0, r1.length);
        L18:
            this.FH = r8;
            this.Hw = r9;
            return;
        L14:
            if (r6 >= this.Hw.length) goto L15;
            return;
        L21:
            throw new java.lang.RuntimeException("shouldn't happen");
        L5:
            r0 = false;
            goto L7
        }

        private void j6(int r4, abcd.co.a r5, abcd.bs r6) {
            int r0 = r6.we();
            this.j6.add(new abcd.co.b(r4, r5, r6));
            if (r5 != abcd.co.a.j6) goto L5;
            this.FH.FH(r6);
            this.Hw[r0] = -1;
            return;
        L5:
            this.FH.Hw(r6);
            this.Hw[r0] = this.j6.size() - 1;
        }

        public void DW(int r5, abcd.bs r6) {
            int r0 = r6.we();
            abcd.bs r7 = j6(r6);
            j6(r5, r0);
            abcd.bs r1 = this.FH.get(r0);
            if (r7.DW(r1) == false) goto L5;
            return;
        L5:
            abcd.bs r2 = this.FH.j6(r7);
            if (r2 == null) goto L8;
            DW(r5, abcd.co.a.Hw, r2);
        L8:
            int r3 = this.Hw[r0];
            if (r1 == null) goto L11;
            j6(r5, abcd.co.a.FH, r1);
        L19:
            if (r0 <= 0) goto L26;
            abcd.bs r4 = this.FH.get(r0 - 1);
            if (r4 == null) goto L26;
            if (r4.Ws() == false) goto L26;
            DW(r5, abcd.co.a.Zo, r4);
        L26:
            if (r7.Ws() == false) goto L30;
            abcd.bs r8 = this.FH.get(r0 + 1);
            if (r8 == null) goto L30;
            DW(r5, abcd.co.a.v5, r8);
        L30:
            j6(r5, abcd.co.a.j6, r7);
            return;
        L11:
            if (r3 < 0) goto L19;
            abcd.co.b r9 = this.j6.get(r3);
            if (r9.Hw() != r5) goto L19;
            if (r9.j6(r7) == false) goto L18;
            this.j6.set(r3, null);
            this.DW++;
            this.FH.FH(r7);
            this.Hw[r0] = -1;
            return;
        L18:
            this.j6.set(r3, r9.j6(abcd.co.a.FH));
            goto L19
        }

        public abcd.co j6() {
            int r0 = 0;
            j6(Integer.MAX_VALUE, 0);
            int r1 = this.j6.size();
            int r2 = r1 - this.DW;
            if (r2 == 0) goto L5;
            abcd.co.b[] r3 = new abcd.co.b[r2];
            if (r1 != r2) goto L9;
            this.j6.toArray(r3);
        L15:
            java.util.Arrays.sort(r3);
            abcd.co r4 = new abcd.co(r2);
        L16:
            if (r0 >= r2) goto L18;
            r4.j6(r0, r3[r0]);
            r0 = r0 + 1;
            goto L16
        L18:
            r4.we();
            return r4;
        L9:
            java.util.Iterator<abcd.co.b> r5 = this.j6.iterator();
            int r6 = 0;
        L11:
            if (r5.hasNext() == false) goto L15;
            abcd.co.b r7 = r5.next();
            if (r7 == null) goto L11;
            r3[r6] = r7;
            r6 = r6 + 1;
            goto L11
        L5:
            return abcd.co.FH;
        }

        public void j6(int r2, abcd.bs r3) {
            j6(r2, r3, abcd.co.a.DW);
        }

        public void j6(int r3, abcd.bs r4, abcd.co.a r5) {
            int r0 = r4.we();
            abcd.bs r6 = j6(r4);
            j6(r3, r0);
            if (this.Hw[r0] < 0) goto L6;
            return;
        L6:
            if (FH(r3, r6) == false) goto L8;
            return;
        L8:
            j6(r3, r5, r6);
        }

        public void j6(int r6, abcd.ds r7) {
            int r0 = r7.lg();
            j6(r6, r0 - 1);
            int r1 = 0;
        L3:
            if (r1 >= r0) goto L14;
            abcd.bs r2 = this.FH.get(r1);
            abcd.bs r3 = j6(r7.get(r1));
            if (r2 != null) goto L8;
            if (r3 == null) goto L13;
            DW(r6, r3);
        L13:
            r1 = r1 + 1;
            goto L3
        L8:
            if (r3 != null) goto L11;
            j6(r6, r2);
            goto L13
        L11:
            if (r3.DW(r2) == true) goto L13;
            j6(r6, r2);
            DW(r6, r3);
            goto L13
        }
    }

    static {
        FH = new abcd.co(0);
    }

    public co(int r1) {
        super(r1);
    }

    public static abcd.co j6(abcd.Wn r5) {
        int r0 = r5.size();
        abcd.co.c r1 = new abcd.co.c(r0);
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L15;
        abcd.AbstractVn r3 = r5.get(r2);
        if ((r3 instanceof abcd.Cdo) == false) goto L8;
        abcd.ds r4 = ((abcd.Cdo) r3).we();
        r1.j6(r3.FH(), r4);
    L13:
        r2 = r2 + 1;
        goto L3
    L8:
        if ((r3 instanceof abcd.eo) == false) goto L11;
        abcd.bs r6 = ((abcd.eo) r3).we();
        r1.DW(r3.FH(), r6);
        goto L13
    L11:
        if ((r3 instanceof abcd.bo) == false) goto L13;
        abcd.bs r7 = ((abcd.bo) r3).we();
        r1.j6(r3.FH(), r7);
        goto L13
    L15:
        return r1.j6();
    }

    public abcd.co.b get(int r1) {
        return (abcd.co.b) DW(r1);
    }

    public void j6(int r1, abcd.co.b r2) {
        j6(r1, r2);
    }
}
