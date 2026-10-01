package abcd;

class PF extends abcd.XF {
    abcd.XF j6;

    private class a extends abcd.XF {
        private final abcd.UF DW;
        private final abcd.XF FH;
        final abcd.PF Hw;
        private final abcd.qG j6;

        a(abcd.PF r1, abcd.qG r2, abcd.XF r3) {
            this.Hw = r1;
            this.j6 = r2;
            this.DW = new abcd.UF();
            this.FH = r3;
            this.FH.j6(this.DW);
        }

        @Override
        int DW() {
            return this.FH.DW();
        }

        @Override
        abcd.dG j6() {
            abcd.dG r0 = this.FH.j6();
            if (r0 == null) goto L11;
            abcd.dG[] r1 = r0.J8;
            int r2 = r1.length;
            int r3 = 0;
        L5:
            if (r3 >= r2) goto L6;
            abcd.dG r4 = r1[r3];
            if ((r4.EQ & 4) == 0) goto L10;
            this.DW.j6(r4);
        L10:
            r3 = r3 + 1;
            goto L5
        L6:
            return r0;
        L11:
            abcd.UF r5 = new abcd.UF();
            r5.j6(this.DW);
        L12:
            abcd.dG r6 = this.DW.j6();
            if (r6 == null) goto L14;
            int r7 = r6.EQ;
            if ((r7 & 16) != 0) goto L12;
            if ((r7 & 1) != 0) goto L22;
            r6.j6(this.j6);
        L22:
            r6.EQ = 16 | r6.EQ;
            r5.j6(r6);
            goto L12
        L14:
            r5.DW(16);
            this.Hw.j6 = r5;
            return r5.j6();
        }

        @Override
        void j6(abcd.OF r2) {
            r2.j6(this.DW);
        }
    }

    PF(abcd.qG r2, abcd.XF r3) {
        this.j6 = new abcd.PF.a(this, r2, r3);
    }

    @Override
    int DW() {
        return this.j6.DW() | 16;
    }

    @Override
    abcd.dG j6() {
        return this.j6.j6();
    }

    @Override
    void j6(abcd.OF r2) {
        this.j6.j6(r2);
    }
}
