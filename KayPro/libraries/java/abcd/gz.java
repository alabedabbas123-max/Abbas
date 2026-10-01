package abcd;

public class gz<V> extends java.util.concurrent.FutureTask<V> implements _y<abcd.Interfacelz>, abcd.Interfacehz, abcd.Interfacelz, abcd.Zy {
    final java.lang.Object j6;

    public gz(java.lang.Runnable r1, V r2) {
        super(r1, r2);
        this.j6 = DW(r1);
    }

    public gz(java.util.concurrent.Callable<V> r1) {
        super(r1);
        this.j6 = DW(r1);
    }

    protected <T extends _y<abcd.Interfacelz> & abcd.Interfacehz & abcd.Interfacelz> T DW(java.lang.Object r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (abcd.jz.DW(r2) == false) { $pc0 = 7; continue $sw0; }
                    return (abcd._y) r2;
                }
                case 7: {
                    return new abcd.jz();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean DW() {
        return ((abcd._y) ((abcd.Interfacehz) Hw())).DW();
    }

    public java.util.Collection<abcd.Interfacelz> FH() {
        return ((abcd._y) ((abcd.Interfacehz) Hw())).FH();
    }

    public <T extends _y<abcd.Interfacelz> & abcd.Interfacehz & abcd.Interfacelz> T Hw() {
        return (abcd._y) this.j6;
    }

    @Override
    public int compareTo(java.lang.Object r2) {
        return ((abcd.Interfacehz) Hw()).compareTo(r2);
    }

    public void j6(abcd.Interfacelz r2) {
        ((abcd._y) ((abcd.Interfacehz) Hw())).j6(r2);
    }

    public void j6(java.lang.Object r1) {
        j6((abcd.Interfacelz) r1);
    }

    @Override
    public void j6(java.lang.Throwable r2) {
        ((abcd.Interfacelz) ((abcd.Interfacehz) Hw())).j6(r2);
    }

    @Override
    public void j6(boolean r2) {
        ((abcd.Interfacelz) ((abcd.Interfacehz) Hw())).j6(r2);
    }

    @Override
    public boolean j6() {
        return ((abcd.Interfacelz) ((abcd.Interfacehz) Hw())).j6();
    }

    @Override
    public abcd.Enumcz v5() {
        return ((abcd.Interfacehz) Hw()).v5();
    }
}
