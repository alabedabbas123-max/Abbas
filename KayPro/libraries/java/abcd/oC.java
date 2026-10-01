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
            int r0 = 0;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = j6()[r3.gn().ordinal()];
                        if (r0 != 1) { $pc0 = 5; continue $sw0; }
                        $pc0 = 11; continue $sw0;
                    }
                    case 11: {
                        this.v5.add(r3);
                        return;
                    }
                    case 5: {
                        if (r0 == 2) { $pc0 = 11; continue $sw0; }
                        if (r0 != 3) { $pc0 = 10; continue $sw0; }
                        j6(r3);
                        return;
                    }
                    case 10: {
                        throw new java.lang.IllegalStateException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        static int[] j6() {
            int[] r0 = null;
            int[] r1 = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = j6;
                        if (r0 == null) { $pc1 = 5; continue $sw1; }
                        return r0;
                    }
                    case 5: {
                        r1 = new int[abcd.jC.a.values().length];
                        try {
                            r1[abcd.jC.a.DW.ordinal()] = 2;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.NoSuchFieldError) { $pc1 = 12; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        $pc1 = 16; continue $sw1;
                    }
                    case 16: {
                        try {
                            r1[abcd.jC.a.Hw.ordinal()] = 4;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.NoSuchFieldError) { $pc1 = 13; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        $pc1 = 20; continue $sw1;
                    }
                    case 20: {
                        try {
                            r1[abcd.jC.a.j6.ordinal()] = 1;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.NoSuchFieldError) { $pc1 = 14; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        $pc1 = 22; continue $sw1;
                    }
                    case 22: {
                        try {
                            r1[abcd.jC.a.FH.ordinal()] = 3;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.NoSuchFieldError) { $pc1 = 15; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        $pc1 = 10; continue $sw1;
                    }
                    case 10: {
                        j6 = r1;
                        return r1;
                    }
                    case 12: {
                        throw new java.lang.IllegalStateException();
                    }
                    case 13: {
                        throw new java.lang.IllegalStateException();
                    }
                    case 14: {
                        throw new java.lang.IllegalStateException();
                    }
                    case 15: {
                        throw new java.lang.IllegalStateException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        void j6(abcd.jC r8) {
            abcd.jC r0 = null;
            DC<? super S> r1 = null;
            abcd.GC r2 = null;
            abcd.GC r9 = null;
            abcd.kC r3 = null;
            abcd.kC r4 = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r0 = new abcd.pC(abcd.oC.j6(this.Zo), this.DW, this.FH, this.Hw, r8).j6();
                        if (r0 == null) { $pc2 = 9; continue $sw2; }
                        if (r0.u7() == false) { $pc2 = 7; continue $sw2; }
                        this.v5.add(r8);
                        return;
                    }
                    case 7: {
                        DW(r8.DW(r0));
                        DW(r8.j6(r0));
                        return;
                    }
                    case 9: {
                        if ((abcd.oC.DW(this.Zo) instanceof abcd.AbstractqC) == false) { $pc2 = 12; continue $sw2; }
                        ((abcd.AbstractqC) abcd.oC.DW(this.Zo)).j6(this.v5, this.DW, this.FH, this.Hw, r8);
                        return;
                    }
                    case 12: {
                        if (abcd.oC.DW(this.Zo) == null) { $pc2 = 14; continue $sw2; }
                        r1 = DW();
                        r2 = abcd.GC.j6(this.FH, r8);
                        r9 = abcd.GC.DW(this.Hw, r8);
                        r3 = abcd.oC.DW(this.Zo).DW(r1, r2, r9);
                        r4 = this.v5;
                        abcd.GC.j6(r3, r2, r9);
                        r4.addAll(r3);
                        return;
                    }
                    case 14: {
                        this.v5.add(r8);
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
