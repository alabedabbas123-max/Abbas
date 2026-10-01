package abcd;

public abstract class Abstractez<Params, Progress, Result> extends Xy<Params, Progress, Result> implements _y<abcd.Interfacelz>, abcd.Interfacehz, abcd.Interfacelz, abcd.Zy {
    private final abcd.jz Ws;

    private static class a<Result> implements java.util.concurrent.Executor {
        private final abcd.Abstractez DW;
        private final java.util.concurrent.Executor j6;

        public a(java.util.concurrent.Executor r1, abcd.Abstractez r2) {
            this.j6 = r1;
            this.DW = r2;
        }

        static abcd.Abstractez j6(abcd.Abstractez.a r0) {
            return r0.DW;
        }

        @Override
        public void execute(java.lang.Runnable r4) {
            this.j6.execute(new abcd.dz(this, r4, null));
        }
    }

    public Abstractez() {
        this.Ws = new abcd.jz();
    }

    public boolean DW() {
        return ((abcd._y) ((abcd.Interfacehz) gn())).DW();
    }

    public java.util.Collection<abcd.Interfacelz> FH() {
        return ((abcd._y) ((abcd.Interfacehz) gn())).FH();
    }

    @Override
    public int compareTo(java.lang.Object r1) {
        return abcd.Enumcz.j6(this, r1);
    }

    public <T extends _y<abcd.Interfacelz> & abcd.Interfacehz & abcd.Interfacelz> T gn() {
        return this.Ws;
    }

    public void j6(abcd.Interfacelz r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (Hw() != abcd.Xy.d.j6) { $pc0 = 7; continue $sw0; }
                    ((abcd._y) ((abcd.Interfacehz) gn())).j6(r3);
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalStateException("Must not add Dependency after task is running");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.Object r1) {
        j6((abcd.Interfacelz) r1);
    }

    @Override
    public void j6(java.lang.Throwable r2) {
        ((abcd.Interfacelz) ((abcd.Interfacehz) gn())).j6(r2);
    }

    public final void j6(java.util.concurrent.ExecutorService r2, Params... r3) {
        super.j6(new abcd.Abstractez.a(r2, this), r3);
    }

    @Override
    public void j6(boolean r2) {
        ((abcd.Interfacelz) ((abcd.Interfacehz) gn())).j6(r2);
    }

    @Override
    public boolean j6() {
        return ((abcd.Interfacelz) ((abcd.Interfacehz) gn())).j6();
    }
}
