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
        abcd.IE r0 = v5();
        abcd.FE r4 = r0.Hw(r2, r3);     // Catch: java.lang.Throwable -> L6
        r0.FH();
        return r4;
    L6:
        th = move-exception;
        r0.FH();
        throw th;
    }

    public abstract void j6();

    public abstract boolean j6(abcd.YD r1);

    public abstract abcd.IE v5();
}
