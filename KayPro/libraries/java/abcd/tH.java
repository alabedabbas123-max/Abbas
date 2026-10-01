package abcd;

class tH {
    private volatile abcd.tH.a j6;

    private static class a {
        private final int DW;
        final int FH;
        private final java.util.concurrent.atomic.AtomicReferenceArray<abcd.yE> j6;

        a(int r3) {
            this.j6 = new java.util.concurrent.atomic.AtomicReferenceArray(1 << r3);
            this.DW = 32 - r3;
            this.FH = r3;
        }

        private int FH(abcd.YD r2) {
            return r2.hashCode() >>> this.DW;
        }

        boolean DW(abcd.YD r5) {
            int r2 = FH(r5);
            int r0 = 0;
        L4:
            if (r0 >= 8) goto L8;
            abcd.yE r3 = this.j6.get(r2);
            if (r3 == null) goto L8;
            if (abcd.YD.j6(r3, r5) == true) goto L11;
            r2 = r2 + 1;
            if (r2 != this.j6.length()) goto L16;
            r2 = 0;
        L16:
            r0 = r0 + 1;
            goto L4
        L11:
            return true;
        L8:
            return false;
        }

        boolean j6(abcd.YD r8) {
            int r2 = FH(r8);
            int r0 = 0;
        L4:
            if (r0 >= 8) goto L5;
            abcd.yE r3 = this.j6.get(r2);
            if (r3 == null) goto L9;
            if (abcd.YD.j6(r3, r8) == true) goto L13;
            r2 = r2 + 1;
            if (r2 != this.j6.length()) goto L17;
            r2 = 0;
        L17:
            r0 = r0 + 1;
            goto L4
        L13:
            return true;
        L9:
            if (this.j6.compareAndSet(r2, null, r8.Hw()) == false) goto L4;
            return true;
        L5:
            return false;
        }
    }

    tH() {
        this.j6 = new abcd.tH.a(5);
    }

    boolean DW(abcd.YD r2) {
        return this.j6.DW(r2);
    }

    void FH(abcd.YD r1) {
        if (DW(r1) == false) goto L6;
        j6();
        return;
    }

    void j6() {
        this.j6 = new abcd.tH.a(5);
    }

    void j6(abcd.YD r4) {
        abcd.tH.a r0 = this.j6;
        if (r0.j6(r4) == true) goto L6;
        abcd.tH.a r1 = new abcd.tH.a(java.lang.Math.min(r0.FH + 1, 11));
        r1.j6(r4);
        this.j6 = r1;
        return;
    }
}
