package abcd;

public final class Qm extends abcd.Xt {
    public static final abcd.Qm FH = null;

    public static class a {
        private final int DW;
        private final abcd.Js FH;
        private final abcd.Js Hw;
        private final int Zo;
        private final int j6;
        private final abcd.Js v5;

        public a(int r1, int r2, abcd.Js r3, abcd.Js r4, abcd.Js r5, int r6) {
            if (r1 < 0) goto L21;
            if (r2 < 0) goto L19;
            if (r3 == null) goto L17;
            if (r4 != null) goto L11;
            if (r5 != null) goto L11;
            throw new java.lang.NullPointerException("(descriptor == null) && (signature == null)");
        L11:
            if (r6 < 0) goto L15;
            this.j6 = r1;
            this.DW = r2;
            this.FH = r3;
            this.Hw = r4;
            this.v5 = r5;
            this.Zo = r6;
            return;
        L15:
            throw new java.lang.IllegalArgumentException("index < 0");
        L17:
            throw new java.lang.NullPointerException("name == null");
        L19:
            throw new java.lang.IllegalArgumentException("length < 0");
        L21:
            throw new java.lang.IllegalArgumentException("startPc < 0");
        }

        private abcd.Js FH() {
            return this.v5;
        }

        static abcd.Js j6(abcd.Qm.a r0) {
            return r0.FH();
        }

        public abcd.Qs DW() {
            return abcd.Qs.j6(this.Hw.we());
        }

        public boolean DW(abcd.Qm.a r3) {
            if (this.j6 == r3.j6) goto L5;
        L11:
            return false;
        L5:
            if (this.DW != r3.DW) goto L11;
            if (this.Zo != r3.Zo) goto L11;
            if (this.FH.equals(r3.FH) == false) goto L11;
            return true;
        }

        public abcd.Qm.a j6(abcd.Js r9) {
            return new abcd.Qm.a(this.j6, this.DW, this.FH, this.Hw, r9, this.Zo);
        }

        public abcd.Vr j6() {
            return abcd.Vr.j6(this.FH, this.v5);
        }

        public boolean j6(int r2, int r3) {
            if (r3 != this.Zo) goto L9;
            int r4 = this.j6;
            if (r2 < r4) goto L9;
            if (r2 >= (r4 + this.DW)) goto L9;
            return true;
        L9:
            return false;
        }
    }

    static {
        FH = new abcd.Qm(0);
    }

    public Qm(int r1) {
        super(r1);
    }

    public static abcd.Qm DW(abcd.Qm r5, abcd.Qm r6) {
        int r0 = r5.size();
        abcd.Qm r1 = new abcd.Qm(r0);
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L8;
        abcd.Qm.a r3 = r5.get(r2);
        abcd.Qm.a r4 = r6.j6(r3);
        if (r4 == null) goto L7;
        r3 = r3.j6(abcd.Qm.a.j6(r4));
    L7:
        r1.j6(r2, r3);
        r2 = r2 + 1;
        goto L3
    L8:
        r1.we();
        return r1;
    }

    public static abcd.Qm j6(abcd.Qm r6, abcd.Qm r7) {
        if (r6 != FH) goto L5;
        return r7;
    L5:
        int r0 = r6.size();
        int r1 = r7.size();
        abcd.Qm r2 = new abcd.Qm(r0 + r1);
        int r3 = 0;
        int r4 = 0;
    L6:
        if (r4 >= r0) goto L8;
        r2.j6(r4, r6.get(r4));
        r4 = r4 + 1;
    L8:
        if (r3 >= r1) goto L10;
        r2.j6(r0 + r3, r7.get(r3));
        r3 = r3 + 1;
        goto L8
    L10:
        r2.we();
        return r2;
    }

    public abcd.Qm.a get(int r1) {
        return (abcd.Qm.a) DW(r1);
    }

    public abcd.Qm.a j6(int r5, int r6) {
        int r0 = size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L10;
        abcd.Qm.a r2 = (abcd.Qm.a) DW(r1);
        if (r2 == null) goto L9;
        if (r2.j6(r5, r6) == false) goto L9;
        return r2;
    L9:
        r1 = r1 + 1;
        goto L3
    L10:
        return null;
    }

    public abcd.Qm.a j6(abcd.Qm.a r5) {
        int r0 = size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L10;
        abcd.Qm.a r2 = (abcd.Qm.a) DW(r1);
        if (r2 == null) goto L9;
        if (r2.DW(r5) == false) goto L9;
        return r2;
    L9:
        r1 = r1 + 1;
        goto L3
    L10:
        return null;
    }

    public void j6(int r9, int r10, int r11, abcd.Js r12, abcd.Js r13, abcd.Js r14, int r15) {
        j6(r9, new abcd.Qm.a(r10, r11, r12, r13, r14, r15));
    }

    public void j6(int r1, abcd.Qm.a r2) {
        if (r2 == null) goto L6;
        j6(r1, r2);
        return;
    L6:
        throw new java.lang.NullPointerException("item == null");
    }
}
