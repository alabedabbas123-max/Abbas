package abcd;

abstract class OF extends abcd.LF {
    protected abcd.OF.b FH;

    static final class a {
        final abcd.dG[] DW;
        int FH;
        int Hw;
        abcd.OF.a j6;

        a() {
            this.DW = new abcd.dG[256];
        }

        void DW() {
            this.j6 = null;
            this.FH = 0;
            this.Hw = 0;
        }

        void DW(abcd.dG r3) {
            abcd.dG[] r0 = this.DW;
            int r1 = this.FH - 1;
            this.FH = r1;
            r0[r1] = r3;
        }

        boolean FH() {
            if (this.FH != this.Hw) goto L6;
            return true;
        L6:
            return false;
        }

        boolean Hw() {
            if (this.Hw != 256) goto L6;
            return true;
        L6:
            return false;
        }

        void VH() {
            this.Hw = 128;
            this.FH = 128;
        }

        void Zo() {
            this.Hw = 256;
            this.FH = 256;
        }

        void j6(abcd.dG r4) {
            abcd.dG[] r0 = this.DW;
            int r1 = this.Hw;
            this.Hw = r1 + 1;
            r0[r1] = r4;
        }

        boolean j6() {
            if (this.FH <= 0) goto L6;
            return true;
        L6:
            return false;
        }

        abcd.dG v5() {
            abcd.dG[] r0 = this.DW;
            int r1 = this.FH;
            this.FH = r1 + 1;
            return r0[r1];
        }
    }

    static final class b {
        private abcd.OF.a j6;

        b() {
        }

        abcd.OF.a j6() {
            abcd.OF.a r0 = this.j6;
            if (r0 == null) goto L5;
            this.j6 = r0.j6;
            r0.DW();
            return r0;
        L5:
            return new abcd.OF.a();
        }

        void j6(abcd.OF.a r2) {
            r2.j6 = this.j6;
            this.j6 = r2;
        }
    }

    protected OF() {
        this.FH = new abcd.OF.b();
    }

    OF(abcd.XF r2) {
        this.FH = new abcd.OF.b();
        this.DW = r2.DW();
        r2.j6(this);
    L3:
        abcd.dG r0 = r2.j6();
        if (r0 == null) goto L5;
        j6(r0);
        goto L3
    }

    @Override
    public void j6(abcd.OF r1) {
        this.FH = r1.FH;
    }
}
