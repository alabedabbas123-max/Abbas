package abcd;

public abstract class Abstractvt implements abcd.Interfacelu, java.lang.Cloneable {
    private abcd.bs DW;
    private final abcd.tt j6;

    public interface a {
        void DW(abcd.mt r1);

        void j6(abcd.mt r1);

        void j6(abcd.ot r1);
    }

    protected Abstractvt(abcd.bs r1, abcd.tt r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == null) { $pc0 = 7; continue $sw0; }
                    this.j6 = r2;
                    this.DW = r1;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("block == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Abstractvt j6(abcd.Tr r1, abcd.tt r2) {
        return new abcd.mt(r1, r2);
    }

    public abcd.tt DW() {
        return this.j6;
    }

    public abstract void DW(abcd.Abstractqt r1);

    public boolean DW(int r2) {
        abcd.bs r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.DW;
                    if (r0 != null) { $pc1 = 5; continue $sw1; }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (r0.we() != r2) { $pc1 = 7; continue $sw1; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract boolean EQ();

    public abcd.bs FH() {
        abcd.bs r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.DW;
                    if (r0 != null) { $pc2 = 5; continue $sw2; }
                    return null;
                }
                case 5: {
                    if (r0.Zo() != null) { $pc2 = 7; continue $sw2; }
                    return null;
                }
                case 7: {
                    return this.DW;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean J0() {
        return false;
    }

    public boolean QX() {
        return false;
    }

    public abstract boolean XL();

    public abcd.Abstractvt clone() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    return (abcd.Abstractvt) super.clone();
                }
                case 4: {
                    e = $ex3;
                    throw new java.lang.RuntimeException("unexpected", e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.Object mo30clone() {
        return clone();
    }

    public abstract abcd.Tr gn();

    public void j6(int r2) {
        abcd.bs r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.DW;
                    if (r0 == null) { $pc4 = 6; continue $sw4; }
                    this.DW = r0.FH(r2);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final void j6(abcd.Vr r3) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r3 == this.DW.Zo()) { $pc5 = 9; continue $sw5; }
                    if (r3 != null) { $pc5 = 6; continue $sw5; }
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    this.DW = abcd.bs.FH(this.DW.we(), this.DW.getType(), r3);
                    return;
                }
                case 6: {
                    if (r3.equals(this.DW.Zo()) == false) { $pc5 = 7; continue $sw5; }
                    return;
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void j6(abcd.bs r2) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r2 == null) { $pc6 = 6; continue $sw6; }
                    this.DW = r2;
                    return;
                }
                case 6: {
                    throw new java.lang.NullPointerException("result == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final void j6(abcd.Abstractqt r3) {
        abcd.bs r0 = this.DW;
        this.DW = r3.j6(r0);
        this.j6.v5().j6(this, r0);
        DW(r3);
    }

    public abstract void j6(abcd.Abstractvt.a r1);

    public abstract boolean j6();

    public abstract abcd.Tr lg();

    public abstract abcd.cs tp();

    public abcd.bs u7() {
        return this.DW;
    }

    public abstract abcd.es v5();
}
