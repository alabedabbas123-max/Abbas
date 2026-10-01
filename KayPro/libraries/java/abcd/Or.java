package abcd;

public final class Or extends abcd.du {
    private int Hw;

    private static class a implements abcd.Tr.b {
        private int j6;

        public a() {
            this.j6 = 0;
        }

        private void j6(abcd.Tr r4) {
            abcd.bs r0 = r4.VH();
            if (r0 == null) goto L5;
            j6(r0);
        L5:
            abcd.cs r5 = r4.gn();
            int r1 = r5.size();
            int r2 = 0;
        L6:
            if (r2 >= r1) goto L8;
            j6(r5.get(r2));
            r2 = r2 + 1;
            goto L6
        }

        private void j6(abcd.bs r2) {
            int r3 = r2.VH();
            if (r3 <= this.j6) goto L6;
            this.j6 = r3;
            return;
        }

        public int j6() {
            return this.j6;
        }

        @Override
        public void j6(abcd.Sr r1) {
            j6(r1);
        }

        @Override
        public void j6(abcd.Yr r1) {
            j6(r1);
        }

        @Override
        public void j6(abcd.Zr r1) {
            j6(r1);
        }

        @Override
        public void j6(abcd.is r1) {
            j6(r1);
        }

        @Override
        public void j6(abcd.js r1) {
            j6(r1);
        }

        @Override
        public void j6(abcd.ks r1) {
            j6(r1);
        }
    }

    public Or(int r1) {
        super(r1);
        this.Hw = -1;
    }

    private Or(abcd.Or r1) {
        super(r1);
        this.Hw = r1.Hw;
    }

    public int BT() {
        if (this.Hw != (-1)) goto L6;
        abcd.Or.a r0 = new abcd.Or.a();
        j6(r0);
        this.Hw = r0.j6();
    L6:
        return this.Hw;
    }

    public int er() {
        int r0 = size();
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r0) goto L14;
        abcd.Nr r4 = (abcd.Nr) FH(r2);
        if (r4 == null) goto L13;
        abcd.Ur r5 = r4.Hw();
        int r6 = r5.size();
        int r7 = r3;
        int r8 = 0;
    L7:
        if (r8 >= r6) goto L12;
        if (r5.get(r8).v5().Hw() == 54) goto L11;
        r7 = r7 + 1;
    L11:
        r8 = r8 + 1;
        goto L7
    L12:
        r3 = r7;
    L13:
        r2 = r2 + 1;
        goto L3
    L14:
        return r3;
    }

    public abcd.Or gW() {
        return new abcd.Or(this);
    }

    public abcd.Nr get(int r1) {
        return (abcd.Nr) DW(r1);
    }

    public abcd.Nr j6(abcd.Nr r5) {
        int r0 = r5.Zo();
        abcd.au r6 = r5.gn();
        int r1 = r6.size();
        if (r1 != 0) goto L5;
        return null;
    L5:
        if (r1 == 1) goto L13;
        if (r0 == (-1)) goto L11;
        return v5(r0);
    L11:
        return v5(r6.get(0));
    L13:
        return v5(r6.get(0));
    }

    public void j6(int r1, abcd.Nr r2) {
        super.j6(r1, r2);
        this.Hw = -1;
    }

    public void j6(abcd.Tr.b r4) {
        int r0 = size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        get(r1).Hw().j6(r4);
        r1 = r1 + 1;
        goto L3
    }

    public abcd.Nr v5(int r4) {
        int r0 = Hw(r4);
        if (r0 < 0) goto L7;
        return get(r0);
    L7:
        throw new java.lang.IllegalArgumentException("no such label: " + abcd.Yt.v5(r4));
    }

    public int yS() {
        int r0 = size();
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r0) goto L8;
        abcd.Nr r3 = (abcd.Nr) FH(r1);
        if (r3 == null) goto L7;
        r2 = r2 + r3.Hw().size();
    L7:
        r1 = r1 + 1;
        goto L3
    L8:
        return r2;
    }
}
