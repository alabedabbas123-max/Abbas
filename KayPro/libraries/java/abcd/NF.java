package abcd;

class NF {
    private abcd.NF.a DW;
    private abcd.NF.a FH;
    private abcd.NF.b j6;

    static final class a {
        final abcd.AbstractiG[] DW;
        int FH;
        int Hw;
        abcd.NF.a j6;

        a() {
            this.DW = new abcd.AbstractiG[256];
        }

        boolean DW() {
            if (this.FH != this.Hw) goto L6;
            return true;
        L6:
            return false;
        }

        boolean FH() {
            if (this.Hw != 256) goto L6;
            return true;
        L6:
            return false;
        }

        abcd.AbstractiG Hw() {
            abcd.AbstractiG[] r0 = this.DW;
            int r1 = this.FH;
            this.FH = r1 + 1;
            return r0[r1];
        }

        void j6() {
            this.j6 = null;
            this.FH = 0;
            this.Hw = 0;
        }

        void j6(abcd.AbstractiG r4) {
            abcd.AbstractiG[] r0 = this.DW;
            int r1 = this.Hw;
            this.Hw = r1 + 1;
            r0[r1] = r4;
        }
    }

    static final class b {
        private abcd.NF.a j6;

        b() {
        }

        abcd.NF.a j6() {
            abcd.NF.a r0 = this.j6;
            if (r0 == null) goto L5;
            this.j6 = r0.j6;
            r0.j6();
            return r0;
        L5:
            return new abcd.NF.a();
        }

        void j6(abcd.NF.a r2) {
            r2.j6 = this.j6;
            this.j6 = r2;
        }
    }

    NF() {
        this.j6 = new abcd.NF.b();
    }

    abcd.AbstractiG j6() {
        abcd.NF.a r0 = this.DW;
        if (r0 != null) goto L5;
        return null;
    L5:
        abcd.AbstractiG r2 = r0.Hw();
        if (r0.DW() == false) goto L11;
        this.DW = r0.j6;
        if (this.DW != null) goto L10;
        this.FH = null;
    L10:
        this.j6.j6(r0);
    L11:
        return r2;
    }

    void j6(abcd.AbstractiG r3) {
        abcd.NF.a r0 = this.FH;
        if (r0 != null) goto L7;
        abcd.NF.a r1 = this.j6.j6();
        r1.j6(r3);
        this.DW = r1;
        this.FH = r1;
        return;
    L7:
        if (r0.FH() == false) goto L9;
        r0 = this.j6.j6();
        this.FH.j6 = r0;
        this.FH = r0;
    L9:
        r0.j6(r3);
    }
}
