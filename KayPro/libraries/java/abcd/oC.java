package abcd;

public class oC extends abcd.AbstractqC {
    private abcd.AbstracteC FH;
    private int Hw;

    private class a<S extends abcd.CC> {
        private static int[] j6;
        private final mC<S> DW;
        private final lC<S> FH;
        private final lC<S> Hw;
        final abcd.oC Zo;
        final abcd.kC v5;

        a(abcd.oC r1, abcd.kC r2, mC<S> r3, lC<S> r4, lC<S> r5) {
            this.Zo = r1;
            this.DW = r3;
            this.FH = r4;
            this.Hw = r5;
            this.v5 = r2;
        }

        private HC<lC<S>> DW() {
            return new abcd.HC(this.DW);
        }

        private void DW(abcd.jC r3) {
            int r0 = j6()[r3.gn().ordinal()];
            if (r0 != 1) goto L5;
        L11:
            this.v5.add(r3);
            return;
        L5:
            if (r0 == 2) goto L11;
            if (r0 != 3) goto L10;
            j6(r3);
            return;
        L10:
            throw new java.lang.IllegalStateException();
        }

        static int[] j6() {
            int[] r0 = j6;
            if (r0 == null) goto L5;
            return r0;
        L5:
            int[] r1 = new int[abcd.jC.a.values().length];
            r1[abcd.jC.a.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L12
        L16:
            r1[abcd.jC.a.Hw.ordinal()] = 4;     // Catch: java.lang.NoSuchFieldError -> L13
        L20:
            r1[abcd.jC.a.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L14
        L22:
            r1[abcd.jC.a.FH.ordinal()] = 3;     // Catch: java.lang.NoSuchFieldError -> L15
        L10:
            j6 = r1;
            return r1;
        }

        void j6(abcd.jC r8) {
            abcd.jC r0 = new abcd.pC(abcd.oC.j6(this.Zo), this.DW, this.FH, this.Hw, r8).j6();
            if (r0 == null) goto L9;
            if (r0.u7() == false) goto L7;
            this.v5.add(r8);
            return;
        L7:
            DW(r8.DW(r0));
            DW(r8.j6(r0));
            return;
        L9:
            if ((abcd.oC.DW(this.Zo) instanceof abcd.AbstractqC) == false) goto L12;
            ((abcd.AbstractqC) abcd.oC.DW(this.Zo)).j6(this.v5, this.DW, this.FH, this.Hw, r8);
            return;
        L12:
            if (abcd.oC.DW(this.Zo) == null) goto L14;
            DC<? super S> r1 = DW();
            abcd.GC r2 = abcd.GC.j6(this.FH, r8);
            abcd.GC r9 = abcd.GC.DW(this.Hw, r8);
            abcd.kC r3 = abcd.oC.DW(this.Zo).DW(r1, r2, r9);
            abcd.kC r4 = this.v5;
            abcd.GC.j6(r3, r2, r9);
            r4.addAll(r3);
            return;
        L14:
            this.v5.add(r8);
        }
    }

    public oC() {
        this.FH = abcd.sC.j6;
        this.Hw = 64;
    }

    static abcd.AbstracteC DW(abcd.oC r0) {
        return r0.FH;
    }

    static int j6(abcd.oC r0) {
        return r0.Hw;
    }

    @Override
    public <S extends abcd.CC> void j6(abcd.kC r8, mC<S> r9, lC<S> r10, lC<S> r11, abcd.jC r12) {
        new abcd.oC.a(this, r8, r9, r10, r11).j6(r12);
    }
}
