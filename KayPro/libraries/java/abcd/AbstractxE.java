package abcd;

public abstract class AbstractxE {
    protected AbstractxE() {
    }

    public boolean DW() {
        return true;
    }

    public abstract abcd.AbstractxE FH();

    public abstract abcd.EE Hw();

    public abcd.FE j6(abcd.YD r2, int r3) {
        abcd.IE r0 = null;
        abcd.FE r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = v5();
                    try {
                        r4 = r0.Hw(r2, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 6; continue $sw0;
                    }
                    r0.FH();
                    return r4;
                }
                case 6: {
                    th = $ex0;
                    r0.FH();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract void j6();

    public abstract boolean j6(abcd.YD r1);

    public abstract abcd.IE v5();
}
